package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dkp implements hut {
    private final /* synthetic */ int a;

    public dkp(int i) {
        this.a = i;
    }

    @Override // defpackage.hut
    public final void a(Throwable th) {
        int i = this.a;
        if (i == 0) {
            ((hlk) ((hlk) ((hlk) dlz.a.f()).h(th)).i("com/google/android/libraries/logging/ve/handlers/result/flogger/FloggerResultDaggerModule", "provideEventResultHandler", 24, "FloggerResultDaggerModule.java")).q();
            return;
        }
        if (i == 1) {
            th.getClass();
            ((hkf) ((hkf) dfb.a.f()).h(th).i("com/google/android/libraries/androidatgoogle/privacy/lifecycle/PrivacyScreenProcessObserver$setUserExitedRealtimeMillis$<anonymous>", "onFailure", 98, "PrivacyScreenProcessObserver.kt")).s("Failed to set Privacy Screen 'user exited' timestamp");
            return;
        }
        if (i == 2) {
            Log.w("OneGoogle", "Failed to grant account access to app", th);
            return;
        }
        if (i == 3) {
            if (th instanceof egi) {
                return;
            }
            Log.w("OneGoogle", String.format("Failed to load owner avatar. exception type: %s", th.getClass().getName()));
            return;
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof fui) {
                fui fuiVar = (fui) th2;
                hkf hkfVar = (hkf) ((hkf) ((hkf) fuj.b.f()).h(th)).i("com/google/apps/tiktok/account/data/AccountDataServiceImpl$1", "onFailure", 112, "AccountDataServiceImpl.java");
                boolean z = fuiVar.a;
                igj igjVar = igj.a;
                hkfVar.G(new igk(igjVar, Boolean.valueOf(z)), new igk(igjVar, Long.valueOf(fuiVar.b)), new igk(igjVar, Boolean.valueOf(fuiVar.c)), new igk(igjVar, Long.valueOf(fuiVar.d)), new igk(igjVar, Long.valueOf(fuiVar.e)), new igk(igjVar, Long.valueOf(fuiVar.f)));
                return;
            }
        }
    }

    @Override // defpackage.hut
    public final /* synthetic */ void b(Object obj) {
        int i = this.a;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            return;
        }
        if (i == 2) {
            if (((Boolean) obj).booleanValue()) {
                return;
            }
            Log.e("OneGoogle", "Failed to grant account access to app");
        } else if (i != 3) {
        }
    }
}
