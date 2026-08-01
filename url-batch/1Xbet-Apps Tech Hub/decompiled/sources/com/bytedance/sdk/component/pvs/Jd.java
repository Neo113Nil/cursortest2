package com.bytedance.sdk.component.pvs;

/* compiled from: BaseStatefulMethod.java */
/* loaded from: classes.dex */
public abstract class Jd<P, R> extends com.bytedance.sdk.component.pvs.icD<P, R> {
    private pvs icD;
    private boolean pvs = true;
    private sUS vG;

    /* compiled from: BaseStatefulMethod.java */
    public interface icD {
        Jd pvs();
    }

    /* compiled from: BaseStatefulMethod.java */
    interface pvs {
        void pvs(Object obj);

        void pvs(Throwable th);
    }

    protected abstract void pvs(P p, sUS sus) throws Exception;

    @Override // com.bytedance.sdk.component.pvs.icD
    public /* bridge */ /* synthetic */ String pvs() {
        return super.pvs();
    }

    protected final void pvs(R r) {
        if (sUS()) {
            this.icD.pvs(r);
            Jd();
        }
    }

    protected final void pvs(Throwable th) {
        if (sUS()) {
            this.icD.pvs(th);
            Jd();
        }
    }

    protected final void vG() {
        pvs((Throwable) null);
    }

    protected void Jd() {
        this.pvs = false;
        this.vG = null;
    }

    void pvs(P p, sUS sus, pvs pvsVar) throws Exception {
        this.vG = sus;
        this.icD = pvsVar;
        pvs(p, sus);
    }

    void NB() {
        Jd();
    }

    private boolean sUS() {
        if (this.pvs) {
            return true;
        }
        Mxy.pvs(new IllegalStateException("Jsb async call already finished: " + pvs() + ", hashcode: " + hashCode()));
        return false;
    }
}
