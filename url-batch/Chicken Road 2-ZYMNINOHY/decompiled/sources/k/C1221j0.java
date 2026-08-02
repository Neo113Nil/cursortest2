package k;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import i.InterfaceC0450a;
import java.util.ArrayList;

/* renamed from: k.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1221j0 implements j.p {

    /* renamed from: a, reason: collision with root package name */
    public j.j f14033a;

    /* renamed from: b, reason: collision with root package name */
    public j.k f14034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f14035c;

    public C1221j0(Toolbar toolbar) {
        this.f14035c = toolbar;
    }

    @Override // j.p
    public final boolean a(j.k kVar) {
        Toolbar toolbar = this.f14035c;
        toolbar.c();
        ViewParent parent = toolbar.f4477h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f4477h);
            }
            toolbar.addView(toolbar.f4477h);
        }
        View view = kVar.z;
        if (view == null) {
            view = null;
        }
        toolbar.f4478i = view;
        this.f14034b = kVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f4478i);
            }
            C1223k0 g4 = Toolbar.g();
            g4.f14042a = (toolbar.n & 112) | 8388611;
            g4.f14043b = 2;
            toolbar.f4478i.setLayoutParams(g4);
            toolbar.addView(toolbar.f4478i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C1223k0) childAt.getLayoutParams()).f14043b != 2 && childAt != toolbar.f4470a) {
                toolbar.removeViewAt(childCount);
                toolbar.f4463E.add(childAt);
            }
        }
        toolbar.requestLayout();
        kVar.f13667B = true;
        kVar.n.o(false);
        KeyEvent.Callback callback = toolbar.f4478i;
        if (callback instanceof InterfaceC0450a) {
            SearchView searchView = (SearchView) ((InterfaceC0450a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f4411p;
            if (!searchView.f4404W) {
                searchView.f4404W = true;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f4405a0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        return true;
    }

    @Override // j.p
    public final boolean b() {
        return false;
    }

    @Override // j.p
    public final boolean f(j.t tVar) {
        return false;
    }

    @Override // j.p
    public final void g() {
        if (this.f14034b != null) {
            j.j jVar = this.f14033a;
            if (jVar != null) {
                int size = jVar.f13652f.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (this.f14033a.getItem(i4) == this.f14034b) {
                        return;
                    }
                }
            }
            j(this.f14034b);
        }
    }

    @Override // j.p
    public final void i(Context context, j.j jVar) {
        j.k kVar;
        j.j jVar2 = this.f14033a;
        if (jVar2 != null && (kVar = this.f14034b) != null) {
            jVar2.d(kVar);
        }
        this.f14033a = jVar;
    }

    @Override // j.p
    public final boolean j(j.k kVar) {
        Toolbar toolbar = this.f14035c;
        KeyEvent.Callback callback = toolbar.f4478i;
        if (callback instanceof InterfaceC0450a) {
            SearchView searchView = (SearchView) ((InterfaceC0450a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f4411p;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f4403V = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f4405a0);
            searchView.f4404W = false;
        }
        toolbar.removeView(toolbar.f4478i);
        toolbar.removeView(toolbar.f4477h);
        toolbar.f4478i = null;
        ArrayList arrayList = toolbar.f4463E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f14034b = null;
        toolbar.requestLayout();
        kVar.f13667B = false;
        kVar.n.o(false);
        return true;
    }

    @Override // j.p
    public final void d(j.j jVar, boolean z) {
    }
}
