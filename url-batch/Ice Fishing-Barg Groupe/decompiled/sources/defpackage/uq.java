package defpackage;

import android.database.SQLException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class uq implements ae0 {
    public final /* synthetic */ boolean OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4 = 0;
    public final /* synthetic */ Object wdg6QnbFHrFF;

    public /* synthetic */ uq(wq wqVar, boolean z) {
        this.wdg6QnbFHrFF = wqVar;
        this.OPXfSBeufaJ8 = z;
    }

    @Override // defpackage.ae0
    public final Object PxuCJdSBwIXG() {
        z81 OPXfSBeufaJ8;
        int i = this.rtx2ld2ELZv4;
        no2 no2Var = no2.PxuCJdSBwIXG;
        Object obj = this.wdg6QnbFHrFF;
        boolean z = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                wq wqVar = (wq) obj;
                String str = z ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                wqVar.OPXfSBeufaJ8.Y1f8riQaR6yg(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                wqVar.rtx2ld2ELZv4.Y1f8riQaR6yg(sb);
                try {
                    sj0.zf8DYfih6EZu(sb.toString(), 5);
                    throw null;
                } catch (SQLException e) {
                    int i2 = wqVar.r3s1LDPKFs1S;
                    if (i2 == 1) {
                        throw e;
                    }
                    if (i2 == 2) {
                        e.printStackTrace();
                    }
                    return no2Var;
                }
            default:
                f4 f4Var = (f4) obj;
                if (z && (OPXfSBeufaJ8 = f4Var.OPXfSBeufaJ8()) != null) {
                    ((h52) OPXfSBeufaJ8).BRwzKIf41E4i(no2Var);
                }
                return no2Var;
        }
    }

    public /* synthetic */ uq(boolean z, f4 f4Var) {
        this.OPXfSBeufaJ8 = z;
        this.wdg6QnbFHrFF = f4Var;
    }
}
