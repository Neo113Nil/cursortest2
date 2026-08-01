package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import k.C0163j;
import k.C0168o;
import k.MenuC0166m;

/* loaded from: classes.dex */
public final class J0 extends C0236s0 {

    /* renamed from: m, reason: collision with root package name */
    public final int f2838m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2839n;

    /* renamed from: o, reason: collision with root package name */
    public G0 f2840o;

    /* renamed from: p, reason: collision with root package name */
    public C0168o f2841p;

    public J0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2838m = 21;
            this.f2839n = 22;
        } else {
            this.f2838m = 22;
            this.f2839n = 21;
        }
    }

    @Override // l.C0236s0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0163j c0163j;
        int i;
        int pointToPosition;
        int i2;
        if (this.f2840o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c0163j = (C0163j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0163j = (C0163j) adapter;
                i = 0;
            }
            C0168o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= c0163j.getCount()) ? null : c0163j.getItem(i2);
            C0168o c0168o = this.f2841p;
            if (c0168o != item) {
                MenuC0166m menuC0166m = c0163j.f2707a;
                if (c0168o != null) {
                    this.f2840o.u(menuC0166m, c0168o);
                }
                this.f2841p = item;
                if (item != null) {
                    this.f2840o.f(menuC0166m, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f2838m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f2839n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0163j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0163j) adapter).f2707a.c(false);
        return true;
    }

    public void setHoverListener(G0 g02) {
        this.f2840o = g02;
    }

    @Override // l.C0236s0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
