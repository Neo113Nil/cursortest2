package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qn1 extends rn1 implements s71, t71 {
    public qn1(String str, String str2) {
        super(tr.NO_RECEIVER, ii2.class, str, str2, 1);
    }

    @Override // defpackage.tr
    public final g71 computeReflected() {
        d82.a.getClass();
        return this;
    }

    @Override // defpackage.s71
    public final Object get(Object obj) {
        throw null;
    }

    @Override // defpackage.s71
    public final Object getDelegate(Object obj) {
        return ((qn1) getReflected()).getDelegate(obj);
    }

    @Override // defpackage.s71
    /* renamed from: getGetter */
    public final r71 mo13getGetter() {
        ((qn1) getReflected()).mo13getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mo13getGetter();
        throw null;
    }
}
