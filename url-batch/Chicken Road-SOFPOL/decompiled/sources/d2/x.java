package d2;

import java.util.Comparator;
import w1.f0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2221a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f2222b;

    public x(x xVar) {
        this.f2222b = xVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2221a) {
            case 0:
                int compare = this.f2222b.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return f0.R.compare(((n) obj).f2158c, ((n) obj2).f2158c);
            default:
                int compare2 = ((x) this.f2222b).compare(obj, obj2);
                return compare2 != 0 ? compare2 : a.a.g(Integer.valueOf(((n) obj).f2162g), Integer.valueOf(((n) obj2).f2162g));
        }
    }

    public x(Comparator comparator) {
        this.f2222b = comparator;
    }
}
