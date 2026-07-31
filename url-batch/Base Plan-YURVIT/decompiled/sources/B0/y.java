package B0;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class y extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public Set f137h;

    /* renamed from: i, reason: collision with root package name */
    public Map f138i;

    /* renamed from: j, reason: collision with root package name */
    public Iterator f139j;

    /* renamed from: k, reason: collision with root package name */
    public I.d f140k;

    /* renamed from: l, reason: collision with root package name */
    public int f141l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f142m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ O f143n;

    /* renamed from: o, reason: collision with root package name */
    public int f144o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(O o2, I0.b bVar) {
        super(bVar);
        this.f143n = o2;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f142m = obj;
        this.f144o |= Integer.MIN_VALUE;
        return O.s(this.f143n, null, this);
    }
}
