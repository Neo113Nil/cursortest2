package b6;

import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1518d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1520f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1521g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1522h;
    public final /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1523j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1524k;

    public /* synthetic */ z0(int i, p6.e eVar, u0.c cVar, p6.e eVar2, p6.e eVar3, x.r0 r0Var, u0.c cVar2, int i8) {
        this.f1519e = i;
        this.f1520f = eVar;
        this.f1521g = cVar;
        this.f1522h = eVar2;
        this.i = eVar3;
        this.f1523j = r0Var;
        this.f1524k = cVar2;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f1518d) {
            case 0:
                ((Integer) obj2).getClass();
                k.v((String) this.f1520f, (String) this.f1521g, (String) this.f1522h, (List) this.i, (p6.a) this.f1523j, (y0.m) this.f1524k, (m0.s) obj, m0.b.w(this.f1519e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int w7 = m0.b.w(1);
                j0.d2.b(this.f1519e, (p6.e) this.f1520f, (u0.c) this.f1521g, (p6.e) this.f1522h, (p6.e) this.i, (x.r0) this.f1523j, (u0.c) this.f1524k, (m0.s) obj, w7);
                break;
        }
        return c6.m.f1757a;
    }

    public /* synthetic */ z0(String str, String str2, String str3, List list, p6.a aVar, y0.m mVar, int i) {
        this.f1520f = str;
        this.f1521g = str2;
        this.f1522h = str3;
        this.i = list;
        this.f1523j = aVar;
        this.f1524k = mVar;
        this.f1519e = i;
    }
}
