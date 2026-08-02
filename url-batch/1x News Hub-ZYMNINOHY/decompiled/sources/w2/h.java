package w2;

import d2.InterfaceC0300c;
import f2.AbstractC0326c;

/* loaded from: classes.dex */
public final class h extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10654d;

    /* renamed from: e, reason: collision with root package name */
    public int f10655e;
    public final /* synthetic */ i f;

    /* renamed from: g, reason: collision with root package name */
    public Object f10656g;

    /* renamed from: h, reason: collision with root package name */
    public e f10657h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, InterfaceC0300c interfaceC0300c) {
        super(interfaceC0300c);
        this.f = iVar;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f10654d = obj;
        this.f10655e |= Integer.MIN_VALUE;
        return this.f.n(null, this);
    }
}
