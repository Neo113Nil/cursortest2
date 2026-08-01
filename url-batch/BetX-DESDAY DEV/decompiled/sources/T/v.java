package T;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC0060q;
import androidx.fragment.app.C0049f;
import androidx.fragment.app.O;
import androidx.fragment.app.S;
import androidx.fragment.app.X;
import com.luckyarcade.spinthrow.GameConfig;
import j.AbstractC0170b;
import j.InterfaceC0169a;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.MenuC0186B;
import k.MenuC0202m;
import k.MenuItemC0209t;

/* loaded from: classes.dex */
public final class v implements G.c, InterfaceC0169a {

    /* renamed from: a, reason: collision with root package name */
    public Object f824a;

    /* renamed from: b, reason: collision with root package name */
    public Object f825b;

    /* renamed from: c, reason: collision with root package name */
    public Object f826c;

    /* renamed from: d, reason: collision with root package name */
    public Object f827d;

    public v(int i) {
        switch (i) {
            case GameConfig.COMBO_EVERY /* 3 */:
                this.f825b = new ArrayDeque();
                this.f826c = new ArrayDeque();
                this.f827d = new ArrayDeque();
                break;
            case 4:
                this.f827d = new LinkedHashMap();
                this.f825b = "GET";
                this.f826c = new B0.d(24);
                break;
            case 5:
            default:
                this.f824a = new ArrayList();
                this.f825b = new HashMap();
                this.f826c = new HashMap();
                break;
            case 6:
                this.f824a = new o.b();
                this.f825b = new SparseArray();
                this.f826c = new o.e();
                this.f827d = new o.b();
                break;
            case 7:
                this.f824a = new J.b(10);
                this.f825b = new o.k();
                this.f826c = new ArrayList();
                this.f827d = new HashSet();
                break;
        }
    }

