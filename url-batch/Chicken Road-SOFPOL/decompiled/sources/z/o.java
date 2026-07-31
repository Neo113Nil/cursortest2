package z;

import t.j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public j0 f9072g;

    /* renamed from: h, reason: collision with root package name */
    public i6.i f9073h;
    public /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f9074j;

    /* renamed from: k, reason: collision with root package name */
    public int f9075k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, i6.c cVar) {
        super(cVar);
        this.f9074j = pVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.i = obj;
        this.f9075k |= Integer.MIN_VALUE;
        return this.f9074j.c(null, null, this);
    }
}
