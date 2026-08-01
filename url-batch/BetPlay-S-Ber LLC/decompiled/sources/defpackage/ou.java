package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ou extends dg {
    public final int r;
    public final int s;
    public du t;
    public eu u;

    public ou(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.r = 21;
            this.s = 22;
        } else {
            this.r = 22;
            this.s = 21;
        }
    }

    @Override // defpackage.dg, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        xt xtVar;
        int i;
        int pointToPosition;
        int i2;
        if (this.t != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                xtVar = (xt) headerViewListAdapter.getWrappedAdapter();
            } else {
                xtVar = (xt) adapter;
                i = 0;
            }
            eu item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= xtVar.getCount()) ? null : xtVar.getItem(i2);
            eu euVar = this.u;
            if (euVar != item) {
                au auVar = xtVar.a;
                if (euVar != null) {
                    this.t.g(auVar, euVar);
                }
                this.u = item;
                if (item != null) {
                    this.t.j(auVar, item);
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
        (adapter instanceof HeaderViewListAdapter ? (xt) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (xt) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(du duVar) {
        this.t = duVar;
    }

    @Override // defpackage.dg, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
