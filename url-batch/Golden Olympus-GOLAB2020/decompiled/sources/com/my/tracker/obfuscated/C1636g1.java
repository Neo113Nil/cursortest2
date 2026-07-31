package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.C1628e1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.tracker.obfuscated.g1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1636g1 {

    /* renamed from: a, reason: collision with root package name */
    final C1628e1 f21332a;

    /* renamed from: b, reason: collision with root package name */
    final int f21333b;

    /* renamed from: c, reason: collision with root package name */
    final int f21334c;

    /* renamed from: d, reason: collision with root package name */
    final int f21335d;

    /* renamed from: e, reason: collision with root package name */
    final int f21336e;

    /* renamed from: f, reason: collision with root package name */
    long f21337f;

    /* renamed from: g, reason: collision with root package name */
    long f21338g;

    private C1636g1(C1628e1 c1628e1, int i4, int i5, int i6, int i7) {
        this.f21332a = c1628e1;
        this.f21333b = i4;
        this.f21334c = i5;
        this.f21335d = i6;
        this.f21336e = i7;
        Long b4 = c1628e1.b("timestamp_base");
        this.f21337f = b4 == null ? 0L : b4.longValue();
        this.f21338g = c1628e1.l();
    }

    public boolean a() {
        try {
            this.f21332a.c();
            this.f21332a.b();
            this.f21332a.e();
            this.f21332a.d();
            this.f21332a.a();
            this.f21332a.a("custom_events_skipped_count", (Long) null);
            this.f21338g = 0L;
            C1628e1.f a4 = this.f21332a.a("default_session");
            try {
                c(a4.b() ? a4.m() : 0L);
                a4.close();
                return true;
            } finally {
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public InterfaceC1707y1 b() {
        return new C1711z1(this.f21332a);
    }

    public InterfaceC1609a2 c() {
        return new C1614b2(this.f21332a, "default_session");
    }

    public InterfaceC1611b d() {
        try {
            return this.f21332a.f();
        } catch (Throwable th) {
            AbstractC1708y2.b("MyTrackerRepository error: ", th);
            return null;
        }
    }

    public List e() {
        ArrayList arrayList = new ArrayList();
        C1628e1.b bVar = null;
        try {
            bVar = this.f21332a.h();
            while (bVar.b()) {
                C1630f a4 = C1630f.a(bVar.m(), bVar.n(), bVar.o(), bVar.p(), bVar.e());
                if (a4 != null) {
                    arrayList.add(a4.a(bVar.a()));
                }
            }
        } catch (Throwable th) {
            try {
                AbstractC1708y2.b("MyTrackerRepository error: error while reading purchases", th);
            } finally {
                if (bVar != null) {
                    bVar.close();
                }
            }
        }
        return arrayList;
    }

    public long f() {
        try {
            Long b4 = this.f21332a.b("custom_events_skipped_count");
            if (b4 == null) {
                return 0L;
            }
            return b4.longValue();
        } catch (Throwable th) {
            AbstractC1708y2.b("Error: get custom events skipped count", th);
            return 0L;
        }
    }

    public List g() {
        ArrayList arrayList = new ArrayList();
        C1628e1.e eVar = null;
        try {
            eVar = this.f21332a.k();
            while (eVar.b()) {
                C1671p0 a4 = C1671p0.a(eVar.m(), eVar.n(), eVar.e());
                if (a4 != null) {
                    arrayList.add(a4.a(eVar.a()));
                }
            }
        } catch (Throwable th) {
            try {
                AbstractC1708y2.b("MyTrackerRepository error: error while reading purchases", th);
            } finally {
                if (eVar != null) {
                    eVar.close();
                }
            }
        }
        return arrayList;
    }

    public long h() {
        return this.f21338g;
    }

    public long i() {
        return this.f21337f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public boolean j() {
        ?? b4;
        try {
            C1628e1.c i4 = this.f21332a.i();
            try {
                b4 = i4.b();
                try {
                    i4.close();
                    C1628e1.f a4 = this.f21332a.a("default_session");
                    try {
                        b4 = b4;
                        if (a4.b()) {
                            b4++;
                        }
                        a4.close();
                    } finally {
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                if (i4 != null) {
                    try {
                        i4.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
        }
        return b4 != 0;
    }

    public boolean k(byte[] bArr, long j4) {
        return c(13, bArr, j4);
    }

    public boolean l(byte[] bArr, long j4) {
        return a(25, bArr, false, true, j4);
    }

    public boolean m(byte[] bArr, long j4) {
        return c(7, bArr, j4);
    }

    public boolean n(byte[] bArr, long j4) {
        return a(26, bArr, false, true, j4);
    }

    public boolean o(byte[] bArr, long j4) {
        return a(28, bArr, false, true, j4);
    }

    public boolean p(byte[] bArr, long j4) {
        return a(29, bArr, false, true, j4);
    }

    public boolean q(byte[] bArr, long j4) {
        return a(2, bArr, true, false, j4);
    }

    public boolean r(byte[] bArr, long j4) {
        return c(8, bArr, j4);
    }

    public boolean s(byte[] bArr, long j4) {
        return a(5, bArr, true, false, j4);
    }

    public void a(long j4) {
        try {
            this.f21332a.c(j4);
        } catch (Throwable th) {
            AbstractC1708y2.b("MyTrackerRepository error: ", th);
        }
    }

    public boolean b(byte[] bArr, long j4) {
        return a(33, bArr, true, false, j4);
    }

    public boolean c(byte[] bArr, long j4) {
        return a(32, bArr, true, false, j4);
    }

    public boolean d(byte[] bArr, long j4) {
        try {
            if (this.f21332a.f(6L) >= this.f21334c) {
                long j5 = 0;
                if (this.f21332a.a(6L, bArr) == 0) {
                    AbstractC1708y2.a("MyTrackerRepository: maximum count of custom events is exceeded, event has been skipped");
                    Long b4 = this.f21332a.b("custom_events_skipped_count");
                    if (b4 != null) {
                        j5 = b4.longValue();
                    }
                    long j6 = j5 + 1;
                    AbstractC1708y2.a("MyTrackerRepository: skipped custom events count: " + j6);
                    this.f21332a.a("custom_events_skipped_count", Long.valueOf(j6));
                    return false;
                }
            }
            return a(6, bArr, false, true, j4);
        } catch (Throwable th) {
            AbstractC1708y2.b("MyTrackerRepository error: event serialization failed, type: 6", th);
            return false;
        }
    }

    public boolean e(byte[] bArr, long j4) {
        return a(15, bArr, true, true, j4);
    }

    public boolean f(byte[] bArr, long j4) {
        return a(10, bArr, true, false, j4);
    }

    public boolean g(byte[] bArr, long j4) {
        return a(27, bArr, false, true, j4);
    }

    public boolean h(byte[] bArr, long j4) {
        return a(31, bArr, true, false, j4);
    }

    public boolean i(byte[] bArr, long j4) {
        return a(1, bArr, true, false, j4);
    }

    public boolean j(byte[] bArr, long j4) {
        return c(9, bArr, j4);
    }

    private boolean c(int i4, byte[] bArr, long j4) {
        try {
            return a(i4, bArr, false, true, j4);
        } catch (Throwable th) {
            AbstractC1708y2.b("MyTrackerRepository error: event serialization failed, type: " + i4, th);
            return false;
        }
    }

    public boolean a(int i4, byte[] bArr, long j4) {
        return a(i4, bArr, true, true, j4);
    }

    public boolean b(long j4) {
        return c(3, new byte[0], j4);
    }

    public boolean a(byte[] bArr, long j4) {
        return a(14, bArr, true, false, j4);
    }

    public boolean b(int i4, byte[] bArr, long j4) {
        Throwable th;
        int i5;
        boolean z4 = i4 == 20 || i4 == 21;
        if (i4 == 24) {
            try {
                long j5 = i4;
                if (this.f21332a.f(j5) >= this.f21334c && this.f21332a.a(j5, bArr) == 0) {
                    AbstractC1708y2.a("MyTrackerRepository: maximum count of mini-app custom events is exceeded, event has been skipped");
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
                i5 = i4;
                AbstractC1708y2.b("MyTrackerRepository error: event serialization failed, type: " + i5, th);
                return false;
            }
        }
        i5 = i4;
        try {
            return a(i5, bArr, z4, true, j4);
        } catch (Throwable th3) {
            th = th3;
            AbstractC1708y2.b("MyTrackerRepository error: event serialization failed, type: " + i5, th);
            return false;
        }
    }

    void c(long j4) {
        try {
            this.f21332a.a("timestamp_base", Long.valueOf(j4));
            this.f21337f = j4;
        } catch (Throwable th) {
            AbstractC1708y2.b("MyTrackerRepository error: ", th);
        }
    }

    public void a(C1630f c1630f) {
        String jSONObject = c1630f.e().toString();
        String a4 = c1630f.a();
        String f4 = c1630f.f();
        int g4 = c1630f.g();
        try {
            if (this.f21332a.g() >= this.f21336e) {
                AbstractC1708y2.a("MyTrackerRepository: max count of raw purchases is reached");
                AbstractC1708y2.a("MyTrackerRepository: appgalleery raw purchase with data: " + jSONObject + ", signature " + a4 + " isn't inserted");
                return;
            }
            long a5 = this.f21332a.a(jSONObject, a4, f4, g4, c1630f.h());
            if (a5 >= 0) {
                AbstractC1708y2.a("MyTrackerRepository: appgallery raw purchase was inserted; id: " + a5 + ", data: " + jSONObject + ", signature: " + a4);
                c1630f.a(a5);
            }
        } catch (Throwable th) {
            AbstractC1708y2.b("MyTrackerRepository error: can't insert appgallery raw purchase with data: " + jSONObject + ", signature " + a4, th);
        }
    }

    public void b(C1630f c1630f) {
        Long b4 = c1630f.b();
        if (b4 != null) {
            try {
                this.f21332a.a(b4.longValue());
            } catch (Throwable th) {
                AbstractC1708y2.b("MyTrackerRepository error: error while removing raw appgallery purchase with id " + b4, th);
            }
        }
    }

    public boolean a(int i4, byte[] bArr, boolean z4, boolean z5, long j4) {
        long j5;
        boolean z6;
        long j6;
        boolean z7 = z4;
        try {
            long j7 = C1628e1.f21269y;
            if (z5) {
                C1628e1.c cVar = null;
                try {
                    cVar = this.f21332a.b(i4, bArr);
                    if (cVar.b()) {
                        j7 = cVar.a();
                        j5 = cVar.c();
                    } else {
                        j5 = 0;
                    }
                    cVar.close();
                } catch (Throwable th) {
                    if (cVar != null) {
                        cVar.close();
                    }
                    throw th;
                }
            } else {
                j5 = 0;
            }
            try {
                if (j7 == C1628e1.f21269y) {
                    AbstractC1708y2.a("MyTrackerRepository: insert " + i4 + " event");
                    long a4 = this.f21332a.a(i4, bArr, z7);
                    if (a4 == C1628e1.f21269y || !z7) {
                        j6 = a4;
                        z6 = false;
                    } else {
                        j6 = a4;
                        z6 = false;
                        this.f21338g++;
                    }
                    j7 = j6;
                } else {
                    z6 = false;
                    AbstractC1708y2.a("MyTrackerRepository: aggregate " + i4 + " event");
                }
                if (j7 == C1628e1.f21269y) {
                    AbstractC1708y2.b("MyTrackerRepository error: event insertion failed, type: " + i4);
                    return z6;
                }
                if (this.f21337f == 0) {
                    c(j4);
                }
                this.f21332a.c(j7, j4 - this.f21337f);
                long d4 = this.f21332a.d(j7);
                AbstractC1708y2.a("MyTrackerRepository: event timestamps count: " + d4);
                long j8 = (long) this.f21333b;
                if (d4 <= j8) {
                    return true;
                }
                long a5 = this.f21332a.a(j7, d4 - j8);
                this.f21332a.d(j7, j5 + a5);
                AbstractC1708y2.a("MyTrackerRepository: maximum count of event timestamps is exceeded, remove oldest timestamps, count: " + a5);
                return true;
            } catch (Throwable th2) {
                th = th2;
                AbstractC1708y2.b("MyTrackerRepository error: event insertion failed, type: " + i4, th);
                return z7;
            }
        } catch (Throwable th3) {
            th = th3;
            z7 = false;
            AbstractC1708y2.b("MyTrackerRepository error: event insertion failed, type: " + i4, th);
            return z7;
        }
    }

    public void b(C1671p0 c1671p0) {
        Long b4 = c1671p0.b();
        if (b4 != null) {
            try {
                this.f21332a.b(b4.longValue());
            } catch (Throwable th) {
                AbstractC1708y2.b("MyTrackerRepository error: error while removing raw purchase with id " + b4, th);
            }
        }
    }

    public void a(C1671p0 c1671p0) {
        String jSONObject = c1671p0.d().toString();
        String a4 = c1671p0.a();
        try {
            if (this.f21332a.j() >= this.f21336e) {
                AbstractC1708y2.a("MyTrackerRepository: max count of raw purchases is reached");
                AbstractC1708y2.a("MyTrackerRepository: raw purchase with data: " + jSONObject + ", signature " + a4 + " isn't inserted");
                return;
            }
            long a5 = this.f21332a.a(jSONObject, a4, c1671p0.f());
            if (a5 >= 0) {
                AbstractC1708y2.a("MyTrackerRepository: raw purchase was inserted; id: " + a5 + ", data: " + jSONObject + ", signature: " + a4);
                c1671p0.a(a5);
            }
        } catch (Throwable th) {
            AbstractC1708y2.b("MyTrackerRepository error: can't insert raw purchase with data: " + jSONObject + ", signature " + a4, th);
        }
    }

    public boolean a(long j4, long j5) {
        AutoCloseable autoCloseable = null;
        try {
            C1628e1.f a4 = this.f21332a.a("default_session");
            long j6 = 0;
            if (a4.b()) {
                long a5 = a4.a();
                long m4 = a4.m();
                long c4 = a4.c();
                if (this.f21337f == 0) {
                    c(m4);
                }
                AbstractC1708y2.a("MyTrackerRepository: finish previous session");
                if (j5 == 0) {
                    this.f21332a.a(a5, m4 - this.f21337f, true, 0L);
                } else {
                    C1628e1 c1628e1 = this.f21332a;
                    long j7 = this.f21337f;
                    c1628e1.a(a5, m4 - j7, false, j5 - j7);
                }
                long g4 = this.f21332a.g(a5);
                AbstractC1708y2.a("MyTrackerRepository: session timestamps count: " + g4);
                long j8 = (long) this.f21335d;
                if (g4 > j8) {
                    j6 = this.f21332a.b(a5, g4 - j8);
                    AbstractC1708y2.a("MyTrackerRepository: maximum count of session timestamps is exceeded, remove oldest timestamps, count: " + j6);
                }
                AbstractC1708y2.a("MyTrackerRepository: start new session");
                this.f21332a.a(a5, j4, c4 + j6);
            } else {
                AbstractC1708y2.a("MyTrackerRepository: insert session");
                if (this.f21332a.a("default_session", j4) == C1628e1.f21269y) {
                    AbstractC1708y2.b("MyTrackerRepository error: session insertion failed ");
                    a4.close();
                    return false;
                }
                if (this.f21337f == 0) {
                    c(j4);
                }
            }
            a4.close();
            return true;
        } catch (Throwable th) {
            try {
                AbstractC1708y2.b("MyTrackerRepository error: session insertion failed ", th);
                return false;
            } finally {
                if (0 != 0) {
                    autoCloseable.close();
                }
            }
        }
    }

    public static C1636g1 a(C1628e1 c1628e1) {
        return a(c1628e1, 1000, 500, 500, 100);
    }

    static C1636g1 a(C1628e1 c1628e1, int i4, int i5, int i6, int i7) {
        try {
            return new C1636g1(c1628e1, i4, i5, i6, i7);
        } catch (Throwable th) {
            AbstractC1708y2.b("MyTrackerRepository error: failed to create MyTrackerRepository instance", th);
            return null;
        }
    }

    public void a(byte[] bArr) {
        try {
            this.f21332a.i(14L);
            this.f21332a.a(bArr);
        } catch (Throwable th) {
            AbstractC1708y2.b("MyTrackerRepository error: ", th);
        }
    }
}
