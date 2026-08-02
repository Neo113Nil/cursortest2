package G3;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final G1.c f956a = new G1.c(1);

    /* renamed from: b, reason: collision with root package name */
    public final t1.h f957b = new t1.h(4);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f958c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f959d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final D0.d f960e = new D0.d(4);

    /* renamed from: f, reason: collision with root package name */
    public final boolean f961f = true;

    /* renamed from: g, reason: collision with root package name */
    public final C0051b f962g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f963h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f964i;

    /* renamed from: j, reason: collision with root package name */
    public final C0051b f965j;

    /* renamed from: k, reason: collision with root package name */
    public final C0051b f966k;

    /* renamed from: l, reason: collision with root package name */
    public final C0051b f967l;

    /* renamed from: m, reason: collision with root package name */
    public final SocketFactory f968m;
    public SSLSocketFactory n;
    public X509TrustManager o;

    /* renamed from: p, reason: collision with root package name */
    public final List f969p;

    /* renamed from: q, reason: collision with root package name */
    public List f970q;

    /* renamed from: r, reason: collision with root package name */
    public final S3.c f971r;

    /* renamed from: s, reason: collision with root package name */
    public final e f972s;

    /* renamed from: t, reason: collision with root package name */
    public O3.l f973t;

    /* renamed from: u, reason: collision with root package name */
    public int f974u;
    public int v;

    /* renamed from: w, reason: collision with root package name */
    public final int f975w;

    public r() {
        C0051b c0051b = C0051b.f866a;
        this.f962g = c0051b;
        this.f963h = true;
        this.f964i = true;
        this.f965j = C0051b.f867b;
        this.f966k = C0051b.f868c;
        this.f967l = c0051b;
        SocketFactory socketFactory = SocketFactory.getDefault();
        kotlin.jvm.internal.i.d(socketFactory, "getDefault()");
        this.f968m = socketFactory;
        this.f969p = s.f976A;
        this.f970q = s.z;
        this.f971r = S3.c.f2606a;
        this.f972s = e.f886c;
        this.f974u = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        this.v = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        this.f975w = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
    }
}
