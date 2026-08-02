package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afe extends aee {
    final /* synthetic */ aff a;

    public afe(aff affVar) {
        this.a = affVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        this.a.a.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        this.a.a.b();
    }
}
