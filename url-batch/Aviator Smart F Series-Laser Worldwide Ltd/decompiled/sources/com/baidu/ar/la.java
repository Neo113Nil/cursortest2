package com.baidu.ar;

/* loaded from: classes.dex */
public class la {

    /* renamed from: f, reason: collision with root package name */
    public static la f2712f;

    /* renamed from: g, reason: collision with root package name */
    public static la f2713g;

    /* renamed from: h, reason: collision with root package name */
    public static la f2714h;

    /* renamed from: a, reason: collision with root package name */
    public int f2715a;

    /* renamed from: b, reason: collision with root package name */
    public int f2716b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f2717c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f2718d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2719e;

    static {
        la laVar = new la();
        f2712f = laVar;
        laVar.f2715a = 1280;
        laVar.f2716b = 720;
        laVar.f2717c = new float[]{1110.8284f, 0.0f, 640.0f, 0.0f, 1111.2183f, 360.0f, 0.0f, 0.0f, 1.0f};
        laVar.f2718d = new float[]{1.0E-5f, 0.0f, 0.0f, 0.0f, 0.0f};
        la laVar2 = new la();
        f2713g = laVar2;
        laVar2.f2715a = 640;
        laVar2.f2716b = 480;
        f2712f.f2719e = true;
        laVar2.f2717c = new float[]{594.25995f, 0.0f, 313.4141f, 0.0f, 594.826f, 237.53111f, 0.0f, 0.0f, 1.0f};
        laVar2.f2718d = new float[]{0.184825f, -0.433983f, -0.003168f, -0.010542f, 0.0f};
        la laVar3 = new la();
        f2714h = laVar3;
        laVar3.f2715a = 640;
        laVar3.f2716b = 360;
        laVar3.f2717c = new float[]{585.7661f, 0.0f, 310.29126f, 0.0f, 585.70685f, 174.72643f, 0.0f, 0.0f, 1.0f};
        laVar3.f2718d = new float[]{0.170531f, -0.380857f, -0.005316f, 0.011078f, 0.0f};
    }

    public la() {
    }

    public la(int i8, int i9) {
        this.f2715a = i8;
        this.f2716b = i9;
    }

    public static la a(int i8, int i9) {
        la laVar;
        la laVar2 = new la(i8, i9);
        float f8 = i8;
        float f9 = f8 / i9;
        la laVar3 = f2712f;
        if (Math.abs(f9 - (laVar3.f2715a / laVar3.f2716b)) < 0.03d) {
            laVar = f2712f;
        } else {
            la laVar4 = f2713g;
            if (Math.abs(f9 - (laVar4.f2715a / laVar4.f2716b)) >= 0.03d) {
                return laVar2;
            }
            laVar = f2713g;
        }
        laVar2.a(laVar, f8 / laVar.f2715a);
        return laVar2;
    }

    public float[] b() {
        return this.f2718d;
    }

    public float c() {
        return 1.0f;
    }

    public static la a(int i8, int i9, boolean z7) {
        if (!z7) {
            return a(i8, i9);
        }
        la laVar = new la(i8, i9);
        float f8 = i8;
        la laVar2 = f2714h;
        if (Math.abs((f8 / i9) - (laVar2.f2715a / laVar2.f2716b)) < 0.03d) {
            laVar.a(f2714h, f8 / r5.f2715a);
        }
        return laVar;
    }

    public final void a(la laVar, float f8) {
        this.f2717c = new float[9];
        this.f2718d = new float[5];
        for (int i8 = 0; i8 < 8; i8++) {
            this.f2717c[i8] = laVar.f2717c[i8] * f8;
        }
        for (int i9 = 0; i9 < 5; i9++) {
            this.f2718d[i9] = laVar.f2718d[i9];
        }
    }

    public float[] a() {
        return this.f2717c;
    }
}
