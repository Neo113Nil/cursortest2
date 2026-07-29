package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.android.volley.l;
import com.android.volley.n;
import com.android.volley.p;
import com.android.volley.t;

/* compiled from: ImageRequest.java */
/* loaded from: classes.dex */
public class i extends com.android.volley.l<Bitmap> {
    private static final Object f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final n.b<Bitmap> f2362a;

    /* renamed from: b, reason: collision with root package name */
    private final Bitmap.Config f2363b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2364c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2365d;
    private ImageView.ScaleType e;

    public i(String str, n.b<Bitmap> bVar, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, n.a aVar) {
        super(0, str, aVar);
        a((p) new com.android.volley.d(1000, 2, 2.0f));
        this.f2362a = bVar;
        this.f2363b = config;
        this.f2364c = i;
        this.f2365d = i2;
        this.e = scaleType;
    }

    @Override // com.android.volley.l
    public l.a r() {
        return l.a.LOW;
    }

    private static int a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        }
        if (i == 0) {
            double d2 = i2;
            double d3 = i4;
            Double.isNaN(d2);
            Double.isNaN(d3);
            double d4 = i3;
            Double.isNaN(d4);
            return (int) (d4 * (d2 / d3));
        }
        if (i2 == 0) {
            return i;
        }
        double d5 = i4;
        double d6 = i3;
        Double.isNaN(d5);
        Double.isNaN(d6);
        double d7 = d5 / d6;
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d8 = i;
            Double.isNaN(d8);
            double d9 = i2;
            if (d8 * d7 >= d9) {
                return i;
            }
            Double.isNaN(d9);
            return (int) (d9 / d7);
        }
        double d10 = i;
        Double.isNaN(d10);
        double d11 = i2;
        if (d10 * d7 <= d11) {
            return i;
        }
        Double.isNaN(d11);
        return (int) (d11 / d7);
    }

    @Override // com.android.volley.l
    protected com.android.volley.n<Bitmap> a(com.android.volley.i iVar) {
        com.android.volley.n<Bitmap> b2;
        synchronized (f) {
            try {
                try {
                    b2 = b(iVar);
                } catch (OutOfMemoryError e) {
                    t.c("Caught OOM for %d byte image, url=%s", Integer.valueOf(iVar.f2285b.length), c());
                    return com.android.volley.n.a(new com.android.volley.k(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b2;
    }

    private com.android.volley.n<Bitmap> b(com.android.volley.i iVar) {
        Bitmap decodeByteArray;
        byte[] bArr = iVar.f2285b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f2364c == 0 && this.f2365d == 0) {
            options.inPreferredConfig = this.f2363b;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int a2 = a(this.f2364c, this.f2365d, i, i2, this.e);
            int a3 = a(this.f2365d, this.f2364c, i2, i, this.e);
            options.inJustDecodeBounds = false;
            options.inSampleSize = a(i, i2, a2, a3);
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > a2 || decodeByteArray.getHeight() > a3)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, a2, a3, true);
                decodeByteArray.recycle();
                decodeByteArray = createScaledBitmap;
            }
        }
        if (decodeByteArray == null) {
            return com.android.volley.n.a(new com.android.volley.k(iVar));
        }
        return com.android.volley.n.a(decodeByteArray, e.a(iVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    public void a(Bitmap bitmap) {
        this.f2362a.onResponse(bitmap);
    }

    static int a(int i, int i2, int i3, int i4) {
        double d2 = i;
        double d3 = i3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = i2;
        double d5 = i4;
        Double.isNaN(d4);
        Double.isNaN(d5);
        double min = Math.min(d2 / d3, d4 / d5);
        float f2 = 1.0f;
        while (true) {
            float f3 = 2.0f * f2;
            if (f3 > min) {
                return (int) f2;
            }
            f2 = f3;
        }
    }
}
