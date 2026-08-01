package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import k.C0161j;
import k.C0166o;
import k.MenuC0164m;

/* loaded from: classes.dex */
public final class J0 extends C0233s0 {

    /* renamed from: m, reason: collision with root package name */
    public final int f2814m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2815n;

    /* renamed from: o, reason: collision with root package name */
    public G0 f2816o;

    /* renamed from: p, reason: collision with root package name */
    public C0166o f2817p;

    public J0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2814m = 21;
            this.f2815n = 22;
        } else {
            this.f2814m = 22;
            this.f2815n = 21;
        }
    }

    @Override // l.C0233s0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0161j c0161j;
        int i;
        int pointToPosition;
        int i2;
        if (this.f2816o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c0161j = (C0161j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0161j = (C0161j) adapter;
                i = 0;
            }
            C0166o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= c0161j.getCount()) ? null : c0161j.getItem(i2);
            C0166o c0166o = this.f2817p;
            if (c0166o != item) {
                MenuC0164m menuC0164m = c0161j.f2679a;
                if (c0166o != null) {
                    this.f2816o.s(menuC0164m, c0166o);
                }
                this.f2817p = item;
                if (item != null) {
                    this.f2816o.e(menuC0164m, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f2814m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f2815n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0161j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0161j) adapter).f2679a.c(false);
        return true;
    }

    public void setHoverListener(G0 g02) {
        this.f2816o = g02;
    }

    @Override // l.C0233s0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
