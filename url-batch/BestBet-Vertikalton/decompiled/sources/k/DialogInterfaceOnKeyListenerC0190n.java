package k;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import g.DialogInterfaceC0125f;

/* renamed from: k.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0190n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0201y {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC0176F f3184a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC0125f f3185b;

    /* renamed from: c, reason: collision with root package name */
    public C0185i f3186c;

    @Override // k.InterfaceC0201y
    public final void b(MenuC0189m menuC0189m, boolean z2) {
        DialogInterfaceC0125f dialogInterfaceC0125f;
        if ((z2 || menuC0189m == this.f3184a) && (dialogInterfaceC0125f = this.f3185b) != null) {
            dialogInterfaceC0125f.dismiss();
        }
    }

    @Override // k.InterfaceC0201y
    public final boolean c(MenuC0189m menuC0189m) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0185i c0185i = this.f3186c;
        if (c0185i.f3156f == null) {
            c0185i.f3156f = new C0184h(c0185i);
        }
        this.f3184a.q(c0185i.f3156f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f3186c.b(this.f3184a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0176F subMenuC0176F = this.f3184a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f3185b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f3185b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0176F.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0176F.performShortcut(i, keyEvent, 0);
    }
}
