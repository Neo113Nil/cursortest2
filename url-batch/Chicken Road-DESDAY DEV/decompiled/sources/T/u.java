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
import j.AbstractC0140a;
import j0.AbstractC0143a;
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
import k.MenuC0145B;
import k.MenuC0161m;
import k.MenuItemC0168t;
import l.C0207a0;

/* loaded from: classes.dex */
public final class u implements G.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f801a;

    /* renamed from: b, reason: collision with root package name */
    public Object f802b;

    /* renamed from: c, reason: collision with root package name */
    public Object f803c;
    public Object d;

    public u(int i) {
        switch (i) {
            case 4:
                this.f801a = new o.b();
                this.f802b = new SparseArray();
                this.f803c = new o.e();
                this.d = new o.b();
                break;
            case 5:
                this.f802b = new ArrayDeque();
                this.f803c = new ArrayDeque();
                this.d = new ArrayDeque();
                break;
            case 6:
                this.d = new LinkedHashMap();
                this.f802b = "GET";
                this.f803c = new C0207a0(2);
                break;
            case 7:
                this.f801a = new J.b(10);
                this.f802b = new o.k();
                this.f803c = new ArrayList();
                this.d = new HashSet();
                break;
            default:
                this.f801a = new ArrayList();
                this.f802b = new HashMap();
                this.f803c = new HashMap();
                break;
        }
    }

    public void a(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (((ArrayList) this.f801a).contains(abstractComponentCallbacksC0048q)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0048q);
        }
        synchronized (((ArrayList) this.f801a)) {
            ((ArrayList) this.f801a).add(abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f1047k = true;
    }

    public H.e b() {
        Map unmodifiableMap;
        m1.l lVar = (m1.l) this.f801a;
        if (lVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f802b;
        m1.j g2 = ((C0207a0) this.f803c).g();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        byte[] bArr = n1.b.f3286a;
        b1.d.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = T0.r.f830a;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            b1.d.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new H.e(lVar, str, g2, null, unmodifiableMap);
    }

    public void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((o.k) this.f802b).getOrDefault(obj, null);
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
        O o2 = (O) ((HashMap) this.f802b).get(str);
        if (o2 != null) {
            return o2.f930c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0048q e(String str) {
        for (O o2 : ((HashMap) this.f802b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f930c;
                if (!str.equals(abstractComponentCallbacksC0048q.f1043e)) {
                    abstractComponentCallbacksC0048q = abstractComponentCallbacksC0048q.f1056t.f885c.e(str);
                }
                if (abstractComponentCallbacksC0048q != null) {
                    return abstractComponentCallbacksC0048q;
                }
            }
        }
        return null;
    }

    public void f(q1.g gVar) {
        b1.d.e(gVar, "call");
        gVar.f3469b.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.f803c;
        synchronized (this) {
            if (!arrayDeque.remove(gVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        r();
    }

    public j.e g(AbstractC0140a abstractC0140a) {
        ArrayList arrayList = (ArrayList) this.f803c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j.e eVar = (j.e) arrayList.get(i);
            if (eVar != null && eVar.f2485b == abstractC0140a) {
                return eVar;
            }
        }
        j.e eVar2 = new j.e((Context) this.f802b, abstractC0140a);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f802b).values()) {
            if (o2 != null) {
                arrayList.add(o2);
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f802b).values()) {
            if (o2 != null) {
                arrayList.add(o2.f930c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List j() {
        ArrayList arrayList;
        if (((ArrayList) this.f801a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f801a)) {
            arrayList = new ArrayList((ArrayList) this.f801a);
        }
        return arrayList;
    }

    public void k(String str, String str2) {
        b1.d.e(str2, "value");
        C0207a0 c0207a0 = (C0207a0) this.f803c;
        c0207a0.getClass();
        AbstractC0143a.d(str);
        AbstractC0143a.e(str2, str);
        c0207a0.h(str);
        c0207a0.f(str, str2);
    }

    @Override // G.b
    public void l() {
        View view = (View) this.f801a;
        view.clearAnimation();
        ((ViewGroup) this.f802b).endViewTransition(view);
        ((C0037f) this.f803c).d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((U) this.d) + " has been cancelled.");
        }
    }

    public void m(O o2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f930c;
        String str = abstractComponentCallbacksC0048q.f1043e;
        HashMap hashMap = (HashMap) this.f802b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0048q.f1043e, o2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0048q);
        }
    }

    public void n(O o2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f930c;
        if (abstractComponentCallbacksC0048q.f1023A) {
            ((L) this.d).e(abstractComponentCallbacksC0048q);
        }
        if (((O) ((HashMap) this.f802b).put(abstractComponentCallbacksC0048q.f1043e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0048q);
        }
    }

    public void o(String str, k0.k kVar) {
        b1.d.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (kVar == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
            }
        } else if (!k0.k.o(str)) {
            throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
        }
        this.f802b = str;
    }

    public boolean p(AbstractC0140a abstractC0140a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f801a).onActionItemClicked(g(abstractC0140a), new MenuItemC0168t((Context) this.f802b, (E.a) menuItem));
    }

    public boolean q(AbstractC0140a abstractC0140a, MenuC0161m menuC0161m) {
        j.e g2 = g(abstractC0140a);
        o.k kVar = (o.k) this.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0161m, null);
        if (menu == null) {
            menu = new MenuC0145B((Context) this.f802b, menuC0161m);
            kVar.put(menuC0161m, menu);
        }
        return ((ActionMode.Callback) this.f801a).onCreateActionMode(g2, menu);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = n1.b.f3286a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f802b).iterator();
                b1.d.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    q1.g gVar = (q1.g) it.next();
                    if (((ArrayDeque) this.f803c).size() >= 64) {
                        break;
                    }
                    if (gVar.f3469b.get() < 5) {
                        it.remove();
                        gVar.f3469b.incrementAndGet();
                        arrayList.add(gVar);
                        ((ArrayDeque) this.f803c).add(gVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f803c).size();
                    ((ArrayDeque) this.d).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    q1.g gVar2 = (q1.g) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f801a) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = n1.b.f3291g + " Dispatcher";
                                b1.d.e(str, "name");
                                this.f801a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new n1.a(str, false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f801a;
                            b1.d.b(threadPoolExecutor);
                        } finally {
                        }
                    }
                    gVar2.getClass();
                    q1.j jVar = gVar2.f3470c;
                    byte[] bArr2 = n1.b.f3286a;
                    try {
                        try {
                            threadPoolExecutor.execute(gVar2);
                        } catch (RejectedExecutionException e2) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e2);
                            jVar.h(interruptedIOException);
                            gVar2.f3468a.B(jVar, interruptedIOException);
                            jVar.f3473a.f3211a.f(gVar2);
                        }
                    } catch (Throwable th) {
                        jVar.f3473a.f3211a.f(gVar2);
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

    public u(Typeface typeface, U.b bVar) {
        int i;
        int i2;
        this.d = typeface;
        this.f801a = bVar;
        this.f803c = new t(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i3 = a2 + bVar.f359a;
            i = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f802b = new char[i * 2];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i4 = a3 + bVar.f359a;
            i2 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            x xVar = new x(this, i5);
            U.a c2 = xVar.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.d).getInt(a4 + c2.f359a) : 0, (char[]) this.f802b, i5 * 2);
            u1.l.i("invalid metadata codepoint length", xVar.b() > 0);
            ((t) this.f803c).a(xVar, 0, xVar.b() - 1);
        }
    }
}
