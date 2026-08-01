package k;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import g.DialogInterfaceC0123f;

/* renamed from: k.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0159n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0169x {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC0145E f2690a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC0123f f2691b;

    /* renamed from: c, reason: collision with root package name */
    public C0154i f2692c;

    @Override // k.InterfaceC0169x
    public final void b(MenuC0158m menuC0158m, boolean z2) {
        DialogInterfaceC0123f dialogInterfaceC0123f;
        if ((z2 || menuC0158m == this.f2690a) && (dialogInterfaceC0123f = this.f2691b) != null) {
            dialogInterfaceC0123f.dismiss();
        }
    }

    @Override // k.InterfaceC0169x
    public final boolean f(MenuC0158m menuC0158m) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0154i c0154i = this.f2692c;
        if (c0154i.f2662f == null) {
            c0154i.f2662f = new C0153h(c0154i);
        }
        this.f2690a.q(c0154i.f2662f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f2692c.b(this.f2690a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0145E subMenuC0145E = this.f2690a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2691b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2691b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0145E.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0145E.performShortcut(i, keyEvent, 0);
    }
}
