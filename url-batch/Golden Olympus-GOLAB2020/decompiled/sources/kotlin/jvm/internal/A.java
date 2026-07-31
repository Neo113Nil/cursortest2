package kotlin.jvm.internal;

import m2.InterfaceC3262b;
import m2.h;
import m2.j;

/* loaded from: classes3.dex */
public abstract class A extends C implements m2.j {
    public A() {
    }

    @Override // kotlin.jvm.internal.AbstractC3240f
    protected InterfaceC3262b computeReflected() {
        return H.g(this);
    }

    @Override // m2.j
    public Object getDelegate(Object obj) {
        return ((m2.j) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ h.a getGetter() {
        mo257getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    public A(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, i4);
    }

    @Override // m2.j
    /* renamed from: getGetter, reason: collision with other method in class */
    public j.a mo257getGetter() {
        ((m2.j) getReflected()).mo257getGetter();
        return null;
    }
}
