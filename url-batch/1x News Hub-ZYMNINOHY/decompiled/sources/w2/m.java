package w2;

import W1.C0102n;
import d2.InterfaceC0300c;
import f2.AbstractC0326c;

/* loaded from: classes.dex */
public final class m extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public C0102n f10672d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f10673e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0102n f10674g;

    /* renamed from: h, reason: collision with root package name */
    public Object f10675h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C0102n c0102n, InterfaceC0300c interfaceC0300c) {
        super(interfaceC0300c);
        this.f10674g = c0102n;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f10673e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.f10674g.a(null, this);
    }
}
