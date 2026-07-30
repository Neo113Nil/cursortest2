package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bx1 extends qc {
    public final tb2 RAsUl2FVSrh6;
    public final uv TSizfFm2Yiuu;
    public final v40 Y1f8riQaR6yg;
    public final sq a92UlCVFR9N8;
    public final List e9gEMXR7LXtO;
    public pd0 rtx2ld2ELZv4;

    public bx1(uv uvVar, v40 v40Var, gb0 gb0Var) {
        int i;
        sq wqVar;
        dx1 dx1Var = uvVar.a92UlCVFR9N8;
        ib0 ib0Var = uvVar.TSizfFm2Yiuu;
        gy1 gy1Var = uvVar.QrzZRwfaDlRX;
        String str = uvVar.lS5Rgt96tfkO;
        this.TSizfFm2Yiuu = uvVar;
        this.Y1f8riQaR6yg = v40Var;
        List list = uvVar.e9gEMXR7LXtO;
        this.e9gEMXR7LXtO = list == null ? p50.rtx2ld2ELZv4 : list;
        if (gy1Var != null) {
            this.RAsUl2FVSrh6 = null;
            if (gy1Var.a92UlCVFR9N8()) {
                wqVar = new wj1(new op0(this, gy1Var), str == null ? ":memory:" : str, gb0Var);
            } else if (str == null) {
                wqVar = new wq(new op0(this, gy1Var));
            } else {
                op0 op0Var = new op0(this, gy1Var);
                int ordinal = dx1Var.ordinal();
                if (ordinal == 1) {
                    i = 1;
                } else {
                    if (ordinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + dx1Var + '\'').toString());
                    }
                    i = 4;
                }
                int ordinal2 = dx1Var.ordinal();
                if (ordinal2 != 1 && ordinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + dx1Var + '\'').toString());
                }
                wqVar = new wq(op0Var, str, i);
            }
            this.a92UlCVFR9N8 = wqVar;
        } else {
            if (ib0Var == null) {
                u9.XL4ISE6Oc65B("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            rb2 rb2Var = sb2.Companion;
            Context context = uvVar.PxuCJdSBwIXG;
            rb2Var.getClass();
            wd0 wd0Var = new wd0(context, str, new zw1(this, v40Var.PxuCJdSBwIXG));
            this.RAsUl2FVSrh6 = wd0Var;
            this.a92UlCVFR9N8 = new wj1(new b42(wd0Var), str == null ? ":memory:" : str, gb0Var);
        }
        boolean z = dx1Var == dx1.OPXfSBeufaJ8;
        tb2 tb2Var = this.RAsUl2FVSrh6;
        if (tb2Var != null) {
            tb2Var.setWriteAheadLoggingEnabled(z);
        }
    }

    public bx1(uv uvVar, mq1 mq1Var, gb0 gb0Var) {
        this.TSizfFm2Yiuu = uvVar;
        this.Y1f8riQaR6yg = new yw1(-1, "", "");
        List list = uvVar.e9gEMXR7LXtO;
        p50 p50Var = p50.rtx2ld2ELZv4;
        this.e9gEMXR7LXtO = list == null ? p50Var : list;
        zk.P6VAkUObIv30(list == null ? p50Var : list, new ax1(new xw1(0, this)));
        uvVar.Y1f8riQaR6yg.getClass();
        throw new ce1(0);
    }
}
