package T4;

import E.C0028c;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public B1.g f2935b;

    /* renamed from: e, reason: collision with root package name */
    public final C0028c f2938e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2939f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2940g;

    /* renamed from: h, reason: collision with root package name */
    public final C0152b f2941h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2942i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2943j;

    /* renamed from: k, reason: collision with root package name */
    public final C0152b f2944k;

    /* renamed from: l, reason: collision with root package name */
    public final C0152b f2945l;

    /* renamed from: m, reason: collision with root package name */
    public final C0152b f2946m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f2947n;

    /* renamed from: o, reason: collision with root package name */
    public List f2948o;

    /* renamed from: p, reason: collision with root package name */
    public final List f2949p;

    /* renamed from: q, reason: collision with root package name */
    public final h5.c f2950q;

    /* renamed from: r, reason: collision with root package name */
    public final C0154d f2951r;

    /* renamed from: s, reason: collision with root package name */
    public int f2952s;

    /* renamed from: t, reason: collision with root package name */
    public int f2953t;

    /* renamed from: u, reason: collision with root package name */
    public final int f2954u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2955v;

    /* renamed from: a, reason: collision with root package name */
    public l f2934a = new l();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2936c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2937d = new ArrayList();

    public t() {
        TimeZone timeZone = U4.e.f3179a;
        this.f2938e = new C0028c(0);
        this.f2939f = true;
        this.f2940g = true;
        C0152b c0152b = C0152b.f2827b;
        this.f2941h = c0152b;
        this.f2942i = true;
        this.f2943j = true;
        this.f2944k = C0152b.f2828c;
        this.f2945l = C0152b.f2829d;
        this.f2946m = c0152b;
        SocketFactory socketFactory = SocketFactory.getDefault();
        kotlin.jvm.internal.i.d(socketFactory, "getDefault(...)");
        this.f2947n = socketFactory;
        this.f2948o = u.f2957D;
        this.f2949p = u.f2956C;
        this.f2950q = h5.c.f5827a;
        this.f2951r = C0154d.f2844c;
        this.f2953t = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        this.f2954u = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        this.f2955v = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
    }
}
