package s0;

import java.util.Comparator;

/* renamed from: s0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1116B implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9984a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f9985b;

    public C1116B(Comparator comparator) {
        this.f9985b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f9984a) {
            case 0:
                int compare = this.f9985b.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return r0.E.f9582O.compare(((y0.n) obj).f11586c, ((y0.n) obj2).f11586c);
            default:
                int compare2 = ((C1116B) this.f9985b).compare(obj, obj2);
                return compare2 != 0 ? compare2 : B2.b.a(Integer.valueOf(((y0.n) obj).f11590g), Integer.valueOf(((y0.n) obj2).f11590g));
        }
    }

    public C1116B(C1116B c1116b) {
        this.f9985b = c1116b;
    }
}
