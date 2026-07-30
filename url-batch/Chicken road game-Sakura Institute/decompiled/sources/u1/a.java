package u1;

import a0.w0;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import e5.v;
import r1.z0;
import r6.k;
import y0.d;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends ActionMode.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final v f8963a;

    public a(v vVar) {
        this.f8963a = vVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        v vVar = this.f8963a;
        vVar.getClass();
        k.c(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            w0 w0Var = (w0) vVar.f2802c;
            if (w0Var != null) {
                w0Var.a();
            }
        } else if (itemId == 1) {
            w0 w0Var2 = (w0) vVar.f2803d;
            if (w0Var2 != null) {
                w0Var2.a();
            }
        } else if (itemId == 2) {
            w0 w0Var3 = (w0) vVar.f2804e;
            if (w0Var3 != null) {
                w0Var3.a();
            }
        } else {
            if (itemId != 3) {
                return false;
            }
            w0 w0Var4 = (w0) vVar.f2805f;
            if (w0Var4 != null) {
                w0Var4.a();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        v vVar = this.f8963a;
        vVar.getClass();
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (((w0) vVar.f2802c) != null) {
            v.i(1, menu);
        }
        if (((w0) vVar.f2803d) != null) {
            v.i(2, menu);
        }
        if (((w0) vVar.f2804e) != null) {
            v.i(3, menu);
        }
        if (((w0) vVar.f2805f) != null) {
            v.i(4, menu);
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        ((z0) this.f8963a.f2800a).a();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        d dVar = (d) this.f8963a.f2801b;
        if (rect != null) {
            rect.set((int) dVar.f9780a, (int) dVar.f9781b, (int) dVar.f9782c, (int) dVar.f9783d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        v vVar = this.f8963a;
        vVar.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        v.j(menu, 1, (w0) vVar.f2802c);
        v.j(menu, 2, (w0) vVar.f2803d);
        v.j(menu, 3, (w0) vVar.f2804e);
        v.j(menu, 4, (w0) vVar.f2805f);
        return true;
    }
}
