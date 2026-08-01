package V;

import Z.AbstractComponentCallbacksC0053q;
import Z.C0042f;
import Z.L;
import Z.O;
import Z.U;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
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
import l.AbstractC0204a;
import m.MenuC0213B;
import m.MenuC0229m;
import m.MenuItemC0236t;
import n.C0288n;

/* loaded from: classes.dex */
public final class v implements I.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f1305a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1306b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1307c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1308d;

    public v(int i) {
        switch (i) {
            case 4:
                this.f1305a = new q.b();
                this.f1306b = new SparseArray();
                this.f1307c = new q.e();
                this.f1308d = new q.b();
                break;
            case 5:
                this.f1305a = new L.b(10);
                this.f1306b = new q.k();
                this.f1307c = new ArrayList();
                this.f1308d = new HashSet();
                break;
            case 6:
                this.f1306b = new ArrayDeque();
                this.f1307c = new ArrayDeque();
                this.f1308d = new ArrayDeque();
                break;
            case 7:
                this.f1308d = new LinkedHashMap();
                this.f1306b = "GET";
                this.f1307c = new C0288n(8);
                break;
            default:
                this.f1305a = new ArrayList();
                this.f1306b = new HashMap();
                this.f1307c = new HashMap();
                break;
        }
    }

    public void a(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        if (((ArrayList) this.f1305a).contains(abstractComponentCallbacksC0053q)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0053q);
        }
        synchronized (((ArrayList) this.f1305a)) {
            ((ArrayList) this.f1305a).add(abstractComponentCallbacksC0053q);
        }
        abstractComponentCallbacksC0053q.f1615k = true;
    }

    public J.d b() {
        Map unmodifiableMap;
        z1.o oVar = (z1.o) this.f1305a;
        if (oVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f1306b;
        z1.m i = ((C0288n) this.f1307c).i();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1308d;
        byte[] bArr = A1.c.f19a;
        j1.h.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = X0.u.f1386a;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            j1.h.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new J.d(oVar, str, i, null, unmodifiableMap);
    }

    public void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((q.k) this.f1306b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                c(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public AbstractComponentCallbacksC0053q d(String str) {
        O o2 = (O) ((HashMap) this.f1306b).get(str);
        if (o2 != null) {
            return o2.f1494c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0053q e(String str) {
        for (O o2 : ((HashMap) this.f1306b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = o2.f1494c;
                if (!str.equals(abstractComponentCallbacksC0053q.e)) {
                    abstractComponentCallbacksC0053q = abstractComponentCallbacksC0053q.f1624t.f1447c.e(str);
                }
                if (abstractComponentCallbacksC0053q != null) {
                    return abstractComponentCallbacksC0053q;
                }
            }
        }
        return null;
    }

    public void f(D1.g gVar) {
        j1.h.e(gVar, "call");
        gVar.f231b.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.f1307c;
        synchronized (this) {
            if (!arrayDeque.remove(gVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        r();
    }

    public l.e g(AbstractC0204a abstractC0204a) {
        ArrayList arrayList = (ArrayList) this.f1307c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            l.e eVar = (l.e) arrayList.get(i);
            if (eVar != null && eVar.f3201b == abstractC0204a) {
                return eVar;
            }
        }
        l.e eVar2 = new l.e((Context) this.f1306b, abstractC0204a);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f1306b).values()) {
            if (o2 != null) {
                arrayList.add(o2);
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f1306b).values()) {
            if (o2 != null) {
                arrayList.add(o2.f1494c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List j() {
        ArrayList arrayList;
        if (((ArrayList) this.f1305a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f1305a)) {
            arrayList = new ArrayList((ArrayList) this.f1305a);
        }
        return arrayList;
    }

    @Override // I.b
    public void k() {
        View view = (View) this.f1305a;
        view.clearAnimation();
        ((ViewGroup) this.f1306b).endViewTransition(view);
        ((C0042f) this.f1307c).d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((U) this.f1308d) + " has been cancelled.");
        }
    }

    public void l(String str, String str2) {
        j1.h.e(str2, "value");
        C0288n c0288n = (C0288n) this.f1307c;
        c0288n.getClass();
        z1.e.a(str);
        z1.e.b(str2, str);
        c0288n.j(str);
        c0288n.h(str, str2);
    }

    public void m(O o2) {
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = o2.f1494c;
        String str = abstractComponentCallbacksC0053q.e;
        HashMap hashMap = (HashMap) this.f1306b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0053q.e, o2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0053q);
        }
    }

    public void n(O o2) {
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = o2.f1494c;
        if (abstractComponentCallbacksC0053q.f1591A) {
            ((L) this.f1308d).e(abstractComponentCallbacksC0053q);
        }
        if (((O) ((HashMap) this.f1306b).put(abstractComponentCallbacksC0053q.e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0053q);
        }
    }

    public void o(String str, z1.e eVar) {
        j1.h.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (!str.equals("POST") && !str.equals("PUT") && !str.equals("PATCH") && !str.equals("PROPPATCH") && !str.equals("REPORT")) {
            this.f1306b = str;
            return;
        }
        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
    }

    public boolean p(AbstractC0204a abstractC0204a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f1305a).onActionItemClicked(g(abstractC0204a), new MenuItemC0236t((Context) this.f1306b, (G.a) menuItem));
    }

    public boolean q(AbstractC0204a abstractC0204a, MenuC0229m menuC0229m) {
        l.e g2 = g(abstractC0204a);
        q.k kVar = (q.k) this.f1308d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0229m, null);
        if (menu == null) {
            menu = new MenuC0213B((Context) this.f1306b, menuC0229m);
            kVar.put(menuC0229m, menu);
        }
        return ((ActionMode.Callback) this.f1305a).onCreateActionMode(g2, menu);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = A1.c.f19a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f1306b).iterator();
                j1.h.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    D1.g gVar = (D1.g) it.next();
                    if (((ArrayDeque) this.f1307c).size() >= 64) {
                        break;
                    }
                    if (gVar.f231b.get() < 5) {
                        it.remove();
                        gVar.f231b.incrementAndGet();
                        arrayList.add(gVar);
                        ((ArrayDeque) this.f1307c).add(gVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f1307c).size();
                    ((ArrayDeque) this.f1308d).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    D1.g gVar2 = (D1.g) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f1305a) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = A1.c.f24g + " Dispatcher";
                                j1.h.e(str, "name");
                                this.f1305a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new A1.b(str, false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f1305a;
                            j1.h.b(threadPoolExecutor);
                        } finally {
                        }
                    }
                    gVar2.getClass();
                    D1.j jVar = gVar2.f232c;
                    byte[] bArr2 = A1.c.f19a;
                    try {
                        try {
                            threadPoolExecutor.execute(gVar2);
                        } catch (RejectedExecutionException e) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e);
                            jVar.h(interruptedIOException);
                            gVar2.f230a.D(jVar, interruptedIOException);
                            jVar.f235a.f4905a.f(gVar2);
                        }
                    } catch (Throwable th) {
                        jVar.f235a.f4905a.f(gVar2);
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

    public v(Typeface typeface, W.b bVar) {
        int i;
        int i2;
        this.f1308d = typeface;
        this.f1305a = bVar;
        this.f1307c = new u(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i3 = a2 + bVar.f699a;
            i = ((ByteBuffer) bVar.f702d).getInt(((ByteBuffer) bVar.f702d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f1306b = new char[i * 2];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i4 = a3 + bVar.f699a;
            i2 = ((ByteBuffer) bVar.f702d).getInt(((ByteBuffer) bVar.f702d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            y yVar = new y(this, i5);
            W.a c2 = yVar.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.f702d).getInt(a4 + c2.f699a) : 0, (char[]) this.f1306b, i5 * 2);
            H1.d.j("invalid metadata codepoint length", yVar.b() > 0);
            ((u) this.f1307c).a(yVar, 0, yVar.b() - 1);
        }
    }
}
