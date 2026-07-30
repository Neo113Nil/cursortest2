package com.baidu.ar;

/* loaded from: classes.dex */
public class g1 implements g6 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2306a;

    /* renamed from: b, reason: collision with root package name */
    public f6 f2307b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f2308c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    public int f2309d;

    /* renamed from: e, reason: collision with root package name */
    public v f2310e;

    /* renamed from: f, reason: collision with root package name */
    public u6 f2311f;

    public g1(String str, int i8) {
        this.f2309d = i8;
    }

    public void a(u6 u6Var) {
        this.f2311f = u6Var;
    }

    @Override // com.baidu.ar.g6
    public void b(float[] fArr) {
        if (this.f2307b == null) {
            this.f2307b = new b8();
        }
        this.f2307b.a(u8.a(fArr, this.f2308c), u8.c(fArr).toArray(), u8.c(this.f2308c).toArray());
    }

    @Override // com.baidu.ar.t6
    public int c() {
        return this.f2309d;
    }

    @Override // com.baidu.ar.g6
    public boolean d() {
        return this.f2306a;
    }

    public void e() {
        this.f2306a = false;
    }

    public void a(v vVar) {
        this.f2310e = vVar;
    }

    @Override // com.baidu.ar.g6
    public float[] b() {
        f6 f6Var = this.f2307b;
        return f6Var != null ? f6Var.a(this.f2308c) : this.f2308c;
    }
}
