package com.baidu.mapapi.map;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public final class BitmapDescriptor {

    /* renamed from: a, reason: collision with root package name */
    Bitmap f5702a;

    /* renamed from: b, reason: collision with root package name */
    private Bundle f5703b;

    BitmapDescriptor(Bitmap bitmap) {
        if (bitmap != null) {
            this.f5702a = a(bitmap, bitmap.getWidth(), bitmap.getHeight());
        }
    }

    private Bitmap a(Bitmap bitmap, int i8, int i9) {
        Bitmap createBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    byte[] b() {
        ByteBuffer allocate = ByteBuffer.allocate(this.f5702a.getWidth() * this.f5702a.getHeight() * 4);
        this.f5702a.copyPixelsToBuffer(allocate);
        return allocate.array();
    }

    public void clearCache() {
        Bundle bundle = this.f5703b;
        if (bundle != null) {
            bundle.clear();
            this.f5703b = null;
        }
    }

    public Bitmap getBitmap() {
        return this.f5702a;
    }

    public void recycle() {
        Bitmap bitmap = this.f5702a;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f5702a.recycle();
        this.f5702a = null;
    }

    Bundle a() {
        MessageDigest messageDigest;
        if (this.f5702a == null) {
            throw new IllegalStateException("BDMapSDKException: the bitmap has been recycled! you can not use it again");
        }
        if (this.f5703b == null) {
            Bundle bundle = new Bundle();
            bundle.putInt("image_width", this.f5702a.getWidth());
            bundle.putInt("image_height", this.f5702a.getHeight());
            byte[] b8 = b();
            bundle.putByteArray("image_data", b8);
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e8) {
                e8.printStackTrace();
                messageDigest = null;
            }
            if (messageDigest != null) {
                messageDigest.update(b8, 0, b8.length);
                byte[] digest = messageDigest.digest();
                StringBuilder sb = new StringBuilder("");
                for (byte b9 : digest) {
                    sb.append(Integer.toString((b9 & 255) + 256, 16).substring(1));
                }
                bundle.putString("image_hashcode", sb.toString());
            }
            this.f5703b = bundle;
        }
        return this.f5703b;
    }
}
