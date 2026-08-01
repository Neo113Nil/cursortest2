package z2;

import i3.d;
import java.util.Comparator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final a f4147b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f4148c = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4149a;

    public /* synthetic */ a(int i) {
        this.f4149a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4149a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                d.e(comparable, "a");
                d.e(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                d.e(comparable3, "a");
                d.e(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f4149a) {
            case 0:
                return f4148c;
            default:
                return f4147b;
        }
    }
}
