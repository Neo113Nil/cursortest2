package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class j2 extends s1 {

    /* renamed from: r, reason: collision with root package name */
    public final int f2351r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2352s;

    /* renamed from: t, reason: collision with root package name */
    public g2 f2353t;

    /* renamed from: u, reason: collision with root package name */
    public k.o f2354u;

    public j2(Context context, boolean z3) {
        super(context, z3);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2351r = 21;
            this.f2352s = 22;
        } else {
            this.f2351r = 22;
            this.f2352s = 21;
        }
    }

    @Override // l.s1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        k.j jVar;
        int i;
        int pointToPosition;
        int i4;
        if (this.f2353t != null) {
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
            k.o oVar = this.f2354u;
            if (oVar != item) {
                k.m mVar = jVar.f2054a;
                if (oVar != null) {
                    this.f2353t.j(mVar, oVar);
                }
                this.f2354u = item;
                if (item != null) {
                    this.f2353t.c(mVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f2351r) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f2352s) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (k.j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (k.j) adapter).f2054a.c(false);
        return true;
    }

    public void setHoverListener(g2 g2Var) {
        this.f2353t = g2Var;
    }

    @Override // l.s1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
