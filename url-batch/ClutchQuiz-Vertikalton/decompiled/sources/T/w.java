package T;

import X.AbstractComponentCallbacksC0048q;
import X.C0037f;
import X.L;
import X.O;
import X.U;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import j.AbstractC0147a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import k.MenuC0151B;
import k.MenuC0167m;
import k.MenuItemC0174t;

/* loaded from: classes.dex */
public final class w implements G.b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f845a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f846b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f847c;
    public Object d;

    public w(int i) {
        switch (i) {
            case 4:
                this.f845a = new o.b();
                this.f846b = new SparseArray();
                this.f847c = new o.e();
                this.d = new o.b();
                break;
            case 5:
                this.f845a = new J.b(10);
                this.f846b = new o.k();
                this.f847c = new ArrayList();
                this.d = new HashSet();
                break;
            default:
                this.f845a = new ArrayList();
                this.f846b = new HashMap();
                this.f847c = new HashMap();
                break;
        }
    }

    public void a(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (((ArrayList) this.f845a).contains(abstractComponentCallbacksC0048q)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0048q);
        }
        synchronized (((ArrayList) this.f845a)) {
            ((ArrayList) this.f845a).add(abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f1113k = true;
    }

    public void b(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((o.k) this.f846b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                b(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public AbstractComponentCallbacksC0048q c(String str) {
        O o2 = (O) ((HashMap) this.f846b).get(str);
        if (o2 != null) {
            return o2.f996c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0048q d(String str) {
        for (O o2 : ((HashMap) this.f846b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f996c;
                if (!str.equals(abstractComponentCallbacksC0048q.f1109e)) {
                    abstractComponentCallbacksC0048q = abstractComponentCallbacksC0048q.f1122t.f951c.d(str);
                }
                if (abstractComponentCallbacksC0048q != null) {
                    return abstractComponentCallbacksC0048q;
                }
            }
        }
        return null;
    }

    public j.e e(AbstractC0147a abstractC0147a) {
        ArrayList arrayList = (ArrayList) this.f847c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j.e eVar = (j.e) arrayList.get(i);
            if (eVar != null && eVar.f2602b == abstractC0147a) {
                return eVar;
            }
        }
        j.e eVar2 = new j.e((Context) this.f846b, abstractC0147a);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList f() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f846b).values()) {
            if (o2 != null) {
                arrayList.add(o2);
            }
        }
        return arrayList;
    }

    public ArrayList g() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f846b).values()) {
            if (o2 != null) {
                arrayList.add(o2.f996c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List h() {
        ArrayList arrayList;
        if (((ArrayList) this.f845a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f845a)) {
            arrayList = new ArrayList((ArrayList) this.f845a);
        }
        return arrayList;
    }

    public void i(O o2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f996c;
        String str = abstractComponentCallbacksC0048q.f1109e;
        HashMap hashMap = (HashMap) this.f846b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0048q.f1109e, o2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0048q);
        }
    }

    public void j(O o2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f996c;
        if (abstractComponentCallbacksC0048q.f1089A) {
            ((L) this.d).e(abstractComponentCallbacksC0048q);
        }
        if (((O) ((HashMap) this.f846b).put(abstractComponentCallbacksC0048q.f1109e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0048q);
        }
    }

    public boolean k(AbstractC0147a abstractC0147a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f845a).onActionItemClicked(e(abstractC0147a), new MenuItemC0174t((Context) this.f846b, (E.a) menuItem));
    }

    @Override // G.b
    public void l() {
        View view = (View) this.f845a;
        view.clearAnimation();
        ((ViewGroup) this.f846b).endViewTransition(view);
        ((C0037f) this.f847c).d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((U) this.d) + " has been cancelled.");
        }
    }

    public boolean m(AbstractC0147a abstractC0147a, MenuC0167m menuC0167m) {
        j.e e2 = e(abstractC0147a);
        o.k kVar = (o.k) this.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0167m, null);
        if (menu == null) {
            menu = new MenuC0151B((Context) this.f846b, menuC0167m);
            kVar.put(menuC0167m, menu);
        }
        return ((ActionMode.Callback) this.f845a).onCreateActionMode(e2, menu);
    }

    public w(Typeface typeface, U.b bVar) {
        int i;
        int i2;
        this.d = typeface;
        this.f845a = bVar;
        this.f847c = new v(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i3 = a2 + bVar.f355a;
            i = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f846b = new char[i * 2];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i4 = a3 + bVar.f355a;
            i2 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            z zVar = new z(this, i5);
            U.a c2 = zVar.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.d).getInt(a4 + c2.f355a) : 0, (char[]) this.f846b, i5 * 2);
            A.c.i(zVar.b() > 0, "invalid metadata codepoint length");
            ((v) this.f847c).a(zVar, 0, zVar.b() - 1);
        }
    }

    public w(Context context, ActionMode.Callback callback) {
        this.f846b = context;
        this.f845a = callback;
        this.f847c = new ArrayList();
        this.d = new o.k();
    }

    public w(C0037f c0037f, U u2, View view, ViewGroup viewGroup) {
        this.f845a = view;
        this.f846b = viewGroup;
        this.f847c = c0037f;
        this.d = u2;
    }
}
