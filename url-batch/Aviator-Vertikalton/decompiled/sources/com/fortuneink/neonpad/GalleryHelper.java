package com.fortuneink.neonpad;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class GalleryHelper {
    public static final GalleryHelper INSTANCE = new GalleryHelper();

    private GalleryHelper() {
    }

    public final boolean saveBitmap(Context context, Bitmap bitmap) {
        X0.f.e(context, "context");
        X0.f.e(bitmap, "bitmap");
        String str = "FortuneDrawing_" + System.currentTimeMillis() + ".png";
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "image/png");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + "/FortuneDrawing");
            contentValues.put("is_pending", (Integer) 1);
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (insert == null) {
            return false;
        }
        try {
            OutputStream openOutputStream = contentResolver.openOutputStream(insert);
            if (openOutputStream == null) {
                return false;
            }
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, openOutputStream);
                q1.d.l(openOutputStream, null);
                if (i < 29) {
                    return true;
                }
                contentValues.clear();
                contentValues.put("is_pending", (Integer) 0);
                contentResolver.update(insert, contentValues, null, null);
                return true;
            } finally {
            }
        } catch (Exception unused) {
            contentResolver.delete(insert, null, null);
            return false;
        }
    }
}
