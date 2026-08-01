package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class o80 implements View.OnApplyWindowInsetsListener {
    public rb0 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ wv c;

    public o80(View view, wv wvVar) {
        this.b = view;
        this.c = wvVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        rb0 g = rb0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        wv wvVar = this.c;
        if (i < 30) {
            p80.a(windowInsets, this.b);
            if (g.equals(this.a)) {
                return wvVar.m(view, g).f();
            }
        }
        this.a = g;
        rb0 m = wvVar.m(view, g);
        if (i >= 30) {
            return m.f();
        }
        WeakHashMap weakHashMap = x80.a;
        view.requestApplyInsets();
        return m.f();
    }
}
