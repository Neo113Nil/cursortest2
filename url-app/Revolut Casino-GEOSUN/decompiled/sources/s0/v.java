package s0;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class v extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public J f2942h;

    /* renamed from: i, reason: collision with root package name */
    public Set f2943i;

    /* renamed from: j, reason: collision with root package name */
    public Map f2944j;

    /* renamed from: k, reason: collision with root package name */
    public Iterator f2945k;

    /* renamed from: l, reason: collision with root package name */
    public G.d f2946l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f2947m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J f2948n;

    /* renamed from: o, reason: collision with root package name */
    public int f2949o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(J j2, y0.b bVar) {
        super(bVar);
        this.f2948n = j2;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f2947m = obj;
        this.f2949o |= Integer.MIN_VALUE;
        return J.k(this.f2948n, null, this);
    }
}
