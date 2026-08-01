package k;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import g.DialogInterfaceC0129f;

/* renamed from: k.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0161n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0171x {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC0147E f2682a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC0129f f2683b;

    /* renamed from: c, reason: collision with root package name */
    public C0156i f2684c;

    @Override // k.InterfaceC0171x
    public final void b(MenuC0160m menuC0160m, boolean z2) {
        DialogInterfaceC0129f dialogInterfaceC0129f;
        if ((z2 || menuC0160m == this.f2682a) && (dialogInterfaceC0129f = this.f2683b) != null) {
            dialogInterfaceC0129f.dismiss();
        }
    }

    @Override // k.InterfaceC0171x
    public final boolean h(MenuC0160m menuC0160m) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0156i c0156i = this.f2684c;
        if (c0156i.f2654f == null) {
            c0156i.f2654f = new C0155h(c0156i);
        }
        this.f2682a.q(c0156i.f2654f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f2684c.b(this.f2682a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0147E subMenuC0147E = this.f2682a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2683b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2683b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0147E.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0147E.performShortcut(i, keyEvent, 0);
    }
}
