package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class M extends K implements L {

    /* renamed from: b, reason: collision with root package name */
    private static Method f10700b;

    /* renamed from: a, reason: collision with root package name */
    private L f10701a;

    static class a {
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    static class b {
        static void a(PopupWindow popupWindow, boolean z4) {
            popupWindow.setTouchModal(z4);
        }
    }

    public static class c extends G {

        /* renamed from: n, reason: collision with root package name */
        final int f10702n;

        /* renamed from: o, reason: collision with root package name */
        final int f10703o;

        /* renamed from: p, reason: collision with root package name */
        private L f10704p;

        /* renamed from: q, reason: collision with root package name */
        private MenuItem f10705q;

        public c(Context context, boolean z4) {
            super(context, z4);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f10702n = 21;
                this.f10703o = 22;
            } else {
                this.f10702n = 22;
                this.f10703o = 21;
            }
        }

        @Override // androidx.appcompat.widget.G
        public /* bridge */ /* synthetic */ int d(int i4, int i5, int i6, int i7, int i8) {
            return super.d(i4, i5, i6, i7, i8);
        }

        @Override // androidx.appcompat.widget.G
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i4) {
            return super.e(motionEvent, i4);
        }

        @Override // androidx.appcompat.widget.G, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.G, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.G, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.G, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.G, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.d dVar;
            int i4;
            int pointToPosition;
            int i5;
            if (this.f10704p != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i4 = headerViewListAdapter.getHeadersCount();
                    dVar = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                    i4 = 0;
                }
                androidx.appcompat.view.menu.g item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i5 = pointToPosition - i4) < 0 || i5 >= dVar.getCount()) ? null : dVar.getItem(i5);
                MenuItem menuItem = this.f10705q;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.e b4 = dVar.b();
                    if (menuItem != null) {
                        this.f10704p.c(b4, menuItem);
                    }
                    this.f10705q = item;
                    if (item != null) {
                        this.f10704p.a(b4, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i4, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i4 == this.f10702n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i4 != this.f10703o) {
                return super.onKeyDown(i4, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.d) adapter).b().close(false);
            return true;
        }

        @Override // androidx.appcompat.widget.G, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(L l4) {
            this.f10704p = l4;
        }

        @Override // androidx.appcompat.widget.G, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f10700b = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public M(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
    }

    @Override // androidx.appcompat.widget.L
    public void a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        L l4 = this.f10701a;
        if (l4 != null) {
            l4.a(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.L
    public void c(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        L l4 = this.f10701a;
        if (l4 != null) {
            l4.c(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.K
    G createDropDownListView(Context context, boolean z4) {
        c cVar = new c(context, z4);
        cVar.setHoverListener(this);
        return cVar;
    }

    public void k(Object obj) {
        a.a(this.mPopup, (Transition) obj);
    }

    public void l(Object obj) {
        a.b(this.mPopup, (Transition) obj);
    }

    public void m(L l4) {
        this.f10701a = l4;
    }

    public void n(boolean z4) {
        if (Build.VERSION.SDK_INT > 28) {
            b.a(this.mPopup, z4);
            return;
        }
        Method method = f10700b;
        if (method != null) {
            try {
                method.invoke(this.mPopup, Boolean.valueOf(z4));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }
}
