package N2;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class t extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public H f2129a;

    /* renamed from: b, reason: collision with root package name */
    public Set f2130b;

    /* renamed from: c, reason: collision with root package name */
    public Map f2131c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f2132d;

    /* renamed from: e, reason: collision with root package name */
    public P.d f2133e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f2134f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ H f2135g;

    /* renamed from: h, reason: collision with root package name */
    public int f2136h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(H h3, AbstractC1295c abstractC1295c) {
        super(abstractC1295c);
        this.f2135g = h3;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f2134f = obj;
        this.f2136h |= Integer.MIN_VALUE;
        return H.i(this.f2135g, null, this);
    }
}
