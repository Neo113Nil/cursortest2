package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class nw implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, cx {
    public p70 f;
    public m2 g;
    public gt h;

    @Override // defpackage.cx
    public final void a(mw mwVar, boolean z) {
        m2 m2Var;
        if ((z || mwVar == this.f) && (m2Var = this.g) != null) {
            m2Var.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        p70 p70Var = this.f;
        gt gtVar = this.h;
        if (gtVar.k == null) {
            gtVar.k = new ft(gtVar);
        }
        p70Var.q(gtVar.k.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.h.a(this.f, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        p70 p70Var = this.f;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.g.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.g.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                p70Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return p70Var.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.cx
    public final boolean w(mw mwVar) {
        return false;
    }
}
