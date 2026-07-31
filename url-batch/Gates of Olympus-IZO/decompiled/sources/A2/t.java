package A2;

import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final k f142a = new k(0);

    /* renamed from: b, reason: collision with root package name */
    public final g f143b = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f144c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f145d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final B2.a f146e = new B2.a(0);

    /* renamed from: f, reason: collision with root package name */
    public final boolean f147f = true;

    /* renamed from: g, reason: collision with root package name */
    public final C0003b f148g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f149h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f150i;

    /* renamed from: j, reason: collision with root package name */
    public final C0003b f151j;

    /* renamed from: k, reason: collision with root package name */
    public final C0003b f152k;

    /* renamed from: l, reason: collision with root package name */
    public final C0003b f153l;

    /* renamed from: m, reason: collision with root package name */
    public final SocketFactory f154m;

    /* renamed from: n, reason: collision with root package name */
    public final List f155n;

    /* renamed from: o, reason: collision with root package name */
    public final List f156o;
    public final M2.c p;

    /* renamed from: q, reason: collision with root package name */
    public final d f157q;

    /* renamed from: r, reason: collision with root package name */
    public int f158r;

    /* renamed from: s, reason: collision with root package name */
    public int f159s;

    /* renamed from: t, reason: collision with root package name */
    public final int f160t;

    public t() {
        C0003b c0003b = C0003b.f43a;
        this.f148g = c0003b;
        this.f149h = true;
        this.f150i = true;
        this.f151j = C0003b.f44b;
        this.f152k = C0003b.f45c;
        this.f153l = c0003b;
        SocketFactory socketFactory = SocketFactory.getDefault();
        Z1.i.e(socketFactory, "getDefault()");
        this.f154m = socketFactory;
        this.f155n = u.D;
        this.f156o = u.C;
        this.p = M2.c.f2815a;
        this.f157q = d.f60c;
        this.f158r = 10000;
        this.f159s = 10000;
        this.f160t = 10000;
    }
}
