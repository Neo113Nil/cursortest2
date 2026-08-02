package com.squareup.util.android;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.compose.ui.window.Api33Impl;
import com.squareup.cash.ui.PaymentPasscodeActivity$onCreate$$inlined$onCurrentSandbox$1;
import com.squareup.util.cash.Countries;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes8.dex */
public final class ShareResultReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int $r8$clinit = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object parcelableExtra;
        context.getClass();
        intent.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            parcelableExtra = Api33Impl.getParcelableExtra(intent, "android.intent.extra.CHOSEN_COMPONENT", ComponentName.class);
        } else {
            parcelableExtra = intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
            if (!ComponentName.class.isInstance(parcelableExtra)) {
                parcelableExtra = null;
            }
        }
        ContextScope MainScope = JobKt.MainScope();
        Countries.onCurrentSandboxComponentExt(context, MainScope, new PaymentPasscodeActivity$onCreate$$inlined$onCurrentSandbox$1(new ShareResultReceiver$$ExternalSyntheticLambda0(0, (ComponentName) parcelableExtra, intent), MainScope, 2));
        JobKt.cancel(MainScope, (CancellationException) null);
    }
}
