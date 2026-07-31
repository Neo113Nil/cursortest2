package y;

import android.view.View;
import android.view.Window;
import androidx.datastore.preferences.protobuf.k0;

/* loaded from: classes.dex */
public class S extends k0 {

    /* renamed from: e, reason: collision with root package name */
    public final Window f3131e;

    public S(Window window) {
        this.f3131e = window;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final void E(boolean z2) {
        Window window = this.f3131e;
        if (!z2) {
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
