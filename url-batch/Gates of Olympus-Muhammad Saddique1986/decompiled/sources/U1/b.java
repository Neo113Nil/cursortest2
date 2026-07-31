package U1;

import f2.j;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class b implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final b f4512b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f4513c = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4514a;

    public /* synthetic */ b(int i3) {
        this.f4514a = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4514a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                j.f(comparable, "a");
                j.f(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                j.f(comparable3, "a");
                j.f(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f4514a) {
            case 0:
                return f4513c;
            default:
                return f4512b;
        }
    }
}
