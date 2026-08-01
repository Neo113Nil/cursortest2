package T0;

import U.u;
import U.x;
import Y.AbstractComponentCallbacksC0050q;
import Y.C0039f;
import Y.L;
import Y.O;
import Y.U;
import Y0.t;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import c1.AbstractC0091d;
import j.AbstractC0164a;
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
import k.C0191o;
import k.MenuC0173C;
import k.MenuC0189m;
import k.MenuItemC0197u;

/* loaded from: classes.dex */
public final class m implements G.b {

    /* renamed from: e, reason: collision with root package name */
    public static m f1072e;

    /* renamed from: a, reason: collision with root package name */
    public Object f1073a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1074b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1075c;
    public Object d;

    public m(int i) {
        switch (i) {
            case 3:
                this.f1073a = new ArrayList();
                this.f1074b = new HashMap();
                this.f1075c = new HashMap();
                break;
            case 4:
            default:
                this.f1073a = new Object();
                this.f1074b = new Handler(Looper.getMainLooper(), new k(this));
                break;
            case 5:
                this.f1073a = new o.b();
                this.f1074b = new SparseArray();
                this.f1075c = new o.e();
                this.d = new o.b();
                break;
            case 6:
                this.f1073a = new J.b(10);
                this.f1074b = new o.k();
                this.f1075c = new ArrayList();
                this.d = new HashSet();
                break;
            case 7:
                this.f1074b = new ArrayDeque();
                this.f1075c = new ArrayDeque();
                this.d = new ArrayDeque();
                break;
            case 8:
                this.d = new LinkedHashMap();
                this.f1074b = "GET";
                this.f1075c = new C0191o(7);
                break;
        }
    }

    public static m m() {
        if (f1072e == null) {
            f1072e = new m(0);
        }
        return f1072e;
    }

