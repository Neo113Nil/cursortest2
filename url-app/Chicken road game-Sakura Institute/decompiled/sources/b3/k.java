package b3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public t0 f1339a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f1341c;

    public k(View view, f fVar) {
        this.f1340b = view;
        this.f1341c = fVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        t0 b9 = t0.b(view, windowInsets);
        int i7 = Build.VERSION.SDK_INT;
        f fVar = this.f1341c;
        if (i7 < 30) {
            l.a(windowInsets, this.f1340b);
            if (b9.equals(this.f1339a)) {
                return ((q.a0) fVar).a(view, b9).a();
            }
        }
        this.f1339a = b9;
        t0 a3 = ((q.a0) fVar).a(view, b9);
        if (i7 >= 30) {
            return a3.a();
        }
        int i8 = s.f1365a;
        j.c(view);
        return a3.a();
    }
}
