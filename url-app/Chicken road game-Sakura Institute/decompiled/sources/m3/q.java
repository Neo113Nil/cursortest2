package m3;

import A.C0022s;
import f1.C0607a;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Y0.b f8406a = new Y0.b(8);

    /* renamed from: b, reason: collision with root package name */
    public final C0607a f8407b = new C0607a(13);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8408c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8409d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final C0022s f8410e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8411f;

    /* renamed from: g, reason: collision with root package name */
    public final j f8412g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8413h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8414i;

    /* renamed from: j, reason: collision with root package name */
    public final j f8415j;

    /* renamed from: k, reason: collision with root package name */
    public final j f8416k;

    /* renamed from: l, reason: collision with root package name */
    public final j f8417l;

    /* renamed from: m, reason: collision with root package name */
    public final SocketFactory f8418m;

    /* renamed from: n, reason: collision with root package name */
    public final List f8419n;

    /* renamed from: o, reason: collision with root package name */
    public final List f8420o;

    /* renamed from: p, reason: collision with root package name */
    public final y3.c f8421p;

    /* renamed from: q, reason: collision with root package name */
    public final d f8422q;

    /* renamed from: r, reason: collision with root package name */
    public int f8423r;

    /* renamed from: s, reason: collision with root package name */
    public int f8424s;

    /* renamed from: t, reason: collision with root package name */
    public final int f8425t;

    public q() {
        Intrinsics.checkNotNullParameter(j.f8386d, "<this>");
        this.f8410e = new C0022s(21);
        this.f8411f = true;
        j jVar = b.f8323a;
        this.f8412g = jVar;
        this.f8413h = true;
        this.f8414i = true;
        this.f8415j = j.f8384b;
        this.f8416k = j.f8385c;
        this.f8417l = jVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
        this.f8418m = socketFactory;
        this.f8419n = r.f8427G;
        this.f8420o = r.f8426F;
        this.f8421p = y3.c.f11693a;
        this.f8422q = d.f8338c;
        this.f8423r = 10000;
        this.f8424s = 10000;
        this.f8425t = 10000;
    }
}
