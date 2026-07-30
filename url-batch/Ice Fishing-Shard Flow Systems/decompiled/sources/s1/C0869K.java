package s1;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import i.C0511M;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import n.w1;
import r1.C0845d;
import u.C0931b;
import u.C0934e;

/* renamed from: s1.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0869K implements InterfaceC0859A {

    /* renamed from: e, reason: collision with root package name */
    public final C0885p f7625e;

    /* renamed from: f, reason: collision with root package name */
    public final C0888s f7626f;

    /* renamed from: g, reason: collision with root package name */
    public final C0888s f7627g;

    /* renamed from: i, reason: collision with root package name */
    public Bundle f7629i;

    /* renamed from: m, reason: collision with root package name */
    public final Lock f7632m;

    /* renamed from: h, reason: collision with root package name */
    public final Set f7628h = Collections.newSetFromMap(new WeakHashMap());
    public q1.b j = null;

    /* renamed from: k, reason: collision with root package name */
    public q1.b f7630k = null;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7631l = false;

    /* renamed from: n, reason: collision with root package name */
    public int f7633n = 0;

    public C0869K(Context context, C0885p c0885p, ReentrantLock reentrantLock, Looper looper, q1.f fVar, C0934e c0934e, C0934e c0934e2, w1 w1Var, D1.d dVar, ArrayList arrayList, ArrayList arrayList2, C0934e c0934e3, C0934e c0934e4) {
        this.f7625e = c0885p;
        this.f7632m = reentrantLock;
        this.f7626f = new C0888s(context, c0885p, reentrantLock, looper, fVar, c0934e2, null, c0934e4, null, arrayList2, new C0511M(21, this));
        this.f7627g = new C0888s(context, c0885p, reentrantLock, looper, fVar, c0934e, w1Var, c0934e3, dVar, arrayList, new l4.b(20, this));
        C0934e c0934e5 = new C0934e(0);
        Iterator it = ((C0931b) c0934e2.keySet()).iterator();
        while (it.hasNext()) {
            c0934e5.put((C0845d) it.next(), this.f7626f);
        }
        Iterator it2 = ((C0931b) c0934e.keySet()).iterator();
        while (it2.hasNext()) {
            c0934e5.put((C0845d) it2.next(), this.f7627g);
        }
        Collections.unmodifiableMap(c0934e5);
    }

    @Override // s1.InterfaceC0859A
    public final void a() {
        this.f7633n = 2;
        this.f7631l = false;
        this.f7630k = null;
        this.j = null;
        this.f7626f.a();
        this.f7627g.a();
    }

    @Override // s1.InterfaceC0859A
    public final void b() {
        this.f7630k = null;
        this.j = null;
        this.f7633n = 0;
        this.f7626f.b();
        this.f7627g.b();
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r4.f7633n == 1) goto L16;
     */
    @Override // s1.InterfaceC0859A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        this.f7632m.lock();
        try {
            boolean z7 = false;
            if (this.f7626f.f7729o instanceof C0876g) {
                if (!(this.f7627g.f7729o instanceof C0876g)) {
                    q1.b bVar = this.f7630k;
                    if (!(bVar != null && bVar.f7311e == 4)) {
                    }
                }
                z7 = true;
            }
            return z7;
        } finally {
            this.f7632m.unlock();
        }
    }

    @Override // s1.InterfaceC0859A
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f7627g.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f7626f.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final void e() {
        Set set = this.f7628h;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        set.clear();
    }

    public final void f() {
        q1.b bVar;
        q1.b bVar2;
        q1.b bVar3;
        q1.b bVar4 = this.j;
        C0888s c0888s = this.f7626f;
        if (bVar4 == null || !bVar4.b()) {
            q1.b bVar5 = this.j;
            C0888s c0888s2 = this.f7627g;
            if (bVar5 != null && (bVar2 = this.f7630k) != null && bVar2.b()) {
                c0888s2.b();
                q1.b bVar6 = this.j;
                t1.u.f(bVar6);
                g(bVar6);
                return;
            }
            q1.b bVar7 = this.j;
            if (bVar7 == null || (bVar = this.f7630k) == null) {
                return;
            }
            if (c0888s2.f7730p < c0888s.f7730p) {
                bVar7 = bVar;
            }
            g(bVar7);
            return;
        }
        q1.b bVar8 = this.f7630k;
        if ((bVar8 == null || !bVar8.b()) && ((bVar3 = this.f7630k) == null || bVar3.f7311e != 4)) {
            if (bVar3 != null) {
                if (this.f7633n == 1) {
                    e();
                    return;
                } else {
                    g(bVar3);
                    c0888s.b();
                    return;
                }
            }
            return;
        }
        int i2 = this.f7633n;
        if (i2 != 1) {
            if (i2 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                this.f7633n = 0;
            } else {
                C0885p c0885p = this.f7625e;
                t1.u.f(c0885p);
                c0885p.g(this.f7629i);
            }
        }
        e();
        this.f7633n = 0;
    }

    public final void g(q1.b bVar) {
        int i2 = this.f7633n;
        if (i2 != 1) {
            if (i2 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f7633n = 0;
            }
            this.f7625e.m(bVar);
        }
        e();
        this.f7633n = 0;
    }
}
