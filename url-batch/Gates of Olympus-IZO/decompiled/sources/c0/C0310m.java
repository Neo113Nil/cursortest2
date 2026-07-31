package c0;

import e2.AbstractC0381e;

/* renamed from: c0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0310m implements InterfaceC0306i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0314q f4388b;

    public /* synthetic */ C0310m(C0314q c0314q, int i3) {
        this.f4387a = i3;
        this.f4388b = c0314q;
    }

    @Override // c0.InterfaceC0306i
    public final double b(double d3) {
        switch (this.f4387a) {
            case 0:
                return AbstractC0381e.p(this.f4388b.f4403k.b(d3), r0.f4397e, r0.f4398f);
            default:
                return this.f4388b.f4406n.b(AbstractC0381e.p(d3, r0.f4397e, r0.f4398f));
        }
    }
}
