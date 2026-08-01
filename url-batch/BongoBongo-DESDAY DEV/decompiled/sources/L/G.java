package L;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class G implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public z0 f483a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f484b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f485c;

    public G(View view, r rVar) {
        this.f484b = view;
        this.f485c = rVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        z0 g2 = z0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        r rVar = this.f485c;
        if (i < 30) {
            H.a(windowInsets, this.f484b);
            if (g2.equals(this.f483a)) {
                return rVar.d(view, g2).f();
            }
        }
        this.f483a = g2;
        z0 d = rVar.d(view, g2);
        if (i >= 30) {
            return d.f();
        }
        WeakHashMap weakHashMap = T.f490a;
        F.c(view);
        return d.f();
    }
}
