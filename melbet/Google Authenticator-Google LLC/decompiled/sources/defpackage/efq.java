package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class efq implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ekx a;
    private final dja b;

    public efq(ekx ekxVar, View view, int i) {
        this.a = ekxVar;
        this.b = new efp(this, view, i);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [dqy, java.lang.Object] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ?? r2 = this.a.c;
        dja djaVar = this.b;
        r2.e(djaVar);
        if (r2.d()) {
            djaVar.j(r2.a());
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [dqy, java.lang.Object] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.c.f(this.b);
    }
}
