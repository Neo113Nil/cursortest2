package r;

import kotlin.jvm.functions.Function2;
import m.b0;

/* loaded from: classes.dex */
public final class r extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public v f9537j;

    /* renamed from: k, reason: collision with root package name */
    public b0 f9538k;

    /* renamed from: l, reason: collision with root package name */
    public Function2 f9539l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9540m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f9541n;

    /* renamed from: o, reason: collision with root package name */
    public int f9542o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v vVar, E2.c cVar) {
        super(cVar);
        this.f9541n = vVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f9540m = obj;
        this.f9542o |= Integer.MIN_VALUE;
        return this.f9541n.e(null, null, this);
    }
}
