package Z0;

import j1.h;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final a f1652b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f1653c = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1654a;

    public /* synthetic */ a(int i) {
        this.f1654a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1654a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                h.e(comparable, "a");
                h.e(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                h.e(comparable3, "a");
                h.e(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f1654a) {
            case 0:
                return f1653c;
            default:
                return f1652b;
        }
    }
}
