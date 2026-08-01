package b5;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public boolean f1121d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1122e;

    /* renamed from: i, reason: collision with root package name */
    public Object f1123i;

    /* renamed from: r, reason: collision with root package name */
    public wd.b0 f1124r;

    /* renamed from: s, reason: collision with root package name */
    public CoroutineContext f1125s;

    /* renamed from: t, reason: collision with root package name */
    public wd.b0 f1126t;

    /* renamed from: u, reason: collision with root package name */
    public u8.d f1127u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f1128v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f1129w;

    /* renamed from: x, reason: collision with root package name */
    public int f1130x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, nd.c cVar) {
        super(cVar);
        this.f1129w = fVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f1128v = obj;
        this.f1130x |= Integer.MIN_VALUE;
        return this.f1129w.y(false, null, this);
    }
}
