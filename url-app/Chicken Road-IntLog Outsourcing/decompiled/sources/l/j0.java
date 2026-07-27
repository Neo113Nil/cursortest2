package l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import j.InterfaceC1194a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j0 implements k.o {

    /* renamed from: a, reason: collision with root package name */
    public k.i f10892a;

    /* renamed from: b, reason: collision with root package name */
    public k.j f10893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f10894c;

    public j0(Toolbar toolbar) {
        this.f10894c = toolbar;
    }

    @Override // k.o
    public final boolean b(k.j jVar) {
        Toolbar toolbar = this.f10894c;
        toolbar.c();
        ViewParent parent = toolbar.f4274h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f4274h);
            }
            toolbar.addView(toolbar.f4274h);
        }
        View view = jVar.z;
        if (view == null) {
            view = null;
        }
        toolbar.f4275i = view;
        this.f10893b = jVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f4275i);
            }
            k0 g6 = Toolbar.g();
            g6.f10901a = (toolbar.f4280n & 112) | 8388611;
            g6.f10902b = 2;
            toolbar.f4275i.setLayoutParams(g6);
            toolbar.addView(toolbar.f4275i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((k0) childAt.getLayoutParams()).f10902b != 2 && childAt != toolbar.f4267a) {
                toolbar.removeViewAt(childCount);
                toolbar.f4260E.add(childAt);
            }
        }
        toolbar.requestLayout();
        jVar.f10607B = true;
        jVar.f10621n.o(false);
        KeyEvent.Callback callback = toolbar.f4275i;
        if (callback instanceof InterfaceC1194a) {
            SearchView searchView = (SearchView) ((InterfaceC1194a) callback);
            if (!searchView.f4197g0) {
                searchView.f4197g0 = true;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f4203p;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f4198h0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        return true;
    }

    @Override // k.o
    public final boolean c(k.s sVar) {
        return false;
    }

    @Override // k.o
    public final boolean e(k.j jVar) {
        Toolbar toolbar = this.f10894c;
        KeyEvent.Callback callback = toolbar.f4275i;
        if (callback instanceof InterfaceC1194a) {
            SearchView searchView = (SearchView) ((InterfaceC1194a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f4203p;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f4196f0 = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f4198h0);
            searchView.f4197g0 = false;
        }
        toolbar.removeView(toolbar.f4275i);
        toolbar.removeView(toolbar.f4274h);
        toolbar.f4275i = null;
        ArrayList arrayList = toolbar.f4260E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f10893b = null;
        toolbar.requestLayout();
        jVar.f10607B = false;
        jVar.f10621n.o(false);
        return true;
    }

    @Override // k.o
    public final void f() {
        if (this.f10893b != null) {
            k.i iVar = this.f10892a;
            if (iVar != null) {
                int size = iVar.f10591f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f10892a.getItem(i2) == this.f10893b) {
                        return;
                    }
                }
            }
            e(this.f10893b);
        }
    }

    @Override // k.o
    public final void i(Context context, k.i iVar) {
        k.j jVar;
        k.i iVar2 = this.f10892a;
        if (iVar2 != null && (jVar = this.f10893b) != null) {
            iVar2.d(jVar);
        }
        this.f10892a = iVar;
    }

    @Override // k.o
    public final boolean j() {
        return false;
    }

    @Override // k.o
    public final void a(k.i iVar, boolean z) {
    }
}
