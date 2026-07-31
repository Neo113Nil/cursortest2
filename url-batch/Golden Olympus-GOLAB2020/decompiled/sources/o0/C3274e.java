package o0;

/* renamed from: o0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3274e {

    /* renamed from: c, reason: collision with root package name */
    public static final C3274e f41492c = new C3274e(null, null);

    /* renamed from: d, reason: collision with root package name */
    public static final C3274e f41493d = new C3274e(a.none, null);

    /* renamed from: e, reason: collision with root package name */
    public static final C3274e f41494e;

    /* renamed from: f, reason: collision with root package name */
    public static final C3274e f41495f;

    /* renamed from: g, reason: collision with root package name */
    public static final C3274e f41496g;

    /* renamed from: h, reason: collision with root package name */
    public static final C3274e f41497h;

    /* renamed from: i, reason: collision with root package name */
    public static final C3274e f41498i;

    /* renamed from: j, reason: collision with root package name */
    public static final C3274e f41499j;

    /* renamed from: k, reason: collision with root package name */
    public static final C3274e f41500k;

    /* renamed from: a, reason: collision with root package name */
    private a f41501a;

    /* renamed from: b, reason: collision with root package name */
    private b f41502b;

    /* renamed from: o0.e$a */
    public enum a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    /* renamed from: o0.e$b */
    public enum b {
        meet,
        slice
    }

    static {
        a aVar = a.xMidYMid;
        b bVar = b.meet;
        f41494e = new C3274e(aVar, bVar);
        a aVar2 = a.xMinYMin;
        f41495f = new C3274e(aVar2, bVar);
        f41496g = new C3274e(a.xMaxYMax, bVar);
        f41497h = new C3274e(a.xMidYMin, bVar);
        f41498i = new C3274e(a.xMidYMax, bVar);
        b bVar2 = b.slice;
        f41499j = new C3274e(aVar, bVar2);
        f41500k = new C3274e(aVar2, bVar2);
    }

    C3274e(a aVar, b bVar) {
        this.f41501a = aVar;
        this.f41502b = bVar;
    }

    public a a() {
        return this.f41501a;
    }

    public b b() {
        return this.f41502b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3274e c3274e = (C3274e) obj;
        return this.f41501a == c3274e.f41501a && this.f41502b == c3274e.f41502b;
    }

    public String toString() {
        return this.f41501a + " " + this.f41502b;
    }
}
