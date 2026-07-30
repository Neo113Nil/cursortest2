package defpackage;

import android.view.View;
import android.view.Window;
import com.facebook.internal.Utility;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class d83 extends nk2 {
    public final Window b;

    public d83(Window window) {
        this.b = window;
    }

    @Override // defpackage.nk2
    public final void n(boolean z) {
        Window window = this.b;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | Utility.DEFAULT_STREAM_BUFFER_SIZE);
        }
    }
}
