package h;

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

    /* renamed from: e, reason: collision with root package name */
    public Rect f2055e;

    public static int m(ListAdapter listAdapter, Context context, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i3 = 0;
        int i4 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = listAdapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i5, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i2) {
                return i2;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    @Override // h.p
    public final boolean h(MenuItemC0144k menuItemC0144k) {
        return false;
    }

    @Override // h.p
    public final boolean i(MenuItemC0144k menuItemC0144k) {
        return false;
    }

    public abstract void l(MenuC0143j menuC0143j);

    public abstract void n(View view);

    public abstract void o(boolean z2);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0141h) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0141h) listAdapter).f2002e.p((MenuItem) listAdapter.getItem(i2), this, !(this instanceof ViewOnKeyListenerC0140g) ? 0 : 4);
    }

    public abstract void p(int i2);

    public abstract void q(int i2);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z2);

    public abstract void t(int i2);

    @Override // h.p
    public final void f(Context context, MenuC0143j menuC0143j) {
    }
}
