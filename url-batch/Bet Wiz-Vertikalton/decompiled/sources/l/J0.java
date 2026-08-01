package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import k.C0157j;
import k.C0162o;
import k.MenuC0160m;

/* loaded from: classes.dex */
public final class J0 extends C0242s0 {

    /* renamed from: m, reason: collision with root package name */
    public final int f2874m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2875n;

    /* renamed from: o, reason: collision with root package name */
    public G0 f2876o;

    /* renamed from: p, reason: collision with root package name */
    public C0162o f2877p;

    public J0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2874m = 21;
            this.f2875n = 22;
        } else {
            this.f2874m = 22;
            this.f2875n = 21;
        }
    }

    @Override // l.C0242s0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0157j c0157j;
        int i;
        int pointToPosition;
        int i2;
        if (this.f2876o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c0157j = (C0157j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0157j = (C0157j) adapter;
                i = 0;
            }
            C0162o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= c0157j.getCount()) ? null : c0157j.getItem(i2);
            C0162o c0162o = this.f2877p;
            if (c0162o != item) {
                MenuC0160m menuC0160m = c0157j.f2655a;
                if (c0162o != null) {
                    this.f2876o.u(menuC0160m, c0162o);
                }
                this.f2877p = item;
                if (item != null) {
                    this.f2876o.g(menuC0160m, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f2874m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f2875n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0157j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0157j) adapter).f2655a.c(false);
        return true;
    }

    public void setHoverListener(G0 g02) {
        this.f2876o = g02;
    }

    @Override // l.C0242s0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
