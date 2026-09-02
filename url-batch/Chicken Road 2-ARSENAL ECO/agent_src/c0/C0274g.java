package c0;

import W4.o;
import a1.AbstractC0223a;
import kotlin.jvm.internal.i;
import x5.InterfaceC0743l;

/* renamed from: c0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274g extends AbstractC0223a {

    /* renamed from: c, reason: collision with root package name */
    public final Object f3764c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3765d;

    /* renamed from: e, reason: collision with root package name */
    public final C0268a f3766e;

    public C0274g(Object value, int i7, C0268a c0268a) {
        i.e(value, "value");
        o.f("verificationMode", i7);
        this.f3764c = value;
        this.f3765d = i7;
        this.f3766e = c0268a;
    }

    @Override // a1.AbstractC0223a
    public final AbstractC0223a E(String str, InterfaceC0743l interfaceC0743l) {
        Object obj = this.f3764c;
        return ((Boolean) interfaceC0743l.invoke(obj)).booleanValue() ? this : new C0273f(obj, str, this.f3766e, this.f3765d);
    }

    @Override // a1.AbstractC0223a
    public final Object d() {
        return this.f3764c;
    }
}
