package s;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1098b extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public C2.c f9921j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f9922k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1099c f9923l;

    /* renamed from: m, reason: collision with root package name */
    public int f9924m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1098b(C1099c c1099c, E2.c cVar) {
        super(cVar);
        this.f9923l = c1099c;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f9922k = obj;
        this.f9924m |= Integer.MIN_VALUE;
        return this.f9923l.l(this);
    }
}
