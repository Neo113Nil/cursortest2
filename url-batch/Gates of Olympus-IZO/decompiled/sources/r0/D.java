package r0;

import h1.C0438i;

/* loaded from: classes.dex */
public final class D implements T {

    /* renamed from: e, reason: collision with root package name */
    public static final D f7108e = new D(0);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7109d;

    public /* synthetic */ D(int i3) {
        this.f7109d = i3;
    }

    public long a(long j3, long j4) {
        switch (this.f7109d) {
            case 1:
                float max = Math.max(a0.f.d(j4) / a0.f.d(j3), a0.f.b(j4) / a0.f.b(j3));
                return M.a(max, max);
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                float min = Math.min(a0.f.d(j4) / a0.f.d(j3), a0.f.b(j4) / a0.f.b(j3));
                return M.a(min, min);
            default:
                if (a0.f.d(j3) <= a0.f.d(j4) && a0.f.b(j3) <= a0.f.b(j4)) {
                    return M.a(1.0f, 1.0f);
                }
                float min2 = Math.min(a0.f.d(j4) / a0.f.d(j3), a0.f.b(j4) / a0.f.b(j3));
                return M.a(min2, min2);
        }
    }

    @Override // r0.T
    public boolean d(Object obj, Object obj2) {
        return false;
    }

    @Override // r0.T
    public void f(S s3) {
        s3.clear();
    }

    public String toString() {
        switch (this.f7109d) {
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
