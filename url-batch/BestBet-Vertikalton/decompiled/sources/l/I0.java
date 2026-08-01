package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import k.C0186j;
import k.C0192p;
import k.MenuC0189m;

/* loaded from: classes.dex */
public final class I0 extends C0257r0 {

    /* renamed from: m, reason: collision with root package name */
    public final int f3291m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3292n;

    /* renamed from: o, reason: collision with root package name */
    public F0 f3293o;

    /* renamed from: p, reason: collision with root package name */
    public C0192p f3294p;

    public I0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f3291m = 21;
            this.f3292n = 22;
        } else {
            this.f3291m = 22;
            this.f3292n = 21;
        }
    }

    @Override // l.C0257r0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0186j c0186j;
        int i;
        int pointToPosition;
        int i2;
        if (this.f3293o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c0186j = (C0186j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0186j = (C0186j) adapter;
                i = 0;
            }
            C0192p item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= c0186j.getCount()) ? null : c0186j.getItem(i2);
            C0192p c0192p = this.f3294p;
            if (c0192p != item) {
                MenuC0189m menuC0189m = c0186j.f3157a;
                if (c0192p != null) {
                    this.f3293o.n(menuC0189m, c0192p);
                }
                this.f3294p = item;
                if (item != null) {
                    this.f3293o.d(menuC0189m, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f3291m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f3292n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0186j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0186j) adapter).f3157a.c(false);
        return true;
    }

    public void setHoverListener(F0 f02) {
        this.f3293o = f02;
    }

    @Override // l.C0257r0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
