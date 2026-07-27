package j0;

import b2.AbstractC0279e;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class h extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10454a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10455b;

    /* renamed from: c, reason: collision with root package name */
    public final C1198a f10456c;

    public h(Object value, int i2, C1198a c1198a) {
        kotlin.jvm.internal.i.e(value, "value");
        AbstractC0279e.k(i2, "verificationMode");
        this.f10454a = value;
        this.f10455b = i2;
        this.f10456c = c1198a;
    }

    @Override // j0.g
    public final Object a() {
        return this.f10454a;
    }

    @Override // j0.g
    public final g d(String str, InterfaceC1441l interfaceC1441l) {
        Object obj = this.f10454a;
        return ((Boolean) interfaceC1441l.invoke(obj)).booleanValue() ? this : new f(obj, str, this.f10456c, this.f10455b);
    }
}
