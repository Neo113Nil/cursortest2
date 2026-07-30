package defpackage;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class u80 extends ActionMode.Callback2 implements ActionMode.Callback {
    public final g6 PxuCJdSBwIXG;

    public u80(g6 g6Var) {
        this.PxuCJdSBwIXG = g6Var;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.PxuCJdSBwIXG.getClass();
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.PxuCJdSBwIXG.PxuCJdSBwIXG(menu);
        return menu.size() > 0;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.PxuCJdSBwIXG.PxuCJdSBwIXG.close();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        qt1 qt1Var = (qt1) this.PxuCJdSBwIXG.TSizfFm2Yiuu.PxuCJdSBwIXG();
        rect.set(Math.round(qt1Var.PxuCJdSBwIXG), Math.round(qt1Var.lS5Rgt96tfkO), Math.round(qt1Var.TSizfFm2Yiuu), Math.round(qt1Var.Y1f8riQaR6yg));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.PxuCJdSBwIXG.PxuCJdSBwIXG(menu);
    }
}
