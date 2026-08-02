package N3;

import java.io.IOException;

/* loaded from: classes.dex */
public final class j extends J3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1860f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1861g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, Object obj, Object obj2, int i4) {
        super(str, true);
        this.f1859e = i4;
        this.f1860f = obj;
        this.f1861g = obj2;
    }

    @Override // J3.a
    public final long a() {
        long a3;
        int i4;
        y[] yVarArr;
        switch (this.f1859e) {
            case 0:
                q qVar = (q) this.f1860f;
                qVar.f1880a.a(qVar, (D) ((kotlin.jvm.internal.p) this.f1861g).f14159a);
                return -1L;
            case 1:
                try {
                    ((q) this.f1860f).f1880a.b((y) this.f1861g);
                } catch (IOException e4) {
                    O3.n nVar = O3.n.f2081a;
                    O3.n nVar2 = O3.n.f2081a;
                    String h2 = kotlin.jvm.internal.i.h(((q) this.f1860f).f1882c, "Http2Connection.Listener failure for ");
                    nVar2.getClass();
                    O3.n.i(h2, 4, e4);
                    try {
                        ((y) this.f1861g).c(EnumC0078b.PROTOCOL_ERROR, e4);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                l lVar = (l) this.f1860f;
                D d4 = (D) this.f1861g;
                kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p();
                q qVar2 = lVar.f1866b;
                synchronized (qVar2.f1899w) {
                    synchronized (qVar2) {
                        try {
                            D d5 = qVar2.f1894q;
                            D d6 = new D();
                            d6.b(d5);
                            d6.b(d4);
                            pVar.f14159a = d6;
                            a3 = d6.a() - d5.a();
                            i4 = 0;
                            if (a3 != 0 && !qVar2.f1881b.isEmpty()) {
                                Object[] array = qVar2.f1881b.values().toArray(new y[0]);
                                if (array == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                }
                                yVarArr = (y[]) array;
                                D d7 = (D) pVar.f14159a;
                                kotlin.jvm.internal.i.e(d7, "<set-?>");
                                qVar2.f1894q = d7;
                                qVar2.f1889j.c(new j(kotlin.jvm.internal.i.h(" onSettings", qVar2.f1882c), qVar2, pVar, i4), 0L);
                            }
                            yVarArr = null;
                            D d72 = (D) pVar.f14159a;
                            kotlin.jvm.internal.i.e(d72, "<set-?>");
                            qVar2.f1894q = d72;
                            qVar2.f1889j.c(new j(kotlin.jvm.internal.i.h(" onSettings", qVar2.f1882c), qVar2, pVar, i4), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        qVar2.f1899w.a((D) pVar.f14159a);
                    } catch (IOException e5) {
                        qVar2.b(e5);
                    }
                }
                if (yVarArr != null) {
                    int length = yVarArr.length;
                    while (i4 < length) {
                        y yVar = yVarArr[i4];
                        i4++;
                        synchronized (yVar) {
                            yVar.f1936f += a3;
                            if (a3 > 0) {
                                yVar.notifyAll();
                            }
                        }
                    }
                }
                return -1L;
        }
    }
}
