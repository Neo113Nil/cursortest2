package n0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public q1 f2717a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f2719c;

    public c0(View view, n nVar) {
        this.f2718b = view;
        this.f2719c = nVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        q1 g4 = q1.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        n nVar = this.f2719c;
        if (i < 30) {
            d0.a(windowInsets, this.f2718b);
            if (g4.equals(this.f2717a)) {
                return nVar.t(view, g4).f();
            }
        }
        this.f2717a = g4;
        q1 t2 = nVar.t(view, g4);
        if (i >= 30) {
            return t2.f();
        }
        WeakHashMap weakHashMap = l0.f2757a;
        b0.c(view);
        return t2.f();
    }
}
