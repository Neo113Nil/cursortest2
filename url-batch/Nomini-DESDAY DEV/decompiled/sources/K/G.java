package K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class G implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public x0 f374a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f375b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f376c;

    public G(View view, r rVar) {
        this.f375b = view;
        this.f376c = rVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        x0 g2 = x0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        r rVar = this.f376c;
        if (i < 30) {
            H.a(windowInsets, this.f375b);
            if (g2.equals(this.f374a)) {
                return rVar.d(view, g2).f();
            }
        }
        this.f374a = g2;
        x0 d = rVar.d(view, g2);
        if (i >= 30) {
            return d.f();
        }
        WeakHashMap weakHashMap = T.f381a;
        F.c(view);
        return d.f();
    }
}
