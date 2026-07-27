package B1;

/* renamed from: B1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102i extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f994j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0104k f995k;

    /* renamed from: l, reason: collision with root package name */
    public int f996l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0102i(C0104k c0104k, E2.c cVar) {
        super(cVar);
        this.f995k = c0104k;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f994j = obj;
        this.f996l |= Integer.MIN_VALUE;
        return this.f995k.a(this);
    }
}
