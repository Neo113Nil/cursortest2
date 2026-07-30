package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.common.threading.a;
import com.onesignal.common.threading.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n2.C0753d;
import v2.g;

@Metadata
/* loaded from: classes.dex */
public final class NotificationOpenedActivityHMS extends Activity implements g {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        a.INSTANCE.prewarm();
        b.suspendifyOnDefault(new C0753d(this, intent, null));
        finish();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Intent intent2 = getIntent();
        a.INSTANCE.prewarm();
        b.suspendifyOnDefault(new C0753d(this, intent2, null));
        finish();
    }
}
