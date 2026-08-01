package k;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import g.DialogInterfaceC0107f;

/* loaded from: classes.dex */
public final class n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, x {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC0162E f2786a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC0107f f2787b;

    /* renamed from: c, reason: collision with root package name */
    public i f2788c;

    @Override // k.x
    public final void b(m mVar, boolean z2) {
        DialogInterfaceC0107f dialogInterfaceC0107f;
        if ((z2 || mVar == this.f2786a) && (dialogInterfaceC0107f = this.f2787b) != null) {
            dialogInterfaceC0107f.dismiss();
        }
    }

    @Override // k.x
    public final boolean f(m mVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        i iVar = this.f2788c;
        if (iVar.f2758f == null) {
            iVar.f2758f = new C0170h(iVar);
        }
        this.f2786a.q(iVar.f2758f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f2788c.b(this.f2786a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0162E subMenuC0162E = this.f2786a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2787b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2787b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0162E.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0162E.performShortcut(i, keyEvent, 0);
    }
}
