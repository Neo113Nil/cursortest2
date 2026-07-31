package d2;

import java.util.Comparator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final e f2115b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f2116c = new e(1);

    /* renamed from: d, reason: collision with root package name */
    public static final e f2117d = new e(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2118a;

    public /* synthetic */ e(int i) {
        this.f2118a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2118a) {
            case 0:
                e1.c h8 = ((n) obj).h();
                e1.c h9 = ((n) obj2).h();
                int compare = Float.compare(h8.f2457a, h9.f2457a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(h8.f2458b, h9.f2458b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(h8.f2460d, h9.f2460d);
                return compare3 != 0 ? compare3 : Float.compare(h8.f2459c, h9.f2459c);
            case 1:
                e1.c h10 = ((n) obj).h();
                e1.c h11 = ((n) obj2).h();
                int compare4 = Float.compare(h11.f2459c, h10.f2459c);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(h10.f2458b, h11.f2458b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(h10.f2460d, h11.f2460d);
                return compare6 != 0 ? compare6 : Float.compare(h11.f2457a, h10.f2457a);
            default:
                c6.f fVar = (c6.f) obj;
                c6.f fVar2 = (c6.f) obj2;
                int compare7 = Float.compare(((e1.c) fVar.f1747d).f2458b, ((e1.c) fVar2.f1747d).f2458b);
                return compare7 != 0 ? compare7 : Float.compare(((e1.c) fVar.f1747d).f2460d, ((e1.c) fVar2.f1747d).f2460d);
        }
    }
}
