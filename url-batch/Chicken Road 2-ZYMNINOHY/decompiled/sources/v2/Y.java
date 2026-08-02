package v2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class Y extends Z implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final Y f15597b = new Y(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Y f15598c = new Y(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15599a;

    public /* synthetic */ Y(int i4) {
        this.f15599a = i4;
    }

    @Override // v2.Z
    public final Z a() {
        switch (this.f15599a) {
            case 0:
                return f15598c;
            default:
                return f15597b;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f15599a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f15599a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
