package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.w;
import okio.j0;

/* loaded from: classes4.dex */
class MediaStoreRequestHandler extends g {
    private static final String[] CONTENT_ORIENTATION = {"orientation"};

    enum PicassoKind {
        MICRO(3, 96, 96),
        MINI(1, 512, RendererCapabilities.MODE_SUPPORT_MASK),
        FULL(2, -1, -1);

        final int androidKind;
        final int height;
        final int width;

        PicassoKind(int i8, int i9, int i10) {
            this.androidKind = i8;
            this.width = i9;
            this.height = i10;
        }
    }

    MediaStoreRequestHandler(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int getExifOrientation(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, CONTENT_ORIENTATION, null, null, null);
            if (cursor != null && cursor.moveToFirst()) {
                int i8 = cursor.getInt(0);
                cursor.close();
                return i8;
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    static PicassoKind getPicassoKind(int i8, int i9) {
        PicassoKind picassoKind = PicassoKind.MICRO;
        if (i8 <= picassoKind.width && i9 <= picassoKind.height) {
            return picassoKind;
        }
        PicassoKind picassoKind2 = PicassoKind.MINI;
        return (i8 > picassoKind2.width || i9 > picassoKind2.height) ? PicassoKind.FULL : picassoKind2;
    }

    @Override // com.squareup.picasso.g, com.squareup.picasso.w
    public boolean canHandleRequest(u uVar) {
        Uri uri = uVar.uri;
        return FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // com.squareup.picasso.g, com.squareup.picasso.w
    public w.a load(u uVar, int i8) {
        Bitmap thumbnail;
        ContentResolver contentResolver = this.context.getContentResolver();
        int exifOrientation = getExifOrientation(contentResolver, uVar.uri);
        String type = contentResolver.getType(uVar.uri);
        boolean z7 = type != null && type.startsWith("video/");
        if (uVar.hasSize()) {
            PicassoKind picassoKind = getPicassoKind(uVar.targetWidth, uVar.targetHeight);
            if (!z7 && picassoKind == PicassoKind.FULL) {
                return new w.a(null, j0.source(getInputStream(uVar)), Picasso.LoadedFrom.DISK, exifOrientation);
            }
            long parseId = ContentUris.parseId(uVar.uri);
            BitmapFactory.Options createBitmapOptions = w.createBitmapOptions(uVar);
            createBitmapOptions.inJustDecodeBounds = true;
            w.calculateInSampleSize(uVar.targetWidth, uVar.targetHeight, picassoKind.width, picassoKind.height, createBitmapOptions, uVar);
            if (z7) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, picassoKind == PicassoKind.FULL ? 1 : picassoKind.androidKind, createBitmapOptions);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, picassoKind.androidKind, createBitmapOptions);
            }
            if (thumbnail != null) {
                return new w.a(thumbnail, null, Picasso.LoadedFrom.DISK, exifOrientation);
            }
        }
        return new w.a(null, j0.source(getInputStream(uVar)), Picasso.LoadedFrom.DISK, exifOrientation);
    }
}
