package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n1 extends x0 {

    /* renamed from: p, reason: collision with root package name */
    public final int f4354p;

    /* renamed from: q, reason: collision with root package name */
    public final int f4355q;

    /* renamed from: r, reason: collision with root package name */
    public k1 f4356r;

    /* renamed from: s, reason: collision with root package name */
    public k.j f4357s;

    public n1(Context context, boolean z3) {
        super(context, z3);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f4354p = 21;
            this.f4355q = 22;
        } else {
            this.f4354p = 22;
            this.f4355q = 21;
        }
    }

    @Override // l.x0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        k.g gVar;
        int i;
        int pointToPosition;
        int i8;
        if (this.f4356r != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                gVar = (k.g) headerViewListAdapter.getWrappedAdapter();
            } else {
                gVar = (k.g) adapter;
                i = 0;
            }
            k.j item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i8 = pointToPosition - i) < 0 || i8 >= gVar.getCount()) ? null : gVar.getItem(i8);
            k.j jVar = this.f4357s;
            if (jVar != item) {
                k.i iVar = gVar.f4063a;
                if (jVar != null) {
                    this.f4356r.e(iVar, jVar);
                }
                this.f4357s = item;
                if (item != null) {
                    this.f4356r.b(iVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f4354p) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f4355q) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (k.g) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (k.g) adapter).f4063a.c(false);
        return true;
    }

    public void setHoverListener(k1 k1Var) {
        this.f4356r = k1Var;
    }

    @Override // l.x0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
