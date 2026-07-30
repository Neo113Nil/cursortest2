package kotlin.jvm.internal;

import k6.InterfaceC0607b;
import k6.InterfaceC0614i;
import k6.InterfaceC0615j;
import k6.InterfaceC0616k;

/* loaded from: classes.dex */
public abstract class w extends A implements InterfaceC0616k {
    @Override // kotlin.jvm.internal.AbstractC0639d
    public InterfaceC0607b computeReflected() {
        E.f6153a.getClass();
        return this;
    }

    @Override // k6.InterfaceC0616k
    public Object getDelegate(Object obj) {
        return ((InterfaceC0616k) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ InterfaceC0614i getGetter() {
        mo44getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // k6.InterfaceC0616k
    /* renamed from: getGetter */
    public InterfaceC0615j mo44getGetter() {
        ((InterfaceC0616k) getReflected()).mo44getGetter();
        return null;
    }
}
