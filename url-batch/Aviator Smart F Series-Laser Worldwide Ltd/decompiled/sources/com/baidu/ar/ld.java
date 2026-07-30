package com.baidu.ar;

import android.opengl.Matrix;
import com.baidu.ar.algovo.ARVOJniClient;
import com.baidu.ar.arplay.core.pixel.FramePixels;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.slam.TrackModel;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ld implements e7, d7 {

    /* renamed from: h, reason: collision with root package name */
    public static final String f2730h = "ld";

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f2731i = {-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public md f2732a;

    /* renamed from: b, reason: collision with root package name */
    public la f2733b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f2735d;

    /* renamed from: g, reason: collision with root package name */
    public float f2738g;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2734c = false;

    /* renamed from: e, reason: collision with root package name */
    public float f2736e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2737f = false;

    public ld(md mdVar) {
        this.f2732a = mdVar;
    }

    @Override // com.baidu.ar.d7
    public int a(String str, int i8, int i9, float[] fArr, float f8) {
        if (!this.f2734c) {
            return -1;
        }
        this.f2738g = f8;
        if (fArr == null) {
            fArr = f2731i;
        }
        int insertModel = ARVOJniClient.insertModel(str, i8, i9, fArr, 1.0f);
        this.f2737f = true;
        return insertModel;
    }

    @Override // com.baidu.ar.d7
    public void b() {
        if (this.f2734c && this.f2737f) {
            ARVOJniClient.removeAllModel();
            this.f2737f = false;
        }
    }

    public void c() {
        if (this.f2734c) {
            ARVOJniClient.stop();
            this.f2734c = false;
        }
        this.f2732a = null;
    }

    @Override // com.baidu.ar.e7
    public void a() {
        md mdVar = this.f2732a;
        this.f2733b = la.a(mdVar.f2831a, mdVar.f2832b, false);
        try {
            com.baidu.ar.libloader.a.a("dumixar");
            la laVar = this.f2733b;
            this.f2734c = ARVOJniClient.start(laVar.f2715a, laVar.f2716b, laVar.a(), this.f2733b.b());
        } catch (UnsatisfiedLinkError e8) {
            h.b(f2730h, "slam algo UnsatisfiedLinkError " + e8.getMessage());
        }
    }

    @Override // com.baidu.ar.e7
    public void a(FramePixels framePixels, ICallbackWith<qd> iCallbackWith) {
        md mdVar;
        float[] b8;
        if (framePixels == null || !this.f2734c || (mdVar = this.f2732a) == null || (b8 = mdVar.f2833c.b()) == null || b8.length == 0) {
            return;
        }
        if (!this.f2737f) {
            iCallbackWith.run(new qd(framePixels.getTimestamp()));
            return;
        }
        this.f2735d = b8;
        ARVOJniClient.track(framePixels.getPixelsAddress(), a(b8));
        ArrayList<TrackModel> fetchModelPose = ARVOJniClient.fetchModelPose();
        Iterator<TrackModel> it = fetchModelPose.iterator();
        while (it.hasNext()) {
            a(it.next().pose, this.f2735d);
        }
        rd rdVar = new rd(framePixels.getTimestamp());
        rdVar.a(true);
        rdVar.b(true);
        rdVar.a(fetchModelPose);
        iCallbackWith.run(new qd(rdVar));
    }

    public final void a(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[16];
        float[] fArr4 = new float[16];
        Matrix.invertM(fArr3, 0, fArr2, 0);
        Matrix.multiplyMM(fArr4, 0, f2731i, 0, fArr3, 0);
        Matrix.invertM(fArr3, 0, fArr4, 0);
        fArr[0] = fArr3[0];
        fArr[1] = fArr3[1];
        fArr[2] = fArr3[2];
        fArr[4] = fArr3[4];
        fArr[5] = fArr3[5];
        fArr[6] = fArr3[6];
        fArr[8] = fArr3[8];
        fArr[9] = fArr3[9];
        fArr[10] = fArr3[10];
        float c8 = this.f2733b.c();
        float f8 = fArr[12];
        float f9 = this.f2738g;
        float f10 = fArr[13] * f9 * c8;
        float f11 = fArr[14] * f9 * c8;
        fArr[12] = f8 * f9 * c8;
        fArr[13] = f10;
        fArr[14] = f11;
        Matrix.rotateM(fArr, 0, this.f2736e - 90.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override // com.baidu.ar.d7
    public float[] a(float f8, float[] fArr) {
        if (!this.f2734c) {
            return null;
        }
        float[] fArr2 = new float[2];
        return new float[]{ARVOJniClient.calModelPosition(this.f2733b.a(), f8, a(fArr), fArr2), fArr2[0], fArr2[1]};
    }

    public final float[] a(float[] fArr) {
        if (this.f2736e == 0.0f) {
            this.f2736e = this.f2732a.f2833c.a();
        }
        float[] fArr2 = new float[16];
        float[] fArr3 = new float[16];
        Matrix.invertM(fArr2, 0, fArr, 0);
        Matrix.multiplyMM(fArr3, 0, f2731i, 0, fArr2, 0);
        return new float[]{-fArr3[4], -fArr3[5], -fArr3[6], -fArr3[0], -fArr3[1], -fArr3[2], -fArr3[8], -fArr3[9], -fArr3[10], 0.0f, 0.0f, 0.0f};
    }
}
