package h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import g.C0136h;

/* loaded from: classes.dex */
public final class L extends AbstractC0141A {
    public final int r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2125s;

    /* renamed from: t, reason: collision with root package name */
    public K f2126t;

    /* renamed from: u, reason: collision with root package name */
    public g.k f2127u;

    public L(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.r = 21;
            this.f2125s = 22;
        } else {
            this.r = 22;
            this.f2125s = 21;
        }
    }

    @Override // h.AbstractC0141A, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0136h c0136h;
        int i2;
        int pointToPosition;
        int i3;
        if (this.f2126t != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i2 = headerViewListAdapter.getHeadersCount();
                c0136h = (C0136h) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0136h = (C0136h) adapter;
                i2 = 0;
            }
            g.k item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i3 = pointToPosition - i2) < 0 || i3 >= c0136h.getCount()) ? null : c0136h.getItem(i3);
            g.k kVar = this.f2127u;
            if (kVar != item) {
                g.j jVar = c0136h.f1969e;
                if (kVar != null) {
                    this.f2126t.f(jVar, kVar);
                }
                this.f2127u = item;
                if (item != null) {
                    this.f2126t.q(jVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.r) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i2 != this.f2125s) {
            return super.onKeyDown(i2, keyEvent);
        }
        setSelection(-1);
        ((C0136h) getAdapter()).f1969e.c(false);
        return true;
    }

    public void setHoverListener(K k2) {
        this.f2126t = k2;
    }

    @Override // h.AbstractC0141A, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
