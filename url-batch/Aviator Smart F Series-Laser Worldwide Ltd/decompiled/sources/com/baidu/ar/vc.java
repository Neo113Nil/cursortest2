package com.baidu.ar;

import com.baidu.ar.algotrack2d.AR2DJniClient;
import com.baidu.ar.arplay.core.pixel.FramePixels;
import com.baidu.ar.callback.ICallbackWith;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class vc {

    /* renamed from: f, reason: collision with root package name */
    public static final String f3464f = "vc";

    /* renamed from: a, reason: collision with root package name */
    public xc f3465a;

    /* renamed from: c, reason: collision with root package name */
    public float[][] f3467c;

    /* renamed from: e, reason: collision with root package name */
    public fd f3469e;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3466b = false;

    /* renamed from: d, reason: collision with root package name */
    public long f3468d = 0;

    public final float a(int i8, int i9, float f8) {
        if (Float.isNaN(f8)) {
            return f8;
        }
        return (f8 * 500.0f) / ((float) Math.sqrt((i8 * i8) + (i9 * i9)));
    }

    public final float a(boolean z7, float[] fArr) {
        if (!z7 || fArr == null) {
            return Float.NaN;
        }
        float f8 = fArr[9];
        float f9 = fArr[10];
        float f10 = fArr[11];
        return a(this.f3465a.f(), this.f3465a.e(), (float) Math.sqrt((f8 * f8) + (f9 * f9) + (f10 * f10)));
    }

    public void a() {
        if (this.f3466b) {
            AR2DJniClient.arRelease();
            this.f3466b = false;
        }
        fd fdVar = this.f3469e;
        if (fdVar != null) {
            fdVar.a();
        }
    }

    public void a(FramePixels framePixels, ICallbackWith<yc> iCallbackWith) {
        xc xcVar;
        if (framePixels == null || !this.f3466b || (xcVar = this.f3465a) == null) {
            return;
        }
        float[] fArr = this.f3467c[(int) (this.f3468d % xcVar.a())];
        this.f3468d = r0 + 1;
        ByteBuffer pixelsAddress = framePixels.getPixelsAddress();
        long currentTimeMillis = System.currentTimeMillis();
        int arTracking = AR2DJniClient.arTracking(pixelsAddress, fArr);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        boolean z7 = arTracking == 1;
        int[] iArr = new int[2];
        if (AR2DJniClient.arGetMarkerSize(iArr)) {
            this.f3465a.d(iArr[0]);
            this.f3465a.c(iArr[1]);
        } else {
            h.a(f3464f, "arGetMarkerSize fail");
        }
        float a8 = a(z7, fArr);
        wc wcVar = new wc();
        wcVar.a(z7);
        wcVar.a(fArr);
        wcVar.c(z7);
        wcVar.b(this.f3469e.a(z7));
        wcVar.d(this.f3469e.b());
        wcVar.e(this.f3469e.c());
        wcVar.a(a8);
        wcVar.a(currentTimeMillis2);
        wcVar.b(framePixels.getTimestamp());
        if (iCallbackWith != null) {
            iCallbackWith.run(new yc(wcVar));
        }
    }

    public void a(xc xcVar) {
        try {
            com.baidu.ar.libloader.a.a("dumixar");
            this.f3465a = xcVar;
            boolean z7 = AR2DJniClient.arInit(xcVar.c(), xcVar.b(), a(xcVar.c(), xcVar.b()), xcVar.d()) == 1;
            this.f3466b = z7;
            if (z7) {
                this.f3467c = (float[][]) Array.newInstance((Class<?>) Float.TYPE, xcVar.a(), 12);
            } else {
                AR2DJniClient.arRelease();
            }
            this.f3469e = new fd();
        } catch (UnsatisfiedLinkError e8) {
            h.b(f3464f, "track2d algo UnsatisfiedLinkError " + e8.getMessage());
        }
    }

    public final float[] a(int i8, int i9) {
        float f8 = i8;
        float f9 = f8 / 2.0f;
        float f10 = (f8 * 600.0f) / 640.0f;
        return new float[]{f10, 0.0f, f9, 0.0f, f10, i9 / 2.0f, 0.0f, 0.0f, 1.0f};
    }
}
