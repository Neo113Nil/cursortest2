package U1;

import E1.AbstractActivityC0029e;
import E1.AbstractC0033i;
import a0.C0130a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import b0.C0178i;
import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import f0.C0322a;
import i1.C0342b;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import n0.AbstractC1135O;
import n0.C1132L;
import n0.C1140b;
import n0.C1141c;
import n0.C1143e;
import n0.C1145g;
import n0.C1146h;
import n0.C1147i;
import n0.C1148j;
import n0.C1151m;
import n0.C1152n;
import n0.CallableC1159u;

/* loaded from: classes.dex */
public final class I implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public C1143e f1491a;

    /* renamed from: b, reason: collision with root package name */
    public final C0080a f1492b;

    /* renamed from: d, reason: collision with root package name */
    public final Context f1494d;

    /* renamed from: e, reason: collision with root package name */
    public final C0.e f1495e;
    public final HashMap f = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public AbstractActivityC0029e f1493c = null;

    public I(Context context, C0.e eVar, C0080a c0080a) {
        this.f1492b = c0080a;
        this.f1494d = context;
        this.f1495e = eVar;
    }

    public static C0082c a() {
        return new C0082c("UNAVAILABLE", "BillingClient is unset. Try reconnecting.", null);
    }

    public static void d(P1.f fVar, final I i3) {
        C0085f c0085f = C0085f.f1505a;
        B0.p pVar = new B0.p(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isReady", (P1.k) c0085f, (K0.j) null);
        if (i3 != null) {
            final int i4 = 0;
            pVar.i(new P1.b(i3) { // from class: U1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1501b;

                {
                    this.f1501b = i3;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    C1143e c1143e;
                    switch (i4) {
                        case 0:
                            I i5 = this.f1501b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1143e = i5.f1491a;
                            } catch (Throwable th) {
                                arrayList = C2.b.K(th);
                            }
                            if (c1143e == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1143e.b()));
                            eVar.n(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e = new C0084e(arrayList2, eVar, 4);
                            C1143e c1143e2 = this.f1501b.f1491a;
                            if (c1143e2 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                B0.g gVar = new B0.g(10, c0084e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1148j c1148j = new C1148j();
                                c1148j.f10095b = str;
                                c1143e2.f(gVar, c1148j);
                                return;
                            } catch (RuntimeException e3) {
                                c0084e.f1504c.n(C2.b.K(new C0082c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e2 = new C0084e(arrayList3, eVar, 5);
                            I i6 = this.f1501b;
                            if (i6.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                C1140b c1140b = new C1140b();
                                c1140b.f10054a = S0.a.M(vVar);
                                i6.f1491a.d(c1140b.a(), new B0.g(7, c0084e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0084e2.f1504c.n(C2.b.K(new C0082c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar2 = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e3 = new C0084e(arrayList4, eVar, 6);
                            C1143e c1143e3 = this.f1501b.f1491a;
                            if (c1143e3 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                String M2 = S0.a.M(vVar2);
                                B0.g gVar2 = new B0.g(9, c0084e3);
                                if (!c1143e3.b()) {
                                    C1147i c1147i = AbstractC1135O.f10026k;
                                    c1143e3.H(2, 11, c1147i);
                                    gVar2.onPurchaseHistoryResponse(c1147i, null);
                                } else if (C1143e.m(new CallableC1159u(c1143e3, M2, gVar2, 3), 30000L, new B.a(c1143e3, 14, gVar2), c1143e3.D(), c1143e3.q()) == null) {
                                    C1147i n3 = c1143e3.n();
                                    c1143e3.H(25, 11, n3);
                                    gVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0084e3.f1504c.n(C2.b.K(new C0082c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0084e c0084e4 = new C0084e(arrayList5, eVar, 7);
                            I i7 = this.f1501b;
                            if (i7.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                b0.r rVar = new b0.r();
                                rVar.j(S0.a.L(list));
                                i7.f1491a.c(rVar.h(), new B0.k(i7, 7, c0084e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0084e4.f1504c.n(C2.b.K(new C0082c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i8 = this.f1501b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i8.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = C2.b.K(th2);
                            }
                            eVar.n(arrayList6);
                            return;
                        case 6:
                            C0084e c0084e5 = new C0084e(new ArrayList(), eVar, 8);
                            C1143e c1143e4 = this.f1501b.f1491a;
                            if (c1143e4 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e4.i(new B0.g(12, c0084e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0084e5.f1504c.n(C2.b.K(new C0082c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0084e c0084e6 = new C0084e(new ArrayList(), eVar, 9);
                            I i9 = this.f1501b;
                            C1143e c1143e5 = i9.f1491a;
                            if (c1143e5 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            AbstractActivityC0029e abstractActivityC0029e = i9.f1493c;
                            if (abstractActivityC0029e == null) {
                                eVar.n(C2.b.K(new C0082c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1143e5.k(abstractActivityC0029e, new B0.g(13, c0084e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0084e6.f1504c.n(C2.b.K(new C0082c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0084e c0084e7 = new C0084e(new ArrayList(), eVar, 0);
                            C1143e c1143e6 = this.f1501b.f1491a;
                            if (c1143e6 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e6.g(new B0.g(8, c0084e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0084e7.f1504c.n(C2.b.K(new C0082c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i10 = this.f1501b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0088i enumC0088i = (EnumC0088i) arrayList8.get(1);
                            r rVar2 = (r) arrayList8.get(2);
                            C0084e c0084e8 = new C0084e(arrayList7, eVar, 1);
                            if (i10.f1491a == null) {
                                C0080a c0080a = i10.f1492b;
                                Context context = i10.f1494d;
                                C0.e eVar2 = i10.f1495e;
                                c0080a.getClass();
                                C1141c c1141c = new C1141c(context);
                                if (rVar2 != null && rVar2.f1544a.booleanValue()) {
                                    z = true;
                                }
                                c1141c.f10055a = new C0342b(z);
                                int ordinal = enumC0088i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1141c.f10059e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0088i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1141c.f10058d = new B0.k(c0080a, 3, eVar2);
                                    }
                                }
                                c1141c.f10057c = new C0178i(27, eVar2);
                                i10.f1491a = c1141c.a();
                            }
                            try {
                                i10.f1491a.l(new H(i10, c0084e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0084e8.f1504c.n(C2.b.K(new C0082c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i11 = this.f1501b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1143e c1143e7 = i11.f1491a;
                                if (c1143e7 != null) {
                                    c1143e7.a();
                                    i11.f1491a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = C2.b.K(th3);
                            }
                            eVar.n(arrayList9);
                            return;
                        case 11:
                            C0084e c0084e9 = new C0084e(new ArrayList(), eVar, 2);
                            C1143e c1143e8 = this.f1501b.f1491a;
                            if (c1143e8 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e8.h(new B0.g(14, c0084e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0084e9.f1504c.n(C2.b.K(new C0082c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i12 = this.f1501b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i12.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = C2.b.K(th4);
                            }
                            eVar.n(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e10 = new C0084e(arrayList11, eVar, 3);
                            C1143e c1143e9 = this.f1501b.f1491a;
                            if (c1143e9 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1140b c1140b2 = new C1140b();
                                c1140b2.f10054a = str2;
                                c1143e9.e(c1140b2, new B0.g(11, c0084e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0084e10.f1504c.n(C2.b.K(new C0082c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            pVar.i(null);
        }
        B0.p pVar2 = new B0.p(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.startConnection", (P1.k) c0085f, (K0.j) null);
        if (i3 != null) {
            final int i5 = 9;
            pVar2.i(new P1.b(i3) { // from class: U1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1501b;

                {
                    this.f1501b = i3;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    C1143e c1143e;
                    switch (i5) {
                        case 0:
                            I i52 = this.f1501b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1143e = i52.f1491a;
                            } catch (Throwable th) {
                                arrayList = C2.b.K(th);
                            }
                            if (c1143e == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1143e.b()));
                            eVar.n(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e = new C0084e(arrayList2, eVar, 4);
                            C1143e c1143e2 = this.f1501b.f1491a;
                            if (c1143e2 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                B0.g gVar = new B0.g(10, c0084e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1148j c1148j = new C1148j();
                                c1148j.f10095b = str;
                                c1143e2.f(gVar, c1148j);
                                return;
                            } catch (RuntimeException e3) {
                                c0084e.f1504c.n(C2.b.K(new C0082c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e2 = new C0084e(arrayList3, eVar, 5);
                            I i6 = this.f1501b;
                            if (i6.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                C1140b c1140b = new C1140b();
                                c1140b.f10054a = S0.a.M(vVar);
                                i6.f1491a.d(c1140b.a(), new B0.g(7, c0084e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0084e2.f1504c.n(C2.b.K(new C0082c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar2 = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e3 = new C0084e(arrayList4, eVar, 6);
                            C1143e c1143e3 = this.f1501b.f1491a;
                            if (c1143e3 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                String M2 = S0.a.M(vVar2);
                                B0.g gVar2 = new B0.g(9, c0084e3);
                                if (!c1143e3.b()) {
                                    C1147i c1147i = AbstractC1135O.f10026k;
                                    c1143e3.H(2, 11, c1147i);
                                    gVar2.onPurchaseHistoryResponse(c1147i, null);
                                } else if (C1143e.m(new CallableC1159u(c1143e3, M2, gVar2, 3), 30000L, new B.a(c1143e3, 14, gVar2), c1143e3.D(), c1143e3.q()) == null) {
                                    C1147i n3 = c1143e3.n();
                                    c1143e3.H(25, 11, n3);
                                    gVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0084e3.f1504c.n(C2.b.K(new C0082c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0084e c0084e4 = new C0084e(arrayList5, eVar, 7);
                            I i7 = this.f1501b;
                            if (i7.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                b0.r rVar = new b0.r();
                                rVar.j(S0.a.L(list));
                                i7.f1491a.c(rVar.h(), new B0.k(i7, 7, c0084e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0084e4.f1504c.n(C2.b.K(new C0082c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i8 = this.f1501b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i8.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = C2.b.K(th2);
                            }
                            eVar.n(arrayList6);
                            return;
                        case 6:
                            C0084e c0084e5 = new C0084e(new ArrayList(), eVar, 8);
                            C1143e c1143e4 = this.f1501b.f1491a;
                            if (c1143e4 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e4.i(new B0.g(12, c0084e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0084e5.f1504c.n(C2.b.K(new C0082c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0084e c0084e6 = new C0084e(new ArrayList(), eVar, 9);
                            I i9 = this.f1501b;
                            C1143e c1143e5 = i9.f1491a;
                            if (c1143e5 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            AbstractActivityC0029e abstractActivityC0029e = i9.f1493c;
                            if (abstractActivityC0029e == null) {
                                eVar.n(C2.b.K(new C0082c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1143e5.k(abstractActivityC0029e, new B0.g(13, c0084e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0084e6.f1504c.n(C2.b.K(new C0082c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0084e c0084e7 = new C0084e(new ArrayList(), eVar, 0);
                            C1143e c1143e6 = this.f1501b.f1491a;
                            if (c1143e6 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e6.g(new B0.g(8, c0084e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0084e7.f1504c.n(C2.b.K(new C0082c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i10 = this.f1501b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0088i enumC0088i = (EnumC0088i) arrayList8.get(1);
                            r rVar2 = (r) arrayList8.get(2);
                            C0084e c0084e8 = new C0084e(arrayList7, eVar, 1);
                            if (i10.f1491a == null) {
                                C0080a c0080a = i10.f1492b;
                                Context context = i10.f1494d;
                                C0.e eVar2 = i10.f1495e;
                                c0080a.getClass();
                                C1141c c1141c = new C1141c(context);
                                if (rVar2 != null && rVar2.f1544a.booleanValue()) {
                                    z = true;
                                }
                                c1141c.f10055a = new C0342b(z);
                                int ordinal = enumC0088i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1141c.f10059e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0088i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1141c.f10058d = new B0.k(c0080a, 3, eVar2);
                                    }
                                }
                                c1141c.f10057c = new C0178i(27, eVar2);
                                i10.f1491a = c1141c.a();
                            }
                            try {
                                i10.f1491a.l(new H(i10, c0084e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0084e8.f1504c.n(C2.b.K(new C0082c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i11 = this.f1501b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1143e c1143e7 = i11.f1491a;
                                if (c1143e7 != null) {
                                    c1143e7.a();
                                    i11.f1491a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = C2.b.K(th3);
                            }
                            eVar.n(arrayList9);
                            return;
                        case 11:
                            C0084e c0084e9 = new C0084e(new ArrayList(), eVar, 2);
                            C1143e c1143e8 = this.f1501b.f1491a;
                            if (c1143e8 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e8.h(new B0.g(14, c0084e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0084e9.f1504c.n(C2.b.K(new C0082c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i12 = this.f1501b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i12.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = C2.b.K(th4);
                            }
                            eVar.n(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e10 = new C0084e(arrayList11, eVar, 3);
                            C1143e c1143e9 = this.f1501b.f1491a;
                            if (c1143e9 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1140b c1140b2 = new C1140b();
                                c1140b2.f10054a = str2;
                                c1143e9.e(c1140b2, new B0.g(11, c0084e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0084e10.f1504c.n(C2.b.K(new C0082c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            pVar2.i(null);
        }
        B0.p pVar3 = new B0.p(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.endConnection", (P1.k) c0085f, (K0.j) null);
        if (i3 != null) {
            final int i6 = 10;
            pVar3.i(new P1.b(i3) { // from class: U1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1501b;

                {
                    this.f1501b = i3;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    C1143e c1143e;
                    switch (i6) {
                        case 0:
                            I i52 = this.f1501b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1143e = i52.f1491a;
                            } catch (Throwable th) {
                                arrayList = C2.b.K(th);
                            }
                            if (c1143e == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1143e.b()));
                            eVar.n(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e = new C0084e(arrayList2, eVar, 4);
                            C1143e c1143e2 = this.f1501b.f1491a;
                            if (c1143e2 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                B0.g gVar = new B0.g(10, c0084e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1148j c1148j = new C1148j();
                                c1148j.f10095b = str;
                                c1143e2.f(gVar, c1148j);
                                return;
                            } catch (RuntimeException e3) {
                                c0084e.f1504c.n(C2.b.K(new C0082c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e2 = new C0084e(arrayList3, eVar, 5);
                            I i62 = this.f1501b;
                            if (i62.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                C1140b c1140b = new C1140b();
                                c1140b.f10054a = S0.a.M(vVar);
                                i62.f1491a.d(c1140b.a(), new B0.g(7, c0084e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0084e2.f1504c.n(C2.b.K(new C0082c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar2 = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e3 = new C0084e(arrayList4, eVar, 6);
                            C1143e c1143e3 = this.f1501b.f1491a;
                            if (c1143e3 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                String M2 = S0.a.M(vVar2);
                                B0.g gVar2 = new B0.g(9, c0084e3);
                                if (!c1143e3.b()) {
                                    C1147i c1147i = AbstractC1135O.f10026k;
                                    c1143e3.H(2, 11, c1147i);
                                    gVar2.onPurchaseHistoryResponse(c1147i, null);
                                } else if (C1143e.m(new CallableC1159u(c1143e3, M2, gVar2, 3), 30000L, new B.a(c1143e3, 14, gVar2), c1143e3.D(), c1143e3.q()) == null) {
                                    C1147i n3 = c1143e3.n();
                                    c1143e3.H(25, 11, n3);
                                    gVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0084e3.f1504c.n(C2.b.K(new C0082c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0084e c0084e4 = new C0084e(arrayList5, eVar, 7);
                            I i7 = this.f1501b;
                            if (i7.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                b0.r rVar = new b0.r();
                                rVar.j(S0.a.L(list));
                                i7.f1491a.c(rVar.h(), new B0.k(i7, 7, c0084e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0084e4.f1504c.n(C2.b.K(new C0082c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i8 = this.f1501b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i8.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = C2.b.K(th2);
                            }
                            eVar.n(arrayList6);
                            return;
                        case 6:
                            C0084e c0084e5 = new C0084e(new ArrayList(), eVar, 8);
                            C1143e c1143e4 = this.f1501b.f1491a;
                            if (c1143e4 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e4.i(new B0.g(12, c0084e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0084e5.f1504c.n(C2.b.K(new C0082c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0084e c0084e6 = new C0084e(new ArrayList(), eVar, 9);
                            I i9 = this.f1501b;
                            C1143e c1143e5 = i9.f1491a;
                            if (c1143e5 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            AbstractActivityC0029e abstractActivityC0029e = i9.f1493c;
                            if (abstractActivityC0029e == null) {
                                eVar.n(C2.b.K(new C0082c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1143e5.k(abstractActivityC0029e, new B0.g(13, c0084e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0084e6.f1504c.n(C2.b.K(new C0082c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0084e c0084e7 = new C0084e(new ArrayList(), eVar, 0);
                            C1143e c1143e6 = this.f1501b.f1491a;
                            if (c1143e6 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e6.g(new B0.g(8, c0084e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0084e7.f1504c.n(C2.b.K(new C0082c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i10 = this.f1501b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0088i enumC0088i = (EnumC0088i) arrayList8.get(1);
                            r rVar2 = (r) arrayList8.get(2);
                            C0084e c0084e8 = new C0084e(arrayList7, eVar, 1);
                            if (i10.f1491a == null) {
                                C0080a c0080a = i10.f1492b;
                                Context context = i10.f1494d;
                                C0.e eVar2 = i10.f1495e;
                                c0080a.getClass();
                                C1141c c1141c = new C1141c(context);
                                if (rVar2 != null && rVar2.f1544a.booleanValue()) {
                                    z = true;
                                }
                                c1141c.f10055a = new C0342b(z);
                                int ordinal = enumC0088i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1141c.f10059e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0088i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1141c.f10058d = new B0.k(c0080a, 3, eVar2);
                                    }
                                }
                                c1141c.f10057c = new C0178i(27, eVar2);
                                i10.f1491a = c1141c.a();
                            }
                            try {
                                i10.f1491a.l(new H(i10, c0084e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0084e8.f1504c.n(C2.b.K(new C0082c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i11 = this.f1501b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1143e c1143e7 = i11.f1491a;
                                if (c1143e7 != null) {
                                    c1143e7.a();
                                    i11.f1491a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = C2.b.K(th3);
                            }
                            eVar.n(arrayList9);
                            return;
                        case 11:
                            C0084e c0084e9 = new C0084e(new ArrayList(), eVar, 2);
                            C1143e c1143e8 = this.f1501b.f1491a;
                            if (c1143e8 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e8.h(new B0.g(14, c0084e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0084e9.f1504c.n(C2.b.K(new C0082c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i12 = this.f1501b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i12.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = C2.b.K(th4);
                            }
                            eVar.n(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e10 = new C0084e(arrayList11, eVar, 3);
                            C1143e c1143e9 = this.f1501b.f1491a;
                            if (c1143e9 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1140b c1140b2 = new C1140b();
                                c1140b2.f10054a = str2;
                                c1143e9.e(c1140b2, new B0.g(11, c0084e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0084e10.f1504c.n(C2.b.K(new C0082c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            pVar3.i(null);
        }
        B0.p pVar4 = new B0.p(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.getBillingConfigAsync", (P1.k) c0085f, (K0.j) null);
        if (i3 != null) {
            final int i7 = 11;
            pVar4.i(new P1.b(i3) { // from class: U1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1501b;

                {
                    this.f1501b = i3;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    C1143e c1143e;
                    switch (i7) {
                        case 0:
                            I i52 = this.f1501b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1143e = i52.f1491a;
                            } catch (Throwable th) {
                                arrayList = C2.b.K(th);
                            }
                            if (c1143e == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1143e.b()));
                            eVar.n(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e = new C0084e(arrayList2, eVar, 4);
                            C1143e c1143e2 = this.f1501b.f1491a;
                            if (c1143e2 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                B0.g gVar = new B0.g(10, c0084e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1148j c1148j = new C1148j();
                                c1148j.f10095b = str;
                                c1143e2.f(gVar, c1148j);
                                return;
                            } catch (RuntimeException e3) {
                                c0084e.f1504c.n(C2.b.K(new C0082c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e2 = new C0084e(arrayList3, eVar, 5);
                            I i62 = this.f1501b;
                            if (i62.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                C1140b c1140b = new C1140b();
                                c1140b.f10054a = S0.a.M(vVar);
                                i62.f1491a.d(c1140b.a(), new B0.g(7, c0084e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0084e2.f1504c.n(C2.b.K(new C0082c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar2 = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e3 = new C0084e(arrayList4, eVar, 6);
                            C1143e c1143e3 = this.f1501b.f1491a;
                            if (c1143e3 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                String M2 = S0.a.M(vVar2);
                                B0.g gVar2 = new B0.g(9, c0084e3);
                                if (!c1143e3.b()) {
                                    C1147i c1147i = AbstractC1135O.f10026k;
                                    c1143e3.H(2, 11, c1147i);
                                    gVar2.onPurchaseHistoryResponse(c1147i, null);
                                } else if (C1143e.m(new CallableC1159u(c1143e3, M2, gVar2, 3), 30000L, new B.a(c1143e3, 14, gVar2), c1143e3.D(), c1143e3.q()) == null) {
                                    C1147i n3 = c1143e3.n();
                                    c1143e3.H(25, 11, n3);
                                    gVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0084e3.f1504c.n(C2.b.K(new C0082c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0084e c0084e4 = new C0084e(arrayList5, eVar, 7);
                            I i72 = this.f1501b;
                            if (i72.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                b0.r rVar = new b0.r();
                                rVar.j(S0.a.L(list));
                                i72.f1491a.c(rVar.h(), new B0.k(i72, 7, c0084e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0084e4.f1504c.n(C2.b.K(new C0082c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i8 = this.f1501b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i8.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = C2.b.K(th2);
                            }
                            eVar.n(arrayList6);
                            return;
                        case 6:
                            C0084e c0084e5 = new C0084e(new ArrayList(), eVar, 8);
                            C1143e c1143e4 = this.f1501b.f1491a;
                            if (c1143e4 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e4.i(new B0.g(12, c0084e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0084e5.f1504c.n(C2.b.K(new C0082c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0084e c0084e6 = new C0084e(new ArrayList(), eVar, 9);
                            I i9 = this.f1501b;
                            C1143e c1143e5 = i9.f1491a;
                            if (c1143e5 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            AbstractActivityC0029e abstractActivityC0029e = i9.f1493c;
                            if (abstractActivityC0029e == null) {
                                eVar.n(C2.b.K(new C0082c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1143e5.k(abstractActivityC0029e, new B0.g(13, c0084e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0084e6.f1504c.n(C2.b.K(new C0082c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0084e c0084e7 = new C0084e(new ArrayList(), eVar, 0);
                            C1143e c1143e6 = this.f1501b.f1491a;
                            if (c1143e6 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e6.g(new B0.g(8, c0084e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0084e7.f1504c.n(C2.b.K(new C0082c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i10 = this.f1501b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0088i enumC0088i = (EnumC0088i) arrayList8.get(1);
                            r rVar2 = (r) arrayList8.get(2);
                            C0084e c0084e8 = new C0084e(arrayList7, eVar, 1);
                            if (i10.f1491a == null) {
                                C0080a c0080a = i10.f1492b;
                                Context context = i10.f1494d;
                                C0.e eVar2 = i10.f1495e;
                                c0080a.getClass();
                                C1141c c1141c = new C1141c(context);
                                if (rVar2 != null && rVar2.f1544a.booleanValue()) {
                                    z = true;
                                }
                                c1141c.f10055a = new C0342b(z);
                                int ordinal = enumC0088i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1141c.f10059e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0088i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1141c.f10058d = new B0.k(c0080a, 3, eVar2);
                                    }
                                }
                                c1141c.f10057c = new C0178i(27, eVar2);
                                i10.f1491a = c1141c.a();
                            }
                            try {
                                i10.f1491a.l(new H(i10, c0084e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0084e8.f1504c.n(C2.b.K(new C0082c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i11 = this.f1501b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1143e c1143e7 = i11.f1491a;
                                if (c1143e7 != null) {
                                    c1143e7.a();
                                    i11.f1491a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = C2.b.K(th3);
                            }
                            eVar.n(arrayList9);
                            return;
                        case 11:
                            C0084e c0084e9 = new C0084e(new ArrayList(), eVar, 2);
                            C1143e c1143e8 = this.f1501b.f1491a;
                            if (c1143e8 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e8.h(new B0.g(14, c0084e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0084e9.f1504c.n(C2.b.K(new C0082c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i12 = this.f1501b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i12.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = C2.b.K(th4);
                            }
                            eVar.n(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e10 = new C0084e(arrayList11, eVar, 3);
                            C1143e c1143e9 = this.f1501b.f1491a;
                            if (c1143e9 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1140b c1140b2 = new C1140b();
                                c1140b2.f10054a = str2;
                                c1143e9.e(c1140b2, new B0.g(11, c0084e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0084e10.f1504c.n(C2.b.K(new C0082c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            pVar4.i(null);
        }
        B0.p pVar5 = new B0.p(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.launchBillingFlow", (P1.k) c0085f, (K0.j) null);
        if (i3 != null) {
            final int i8 = 12;
            pVar5.i(new P1.b(i3) { // from class: U1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1501b;

                {
                    this.f1501b = i3;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    C1143e c1143e;
                    switch (i8) {
                        case 0:
                            I i52 = this.f1501b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1143e = i52.f1491a;
                            } catch (Throwable th) {
                                arrayList = C2.b.K(th);
                            }
                            if (c1143e == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1143e.b()));
                            eVar.n(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e = new C0084e(arrayList2, eVar, 4);
                            C1143e c1143e2 = this.f1501b.f1491a;
                            if (c1143e2 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                B0.g gVar = new B0.g(10, c0084e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1148j c1148j = new C1148j();
                                c1148j.f10095b = str;
                                c1143e2.f(gVar, c1148j);
                                return;
                            } catch (RuntimeException e3) {
                                c0084e.f1504c.n(C2.b.K(new C0082c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e2 = new C0084e(arrayList3, eVar, 5);
                            I i62 = this.f1501b;
                            if (i62.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                C1140b c1140b = new C1140b();
                                c1140b.f10054a = S0.a.M(vVar);
                                i62.f1491a.d(c1140b.a(), new B0.g(7, c0084e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0084e2.f1504c.n(C2.b.K(new C0082c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar2 = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e3 = new C0084e(arrayList4, eVar, 6);
                            C1143e c1143e3 = this.f1501b.f1491a;
                            if (c1143e3 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                String M2 = S0.a.M(vVar2);
                                B0.g gVar2 = new B0.g(9, c0084e3);
                                if (!c1143e3.b()) {
                                    C1147i c1147i = AbstractC1135O.f10026k;
                                    c1143e3.H(2, 11, c1147i);
                                    gVar2.onPurchaseHistoryResponse(c1147i, null);
                                } else if (C1143e.m(new CallableC1159u(c1143e3, M2, gVar2, 3), 30000L, new B.a(c1143e3, 14, gVar2), c1143e3.D(), c1143e3.q()) == null) {
                                    C1147i n3 = c1143e3.n();
                                    c1143e3.H(25, 11, n3);
                                    gVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0084e3.f1504c.n(C2.b.K(new C0082c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0084e c0084e4 = new C0084e(arrayList5, eVar, 7);
                            I i72 = this.f1501b;
                            if (i72.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                b0.r rVar = new b0.r();
                                rVar.j(S0.a.L(list));
                                i72.f1491a.c(rVar.h(), new B0.k(i72, 7, c0084e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0084e4.f1504c.n(C2.b.K(new C0082c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i82 = this.f1501b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i82.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = C2.b.K(th2);
                            }
                            eVar.n(arrayList6);
                            return;
                        case 6:
                            C0084e c0084e5 = new C0084e(new ArrayList(), eVar, 8);
                            C1143e c1143e4 = this.f1501b.f1491a;
                            if (c1143e4 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e4.i(new B0.g(12, c0084e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0084e5.f1504c.n(C2.b.K(new C0082c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0084e c0084e6 = new C0084e(new ArrayList(), eVar, 9);
                            I i9 = this.f1501b;
                            C1143e c1143e5 = i9.f1491a;
                            if (c1143e5 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            AbstractActivityC0029e abstractActivityC0029e = i9.f1493c;
                            if (abstractActivityC0029e == null) {
                                eVar.n(C2.b.K(new C0082c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1143e5.k(abstractActivityC0029e, new B0.g(13, c0084e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0084e6.f1504c.n(C2.b.K(new C0082c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0084e c0084e7 = new C0084e(new ArrayList(), eVar, 0);
                            C1143e c1143e6 = this.f1501b.f1491a;
                            if (c1143e6 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e6.g(new B0.g(8, c0084e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0084e7.f1504c.n(C2.b.K(new C0082c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i10 = this.f1501b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0088i enumC0088i = (EnumC0088i) arrayList8.get(1);
                            r rVar2 = (r) arrayList8.get(2);
                            C0084e c0084e8 = new C0084e(arrayList7, eVar, 1);
                            if (i10.f1491a == null) {
                                C0080a c0080a = i10.f1492b;
                                Context context = i10.f1494d;
                                C0.e eVar2 = i10.f1495e;
                                c0080a.getClass();
                                C1141c c1141c = new C1141c(context);
                                if (rVar2 != null && rVar2.f1544a.booleanValue()) {
                                    z = true;
                                }
                                c1141c.f10055a = new C0342b(z);
                                int ordinal = enumC0088i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1141c.f10059e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0088i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1141c.f10058d = new B0.k(c0080a, 3, eVar2);
                                    }
                                }
                                c1141c.f10057c = new C0178i(27, eVar2);
                                i10.f1491a = c1141c.a();
                            }
                            try {
                                i10.f1491a.l(new H(i10, c0084e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0084e8.f1504c.n(C2.b.K(new C0082c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i11 = this.f1501b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1143e c1143e7 = i11.f1491a;
                                if (c1143e7 != null) {
                                    c1143e7.a();
                                    i11.f1491a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = C2.b.K(th3);
                            }
                            eVar.n(arrayList9);
                            return;
                        case 11:
                            C0084e c0084e9 = new C0084e(new ArrayList(), eVar, 2);
                            C1143e c1143e8 = this.f1501b.f1491a;
                            if (c1143e8 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e8.h(new B0.g(14, c0084e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0084e9.f1504c.n(C2.b.K(new C0082c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i12 = this.f1501b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i12.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = C2.b.K(th4);
                            }
                            eVar.n(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e10 = new C0084e(arrayList11, eVar, 3);
                            C1143e c1143e9 = this.f1501b.f1491a;
                            if (c1143e9 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1140b c1140b2 = new C1140b();
                                c1140b2.f10054a = str2;
                                c1143e9.e(c1140b2, new B0.g(11, c0084e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0084e10.f1504c.n(C2.b.K(new C0082c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            pVar5.i(null);
        }
        B0.p pVar6 = new B0.p(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.acknowledgePurchase", (P1.k) c0085f, (K0.j) null);
        if (i3 != null) {
            final int i9 = 13;
            pVar6.i(new P1.b(i3) { // from class: U1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1501b;

                {
                    this.f1501b = i3;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    C1143e c1143e;
                    switch (i9) {
                        case 0:
                            I i52 = this.f1501b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1143e = i52.f1491a;
                            } catch (Throwable th) {
                                arrayList = C2.b.K(th);
                            }
                            if (c1143e == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1143e.b()));
                            eVar.n(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e = new C0084e(arrayList2, eVar, 4);
                            C1143e c1143e2 = this.f1501b.f1491a;
                            if (c1143e2 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                B0.g gVar = new B0.g(10, c0084e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1148j c1148j = new C1148j();
                                c1148j.f10095b = str;
                                c1143e2.f(gVar, c1148j);
                                return;
                            } catch (RuntimeException e3) {
                                c0084e.f1504c.n(C2.b.K(new C0082c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e2 = new C0084e(arrayList3, eVar, 5);
                            I i62 = this.f1501b;
                            if (i62.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                C1140b c1140b = new C1140b();
                                c1140b.f10054a = S0.a.M(vVar);
                                i62.f1491a.d(c1140b.a(), new B0.g(7, c0084e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0084e2.f1504c.n(C2.b.K(new C0082c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar2 = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e3 = new C0084e(arrayList4, eVar, 6);
                            C1143e c1143e3 = this.f1501b.f1491a;
                            if (c1143e3 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                String M2 = S0.a.M(vVar2);
                                B0.g gVar2 = new B0.g(9, c0084e3);
                                if (!c1143e3.b()) {
                                    C1147i c1147i = AbstractC1135O.f10026k;
                                    c1143e3.H(2, 11, c1147i);
                                    gVar2.onPurchaseHistoryResponse(c1147i, null);
                                } else if (C1143e.m(new CallableC1159u(c1143e3, M2, gVar2, 3), 30000L, new B.a(c1143e3, 14, gVar2), c1143e3.D(), c1143e3.q()) == null) {
                                    C1147i n3 = c1143e3.n();
                                    c1143e3.H(25, 11, n3);
                                    gVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0084e3.f1504c.n(C2.b.K(new C0082c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0084e c0084e4 = new C0084e(arrayList5, eVar, 7);
                            I i72 = this.f1501b;
                            if (i72.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                b0.r rVar = new b0.r();
                                rVar.j(S0.a.L(list));
                                i72.f1491a.c(rVar.h(), new B0.k(i72, 7, c0084e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0084e4.f1504c.n(C2.b.K(new C0082c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i82 = this.f1501b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i82.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = C2.b.K(th2);
                            }
                            eVar.n(arrayList6);
                            return;
                        case 6:
                            C0084e c0084e5 = new C0084e(new ArrayList(), eVar, 8);
                            C1143e c1143e4 = this.f1501b.f1491a;
                            if (c1143e4 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e4.i(new B0.g(12, c0084e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0084e5.f1504c.n(C2.b.K(new C0082c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0084e c0084e6 = new C0084e(new ArrayList(), eVar, 9);
                            I i92 = this.f1501b;
                            C1143e c1143e5 = i92.f1491a;
                            if (c1143e5 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            AbstractActivityC0029e abstractActivityC0029e = i92.f1493c;
                            if (abstractActivityC0029e == null) {
                                eVar.n(C2.b.K(new C0082c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1143e5.k(abstractActivityC0029e, new B0.g(13, c0084e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0084e6.f1504c.n(C2.b.K(new C0082c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0084e c0084e7 = new C0084e(new ArrayList(), eVar, 0);
                            C1143e c1143e6 = this.f1501b.f1491a;
                            if (c1143e6 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e6.g(new B0.g(8, c0084e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0084e7.f1504c.n(C2.b.K(new C0082c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i10 = this.f1501b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0088i enumC0088i = (EnumC0088i) arrayList8.get(1);
                            r rVar2 = (r) arrayList8.get(2);
                            C0084e c0084e8 = new C0084e(arrayList7, eVar, 1);
                            if (i10.f1491a == null) {
                                C0080a c0080a = i10.f1492b;
                                Context context = i10.f1494d;
                                C0.e eVar2 = i10.f1495e;
                                c0080a.getClass();
                                C1141c c1141c = new C1141c(context);
                                if (rVar2 != null && rVar2.f1544a.booleanValue()) {
                                    z = true;
                                }
                                c1141c.f10055a = new C0342b(z);
                                int ordinal = enumC0088i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1141c.f10059e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0088i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1141c.f10058d = new B0.k(c0080a, 3, eVar2);
                                    }
                                }
                                c1141c.f10057c = new C0178i(27, eVar2);
                                i10.f1491a = c1141c.a();
                            }
                            try {
                                i10.f1491a.l(new H(i10, c0084e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0084e8.f1504c.n(C2.b.K(new C0082c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i11 = this.f1501b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1143e c1143e7 = i11.f1491a;
                                if (c1143e7 != null) {
                                    c1143e7.a();
                                    i11.f1491a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = C2.b.K(th3);
                            }
                            eVar.n(arrayList9);
                            return;
                        case 11:
                            C0084e c0084e9 = new C0084e(new ArrayList(), eVar, 2);
                            C1143e c1143e8 = this.f1501b.f1491a;
                            if (c1143e8 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e8.h(new B0.g(14, c0084e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0084e9.f1504c.n(C2.b.K(new C0082c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i12 = this.f1501b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i12.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = C2.b.K(th4);
                            }
                            eVar.n(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e10 = new C0084e(arrayList11, eVar, 3);
                            C1143e c1143e9 = this.f1501b.f1491a;
                            if (c1143e9 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1140b c1140b2 = new C1140b();
                                c1140b2.f10054a = str2;
                                c1143e9.e(c1140b2, new B0.g(11, c0084e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0084e10.f1504c.n(C2.b.K(new C0082c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            pVar6.i(null);
        }
        B0.p pVar7 = new B0.p(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.consumeAsync", (P1.k) c0085f, (K0.j) null);
        if (i3 != null) {
            final int i10 = 1;
            pVar7.i(new P1.b(i3) { // from class: U1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1501b;

                {
                    this.f1501b = i3;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    C1143e c1143e;
                    switch (i10) {
                        case 0:
                            I i52 = this.f1501b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1143e = i52.f1491a;
                            } catch (Throwable th) {
                                arrayList = C2.b.K(th);
                            }
                            if (c1143e == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1143e.b()));
                            eVar.n(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e = new C0084e(arrayList2, eVar, 4);
                            C1143e c1143e2 = this.f1501b.f1491a;
                            if (c1143e2 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                B0.g gVar = new B0.g(10, c0084e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1148j c1148j = new C1148j();
                                c1148j.f10095b = str;
                                c1143e2.f(gVar, c1148j);
                                return;
                            } catch (RuntimeException e3) {
                                c0084e.f1504c.n(C2.b.K(new C0082c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e2 = new C0084e(arrayList3, eVar, 5);
                            I i62 = this.f1501b;
                            if (i62.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                C1140b c1140b = new C1140b();
                                c1140b.f10054a = S0.a.M(vVar);
                                i62.f1491a.d(c1140b.a(), new B0.g(7, c0084e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0084e2.f1504c.n(C2.b.K(new C0082c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar2 = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e3 = new C0084e(arrayList4, eVar, 6);
                            C1143e c1143e3 = this.f1501b.f1491a;
                            if (c1143e3 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                String M2 = S0.a.M(vVar2);
                                B0.g gVar2 = new B0.g(9, c0084e3);
                                if (!c1143e3.b()) {
                                    C1147i c1147i = AbstractC1135O.f10026k;
                                    c1143e3.H(2, 11, c1147i);
                                    gVar2.onPurchaseHistoryResponse(c1147i, null);
                                } else if (C1143e.m(new CallableC1159u(c1143e3, M2, gVar2, 3), 30000L, new B.a(c1143e3, 14, gVar2), c1143e3.D(), c1143e3.q()) == null) {
                                    C1147i n3 = c1143e3.n();
                                    c1143e3.H(25, 11, n3);
                                    gVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0084e3.f1504c.n(C2.b.K(new C0082c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0084e c0084e4 = new C0084e(arrayList5, eVar, 7);
                            I i72 = this.f1501b;
                            if (i72.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                b0.r rVar = new b0.r();
                                rVar.j(S0.a.L(list));
                                i72.f1491a.c(rVar.h(), new B0.k(i72, 7, c0084e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0084e4.f1504c.n(C2.b.K(new C0082c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i82 = this.f1501b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i82.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = C2.b.K(th2);
                            }
                            eVar.n(arrayList6);
                            return;
                        case 6:
                            C0084e c0084e5 = new C0084e(new ArrayList(), eVar, 8);
                            C1143e c1143e4 = this.f1501b.f1491a;
                            if (c1143e4 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e4.i(new B0.g(12, c0084e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0084e5.f1504c.n(C2.b.K(new C0082c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0084e c0084e6 = new C0084e(new ArrayList(), eVar, 9);
                            I i92 = this.f1501b;
                            C1143e c1143e5 = i92.f1491a;
                            if (c1143e5 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            AbstractActivityC0029e abstractActivityC0029e = i92.f1493c;
                            if (abstractActivityC0029e == null) {
                                eVar.n(C2.b.K(new C0082c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1143e5.k(abstractActivityC0029e, new B0.g(13, c0084e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0084e6.f1504c.n(C2.b.K(new C0082c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0084e c0084e7 = new C0084e(new ArrayList(), eVar, 0);
                            C1143e c1143e6 = this.f1501b.f1491a;
                            if (c1143e6 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e6.g(new B0.g(8, c0084e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0084e7.f1504c.n(C2.b.K(new C0082c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i102 = this.f1501b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0088i enumC0088i = (EnumC0088i) arrayList8.get(1);
                            r rVar2 = (r) arrayList8.get(2);
                            C0084e c0084e8 = new C0084e(arrayList7, eVar, 1);
                            if (i102.f1491a == null) {
                                C0080a c0080a = i102.f1492b;
                                Context context = i102.f1494d;
                                C0.e eVar2 = i102.f1495e;
                                c0080a.getClass();
                                C1141c c1141c = new C1141c(context);
                                if (rVar2 != null && rVar2.f1544a.booleanValue()) {
                                    z = true;
                                }
                                c1141c.f10055a = new C0342b(z);
                                int ordinal = enumC0088i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1141c.f10059e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0088i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1141c.f10058d = new B0.k(c0080a, 3, eVar2);
                                    }
                                }
                                c1141c.f10057c = new C0178i(27, eVar2);
                                i102.f1491a = c1141c.a();
                            }
                            try {
                                i102.f1491a.l(new H(i102, c0084e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0084e8.f1504c.n(C2.b.K(new C0082c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i11 = this.f1501b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1143e c1143e7 = i11.f1491a;
                                if (c1143e7 != null) {
                                    c1143e7.a();
                                    i11.f1491a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = C2.b.K(th3);
                            }
                            eVar.n(arrayList9);
                            return;
                        case 11:
                            C0084e c0084e9 = new C0084e(new ArrayList(), eVar, 2);
                            C1143e c1143e8 = this.f1501b.f1491a;
                            if (c1143e8 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e8.h(new B0.g(14, c0084e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0084e9.f1504c.n(C2.b.K(new C0082c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i12 = this.f1501b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i12.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = C2.b.K(th4);
                            }
                            eVar.n(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e10 = new C0084e(arrayList11, eVar, 3);
                            C1143e c1143e9 = this.f1501b.f1491a;
                            if (c1143e9 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1140b c1140b2 = new C1140b();
                                c1140b2.f10054a = str2;
                                c1143e9.e(c1140b2, new B0.g(11, c0084e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0084e10.f1504c.n(C2.b.K(new C0082c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            pVar7.i(null);
        }
        B0.p pVar8 = new B0.p(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryPurchasesAsync", (P1.k) c0085f, (K0.j) null);
        if (i3 != null) {
            final int i11 = 2;
            pVar8.i(new P1.b(i3) { // from class: U1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1501b;

                {
                    this.f1501b = i3;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    C1143e c1143e;
                    switch (i11) {
                        case 0:
                            I i52 = this.f1501b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1143e = i52.f1491a;
                            } catch (Throwable th) {
                                arrayList = C2.b.K(th);
                            }
                            if (c1143e == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1143e.b()));
                            eVar.n(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e = new C0084e(arrayList2, eVar, 4);
                            C1143e c1143e2 = this.f1501b.f1491a;
                            if (c1143e2 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                B0.g gVar = new B0.g(10, c0084e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1148j c1148j = new C1148j();
                                c1148j.f10095b = str;
                                c1143e2.f(gVar, c1148j);
                                return;
                            } catch (RuntimeException e3) {
                                c0084e.f1504c.n(C2.b.K(new C0082c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e2 = new C0084e(arrayList3, eVar, 5);
                            I i62 = this.f1501b;
                            if (i62.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                C1140b c1140b = new C1140b();
                                c1140b.f10054a = S0.a.M(vVar);
                                i62.f1491a.d(c1140b.a(), new B0.g(7, c0084e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0084e2.f1504c.n(C2.b.K(new C0082c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar2 = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e3 = new C0084e(arrayList4, eVar, 6);
                            C1143e c1143e3 = this.f1501b.f1491a;
                            if (c1143e3 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                String M2 = S0.a.M(vVar2);
                                B0.g gVar2 = new B0.g(9, c0084e3);
                                if (!c1143e3.b()) {
                                    C1147i c1147i = AbstractC1135O.f10026k;
                                    c1143e3.H(2, 11, c1147i);
                                    gVar2.onPurchaseHistoryResponse(c1147i, null);
                                } else if (C1143e.m(new CallableC1159u(c1143e3, M2, gVar2, 3), 30000L, new B.a(c1143e3, 14, gVar2), c1143e3.D(), c1143e3.q()) == null) {
                                    C1147i n3 = c1143e3.n();
                                    c1143e3.H(25, 11, n3);
                                    gVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0084e3.f1504c.n(C2.b.K(new C0082c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0084e c0084e4 = new C0084e(arrayList5, eVar, 7);
                            I i72 = this.f1501b;
                            if (i72.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                b0.r rVar = new b0.r();
                                rVar.j(S0.a.L(list));
                                i72.f1491a.c(rVar.h(), new B0.k(i72, 7, c0084e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0084e4.f1504c.n(C2.b.K(new C0082c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i82 = this.f1501b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i82.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = C2.b.K(th2);
                            }
                            eVar.n(arrayList6);
                            return;
                        case 6:
                            C0084e c0084e5 = new C0084e(new ArrayList(), eVar, 8);
                            C1143e c1143e4 = this.f1501b.f1491a;
                            if (c1143e4 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e4.i(new B0.g(12, c0084e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0084e5.f1504c.n(C2.b.K(new C0082c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0084e c0084e6 = new C0084e(new ArrayList(), eVar, 9);
                            I i92 = this.f1501b;
                            C1143e c1143e5 = i92.f1491a;
                            if (c1143e5 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            AbstractActivityC0029e abstractActivityC0029e = i92.f1493c;
                            if (abstractActivityC0029e == null) {
                                eVar.n(C2.b.K(new C0082c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1143e5.k(abstractActivityC0029e, new B0.g(13, c0084e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0084e6.f1504c.n(C2.b.K(new C0082c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0084e c0084e7 = new C0084e(new ArrayList(), eVar, 0);
                            C1143e c1143e6 = this.f1501b.f1491a;
                            if (c1143e6 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e6.g(new B0.g(8, c0084e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0084e7.f1504c.n(C2.b.K(new C0082c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i102 = this.f1501b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0088i enumC0088i = (EnumC0088i) arrayList8.get(1);
                            r rVar2 = (r) arrayList8.get(2);
                            C0084e c0084e8 = new C0084e(arrayList7, eVar, 1);
                            if (i102.f1491a == null) {
                                C0080a c0080a = i102.f1492b;
                                Context context = i102.f1494d;
                                C0.e eVar2 = i102.f1495e;
                                c0080a.getClass();
                                C1141c c1141c = new C1141c(context);
                                if (rVar2 != null && rVar2.f1544a.booleanValue()) {
                                    z = true;
                                }
                                c1141c.f10055a = new C0342b(z);
                                int ordinal = enumC0088i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1141c.f10059e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0088i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1141c.f10058d = new B0.k(c0080a, 3, eVar2);
                                    }
                                }
                                c1141c.f10057c = new C0178i(27, eVar2);
                                i102.f1491a = c1141c.a();
                            }
                            try {
                                i102.f1491a.l(new H(i102, c0084e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0084e8.f1504c.n(C2.b.K(new C0082c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i112 = this.f1501b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1143e c1143e7 = i112.f1491a;
                                if (c1143e7 != null) {
                                    c1143e7.a();
                                    i112.f1491a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = C2.b.K(th3);
                            }
                            eVar.n(arrayList9);
                            return;
                        case 11:
                            C0084e c0084e9 = new C0084e(new ArrayList(), eVar, 2);
                            C1143e c1143e8 = this.f1501b.f1491a;
                            if (c1143e8 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e8.h(new B0.g(14, c0084e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0084e9.f1504c.n(C2.b.K(new C0082c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i12 = this.f1501b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i12.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = C2.b.K(th4);
                            }
                            eVar.n(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e10 = new C0084e(arrayList11, eVar, 3);
                            C1143e c1143e9 = this.f1501b.f1491a;
                            if (c1143e9 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1140b c1140b2 = new C1140b();
                                c1140b2.f10054a = str2;
                                c1143e9.e(c1140b2, new B0.g(11, c0084e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0084e10.f1504c.n(C2.b.K(new C0082c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            pVar8.i(null);
        }
        B0.p pVar9 = new B0.p(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryPurchaseHistoryAsync", (P1.k) c0085f, (K0.j) null);
        if (i3 != null) {
            final int i12 = 3;
            pVar9.i(new P1.b(i3) { // from class: U1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1501b;

                {
                    this.f1501b = i3;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    C1143e c1143e;
                    switch (i12) {
                        case 0:
                            I i52 = this.f1501b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1143e = i52.f1491a;
                            } catch (Throwable th) {
                                arrayList = C2.b.K(th);
                            }
                            if (c1143e == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1143e.b()));
                            eVar.n(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e = new C0084e(arrayList2, eVar, 4);
                            C1143e c1143e2 = this.f1501b.f1491a;
                            if (c1143e2 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                B0.g gVar = new B0.g(10, c0084e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1148j c1148j = new C1148j();
                                c1148j.f10095b = str;
                                c1143e2.f(gVar, c1148j);
                                return;
                            } catch (RuntimeException e3) {
                                c0084e.f1504c.n(C2.b.K(new C0082c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e2 = new C0084e(arrayList3, eVar, 5);
                            I i62 = this.f1501b;
                            if (i62.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                C1140b c1140b = new C1140b();
                                c1140b.f10054a = S0.a.M(vVar);
                                i62.f1491a.d(c1140b.a(), new B0.g(7, c0084e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0084e2.f1504c.n(C2.b.K(new C0082c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar2 = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e3 = new C0084e(arrayList4, eVar, 6);
                            C1143e c1143e3 = this.f1501b.f1491a;
                            if (c1143e3 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                String M2 = S0.a.M(vVar2);
                                B0.g gVar2 = new B0.g(9, c0084e3);
                                if (!c1143e3.b()) {
                                    C1147i c1147i = AbstractC1135O.f10026k;
                                    c1143e3.H(2, 11, c1147i);
                                    gVar2.onPurchaseHistoryResponse(c1147i, null);
                                } else if (C1143e.m(new CallableC1159u(c1143e3, M2, gVar2, 3), 30000L, new B.a(c1143e3, 14, gVar2), c1143e3.D(), c1143e3.q()) == null) {
                                    C1147i n3 = c1143e3.n();
                                    c1143e3.H(25, 11, n3);
                                    gVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0084e3.f1504c.n(C2.b.K(new C0082c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0084e c0084e4 = new C0084e(arrayList5, eVar, 7);
                            I i72 = this.f1501b;
                            if (i72.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                b0.r rVar = new b0.r();
                                rVar.j(S0.a.L(list));
                                i72.f1491a.c(rVar.h(), new B0.k(i72, 7, c0084e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0084e4.f1504c.n(C2.b.K(new C0082c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i82 = this.f1501b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i82.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = C2.b.K(th2);
                            }
                            eVar.n(arrayList6);
                            return;
                        case 6:
                            C0084e c0084e5 = new C0084e(new ArrayList(), eVar, 8);
                            C1143e c1143e4 = this.f1501b.f1491a;
                            if (c1143e4 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e4.i(new B0.g(12, c0084e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0084e5.f1504c.n(C2.b.K(new C0082c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0084e c0084e6 = new C0084e(new ArrayList(), eVar, 9);
                            I i92 = this.f1501b;
                            C1143e c1143e5 = i92.f1491a;
                            if (c1143e5 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            AbstractActivityC0029e abstractActivityC0029e = i92.f1493c;
                            if (abstractActivityC0029e == null) {
                                eVar.n(C2.b.K(new C0082c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1143e5.k(abstractActivityC0029e, new B0.g(13, c0084e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0084e6.f1504c.n(C2.b.K(new C0082c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0084e c0084e7 = new C0084e(new ArrayList(), eVar, 0);
                            C1143e c1143e6 = this.f1501b.f1491a;
                            if (c1143e6 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e6.g(new B0.g(8, c0084e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0084e7.f1504c.n(C2.b.K(new C0082c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i102 = this.f1501b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0088i enumC0088i = (EnumC0088i) arrayList8.get(1);
                            r rVar2 = (r) arrayList8.get(2);
                            C0084e c0084e8 = new C0084e(arrayList7, eVar, 1);
                            if (i102.f1491a == null) {
                                C0080a c0080a = i102.f1492b;
                                Context context = i102.f1494d;
                                C0.e eVar2 = i102.f1495e;
                                c0080a.getClass();
                                C1141c c1141c = new C1141c(context);
                                if (rVar2 != null && rVar2.f1544a.booleanValue()) {
                                    z = true;
                                }
                                c1141c.f10055a = new C0342b(z);
                                int ordinal = enumC0088i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1141c.f10059e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0088i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1141c.f10058d = new B0.k(c0080a, 3, eVar2);
                                    }
                                }
                                c1141c.f10057c = new C0178i(27, eVar2);
                                i102.f1491a = c1141c.a();
                            }
                            try {
                                i102.f1491a.l(new H(i102, c0084e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0084e8.f1504c.n(C2.b.K(new C0082c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i112 = this.f1501b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1143e c1143e7 = i112.f1491a;
                                if (c1143e7 != null) {
                                    c1143e7.a();
                                    i112.f1491a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = C2.b.K(th3);
                            }
                            eVar.n(arrayList9);
                            return;
                        case 11:
                            C0084e c0084e9 = new C0084e(new ArrayList(), eVar, 2);
                            C1143e c1143e8 = this.f1501b.f1491a;
                            if (c1143e8 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e8.h(new B0.g(14, c0084e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0084e9.f1504c.n(C2.b.K(new C0082c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i122 = this.f1501b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i122.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = C2.b.K(th4);
                            }
                            eVar.n(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e10 = new C0084e(arrayList11, eVar, 3);
                            C1143e c1143e9 = this.f1501b.f1491a;
                            if (c1143e9 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1140b c1140b2 = new C1140b();
                                c1140b2.f10054a = str2;
                                c1143e9.e(c1140b2, new B0.g(11, c0084e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0084e10.f1504c.n(C2.b.K(new C0082c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            pVar9.i(null);
        }
        B0.p pVar10 = new B0.p(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryProductDetailsAsync", (P1.k) c0085f, (K0.j) null);
        if (i3 != null) {
            final int i13 = 4;
            pVar10.i(new P1.b(i3) { // from class: U1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1501b;

                {
                    this.f1501b = i3;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    C1143e c1143e;
                    switch (i13) {
                        case 0:
                            I i52 = this.f1501b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1143e = i52.f1491a;
                            } catch (Throwable th) {
                                arrayList = C2.b.K(th);
                            }
                            if (c1143e == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1143e.b()));
                            eVar.n(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e = new C0084e(arrayList2, eVar, 4);
                            C1143e c1143e2 = this.f1501b.f1491a;
                            if (c1143e2 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                B0.g gVar = new B0.g(10, c0084e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1148j c1148j = new C1148j();
                                c1148j.f10095b = str;
                                c1143e2.f(gVar, c1148j);
                                return;
                            } catch (RuntimeException e3) {
                                c0084e.f1504c.n(C2.b.K(new C0082c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e2 = new C0084e(arrayList3, eVar, 5);
                            I i62 = this.f1501b;
                            if (i62.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                C1140b c1140b = new C1140b();
                                c1140b.f10054a = S0.a.M(vVar);
                                i62.f1491a.d(c1140b.a(), new B0.g(7, c0084e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0084e2.f1504c.n(C2.b.K(new C0082c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar2 = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e3 = new C0084e(arrayList4, eVar, 6);
                            C1143e c1143e3 = this.f1501b.f1491a;
                            if (c1143e3 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                String M2 = S0.a.M(vVar2);
                                B0.g gVar2 = new B0.g(9, c0084e3);
                                if (!c1143e3.b()) {
                                    C1147i c1147i = AbstractC1135O.f10026k;
                                    c1143e3.H(2, 11, c1147i);
                                    gVar2.onPurchaseHistoryResponse(c1147i, null);
                                } else if (C1143e.m(new CallableC1159u(c1143e3, M2, gVar2, 3), 30000L, new B.a(c1143e3, 14, gVar2), c1143e3.D(), c1143e3.q()) == null) {
                                    C1147i n3 = c1143e3.n();
                                    c1143e3.H(25, 11, n3);
                                    gVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0084e3.f1504c.n(C2.b.K(new C0082c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0084e c0084e4 = new C0084e(arrayList5, eVar, 7);
                            I i72 = this.f1501b;
                            if (i72.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                b0.r rVar = new b0.r();
                                rVar.j(S0.a.L(list));
                                i72.f1491a.c(rVar.h(), new B0.k(i72, 7, c0084e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0084e4.f1504c.n(C2.b.K(new C0082c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i82 = this.f1501b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i82.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = C2.b.K(th2);
                            }
                            eVar.n(arrayList6);
                            return;
                        case 6:
                            C0084e c0084e5 = new C0084e(new ArrayList(), eVar, 8);
                            C1143e c1143e4 = this.f1501b.f1491a;
                            if (c1143e4 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e4.i(new B0.g(12, c0084e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0084e5.f1504c.n(C2.b.K(new C0082c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0084e c0084e6 = new C0084e(new ArrayList(), eVar, 9);
                            I i92 = this.f1501b;
                            C1143e c1143e5 = i92.f1491a;
                            if (c1143e5 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            AbstractActivityC0029e abstractActivityC0029e = i92.f1493c;
                            if (abstractActivityC0029e == null) {
                                eVar.n(C2.b.K(new C0082c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1143e5.k(abstractActivityC0029e, new B0.g(13, c0084e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0084e6.f1504c.n(C2.b.K(new C0082c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0084e c0084e7 = new C0084e(new ArrayList(), eVar, 0);
                            C1143e c1143e6 = this.f1501b.f1491a;
                            if (c1143e6 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e6.g(new B0.g(8, c0084e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0084e7.f1504c.n(C2.b.K(new C0082c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i102 = this.f1501b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0088i enumC0088i = (EnumC0088i) arrayList8.get(1);
                            r rVar2 = (r) arrayList8.get(2);
                            C0084e c0084e8 = new C0084e(arrayList7, eVar, 1);
                            if (i102.f1491a == null) {
                                C0080a c0080a = i102.f1492b;
                                Context context = i102.f1494d;
                                C0.e eVar2 = i102.f1495e;
                                c0080a.getClass();
                                C1141c c1141c = new C1141c(context);
                                if (rVar2 != null && rVar2.f1544a.booleanValue()) {
                                    z = true;
                                }
                                c1141c.f10055a = new C0342b(z);
                                int ordinal = enumC0088i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1141c.f10059e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0088i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1141c.f10058d = new B0.k(c0080a, 3, eVar2);
                                    }
                                }
                                c1141c.f10057c = new C0178i(27, eVar2);
                                i102.f1491a = c1141c.a();
                            }
                            try {
                                i102.f1491a.l(new H(i102, c0084e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0084e8.f1504c.n(C2.b.K(new C0082c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i112 = this.f1501b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1143e c1143e7 = i112.f1491a;
                                if (c1143e7 != null) {
                                    c1143e7.a();
                                    i112.f1491a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = C2.b.K(th3);
                            }
                            eVar.n(arrayList9);
                            return;
                        case 11:
                            C0084e c0084e9 = new C0084e(new ArrayList(), eVar, 2);
                            C1143e c1143e8 = this.f1501b.f1491a;
                            if (c1143e8 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e8.h(new B0.g(14, c0084e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0084e9.f1504c.n(C2.b.K(new C0082c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i122 = this.f1501b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i122.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = C2.b.K(th4);
                            }
                            eVar.n(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e10 = new C0084e(arrayList11, eVar, 3);
                            C1143e c1143e9 = this.f1501b.f1491a;
                            if (c1143e9 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1140b c1140b2 = new C1140b();
                                c1140b2.f10054a = str2;
                                c1143e9.e(c1140b2, new B0.g(11, c0084e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0084e10.f1504c.n(C2.b.K(new C0082c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            pVar10.i(null);
        }
        B0.p pVar11 = new B0.p(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isFeatureSupported", (P1.k) c0085f, (K0.j) null);
        if (i3 != null) {
            final int i14 = 5;
            pVar11.i(new P1.b(i3) { // from class: U1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1501b;

                {
                    this.f1501b = i3;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    C1143e c1143e;
                    switch (i14) {
                        case 0:
                            I i52 = this.f1501b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1143e = i52.f1491a;
                            } catch (Throwable th) {
                                arrayList = C2.b.K(th);
                            }
                            if (c1143e == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1143e.b()));
                            eVar.n(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e = new C0084e(arrayList2, eVar, 4);
                            C1143e c1143e2 = this.f1501b.f1491a;
                            if (c1143e2 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                B0.g gVar = new B0.g(10, c0084e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1148j c1148j = new C1148j();
                                c1148j.f10095b = str;
                                c1143e2.f(gVar, c1148j);
                                return;
                            } catch (RuntimeException e3) {
                                c0084e.f1504c.n(C2.b.K(new C0082c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e2 = new C0084e(arrayList3, eVar, 5);
                            I i62 = this.f1501b;
                            if (i62.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                C1140b c1140b = new C1140b();
                                c1140b.f10054a = S0.a.M(vVar);
                                i62.f1491a.d(c1140b.a(), new B0.g(7, c0084e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0084e2.f1504c.n(C2.b.K(new C0082c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar2 = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e3 = new C0084e(arrayList4, eVar, 6);
                            C1143e c1143e3 = this.f1501b.f1491a;
                            if (c1143e3 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                String M2 = S0.a.M(vVar2);
                                B0.g gVar2 = new B0.g(9, c0084e3);
                                if (!c1143e3.b()) {
                                    C1147i c1147i = AbstractC1135O.f10026k;
                                    c1143e3.H(2, 11, c1147i);
                                    gVar2.onPurchaseHistoryResponse(c1147i, null);
                                } else if (C1143e.m(new CallableC1159u(c1143e3, M2, gVar2, 3), 30000L, new B.a(c1143e3, 14, gVar2), c1143e3.D(), c1143e3.q()) == null) {
                                    C1147i n3 = c1143e3.n();
                                    c1143e3.H(25, 11, n3);
                                    gVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0084e3.f1504c.n(C2.b.K(new C0082c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0084e c0084e4 = new C0084e(arrayList5, eVar, 7);
                            I i72 = this.f1501b;
                            if (i72.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                b0.r rVar = new b0.r();
                                rVar.j(S0.a.L(list));
                                i72.f1491a.c(rVar.h(), new B0.k(i72, 7, c0084e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0084e4.f1504c.n(C2.b.K(new C0082c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i82 = this.f1501b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i82.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = C2.b.K(th2);
                            }
                            eVar.n(arrayList6);
                            return;
                        case 6:
                            C0084e c0084e5 = new C0084e(new ArrayList(), eVar, 8);
                            C1143e c1143e4 = this.f1501b.f1491a;
                            if (c1143e4 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e4.i(new B0.g(12, c0084e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0084e5.f1504c.n(C2.b.K(new C0082c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0084e c0084e6 = new C0084e(new ArrayList(), eVar, 9);
                            I i92 = this.f1501b;
                            C1143e c1143e5 = i92.f1491a;
                            if (c1143e5 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            AbstractActivityC0029e abstractActivityC0029e = i92.f1493c;
                            if (abstractActivityC0029e == null) {
                                eVar.n(C2.b.K(new C0082c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1143e5.k(abstractActivityC0029e, new B0.g(13, c0084e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0084e6.f1504c.n(C2.b.K(new C0082c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0084e c0084e7 = new C0084e(new ArrayList(), eVar, 0);
                            C1143e c1143e6 = this.f1501b.f1491a;
                            if (c1143e6 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e6.g(new B0.g(8, c0084e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0084e7.f1504c.n(C2.b.K(new C0082c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i102 = this.f1501b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0088i enumC0088i = (EnumC0088i) arrayList8.get(1);
                            r rVar2 = (r) arrayList8.get(2);
                            C0084e c0084e8 = new C0084e(arrayList7, eVar, 1);
                            if (i102.f1491a == null) {
                                C0080a c0080a = i102.f1492b;
                                Context context = i102.f1494d;
                                C0.e eVar2 = i102.f1495e;
                                c0080a.getClass();
                                C1141c c1141c = new C1141c(context);
                                if (rVar2 != null && rVar2.f1544a.booleanValue()) {
                                    z = true;
                                }
                                c1141c.f10055a = new C0342b(z);
                                int ordinal = enumC0088i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1141c.f10059e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0088i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1141c.f10058d = new B0.k(c0080a, 3, eVar2);
                                    }
                                }
                                c1141c.f10057c = new C0178i(27, eVar2);
                                i102.f1491a = c1141c.a();
                            }
                            try {
                                i102.f1491a.l(new H(i102, c0084e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0084e8.f1504c.n(C2.b.K(new C0082c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i112 = this.f1501b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1143e c1143e7 = i112.f1491a;
                                if (c1143e7 != null) {
                                    c1143e7.a();
                                    i112.f1491a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = C2.b.K(th3);
                            }
                            eVar.n(arrayList9);
                            return;
                        case 11:
                            C0084e c0084e9 = new C0084e(new ArrayList(), eVar, 2);
                            C1143e c1143e8 = this.f1501b.f1491a;
                            if (c1143e8 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e8.h(new B0.g(14, c0084e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0084e9.f1504c.n(C2.b.K(new C0082c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i122 = this.f1501b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i122.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = C2.b.K(th4);
                            }
                            eVar.n(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e10 = new C0084e(arrayList11, eVar, 3);
                            C1143e c1143e9 = this.f1501b.f1491a;
                            if (c1143e9 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1140b c1140b2 = new C1140b();
                                c1140b2.f10054a = str2;
                                c1143e9.e(c1140b2, new B0.g(11, c0084e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0084e10.f1504c.n(C2.b.K(new C0082c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            pVar11.i(null);
        }
        B0.p pVar12 = new B0.p(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isAlternativeBillingOnlyAvailableAsync", (P1.k) c0085f, (K0.j) null);
        if (i3 != null) {
            final int i15 = 6;
            pVar12.i(new P1.b(i3) { // from class: U1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1501b;

                {
                    this.f1501b = i3;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    C1143e c1143e;
                    switch (i15) {
                        case 0:
                            I i52 = this.f1501b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1143e = i52.f1491a;
                            } catch (Throwable th) {
                                arrayList = C2.b.K(th);
                            }
                            if (c1143e == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1143e.b()));
                            eVar.n(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e = new C0084e(arrayList2, eVar, 4);
                            C1143e c1143e2 = this.f1501b.f1491a;
                            if (c1143e2 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                B0.g gVar = new B0.g(10, c0084e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1148j c1148j = new C1148j();
                                c1148j.f10095b = str;
                                c1143e2.f(gVar, c1148j);
                                return;
                            } catch (RuntimeException e3) {
                                c0084e.f1504c.n(C2.b.K(new C0082c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e2 = new C0084e(arrayList3, eVar, 5);
                            I i62 = this.f1501b;
                            if (i62.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                C1140b c1140b = new C1140b();
                                c1140b.f10054a = S0.a.M(vVar);
                                i62.f1491a.d(c1140b.a(), new B0.g(7, c0084e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0084e2.f1504c.n(C2.b.K(new C0082c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar2 = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e3 = new C0084e(arrayList4, eVar, 6);
                            C1143e c1143e3 = this.f1501b.f1491a;
                            if (c1143e3 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                String M2 = S0.a.M(vVar2);
                                B0.g gVar2 = new B0.g(9, c0084e3);
                                if (!c1143e3.b()) {
                                    C1147i c1147i = AbstractC1135O.f10026k;
                                    c1143e3.H(2, 11, c1147i);
                                    gVar2.onPurchaseHistoryResponse(c1147i, null);
                                } else if (C1143e.m(new CallableC1159u(c1143e3, M2, gVar2, 3), 30000L, new B.a(c1143e3, 14, gVar2), c1143e3.D(), c1143e3.q()) == null) {
                                    C1147i n3 = c1143e3.n();
                                    c1143e3.H(25, 11, n3);
                                    gVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0084e3.f1504c.n(C2.b.K(new C0082c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0084e c0084e4 = new C0084e(arrayList5, eVar, 7);
                            I i72 = this.f1501b;
                            if (i72.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                b0.r rVar = new b0.r();
                                rVar.j(S0.a.L(list));
                                i72.f1491a.c(rVar.h(), new B0.k(i72, 7, c0084e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0084e4.f1504c.n(C2.b.K(new C0082c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i82 = this.f1501b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i82.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = C2.b.K(th2);
                            }
                            eVar.n(arrayList6);
                            return;
                        case 6:
                            C0084e c0084e5 = new C0084e(new ArrayList(), eVar, 8);
                            C1143e c1143e4 = this.f1501b.f1491a;
                            if (c1143e4 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e4.i(new B0.g(12, c0084e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0084e5.f1504c.n(C2.b.K(new C0082c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0084e c0084e6 = new C0084e(new ArrayList(), eVar, 9);
                            I i92 = this.f1501b;
                            C1143e c1143e5 = i92.f1491a;
                            if (c1143e5 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            AbstractActivityC0029e abstractActivityC0029e = i92.f1493c;
                            if (abstractActivityC0029e == null) {
                                eVar.n(C2.b.K(new C0082c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1143e5.k(abstractActivityC0029e, new B0.g(13, c0084e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0084e6.f1504c.n(C2.b.K(new C0082c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0084e c0084e7 = new C0084e(new ArrayList(), eVar, 0);
                            C1143e c1143e6 = this.f1501b.f1491a;
                            if (c1143e6 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e6.g(new B0.g(8, c0084e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0084e7.f1504c.n(C2.b.K(new C0082c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i102 = this.f1501b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0088i enumC0088i = (EnumC0088i) arrayList8.get(1);
                            r rVar2 = (r) arrayList8.get(2);
                            C0084e c0084e8 = new C0084e(arrayList7, eVar, 1);
                            if (i102.f1491a == null) {
                                C0080a c0080a = i102.f1492b;
                                Context context = i102.f1494d;
                                C0.e eVar2 = i102.f1495e;
                                c0080a.getClass();
                                C1141c c1141c = new C1141c(context);
                                if (rVar2 != null && rVar2.f1544a.booleanValue()) {
                                    z = true;
                                }
                                c1141c.f10055a = new C0342b(z);
                                int ordinal = enumC0088i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1141c.f10059e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0088i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1141c.f10058d = new B0.k(c0080a, 3, eVar2);
                                    }
                                }
                                c1141c.f10057c = new C0178i(27, eVar2);
                                i102.f1491a = c1141c.a();
                            }
                            try {
                                i102.f1491a.l(new H(i102, c0084e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0084e8.f1504c.n(C2.b.K(new C0082c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i112 = this.f1501b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1143e c1143e7 = i112.f1491a;
                                if (c1143e7 != null) {
                                    c1143e7.a();
                                    i112.f1491a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = C2.b.K(th3);
                            }
                            eVar.n(arrayList9);
                            return;
                        case 11:
                            C0084e c0084e9 = new C0084e(new ArrayList(), eVar, 2);
                            C1143e c1143e8 = this.f1501b.f1491a;
                            if (c1143e8 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e8.h(new B0.g(14, c0084e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0084e9.f1504c.n(C2.b.K(new C0082c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i122 = this.f1501b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i122.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = C2.b.K(th4);
                            }
                            eVar.n(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e10 = new C0084e(arrayList11, eVar, 3);
                            C1143e c1143e9 = this.f1501b.f1491a;
                            if (c1143e9 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1140b c1140b2 = new C1140b();
                                c1140b2.f10054a = str2;
                                c1143e9.e(c1140b2, new B0.g(11, c0084e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0084e10.f1504c.n(C2.b.K(new C0082c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            pVar12.i(null);
        }
        B0.p pVar13 = new B0.p(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.showAlternativeBillingOnlyInformationDialog", (P1.k) c0085f, (K0.j) null);
        if (i3 != null) {
            final int i16 = 7;
            pVar13.i(new P1.b(i3) { // from class: U1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1501b;

                {
                    this.f1501b = i3;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    C1143e c1143e;
                    switch (i16) {
                        case 0:
                            I i52 = this.f1501b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1143e = i52.f1491a;
                            } catch (Throwable th) {
                                arrayList = C2.b.K(th);
                            }
                            if (c1143e == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1143e.b()));
                            eVar.n(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e = new C0084e(arrayList2, eVar, 4);
                            C1143e c1143e2 = this.f1501b.f1491a;
                            if (c1143e2 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                B0.g gVar = new B0.g(10, c0084e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1148j c1148j = new C1148j();
                                c1148j.f10095b = str;
                                c1143e2.f(gVar, c1148j);
                                return;
                            } catch (RuntimeException e3) {
                                c0084e.f1504c.n(C2.b.K(new C0082c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e2 = new C0084e(arrayList3, eVar, 5);
                            I i62 = this.f1501b;
                            if (i62.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                C1140b c1140b = new C1140b();
                                c1140b.f10054a = S0.a.M(vVar);
                                i62.f1491a.d(c1140b.a(), new B0.g(7, c0084e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0084e2.f1504c.n(C2.b.K(new C0082c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar2 = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e3 = new C0084e(arrayList4, eVar, 6);
                            C1143e c1143e3 = this.f1501b.f1491a;
                            if (c1143e3 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                String M2 = S0.a.M(vVar2);
                                B0.g gVar2 = new B0.g(9, c0084e3);
                                if (!c1143e3.b()) {
                                    C1147i c1147i = AbstractC1135O.f10026k;
                                    c1143e3.H(2, 11, c1147i);
                                    gVar2.onPurchaseHistoryResponse(c1147i, null);
                                } else if (C1143e.m(new CallableC1159u(c1143e3, M2, gVar2, 3), 30000L, new B.a(c1143e3, 14, gVar2), c1143e3.D(), c1143e3.q()) == null) {
                                    C1147i n3 = c1143e3.n();
                                    c1143e3.H(25, 11, n3);
                                    gVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0084e3.f1504c.n(C2.b.K(new C0082c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0084e c0084e4 = new C0084e(arrayList5, eVar, 7);
                            I i72 = this.f1501b;
                            if (i72.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                b0.r rVar = new b0.r();
                                rVar.j(S0.a.L(list));
                                i72.f1491a.c(rVar.h(), new B0.k(i72, 7, c0084e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0084e4.f1504c.n(C2.b.K(new C0082c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i82 = this.f1501b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i82.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = C2.b.K(th2);
                            }
                            eVar.n(arrayList6);
                            return;
                        case 6:
                            C0084e c0084e5 = new C0084e(new ArrayList(), eVar, 8);
                            C1143e c1143e4 = this.f1501b.f1491a;
                            if (c1143e4 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e4.i(new B0.g(12, c0084e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0084e5.f1504c.n(C2.b.K(new C0082c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0084e c0084e6 = new C0084e(new ArrayList(), eVar, 9);
                            I i92 = this.f1501b;
                            C1143e c1143e5 = i92.f1491a;
                            if (c1143e5 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            AbstractActivityC0029e abstractActivityC0029e = i92.f1493c;
                            if (abstractActivityC0029e == null) {
                                eVar.n(C2.b.K(new C0082c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1143e5.k(abstractActivityC0029e, new B0.g(13, c0084e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0084e6.f1504c.n(C2.b.K(new C0082c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0084e c0084e7 = new C0084e(new ArrayList(), eVar, 0);
                            C1143e c1143e6 = this.f1501b.f1491a;
                            if (c1143e6 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e6.g(new B0.g(8, c0084e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0084e7.f1504c.n(C2.b.K(new C0082c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i102 = this.f1501b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0088i enumC0088i = (EnumC0088i) arrayList8.get(1);
                            r rVar2 = (r) arrayList8.get(2);
                            C0084e c0084e8 = new C0084e(arrayList7, eVar, 1);
                            if (i102.f1491a == null) {
                                C0080a c0080a = i102.f1492b;
                                Context context = i102.f1494d;
                                C0.e eVar2 = i102.f1495e;
                                c0080a.getClass();
                                C1141c c1141c = new C1141c(context);
                                if (rVar2 != null && rVar2.f1544a.booleanValue()) {
                                    z = true;
                                }
                                c1141c.f10055a = new C0342b(z);
                                int ordinal = enumC0088i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1141c.f10059e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0088i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1141c.f10058d = new B0.k(c0080a, 3, eVar2);
                                    }
                                }
                                c1141c.f10057c = new C0178i(27, eVar2);
                                i102.f1491a = c1141c.a();
                            }
                            try {
                                i102.f1491a.l(new H(i102, c0084e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0084e8.f1504c.n(C2.b.K(new C0082c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i112 = this.f1501b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1143e c1143e7 = i112.f1491a;
                                if (c1143e7 != null) {
                                    c1143e7.a();
                                    i112.f1491a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = C2.b.K(th3);
                            }
                            eVar.n(arrayList9);
                            return;
                        case 11:
                            C0084e c0084e9 = new C0084e(new ArrayList(), eVar, 2);
                            C1143e c1143e8 = this.f1501b.f1491a;
                            if (c1143e8 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e8.h(new B0.g(14, c0084e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0084e9.f1504c.n(C2.b.K(new C0082c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i122 = this.f1501b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i122.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = C2.b.K(th4);
                            }
                            eVar.n(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e10 = new C0084e(arrayList11, eVar, 3);
                            C1143e c1143e9 = this.f1501b.f1491a;
                            if (c1143e9 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1140b c1140b2 = new C1140b();
                                c1140b2.f10054a = str2;
                                c1143e9.e(c1140b2, new B0.g(11, c0084e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0084e10.f1504c.n(C2.b.K(new C0082c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            pVar13.i(null);
        }
        B0.p pVar14 = new B0.p(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.createAlternativeBillingOnlyReportingDetailsAsync", (P1.k) c0085f, (K0.j) null);
        if (i3 == null) {
            pVar14.i(null);
        } else {
            final int i17 = 8;
            pVar14.i(new P1.b(i3) { // from class: U1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1501b;

                {
                    this.f1501b = i3;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    C1143e c1143e;
                    switch (i17) {
                        case 0:
                            I i52 = this.f1501b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1143e = i52.f1491a;
                            } catch (Throwable th) {
                                arrayList = C2.b.K(th);
                            }
                            if (c1143e == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1143e.b()));
                            eVar.n(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e = new C0084e(arrayList2, eVar, 4);
                            C1143e c1143e2 = this.f1501b.f1491a;
                            if (c1143e2 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                B0.g gVar = new B0.g(10, c0084e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1148j c1148j = new C1148j();
                                c1148j.f10095b = str;
                                c1143e2.f(gVar, c1148j);
                                return;
                            } catch (RuntimeException e3) {
                                c0084e.f1504c.n(C2.b.K(new C0082c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e2 = new C0084e(arrayList3, eVar, 5);
                            I i62 = this.f1501b;
                            if (i62.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                C1140b c1140b = new C1140b();
                                c1140b.f10054a = S0.a.M(vVar);
                                i62.f1491a.d(c1140b.a(), new B0.g(7, c0084e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0084e2.f1504c.n(C2.b.K(new C0082c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar2 = (v) ((ArrayList) obj).get(0);
                            C0084e c0084e3 = new C0084e(arrayList4, eVar, 6);
                            C1143e c1143e3 = this.f1501b.f1491a;
                            if (c1143e3 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                String M2 = S0.a.M(vVar2);
                                B0.g gVar2 = new B0.g(9, c0084e3);
                                if (!c1143e3.b()) {
                                    C1147i c1147i = AbstractC1135O.f10026k;
                                    c1143e3.H(2, 11, c1147i);
                                    gVar2.onPurchaseHistoryResponse(c1147i, null);
                                } else if (C1143e.m(new CallableC1159u(c1143e3, M2, gVar2, 3), 30000L, new B.a(c1143e3, 14, gVar2), c1143e3.D(), c1143e3.q()) == null) {
                                    C1147i n3 = c1143e3.n();
                                    c1143e3.H(25, 11, n3);
                                    gVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0084e3.f1504c.n(C2.b.K(new C0082c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0084e c0084e4 = new C0084e(arrayList5, eVar, 7);
                            I i72 = this.f1501b;
                            if (i72.f1491a == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                b0.r rVar = new b0.r();
                                rVar.j(S0.a.L(list));
                                i72.f1491a.c(rVar.h(), new B0.k(i72, 7, c0084e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0084e4.f1504c.n(C2.b.K(new C0082c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i82 = this.f1501b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i82.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = C2.b.K(th2);
                            }
                            eVar.n(arrayList6);
                            return;
                        case 6:
                            C0084e c0084e5 = new C0084e(new ArrayList(), eVar, 8);
                            C1143e c1143e4 = this.f1501b.f1491a;
                            if (c1143e4 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e4.i(new B0.g(12, c0084e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0084e5.f1504c.n(C2.b.K(new C0082c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0084e c0084e6 = new C0084e(new ArrayList(), eVar, 9);
                            I i92 = this.f1501b;
                            C1143e c1143e5 = i92.f1491a;
                            if (c1143e5 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            AbstractActivityC0029e abstractActivityC0029e = i92.f1493c;
                            if (abstractActivityC0029e == null) {
                                eVar.n(C2.b.K(new C0082c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1143e5.k(abstractActivityC0029e, new B0.g(13, c0084e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0084e6.f1504c.n(C2.b.K(new C0082c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0084e c0084e7 = new C0084e(new ArrayList(), eVar, 0);
                            C1143e c1143e6 = this.f1501b.f1491a;
                            if (c1143e6 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e6.g(new B0.g(8, c0084e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0084e7.f1504c.n(C2.b.K(new C0082c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i102 = this.f1501b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0088i enumC0088i = (EnumC0088i) arrayList8.get(1);
                            r rVar2 = (r) arrayList8.get(2);
                            C0084e c0084e8 = new C0084e(arrayList7, eVar, 1);
                            if (i102.f1491a == null) {
                                C0080a c0080a = i102.f1492b;
                                Context context = i102.f1494d;
                                C0.e eVar2 = i102.f1495e;
                                c0080a.getClass();
                                C1141c c1141c = new C1141c(context);
                                if (rVar2 != null && rVar2.f1544a.booleanValue()) {
                                    z = true;
                                }
                                c1141c.f10055a = new C0342b(z);
                                int ordinal = enumC0088i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1141c.f10059e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0088i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1141c.f10058d = new B0.k(c0080a, 3, eVar2);
                                    }
                                }
                                c1141c.f10057c = new C0178i(27, eVar2);
                                i102.f1491a = c1141c.a();
                            }
                            try {
                                i102.f1491a.l(new H(i102, c0084e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0084e8.f1504c.n(C2.b.K(new C0082c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i112 = this.f1501b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1143e c1143e7 = i112.f1491a;
                                if (c1143e7 != null) {
                                    c1143e7.a();
                                    i112.f1491a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = C2.b.K(th3);
                            }
                            eVar.n(arrayList9);
                            return;
                        case 11:
                            C0084e c0084e9 = new C0084e(new ArrayList(), eVar, 2);
                            C1143e c1143e8 = this.f1501b.f1491a;
                            if (c1143e8 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                c1143e8.h(new B0.g(14, c0084e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0084e9.f1504c.n(C2.b.K(new C0082c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i122 = this.f1501b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i122.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = C2.b.K(th4);
                            }
                            eVar.n(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0084e c0084e10 = new C0084e(arrayList11, eVar, 3);
                            C1143e c1143e9 = this.f1501b.f1491a;
                            if (c1143e9 == null) {
                                eVar.n(C2.b.K(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1140b c1140b2 = new C1140b();
                                c1140b2.f10054a = str2;
                                c1143e9.e(c1140b2, new B0.g(11, c0084e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0084e10.f1504c.n(C2.b.K(new C0082c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Boolean b(j jVar) {
        String str;
        char c3;
        C1147i c1147i;
        C1143e c1143e = this.f1491a;
        if (c1143e == null) {
            throw a();
        }
        switch (jVar) {
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
                throw new C0082c("UNKNOWN_FEATURE", "Unknown client feature: " + jVar, null);
        }
        if (c1143e.b()) {
            C1147i c1147i2 = AbstractC1135O.f10017a;
            switch (str.hashCode()) {
                case -422092961:
                    if (str.equals("subscriptionsUpdate")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 96321:
                    if (str.equals("aaa")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 97314:
                    if (str.equals("bbb")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 98307:
                    if (str.equals("ccc")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 99300:
                    if (str.equals("ddd")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 100293:
                    if (str.equals("eee")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 101286:
                    if (str.equals("fff")) {
                        c3 = '\b';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 102279:
                    if (str.equals("ggg")) {
                        c3 = '\t';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 103272:
                    if (str.equals("hhh")) {
                        c3 = '\n';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 104265:
                    if (str.equals("iii")) {
                        c3 = 11;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 105258:
                    if (str.equals("jjj")) {
                        c3 = '\f';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 106251:
                    if (str.equals("kkk")) {
                        c3 = '\r';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 107244:
                    if (str.equals("lll")) {
                        c3 = 14;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 207616302:
                    if (str.equals("priceChangeConfirmation")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1987365622:
                    if (str.equals("subscriptions")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    c1147i = c1143e.f10073j ? AbstractC1135O.f10025j : AbstractC1135O.f10028m;
                    c1143e.y(9, 2, c1147i);
                    break;
                case 1:
                    c1147i = c1143e.f10074k ? AbstractC1135O.f10025j : AbstractC1135O.f10029n;
                    c1143e.y(10, 3, c1147i);
                    break;
                case 2:
                    c1147i = c1143e.f10077n ? AbstractC1135O.f10025j : AbstractC1135O.f10030p;
                    c1143e.y(35, 4, c1147i);
                    break;
                case 3:
                    c1147i = c1143e.f10078p ? AbstractC1135O.f10025j : AbstractC1135O.f10035u;
                    c1143e.y(30, 5, c1147i);
                    break;
                case 4:
                    c1147i = c1143e.f10080r ? AbstractC1135O.f10025j : AbstractC1135O.f10031q;
                    c1143e.y(31, 6, c1147i);
                    break;
                case 5:
                    c1147i = c1143e.f10079q ? AbstractC1135O.f10025j : AbstractC1135O.f10033s;
                    c1143e.y(21, 7, c1147i);
                    break;
                case 6:
                    c1147i = c1143e.f10081s ? AbstractC1135O.f10025j : AbstractC1135O.f10032r;
                    c1143e.y(19, 8, c1147i);
                    break;
                case 7:
                    c1147i = c1143e.f10081s ? AbstractC1135O.f10025j : AbstractC1135O.f10032r;
                    c1143e.y(61, 9, c1147i);
                    break;
                case '\b':
                    c1147i = c1143e.f10082t ? AbstractC1135O.f10025j : AbstractC1135O.f10034t;
                    c1143e.y(20, 10, c1147i);
                    break;
                case '\t':
                    c1147i = c1143e.f10083u ? AbstractC1135O.f10025j : AbstractC1135O.f10038y;
                    c1143e.y(32, 11, c1147i);
                    break;
                case '\n':
                    c1147i = c1143e.f10083u ? AbstractC1135O.f10025j : AbstractC1135O.z;
                    c1143e.y(33, 12, c1147i);
                    break;
                case 11:
                    c1147i = c1143e.f10084w ? AbstractC1135O.f10025j : AbstractC1135O.f10013B;
                    c1143e.y(60, 13, c1147i);
                    break;
                case '\f':
                    c1147i = c1143e.f10085x ? AbstractC1135O.f10025j : AbstractC1135O.f10014C;
                    c1143e.y(66, 14, c1147i);
                    break;
                case '\r':
                    c1147i = c1143e.f10086y ? AbstractC1135O.f10025j : AbstractC1135O.v;
                    c1143e.y(103, 18, c1147i);
                    break;
                case 14:
                    c1147i = c1143e.z ? AbstractC1135O.f10025j : AbstractC1135O.f10036w;
                    c1143e.y(BuildConfig.API_LEVEL, 19, c1147i);
                    break;
                default:
                    AbstractC0248o0.g("BillingClient", "Unsupported feature: ".concat(str));
                    c1147i = AbstractC1135O.f10037x;
                    c1143e.y(34, 1, c1147i);
                    break;
            }
        } else {
            c1147i = AbstractC1135O.f10026k;
            if (c1147i.f10092a != 0) {
                c1143e.H(2, 5, c1147i);
            } else {
                c1143e.J(5);
            }
        }
        return Boolean.valueOf(c1147i.f10092a == 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0132, code lost:
    
        if (r11 != 5) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n c(l lVar) {
        String str;
        int i3;
        boolean z;
        if (this.f1491a == null) {
            throw a();
        }
        HashMap hashMap = this.f;
        C1152n c1152n = (C1152n) hashMap.get(lVar.f1516a);
        if (c1152n == null) {
            throw new C0082c("NOT_FOUND", AbstractC0033i.m(new StringBuilder("Details for product "), lVar.f1516a, " are not available. It might because products were not fetched prior to the call. Please fetch the products first. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale"), null);
        }
        ArrayList<C1151m> arrayList = c1152n.f10119j;
        if (arrayList != null) {
            for (C1151m c1151m : arrayList) {
                String str2 = lVar.f1518c;
                if (str2 == null || !str2.equals(c1151m.f10108c)) {
                }
            }
            StringBuilder sb = new StringBuilder("Offer token ");
            sb.append(lVar.f1518c);
            sb.append(" for product ");
            throw new C0082c("INVALID_OFFER_TOKEN", AbstractC0033i.m(sb, lVar.f1516a, " is not valid. Make sure to only pass offer tokens that belong to the product. To obtain offer tokens for a product, fetch the products. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale"), null);
        }
        String str3 = lVar.f;
        D d3 = D.UNKNOWN_REPLACEMENT_MODE;
        if (str3 == null && lVar.f1517b != d3) {
            throw new C0082c("IN_APP_PURCHASE_REQUIRE_OLD_PRODUCT", "launchBillingFlow failed because oldProduct is null. You must provide a valid oldProduct in order to use a replacement mode.", null);
        }
        if (str3 != null && !hashMap.containsKey(str3)) {
            throw new C0082c("IN_APP_PURCHASE_INVALID_OLD_PRODUCT", AbstractC0033i.m(new StringBuilder("Details for product "), lVar.f, " are not available. It might because products were not fetched prior to the call. Please fetch the products first. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale"), null);
        }
        if (this.f1493c == null) {
            throw new C0082c("ACTIVITY_UNAVAILABLE", AbstractC0033i.m(new StringBuilder("Details for product "), lVar.f1516a, " are not available. This method must be run with the app in foreground."), null);
        }
        C0322a c0322a = new C0322a(6);
        c0322a.f4977b = c1152n;
        if (c1152n.a() != null) {
            c1152n.a().getClass();
            String str4 = c1152n.a().f10099d;
            if (str4 != null) {
                c0322a.f4978c = str4;
            }
        }
        String str5 = lVar.f1518c;
        if (str5 != null) {
            if (TextUtils.isEmpty(str5)) {
                throw new IllegalArgumentException("offerToken can not be empty");
            }
            c0322a.f4978c = str5;
        }
        ArrayList arrayList2 = new ArrayList();
        if (((C1152n) c0322a.f4977b).f10119j != null && ((String) c0322a.f4978c) == null) {
            throw new NullPointerException("offerToken is required for constructing ProductDetailsParams for subscriptions.");
        }
        arrayList2.add(new C1145g(c0322a));
        C1146h c1146h = new C1146h();
        boolean z2 = false;
        c1146h.f10091c = 0;
        c1146h.f10090b = true;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        String str6 = lVar.f1519d;
        String str7 = (str6 == null || str6.isEmpty()) ? null : lVar.f1519d;
        String str8 = lVar.f1520e;
        String str9 = (str8 == null || str8.isEmpty()) ? null : lVar.f1520e;
        String str10 = lVar.f;
        if (str10 != null && !str10.isEmpty() && (str = lVar.f1521g) != null) {
            D d4 = lVar.f1517b;
            if (d4 != d3) {
                int ordinal = d4.ordinal();
                if (ordinal != 1) {
                    i3 = 2;
                    if (ordinal != 2) {
                        i3 = 3;
                        if (ordinal != 3) {
                            i3 = ordinal != 4 ? 5 : 6;
                        }
                    }
                } else {
                    i3 = 1;
                }
                z = TextUtils.isEmpty(str) || !TextUtils.isEmpty(null);
                boolean isEmpty = TextUtils.isEmpty(null);
                if (!z && !isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (z && isEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                C0130a c0130a = new C0130a();
                c0130a.f1919a = str;
                c0130a.f1920b = i3;
                c1146h = new C1146h();
                c1146h.f10089a = c0130a.f1919a;
                c1146h.f10091c = c0130a.f1920b;
            }
            i3 = 0;
            if (TextUtils.isEmpty(str)) {
            }
            boolean isEmpty2 = TextUtils.isEmpty(null);
            if (!z) {
            }
            if (z) {
            }
            C0130a c0130a2 = new C0130a();
            c0130a2.f1919a = str;
            c0130a2.f1920b = i3;
            c1146h = new C1146h();
            c1146h.f10089a = c0130a2.f1919a;
            c1146h.f10091c = c0130a2.f1920b;
        }
        C1143e c1143e = this.f1491a;
        AbstractActivityC0029e abstractActivityC0029e = this.f1493c;
        boolean isEmpty3 = arrayList3.isEmpty();
        if (isEmpty3) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        arrayList3.forEach(new C1132L());
        M0.o oVar = new M0.o();
        if (!isEmpty3 && !((C1145g) arrayList3.get(0)).f10087a.f10112b.optString("packageName").isEmpty()) {
            z2 = true;
        }
        oVar.f944a = z2;
        oVar.f945b = str7;
        oVar.f946c = str9;
        boolean z3 = true;
        if (TextUtils.isEmpty(c1146h.f10089a) && TextUtils.isEmpty(null)) {
            z3 = false;
        }
        boolean isEmpty4 = TextUtils.isEmpty(null);
        if (z3 && !isEmpty4) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if (!c1146h.f10090b && !z3 && isEmpty4) {
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        C0130a c0130a3 = new C0130a();
        c0130a3.f1919a = c1146h.f10089a;
        c0130a3.f1920b = c1146h.f10091c;
        oVar.f947d = c0130a3;
        oVar.f = new ArrayList();
        oVar.f948e = com.google.android.gms.internal.play_billing.C.k(arrayList3);
        return S0.a.j(c1143e.j(abstractActivityC0029e, oVar));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Context context;
        if (this.f1493c != activity || (context = this.f1494d) == null) {
            return;
        }
        ((Application) context).unregisterActivityLifecycleCallbacks(this);
        C1143e c1143e = this.f1491a;
        if (c1143e != null) {
            c1143e.a();
            this.f1491a = null;
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
