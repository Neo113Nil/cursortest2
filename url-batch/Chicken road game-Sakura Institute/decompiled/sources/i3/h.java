package i3;

import f8.w;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public i f4910f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4911g;

    /* renamed from: h, reason: collision with root package name */
    public w f4912h;

    /* renamed from: i, reason: collision with root package name */
    public Object f4913i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4914j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f4915k;

    /* renamed from: l, reason: collision with root package name */
    public int f4916l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, j6.c cVar) {
        super(cVar);
        this.f4915k = iVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f4914j = obj;
        this.f4916l |= Integer.MIN_VALUE;
        return this.f4915k.b(null, this);
    }
}
