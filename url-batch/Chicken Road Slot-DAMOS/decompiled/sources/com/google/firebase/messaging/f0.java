package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f0 extends Binder {

    /* renamed from: d, reason: collision with root package name */
    public final d9.c f3134d;

    public f0(d9.c cVar) {
        this.f3134d = cVar;
    }

    public final void a(g0 g0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        g.access$000((g) this.f3134d.f3701e, g0Var.f3135a).b(new n.a(1), new b1.h(4, g0Var));
    }
}
