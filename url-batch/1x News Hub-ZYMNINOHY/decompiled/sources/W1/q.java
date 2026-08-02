package W1;

import d2.InterfaceC0300c;
import f2.AbstractC0326c;

/* loaded from: classes.dex */
public final class q extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1694d;

    /* renamed from: e, reason: collision with root package name */
    public int f1695e;
    public final /* synthetic */ r f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, InterfaceC0300c interfaceC0300c) {
        super(interfaceC0300c);
        this.f = rVar;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f1694d = obj;
        this.f1695e |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
