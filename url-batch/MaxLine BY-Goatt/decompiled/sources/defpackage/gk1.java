package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gk1 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, yk1 {
    public cq2 m;
    public s5 n;
    public qe1 o;

    @Override // defpackage.yk1
    public final void b(fk1 fk1Var, boolean z) {
        s5 s5Var;
        if ((z || fk1Var == this.m) && (s5Var = this.n) != null) {
            s5Var.dismiss();
        }
    }

    @Override // defpackage.yk1
    public final boolean o(fk1 fk1Var) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        cq2 cq2Var = this.m;
        qe1 qe1Var = this.o;
        if (qe1Var.r == null) {
            qe1Var.r = new pe1(qe1Var);
        }
        cq2Var.q(qe1Var.r.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.o.b(this.m, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        cq2 cq2Var = this.m;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.n.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.n.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                cq2Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return cq2Var.performShortcut(i, keyEvent, 0);
    }
}
