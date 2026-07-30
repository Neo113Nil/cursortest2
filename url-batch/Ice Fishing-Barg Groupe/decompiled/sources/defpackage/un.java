package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class un implements se0 {
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ un(int i) {
        this.rtx2ld2ELZv4 = i;
    }

    @Override // defpackage.se0
    public final Object x50lh2ztY7Y5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        int i3 = this.rtx2ld2ELZv4;
        no2 no2Var = no2.PxuCJdSBwIXG;
        switch (i3) {
            case 0:
                df2 df2Var = (df2) obj;
                qe2 qe2Var = (qe2) obj2;
                ae0 ae0Var = (ae0) obj3;
                hp hpVar = (hp) obj4;
                int intValue = ((Integer) obj5).intValue();
                if ((intValue & 6) == 0) {
                    i = intValue | ((intValue & 8) == 0 ? ((tf0) hpVar).a92UlCVFR9N8(df2Var) : ((tf0) hpVar).rtx2ld2ELZv4(df2Var) ? 4 : 2);
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= (intValue & 64) == 0 ? ((tf0) hpVar).a92UlCVFR9N8(qe2Var) : ((tf0) hpVar).rtx2ld2ELZv4(qe2Var) ? 32 : 16;
                }
                if ((intValue & 384) == 0) {
                    i |= ((tf0) hpVar).rtx2ld2ELZv4(ae0Var) ? 256 : 128;
                }
                tf0 tf0Var = (tf0) hpVar;
                if (!tf0Var.Pf0ThKz3j5YS(i & 1, (i & 1171) != 1170)) {
                    tf0Var.i68hK7ahKtgp();
                    break;
                } else {
                    gg1 gg1Var = mp.PxuCJdSBwIXG;
                    hx.TSizfFm2Yiuu(df2Var, qe2Var, ae0Var, tf0Var, i & 1022);
                    break;
                }
            case 1:
                df2 df2Var2 = (df2) obj;
                qe2 qe2Var2 = (qe2) obj2;
                ae0 ae0Var2 = (ae0) obj3;
                hp hpVar2 = (hp) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                if ((intValue2 & 6) == 0) {
                    i2 = intValue2 | ((intValue2 & 8) == 0 ? ((tf0) hpVar2).a92UlCVFR9N8(df2Var2) : ((tf0) hpVar2).rtx2ld2ELZv4(df2Var2) ? 4 : 2);
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= (intValue2 & 64) == 0 ? ((tf0) hpVar2).a92UlCVFR9N8(qe2Var2) : ((tf0) hpVar2).rtx2ld2ELZv4(qe2Var2) ? 32 : 16;
                }
                if ((intValue2 & 384) == 0) {
                    i2 |= ((tf0) hpVar2).rtx2ld2ELZv4(ae0Var2) ? 256 : 128;
                }
                tf0 tf0Var2 = (tf0) hpVar2;
                if (!tf0Var2.Pf0ThKz3j5YS(i2 & 1, (i2 & 1171) != 1170)) {
                    tf0Var2.i68hK7ahKtgp();
                    break;
                } else {
                    gg1 gg1Var2 = mp.PxuCJdSBwIXG;
                    hx.TSizfFm2Yiuu(df2Var2, qe2Var2, ae0Var2, tf0Var2, i2 & 1022);
                    break;
                }
            default:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                long j = ((vi2) obj5).PxuCJdSBwIXG;
                String obj6 = ((CharSequence) obj4).subSequence(vi2.a92UlCVFR9N8(j), vi2.e9gEMXR7LXtO(j)).toString();
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", booleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = putExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", obj6);
                ((Context) obj).startActivity(className);
                break;
        }
        return no2Var;
    }
}
