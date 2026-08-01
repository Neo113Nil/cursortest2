package z1;

import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import n.C0288n;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final V.v f4886a = new V.v(6);

    /* renamed from: b, reason: collision with root package name */
    public final C0288n f4887b = new C0288n(7);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4888c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4889d = new ArrayList();
    public final A1.a e = new A1.a(0);

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4890f = true;

    /* renamed from: g, reason: collision with root package name */
    public final b f4891g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4892h;
    public final boolean i;
    public final b j;

    /* renamed from: k, reason: collision with root package name */
    public final b f4893k;

    /* renamed from: l, reason: collision with root package name */
    public final b f4894l;

    /* renamed from: m, reason: collision with root package name */
    public final SocketFactory f4895m;

    /* renamed from: n, reason: collision with root package name */
    public final List f4896n;

    /* renamed from: o, reason: collision with root package name */
    public final List f4897o;

    /* renamed from: p, reason: collision with root package name */
    public final L1.c f4898p;

    /* renamed from: q, reason: collision with root package name */
    public final f f4899q;

    /* renamed from: r, reason: collision with root package name */
    public final int f4900r;

    /* renamed from: s, reason: collision with root package name */
    public final int f4901s;

    /* renamed from: t, reason: collision with root package name */
    public final int f4902t;

    public r() {
        b bVar = b.f4814a;
        this.f4891g = bVar;
        this.f4892h = true;
        this.i = true;
        this.j = b.f4815b;
        this.f4893k = b.f4816c;
        this.f4894l = bVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        j1.h.d(socketFactory, "getDefault()");
        this.f4895m = socketFactory;
        this.f4896n = s.f4903A;
        this.f4897o = s.f4904z;
        this.f4898p = L1.c.f697a;
        this.f4899q = f.f4828c;
        this.f4900r = 10000;
        this.f4901s = 10000;
        this.f4902t = 10000;
    }
}
