package kotlin.jvm.internal;

import m2.InterfaceC3262b;
import m2.j;

/* loaded from: classes3.dex */
public abstract class u extends w implements m2.g {
    public u() {
    }

    @Override // kotlin.jvm.internal.AbstractC3240f
    protected InterfaceC3262b computeReflected() {
        return H.d(this);
    }

    @Override // m2.j
    public Object getDelegate(Object obj) {
        return ((m2.g) getReflected()).getDelegate(obj);
    }

    @Override // m2.j
    /* renamed from: getGetter */
    public j.a mo257getGetter() {
        ((m2.g) getReflected()).mo257getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    public u(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, i4);
    }
}
