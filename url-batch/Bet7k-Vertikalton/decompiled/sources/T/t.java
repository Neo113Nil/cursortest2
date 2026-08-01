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
import j.AbstractC0137a;
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
import k.MenuC0141B;
import k.MenuC0157m;
import k.MenuItemC0164t;

/* loaded from: classes.dex */
public final class t implements G.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f747a;

    /* renamed from: b, reason: collision with root package name */
    public Object f748b;

    /* renamed from: c, reason: collision with root package name */
    public Object f749c;
    public Object d;

    public t(int i) {
        switch (i) {
            case 3:
                this.f748b = new ArrayDeque();
                this.f749c = new ArrayDeque();
                this.d = new ArrayDeque();
                break;
            case 4:
                this.d = new LinkedHashMap();
                this.f748b = "GET";
                this.f749c = new B0.d(27);
                break;
            case 5:
            default:
                this.f747a = new ArrayList();
                this.f748b = new HashMap();
                this.f749c = new HashMap();
                break;
            case 6:
                this.f747a = new o.b();
                this.f748b = new SparseArray();
                this.f749c = new o.e();
                this.d = new o.b();
                break;
            case 7:
                this.f747a = new J.b(10);
                this.f748b = new o.k();
                this.f749c = new ArrayList();
                this.d = new HashSet();
                break;
        }
    }

    public void a(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (((ArrayList) this.f747a).contains(abstractComponentCallbacksC0048q)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0048q);
        }
        synchronized (((ArrayList) this.f747a)) {
            ((ArrayList) this.f747a).add(abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f975k = true;
    }

    public H.e b() {
        Map unmodifiableMap;
        i1.m mVar = (i1.m) this.f747a;
        if (mVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f748b;
        i1.k r2 = ((B0.d) this.f749c).r();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        byte[] bArr = j1.b.f2603a;
        X0.d.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = Q0.r.f671a;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            X0.d.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new H.e(mVar, str, r2, null, unmodifiableMap);
    }

    public void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((o.k) this.f748b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                c(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public AbstractComponentCallbacksC0048q d(String str) {
        O o2 = (O) ((HashMap) this.f748b).get(str);
        if (o2 != null) {
            return o2.f858c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0048q e(String str) {
        for (O o2 : ((HashMap) this.f748b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f858c;
                if (!str.equals(abstractComponentCallbacksC0048q.f971e)) {
                    abstractComponentCallbacksC0048q = abstractComponentCallbacksC0048q.f984t.f813c.e(str);
                }
                if (abstractComponentCallbacksC0048q != null) {
                    return abstractComponentCallbacksC0048q;
                }
            }
        }
        return null;
    }

    public void f(m1.g gVar) {
        X0.d.e(gVar, "call");
        gVar.f3224b.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.f749c;
        synchronized (this) {
            if (!arrayDeque.remove(gVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        r();
    }

    public j.e g(AbstractC0137a abstractC0137a) {
        ArrayList arrayList = (ArrayList) this.f749c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j.e eVar = (j.e) arrayList.get(i);
            if (eVar != null && eVar.f2556b == abstractC0137a) {
                return eVar;
            }
        }
        j.e eVar2 = new j.e((Context) this.f748b, abstractC0137a);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f748b).values()) {
            if (o2 != null) {
                arrayList.add(o2);
            }
        }
        return arrayList;
    }

    @Override // G.b
    public void i() {
        View view = (View) this.f747a;
        view.clearAnimation();
        ((ViewGroup) this.f748b).endViewTransition(view);
        ((C0037f) this.f749c).d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((U) this.d) + " has been cancelled.");
        }
    }

    public ArrayList j() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f748b).values()) {
            if (o2 != null) {
                arrayList.add(o2.f858c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List k() {
        ArrayList arrayList;
        if (((ArrayList) this.f747a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f747a)) {
            arrayList = new ArrayList((ArrayList) this.f747a);
        }
        return arrayList;
    }

    public void l(String str, String str2) {
        X0.d.e(str2, "value");
        B0.d dVar = (B0.d) this.f749c;
        dVar.getClass();
        q1.l.h(str);
        q1.l.k(str2, str);
        dVar.A(str);
        dVar.q(str, str2);
    }

    public void m(O o2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f858c;
        String str = abstractComponentCallbacksC0048q.f971e;
        HashMap hashMap = (HashMap) this.f748b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0048q.f971e, o2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0048q);
        }
    }

    public void n(O o2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f858c;
        if (abstractComponentCallbacksC0048q.f951A) {
            ((L) this.d).e(abstractComponentCallbacksC0048q);
        }
        if (((O) ((HashMap) this.f748b).put(abstractComponentCallbacksC0048q.f971e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0048q);
        }
    }

    public void o(String str, i1.s sVar) {
        X0.d.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (sVar == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
            }
        } else if (!i1.s.o(str)) {
            throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
        }
        this.f748b = str;
    }

    public boolean p(AbstractC0137a abstractC0137a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f747a).onActionItemClicked(g(abstractC0137a), new MenuItemC0164t((Context) this.f748b, (E.a) menuItem));
    }

    public boolean q(AbstractC0137a abstractC0137a, MenuC0157m menuC0157m) {
        j.e g2 = g(abstractC0137a);
        o.k kVar = (o.k) this.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0157m, null);
        if (menu == null) {
            menu = new MenuC0141B((Context) this.f748b, menuC0157m);
            kVar.put(menuC0157m, menu);
        }
        return ((ActionMode.Callback) this.f747a).onCreateActionMode(g2, menu);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = j1.b.f2603a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f748b).iterator();
                X0.d.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    m1.g gVar = (m1.g) it.next();
                    if (((ArrayDeque) this.f749c).size() >= 64) {
                        break;
                    }
                    if (gVar.f3224b.get() < 5) {
                        it.remove();
                        gVar.f3224b.incrementAndGet();
                        arrayList.add(gVar);
                        ((ArrayDeque) this.f749c).add(gVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f749c).size();
                    ((ArrayDeque) this.d).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    m1.g gVar2 = (m1.g) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f747a) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = j1.b.f2607f + " Dispatcher";
                                X0.d.e(str, "name");
                                this.f747a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new j1.a(str, false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f747a;
                            X0.d.b(threadPoolExecutor);
                        } finally {
                        }
                    }
                    gVar2.getClass();
                    m1.j jVar = gVar2.f3225c;
                    byte[] bArr2 = j1.b.f2603a;
                    try {
                        try {
                            threadPoolExecutor.execute(gVar2);
                        } catch (RejectedExecutionException e2) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e2);
                            jVar.h(interruptedIOException);
                            gVar2.f3223a.x(jVar, interruptedIOException);
                            jVar.f3228a.f2478a.f(gVar2);
                        }
                    } catch (Throwable th) {
                        jVar.f3228a.f2478a.f(gVar2);
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

    public t(Typeface typeface, U.b bVar) {
        int i;
        int i2;
        this.d = typeface;
        this.f747a = bVar;
        this.f749c = new s(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i3 = a2 + bVar.f371a;
            i = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f748b = new char[i * 2];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i4 = a3 + bVar.f371a;
            i2 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            w wVar = new w(this, i5);
            U.a c2 = wVar.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.d).getInt(a4 + c2.f371a) : 0, (char[]) this.f748b, i5 * 2);
            q1.l.f("invalid metadata codepoint length", wVar.b() > 0);
            ((s) this.f749c).a(wVar, 0, wVar.b() - 1);
        }
    }
}
