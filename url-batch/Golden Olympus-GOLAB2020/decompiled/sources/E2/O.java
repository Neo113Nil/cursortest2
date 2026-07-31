package E2;

import D2.AbstractC0348a;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class O extends M {

    /* renamed from: k, reason: collision with root package name */
    private final D2.w f539k;

    /* renamed from: l, reason: collision with root package name */
    private final List f540l;

    /* renamed from: m, reason: collision with root package name */
    private final int f541m;

    /* renamed from: n, reason: collision with root package name */
    private int f542n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(AbstractC0348a json, D2.w value) {
        super(json, value, null, null, 12, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f539k = value;
        List list = CollectionsKt.toList(s0().keySet());
        this.f540l = list;
        this.f541m = list.size() * 2;
        this.f542n = -1;
    }

    @Override // E2.M, C2.AbstractC0320l0
    protected String a0(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (String) this.f540l.get(i4 / 2);
    }

    @Override // E2.M, E2.AbstractC0372c, B2.c
    public void c(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // E2.M, E2.AbstractC0372c
    protected D2.i e0(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return this.f542n % 2 == 0 ? D2.k.c(tag) : (D2.i) MapsKt.getValue(s0(), tag);
    }

    @Override // E2.M, B2.c
    public int t(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i4 = this.f542n;
        if (i4 >= this.f541m - 1) {
            return -1;
        }
        int i5 = i4 + 1;
        this.f542n = i5;
        return i5;
    }

    @Override // E2.M, E2.AbstractC0372c
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public D2.w s0() {
        return this.f539k;
    }
}
