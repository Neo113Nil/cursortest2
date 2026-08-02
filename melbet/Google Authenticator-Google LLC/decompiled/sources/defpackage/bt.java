package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bt extends ok {
    @Override // defpackage.ok
    public final /* synthetic */ Object a(int i, Intent intent) {
        return new oa(i, intent);
    }

    @Override // defpackage.ok
    public final /* bridge */ /* synthetic */ Intent b(Object obj) {
        Bundle bundleExtra;
        oj ojVar = (oj) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = ojVar.b;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                ojVar = new oj(ojVar.a, null, ojVar.c, ojVar.d);
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", ojVar);
        if (by.U(2)) {
            intent.toString();
        }
        return intent;
    }
}
