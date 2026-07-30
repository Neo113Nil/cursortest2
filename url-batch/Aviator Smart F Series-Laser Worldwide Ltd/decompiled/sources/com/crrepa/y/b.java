package com.crrepa.y;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public abstract class b extends a {

    /* renamed from: a, reason: collision with root package name */
    private int f14043a;

    /* renamed from: b, reason: collision with root package name */
    private int f14044b;

    public b() {
    }

    private static final byte[] b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[100];
        while (true) {
            int read = inputStream.read(bArr, 0, 100);
            if (read <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @Override // com.crrepa.y.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap onParseResponse(com.crrepa.x.c cVar) {
        return (this.f14043a == 0 || this.f14044b == 0) ? BitmapFactory.decodeStream(cVar.f13988a) : a(cVar.f13988a);
    }

    public b(int i8, int i9) {
        this.f14043a = i8;
        this.f14044b = i9;
    }

    private Bitmap a(InputStream inputStream) {
        byte[] bArr;
        try {
            bArr = b(inputStream);
        } catch (IOException e8) {
            e8.printStackTrace();
            bArr = null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i8 = options.outWidth;
        int i9 = options.outHeight;
        int floor = (int) Math.floor(i8 / this.f14043a);
        int floor2 = (int) Math.floor(i9 / this.f14044b);
        options.inSampleSize = (floor > 1 || floor2 > 1) ? Math.max(floor, floor2) : 1;
        options.inJustDecodeBounds = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        throw new RuntimeException("Failed to decode stream.");
    }

    public b(ImageView imageView) {
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width <= 0 || height <= 0) {
            throw new RuntimeException("Can not get the width or height of ImageView");
        }
        this.f14043a = width;
        this.f14044b = height;
    }
}
