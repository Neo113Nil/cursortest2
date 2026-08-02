package w2;

import W1.C0102n;
import d2.InterfaceC0300c;
import f0.C0322a;
import f2.AbstractC0326c;

/* loaded from: classes.dex */
public final class l extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10669d;

    /* renamed from: e, reason: collision with root package name */
    public int f10670e;
    public final /* synthetic */ C0322a f;

    /* renamed from: g, reason: collision with root package name */
    public C0102n f10671g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C0322a c0322a, InterfaceC0300c interfaceC0300c) {
        super(interfaceC0300c);
        this.f = c0322a;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f10669d = obj;
        this.f10670e |= Integer.MIN_VALUE;
        return this.f.n(null, this);
    }
}
