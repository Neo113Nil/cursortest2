package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import b5.n;
import hc.b;
import ld.a;
import v9.c;
import wd.b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class NotificationOpenedActivityHMS extends Activity {
    public final void a() {
        Intent intent = getIntent();
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        if (c.b(applicationContext)) {
            b0 b0Var = new b0();
            b0Var.f10141d = c.a().getService(b.class);
            com.onesignal.common.threading.b.suspendifyBlocking(new n(b0Var, this, intent, (a) null));
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        a();
    }
}
