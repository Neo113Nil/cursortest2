package s0;

import java.util.Comparator;
import kotlin.Pair;

/* renamed from: s0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1178y implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final C1178y f10418b = new C1178y(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1178y f10419c = new C1178y(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C1178y f10420d = new C1178y(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10421a;

    public /* synthetic */ C1178y(int i2) {
        this.f10421a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f10421a) {
            case 0:
                Y.d f4 = ((y0.n) obj).f();
                Y.d f5 = ((y0.n) obj2).f();
                int compare = Float.compare(f4.f4374a, f5.f4374a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(f4.f4375b, f5.f4375b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(f4.f4377d, f5.f4377d);
                return compare3 != 0 ? compare3 : Float.compare(f4.f4376c, f5.f4376c);
            case 1:
                Y.d f6 = ((y0.n) obj).f();
                Y.d f7 = ((y0.n) obj2).f();
                int compare4 = Float.compare(f7.f4376c, f6.f4376c);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(f6.f4375b, f7.f4375b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(f6.f4377d, f7.f4377d);
                return compare6 != 0 ? compare6 : Float.compare(f7.f4374a, f6.f4374a);
            default:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                int compare7 = Float.compare(((Y.d) pair.f7485d).f4375b, ((Y.d) pair2.f7485d).f4375b);
                return compare7 != 0 ? compare7 : Float.compare(((Y.d) pair.f7485d).f4377d, ((Y.d) pair2.f7485d).f4377d);
        }
    }
}
