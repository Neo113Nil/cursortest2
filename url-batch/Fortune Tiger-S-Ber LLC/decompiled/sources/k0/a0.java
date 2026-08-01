package k0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public m1 f2712a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2713b;
    public final /* synthetic */ m c;

    public a0(View view, m mVar) {
        this.f2713b = view;
        this.c = mVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        m1 g = m1.g(view, windowInsets);
        int i4 = Build.VERSION.SDK_INT;
        m mVar = this.c;
        if (i4 < 30) {
            b0.a(windowInsets, this.f2713b);
            if (g.equals(this.f2712a)) {
                return mVar.d(view, g).f();
            }
        }
        this.f2712a = g;
        m1 d4 = mVar.d(view, g);
        if (i4 >= 30) {
            return d4.f();
        }
        WeakHashMap weakHashMap = j0.f2752a;
        z.c(view);
        return d4.f();
    }
}
