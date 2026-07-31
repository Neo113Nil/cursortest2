package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.b9;
import com.squareup.picasso.q;
import com.squareup.picasso.v;

/* loaded from: classes2.dex */
class l extends e {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f21732b = {b9.h.f15492n};

    enum a {
        MICRO(3, 96, 96),
        MINI(1, UserVerificationMethods.USER_VERIFY_NONE, 384),
        FULL(2, -1, -1);


        /* renamed from: b, reason: collision with root package name */
        final int f21737b;

        /* renamed from: c, reason: collision with root package name */
        final int f21738c;

        /* renamed from: d, reason: collision with root package name */
        final int f21739d;

        a(int i4, int i5, int i6) {
            this.f21737b = i4;
            this.f21738c = i5;
            this.f21739d = i6;
        }
    }

    l(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int k(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, f21732b, null, null, null);
            if (cursor != null && cursor.moveToFirst()) {
                int i4 = cursor.getInt(0);
                cursor.close();
                return i4;
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursor == null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    static a l(int i4, int i5) {
        a aVar = a.MICRO;
        if (i4 <= aVar.f21738c && i5 <= aVar.f21739d) {
            return aVar;
        }
        a aVar2 = a.MINI;
        return (i4 > aVar2.f21738c || i5 > aVar2.f21739d) ? a.FULL : aVar2;
    }

    @Override // com.squareup.picasso.e, com.squareup.picasso.v
    public boolean c(t tVar) {
        Uri uri = tVar.f21808d;
        return FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) && b9.h.f15446I0.equals(uri.getAuthority());
    }

    @Override // com.squareup.picasso.e, com.squareup.picasso.v
    public v.a f(t tVar, int i4) {
        t tVar2;
        Bitmap thumbnail;
        ContentResolver contentResolver = this.f21698a.getContentResolver();
        int k4 = k(contentResolver, tVar.f21808d);
        String type = contentResolver.getType(tVar.f21808d);
        boolean z4 = type != null && type.startsWith("video/");
        if (tVar.c()) {
            a l4 = l(tVar.f21812h, tVar.f21813i);
            if (!z4 && l4 == a.FULL) {
                return new v.a(null, okio.p.k(j(tVar)), q.e.DISK, k4);
            }
            long parseId = ContentUris.parseId(tVar.f21808d);
            BitmapFactory.Options d4 = v.d(tVar);
            d4.inJustDecodeBounds = true;
            tVar2 = tVar;
            v.a(tVar.f21812h, tVar.f21813i, l4.f21738c, l4.f21739d, d4, tVar2);
            if (z4) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, l4 != a.FULL ? l4.f21737b : 1, d4);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, l4.f21737b, d4);
            }
            if (thumbnail != null) {
                return new v.a(thumbnail, null, q.e.DISK, k4);
            }
        } else {
            tVar2 = tVar;
        }
        return new v.a(null, okio.p.k(j(tVar2)), q.e.DISK, k4);
    }
}
