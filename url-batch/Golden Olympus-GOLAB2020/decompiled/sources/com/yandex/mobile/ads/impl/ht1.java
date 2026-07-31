package com.yandex.mobile.ads.impl;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.yandex.mobile.ads.impl.bm1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class ht1 implements he2, fn {

    /* renamed from: j, reason: collision with root package name */
    private int f26916j;

    /* renamed from: k, reason: collision with root package name */
    private SurfaceTexture f26917k;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f26920n;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f26908b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f26909c = new AtomicBoolean(true);

    /* renamed from: d, reason: collision with root package name */
    private final dm1 f26910d = new dm1();

    /* renamed from: e, reason: collision with root package name */
    private final fc0 f26911e = new fc0();

    /* renamed from: f, reason: collision with root package name */
    private final w42<Long> f26912f = new w42<>();

    /* renamed from: g, reason: collision with root package name */
    private final w42<bm1> f26913g = new w42<>();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f26914h = new float[16];

    /* renamed from: i, reason: collision with root package name */
    private final float[] f26915i = new float[16];

    /* renamed from: l, reason: collision with root package name */
    private volatile int f26918l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f26919m = -1;

    @Override // com.yandex.mobile.ads.impl.fn
    public final void f() {
        this.f26912f.a();
        this.f26911e.a();
        this.f26909c.set(true);
    }

    public final void a(float[] fArr) {
        GLES20.glClear(16384);
        fe0.a();
        if (this.f26908b.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.f26917k;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            fe0.a();
            if (this.f26909c.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f26914h, 0);
            }
            long timestamp = this.f26917k.getTimestamp();
            Long a4 = this.f26912f.a(timestamp);
            if (a4 != null) {
                this.f26911e.a(a4.longValue(), this.f26914h);
            }
            bm1 b4 = this.f26913g.b(timestamp);
            if (b4 != null) {
                this.f26910d.a(b4);
            }
        }
        Matrix.multiplyMM(this.f26915i, 0, fArr, 0, this.f26914h, 0);
        this.f26910d.a(this.f26916j, this.f26915i);
    }

    public final SurfaceTexture a() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        fe0.a();
        this.f26910d.a();
        fe0.a();
        this.f26916j = fe0.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f26916j);
        this.f26917k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.yandex.mobile.ads.impl.P6
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                ht1.this.a(surfaceTexture2);
            }
        });
        return this.f26917k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SurfaceTexture surfaceTexture) {
        this.f26908b.set(true);
    }

    @Override // com.yandex.mobile.ads.impl.fn
    public final void a(long j4, float[] fArr) {
        this.f26911e.b(j4, fArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r6.a().f23866a == 0) goto L50;
     */
    @Override // com.yandex.mobile.ads.impl.he2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j4, long j5, yb0 yb0Var, MediaFormat mediaFormat) {
        float f4;
        float f5;
        this.f26912f.a(Long.valueOf(j4), j5);
        byte[] bArr = yb0Var.f35001w;
        int i4 = yb0Var.f35002x;
        byte[] bArr2 = this.f26920n;
        int i5 = this.f26919m;
        this.f26920n = bArr;
        if (i4 == -1) {
            i4 = this.f26918l;
        }
        this.f26919m = i4;
        if (i5 == i4 && Arrays.equals(bArr2, this.f26920n)) {
            return;
        }
        byte[] bArr3 = this.f26920n;
        bm1 a4 = bArr3 != null ? cm1.a(this.f26919m, bArr3) : null;
        if (a4 != null) {
            bm1.a aVar = a4.f23861a;
            bm1.a aVar2 = a4.f23862b;
            if (aVar.b() == 1) {
                if (aVar.a().f23866a == 0) {
                    if (aVar2.b() == 1) {
                    }
                }
            }
        }
        int i6 = this.f26919m;
        float radians = (float) Math.toRadians(180.0f);
        float radians2 = (float) Math.toRadians(360.0f);
        float f6 = radians / 36;
        float f7 = radians2 / 72;
        float[] fArr = new float[15984];
        float[] fArr2 = new float[10656];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 36; i7 < i10; i10 = 36) {
            float f8 = radians / 2.0f;
            float f9 = (i7 * f6) - f8;
            int i11 = i7 + 1;
            float f10 = (i11 * f6) - f8;
            int i12 = 0;
            while (i12 < 73) {
                float f11 = radians;
                float f12 = radians2;
                int i13 = i9;
                int i14 = 0;
                while (i14 < 2) {
                    if (i14 == 0) {
                        f5 = f9;
                        f4 = f5;
                    } else {
                        f4 = f9;
                        f5 = f10;
                    }
                    float f13 = i12 * f7;
                    float f14 = f6;
                    int i15 = i11;
                    int i16 = i7;
                    double d4 = 50.0f;
                    double d5 = (f13 + 3.1415927f) - (f12 / 2.0f);
                    double d6 = f5;
                    fArr[i8] = -((float) (Math.cos(d6) * Math.sin(d5) * d4));
                    fArr[i8 + 1] = (float) (Math.sin(d6) * d4);
                    int i17 = i8 + 3;
                    fArr[i8 + 2] = (float) (Math.cos(d6) * Math.cos(d5) * d4);
                    fArr2[i13] = f13 / f12;
                    int i18 = i13 + 2;
                    fArr2[i13 + 1] = ((i16 + i14) * f14) / f11;
                    if ((i12 != 0 || i14 != 0) && (i12 != 72 || i14 != 1)) {
                        i8 = i17;
                        i13 = i18;
                        i14++;
                        f9 = f4;
                        f6 = f14;
                        i7 = i16;
                        i11 = i15;
                    }
                    System.arraycopy(fArr, i8, fArr, i17, 3);
                    i8 += 6;
                    System.arraycopy(fArr2, i13, fArr2, i18, 2);
                    i13 += 4;
                    i14++;
                    f9 = f4;
                    f6 = f14;
                    i7 = i16;
                    i11 = i15;
                }
                i12++;
                i9 = i13;
                radians = f11;
                radians2 = f12;
            }
            i7 = i11;
        }
        bm1.a aVar3 = new bm1.a(new bm1.b(0, fArr, fArr2, 1));
        a4 = new bm1(aVar3, aVar3, i6);
        this.f26913g.a(a4, j5);
    }

    public final void a(int i4) {
        this.f26918l = i4;
    }
}
