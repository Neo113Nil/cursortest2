package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class e20 extends xk {
    public final int r;
    public final int s;
    public t10 t;
    public u10 u;

    public e20(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.r = 21;
            this.s = 22;
        } else {
            this.r = 22;
            this.s = 21;
        }
    }

    @Override // defpackage.xk, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        o10 o10Var;
        int i;
        int pointToPosition;
        int i2;
        if (this.t != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                o10Var = (o10) headerViewListAdapter.getWrappedAdapter();
            } else {
                o10Var = (o10) adapter;
                i = 0;
            }
            u10 item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= o10Var.getCount()) ? null : o10Var.getItem(i2);
            u10 u10Var = this.u;
            if (u10Var != item) {
                r10 r10Var = o10Var.f;
                if (u10Var != null) {
                    this.t.h(r10Var, u10Var);
                }
                this.u = item;
                if (item != null) {
                    this.t.j(r10Var, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.r) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.s) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (o10) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (o10) adapter).f.c(false);
        return true;
    }

    public void setHoverListener(t10 t10Var) {
        this.t = t10Var;
    }

    @Override // defpackage.xk, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
