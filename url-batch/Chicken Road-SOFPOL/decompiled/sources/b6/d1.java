package b6;

import android.content.Context;
import java.util.Iterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements p6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o4.t f1298e;

    public /* synthetic */ d1(o4.t tVar, int i) {
        this.f1297d = i;
        this.f1298e = tVar;
    }

    @Override // p6.a
    public final Object b() {
        int i;
        switch (this.f1297d) {
            case 0:
                o4.t.a(this.f1298e, w1.f1496d.f1525a);
                return c6.m.f1757a;
            case 1:
                o4.t.a(this.f1298e, v1.f1482d.f1525a);
                return c6.m.f1757a;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                o4.t.a(this.f1298e, y1.f1514d.f1525a);
                return c6.m.f1757a;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                o4.t.a(this.f1298e, u1.f1472d.f1525a);
                return c6.m.f1757a;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                o4.t tVar = this.f1298e;
                b.u uVar = tVar.f5689f;
                boolean z3 = false;
                if (tVar.f5690g) {
                    d6.k kVar = tVar.f5685b.f6589f;
                    if (kVar == null || !kVar.isEmpty()) {
                        Iterator it = kVar.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (!(((o4.d) it.next()).f5621e instanceof o4.q) && (i = i + 1) < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i > 1) {
                        z3 = true;
                    }
                }
                uVar.d(z3);
                return c6.m.f1757a;
            default:
                o4.t tVar2 = this.f1298e;
                Context context = tVar2.f5684a;
                o4.z zVar = tVar2.f5685b.f6601s;
                q6.i.e(context, "context");
                q6.i.e(zVar, "navigatorProvider");
                return new o4.u();
        }
    }
}
