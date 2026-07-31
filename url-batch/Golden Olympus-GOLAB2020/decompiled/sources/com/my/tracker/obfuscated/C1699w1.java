package com.my.tracker.obfuscated;

/* renamed from: com.my.tracker.obfuscated.w1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1699w1 implements InterfaceC1695v1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f21555a;

    /* renamed from: b, reason: collision with root package name */
    private long f21556b;

    public C1699w1(int i4, long j4) {
        this.f21555a = i4;
        this.f21556b = j4;
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1669o2, com.my.tracker.obfuscated.InterfaceC1633f2
    public int a() {
        return this.f21555a;
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1695v1
    public void b(long j4) {
        this.f21556b = j4;
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1695v1
    public long e() {
        return this.f21556b;
    }
}
