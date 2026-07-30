package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class w43 implements View.OnApplyWindowInsetsListener {
    public c83 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ iu1 c;

    public w43(View view, iu1 iu1Var) {
        this.b = view;
        this.c = iu1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        c83 c = c83.c(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        iu1 iu1Var = this.c;
        if (i < 30) {
            x43.a(windowInsets, this.b);
            if (c.equals(this.a)) {
                return iu1Var.a(view, c).b();
            }
        }
        this.a = c;
        c83 a = iu1Var.a(view, c);
        if (i >= 30) {
            return a.b();
        }
        WeakHashMap weakHashMap = e53.a;
        view.requestApplyInsets();
        return a.b();
    }
}
