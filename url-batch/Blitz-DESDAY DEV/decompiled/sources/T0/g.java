package T0;

import V.s;
import V.v;
import X0.t;
import Z.AbstractComponentCallbacksC0047q;
import Z.C0036f;
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
import h0.a0;
import j.AbstractC0144a;
import j.C0148e;
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
import k.MenuC0159B;
import k.m;
import l.C0176a0;
import m.C0227a;
import q.k;
import r1.j;
import r1.l;

/* loaded from: classes.dex */
public final class g implements I.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f824a;

    /* renamed from: b, reason: collision with root package name */
    public Object f825b;

    /* renamed from: c, reason: collision with root package name */
    public Object f826c;
    public Object d;

    public /* synthetic */ g(View view, View view2, Object obj, Object obj2) {
        this.f824a = view;
        this.f825b = view2;
        this.f826c = obj;
        this.d = obj2;
    }

    public void a(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        if (((ArrayList) this.f824a).contains(abstractComponentCallbacksC0047q)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0047q);
        }
        synchronized (((ArrayList) this.f824a)) {
            ((ArrayList) this.f824a).add(abstractComponentCallbacksC0047q);
        }
        abstractComponentCallbacksC0047q.f1196k = true;
    }

    public J.d b() {
        Map unmodifiableMap;
        l lVar = (l) this.f824a;
        if (lVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f825b;
        j g2 = ((C0176a0) this.f826c).g();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        byte[] bArr = s1.b.f3607a;
        g1.d.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = t.f993a;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            g1.d.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new J.d(lVar, str, g2, null, unmodifiableMap);
    }

    public void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((k) this.f825b).getOrDefault(obj, null);
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
        O o2 = (O) ((HashMap) this.f825b).get(str);
        if (o2 != null) {
            return o2.f1079c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0047q e(String str) {
        for (O o2 : ((HashMap) this.f825b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = o2.f1079c;
                if (!str.equals(abstractComponentCallbacksC0047q.f1192e)) {
                    abstractComponentCallbacksC0047q = abstractComponentCallbacksC0047q.f1205t.f1034c.e(str);
                }
                if (abstractComponentCallbacksC0047q != null) {
                    return abstractComponentCallbacksC0047q;
                }
            }
        }
        return null;
    }

    public void f(v1.g gVar) {
        g1.d.e(gVar, "call");
        gVar.f3872b.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.f826c;
        synchronized (this) {
            if (!arrayDeque.remove(gVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        r();
    }

    public C0148e g(AbstractC0144a abstractC0144a) {
        ArrayList arrayList = (ArrayList) this.f826c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0148e c0148e = (C0148e) arrayList.get(i);
            if (c0148e != null && c0148e.f2633b == abstractC0144a) {
                return c0148e;
            }
        }
        C0148e c0148e2 = new C0148e((Context) this.f825b, abstractC0144a);
        arrayList.add(c0148e2);
        return c0148e2;
    }

    public ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f825b).values()) {
            if (o2 != null) {
                arrayList.add(o2);
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f825b).values()) {
            if (o2 != null) {
                arrayList.add(o2.f1079c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List j() {
        ArrayList arrayList;
        if (((ArrayList) this.f824a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f824a)) {
            arrayList = new ArrayList((ArrayList) this.f824a);
        }
        return arrayList;
    }

    public void k(String str, String str2) {
        g1.d.e(str2, "value");
        C0176a0 c0176a0 = (C0176a0) this.f826c;
        c0176a0.getClass();
        C0227a.b(str);
        C0227a.d(str2, str);
        c0176a0.h(str);
        c0176a0.f(str, str2);
    }

    @Override // I.b
    public void l() {
        View view = (View) this.f824a;
        view.clearAnimation();
        ((ViewGroup) this.f825b).endViewTransition(view);
        ((C0036f) this.f826c).d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((U) this.d) + " has been cancelled.");
        }
    }

    public void m(O o2) {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = o2.f1079c;
        String str = abstractComponentCallbacksC0047q.f1192e;
        HashMap hashMap = (HashMap) this.f825b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0047q.f1192e, o2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0047q);
        }
    }

    public void n(O o2) {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = o2.f1079c;
        if (abstractComponentCallbacksC0047q.f1172A) {
            ((L) this.d).e(abstractComponentCallbacksC0047q);
        }
        if (((O) ((HashMap) this.f825b).put(abstractComponentCallbacksC0047q.f1192e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0047q);
        }
    }

    public void o(String str, a0 a0Var) {
        g1.d.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (a0Var == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
            }
        } else if (!a0.n(str)) {
            throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
        }
        this.f825b = str;
    }

    public boolean p(AbstractC0144a abstractC0144a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f824a).onActionItemClicked(g(abstractC0144a), new k.t((Context) this.f825b, (G.a) menuItem));
    }

    public boolean q(AbstractC0144a abstractC0144a, m mVar) {
        C0148e g2 = g(abstractC0144a);
        k kVar = (k) this.d;
        Menu menu = (Menu) kVar.getOrDefault(mVar, null);
        if (menu == null) {
            menu = new MenuC0159B((Context) this.f825b, mVar);
            kVar.put(mVar, menu);
        }
        return ((ActionMode.Callback) this.f824a).onCreateActionMode(g2, menu);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = s1.b.f3607a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f825b).iterator();
                g1.d.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    v1.g gVar = (v1.g) it.next();
                    if (((ArrayDeque) this.f826c).size() >= 64) {
                        break;
                    }
                    if (gVar.f3872b.get() < 5) {
                        it.remove();
                        gVar.f3872b.incrementAndGet();
                        arrayList.add(gVar);
                        ((ArrayDeque) this.f826c).add(gVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f826c).size();
                    ((ArrayDeque) this.d).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    v1.g gVar2 = (v1.g) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f824a) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = s1.b.f3612g + " Dispatcher";
                                g1.d.e(str, "name");
                                this.f824a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new s1.a(str, false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f824a;
                            g1.d.b(threadPoolExecutor);
                        } finally {
                        }
                    }
                    gVar2.getClass();
                    v1.j jVar = gVar2.f3873c;
                    byte[] bArr2 = s1.b.f3607a;
                    try {
                        try {
                            threadPoolExecutor.execute(gVar2);
                        } catch (RejectedExecutionException e2) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e2);
                            jVar.h(interruptedIOException);
                            gVar2.f3871a.z(jVar, interruptedIOException);
                            jVar.f3876a.f3507a.f(gVar2);
                        }
                    } catch (Throwable th) {
                        jVar.f3876a.f3507a.f(gVar2);
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

    public g(int i) {
        switch (i) {
            case 5:
                this.f824a = new q.b();
                this.f825b = new SparseArray();
                this.f826c = new q.e();
                this.d = new q.b();
                break;
            case 6:
                this.f825b = new ArrayDeque();
                this.f826c = new ArrayDeque();
                this.d = new ArrayDeque();
                break;
            case 7:
                this.d = new LinkedHashMap();
                this.f825b = "GET";
                this.f826c = new C0176a0(2);
                break;
            case 8:
                this.f824a = new L.b(10);
                this.f825b = new k();
                this.f826c = new ArrayList();
                this.d = new HashSet();
                break;
            default:
                this.f824a = new ArrayList();
                this.f825b = new HashMap();
                this.f826c = new HashMap();
                break;
        }
    }

    public g(Typeface typeface, W.b bVar) {
        int i;
        int i2;
        this.d = typeface;
        this.f824a = bVar;
        this.f826c = new s(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i3 = a2 + bVar.f503a;
            i = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f825b = new char[i * 2];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i4 = a3 + bVar.f503a;
            i2 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            v vVar = new v(this, i5);
            W.a c2 = vVar.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.d).getInt(a4 + c2.f503a) : 0, (char[]) this.f825b, i5 * 2);
            z1.l.o("invalid metadata codepoint length", vVar.b() > 0);
            ((s) this.f826c).a(vVar, 0, vVar.b() - 1);
        }
    }
}
