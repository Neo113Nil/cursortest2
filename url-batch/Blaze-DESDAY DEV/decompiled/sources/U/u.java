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
import j.AbstractC0144a;
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
import k.MenuC0150B;
import k.MenuC0166m;
import k.MenuItemC0173t;
import k0.AbstractC0180a;

/* loaded from: classes.dex */
public final class u implements G.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f883a;

    /* renamed from: b, reason: collision with root package name */
    public Object f884b;

    /* renamed from: c, reason: collision with root package name */
    public Object f885c;
    public Object d;

    public u(int i) {
        switch (i) {
            case 4:
                this.f883a = new o.b();
                this.f884b = new SparseArray();
                this.f885c = new o.e();
                this.d = new o.b();
                break;
            case 5:
                this.f884b = new ArrayDeque();
                this.f885c = new ArrayDeque();
                this.d = new ArrayDeque();
                break;
            case 6:
                this.d = new LinkedHashMap();
                this.f884b = "GET";
                this.f885c = new r1.g(1);
                break;
            case 7:
                this.f883a = new J.b(10);
                this.f884b = new o.k();
                this.f885c = new ArrayList();
                this.d = new HashSet();
                break;
            default:
                this.f883a = new ArrayList();
                this.f884b = new HashMap();
                this.f885c = new HashMap();
                break;
        }
    }

    public void a(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        if (((ArrayList) this.f883a).contains(abstractComponentCallbacksC0051q)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0051q);
        }
        synchronized (((ArrayList) this.f883a)) {
            ((ArrayList) this.f883a).add(abstractComponentCallbacksC0051q);
        }
        abstractComponentCallbacksC0051q.f1134k = true;
    }

    public H.e b() {
        Map unmodifiableMap;
        r1.m mVar = (r1.m) this.f883a;
        if (mVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f884b;
        r1.k d = ((r1.g) this.f885c).d();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        byte[] bArr = s1.b.f3721a;
        g1.d.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = V0.q.f918a;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            g1.d.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new H.e(mVar, str, d, (AbstractC0180a) null, unmodifiableMap);
    }

    public void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((o.k) this.f884b).getOrDefault(obj, null);
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
        O o2 = (O) ((HashMap) this.f884b).get(str);
        if (o2 != null) {
            return o2.f1017c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0051q e(String str) {
        for (O o2 : ((HashMap) this.f884b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = o2.f1017c;
                if (!str.equals(abstractComponentCallbacksC0051q.f1130e)) {
                    abstractComponentCallbacksC0051q = abstractComponentCallbacksC0051q.f1143t.f972c.e(str);
                }
                if (abstractComponentCallbacksC0051q != null) {
                    return abstractComponentCallbacksC0051q;
                }
            }
        }
        return null;
    }

    public void f(v1.g gVar) {
        g1.d.e(gVar, "call");
        gVar.f4042b.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.f885c;
        synchronized (this) {
            if (!arrayDeque.remove(gVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        r();
    }

    public j.e g(AbstractC0144a abstractC0144a) {
        ArrayList arrayList = (ArrayList) this.f885c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j.e eVar = (j.e) arrayList.get(i);
            if (eVar != null && eVar.f2587b == abstractC0144a) {
                return eVar;
            }
        }
        j.e eVar2 = new j.e((Context) this.f884b, abstractC0144a);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f884b).values()) {
            if (o2 != null) {
                arrayList.add(o2);
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f884b).values()) {
            if (o2 != null) {
                arrayList.add(o2.f1017c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List j() {
        ArrayList arrayList;
        if (((ArrayList) this.f883a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f883a)) {
            arrayList = new ArrayList((ArrayList) this.f883a);
        }
        return arrayList;
    }

    public void k(String str, String str2) {
        g1.d.e(str2, "value");
        r1.g gVar = (r1.g) this.f885c;
        gVar.getClass();
        i0.g.b(str);
        i0.g.d(str2, str);
        gVar.e(str);
        gVar.c(str, str2);
    }

    @Override // G.b
    public void l() {
        View view = (View) this.f883a;
        view.clearAnimation();
        ((ViewGroup) this.f884b).endViewTransition(view);
        ((C0040f) this.f885c).d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((U) this.d) + " has been cancelled.");
        }
    }

    public void m(O o2) {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = o2.f1017c;
        String str = abstractComponentCallbacksC0051q.f1130e;
        HashMap hashMap = (HashMap) this.f884b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0051q.f1130e, o2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0051q);
        }
    }

    public void n(O o2) {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = o2.f1017c;
        if (abstractComponentCallbacksC0051q.f1110A) {
            ((L) this.d).e(abstractComponentCallbacksC0051q);
        }
        if (((O) ((HashMap) this.f884b).put(abstractComponentCallbacksC0051q.f1130e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0051q);
        }
    }

    public void o(String str, AbstractC0180a abstractC0180a) {
        g1.d.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (abstractC0180a == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
            }
        } else if (!AbstractC0180a.n(str)) {
            throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
        }
        this.f884b = str;
    }

    public boolean p(AbstractC0144a abstractC0144a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f883a).onActionItemClicked(g(abstractC0144a), new MenuItemC0173t((Context) this.f884b, (E.a) menuItem));
    }

    public boolean q(AbstractC0144a abstractC0144a, MenuC0166m menuC0166m) {
        j.e g2 = g(abstractC0144a);
        o.k kVar = (o.k) this.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0166m, null);
        if (menu == null) {
            menu = new MenuC0150B((Context) this.f884b, menuC0166m);
            kVar.put(menuC0166m, menu);
        }
        return ((ActionMode.Callback) this.f883a).onCreateActionMode(g2, menu);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = s1.b.f3721a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f884b).iterator();
                g1.d.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    v1.g gVar = (v1.g) it.next();
                    if (((ArrayDeque) this.f885c).size() >= 64) {
                        break;
                    }
                    if (gVar.f4042b.get() < 5) {
                        it.remove();
                        gVar.f4042b.incrementAndGet();
                        arrayList.add(gVar);
                        ((ArrayDeque) this.f885c).add(gVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f885c).size();
                    ((ArrayDeque) this.d).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    v1.g gVar2 = (v1.g) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f883a) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = s1.b.f3726g + " Dispatcher";
                                g1.d.e(str, "name");
                                this.f883a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new s1.a(str, false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f883a;
                            g1.d.b(threadPoolExecutor);
                        } finally {
                        }
                    }
                    gVar2.getClass();
                    v1.j jVar = gVar2.f4043c;
                    byte[] bArr2 = s1.b.f3721a;
                    try {
                        try {
                            threadPoolExecutor.execute(gVar2);
                        } catch (RejectedExecutionException e2) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e2);
                            jVar.h(interruptedIOException);
                            gVar2.f4041a.C(jVar, interruptedIOException);
                            jVar.f4046a.f3491a.f(gVar2);
                        }
                    } catch (Throwable th) {
                        jVar.f4046a.f3491a.f(gVar2);
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
        this.f883a = bVar;
        this.f885c = new t(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i3 = a2 + bVar.f430a;
            i = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f884b = new char[i * 2];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i4 = a3 + bVar.f430a;
            i2 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            x xVar = new x(this, i5);
            V.a c2 = xVar.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.d).getInt(a4 + c2.f430a) : 0, (char[]) this.f884b, i5 * 2);
            z1.d.o("invalid metadata codepoint length", xVar.b() > 0);
            ((t) this.f885c).a(xVar, 0, xVar.b() - 1);
        }
    }
}
