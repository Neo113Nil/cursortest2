package o2;

import java.util.Comparator;
import u2.c;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final a f2991b = new a(0);
    public static final a c = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2992a;

    public /* synthetic */ a(int i4) {
        this.f2992a = i4;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2992a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                c.e(comparable, "a");
                c.e(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                c.e(comparable3, "a");
                c.e(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f2992a) {
            case 0:
                return c;
            default:
                return f2991b;
        }
    }
}
