package kotlin.jvm.internal;

import z4.InterfaceC1585b;
import z4.InterfaceC1589f;
import z4.InterfaceC1590g;

/* loaded from: classes.dex */
public abstract class k extends p implements z4.h {
    @Override // kotlin.jvm.internal.b
    public InterfaceC1585b computeReflected() {
        t.f10742a.getClass();
        return this;
    }

    @Override // z4.k
    public Object getDelegate(Object obj) {
        return ((z4.h) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ z4.i getGetter() {
        mo49getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ InterfaceC1589f getSetter() {
        mo50getSetter();
        return null;
    }

    @Override // t4.InterfaceC1441l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // z4.k
    /* renamed from: getGetter, reason: collision with other method in class */
    public z4.j mo49getGetter() {
        ((z4.h) getReflected()).mo49getGetter();
        return null;
    }

    @Override // z4.h
    /* renamed from: getSetter, reason: collision with other method in class */
    public InterfaceC1590g mo50getSetter() {
        ((z4.h) getReflected()).mo50getSetter();
        return null;
    }
}