    public void a(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        if (((ArrayList) this.f1073a).contains(abstractComponentCallbacksC0050q)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0050q);
        }
        synchronized (((ArrayList) this.f1073a)) {
            ((ArrayList) this.f1073a).add(abstractComponentCallbacksC0050q);
        }
        abstractComponentCallbacksC0050q.f1466k = true;
    }

    public H.e b() {
        Map unmodifiableMap;
        z1.l lVar = (z1.l) this.f1073a;
        if (lVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f1074b;
        z1.j j2 = ((C0191o) this.f1075c).j();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        byte[] bArr = A1.c.f13a;
        k1.e.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = t.f1517a;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            k1.e.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new H.e(lVar, str, j2, null, unmodifiableMap);
    }

    public boolean c(l lVar, int i) {
        f fVar = (f) lVar.f1069a.get();
        if (fVar == null) {
            return false;
        }
        ((Handler) this.f1074b).removeCallbacksAndMessages(lVar);
        Handler handler = i.f1046x;
        handler.sendMessage(handler.obtainMessage(1, i, 0, fVar.f1033a));
        return true;
    }

    public void d(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((o.k) this.f1074b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                d(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public AbstractComponentCallbacksC0050q e(String str) {
        O o2 = (O) ((HashMap) this.f1074b).get(str);
        if (o2 != null) {
            return o2.f1349c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0050q f(String str) {
        for (O o2 : ((HashMap) this.f1074b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = o2.f1349c;
                if (!str.equals(abstractComponentCallbacksC0050q.f1462e)) {
                    abstractComponentCallbacksC0050q = abstractComponentCallbacksC0050q.f1475t.f1304c.f(str);
                }
                if (abstractComponentCallbacksC0050q != null) {
                    return abstractComponentCallbacksC0050q;
                }
            }
        }
        return null;
    }

    public void g(D1.g gVar) {
        k1.e.e(gVar, "call");
        gVar.f174b.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.f1075c;
        synchronized (this) {
            if (!arrayDeque.remove(gVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        v();
    }

    public j.e h(AbstractC0164a abstractC0164a) {
        ArrayList arrayList = (ArrayList) this.f1075c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j.e eVar = (j.e) arrayList.get(i);
            if (eVar != null && eVar.f3031b == abstractC0164a) {
                return eVar;
            }
        }
        j.e eVar2 = new j.e((Context) this.f1074b, abstractC0164a);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f1074b).values()) {
            if (o2 != null) {
                arrayList.add(o2);
            }
        }
        return arrayList;
    }

    @Override // G.b
    public void j() {
        View view = (View) this.f1073a;
        view.clearAnimation();
        ((ViewGroup) this.f1074b).endViewTransition(view);
        ((C0039f) this.f1075c).d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((U) this.d) + " has been cancelled.");
        }
    }

    public ArrayList k() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f1074b).values()) {
            if (o2 != null) {
                arrayList.add(o2.f1349c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List l() {
        ArrayList arrayList;
        if (((ArrayList) this.f1073a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f1073a)) {
            arrayList = new ArrayList((ArrayList) this.f1073a);
        }
        return arrayList;
    }

    public void n(String str, String str2) {
        k1.e.e(str2, "value");
        C0191o c0191o = (C0191o) this.f1075c;
        c0191o.getClass();
        b1.g.a(str);
        b1.g.c(str2, str);
        c0191o.l(str);
        c0191o.i(str, str2);
    }

    public boolean o(f fVar) {
        l lVar = (l) this.f1075c;
        return (lVar == null || fVar == null || lVar.f1069a.get() != fVar) ? false : true;
    }

    public void p(O o2) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = o2.f1349c;
        String str = abstractComponentCallbacksC0050q.f1462e;
        HashMap hashMap = (HashMap) this.f1074b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0050q.f1462e, o2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0050q);
        }
    }

    public void q(O o2) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = o2.f1349c;
        if (abstractComponentCallbacksC0050q.f1442A) {
            ((L) this.d).e(abstractComponentCallbacksC0050q);
        }
        if (((O) ((HashMap) this.f1074b).put(abstractComponentCallbacksC0050q.f1462e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0050q);
        }
    }

    public void r(String str, AbstractC0091d abstractC0091d) {
        k1.e.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (abstractC0091d == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
            }
        } else if (!H1.d.a0(str)) {
            throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
        }
        this.f1074b = str;
    }

    public boolean s(AbstractC0164a abstractC0164a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f1073a).onActionItemClicked(h(abstractC0164a), new MenuItemC0197u((Context) this.f1074b, (E.a) menuItem));
    }

    public boolean t(AbstractC0164a abstractC0164a, MenuC0189m menuC0189m) {
        j.e h = h(abstractC0164a);
        o.k kVar = (o.k) this.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0189m, null);
        if (menu == null) {
            menu = new MenuC0173C((Context) this.f1074b, menuC0189m);
            kVar.put(menuC0189m, menu);
        }
        return ((ActionMode.Callback) this.f1073a).onCreateActionMode(h, menu);
    }

    public void u(f fVar) {
        synchronized (this.f1073a) {
            try {
                if (o(fVar)) {
                    l lVar = (l) this.f1075c;
                    if (!lVar.f1071c) {
                        lVar.f1071c = true;
                        ((Handler) this.f1074b).removeCallbacksAndMessages(lVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = A1.c.f13a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f1074b).iterator();
                k1.e.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    D1.g gVar = (D1.g) it.next();
                    if (((ArrayDeque) this.f1075c).size() >= 64) {
                        break;
                    }
                    if (gVar.f174b.get() < 5) {
                        it.remove();
                        gVar.f174b.incrementAndGet();
                        arrayList.add(gVar);
                        ((ArrayDeque) this.f1075c).add(gVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f1075c).size();
                    ((ArrayDeque) this.d).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    D1.g gVar2 = (D1.g) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f1073a) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = A1.c.f18g + " Dispatcher";
                                k1.e.e(str, "name");
                                this.f1073a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new A1.b(str, false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f1073a;
                            k1.e.b(threadPoolExecutor);
                        } finally {
                        }
                    }
                    gVar2.getClass();
                    D1.j jVar = gVar2.f175c;
                    byte[] bArr2 = A1.c.f13a;
                    try {
                        try {
                            threadPoolExecutor.execute(gVar2);
                        } catch (RejectedExecutionException e2) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e2);
                            jVar.h(interruptedIOException);
                            gVar2.f173a.y(jVar, interruptedIOException);
                            jVar.f178a.f4721a.g(gVar2);
                        }
                    } catch (Throwable th) {
                        jVar.f178a.f4721a.g(gVar2);
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

    public void w(f fVar) {
        synchronized (this.f1073a) {
            try {
                if (o(fVar)) {
                    l lVar = (l) this.f1075c;
                    if (lVar.f1071c) {
                        lVar.f1071c = false;
                        x(lVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x(l lVar) {
        int i = lVar.f1070b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        Handler handler = (Handler) this.f1074b;
        handler.removeCallbacksAndMessages(lVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, lVar), i);
    }

    public void y() {
        l lVar = (l) this.d;
        if (lVar != null) {
            this.f1075c = lVar;
            this.d = null;
            f fVar = (f) lVar.f1069a.get();
            if (fVar == null) {
                this.f1075c = null;
            } else {
                Handler handler = i.f1046x;
                handler.sendMessage(handler.obtainMessage(0, fVar.f1033a));
            }
        }
    }

    public m(Typeface typeface, V.b bVar) {
        int i;
        int i2;
        this.d = typeface;
        this.f1073a = bVar;
        this.f1075c = new u(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i3 = a2 + bVar.f568a;
            i = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f1074b = new char[i * 2];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i4 = a3 + bVar.f568a;
            i2 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            x xVar = new x(this, i5);
            V.a c2 = xVar.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.d).getInt(a4 + c2.f568a) : 0, (char[]) this.f1074b, i5 * 2);
            H1.d.h("invalid metadata codepoint length", xVar.b() > 0);
            ((u) this.f1075c).a(xVar, 0, xVar.b() - 1);
        }
    }
}
