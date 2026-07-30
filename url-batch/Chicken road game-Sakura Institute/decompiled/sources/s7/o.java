package s7;

import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import l1.x;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final g3.k f8621a = new g3.k(7);

    /* renamed from: b, reason: collision with root package name */
    public final x f8622b = new x(13);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8623c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8624d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final a0.s f8625e = new a0.s(23);

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8626f = true;

    /* renamed from: g, reason: collision with root package name */
    public final b f8627g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8628h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8629i;

    /* renamed from: j, reason: collision with root package name */
    public final b f8630j;

    /* renamed from: k, reason: collision with root package name */
    public final b f8631k;

    /* renamed from: l, reason: collision with root package name */
    public final b f8632l;

    /* renamed from: m, reason: collision with root package name */
    public final SocketFactory f8633m;

    /* renamed from: n, reason: collision with root package name */
    public final List f8634n;

    /* renamed from: o, reason: collision with root package name */
    public final List f8635o;

    /* renamed from: p, reason: collision with root package name */
    public final e8.c f8636p;

    /* renamed from: q, reason: collision with root package name */
    public final d f8637q;

    /* renamed from: r, reason: collision with root package name */
    public int f8638r;

    /* renamed from: s, reason: collision with root package name */
    public int f8639s;

    /* renamed from: t, reason: collision with root package name */
    public final int f8640t;

    public o() {
        b bVar = b.f8539a;
        this.f8627g = bVar;
        this.f8628h = true;
        this.f8629i = true;
        this.f8630j = b.f8540b;
        this.f8631k = b.f8541c;
        this.f8632l = bVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        r6.k.e(socketFactory, "getDefault()");
        this.f8633m = socketFactory;
        this.f8634n = p.F;
        this.f8635o = p.E;
        this.f8636p = e8.c.f2891a;
        this.f8637q = d.f8556c;
        this.f8638r = 10000;
        this.f8639s = 10000;
        this.f8640t = 10000;
    }
}
