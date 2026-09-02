package a0;

import a.c0;
import a.e0;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.emoji2.text.w;
import androidx.emoji2.text.z;
import androidx.fragment.app.k0;
import androidx.fragment.app.m0;
import androidx.fragment.app.q0;
import androidx.fragment.app.u;
import androidx.fragment.app.v0;
import androidx.fragment.app.w0;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import k.b0;
import k.m;
import k.t;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class j implements j0.b {

    /* renamed from: f, reason: collision with root package name */
    public final Object f100f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f101g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f102h;
    public Object i;

    public j(int i) {
        switch (i) {
            case 3:
                this.f102h = new ArrayList();
                this.f100f = new HashMap();
                this.f101g = new HashMap();
                break;
            case 6:
                this.f100f = new q.f(0);
                this.f101g = new SparseArray();
                this.f102h = new q.h();
                this.i = new q.f(0);
                break;
            default:
                this.f100f = new m0.b(10);
                this.f101g = new q.j(0);
                this.f102h = new ArrayList();
                this.i = new HashSet();
                break;
        }
    }

    public void a(u uVar) {
        if (((ArrayList) this.f102h).contains(uVar)) {
            throw new IllegalStateException("Fragment already added: " + uVar);
        }
        synchronized (((ArrayList) this.f102h)) {
            ((ArrayList) this.f102h).add(uVar);
        }
        uVar.f544p = true;
    }

    public void b(c1.d dVar) {
        if (((LinkedHashSet) this.i).add(dVar)) {
            ((c1.e) this.f101g).a(this, dVar, -1);
        }
    }

    public void c(c1.j jVar, int i) {
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException(w0.d("Unsupported priority value: ", i).toString());
        }
        if (((LinkedHashSet) this.i).add(jVar)) {
            ((c1.e) this.f101g).a(this, jVar, i);
        }
    }

    public void d(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((q.j) this.f101g).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                d(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void e(c1.d dVar, c1.b bVar) {
        c1.e eVar = (c1.e) this.f101g;
        eVar.getClass();
        if (eVar.f770g != 0) {
            return;
        }
        c0 c4 = eVar.c(-1);
        eVar.f769f = c4;
        eVar.f770g = -1;
        eVar.f771h = dVar;
        if (bVar != null) {
            if (c4 != null) {
                c4.d.getClass();
            }
            eVar.f765a.b(new c1.g(bVar));
        }
    }

    public u f(String str) {
        q0 q0Var = (q0) ((HashMap) this.f100f).get(str);
        if (q0Var != null) {
            return q0Var.f511c;
        }
        return null;
    }

    public u g(String str) {
        for (q0 q0Var : ((HashMap) this.f100f).values()) {
            if (q0Var != null) {
                u uVar = q0Var.f511c;
                if (!str.equals(uVar.f538j)) {
                    uVar = uVar.f553y.f443c.g(str);
                }
                if (uVar != null) {
                    return uVar;
                }
            }
        }
        return null;
    }

    public j.e h(j.a aVar) {
        ArrayList arrayList = (ArrayList) this.f102h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j.e eVar = (j.e) arrayList.get(i);
            if (eVar != null && eVar.f1844b == aVar) {
                return eVar;
            }
        }
        j.e eVar2 = new j.e((Context) this.i, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : ((HashMap) this.f100f).values()) {
            if (q0Var != null) {
                arrayList.add(q0Var);
            }
        }
        return arrayList;
    }

    public ArrayList j() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : ((HashMap) this.f100f).values()) {
            if (q0Var != null) {
                arrayList.add(q0Var.f511c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List k() {
        ArrayList arrayList;
        if (((ArrayList) this.f102h).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f102h)) {
            arrayList = new ArrayList((ArrayList) this.f102h);
        }
        return arrayList;
    }

    public void l(q0 q0Var) {
        u uVar = q0Var.f511c;
        String str = uVar.f538j;
        HashMap hashMap = (HashMap) this.f100f;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(uVar.f538j, q0Var);
        if (k0.E(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + uVar);
        }
    }

    public void m(q0 q0Var) {
        u uVar = q0Var.f511c;
        if (uVar.F) {
            ((m0) this.i).e(uVar);
        }
        if (((q0) ((HashMap) this.f100f).put(uVar.f538j, null)) != null && k0.E(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + uVar);
        }
    }

    public boolean n(j.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f100f).onActionItemClicked(h(aVar), new t((Context) this.i, (h0.a) menuItem));
    }

    public boolean o(j.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f100f;
        j.e h4 = h(aVar);
        q.j jVar = (q.j) this.f101g;
        Menu menu2 = (Menu) jVar.get(menu);
        if (menu2 == null) {
            menu2 = new b0((Context) this.i, (m) menu);
            jVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(h4, menu2);
    }

    @Override // j0.b
    public void onCancel() {
        View view = (View) this.f100f;
        view.clearAnimation();
        ((ViewGroup) this.f101g).endViewTransition(view);
        ((androidx.fragment.app.i) this.f102h).d();
        if (k0.E(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((v0) this.i) + " has been cancelled.");
        }
    }

    public j(ScrollView scrollView, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, TextView textView2) {
        this.f100f = recyclerView;
        this.f101g = recyclerView2;
        this.f102h = textView;
        this.i = textView2;
    }

    public j(e0 e0Var) {
        this.f100f = e0Var;
        this.f101g = new c1.e();
        new LinkedHashSet();
        this.f102h = new LinkedHashSet();
        this.i = new LinkedHashSet();
    }

    public j(Typeface typeface, v0.b bVar) {
        int i;
        int i4;
        int i5;
        int i6;
        this.i = typeface;
        this.f100f = bVar;
        this.f102h = new w(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i7 = a2 + bVar.f2710a;
            i = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i7) + i7);
        } else {
            i = 0;
        }
        this.f101g = new char[i * 2];
        int a4 = bVar.a(6);
        if (a4 != 0) {
            int i8 = a4 + bVar.f2710a;
            i4 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i8) + i8);
        } else {
            i4 = 0;
        }
        for (int i9 = 0; i9 < i4; i9++) {
            z zVar = new z(this, i9);
            v0.a b4 = zVar.b();
            int a5 = b4.a(4);
            Character.toChars(a5 != 0 ? ((ByteBuffer) b4.d).getInt(a5 + b4.f2710a) : 0, (char[]) this.f101g, i9 * 2);
            v0.a b5 = zVar.b();
            int a6 = b5.a(16);
            if (a6 != 0) {
                int i10 = a6 + b5.f2710a;
                i5 = ((ByteBuffer) b5.d).getInt(((ByteBuffer) b5.d).getInt(i10) + i10);
            } else {
                i5 = 0;
            }
            h.a.k(i5 > 0, "invalid metadata codepoint length");
            w wVar = (w) this.f102h;
            v0.a b6 = zVar.b();
            int a7 = b6.a(16);
            if (a7 != 0) {
                int i11 = a7 + b6.f2710a;
                i6 = ((ByteBuffer) b6.d).getInt(((ByteBuffer) b6.d).getInt(i11) + i11);
            } else {
                i6 = 0;
            }
            wVar.a(zVar, 0, i6 - 1);
        }
    }

    public j(Context context, ActionMode.Callback callback) {
        this.i = context;
        this.f100f = callback;
        this.f102h = new ArrayList();
        this.f101g = new q.j(0);
    }

    public j(View view, ViewGroup viewGroup, androidx.fragment.app.i iVar, v0 v0Var) {
        this.f100f = view;
        this.f101g = viewGroup;
        this.f102h = iVar;
        this.i = v0Var;
    }
}
