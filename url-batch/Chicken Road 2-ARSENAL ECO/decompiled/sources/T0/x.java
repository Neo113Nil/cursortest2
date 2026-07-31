package T0;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import k.v0;
import m1.AbstractC0521b;
import q.C0582b;

/* loaded from: classes.dex */
public final class x implements I, S0.e {

    /* renamed from: d, reason: collision with root package name */
    public final Lock f2365d;

    /* renamed from: e, reason: collision with root package name */
    public final Condition f2366e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f2367f;

    /* renamed from: g, reason: collision with root package name */
    public final R0.e f2368g;

    /* renamed from: h, reason: collision with root package name */
    public final HandlerC0183s f2369h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f2370i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f2371j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final v0 f2372k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f2373l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC0521b f2374m;

    /* renamed from: n, reason: collision with root package name */
    public volatile v f2375n;

    /* renamed from: o, reason: collision with root package name */
    public int f2376o;

    /* renamed from: p, reason: collision with root package name */
    public final u f2377p;

    /* renamed from: q, reason: collision with root package name */
    public final G f2378q;

    public x(Context context, u uVar, Lock lock, Looper looper, R0.e eVar, C0582b c0582b, v0 v0Var, C0582b c0582b2, AbstractC0521b abstractC0521b, ArrayList arrayList, G g7) {
        this.f2367f = context;
        this.f2365d = lock;
        this.f2368g = eVar;
        this.f2370i = c0582b;
        this.f2372k = v0Var;
        this.f2373l = c0582b2;
        this.f2374m = abstractC0521b;
        this.f2377p = uVar;
        this.f2378q = g7;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((S) arrayList.get(i7)).f2267f = this;
        }
        this.f2369h = new HandlerC0183s(this, looper, 1);
        this.f2366e = lock.newCondition();
        this.f2375n = new D3.M(23, this);
    }

    @Override // T0.I
    public final void a() {
        this.f2375n.j();
    }

    @Override // T0.I
    public final void b() {
        if (this.f2375n.o()) {
            this.f2371j.clear();
        }
    }

    @Override // T0.I
    public final void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f2375n);
        for (S0.c cVar : this.f2373l.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) cVar.f2202c).println(":");
            S0.a aVar = (S0.a) this.f2370i.get(cVar.f2201b);
            U0.t.f(aVar);
            aVar.g(concat, printWriter);
        }
    }

    @Override // T0.I
    public final boolean d() {
        return this.f2375n instanceof C0175j;
    }

    public final void e() {
        this.f2365d.lock();
        try {
            this.f2375n = new D3.M(23, this);
            this.f2375n.h();
            this.f2366e.signalAll();
        } finally {
            this.f2365d.unlock();
        }
    }

    @Override // S0.e
    public final void onConnected(Bundle bundle) {
        this.f2365d.lock();
        try {
            this.f2375n.c(bundle);
        } finally {
            this.f2365d.unlock();
        }
    }

    @Override // S0.e
    public final void onConnectionSuspended(int i7) {
        this.f2365d.lock();
        try {
            this.f2375n.f(i7);
        } finally {
            this.f2365d.unlock();
        }
    }
}
