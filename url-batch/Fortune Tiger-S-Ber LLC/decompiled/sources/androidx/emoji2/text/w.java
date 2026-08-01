package androidx.emoji2.text;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.k0;
import androidx.fragment.app.m0;
import androidx.fragment.app.q0;
import androidx.fragment.app.v0;
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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class w implements g0.a {

    /* renamed from: f, reason: collision with root package name */
    public Object f368f;
    public Object g;
    public Object h;

    /* renamed from: i, reason: collision with root package name */
    public Object f369i;

    public w(int i4) {
        switch (i4) {
            case 3:
                this.g = new ArrayDeque();
                this.h = new ArrayDeque();
                this.f369i = new ArrayDeque();
                break;
            case 4:
                this.f369i = new LinkedHashMap();
                this.g = "GET";
                this.h = new a2.e(10);
                break;
            case 5:
                this.f368f = new n.f(0);
                this.g = new SparseArray();
                this.h = new n.h();
                this.f369i = new n.f(0);
                break;
            case 6:
            default:
                this.f368f = new ArrayList();
                this.g = new HashMap();
                this.h = new HashMap();
                break;
            case 7:
                this.f368f = new j0.b(10);
                this.g = new n.j(0);
                this.h = new ArrayList();
                this.f369i = new HashSet();
                break;
        }
    }

    public void a(androidx.fragment.app.u uVar) {
        if (((ArrayList) this.f368f).contains(uVar)) {
            throw new IllegalStateException("Fragment already added: " + uVar);
        }
        synchronized (((ArrayList) this.f368f)) {
            ((ArrayList) this.f368f).add(uVar);
        }
        uVar.f528p = true;
    }

    public c3.s b() {
        Map unmodifiableMap;
        c3.m mVar = (c3.m) this.f368f;
        if (mVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.g;
        c3.k u3 = ((a2.e) this.h).u();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f369i;
        byte[] bArr = d3.c.f1490a;
        u2.c.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = n2.p.f2954f;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            u2.c.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new c3.s(mVar, str, u3, null, unmodifiableMap);
    }

    public void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((n.j) this.g).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                c(arrayList2.get(i4), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public androidx.fragment.app.u d(String str) {
        q0 q0Var = (q0) ((HashMap) this.g).get(str);
        if (q0Var != null) {
            return q0Var.c;
        }
        return null;
    }

    public androidx.fragment.app.u e(String str) {
        for (q0 q0Var : ((HashMap) this.g).values()) {
            if (q0Var != null) {
                androidx.fragment.app.u uVar = q0Var.c;
                if (!str.equals(uVar.f522j)) {
                    uVar = uVar.f537y.c.e(str);
                }
                if (uVar != null) {
                    return uVar;
                }
            }
        }
        return null;
    }

    public void f(g3.f fVar) {
        fVar.g.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.h;
        synchronized (this) {
            if (!arrayDeque.remove(fVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        q();
    }

    public i.e g(i.a aVar) {
        ArrayList arrayList = (ArrayList) this.h;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            i.e eVar = (i.e) arrayList.get(i4);
            if (eVar != null && eVar.f2040b == aVar) {
                return eVar;
            }
        }
        i.e eVar2 = new i.e((Context) this.g, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : ((HashMap) this.g).values()) {
            if (q0Var != null) {
                arrayList.add(q0Var);
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : ((HashMap) this.g).values()) {
            if (q0Var != null) {
                arrayList.add(q0Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List j() {
        ArrayList arrayList;
        if (((ArrayList) this.f368f).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f368f)) {
            arrayList = new ArrayList((ArrayList) this.f368f);
        }
        return arrayList;
    }

    public void k(String str, String str2) {
        u2.c.e(str2, "value");
        a2.e eVar = (a2.e) this.h;
        eVar.getClass();
        k3.d.g(str);
        k3.d.j(str2, str);
        eVar.A(str);
        eVar.t(str, str2);
    }

    public void l(q0 q0Var) {
        androidx.fragment.app.u uVar = q0Var.c;
        String str = uVar.f522j;
        HashMap hashMap = (HashMap) this.g;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(uVar.f522j, q0Var);
        if (k0.G(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + uVar);
        }
    }

    public void m(q0 q0Var) {
        androidx.fragment.app.u uVar = q0Var.c;
        if (uVar.F) {
            ((m0) this.f369i).e(uVar);
        }
        if (((q0) ((HashMap) this.g).put(uVar.f522j, null)) != null && k0.G(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + uVar);
        }
    }

    public void n(String str, k3.m mVar) {
        u2.c.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (mVar == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
            }
        } else if (!k3.m.N(str)) {
            throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
        }
        this.g = str;
    }

    public boolean o(i.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f368f).onActionItemClicked(g(aVar), new j.t((Context) this.g, (e0.a) menuItem));
    }

    @Override // g0.a
    public void onCancel() {
        View view = (View) this.f368f;
        view.clearAnimation();
        ((ViewGroup) this.g).endViewTransition(view);
        ((androidx.fragment.app.i) this.h).d();
        if (k0.G(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((v0) this.f369i) + " has been cancelled.");
        }
    }

    public boolean p(i.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f368f;
        i.e g = g(aVar);
        n.j jVar = (n.j) this.f369i;
        Menu menu2 = (Menu) jVar.get(menu);
        if (menu2 == null) {
            menu2 = new j.b0((Context) this.g, (j.m) menu);
            jVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(g, menu2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q() {
        int size;
        int i4;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = d3.c.f1490a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.g).iterator();
                u2.c.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    g3.f fVar = (g3.f) it.next();
                    if (((ArrayDeque) this.h).size() >= 64) {
                        break;
                    }
                    if (fVar.g.get() < 5) {
                        it.remove();
                        fVar.g.incrementAndGet();
                        arrayList.add(fVar);
                        ((ArrayDeque) this.h).add(fVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.h).size();
                    ((ArrayDeque) this.f369i).size();
                }
                size = arrayList.size();
                for (i4 = 0; i4 < size; i4++) {
                    g3.f fVar2 = (g3.f) arrayList.get(i4);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f368f) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = d3.c.g + " Dispatcher";
                                u2.c.e(str, "name");
                                this.f368f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new d3.b(str, false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f368f;
                            u2.c.b(threadPoolExecutor);
                        } finally {
                        }
                    }
                    fVar2.getClass();
                    g3.i iVar = fVar2.h;
                    byte[] bArr2 = d3.c.f1490a;
                    try {
                        try {
                            threadPoolExecutor.execute(fVar2);
                        } catch (RejectedExecutionException e4) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e4);
                            iVar.h(interruptedIOException);
                            fVar2.f1940f.B(iVar, interruptedIOException);
                            iVar.f1943f.f1102f.f(fVar2);
                        }
                    } catch (Throwable th) {
                        iVar.f1943f.f1102f.f(fVar2);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        size = arrayList.size();
        while (i4 < size) {
        }
    }

    public w(Typeface typeface, s0.b bVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        this.f369i = typeface;
        this.f368f = bVar;
        this.h = new v(1024);
        int a4 = bVar.a(6);
        if (a4 != 0) {
            int i8 = a4 + bVar.f2793a;
            i4 = ((ByteBuffer) bVar.f2795d).getInt(((ByteBuffer) bVar.f2795d).getInt(i8) + i8);
        } else {
            i4 = 0;
        }
        this.g = new char[i4 * 2];
        int a5 = bVar.a(6);
        if (a5 != 0) {
            int i9 = a5 + bVar.f2793a;
            i5 = ((ByteBuffer) bVar.f2795d).getInt(((ByteBuffer) bVar.f2795d).getInt(i9) + i9);
        } else {
            i5 = 0;
        }
        for (int i10 = 0; i10 < i5; i10++) {
            z zVar = new z(this, i10);
            s0.a b2 = zVar.b();
            int a6 = b2.a(4);
            Character.toChars(a6 != 0 ? ((ByteBuffer) b2.f2795d).getInt(a6 + b2.f2793a) : 0, (char[]) this.g, i10 * 2);
            s0.a b4 = zVar.b();
            int a7 = b4.a(16);
            if (a7 != 0) {
                int i11 = a7 + b4.f2793a;
                i6 = ((ByteBuffer) b4.f2795d).getInt(((ByteBuffer) b4.f2795d).getInt(i11) + i11);
            } else {
                i6 = 0;
            }
            k3.d.e("invalid metadata codepoint length", i6 > 0);
            v vVar = (v) this.h;
            s0.a b5 = zVar.b();
            int a8 = b5.a(16);
            if (a8 != 0) {
                int i12 = a8 + b5.f2793a;
                i7 = ((ByteBuffer) b5.f2795d).getInt(((ByteBuffer) b5.f2795d).getInt(i12) + i12);
            } else {
                i7 = 0;
            }
            vVar.a(zVar, 0, i7 - 1);
        }
    }
}
