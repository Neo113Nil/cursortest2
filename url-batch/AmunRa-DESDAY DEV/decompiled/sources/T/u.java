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
import j.AbstractC0138a;
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
import k.MenuC0142B;
import k.MenuC0158m;
import k.MenuItemC0165t;

/* loaded from: classes.dex */
public final class u implements G.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f791a;

    /* renamed from: b, reason: collision with root package name */
    public Object f792b;

    /* renamed from: c, reason: collision with root package name */
    public Object f793c;
    public Object d;

    public u(int i) {
        switch (i) {
            case 4:
                this.f791a = new o.b();
                this.f792b = new SparseArray();
                this.f793c = new o.e();
                this.d = new o.b();
                break;
            case 5:
                this.f792b = new ArrayDeque();
                this.f793c = new ArrayDeque();
                this.d = new ArrayDeque();
                break;
            case 6:
                this.d = new LinkedHashMap();
                this.f792b = "GET";
                this.f793c = new C.g(28);
                break;
            case 7:
                this.f791a = new J.b(10);
                this.f792b = new o.k();
                this.f793c = new ArrayList();
                this.d = new HashSet();
                break;
            default:
                this.f791a = new ArrayList();
                this.f792b = new HashMap();
                this.f793c = new HashMap();
                break;
        }
    }

    public void a(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (((ArrayList) this.f791a).contains(abstractComponentCallbacksC0048q)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0048q);
        }
        synchronized (((ArrayList) this.f791a)) {
            ((ArrayList) this.f791a).add(abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f1015k = true;
    }

    public H.e b() {
        Map unmodifiableMap;
        k1.n nVar = (k1.n) this.f791a;
        if (nVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f792b;
        k1.l t2 = ((C.g) this.f793c).t();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        byte[] bArr = l1.b.f3252a;
        Z0.d.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = R0.r.f713a;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            Z0.d.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new H.e(nVar, str, t2, null, unmodifiableMap);
    }

    public void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((o.k) this.f792b).getOrDefault(obj, null);
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
        O o2 = (O) ((HashMap) this.f792b).get(str);
        if (o2 != null) {
            return o2.f901c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0048q e(String str) {
        for (O o2 : ((HashMap) this.f792b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f901c;
                if (!str.equals(abstractComponentCallbacksC0048q.f1011e)) {
                    abstractComponentCallbacksC0048q = abstractComponentCallbacksC0048q.f1024t.f856c.e(str);
                }
                if (abstractComponentCallbacksC0048q != null) {
                    return abstractComponentCallbacksC0048q;
                }
            }
        }
        return null;
    }

    public void f(o1.g gVar) {
        Z0.d.e(gVar, "call");
        gVar.f3388b.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.f793c;
        synchronized (this) {
            if (!arrayDeque.remove(gVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        r();
    }

    public j.e g(AbstractC0138a abstractC0138a) {
        ArrayList arrayList = (ArrayList) this.f793c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j.e eVar = (j.e) arrayList.get(i);
            if (eVar != null && eVar.f2480b == abstractC0138a) {
                return eVar;
            }
        }
        j.e eVar2 = new j.e((Context) this.f792b, abstractC0138a);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f792b).values()) {
            if (o2 != null) {
                arrayList.add(o2);
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f792b).values()) {
            if (o2 != null) {
                arrayList.add(o2.f901c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List j() {
        ArrayList arrayList;
        if (((ArrayList) this.f791a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f791a)) {
            arrayList = new ArrayList((ArrayList) this.f791a);
        }
        return arrayList;
    }

    @Override // G.b
    public void k() {
        View view = (View) this.f791a;
        view.clearAnimation();
        ((ViewGroup) this.f792b).endViewTransition(view);
        ((C0037f) this.f793c).d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((U) this.d) + " has been cancelled.");
        }
    }

    public void l(String str, String str2) {
        Z0.d.e(str2, "value");
        C.g gVar = (C.g) this.f793c;
        gVar.getClass();
        k1.c.e(str);
        k1.c.g(str2, str);
        gVar.A(str);
        gVar.s(str, str2);
    }

    public void m(O o2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f901c;
        String str = abstractComponentCallbacksC0048q.f1011e;
        HashMap hashMap = (HashMap) this.f792b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0048q.f1011e, o2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0048q);
        }
    }

    public void n(O o2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f901c;
        if (abstractComponentCallbacksC0048q.f991A) {
            ((L) this.d).e(abstractComponentCallbacksC0048q);
        }
        if (((O) ((HashMap) this.f792b).put(abstractComponentCallbacksC0048q.f1011e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0048q);
        }
    }

    public void o(String str, k0.y yVar) {
        Z0.d.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (yVar == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
            }
        } else if (!k0.y.j(str)) {
            throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
        }
        this.f792b = str;
    }

    public boolean p(AbstractC0138a abstractC0138a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f791a).onActionItemClicked(g(abstractC0138a), new MenuItemC0165t((Context) this.f792b, (E.a) menuItem));
    }

    public boolean q(AbstractC0138a abstractC0138a, MenuC0158m menuC0158m) {
        j.e g2 = g(abstractC0138a);
        o.k kVar = (o.k) this.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0158m, null);
        if (menu == null) {
            menu = new MenuC0142B((Context) this.f792b, menuC0158m);
            kVar.put(menuC0158m, menu);
        }
        return ((ActionMode.Callback) this.f791a).onCreateActionMode(g2, menu);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = l1.b.f3252a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f792b).iterator();
                Z0.d.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    o1.g gVar = (o1.g) it.next();
                    if (((ArrayDeque) this.f793c).size() >= 64) {
                        break;
                    }
                    if (gVar.f3388b.get() < 5) {
                        it.remove();
                        gVar.f3388b.incrementAndGet();
                        arrayList.add(gVar);
                        ((ArrayDeque) this.f793c).add(gVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f793c).size();
                    ((ArrayDeque) this.d).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    o1.g gVar2 = (o1.g) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f791a) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = l1.b.f3257g + " Dispatcher";
                                Z0.d.e(str, "name");
                                this.f791a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new l1.a(str, false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f791a;
                            Z0.d.b(threadPoolExecutor);
                        } finally {
                        }
                    }
                    gVar2.getClass();
                    o1.j jVar = gVar2.f3389c;
                    byte[] bArr2 = l1.b.f3252a;
                    try {
                        try {
                            threadPoolExecutor.execute(gVar2);
                        } catch (RejectedExecutionException e2) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e2);
                            jVar.h(interruptedIOException);
                            gVar2.f3387a.B(jVar, interruptedIOException);
                            jVar.f3392a.f2859a.f(gVar2);
                        }
                    } catch (Throwable th) {
                        jVar.f3392a.f2859a.f(gVar2);
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
        this.f791a = bVar;
        this.f793c = new t(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i3 = a2 + bVar.f352a;
            i = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f792b = new char[i * 2];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i4 = a3 + bVar.f352a;
            i2 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            x xVar = new x(this, i5);
            U.a c2 = xVar.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.d).getInt(a4 + c2.f352a) : 0, (char[]) this.f792b, i5 * 2);
            s1.l.g("invalid metadata codepoint length", xVar.b() > 0);
            ((t) this.f793c).a(xVar, 0, xVar.b() - 1);
        }
    }
}
