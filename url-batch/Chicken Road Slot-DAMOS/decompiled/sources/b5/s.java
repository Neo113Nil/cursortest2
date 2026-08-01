package b5;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public long f1177d;

    /* renamed from: e, reason: collision with root package name */
    public Function0 f1178e;

    /* renamed from: i, reason: collision with root package name */
    public wd.b0 f1179i;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f1180r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f1181s;

    /* renamed from: t, reason: collision with root package name */
    public int f1182t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, nd.c cVar) {
        super(cVar);
        this.f1181s = uVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f1180r = obj;
        this.f1182t |= Integer.MIN_VALUE;
        return this.f1181s.b(0L, null, this);
    }
}
