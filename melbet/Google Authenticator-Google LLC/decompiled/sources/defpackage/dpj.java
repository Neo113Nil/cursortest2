package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dpj implements View.OnAttachStateChangeListener {
    final /* synthetic */ Drawable a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dpk c;

    public dpj(dpk dpkVar, Drawable drawable, boolean z) {
        this.a = drawable;
        this.b = z;
        this.c = dpkVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        fao.c();
        dpk dpkVar = this.c;
        ImageView imageView = (ImageView) dpkVar.a.get();
        if (!dpkVar.e && imageView != null) {
            imageView.setImageDrawable(this.a);
        }
        if (this.b) {
            dpkVar.b();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
