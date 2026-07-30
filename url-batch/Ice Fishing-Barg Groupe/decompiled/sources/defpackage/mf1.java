package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class mf1 extends lc1 {
    public final OnBackInvokedDispatcher TSizfFm2Yiuu;
    public final int Y1f8riQaR6yg;
    public boolean a92UlCVFR9N8;
    public final OnBackInvokedCallback e9gEMXR7LXtO;

    public mf1(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.TSizfFm2Yiuu = onBackInvokedDispatcher;
        this.Y1f8riQaR6yg = i;
        this.e9gEMXR7LXtO = Build.VERSION.SDK_INT == 33 ? new e9(1, this) : new nf1(this);
    }

    @Override // defpackage.lc1
    public final void lS5Rgt96tfkO(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.e9gEMXR7LXtO;
        if (z && !this.a92UlCVFR9N8) {
            this.TSizfFm2Yiuu.registerOnBackInvokedCallback(this.Y1f8riQaR6yg, onBackInvokedCallback);
            this.a92UlCVFR9N8 = true;
        } else {
            if (z || !this.a92UlCVFR9N8) {
                return;
            }
            this.TSizfFm2Yiuu.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.a92UlCVFR9N8 = false;
        }
    }
}
