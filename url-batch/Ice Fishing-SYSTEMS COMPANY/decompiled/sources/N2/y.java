package N2;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import m.c1;

/* loaded from: classes.dex */
public final class y implements J, M2.i {

    /* renamed from: A, reason: collision with root package name */
    public final c1 f2132A;

    /* renamed from: B, reason: collision with root package name */
    public final s.b f2133B;

    /* renamed from: C, reason: collision with root package name */
    public final Q2.b f2134C;

    /* renamed from: D, reason: collision with root package name */
    public volatile w f2135D;

    /* renamed from: E, reason: collision with root package name */
    public int f2136E;

    /* renamed from: F, reason: collision with root package name */
    public final v f2137F;

    /* renamed from: G, reason: collision with root package name */
    public final H f2138G;

    /* renamed from: n, reason: collision with root package name */
    public final ReentrantLock f2139n;

    /* renamed from: u, reason: collision with root package name */
    public final Condition f2140u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f2141v;

    /* renamed from: w, reason: collision with root package name */
    public final L2.f f2142w;

    /* renamed from: x, reason: collision with root package name */
    public final HandlerC0333t f2143x;

    /* renamed from: y, reason: collision with root package name */
    public final s.b f2144y;

    /* renamed from: z, reason: collision with root package name */
    public final HashMap f2145z = new HashMap();

    public y(Context context, v vVar, ReentrantLock reentrantLock, Looper looper, L2.f fVar, s.b bVar, c1 c1Var, s.b bVar2, Q2.b bVar3, ArrayList arrayList, H h9) {
        this.f2141v = context;
        this.f2139n = reentrantLock;
        this.f2142w = fVar;
        this.f2144y = bVar;
        this.f2132A = c1Var;
        this.f2133B = bVar2;
        this.f2134C = bVar3;
        this.f2137F = vVar;
        this.f2138G = h9;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((T) arrayList.get(i)).f2034v = this;
        }
        this.f2143x = new HandlerC0333t(this, looper, 1);
        this.f2140u = reentrantLock.newCondition();
        this.f2135D = new h4.c(8, this);
    }

    @Override // N2.J
    public final void a() {
        this.f2135D.e();
    }

    @Override // N2.J
    public final boolean b() {
        return this.f2135D instanceof C0325k;
    }

    @Override // N2.J
    public final void c() {
        if (this.f2135D.x()) {
            this.f2145z.clear();
        }
    }

    @Override // N2.J
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f2135D);
        Iterator it = ((s.g) this.f2133B.keySet()).iterator();
        while (it.hasNext()) {
            M2.e eVar = (M2.e) it.next();
            printWriter.append((CharSequence) str).append((CharSequence) eVar.f1883c).println(":");
            M2.c cVar = (M2.c) this.f2144y.getOrDefault(eVar.f1882b, null);
            O2.w.h(cVar);
            cVar.e(concat, printWriter);
        }
    }

    public final void e() {
        this.f2139n.lock();
        try {
            this.f2135D = new h4.c(8, this);
            this.f2135D.t();
            this.f2140u.signalAll();
        } finally {
            this.f2139n.unlock();
        }
    }

    @Override // M2.i
    public final void onConnected(Bundle bundle) {
        this.f2139n.lock();
        try {
            this.f2135D.c(bundle);
        } finally {
            this.f2139n.unlock();
        }
    }

    @Override // M2.i
    public final void onConnectionSuspended(int i) {
        this.f2139n.lock();
        try {
            this.f2135D.r(i);
        } finally {
            this.f2139n.unlock();
        }
    }
}
