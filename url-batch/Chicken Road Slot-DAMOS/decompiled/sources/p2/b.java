package p2;

import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public List f7608d;

    /* renamed from: e, reason: collision with root package name */
    public x f7609e;

    /* renamed from: i, reason: collision with root package name */
    public int f7610i;

    /* renamed from: r, reason: collision with root package name */
    public int f7611r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f7612s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f7613t;

    /* renamed from: u, reason: collision with root package name */
    public int f7614u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, nd.c cVar2) {
        super(cVar2);
        this.f7613t = cVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f7612s = obj;
        this.f7614u |= Integer.MIN_VALUE;
        return this.f7613t.b(this);
    }
}
