package com.my.tracker.obfuscated;

/* renamed from: com.my.tracker.obfuscated.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1642i {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC1695v1 f21364a = new C1699w1(0, -2147483648L);

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC1629e2 f21365b = new C1637g2(0);

    /* renamed from: c, reason: collision with root package name */
    int f21366c = 0;

    private String a(String str, String str2) {
        return "app state changed " + str + "-> " + str2;
    }

    public boolean b() {
        int i4 = this.f21366c;
        return i4 == 1 || i4 == 0;
    }

    public boolean c() {
        return this.f21366c == 3;
    }

    public void d(long j4) {
        f(j4);
    }

    public void e(long j4) {
        if (this.f21366c == 1) {
            f(j4);
        }
    }

    void f(long j4) {
        long e4 = j4 - this.f21364a.e();
        if (AbstractC1708y2.a()) {
            long b4 = this.f21366c == 3 ? this.f21365b.b() : this.f21365b.c();
            AbstractC1708y2.a("TimeSpentCore: AppTimeManager: " + a() + "slicing app TimeSpent, " + b4 + "(existed ms) + " + e4 + "(add ms) = " + (b4 + e4) + "(total ms), timestamp = " + j4);
        }
        int i4 = this.f21366c;
        if (i4 == 1) {
            this.f21365b.a(e4);
        } else if (i4 != 3) {
            AbstractC1708y2.a("TimeSpentCore: AppTimeManager: trying to slice app time, but now is useless background state - skip");
        } else {
            this.f21365b.c(e4);
        }
    }

    public void g(long j4) {
        f(j4);
        AbstractC1708y2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useless)]"));
        this.f21366c = 0;
    }

    public void h(long j4) {
        this.f21364a.b(j4);
        AbstractC1708y2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useful)]"));
        this.f21366c = 1;
    }

    public InterfaceC1633f2 a(long j4) {
        AbstractC1708y2.a("TimeSpentCore: AppTimeManager: " + a() + "onTick: start collecting app TimeSpent");
        if (this.f21366c != 0) {
            f(j4);
            this.f21364a.b(j4);
        }
        InterfaceC1629e2 m23clone = this.f21365b.m23clone();
        this.f21365b.g();
        AbstractC1708y2.a("TimeSpentCore: AppTimeManager: " + a() + "onTick: collected app TimeSpent (foregroundMs = " + m23clone.b() + ", usefulBackgroundMs = " + m23clone.c() + ")");
        if (m23clone.b() == 0 && m23clone.c() == 0) {
            return null;
        }
        return m23clone;
    }

    public void b(long j4) {
        if (this.f21366c == 1) {
            this.f21364a.b(j4);
        }
    }

    public void c(long j4) {
        this.f21364a.b(j4);
    }

    public void d() {
        AbstractC1708y2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[FOREGROUND]"));
        this.f21366c = 3;
    }

    private String a() {
        int i4 = this.f21366c;
        return i4 != 0 ? i4 != 1 ? i4 != 3 ? "" : "[FOREGROUND] " : "[BACKGROUND(useful)] " : "[BACKGROUND(useless)] ";
    }

    public void a(int i4) {
        int i5;
        if (i4 == 0) {
            AbstractC1708y2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useless)]"));
            i5 = 0;
        } else {
            AbstractC1708y2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useful)]"));
            i5 = 1;
        }
        this.f21366c = i5;
    }
}
