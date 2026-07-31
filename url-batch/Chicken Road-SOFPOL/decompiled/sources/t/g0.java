package t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g0 implements f1.i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f6777b = new g0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f6778c = new g0(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6779a;

    public /* synthetic */ g0(int i) {
        this.f6779a = i;
    }

    @Override // f1.i0
    public final f1.p a(long j7, r2.l lVar, r2.c cVar) {
        switch (this.f6779a) {
            case 0:
                float H = cVar.H(w.f6884a);
                return new f1.d0(new e1.c(0.0f, -H, Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)) + H));
            default:
                float H2 = cVar.H(w.f6884a);
                return new f1.d0(new e1.c(-H2, 0.0f, Float.intBitsToFloat((int) (j7 >> 32)) + H2, Float.intBitsToFloat((int) (j7 & 4294967295L))));
        }
    }
}
