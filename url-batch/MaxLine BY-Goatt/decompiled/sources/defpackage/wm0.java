package defpackage;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wm0 extends ActionMode.Callback2 {
    public final sf a;

    public wm0(sf sfVar) {
        this.a = sfVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        sf sfVar = this.a;
        sfVar.getClass();
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        mk1 mk1Var = mk1.Copy;
        if (itemId == 0) {
            h40 h40Var = (h40) sfVar.c;
            if (h40Var != null) {
                h40Var.invoke();
            }
        } else if (itemId == 1) {
            h40 h40Var2 = (h40) sfVar.d;
            if (h40Var2 != null) {
                h40Var2.invoke();
            }
        } else if (itemId == 2) {
            h40 h40Var3 = (h40) sfVar.e;
            if (h40Var3 != null) {
                h40Var3.invoke();
            }
        } else if (itemId == 3) {
            h40 h40Var4 = (h40) sfVar.f;
            if (h40Var4 != null) {
                h40Var4.invoke();
            }
        } else if (itemId != 4) {
            return false;
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        sf sfVar = this.a;
        sfVar.getClass();
        if (menu == null) {
            lh.e("onCreateActionMode requires a non-null menu");
            return false;
        }
        if (actionMode == null) {
            lh.e("onCreateActionMode requires a non-null mode");
            return false;
        }
        if (((h40) sfVar.c) != null) {
            sf.a(menu, mk1.Copy);
        }
        if (((h40) sfVar.d) != null) {
            sf.a(menu, mk1.Paste);
        }
        if (((h40) sfVar.e) != null) {
            sf.a(menu, mk1.Cut);
        }
        if (((h40) sfVar.f) == null) {
            return true;
        }
        sf.a(menu, mk1.SelectAll);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        ((u) this.a.a).invoke();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        w72 w72Var = (w72) this.a.b;
        if (rect != null) {
            rect.set((int) w72Var.a, (int) w72Var.b, (int) w72Var.c, (int) w72Var.d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        sf sfVar = this.a;
        sfVar.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        sf.c(menu, mk1.Copy, (h40) sfVar.c);
        sf.c(menu, mk1.Paste, (h40) sfVar.d);
        sf.c(menu, mk1.Cut, (h40) sfVar.e);
        sf.c(menu, mk1.SelectAll, (h40) sfVar.f);
        sf.c(menu, mk1.Autofill, null);
        return true;
    }
}
