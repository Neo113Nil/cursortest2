package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.j;

/* loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: a, reason: collision with root package name */
    private e f10392a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.appcompat.app.c f10393b;

    /* renamed from: c, reason: collision with root package name */
    c f10394c;

    /* renamed from: d, reason: collision with root package name */
    private j.a f10395d;

    public f(e eVar) {
        this.f10392a = eVar;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void a(e eVar, boolean z4) {
        if (z4 || eVar == this.f10392a) {
            c();
        }
        j.a aVar = this.f10395d;
        if (aVar != null) {
            aVar.a(eVar, z4);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean b(e eVar) {
        j.a aVar = this.f10395d;
        if (aVar != null) {
            return aVar.b(eVar);
        }
        return false;
    }

    public void c() {
        androidx.appcompat.app.c cVar = this.f10393b;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        e eVar = this.f10392a;
        c.a aVar = new c.a(eVar.getContext());
        c cVar = new c(aVar.getContext(), e.g.f36331j);
        this.f10394c = cVar;
        cVar.f(this);
        this.f10392a.addMenuPresenter(this.f10394c);
        aVar.b(this.f10394c.i(), this);
        View headerView = eVar.getHeaderView();
        if (headerView != null) {
            aVar.c(headerView);
        } else {
            aVar.d(eVar.getHeaderIcon()).l(eVar.getHeaderTitle());
        }
        aVar.i(this);
        androidx.appcompat.app.c a4 = aVar.a();
        this.f10393b = a4;
        a4.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f10393b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f10393b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i4) {
        this.f10392a.performItemAction((g) this.f10394c.i().getItem(i4), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f10394c.a(this.f10392a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i4 == 82 || i4 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f10393b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f10393b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f10392a.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f10392a.performShortcut(i4, keyEvent, 0);
    }
}