    @Override // j.InterfaceC0169a
    public boolean a(AbstractC0170b abstractC0170b, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f824a).onActionItemClicked(k(abstractC0170b), new MenuItemC0209t((Context) this.f825b, (E.a) menuItem));
    }

    @Override // j.InterfaceC0169a
    public boolean b(AbstractC0170b abstractC0170b, MenuC0202m menuC0202m) {
        j.f k2 = k(abstractC0170b);
        o.k kVar = (o.k) this.f827d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0202m, null);
        if (menu == null) {
            menu = new MenuC0186B((Context) this.f825b, menuC0202m);
            kVar.put(menuC0202m, menu);
        }
        return ((ActionMode.Callback) this.f824a).onCreateActionMode(k2, menu);
    }

    public void c(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        if (((ArrayList) this.f824a).contains(abstractComponentCallbacksC0060q)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0060q);
        }
        synchronized (((ArrayList) this.f824a)) {
            ((ArrayList) this.f824a).add(abstractComponentCallbacksC0060q);
        }
        abstractComponentCallbacksC0060q.f1403k = true;
    }

    @Override // j.InterfaceC0169a
    public void d(AbstractC0170b abstractC0170b) {
        ((ActionMode.Callback) this.f824a).onDestroyActionMode(k(abstractC0170b));
    }

    @Override // j.InterfaceC0169a
    public boolean e(AbstractC0170b abstractC0170b, MenuC0202m menuC0202m) {
        j.f k2 = k(abstractC0170b);
        o.k kVar = (o.k) this.f827d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0202m, null);
        if (menu == null) {
            menu = new MenuC0186B((Context) this.f825b, menuC0202m);
            kVar.put(menuC0202m, menu);
        }
        return ((ActionMode.Callback) this.f824a).onPrepareActionMode(k2, menu);
    }

    public i1.w f() {
        Map unmodifiableMap;
        i1.p pVar = (i1.p) this.f824a;
        if (pVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f825b;
        i1.n y2 = ((B0.d) this.f826c).y();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f827d;
        byte[] bArr = j1.b.f2971a;
        X0.f.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = O0.r.f696a;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            X0.f.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new i1.w(pVar, str, y2, null, unmodifiableMap);
    }

    public void g(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((o.k) this.f825b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                g(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public AbstractComponentCallbacksC0060q h(String str) {
        S s2 = (S) ((HashMap) this.f825b).get(str);
        if (s2 != null) {
            return s2.f1275c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0060q i(String str) {
        for (S s2 : ((HashMap) this.f825b).values()) {
            if (s2 != null) {
                AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = s2.f1275c;
                if (!str.equals(abstractComponentCallbacksC0060q.f1399e)) {
                    abstractComponentCallbacksC0060q = abstractComponentCallbacksC0060q.f1412t.f1226c.i(str);
                }
                if (abstractComponentCallbacksC0060q != null) {
                    return abstractComponentCallbacksC0060q;
                }
            }
        }
        return null;
    }

    public void j(m1.g gVar) {
        X0.f.e(gVar, "call");
        gVar.f3569b.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.f826c;
        synchronized (this) {
            if (!arrayDeque.remove(gVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        t();
    }

    public j.f k(AbstractC0170b abstractC0170b) {
        ArrayList arrayList = (ArrayList) this.f826c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j.f fVar = (j.f) arrayList.get(i);
            if (fVar != null && fVar.f2825b == abstractC0170b) {
                return fVar;
            }
        }
        j.f fVar2 = new j.f((Context) this.f825b, abstractC0170b);
        arrayList.add(fVar2);
        return fVar2;
    }

    @Override // G.c
    public void l() {
        View view = (View) this.f824a;
        view.clearAnimation();
        ((ViewGroup) this.f825b).endViewTransition(view);
        ((C0049f) this.f826c).d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((X) this.f827d) + " has been cancelled.");
        }
    }

    public ArrayList m() {
        ArrayList arrayList = new ArrayList();
        for (S s2 : ((HashMap) this.f825b).values()) {
            if (s2 != null) {
                arrayList.add(s2);
            }
        }
        return arrayList;
    }

    public ArrayList n() {
        ArrayList arrayList = new ArrayList();
        for (S s2 : ((HashMap) this.f825b).values()) {
            if (s2 != null) {
                arrayList.add(s2.f1275c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List o() {
        ArrayList arrayList;
        if (((ArrayList) this.f824a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f824a)) {
            arrayList = new ArrayList((ArrayList) this.f824a);
        }
        return arrayList;
    }

    public void p(String str, String str2) {
        X0.f.e(str, "name");
        X0.f.e(str2, "value");
        B0.d dVar = (B0.d) this.f826c;
        dVar.getClass();
        i1.m.d(str);
        i1.m.e(str2, str);
        dVar.E(str);
        dVar.x(str, str2);
    }

    public void q(S s2) {
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = s2.f1275c;
        String str = abstractComponentCallbacksC0060q.f1399e;
        HashMap hashMap = (HashMap) this.f825b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0060q.f1399e, s2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0060q);
        }
    }

    public void r(S s2) {
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = s2.f1275c;
        if (abstractComponentCallbacksC0060q.f1378A) {
            ((O) this.f827d).e(abstractComponentCallbacksC0060q);
        }
        if (((S) ((HashMap) this.f825b).put(abstractComponentCallbacksC0060q.f1399e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0060q);
        }
    }

    public void s(String str, i1.r rVar) {
        X0.f.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (rVar == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
            }
        } else if (!i1.r.n(str)) {
            throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
        }
        this.f825b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = j1.b.f2971a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f825b).iterator();
                X0.f.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    m1.g gVar = (m1.g) it.next();
                    if (((ArrayDeque) this.f826c).size() >= 64) {
                        break;
                    }
                    if (gVar.f3569b.get() < 5) {
                        it.remove();
                        gVar.f3569b.incrementAndGet();
                        arrayList.add(gVar);
                        ((ArrayDeque) this.f826c).add(gVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f826c).size();
                    ((ArrayDeque) this.f827d).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    m1.g gVar2 = (m1.g) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f824a) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = j1.b.f2977g + " Dispatcher";
                                X0.f.e(str, "name");
                                this.f824a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new j1.a(str, false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f824a;
                            X0.f.b(threadPoolExecutor);
                        } finally {
                        }
                    }
                    gVar2.getClass();
                    m1.j jVar = gVar2.f3570c;
                    byte[] bArr2 = j1.b.f2971a;
                    try {
                        try {
                            threadPoolExecutor.execute(gVar2);
                        } catch (RejectedExecutionException e2) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e2);
                            jVar.h(interruptedIOException);
                            gVar2.f3568a.onFailure(jVar, interruptedIOException);
                            jVar.f3573a.f2750a.j(gVar2);
                        }
                    } catch (Throwable th) {
                        jVar.f3573a.f2750a.j(gVar2);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        size = arrayList.size();
        while (i < size) {
        }
    }

    public v(Typeface typeface, U.b bVar) {
        int i;
        int i2;
        this.f827d = typeface;
        this.f824a = bVar;
        this.f826c = new u(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i3 = a2 + bVar.f407a;
            i = ((ByteBuffer) bVar.f410d).getInt(((ByteBuffer) bVar.f410d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f825b = new char[i * 2];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i4 = a3 + bVar.f407a;
            i2 = ((ByteBuffer) bVar.f410d).getInt(((ByteBuffer) bVar.f410d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            y yVar = new y(this, i5);
            U.a c2 = yVar.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.f410d).getInt(a4 + c2.f407a) : 0, (char[]) this.f825b, i5 * 2);
            q1.d.f("invalid metadata codepoint length", yVar.b() > 0);
            ((u) this.f826c).a(yVar, 0, yVar.b() - 1);
        }
    }
}
