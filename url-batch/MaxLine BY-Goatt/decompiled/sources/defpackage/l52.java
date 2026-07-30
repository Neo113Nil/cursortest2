package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class l52 extends o52 implements s71 {
    @Override // defpackage.tr
    public g71 computeReflected() {
        d82.a.getClass();
        return this;
    }

    @Override // defpackage.s71
    public Object getDelegate(Object obj) {
        return ((s71) getReflected()).getDelegate(obj);
    }

    @Override // defpackage.s71
    /* renamed from: getGetter, reason: collision with other method in class */
    public r71 mo13getGetter() {
        ((s71) getReflected()).mo13getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    public /* bridge */ /* synthetic */ p71 getGetter() {
        mo13getGetter();
        return null;
    }
}
