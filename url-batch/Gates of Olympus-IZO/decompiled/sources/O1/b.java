package O1;

import Z1.i;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class b implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final b f2987b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f2988c = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2989a;

    public /* synthetic */ b(int i3) {
        this.f2989a = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2989a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                i.f(comparable, "a");
                i.f(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                i.f(comparable3, "a");
                i.f(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f2989a) {
            case 0:
                return f2988c;
            default:
                return f2987b;
        }
    }
}
