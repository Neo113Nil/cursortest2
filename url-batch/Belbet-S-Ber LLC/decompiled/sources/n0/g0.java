package n0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public v1 f2781a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2782b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f2783c;

    public g0(View view, p pVar) {
        this.f2782b = view;
        this.f2783c = pVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        v1 g3 = v1.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        p pVar = this.f2783c;
        if (i < 30) {
            h0.a(windowInsets, this.f2782b);
            if (g3.equals(this.f2781a)) {
                return pVar.l(view, g3).f();
            }
        }
        this.f2781a = g3;
        v1 l4 = pVar.l(view, g3);
        if (i >= 30) {
            return l4.f();
        }
        WeakHashMap weakHashMap = p0.f2816a;
        view.requestApplyInsets();
        return l4.f();
    }
}
