package com.my.tracker.obfuscated;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.my.tracker.MyTrackerParams;
import java.util.Objects;

/* renamed from: com.my.tracker.obfuscated.m2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1661m2 implements InterfaceC1696v2, InterfaceC1692u2 {

    /* renamed from: g, reason: collision with root package name */
    private static volatile C1661m2 f21434g;

    /* renamed from: a, reason: collision with root package name */
    final C1649j2 f21435a = new C1649j2(InterfaceC1645i2.f21372a, new InterfaceC1674q() { // from class: com.my.tracker.obfuscated.d3
        @Override // com.my.tracker.obfuscated.InterfaceC1674q
        public final void a(Object obj, Object obj2) {
            C1661m2.this.b((C1680r2) obj, (C1615b3) obj2);
        }
    });

    /* renamed from: b, reason: collision with root package name */
    private C1712z2 f21436b;

    /* renamed from: c, reason: collision with root package name */
    private Context f21437c;

    /* renamed from: d, reason: collision with root package name */
    InterfaceC1673p2 f21438d;

    /* renamed from: e, reason: collision with root package name */
    C1665n2 f21439e;

    /* renamed from: f, reason: collision with root package name */
    C1657l2 f21440f;

    private C1661m2() {
    }

    static C1661m2 c() {
        C1661m2 c1661m2;
        C1661m2 c1661m22 = f21434g;
        if (c1661m22 != null) {
            return c1661m22;
        }
        synchronized (C1661m2.class) {
            try {
                c1661m2 = f21434g;
                if (c1661m2 == null) {
                    c1661m2 = new C1661m2();
                    f21434g = c1661m2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1661m2;
    }

    public static InterfaceC1692u2 d() {
        return c();
    }

    public static InterfaceC1696v2 e() {
        return c();
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1692u2
    public synchronized void b() {
        AbstractC1708y2.a("TimeSpentModule: onAppGoingBackground");
        if (this.f21438d == null) {
            AbstractC1708y2.a("TimeSpentModule: An error occurred during initialization, TimeSpent functionality is not available");
        } else {
            this.f21435a.d();
        }
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1696v2
    public synchronized void a(int i4) {
        AbstractC1708y2.a("TimeSpentModule: incrementEventTimeSpent id = " + i4);
        if (this.f21438d != null) {
            this.f21435a.a(i4);
            return;
        }
        AbstractC1708y2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called incrementEventTimeSpent id = " + i4 + ")");
    }

    void b(final C1680r2 c1680r2, final C1615b3 c1615b3) {
        AbstractC1708y2.a("TimeSpentModule: core tick DTO collected, sending to repository...");
        if (this.f21438d == null) {
            AbstractC1708y2.b("TimeSpentModule: repository was not created, can't store and send this packet, drop");
            return;
        }
        if (this.f21440f == null) {
            AbstractC1708y2.a("TimeSpentModule: packetGenerator was not initialized, drop");
        } else if (this.f21436b == null) {
            AbstractC1708y2.a("TimeSpentModule: config is not specified, drop");
        } else {
            AbstractC1658m.d(new Runnable() { // from class: com.my.tracker.obfuscated.g3
                @Override // java.lang.Runnable
                public final void run() {
                    C1661m2.this.a(c1680r2, c1615b3);
                }
            });
        }
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1692u2
    public void a(C1712z2 c1712z2, Context context) {
        C1677q2 a4 = C1677q2.a(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, c1712z2, context);
        this.f21438d = a4;
        this.f21439e = C1665n2.a(10, c1712z2, a4);
        MyTrackerParams m4 = c1712z2.m();
        final C1649j2 c1649j2 = this.f21435a;
        Objects.requireNonNull(c1649j2);
        InterfaceC1685t interfaceC1685t = new InterfaceC1685t() { // from class: com.my.tracker.obfuscated.e3
            @Override // com.my.tracker.obfuscated.InterfaceC1685t
            public final void a(Object obj) {
                C1649j2.this.b((C1615b3) obj);
            }
        };
        final C1649j2 c1649j22 = this.f21435a;
        Objects.requireNonNull(c1649j22);
        m4.a(interfaceC1685t, new InterfaceC1685t() { // from class: com.my.tracker.obfuscated.f3
            @Override // com.my.tracker.obfuscated.InterfaceC1685t
            public final void a(Object obj) {
                C1649j2.this.a((C1615b3) obj);
            }
        });
        this.f21435a.a();
        this.f21440f = new C1657l2();
        this.f21437c = context;
        this.f21436b = c1712z2;
        AbstractC1708y2.a("TimeSpentModule: TimeSpentModule initialized");
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1696v2
    public synchronized void b(int i4, boolean z4) {
        AbstractC1708y2.a("TimeSpentModule: stopTimeSpent id = " + i4 + ", canUseInBackground = " + z4);
        if (this.f21438d != null) {
            this.f21435a.b(i4, z4);
            return;
        }
        AbstractC1708y2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called stopTimeSpent id = " + i4 + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(C1680r2 c1680r2, C1615b3 c1615b3) {
        if (!AbstractC1684s2.a(c1680r2)) {
            AbstractC1708y2.a("TimeSpentModule: collected dto data is empty, no need to send");
            return;
        }
        if (!AbstractC1684s2.c(c1680r2)) {
            AbstractC1708y2.a("TimeSpentModule: collected dto data is corrupted, sending anyway");
        }
        try {
            this.f21438d.a(c1680r2.c(), this.f21440f.a(this.f21436b.o(), c1615b3, c1680r2, this.f21436b.h(), this.f21436b.n(), this.f21437c));
            AbstractC1708y2.a("TimeSpentModule: successfully stored new time spent tick in repository, notifying sender...");
            this.f21439e.c();
        } catch (Exception unused) {
            AbstractC1708y2.b("TimeSpentModule: something went wrong while storing new timeSpentTick in repository, this tick didn't stored and wouldn't be sent");
        }
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1692u2
    public synchronized void a() {
        AbstractC1708y2.a("TimeSpentModule: onAppGoingForeground");
        if (this.f21438d == null) {
            AbstractC1708y2.a("TimeSpentModule: An error occurred during initialization, TimeSpent functionality is not available");
        } else {
            this.f21435a.e();
        }
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1696v2
    public synchronized void a(int i4, boolean z4) {
        AbstractC1708y2.a("TimeSpentModule: startTimeSpent id = " + i4 + ", canUseInBackground = " + z4);
        if (this.f21438d != null) {
            this.f21435a.a(i4, z4);
            return;
        }
        AbstractC1708y2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called startTimeSpent id = " + i4 + ")");
    }
}
