package P0;

import X0.f;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final a f699b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f700c = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f701a;

    public /* synthetic */ a(int i) {
        this.f701a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f701a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                f.e(comparable, "a");
                f.e(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                f.e(comparable3, "a");
                f.e(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f701a) {
            case 0:
                return f700c;
            default:
                return f699b;
        }
    }
}
