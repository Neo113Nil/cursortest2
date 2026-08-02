package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fph implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final WeakReference a;
    private final WeakReference b;

    public fph(fpk fpkVar, View view) {
        this.b = new WeakReference(fpkVar);
        this.a = new WeakReference(view);
    }

    private final boolean b() {
        if (this.b.get() != null) {
            return false;
        }
        a();
        return true;
    }

    final void a() {
        WeakReference weakReference = this.a;
        if (weakReference.get() != null) {
            ((View) weakReference.get()).removeOnAttachStateChangeListener(this);
            fik.h((View) weakReference.get(), this);
        }
        weakReference.clear();
        this.b.clear();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (b()) {
            return;
        }
        fpk fpkVar = (fpk) this.b.get();
        String str = fpk.b;
        boolean z = fpkVar.l;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (b()) {
            return;
        }
        fik.f(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (b()) {
            return;
        }
        fik.h(view, this);
    }
}
