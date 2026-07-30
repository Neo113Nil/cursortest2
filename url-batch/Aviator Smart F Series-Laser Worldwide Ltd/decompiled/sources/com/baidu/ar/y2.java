package com.baidu.ar;

/* loaded from: classes.dex */
public class y2 implements s6 {

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f3742d = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public c7 f3743a;

    /* renamed from: b, reason: collision with root package name */
    public int f3744b;

    /* renamed from: c, reason: collision with root package name */
    public int f3745c;

    public y2(c7 c7Var, int i8, int i9) {
        this.f3743a = c7Var;
        this.f3744b = i8;
        this.f3745c = i9;
    }

    @Override // com.baidu.ar.s6
    public boolean a(float[] fArr) {
        c7 c7Var = this.f3743a;
        c7Var.a(c7Var.a((nd) null), this.f3744b / 2, this.f3745c / 2, f3742d, 1000.0f);
        return true;
    }
}
