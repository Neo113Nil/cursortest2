package q3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public l1 f6078a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f6079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f6080c;

    public b0(View view, p pVar) {
        this.f6079b = view;
        this.f6080c = pVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 d8 = l1.d(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        p pVar = this.f6080c;
        if (i < 30) {
            c0.a(windowInsets, this.f6079b);
            if (d8.equals(this.f6078a)) {
                return pVar.k(view, d8).c();
            }
        }
        this.f6078a = d8;
        l1 k3 = pVar.k(view, d8);
        if (i >= 30) {
            return k3.c();
        }
        Field field = k0.f6120a;
        a0.c(view);
        return k3.c();
    }
}
