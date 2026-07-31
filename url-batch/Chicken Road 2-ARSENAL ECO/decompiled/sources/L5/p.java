package L5;

import k5.v;
import o5.InterfaceC0569i;
import p5.EnumC0580a;
import q5.AbstractC0607c;

/* loaded from: classes.dex */
public final class p implements K5.d {

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0569i f1522f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1523g;

    /* renamed from: h, reason: collision with root package name */
    public final o f1524h;

    public p(K5.d dVar, InterfaceC0569i interfaceC0569i) {
        this.f1522f = interfaceC0569i;
        this.f1523g = M5.a.l(interfaceC0569i);
        this.f1524h = new o(dVar, null);
    }

    @Override // K5.d
    public final Object a(Object obj, AbstractC0607c abstractC0607c) {
        Object b7 = l.b(this.f1522f, obj, this.f1523g, this.f1524h, abstractC0607c);
        return b7 == EnumC0580a.f5697f ? b7 : v.f5219a;
    }
}
