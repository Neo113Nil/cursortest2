package X5;

import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public V5.g f2986b;

    /* renamed from: e, reason: collision with root package name */
    public final B1.g f2989e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2990f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2991g;

    /* renamed from: h, reason: collision with root package name */
    public final C0218b f2992h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2993i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2994j;

    /* renamed from: k, reason: collision with root package name */
    public final C0218b f2995k;

    /* renamed from: l, reason: collision with root package name */
    public final C0218b f2996l;

    /* renamed from: m, reason: collision with root package name */
    public final C0218b f2997m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f2998n;

    /* renamed from: o, reason: collision with root package name */
    public List f2999o;

    /* renamed from: p, reason: collision with root package name */
    public final List f3000p;

    /* renamed from: q, reason: collision with root package name */
    public final l6.c f3001q;

    /* renamed from: r, reason: collision with root package name */
    public final d f3002r;

    /* renamed from: s, reason: collision with root package name */
    public int f3003s;

    /* renamed from: t, reason: collision with root package name */
    public int f3004t;

    /* renamed from: u, reason: collision with root package name */
    public final int f3005u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3006v;

    /* renamed from: a, reason: collision with root package name */
    public k f2985a = new k();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2987c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2988d = new ArrayList();

    public r() {
        TimeZone timeZone = Y5.e.f3102a;
        this.f2989e = new B1.g(20);
        this.f2990f = true;
        this.f2991g = true;
        C0218b c0218b = C0218b.f2888b;
        this.f2992h = c0218b;
        this.f2993i = true;
        this.f2994j = true;
        this.f2995k = C0218b.f2889c;
        this.f2996l = C0218b.f2890d;
        this.f2997m = c0218b;
        SocketFactory socketFactory = SocketFactory.getDefault();
        kotlin.jvm.internal.i.d(socketFactory, "getDefault(...)");
        this.f2998n = socketFactory;
        this.f2999o = s.f3008D;
        this.f3000p = s.f3007C;
        this.f3001q = l6.c.f5310a;
        this.f3002r = d.f2905c;
        this.f3004t = 10000;
        this.f3005u = 10000;
        this.f3006v = 10000;
    }
}
