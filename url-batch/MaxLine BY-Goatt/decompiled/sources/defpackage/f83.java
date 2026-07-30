package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.facebook.internal.Utility;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class f83 extends nk2 {
    public final WindowInsetsController b;
    public final Window c;

    public f83(Window window) {
        this.b = window.getInsetsController();
        this.c = window;
    }

    @Override // defpackage.nk2
    public void m(boolean z) {
        t(16, 16, z);
    }

    @Override // defpackage.nk2
    public void n(boolean z) {
        t(Utility.DEFAULT_STREAM_BUFFER_SIZE, 8, z);
    }

    public final void t(int i, int i2, boolean z) {
        Window window = this.c;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.b;
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
