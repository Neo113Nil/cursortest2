package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import g.DialogInterfaceC0103f;

/* renamed from: l.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0170n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0180x {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC0156E f2837a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC0103f f2838b;

    /* renamed from: c, reason: collision with root package name */
    public C0165i f2839c;

    @Override // l.InterfaceC0180x
    public final void b(MenuC0169m menuC0169m, boolean z2) {
        DialogInterfaceC0103f dialogInterfaceC0103f;
        if ((z2 || menuC0169m == this.f2837a) && (dialogInterfaceC0103f = this.f2838b) != null) {
            dialogInterfaceC0103f.dismiss();
        }
    }

    @Override // l.InterfaceC0180x
    public final boolean j(MenuC0169m menuC0169m) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0165i c0165i = this.f2839c;
        if (c0165i.f2808f == null) {
            c0165i.f2808f = new C0164h(c0165i);
        }
        this.f2837a.q(c0165i.f2808f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f2839c.b(this.f2837a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0156E subMenuC0156E = this.f2837a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2838b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2838b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0156E.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0156E.performShortcut(i, keyEvent, 0);
    }
}
