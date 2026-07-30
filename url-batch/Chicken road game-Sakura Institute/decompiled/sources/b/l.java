package b;

import android.content.Intent;
import android.content.IntentSender;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1175f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1176g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1177h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1178i;

    public /* synthetic */ l(int i7, int i8, Object obj, Object obj2) {
        this.f1175f = i8;
        this.f1176g = obj;
        this.f1177h = i7;
        this.f1178i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1175f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                m mVar = (m) this.f1176g;
                Serializable serializable = (Serializable) ((b6.c) this.f1178i).f1394g;
                String str = (String) mVar.f1183a.get(Integer.valueOf(this.f1177h));
                if (str != null) {
                    e.c cVar = (e.c) mVar.f1187e.get(str);
                    if ((cVar != null ? cVar.f2656a : null) != null) {
                        f4.j jVar = cVar.f2656a;
                        if (mVar.f1186d.remove(str)) {
                            jVar.a(serializable);
                            break;
                        }
                    } else {
                        mVar.f1189g.remove(str);
                        mVar.f1188f.put(str, serializable);
                        break;
                    }
                }
                break;
            case 1:
                m mVar2 = (m) this.f1176g;
                IntentSender.SendIntentException sendIntentException = (IntentSender.SendIntentException) this.f1178i;
                r6.k.f(mVar2, "this$0");
                r6.k.f(sendIntentException, "$e");
                mVar2.a(this.f1177h, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                break;
            default:
                ((v3.a) this.f1176g).f9120b.f(this.f1177h, this.f1178i);
                break;
        }
    }
}
