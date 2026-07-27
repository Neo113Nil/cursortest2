package E;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: E.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0047w implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public b0 f639a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f640b;

    public ViewOnApplyWindowInsetsListenerC0047w(View view, r rVar) {
        this.f640b = view;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        b0 a6 = b0.a(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            AbstractC0048x.a(windowInsets, this.f640b);
            if (a6.equals(this.f639a)) {
                throw null;
            }
        }
        this.f639a = a6;
        throw null;
    }
}
