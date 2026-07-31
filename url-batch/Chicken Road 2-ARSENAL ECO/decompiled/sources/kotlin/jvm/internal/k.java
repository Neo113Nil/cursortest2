package kotlin.jvm.internal;

/* loaded from: classes.dex */
public abstract class k extends p implements D5.h {
    @Override // kotlin.jvm.internal.b
    public D5.b computeReflected() {
        t.f5234a.getClass();
        return this;
    }

    @Override // D5.k
    public Object getDelegate(Object obj) {
        return ((D5.h) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ D5.i getGetter() {
        mo42getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ D5.f getSetter() {
        mo43getSetter();
        return null;
    }

    @Override // x5.InterfaceC0743l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // D5.k
    /* renamed from: getGetter, reason: collision with other method in class */
    public D5.j mo42getGetter() {
        ((D5.h) getReflected()).mo42getGetter();
        return null;
    }

    @Override // D5.h
    /* renamed from: getSetter, reason: collision with other method in class */
    public D5.g mo43getSetter() {
        ((D5.h) getReflected()).mo43getSetter();
        return null;
    }
}
