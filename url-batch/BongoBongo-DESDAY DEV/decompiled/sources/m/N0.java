package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import l.C0166j;
import l.C0171o;
import l.MenuC0169m;

/* loaded from: classes.dex */
public final class N0 extends C0246w0 {

    /* renamed from: m, reason: collision with root package name */
    public final int f2967m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2968n;

    /* renamed from: o, reason: collision with root package name */
    public K0 f2969o;

    /* renamed from: p, reason: collision with root package name */
    public C0171o f2970p;

    public N0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2967m = 21;
            this.f2968n = 22;
        } else {
            this.f2967m = 22;
            this.f2968n = 21;
        }
    }

    @Override // m.C0246w0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0166j c0166j;
        int i;
        int pointToPosition;
        int i2;
        if (this.f2969o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c0166j = (C0166j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0166j = (C0166j) adapter;
                i = 0;
            }
            C0171o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= c0166j.getCount()) ? null : c0166j.getItem(i2);
            C0171o c0171o = this.f2970p;
            if (c0171o != item) {
                MenuC0169m menuC0169m = c0166j.f2809a;
                if (c0171o != null) {
                    this.f2969o.d(menuC0169m, c0171o);
                }
                this.f2970p = item;
                if (item != null) {
                    this.f2969o.h(menuC0169m, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f2967m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f2968n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0166j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0166j) adapter).f2809a.c(false);
        return true;
    }

    public void setHoverListener(K0 k02) {
        this.f2969o = k02;
    }

    @Override // m.C0246w0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
