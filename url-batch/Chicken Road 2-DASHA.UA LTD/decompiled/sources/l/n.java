package l;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f921q = 0;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        q.a(null, windowInsets);
    }

    public n(q qVar, WindowInsets windowInsets) {
        super(qVar, windowInsets);
    }

    @Override // l.i, l.o
    public boolean m(int i2) {
        boolean isVisible;
        isVisible = this.f912c.isVisible(p.a(i2));
        return isVisible;
    }

    @Override // l.i, l.o
    public final void d(View view) {
    }
}
