package t3;

import A1.L0;
import M2.E;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends p3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f10789f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f10790g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, Object obj, Object obj2, int i2) {
        super(str, true);
        this.f10788e = i2;
        this.f10789f = obj;
        this.f10790g = obj2;
    }

    @Override // p3.a
    public final long a() {
        long a4;
        x[] xVarArr;
        int i2 = 0;
        switch (this.f10788e) {
            case 0:
                p pVar = (p) this.f10789f;
                pVar.f10814d.a(pVar, (B) ((E) this.f10790g).f3580d);
                return -1L;
            case 1:
                try {
                    ((p) this.f10789f).f10814d.b((x) this.f10790g);
                } catch (IOException e4) {
                    u3.n nVar = u3.n.f10964a;
                    u3.n nVar2 = u3.n.f10964a;
                    String str = "Http2Connection.Listener failure for " + ((p) this.f10789f).f10816i;
                    nVar2.getClass();
                    u3.n.i(str, 4, e4);
                    try {
                        ((x) this.f10790g).c(EnumC1211b.PROTOCOL_ERROR, e4);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                L0 l02 = (L0) this.f10789f;
                B settings = (B) this.f10790g;
                l02.getClass();
                Intrinsics.checkNotNullParameter(settings, "settings");
                E e5 = new E();
                p pVar2 = (p) l02.f499i;
                synchronized (pVar2.f10811C) {
                    synchronized (pVar2) {
                        try {
                            B b4 = pVar2.f10830w;
                            B b5 = new B();
                            b5.b(b4);
                            b5.b(settings);
                            e5.f3580d = b5;
                            a4 = b5.a() - b4.a();
                            if (a4 != 0 && !pVar2.f10815e.isEmpty()) {
                                xVarArr = (x[]) pVar2.f10815e.values().toArray(new x[0]);
                                B b6 = (B) e5.f3580d;
                                Intrinsics.checkNotNullParameter(b6, "<set-?>");
                                pVar2.f10830w = b6;
                                pVar2.f10823p.c(new j(pVar2.f10816i + " onSettings", pVar2, e5, i2), 0L);
                                Unit unit = Unit.f7487a;
                            }
                            xVarArr = null;
                            B b62 = (B) e5.f3580d;
                            Intrinsics.checkNotNullParameter(b62, "<set-?>");
                            pVar2.f10830w = b62;
                            pVar2.f10823p.c(new j(pVar2.f10816i + " onSettings", pVar2, e5, i2), 0L);
                            Unit unit2 = Unit.f7487a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        pVar2.f10811C.a((B) e5.f3580d);
                    } catch (IOException e6) {
                        pVar2.b(e6);
                    }
                    Unit unit3 = Unit.f7487a;
                }
                if (xVarArr != null) {
                    int length = xVarArr.length;
                    while (i2 < length) {
                        x xVar = xVarArr[i2];
                        synchronized (xVar) {
                            xVar.f10868f += a4;
                            if (a4 > 0) {
                                xVar.notifyAll();
                            }
                            Unit unit4 = Unit.f7487a;
                        }
                        i2++;
                    }
                }
                return -1L;
        }
    }
}
