package e5;

import a5.C0232b;
import java.util.List;

/* renamed from: e5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0350e implements W4.b, Y4.b {

    /* renamed from: b, reason: collision with root package name */
    public static final C0350e f4015b = new C0350e(Y4.d.f3095a);

    /* renamed from: a, reason: collision with root package name */
    public final List f4016a;

    public C0350e(List list) {
        this.f4016a = list;
        Y4.d.a(list);
        list.stream().mapToDouble(new Y4.c()).toArray();
    }

    @Override // Y4.b
    public final boolean a(C0232b c0232b) {
        int ordinal = c0232b.f3151e.ordinal();
        return ordinal == 0 || ordinal == 2;
    }

    public final String toString() {
        return "ExplicitBucketHistogramAggregation(" + this.f4016a.toString() + ")";
    }
}
