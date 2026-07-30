package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class p4 implements re0 {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ p4(int i, Object obj) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
    }

    @Override // defpackage.re0
    public final Object r3s1LDPKFs1S(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.rtx2ld2ELZv4;
        Object obj5 = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                q4 q4Var = (q4) obj5;
                cn2 lS5Rgt96tfkO = ((qb0) q4Var.e9gEMXR7LXtO).lS5Rgt96tfkO((pb0) obj, (xc0) obj2, ((rc0) obj3).PxuCJdSBwIXG, ((tc0) obj4).PxuCJdSBwIXG);
                if (lS5Rgt96tfkO instanceof bn2) {
                    Object obj6 = ((bn2) lS5Rgt96tfkO).rtx2ld2ELZv4;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                m9 m9Var = new m9(lS5Rgt96tfkO, q4Var.wdg6QnbFHrFF);
                q4Var.wdg6QnbFHrFF = m9Var;
                Object obj7 = m9Var.dgRBjINgWbAK;
                obj7.getClass();
                return (Typeface) obj7;
            case 1:
                SQLiteCursorDriver sQLiteCursorDriver = (SQLiteCursorDriver) obj2;
                String str = (String) obj3;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                xd0 xd0Var = new xd0(sQLiteQuery);
                zb2 zb2Var = (zb2) ((b42) obj5).OPXfSBeufaJ8;
                int length = zb2Var.dgRBjINgWbAK.length;
                for (int i2 = 1; i2 < length; i2++) {
                    int i3 = zb2Var.dgRBjINgWbAK[i2];
                    if (i3 == 1) {
                        xd0Var.Y1f8riQaR6yg(i2, zb2Var.x50lh2ztY7Y5[i2]);
                    } else if (i3 == 2) {
                        xd0Var.QrzZRwfaDlRX(zb2Var.cpQdD2nAriOS[i2], i2);
                    } else if (i3 == 3) {
                        String str2 = zb2Var.r3s1LDPKFs1S[i2];
                        str2.getClass();
                        xd0Var.ozEBbv0hFTAB(str2, i2);
                    } else if (i3 == 4) {
                        byte[] bArr = zb2Var.QrzZRwfaDlRX[i2];
                        bArr.getClass();
                        xd0Var.BjEWd04qc7Mw(i2, bArr);
                    } else if (i3 == 5) {
                        xd0Var.BRwzKIf41E4i(i2);
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                on onVar = (on) obj5;
                qx0 qx0Var = (qx0) obj;
                ((Integer) obj2).getClass();
                hp hpVar = (hp) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((tf0) hpVar).a92UlCVFR9N8(qx0Var) ? 4 : 2;
                }
                tf0 tf0Var = (tf0) hpVar;
                if (tf0Var.Pf0ThKz3j5YS(intValue & 1, (intValue & 131) != 130)) {
                    gg1 gg1Var = mp.PxuCJdSBwIXG;
                    onVar.a92UlCVFR9N8(qx0Var, tf0Var, Integer.valueOf(intValue & 14));
                } else {
                    tf0Var.i68hK7ahKtgp();
                }
                return no2.PxuCJdSBwIXG;
        }
    }
}
