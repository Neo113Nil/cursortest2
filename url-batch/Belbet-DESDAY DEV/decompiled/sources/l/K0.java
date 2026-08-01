package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import k.C0154j;
import k.C0159o;
import k.MenuC0157m;

/* loaded from: classes.dex */
public final class K0 extends C0261t0 {

    /* renamed from: m, reason: collision with root package name */
    public final int f2891m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2892n;

    /* renamed from: o, reason: collision with root package name */
    public H0 f2893o;

    /* renamed from: p, reason: collision with root package name */
    public C0159o f2894p;

    public K0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2891m = 21;
            this.f2892n = 22;
        } else {
            this.f2891m = 22;
            this.f2892n = 21;
        }
    }

    @Override // l.C0261t0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0154j c0154j;
        int i;
        int pointToPosition;
        int i2;
        if (this.f2893o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c0154j = (C0154j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0154j = (C0154j) adapter;
                i = 0;
            }
            C0159o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= c0154j.getCount()) ? null : c0154j.getItem(i2);
            C0159o c0159o = this.f2894p;
            if (c0159o != item) {
                MenuC0157m menuC0157m = c0154j.f2680a;
                if (c0159o != null) {
                    this.f2893o.o(menuC0157m, c0159o);
                }
                this.f2894p = item;
                if (item != null) {
                    this.f2893o.d(menuC0157m, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f2891m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f2892n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0154j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0154j) adapter).f2680a.c(false);
        return true;
    }

    public void setHoverListener(H0 h02) {
        this.f2893o = h02;
    }

    @Override // l.C0261t0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
