package w0;

import N2.g;
import a0.C0239d;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import e2.InterfaceC0422a;
import f2.j;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1173a extends ActionMode.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final g f9840a;

    public C1173a(g gVar) {
        this.f9840a = gVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        g gVar = this.f9840a;
        gVar.getClass();
        j.c(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            InterfaceC0422a interfaceC0422a = (InterfaceC0422a) gVar.f3613c;
            if (interfaceC0422a != null) {
                interfaceC0422a.b();
            }
        } else if (itemId == 1) {
            InterfaceC0422a interfaceC0422a2 = (InterfaceC0422a) gVar.f3614d;
            if (interfaceC0422a2 != null) {
                interfaceC0422a2.b();
            }
        } else if (itemId == 2) {
            InterfaceC0422a interfaceC0422a3 = (InterfaceC0422a) gVar.f3615e;
            if (interfaceC0422a3 != null) {
                interfaceC0422a3.b();
            }
        } else {
            if (itemId != 3) {
                return false;
            }
            InterfaceC0422a interfaceC0422a4 = (InterfaceC0422a) gVar.f3616f;
            if (interfaceC0422a4 != null) {
                interfaceC0422a4.b();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        g gVar = this.f9840a;
        gVar.getClass();
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (((InterfaceC0422a) gVar.f3613c) != null) {
            g.a(1, menu);
        }
        if (((InterfaceC0422a) gVar.f3614d) != null) {
            g.a(2, menu);
        }
        if (((InterfaceC0422a) gVar.f3615e) != null) {
            g.a(3, menu);
        }
        if (((InterfaceC0422a) gVar.f3616f) != null) {
            g.a(4, menu);
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        InterfaceC0422a interfaceC0422a = (InterfaceC0422a) this.f9840a.f3611a;
        if (interfaceC0422a != null) {
            interfaceC0422a.b();
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C0239d c0239d = (C0239d) this.f9840a.f3612b;
        if (rect != null) {
            rect.set((int) c0239d.f4724a, (int) c0239d.f4725b, (int) c0239d.f4726c, (int) c0239d.f4727d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        g gVar = this.f9840a;
        gVar.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        g.b(menu, 1, (InterfaceC0422a) gVar.f3613c);
        g.b(menu, 2, (InterfaceC0422a) gVar.f3614d);
        g.b(menu, 3, (InterfaceC0422a) gVar.f3615e);
        g.b(menu, 4, (InterfaceC0422a) gVar.f3616f);
        return true;
    }
}
