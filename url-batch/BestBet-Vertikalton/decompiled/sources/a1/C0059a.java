package a1;

import java.util.Comparator;
import k1.e;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final C0059a f1626b = new C0059a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0059a f1627c = new C0059a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1628a;

    public /* synthetic */ C0059a(int i) {
        this.f1628a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1628a) {
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
        switch (this.f1628a) {
            case 0:
                return f1627c;
            default:
                return f1626b;
        }
    }
}
