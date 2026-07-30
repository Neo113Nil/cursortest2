package D;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class G extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public Object f80h;

    /* renamed from: i, reason: collision with root package name */
    public Object f81i;

    /* renamed from: j, reason: collision with root package name */
    public Serializable f82j;

    /* renamed from: k, reason: collision with root package name */
    public F0.p f83k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f84l;

    /* renamed from: m, reason: collision with root package name */
    public int f85m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f86n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ S f87o;

    /* renamed from: p, reason: collision with root package name */
    public int f88p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(S s2, y0.b bVar) {
        super(bVar);
        this.f87o = s2;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f86n = obj;
        this.f88p |= Integer.MIN_VALUE;
        return S.f(this.f87o, false, this);
    }
}
