package i;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import h.MenuC0143j;
import h.MenuItemC0144k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m0 implements h.p {

    /* renamed from: e, reason: collision with root package name */
    public MenuC0143j f2264e;

    /* renamed from: f, reason: collision with root package name */
    public MenuItemC0144k f2265f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2266g;

    public m0(Toolbar toolbar) {
        this.f2266g = toolbar;
    }

    @Override // h.p
    public final void d() {
        if (this.f2265f != null) {
            MenuC0143j menuC0143j = this.f2264e;
            if (menuC0143j != null) {
                int size = menuC0143j.f2014f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f2264e.getItem(i2) == this.f2265f) {
                        return;
                    }
                }
            }
            i(this.f2265f);
        }
    }

    @Override // h.p
    public final void f(Context context, MenuC0143j menuC0143j) {
        MenuItemC0144k menuItemC0144k;
        MenuC0143j menuC0143j2 = this.f2264e;
        if (menuC0143j2 != null && (menuItemC0144k = this.f2265f) != null) {
            menuC0143j2.d(menuItemC0144k);
        }
        this.f2264e = menuC0143j;
    }

    @Override // h.p
    public final boolean g() {
        return false;
    }

    @Override // h.p
    public final boolean h(MenuItemC0144k menuItemC0144k) {
        Toolbar toolbar = this.f2266g;
        toolbar.c();
        ViewParent parent = toolbar.f1367l.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1367l);
            }
            toolbar.addView(toolbar.f1367l);
        }
        View view = menuItemC0144k.f2054z;
        if (view == null) {
            view = null;
        }
        toolbar.f1368m = view;
        this.f2265f = menuItemC0144k;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1368m);
            }
            n0 g2 = Toolbar.g();
            g2.f2273a = (toolbar.f1373r & 112) | 8388611;
            g2.f2274b = 2;
            toolbar.f1368m.setLayoutParams(g2);
            toolbar.addView(toolbar.f1368m);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((n0) childAt.getLayoutParams()).f2274b != 2 && childAt != toolbar.f1360e) {
                toolbar.removeViewAt(childCount);
                toolbar.f1353I.add(childAt);
            }
        }
        toolbar.requestLayout();
        menuItemC0144k.f2029B = true;
        menuItemC0144k.f2043n.o(false);
        KeyEvent.Callback callback = toolbar.f1368m;
        if (callback instanceof g.a) {
            SearchView searchView = (SearchView) ((g.a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.t;
            if (!searchView.f1292d0) {
                searchView.f1292d0 = true;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f1293e0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        return true;
    }

    @Override // h.p
    public final boolean i(MenuItemC0144k menuItemC0144k) {
        Toolbar toolbar = this.f2266g;
        KeyEvent.Callback callback = toolbar.f1368m;
        if (callback instanceof g.a) {
            SearchView searchView = (SearchView) ((g.a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.t;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f1291c0 = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f1293e0);
            searchView.f1292d0 = false;
        }
        toolbar.removeView(toolbar.f1368m);
        toolbar.removeView(toolbar.f1367l);
        toolbar.f1368m = null;
        ArrayList arrayList = toolbar.f1353I;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2265f = null;
        toolbar.requestLayout();
        menuItemC0144k.f2029B = false;
        menuItemC0144k.f2043n.o(false);
        return true;
    }

    @Override // h.p
    public final boolean k(h.t tVar) {
        return false;
    }

    @Override // h.p
    public final void a(MenuC0143j menuC0143j, boolean z2) {
    }
}
