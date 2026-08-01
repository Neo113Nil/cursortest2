package T;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC0060q;
import androidx.fragment.app.C0049f;
import androidx.fragment.app.O;
import androidx.fragment.app.S;
import androidx.fragment.app.X;
import j.AbstractC0169b;
import j.InterfaceC0168a;
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
import k.MenuC0184B;
import k.MenuC0200m;
import k.MenuItemC0207t;

/* loaded from: classes.dex */
public final class v implements G.c, InterfaceC0168a {

    /* renamed from: a, reason: collision with root package name */
    public Object f823a;

    /* renamed from: b, reason: collision with root package name */
    public Object f824b;

    /* renamed from: c, reason: collision with root package name */
    public Object f825c;

    /* renamed from: d, reason: collision with root package name */
    public Object f826d;

    public v(int i) {
        switch (i) {
            case 3:
                this.f824b = new ArrayDeque();
                this.f825c = new ArrayDeque();
                this.f826d = new ArrayDeque();
                break;
            case 4:
                this.f826d = new LinkedHashMap();
                this.f824b = "GET";
                this.f825c = new B0.d(26);
                break;
            case 5:
            default:
                this.f823a = new ArrayList();
                this.f824b = new HashMap();
                this.f825c = new HashMap();
                break;
            case 6:
                this.f823a = new o.b();
                this.f824b = new SparseArray();
                this.f825c = new o.e();
                this.f826d = new o.b();
                break;
            case 7:
                this.f823a = new J.b(10);
                this.f824b = new o.k();
                this.f825c = new ArrayList();
                this.f826d = new HashSet();
                break;
        }
    }

