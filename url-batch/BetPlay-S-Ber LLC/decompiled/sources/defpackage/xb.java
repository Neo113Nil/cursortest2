package defpackage;

import android.content.Intent;
import android.content.IntentSender;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class xb implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ xb(Object obj, int i, Object obj2, int i2) {
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
                yb ybVar = (yb) obj2;
                Object obj3 = ((y1) obj).a;
                String str = (String) ybVar.a.get(Integer.valueOf(i2));
                if (str != null) {
                    e2 e2Var = (e2) ybVar.e.get(str);
                    if ((e2Var != null ? e2Var.a : null) != null) {
                        x1 x1Var = e2Var.a;
                        x1Var.getClass();
                        if (ybVar.d.remove(str)) {
                            x1Var.a(obj3);
                            break;
                        }
                    } else {
                        ybVar.g.remove(str);
                        ybVar.f.put(str, obj3);
                        break;
                    }
                }
                break;
            case 1:
                ((yb) obj2).a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            default:
                ((jf) obj2).b.b(i2, obj);
                break;
        }
    }
}
