package l;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class k implements q, o, AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public Rect f5707d;

    public static int m(ListAdapter listAdapter, Context context, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i10 = 0;
        int i11 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = listAdapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i12, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i3) {
                return i3;
            }
            if (measuredWidth > i10) {
                i10 = measuredWidth;
            }
        }
        return i10;
    }

    @Override // l.o
    public final boolean f(j jVar) {
        return false;
    }

    @Override // l.o
    public final boolean k(j jVar) {
        return false;
    }

    public abstract void l(i iVar);

    public abstract void n(View view);

    public abstract void o(boolean z10);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (g) listAdapter).f5658a.p((MenuItem) listAdapter.getItem(i3), this, !(this instanceof f) ? 0 : 4);
    }

    public abstract void p(int i3);

    public abstract void q(int i3);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z10);

    public abstract void t(int i3);

    @Override // l.o
    public final void g(Context context, i iVar) {
    }
}
