package com.ironsource.b.d;

import com.ironsource.b.d.c;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: IronSourceLoggerManager.java */
/* loaded from: classes2.dex */
public class d extends c implements e {

    /* renamed from: b, reason: collision with root package name */
    private static d f6767b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<c> f6768c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6769d;

    private d(String str) {
        super(str);
        this.f6769d = false;
        this.f6768c = new ArrayList<>();
        e();
    }

    private void e() {
        this.f6768c.add(new a(1));
    }

    public static synchronized d c() {
        d dVar;
        synchronized (d.class) {
            if (f6767b == null) {
                f6767b = new d(d.class.getSimpleName());
            }
            dVar = f6767b;
        }
        return dVar;
    }

    public static synchronized d b(int i) {
        d dVar;
        synchronized (d.class) {
            if (f6767b == null) {
                f6767b = new d(d.class.getSimpleName());
            } else {
                f6767b.f6761a = i;
            }
            dVar = f6767b;
        }
        return dVar;
    }

    public void a(c cVar) {
        this.f6768c.add(cVar);
    }

    @Override // com.ironsource.b.d.c
    public synchronized void a(c.a aVar, String str, int i) {
        if (i < this.f6761a) {
            return;
        }
        Iterator<c> it = this.f6768c.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.b() <= i) {
                next.a(aVar, str, i);
            }
        }
    }

    @Override // com.ironsource.b.d.e
    public synchronized void b(c.a aVar, String str, int i) {
        a(aVar, str, i);
    }

    @Override // com.ironsource.b.d.c
    public synchronized void a(c.a aVar, String str, Throwable th) {
        try {
            if (th == null) {
                Iterator<c> it = this.f6768c.iterator();
                while (it.hasNext()) {
                    it.next().a(aVar, str, 3);
                }
            } else {
                Iterator<c> it2 = this.f6768c.iterator();
                while (it2.hasNext()) {
                    it2.next().a(aVar, str, th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private c a(String str) {
        Iterator<c> it = this.f6768c.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.a().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public void a(String str, int i) {
        if (str == null) {
            return;
        }
        c a2 = a(str);
        if (a2 == null) {
            a(c.a.NATIVE, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
            return;
        }
        if (i >= 0 && i <= 3) {
            a(c.a.NATIVE, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
            a2.a(i);
            return;
        }
        this.f6768c.remove(a2);
    }

    public boolean d() {
        return this.f6769d;
    }
}
