package u1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a1 extends q6.j implements p6.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m[] f7184f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(m[] mVarArr, int i) {
        super(2);
        this.f7183e = i;
        this.f7184f = mVarArr;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f7183e) {
            case 0:
                return Float.valueOf(s0.c((k0) obj, true, this.f7184f, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(s0.c((k0) obj, false, this.f7184f, ((Number) obj2).floatValue()));
        }
    }
}
