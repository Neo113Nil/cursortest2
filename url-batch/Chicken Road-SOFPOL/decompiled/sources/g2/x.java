package g2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public static final x f3007d = new x();

    @Override // p6.c
    public final Object i(Object obj) {
        if (q6.i.a(obj, Boolean.FALSE)) {
            return new f1.s(f1.s.f2704h);
        }
        q6.i.c(obj, "null cannot be cast to non-null type kotlin.Int");
        return new f1.s(f1.p.b(((Integer) obj).intValue()));
    }
}
