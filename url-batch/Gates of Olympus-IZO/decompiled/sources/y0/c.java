package y0;

/* loaded from: classes.dex */
public final class c extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public f f8790d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8791e;

    /* renamed from: f, reason: collision with root package name */
    public M0.h f8792f;

    /* renamed from: g, reason: collision with root package name */
    public int f8793g;

    /* renamed from: h, reason: collision with root package name */
    public int f8794h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f8795i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f8796j;

    /* renamed from: k, reason: collision with root package name */
    public int f8797k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, R1.c cVar) {
        super(cVar);
        this.f8796j = fVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f8795i = obj;
        this.f8797k |= Integer.MIN_VALUE;
        return f.a(this.f8796j, null, null, this);
    }
}
