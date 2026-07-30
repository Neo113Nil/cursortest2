package kotlin.jvm.internal;

import k6.InterfaceC0607b;
import k6.InterfaceC0611f;
import k6.InterfaceC0612g;
import k6.InterfaceC0613h;
import k6.InterfaceC0614i;
import k6.InterfaceC0615j;

/* loaded from: classes.dex */
public abstract class r extends t implements InterfaceC0613h {
    @Override // kotlin.jvm.internal.AbstractC0639d
    public InterfaceC0607b computeReflected() {
        E.f6153a.getClass();
        return this;
    }

    @Override // k6.InterfaceC0616k
    public Object getDelegate(Object obj) {
        return ((InterfaceC0613h) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ InterfaceC0614i getGetter() {
        mo44getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ InterfaceC0611f getSetter() {
        mo45getSetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // k6.InterfaceC0616k
    /* renamed from: getGetter, reason: collision with other method in class */
    public InterfaceC0615j mo44getGetter() {
        ((InterfaceC0613h) getReflected()).mo44getGetter();
        return null;
    }

    @Override // k6.InterfaceC0613h
    /* renamed from: getSetter, reason: collision with other method in class */
    public InterfaceC0612g mo45getSetter() {
        ((InterfaceC0613h) getReflected()).mo45getSetter();
        return null;
    }
}
