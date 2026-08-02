package a0;

import T.C0104w;
import W.AbstractC0108a;
import a.AbstractC0124a;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: a0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0141g implements O {

    /* renamed from: r, reason: collision with root package name */
    public static final v2.a0 f4122r;

    /* renamed from: a, reason: collision with root package name */
    public final T.S f4123a;

    /* renamed from: b, reason: collision with root package name */
    public final T.Q f4124b;

    /* renamed from: c, reason: collision with root package name */
    public final u0.e f4125c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4126d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4127e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4128f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4129g;

    /* renamed from: h, reason: collision with root package name */
    public final long f4130h;

    /* renamed from: i, reason: collision with root package name */
    public final long f4131i;

    /* renamed from: j, reason: collision with root package name */
    public final long f4132j;

    /* renamed from: k, reason: collision with root package name */
    public final long f4133k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4134l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f4135m;
    public final long n;
    public final v2.f0 o;

    /* renamed from: p, reason: collision with root package name */
    public final ConcurrentHashMap f4136p;

    /* renamed from: q, reason: collision with root package name */
    public long f4137q;

    static {
        v2.G g4 = v2.I.f15571b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        v2.r.b(6, objArr);
        f4122r = v2.I.i(6, objArr);
    }

    public C0141g() {
        u0.e eVar = new u0.e();
        a(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 0, "bufferForPlaybackMs", CommonUrlParts.Values.FALSE_INTEGER);
        a(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 0, "bufferForPlaybackForLocalPlaybackMs", CommonUrlParts.Values.FALSE_INTEGER);
        a(2000, 0, "bufferForPlaybackAfterRebufferMs", CommonUrlParts.Values.FALSE_INTEGER);
        a(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", CommonUrlParts.Values.FALSE_INTEGER);
        a(50000, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, "minBufferMs", "bufferForPlaybackMs");
        a(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        a(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(50000, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        a(0, 0, "backBufferDurationMs", CommonUrlParts.Values.FALSE_INTEGER);
        this.f4123a = new T.S();
        this.f4124b = new T.Q();
        this.f4125c = eVar;
        long j4 = 50000;
        this.f4126d = W.J.M(j4);
        long j5 = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        this.f4127e = W.J.M(j5);
        this.f4128f = W.J.M(j4);
        this.f4129g = W.J.M(j4);
        this.f4130h = W.J.M(j5);
        this.f4131i = W.J.M(j5);
        this.f4132j = W.J.M(2000);
        this.f4133k = W.J.M(j5);
        this.f4134l = -1;
        this.f4135m = true;
        this.n = W.J.M(0);
        this.f4136p = new ConcurrentHashMap();
        this.o = v2.f0.a(v2.f0.f15629g);
        this.f4137q = -1L;
    }

    public static void a(int i4, int i5, String str, String str2) {
        AbstractC0124a.l(i4 >= i5, "%s cannot be less than %s", str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(N n) {
        int i4;
        boolean z;
        long j4;
        float f4;
        b0.i iVar = n.f3977a;
        long j5 = n.f3980d;
        C0140f c0140f = (C0140f) this.f4136p.get(iVar);
        c0140f.getClass();
        C0140f c0140f2 = (C0140f) this.f4136p.get(iVar);
        c0140f2.getClass();
        synchronized (c0140f2) {
            i4 = c0140f2.f4109d;
        }
        int i5 = i4 * this.f4125c.f15442b;
        C0140f c0140f3 = (C0140f) this.f4136p.get(iVar);
        c0140f3.getClass();
        boolean z4 = i5 >= c0140f3.f4108c;
        if (iVar.equals(b0.i.f5318c)) {
            return !z4;
        }
        T.T t4 = n.f3978b;
        C0104w c0104w = t4.m(t4.g(n.f3979c.f14812a, this.f4124b).f2683c, this.f4123a, 0L).f2692c.f2900b;
        if (c0104w != null) {
            String scheme = c0104w.f2893a.getScheme();
            if (TextUtils.isEmpty(scheme) || f4122r.contains(scheme)) {
                z = true;
                j4 = !z ? this.f4127e : this.f4126d;
                long j6 = !z ? this.f4129g : this.f4128f;
                f4 = n.f3981e;
                if (f4 > 1.0f) {
                    j4 = Math.min(W.J.z(j4, f4), j6);
                }
                if (j5 >= Math.max(j4, 500000L)) {
                    boolean z5 = (z ? this.f4135m : false) || !z4;
                    c0140f.f4107b = z5;
                    if (!z5 && j5 < 500000) {
                        AbstractC0108a.s("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                    }
                } else if (j5 >= j6 || z4) {
                    c0140f.f4107b = false;
                }
                return c0140f.f4107b;
            }
        }
        z = false;
        if (!z) {
        }
        if (!z) {
        }
        f4 = n.f3981e;
        if (f4 > 1.0f) {
        }
        if (j5 >= Math.max(j4, 500000L)) {
        }
        return c0140f.f4107b;
    }

    public final void c() {
        int i4 = 0;
        if (this.f4136p.isEmpty()) {
            u0.e eVar = this.f4125c;
            synchronized (eVar) {
                if (eVar.f15441a) {
                    eVar.c(0);
                }
            }
            return;
        }
        u0.e eVar2 = this.f4125c;
        Iterator it = this.f4136p.values().iterator();
        while (it.hasNext()) {
            i4 += ((C0140f) it.next()).f4108c;
        }
        eVar2.c(i4);
    }
}
