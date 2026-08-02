package W1;

import d2.InterfaceC0300c;
import f2.AbstractC0326c;

/* loaded from: classes.dex */
public final class x extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1719d;

    /* renamed from: e, reason: collision with root package name */
    public int f1720e;
    public final /* synthetic */ C0102n f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C0102n c0102n, InterfaceC0300c interfaceC0300c) {
        super(interfaceC0300c);
        this.f = c0102n;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f1719d = obj;
        this.f1720e |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
