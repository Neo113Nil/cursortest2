package p;

/* renamed from: p.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0756c0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7650a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7651b;

    public C0756c0(String str, boolean z3) {
        this.f7650a = z3;
        this.f7651b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(long j3, long j4, X1.c cVar) {
        C0754b0 c0754b0;
        int i3;
        long j5;
        if (cVar instanceof C0754b0) {
            c0754b0 = (C0754b0) cVar;
            int i4 = c0754b0.f7646j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0754b0.f7646j = i4 - Integer.MIN_VALUE;
                Object obj = c0754b0.f7644h;
                W1.a aVar = W1.a.f4608d;
                i3 = c0754b0.f7646j;
                if (i3 != 0) {
                    R1.a.e(obj);
                    if (!this.f7650a) {
                        j5 = 0;
                        return new O0.o(j5);
                    }
                    c0754b0.f7643g = j4;
                    c0754b0.f7646j = 1;
                    obj = ((C0793v0) this.f7651b).b(j4, c0754b0);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j4 = c0754b0.f7643g;
                    R1.a.e(obj);
                }
                j5 = O0.o.d(j4, ((O0.o) obj).f3749a);
                return new O0.o(j5);
            }
        }
        c0754b0 = new C0754b0(this, cVar);
        Object obj2 = c0754b0.f7644h;
        W1.a aVar2 = W1.a.f4608d;
        i3 = c0754b0.f7646j;
        if (i3 != 0) {
        }
        j5 = O0.o.d(j4, ((O0.o) obj2).f3749a);
        return new O0.o(j5);
    }

    public C0756c0(C0793v0 c0793v0, boolean z3) {
        this.f7651b = c0793v0;
        this.f7650a = z3;
    }
}
