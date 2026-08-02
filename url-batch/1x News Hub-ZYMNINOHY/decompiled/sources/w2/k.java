package w2;

import d2.InterfaceC0300c;
import f2.AbstractC0326c;

/* loaded from: classes.dex */
public final class k extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public W1.r f10665d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10666e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ W1.r f10667g;

    /* renamed from: h, reason: collision with root package name */
    public int f10668h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(W1.r rVar, InterfaceC0300c interfaceC0300c) {
        super(interfaceC0300c);
        this.f10667g = rVar;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f = obj;
        this.f10668h |= Integer.MIN_VALUE;
        return this.f10667g.a(null, this);
    }
}
