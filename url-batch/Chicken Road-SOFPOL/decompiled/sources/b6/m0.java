package b6;

import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y0.m f1383e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1384f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1385g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1386h;
    public final /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1387j;

    public /* synthetic */ m0(Object obj, Object obj2, Object obj3, Object obj4, c6.c cVar, y0.m mVar, int i, int i8) {
        this.f1382d = i8;
        this.f1384f = obj;
        this.f1385g = obj2;
        this.f1386h = obj3;
        this.i = obj4;
        this.f1387j = cVar;
        this.f1383e = mVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f1382d) {
            case 0:
                ((Integer) obj2).getClass();
                int w7 = m0.b.w(199735);
                k.B((String) this.f1384f, (String) this.f1385g, (List) this.f1386h, (i) this.i, (p6.c) this.f1387j, this.f1383e, (m0.s) obj, w7);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int w8 = m0.b.w(1);
                k.m((w) this.f1384f, (p6.a) this.f1385g, (p6.a) this.f1386h, (p6.a) this.i, (p6.a) this.f1387j, this.f1383e, (m0.s) obj, w8);
                break;
            default:
                ((Integer) obj2).getClass();
                int w9 = m0.b.w(28039);
                k.D((String) this.f1384f, (String) this.f1385g, (String) this.i, (String) this.f1387j, (List) this.f1386h, this.f1383e, (m0.s) obj, w9);
                break;
        }
        return c6.m.f1757a;
    }

    public /* synthetic */ m0(String str, String str2, String str3, String str4, List list, y0.m mVar, int i) {
        this.f1382d = 2;
        this.f1384f = str;
        this.f1385g = str2;
        this.i = str3;
        this.f1387j = str4;
        this.f1386h = list;
        this.f1383e = mVar;
    }
}
