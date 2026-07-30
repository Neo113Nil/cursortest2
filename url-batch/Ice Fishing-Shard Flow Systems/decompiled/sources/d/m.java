package d;

import a.AbstractC0169a;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import c1.C0290c;
import f.AbstractC0391j;
import f.C0392k;
import g.AbstractC0407a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends AbstractC0391j {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f4587h;

    public m(o oVar) {
        this.f4587h = oVar;
    }

    @Override // f.AbstractC0391j
    public final void b(int i2, AbstractC0407a contract, Object obj) {
        Bundle bundle;
        int i5;
        Intrinsics.checkNotNullParameter(contract, "contract");
        o oVar = this.f4587h;
        C0290c b7 = contract.b(oVar, obj);
        if (b7 != null) {
            new Handler(Looper.getMainLooper()).post(new l(i2, 0, this, b7));
            return;
        }
        Intent a7 = contract.a(oVar, obj);
        if (a7.getExtras() != null) {
            Bundle extras = a7.getExtras();
            Intrinsics.b(extras);
            if (extras.getClassLoader() == null) {
                a7.setExtrasClassLoader(oVar.getClassLoader());
            }
        }
        if (a7.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = a7.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a7.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a7.getAction())) {
            String[] stringArrayExtra = a7.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC0169a.B(oVar, stringArrayExtra, i2);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a7.getAction())) {
            oVar.startActivityForResult(a7, i2, bundle2);
            return;
        }
        C0392k c0392k = (C0392k) a7.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            Intrinsics.b(c0392k);
            i5 = i2;
        } catch (IntentSender.SendIntentException e7) {
            e = e7;
            i5 = i2;
        }
        try {
            oVar.startIntentSenderForResult(c0392k.f4758d, i5, c0392k.f4759e, c0392k.f4760i, c0392k.f4761l, 0, bundle2);
        } catch (IntentSender.SendIntentException e8) {
            e = e8;
            new Handler(Looper.getMainLooper()).post(new l(i5, 1, this, e));
        }
    }
}
