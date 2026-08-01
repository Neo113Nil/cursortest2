package k;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import g.DialogInterfaceC0103f;

/* renamed from: k.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0165n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0175x {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC0151E f2706a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC0103f f2707b;

    /* renamed from: c, reason: collision with root package name */
    public C0160i f2708c;

    @Override // k.InterfaceC0175x
    public final void b(MenuC0164m menuC0164m, boolean z2) {
        DialogInterfaceC0103f dialogInterfaceC0103f;
        if ((z2 || menuC0164m == this.f2706a) && (dialogInterfaceC0103f = this.f2707b) != null) {
            dialogInterfaceC0103f.dismiss();
        }
    }

    @Override // k.InterfaceC0175x
    public final boolean f(MenuC0164m menuC0164m) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0160i c0160i = this.f2708c;
        if (c0160i.f2678f == null) {
            c0160i.f2678f = new C0159h(c0160i);
        }
        this.f2706a.q(c0160i.f2678f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f2708c.b(this.f2706a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0151E subMenuC0151E = this.f2706a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2707b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2707b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0151E.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0151E.performShortcut(i, keyEvent, 0);
    }
}
