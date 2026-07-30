package defpackage;

import android.widget.FrameLayout;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class io1 implements Runnable {
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ x80 e;
    public final /* synthetic */ ao0 g;
    public final /* synthetic */ ao0 h;

    public io1(FrameLayout frameLayout, x80 x80Var, ao0 ao0Var, ao0 ao0Var2) {
        this.d = frameLayout;
        this.e = x80Var;
        this.g = ao0Var;
        this.h = ao0Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = ln1.a;
        fn1.a(this.d);
        ao0 ao0Var = this.g;
        if (StringsKt.n((String) ao0Var.getValue())) {
            return;
        }
        this.h.setValue((String) ao0Var.getValue());
        this.e.loadUrl((String) ao0Var.getValue());
    }
}
