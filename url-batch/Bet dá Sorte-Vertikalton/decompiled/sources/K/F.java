package K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class F implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public w0 f344a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f345b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f346c;

    public F(View view, r rVar) {
        this.f345b = view;
        this.f346c = rVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        w0 g2 = w0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        r rVar = this.f346c;
        if (i < 30) {
            G.a(windowInsets, this.f345b);
            if (g2.equals(this.f344a)) {
                return rVar.a(view, g2).f();
            }
        }
        this.f344a = g2;
        w0 a2 = rVar.a(view, g2);
        if (i >= 30) {
            return a2.f();
        }
        WeakHashMap weakHashMap = S.f351a;
        E.c(view);
        return a2.f();
    }
}
