package z4;

import D6.z;
import android.app.Activity;
import android.util.Log;
import p4.InterfaceC0828a;
import y4.r;

/* loaded from: classes.dex */
public final class f implements o4.c, InterfaceC0828a {

    /* renamed from: d, reason: collision with root package name */
    public r f8724d;

    @Override // p4.InterfaceC0828a
    public final void onAttachedToActivity(p4.b bVar) {
        r rVar = this.f8724d;
        if (rVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            rVar.f8620i = (Activity) ((z) bVar).f640c;
        }
    }

    @Override // o4.c
    public final void onAttachedToEngine(o4.b bVar) {
        r rVar = new r(bVar.f7120a);
        this.f8724d = rVar;
        d dVar = e.f8723k;
        s4.f fVar = bVar.f7122c;
        dVar.getClass();
        d.a(fVar, rVar);
    }

    @Override // p4.InterfaceC0828a
    public final void onDetachedFromActivity() {
        r rVar = this.f8724d;
        if (rVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            rVar.f8620i = null;
        }
    }

    @Override // p4.InterfaceC0828a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // o4.c
    public final void onDetachedFromEngine(o4.b bVar) {
        if (this.f8724d == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        d dVar = e.f8723k;
        s4.f fVar = bVar.f7122c;
        dVar.getClass();
        d.a(fVar, null);
        this.f8724d = null;
    }

    @Override // p4.InterfaceC0828a
    public final void onReattachedToActivityForConfigChanges(p4.b bVar) {
        onAttachedToActivity(bVar);
    }
}
