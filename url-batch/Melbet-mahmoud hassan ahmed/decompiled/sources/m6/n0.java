package m6;

/* loaded from: classes.dex */
public enum n0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19314a;

        static {
            int[] iArr = new int[n0.values().length];
            iArr[n0.DEFAULT.ordinal()] = 1;
            iArr[n0.ATOMIC.ordinal()] = 2;
            iArr[n0.UNDISPATCHED.ordinal()] = 3;
            iArr[n0.LAZY.ordinal()] = 4;
            f19314a = iArr;
        }
    }

    public final <R, T> void d(f6.p<? super R, ? super y5.d<? super T>, ? extends Object> pVar, R r7, y5.d<? super T> dVar) {
        int i7 = a.f19314a[ordinal()];
        if (i7 == 1) {
            r6.a.e(pVar, r7, dVar, null, 4, null);
            return;
        }
        if (i7 == 2) {
            y5.f.a(pVar, r7, dVar);
        } else if (i7 == 3) {
            r6.b.a(pVar, r7, dVar);
        } else if (i7 != 4) {
            throw new v5.i();
        }
    }

    public final boolean e() {
        return this == LAZY;
    }
}
