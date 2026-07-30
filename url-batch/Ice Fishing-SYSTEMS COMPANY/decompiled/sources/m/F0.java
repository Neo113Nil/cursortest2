package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import l.C4681i;

/* loaded from: classes.dex */
public final class F0 extends C4754p0 {

    /* renamed from: F, reason: collision with root package name */
    public final int f39267F;

    /* renamed from: G, reason: collision with root package name */
    public final int f39268G;

    /* renamed from: H, reason: collision with root package name */
    public C0 f39269H;

    /* renamed from: I, reason: collision with root package name */
    public l.n f39270I;

    public F0(Context context, boolean z8) {
        super(context, z8);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f39267F = 21;
            this.f39268G = 22;
        } else {
            this.f39267F = 22;
            this.f39268G = 21;
        }
    }

    @Override // m.C4754p0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C4681i c4681i;
        int i;
        int pointToPosition;
        int i4;
        if (this.f39269H != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c4681i = (C4681i) headerViewListAdapter.getWrappedAdapter();
            } else {
                c4681i = (C4681i) adapter;
                i = 0;
            }
            l.n item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i4 = pointToPosition - i) < 0 || i4 >= c4681i.getCount()) ? null : c4681i.getItem(i4);
            l.n nVar = this.f39270I;
            if (nVar != item) {
                l.l lVar = c4681i.f38939a;
                if (nVar != null) {
                    this.f39269H.h(lVar, nVar);
                }
                this.f39270I = item;
                if (item != null) {
                    this.f39269H.v(lVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f39267F) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f39268G) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C4681i) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C4681i) adapter).f38939a.c(false);
        return true;
    }

    public void setHoverListener(C0 c02) {
        this.f39269H = c02;
    }

    @Override // m.C4754p0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
