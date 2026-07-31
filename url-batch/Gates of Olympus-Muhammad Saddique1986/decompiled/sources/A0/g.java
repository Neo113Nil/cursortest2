package A0;

import e2.InterfaceC0422a;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final f2.k f99a;

    /* renamed from: b, reason: collision with root package name */
    public final f2.k f100b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f101c;

    /* JADX WARN: Multi-variable type inference failed */
    public g(InterfaceC0422a interfaceC0422a, InterfaceC0422a interfaceC0422a2, boolean z3) {
        this.f99a = (f2.k) interfaceC0422a;
        this.f100b = (f2.k) interfaceC0422a2;
        this.f101c = z3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e2.a, f2.k] */
    public final InterfaceC0422a a() {
        return this.f100b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [e2.a, f2.k] */
    /* JADX WARN: Type inference failed for: r1v6, types: [e2.a, f2.k] */
    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f99a.b()).floatValue() + ", maxValue=" + ((Number) this.f100b.b()).floatValue() + ", reverseScrolling=" + this.f101c + ')';
    }
}
