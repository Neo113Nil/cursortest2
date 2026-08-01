package K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class F implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public w0 f355a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f356b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f357c;

    public F(View view, r rVar) {
        this.f356b = view;
        this.f357c = rVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        w0 g2 = w0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        r rVar = this.f357c;
        if (i < 30) {
            G.a(windowInsets, this.f356b);
            if (g2.equals(this.f355a)) {
                return rVar.c(view, g2).f();
            }
        }
        this.f355a = g2;
        w0 c2 = rVar.c(view, g2);
        if (i >= 30) {
            return c2.f();
        }
        WeakHashMap weakHashMap = S.f362a;
        E.c(view);
        return c2.f();
    }
}
