package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class ut2 extends th0 {
    public final WindowInsetsController TSizfFm2Yiuu;
    public final Window Y1f8riQaR6yg;

    public ut2(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.TSizfFm2Yiuu = insetsController;
        this.Y1f8riQaR6yg = window;
    }

    @Override // defpackage.th0
    public void EpkonXwzFgDB(boolean z) {
        POWyO8hTM6YC(8192, 8, z);
    }

    @Override // defpackage.th0
    public void J54yh1s3n4Aq(boolean z) {
        POWyO8hTM6YC(16, 16, z);
    }

    public final void POWyO8hTM6YC(int i, int i2, boolean z) {
        Window window = this.Y1f8riQaR6yg;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.TSizfFm2Yiuu;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }
}
