package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import k.C1063h;
import k.MenuC1065j;
import k.MenuItemC1066k;

/* loaded from: classes.dex */
public final class M extends B {

    /* renamed from: n, reason: collision with root package name */
    public final int f9752n;
    public final int o;

    /* renamed from: p, reason: collision with root package name */
    public L f9753p;

    /* renamed from: q, reason: collision with root package name */
    public MenuItemC1066k f9754q;

    public M(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f9752n = 21;
            this.o = 22;
        } else {
            this.f9752n = 22;
            this.o = 21;
        }
    }

    @Override // l.B, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C1063h c1063h;
        int i3;
        int pointToPosition;
        int i4;
        if (this.f9753p != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i3 = headerViewListAdapter.getHeadersCount();
                c1063h = (C1063h) headerViewListAdapter.getWrappedAdapter();
            } else {
                c1063h = (C1063h) adapter;
                i3 = 0;
            }
            MenuItemC1066k item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i4 = pointToPosition - i3) < 0 || i4 >= c1063h.getCount()) ? null : c1063h.getItem(i4);
            MenuItemC1066k menuItemC1066k = this.f9754q;
            if (menuItemC1066k != item) {
                MenuC1065j menuC1065j = c1063h.f9592a;
                if (menuItemC1066k != null) {
                    this.f9753p.b(menuC1065j, menuItemC1066k);
                }
                this.f9754q = item;
                if (item != null) {
                    this.f9753p.a(menuC1065j, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i3 == this.f9752n) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i3 != this.o) {
            return super.onKeyDown(i3, keyEvent);
        }
        setSelection(-1);
        ((C1063h) getAdapter()).f9592a.c(false);
        return true;
    }

    public void setHoverListener(L l3) {
        this.f9753p = l3;
    }

    @Override // l.B, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
