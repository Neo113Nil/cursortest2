package K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class G implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public z0 f433a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f434b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f435c;

    public G(View view, r rVar) {
        this.f434b = view;
        this.f435c = rVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        z0 g2 = z0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        r rVar = this.f435c;
        if (i < 30) {
            H.a(windowInsets, this.f434b);
            if (g2.equals(this.f433a)) {
                return rVar.a(view, g2).f();
            }
        }
        this.f433a = g2;
        z0 a2 = rVar.a(view, g2);
        if (i >= 30) {
            return a2.f();
        }
        WeakHashMap weakHashMap = T.f440a;
        F.c(view);
        return a2.f();
    }
}
