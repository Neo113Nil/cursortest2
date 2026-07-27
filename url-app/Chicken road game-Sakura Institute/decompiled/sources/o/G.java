package o;

/* loaded from: classes.dex */
public final class G extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public C0891i0 f8622j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f8623k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0891i0 f8624l;

    /* renamed from: m, reason: collision with root package name */
    public int f8625m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C0891i0 c0891i0, E2.c cVar) {
        super(cVar);
        this.f8624l = c0891i0;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f8623k = obj;
        this.f8625m |= Integer.MIN_VALUE;
        return C0891i0.E0(this.f8624l, this);
    }
}
