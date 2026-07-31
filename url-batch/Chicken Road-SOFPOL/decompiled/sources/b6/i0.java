package b6;

import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1342f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1343g;

    public /* synthetic */ i0(int i, int i8, Object obj, Object obj2) {
        this.f1340d = i8;
        this.f1342f = obj;
        this.f1343g = obj2;
        this.f1341e = i;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f1340d) {
            case 0:
                p6.a aVar = (p6.a) this.f1342f;
                p6.a aVar2 = (p6.a) this.f1343g;
                m0.s sVar = (m0.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.N(intValue & 1, (intValue & 3) != 2)) {
                    y0.j jVar = y0.j.f8705a;
                    if (this.f1341e < 20) {
                        sVar.V(-1760861049);
                        j0.m.b(aVar, androidx.compose.foundation.layout.a.d(jVar, 1.0f), false, d0.e.a(12), null, null, null, null, k.f1359d, sVar, 805306416, 500);
                        sVar.p(false);
                    } else {
                        sVar.V(-1760538959);
                        j0.m.b(aVar2, androidx.compose.foundation.layout.a.d(jVar, 1.0f), false, d0.e.a(12), null, null, null, null, k.f1360e, sVar, 805306416, 500);
                        sVar.p(false);
                    }
                } else {
                    sVar.Q();
                }
                return c6.m.f1757a;
            case 1:
                ((Integer) obj2).getClass();
                k.k((w) this.f1342f, this.f1341e, (y0.m) this.f1343g, (m0.s) obj, m0.b.w(1));
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                k.n((List) this.f1342f, this.f1341e, (p6.c) this.f1343g, (m0.s) obj, m0.b.w(385));
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                ((Integer) obj2).getClass();
                m0.b.a((l.q) this.f1342f, (u0.c) this.f1343g, (m0.s) obj, m0.b.w(this.f1341e | 1));
                break;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj2).intValue();
                m0.b.b((l.q[]) this.f1342f, (p6.e) this.f1343g, (m0.s) obj, m0.b.w(this.f1341e | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                ((r.l1) this.f1342f).a(this.f1343g, (m0.s) obj, m0.b.w(this.f1341e | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                r2.r.a((y0.m) this.f1342f, (p6.c) this.f1343g, (m0.s) obj, m0.b.w(this.f1341e | 1));
                break;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj2).intValue();
                ((u0.c) this.f1342f).e(this.f1343g, (m0.s) obj, m0.b.w(this.f1341e) | 1);
                break;
            default:
                ((Integer) obj2).getClass();
                ((z.h) this.f1342f).a(this.f1341e, this.f1343g, (m0.s) obj, m0.b.w(1));
                break;
        }
        return c6.m.f1757a;
    }

    public /* synthetic */ i0(int i, p6.a aVar, p6.a aVar2) {
        this.f1340d = 0;
        this.f1341e = i;
        this.f1342f = aVar;
        this.f1343g = aVar2;
    }

    public /* synthetic */ i0(Object obj, int i, Object obj2, int i8, int i9) {
        this.f1340d = i9;
        this.f1342f = obj;
        this.f1341e = i;
        this.f1343g = obj2;
    }
}
