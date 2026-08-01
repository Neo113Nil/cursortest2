package j2;

import java.util.Comparator;
import kotlin.Pair;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements Comparator {

    /* renamed from: e, reason: collision with root package name */
    public static final e f4932e = new e(0);

    /* renamed from: i, reason: collision with root package name */
    public static final e f4933i = new e(1);

    /* renamed from: r, reason: collision with root package name */
    public static final e f4934r = new e(2);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4935d;

    public /* synthetic */ e(int i3) {
        this.f4935d = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4935d) {
            case 0:
                j1.c h10 = ((m) obj).h();
                j1.c h11 = ((m) obj2).h();
                int compare = Float.compare(h10.f4916a, h11.f4916a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(h10.f4917b, h11.f4917b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(h10.f4919d, h11.f4919d);
                return compare3 != 0 ? compare3 : Float.compare(h10.f4918c, h11.f4918c);
            case 1:
                j1.c h12 = ((m) obj).h();
                j1.c h13 = ((m) obj2).h();
                int compare4 = Float.compare(h13.f4918c, h12.f4918c);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(h12.f4917b, h13.f4917b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(h12.f4919d, h13.f4919d);
                return compare6 != 0 ? compare6 : Float.compare(h13.f4916a, h12.f4916a);
            default:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                int compare7 = Float.compare(((j1.c) pair.f5552d).f4917b, ((j1.c) pair2.f5552d).f4917b);
                return compare7 != 0 ? compare7 : Float.compare(((j1.c) pair.f5552d).f4919d, ((j1.c) pair2.f5552d).f4919d);
        }
    }
}
