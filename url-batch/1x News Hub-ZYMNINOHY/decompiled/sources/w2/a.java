package w2;

import d2.InterfaceC0300c;
import f2.AbstractC0326c;

/* loaded from: classes.dex */
public final class a extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public x2.m f10639d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f10640e;
    public final /* synthetic */ b0.r f;

    /* renamed from: g, reason: collision with root package name */
    public int f10641g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b0.r rVar, InterfaceC0300c interfaceC0300c) {
        super(interfaceC0300c);
        this.f = rVar;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f10640e = obj;
        this.f10641g |= Integer.MIN_VALUE;
        return this.f.n(null, this);
    }
}
