package k;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import g.DialogInterfaceC0155h;

/* renamed from: k.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0201n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0211x {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC0187E f3079a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC0155h f3080b;

    /* renamed from: c, reason: collision with root package name */
    public C0196i f3081c;

    @Override // k.InterfaceC0211x
    public final void b(MenuC0200m menuC0200m, boolean z2) {
        DialogInterfaceC0155h dialogInterfaceC0155h;
        if ((z2 || menuC0200m == this.f3079a) && (dialogInterfaceC0155h = this.f3080b) != null) {
            dialogInterfaceC0155h.dismiss();
        }
    }

    @Override // k.InterfaceC0211x
    public final boolean f(MenuC0200m menuC0200m) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0196i c0196i = this.f3081c;
        if (c0196i.f3049f == null) {
            c0196i.f3049f = new C0195h(c0196i);
        }
        this.f3079a.q(c0196i.f3049f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f3081c.b(this.f3079a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0187E subMenuC0187E = this.f3079a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f3080b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f3080b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0187E.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0187E.performShortcut(i, keyEvent, 0);
    }
}
