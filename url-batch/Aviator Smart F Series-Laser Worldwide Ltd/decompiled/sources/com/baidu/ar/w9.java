package com.baidu.ar;

/* loaded from: classes.dex */
public class w9 extends f1 {

    /* renamed from: g, reason: collision with root package name */
    public u6 f3620g;

    public w9(String str, int i8) {
        super(str, i8);
    }

    public void a(float f8, float f9) {
        this.f2188d = true;
        this.f2189e = f8;
        this.f2190f = f9;
        u6 u6Var = this.f3620g;
        if (u6Var != null) {
            u6Var.a(this);
        }
    }

    public void a(ja jaVar) {
        this.f2186b = true;
        this.f2187c = jaVar;
        u6 u6Var = this.f3620g;
        if (u6Var != null) {
            u6Var.a(this);
        }
    }

    public void a(u6 u6Var) {
        this.f3620g = u6Var;
    }
}
