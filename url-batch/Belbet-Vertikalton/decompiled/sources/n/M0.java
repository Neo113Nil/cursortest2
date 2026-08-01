package n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import m.C0226j;
import m.C0231o;
import m.MenuC0229m;

/* loaded from: classes.dex */
public final class M0 extends C0305v0 {

    /* renamed from: m, reason: collision with root package name */
    public final int f3491m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3492n;

    /* renamed from: o, reason: collision with root package name */
    public J0 f3493o;

    /* renamed from: p, reason: collision with root package name */
    public C0231o f3494p;

    public M0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f3491m = 21;
            this.f3492n = 22;
        } else {
            this.f3491m = 22;
            this.f3492n = 21;
        }
    }

    @Override // n.C0305v0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0226j c0226j;
        int i;
        int pointToPosition;
        int i2;
        if (this.f3493o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c0226j = (C0226j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0226j = (C0226j) adapter;
                i = 0;
            }
            C0231o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= c0226j.getCount()) ? null : c0226j.getItem(i2);
            C0231o c0231o = this.f3494p;
            if (c0231o != item) {
                MenuC0229m menuC0229m = c0226j.f3342a;
                if (c0231o != null) {
                    this.f3493o.j(menuC0229m, c0231o);
                }
                this.f3494p = item;
                if (item != null) {
                    this.f3493o.n(menuC0229m, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f3491m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f3492n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0226j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0226j) adapter).f3342a.c(false);
        return true;
    }

    public void setHoverListener(J0 j02) {
        this.f3493o = j02;
    }

    @Override // n.C0305v0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
