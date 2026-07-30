package m;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import i.DialogInterfaceC0522i;

/* loaded from: classes.dex */
public final class n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, y {

    /* renamed from: d, reason: collision with root package name */
    public F f6434d;

    /* renamed from: e, reason: collision with root package name */
    public DialogInterfaceC0522i f6435e;

    /* renamed from: i, reason: collision with root package name */
    public i f6436i;

    @Override // m.y
    public final void a(m mVar, boolean z7) {
        DialogInterfaceC0522i dialogInterfaceC0522i;
        if ((z7 || mVar == this.f6434d) && (dialogInterfaceC0522i = this.f6435e) != null) {
            dialogInterfaceC0522i.dismiss();
        }
    }

    @Override // m.y
    public final boolean i(m mVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        F f7 = this.f6434d;
        i iVar = this.f6436i;
        if (iVar.f6402n == null) {
            iVar.f6402n = new h(iVar);
        }
        f7.q(iVar.f6402n.getItem(i2), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f6436i.a(this.f6434d, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        F f7 = this.f6434d;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f6435e.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f6435e.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                f7.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return f7.performShortcut(i2, keyEvent, 0);
    }
}
