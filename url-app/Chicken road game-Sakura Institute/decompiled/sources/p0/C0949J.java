package p0;

/* renamed from: p0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0949J implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0949J f8998b = new C0949J(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8999a;

    public /* synthetic */ C0949J(int i2) {
        this.f8999a = i2;
    }

    @Override // p0.b0
    public boolean a(Object obj, Object obj2) {
        return false;
    }

    @Override // p0.b0
    public void b(a0 a0Var) {
        a0Var.clear();
    }

    public long c(long j4, long j5) {
        switch (this.f8999a) {
            case 1:
                float max = Math.max(Y.f.d(j5) / Y.f.d(j4), Y.f.b(j5) / Y.f.b(j4));
                return AbstractC0960V.a(max, max);
            case 2:
                float min = Math.min(Y.f.d(j5) / Y.f.d(j4), Y.f.b(j5) / Y.f.b(j4));
                return AbstractC0960V.a(min, min);
            default:
                if (Y.f.d(j4) <= Y.f.d(j5) && Y.f.b(j4) <= Y.f.b(j5)) {
                    return AbstractC0960V.a(1.0f, 1.0f);
                }
                float min2 = Math.min(Y.f.d(j5) / Y.f.d(j4), Y.f.b(j5) / Y.f.b(j4));
                return AbstractC0960V.a(min2, min2);
        }
    }

    public String toString() {
        switch (this.f8999a) {
            case 4:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
