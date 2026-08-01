package a;

import android.content.Intent;
import android.content.IntentSender;
import c.C0098e;
import c.InterfaceC0095b;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f921c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f922d;

    public /* synthetic */ m(Object obj, int i, Object obj2, int i2) {
        this.f919a = i2;
        this.f920b = obj;
        this.f921c = i;
        this.f922d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f919a) {
            case 0:
                n nVar = (n) this.f920b;
                X0.f.e(nVar, "this$0");
                Object obj = ((J0.f) this.f922d).f392a;
                String str = (String) nVar.f1660a.get(Integer.valueOf(this.f921c));
                if (str != null) {
                    C0098e c0098e = (C0098e) nVar.f1664e.get(str);
                    if ((c0098e != null ? c0098e.f1652a : null) != null) {
                        InterfaceC0095b interfaceC0095b = c0098e.f1652a;
                        X0.f.c(interfaceC0095b, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                        if (nVar.f1663d.remove(str)) {
                            interfaceC0095b.a(obj);
                            break;
                        }
                    } else {
                        nVar.f1666g.remove(str);
                        nVar.f1665f.put(str, obj);
                        break;
                    }
                }
                break;
            case 1:
                n nVar2 = (n) this.f920b;
                X0.f.e(nVar2, "this$0");
                IntentSender.SendIntentException sendIntentException = (IntentSender.SendIntentException) this.f922d;
                X0.f.e(sendIntentException, "$e");
                nVar2.a(this.f921c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                break;
            default:
                ((c0.a) this.f920b).f1672b.k(this.f921c, (Serializable) this.f922d);
                break;
        }
    }
}
