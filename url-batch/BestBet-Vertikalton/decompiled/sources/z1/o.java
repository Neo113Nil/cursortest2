package z1;

import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import k.C0191o;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final T0.m f4702a = new T0.m(7);

    /* renamed from: b, reason: collision with root package name */
    public final C0191o f4703b = new C0191o(6);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4704c = new ArrayList();
    public final ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final A1.a f4705e = new A1.a(0);

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4706f = true;

    /* renamed from: g, reason: collision with root package name */
    public final b f4707g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f4708j;

    /* renamed from: k, reason: collision with root package name */
    public final b f4709k;

    /* renamed from: l, reason: collision with root package name */
    public final b f4710l;

    /* renamed from: m, reason: collision with root package name */
    public final SocketFactory f4711m;

    /* renamed from: n, reason: collision with root package name */
    public final List f4712n;

    /* renamed from: o, reason: collision with root package name */
    public final List f4713o;

    /* renamed from: p, reason: collision with root package name */
    public final L1.c f4714p;

    /* renamed from: q, reason: collision with root package name */
    public final d f4715q;

    /* renamed from: r, reason: collision with root package name */
    public final int f4716r;

    /* renamed from: s, reason: collision with root package name */
    public final int f4717s;

    /* renamed from: t, reason: collision with root package name */
    public final int f4718t;

    public o() {
        b bVar = b.f4633a;
        this.f4707g = bVar;
        this.h = true;
        this.i = true;
        this.f4708j = b.f4634b;
        this.f4709k = b.f4635c;
        this.f4710l = bVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        k1.e.d(socketFactory, "getDefault()");
        this.f4711m = socketFactory;
        this.f4712n = p.f4719A;
        this.f4713o = p.f4720z;
        this.f4714p = L1.c.f784a;
        this.f4715q = d.f4647c;
        this.f4716r = 10000;
        this.f4717s = 10000;
        this.f4718t = 10000;
    }
}
