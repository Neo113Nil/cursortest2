package i3;

import f8.r;
import f8.y;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public r f4923f;

    /* renamed from: g, reason: collision with root package name */
    public r f4924g;

    /* renamed from: h, reason: collision with root package name */
    public y f4925h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4926i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f4927j;

    /* renamed from: k, reason: collision with root package name */
    public int f4928k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, j6.c cVar) {
        super(cVar);
        this.f4927j = kVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f4926i = obj;
        this.f4928k |= Integer.MIN_VALUE;
        return this.f4927j.b(null, this);
    }
}
