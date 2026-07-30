package defpackage;

import android.content.Intent;
import android.content.IntentSender;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ux implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;

    public /* synthetic */ ux(int i, int i2, Object obj, Object obj2) {
        this.m = i2;
        this.n = obj;
        this.o = i;
        this.p = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        Object obj = this.p;
        int i2 = this.o;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                vx vxVar = (vx) obj2;
                Object obj3 = ((v3) obj).a;
                String str = (String) vxVar.a.get(Integer.valueOf(i2));
                if (str != null) {
                    f4 f4Var = (f4) vxVar.e.get(str);
                    if ((f4Var != null ? f4Var.a : null) != null) {
                        u3 u3Var = f4Var.a;
                        u3Var.getClass();
                        if (vxVar.d.remove(str)) {
                            u3Var.a(obj3);
                            break;
                        }
                    } else {
                        vxVar.g.remove(str);
                        vxVar.f.put(str, obj3);
                        break;
                    }
                }
                break;
            case 1:
                ((vx) obj2).a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            default:
                ((ma0) obj2).b.e(i2, obj);
                break;
        }
    }
}
