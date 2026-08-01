package K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class G implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public z0 f416a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f418c;

    public G(View view, r rVar) {
        this.f417b = view;
        this.f418c = rVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        z0 g2 = z0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        r rVar = this.f418c;
        if (i < 30) {
            H.a(windowInsets, this.f417b);
            if (g2.equals(this.f416a)) {
                return rVar.c(view, g2).f();
            }
        }
        this.f416a = g2;
        z0 c2 = rVar.c(view, g2);
        if (i >= 30) {
            return c2.f();
        }
        WeakHashMap weakHashMap = T.f423a;
        F.c(view);
        return c2.f();
    }
}
