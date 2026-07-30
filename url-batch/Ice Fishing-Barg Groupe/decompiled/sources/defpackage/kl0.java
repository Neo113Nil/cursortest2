package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class kl0 implements ae0 {
    public final /* synthetic */ ll0 OPXfSBeufaJ8;
    public final ql0 rtx2ld2ELZv4;

    public kl0(ll0 ll0Var, ql0 ql0Var) {
        this.OPXfSBeufaJ8 = ll0Var;
        this.rtx2ld2ELZv4 = ql0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.ae0
    public final Object PxuCJdSBwIXG() {
        Throwable th;
        ll0 ll0Var = this.OPXfSBeufaJ8;
        ql0 ql0Var = this.rtx2ld2ELZv4;
        o60 o60Var = o60.dgRBjINgWbAK;
        IOException iOException = null;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    ll0Var.lS5Rgt96tfkO(this, o60Var, iOException);
                    kv2.PxuCJdSBwIXG(ql0Var);
                    throw th;
                }
            } catch (IOException e) {
                iOException = e;
            }
            if (!ql0Var.lS5Rgt96tfkO(true, this)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            do {
                try {
                } catch (Throwable th3) {
                    th = th3;
                    this = o60Var;
                    ll0Var.lS5Rgt96tfkO(this, o60Var, iOException);
                    kv2.PxuCJdSBwIXG(ql0Var);
                    throw th;
                }
            } while (ql0Var.lS5Rgt96tfkO(false, this));
            o60 o60Var2 = o60.OPXfSBeufaJ8;
            try {
                o60Var = o60.r3s1LDPKFs1S;
                ll0Var.lS5Rgt96tfkO(o60Var2, o60Var, null);
                this = o60Var2;
            } catch (IOException e2) {
                iOException = e2;
                o60 o60Var3 = o60.wdg6QnbFHrFF;
                ll0Var.lS5Rgt96tfkO(o60Var3, o60Var3, iOException);
                this = o60Var3;
                kv2.PxuCJdSBwIXG(ql0Var);
                return no2.PxuCJdSBwIXG;
            }
            kv2.PxuCJdSBwIXG(ql0Var);
            return no2.PxuCJdSBwIXG;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
