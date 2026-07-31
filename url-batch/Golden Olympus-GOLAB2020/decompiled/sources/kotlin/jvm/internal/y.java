package kotlin.jvm.internal;

import m2.InterfaceC3262b;

/* loaded from: classes3.dex */
public abstract class y extends C implements m2.i {
    public y() {
    }

    @Override // kotlin.jvm.internal.AbstractC3240f
    protected InterfaceC3262b computeReflected() {
        return H.f(this);
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    public y(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, i4);
    }
}
