package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qr0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int m = 1;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public qr0(rr0 rr0Var, is0 is0Var) {
        this.o = rr0Var;
        this.n = is0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.m) {
            case 0:
                is0 is0Var = (is0) this.n;
                fr0 fr0Var = is0Var.c;
                is0Var.j();
                d90.h((ViewGroup) fr0Var.mView.getParent(), ((rr0) this.o).m.E()).g();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.m) {
            case 0:
                break;
            default:
                ((View) this.n).removeOnAttachStateChangeListener(this);
                ((r72) this.o).s();
                break;
        }
    }

    public qr0(View view, r72 r72Var) {
        this.n = view;
        this.o = r72Var;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
