package b;

import android.content.Intent;
import android.content.IntentSender;
import java.io.Serializable;
import v1.C1159a;

/* renamed from: b.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0316l implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5301f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Serializable f5302g;

    public /* synthetic */ RunnableC0316l(Object obj, int i3, Serializable serializable, int i4) {
        this.f5299d = i4;
        this.f5301f = obj;
        this.f5300e = i3;
        this.f5302g = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5299d) {
            case 0:
                C0317m c0317m = (C0317m) this.f5301f;
                f2.j.f(c0317m, "this$0");
                IntentSender.SendIntentException sendIntentException = (IntentSender.SendIntentException) this.f5302g;
                f2.j.f(sendIntentException, "$e");
                c0317m.a(this.f5300e, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                break;
            default:
                ((C1159a) this.f5301f).f9744b.c(this.f5300e, this.f5302g);
                break;
        }
    }
}
