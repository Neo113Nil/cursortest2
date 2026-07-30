package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gn1 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ br0 a;

    public gn1(View view, br0 br0Var) {
        this.a = br0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return this.a.b(view, ip1.c(view, windowInsets)).b();
    }
}
