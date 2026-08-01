package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import java.io.Serializable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class vd implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ vd(Object obj, int i, Object obj2, int i2) {
        this.f = i2;
        this.g = obj;
        this.h = i;
        this.i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Object obj = this.i;
        int i2 = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                wd wdVar = (wd) obj2;
                Serializable serializable = (Serializable) ((o0) obj).g;
                String str = (String) wdVar.a.get(Integer.valueOf(i2));
                if (str != null) {
                    a2 a2Var = (a2) wdVar.e.get(str);
                    if ((a2Var != null ? a2Var.a : null) != null) {
                        w1 w1Var = a2Var.a;
                        if (wdVar.d.remove(str)) {
                            w1Var.a(serializable);
                            break;
                        }
                    } else {
                        wdVar.g.remove(str);
                        wdVar.f.put(str, serializable);
                        break;
                    }
                }
                break;
            case 1:
                ((wd) obj2).a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            default:
                ((oj) obj2).b.h(i2, obj);
                break;
        }
    }
}
