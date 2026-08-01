package S0;

import A1.m;
import V.t;
import V.w;
import W0.q;
import Z.AbstractComponentCallbacksC0050q;
import Z.C0039f;
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
import h.AbstractC0112a;
import h0.d0;
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
import k.AbstractC0147a;
import l.MenuC0153B;
import l.MenuC0169m;
import l.MenuItemC0176t;
import m.C0202a0;
import p.k;
import s1.j;
import s1.l;

/* loaded from: classes.dex */
public final class g implements H.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f822a;

    /* renamed from: b, reason: collision with root package name */
    public Object f823b;

    /* renamed from: c, reason: collision with root package name */
    public Object f824c;
    public Object d;

    public /* synthetic */ g(View view, View view2, Object obj, Object obj2) {
        this.f822a = view;
        this.f823b = view2;
        this.f824c = obj;
        this.d = obj2;
    }

    public void a(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        if (((ArrayList) this.f822a).contains(abstractComponentCallbacksC0050q)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0050q);
        }
        synchronized (((ArrayList) this.f822a)) {
            ((ArrayList) this.f822a).add(abstractComponentCallbacksC0050q);
        }
        abstractComponentCallbacksC0050q.f1187k = true;
    }

    public I.d b() {
        Map unmodifiableMap;
        l lVar = (l) this.f822a;
        if (lVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f823b;
        j g2 = ((C0202a0) this.f824c).g();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        byte[] bArr = t1.b.f3898a;
        h1.d.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = q.f960a;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            h1.d.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new I.d(lVar, str, g2, null, unmodifiableMap);
    }

    public void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((k) this.f823b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                c(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public AbstractComponentCallbacksC0050q d(String str) {
        O o2 = (O) ((HashMap) this.f823b).get(str);
        if (o2 != null) {
            return o2.f1064c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0050q e(String str) {
        for (O o2 : ((HashMap) this.f823b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = o2.f1064c;
                if (!str.equals(abstractComponentCallbacksC0050q.f1182e)) {
                    abstractComponentCallbacksC0050q = abstractComponentCallbacksC0050q.f1196t.f1015c.e(str);
                }
                if (abstractComponentCallbacksC0050q != null) {
                    return abstractComponentCallbacksC0050q;
                }
            }
        }
        return null;
    }

    public void f(w1.g gVar) {
        h1.d.e(gVar, "call");
        gVar.f4233b.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.f824c;
        synchronized (this) {
            if (!arrayDeque.remove(gVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        r();
    }

    public k.e g(AbstractC0147a abstractC0147a) {
        ArrayList arrayList = (ArrayList) this.f824c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k.e eVar = (k.e) arrayList.get(i);
            if (eVar != null && eVar.f2685b == abstractC0147a) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.f823b, abstractC0147a);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f823b).values()) {
            if (o2 != null) {
                arrayList.add(o2);
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f823b).values()) {
            if (o2 != null) {
                arrayList.add(o2.f1064c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List j() {
        ArrayList arrayList;
        if (((ArrayList) this.f822a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f822a)) {
            arrayList = new ArrayList((ArrayList) this.f822a);
        }
        return arrayList;
    }

    public void k(String str, String str2) {
        h1.d.e(str2, "value");
        C0202a0 c0202a0 = (C0202a0) this.f824c;
        c0202a0.getClass();
        AbstractC0112a.b(str);
        AbstractC0112a.d(str2, str);
        c0202a0.h(str);
        c0202a0.f(str, str2);
    }

    public void l(O o2) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = o2.f1064c;
        String str = abstractComponentCallbacksC0050q.f1182e;
        HashMap hashMap = (HashMap) this.f823b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0050q.f1182e, o2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0050q);
        }
    }

    @Override // H.b
    public void m() {
        View view = (View) this.f822a;
        view.clearAnimation();
        ((ViewGroup) this.f823b).endViewTransition(view);
        ((C0039f) this.f824c).d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((U) this.d) + " has been cancelled.");
        }
    }

    public void n(O o2) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = o2.f1064c;
        if (abstractComponentCallbacksC0050q.f1162A) {
            ((L) this.d).e(abstractComponentCallbacksC0050q);
        }
        if (((O) ((HashMap) this.f823b).put(abstractComponentCallbacksC0050q.f1182e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0050q);
        }
    }

    public void o(String str, d0 d0Var) {
        h1.d.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (d0Var == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
            }
        } else if (!d0.m(str)) {
            throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
        }
        this.f823b = str;
    }

    public boolean p(AbstractC0147a abstractC0147a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f822a).onActionItemClicked(g(abstractC0147a), new MenuItemC0176t((Context) this.f823b, (F.a) menuItem));
    }

    public boolean q(AbstractC0147a abstractC0147a, MenuC0169m menuC0169m) {
        k.e g2 = g(abstractC0147a);
        k kVar = (k) this.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0169m, null);
        if (menu == null) {
            menu = new MenuC0153B((Context) this.f823b, menuC0169m);
            kVar.put(menuC0169m, menu);
        }
        return ((ActionMode.Callback) this.f822a).onCreateActionMode(g2, menu);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = t1.b.f3898a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f823b).iterator();
                h1.d.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    w1.g gVar = (w1.g) it.next();
                    if (((ArrayDeque) this.f824c).size() >= 64) {
                        break;
                    }
                    if (gVar.f4233b.get() < 5) {
                        it.remove();
                        gVar.f4233b.incrementAndGet();
                        arrayList.add(gVar);
                        ((ArrayDeque) this.f824c).add(gVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f824c).size();
                    ((ArrayDeque) this.d).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    w1.g gVar2 = (w1.g) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f822a) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = t1.b.f3903g + " Dispatcher";
                                h1.d.e(str, "name");
                                this.f822a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new t1.a(str, false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f822a;
                            h1.d.b(threadPoolExecutor);
                        } finally {
                        }
                    }
                    gVar2.getClass();
                    w1.j jVar = gVar2.f4234c;
                    byte[] bArr2 = t1.b.f3898a;
                    try {
                        try {
                            threadPoolExecutor.execute(gVar2);
                        } catch (RejectedExecutionException e2) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e2);
                            jVar.h(interruptedIOException);
                            gVar2.f4232a.z(jVar, interruptedIOException);
                            jVar.f4237a.f3661a.f(gVar2);
                        }
                    } catch (Throwable th) {
                        jVar.f4237a.f3661a.f(gVar2);
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
                this.f822a = new p.b();
                this.f823b = new SparseArray();
                this.f824c = new p.e();
                this.d = new p.b();
                break;
            case 6:
                this.f823b = new ArrayDeque();
                this.f824c = new ArrayDeque();
                this.d = new ArrayDeque();
                break;
            case 7:
                this.d = new LinkedHashMap();
                this.f823b = "GET";
                this.f824c = new C0202a0(2);
                break;
            case 8:
                this.f822a = new K.b(10);
                this.f823b = new k();
                this.f824c = new ArrayList();
                this.d = new HashSet();
                break;
            default:
                this.f822a = new ArrayList();
                this.f823b = new HashMap();
                this.f824c = new HashMap();
                break;
        }
    }

    public g(Typeface typeface, W.b bVar) {
        int i;
        int i2;
        this.d = typeface;
        this.f822a = bVar;
        this.f824c = new t(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i3 = a2 + bVar.f480a;
            i = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f823b = new char[i * 2];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i4 = a3 + bVar.f480a;
            i2 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            w wVar = new w(this, i5);
            W.a c2 = wVar.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.d).getInt(a4 + c2.f480a) : 0, (char[]) this.f823b, i5 * 2);
            m.h("invalid metadata codepoint length", wVar.b() > 0);
            ((t) this.f824c).a(wVar, 0, wVar.b() - 1);
        }
    }
}
