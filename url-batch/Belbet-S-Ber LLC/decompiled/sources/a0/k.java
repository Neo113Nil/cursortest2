package a0;

import a.c0;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.w;
import androidx.emoji2.text.z;
import androidx.fragment.app.k0;
import androidx.fragment.app.m0;
import androidx.fragment.app.q0;
import androidx.fragment.app.u;
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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.b0;
import k.m;
import k.t;
import t3.q;
import x2.r;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class k implements j0.d {

    /* renamed from: f, reason: collision with root package name */
    public Object f97f;

    /* renamed from: g, reason: collision with root package name */
    public Object f98g;
    public Object h;
    public Object i;

    public k(int i) {
        switch (i) {
            case 3:
                this.h = new ArrayList();
                this.f97f = new HashMap();
                this.f98g = new HashMap();
                break;
            case 4:
            case 5:
            default:
                this.f97f = new m0.b(10);
                this.f98g = new q.j(0);
                this.h = new ArrayList();
                this.i = new HashSet();
                break;
            case 6:
                this.f97f = new q.f(0);
                this.f98g = new SparseArray();
                this.h = new q.h();
                this.i = new q.f(0);
                break;
            case 7:
                this.f98g = new ArrayDeque();
                this.h = new ArrayDeque();
                this.i = new ArrayDeque();
                break;
            case 8:
                this.i = new LinkedHashMap();
                this.f98g = "GET";
                this.h = new q3.a(5);
                break;
        }
    }

    public void a(u uVar) {
        if (((ArrayList) this.h).contains(uVar)) {
            throw new IllegalStateException("Fragment already added: " + uVar);
        }
        synchronized (((ArrayList) this.h)) {
            ((ArrayList) this.h).add(uVar);
        }
        uVar.f652p = true;
    }

    public void b(d1.d dVar) {
        if (((LinkedHashSet) this.i).add(dVar)) {
            ((d1.e) this.f98g).a(this, dVar, -1);
        }
    }

    public void c(d1.j jVar, int i) {
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException(a4.b.f("Unsupported priority value: ", i).toString());
        }
        if (((LinkedHashSet) this.i).add(jVar)) {
            ((d1.e) this.f98g).a(this, jVar, i);
        }
    }

    public q d() {
        Map unmodifiableMap;
        t3.k kVar = (t3.k) this.f97f;
        if (kVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f98g;
        t3.j f5 = ((q3.a) this.h).f();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.i;
        byte[] bArr = u3.b.f3581a;
        i3.d.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = r.f3888f;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            i3.d.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new q(kVar, str, f5, null, unmodifiableMap);
    }

    public void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((q.j) this.f98g).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                e(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void f(d1.d dVar, d1.b bVar) {
        d1.e eVar = (d1.e) this.f98g;
        eVar.getClass();
        if (eVar.f1292g != 0) {
            return;
        }
        c0 c5 = eVar.c(-1);
        eVar.f1291f = c5;
        eVar.f1292g = -1;
        eVar.h = dVar;
        if (bVar != null) {
            if (c5 != null) {
                c5.d.getClass();
            }
            eVar.f1287a.b(new d1.g(bVar));
        }
    }

    public u g(String str) {
        q0 q0Var = (q0) ((HashMap) this.f97f).get(str);
        if (q0Var != null) {
            return q0Var.f623c;
        }
        return null;
    }

    public u h(String str) {
        for (q0 q0Var : ((HashMap) this.f97f).values()) {
            if (q0Var != null) {
                u uVar = q0Var.f623c;
                if (!str.equals(uVar.f646j)) {
                    uVar = uVar.f661y.f556c.h(str);
                }
                if (uVar != null) {
                    return uVar;
                }
            }
        }
        return null;
    }

    public void i(x3.f fVar) {
        fVar.f3910g.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.h;
        synchronized (this) {
            if (!arrayDeque.remove(fVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        t();
    }

    public j.e j(j.a aVar) {
        ArrayList arrayList = (ArrayList) this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j.e eVar = (j.e) arrayList.get(i);
            if (eVar != null && eVar.f2088b == aVar) {
                return eVar;
            }
        }
        j.e eVar2 = new j.e((Context) this.i, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList k() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : ((HashMap) this.f97f).values()) {
            if (q0Var != null) {
                arrayList.add(q0Var);
            }
        }
        return arrayList;
    }

    public ArrayList l() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : ((HashMap) this.f97f).values()) {
            if (q0Var != null) {
                arrayList.add(q0Var.f623c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List m() {
        ArrayList arrayList;
        if (((ArrayList) this.h).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.h)) {
            arrayList = new ArrayList((ArrayList) this.h);
        }
        return arrayList;
    }

    public void n(String str, String str2) {
        i3.d.e(str2, "value");
        q3.a aVar = (q3.a) this.h;
        aVar.getClass();
        r1.b.c(str);
        r1.b.d(str2, str);
        aVar.g(str);
        aVar.e(str, str2);
    }

    public void o(q0 q0Var) {
        u uVar = q0Var.f623c;
        String str = uVar.f646j;
        HashMap hashMap = (HashMap) this.f97f;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(uVar.f646j, q0Var);
        if (k0.H(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + uVar);
        }
    }

    @Override // j0.d
    public void onCancel() {
        View view = (View) this.f97f;
        view.clearAnimation();
        ((ViewGroup) this.f98g).endViewTransition(view);
        ((androidx.fragment.app.i) this.h).d();
        if (k0.H(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((v0) this.i) + " has been cancelled.");
        }
    }

    public void p(q0 q0Var) {
        u uVar = q0Var.f623c;
        if (uVar.F) {
            ((m0) this.i).e(uVar);
        }
        if (((q0) ((HashMap) this.f97f).put(uVar.f646j, null)) != null && k0.H(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + uVar);
        }
    }

    public void q(String str, s.a aVar) {
        i3.d.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (aVar == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
            }
        } else if (!r1.b.v(str)) {
            throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
        }
        this.f98g = str;
    }

    public boolean r(j.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f97f).onActionItemClicked(j(aVar), new t((Context) this.i, (h0.a) menuItem));
    }

    public boolean s(j.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f97f;
        j.e j2 = j(aVar);
        q.j jVar = (q.j) this.f98g;
        Menu menu2 = (Menu) jVar.get(menu);
        if (menu2 == null) {
            menu2 = new b0((Context) this.i, (m) menu);
            jVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(j2, menu2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = u3.b.f3581a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f98g).iterator();
                i3.d.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    x3.f fVar = (x3.f) it.next();
                    if (((ArrayDeque) this.h).size() >= 64) {
                        break;
                    }
                    if (fVar.f3910g.get() < 5) {
                        it.remove();
                        fVar.f3910g.incrementAndGet();
                        arrayList.add(fVar);
                        ((ArrayDeque) this.h).add(fVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.h).size();
                    ((ArrayDeque) this.i).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    x3.f fVar2 = (x3.f) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f97f) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = u3.b.f3586g + " Dispatcher";
                                i3.d.e(str, "name");
                                this.f97f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new u3.a(str, false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f97f;
                            i3.d.b(threadPoolExecutor);
                        } finally {
                        }
                    }
                    fVar2.getClass();
                    x3.i iVar = fVar2.h;
                    byte[] bArr2 = u3.b.f3581a;
                    try {
                        try {
                            threadPoolExecutor.execute(fVar2);
                        } catch (RejectedExecutionException e4) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e4);
                            iVar.h(interruptedIOException);
                            fVar2.f3909f.B(iVar, interruptedIOException);
                            iVar.f3913f.f3481f.i(fVar2);
                        }
                    } catch (Throwable th) {
                        iVar.f3913f.f3481f.i(fVar2);
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

    public k(Typeface typeface, w0.b bVar) {
        int i;
        int i4;
        int i5;
        int i6;
        this.i = typeface;
        this.f97f = bVar;
        this.h = new w(1024);
        int a5 = bVar.a(6);
        if (a5 != 0) {
            int i7 = a5 + bVar.f2771a;
            i = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i7) + i7);
        } else {
            i = 0;
        }
        this.f98g = new char[i * 2];
        int a6 = bVar.a(6);
        if (a6 != 0) {
            int i8 = a6 + bVar.f2771a;
            i4 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i8) + i8);
        } else {
            i4 = 0;
        }
        for (int i9 = 0; i9 < i4; i9++) {
            z zVar = new z(this, i9);
            w0.a b2 = zVar.b();
            int a7 = b2.a(4);
            Character.toChars(a7 != 0 ? ((ByteBuffer) b2.d).getInt(a7 + b2.f2771a) : 0, (char[]) this.f98g, i9 * 2);
            w0.a b5 = zVar.b();
            int a8 = b5.a(16);
            if (a8 != 0) {
                int i10 = a8 + b5.f2771a;
                i5 = ((ByteBuffer) b5.d).getInt(((ByteBuffer) b5.d).getInt(i10) + i10);
            } else {
                i5 = 0;
            }
            b4.l.f("invalid metadata codepoint length", i5 > 0);
            w wVar = (w) this.h;
            w0.a b6 = zVar.b();
            int a9 = b6.a(16);
            if (a9 != 0) {
                int i11 = a9 + b6.f2771a;
                i6 = ((ByteBuffer) b6.d).getInt(((ByteBuffer) b6.d).getInt(i11) + i11);
            } else {
                i6 = 0;
            }
            wVar.a(zVar, 0, i6 - 1);
        }
    }
}
