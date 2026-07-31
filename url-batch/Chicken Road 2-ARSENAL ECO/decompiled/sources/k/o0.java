package k;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import i.InterfaceC0414a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o0 implements j.p {

    /* renamed from: f, reason: collision with root package name */
    public j.j f5073f;

    /* renamed from: g, reason: collision with root package name */
    public j.k f5074g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Toolbar f5075h;

    public o0(Toolbar toolbar) {
        this.f5075h = toolbar;
    }

    @Override // j.p
    public final boolean c(j.k kVar) {
        Toolbar toolbar = this.f5075h;
        toolbar.c();
        ViewParent parent = toolbar.f3378m.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f3378m);
            }
            toolbar.addView(toolbar.f3378m);
        }
        View view = kVar.f4841z;
        if (view == null) {
            view = null;
        }
        toolbar.f3379n = view;
        this.f5074g = kVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f3379n);
            }
            p0 g7 = Toolbar.g();
            g7.f5078a = (toolbar.f3384s & 112) | 8388611;
            g7.f5079b = 2;
            toolbar.f3379n.setLayoutParams(g7);
            toolbar.addView(toolbar.f3379n);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((p0) childAt.getLayoutParams()).f5079b != 2 && childAt != toolbar.f3371f) {
                toolbar.removeViewAt(childCount);
                toolbar.f3364J.add(childAt);
            }
        }
        toolbar.requestLayout();
        kVar.f4816B = true;
        kVar.f4830n.o(false);
        KeyEvent.Callback callback = toolbar.f3379n;
        if (callback instanceof InterfaceC0414a) {
            SearchView searchView = (SearchView) ((InterfaceC0414a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f3346u;
            if (!searchView.e0) {
                searchView.e0 = true;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f3341f0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        return true;
    }

    @Override // j.p
    public final void d() {
        if (this.f5074g != null) {
            j.j jVar = this.f5073f;
            if (jVar != null) {
                int size = jVar.f4800f.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (this.f5073f.getItem(i7) == this.f5074g) {
                        return;
                    }
                }
            }
            i(this.f5074g);
        }
    }

    @Override // j.p
    public final void f(Context context, j.j jVar) {
        j.k kVar;
        j.j jVar2 = this.f5073f;
        if (jVar2 != null && (kVar = this.f5074g) != null) {
            jVar2.d(kVar);
        }
        this.f5073f = jVar;
    }

    @Override // j.p
    public final boolean g() {
        return false;
    }

    @Override // j.p
    public final boolean i(j.k kVar) {
        Toolbar toolbar = this.f5075h;
        KeyEvent.Callback callback = toolbar.f3379n;
        if (callback instanceof InterfaceC0414a) {
            SearchView searchView = (SearchView) ((InterfaceC0414a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f3346u;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f3340d0 = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f3341f0);
            searchView.e0 = false;
        }
        toolbar.removeView(toolbar.f3379n);
        toolbar.removeView(toolbar.f3378m);
        toolbar.f3379n = null;
        ArrayList arrayList = toolbar.f3364J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f5074g = null;
        toolbar.requestLayout();
        kVar.f4816B = false;
        kVar.f4830n.o(false);
        return true;
    }

    @Override // j.p
    public final boolean k(j.t tVar) {
        return false;
    }

    @Override // j.p
    public final void a(j.j jVar, boolean z5) {
    }
}
