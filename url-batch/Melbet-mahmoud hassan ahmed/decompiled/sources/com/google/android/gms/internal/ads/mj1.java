package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class mj1 implements gd1 {

    /* renamed from: b, reason: collision with root package name */
    private vt1 f8598b;

    /* renamed from: c, reason: collision with root package name */
    private String f8599c;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8602f;

    /* renamed from: a, reason: collision with root package name */
    private final sq1 f8597a = new sq1();

    /* renamed from: d, reason: collision with root package name */
    private int f8600d = 8000;

    /* renamed from: e, reason: collision with root package name */
    private int f8601e = 8000;

    public final mj1 a(boolean z6) {
        this.f8602f = true;
        return this;
    }

    public final mj1 b(int i7) {
        this.f8600d = i7;
        return this;
    }

    public final mj1 c(int i7) {
        this.f8601e = i7;
        return this;
    }

    public final mj1 d(vt1 vt1Var) {
        this.f8598b = vt1Var;
        return this;
    }

    public final mj1 e(String str) {
        this.f8599c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.gd1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final ol1 zza() {
        ol1 ol1Var = new ol1(this.f8599c, this.f8600d, this.f8601e, this.f8602f, this.f8597a);
        vt1 vt1Var = this.f8598b;
        if (vt1Var != null) {
            ol1Var.j(vt1Var);
        }
        return ol1Var;
    }
}
