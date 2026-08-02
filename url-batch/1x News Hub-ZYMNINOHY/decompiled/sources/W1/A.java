package W1;

import K.C0054s;
import d2.InterfaceC0300c;
import f2.AbstractC0326c;

/* loaded from: classes.dex */
public final class A extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1623d;

    /* renamed from: e, reason: collision with root package name */
    public int f1624e;
    public final /* synthetic */ C0054s f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C0054s c0054s, InterfaceC0300c interfaceC0300c) {
        super(interfaceC0300c);
        this.f = c0054s;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f1623d = obj;
        this.f1624e |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
