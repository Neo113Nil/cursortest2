package j;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class l implements r, p, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Rect f13690a;

    public static int l(ListAdapter listAdapter, Context context, int i4) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i5 = 0;
        int i6 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = listAdapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i7, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i4) {
                return i4;
            }
            if (measuredWidth > i5) {
                i5 = measuredWidth;
            }
        }
        return i5;
    }

    @Override // j.p
    public final boolean a(k kVar) {
        return false;
    }

    @Override // j.p
    public final boolean j(k kVar) {
        return false;
    }

    public abstract void k(j jVar);

    public abstract void m(View view);

    public abstract void n(boolean z);

    public abstract void o(int i4);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (h) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (h) listAdapter).f13641a.p((MenuItem) listAdapter.getItem(i4), this, !(this instanceof g) ? 0 : 4);
    }

    public abstract void p(int i4);

    public abstract void q(PopupWindow.OnDismissListener onDismissListener);

    public abstract void r(boolean z);

    public abstract void s(int i4);

    @Override // j.p
    public final void i(Context context, j jVar) {
    }
}
