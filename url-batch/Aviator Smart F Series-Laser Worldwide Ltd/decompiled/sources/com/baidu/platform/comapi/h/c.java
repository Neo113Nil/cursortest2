package com.baidu.platform.comapi.h;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private int f9041a;

    /* renamed from: b, reason: collision with root package name */
    private int f9042b;

    /* renamed from: c, reason: collision with root package name */
    private int f9043c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9044d;

    /* renamed from: e, reason: collision with root package name */
    private int f9045e;

    static class b {

        /* renamed from: a, reason: collision with root package name */
        static final c f9046a = new c();
    }

    public int a() {
        return this.f9042b;
    }

    public void b(int i8) {
        this.f9043c = i8;
    }

    public int c() {
        return this.f9043c;
    }

    public boolean d() {
        return (this.f9042b & 2) == 2;
    }

    public boolean e() {
        int i8 = this.f9041a;
        return i8 == 1 || i8 == 2;
    }

    public boolean f() {
        return (this.f9042b & 4) == 4;
    }

    public boolean g() {
        return (this.f9042b & 16) == 16;
    }

    public boolean h() {
        return (this.f9042b & 1) == 1;
    }

    public boolean i() {
        return this.f9044d;
    }

    public boolean j() {
        return this.f9041a == 0;
    }

    private c() {
        this.f9045e = 0;
    }

    public static c b() {
        return b.f9046a;
    }

    public void a(int i8) {
        this.f9042b = i8;
        if (b().i()) {
            return;
        }
        this.f9042b &= -5;
    }

    public void c(int i8) {
        this.f9041a = i8;
    }

    public void a(boolean z7) {
        this.f9044d = z7;
        com.baidu.platform.comapi.walknavi.b.n().s().f(z7);
    }
}
