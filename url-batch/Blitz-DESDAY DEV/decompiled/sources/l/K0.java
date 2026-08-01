package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class K0 extends C0213t0 {

    /* renamed from: m, reason: collision with root package name */
    public final int f2894m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2895n;

    /* renamed from: o, reason: collision with root package name */
    public H0 f2896o;

    /* renamed from: p, reason: collision with root package name */
    public k.o f2897p;

    public K0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2894m = 21;
            this.f2895n = 22;
        } else {
            this.f2894m = 22;
            this.f2895n = 21;
        }
    }

    @Override // l.C0213t0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        k.j jVar;
        int i;
        int pointToPosition;
        int i2;
        if (this.f2896o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                jVar = (k.j) headerViewListAdapter.getWrappedAdapter();
            } else {
                jVar = (k.j) adapter;
                i = 0;
            }
            k.o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= jVar.getCount()) ? null : jVar.getItem(i2);
            k.o oVar = this.f2897p;
            if (oVar != item) {
                k.m mVar = jVar.f2759a;
                if (oVar != null) {
                    this.f2896o.s(mVar, oVar);
                }
                this.f2897p = item;
                if (item != null) {
                    this.f2896o.e(mVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f2894m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f2895n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (k.j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (k.j) adapter).f2759a.c(false);
        return true;
    }

    public void setHoverListener(H0 h02) {
        this.f2896o = h02;
    }

    @Override // l.C0213t0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
