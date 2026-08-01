package x3;

import java.io.Serializable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public boolean f10466d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10467e;

    /* renamed from: i, reason: collision with root package name */
    public wd.b0 f10468i;

    /* renamed from: r, reason: collision with root package name */
    public Serializable f10469r;

    /* renamed from: s, reason: collision with root package name */
    public int f10470s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f10471t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ z f10472u;

    /* renamed from: v, reason: collision with root package name */
    public int f10473v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, nd.c cVar) {
        super(cVar);
        this.f10472u = zVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f10471t = obj;
        this.f10473v |= Integer.MIN_VALUE;
        return z.g(this.f10472u, false, this);
    }
}
