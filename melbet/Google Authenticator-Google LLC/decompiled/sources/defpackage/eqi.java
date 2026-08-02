package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eqi implements ViewTreeObserver.OnDrawListener {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ eqk a;
    private final AtomicReference c;

    public eqi(eqk eqkVar, View view) {
        this.a = eqkVar;
        this.c = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        byte[] bArr = null;
        View view = (View) this.c.getAndSet(null);
        if (view != null) {
            try {
                Handler a = fao.a();
                eqk eqkVar = this.a;
                a.postAtFrontOfQueue(new ect(eqkVar, 11));
                fao.e(new ect(eqkVar, 12));
                fao.e(new drn(this, view, 19, bArr));
            } catch (RuntimeException unused) {
            }
        }
    }
}
