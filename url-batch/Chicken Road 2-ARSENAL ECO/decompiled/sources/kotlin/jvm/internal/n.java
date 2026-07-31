package kotlin.jvm.internal;

/* loaded from: classes.dex */
public abstract class n extends p implements D5.k {
    @Override // kotlin.jvm.internal.b
    public D5.b computeReflected() {
        t.f5234a.getClass();
        return this;
    }

    @Override // D5.k
    public Object getDelegate(Object obj) {
        return ((D5.k) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ D5.i getGetter() {
        mo42getGetter();
        return null;
    }

    @Override // x5.InterfaceC0743l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // D5.k
    /* renamed from: getGetter */
    public D5.j mo42getGetter() {
        ((D5.k) getReflected()).mo42getGetter();
        return null;
    }
}
