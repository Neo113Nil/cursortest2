package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class vv0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f13510a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13511b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13512c;

    private vv0(int i7, int i8, int i9) {
        this.f13510a = i7;
        this.f13512c = i8;
        this.f13511b = i9;
    }

    public static vv0 a() {
        return new vv0(0, 0, 0);
    }

    public static vv0 b(int i7, int i8) {
        return new vv0(1, i7, i8);
    }

    public static vv0 c(pv pvVar) {
        return pvVar.f10379i ? new vv0(3, 0, 0) : pvVar.f10384n ? new vv0(2, 0, 0) : pvVar.f10383m ? a() : b(pvVar.f10381k, pvVar.f10378h);
    }

    public static vv0 d() {
        return new vv0(5, 0, 0);
    }

    public static vv0 e() {
        return new vv0(4, 0, 0);
    }

    public final boolean f() {
        return this.f13510a == 0;
    }

    public final boolean g() {
        return this.f13510a == 2;
    }

    public final boolean h() {
        return this.f13510a == 5;
    }

    public final boolean i() {
        return this.f13510a == 3;
    }

    public final boolean j() {
        return this.f13510a == 4;
    }
}
