package k;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import g.DialogInterfaceC0122f;

/* renamed from: k.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0158n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0168x {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC0144E f2684a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC0122f f2685b;

    /* renamed from: c, reason: collision with root package name */
    public C0153i f2686c;

    @Override // k.InterfaceC0168x
    public final void b(MenuC0157m menuC0157m, boolean z2) {
        DialogInterfaceC0122f dialogInterfaceC0122f;
        if ((z2 || menuC0157m == this.f2684a) && (dialogInterfaceC0122f = this.f2685b) != null) {
            dialogInterfaceC0122f.dismiss();
        }
    }

    @Override // k.InterfaceC0168x
    public final boolean c(MenuC0157m menuC0157m) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0153i c0153i = this.f2686c;
        if (c0153i.f2656f == null) {
            c0153i.f2656f = new C0152h(c0153i);
        }
        this.f2684a.q(c0153i.f2656f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f2686c.b(this.f2684a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0144E subMenuC0144E = this.f2684a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2685b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2685b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0144E.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0144E.performShortcut(i, keyEvent, 0);
    }
}
