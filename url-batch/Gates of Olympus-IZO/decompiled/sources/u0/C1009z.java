package u0;

import java.util.Comparator;

/* renamed from: u0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1009z implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final C1009z f8503b = new C1009z(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1009z f8504c = new C1009z(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C1009z f8505d = new C1009z(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8506a;

    public /* synthetic */ C1009z(int i3) {
        this.f8506a = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8506a) {
            case 0:
                a0.d f3 = ((z0.n) obj).f();
                a0.d f4 = ((z0.n) obj2).f();
                int compare = Float.compare(f3.f3491a, f4.f3491a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(f3.f3492b, f4.f3492b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(f3.f3494d, f4.f3494d);
                return compare3 != 0 ? compare3 : Float.compare(f3.f3493c, f4.f3493c);
            case 1:
                a0.d f5 = ((z0.n) obj).f();
                a0.d f6 = ((z0.n) obj2).f();
                int compare4 = Float.compare(f6.f3493c, f5.f3493c);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(f5.f3492b, f6.f3492b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(f5.f3494d, f6.f3494d);
                return compare6 != 0 ? compare6 : Float.compare(f6.f3491a, f5.f3491a);
            default:
                L1.j jVar = (L1.j) obj;
                L1.j jVar2 = (L1.j) obj2;
                int compare7 = Float.compare(((a0.d) jVar.f2708d).f3492b, ((a0.d) jVar2.f2708d).f3492b);
                return compare7 != 0 ? compare7 : Float.compare(((a0.d) jVar.f2708d).f3494d, ((a0.d) jVar2.f2708d).f3494d);
        }
    }
}
