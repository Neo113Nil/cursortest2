package T;

import X.AbstractComponentCallbacksC0047q;
import X.C0036f;
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
public final class u implements G.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f816a;

    /* renamed from: b, reason: collision with root package name */
    public Object f817b;

    /* renamed from: c, reason: collision with root package name */
    public Object f818c;
    public Object d;

    public u(int i) {
        switch (i) {
            case 4:
                this.f816a = new o.b();
                this.f817b = new SparseArray();
                this.f818c = new o.e();
                this.d = new o.b();
                break;
            case 5:
                this.f817b = new ArrayDeque();
                this.f818c = new ArrayDeque();
                this.d = new ArrayDeque();
                break;
            case 6:
                this.d = new LinkedHashMap();
                this.f817b = "GET";
                this.f818c = new m1.g(1);
                break;
            case 7:
                this.f816a = new J.b(10);
                this.f817b = new o.k();
                this.f818c = new ArrayList();
                this.d = new HashSet();
                break;
            default:
                this.f816a = new ArrayList();
                this.f817b = new HashMap();
                this.f818c = new HashMap();
                break;
        }
    }

    public void a(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        if (((ArrayList) this.f816a).contains(abstractComponentCallbacksC0047q)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0047q);
        }
        synchronized (((ArrayList) this.f816a)) {
            ((ArrayList) this.f816a).add(abstractComponentCallbacksC0047q);
        }
        abstractComponentCallbacksC0047q.f1061k = true;
    }

    public H.e b() {
        Map unmodifiableMap;
        m1.m mVar = (m1.m) this.f816a;
        if (mVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f817b;
        m1.k d = ((m1.g) this.f818c).d();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        byte[] bArr = n1.b.f3319a;
        b1.d.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = T0.r.f845a;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            b1.d.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
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
        ArrayList arrayList2 = (ArrayList) ((o.k) this.f817b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                c(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public AbstractComponentCallbacksC0047q d(String str) {
        O o2 = (O) ((HashMap) this.f817b).get(str);
        if (o2 != null) {
            return o2.f944c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0047q e(String str) {
        for (O o2 : ((HashMap) this.f817b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = o2.f944c;
                if (!str.equals(abstractComponentCallbacksC0047q.f1057e)) {
                    abstractComponentCallbacksC0047q = abstractComponentCallbacksC0047q.f1070t.f899c.e(str);
                }
                if (abstractComponentCallbacksC0047q != null) {
                    return abstractComponentCallbacksC0047q;
                }
            }
        }
        return null;
    }

    public void f(q1.g gVar) {
        b1.d.e(gVar, "call");
        gVar.f3522b.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.f818c;
        synchronized (this) {
            if (!arrayDeque.remove(gVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        r();
    }

    public j.e g(AbstractC0137a abstractC0137a) {
        ArrayList arrayList = (ArrayList) this.f818c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j.e eVar = (j.e) arrayList.get(i);
            if (eVar != null && eVar.f2524b == abstractC0137a) {
                return eVar;
            }
        }
        j.e eVar2 = new j.e((Context) this.f817b, abstractC0137a);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f817b).values()) {
            if (o2 != null) {
                arrayList.add(o2);
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f817b).values()) {
            if (o2 != null) {
                arrayList.add(o2.f944c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List j() {
        ArrayList arrayList;
        if (((ArrayList) this.f816a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f816a)) {
            arrayList = new ArrayList((ArrayList) this.f816a);
        }
        return arrayList;
    }

    public void k(String str, String str2) {
        b1.d.e(str2, "value");
        m1.g gVar = (m1.g) this.f818c;
        gVar.getClass();
        k0.w.c(str);
        k0.w.e(str2, str);
        gVar.e(str);
        gVar.c(str, str2);
    }

    public void l(O o2) {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = o2.f944c;
        String str = abstractComponentCallbacksC0047q.f1057e;
        HashMap hashMap = (HashMap) this.f817b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0047q.f1057e, o2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0047q);
        }
    }

    @Override // G.b
    public void m() {
        View view = (View) this.f816a;
        view.clearAnimation();
        ((ViewGroup) this.f817b).endViewTransition(view);
        ((C0036f) this.f818c).d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((U) this.d) + " has been cancelled.");
        }
    }

    public void n(O o2) {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = o2.f944c;
        if (abstractComponentCallbacksC0047q.f1037A) {
            ((L) this.d).e(abstractComponentCallbacksC0047q);
        }
        if (((O) ((HashMap) this.f817b).put(abstractComponentCallbacksC0047q.f1057e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0047q);
        }
    }

    public void o(String str, k0.z zVar) {
        b1.d.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (zVar == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
            }
        } else if (!k0.z.k(str)) {
            throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
        }
        this.f817b = str;
    }

    public boolean p(AbstractC0137a abstractC0137a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f816a).onActionItemClicked(g(abstractC0137a), new MenuItemC0164t((Context) this.f817b, (E.a) menuItem));
    }

    public boolean q(AbstractC0137a abstractC0137a, MenuC0157m menuC0157m) {
        j.e g2 = g(abstractC0137a);
        o.k kVar = (o.k) this.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0157m, null);
        if (menu == null) {
            menu = new MenuC0141B((Context) this.f817b, menuC0157m);
            kVar.put(menuC0157m, menu);
        }
        return ((ActionMode.Callback) this.f816a).onCreateActionMode(g2, menu);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = n1.b.f3319a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f817b).iterator();
                b1.d.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    q1.g gVar = (q1.g) it.next();
                    if (((ArrayDeque) this.f818c).size() >= 64) {
                        break;
                    }
                    if (gVar.f3522b.get() < 5) {
                        it.remove();
                        gVar.f3522b.incrementAndGet();
                        arrayList.add(gVar);
                        ((ArrayDeque) this.f818c).add(gVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f818c).size();
                    ((ArrayDeque) this.d).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    q1.g gVar2 = (q1.g) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f816a) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = n1.b.f3324g + " Dispatcher";
                                b1.d.e(str, "name");
                                this.f816a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new n1.a(str, false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f816a;
                            b1.d.b(threadPoolExecutor);
                        } finally {
                        }
                    }
                    gVar2.getClass();
                    q1.j jVar = gVar2.f3523c;
                    byte[] bArr2 = n1.b.f3319a;
                    try {
                        try {
                            threadPoolExecutor.execute(gVar2);
                        } catch (RejectedExecutionException e2) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e2);
                            jVar.h(interruptedIOException);
                            gVar2.f3521a.B(jVar, interruptedIOException);
                            jVar.f3526a.f3244a.f(gVar2);
                        }
                    } catch (Throwable th) {
                        jVar.f3526a.f3244a.f(gVar2);
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
        this.f816a = bVar;
        this.f818c = new t(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i3 = a2 + bVar.f341a;
            i = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f817b = new char[i * 2];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i4 = a3 + bVar.f341a;
            i2 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            x xVar = new x(this, i5);
            U.a c2 = xVar.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.d).getInt(a4 + c2.f341a) : 0, (char[]) this.f817b, i5 * 2);
            u1.d.e("invalid metadata codepoint length", xVar.b() > 0);
            ((t) this.f818c).a(xVar, 0, xVar.b() - 1);
        }
    }
}
