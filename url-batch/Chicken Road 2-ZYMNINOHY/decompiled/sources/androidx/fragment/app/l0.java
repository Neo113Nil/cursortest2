package androidx.fragment.app;

import E.AbstractC0024z;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class l0 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f4910a;

    public l0(View view) {
        this.f4910a = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.f4910a;
        view2.removeOnAttachStateChangeListener(this);
        Field field = E.H.f375a;
        AbstractC0024z.c(view2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
