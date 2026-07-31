package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f3679e;

    public /* synthetic */ h0(String str, int i) {
        this.f3678d = i;
        this.f3679e = str;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        int i = this.f3678d;
        c6.m mVar = c6.m.f1757a;
        String str = this.f3679e;
        d2.j jVar = (d2.j) obj;
        switch (i) {
            case 0:
                w6.d[] dVarArr = d2.u.f2215a;
                d2.v vVar = d2.s.f2191d;
                w6.d dVar = d2.u.f2215a[2];
                vVar.a(jVar, str);
                break;
            default:
                w6.d[] dVarArr2 = d2.u.f2215a;
                jVar.e(d2.s.f2188a, s6.a.x(str));
                d2.u.a(jVar, 5);
                break;
        }
        return mVar;
    }
}
