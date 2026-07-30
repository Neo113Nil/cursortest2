package A6;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public static final n f121e;

    /* renamed from: i, reason: collision with root package name */
    public static final n f122i;

    /* renamed from: l, reason: collision with root package name */
    public static final n f123l;

    /* renamed from: m, reason: collision with root package name */
    public static final n f124m;

    /* renamed from: n, reason: collision with root package name */
    public static final n f125n;

    /* renamed from: o, reason: collision with root package name */
    public static final n f126o;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f127d;

    static {
        int i2 = 0;
        f121e = new n(i2, 0);
        f122i = new n(i2, 1);
        f123l = new n(i2, 2);
        f124m = new n(i2, 3);
        f125n = new n(i2, 4);
        f126o = new n(i2, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i2, int i5) {
        super(i2);
        this.f127d = i5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f127d) {
            case 0:
                return D.f93b;
            case 1:
                return w.f140b;
            case 2:
                return t.f137b;
            case 3:
                return A.f91b;
            case 4:
                return g.f105b;
            default:
                return w.f139a;
        }
    }
}
