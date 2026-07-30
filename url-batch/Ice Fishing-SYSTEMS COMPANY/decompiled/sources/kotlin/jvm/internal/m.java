package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public abstract class m extends o implements K7.k {
    @Override // kotlin.jvm.internal.b
    public K7.b computeReflected() {
        s.f38862a.getClass();
        return this;
    }

    @Override // K7.k
    public Object getDelegate(Object obj) {
        return ((K7.k) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ K7.i getGetter() {
        mo51getGetter();
        return null;
    }

    @Override // E7.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // K7.k
    /* renamed from: getGetter */
    public K7.j mo51getGetter() {
        ((K7.k) getReflected()).mo51getGetter();
        return null;
    }
}
