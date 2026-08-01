package com.fortunequest.neontrack.data;

import Y0.s;
import Y0.t;
import Y0.u;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.os.Looper;
import e0.ExecutorC0105d;
import g.C0121b;
import g.m;
import h0.f;
import h0.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import k0.InterfaceC0203a;
import k0.c;
import k1.e;
import l0.C0274a;
import l0.C0276c;
import u0.C0365d;
import u0.C0366e;
import u0.C0372k;
import u0.C0385x;

/* loaded from: classes.dex */
public abstract class FortuneQuestDatabase {

    /* renamed from: l, reason: collision with root package name */
    public static final C0366e f2094l = new C0366e();

    /* renamed from: m, reason: collision with root package name */
    public static volatile FortuneQuestDatabase f2095m;

    /* renamed from: a, reason: collision with root package name */
    public volatile C0276c f2096a;

    /* renamed from: b, reason: collision with root package name */
    public ExecutorC0105d f2097b;

    /* renamed from: c, reason: collision with root package name */
    public m f2098c;
    public InterfaceC0203a d;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f2100f;

    /* renamed from: j, reason: collision with root package name */
    public final Map f2102j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f2103k;

    /* renamed from: e, reason: collision with root package name */
    public final l f2099e = c();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f2101g = new LinkedHashMap();
    public final ReentrantReadWriteLock h = new ReentrantReadWriteLock();
    public final ThreadLocal i = new ThreadLocal();

    public FortuneQuestDatabase() {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        e.d(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f2102j = synchronizedMap;
        this.f2103k = new LinkedHashMap();
    }

    public static Object n(Class cls, InterfaceC0203a interfaceC0203a) {
        if (cls.isInstance(interfaceC0203a)) {
            return interfaceC0203a;
        }
        if (interfaceC0203a instanceof f) {
            return n(cls, ((f) interfaceC0203a).a());
        }
        return null;
    }

    public final void a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public abstract C0365d b();

    public abstract l c();

    public abstract InterfaceC0203a d(C0121b c0121b);

    public List e(LinkedHashMap linkedHashMap) {
        e.e(linkedHashMap, "autoMigrationSpecs");
        return s.f1516a;
    }

    public final InterfaceC0203a f() {
        InterfaceC0203a interfaceC0203a = this.d;
        if (interfaceC0203a != null) {
            return interfaceC0203a;
        }
        e.h("internalOpenHelper");
        throw null;
    }

    public Set g() {
        return u.f1518a;
    }

    public Map h() {
        return t.f1517a;
    }

    public abstract C0372k i();

    public final void j() {
        f().m().k();
        if (f().m().r()) {
            return;
        }
        l lVar = this.f2099e;
        if (lVar.f2974e.compareAndSet(false, true)) {
            ExecutorC0105d executorC0105d = lVar.f2971a.f2097b;
            if (executorC0105d != null) {
                executorC0105d.execute(lVar.f2979l);
            } else {
                e.h("internalQueryExecutor");
                throw null;
            }
        }
    }

    public final boolean k() {
        C0276c c0276c = this.f2096a;
        return c0276c != null && c0276c.f3512a.isOpen();
    }

    public final Cursor l(c cVar, CancellationSignal cancellationSignal) {
        a();
        if (!f().m().r() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
        if (cancellationSignal == null) {
            return f().m().u(cVar);
        }
        C0276c m2 = f().m();
        m2.getClass();
        String d = cVar.d();
        String[] strArr = C0276c.f3511b;
        e.b(cancellationSignal);
        C0274a c0274a = new C0274a(0, cVar);
        SQLiteDatabase sQLiteDatabase = m2.f3512a;
        e.e(sQLiteDatabase, "sQLiteDatabase");
        e.e(d, "sql");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(c0274a, d, strArr, null, cancellationSignal);
        e.d(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    public abstract C0385x m();
}
