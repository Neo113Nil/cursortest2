package n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class N0 extends C0742w0 {

    /* renamed from: u, reason: collision with root package name */
    public final int f6678u;

    /* renamed from: v, reason: collision with root package name */
    public final int f6679v;

    /* renamed from: w, reason: collision with root package name */
    public J0 f6680w;

    /* renamed from: x, reason: collision with root package name */
    public m.o f6681x;

    public N0(Context context, boolean z7) {
        super(context, z7);
        if (1 == M0.a(context.getResources().getConfiguration())) {
            this.f6678u = 21;
            this.f6679v = 22;
        } else {
            this.f6678u = 22;
            this.f6679v = 21;
        }
    }

    @Override // n.C0742w0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        m.j jVar;
        int i2;
        int pointToPosition;
        int i5;
        if (this.f6680w != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i2 = headerViewListAdapter.getHeadersCount();
                jVar = (m.j) headerViewListAdapter.getWrappedAdapter();
            } else {
                jVar = (m.j) adapter;
                i2 = 0;
            }
            m.o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i5 = pointToPosition - i2) < 0 || i5 >= jVar.getCount()) ? null : jVar.getItem(i5);
            m.o oVar = this.f6681x;
            if (oVar != item) {
                m.m mVar = jVar.f6403d;
                if (oVar != null) {
                    this.f6680w.n(mVar, oVar);
                }
                this.f6681x = item;
                if (item != null) {
                    this.f6680w.f(mVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f6678u) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i2 != this.f6679v) {
            return super.onKeyDown(i2, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (m.j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (m.j) adapter).f6403d.c(false);
        return true;
    }

    public void setHoverListener(J0 j02) {
        this.f6680w = j02;
    }

    @Override // n.C0742w0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
