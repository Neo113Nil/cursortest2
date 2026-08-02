package j;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import h.InterfaceC0190a;
import i.InterfaceC0217o;
import i.MenuC0211i;
import i.MenuItemC0212j;
import i.SubMenuC0221s;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o0 implements InterfaceC0217o {

    /* renamed from: e, reason: collision with root package name */
    public MenuC0211i f3021e;

    /* renamed from: f, reason: collision with root package name */
    public MenuItemC0212j f3022f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3023g;

    public o0(Toolbar toolbar) {
        this.f3023g = toolbar;
    }

    @Override // i.InterfaceC0217o
    public final boolean b(MenuItemC0212j menuItemC0212j) {
        Toolbar toolbar = this.f3023g;
        KeyEvent.Callback callback = toolbar.f1529m;
        if (callback instanceof InterfaceC0190a) {
            SearchView searchView = (SearchView) ((InterfaceC0190a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f1459t;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f1452c0 = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f1454e0);
            searchView.f1453d0 = false;
        }
        toolbar.removeView(toolbar.f1529m);
        toolbar.removeView(toolbar.f1528l);
        toolbar.f1529m = null;
        ArrayList arrayList = toolbar.f1515I;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f3022f = null;
        toolbar.requestLayout();
        menuItemC0212j.f2429B = false;
        menuItemC0212j.f2443n.o(false);
        return true;
    }

    @Override // i.InterfaceC0217o
    public final boolean d() {
        return false;
    }

    @Override // i.InterfaceC0217o
    public final void e(Context context, MenuC0211i menuC0211i) {
        MenuItemC0212j menuItemC0212j;
        MenuC0211i menuC0211i2 = this.f3021e;
        if (menuC0211i2 != null && (menuItemC0212j = this.f3022f) != null) {
            menuC0211i2.d(menuItemC0212j);
        }
        this.f3021e = menuC0211i;
    }

    @Override // i.InterfaceC0217o
    public final boolean g(MenuItemC0212j menuItemC0212j) {
        Toolbar toolbar = this.f3023g;
        toolbar.c();
        ViewParent parent = toolbar.f1528l.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1528l);
            }
            toolbar.addView(toolbar.f1528l);
        }
        View view = menuItemC0212j.f2454z;
        if (view == null) {
            view = null;
        }
        toolbar.f1529m = view;
        this.f3022f = menuItemC0212j;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1529m);
            }
            p0 g2 = Toolbar.g();
            g2.f3027a = (toolbar.f1534r & 112) | 8388611;
            g2.f3028b = 2;
            toolbar.f1529m.setLayoutParams(g2);
            toolbar.addView(toolbar.f1529m);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((p0) childAt.getLayoutParams()).f3028b != 2 && childAt != toolbar.f1521e) {
                toolbar.removeViewAt(childCount);
                toolbar.f1515I.add(childAt);
            }
        }
        toolbar.requestLayout();
        menuItemC0212j.f2429B = true;
        menuItemC0212j.f2443n.o(false);
        KeyEvent.Callback callback = toolbar.f1529m;
        if (callback instanceof InterfaceC0190a) {
            SearchView searchView = (SearchView) ((InterfaceC0190a) callback);
            if (!searchView.f1453d0) {
                searchView.f1453d0 = true;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f1459t;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f1454e0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        return true;
    }

    @Override // i.InterfaceC0217o
    public final void h() {
        if (this.f3022f != null) {
            MenuC0211i menuC0211i = this.f3021e;
            if (menuC0211i != null) {
                int size = menuC0211i.f2413f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f3021e.getItem(i2) == this.f3022f) {
                        return;
                    }
                }
            }
            b(this.f3022f);
        }
    }

    @Override // i.InterfaceC0217o
    public final boolean k(SubMenuC0221s subMenuC0221s) {
        return false;
    }

    @Override // i.InterfaceC0217o
    public final void a(MenuC0211i menuC0211i, boolean z2) {
    }
}
