package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import k.C0197j;
import k.C0202o;
import k.MenuC0200m;

/* loaded from: classes.dex */
public final class L0 extends C0289u0 {

    /* renamed from: m, reason: collision with root package name */
    public final int f3260m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3261n;

    /* renamed from: o, reason: collision with root package name */
    public I0 f3262o;

    /* renamed from: p, reason: collision with root package name */
    public C0202o f3263p;

    public L0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f3260m = 21;
            this.f3261n = 22;
        } else {
            this.f3260m = 22;
            this.f3261n = 21;
        }
    }

    @Override // l.C0289u0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0197j c0197j;
        int i;
        int pointToPosition;
        int i2;
        if (this.f3262o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c0197j = (C0197j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0197j = (C0197j) adapter;
                i = 0;
            }
            C0202o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= c0197j.getCount()) ? null : c0197j.getItem(i2);
            C0202o c0202o = this.f3263p;
            if (c0202o != item) {
                MenuC0200m menuC0200m = c0197j.f3050a;
                if (c0202o != null) {
                    this.f3262o.p(menuC0200m, c0202o);
                }
                this.f3263p = item;
                if (item != null) {
                    this.f3262o.e(menuC0200m, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f3260m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f3261n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0197j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0197j) adapter).f3050a.c(false);
        return true;
    }

    public void setHoverListener(I0 i0) {
        this.f3262o = i0;
    }

    @Override // l.C0289u0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
