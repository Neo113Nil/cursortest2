package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* loaded from: classes.dex */
public final class K extends Binder {

    /* renamed from: e, reason: collision with root package name */
    public final B.f f4470e;

    public K(B.f fVar) {
        this.f4470e = fVar;
    }

    public final void a(L l7) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        AbstractServiceC0319i.access$000((AbstractServiceC0319i) this.f4470e.f152e, l7.f4471a).b(new e0.c(0), new A4.b(7, l7));
    }
}
