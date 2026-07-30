package defpackage;

import android.database.sqlite.SQLiteStatement;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xb2 extends ac2 {
    public final /* synthetic */ int dgRBjINgWbAK = 1;
    public final Object x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb2(pd0 pd0Var, String str) {
        super(pd0Var, str);
        pd0Var.getClass();
        str.getClass();
        str.getClass();
        SQLiteStatement compileStatement = pd0Var.rtx2ld2ELZv4.compileStatement(str);
        compileStatement.getClass();
        this.x50lh2ztY7Y5 = new yd0(compileStatement);
    }

    @Override // defpackage.hy1
    public final void Y1f8riQaR6yg(int i, long j) {
        int i2 = this.dgRBjINgWbAK;
        Object obj = this.x50lh2ztY7Y5;
        switch (i2) {
            case 0:
                ((zb2) obj).Y1f8riQaR6yg(i, j);
                return;
            case 1:
                lS5Rgt96tfkO();
                ((yd0) obj).Y1f8riQaR6yg(i, j);
                return;
            default:
                lS5Rgt96tfkO();
                sj0.zf8DYfih6EZu("column index out of range", 25);
                throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.dgRBjINgWbAK;
        Object obj = this.x50lh2ztY7Y5;
        switch (i) {
            case 0:
                ((zb2) obj).close();
                break;
            case 1:
                ((yd0) obj).close();
                this.wdg6QnbFHrFF = true;
                break;
            default:
                this.wdg6QnbFHrFF = true;
                break;
        }
    }

    @Override // defpackage.hy1
    public final String dgRBjINgWbAK(int i) {
        switch (this.dgRBjINgWbAK) {
            case 0:
                return ((zb2) this.x50lh2ztY7Y5).dgRBjINgWbAK(i);
            case 1:
                lS5Rgt96tfkO();
                sj0.zf8DYfih6EZu("no row", 21);
                throw null;
            default:
                lS5Rgt96tfkO();
                sj0.zf8DYfih6EZu("no row", 21);
                throw null;
        }
    }

    @Override // defpackage.ac2, defpackage.hy1
    public void e9gEMXR7LXtO() {
        int i = this.dgRBjINgWbAK;
        Object obj = this.x50lh2ztY7Y5;
        switch (i) {
            case 0:
                ((zb2) obj).e9gEMXR7LXtO();
                break;
            case 1:
                lS5Rgt96tfkO();
                ((yd0) obj).e9gEMXR7LXtO();
                break;
            default:
                super.e9gEMXR7LXtO();
                break;
        }
    }

    @Override // defpackage.hy1
    public final int getColumnCount() {
        switch (this.dgRBjINgWbAK) {
            case 0:
                break;
            case 1:
                lS5Rgt96tfkO();
                break;
            default:
                lS5Rgt96tfkO();
                break;
        }
        return 0;
    }

    @Override // defpackage.hy1
    public final String getColumnName(int i) {
        switch (this.dgRBjINgWbAK) {
            case 0:
                return ((zb2) this.x50lh2ztY7Y5).getColumnName(i);
            case 1:
                lS5Rgt96tfkO();
                sj0.zf8DYfih6EZu("no row", 21);
                throw null;
            default:
                lS5Rgt96tfkO();
                sj0.zf8DYfih6EZu("no row", 21);
                throw null;
        }
    }

    @Override // defpackage.hy1
    public final long getLong(int i) {
        switch (this.dgRBjINgWbAK) {
            case 0:
                return ((zb2) this.x50lh2ztY7Y5).getLong(i);
            case 1:
                lS5Rgt96tfkO();
                sj0.zf8DYfih6EZu("no row", 21);
                throw null;
            default:
                lS5Rgt96tfkO();
                sj0.zf8DYfih6EZu("no row", 21);
                throw null;
        }
    }

    @Override // defpackage.hy1
    public final boolean isNull(int i) {
        switch (this.dgRBjINgWbAK) {
            case 0:
                return ((zb2) this.x50lh2ztY7Y5).isNull(i);
            case 1:
                lS5Rgt96tfkO();
                sj0.zf8DYfih6EZu("no row", 21);
                throw null;
            default:
                lS5Rgt96tfkO();
                sj0.zf8DYfih6EZu("no row", 21);
                throw null;
        }
    }

    @Override // defpackage.hy1
    public boolean jyegZNwi31qc() {
        switch (this.dgRBjINgWbAK) {
            case 0:
                return ((zb2) this.x50lh2ztY7Y5).jyegZNwi31qc();
            default:
                return super.jyegZNwi31qc();
        }
    }

    @Override // defpackage.ac2, defpackage.hy1
    public void reset() {
        switch (this.dgRBjINgWbAK) {
            case 0:
                ((zb2) this.x50lh2ztY7Y5).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // defpackage.hy1
    public final boolean tmVwIGCQF4zR() {
        int i = this.dgRBjINgWbAK;
        pd0 pd0Var = this.rtx2ld2ELZv4;
        Object obj = this.x50lh2ztY7Y5;
        switch (i) {
            case 0:
                zb2 zb2Var = (zb2) obj;
                boolean tmVwIGCQF4zR = zb2Var.tmVwIGCQF4zR();
                if (!zb2Var.dgRBjINgWbAK(0).equalsIgnoreCase("wal")) {
                    pd0Var.rtx2ld2ELZv4.disableWriteAheadLogging();
                    break;
                } else {
                    pd0Var.rtx2ld2ELZv4.enableWriteAheadLogging();
                    break;
                }
            case 1:
                lS5Rgt96tfkO();
                ((yd0) obj).OPXfSBeufaJ8.execute();
                break;
            default:
                int ordinal = ((vb2) obj).ordinal();
                if (ordinal == 0) {
                    pd0Var.rtx2ld2ELZv4.setTransactionSuccessful();
                    pd0Var.cpQdD2nAriOS();
                    break;
                } else if (ordinal == 1) {
                    pd0Var.cpQdD2nAriOS();
                    break;
                } else if (ordinal == 2) {
                    pd0Var.a92UlCVFR9N8();
                    break;
                } else if (ordinal == 3) {
                    pd0Var.rtx2ld2ELZv4.beginTransactionNonExclusive();
                    break;
                } else if (ordinal != 4) {
                    u9.gPXPFXrUH4XX();
                    break;
                } else {
                    pd0Var.OPXfSBeufaJ8();
                    break;
                }
        }
        return false;
    }

    @Override // defpackage.hy1
    public final void wdg6QnbFHrFF(String str, int i) {
        int i2 = this.dgRBjINgWbAK;
        Object obj = this.x50lh2ztY7Y5;
        switch (i2) {
            case 0:
                str.getClass();
                ((zb2) obj).wdg6QnbFHrFF(str, i);
                return;
            case 1:
                str.getClass();
                lS5Rgt96tfkO();
                ((yd0) obj).ozEBbv0hFTAB(str, i);
                return;
            default:
                str.getClass();
                lS5Rgt96tfkO();
                sj0.zf8DYfih6EZu("column index out of range", 25);
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb2(pd0 pd0Var, String str, zb2 zb2Var) {
        super(pd0Var, str);
        pd0Var.getClass();
        str.getClass();
        this.x50lh2ztY7Y5 = zb2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb2(pd0 pd0Var, String str, vb2 vb2Var) {
        super(pd0Var, str);
        pd0Var.getClass();
        str.getClass();
        this.x50lh2ztY7Y5 = vb2Var;
    }
}
