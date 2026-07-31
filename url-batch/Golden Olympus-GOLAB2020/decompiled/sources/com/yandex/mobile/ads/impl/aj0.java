package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.qq1;

/* loaded from: classes3.dex */
public final class aj0 extends op1<Bitmap> {

    /* renamed from: y, reason: collision with root package name */
    private static final Object f23284y = new Object();

    /* renamed from: s, reason: collision with root package name */
    private final Object f23285s;

    /* renamed from: t, reason: collision with root package name */
    private qq1.b<Bitmap> f23286t;

    /* renamed from: u, reason: collision with root package name */
    private final Bitmap.Config f23287u;

    /* renamed from: v, reason: collision with root package name */
    private final int f23288v;

    /* renamed from: w, reason: collision with root package name */
    private final int f23289w;

    /* renamed from: x, reason: collision with root package name */
    private final ImageView.ScaleType f23290x;

    public aj0(String str, qq1.b<Bitmap> bVar, int i4, int i5, ImageView.ScaleType scaleType, Bitmap.Config config, qq1.a aVar) {
        super(0, str, aVar);
        this.f23285s = new Object();
        a(new b00(2.0f, 1000, 2));
        this.f23286t = bVar;
        this.f23287u = config;
        this.f23288v = i4;
        this.f23289w = i5;
        this.f23290x = scaleType;
    }

    private qq1<Bitmap> b(lc1 lc1Var) {
        Bitmap decodeByteArray;
        byte[] bArr = lc1Var.f28506b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f23288v == 0 && this.f23289w == 0) {
            options.inPreferredConfig = this.f23287u;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i4 = options.outWidth;
            int i5 = options.outHeight;
            int a4 = a(this.f23288v, this.f23289w, i4, i5, this.f23290x);
            int a5 = a(this.f23289w, this.f23288v, i5, i4, this.f23290x);
            options.inJustDecodeBounds = false;
            float f4 = 1.0f;
            while (true) {
                float f5 = 2.0f * f4;
                if (f5 > Math.min(i4 / a4, i5 / a5)) {
                    break;
                }
                f4 = f5;
            }
            options.inSampleSize = (int) f4;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > a4 || decodeByteArray.getHeight() > a5)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, a4, a5, true);
                decodeByteArray.recycle();
                decodeByteArray = createScaledBitmap;
            }
        }
        return decodeByteArray == null ? qq1.a(new vf1(lc1Var)) : qq1.a(decodeByteArray, ch0.a(lc1Var));
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public final void a() {
        super.a();
        synchronized (this.f23285s) {
            this.f23286t = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public final int g() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.op1
    protected final void a(Bitmap bitmap) {
        qq1.b<Bitmap> bVar;
        Bitmap bitmap2 = bitmap;
        synchronized (this.f23285s) {
            bVar = this.f23286t;
        }
        if (bVar != null) {
            bVar.a(bitmap2);
        }
    }

    private static int a(int i4, int i5, int i6, int i7, ImageView.ScaleType scaleType) {
        if (i4 != 0 || i5 != 0) {
            if (scaleType != ImageView.ScaleType.FIT_XY) {
                if (i4 == 0) {
                    return (int) (i6 * (i5 / i7));
                }
                if (i5 == 0) {
                    return i4;
                }
                double d4 = i7 / i6;
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    double d5 = i5;
                    return ((double) i4) * d4 < d5 ? (int) (d5 / d4) : i4;
                }
                double d6 = i5;
                return ((double) i4) * d4 > d6 ? (int) (d6 / d4) : i4;
            }
            if (i4 != 0) {
                return i4;
            }
        }
        return i6;
    }

    @Override // com.yandex.mobile.ads.impl.op1
    protected final qq1<Bitmap> a(lc1 lc1Var) {
        qq1<Bitmap> b4;
        synchronized (f23284y) {
            try {
                try {
                    b4 = b(lc1Var);
                } catch (OutOfMemoryError e4) {
                    Object[] objArr = {Integer.valueOf(lc1Var.f28506b.length), l()};
                    boolean z4 = ii2.f27214a;
                    ap0.b(objArr);
                    return qq1.a(new vf1(e4));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b4;
    }
}
