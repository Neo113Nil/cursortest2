package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class v80 implements View.OnApplyWindowInsetsListener {
    public ac0 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ dw c;

    public v80(View view, dw dwVar) {
        this.b = view;
        this.c = dwVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ac0 g = ac0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        dw dwVar = this.c;
        if (i < 30) {
            w80.a(windowInsets, this.b);
            if (g.equals(this.a)) {
                return dwVar.onApplyWindowInsets(view, g).f();
            }
        }
        this.a = g;
        ac0 onApplyWindowInsets = dwVar.onApplyWindowInsets(view, g);
        if (i >= 30) {
            return onApplyWindowInsets.f();
        }
        WeakHashMap weakHashMap = e90.a;
        view.requestApplyInsets();
        return onApplyWindowInsets.f();
    }
}
