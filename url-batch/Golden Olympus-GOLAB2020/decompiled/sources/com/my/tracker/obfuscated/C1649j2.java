package com.my.tracker.obfuscated;

import android.os.SystemClock;
import java.util.ArrayList;

/* renamed from: com.my.tracker.obfuscated.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1649j2 {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC1674q f21385a;

    /* renamed from: b, reason: collision with root package name */
    final C1704x2 f21386b;

    /* renamed from: h, reason: collision with root package name */
    protected C1615b3 f21392h = C1615b3.f21150j;

    /* renamed from: c, reason: collision with root package name */
    final a f21387c = b();

    /* renamed from: d, reason: collision with root package name */
    final C1651k0 f21388d = new C1651k0();

    /* renamed from: e, reason: collision with root package name */
    final C1616c f21389e = new C1616c();

    /* renamed from: f, reason: collision with root package name */
    final C1705y f21390f = new C1705y();

    /* renamed from: g, reason: collision with root package name */
    final C1642i f21391g = new C1642i();

    /* renamed from: com.my.tracker.obfuscated.j2$a */
    final class a {

        /* renamed from: a, reason: collision with root package name */
        final int[] f21393a = {0};

        /* renamed from: b, reason: collision with root package name */
        final int[] f21394b = {0};

        a() {
        }

        private boolean d(int i4) {
            for (int i5 : this.f21394b) {
                if (i4 == i5) {
                    AbstractC1708y2.c("TimeSpentCore: you can't create timespent with id = " + i4 + " (reason: reserved for internal use)");
                    return true;
                }
            }
            return false;
        }

        private boolean e(int i4) {
            for (int i5 : this.f21393a) {
                if (i4 == i5) {
                    AbstractC1708y2.c("TimeSpentCore: you can't create timespent with id = " + i4 + " (reason: reserved for internal use)");
                    return true;
                }
            }
            return false;
        }

        boolean a(int i4) {
            StringBuilder sb;
            String str;
            if (e(i4)) {
                return false;
            }
            if (C1649j2.this.f21389e.b(i4)) {
                sb = new StringBuilder();
                sb.append("TimeSpent: you can't create timespent with id = ");
                sb.append(i4);
                str = " (reason: already have same type timespent with this id)";
            } else {
                if (!C1649j2.this.f21388d.b(i4) && !C1649j2.this.f21390f.a(i4)) {
                    return true;
                }
                sb = new StringBuilder();
                sb.append("TimeSpent: you can't create timespent with id = ");
                sb.append(i4);
                str = " (reason: already have another type timespent with this id)";
            }
            sb.append(str);
            AbstractC1708y2.c(sb.toString());
            return false;
        }

        boolean b(int i4) {
            StringBuilder sb;
            String str;
            if (e(i4)) {
                return false;
            }
            if (C1649j2.this.f21388d.b(i4)) {
                sb = new StringBuilder();
                sb.append("TimeSpent: you can't create timespent with id = ");
                sb.append(i4);
                str = " (reason: already have same type timespent with this id)";
            } else {
                if (!C1649j2.this.f21389e.b(i4) && !C1649j2.this.f21390f.a(i4)) {
                    return true;
                }
                sb = new StringBuilder();
                sb.append("TimeSpent: you can't create timespent with id = ");
                sb.append(i4);
                str = " (reason: already have another type timespent with this id)";
            }
            sb.append(str);
            AbstractC1708y2.c(sb.toString());
            return false;
        }

        boolean c(int i4) {
            if (d(i4)) {
                return false;
            }
            if (!C1649j2.this.f21388d.b(i4) && !C1649j2.this.f21389e.b(i4)) {
                return true;
            }
            AbstractC1708y2.c("TimeSpent: you can't create timespent with id = " + i4 + " (reason: already have another type timespent with this id)");
            return false;
        }
    }

    public C1649j2(long j4, InterfaceC1674q interfaceC1674q) {
        this.f21385a = interfaceC1674q;
        this.f21386b = C1704x2.a(j4, new Runnable() { // from class: com.my.tracker.obfuscated.O2
            @Override // java.lang.Runnable
            public final void run() {
                C1649j2.this.f();
            }
        });
        AbstractC1708y2.a("TimeSpentCore: created");
    }

    synchronized C1680r2 a(long j4, long j5) {
        C1680r2 c1680r2;
        AbstractC1708y2.a("TimeSpentCore: start collecting DTO data, tickTimestamp = " + j5);
        boolean c4 = this.f21391g.c();
        ArrayList a4 = this.f21390f.a();
        ArrayList a5 = this.f21389e.a(j4, c4);
        ArrayList a6 = this.f21388d.a(j4, c4);
        InterfaceC1633f2 a7 = this.f21391g.a(j4);
        ArrayList arrayList = new ArrayList(a5.size() + a6.size());
        arrayList.addAll(a5);
        arrayList.addAll(a6);
        c1680r2 = new C1680r2(j5, a7, (InterfaceC1633f2[]) arrayList.toArray(new InterfaceC1633f2[0]), (InterfaceC1697w[]) a4.toArray(new InterfaceC1697w[0]));
        if (AbstractC1708y2.a()) {
            AbstractC1708y2.a("TimeSpentCore: collected DTO data:\n" + c1680r2);
        }
        return c1680r2;
    }

    a b() {
        return new a();
    }

    synchronized void c() {
        try {
            try {
                AbstractC1708y2.a("TimeSpentCore: ***** start generating zero tick *****");
                long uptimeMillis = SystemClock.uptimeMillis();
                long currentTimeMillis = System.currentTimeMillis();
                this.f21390f.b(0);
                b(uptimeMillis, currentTimeMillis, this.f21392h);
                AbstractC1708y2.a("TimeSpentCore: ***** zero tick generated *****");
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public synchronized void h(long j4, int i4) {
        try {
            this.f21388d.b(i4, j4, this.f21391g.c());
        } catch (Exception unused) {
        }
    }

    public void a() {
        AbstractC1658m.c(new Runnable() { // from class: com.my.tracker.obfuscated.S2
            @Override // java.lang.Runnable
            public final void run() {
                C1649j2.this.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized void c(int i4) {
        if (this.f21387c.c(i4)) {
            this.f21390f.b(i4);
            if (this.f21386b.b()) {
                AbstractC1708y2.a("TimeSpentCore: starting ticker... (reason: incremented count based TimeSpent)");
                this.f21386b.e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public synchronized void g(long j4, int i4) {
        try {
            this.f21389e.b(i4, j4, this.f21391g.c());
            if (this.f21391g.b() && this.f21389e.b() == 0) {
                this.f21391g.g(j4);
                AbstractC1708y2.a("TimeSpentCore: there was last anytime TimeSpent during background state, stop tracking app useful background");
            }
        } catch (Exception unused) {
        }
    }

    public void e() {
        final long uptimeMillis = SystemClock.uptimeMillis();
        AbstractC1658m.c(new Runnable() { // from class: com.my.tracker.obfuscated.X2
            @Override // java.lang.Runnable
            public final void run() {
                C1649j2.this.d(uptimeMillis);
            }
        });
    }

    public void f() {
        final long uptimeMillis = SystemClock.uptimeMillis();
        final long currentTimeMillis = System.currentTimeMillis();
        AbstractC1658m.c(new Runnable() { // from class: com.my.tracker.obfuscated.Q2
            @Override // java.lang.Runnable
            public final void run() {
                C1649j2.this.b(uptimeMillis, currentTimeMillis);
            }
        });
    }

    public void a(final int i4) {
        AbstractC1658m.c(new Runnable() { // from class: com.my.tracker.obfuscated.T2
            @Override // java.lang.Runnable
            public final void run() {
                C1649j2.this.c(i4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized void d(long j4) {
        AbstractC1708y2.a("TimeSpentCore: ***** app is going to foreground *****");
        if (this.f21391g.c()) {
            AbstractC1708y2.a("TimeSpentCore: something went wrong, already in FOREGROUND state. Skip");
            return;
        }
        this.f21388d.e(j4);
        this.f21389e.e(j4);
        this.f21391g.e(j4);
        this.f21391g.d();
        this.f21388d.c(j4);
        this.f21389e.c(j4);
        this.f21391g.c(j4);
        if (this.f21386b.b()) {
            AbstractC1708y2.a("TimeSpentCore: starting ticker... (reason: app going to foreground)");
            this.f21386b.e();
        }
        AbstractC1708y2.a("TimeSpentCore: ***** app is on foreground *****");
    }

    public void d() {
        final long uptimeMillis = SystemClock.uptimeMillis();
        AbstractC1658m.c(new Runnable() { // from class: com.my.tracker.obfuscated.U2
            @Override // java.lang.Runnable
            public final void run() {
                C1649j2.this.c(uptimeMillis);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized void c(long j4) {
        AbstractC1708y2.a("TimeSpentCore: ***** app is going to background *****");
        if (this.f21391g.b()) {
            AbstractC1708y2.a("TimeSpentCore: something went wrong, already in BACKGROUND state. Skip");
            return;
        }
        this.f21388d.d(j4);
        this.f21389e.d(j4);
        this.f21391g.d(j4);
        this.f21391g.a(this.f21389e.b());
        this.f21388d.b(j4);
        this.f21389e.b(j4);
        this.f21391g.b(j4);
        AbstractC1708y2.a("TimeSpentCore: ***** app is on background *****");
    }

    synchronized void b(long j4, long j5, C1615b3 c1615b3) {
        try {
            AbstractC1708y2.a("TimeSpentCore: ***** onTick started ***** timestamp = " + j5);
            if (this.f21391g.b() && this.f21389e.b() == 0 && this.f21386b.a()) {
                AbstractC1708y2.a("TimeSpentCore: onTick: stopping ticker... (reason: no useful background)");
                this.f21386b.f();
            }
            C1680r2 a4 = a(j4, j5);
            AbstractC1708y2.a("TimeSpentCore: ***** onTick finished *****");
            this.f21385a.a(a4, c1615b3);
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void a(long j4, long j5, C1615b3 c1615b3) {
        try {
            this.f21386b.d();
            b(j4, j5, c1615b3);
        } catch (Throwable th) {
            th = th;
            while (true) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized void f(long j4, int i4) {
        if (this.f21387c.b(i4)) {
            this.f21388d.a(i4, j4, this.f21391g.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(long j4, long j5) {
        b(j4, j5, this.f21392h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized void e(long j4, int i4) {
        if (this.f21387c.a(i4)) {
            this.f21389e.a(i4, j4, this.f21391g.c());
            if (this.f21391g.b() && this.f21389e.b() == 1) {
                this.f21391g.h(j4);
                AbstractC1708y2.a("TimeSpentCore: this is first anytime TimeSpent during background state, start tracking app useful background");
                this.f21386b.e();
                AbstractC1708y2.a("TimeSpentCore: starting ticker... (reason: first anytime timeSpent during background state)");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(C1615b3 c1615b3, long j4, long j5) {
        C1649j2 c1649j2;
        if (AbstractC1654l.a(this.f21392h.f21157g, c1615b3.f21157g) != 0) {
            c1649j2 = this;
            c1649j2.a(j4, j5, this.f21392h);
        } else {
            c1649j2 = this;
        }
        c1649j2.f21392h = c1615b3;
    }

    public void b(C1615b3 c1615b3) {
        this.f21392h = c1615b3;
    }

    public void a(final C1615b3 c1615b3) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        final long currentTimeMillis = System.currentTimeMillis();
        AbstractC1658m.c(new Runnable() { // from class: com.my.tracker.obfuscated.R2
            @Override // java.lang.Runnable
            public final void run() {
                C1649j2.this.a(c1615b3, uptimeMillis, currentTimeMillis);
            }
        });
    }

    public void b(final int i4, boolean z4) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        AbstractC1658m.c(z4 ? new Runnable() { // from class: com.my.tracker.obfuscated.Y2
            @Override // java.lang.Runnable
            public final void run() {
                C1649j2.this.g(uptimeMillis, i4);
            }
        } : new Runnable() { // from class: com.my.tracker.obfuscated.P2
            @Override // java.lang.Runnable
            public final void run() {
                C1649j2.this.h(uptimeMillis, i4);
            }
        });
    }

    public void a(final int i4, boolean z4) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        AbstractC1658m.c(z4 ? new Runnable() { // from class: com.my.tracker.obfuscated.V2
            @Override // java.lang.Runnable
            public final void run() {
                C1649j2.this.e(uptimeMillis, i4);
            }
        } : new Runnable() { // from class: com.my.tracker.obfuscated.W2
            @Override // java.lang.Runnable
            public final void run() {
                C1649j2.this.f(uptimeMillis, i4);
            }
        });
    }
}
