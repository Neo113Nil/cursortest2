package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import k.C0158j;
import k.C0163o;
import k.MenuC0161m;

/* loaded from: classes.dex */
public final class K0 extends C0245t0 {

    /* renamed from: m, reason: collision with root package name */
    public final int f2822m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2823n;

    /* renamed from: o, reason: collision with root package name */
    public H0 f2824o;

    /* renamed from: p, reason: collision with root package name */
    public C0163o f2825p;

    public K0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2822m = 21;
            this.f2823n = 22;
        } else {
            this.f2822m = 22;
            this.f2823n = 21;
        }
    }

    @Override // l.C0245t0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0158j c0158j;
        int i;
        int pointToPosition;
        int i2;
        if (this.f2824o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c0158j = (C0158j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0158j = (C0158j) adapter;
                i = 0;
            }
            C0163o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= c0158j.getCount()) ? null : c0158j.getItem(i2);
            C0163o c0163o = this.f2825p;
            if (c0163o != item) {
                MenuC0161m menuC0161m = c0158j.f2606a;
                if (c0163o != null) {
                    this.f2824o.s(menuC0161m, c0163o);
                }
                this.f2825p = item;
                if (item != null) {
                    this.f2824o.e(menuC0161m, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f2822m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f2823n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0158j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0158j) adapter).f2606a.c(false);
        return true;
    }

    public void setHoverListener(H0 h02) {
        this.f2824o = h02;
    }

    @Override // l.C0245t0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
