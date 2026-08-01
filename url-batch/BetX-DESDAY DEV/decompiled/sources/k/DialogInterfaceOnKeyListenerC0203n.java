package k;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import g.DialogInterfaceC0156h;

/* renamed from: k.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0203n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0213x {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC0189E f3083a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC0156h f3084b;

    /* renamed from: c, reason: collision with root package name */
    public C0198i f3085c;

    @Override // k.InterfaceC0213x
    public final void b(MenuC0202m menuC0202m, boolean z2) {
        DialogInterfaceC0156h dialogInterfaceC0156h;
        if ((z2 || menuC0202m == this.f3083a) && (dialogInterfaceC0156h = this.f3084b) != null) {
            dialogInterfaceC0156h.dismiss();
        }
    }

    @Override // k.InterfaceC0213x
    public final boolean g(MenuC0202m menuC0202m) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0198i c0198i = this.f3085c;
        if (c0198i.f3053f == null) {
            c0198i.f3053f = new C0197h(c0198i);
        }
        this.f3083a.q(c0198i.f3053f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f3085c.b(this.f3083a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0189E subMenuC0189E = this.f3083a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f3084b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f3084b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0189E.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0189E.performShortcut(i, keyEvent, 0);
    }
}
