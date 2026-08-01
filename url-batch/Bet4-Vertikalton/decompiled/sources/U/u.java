package U;

import Y.AbstractComponentCallbacksC0051q;
import Y.C0040f;
import Y.L;
import Y.O;
import Y.U;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import j.AbstractC0142a;
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
import k.MenuC0148B;
import k.MenuC0164m;
import k.MenuItemC0171t;
import l.Z;
import m.C0260a;

/* loaded from: classes.dex */
public final class u implements G.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f874a;

    /* renamed from: b, reason: collision with root package name */
    public Object f875b;

    /* renamed from: c, reason: collision with root package name */
    public Object f876c;
    public Object d;

    public u(int i) {
        switch (i) {
            case 4:
                this.f874a = new o.b();
                this.f875b = new SparseArray();
                this.f876c = new o.e();
                this.d = new o.b();
                break;
            case 5:
                this.f875b = new ArrayDeque();
                this.f876c = new ArrayDeque();
                this.d = new ArrayDeque();
                break;
            case 6:
                this.d = new LinkedHashMap();
                this.f875b = "GET";
                this.f876c = new Z(2);
                break;
            case 7:
                this.f874a = new J.b(10);
                this.f875b = new o.k();
                this.f876c = new ArrayList();
                this.d = new HashSet();
                break;
            default:
                this.f874a = new ArrayList();
                this.f875b = new HashMap();
                this.f876c = new HashMap();
                break;
        }
    }

    public void a(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        if (((ArrayList) this.f874a).contains(abstractComponentCallbacksC0051q)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0051q);
        }
        synchronized (((ArrayList) this.f874a)) {
            ((ArrayList) this.f874a).add(abstractComponentCallbacksC0051q);
        }
        abstractComponentCallbacksC0051q.f1107k = true;
    }

    public H.e b() {
        Map unmodifiableMap;
        o1.l lVar = (o1.l) this.f874a;
        if (lVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f875b;
        o1.j g2 = ((Z) this.f876c).g();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        byte[] bArr = p1.b.f3455a;
        d1.d.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = S0.q.f796a;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            d1.d.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new H.e(lVar, str, g2, (h1.d) null, unmodifiableMap);
    }

    public void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((o.k) this.f875b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                c(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public AbstractComponentCallbacksC0051q d(String str) {
        O o2 = (O) ((HashMap) this.f875b).get(str);
        if (o2 != null) {
            return o2.f990c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0051q e(String str) {
        for (O o2 : ((HashMap) this.f875b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = o2.f990c;
                if (!str.equals(abstractComponentCallbacksC0051q.f1103e)) {
                    abstractComponentCallbacksC0051q = abstractComponentCallbacksC0051q.f1116t.f945c.e(str);
                }
                if (abstractComponentCallbacksC0051q != null) {
                    return abstractComponentCallbacksC0051q;
                }
            }
        }
        return null;
    }

    public void f(s1.g gVar) {
        d1.d.e(gVar, "call");
        gVar.f3716b.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.f876c;
        synchronized (this) {
            if (!arrayDeque.remove(gVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        r();
    }

    public j.e g(AbstractC0142a abstractC0142a) {
        ArrayList arrayList = (ArrayList) this.f876c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j.e eVar = (j.e) arrayList.get(i);
            if (eVar != null && eVar.f2549b == abstractC0142a) {
                return eVar;
            }
        }
        j.e eVar2 = new j.e((Context) this.f875b, abstractC0142a);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f875b).values()) {
            if (o2 != null) {
                arrayList.add(o2);
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f875b).values()) {
            if (o2 != null) {
                arrayList.add(o2.f990c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List j() {
        ArrayList arrayList;
        if (((ArrayList) this.f874a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f874a)) {
            arrayList = new ArrayList((ArrayList) this.f874a);
        }
        return arrayList;
    }

    public void k(String str, String str2) {
        d1.d.e(str2, "value");
        Z z2 = (Z) this.f876c;
        z2.getClass();
        C0260a.a(str);
        C0260a.c(str2, str);
        z2.h(str);
        z2.f(str, str2);
    }

    @Override // G.b
    public void l() {
        View view = (View) this.f874a;
        view.clearAnimation();
        ((ViewGroup) this.f875b).endViewTransition(view);
        ((C0040f) this.f876c).d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((U) this.d) + " has been cancelled.");
        }
    }

    public void m(O o2) {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = o2.f990c;
        String str = abstractComponentCallbacksC0051q.f1103e;
        HashMap hashMap = (HashMap) this.f875b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0051q.f1103e, o2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0051q);
        }
    }

    public void n(O o2) {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = o2.f990c;
        if (abstractComponentCallbacksC0051q.f1083A) {
            ((L) this.d).e(abstractComponentCallbacksC0051q);
        }
        if (((O) ((HashMap) this.f875b).put(abstractComponentCallbacksC0051q.f1103e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0051q);
        }
    }

    public void o(String str, h1.d dVar) {
        d1.d.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (dVar == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
            }
        } else if (!C0260a.q(str)) {
            throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
        }
        this.f875b = str;
    }

    public boolean p(AbstractC0142a abstractC0142a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f874a).onActionItemClicked(g(abstractC0142a), new MenuItemC0171t((Context) this.f875b, (E.a) menuItem));
    }

    public boolean q(AbstractC0142a abstractC0142a, MenuC0164m menuC0164m) {
        j.e g2 = g(abstractC0142a);
        o.k kVar = (o.k) this.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0164m, null);
        if (menu == null) {
            menu = new MenuC0148B((Context) this.f875b, menuC0164m);
            kVar.put(menuC0164m, menu);
        }
        return ((ActionMode.Callback) this.f874a).onCreateActionMode(g2, menu);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = p1.b.f3455a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f875b).iterator();
                d1.d.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    s1.g gVar = (s1.g) it.next();
                    if (((ArrayDeque) this.f876c).size() >= 64) {
                        break;
                    }
                    if (gVar.f3716b.get() < 5) {
                        it.remove();
                        gVar.f3716b.incrementAndGet();
                        arrayList.add(gVar);
                        ((ArrayDeque) this.f876c).add(gVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f876c).size();
                    ((ArrayDeque) this.d).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    s1.g gVar2 = (s1.g) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f874a) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = p1.b.f3460g + " Dispatcher";
                                d1.d.e(str, "name");
                                this.f874a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new p1.a(str, false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f874a;
                            d1.d.b(threadPoolExecutor);
                        } finally {
                        }
                    }
                    gVar2.getClass();
                    s1.j jVar = gVar2.f3717c;
                    byte[] bArr2 = p1.b.f3455a;
                    try {
                        try {
                            threadPoolExecutor.execute(gVar2);
                        } catch (RejectedExecutionException e2) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e2);
                            jVar.h(interruptedIOException);
                            gVar2.f3715a.C(jVar, interruptedIOException);
                            jVar.f3720a.f3345a.f(gVar2);
                        }
                    } catch (Throwable th) {
                        jVar.f3720a.f3345a.f(gVar2);
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

    public u(Typeface typeface, V.b bVar) {
        int i;
        int i2;
        this.d = typeface;
        this.f874a = bVar;
        this.f876c = new t(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i3 = a2 + bVar.f413a;
            i = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f875b = new char[i * 2];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i4 = a3 + bVar.f413a;
            i2 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            x xVar = new x(this, i5);
            V.a c2 = xVar.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.d).getInt(a4 + c2.f413a) : 0, (char[]) this.f875b, i5 * 2);
            w1.d.j("invalid metadata codepoint length", xVar.b() > 0);
            ((t) this.f876c).a(xVar, 0, xVar.b() - 1);
        }
    }
}
