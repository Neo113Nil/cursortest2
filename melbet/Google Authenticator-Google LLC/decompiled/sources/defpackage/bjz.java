package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bjz implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ View a;
    public final /* synthetic */ bka b;

    public bjz(bka bkaVar, View view) {
        this.a = view;
        this.b = bkaVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        bmi.g(new ajx(this, this.a, (ViewTreeObserver.OnDrawListener) this, 8));
    }
}
