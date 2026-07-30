package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wd0 implements tb2 {
    public static final qd0 Companion = new qd0();
    public final String OPXfSBeufaJ8;
    public final qc2 dgRBjINgWbAK;
    public final Context rtx2ld2ELZv4;
    public final qb2 wdg6QnbFHrFF;
    public boolean x50lh2ztY7Y5;

    public wd0(Context context, String str, qb2 qb2Var) {
        qb2Var.getClass();
        this.rtx2ld2ELZv4 = context;
        this.OPXfSBeufaJ8 = str;
        this.wdg6QnbFHrFF = qb2Var;
        this.dgRBjINgWbAK = new qc2(new o5(10, this));
    }

    @Override // defpackage.tb2
    public final pd0 EpkonXwzFgDB() {
        return ((vd0) this.dgRBjINgWbAK.getValue()).lS5Rgt96tfkO(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.dgRBjINgWbAK.OPXfSBeufaJ8 != jx1.pnx5pC0XzaCw) {
            ((vd0) this.dgRBjINgWbAK.getValue()).close();
        }
    }

    @Override // defpackage.tb2
    public final String getDatabaseName() {
        return this.OPXfSBeufaJ8;
    }

    @Override // defpackage.tb2
    public final void setWriteAheadLoggingEnabled(boolean z) {
        if (this.dgRBjINgWbAK.OPXfSBeufaJ8 != jx1.pnx5pC0XzaCw) {
            ((vd0) this.dgRBjINgWbAK.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.x50lh2ztY7Y5 = z;
    }
}
