package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.support.v4.view.PointerIconCompat;
import android.support.v7.app.b;
import android.support.v7.appcompat.R;
import android.support.v7.view.menu.l;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* compiled from: MenuDialogHelper.java */
/* loaded from: classes.dex */
class g implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, l.a {

    /* renamed from: a, reason: collision with root package name */
    e f1781a;

    /* renamed from: b, reason: collision with root package name */
    private MenuBuilder f1782b;

    /* renamed from: c, reason: collision with root package name */
    private android.support.v7.app.b f1783c;

    /* renamed from: d, reason: collision with root package name */
    private l.a f1784d;

    public g(MenuBuilder menuBuilder) {
        this.f1782b = menuBuilder;
    }

    public void a(IBinder iBinder) {
        MenuBuilder menuBuilder = this.f1782b;
        b.a aVar = new b.a(menuBuilder.e());
        this.f1781a = new e(aVar.a(), R.layout.abc_list_menu_item_layout);
        this.f1781a.setCallback(this);
        this.f1782b.a(this.f1781a);
        aVar.a(this.f1781a.a(), this);
        View o = menuBuilder.o();
        if (o != null) {
            aVar.a(o);
        } else {
            aVar.a(menuBuilder.n()).a(menuBuilder.m());
        }
        aVar.a(this);
        this.f1783c = aVar.b();
        this.f1783c.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1783c.getWindow().getAttributes();
        attributes.type = PointerIconCompat.TYPE_HELP;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1783c.show();
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1783c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1783c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1782b.a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1782b.performShortcut(i, keyEvent, 0);
    }

    public void a() {
        if (this.f1783c != null) {
            this.f1783c.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1781a.onCloseMenu(this.f1782b, true);
    }

    @Override // android.support.v7.view.menu.l.a
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (z || menuBuilder == this.f1782b) {
            a();
        }
        if (this.f1784d != null) {
            this.f1784d.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // android.support.v7.view.menu.l.a
    public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
        if (this.f1784d != null) {
            return this.f1784d.onOpenSubMenu(menuBuilder);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1782b.a((MenuItemImpl) this.f1781a.a().getItem(i), 0);
    }
}
