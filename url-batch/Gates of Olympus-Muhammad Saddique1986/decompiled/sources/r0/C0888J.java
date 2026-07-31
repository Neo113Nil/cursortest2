package r0;

import a0.C0241f;

/* renamed from: r0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0888J implements a0 {

    /* renamed from: e, reason: collision with root package name */
    public static final C0888J f8119e = new C0888J(0);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8120d;

    public /* synthetic */ C0888J(int i3) {
        this.f8120d = i3;
    }

    public long a(long j3, long j4) {
        switch (this.f8120d) {
            case 1:
                float max = Math.max(C0241f.d(j4) / C0241f.d(j3), C0241f.b(j4) / C0241f.b(j3));
                return AbstractC0898U.a(max, max);
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                float min = Math.min(C0241f.d(j4) / C0241f.d(j3), C0241f.b(j4) / C0241f.b(j3));
                return AbstractC0898U.a(min, min);
            default:
                if (C0241f.d(j3) <= C0241f.d(j4) && C0241f.b(j3) <= C0241f.b(j4)) {
                    return AbstractC0898U.a(1.0f, 1.0f);
                }
                float min2 = Math.min(C0241f.d(j4) / C0241f.d(j3), C0241f.b(j4) / C0241f.b(j3));
                return AbstractC0898U.a(min2, min2);
        }
    }

    @Override // r0.a0
    public boolean d(Object obj, Object obj2) {
        return false;
    }

    @Override // r0.a0
    public void e(C0903Z c0903z) {
        c0903z.clear();
    }

    public String toString() {
        switch (this.f8120d) {
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
