package L5;

import java.util.List;

/* loaded from: classes.dex */
public final class e implements D5.b, F5.b {

    /* renamed from: b, reason: collision with root package name */
    public static final e f1693b = new e(F5.d.f765a);

    /* renamed from: a, reason: collision with root package name */
    public final List f1694a;

    public e(List list) {
        this.f1694a = list;
        F5.d.a(list);
        list.stream().mapToDouble(new F5.c()).toArray();
    }

    @Override // F5.b
    public final boolean a(H5.b bVar) {
        int ordinal = bVar.f1002e.ordinal();
        return ordinal == 0 || ordinal == 2;
    }

    public final String toString() {
        return "ExplicitBucketHistogramAggregation(" + this.f1694a.toString() + ")";
    }
}
