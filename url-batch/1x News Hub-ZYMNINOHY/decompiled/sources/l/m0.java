package l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import j.InterfaceC1048a;
import java.util.ArrayList;
import k.InterfaceC1071p;
import k.MenuC1065j;
import k.MenuItemC1066k;
import k.SubMenuC1075t;

/* loaded from: classes.dex */
public final class m0 implements InterfaceC1071p {

    /* renamed from: a, reason: collision with root package name */
    public MenuC1065j f9851a;

    /* renamed from: b, reason: collision with root package name */
    public MenuItemC1066k f9852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f9853c;

    public m0(Toolbar toolbar) {
        this.f9853c = toolbar;
    }

    @Override // k.InterfaceC1071p
    public final boolean b(MenuItemC1066k menuItemC1066k) {
        Toolbar toolbar = this.f9853c;
        toolbar.c();
        ViewParent parent = toolbar.f2143h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2143h);
            }
            toolbar.addView(toolbar.f2143h);
        }
        View view = menuItemC1066k.z;
        if (view == null) {
            view = null;
        }
        toolbar.f2144i = view;
        this.f9852b = menuItemC1066k;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2144i);
            }
            n0 g3 = Toolbar.g();
            g3.f9859a = (toolbar.f2149n & 112) | 8388611;
            g3.f9860b = 2;
            toolbar.f2144i.setLayoutParams(g3);
            toolbar.addView(toolbar.f2144i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((n0) childAt.getLayoutParams()).f9860b != 2 && childAt != toolbar.f2137a) {
                toolbar.removeViewAt(childCount);
                toolbar.f2130E.add(childAt);
            }
        }
        toolbar.requestLayout();
        menuItemC1066k.f9617B = true;
        menuItemC1066k.f9630n.o(false);
        KeyEvent.Callback callback = toolbar.f2144i;
        if (callback instanceof InterfaceC1048a) {
            SearchView searchView = (SearchView) ((InterfaceC1048a) callback);
            if (!searchView.f2072W) {
                searchView.f2072W = true;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f2079p;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f2073a0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        return true;
    }

    @Override // k.InterfaceC1071p
    public final boolean c(SubMenuC1075t subMenuC1075t) {
        return false;
    }

    @Override // k.InterfaceC1071p
    public final boolean e(MenuItemC1066k menuItemC1066k) {
        Toolbar toolbar = this.f9853c;
        KeyEvent.Callback callback = toolbar.f2144i;
        if (callback instanceof InterfaceC1048a) {
            SearchView searchView = (SearchView) ((InterfaceC1048a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f2079p;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f2071V = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f2073a0);
            searchView.f2072W = false;
        }
        toolbar.removeView(toolbar.f2144i);
        toolbar.removeView(toolbar.f2143h);
        toolbar.f2144i = null;
        ArrayList arrayList = toolbar.f2130E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f9852b = null;
        toolbar.requestLayout();
        menuItemC1066k.f9617B = false;
        menuItemC1066k.f9630n.o(false);
        return true;
    }

    @Override // k.InterfaceC1071p
    public final void f() {
        if (this.f9852b != null) {
            MenuC1065j menuC1065j = this.f9851a;
            if (menuC1065j != null) {
                int size = menuC1065j.f.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (this.f9851a.getItem(i3) == this.f9852b) {
                        return;
                    }
                }
            }
            e(this.f9852b);
        }
    }

    @Override // k.InterfaceC1071p
    public final void i(Context context, MenuC1065j menuC1065j) {
        MenuItemC1066k menuItemC1066k;
        MenuC1065j menuC1065j2 = this.f9851a;
        if (menuC1065j2 != null && (menuItemC1066k = this.f9852b) != null) {
            menuC1065j2.d(menuItemC1066k);
        }
        this.f9851a = menuC1065j;
    }

    @Override // k.InterfaceC1071p
    public final boolean j() {
        return false;
    }

    @Override // k.InterfaceC1071p
    public final void a(MenuC1065j menuC1065j, boolean z) {
    }
}
