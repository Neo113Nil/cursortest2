package com.baidu.platform.comapi.h.m;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.baidu.mapapi.walknavi.model.RouteGuideKind;
import com.baidu.mapsdkplatform.comapi.map.MessageCenter;
import com.baidu.platform.comapi.walknavi.g.g;
import com.baidu.platform.comapi.walknavi.g.h;
import com.baidu.platform.comapi.wnplatform.model.datastruct.WLocData;
import com.baidu.platform.comapi.wnplatform.model.j;
import com.github.mikephil.charting.utils.i;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class f extends com.baidu.platform.comapi.walknavi.a {

    /* renamed from: a, reason: collision with root package name */
    private static int f9158a;

    /* renamed from: b, reason: collision with root package name */
    private List<com.baidu.platform.comapi.h.m.a> f9159b;

    /* renamed from: c, reason: collision with root package name */
    private List<com.baidu.platform.comapi.h.m.c> f9160c;

    /* renamed from: d, reason: collision with root package name */
    private List<com.baidu.platform.comapi.h.m.b> f9161d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f9162e = new a(Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    private com.baidu.platform.comapi.h.o.b f9163f = new b();

    /* renamed from: g, reason: collision with root package name */
    private com.baidu.platform.comapi.h.f.b f9164g = new c();

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        @SuppressLint({"HandlerLeak"})
        public void handleMessage(Message message) {
            com.baidu.platform.comapi.walknavi.k.b bVar;
            int i8 = message.what;
            if (i8 == 4098) {
                f.this.f(message);
                j.a().a(message.what, message.arg1, message.arg2, null);
            }
            if (i8 == 4113) {
                Bundle bundle = new Bundle();
                if (com.baidu.platform.comapi.walknavi.b.n().s().i(bundle)) {
                    com.baidu.platform.comapi.walknavi.b.n().g().g(bundle);
                    j.a().a(message.what, message.arg1, message.arg2, bundle);
                    if (f.this.f9159b != null) {
                        for (com.baidu.platform.comapi.h.m.a aVar : f.this.f9159b) {
                            if (aVar != null) {
                                aVar.onNaviLocationUpdate();
                            }
                        }
                    }
                    if (f.this.f9161d != null) {
                        Iterator it = f.this.f9161d.iterator();
                        while (it.hasNext()) {
                            ((com.baidu.platform.comapi.h.m.b) it.next()).a(com.baidu.platform.comapi.walknavi.b.n().g().c());
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i8 == 4116) {
                com.baidu.platform.comapi.walknavi.b.n().g().c(message.arg1);
                if (f.this.f9159b != null) {
                    for (com.baidu.platform.comapi.h.m.a aVar2 : f.this.f9159b) {
                        if (aVar2 != null) {
                            aVar2.onNaviLocationUpdate();
                        }
                    }
                }
                if (f.this.f9161d != null) {
                    Iterator it2 = f.this.f9161d.iterator();
                    while (it2.hasNext()) {
                        ((com.baidu.platform.comapi.h.m.b) it2.next()).a(com.baidu.platform.comapi.walknavi.b.n().g().b());
                    }
                    return;
                }
                return;
            }
            if (i8 == 65301) {
                int i9 = message.arg1;
                if (i9 == 1 || i9 != 0 || com.baidu.platform.comapi.walknavi.b.n().H() == null) {
                    return;
                }
                com.baidu.platform.comapi.walknavi.b.n().H().n();
                return;
            }
            if (i8 == 4110) {
                g.b(false);
                return;
            }
            if (i8 == 4111) {
                int i10 = message.arg1;
                if (!(com.baidu.platform.comapi.walknavi.b.n().H() instanceof com.baidu.platform.comapi.walknavi.k.b) || (bVar = (com.baidu.platform.comapi.walknavi.k.b) com.baidu.platform.comapi.walknavi.b.n().H()) == null) {
                    return;
                }
                bVar.a(RouteGuideKind.values()[i10]);
                return;
            }
            switch (i8) {
                case 4100:
                    if (f.this.f9159b != null) {
                        Bundle bundle2 = new Bundle();
                        com.baidu.platform.comapi.walknavi.b.n().s().m(bundle2);
                        for (com.baidu.platform.comapi.h.m.a aVar3 : f.this.f9159b) {
                            if (aVar3 != null) {
                                aVar3.f(bundle2);
                            }
                        }
                        break;
                    }
                    break;
                case 4101:
                    if (f.this.f9159b != null) {
                        Bundle bundle3 = new Bundle();
                        com.baidu.platform.comapi.walknavi.k.e.a.a(bundle3, 2, message.arg1, message.arg2);
                        j.a().a(message.what, message.arg1, message.arg2, bundle3);
                        for (com.baidu.platform.comapi.h.m.a aVar4 : f.this.f9159b) {
                            if (aVar4 != null) {
                                aVar4.e(bundle3);
                            }
                        }
                        break;
                    }
                    break;
                case 4102:
                    if (f.this.f9159b != null) {
                        for (com.baidu.platform.comapi.h.m.a aVar5 : f.this.f9159b) {
                            if (aVar5 != null) {
                                aVar5.b(null);
                            }
                        }
                        break;
                    }
                    break;
                default:
                    switch (i8) {
                        case 4105:
                            if (f.this.f9159b != null) {
                                byte[] e8 = com.baidu.platform.comapi.walknavi.b.n().s().e();
                                for (com.baidu.platform.comapi.h.m.a aVar6 : f.this.f9159b) {
                                    if (aVar6 != null) {
                                        aVar6.a(e8);
                                    }
                                }
                                break;
                            }
                            break;
                        case 4106:
                            if (f.this.f9159b != null) {
                                Bundle f8 = com.baidu.platform.comapi.walknavi.b.n().s().f();
                                for (com.baidu.platform.comapi.h.m.a aVar7 : f.this.f9159b) {
                                    if (aVar7 != null) {
                                        aVar7.d(f8);
                                    }
                                }
                                break;
                            }
                            break;
                        case 4107:
                            if (f.this.f9159b != null) {
                                Bundle bundle4 = new Bundle();
                                com.baidu.platform.comapi.walknavi.b.n().a(bundle4);
                                for (com.baidu.platform.comapi.h.m.a aVar8 : f.this.f9159b) {
                                    if (aVar8 != null) {
                                        aVar8.c(bundle4);
                                    }
                                }
                            }
                            if (!g.b()) {
                                f.this.h();
                                break;
                            }
                            break;
                        case 4108:
                            if (f.this.f9159b != null) {
                                Bundle bundle5 = new Bundle();
                                com.baidu.platform.comapi.walknavi.b.n().s().h(bundle5);
                                for (com.baidu.platform.comapi.h.m.a aVar9 : f.this.f9159b) {
                                    if (aVar9 != null) {
                                        aVar9.a(bundle5);
                                    }
                                }
                                break;
                            }
                            break;
                    }
            }
        }
    }

    class b implements com.baidu.platform.comapi.h.o.b {
        b() {
        }

        @Override // com.baidu.platform.comapi.h.o.b
        public void a(com.baidu.platform.comapi.wnplatform.model.datastruct.a aVar) {
            f.c();
            new DecimalFormat("######0.00");
            double d8 = aVar.f10498d;
            double f8 = com.baidu.platform.comapi.walknavi.b.n().t().f();
            com.baidu.platform.comapi.walknavi.b.n().s().a(aVar.f10495a, aVar.f10496b, aVar.f10497c, d8, aVar.f10499e, aVar.f10500f);
            if (com.baidu.platform.comapi.walknavi.b.n().t().c() != null) {
                double d9 = aVar.f10498d - f8;
                com.baidu.platform.comapi.walknavi.g.e d10 = com.baidu.platform.comapi.walknavi.g.e.d();
                double a8 = h.a(r3.overlook);
                if (d9 < i.DOUBLE_EPSILON) {
                    d9 += 360.0d;
                }
                d10.a(a8, h.a(d9) - 3.141592653589793d, i.DOUBLE_EPSILON);
            }
            if (f.f9158a % 5 == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("s:");
                sb.append((int) d8);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("g:");
                sb2.append((int) i.DOUBLE_EPSILON);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("r:");
                sb3.append((int) f8);
            }
        }
    }

    class c implements com.baidu.platform.comapi.h.f.b {
        c() {
        }

        @Override // com.baidu.platform.comapi.h.f.b
        public void a(WLocData wLocData) {
            if (wLocData == null) {
                return;
            }
            com.baidu.platform.comapi.walknavi.b.n().s().a(wLocData.longitude, wLocData.latitude, wLocData.speed, wLocData.direction, wLocData.accuracy, (float) wLocData.altitude, wLocData.buildingId, wLocData.floorId, wLocData.getLocType(), wLocData.coordType, wLocData.indoorState, wLocData.type, wLocData.networkLocType, wLocData.satellitesNum);
            Bundle bundle = new Bundle();
            bundle.putFloat("gpsSpeed", wLocData.speed);
            bundle.putFloat("gpsDirection", wLocData.direction);
            bundle.putDouble("gpsLongitude", wLocData.longitude);
            bundle.putDouble("gpsLatitude", wLocData.latitude);
            j.a().a(7777, 0, 0, bundle);
        }
    }

    static /* synthetic */ int c() {
        int i8 = f9158a;
        f9158a = i8 + 1;
        return i8;
    }

    private void d() {
        MessageCenter.registMessage(4098, this.f9162e);
        MessageCenter.registMessage(4100, this.f9162e);
        MessageCenter.registMessage(4101, this.f9162e);
        MessageCenter.registMessage(4106, this.f9162e);
        MessageCenter.registMessage(4113, this.f9162e);
        MessageCenter.registMessage(4116, this.f9162e);
    }

    private void e() {
        MessageCenter.unregistMessage(4098, this.f9162e);
        MessageCenter.unregistMessage(4100, this.f9162e);
        MessageCenter.unregistMessage(4101, this.f9162e);
        MessageCenter.unregistMessage(4106, this.f9162e);
        MessageCenter.unregistMessage(4113, this.f9162e);
        MessageCenter.unregistMessage(4116, this.f9162e);
    }

    private void f() {
        MessageCenter.registMessage(65301, this.f9162e);
        MessageCenter.registMessage(4098, this.f9162e);
        MessageCenter.registMessage(4100, this.f9162e);
        MessageCenter.registMessage(4101, this.f9162e);
        MessageCenter.registMessage(4102, this.f9162e);
        MessageCenter.registMessage(4105, this.f9162e);
        MessageCenter.registMessage(4106, this.f9162e);
        MessageCenter.registMessage(4107, this.f9162e);
        MessageCenter.registMessage(4111, this.f9162e);
        MessageCenter.registMessage(4110, this.f9162e);
        MessageCenter.registMessage(4108, this.f9162e);
        MessageCenter.registMessage(4113, this.f9162e);
        MessageCenter.registMessage(4116, this.f9162e);
    }

    private void g() {
        MessageCenter.unregistMessage(4098, this.f9162e);
        MessageCenter.unregistMessage(4100, this.f9162e);
        MessageCenter.unregistMessage(4101, this.f9162e);
        MessageCenter.unregistMessage(4102, this.f9162e);
        MessageCenter.unregistMessage(4105, this.f9162e);
        MessageCenter.unregistMessage(4106, this.f9162e);
        MessageCenter.unregistMessage(4107, this.f9162e);
        MessageCenter.unregistMessage(4111, this.f9162e);
        MessageCenter.unregistMessage(4110, this.f9162e);
        MessageCenter.unregistMessage(4108, this.f9162e);
        MessageCenter.unregistMessage(4113, this.f9162e);
        MessageCenter.unregistMessage(4116, this.f9162e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (com.baidu.platform.comapi.walknavi.b.n().H() != null) {
            if (com.baidu.platform.comapi.walknavi.b.n().H().i() > 0.2d) {
                g.a().a();
            } else {
                g.a().g();
            }
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        if (com.baidu.platform.comapi.walknavi.b.n().k() == 3) {
            d();
        } else {
            f();
        }
        int i8 = com.baidu.platform.comapi.walknavi.k.e.b.f10196a;
        if (i8 == 1) {
            com.baidu.platform.comapi.walknavi.b.n().q().a(this.f9164g);
            com.baidu.platform.comapi.walknavi.b.n().s().i(1);
        } else if (i8 == 2) {
            com.baidu.platform.comapi.walknavi.b.n().s().i(2);
        } else if (i8 == 3) {
            com.baidu.platform.comapi.walknavi.b.n().G().a(this.f9164g);
            com.baidu.platform.comapi.walknavi.b.n().s().i(3);
        }
        com.baidu.platform.comapi.walknavi.b.n().C().a(this.f9163f);
        return true;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public void release() {
        if (com.baidu.platform.comapi.walknavi.b.n().k() == 3) {
            e();
        } else {
            g();
        }
        this.f9162e = null;
        this.f9159b = null;
        this.f9160c = null;
        this.f9161d = null;
        com.baidu.platform.comapi.walknavi.b.n().q().b(this.f9164g);
        this.f9164g = null;
    }

    private Bundle c(int i8) {
        return com.baidu.platform.comapi.walknavi.b.n().s().f(i8);
    }

    public void a(com.baidu.platform.comapi.h.m.a aVar) {
        if (this.f9159b == null) {
            this.f9159b = new LinkedList();
        }
        this.f9159b.add(aVar);
    }

    public void b(com.baidu.platform.comapi.h.m.a aVar) {
        List<com.baidu.platform.comapi.h.m.a> list = this.f9159b;
        if (list == null || aVar == null) {
            return;
        }
        list.remove(aVar);
        this.f9159b = null;
    }

    public void b(com.baidu.platform.comapi.h.m.c cVar) {
        List<com.baidu.platform.comapi.h.m.c> list = this.f9160c;
        if (list == null || cVar == null) {
            return;
        }
        list.remove(cVar);
        this.f9160c = null;
    }

    public void a(com.baidu.platform.comapi.h.m.c cVar) {
        if (this.f9160c == null) {
            this.f9160c = new LinkedList();
        }
        this.f9160c.add(cVar);
    }

    public void b(com.baidu.platform.comapi.h.m.b bVar) {
        List<com.baidu.platform.comapi.h.m.b> list;
        if (bVar == null || (list = this.f9161d) == null) {
            return;
        }
        list.remove(bVar);
    }

    public void a(com.baidu.platform.comapi.h.m.b bVar) {
        if (bVar == null) {
            return;
        }
        if (this.f9161d == null) {
            this.f9161d = new LinkedList();
        }
        this.f9161d.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Message message) {
        List<com.baidu.platform.comapi.h.m.c> list = this.f9160c;
        if (list == null) {
        }
        switch (message.arg1) {
            case 2:
                for (com.baidu.platform.comapi.h.m.c cVar : list) {
                    if (cVar != null) {
                        cVar.b(message);
                    }
                }
                g.a().d();
                break;
            case 3:
                for (com.baidu.platform.comapi.h.m.c cVar2 : list) {
                    if (cVar2 != null) {
                        cVar2.d(message);
                    }
                }
                g.a().e();
                break;
            case 4:
                com.baidu.platform.comapi.walknavi.b.n().g().a(c(1), 1);
                com.baidu.platform.comapi.walknavi.b.n().g().a(com.baidu.platform.comapi.walknavi.b.n().s().m());
                List<com.baidu.platform.comapi.h.m.c> list2 = this.f9160c;
                if (list2 != null) {
                    for (com.baidu.platform.comapi.h.m.c cVar3 : list2) {
                        if (cVar3 != null) {
                            cVar3.a(message);
                        }
                    }
                    break;
                }
                break;
            case 5:
                for (com.baidu.platform.comapi.h.m.c cVar4 : list) {
                    if (cVar4 != null) {
                        cVar4.c(message);
                    }
                }
                break;
            case 6:
                for (com.baidu.platform.comapi.h.m.c cVar5 : list) {
                    if (cVar5 != null) {
                        cVar5.onIndoorEnd(message);
                    }
                }
                break;
            case 7:
                if (com.baidu.platform.comapi.walknavi.g.e.d().f()) {
                    g.a().b();
                    break;
                } else {
                    List<com.baidu.platform.comapi.h.m.c> list3 = this.f9160c;
                    if (list3 != null) {
                        for (com.baidu.platform.comapi.h.m.c cVar6 : list3) {
                            if (cVar6 != null) {
                                cVar6.onFinalEnd(message);
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
