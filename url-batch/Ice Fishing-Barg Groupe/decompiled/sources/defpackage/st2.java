package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class st2 extends th0 {
    public final Window TSizfFm2Yiuu;

    public st2(Window window) {
        this.TSizfFm2Yiuu = window;
    }

    @Override // defpackage.th0
    public final void EpkonXwzFgDB(boolean z) {
        Window window = this.TSizfFm2Yiuu;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
