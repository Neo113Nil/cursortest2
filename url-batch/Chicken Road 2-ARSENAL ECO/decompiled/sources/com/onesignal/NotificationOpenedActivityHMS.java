package com.onesignal;

import L1.d;
import T1.g;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.common.threading.a;
import com.onesignal.common.threading.b;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class NotificationOpenedActivityHMS extends Activity implements g {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.INSTANCE.prewarm();
        b.suspendifyOnDefault(new d(this, null));
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        i.e(intent, "intent");
        super.onNewIntent(intent);
        a.INSTANCE.prewarm();
        b.suspendifyOnDefault(new d(this, null));
    }
}
