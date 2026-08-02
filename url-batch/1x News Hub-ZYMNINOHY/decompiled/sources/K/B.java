package K;

import d2.InterfaceC0300c;
import f2.AbstractC0326c;

/* loaded from: classes.dex */
public final class B extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public N f650d;

    /* renamed from: e, reason: collision with root package name */
    public i0 f651e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f652g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ N f653h;

    /* renamed from: i, reason: collision with root package name */
    public int f654i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(N n3, InterfaceC0300c interfaceC0300c) {
        super(interfaceC0300c);
        this.f653h = n3;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f652g = obj;
        this.f654i |= Integer.MIN_VALUE;
        return N.e(this.f653h, false, this);
    }
}
