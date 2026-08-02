package B0;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class y extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public N f207h;

    /* renamed from: i, reason: collision with root package name */
    public Set f208i;

    /* renamed from: j, reason: collision with root package name */
    public Map f209j;

    /* renamed from: k, reason: collision with root package name */
    public Iterator f210k;

    /* renamed from: l, reason: collision with root package name */
    public L.d f211l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f212m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f213n;

    /* renamed from: o, reason: collision with root package name */
    public int f214o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(N n2, J0.b bVar) {
        super(bVar);
        this.f213n = n2;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f212m = obj;
        this.f214o |= Integer.MIN_VALUE;
        return N.s(this.f213n, null, this);
    }
}
