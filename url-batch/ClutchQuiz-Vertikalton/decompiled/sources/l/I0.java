package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import k.C0164j;
import k.C0169o;
import k.MenuC0167m;

/* loaded from: classes.dex */
public final class I0 extends C0236r0 {

    /* renamed from: m, reason: collision with root package name */
    public final int f2868m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2869n;

    /* renamed from: o, reason: collision with root package name */
    public F0 f2870o;

    /* renamed from: p, reason: collision with root package name */
    public C0169o f2871p;

    public I0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2868m = 21;
            this.f2869n = 22;
        } else {
            this.f2868m = 22;
            this.f2869n = 21;
        }
    }

    @Override // l.C0236r0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0164j c0164j;
        int i;
        int pointToPosition;
        int i2;
        if (this.f2870o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c0164j = (C0164j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0164j = (C0164j) adapter;
                i = 0;
            }
            C0169o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= c0164j.getCount()) ? null : c0164j.getItem(i2);
            C0169o c0169o = this.f2871p;
            if (c0169o != item) {
                MenuC0167m menuC0167m = c0164j.f2740a;
                if (c0169o != null) {
                    this.f2870o.s(menuC0167m, c0169o);
                }
                this.f2871p = item;
                if (item != null) {
                    this.f2870o.f(menuC0167m, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f2868m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f2869n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0164j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0164j) adapter).f2740a.c(false);
        return true;
    }

    public void setHoverListener(F0 f02) {
        this.f2870o = f02;
    }

    @Override // l.C0236r0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