    @Override // j.InterfaceC0168a
    public boolean a(AbstractC0169b abstractC0169b, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f823a).onActionItemClicked(l(abstractC0169b), new MenuItemC0207t((Context) this.f824b, (E.a) menuItem));
    }

    @Override // j.InterfaceC0168a
    public boolean b(AbstractC0169b abstractC0169b, MenuC0200m menuC0200m) {
        j.f l2 = l(abstractC0169b);
        o.k kVar = (o.k) this.f826d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0200m, null);
        if (menu == null) {
            menu = new MenuC0184B((Context) this.f824b, menuC0200m);
            kVar.put(menuC0200m, menu);
        }
        return ((ActionMode.Callback) this.f823a).onCreateActionMode(l2, menu);
    }

    public void c(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        if (((ArrayList) this.f823a).contains(abstractComponentCallbacksC0060q)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0060q);
        }
        synchronized (((ArrayList) this.f823a)) {
            ((ArrayList) this.f823a).add(abstractComponentCallbacksC0060q);
        }
        abstractComponentCallbacksC0060q.f1402k = true;
    }

    @Override // j.InterfaceC0168a
    public void d(AbstractC0169b abstractC0169b) {
        ((ActionMode.Callback) this.f823a).onDestroyActionMode(l(abstractC0169b));
    }

    @Override // j.InterfaceC0168a
    public boolean e(AbstractC0169b abstractC0169b, MenuC0200m menuC0200m) {
        j.f l2 = l(abstractC0169b);
        o.k kVar = (o.k) this.f826d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0200m, null);
        if (menu == null) {
            menu = new MenuC0184B((Context) this.f824b, menuC0200m);
            kVar.put(menuC0200m, menu);
        }
        return ((ActionMode.Callback) this.f823a).onPrepareActionMode(l2, menu);
    }

    public i1.w f() {
        Map unmodifiableMap;
        i1.p pVar = (i1.p) this.f823a;
        if (pVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f824b;
        i1.n t2 = ((B0.d) this.f825c).t();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f826d;
        byte[] bArr = j1.b.f2967a;
        X0.f.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = O0.r.f695a;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            X0.f.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new i1.w(pVar, str, t2, null, unmodifiableMap);
    }

    public void g(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((o.k) this.f824b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                g(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public AbstractComponentCallbacksC0060q h(String str) {
        S s2 = (S) ((HashMap) this.f824b).get(str);
        if (s2 != null) {
            return s2.f1274c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0060q i(String str) {
        for (S s2 : ((HashMap) this.f824b).values()) {
            if (s2 != null) {
                AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = s2.f1274c;
                if (!str.equals(abstractComponentCallbacksC0060q.f1398e)) {
                    abstractComponentCallbacksC0060q = abstractComponentCallbacksC0060q.f1411t.f1225c.i(str);
                }
                if (abstractComponentCallbacksC0060q != null) {
                    return abstractComponentCallbacksC0060q;
                }
            }
        }
        return null;
    }

    public void j(m1.g gVar) {
        X0.f.e(gVar, "call");
        gVar.f3565b.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.f825c;
        synchronized (this) {
            if (!arrayDeque.remove(gVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        t();
    }

    @Override // G.c
    public void k() {
        View view = (View) this.f823a;
        view.clearAnimation();
        ((ViewGroup) this.f824b).endViewTransition(view);
        ((C0049f) this.f825c).d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((X) this.f826d) + " has been cancelled.");
        }
    }

    public j.f l(AbstractC0169b abstractC0169b) {
        ArrayList arrayList = (ArrayList) this.f825c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j.f fVar = (j.f) arrayList.get(i);
            if (fVar != null && fVar.f2821b == abstractC0169b) {
                return fVar;
            }
        }
        j.f fVar2 = new j.f((Context) this.f824b, abstractC0169b);
        arrayList.add(fVar2);
        return fVar2;
    }

    public ArrayList m() {
        ArrayList arrayList = new ArrayList();
        for (S s2 : ((HashMap) this.f824b).values()) {
            if (s2 != null) {
                arrayList.add(s2);
            }
        }
        return arrayList;
    }

    public ArrayList n() {
        ArrayList arrayList = new ArrayList();
        for (S s2 : ((HashMap) this.f824b).values()) {
            if (s2 != null) {
                arrayList.add(s2.f1274c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List o() {
        ArrayList arrayList;
        if (((ArrayList) this.f823a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f823a)) {
            arrayList = new ArrayList((ArrayList) this.f823a);
        }
        return arrayList;
    }

    public void p(String str, String str2) {
        X0.f.e(str, "name");
        X0.f.e(str2, "value");
        B0.d dVar = (B0.d) this.f825c;
        dVar.getClass();
        i1.m.d(str);
        i1.m.e(str2, str);
        dVar.z(str);
        dVar.s(str, str2);
    }

    public void q(S s2) {
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = s2.f1274c;
        String str = abstractComponentCallbacksC0060q.f1398e;
        HashMap hashMap = (HashMap) this.f824b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0060q.f1398e, s2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0060q);
        }
    }

    public void r(S s2) {
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = s2.f1274c;
        if (abstractComponentCallbacksC0060q.f1377A) {
            ((O) this.f826d).e(abstractComponentCallbacksC0060q);
        }
        if (((S) ((HashMap) this.f824b).put(abstractComponentCallbacksC0060q.f1398e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0060q);
        }
    }

    public void s(String str, i1.r rVar) {
        X0.f.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (rVar == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
            }
        } else if (!i1.r.n(str)) {
            throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
        }
        this.f824b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = j1.b.f2967a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f824b).iterator();
                X0.f.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    m1.g gVar = (m1.g) it.next();
                    if (((ArrayDeque) this.f825c).size() >= 64) {
                        break;
                    }
                    if (gVar.f3565b.get() < 5) {
                        it.remove();
                        gVar.f3565b.incrementAndGet();
                        arrayList.add(gVar);
                        ((ArrayDeque) this.f825c).add(gVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f825c).size();
                    ((ArrayDeque) this.f826d).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    m1.g gVar2 = (m1.g) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f823a) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = j1.b.f2973g + " Dispatcher";
                                X0.f.e(str, "name");
                                this.f823a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new j1.a(str, false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f823a;
                            X0.f.b(threadPoolExecutor);
                        } finally {
                        }
                    }
                    gVar2.getClass();
                    m1.j jVar = gVar2.f3566c;
                    byte[] bArr2 = j1.b.f2967a;
                    try {
                        try {
                            threadPoolExecutor.execute(gVar2);
                        } catch (RejectedExecutionException e2) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e2);
                            jVar.h(interruptedIOException);
                            gVar2.f3564a.onFailure(jVar, interruptedIOException);
                            jVar.f3569a.f2746a.j(gVar2);
                        }
                    } catch (Throwable th) {
                        jVar.f3569a.f2746a.j(gVar2);
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

    public v(Typeface typeface, U.b bVar) {
        int i;
        int i2;
        this.f826d = typeface;
        this.f823a = bVar;
        this.f825c = new u(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i3 = a2 + bVar.f406a;
            i = ((ByteBuffer) bVar.f409d).getInt(((ByteBuffer) bVar.f409d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f824b = new char[i * 2];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i4 = a3 + bVar.f406a;
            i2 = ((ByteBuffer) bVar.f409d).getInt(((ByteBuffer) bVar.f409d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            y yVar = new y(this, i5);
            U.a c2 = yVar.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.f409d).getInt(a4 + c2.f406a) : 0, (char[]) this.f824b, i5 * 2);
            q1.d.f("invalid metadata codepoint length", yVar.b() > 0);
            ((u) this.f825c).a(yVar, 0, yVar.b() - 1);
        }
    }
}
