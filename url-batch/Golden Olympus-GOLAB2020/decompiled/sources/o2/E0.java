package o2;

/* loaded from: classes3.dex */
public abstract class E0 {

    /* renamed from: a, reason: collision with root package name */
    private static final t2.G f41991a = new t2.G("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    public static final t2.G f41992b = new t2.G("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    private static final t2.G f41993c = new t2.G("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    private static final t2.G f41994d = new t2.G("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    private static final t2.G f41995e = new t2.G("SEALED");

    /* renamed from: f, reason: collision with root package name */
    private static final C3326e0 f41996f = new C3326e0(false);

    /* renamed from: g, reason: collision with root package name */
    private static final C3326e0 f41997g = new C3326e0(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC3350q0 ? new C3351r0((InterfaceC3350q0) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC3350q0 interfaceC3350q0;
        C3351r0 c3351r0 = obj instanceof C3351r0 ? (C3351r0) obj : null;
        return (c3351r0 == null || (interfaceC3350q0 = c3351r0.f42098a) == null) ? obj : interfaceC3350q0;
    }
}
