package b0;

import T.Q;
import T.S;
import T.T;
import W.J;
import a0.C0148n;
import android.media.metrics.PlaybackMetrics;
import java.util.HashMap;
import java.util.Random;
import q0.C1353B;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: h, reason: collision with root package name */
    public static final C0148n f5285h = new C0148n(1);

    /* renamed from: i, reason: collision with root package name */
    public static final Random f5286i = new Random();

    /* renamed from: d, reason: collision with root package name */
    public h f5290d;

    /* renamed from: f, reason: collision with root package name */
    public String f5292f;

    /* renamed from: a, reason: collision with root package name */
    public final S f5287a = new S();

    /* renamed from: b, reason: collision with root package name */
    public final Q f5288b = new Q();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5289c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public T f5291e = T.f2704a;

    /* renamed from: g, reason: collision with root package name */
    public long f5293g = -1;

    public final void a(e eVar) {
        long j4 = eVar.f5280c;
        if (j4 != -1 && eVar.f5282e) {
            this.f5293g = j4;
        }
        this.f5292f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r12 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e b(int i4, C1353B c1353b) {
        long j4;
        long j5;
        long j6;
        HashMap hashMap = this.f5289c;
        e eVar = null;
        long j7 = Long.MAX_VALUE;
        for (e eVar2 : hashMap.values()) {
            long j8 = eVar2.f5280c;
            C1353B c1353b2 = eVar2.f5281d;
            if (j8 == -1 && i4 == eVar2.f5279b && c1353b != null) {
                long j9 = c1353b.f14815d;
                f fVar = eVar2.f5284g;
                j4 = -1;
                e eVar3 = (e) fVar.f5289c.get(fVar.f5292f);
                if (eVar3 != null) {
                    j6 = eVar3.f5280c;
                }
                j6 = fVar.f5293g + 1;
                if (j9 >= j6) {
                    eVar2.f5280c = j9;
                }
            } else {
                j4 = -1;
            }
            if (c1353b != null) {
                long j10 = c1353b.f14815d;
                if (j10 != j4) {
                    if (c1353b2 == null) {
                        if (!c1353b.b() && j10 == eVar2.f5280c) {
                            j5 = eVar2.f5280c;
                            if (j5 == j4 || j5 < j7) {
                                eVar = eVar2;
                                j7 = j5;
                            } else if (j5 == j7) {
                                String str = J.f3263a;
                                if (eVar.f5281d != null && c1353b2 != null) {
                                    eVar = eVar2;
                                }
                            }
                        }
                    } else if (j10 == c1353b2.f14815d && c1353b.f14813b == c1353b2.f14813b && c1353b.f14814c == c1353b2.f14814c) {
                        j5 = eVar2.f5280c;
                        if (j5 == j4) {
                        }
                        eVar = eVar2;
                        j7 = j5;
                    }
                }
            }
            if (i4 == eVar2.f5279b) {
                j5 = eVar2.f5280c;
                if (j5 == j4) {
                }
                eVar = eVar2;
                j7 = j5;
            }
        }
        if (eVar != null) {
            return eVar;
        }
        String str2 = (String) f5285h.get();
        e eVar4 = new e(this, str2, i4, c1353b);
        hashMap.put(str2, eVar4);
        return eVar4;
    }

    public final synchronized String c(T t4, C1353B c1353b) {
        return b(t4.g(c1353b.f14812a, this.f5288b).f2683c, c1353b).f5278a;
    }

    public final void d(C0255a c0255a) {
        C1353B c1353b;
        T t4 = c0255a.f5258b;
        int i4 = c0255a.f5259c;
        C1353B c1353b2 = c0255a.f5260d;
        boolean p2 = t4.p();
        HashMap hashMap = this.f5289c;
        if (p2) {
            String str = this.f5292f;
            if (str != null) {
                e eVar = (e) hashMap.get(str);
                eVar.getClass();
                a(eVar);
                return;
            }
            return;
        }
        e eVar2 = (e) hashMap.get(this.f5292f);
        this.f5292f = b(i4, c1353b2).f5278a;
        e(c0255a);
        if (c1353b2 != null) {
            long j4 = c1353b2.f14815d;
            if (c1353b2.b()) {
                if (eVar2 != null && eVar2.f5280c == j4 && (c1353b = eVar2.f5281d) != null && c1353b.f14813b == c1353b2.f14813b && c1353b.f14814c == c1353b2.f14814c) {
                    return;
                }
                b(i4, new C1353B(j4, c1353b2.f14812a));
                this.f5290d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void e(C0255a c0255a) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        long j4;
        this.f5290d.getClass();
        if (c0255a.f5258b.p()) {
            return;
        }
        C1353B c1353b = c0255a.f5260d;
        if (c1353b != null) {
            long j5 = c1353b.f14815d;
            if (j5 != -1) {
                e eVar = (e) this.f5289c.get(this.f5292f);
                if (eVar != null) {
                    j4 = eVar.f5280c;
                    if (j4 != -1) {
                        if (j5 < j4) {
                            return;
                        }
                    }
                }
                j4 = this.f5293g + 1;
                if (j5 < j4) {
                }
            }
            e eVar2 = (e) this.f5289c.get(this.f5292f);
            if (eVar2 != null && eVar2.f5280c == -1 && eVar2.f5279b != c0255a.f5259c) {
                return;
            }
        }
        e b4 = b(c0255a.f5259c, c0255a.f5260d);
        if (this.f5292f == null) {
            this.f5292f = b4.f5278a;
        }
        C1353B c1353b2 = c0255a.f5260d;
        if (c1353b2 != null && c1353b2.b()) {
            C1353B c1353b3 = c0255a.f5260d;
            e b5 = b(c0255a.f5259c, new C1353B(c1353b3.f14812a, c1353b3.f14815d, c1353b3.f14813b));
            if (!b5.f5282e) {
                b5.f5282e = true;
                c0255a.f5258b.g(c0255a.f5260d.f14812a, this.f5288b);
                this.f5288b.d(c0255a.f5260d.f14813b);
                Math.max(0L, J.Z(0L) + J.Z(this.f5288b.f2685e));
                this.f5290d.getClass();
            }
        }
        if (!b4.f5282e) {
            b4.f5282e = true;
            this.f5290d.getClass();
        }
        if (b4.f5278a.equals(this.f5292f) && !b4.f5283f) {
            b4.f5283f = true;
            h hVar = this.f5290d;
            String str = b4.f5278a;
            hVar.getClass();
            C1353B c1353b4 = c0255a.f5260d;
            if (c1353b4 == null || !c1353b4.b()) {
                hVar.b();
                hVar.f5305j = str;
                playerName = g.e().setPlayerName("AndroidXMedia3");
                playerVersion = playerName.setPlayerVersion("1.9.2");
                hVar.f5306k = playerVersion;
                hVar.c(c0255a.f5258b, c0255a.f5260d);
            }
        }
    }
}
