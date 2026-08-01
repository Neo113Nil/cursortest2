package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class g2 extends p1 {

    /* renamed from: r, reason: collision with root package name */
    public final int f2549r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2550s;

    /* renamed from: t, reason: collision with root package name */
    public d2 f2551t;

    /* renamed from: u, reason: collision with root package name */
    public j.o f2552u;

    public g2(Context context, boolean z3) {
        super(context, z3);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2549r = 21;
            this.f2550s = 22;
        } else {
            this.f2549r = 22;
            this.f2550s = 21;
        }
    }

    @Override // k.p1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        j.j jVar;
        int i4;
        int pointToPosition;
        int i5;
        if (this.f2551t != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i4 = headerViewListAdapter.getHeadersCount();
                jVar = (j.j) headerViewListAdapter.getWrappedAdapter();
            } else {
                jVar = (j.j) adapter;
                i4 = 0;
            }
            j.o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i5 = pointToPosition - i4) < 0 || i5 >= jVar.getCount()) ? null : jVar.getItem(i5);
            j.o oVar = this.f2552u;
            if (oVar != item) {
                j.m mVar = jVar.f2183a;
                if (oVar != null) {
                    this.f2551t.e(mVar, oVar);
                }
                this.f2552u = item;
                if (item != null) {
                    this.f2551t.k(mVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i4 == this.f2549r) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i4 != this.f2550s) {
            return super.onKeyDown(i4, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (j.j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (j.j) adapter).f2183a.c(false);
        return true;
    }

    public void setHoverListener(d2 d2Var) {
        this.f2551t = d2Var;
    }

    @Override // k.p1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
