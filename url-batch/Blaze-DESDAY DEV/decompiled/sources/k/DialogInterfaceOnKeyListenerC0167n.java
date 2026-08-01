package k;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import g.DialogInterfaceC0105f;

/* renamed from: k.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0167n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0177x {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC0153E f2734a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC0105f f2735b;

    /* renamed from: c, reason: collision with root package name */
    public C0162i f2736c;

    @Override // k.InterfaceC0177x
    public final void b(MenuC0166m menuC0166m, boolean z2) {
        DialogInterfaceC0105f dialogInterfaceC0105f;
        if ((z2 || menuC0166m == this.f2734a) && (dialogInterfaceC0105f = this.f2735b) != null) {
            dialogInterfaceC0105f.dismiss();
        }
    }

    @Override // k.InterfaceC0177x
    public final boolean g(MenuC0166m menuC0166m) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0162i c0162i = this.f2736c;
        if (c0162i.f2706f == null) {
            c0162i.f2706f = new C0161h(c0162i);
        }
        this.f2734a.q(c0162i.f2706f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f2736c.b(this.f2734a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0153E subMenuC0153E = this.f2734a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2735b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2735b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0153E.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0153E.performShortcut(i, keyEvent, 0);
    }
}
