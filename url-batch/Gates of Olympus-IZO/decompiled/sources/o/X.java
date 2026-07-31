package o;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f6477a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6478b;

    public X(o0 o0Var, boolean z3) {
        this.f6477a = o0Var;
        this.f6478b = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j3, long j4, R1.c cVar) {
        W w3;
        int i3;
        long j5;
        if (cVar instanceof W) {
            w3 = (W) cVar;
            int i4 = w3.f6476g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                w3.f6476g = i4 - Integer.MIN_VALUE;
                Object obj = w3.f6474e;
                Q1.a aVar = Q1.a.f3113d;
                i3 = w3.f6476g;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    if (!this.f6478b) {
                        j5 = 0;
                        return new M0.n(j5);
                    }
                    w3.f6473d = j4;
                    w3.f6476g = 1;
                    obj = this.f6477a.b(j4, w3);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j4 = w3.f6473d;
                    I2.l.Q(obj);
                }
                j5 = M0.n.d(j4, ((M0.n) obj).f2783a);
                return new M0.n(j5);
            }
        }
        w3 = new W(this, cVar);
        Object obj2 = w3.f6474e;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = w3.f6476g;
        if (i3 != 0) {
        }
        j5 = M0.n.d(j4, ((M0.n) obj2).f2783a);
        return new M0.n(j5);
    }
}
