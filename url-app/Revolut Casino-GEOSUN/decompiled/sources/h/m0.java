package h;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import f.InterfaceC0124a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m0 implements g.p {

    /* renamed from: e, reason: collision with root package name */
    public g.j f2236e;

    /* renamed from: f, reason: collision with root package name */
    public g.k f2237f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2238g;

    public m0(Toolbar toolbar) {
        this.f2238g = toolbar;
    }

    @Override // g.p
    public final void b() {
        if (this.f2237f != null) {
            g.j jVar = this.f2236e;
            if (jVar != null) {
                int size = jVar.f1981f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f2236e.getItem(i2) == this.f2237f) {
                        return;
                    }
                }
            }
            k(this.f2237f);
        }
    }

    @Override // g.p
    public final boolean d(g.t tVar) {
        return false;
    }

    @Override // g.p
    public final boolean h() {
        return false;
    }

    @Override // g.p
    public final void i(Context context, g.j jVar) {
        g.k kVar;
        g.j jVar2 = this.f2236e;
        if (jVar2 != null && (kVar = this.f2237f) != null) {
            jVar2.d(kVar);
        }
        this.f2236e = jVar;
    }

    @Override // g.p
    public final boolean j(g.k kVar) {
        Toolbar toolbar = this.f2238g;
        toolbar.c();
        ViewParent parent = toolbar.f1282l.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1282l);
            }
            toolbar.addView(toolbar.f1282l);
        }
        View view = kVar.f2021z;
        if (view == null) {
            view = null;
        }
        toolbar.f1283m = view;
        this.f2237f = kVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1283m);
            }
            n0 g2 = Toolbar.g();
            g2.f2245a = (toolbar.r & 112) | 8388611;
            g2.f2246b = 2;
            toolbar.f1283m.setLayoutParams(g2);
            toolbar.addView(toolbar.f1283m);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((n0) childAt.getLayoutParams()).f2246b != 2 && childAt != toolbar.f1275e) {
                toolbar.removeViewAt(childCount);
                toolbar.f1268I.add(childAt);
            }
        }
        toolbar.requestLayout();
        kVar.f1996B = true;
        kVar.f2010n.o(false);
        KeyEvent.Callback callback = toolbar.f1283m;
        if (callback instanceof InterfaceC0124a) {
            SearchView searchView = (SearchView) ((InterfaceC0124a) callback);
            if (!searchView.f1204d0) {
                searchView.f1204d0 = true;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f1210t;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f1205e0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        return true;
    }

    @Override // g.p
    public final boolean k(g.k kVar) {
        Toolbar toolbar = this.f2238g;
        KeyEvent.Callback callback = toolbar.f1283m;
        if (callback instanceof InterfaceC0124a) {
            SearchView searchView = (SearchView) ((InterfaceC0124a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f1210t;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f1203c0 = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f1205e0);
            searchView.f1204d0 = false;
        }
        toolbar.removeView(toolbar.f1283m);
        toolbar.removeView(toolbar.f1282l);
        toolbar.f1283m = null;
        ArrayList arrayList = toolbar.f1268I;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2237f = null;
        toolbar.requestLayout();
        kVar.f1996B = false;
        kVar.f2010n.o(false);
        return true;
    }

    @Override // g.p
    public final void a(g.j jVar, boolean z2) {
    }
}
