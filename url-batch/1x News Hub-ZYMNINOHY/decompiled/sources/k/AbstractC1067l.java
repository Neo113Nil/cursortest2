package k;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: k.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1067l implements InterfaceC1073r, InterfaceC1071p, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Rect f9640a;

    public static int m(ListAdapter listAdapter, Context context, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i4 = 0;
        int i5 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = listAdapter.getItemViewType(i6);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i6, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i3) {
                return i3;
            }
            if (measuredWidth > i4) {
                i4 = measuredWidth;
            }
        }
        return i4;
    }

    public static boolean u(MenuC1065j menuC1065j) {
        int size = menuC1065j.f.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = menuC1065j.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // k.InterfaceC1071p
    public final boolean b(MenuItemC1066k menuItemC1066k) {
        return false;
    }

    @Override // k.InterfaceC1071p
    public final boolean e(MenuItemC1066k menuItemC1066k) {
        return false;
    }

    public abstract void l(MenuC1065j menuC1065j);

    public abstract void n(View view);

    public abstract void o(boolean z);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C1063h) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C1063h) listAdapter).f9592a.p((MenuItem) listAdapter.getItem(i3), this, !(this instanceof ViewOnKeyListenerC1062g) ? 0 : 4);
    }

    public abstract void p(int i3);

    public abstract void q(int i3);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z);

    public abstract void t(int i3);

    @Override // k.InterfaceC1071p
    public final void i(Context context, MenuC1065j menuC1065j) {
    }
}
