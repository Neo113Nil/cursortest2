package l;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f756q = 0;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        r.a(windowInsets);
    }

    public o(r rVar, WindowInsets windowInsets) {
        super(rVar, windowInsets);
    }

    @Override // l.j, l.p
    public boolean m(int i2) {
        boolean isVisible;
        isVisible = this.f748c.isVisible(q.a(i2));
        return isVisible;
    }

    @Override // l.j, l.p
    public final void d(View view) {
    }
}
