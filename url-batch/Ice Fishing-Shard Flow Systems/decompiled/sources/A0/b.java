package A0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: i, reason: collision with root package name */
    public static final b f50i;

    /* renamed from: l, reason: collision with root package name */
    public static final b f51l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f52m;

    /* renamed from: n, reason: collision with root package name */
    public static final b f53n;

    /* renamed from: o, reason: collision with root package name */
    public static final b f54o;

    /* renamed from: p, reason: collision with root package name */
    public static final b f55p;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f56d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f57e;

    static {
        int i2 = 0;
        f50i = new b("NONE", i2);
        f51l = new b("FULL", i2);
        int i5 = 1;
        f52m = new b("FLAT", i5);
        f53n = new b("HALF_OPENED", i5);
        int i7 = 2;
        f54o = new b("FOLD", i7);
        f55p = new b("HINGE", i7);
    }

    public /* synthetic */ b(String str, int i2) {
        this.f56d = i2;
        this.f57e = str;
    }

    public String toString() {
        switch (this.f56d) {
            case 0:
                return (String) this.f57e;
            case 1:
                return (String) this.f57e;
            case 2:
                return (String) this.f57e;
            default:
                return super.toString();
        }
    }

    public b(B0.a windowBackend) {
        this.f56d = 3;
        p windowMetricsCalculator = p.f84b;
        Intrinsics.checkNotNullParameter(windowMetricsCalculator, "windowMetricsCalculator");
        Intrinsics.checkNotNullParameter(windowBackend, "windowBackend");
        this.f57e = windowBackend;
    }
}
