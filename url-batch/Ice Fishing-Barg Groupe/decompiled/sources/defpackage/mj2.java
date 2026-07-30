package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class mj2 implements fu {
    public final ThreadLocal OPXfSBeufaJ8;
    public final Object rtx2ld2ELZv4;
    public final oj2 wdg6QnbFHrFF;

    public mj2(Object obj, ThreadLocal threadLocal) {
        this.rtx2ld2ELZv4 = obj;
        this.OPXfSBeufaJ8 = threadLocal;
        this.wdg6QnbFHrFF = new oj2(threadLocal);
    }

    @Override // defpackage.hu
    public final Object IAToe7bXGz4N(pe0 pe0Var, Object obj) {
        return pe0Var.rtx2ld2ELZv4(obj, this);
    }

    public final void PxuCJdSBwIXG(Object obj) {
        this.OPXfSBeufaJ8.set(obj);
    }

    @Override // defpackage.hu
    public final hu RfyTYNmI9Srp(hu huVar) {
        return f2.xfACYKDMU6Dj(this, huVar);
    }

    @Override // defpackage.hu
    public final fu S2OOm9zPNm0h(gu guVar) {
        if (this.wdg6QnbFHrFF.equals(guVar)) {
            return this;
        }
        return null;
    }

    public final Object TSizfFm2Yiuu() {
        ThreadLocal threadLocal = this.OPXfSBeufaJ8;
        Object obj = threadLocal.get();
        threadLocal.set(this.rtx2ld2ELZv4);
        return obj;
    }

    @Override // defpackage.fu
    public final gu getKey() {
        return this.wdg6QnbFHrFF;
    }

    @Override // defpackage.hu
    public final hu kpCQ9veP6n3I(gu guVar) {
        return this.wdg6QnbFHrFF.equals(guVar) ? n50.rtx2ld2ELZv4 : this;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.rtx2ld2ELZv4 + ", threadLocal = " + this.OPXfSBeufaJ8 + ')';
    }
}
