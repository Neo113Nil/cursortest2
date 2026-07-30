package i3;

import f8.a0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public c f4887f;

    /* renamed from: g, reason: collision with root package name */
    public a0 f4888g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4889h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f4890i;

    /* renamed from: j, reason: collision with root package name */
    public int f4891j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, j6.c cVar2) {
        super(cVar2);
        this.f4890i = cVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f4889h = obj;
        this.f4891j |= Integer.MIN_VALUE;
        return c.a(this.f4890i, this);
    }
}
