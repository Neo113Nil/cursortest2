package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
@sc1("activity")
/* loaded from: classes.dex */
public class kRWHK87H9qm4 extends tc1 {
    public static final vfcx0XMziUg4 Companion = new vfcx0XMziUg4();
    public final Activity TSizfFm2Yiuu;

    public kRWHK87H9qm4(Context context) {
        Object obj;
        context.getClass();
        Iterator it = z32.ngxnMNrpiKat(context, new wnqUPcAvl7HT(1)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.TSizfFm2Yiuu = (Activity) obj;
    }

    @Override // defpackage.tc1
    public final za1 PxuCJdSBwIXG() {
        return new ctD2u3GUHhtA(this);
    }

    @Override // defpackage.tc1
    public final za1 TSizfFm2Yiuu(za1 za1Var) {
        throw new IllegalStateException(("Destination " + ((ctD2u3GUHhtA) za1Var).OPXfSBeufaJ8.lS5Rgt96tfkO + " does not have an Intent set.").toString());
    }

    @Override // defpackage.tc1
    public final boolean a92UlCVFR9N8() {
        Activity activity = this.TSizfFm2Yiuu;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
