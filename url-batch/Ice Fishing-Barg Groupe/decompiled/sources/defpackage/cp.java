package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cp implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ dp rtx2ld2ELZv4;

    public cp(dp dpVar) {
        this.rtx2ld2ELZv4 = dpVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.rtx2ld2ELZv4.Y1f8riQaR6yg(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        dp dpVar = this.rtx2ld2ELZv4;
        dpVar.a92UlCVFR9N8.PxuCJdSBwIXG.clear();
        kv1 kv1Var = dpVar.RAsUl2FVSrh6;
        synchronized (kv1Var) {
            kv1Var.PxuCJdSBwIXG.TSizfFm2Yiuu();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        dp dpVar = this.rtx2ld2ELZv4;
        dpVar.a92UlCVFR9N8.PxuCJdSBwIXG.clear();
        kv1 kv1Var = dpVar.RAsUl2FVSrh6;
        synchronized (kv1Var) {
            kv1Var.PxuCJdSBwIXG.TSizfFm2Yiuu();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.rtx2ld2ELZv4.RfyTYNmI9Srp.PxuCJdSBwIXG.setValue(Boolean.valueOf(z));
    }
}
