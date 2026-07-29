package R0;

import X0.e;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final a f670b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f671c = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f672a;

    public /* synthetic */ a(int i) {
        this.f672a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f672a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                e.e(comparable, "a");
                e.e(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                e.e(comparable3, "a");
                e.e(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f672a) {
            case 0:
                return f671c;
            default:
                return f670b;
        }
    }
}
