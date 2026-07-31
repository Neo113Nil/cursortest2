package com.my.tracker.obfuscated;

/* renamed from: com.my.tracker.obfuscated.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1701x implements InterfaceC1693v {

    /* renamed from: a, reason: collision with root package name */
    private final int f21557a;

    /* renamed from: b, reason: collision with root package name */
    private int f21558b;

    public C1701x(int i4) {
        this.f21557a = i4;
        g();
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1669o2, com.my.tracker.obfuscated.InterfaceC1633f2
    public int a() {
        return this.f21557a;
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1693v, com.my.tracker.obfuscated.InterfaceC1697w
    public int d() {
        return this.f21558b;
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1693v
    public void f() {
        this.f21558b++;
    }

    public void g() {
        this.f21558b = 0;
    }

    public String toString() {
        return "[CountBased TS] id = " + this.f21557a + ", count = " + this.f21558b;
    }
}
