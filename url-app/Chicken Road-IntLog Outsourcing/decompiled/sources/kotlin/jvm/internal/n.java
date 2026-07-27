package kotlin.jvm.internal;

import z4.InterfaceC1585b;

/* loaded from: classes.dex */
public abstract class n extends p implements z4.k {
    @Override // kotlin.jvm.internal.b
    public InterfaceC1585b computeReflected() {
        t.f10742a.getClass();
        return this;
    }

    @Override // z4.k
    public Object getDelegate(Object obj) {
        return ((z4.k) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ z4.i getGetter() {
        mo49getGetter();
        return null;
    }

    @Override // t4.InterfaceC1441l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // z4.k
    /* renamed from: getGetter */
    public z4.j mo49getGetter() {
        ((z4.k) getReflected()).mo49getGetter();
        return null;
    }
}
