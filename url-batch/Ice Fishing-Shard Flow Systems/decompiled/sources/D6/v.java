package D6;

import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public B.f f574b;

    /* renamed from: e, reason: collision with root package name */
    public final A4.c f577e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f578f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f579g;

    /* renamed from: h, reason: collision with root package name */
    public final l f580h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f581i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final l f582k;

    /* renamed from: l, reason: collision with root package name */
    public final l f583l;

    /* renamed from: m, reason: collision with root package name */
    public final l f584m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f585n;

    /* renamed from: o, reason: collision with root package name */
    public List f586o;

    /* renamed from: p, reason: collision with root package name */
    public final List f587p;

    /* renamed from: q, reason: collision with root package name */
    public final R6.c f588q;

    /* renamed from: r, reason: collision with root package name */
    public final C0097e f589r;

    /* renamed from: s, reason: collision with root package name */
    public int f590s;

    /* renamed from: t, reason: collision with root package name */
    public int f591t;

    /* renamed from: u, reason: collision with root package name */
    public final int f592u;

    /* renamed from: v, reason: collision with root package name */
    public final int f593v;

    /* renamed from: a, reason: collision with root package name */
    public n f573a = new n();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f575c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f576d = new ArrayList();

    public v() {
        l lVar = l.f538e;
        TimeZone timeZone = E6.e.f712a;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        this.f577e = new A4.c(7);
        this.f578f = true;
        this.f579g = true;
        l lVar2 = InterfaceC0094b.f465a;
        this.f580h = lVar2;
        this.f581i = true;
        this.j = true;
        this.f582k = l.f536c;
        this.f583l = l.f537d;
        this.f584m = lVar2;
        SocketFactory socketFactory = SocketFactory.getDefault();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault(...)");
        this.f585n = socketFactory;
        this.f586o = w.f595D;
        this.f587p = w.f594C;
        this.f588q = R6.c.f2443a;
        this.f589r = C0097e.f483c;
        this.f591t = 10000;
        this.f592u = 10000;
        this.f593v = 10000;
    }
}
