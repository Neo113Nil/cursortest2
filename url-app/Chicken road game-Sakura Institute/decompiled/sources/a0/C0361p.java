package a0;

import kotlin.jvm.functions.Function1;

/* renamed from: a0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0361p extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0362q f4807e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0361p(C0362q c0362q, int i2) {
        super(1);
        this.f4806d = i2;
        this.f4807e = c0362q;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4806d) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f4807e.f4819n.c(kotlin.ranges.b.c(doubleValue, r10.f4810e, r10.f4811f)));
            default:
                return Double.valueOf(kotlin.ranges.b.c(this.f4807e.f4816k.c(((Number) obj).doubleValue()), r10.f4810e, r10.f4811f));
        }
    }
}
