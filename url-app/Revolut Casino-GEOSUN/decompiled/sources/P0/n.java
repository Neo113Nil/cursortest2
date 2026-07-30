package P0;

import s0.C0235n;

/* loaded from: classes.dex */
public final class n extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public C0235n f807h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f808i;

    /* renamed from: j, reason: collision with root package name */
    public int f809j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0235n f810k;

    /* renamed from: l, reason: collision with root package name */
    public Object f811l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C0235n c0235n, w0.d dVar) {
        super(dVar);
        this.f810k = c0235n;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f808i = obj;
        this.f809j |= Integer.MIN_VALUE;
        return this.f810k.a(null, this);
    }
}
