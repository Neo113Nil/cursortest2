package i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import h.C0141h;
import h.MenuC0143j;
import h.MenuItemC0144k;

/* loaded from: classes.dex */
public final class M extends AbstractC0147B {

    /* renamed from: r, reason: collision with root package name */
    public final int f2156r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2157s;
    public L t;

    /* renamed from: u, reason: collision with root package name */
    public MenuItemC0144k f2158u;

    public M(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2156r = 21;
            this.f2157s = 22;
        } else {
            this.f2156r = 22;
            this.f2157s = 21;
        }
    }

    @Override // i.AbstractC0147B, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0141h c0141h;
        int i2;
        int pointToPosition;
        int i3;
        if (this.t != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i2 = headerViewListAdapter.getHeadersCount();
                c0141h = (C0141h) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0141h = (C0141h) adapter;
                i2 = 0;
            }
            MenuItemC0144k item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i3 = pointToPosition - i2) < 0 || i3 >= c0141h.getCount()) ? null : c0141h.getItem(i3);
            MenuItemC0144k menuItemC0144k = this.f2158u;
            if (menuItemC0144k != item) {
                MenuC0143j menuC0143j = c0141h.f2002e;
                if (menuItemC0144k != null) {
                    this.t.l(menuC0143j, menuItemC0144k);
                }
                this.f2158u = item;
                if (item != null) {
                    this.t.p(menuC0143j, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f2156r) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i2 != this.f2157s) {
            return super.onKeyDown(i2, keyEvent);
        }
        setSelection(-1);
        ((C0141h) getAdapter()).f2002e.c(false);
        return true;
    }

    public void setHoverListener(L l2) {
        this.t = l2;
    }

    @Override // i.AbstractC0147B, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
