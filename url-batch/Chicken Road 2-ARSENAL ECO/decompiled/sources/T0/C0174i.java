package T0;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import k.v0;
import q.C0582b;
import q.C0588h;

/* renamed from: T0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174i implements I {

    /* renamed from: d, reason: collision with root package name */
    public final u f2295d;

    /* renamed from: e, reason: collision with root package name */
    public final x f2296e;

    /* renamed from: f, reason: collision with root package name */
    public final x f2297f;

    /* renamed from: h, reason: collision with root package name */
    public Bundle f2299h;

    /* renamed from: l, reason: collision with root package name */
    public final Lock f2303l;

    /* renamed from: g, reason: collision with root package name */
    public final Set f2298g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i, reason: collision with root package name */
    public R0.a f2300i = null;

    /* renamed from: j, reason: collision with root package name */
    public R0.a f2301j = null;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2302k = false;

    /* renamed from: m, reason: collision with root package name */
    public int f2304m = 0;

    public C0174i(Context context, u uVar, ReentrantLock reentrantLock, Looper looper, R0.e eVar, C0582b c0582b, C0582b c0582b2, v0 v0Var, W0.b bVar, S0.a aVar, ArrayList arrayList, ArrayList arrayList2, C0582b c0582b3, C0582b c0582b4) {
        this.f2295d = uVar;
        this.f2303l = reentrantLock;
        this.f2296e = new x(context, uVar, reentrantLock, looper, eVar, c0582b2, null, c0582b4, null, arrayList2, new D3.M(25, this));
        this.f2297f = new x(context, uVar, reentrantLock, looper, eVar, c0582b, v0Var, c0582b3, bVar, arrayList, new J1.c(27, this));
        C0582b c0582b5 = new C0582b();
        Iterator it = ((C0588h) c0582b2.keySet()).iterator();
        while (it.hasNext()) {
            c0582b5.put((S0.b) it.next(), this.f2296e);
        }
        Iterator it2 = ((C0588h) c0582b.keySet()).iterator();
        while (it2.hasNext()) {
            c0582b5.put((S0.b) it2.next(), this.f2297f);
        }
        Collections.unmodifiableMap(c0582b5);
    }

    public static /* bridge */ /* synthetic */ void g(C0174i c0174i, int i7) {
        c0174i.f2295d.q(i7);
        c0174i.f2301j = null;
        c0174i.f2300i = null;
    }

    public static void h(C0174i c0174i) {
        R0.a aVar;
        R0.a aVar2;
        R0.a aVar3;
        R0.a aVar4 = c0174i.f2300i;
        x xVar = c0174i.f2297f;
        x xVar2 = c0174i.f2296e;
        if (aVar4 == null || !aVar4.b()) {
            if (c0174i.f2300i != null && (aVar2 = c0174i.f2301j) != null && aVar2.b()) {
                xVar.b();
                R0.a aVar5 = c0174i.f2300i;
                U0.t.f(aVar5);
                c0174i.e(aVar5);
                return;
            }
            R0.a aVar6 = c0174i.f2300i;
            if (aVar6 == null || (aVar = c0174i.f2301j) == null) {
                return;
            }
            if (xVar.f2376o < xVar2.f2376o) {
                aVar6 = aVar;
            }
            c0174i.e(aVar6);
            return;
        }
        R0.a aVar7 = c0174i.f2301j;
        if ((aVar7 == null || !aVar7.b()) && ((aVar3 = c0174i.f2301j) == null || aVar3.f2053g != 4)) {
            if (aVar3 != null) {
                if (c0174i.f2304m == 1) {
                    c0174i.f();
                    return;
                } else {
                    c0174i.e(aVar3);
                    xVar2.b();
                    return;
                }
            }
            return;
        }
        int i7 = c0174i.f2304m;
        if (i7 != 1) {
            if (i7 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                c0174i.f2304m = 0;
            } else {
                u uVar = c0174i.f2295d;
                U0.t.f(uVar);
                uVar.a(c0174i.f2299h);
            }
        }
        c0174i.f();
        c0174i.f2304m = 0;
    }

    @Override // T0.I
    public final void a() {
        this.f2304m = 2;
        this.f2302k = false;
        this.f2301j = null;
        this.f2300i = null;
        this.f2296e.a();
        this.f2297f.a();
    }

    @Override // T0.I
    public final void b() {
        this.f2301j = null;
        this.f2300i = null;
        this.f2304m = 0;
        this.f2296e.b();
        this.f2297f.b();
        f();
    }

    @Override // T0.I
    public final void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f2297f.c(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f2296e.c(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r4.f2304m == 1) goto L16;
     */
    @Override // T0.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        this.f2303l.lock();
        try {
            boolean z5 = false;
            if (this.f2296e.f2375n instanceof C0175j) {
                if (!(this.f2297f.f2375n instanceof C0175j)) {
                    R0.a aVar = this.f2301j;
                    if (!(aVar != null && aVar.f2053g == 4)) {
                    }
                }
                z5 = true;
            }
            return z5;
        } finally {
            this.f2303l.unlock();
        }
    }

    public final void e(R0.a aVar) {
        int i7 = this.f2304m;
        if (i7 != 1) {
            if (i7 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f2304m = 0;
            }
            this.f2295d.b(aVar);
        }
        f();
        this.f2304m = 0;
    }

    public final void f() {
        Set set = this.f2298g;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        set.clear();
    }
}
