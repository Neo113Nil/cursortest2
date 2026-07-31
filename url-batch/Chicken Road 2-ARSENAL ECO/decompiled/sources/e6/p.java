package e6;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.io.IOException;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements InterfaceC0732a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4094f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4095g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4096h;

    public /* synthetic */ p(Object obj, int i7, Object obj2) {
        this.f4094f = i7;
        this.f4095g = obj;
        this.f4096h = obj2;
    }

    @Override // x5.InterfaceC0732a
    public final Object invoke() {
        long a7;
        int i7;
        z[] zVarArr;
        switch (this.f4094f) {
            case 0:
                r rVar = (r) this.f4095g;
                z zVar = (z) this.f4096h;
                try {
                    rVar.f4104f.c(zVar);
                } catch (IOException e4) {
                    h6.e eVar = h6.e.f4355a;
                    h6.e.f4355a.j("Http2Connection.Listener failure for " + rVar.f4106h, 4, e4);
                    try {
                        zVar.e(EnumC0356b.f4039i, e4);
                    } catch (IOException unused) {
                    }
                }
                return k5.v.f5219a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                q qVar = (q) this.f4095g;
                D d7 = (D) this.f4096h;
                kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s();
                r rVar2 = qVar.f4098g;
                synchronized (rVar2.f4101B) {
                    synchronized (rVar2) {
                        try {
                            D d8 = rVar2.f4121w;
                            D d9 = new D();
                            d9.b(d8);
                            d9.b(d7);
                            sVar.f5233f = d9;
                            a7 = d9.a() - d8.a();
                            if (a7 != 0 && !rVar2.f4105g.isEmpty()) {
                                zVarArr = (z[]) rVar2.f4105g.values().toArray(new z[0]);
                                D d10 = (D) sVar.f5233f;
                                kotlin.jvm.internal.i.e(d10, "<set-?>");
                                rVar2.f4121w = d10;
                                a6.c.c(rVar2.f4113o, rVar2.f4106h + " onSettings", new p(rVar2, 2, sVar));
                            }
                            zVarArr = null;
                            D d102 = (D) sVar.f5233f;
                            kotlin.jvm.internal.i.e(d102, "<set-?>");
                            rVar2.f4121w = d102;
                            a6.c.c(rVar2.f4113o, rVar2.f4106h + " onSettings", new p(rVar2, 2, sVar));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        rVar2.f4101B.a((D) sVar.f5233f);
                    } catch (IOException e7) {
                        EnumC0356b enumC0356b = EnumC0356b.f4039i;
                        rVar2.a(enumC0356b, enumC0356b, e7);
                    }
                }
                if (zVarArr != null) {
                    for (z zVar2 : zVarArr) {
                        synchronized (zVar2) {
                            zVar2.f4157j += a7;
                            if (a7 > 0) {
                                zVar2.notifyAll();
                            }
                        }
                    }
                }
                return k5.v.f5219a;
            default:
                r rVar3 = (r) this.f4095g;
                rVar3.f4104f.a(rVar3, (D) ((kotlin.jvm.internal.s) this.f4096h).f5233f);
                return k5.v.f5219a;
        }
    }
}
