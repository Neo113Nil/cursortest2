package D;

/* renamed from: D.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139i0 extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public C0142j0 f1830j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f1831k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0142j0 f1832l;

    /* renamed from: m, reason: collision with root package name */
    public int f1833m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0139i0(C0142j0 c0142j0, E2.c cVar) {
        super(cVar);
        this.f1832l = c0142j0;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f1831k = obj;
        this.f1833m |= Integer.MIN_VALUE;
        return this.f1832l.b(this);
    }
}
