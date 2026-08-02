package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eqj implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ eqk a;
    private final AtomicReference b;

    public eqj(eqk eqkVar, View view) {
        this.a = eqkVar;
        this.b = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.b.getAndSet(null);
        if (view == null) {
            return true;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            Handler a = fao.a();
            eqk eqkVar = this.a;
            a.postAtFrontOfQueue(new ect(eqkVar, 13));
            fao.e(new ect(eqkVar, 14));
            return true;
        } catch (RuntimeException unused) {
            return true;
        }
    }
}
