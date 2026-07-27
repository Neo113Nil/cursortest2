package q;

/* renamed from: q.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1001E extends M2.p implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f9156e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1001E(int[] iArr, int i2) {
        super(3);
        this.f9155d = i2;
        this.f9156e = iArr;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f9155d) {
            case 0:
                int intValue = ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                return Integer.valueOf(this.f9156e[intValue]);
            default:
                int intValue2 = ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                return Integer.valueOf(this.f9156e[intValue2]);
        }
    }
}
