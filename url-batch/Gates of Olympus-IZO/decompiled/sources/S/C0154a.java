package S;

/* renamed from: S.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154a extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3187f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0154a(int i3, Object obj) {
        super(1);
        this.f3186e = i3;
        this.f3187f = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f3186e) {
            case 0:
                ?? r02 = this.f3187f;
                int size = r02.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((Y1.c) r02.get(i3)).j(obj);
                }
                return L1.z.f2729a;
            case 1:
                return Boolean.valueOf(Z1.i.a(obj, this.f3187f));
            default:
                ((Number) obj).intValue();
                return this.f3187f;
        }
    }
}
