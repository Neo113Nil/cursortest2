package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yh implements View.OnApplyWindowInsetsListener {
    zz a = null;
    final /* synthetic */ View b;
    final /* synthetic */ xq c;

    public yh(View view, xq xqVar) {
        this.b = view;
        this.c = xqVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        zz q = zz.q(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            yi.b(windowInsets, this.b);
            if (q.equals(this.a)) {
                return this.c.a(view, q).e();
            }
        }
        this.a = q;
        zz a = this.c.a(view, q);
        if (Build.VERSION.SDK_INT >= 30) {
            return a.e();
        }
        int i = yq.a;
        view.requestApplyInsets();
        return a.e();
    }
}
