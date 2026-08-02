package X1;

import E1.AbstractActivityC0029e;
import android.util.Log;

/* loaded from: classes.dex */
public final class f implements L1.b, M1.a {

    /* renamed from: a, reason: collision with root package name */
    public A0.f f1737a;

    @Override // M1.a
    public final void onAttachedToActivity(M1.b bVar) {
        A0.f fVar = this.f1737a;
        if (fVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            fVar.f25d = (AbstractActivityC0029e) ((F1.c) bVar).f486a;
        }
    }

    @Override // L1.b
    public final void onAttachedToEngine(L1.a aVar) {
        A0.f fVar = new A0.f(aVar.f887a);
        this.f1737a = fVar;
        A0.f.T(aVar.f888b, fVar);
    }

    @Override // M1.a
    public final void onDetachedFromActivity() {
        A0.f fVar = this.f1737a;
        if (fVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            fVar.f25d = null;
        }
    }

    @Override // M1.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // L1.b
    public final void onDetachedFromEngine(L1.a aVar) {
        if (this.f1737a == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
        } else {
            A0.f.T(aVar.f888b, null);
            this.f1737a = null;
        }
    }

    @Override // M1.a
    public final void onReattachedToActivityForConfigChanges(M1.b bVar) {
        onAttachedToActivity(bVar);
    }
}
