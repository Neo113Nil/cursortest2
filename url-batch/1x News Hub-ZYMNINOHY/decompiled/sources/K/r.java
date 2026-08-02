package K;

import d2.InterfaceC0300c;
import f2.AbstractC0326c;

/* loaded from: classes.dex */
public final class r extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f808d;

    /* renamed from: e, reason: collision with root package name */
    public int f809e;
    public final /* synthetic */ C0054s f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0054s c0054s, InterfaceC0300c interfaceC0300c) {
        super(interfaceC0300c);
        this.f = c0054s;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f808d = obj;
        this.f809e |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
