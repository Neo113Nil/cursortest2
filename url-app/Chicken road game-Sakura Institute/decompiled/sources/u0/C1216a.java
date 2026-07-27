package u0;

import Y.d;
import Z1.v;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1216a extends ActionMode.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final v f10891a;

    public C1216a(v vVar) {
        this.f10891a = vVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        v vVar = this.f10891a;
        vVar.getClass();
        Intrinsics.c(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            Function0 function0 = (Function0) vVar.f4606c;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (itemId == 1) {
            Function0 function02 = (Function0) vVar.f4607d;
            if (function02 != null) {
                function02.invoke();
            }
        } else if (itemId == 2) {
            Function0 function03 = (Function0) vVar.f4608e;
            if (function03 != null) {
                function03.invoke();
            }
        } else {
            if (itemId != 3) {
                return false;
            }
            Function0 function04 = (Function0) vVar.f4609f;
            if (function04 != null) {
                function04.invoke();
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
        v vVar = this.f10891a;
        vVar.getClass();
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (((Function0) vVar.f4606c) != null) {
            v.i(1, menu);
        }
        if (((Function0) vVar.f4607d) != null) {
            v.i(2, menu);
        }
        if (((Function0) vVar.f4608e) != null) {
            v.i(3, menu);
        }
        if (((Function0) vVar.f4609f) != null) {
            v.i(4, menu);
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        Function0 function0 = (Function0) this.f10891a.f4604a;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        d dVar = (d) this.f10891a.f4605b;
        if (rect != null) {
            rect.set((int) dVar.f4374a, (int) dVar.f4375b, (int) dVar.f4376c, (int) dVar.f4377d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        v vVar = this.f10891a;
        vVar.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        v.j(menu, 1, (Function0) vVar.f4606c);
        v.j(menu, 2, (Function0) vVar.f4607d);
        v.j(menu, 3, (Function0) vVar.f4608e);
        v.j(menu, 4, (Function0) vVar.f4609f);
        return true;
    }
}
