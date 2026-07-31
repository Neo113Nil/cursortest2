package D1;

/* renamed from: D1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016d extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0018f f540e;

    /* renamed from: f, reason: collision with root package name */
    public int f541f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0016d(C0018f c0018f, R1.c cVar) {
        super(cVar);
        this.f540e = c0018f;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f539d = obj;
        this.f541f |= Integer.MIN_VALUE;
        return this.f540e.a(this);
    }
}
