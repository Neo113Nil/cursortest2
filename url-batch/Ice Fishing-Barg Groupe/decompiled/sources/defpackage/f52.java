package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class f52 implements s00 {
    public final long OPXfSBeufaJ8;
    public final bi dgRBjINgWbAK;
    public final h52 rtx2ld2ELZv4;
    public final Object wdg6QnbFHrFF;

    public f52(h52 h52Var, long j, Object obj, bi biVar) {
        this.rtx2ld2ELZv4 = h52Var;
        this.OPXfSBeufaJ8 = j;
        this.wdg6QnbFHrFF = obj;
        this.dgRBjINgWbAK = biVar;
    }

    @Override // defpackage.s00
    public final void PxuCJdSBwIXG() {
        h52 h52Var = this.rtx2ld2ELZv4;
        synchronized (h52Var) {
            if (this.OPXfSBeufaJ8 < h52Var.QrzZRwfaDlRX()) {
                return;
            }
            Object[] objArr = h52Var.QrzZRwfaDlRX;
            objArr.getClass();
            long j = this.OPXfSBeufaJ8;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            b51.J54yh1s3n4Aq(objArr, j, b51.cpQdD2nAriOS);
            h52Var.OPXfSBeufaJ8();
        }
    }
}
