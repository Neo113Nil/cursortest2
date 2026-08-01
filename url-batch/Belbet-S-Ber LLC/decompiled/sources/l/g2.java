package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g2 extends p1 {

    /* renamed from: r, reason: collision with root package name */
    public final int f2452r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2453s;

    /* renamed from: t, reason: collision with root package name */
    public d2 f2454t;

    /* renamed from: u, reason: collision with root package name */
    public k.o f2455u;

    public g2(Context context, boolean z4) {
        super(context, z4);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2452r = 21;
            this.f2453s = 22;
        } else {
            this.f2452r = 22;
            this.f2453s = 21;
        }
    }

    @Override // l.p1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        k.j jVar;
        int i;
        int pointToPosition;
        int i4;
        if (this.f2454t != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                jVar = (k.j) headerViewListAdapter.getWrappedAdapter();
            } else {
                jVar = (k.j) adapter;
                i = 0;
            }
            k.o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i4 = pointToPosition - i) < 0 || i4 >= jVar.getCount()) ? null : jVar.getItem(i4);
            k.o oVar = this.f2455u;
            if (oVar != item) {
                k.m mVar = jVar.f2205a;
                if (oVar != null) {
                    this.f2454t.f(mVar, oVar);
                }
                this.f2455u = item;
                if (item != null) {
                    this.f2454t.c(mVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f2452r) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f2453s) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (k.j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (k.j) adapter).f2205a.c(false);
        return true;
    }

    public void setHoverListener(d2 d2Var) {
        this.f2454t = d2Var;
    }

    @Override // l.p1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
