package j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import i.C0209g;
import i.MenuC0211i;
import i.MenuItemC0212j;

/* loaded from: classes.dex */
public final class N extends C {

    /* renamed from: r, reason: collision with root package name */
    public final int f2897r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2898s;

    /* renamed from: t, reason: collision with root package name */
    public M f2899t;

    /* renamed from: u, reason: collision with root package name */
    public MenuItemC0212j f2900u;

    public N(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2897r = 21;
            this.f2898s = 22;
        } else {
            this.f2897r = 22;
            this.f2898s = 21;
        }
    }

    @Override // j.C, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0209g c0209g;
        int i2;
        int pointToPosition;
        int i3;
        if (this.f2899t != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i2 = headerViewListAdapter.getHeadersCount();
                c0209g = (C0209g) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0209g = (C0209g) adapter;
                i2 = 0;
            }
            MenuItemC0212j item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i3 = pointToPosition - i2) < 0 || i3 >= c0209g.getCount()) ? null : c0209g.getItem(i3);
            MenuItemC0212j menuItemC0212j = this.f2900u;
            if (menuItemC0212j != item) {
                MenuC0211i menuC0211i = c0209g.f2401e;
                if (menuItemC0212j != null) {
                    this.f2899t.g(menuC0211i, menuItemC0212j);
                }
                this.f2900u = item;
                if (item != null) {
                    this.f2899t.e(menuC0211i, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f2897r) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i2 != this.f2898s) {
            return super.onKeyDown(i2, keyEvent);
        }
        setSelection(-1);
        ((C0209g) getAdapter()).f2401e.c(false);
        return true;
    }

    public void setHoverListener(M m2) {
        this.f2899t = m2;
    }

    @Override // j.C, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
