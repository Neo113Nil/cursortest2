package n1;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import l.q0;
import m1.InterfaceC1276c;
import r.C1392b;
import r.C1398h;

/* renamed from: n1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1297A implements InterfaceC1308L, m1.i {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f11277a;

    /* renamed from: e, reason: collision with root package name */
    public final Condition f11278e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f11279f;

    /* renamed from: g, reason: collision with root package name */
    public final l1.g f11280g;

    /* renamed from: h, reason: collision with root package name */
    public final HandlerC1335v f11281h;

    /* renamed from: i, reason: collision with root package name */
    public final C1392b f11282i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f11283j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final q0 f11284k;

    /* renamed from: l, reason: collision with root package name */
    public final C1392b f11285l;

    /* renamed from: m, reason: collision with root package name */
    public final E1.f f11286m;

    /* renamed from: n, reason: collision with root package name */
    public volatile InterfaceC1338y f11287n;

    /* renamed from: o, reason: collision with root package name */
    public int f11288o;

    /* renamed from: p, reason: collision with root package name */
    public final C1337x f11289p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC1306J f11290q;

    public C1297A(Context context, C1337x c1337x, ReentrantLock reentrantLock, Looper looper, l1.g gVar, C1392b c1392b, q0 q0Var, C1392b c1392b2, E1.f fVar, ArrayList arrayList, InterfaceC1306J interfaceC1306J) {
        this.f11279f = context;
        this.f11277a = reentrantLock;
        this.f11280g = gVar;
        this.f11282i = c1392b;
        this.f11284k = q0Var;
        this.f11285l = c1392b2;
        this.f11286m = fVar;
        this.f11289p = c1337x;
        this.f11290q = interfaceC1306J;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((X) arrayList.get(i2)).f11356f = this;
        }
        this.f11281h = new HandlerC1335v(this, looper, 1);
        this.f11278e = reentrantLock.newCondition();
        this.f11287n = new V0.j(20, this);
    }

    @Override // n1.InterfaceC1308L
    public final void a() {
        this.f11287n.n();
    }

    @Override // n1.InterfaceC1308L
    public final void b() {
        if (this.f11287n.r()) {
            this.f11283j.clear();
        }
    }

    @Override // n1.InterfaceC1308L
    public final B1.n c(B1.n nVar) {
        nVar.J();
        return this.f11287n.s(nVar);
    }

    @Override // n1.InterfaceC1308L
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.f11287n);
        Iterator it = ((C1398h) this.f11285l.keySet()).iterator();
        while (it.hasNext()) {
            String valueOf = String.valueOf(str);
            m1.e eVar = (m1.e) it.next();
            printWriter.append((CharSequence) str).append((CharSequence) eVar.f11125c).println(StringUtils.PROCESS_POSTFIX_DELIMITER);
            InterfaceC1276c interfaceC1276c = (InterfaceC1276c) this.f11282i.getOrDefault(eVar.f11124b, null);
            o1.u.g(interfaceC1276c);
            interfaceC1276c.h(valueOf.concat("  "), printWriter);
        }
    }

    @Override // n1.InterfaceC1308L
    public final boolean e() {
        return this.f11287n instanceof C1328o;
    }

    public final void f() {
        this.f11277a.lock();
        try {
            this.f11287n = new V0.j(20, this);
            this.f11287n.j();
            this.f11278e.signalAll();
        } finally {
            this.f11277a.unlock();
        }
    }

    @Override // m1.i
    public final void onConnected(Bundle bundle) {
        this.f11277a.lock();
        try {
            this.f11287n.c(bundle);
        } finally {
            this.f11277a.unlock();
        }
    }

    @Override // m1.i
    public final void onConnectionSuspended(int i2) {
        this.f11277a.lock();
        try {
            this.f11287n.g(i2);
        } finally {
            this.f11277a.unlock();
        }
    }
}
