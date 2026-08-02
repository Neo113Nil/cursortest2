package i;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: i.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0213k implements InterfaceC0219q, InterfaceC0217o, AdapterView.OnItemClickListener {

    /* renamed from: e, reason: collision with root package name */
    public Rect f2455e;

    public static int m(ListAdapter listAdapter, Context context, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i3 = 0;
        int i4 = 0;
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

    public static boolean u(MenuC0211i menuC0211i) {
        int size = menuC0211i.f2413f.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = menuC0211i.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // i.InterfaceC0217o
    public final boolean b(MenuItemC0212j menuItemC0212j) {
        return false;
    }

    @Override // i.InterfaceC0217o
    public final boolean g(MenuItemC0212j menuItemC0212j) {
        return false;
    }

    public abstract void l(MenuC0211i menuC0211i);

    public abstract void n(View view);

    public abstract void o(boolean z2);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0209g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0209g) listAdapter).f2401e.p((MenuItem) listAdapter.getItem(i2), this, !(this instanceof ViewOnKeyListenerC0208f) ? 0 : 4);
    }

    public abstract void p(int i2);

    public abstract void q(int i2);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z2);

    public abstract void t(int i2);

    @Override // i.InterfaceC0217o
    public final void e(Context context, MenuC0211i menuC0211i) {
    }
}
