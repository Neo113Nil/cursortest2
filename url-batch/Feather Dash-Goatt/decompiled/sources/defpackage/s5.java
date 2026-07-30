package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class s5 implements k50 {
    public final d4 a;
    public final Object b = new Object();
    public boolean c;
    public final q5 d;

    public s5(d4 d4Var) {
        this.a = d4Var;
        q5 q5Var = new q5();
        this.d = q5Var;
        if (d4Var.isAttachedToWindow()) {
            Context context = d4Var.getContext();
            if (!this.c) {
                context.getApplicationContext().registerComponentCallbacks(q5Var);
                this.c = true;
            }
        }
        d4Var.addOnAttachStateChangeListener(new r5(0, this));
    }

    @Override // defpackage.k50
    public final void a(l50 l50Var) {
        synchronized (this.b) {
            if (!l50Var.s) {
                l50Var.s = true;
                l50Var.b();
            }
        }
    }

    @Override // defpackage.k50
    public final l50 b() {
        l50 l50Var;
        synchronized (this.b) {
            this.a.getUniqueDrawingId();
            l50Var = new l50(new p50());
        }
        return l50Var;
    }
}
