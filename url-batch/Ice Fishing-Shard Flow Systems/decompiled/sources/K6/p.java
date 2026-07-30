package K6;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1550e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1551i;

    public /* synthetic */ p(Object obj, int i2, Object obj2) {
        this.f1549d = i2;
        this.f1550e = obj;
        this.f1551i = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long a7;
        int i2;
        z[] zVarArr;
        switch (this.f1549d) {
            case 0:
                r rVar = (r) this.f1550e;
                z zVar = (z) this.f1551i;
                try {
                    rVar.f1562d.b(zVar);
                } catch (IOException e7) {
                    N6.e eVar = N6.e.f1879a;
                    N6.e.f1879a.j("Http2Connection.Listener failure for " + rVar.f1564i, 4, e7);
                    try {
                        zVar.d(EnumC0131b.f1492l, e7);
                    } catch (IOException unused) {
                    }
                }
                return Unit.f6114a;
            case 1:
                q qVar = (q) this.f1550e;
                E settings = (E) this.f1551i;
                Intrinsics.checkNotNullParameter(settings, "settings");
                kotlin.jvm.internal.D d7 = new kotlin.jvm.internal.D();
                r rVar2 = qVar.f1553e;
                synchronized (rVar2.f1559E) {
                    synchronized (rVar2) {
                        try {
                            E e8 = rVar2.f1579z;
                            E e9 = new E();
                            e9.b(e8);
                            e9.b(settings);
                            d7.f6152d = e9;
                            a7 = e9.a() - e8.a();
                            if (a7 != 0 && !rVar2.f1563e.isEmpty()) {
                                zVarArr = (z[]) rVar2.f1563e.values().toArray(new z[0]);
                                E e10 = (E) d7.f6152d;
                                Intrinsics.checkNotNullParameter(e10, "<set-?>");
                                rVar2.f1579z = e10;
                                G6.c.c(rVar2.f1571r, rVar2.f1564i + " onSettings", new p(rVar2, 2, d7));
                                Unit unit = Unit.f6114a;
                            }
                            zVarArr = null;
                            E e102 = (E) d7.f6152d;
                            Intrinsics.checkNotNullParameter(e102, "<set-?>");
                            rVar2.f1579z = e102;
                            G6.c.c(rVar2.f1571r, rVar2.f1564i + " onSettings", new p(rVar2, 2, d7));
                            Unit unit2 = Unit.f6114a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        rVar2.f1559E.a((E) d7.f6152d);
                    } catch (IOException e11) {
                        EnumC0131b enumC0131b = EnumC0131b.f1492l;
                        rVar2.a(enumC0131b, enumC0131b, e11);
                    }
                    Unit unit3 = Unit.f6114a;
                }
                if (zVarArr != null) {
                    for (z zVar2 : zVarArr) {
                        synchronized (zVar2) {
                            zVar2.f1613m += a7;
                            if (a7 > 0) {
                                zVar2.notifyAll();
                            }
                            Unit unit4 = Unit.f6114a;
                        }
                    }
                }
                return Unit.f6114a;
            default:
                r rVar3 = (r) this.f1550e;
                rVar3.f1562d.a(rVar3, (E) ((kotlin.jvm.internal.D) this.f1551i).f6152d);
                return Unit.f6114a;
        }
    }
}
