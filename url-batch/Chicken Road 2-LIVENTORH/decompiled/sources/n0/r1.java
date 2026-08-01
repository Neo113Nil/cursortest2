package n0;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class r1 extends h.a {

    /* renamed from: k, reason: collision with root package name */
    public final Window f2776k;

    public r1(Window window, l2.f fVar) {
        this.f2776k = window;
    }

    @Override // h.a
    public final void e0(boolean z3) {
        if (!z3) {
            t0(8192);
            return;
        }
        Window window = this.f2776k;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    public final void t0(int i) {
        View decorView = this.f2776k.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
