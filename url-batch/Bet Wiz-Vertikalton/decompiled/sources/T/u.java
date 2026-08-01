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
import j.AbstractC0139a;
import j0.AbstractC0142a;
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
import k.MenuC0144B;
import k.MenuC0160m;
import k.MenuItemC0167t;

/* loaded from: classes.dex */
public final class u implements G.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f828a;

    /* renamed from: b, reason: collision with root package name */
    public Object f829b;

    /* renamed from: c, reason: collision with root package name */
    public Object f830c;
    public Object d;

    public u(int i) {
        switch (i) {
            case 4:
                this.f828a = new o.b();
                this.f829b = new SparseArray();
                this.f830c = new o.e();
                this.d = new o.b();
                break;
            case 5:
                this.f829b = new ArrayDeque();
                this.f830c = new ArrayDeque();
                this.d = new ArrayDeque();
                break;
            case 6:
                this.d = new LinkedHashMap();
                this.f829b = "GET";
                this.f830c = new p1.g(1);
                break;
            case 7:
                this.f828a = new J.b(10);
                this.f829b = new o.k();
                this.f830c = new ArrayList();
                this.d = new HashSet();
                break;
            default:
                this.f828a = new ArrayList();
                this.f829b = new HashMap();
                this.f830c = new HashMap();
                break;
        }
    }

    public void a(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (((ArrayList) this.f828a).contains(abstractComponentCallbacksC0048q)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0048q);
        }
        synchronized (((ArrayList) this.f828a)) {
            ((ArrayList) this.f828a).add(abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f1087k = true;
    }

    public H.e b() {
        Map unmodifiableMap;
        p1.m mVar = (p1.m) this.f828a;
        if (mVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f829b;
        p1.k d = ((p1.g) this.f830c).d();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        byte[] bArr = q1.b.f3491a;
        e1.d.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = W0.r.f897a;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            e1.d.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new H.e(mVar, str, d, null, unmodifiableMap);
    }

    public void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((o.k) this.f829b).getOrDefault(obj, null);
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
        O o2 = (O) ((HashMap) this.f829b).get(str);
        if (o2 != null) {
            return o2.f970c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0048q e(String str) {
        for (O o2 : ((HashMap) this.f829b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f970c;
                if (!str.equals(abstractComponentCallbacksC0048q.f1083e)) {
                    abstractComponentCallbacksC0048q = abstractComponentCallbacksC0048q.f1096t.f925c.e(str);
                }
                if (abstractComponentCallbacksC0048q != null) {
                    return abstractComponentCallbacksC0048q;
                }
            }
        }
        return null;
    }

    public void f(t1.g gVar) {
        e1.d.e(gVar, "call");
        gVar.f3755b.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.f830c;
        synchronized (this) {
            if (!arrayDeque.remove(gVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        r();
    }

    public j.e g(AbstractC0139a abstractC0139a) {
        ArrayList arrayList = (ArrayList) this.f830c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j.e eVar = (j.e) arrayList.get(i);
            if (eVar != null && eVar.f2536b == abstractC0139a) {
                return eVar;
            }
        }
        j.e eVar2 = new j.e((Context) this.f829b, abstractC0139a);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f829b).values()) {
            if (o2 != null) {
                arrayList.add(o2);
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f829b).values()) {
            if (o2 != null) {
                arrayList.add(o2.f970c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List j() {
        ArrayList arrayList;
        if (((ArrayList) this.f828a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f828a)) {
            arrayList = new ArrayList((ArrayList) this.f828a);
        }
        return arrayList;
    }

    public void k(String str, String str2) {
        e1.d.e(str2, "value");
        p1.g gVar = (p1.g) this.f830c;
        gVar.getClass();
        AbstractC0142a.c(str);
        AbstractC0142a.d(str2, str);
        gVar.e(str);
        gVar.c(str, str2);
    }

    public void l(O o2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f970c;
        String str = abstractComponentCallbacksC0048q.f1083e;
        HashMap hashMap = (HashMap) this.f829b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0048q.f1083e, o2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0048q);
        }
    }

    @Override // G.b
    public void m() {
        View view = (View) this.f828a;
        view.clearAnimation();
        ((ViewGroup) this.f829b).endViewTransition(view);
        ((C0037f) this.f830c).d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((U) this.d) + " has been cancelled.");
        }
    }

    public void n(O o2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f970c;
        if (abstractComponentCallbacksC0048q.f1063A) {
            ((L) this.d).e(abstractComponentCallbacksC0048q);
        }
        if (((O) ((HashMap) this.f829b).put(abstractComponentCallbacksC0048q.f1083e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0048q);
        }
    }

    public void o(String str, k0.k kVar) {
        e1.d.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (kVar == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
            }
        } else if (!k0.k.n(str)) {
            throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
        }
        this.f829b = str;
    }

    public boolean p(AbstractC0139a abstractC0139a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f828a).onActionItemClicked(g(abstractC0139a), new MenuItemC0167t((Context) this.f829b, (E.a) menuItem));
    }

    public boolean q(AbstractC0139a abstractC0139a, MenuC0160m menuC0160m) {
        j.e g2 = g(abstractC0139a);
        o.k kVar = (o.k) this.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0160m, null);
        if (menu == null) {
            menu = new MenuC0144B((Context) this.f829b, menuC0160m);
            kVar.put(menuC0160m, menu);
        }
        return ((ActionMode.Callback) this.f828a).onCreateActionMode(g2, menu);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = q1.b.f3491a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f829b).iterator();
                e1.d.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    t1.g gVar = (t1.g) it.next();
                    if (((ArrayDeque) this.f830c).size() >= 64) {
                        break;
                    }
                    if (gVar.f3755b.get() < 5) {
                        it.remove();
                        gVar.f3755b.incrementAndGet();
                        arrayList.add(gVar);
                        ((ArrayDeque) this.f830c).add(gVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f830c).size();
                    ((ArrayDeque) this.d).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    t1.g gVar2 = (t1.g) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f828a) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = q1.b.f3496g + " Dispatcher";
                                e1.d.e(str, "name");
                                this.f828a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new q1.a(str, false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f828a;
                            e1.d.b(threadPoolExecutor);
                        } finally {
                        }
                    }
                    gVar2.getClass();
                    t1.j jVar = gVar2.f3756c;
                    byte[] bArr2 = q1.b.f3491a;
                    try {
                        try {
                            threadPoolExecutor.execute(gVar2);
                        } catch (RejectedExecutionException e2) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e2);
                            jVar.h(interruptedIOException);
                            gVar2.f3754a.B(jVar, interruptedIOException);
                            jVar.f3759a.f3391a.f(gVar2);
                        }
                    } catch (Throwable th) {
                        jVar.f3759a.f3391a.f(gVar2);
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
        this.f828a = bVar;
        this.f830c = new t(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i3 = a2 + bVar.f412a;
            i = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f829b = new char[i * 2];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i4 = a3 + bVar.f412a;
            i2 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            x xVar = new x(this, i5);
            U.a c2 = xVar.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.d).getInt(a4 + c2.f412a) : 0, (char[]) this.f829b, i5 * 2);
            x1.d.h("invalid metadata codepoint length", xVar.b() > 0);
            ((t) this.f830c).a(xVar, 0, xVar.b() - 1);
        }
    }
}
