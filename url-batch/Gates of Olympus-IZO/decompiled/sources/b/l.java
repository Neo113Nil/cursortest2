package b;

import android.content.Intent;
import android.content.IntentSender;
import java.io.Serializable;
import s1.C0888a;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4165f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Serializable f4166g;

    public /* synthetic */ l(Object obj, int i3, Serializable serializable, int i4) {
        this.f4163d = i4;
        this.f4165f = obj;
        this.f4164e = i3;
        this.f4166g = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4163d) {
            case 0:
                m mVar = (m) this.f4165f;
                Z1.i.f(mVar, "this$0");
                IntentSender.SendIntentException sendIntentException = (IntentSender.SendIntentException) this.f4166g;
                Z1.i.f(sendIntentException, "$e");
                mVar.a(this.f4164e, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                break;
            default:
                ((C0888a) this.f4165f).f7511b.a(this.f4164e, this.f4166g);
                break;
        }
    }
}
