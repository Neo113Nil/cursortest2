package M2;

import G0.C0051a;
import G0.C0052b;
import G0.C0054d;
import G0.C0056f;
import G0.C0057g;
import G0.C0058h;
import G0.C0059i;
import G0.C0060j;
import G0.C0061k;
import G0.C0062l;
import G0.C0065o;
import G0.C0066p;
import G0.O;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import b2.AbstractC0279e;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import h2.C0482c;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import n2.AbstractC1341c;
import w2.AbstractActivityC1515c;

/* loaded from: classes.dex */
public final class M implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public C0054d f1848a;

    /* renamed from: b, reason: collision with root package name */
    public final W1.e f1849b;

    /* renamed from: d, reason: collision with root package name */
    public final Context f1851d;

    /* renamed from: e, reason: collision with root package name */
    public final B1.g f1852e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f1853f = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public AbstractActivityC1515c f1850c = null;

    public M(Context context, B1.g gVar, W1.e eVar) {
        this.f1849b = eVar;
        this.f1851d = context;
        this.f1852e = gVar;
    }

    public static C0099c a() {
        return new C0099c("UNAVAILABLE", "BillingClient is unset. Try reconnecting.", null);
    }

    public static void d(H2.f fVar, final M m6) {
        C0106j c0106j = C0106j.f1877a;
        f2.t tVar = new f2.t(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isReady", c0106j, null);
        if (m6 != null) {
            final int i2 = 0;
            tVar.h(new H2.b(m6) { // from class: M2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ M f1861b;

                {
                    this.f1861b = m6;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar2) {
                    C0054d c0054d;
                    switch (i2) {
                        case 0:
                            M m7 = this.f1861b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c0054d = m7.f1848a;
                            } catch (Throwable th) {
                                arrayList = e5.g.C(th);
                            }
                            if (c0054d == null) {
                                throw M.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c0054d.b()));
                            tVar2.b(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0105i c0105i = new C0105i(arrayList2, tVar2, 0);
                            C0054d c0054d2 = this.f1861b.f1848a;
                            if (c0054d2 == null) {
                                tVar2.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                D3.g gVar = new D3.g(6, c0105i);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0061k c0061k = new C0061k();
                                c0061k.f864a = str;
                                c0054d2.f(gVar, c0061k);
                                return;
                            } catch (RuntimeException e3) {
                                c0105i.f1876c.b(e5.g.C(new C0099c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj).get(0);
                            C0101e c0101e = new C0101e(arrayList3, tVar2, 1);
                            M m8 = this.f1861b;
                            if (m8.f1848a == null) {
                                tVar2.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0051a c0051a = new C0051a(1);
                                c0051a.f813b = AbstractC1341c.J(zVar);
                                m8.f1848a.d(c0051a.c(), new D3.g(3, c0101e));
                                return;
                            } catch (RuntimeException e6) {
                                c0101e.f1864c.b(e5.g.C(new C0099c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            z zVar2 = (z) ((ArrayList) obj).get(0);
                            C0102f c0102f = new C0102f(arrayList4, tVar2, 1);
                            C0054d c0054d3 = this.f1861b.f1848a;
                            if (c0054d3 == null) {
                                tVar2.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                String J4 = AbstractC1341c.J(zVar2);
                                D3.g gVar2 = new D3.g(5, c0102f);
                                if (!c0054d3.b()) {
                                    C0060j c0060j = O.f781k;
                                    c0054d3.H(2, 11, c0060j);
                                    gVar2.onPurchaseHistoryResponse(c0060j, null);
                                } else if (C0054d.m(new G0.w(c0054d3, J4, gVar2, 3), 30000L, new A0.a(c0054d3, gVar2, 11, false), c0054d3.D(), c0054d3.q()) == null) {
                                    C0060j n6 = c0054d3.n();
                                    c0054d3.H(25, 11, n6);
                                    gVar2.onPurchaseHistoryResponse(n6, null);
                                }
                                return;
                            } catch (RuntimeException e7) {
                                c0102f.f1867c.b(e5.g.C(new C0099c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0103g c0103g = new C0103g(arrayList5, tVar2, 1);
                            M m9 = this.f1861b;
                            if (m9.f1848a == null) {
                                tVar2.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0482c c0482c = new C0482c(5);
                                c0482c.g(AbstractC1341c.I(list));
                                m9.f1848a.c(c0482c.d(), new C0097a(m9, 4, c0103g));
                                return;
                            } catch (RuntimeException e8) {
                                c0103g.f1870c.b(e5.g.C(new C0099c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 5:
                            M m10 = this.f1861b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, m10.b((n) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = e5.g.C(th2);
                            }
                            tVar2.b(arrayList6);
                            return;
                        case 6:
                            C0104h c0104h = new C0104h(new ArrayList(), tVar2, 1);
                            C0054d c0054d4 = this.f1861b.f1848a;
                            if (c0054d4 == null) {
                                tVar2.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d4.i(new D3.g(8, c0104h));
                                return;
                            } catch (RuntimeException e9) {
                                c0104h.f1873c.b(e5.g.C(new C0099c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 7:
                            C0105i c0105i2 = new C0105i(new ArrayList(), tVar2, 1);
                            M m11 = this.f1861b;
                            C0054d c0054d5 = m11.f1848a;
                            if (c0054d5 == null) {
                                tVar2.b(e5.g.C(M.a()));
                                return;
                            }
                            AbstractActivityC1515c abstractActivityC1515c = m11.f1850c;
                            if (abstractActivityC1515c == null) {
                                tVar2.b(e5.g.C(new C0099c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c0054d5.k(abstractActivityC1515c, new D3.g(9, c0105i2));
                                return;
                            } catch (RuntimeException e10) {
                                c0105i2.f1876c.b(e5.g.C(new C0099c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 8:
                            C0101e c0101e2 = new C0101e(new ArrayList(), tVar2, 0);
                            C0054d c0054d6 = this.f1861b.f1848a;
                            if (c0054d6 == null) {
                                tVar2.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d6.g(new D3.g(4, c0101e2));
                                return;
                            } catch (RuntimeException e11) {
                                c0101e2.f1864c.b(e5.g.C(new C0099c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 9:
                            M m12 = this.f1861b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l2 = (Long) arrayList8.get(0);
                            EnumC0109m enumC0109m = (EnumC0109m) arrayList8.get(1);
                            v vVar = (v) arrayList8.get(2);
                            C0102f c0102f2 = new C0102f(arrayList7, tVar2, 0);
                            if (m12.f1848a == null) {
                                W1.e eVar = m12.f1849b;
                                Context context = m12.f1851d;
                                B1.g gVar3 = m12.f1852e;
                                eVar.getClass();
                                C0052b c0052b = new C0052b(context);
                                if (vVar != null && vVar.f1918a.booleanValue()) {
                                    z = true;
                                }
                                c0052b.f814a = new C0062l(z);
                                int ordinal = enumC0109m.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c0052b.f818e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0109m + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c0052b.f817d = new C0097a(eVar, 0, gVar3);
                                    }
                                }
                                c0052b.f816c = new C0482c(24, gVar3);
                                m12.f1848a = c0052b.a();
                            }
                            try {
                                m12.f1848a.l(new L(m12, c0102f2, l2));
                                return;
                            } catch (RuntimeException e12) {
                                c0102f2.f1867c.b(e5.g.C(new C0099c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 10:
                            M m13 = this.f1861b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C0054d c0054d7 = m13.f1848a;
                                if (c0054d7 != null) {
                                    c0054d7.a();
                                    m13.f1848a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = e5.g.C(th3);
                            }
                            tVar2.b(arrayList9);
                            return;
                        case 11:
                            C0103g c0103g2 = new C0103g(new ArrayList(), tVar2, 0);
                            C0054d c0054d8 = this.f1861b.f1848a;
                            if (c0054d8 == null) {
                                tVar2.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d8.h(new D3.g(10, c0103g2));
                                return;
                            } catch (RuntimeException e13) {
                                c0103g2.f1870c.b(e5.g.C(new C0099c("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 12:
                            M m14 = this.f1861b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, m14.c((p) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = e5.g.C(th4);
                            }
                            tVar2.b(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0104h c0104h2 = new C0104h(arrayList11, tVar2, 0);
                            C0054d c0054d9 = this.f1861b.f1848a;
                            if (c0054d9 == null) {
                                tVar2.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0051a c0051a2 = new C0051a(0);
                                c0051a2.f813b = str2;
                                c0054d9.e(c0051a2, new D3.g(7, c0104h2));
                                return;
                            } catch (RuntimeException e14) {
                                c0104h2.f1873c.b(e5.g.C(new C0099c("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                    }
                }
            });
        } else {
            tVar.h(null);
        }
        f2.t tVar2 = new f2.t(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.startConnection", c0106j, null);
        if (m6 != null) {
            final int i3 = 9;
            tVar2.h(new H2.b(m6) { // from class: M2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ M f1861b;

                {
                    this.f1861b = m6;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    C0054d c0054d;
                    switch (i3) {
                        case 0:
                            M m7 = this.f1861b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c0054d = m7.f1848a;
                            } catch (Throwable th) {
                                arrayList = e5.g.C(th);
                            }
                            if (c0054d == null) {
                                throw M.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c0054d.b()));
                            tVar22.b(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0105i c0105i = new C0105i(arrayList2, tVar22, 0);
                            C0054d c0054d2 = this.f1861b.f1848a;
                            if (c0054d2 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                D3.g gVar = new D3.g(6, c0105i);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0061k c0061k = new C0061k();
                                c0061k.f864a = str;
                                c0054d2.f(gVar, c0061k);
                                return;
                            } catch (RuntimeException e3) {
                                c0105i.f1876c.b(e5.g.C(new C0099c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj).get(0);
                            C0101e c0101e = new C0101e(arrayList3, tVar22, 1);
                            M m8 = this.f1861b;
                            if (m8.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0051a c0051a = new C0051a(1);
                                c0051a.f813b = AbstractC1341c.J(zVar);
                                m8.f1848a.d(c0051a.c(), new D3.g(3, c0101e));
                                return;
                            } catch (RuntimeException e6) {
                                c0101e.f1864c.b(e5.g.C(new C0099c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            z zVar2 = (z) ((ArrayList) obj).get(0);
                            C0102f c0102f = new C0102f(arrayList4, tVar22, 1);
                            C0054d c0054d3 = this.f1861b.f1848a;
                            if (c0054d3 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                String J4 = AbstractC1341c.J(zVar2);
                                D3.g gVar2 = new D3.g(5, c0102f);
                                if (!c0054d3.b()) {
                                    C0060j c0060j = O.f781k;
                                    c0054d3.H(2, 11, c0060j);
                                    gVar2.onPurchaseHistoryResponse(c0060j, null);
                                } else if (C0054d.m(new G0.w(c0054d3, J4, gVar2, 3), 30000L, new A0.a(c0054d3, gVar2, 11, false), c0054d3.D(), c0054d3.q()) == null) {
                                    C0060j n6 = c0054d3.n();
                                    c0054d3.H(25, 11, n6);
                                    gVar2.onPurchaseHistoryResponse(n6, null);
                                }
                                return;
                            } catch (RuntimeException e7) {
                                c0102f.f1867c.b(e5.g.C(new C0099c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0103g c0103g = new C0103g(arrayList5, tVar22, 1);
                            M m9 = this.f1861b;
                            if (m9.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0482c c0482c = new C0482c(5);
                                c0482c.g(AbstractC1341c.I(list));
                                m9.f1848a.c(c0482c.d(), new C0097a(m9, 4, c0103g));
                                return;
                            } catch (RuntimeException e8) {
                                c0103g.f1870c.b(e5.g.C(new C0099c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 5:
                            M m10 = this.f1861b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, m10.b((n) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = e5.g.C(th2);
                            }
                            tVar22.b(arrayList6);
                            return;
                        case 6:
                            C0104h c0104h = new C0104h(new ArrayList(), tVar22, 1);
                            C0054d c0054d4 = this.f1861b.f1848a;
                            if (c0054d4 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d4.i(new D3.g(8, c0104h));
                                return;
                            } catch (RuntimeException e9) {
                                c0104h.f1873c.b(e5.g.C(new C0099c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 7:
                            C0105i c0105i2 = new C0105i(new ArrayList(), tVar22, 1);
                            M m11 = this.f1861b;
                            C0054d c0054d5 = m11.f1848a;
                            if (c0054d5 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            AbstractActivityC1515c abstractActivityC1515c = m11.f1850c;
                            if (abstractActivityC1515c == null) {
                                tVar22.b(e5.g.C(new C0099c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c0054d5.k(abstractActivityC1515c, new D3.g(9, c0105i2));
                                return;
                            } catch (RuntimeException e10) {
                                c0105i2.f1876c.b(e5.g.C(new C0099c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 8:
                            C0101e c0101e2 = new C0101e(new ArrayList(), tVar22, 0);
                            C0054d c0054d6 = this.f1861b.f1848a;
                            if (c0054d6 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d6.g(new D3.g(4, c0101e2));
                                return;
                            } catch (RuntimeException e11) {
                                c0101e2.f1864c.b(e5.g.C(new C0099c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 9:
                            M m12 = this.f1861b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l2 = (Long) arrayList8.get(0);
                            EnumC0109m enumC0109m = (EnumC0109m) arrayList8.get(1);
                            v vVar = (v) arrayList8.get(2);
                            C0102f c0102f2 = new C0102f(arrayList7, tVar22, 0);
                            if (m12.f1848a == null) {
                                W1.e eVar = m12.f1849b;
                                Context context = m12.f1851d;
                                B1.g gVar3 = m12.f1852e;
                                eVar.getClass();
                                C0052b c0052b = new C0052b(context);
                                if (vVar != null && vVar.f1918a.booleanValue()) {
                                    z = true;
                                }
                                c0052b.f814a = new C0062l(z);
                                int ordinal = enumC0109m.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c0052b.f818e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0109m + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c0052b.f817d = new C0097a(eVar, 0, gVar3);
                                    }
                                }
                                c0052b.f816c = new C0482c(24, gVar3);
                                m12.f1848a = c0052b.a();
                            }
                            try {
                                m12.f1848a.l(new L(m12, c0102f2, l2));
                                return;
                            } catch (RuntimeException e12) {
                                c0102f2.f1867c.b(e5.g.C(new C0099c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 10:
                            M m13 = this.f1861b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C0054d c0054d7 = m13.f1848a;
                                if (c0054d7 != null) {
                                    c0054d7.a();
                                    m13.f1848a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = e5.g.C(th3);
                            }
                            tVar22.b(arrayList9);
                            return;
                        case 11:
                            C0103g c0103g2 = new C0103g(new ArrayList(), tVar22, 0);
                            C0054d c0054d8 = this.f1861b.f1848a;
                            if (c0054d8 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d8.h(new D3.g(10, c0103g2));
                                return;
                            } catch (RuntimeException e13) {
                                c0103g2.f1870c.b(e5.g.C(new C0099c("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 12:
                            M m14 = this.f1861b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, m14.c((p) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = e5.g.C(th4);
                            }
                            tVar22.b(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0104h c0104h2 = new C0104h(arrayList11, tVar22, 0);
                            C0054d c0054d9 = this.f1861b.f1848a;
                            if (c0054d9 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0051a c0051a2 = new C0051a(0);
                                c0051a2.f813b = str2;
                                c0054d9.e(c0051a2, new D3.g(7, c0104h2));
                                return;
                            } catch (RuntimeException e14) {
                                c0104h2.f1873c.b(e5.g.C(new C0099c("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                    }
                }
            });
        } else {
            tVar2.h(null);
        }
        f2.t tVar3 = new f2.t(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.endConnection", c0106j, null);
        if (m6 != null) {
            final int i6 = 10;
            tVar3.h(new H2.b(m6) { // from class: M2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ M f1861b;

                {
                    this.f1861b = m6;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    C0054d c0054d;
                    switch (i6) {
                        case 0:
                            M m7 = this.f1861b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c0054d = m7.f1848a;
                            } catch (Throwable th) {
                                arrayList = e5.g.C(th);
                            }
                            if (c0054d == null) {
                                throw M.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c0054d.b()));
                            tVar22.b(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0105i c0105i = new C0105i(arrayList2, tVar22, 0);
                            C0054d c0054d2 = this.f1861b.f1848a;
                            if (c0054d2 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                D3.g gVar = new D3.g(6, c0105i);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0061k c0061k = new C0061k();
                                c0061k.f864a = str;
                                c0054d2.f(gVar, c0061k);
                                return;
                            } catch (RuntimeException e3) {
                                c0105i.f1876c.b(e5.g.C(new C0099c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj).get(0);
                            C0101e c0101e = new C0101e(arrayList3, tVar22, 1);
                            M m8 = this.f1861b;
                            if (m8.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0051a c0051a = new C0051a(1);
                                c0051a.f813b = AbstractC1341c.J(zVar);
                                m8.f1848a.d(c0051a.c(), new D3.g(3, c0101e));
                                return;
                            } catch (RuntimeException e6) {
                                c0101e.f1864c.b(e5.g.C(new C0099c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            z zVar2 = (z) ((ArrayList) obj).get(0);
                            C0102f c0102f = new C0102f(arrayList4, tVar22, 1);
                            C0054d c0054d3 = this.f1861b.f1848a;
                            if (c0054d3 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                String J4 = AbstractC1341c.J(zVar2);
                                D3.g gVar2 = new D3.g(5, c0102f);
                                if (!c0054d3.b()) {
                                    C0060j c0060j = O.f781k;
                                    c0054d3.H(2, 11, c0060j);
                                    gVar2.onPurchaseHistoryResponse(c0060j, null);
                                } else if (C0054d.m(new G0.w(c0054d3, J4, gVar2, 3), 30000L, new A0.a(c0054d3, gVar2, 11, false), c0054d3.D(), c0054d3.q()) == null) {
                                    C0060j n6 = c0054d3.n();
                                    c0054d3.H(25, 11, n6);
                                    gVar2.onPurchaseHistoryResponse(n6, null);
                                }
                                return;
                            } catch (RuntimeException e7) {
                                c0102f.f1867c.b(e5.g.C(new C0099c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0103g c0103g = new C0103g(arrayList5, tVar22, 1);
                            M m9 = this.f1861b;
                            if (m9.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0482c c0482c = new C0482c(5);
                                c0482c.g(AbstractC1341c.I(list));
                                m9.f1848a.c(c0482c.d(), new C0097a(m9, 4, c0103g));
                                return;
                            } catch (RuntimeException e8) {
                                c0103g.f1870c.b(e5.g.C(new C0099c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 5:
                            M m10 = this.f1861b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, m10.b((n) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = e5.g.C(th2);
                            }
                            tVar22.b(arrayList6);
                            return;
                        case 6:
                            C0104h c0104h = new C0104h(new ArrayList(), tVar22, 1);
                            C0054d c0054d4 = this.f1861b.f1848a;
                            if (c0054d4 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d4.i(new D3.g(8, c0104h));
                                return;
                            } catch (RuntimeException e9) {
                                c0104h.f1873c.b(e5.g.C(new C0099c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 7:
                            C0105i c0105i2 = new C0105i(new ArrayList(), tVar22, 1);
                            M m11 = this.f1861b;
                            C0054d c0054d5 = m11.f1848a;
                            if (c0054d5 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            AbstractActivityC1515c abstractActivityC1515c = m11.f1850c;
                            if (abstractActivityC1515c == null) {
                                tVar22.b(e5.g.C(new C0099c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c0054d5.k(abstractActivityC1515c, new D3.g(9, c0105i2));
                                return;
                            } catch (RuntimeException e10) {
                                c0105i2.f1876c.b(e5.g.C(new C0099c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 8:
                            C0101e c0101e2 = new C0101e(new ArrayList(), tVar22, 0);
                            C0054d c0054d6 = this.f1861b.f1848a;
                            if (c0054d6 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d6.g(new D3.g(4, c0101e2));
                                return;
                            } catch (RuntimeException e11) {
                                c0101e2.f1864c.b(e5.g.C(new C0099c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 9:
                            M m12 = this.f1861b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l2 = (Long) arrayList8.get(0);
                            EnumC0109m enumC0109m = (EnumC0109m) arrayList8.get(1);
                            v vVar = (v) arrayList8.get(2);
                            C0102f c0102f2 = new C0102f(arrayList7, tVar22, 0);
                            if (m12.f1848a == null) {
                                W1.e eVar = m12.f1849b;
                                Context context = m12.f1851d;
                                B1.g gVar3 = m12.f1852e;
                                eVar.getClass();
                                C0052b c0052b = new C0052b(context);
                                if (vVar != null && vVar.f1918a.booleanValue()) {
                                    z = true;
                                }
                                c0052b.f814a = new C0062l(z);
                                int ordinal = enumC0109m.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c0052b.f818e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0109m + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c0052b.f817d = new C0097a(eVar, 0, gVar3);
                                    }
                                }
                                c0052b.f816c = new C0482c(24, gVar3);
                                m12.f1848a = c0052b.a();
                            }
                            try {
                                m12.f1848a.l(new L(m12, c0102f2, l2));
                                return;
                            } catch (RuntimeException e12) {
                                c0102f2.f1867c.b(e5.g.C(new C0099c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 10:
                            M m13 = this.f1861b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C0054d c0054d7 = m13.f1848a;
                                if (c0054d7 != null) {
                                    c0054d7.a();
                                    m13.f1848a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = e5.g.C(th3);
                            }
                            tVar22.b(arrayList9);
                            return;
                        case 11:
                            C0103g c0103g2 = new C0103g(new ArrayList(), tVar22, 0);
                            C0054d c0054d8 = this.f1861b.f1848a;
                            if (c0054d8 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d8.h(new D3.g(10, c0103g2));
                                return;
                            } catch (RuntimeException e13) {
                                c0103g2.f1870c.b(e5.g.C(new C0099c("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 12:
                            M m14 = this.f1861b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, m14.c((p) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = e5.g.C(th4);
                            }
                            tVar22.b(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0104h c0104h2 = new C0104h(arrayList11, tVar22, 0);
                            C0054d c0054d9 = this.f1861b.f1848a;
                            if (c0054d9 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0051a c0051a2 = new C0051a(0);
                                c0051a2.f813b = str2;
                                c0054d9.e(c0051a2, new D3.g(7, c0104h2));
                                return;
                            } catch (RuntimeException e14) {
                                c0104h2.f1873c.b(e5.g.C(new C0099c("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                    }
                }
            });
        } else {
            tVar3.h(null);
        }
        f2.t tVar4 = new f2.t(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.getBillingConfigAsync", c0106j, null);
        if (m6 != null) {
            final int i7 = 11;
            tVar4.h(new H2.b(m6) { // from class: M2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ M f1861b;

                {
                    this.f1861b = m6;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    C0054d c0054d;
                    switch (i7) {
                        case 0:
                            M m7 = this.f1861b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c0054d = m7.f1848a;
                            } catch (Throwable th) {
                                arrayList = e5.g.C(th);
                            }
                            if (c0054d == null) {
                                throw M.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c0054d.b()));
                            tVar22.b(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0105i c0105i = new C0105i(arrayList2, tVar22, 0);
                            C0054d c0054d2 = this.f1861b.f1848a;
                            if (c0054d2 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                D3.g gVar = new D3.g(6, c0105i);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0061k c0061k = new C0061k();
                                c0061k.f864a = str;
                                c0054d2.f(gVar, c0061k);
                                return;
                            } catch (RuntimeException e3) {
                                c0105i.f1876c.b(e5.g.C(new C0099c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj).get(0);
                            C0101e c0101e = new C0101e(arrayList3, tVar22, 1);
                            M m8 = this.f1861b;
                            if (m8.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0051a c0051a = new C0051a(1);
                                c0051a.f813b = AbstractC1341c.J(zVar);
                                m8.f1848a.d(c0051a.c(), new D3.g(3, c0101e));
                                return;
                            } catch (RuntimeException e6) {
                                c0101e.f1864c.b(e5.g.C(new C0099c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            z zVar2 = (z) ((ArrayList) obj).get(0);
                            C0102f c0102f = new C0102f(arrayList4, tVar22, 1);
                            C0054d c0054d3 = this.f1861b.f1848a;
                            if (c0054d3 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                String J4 = AbstractC1341c.J(zVar2);
                                D3.g gVar2 = new D3.g(5, c0102f);
                                if (!c0054d3.b()) {
                                    C0060j c0060j = O.f781k;
                                    c0054d3.H(2, 11, c0060j);
                                    gVar2.onPurchaseHistoryResponse(c0060j, null);
                                } else if (C0054d.m(new G0.w(c0054d3, J4, gVar2, 3), 30000L, new A0.a(c0054d3, gVar2, 11, false), c0054d3.D(), c0054d3.q()) == null) {
                                    C0060j n6 = c0054d3.n();
                                    c0054d3.H(25, 11, n6);
                                    gVar2.onPurchaseHistoryResponse(n6, null);
                                }
                                return;
                            } catch (RuntimeException e7) {
                                c0102f.f1867c.b(e5.g.C(new C0099c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0103g c0103g = new C0103g(arrayList5, tVar22, 1);
                            M m9 = this.f1861b;
                            if (m9.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0482c c0482c = new C0482c(5);
                                c0482c.g(AbstractC1341c.I(list));
                                m9.f1848a.c(c0482c.d(), new C0097a(m9, 4, c0103g));
                                return;
                            } catch (RuntimeException e8) {
                                c0103g.f1870c.b(e5.g.C(new C0099c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 5:
                            M m10 = this.f1861b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, m10.b((n) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = e5.g.C(th2);
                            }
                            tVar22.b(arrayList6);
                            return;
                        case 6:
                            C0104h c0104h = new C0104h(new ArrayList(), tVar22, 1);
                            C0054d c0054d4 = this.f1861b.f1848a;
                            if (c0054d4 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d4.i(new D3.g(8, c0104h));
                                return;
                            } catch (RuntimeException e9) {
                                c0104h.f1873c.b(e5.g.C(new C0099c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 7:
                            C0105i c0105i2 = new C0105i(new ArrayList(), tVar22, 1);
                            M m11 = this.f1861b;
                            C0054d c0054d5 = m11.f1848a;
                            if (c0054d5 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            AbstractActivityC1515c abstractActivityC1515c = m11.f1850c;
                            if (abstractActivityC1515c == null) {
                                tVar22.b(e5.g.C(new C0099c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c0054d5.k(abstractActivityC1515c, new D3.g(9, c0105i2));
                                return;
                            } catch (RuntimeException e10) {
                                c0105i2.f1876c.b(e5.g.C(new C0099c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 8:
                            C0101e c0101e2 = new C0101e(new ArrayList(), tVar22, 0);
                            C0054d c0054d6 = this.f1861b.f1848a;
                            if (c0054d6 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d6.g(new D3.g(4, c0101e2));
                                return;
                            } catch (RuntimeException e11) {
                                c0101e2.f1864c.b(e5.g.C(new C0099c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 9:
                            M m12 = this.f1861b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l2 = (Long) arrayList8.get(0);
                            EnumC0109m enumC0109m = (EnumC0109m) arrayList8.get(1);
                            v vVar = (v) arrayList8.get(2);
                            C0102f c0102f2 = new C0102f(arrayList7, tVar22, 0);
                            if (m12.f1848a == null) {
                                W1.e eVar = m12.f1849b;
                                Context context = m12.f1851d;
                                B1.g gVar3 = m12.f1852e;
                                eVar.getClass();
                                C0052b c0052b = new C0052b(context);
                                if (vVar != null && vVar.f1918a.booleanValue()) {
                                    z = true;
                                }
                                c0052b.f814a = new C0062l(z);
                                int ordinal = enumC0109m.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c0052b.f818e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0109m + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c0052b.f817d = new C0097a(eVar, 0, gVar3);
                                    }
                                }
                                c0052b.f816c = new C0482c(24, gVar3);
                                m12.f1848a = c0052b.a();
                            }
                            try {
                                m12.f1848a.l(new L(m12, c0102f2, l2));
                                return;
                            } catch (RuntimeException e12) {
                                c0102f2.f1867c.b(e5.g.C(new C0099c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 10:
                            M m13 = this.f1861b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C0054d c0054d7 = m13.f1848a;
                                if (c0054d7 != null) {
                                    c0054d7.a();
                                    m13.f1848a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = e5.g.C(th3);
                            }
                            tVar22.b(arrayList9);
                            return;
                        case 11:
                            C0103g c0103g2 = new C0103g(new ArrayList(), tVar22, 0);
                            C0054d c0054d8 = this.f1861b.f1848a;
                            if (c0054d8 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d8.h(new D3.g(10, c0103g2));
                                return;
                            } catch (RuntimeException e13) {
                                c0103g2.f1870c.b(e5.g.C(new C0099c("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 12:
                            M m14 = this.f1861b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, m14.c((p) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = e5.g.C(th4);
                            }
                            tVar22.b(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0104h c0104h2 = new C0104h(arrayList11, tVar22, 0);
                            C0054d c0054d9 = this.f1861b.f1848a;
                            if (c0054d9 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0051a c0051a2 = new C0051a(0);
                                c0051a2.f813b = str2;
                                c0054d9.e(c0051a2, new D3.g(7, c0104h2));
                                return;
                            } catch (RuntimeException e14) {
                                c0104h2.f1873c.b(e5.g.C(new C0099c("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                    }
                }
            });
        } else {
            tVar4.h(null);
        }
        f2.t tVar5 = new f2.t(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.launchBillingFlow", c0106j, null);
        if (m6 != null) {
            final int i8 = 12;
            tVar5.h(new H2.b(m6) { // from class: M2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ M f1861b;

                {
                    this.f1861b = m6;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    C0054d c0054d;
                    switch (i8) {
                        case 0:
                            M m7 = this.f1861b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c0054d = m7.f1848a;
                            } catch (Throwable th) {
                                arrayList = e5.g.C(th);
                            }
                            if (c0054d == null) {
                                throw M.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c0054d.b()));
                            tVar22.b(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0105i c0105i = new C0105i(arrayList2, tVar22, 0);
                            C0054d c0054d2 = this.f1861b.f1848a;
                            if (c0054d2 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                D3.g gVar = new D3.g(6, c0105i);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0061k c0061k = new C0061k();
                                c0061k.f864a = str;
                                c0054d2.f(gVar, c0061k);
                                return;
                            } catch (RuntimeException e3) {
                                c0105i.f1876c.b(e5.g.C(new C0099c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj).get(0);
                            C0101e c0101e = new C0101e(arrayList3, tVar22, 1);
                            M m8 = this.f1861b;
                            if (m8.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0051a c0051a = new C0051a(1);
                                c0051a.f813b = AbstractC1341c.J(zVar);
                                m8.f1848a.d(c0051a.c(), new D3.g(3, c0101e));
                                return;
                            } catch (RuntimeException e6) {
                                c0101e.f1864c.b(e5.g.C(new C0099c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            z zVar2 = (z) ((ArrayList) obj).get(0);
                            C0102f c0102f = new C0102f(arrayList4, tVar22, 1);
                            C0054d c0054d3 = this.f1861b.f1848a;
                            if (c0054d3 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                String J4 = AbstractC1341c.J(zVar2);
                                D3.g gVar2 = new D3.g(5, c0102f);
                                if (!c0054d3.b()) {
                                    C0060j c0060j = O.f781k;
                                    c0054d3.H(2, 11, c0060j);
                                    gVar2.onPurchaseHistoryResponse(c0060j, null);
                                } else if (C0054d.m(new G0.w(c0054d3, J4, gVar2, 3), 30000L, new A0.a(c0054d3, gVar2, 11, false), c0054d3.D(), c0054d3.q()) == null) {
                                    C0060j n6 = c0054d3.n();
                                    c0054d3.H(25, 11, n6);
                                    gVar2.onPurchaseHistoryResponse(n6, null);
                                }
                                return;
                            } catch (RuntimeException e7) {
                                c0102f.f1867c.b(e5.g.C(new C0099c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0103g c0103g = new C0103g(arrayList5, tVar22, 1);
                            M m9 = this.f1861b;
                            if (m9.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0482c c0482c = new C0482c(5);
                                c0482c.g(AbstractC1341c.I(list));
                                m9.f1848a.c(c0482c.d(), new C0097a(m9, 4, c0103g));
                                return;
                            } catch (RuntimeException e8) {
                                c0103g.f1870c.b(e5.g.C(new C0099c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 5:
                            M m10 = this.f1861b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, m10.b((n) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = e5.g.C(th2);
                            }
                            tVar22.b(arrayList6);
                            return;
                        case 6:
                            C0104h c0104h = new C0104h(new ArrayList(), tVar22, 1);
                            C0054d c0054d4 = this.f1861b.f1848a;
                            if (c0054d4 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d4.i(new D3.g(8, c0104h));
                                return;
                            } catch (RuntimeException e9) {
                                c0104h.f1873c.b(e5.g.C(new C0099c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 7:
                            C0105i c0105i2 = new C0105i(new ArrayList(), tVar22, 1);
                            M m11 = this.f1861b;
                            C0054d c0054d5 = m11.f1848a;
                            if (c0054d5 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            AbstractActivityC1515c abstractActivityC1515c = m11.f1850c;
                            if (abstractActivityC1515c == null) {
                                tVar22.b(e5.g.C(new C0099c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c0054d5.k(abstractActivityC1515c, new D3.g(9, c0105i2));
                                return;
                            } catch (RuntimeException e10) {
                                c0105i2.f1876c.b(e5.g.C(new C0099c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 8:
                            C0101e c0101e2 = new C0101e(new ArrayList(), tVar22, 0);
                            C0054d c0054d6 = this.f1861b.f1848a;
                            if (c0054d6 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d6.g(new D3.g(4, c0101e2));
                                return;
                            } catch (RuntimeException e11) {
                                c0101e2.f1864c.b(e5.g.C(new C0099c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 9:
                            M m12 = this.f1861b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l2 = (Long) arrayList8.get(0);
                            EnumC0109m enumC0109m = (EnumC0109m) arrayList8.get(1);
                            v vVar = (v) arrayList8.get(2);
                            C0102f c0102f2 = new C0102f(arrayList7, tVar22, 0);
                            if (m12.f1848a == null) {
                                W1.e eVar = m12.f1849b;
                                Context context = m12.f1851d;
                                B1.g gVar3 = m12.f1852e;
                                eVar.getClass();
                                C0052b c0052b = new C0052b(context);
                                if (vVar != null && vVar.f1918a.booleanValue()) {
                                    z = true;
                                }
                                c0052b.f814a = new C0062l(z);
                                int ordinal = enumC0109m.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c0052b.f818e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0109m + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c0052b.f817d = new C0097a(eVar, 0, gVar3);
                                    }
                                }
                                c0052b.f816c = new C0482c(24, gVar3);
                                m12.f1848a = c0052b.a();
                            }
                            try {
                                m12.f1848a.l(new L(m12, c0102f2, l2));
                                return;
                            } catch (RuntimeException e12) {
                                c0102f2.f1867c.b(e5.g.C(new C0099c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 10:
                            M m13 = this.f1861b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C0054d c0054d7 = m13.f1848a;
                                if (c0054d7 != null) {
                                    c0054d7.a();
                                    m13.f1848a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = e5.g.C(th3);
                            }
                            tVar22.b(arrayList9);
                            return;
                        case 11:
                            C0103g c0103g2 = new C0103g(new ArrayList(), tVar22, 0);
                            C0054d c0054d8 = this.f1861b.f1848a;
                            if (c0054d8 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d8.h(new D3.g(10, c0103g2));
                                return;
                            } catch (RuntimeException e13) {
                                c0103g2.f1870c.b(e5.g.C(new C0099c("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 12:
                            M m14 = this.f1861b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, m14.c((p) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = e5.g.C(th4);
                            }
                            tVar22.b(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0104h c0104h2 = new C0104h(arrayList11, tVar22, 0);
                            C0054d c0054d9 = this.f1861b.f1848a;
                            if (c0054d9 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0051a c0051a2 = new C0051a(0);
                                c0051a2.f813b = str2;
                                c0054d9.e(c0051a2, new D3.g(7, c0104h2));
                                return;
                            } catch (RuntimeException e14) {
                                c0104h2.f1873c.b(e5.g.C(new C0099c("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                    }
                }
            });
        } else {
            tVar5.h(null);
        }
        f2.t tVar6 = new f2.t(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.acknowledgePurchase", c0106j, null);
        if (m6 != null) {
            final int i9 = 13;
            tVar6.h(new H2.b(m6) { // from class: M2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ M f1861b;

                {
                    this.f1861b = m6;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    C0054d c0054d;
                    switch (i9) {
                        case 0:
                            M m7 = this.f1861b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c0054d = m7.f1848a;
                            } catch (Throwable th) {
                                arrayList = e5.g.C(th);
                            }
                            if (c0054d == null) {
                                throw M.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c0054d.b()));
                            tVar22.b(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0105i c0105i = new C0105i(arrayList2, tVar22, 0);
                            C0054d c0054d2 = this.f1861b.f1848a;
                            if (c0054d2 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                D3.g gVar = new D3.g(6, c0105i);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0061k c0061k = new C0061k();
                                c0061k.f864a = str;
                                c0054d2.f(gVar, c0061k);
                                return;
                            } catch (RuntimeException e3) {
                                c0105i.f1876c.b(e5.g.C(new C0099c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj).get(0);
                            C0101e c0101e = new C0101e(arrayList3, tVar22, 1);
                            M m8 = this.f1861b;
                            if (m8.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0051a c0051a = new C0051a(1);
                                c0051a.f813b = AbstractC1341c.J(zVar);
                                m8.f1848a.d(c0051a.c(), new D3.g(3, c0101e));
                                return;
                            } catch (RuntimeException e6) {
                                c0101e.f1864c.b(e5.g.C(new C0099c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            z zVar2 = (z) ((ArrayList) obj).get(0);
                            C0102f c0102f = new C0102f(arrayList4, tVar22, 1);
                            C0054d c0054d3 = this.f1861b.f1848a;
                            if (c0054d3 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                String J4 = AbstractC1341c.J(zVar2);
                                D3.g gVar2 = new D3.g(5, c0102f);
                                if (!c0054d3.b()) {
                                    C0060j c0060j = O.f781k;
                                    c0054d3.H(2, 11, c0060j);
                                    gVar2.onPurchaseHistoryResponse(c0060j, null);
                                } else if (C0054d.m(new G0.w(c0054d3, J4, gVar2, 3), 30000L, new A0.a(c0054d3, gVar2, 11, false), c0054d3.D(), c0054d3.q()) == null) {
                                    C0060j n6 = c0054d3.n();
                                    c0054d3.H(25, 11, n6);
                                    gVar2.onPurchaseHistoryResponse(n6, null);
                                }
                                return;
                            } catch (RuntimeException e7) {
                                c0102f.f1867c.b(e5.g.C(new C0099c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0103g c0103g = new C0103g(arrayList5, tVar22, 1);
                            M m9 = this.f1861b;
                            if (m9.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0482c c0482c = new C0482c(5);
                                c0482c.g(AbstractC1341c.I(list));
                                m9.f1848a.c(c0482c.d(), new C0097a(m9, 4, c0103g));
                                return;
                            } catch (RuntimeException e8) {
                                c0103g.f1870c.b(e5.g.C(new C0099c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 5:
                            M m10 = this.f1861b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, m10.b((n) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = e5.g.C(th2);
                            }
                            tVar22.b(arrayList6);
                            return;
                        case 6:
                            C0104h c0104h = new C0104h(new ArrayList(), tVar22, 1);
                            C0054d c0054d4 = this.f1861b.f1848a;
                            if (c0054d4 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d4.i(new D3.g(8, c0104h));
                                return;
                            } catch (RuntimeException e9) {
                                c0104h.f1873c.b(e5.g.C(new C0099c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 7:
                            C0105i c0105i2 = new C0105i(new ArrayList(), tVar22, 1);
                            M m11 = this.f1861b;
                            C0054d c0054d5 = m11.f1848a;
                            if (c0054d5 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            AbstractActivityC1515c abstractActivityC1515c = m11.f1850c;
                            if (abstractActivityC1515c == null) {
                                tVar22.b(e5.g.C(new C0099c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c0054d5.k(abstractActivityC1515c, new D3.g(9, c0105i2));
                                return;
                            } catch (RuntimeException e10) {
                                c0105i2.f1876c.b(e5.g.C(new C0099c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 8:
                            C0101e c0101e2 = new C0101e(new ArrayList(), tVar22, 0);
                            C0054d c0054d6 = this.f1861b.f1848a;
                            if (c0054d6 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d6.g(new D3.g(4, c0101e2));
                                return;
                            } catch (RuntimeException e11) {
                                c0101e2.f1864c.b(e5.g.C(new C0099c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 9:
                            M m12 = this.f1861b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l2 = (Long) arrayList8.get(0);
                            EnumC0109m enumC0109m = (EnumC0109m) arrayList8.get(1);
                            v vVar = (v) arrayList8.get(2);
                            C0102f c0102f2 = new C0102f(arrayList7, tVar22, 0);
                            if (m12.f1848a == null) {
                                W1.e eVar = m12.f1849b;
                                Context context = m12.f1851d;
                                B1.g gVar3 = m12.f1852e;
                                eVar.getClass();
                                C0052b c0052b = new C0052b(context);
                                if (vVar != null && vVar.f1918a.booleanValue()) {
                                    z = true;
                                }
                                c0052b.f814a = new C0062l(z);
                                int ordinal = enumC0109m.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c0052b.f818e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0109m + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c0052b.f817d = new C0097a(eVar, 0, gVar3);
                                    }
                                }
                                c0052b.f816c = new C0482c(24, gVar3);
                                m12.f1848a = c0052b.a();
                            }
                            try {
                                m12.f1848a.l(new L(m12, c0102f2, l2));
                                return;
                            } catch (RuntimeException e12) {
                                c0102f2.f1867c.b(e5.g.C(new C0099c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 10:
                            M m13 = this.f1861b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C0054d c0054d7 = m13.f1848a;
                                if (c0054d7 != null) {
                                    c0054d7.a();
                                    m13.f1848a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = e5.g.C(th3);
                            }
                            tVar22.b(arrayList9);
                            return;
                        case 11:
                            C0103g c0103g2 = new C0103g(new ArrayList(), tVar22, 0);
                            C0054d c0054d8 = this.f1861b.f1848a;
                            if (c0054d8 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d8.h(new D3.g(10, c0103g2));
                                return;
                            } catch (RuntimeException e13) {
                                c0103g2.f1870c.b(e5.g.C(new C0099c("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 12:
                            M m14 = this.f1861b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, m14.c((p) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = e5.g.C(th4);
                            }
                            tVar22.b(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0104h c0104h2 = new C0104h(arrayList11, tVar22, 0);
                            C0054d c0054d9 = this.f1861b.f1848a;
                            if (c0054d9 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0051a c0051a2 = new C0051a(0);
                                c0051a2.f813b = str2;
                                c0054d9.e(c0051a2, new D3.g(7, c0104h2));
                                return;
                            } catch (RuntimeException e14) {
                                c0104h2.f1873c.b(e5.g.C(new C0099c("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                    }
                }
            });
        } else {
            tVar6.h(null);
        }
        f2.t tVar7 = new f2.t(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.consumeAsync", c0106j, null);
        if (m6 != null) {
            final int i10 = 1;
            tVar7.h(new H2.b(m6) { // from class: M2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ M f1861b;

                {
                    this.f1861b = m6;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    C0054d c0054d;
                    switch (i10) {
                        case 0:
                            M m7 = this.f1861b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c0054d = m7.f1848a;
                            } catch (Throwable th) {
                                arrayList = e5.g.C(th);
                            }
                            if (c0054d == null) {
                                throw M.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c0054d.b()));
                            tVar22.b(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0105i c0105i = new C0105i(arrayList2, tVar22, 0);
                            C0054d c0054d2 = this.f1861b.f1848a;
                            if (c0054d2 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                D3.g gVar = new D3.g(6, c0105i);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0061k c0061k = new C0061k();
                                c0061k.f864a = str;
                                c0054d2.f(gVar, c0061k);
                                return;
                            } catch (RuntimeException e3) {
                                c0105i.f1876c.b(e5.g.C(new C0099c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj).get(0);
                            C0101e c0101e = new C0101e(arrayList3, tVar22, 1);
                            M m8 = this.f1861b;
                            if (m8.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0051a c0051a = new C0051a(1);
                                c0051a.f813b = AbstractC1341c.J(zVar);
                                m8.f1848a.d(c0051a.c(), new D3.g(3, c0101e));
                                return;
                            } catch (RuntimeException e6) {
                                c0101e.f1864c.b(e5.g.C(new C0099c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            z zVar2 = (z) ((ArrayList) obj).get(0);
                            C0102f c0102f = new C0102f(arrayList4, tVar22, 1);
                            C0054d c0054d3 = this.f1861b.f1848a;
                            if (c0054d3 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                String J4 = AbstractC1341c.J(zVar2);
                                D3.g gVar2 = new D3.g(5, c0102f);
                                if (!c0054d3.b()) {
                                    C0060j c0060j = O.f781k;
                                    c0054d3.H(2, 11, c0060j);
                                    gVar2.onPurchaseHistoryResponse(c0060j, null);
                                } else if (C0054d.m(new G0.w(c0054d3, J4, gVar2, 3), 30000L, new A0.a(c0054d3, gVar2, 11, false), c0054d3.D(), c0054d3.q()) == null) {
                                    C0060j n6 = c0054d3.n();
                                    c0054d3.H(25, 11, n6);
                                    gVar2.onPurchaseHistoryResponse(n6, null);
                                }
                                return;
                            } catch (RuntimeException e7) {
                                c0102f.f1867c.b(e5.g.C(new C0099c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0103g c0103g = new C0103g(arrayList5, tVar22, 1);
                            M m9 = this.f1861b;
                            if (m9.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0482c c0482c = new C0482c(5);
                                c0482c.g(AbstractC1341c.I(list));
                                m9.f1848a.c(c0482c.d(), new C0097a(m9, 4, c0103g));
                                return;
                            } catch (RuntimeException e8) {
                                c0103g.f1870c.b(e5.g.C(new C0099c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 5:
                            M m10 = this.f1861b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, m10.b((n) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = e5.g.C(th2);
                            }
                            tVar22.b(arrayList6);
                            return;
                        case 6:
                            C0104h c0104h = new C0104h(new ArrayList(), tVar22, 1);
                            C0054d c0054d4 = this.f1861b.f1848a;
                            if (c0054d4 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d4.i(new D3.g(8, c0104h));
                                return;
                            } catch (RuntimeException e9) {
                                c0104h.f1873c.b(e5.g.C(new C0099c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 7:
                            C0105i c0105i2 = new C0105i(new ArrayList(), tVar22, 1);
                            M m11 = this.f1861b;
                            C0054d c0054d5 = m11.f1848a;
                            if (c0054d5 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            AbstractActivityC1515c abstractActivityC1515c = m11.f1850c;
                            if (abstractActivityC1515c == null) {
                                tVar22.b(e5.g.C(new C0099c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c0054d5.k(abstractActivityC1515c, new D3.g(9, c0105i2));
                                return;
                            } catch (RuntimeException e10) {
                                c0105i2.f1876c.b(e5.g.C(new C0099c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 8:
                            C0101e c0101e2 = new C0101e(new ArrayList(), tVar22, 0);
                            C0054d c0054d6 = this.f1861b.f1848a;
                            if (c0054d6 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d6.g(new D3.g(4, c0101e2));
                                return;
                            } catch (RuntimeException e11) {
                                c0101e2.f1864c.b(e5.g.C(new C0099c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 9:
                            M m12 = this.f1861b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l2 = (Long) arrayList8.get(0);
                            EnumC0109m enumC0109m = (EnumC0109m) arrayList8.get(1);
                            v vVar = (v) arrayList8.get(2);
                            C0102f c0102f2 = new C0102f(arrayList7, tVar22, 0);
                            if (m12.f1848a == null) {
                                W1.e eVar = m12.f1849b;
                                Context context = m12.f1851d;
                                B1.g gVar3 = m12.f1852e;
                                eVar.getClass();
                                C0052b c0052b = new C0052b(context);
                                if (vVar != null && vVar.f1918a.booleanValue()) {
                                    z = true;
                                }
                                c0052b.f814a = new C0062l(z);
                                int ordinal = enumC0109m.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c0052b.f818e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0109m + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c0052b.f817d = new C0097a(eVar, 0, gVar3);
                                    }
                                }
                                c0052b.f816c = new C0482c(24, gVar3);
                                m12.f1848a = c0052b.a();
                            }
                            try {
                                m12.f1848a.l(new L(m12, c0102f2, l2));
                                return;
                            } catch (RuntimeException e12) {
                                c0102f2.f1867c.b(e5.g.C(new C0099c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 10:
                            M m13 = this.f1861b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C0054d c0054d7 = m13.f1848a;
                                if (c0054d7 != null) {
                                    c0054d7.a();
                                    m13.f1848a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = e5.g.C(th3);
                            }
                            tVar22.b(arrayList9);
                            return;
                        case 11:
                            C0103g c0103g2 = new C0103g(new ArrayList(), tVar22, 0);
                            C0054d c0054d8 = this.f1861b.f1848a;
                            if (c0054d8 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d8.h(new D3.g(10, c0103g2));
                                return;
                            } catch (RuntimeException e13) {
                                c0103g2.f1870c.b(e5.g.C(new C0099c("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 12:
                            M m14 = this.f1861b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, m14.c((p) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = e5.g.C(th4);
                            }
                            tVar22.b(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0104h c0104h2 = new C0104h(arrayList11, tVar22, 0);
                            C0054d c0054d9 = this.f1861b.f1848a;
                            if (c0054d9 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0051a c0051a2 = new C0051a(0);
                                c0051a2.f813b = str2;
                                c0054d9.e(c0051a2, new D3.g(7, c0104h2));
                                return;
                            } catch (RuntimeException e14) {
                                c0104h2.f1873c.b(e5.g.C(new C0099c("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                    }
                }
            });
        } else {
            tVar7.h(null);
        }
        f2.t tVar8 = new f2.t(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryPurchasesAsync", c0106j, null);
        if (m6 != null) {
            final int i11 = 2;
            tVar8.h(new H2.b(m6) { // from class: M2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ M f1861b;

                {
                    this.f1861b = m6;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    C0054d c0054d;
                    switch (i11) {
                        case 0:
                            M m7 = this.f1861b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c0054d = m7.f1848a;
                            } catch (Throwable th) {
                                arrayList = e5.g.C(th);
                            }
                            if (c0054d == null) {
                                throw M.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c0054d.b()));
                            tVar22.b(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0105i c0105i = new C0105i(arrayList2, tVar22, 0);
                            C0054d c0054d2 = this.f1861b.f1848a;
                            if (c0054d2 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                D3.g gVar = new D3.g(6, c0105i);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0061k c0061k = new C0061k();
                                c0061k.f864a = str;
                                c0054d2.f(gVar, c0061k);
                                return;
                            } catch (RuntimeException e3) {
                                c0105i.f1876c.b(e5.g.C(new C0099c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj).get(0);
                            C0101e c0101e = new C0101e(arrayList3, tVar22, 1);
                            M m8 = this.f1861b;
                            if (m8.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0051a c0051a = new C0051a(1);
                                c0051a.f813b = AbstractC1341c.J(zVar);
                                m8.f1848a.d(c0051a.c(), new D3.g(3, c0101e));
                                return;
                            } catch (RuntimeException e6) {
                                c0101e.f1864c.b(e5.g.C(new C0099c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            z zVar2 = (z) ((ArrayList) obj).get(0);
                            C0102f c0102f = new C0102f(arrayList4, tVar22, 1);
                            C0054d c0054d3 = this.f1861b.f1848a;
                            if (c0054d3 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                String J4 = AbstractC1341c.J(zVar2);
                                D3.g gVar2 = new D3.g(5, c0102f);
                                if (!c0054d3.b()) {
                                    C0060j c0060j = O.f781k;
                                    c0054d3.H(2, 11, c0060j);
                                    gVar2.onPurchaseHistoryResponse(c0060j, null);
                                } else if (C0054d.m(new G0.w(c0054d3, J4, gVar2, 3), 30000L, new A0.a(c0054d3, gVar2, 11, false), c0054d3.D(), c0054d3.q()) == null) {
                                    C0060j n6 = c0054d3.n();
                                    c0054d3.H(25, 11, n6);
                                    gVar2.onPurchaseHistoryResponse(n6, null);
                                }
                                return;
                            } catch (RuntimeException e7) {
                                c0102f.f1867c.b(e5.g.C(new C0099c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0103g c0103g = new C0103g(arrayList5, tVar22, 1);
                            M m9 = this.f1861b;
                            if (m9.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0482c c0482c = new C0482c(5);
                                c0482c.g(AbstractC1341c.I(list));
                                m9.f1848a.c(c0482c.d(), new C0097a(m9, 4, c0103g));
                                return;
                            } catch (RuntimeException e8) {
                                c0103g.f1870c.b(e5.g.C(new C0099c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 5:
                            M m10 = this.f1861b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, m10.b((n) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = e5.g.C(th2);
                            }
                            tVar22.b(arrayList6);
                            return;
                        case 6:
                            C0104h c0104h = new C0104h(new ArrayList(), tVar22, 1);
                            C0054d c0054d4 = this.f1861b.f1848a;
                            if (c0054d4 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d4.i(new D3.g(8, c0104h));
                                return;
                            } catch (RuntimeException e9) {
                                c0104h.f1873c.b(e5.g.C(new C0099c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 7:
                            C0105i c0105i2 = new C0105i(new ArrayList(), tVar22, 1);
                            M m11 = this.f1861b;
                            C0054d c0054d5 = m11.f1848a;
                            if (c0054d5 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            AbstractActivityC1515c abstractActivityC1515c = m11.f1850c;
                            if (abstractActivityC1515c == null) {
                                tVar22.b(e5.g.C(new C0099c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c0054d5.k(abstractActivityC1515c, new D3.g(9, c0105i2));
                                return;
                            } catch (RuntimeException e10) {
                                c0105i2.f1876c.b(e5.g.C(new C0099c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 8:
                            C0101e c0101e2 = new C0101e(new ArrayList(), tVar22, 0);
                            C0054d c0054d6 = this.f1861b.f1848a;
                            if (c0054d6 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d6.g(new D3.g(4, c0101e2));
                                return;
                            } catch (RuntimeException e11) {
                                c0101e2.f1864c.b(e5.g.C(new C0099c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 9:
                            M m12 = this.f1861b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l2 = (Long) arrayList8.get(0);
                            EnumC0109m enumC0109m = (EnumC0109m) arrayList8.get(1);
                            v vVar = (v) arrayList8.get(2);
                            C0102f c0102f2 = new C0102f(arrayList7, tVar22, 0);
                            if (m12.f1848a == null) {
                                W1.e eVar = m12.f1849b;
                                Context context = m12.f1851d;
                                B1.g gVar3 = m12.f1852e;
                                eVar.getClass();
                                C0052b c0052b = new C0052b(context);
                                if (vVar != null && vVar.f1918a.booleanValue()) {
                                    z = true;
                                }
                                c0052b.f814a = new C0062l(z);
                                int ordinal = enumC0109m.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c0052b.f818e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0109m + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c0052b.f817d = new C0097a(eVar, 0, gVar3);
                                    }
                                }
                                c0052b.f816c = new C0482c(24, gVar3);
                                m12.f1848a = c0052b.a();
                            }
                            try {
                                m12.f1848a.l(new L(m12, c0102f2, l2));
                                return;
                            } catch (RuntimeException e12) {
                                c0102f2.f1867c.b(e5.g.C(new C0099c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 10:
                            M m13 = this.f1861b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C0054d c0054d7 = m13.f1848a;
                                if (c0054d7 != null) {
                                    c0054d7.a();
                                    m13.f1848a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = e5.g.C(th3);
                            }
                            tVar22.b(arrayList9);
                            return;
                        case 11:
                            C0103g c0103g2 = new C0103g(new ArrayList(), tVar22, 0);
                            C0054d c0054d8 = this.f1861b.f1848a;
                            if (c0054d8 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d8.h(new D3.g(10, c0103g2));
                                return;
                            } catch (RuntimeException e13) {
                                c0103g2.f1870c.b(e5.g.C(new C0099c("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 12:
                            M m14 = this.f1861b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, m14.c((p) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = e5.g.C(th4);
                            }
                            tVar22.b(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0104h c0104h2 = new C0104h(arrayList11, tVar22, 0);
                            C0054d c0054d9 = this.f1861b.f1848a;
                            if (c0054d9 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0051a c0051a2 = new C0051a(0);
                                c0051a2.f813b = str2;
                                c0054d9.e(c0051a2, new D3.g(7, c0104h2));
                                return;
                            } catch (RuntimeException e14) {
                                c0104h2.f1873c.b(e5.g.C(new C0099c("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                    }
                }
            });
        } else {
            tVar8.h(null);
        }
        f2.t tVar9 = new f2.t(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryPurchaseHistoryAsync", c0106j, null);
        if (m6 != null) {
            final int i12 = 3;
            tVar9.h(new H2.b(m6) { // from class: M2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ M f1861b;

                {
                    this.f1861b = m6;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    C0054d c0054d;
                    switch (i12) {
                        case 0:
                            M m7 = this.f1861b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c0054d = m7.f1848a;
                            } catch (Throwable th) {
                                arrayList = e5.g.C(th);
                            }
                            if (c0054d == null) {
                                throw M.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c0054d.b()));
                            tVar22.b(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0105i c0105i = new C0105i(arrayList2, tVar22, 0);
                            C0054d c0054d2 = this.f1861b.f1848a;
                            if (c0054d2 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                D3.g gVar = new D3.g(6, c0105i);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0061k c0061k = new C0061k();
                                c0061k.f864a = str;
                                c0054d2.f(gVar, c0061k);
                                return;
                            } catch (RuntimeException e3) {
                                c0105i.f1876c.b(e5.g.C(new C0099c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj).get(0);
                            C0101e c0101e = new C0101e(arrayList3, tVar22, 1);
                            M m8 = this.f1861b;
                            if (m8.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0051a c0051a = new C0051a(1);
                                c0051a.f813b = AbstractC1341c.J(zVar);
                                m8.f1848a.d(c0051a.c(), new D3.g(3, c0101e));
                                return;
                            } catch (RuntimeException e6) {
                                c0101e.f1864c.b(e5.g.C(new C0099c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            z zVar2 = (z) ((ArrayList) obj).get(0);
                            C0102f c0102f = new C0102f(arrayList4, tVar22, 1);
                            C0054d c0054d3 = this.f1861b.f1848a;
                            if (c0054d3 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                String J4 = AbstractC1341c.J(zVar2);
                                D3.g gVar2 = new D3.g(5, c0102f);
                                if (!c0054d3.b()) {
                                    C0060j c0060j = O.f781k;
                                    c0054d3.H(2, 11, c0060j);
                                    gVar2.onPurchaseHistoryResponse(c0060j, null);
                                } else if (C0054d.m(new G0.w(c0054d3, J4, gVar2, 3), 30000L, new A0.a(c0054d3, gVar2, 11, false), c0054d3.D(), c0054d3.q()) == null) {
                                    C0060j n6 = c0054d3.n();
                                    c0054d3.H(25, 11, n6);
                                    gVar2.onPurchaseHistoryResponse(n6, null);
                                }
                                return;
                            } catch (RuntimeException e7) {
                                c0102f.f1867c.b(e5.g.C(new C0099c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0103g c0103g = new C0103g(arrayList5, tVar22, 1);
                            M m9 = this.f1861b;
                            if (m9.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0482c c0482c = new C0482c(5);
                                c0482c.g(AbstractC1341c.I(list));
                                m9.f1848a.c(c0482c.d(), new C0097a(m9, 4, c0103g));
                                return;
                            } catch (RuntimeException e8) {
                                c0103g.f1870c.b(e5.g.C(new C0099c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 5:
                            M m10 = this.f1861b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, m10.b((n) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = e5.g.C(th2);
                            }
                            tVar22.b(arrayList6);
                            return;
                        case 6:
                            C0104h c0104h = new C0104h(new ArrayList(), tVar22, 1);
                            C0054d c0054d4 = this.f1861b.f1848a;
                            if (c0054d4 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d4.i(new D3.g(8, c0104h));
                                return;
                            } catch (RuntimeException e9) {
                                c0104h.f1873c.b(e5.g.C(new C0099c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 7:
                            C0105i c0105i2 = new C0105i(new ArrayList(), tVar22, 1);
                            M m11 = this.f1861b;
                            C0054d c0054d5 = m11.f1848a;
                            if (c0054d5 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            AbstractActivityC1515c abstractActivityC1515c = m11.f1850c;
                            if (abstractActivityC1515c == null) {
                                tVar22.b(e5.g.C(new C0099c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c0054d5.k(abstractActivityC1515c, new D3.g(9, c0105i2));
                                return;
                            } catch (RuntimeException e10) {
                                c0105i2.f1876c.b(e5.g.C(new C0099c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 8:
                            C0101e c0101e2 = new C0101e(new ArrayList(), tVar22, 0);
                            C0054d c0054d6 = this.f1861b.f1848a;
                            if (c0054d6 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d6.g(new D3.g(4, c0101e2));
                                return;
                            } catch (RuntimeException e11) {
                                c0101e2.f1864c.b(e5.g.C(new C0099c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 9:
                            M m12 = this.f1861b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l2 = (Long) arrayList8.get(0);
                            EnumC0109m enumC0109m = (EnumC0109m) arrayList8.get(1);
                            v vVar = (v) arrayList8.get(2);
                            C0102f c0102f2 = new C0102f(arrayList7, tVar22, 0);
                            if (m12.f1848a == null) {
                                W1.e eVar = m12.f1849b;
                                Context context = m12.f1851d;
                                B1.g gVar3 = m12.f1852e;
                                eVar.getClass();
                                C0052b c0052b = new C0052b(context);
                                if (vVar != null && vVar.f1918a.booleanValue()) {
                                    z = true;
                                }
                                c0052b.f814a = new C0062l(z);
                                int ordinal = enumC0109m.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c0052b.f818e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0109m + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c0052b.f817d = new C0097a(eVar, 0, gVar3);
                                    }
                                }
                                c0052b.f816c = new C0482c(24, gVar3);
                                m12.f1848a = c0052b.a();
                            }
                            try {
                                m12.f1848a.l(new L(m12, c0102f2, l2));
                                return;
                            } catch (RuntimeException e12) {
                                c0102f2.f1867c.b(e5.g.C(new C0099c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 10:
                            M m13 = this.f1861b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C0054d c0054d7 = m13.f1848a;
                                if (c0054d7 != null) {
                                    c0054d7.a();
                                    m13.f1848a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = e5.g.C(th3);
                            }
                            tVar22.b(arrayList9);
                            return;
                        case 11:
                            C0103g c0103g2 = new C0103g(new ArrayList(), tVar22, 0);
                            C0054d c0054d8 = this.f1861b.f1848a;
                            if (c0054d8 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d8.h(new D3.g(10, c0103g2));
                                return;
                            } catch (RuntimeException e13) {
                                c0103g2.f1870c.b(e5.g.C(new C0099c("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 12:
                            M m14 = this.f1861b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, m14.c((p) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = e5.g.C(th4);
                            }
                            tVar22.b(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0104h c0104h2 = new C0104h(arrayList11, tVar22, 0);
                            C0054d c0054d9 = this.f1861b.f1848a;
                            if (c0054d9 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0051a c0051a2 = new C0051a(0);
                                c0051a2.f813b = str2;
                                c0054d9.e(c0051a2, new D3.g(7, c0104h2));
                                return;
                            } catch (RuntimeException e14) {
                                c0104h2.f1873c.b(e5.g.C(new C0099c("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                    }
                }
            });
        } else {
            tVar9.h(null);
        }
        f2.t tVar10 = new f2.t(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryProductDetailsAsync", c0106j, null);
        if (m6 != null) {
            final int i13 = 4;
            tVar10.h(new H2.b(m6) { // from class: M2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ M f1861b;

                {
                    this.f1861b = m6;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    C0054d c0054d;
                    switch (i13) {
                        case 0:
                            M m7 = this.f1861b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c0054d = m7.f1848a;
                            } catch (Throwable th) {
                                arrayList = e5.g.C(th);
                            }
                            if (c0054d == null) {
                                throw M.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c0054d.b()));
                            tVar22.b(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0105i c0105i = new C0105i(arrayList2, tVar22, 0);
                            C0054d c0054d2 = this.f1861b.f1848a;
                            if (c0054d2 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                D3.g gVar = new D3.g(6, c0105i);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0061k c0061k = new C0061k();
                                c0061k.f864a = str;
                                c0054d2.f(gVar, c0061k);
                                return;
                            } catch (RuntimeException e3) {
                                c0105i.f1876c.b(e5.g.C(new C0099c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj).get(0);
                            C0101e c0101e = new C0101e(arrayList3, tVar22, 1);
                            M m8 = this.f1861b;
                            if (m8.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0051a c0051a = new C0051a(1);
                                c0051a.f813b = AbstractC1341c.J(zVar);
                                m8.f1848a.d(c0051a.c(), new D3.g(3, c0101e));
                                return;
                            } catch (RuntimeException e6) {
                                c0101e.f1864c.b(e5.g.C(new C0099c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            z zVar2 = (z) ((ArrayList) obj).get(0);
                            C0102f c0102f = new C0102f(arrayList4, tVar22, 1);
                            C0054d c0054d3 = this.f1861b.f1848a;
                            if (c0054d3 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                String J4 = AbstractC1341c.J(zVar2);
                                D3.g gVar2 = new D3.g(5, c0102f);
                                if (!c0054d3.b()) {
                                    C0060j c0060j = O.f781k;
                                    c0054d3.H(2, 11, c0060j);
                                    gVar2.onPurchaseHistoryResponse(c0060j, null);
                                } else if (C0054d.m(new G0.w(c0054d3, J4, gVar2, 3), 30000L, new A0.a(c0054d3, gVar2, 11, false), c0054d3.D(), c0054d3.q()) == null) {
                                    C0060j n6 = c0054d3.n();
                                    c0054d3.H(25, 11, n6);
                                    gVar2.onPurchaseHistoryResponse(n6, null);
                                }
                                return;
                            } catch (RuntimeException e7) {
                                c0102f.f1867c.b(e5.g.C(new C0099c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0103g c0103g = new C0103g(arrayList5, tVar22, 1);
                            M m9 = this.f1861b;
                            if (m9.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0482c c0482c = new C0482c(5);
                                c0482c.g(AbstractC1341c.I(list));
                                m9.f1848a.c(c0482c.d(), new C0097a(m9, 4, c0103g));
                                return;
                            } catch (RuntimeException e8) {
                                c0103g.f1870c.b(e5.g.C(new C0099c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 5:
                            M m10 = this.f1861b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, m10.b((n) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = e5.g.C(th2);
                            }
                            tVar22.b(arrayList6);
                            return;
                        case 6:
                            C0104h c0104h = new C0104h(new ArrayList(), tVar22, 1);
                            C0054d c0054d4 = this.f1861b.f1848a;
                            if (c0054d4 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d4.i(new D3.g(8, c0104h));
                                return;
                            } catch (RuntimeException e9) {
                                c0104h.f1873c.b(e5.g.C(new C0099c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 7:
                            C0105i c0105i2 = new C0105i(new ArrayList(), tVar22, 1);
                            M m11 = this.f1861b;
                            C0054d c0054d5 = m11.f1848a;
                            if (c0054d5 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            AbstractActivityC1515c abstractActivityC1515c = m11.f1850c;
                            if (abstractActivityC1515c == null) {
                                tVar22.b(e5.g.C(new C0099c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c0054d5.k(abstractActivityC1515c, new D3.g(9, c0105i2));
                                return;
                            } catch (RuntimeException e10) {
                                c0105i2.f1876c.b(e5.g.C(new C0099c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 8:
                            C0101e c0101e2 = new C0101e(new ArrayList(), tVar22, 0);
                            C0054d c0054d6 = this.f1861b.f1848a;
                            if (c0054d6 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d6.g(new D3.g(4, c0101e2));
                                return;
                            } catch (RuntimeException e11) {
                                c0101e2.f1864c.b(e5.g.C(new C0099c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 9:
                            M m12 = this.f1861b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l2 = (Long) arrayList8.get(0);
                            EnumC0109m enumC0109m = (EnumC0109m) arrayList8.get(1);
                            v vVar = (v) arrayList8.get(2);
                            C0102f c0102f2 = new C0102f(arrayList7, tVar22, 0);
                            if (m12.f1848a == null) {
                                W1.e eVar = m12.f1849b;
                                Context context = m12.f1851d;
                                B1.g gVar3 = m12.f1852e;
                                eVar.getClass();
                                C0052b c0052b = new C0052b(context);
                                if (vVar != null && vVar.f1918a.booleanValue()) {
                                    z = true;
                                }
                                c0052b.f814a = new C0062l(z);
                                int ordinal = enumC0109m.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c0052b.f818e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0109m + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c0052b.f817d = new C0097a(eVar, 0, gVar3);
                                    }
                                }
                                c0052b.f816c = new C0482c(24, gVar3);
                                m12.f1848a = c0052b.a();
                            }
                            try {
                                m12.f1848a.l(new L(m12, c0102f2, l2));
                                return;
                            } catch (RuntimeException e12) {
                                c0102f2.f1867c.b(e5.g.C(new C0099c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 10:
                            M m13 = this.f1861b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C0054d c0054d7 = m13.f1848a;
                                if (c0054d7 != null) {
                                    c0054d7.a();
                                    m13.f1848a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = e5.g.C(th3);
                            }
                            tVar22.b(arrayList9);
                            return;
                        case 11:
                            C0103g c0103g2 = new C0103g(new ArrayList(), tVar22, 0);
                            C0054d c0054d8 = this.f1861b.f1848a;
                            if (c0054d8 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d8.h(new D3.g(10, c0103g2));
                                return;
                            } catch (RuntimeException e13) {
                                c0103g2.f1870c.b(e5.g.C(new C0099c("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 12:
                            M m14 = this.f1861b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, m14.c((p) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = e5.g.C(th4);
                            }
                            tVar22.b(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0104h c0104h2 = new C0104h(arrayList11, tVar22, 0);
                            C0054d c0054d9 = this.f1861b.f1848a;
                            if (c0054d9 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0051a c0051a2 = new C0051a(0);
                                c0051a2.f813b = str2;
                                c0054d9.e(c0051a2, new D3.g(7, c0104h2));
                                return;
                            } catch (RuntimeException e14) {
                                c0104h2.f1873c.b(e5.g.C(new C0099c("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                    }
                }
            });
        } else {
            tVar10.h(null);
        }
        f2.t tVar11 = new f2.t(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isFeatureSupported", c0106j, null);
        if (m6 != null) {
            final int i14 = 5;
            tVar11.h(new H2.b(m6) { // from class: M2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ M f1861b;

                {
                    this.f1861b = m6;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    C0054d c0054d;
                    switch (i14) {
                        case 0:
                            M m7 = this.f1861b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c0054d = m7.f1848a;
                            } catch (Throwable th) {
                                arrayList = e5.g.C(th);
                            }
                            if (c0054d == null) {
                                throw M.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c0054d.b()));
                            tVar22.b(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0105i c0105i = new C0105i(arrayList2, tVar22, 0);
                            C0054d c0054d2 = this.f1861b.f1848a;
                            if (c0054d2 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                D3.g gVar = new D3.g(6, c0105i);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0061k c0061k = new C0061k();
                                c0061k.f864a = str;
                                c0054d2.f(gVar, c0061k);
                                return;
                            } catch (RuntimeException e3) {
                                c0105i.f1876c.b(e5.g.C(new C0099c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj).get(0);
                            C0101e c0101e = new C0101e(arrayList3, tVar22, 1);
                            M m8 = this.f1861b;
                            if (m8.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0051a c0051a = new C0051a(1);
                                c0051a.f813b = AbstractC1341c.J(zVar);
                                m8.f1848a.d(c0051a.c(), new D3.g(3, c0101e));
                                return;
                            } catch (RuntimeException e6) {
                                c0101e.f1864c.b(e5.g.C(new C0099c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            z zVar2 = (z) ((ArrayList) obj).get(0);
                            C0102f c0102f = new C0102f(arrayList4, tVar22, 1);
                            C0054d c0054d3 = this.f1861b.f1848a;
                            if (c0054d3 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                String J4 = AbstractC1341c.J(zVar2);
                                D3.g gVar2 = new D3.g(5, c0102f);
                                if (!c0054d3.b()) {
                                    C0060j c0060j = O.f781k;
                                    c0054d3.H(2, 11, c0060j);
                                    gVar2.onPurchaseHistoryResponse(c0060j, null);
                                } else if (C0054d.m(new G0.w(c0054d3, J4, gVar2, 3), 30000L, new A0.a(c0054d3, gVar2, 11, false), c0054d3.D(), c0054d3.q()) == null) {
                                    C0060j n6 = c0054d3.n();
                                    c0054d3.H(25, 11, n6);
                                    gVar2.onPurchaseHistoryResponse(n6, null);
                                }
                                return;
                            } catch (RuntimeException e7) {
                                c0102f.f1867c.b(e5.g.C(new C0099c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0103g c0103g = new C0103g(arrayList5, tVar22, 1);
                            M m9 = this.f1861b;
                            if (m9.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0482c c0482c = new C0482c(5);
                                c0482c.g(AbstractC1341c.I(list));
                                m9.f1848a.c(c0482c.d(), new C0097a(m9, 4, c0103g));
                                return;
                            } catch (RuntimeException e8) {
                                c0103g.f1870c.b(e5.g.C(new C0099c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 5:
                            M m10 = this.f1861b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, m10.b((n) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = e5.g.C(th2);
                            }
                            tVar22.b(arrayList6);
                            return;
                        case 6:
                            C0104h c0104h = new C0104h(new ArrayList(), tVar22, 1);
                            C0054d c0054d4 = this.f1861b.f1848a;
                            if (c0054d4 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d4.i(new D3.g(8, c0104h));
                                return;
                            } catch (RuntimeException e9) {
                                c0104h.f1873c.b(e5.g.C(new C0099c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 7:
                            C0105i c0105i2 = new C0105i(new ArrayList(), tVar22, 1);
                            M m11 = this.f1861b;
                            C0054d c0054d5 = m11.f1848a;
                            if (c0054d5 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            AbstractActivityC1515c abstractActivityC1515c = m11.f1850c;
                            if (abstractActivityC1515c == null) {
                                tVar22.b(e5.g.C(new C0099c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c0054d5.k(abstractActivityC1515c, new D3.g(9, c0105i2));
                                return;
                            } catch (RuntimeException e10) {
                                c0105i2.f1876c.b(e5.g.C(new C0099c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 8:
                            C0101e c0101e2 = new C0101e(new ArrayList(), tVar22, 0);
                            C0054d c0054d6 = this.f1861b.f1848a;
                            if (c0054d6 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d6.g(new D3.g(4, c0101e2));
                                return;
                            } catch (RuntimeException e11) {
                                c0101e2.f1864c.b(e5.g.C(new C0099c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 9:
                            M m12 = this.f1861b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l2 = (Long) arrayList8.get(0);
                            EnumC0109m enumC0109m = (EnumC0109m) arrayList8.get(1);
                            v vVar = (v) arrayList8.get(2);
                            C0102f c0102f2 = new C0102f(arrayList7, tVar22, 0);
                            if (m12.f1848a == null) {
                                W1.e eVar = m12.f1849b;
                                Context context = m12.f1851d;
                                B1.g gVar3 = m12.f1852e;
                                eVar.getClass();
                                C0052b c0052b = new C0052b(context);
                                if (vVar != null && vVar.f1918a.booleanValue()) {
                                    z = true;
                                }
                                c0052b.f814a = new C0062l(z);
                                int ordinal = enumC0109m.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c0052b.f818e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0109m + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c0052b.f817d = new C0097a(eVar, 0, gVar3);
                                    }
                                }
                                c0052b.f816c = new C0482c(24, gVar3);
                                m12.f1848a = c0052b.a();
                            }
                            try {
                                m12.f1848a.l(new L(m12, c0102f2, l2));
                                return;
                            } catch (RuntimeException e12) {
                                c0102f2.f1867c.b(e5.g.C(new C0099c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 10:
                            M m13 = this.f1861b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C0054d c0054d7 = m13.f1848a;
                                if (c0054d7 != null) {
                                    c0054d7.a();
                                    m13.f1848a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = e5.g.C(th3);
                            }
                            tVar22.b(arrayList9);
                            return;
                        case 11:
                            C0103g c0103g2 = new C0103g(new ArrayList(), tVar22, 0);
                            C0054d c0054d8 = this.f1861b.f1848a;
                            if (c0054d8 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d8.h(new D3.g(10, c0103g2));
                                return;
                            } catch (RuntimeException e13) {
                                c0103g2.f1870c.b(e5.g.C(new C0099c("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 12:
                            M m14 = this.f1861b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, m14.c((p) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = e5.g.C(th4);
                            }
                            tVar22.b(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0104h c0104h2 = new C0104h(arrayList11, tVar22, 0);
                            C0054d c0054d9 = this.f1861b.f1848a;
                            if (c0054d9 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0051a c0051a2 = new C0051a(0);
                                c0051a2.f813b = str2;
                                c0054d9.e(c0051a2, new D3.g(7, c0104h2));
                                return;
                            } catch (RuntimeException e14) {
                                c0104h2.f1873c.b(e5.g.C(new C0099c("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                    }
                }
            });
        } else {
            tVar11.h(null);
        }
        f2.t tVar12 = new f2.t(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isAlternativeBillingOnlyAvailableAsync", c0106j, null);
        if (m6 != null) {
            final int i15 = 6;
            tVar12.h(new H2.b(m6) { // from class: M2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ M f1861b;

                {
                    this.f1861b = m6;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    C0054d c0054d;
                    switch (i15) {
                        case 0:
                            M m7 = this.f1861b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c0054d = m7.f1848a;
                            } catch (Throwable th) {
                                arrayList = e5.g.C(th);
                            }
                            if (c0054d == null) {
                                throw M.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c0054d.b()));
                            tVar22.b(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0105i c0105i = new C0105i(arrayList2, tVar22, 0);
                            C0054d c0054d2 = this.f1861b.f1848a;
                            if (c0054d2 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                D3.g gVar = new D3.g(6, c0105i);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0061k c0061k = new C0061k();
                                c0061k.f864a = str;
                                c0054d2.f(gVar, c0061k);
                                return;
                            } catch (RuntimeException e3) {
                                c0105i.f1876c.b(e5.g.C(new C0099c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj).get(0);
                            C0101e c0101e = new C0101e(arrayList3, tVar22, 1);
                            M m8 = this.f1861b;
                            if (m8.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0051a c0051a = new C0051a(1);
                                c0051a.f813b = AbstractC1341c.J(zVar);
                                m8.f1848a.d(c0051a.c(), new D3.g(3, c0101e));
                                return;
                            } catch (RuntimeException e6) {
                                c0101e.f1864c.b(e5.g.C(new C0099c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            z zVar2 = (z) ((ArrayList) obj).get(0);
                            C0102f c0102f = new C0102f(arrayList4, tVar22, 1);
                            C0054d c0054d3 = this.f1861b.f1848a;
                            if (c0054d3 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                String J4 = AbstractC1341c.J(zVar2);
                                D3.g gVar2 = new D3.g(5, c0102f);
                                if (!c0054d3.b()) {
                                    C0060j c0060j = O.f781k;
                                    c0054d3.H(2, 11, c0060j);
                                    gVar2.onPurchaseHistoryResponse(c0060j, null);
                                } else if (C0054d.m(new G0.w(c0054d3, J4, gVar2, 3), 30000L, new A0.a(c0054d3, gVar2, 11, false), c0054d3.D(), c0054d3.q()) == null) {
                                    C0060j n6 = c0054d3.n();
                                    c0054d3.H(25, 11, n6);
                                    gVar2.onPurchaseHistoryResponse(n6, null);
                                }
                                return;
                            } catch (RuntimeException e7) {
                                c0102f.f1867c.b(e5.g.C(new C0099c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0103g c0103g = new C0103g(arrayList5, tVar22, 1);
                            M m9 = this.f1861b;
                            if (m9.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0482c c0482c = new C0482c(5);
                                c0482c.g(AbstractC1341c.I(list));
                                m9.f1848a.c(c0482c.d(), new C0097a(m9, 4, c0103g));
                                return;
                            } catch (RuntimeException e8) {
                                c0103g.f1870c.b(e5.g.C(new C0099c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 5:
                            M m10 = this.f1861b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, m10.b((n) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = e5.g.C(th2);
                            }
                            tVar22.b(arrayList6);
                            return;
                        case 6:
                            C0104h c0104h = new C0104h(new ArrayList(), tVar22, 1);
                            C0054d c0054d4 = this.f1861b.f1848a;
                            if (c0054d4 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d4.i(new D3.g(8, c0104h));
                                return;
                            } catch (RuntimeException e9) {
                                c0104h.f1873c.b(e5.g.C(new C0099c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 7:
                            C0105i c0105i2 = new C0105i(new ArrayList(), tVar22, 1);
                            M m11 = this.f1861b;
                            C0054d c0054d5 = m11.f1848a;
                            if (c0054d5 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            AbstractActivityC1515c abstractActivityC1515c = m11.f1850c;
                            if (abstractActivityC1515c == null) {
                                tVar22.b(e5.g.C(new C0099c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c0054d5.k(abstractActivityC1515c, new D3.g(9, c0105i2));
                                return;
                            } catch (RuntimeException e10) {
                                c0105i2.f1876c.b(e5.g.C(new C0099c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 8:
                            C0101e c0101e2 = new C0101e(new ArrayList(), tVar22, 0);
                            C0054d c0054d6 = this.f1861b.f1848a;
                            if (c0054d6 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d6.g(new D3.g(4, c0101e2));
                                return;
                            } catch (RuntimeException e11) {
                                c0101e2.f1864c.b(e5.g.C(new C0099c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 9:
                            M m12 = this.f1861b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l2 = (Long) arrayList8.get(0);
                            EnumC0109m enumC0109m = (EnumC0109m) arrayList8.get(1);
                            v vVar = (v) arrayList8.get(2);
                            C0102f c0102f2 = new C0102f(arrayList7, tVar22, 0);
                            if (m12.f1848a == null) {
                                W1.e eVar = m12.f1849b;
                                Context context = m12.f1851d;
                                B1.g gVar3 = m12.f1852e;
                                eVar.getClass();
                                C0052b c0052b = new C0052b(context);
                                if (vVar != null && vVar.f1918a.booleanValue()) {
                                    z = true;
                                }
                                c0052b.f814a = new C0062l(z);
                                int ordinal = enumC0109m.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c0052b.f818e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0109m + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c0052b.f817d = new C0097a(eVar, 0, gVar3);
                                    }
                                }
                                c0052b.f816c = new C0482c(24, gVar3);
                                m12.f1848a = c0052b.a();
                            }
                            try {
                                m12.f1848a.l(new L(m12, c0102f2, l2));
                                return;
                            } catch (RuntimeException e12) {
                                c0102f2.f1867c.b(e5.g.C(new C0099c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 10:
                            M m13 = this.f1861b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C0054d c0054d7 = m13.f1848a;
                                if (c0054d7 != null) {
                                    c0054d7.a();
                                    m13.f1848a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = e5.g.C(th3);
                            }
                            tVar22.b(arrayList9);
                            return;
                        case 11:
                            C0103g c0103g2 = new C0103g(new ArrayList(), tVar22, 0);
                            C0054d c0054d8 = this.f1861b.f1848a;
                            if (c0054d8 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d8.h(new D3.g(10, c0103g2));
                                return;
                            } catch (RuntimeException e13) {
                                c0103g2.f1870c.b(e5.g.C(new C0099c("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 12:
                            M m14 = this.f1861b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, m14.c((p) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = e5.g.C(th4);
                            }
                            tVar22.b(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0104h c0104h2 = new C0104h(arrayList11, tVar22, 0);
                            C0054d c0054d9 = this.f1861b.f1848a;
                            if (c0054d9 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0051a c0051a2 = new C0051a(0);
                                c0051a2.f813b = str2;
                                c0054d9.e(c0051a2, new D3.g(7, c0104h2));
                                return;
                            } catch (RuntimeException e14) {
                                c0104h2.f1873c.b(e5.g.C(new C0099c("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                    }
                }
            });
        } else {
            tVar12.h(null);
        }
        f2.t tVar13 = new f2.t(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.showAlternativeBillingOnlyInformationDialog", c0106j, null);
        if (m6 != null) {
            final int i16 = 7;
            tVar13.h(new H2.b(m6) { // from class: M2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ M f1861b;

                {
                    this.f1861b = m6;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    C0054d c0054d;
                    switch (i16) {
                        case 0:
                            M m7 = this.f1861b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c0054d = m7.f1848a;
                            } catch (Throwable th) {
                                arrayList = e5.g.C(th);
                            }
                            if (c0054d == null) {
                                throw M.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c0054d.b()));
                            tVar22.b(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0105i c0105i = new C0105i(arrayList2, tVar22, 0);
                            C0054d c0054d2 = this.f1861b.f1848a;
                            if (c0054d2 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                D3.g gVar = new D3.g(6, c0105i);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0061k c0061k = new C0061k();
                                c0061k.f864a = str;
                                c0054d2.f(gVar, c0061k);
                                return;
                            } catch (RuntimeException e3) {
                                c0105i.f1876c.b(e5.g.C(new C0099c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj).get(0);
                            C0101e c0101e = new C0101e(arrayList3, tVar22, 1);
                            M m8 = this.f1861b;
                            if (m8.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0051a c0051a = new C0051a(1);
                                c0051a.f813b = AbstractC1341c.J(zVar);
                                m8.f1848a.d(c0051a.c(), new D3.g(3, c0101e));
                                return;
                            } catch (RuntimeException e6) {
                                c0101e.f1864c.b(e5.g.C(new C0099c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            z zVar2 = (z) ((ArrayList) obj).get(0);
                            C0102f c0102f = new C0102f(arrayList4, tVar22, 1);
                            C0054d c0054d3 = this.f1861b.f1848a;
                            if (c0054d3 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                String J4 = AbstractC1341c.J(zVar2);
                                D3.g gVar2 = new D3.g(5, c0102f);
                                if (!c0054d3.b()) {
                                    C0060j c0060j = O.f781k;
                                    c0054d3.H(2, 11, c0060j);
                                    gVar2.onPurchaseHistoryResponse(c0060j, null);
                                } else if (C0054d.m(new G0.w(c0054d3, J4, gVar2, 3), 30000L, new A0.a(c0054d3, gVar2, 11, false), c0054d3.D(), c0054d3.q()) == null) {
                                    C0060j n6 = c0054d3.n();
                                    c0054d3.H(25, 11, n6);
                                    gVar2.onPurchaseHistoryResponse(n6, null);
                                }
                                return;
                            } catch (RuntimeException e7) {
                                c0102f.f1867c.b(e5.g.C(new C0099c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0103g c0103g = new C0103g(arrayList5, tVar22, 1);
                            M m9 = this.f1861b;
                            if (m9.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0482c c0482c = new C0482c(5);
                                c0482c.g(AbstractC1341c.I(list));
                                m9.f1848a.c(c0482c.d(), new C0097a(m9, 4, c0103g));
                                return;
                            } catch (RuntimeException e8) {
                                c0103g.f1870c.b(e5.g.C(new C0099c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 5:
                            M m10 = this.f1861b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, m10.b((n) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = e5.g.C(th2);
                            }
                            tVar22.b(arrayList6);
                            return;
                        case 6:
                            C0104h c0104h = new C0104h(new ArrayList(), tVar22, 1);
                            C0054d c0054d4 = this.f1861b.f1848a;
                            if (c0054d4 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d4.i(new D3.g(8, c0104h));
                                return;
                            } catch (RuntimeException e9) {
                                c0104h.f1873c.b(e5.g.C(new C0099c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 7:
                            C0105i c0105i2 = new C0105i(new ArrayList(), tVar22, 1);
                            M m11 = this.f1861b;
                            C0054d c0054d5 = m11.f1848a;
                            if (c0054d5 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            AbstractActivityC1515c abstractActivityC1515c = m11.f1850c;
                            if (abstractActivityC1515c == null) {
                                tVar22.b(e5.g.C(new C0099c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c0054d5.k(abstractActivityC1515c, new D3.g(9, c0105i2));
                                return;
                            } catch (RuntimeException e10) {
                                c0105i2.f1876c.b(e5.g.C(new C0099c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 8:
                            C0101e c0101e2 = new C0101e(new ArrayList(), tVar22, 0);
                            C0054d c0054d6 = this.f1861b.f1848a;
                            if (c0054d6 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d6.g(new D3.g(4, c0101e2));
                                return;
                            } catch (RuntimeException e11) {
                                c0101e2.f1864c.b(e5.g.C(new C0099c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 9:
                            M m12 = this.f1861b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l2 = (Long) arrayList8.get(0);
                            EnumC0109m enumC0109m = (EnumC0109m) arrayList8.get(1);
                            v vVar = (v) arrayList8.get(2);
                            C0102f c0102f2 = new C0102f(arrayList7, tVar22, 0);
                            if (m12.f1848a == null) {
                                W1.e eVar = m12.f1849b;
                                Context context = m12.f1851d;
                                B1.g gVar3 = m12.f1852e;
                                eVar.getClass();
                                C0052b c0052b = new C0052b(context);
                                if (vVar != null && vVar.f1918a.booleanValue()) {
                                    z = true;
                                }
                                c0052b.f814a = new C0062l(z);
                                int ordinal = enumC0109m.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c0052b.f818e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0109m + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c0052b.f817d = new C0097a(eVar, 0, gVar3);
                                    }
                                }
                                c0052b.f816c = new C0482c(24, gVar3);
                                m12.f1848a = c0052b.a();
                            }
                            try {
                                m12.f1848a.l(new L(m12, c0102f2, l2));
                                return;
                            } catch (RuntimeException e12) {
                                c0102f2.f1867c.b(e5.g.C(new C0099c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 10:
                            M m13 = this.f1861b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C0054d c0054d7 = m13.f1848a;
                                if (c0054d7 != null) {
                                    c0054d7.a();
                                    m13.f1848a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = e5.g.C(th3);
                            }
                            tVar22.b(arrayList9);
                            return;
                        case 11:
                            C0103g c0103g2 = new C0103g(new ArrayList(), tVar22, 0);
                            C0054d c0054d8 = this.f1861b.f1848a;
                            if (c0054d8 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d8.h(new D3.g(10, c0103g2));
                                return;
                            } catch (RuntimeException e13) {
                                c0103g2.f1870c.b(e5.g.C(new C0099c("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 12:
                            M m14 = this.f1861b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, m14.c((p) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = e5.g.C(th4);
                            }
                            tVar22.b(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0104h c0104h2 = new C0104h(arrayList11, tVar22, 0);
                            C0054d c0054d9 = this.f1861b.f1848a;
                            if (c0054d9 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0051a c0051a2 = new C0051a(0);
                                c0051a2.f813b = str2;
                                c0054d9.e(c0051a2, new D3.g(7, c0104h2));
                                return;
                            } catch (RuntimeException e14) {
                                c0104h2.f1873c.b(e5.g.C(new C0099c("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                    }
                }
            });
        } else {
            tVar13.h(null);
        }
        f2.t tVar14 = new f2.t(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.createAlternativeBillingOnlyReportingDetailsAsync", c0106j, null);
        if (m6 == null) {
            tVar14.h(null);
        } else {
            final int i17 = 8;
            tVar14.h(new H2.b(m6) { // from class: M2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ M f1861b;

                {
                    this.f1861b = m6;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    C0054d c0054d;
                    switch (i17) {
                        case 0:
                            M m7 = this.f1861b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c0054d = m7.f1848a;
                            } catch (Throwable th) {
                                arrayList = e5.g.C(th);
                            }
                            if (c0054d == null) {
                                throw M.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c0054d.b()));
                            tVar22.b(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0105i c0105i = new C0105i(arrayList2, tVar22, 0);
                            C0054d c0054d2 = this.f1861b.f1848a;
                            if (c0054d2 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                D3.g gVar = new D3.g(6, c0105i);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0061k c0061k = new C0061k();
                                c0061k.f864a = str;
                                c0054d2.f(gVar, c0061k);
                                return;
                            } catch (RuntimeException e3) {
                                c0105i.f1876c.b(e5.g.C(new C0099c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj).get(0);
                            C0101e c0101e = new C0101e(arrayList3, tVar22, 1);
                            M m8 = this.f1861b;
                            if (m8.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0051a c0051a = new C0051a(1);
                                c0051a.f813b = AbstractC1341c.J(zVar);
                                m8.f1848a.d(c0051a.c(), new D3.g(3, c0101e));
                                return;
                            } catch (RuntimeException e6) {
                                c0101e.f1864c.b(e5.g.C(new C0099c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            z zVar2 = (z) ((ArrayList) obj).get(0);
                            C0102f c0102f = new C0102f(arrayList4, tVar22, 1);
                            C0054d c0054d3 = this.f1861b.f1848a;
                            if (c0054d3 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                String J4 = AbstractC1341c.J(zVar2);
                                D3.g gVar2 = new D3.g(5, c0102f);
                                if (!c0054d3.b()) {
                                    C0060j c0060j = O.f781k;
                                    c0054d3.H(2, 11, c0060j);
                                    gVar2.onPurchaseHistoryResponse(c0060j, null);
                                } else if (C0054d.m(new G0.w(c0054d3, J4, gVar2, 3), 30000L, new A0.a(c0054d3, gVar2, 11, false), c0054d3.D(), c0054d3.q()) == null) {
                                    C0060j n6 = c0054d3.n();
                                    c0054d3.H(25, 11, n6);
                                    gVar2.onPurchaseHistoryResponse(n6, null);
                                }
                                return;
                            } catch (RuntimeException e7) {
                                c0102f.f1867c.b(e5.g.C(new C0099c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0103g c0103g = new C0103g(arrayList5, tVar22, 1);
                            M m9 = this.f1861b;
                            if (m9.f1848a == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                C0482c c0482c = new C0482c(5);
                                c0482c.g(AbstractC1341c.I(list));
                                m9.f1848a.c(c0482c.d(), new C0097a(m9, 4, c0103g));
                                return;
                            } catch (RuntimeException e8) {
                                c0103g.f1870c.b(e5.g.C(new C0099c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 5:
                            M m10 = this.f1861b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, m10.b((n) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = e5.g.C(th2);
                            }
                            tVar22.b(arrayList6);
                            return;
                        case 6:
                            C0104h c0104h = new C0104h(new ArrayList(), tVar22, 1);
                            C0054d c0054d4 = this.f1861b.f1848a;
                            if (c0054d4 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d4.i(new D3.g(8, c0104h));
                                return;
                            } catch (RuntimeException e9) {
                                c0104h.f1873c.b(e5.g.C(new C0099c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 7:
                            C0105i c0105i2 = new C0105i(new ArrayList(), tVar22, 1);
                            M m11 = this.f1861b;
                            C0054d c0054d5 = m11.f1848a;
                            if (c0054d5 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            AbstractActivityC1515c abstractActivityC1515c = m11.f1850c;
                            if (abstractActivityC1515c == null) {
                                tVar22.b(e5.g.C(new C0099c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c0054d5.k(abstractActivityC1515c, new D3.g(9, c0105i2));
                                return;
                            } catch (RuntimeException e10) {
                                c0105i2.f1876c.b(e5.g.C(new C0099c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 8:
                            C0101e c0101e2 = new C0101e(new ArrayList(), tVar22, 0);
                            C0054d c0054d6 = this.f1861b.f1848a;
                            if (c0054d6 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d6.g(new D3.g(4, c0101e2));
                                return;
                            } catch (RuntimeException e11) {
                                c0101e2.f1864c.b(e5.g.C(new C0099c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 9:
                            M m12 = this.f1861b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l2 = (Long) arrayList8.get(0);
                            EnumC0109m enumC0109m = (EnumC0109m) arrayList8.get(1);
                            v vVar = (v) arrayList8.get(2);
                            C0102f c0102f2 = new C0102f(arrayList7, tVar22, 0);
                            if (m12.f1848a == null) {
                                W1.e eVar = m12.f1849b;
                                Context context = m12.f1851d;
                                B1.g gVar3 = m12.f1852e;
                                eVar.getClass();
                                C0052b c0052b = new C0052b(context);
                                if (vVar != null && vVar.f1918a.booleanValue()) {
                                    z = true;
                                }
                                c0052b.f814a = new C0062l(z);
                                int ordinal = enumC0109m.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c0052b.f818e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0109m + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c0052b.f817d = new C0097a(eVar, 0, gVar3);
                                    }
                                }
                                c0052b.f816c = new C0482c(24, gVar3);
                                m12.f1848a = c0052b.a();
                            }
                            try {
                                m12.f1848a.l(new L(m12, c0102f2, l2));
                                return;
                            } catch (RuntimeException e12) {
                                c0102f2.f1867c.b(e5.g.C(new C0099c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 10:
                            M m13 = this.f1861b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C0054d c0054d7 = m13.f1848a;
                                if (c0054d7 != null) {
                                    c0054d7.a();
                                    m13.f1848a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = e5.g.C(th3);
                            }
                            tVar22.b(arrayList9);
                            return;
                        case 11:
                            C0103g c0103g2 = new C0103g(new ArrayList(), tVar22, 0);
                            C0054d c0054d8 = this.f1861b.f1848a;
                            if (c0054d8 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                c0054d8.h(new D3.g(10, c0103g2));
                                return;
                            } catch (RuntimeException e13) {
                                c0103g2.f1870c.b(e5.g.C(new C0099c("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 12:
                            M m14 = this.f1861b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, m14.c((p) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = e5.g.C(th4);
                            }
                            tVar22.b(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0104h c0104h2 = new C0104h(arrayList11, tVar22, 0);
                            C0054d c0054d9 = this.f1861b.f1848a;
                            if (c0054d9 == null) {
                                tVar22.b(e5.g.C(M.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C0051a c0051a2 = new C0051a(0);
                                c0051a2.f813b = str2;
                                c0054d9.e(c0051a2, new D3.g(7, c0104h2));
                                return;
                            } catch (RuntimeException e14) {
                                c0104h2.f1873c.b(e5.g.C(new C0099c("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                    }
                }
            });
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Boolean b(n nVar) {
        String str;
        char c2;
        C0060j c0060j;
        C0054d c0054d = this.f1848a;
        if (c0054d == null) {
            throw a();
        }
        switch (nVar) {
            case ALTERNATIVE_BILLING_ONLY:
                str = "jjj";
                break;
            case BILLING_CONFIG:
                str = "ggg";
                break;
            case EXTERNAL_OFFER:
                str = "kkk";
                break;
            case IN_APP_MESSAGING:
                str = "bbb";
                break;
            case PRICE_CHANGE_CONFIRMATION:
                str = "priceChangeConfirmation";
                break;
            case PRODUCT_DETAILS:
                str = "fff";
                break;
            case SUBSCRIPTIONS:
                str = "subscriptions";
                break;
            case SUBSCRIPTIONS_UPDATE:
                str = "subscriptionsUpdate";
                break;
            default:
                throw new C0099c("UNKNOWN_FEATURE", "Unknown client feature: " + nVar, null);
        }
        if (c0054d.b()) {
            C0060j c0060j2 = O.f771a;
            switch (str.hashCode()) {
                case -422092961:
                    if (str.equals("subscriptionsUpdate")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 96321:
                    if (str.equals("aaa")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 97314:
                    if (str.equals("bbb")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 98307:
                    if (str.equals("ccc")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 99300:
                    if (str.equals("ddd")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 100293:
                    if (str.equals("eee")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 101286:
                    if (str.equals("fff")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 102279:
                    if (str.equals("ggg")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 103272:
                    if (str.equals("hhh")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 104265:
                    if (str.equals("iii")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 105258:
                    if (str.equals("jjj")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 106251:
                    if (str.equals("kkk")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 107244:
                    if (str.equals("lll")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 207616302:
                    if (str.equals("priceChangeConfirmation")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1987365622:
                    if (str.equals("subscriptions")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    c0060j = c0054d.f833j ? O.f780j : O.f783m;
                    c0054d.y(9, 2, c0060j);
                    break;
                case 1:
                    c0060j = c0054d.f834k ? O.f780j : O.f784n;
                    c0054d.y(10, 3, c0060j);
                    break;
                case 2:
                    c0060j = c0054d.f837n ? O.f780j : O.f786p;
                    c0054d.y(35, 4, c0060j);
                    break;
                case 3:
                    c0060j = c0054d.f839p ? O.f780j : O.f791u;
                    c0054d.y(30, 5, c0060j);
                    break;
                case 4:
                    c0060j = c0054d.f841r ? O.f780j : O.f787q;
                    c0054d.y(31, 6, c0060j);
                    break;
                case 5:
                    c0060j = c0054d.f840q ? O.f780j : O.f789s;
                    c0054d.y(21, 7, c0060j);
                    break;
                case 6:
                    c0060j = c0054d.f842s ? O.f780j : O.f788r;
                    c0054d.y(19, 8, c0060j);
                    break;
                case 7:
                    c0060j = c0054d.f842s ? O.f780j : O.f788r;
                    c0054d.y(61, 9, c0060j);
                    break;
                case '\b':
                    c0060j = c0054d.f843t ? O.f780j : O.f790t;
                    c0054d.y(20, 10, c0060j);
                    break;
                case '\t':
                    c0060j = c0054d.f844u ? O.f780j : O.f795y;
                    c0054d.y(32, 11, c0060j);
                    break;
                case '\n':
                    c0060j = c0054d.f844u ? O.f780j : O.z;
                    c0054d.y(33, 12, c0060j);
                    break;
                case 11:
                    c0060j = c0054d.f846w ? O.f780j : O.f767B;
                    c0054d.y(60, 13, c0060j);
                    break;
                case '\f':
                    c0060j = c0054d.f847x ? O.f780j : O.f768C;
                    c0054d.y(66, 14, c0060j);
                    break;
                case '\r':
                    c0060j = c0054d.f848y ? O.f780j : O.f792v;
                    c0054d.y(103, 18, c0060j);
                    break;
                case 14:
                    c0060j = c0054d.z ? O.f780j : O.f793w;
                    c0054d.y(BuildConfig.API_LEVEL, 19, c0060j);
                    break;
                default:
                    AbstractC0357o0.g("BillingClient", "Unsupported feature: ".concat(str));
                    c0060j = O.f794x;
                    c0054d.y(34, 1, c0060j);
                    break;
            }
        } else {
            c0060j = O.f781k;
            if (c0060j.f862a != 0) {
                c0054d.H(2, 5, c0060j);
            } else {
                c0054d.J(5);
            }
        }
        return Boolean.valueOf(c0060j.f862a == 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0134, code lost:
    
        if (r10 != 5) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r c(p pVar) {
        String str;
        int i2;
        boolean z;
        if (this.f1848a == null) {
            throw a();
        }
        HashMap hashMap = this.f1853f;
        C0066p c0066p = (C0066p) hashMap.get(pVar.f1888a);
        if (c0066p == null) {
            throw new C0099c("NOT_FOUND", AbstractC0279e.h(new StringBuilder("Details for product "), pVar.f1888a, " are not available. It might because products were not fetched prior to the call. Please fetch the products first. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale"), null);
        }
        ArrayList<C0065o> arrayList = c0066p.f893j;
        if (arrayList != null) {
            for (C0065o c0065o : arrayList) {
                String str2 = pVar.f1890c;
                if (str2 == null || !str2.equals(c0065o.f880c)) {
                }
            }
            StringBuilder sb = new StringBuilder("Offer token ");
            sb.append(pVar.f1890c);
            sb.append(" for product ");
            throw new C0099c("INVALID_OFFER_TOKEN", AbstractC0279e.h(sb, pVar.f1888a, " is not valid. Make sure to only pass offer tokens that belong to the product. To obtain offer tokens for a product, fetch the products. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale"), null);
        }
        String str3 = pVar.f1893f;
        H h3 = H.UNKNOWN_REPLACEMENT_MODE;
        if (str3 == null && pVar.f1889b != h3) {
            throw new C0099c("IN_APP_PURCHASE_REQUIRE_OLD_PRODUCT", "launchBillingFlow failed because oldProduct is null. You must provide a valid oldProduct in order to use a replacement mode.", null);
        }
        if (str3 != null && !hashMap.containsKey(str3)) {
            throw new C0099c("IN_APP_PURCHASE_INVALID_OLD_PRODUCT", AbstractC0279e.h(new StringBuilder("Details for product "), pVar.f1893f, " are not available. It might because products were not fetched prior to the call. Please fetch the products first. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale"), null);
        }
        if (this.f1850c == null) {
            throw new C0099c("ACTIVITY_UNAVAILABLE", AbstractC0279e.h(new StringBuilder("Details for product "), pVar.f1888a, " are not available. This method must be run with the app in foreground."), null);
        }
        B0.t tVar = new B0.t(1);
        tVar.f207b = c0066p;
        if (c0066p.a() != null) {
            c0066p.a().getClass();
            String str4 = c0066p.a().f869d;
            if (str4 != null) {
                tVar.f208c = str4;
            }
        }
        String str5 = pVar.f1890c;
        if (str5 != null) {
            if (TextUtils.isEmpty(str5)) {
                throw new IllegalArgumentException("offerToken can not be empty");
            }
            tVar.f208c = str5;
        }
        ArrayList arrayList2 = new ArrayList();
        C0066p c0066p2 = (C0066p) tVar.f207b;
        if (c0066p2 == null) {
            throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
        }
        if (c0066p2.f893j != null && ((String) tVar.f208c) == null) {
            throw new NullPointerException("offerToken is required for constructing ProductDetailsParams for subscriptions.");
        }
        arrayList2.add(new C0056f(tVar));
        C0057g c0057g = new C0057g();
        boolean z5 = false;
        c0057g.f853c = 0;
        c0057g.f852b = true;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        String str6 = pVar.f1891d;
        String str7 = (str6 == null || str6.isEmpty()) ? null : pVar.f1891d;
        String str8 = pVar.f1892e;
        String str9 = (str8 == null || str8.isEmpty()) ? null : pVar.f1892e;
        String str10 = pVar.f1893f;
        if (str10 != null && !str10.isEmpty() && (str = pVar.f1894g) != null) {
            H h6 = pVar.f1889b;
            if (h6 != h3) {
                int ordinal = h6.ordinal();
                if (ordinal != 1) {
                    i2 = 2;
                    if (ordinal != 2) {
                        i2 = 3;
                        if (ordinal != 3) {
                            i2 = ordinal != 4 ? 5 : 6;
                        }
                    }
                } else {
                    i2 = 1;
                }
                z = TextUtils.isEmpty(str) || !TextUtils.isEmpty(null);
                boolean isEmpty = TextUtils.isEmpty(null);
                if (!z && !isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (z && isEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                C0058h c0058h = new C0058h();
                c0058h.f855b = str;
                c0058h.f854a = i2;
                c0057g = new C0057g();
                c0057g.f851a = c0058h.f855b;
                c0057g.f853c = c0058h.f854a;
            }
            i2 = 0;
            if (TextUtils.isEmpty(str)) {
            }
            boolean isEmpty2 = TextUtils.isEmpty(null);
            if (!z) {
            }
            if (z) {
            }
            C0058h c0058h2 = new C0058h();
            c0058h2.f855b = str;
            c0058h2.f854a = i2;
            c0057g = new C0057g();
            c0057g.f851a = c0058h2.f855b;
            c0057g.f853c = c0058h2.f854a;
        }
        C0054d c0054d = this.f1848a;
        AbstractActivityC1515c abstractActivityC1515c = this.f1850c;
        boolean isEmpty3 = arrayList3.isEmpty();
        if (isEmpty3) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        arrayList3.forEach(new G0.L());
        C0059i c0059i = new C0059i();
        if (!isEmpty3 && !((C0056f) arrayList3.get(0)).f849a.d().isEmpty()) {
            z5 = true;
        }
        c0059i.f856a = z5;
        c0059i.f857b = str7;
        c0059i.f858c = str9;
        boolean z6 = true;
        if (TextUtils.isEmpty(c0057g.f851a) && TextUtils.isEmpty(null)) {
            z6 = false;
        }
        boolean isEmpty4 = TextUtils.isEmpty(null);
        if (z6 && !isEmpty4) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if (!c0057g.f852b && !z6 && isEmpty4) {
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        C0058h c0058h3 = new C0058h();
        c0058h3.f855b = c0057g.f851a;
        c0058h3.f854a = c0057g.f853c;
        c0059i.f859d = c0058h3;
        c0059i.f861f = new ArrayList();
        c0059i.f860e = com.google.android.gms.internal.play_billing.C.k(arrayList3);
        return AbstractC1341c.j(c0054d.j(abstractActivityC1515c, c0059i));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Context context;
        if (this.f1850c != activity || (context = this.f1851d) == null) {
            return;
        }
        ((Application) context).unregisterActivityLifecycleCallbacks(this);
        C0054d c0054d = this.f1848a;
        if (c0054d != null) {
            c0054d.a();
            this.f1848a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
