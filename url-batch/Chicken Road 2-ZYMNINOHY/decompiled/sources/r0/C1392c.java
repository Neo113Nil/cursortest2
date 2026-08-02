package r0;

import T.C0097o;
import T.InterfaceC0090h;
import W.J;
import W.u;
import y0.E;
import y0.F;

/* renamed from: r0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1392c implements F {

    /* renamed from: a, reason: collision with root package name */
    public final int f15119a;

    /* renamed from: b, reason: collision with root package name */
    public final C0097o f15120b;

    /* renamed from: c, reason: collision with root package name */
    public final y0.m f15121c = new y0.m();

    /* renamed from: d, reason: collision with root package name */
    public final C1393d f15122d;

    /* renamed from: e, reason: collision with root package name */
    public C0097o f15123e;

    /* renamed from: f, reason: collision with root package name */
    public F f15124f;

    /* renamed from: g, reason: collision with root package name */
    public long f15125g;

    public C1392c(int i4, int i5, C0097o c0097o, C1393d c1393d) {
        this.f15119a = i5;
        this.f15120b = c0097o;
        this.f15122d = c1393d;
    }

    @Override // y0.F
    public final void b(u uVar, int i4, int i5) {
        F f4 = this.f15124f;
        String str = J.f3263a;
        f4.a(i4, uVar);
    }

    @Override // y0.F
    public final void d(C0097o c0097o) {
        this.f15122d.getClass();
        C0097o c0097o2 = this.f15120b;
        if (c0097o2 != null) {
            c0097o = c0097o.d(c0097o2);
        }
        this.f15123e = c0097o;
        F f4 = this.f15124f;
        String str = J.f3263a;
        f4.d(c0097o);
    }

    @Override // y0.F
    public final void e(long j4, int i4, int i5, int i6, E e4) {
        long j5 = this.f15125g;
        if (j5 != -9223372036854775807L && j4 >= j5) {
            this.f15124f = this.f15121c;
        }
        F f4 = this.f15124f;
        String str = J.f3263a;
        f4.e(j4, i4, i5, i6, e4);
    }

    @Override // y0.F
    public final int f(InterfaceC0090h interfaceC0090h, int i4, boolean z) {
        F f4 = this.f15124f;
        String str = J.f3263a;
        return f4.g(interfaceC0090h, i4, z);
    }
}
