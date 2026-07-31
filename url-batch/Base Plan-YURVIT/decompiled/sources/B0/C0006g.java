package B0;

import F.C0032n;
import a.AbstractC0086a;
import android.util.Log;
import java.util.List;
import v0.C0244i;
import v0.InterfaceC0237b;
import v0.InterfaceC0241f;

/* renamed from: B0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0006g f79a = new C0006g();

    /* renamed from: b, reason: collision with root package name */
    public static final D0.f f80b = new D0.f(new C0004e(0));

    public static v0.j a() {
        return (v0.j) f80b.a();
    }

    public static void b(InterfaceC0241f interfaceC0241f, final InterfaceC0007h interfaceC0007h, String str) {
        P0.h.e(interfaceC0241f, "binaryMessenger");
        String concat = str.length() > 0 ? ".".concat(str) : "";
        C0000a g2 = interfaceC0241f.g(new C0244i());
        C0032n c0032n = new C0032n(interfaceC0241f, L.d.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", concat), a(), g2);
        if (interfaceC0007h != null) {
            final int i2 = 6;
            c0032n.j(new InterfaceC0237b() { // from class: B0.f
                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    List O2;
                    List O3;
                    List O4;
                    List O5;
                    List O6;
                    List O7;
                    List O8;
                    List O9;
                    List O10;
                    List O11;
                    List O12;
                    List O13;
                    List O14;
                    List O15;
                    List O16;
                    switch (i2) {
                        case 0:
                            InterfaceC0007h interfaceC0007h2 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            P0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            P0.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            P0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h2.g(str2, str3, (C0009j) obj4);
                                O2 = AbstractC0086a.x(null);
                            } catch (Throwable th) {
                                O2 = E0.g.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            p2.n(O2);
                            break;
                        case 1:
                            InterfaceC0007h interfaceC0007h3 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            P0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            P0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            P0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h3.k(str4, list3, (C0009j) obj7);
                                O3 = AbstractC0086a.x(null);
                            } catch (Throwable th2) {
                                O3 = E0.g.O(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            p2.n(O3);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0007h interfaceC0007h4 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            P0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            P0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O4 = AbstractC0086a.x(interfaceC0007h4.p(str5, (C0009j) obj9));
                            } catch (Throwable th3) {
                                O4 = E0.g.O(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            p2.n(O4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0007h interfaceC0007h5 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            P0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            P0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O5 = AbstractC0086a.x(interfaceC0007h5.q(str6, (C0009j) obj11));
                            } catch (Throwable th4) {
                                O5 = E0.g.O(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            p2.n(O5);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0007h interfaceC0007h6 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            P0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            P0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O6 = AbstractC0086a.x(interfaceC0007h6.a(str7, (C0009j) obj13));
                            } catch (Throwable th5) {
                                O6 = E0.g.O(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            p2.n(O6);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0007h interfaceC0007h7 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            P0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            P0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O7 = AbstractC0086a.x(interfaceC0007h7.o(str8, (C0009j) obj15));
                            } catch (Throwable th6) {
                                O7 = E0.g.O(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            p2.n(O7);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0007h interfaceC0007h8 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            P0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            P0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            P0.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h8.b(str9, booleanValue, (C0009j) obj18);
                                O8 = AbstractC0086a.x(null);
                            } catch (Throwable th7) {
                                O8 = E0.g.O(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            p2.n(O8);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0007h interfaceC0007h9 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            P0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            P0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O9 = AbstractC0086a.x(interfaceC0007h9.r(str10, (C0009j) obj20));
                            } catch (Throwable th8) {
                                O9 = E0.g.O(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            p2.n(O9);
                            break;
                        case H.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0007h interfaceC0007h10 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            P0.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            P0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O10 = AbstractC0086a.x(interfaceC0007h10.e(str11, (C0009j) obj22));
                            } catch (Throwable th9) {
                                O10 = E0.g.O(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            p2.n(O10);
                            break;
                        case 9:
                            InterfaceC0007h interfaceC0007h11 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            P0.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h11.f(list12, (C0009j) obj23);
                                O11 = AbstractC0086a.x(null);
                            } catch (Throwable th10) {
                                O11 = E0.g.O(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            p2.n(O11);
                            break;
                        case 10:
                            InterfaceC0007h interfaceC0007h12 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            P0.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O12 = AbstractC0086a.x(interfaceC0007h12.j(list14, (C0009j) obj24));
                            } catch (Throwable th11) {
                                O12 = E0.g.O(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            p2.n(O12);
                            break;
                        case 11:
                            InterfaceC0007h interfaceC0007h13 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            P0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O13 = AbstractC0086a.x(interfaceC0007h13.d(list16, (C0009j) obj25));
                            } catch (Throwable th12) {
                                O13 = E0.g.O(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            p2.n(O13);
                            break;
                        case 12:
                            InterfaceC0007h interfaceC0007h14 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            P0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            P0.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            P0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h14.n(str12, str13, (C0009j) obj28);
                                O14 = AbstractC0086a.x(null);
                            } catch (Throwable th13) {
                                O14 = E0.g.O(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            p2.n(O14);
                            break;
                        case 13:
                            InterfaceC0007h interfaceC0007h15 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            P0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            P0.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            P0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h15.h(str14, longValue, (C0009j) obj31);
                                O15 = AbstractC0086a.x(null);
                            } catch (Throwable th14) {
                                O15 = E0.g.O(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            p2.n(O15);
                            break;
                        default:
                            InterfaceC0007h interfaceC0007h16 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            P0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            P0.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            P0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h16.l(str15, doubleValue, (C0009j) obj34);
                                O16 = AbstractC0086a.x(null);
                            } catch (Throwable th15) {
                                O16 = E0.g.O(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            p2.n(O16);
                            break;
                    }
                }
            });
        } else {
            c0032n.j(null);
        }
        C0032n c0032n2 = new C0032n(interfaceC0241f, L.d.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", concat), a(), g2);
        if (interfaceC0007h != null) {
            final int i3 = 12;
            c0032n2.j(new InterfaceC0237b() { // from class: B0.f
                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    List O2;
                    List O3;
                    List O4;
                    List O5;
                    List O6;
                    List O7;
                    List O8;
                    List O9;
                    List O10;
                    List O11;
                    List O12;
                    List O13;
                    List O14;
                    List O15;
                    List O16;
                    switch (i3) {
                        case 0:
                            InterfaceC0007h interfaceC0007h2 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            P0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            P0.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            P0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h2.g(str2, str3, (C0009j) obj4);
                                O2 = AbstractC0086a.x(null);
                            } catch (Throwable th) {
                                O2 = E0.g.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            p2.n(O2);
                            break;
                        case 1:
                            InterfaceC0007h interfaceC0007h3 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            P0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            P0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            P0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h3.k(str4, list3, (C0009j) obj7);
                                O3 = AbstractC0086a.x(null);
                            } catch (Throwable th2) {
                                O3 = E0.g.O(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            p2.n(O3);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0007h interfaceC0007h4 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            P0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            P0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O4 = AbstractC0086a.x(interfaceC0007h4.p(str5, (C0009j) obj9));
                            } catch (Throwable th3) {
                                O4 = E0.g.O(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            p2.n(O4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0007h interfaceC0007h5 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            P0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            P0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O5 = AbstractC0086a.x(interfaceC0007h5.q(str6, (C0009j) obj11));
                            } catch (Throwable th4) {
                                O5 = E0.g.O(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            p2.n(O5);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0007h interfaceC0007h6 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            P0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            P0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O6 = AbstractC0086a.x(interfaceC0007h6.a(str7, (C0009j) obj13));
                            } catch (Throwable th5) {
                                O6 = E0.g.O(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            p2.n(O6);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0007h interfaceC0007h7 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            P0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            P0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O7 = AbstractC0086a.x(interfaceC0007h7.o(str8, (C0009j) obj15));
                            } catch (Throwable th6) {
                                O7 = E0.g.O(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            p2.n(O7);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0007h interfaceC0007h8 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            P0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            P0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            P0.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h8.b(str9, booleanValue, (C0009j) obj18);
                                O8 = AbstractC0086a.x(null);
                            } catch (Throwable th7) {
                                O8 = E0.g.O(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            p2.n(O8);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0007h interfaceC0007h9 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            P0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            P0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O9 = AbstractC0086a.x(interfaceC0007h9.r(str10, (C0009j) obj20));
                            } catch (Throwable th8) {
                                O9 = E0.g.O(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            p2.n(O9);
                            break;
                        case H.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0007h interfaceC0007h10 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            P0.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            P0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O10 = AbstractC0086a.x(interfaceC0007h10.e(str11, (C0009j) obj22));
                            } catch (Throwable th9) {
                                O10 = E0.g.O(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            p2.n(O10);
                            break;
                        case 9:
                            InterfaceC0007h interfaceC0007h11 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            P0.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h11.f(list12, (C0009j) obj23);
                                O11 = AbstractC0086a.x(null);
                            } catch (Throwable th10) {
                                O11 = E0.g.O(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            p2.n(O11);
                            break;
                        case 10:
                            InterfaceC0007h interfaceC0007h12 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            P0.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O12 = AbstractC0086a.x(interfaceC0007h12.j(list14, (C0009j) obj24));
                            } catch (Throwable th11) {
                                O12 = E0.g.O(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            p2.n(O12);
                            break;
                        case 11:
                            InterfaceC0007h interfaceC0007h13 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            P0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O13 = AbstractC0086a.x(interfaceC0007h13.d(list16, (C0009j) obj25));
                            } catch (Throwable th12) {
                                O13 = E0.g.O(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            p2.n(O13);
                            break;
                        case 12:
                            InterfaceC0007h interfaceC0007h14 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            P0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            P0.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            P0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h14.n(str12, str13, (C0009j) obj28);
                                O14 = AbstractC0086a.x(null);
                            } catch (Throwable th13) {
                                O14 = E0.g.O(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            p2.n(O14);
                            break;
                        case 13:
                            InterfaceC0007h interfaceC0007h15 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            P0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            P0.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            P0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h15.h(str14, longValue, (C0009j) obj31);
                                O15 = AbstractC0086a.x(null);
                            } catch (Throwable th14) {
                                O15 = E0.g.O(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            p2.n(O15);
                            break;
                        default:
                            InterfaceC0007h interfaceC0007h16 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            P0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            P0.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            P0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h16.l(str15, doubleValue, (C0009j) obj34);
                                O16 = AbstractC0086a.x(null);
                            } catch (Throwable th15) {
                                O16 = E0.g.O(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            p2.n(O16);
                            break;
                    }
                }
            });
        } else {
            c0032n2.j(null);
        }
        C0032n c0032n3 = new C0032n(interfaceC0241f, L.d.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", concat), a(), g2);
        if (interfaceC0007h != null) {
            final int i4 = 13;
            c0032n3.j(new InterfaceC0237b() { // from class: B0.f
                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    List O2;
                    List O3;
                    List O4;
                    List O5;
                    List O6;
                    List O7;
                    List O8;
                    List O9;
                    List O10;
                    List O11;
                    List O12;
                    List O13;
                    List O14;
                    List O15;
                    List O16;
                    switch (i4) {
                        case 0:
                            InterfaceC0007h interfaceC0007h2 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            P0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            P0.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            P0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h2.g(str2, str3, (C0009j) obj4);
                                O2 = AbstractC0086a.x(null);
                            } catch (Throwable th) {
                                O2 = E0.g.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            p2.n(O2);
                            break;
                        case 1:
                            InterfaceC0007h interfaceC0007h3 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            P0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            P0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            P0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h3.k(str4, list3, (C0009j) obj7);
                                O3 = AbstractC0086a.x(null);
                            } catch (Throwable th2) {
                                O3 = E0.g.O(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            p2.n(O3);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0007h interfaceC0007h4 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            P0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            P0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O4 = AbstractC0086a.x(interfaceC0007h4.p(str5, (C0009j) obj9));
                            } catch (Throwable th3) {
                                O4 = E0.g.O(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            p2.n(O4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0007h interfaceC0007h5 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            P0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            P0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O5 = AbstractC0086a.x(interfaceC0007h5.q(str6, (C0009j) obj11));
                            } catch (Throwable th4) {
                                O5 = E0.g.O(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            p2.n(O5);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0007h interfaceC0007h6 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            P0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            P0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O6 = AbstractC0086a.x(interfaceC0007h6.a(str7, (C0009j) obj13));
                            } catch (Throwable th5) {
                                O6 = E0.g.O(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            p2.n(O6);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0007h interfaceC0007h7 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            P0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            P0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O7 = AbstractC0086a.x(interfaceC0007h7.o(str8, (C0009j) obj15));
                            } catch (Throwable th6) {
                                O7 = E0.g.O(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            p2.n(O7);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0007h interfaceC0007h8 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            P0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            P0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            P0.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h8.b(str9, booleanValue, (C0009j) obj18);
                                O8 = AbstractC0086a.x(null);
                            } catch (Throwable th7) {
                                O8 = E0.g.O(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            p2.n(O8);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0007h interfaceC0007h9 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            P0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            P0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O9 = AbstractC0086a.x(interfaceC0007h9.r(str10, (C0009j) obj20));
                            } catch (Throwable th8) {
                                O9 = E0.g.O(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            p2.n(O9);
                            break;
                        case H.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0007h interfaceC0007h10 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            P0.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            P0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O10 = AbstractC0086a.x(interfaceC0007h10.e(str11, (C0009j) obj22));
                            } catch (Throwable th9) {
                                O10 = E0.g.O(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            p2.n(O10);
                            break;
                        case 9:
                            InterfaceC0007h interfaceC0007h11 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            P0.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h11.f(list12, (C0009j) obj23);
                                O11 = AbstractC0086a.x(null);
                            } catch (Throwable th10) {
                                O11 = E0.g.O(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            p2.n(O11);
                            break;
                        case 10:
                            InterfaceC0007h interfaceC0007h12 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            P0.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O12 = AbstractC0086a.x(interfaceC0007h12.j(list14, (C0009j) obj24));
                            } catch (Throwable th11) {
                                O12 = E0.g.O(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            p2.n(O12);
                            break;
                        case 11:
                            InterfaceC0007h interfaceC0007h13 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            P0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O13 = AbstractC0086a.x(interfaceC0007h13.d(list16, (C0009j) obj25));
                            } catch (Throwable th12) {
                                O13 = E0.g.O(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            p2.n(O13);
                            break;
                        case 12:
                            InterfaceC0007h interfaceC0007h14 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            P0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            P0.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            P0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h14.n(str12, str13, (C0009j) obj28);
                                O14 = AbstractC0086a.x(null);
                            } catch (Throwable th13) {
                                O14 = E0.g.O(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            p2.n(O14);
                            break;
                        case 13:
                            InterfaceC0007h interfaceC0007h15 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            P0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            P0.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            P0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h15.h(str14, longValue, (C0009j) obj31);
                                O15 = AbstractC0086a.x(null);
                            } catch (Throwable th14) {
                                O15 = E0.g.O(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            p2.n(O15);
                            break;
                        default:
                            InterfaceC0007h interfaceC0007h16 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            P0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            P0.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            P0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h16.l(str15, doubleValue, (C0009j) obj34);
                                O16 = AbstractC0086a.x(null);
                            } catch (Throwable th15) {
                                O16 = E0.g.O(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            p2.n(O16);
                            break;
                    }
                }
            });
        } else {
            c0032n3.j(null);
        }
        C0032n c0032n4 = new C0032n(interfaceC0241f, L.d.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", concat), a(), g2);
        if (interfaceC0007h != null) {
            final int i5 = 14;
            c0032n4.j(new InterfaceC0237b() { // from class: B0.f
                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    List O2;
                    List O3;
                    List O4;
                    List O5;
                    List O6;
                    List O7;
                    List O8;
                    List O9;
                    List O10;
                    List O11;
                    List O12;
                    List O13;
                    List O14;
                    List O15;
                    List O16;
                    switch (i5) {
                        case 0:
                            InterfaceC0007h interfaceC0007h2 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            P0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            P0.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            P0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h2.g(str2, str3, (C0009j) obj4);
                                O2 = AbstractC0086a.x(null);
                            } catch (Throwable th) {
                                O2 = E0.g.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            p2.n(O2);
                            break;
                        case 1:
                            InterfaceC0007h interfaceC0007h3 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            P0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            P0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            P0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h3.k(str4, list3, (C0009j) obj7);
                                O3 = AbstractC0086a.x(null);
                            } catch (Throwable th2) {
                                O3 = E0.g.O(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            p2.n(O3);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0007h interfaceC0007h4 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            P0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            P0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O4 = AbstractC0086a.x(interfaceC0007h4.p(str5, (C0009j) obj9));
                            } catch (Throwable th3) {
                                O4 = E0.g.O(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            p2.n(O4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0007h interfaceC0007h5 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            P0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            P0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O5 = AbstractC0086a.x(interfaceC0007h5.q(str6, (C0009j) obj11));
                            } catch (Throwable th4) {
                                O5 = E0.g.O(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            p2.n(O5);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0007h interfaceC0007h6 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            P0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            P0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O6 = AbstractC0086a.x(interfaceC0007h6.a(str7, (C0009j) obj13));
                            } catch (Throwable th5) {
                                O6 = E0.g.O(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            p2.n(O6);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0007h interfaceC0007h7 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            P0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            P0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O7 = AbstractC0086a.x(interfaceC0007h7.o(str8, (C0009j) obj15));
                            } catch (Throwable th6) {
                                O7 = E0.g.O(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            p2.n(O7);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0007h interfaceC0007h8 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            P0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            P0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            P0.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h8.b(str9, booleanValue, (C0009j) obj18);
                                O8 = AbstractC0086a.x(null);
                            } catch (Throwable th7) {
                                O8 = E0.g.O(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            p2.n(O8);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0007h interfaceC0007h9 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            P0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            P0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O9 = AbstractC0086a.x(interfaceC0007h9.r(str10, (C0009j) obj20));
                            } catch (Throwable th8) {
                                O9 = E0.g.O(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            p2.n(O9);
                            break;
                        case H.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0007h interfaceC0007h10 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            P0.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            P0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O10 = AbstractC0086a.x(interfaceC0007h10.e(str11, (C0009j) obj22));
                            } catch (Throwable th9) {
                                O10 = E0.g.O(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            p2.n(O10);
                            break;
                        case 9:
                            InterfaceC0007h interfaceC0007h11 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            P0.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h11.f(list12, (C0009j) obj23);
                                O11 = AbstractC0086a.x(null);
                            } catch (Throwable th10) {
                                O11 = E0.g.O(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            p2.n(O11);
                            break;
                        case 10:
                            InterfaceC0007h interfaceC0007h12 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            P0.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O12 = AbstractC0086a.x(interfaceC0007h12.j(list14, (C0009j) obj24));
                            } catch (Throwable th11) {
                                O12 = E0.g.O(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            p2.n(O12);
                            break;
                        case 11:
                            InterfaceC0007h interfaceC0007h13 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            P0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O13 = AbstractC0086a.x(interfaceC0007h13.d(list16, (C0009j) obj25));
                            } catch (Throwable th12) {
                                O13 = E0.g.O(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            p2.n(O13);
                            break;
                        case 12:
                            InterfaceC0007h interfaceC0007h14 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            P0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            P0.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            P0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h14.n(str12, str13, (C0009j) obj28);
                                O14 = AbstractC0086a.x(null);
                            } catch (Throwable th13) {
                                O14 = E0.g.O(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            p2.n(O14);
                            break;
                        case 13:
                            InterfaceC0007h interfaceC0007h15 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            P0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            P0.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            P0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h15.h(str14, longValue, (C0009j) obj31);
                                O15 = AbstractC0086a.x(null);
                            } catch (Throwable th14) {
                                O15 = E0.g.O(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            p2.n(O15);
                            break;
                        default:
                            InterfaceC0007h interfaceC0007h16 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            P0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            P0.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            P0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h16.l(str15, doubleValue, (C0009j) obj34);
                                O16 = AbstractC0086a.x(null);
                            } catch (Throwable th15) {
                                O16 = E0.g.O(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            p2.n(O16);
                            break;
                    }
                }
            });
        } else {
            c0032n4.j(null);
        }
        C0032n c0032n5 = new C0032n(interfaceC0241f, L.d.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", concat), a(), g2);
        if (interfaceC0007h != null) {
            final int i6 = 0;
            c0032n5.j(new InterfaceC0237b() { // from class: B0.f
                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    List O2;
                    List O3;
                    List O4;
                    List O5;
                    List O6;
                    List O7;
                    List O8;
                    List O9;
                    List O10;
                    List O11;
                    List O12;
                    List O13;
                    List O14;
                    List O15;
                    List O16;
                    switch (i6) {
                        case 0:
                            InterfaceC0007h interfaceC0007h2 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            P0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            P0.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            P0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h2.g(str2, str3, (C0009j) obj4);
                                O2 = AbstractC0086a.x(null);
                            } catch (Throwable th) {
                                O2 = E0.g.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            p2.n(O2);
                            break;
                        case 1:
                            InterfaceC0007h interfaceC0007h3 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            P0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            P0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            P0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h3.k(str4, list3, (C0009j) obj7);
                                O3 = AbstractC0086a.x(null);
                            } catch (Throwable th2) {
                                O3 = E0.g.O(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            p2.n(O3);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0007h interfaceC0007h4 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            P0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            P0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O4 = AbstractC0086a.x(interfaceC0007h4.p(str5, (C0009j) obj9));
                            } catch (Throwable th3) {
                                O4 = E0.g.O(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            p2.n(O4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0007h interfaceC0007h5 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            P0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            P0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O5 = AbstractC0086a.x(interfaceC0007h5.q(str6, (C0009j) obj11));
                            } catch (Throwable th4) {
                                O5 = E0.g.O(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            p2.n(O5);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0007h interfaceC0007h6 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            P0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            P0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O6 = AbstractC0086a.x(interfaceC0007h6.a(str7, (C0009j) obj13));
                            } catch (Throwable th5) {
                                O6 = E0.g.O(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            p2.n(O6);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0007h interfaceC0007h7 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            P0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            P0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O7 = AbstractC0086a.x(interfaceC0007h7.o(str8, (C0009j) obj15));
                            } catch (Throwable th6) {
                                O7 = E0.g.O(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            p2.n(O7);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0007h interfaceC0007h8 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            P0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            P0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            P0.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h8.b(str9, booleanValue, (C0009j) obj18);
                                O8 = AbstractC0086a.x(null);
                            } catch (Throwable th7) {
                                O8 = E0.g.O(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            p2.n(O8);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0007h interfaceC0007h9 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            P0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            P0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O9 = AbstractC0086a.x(interfaceC0007h9.r(str10, (C0009j) obj20));
                            } catch (Throwable th8) {
                                O9 = E0.g.O(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            p2.n(O9);
                            break;
                        case H.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0007h interfaceC0007h10 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            P0.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            P0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O10 = AbstractC0086a.x(interfaceC0007h10.e(str11, (C0009j) obj22));
                            } catch (Throwable th9) {
                                O10 = E0.g.O(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            p2.n(O10);
                            break;
                        case 9:
                            InterfaceC0007h interfaceC0007h11 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            P0.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h11.f(list12, (C0009j) obj23);
                                O11 = AbstractC0086a.x(null);
                            } catch (Throwable th10) {
                                O11 = E0.g.O(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            p2.n(O11);
                            break;
                        case 10:
                            InterfaceC0007h interfaceC0007h12 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            P0.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O12 = AbstractC0086a.x(interfaceC0007h12.j(list14, (C0009j) obj24));
                            } catch (Throwable th11) {
                                O12 = E0.g.O(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            p2.n(O12);
                            break;
                        case 11:
                            InterfaceC0007h interfaceC0007h13 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            P0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O13 = AbstractC0086a.x(interfaceC0007h13.d(list16, (C0009j) obj25));
                            } catch (Throwable th12) {
                                O13 = E0.g.O(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            p2.n(O13);
                            break;
                        case 12:
                            InterfaceC0007h interfaceC0007h14 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            P0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            P0.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            P0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h14.n(str12, str13, (C0009j) obj28);
                                O14 = AbstractC0086a.x(null);
                            } catch (Throwable th13) {
                                O14 = E0.g.O(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            p2.n(O14);
                            break;
                        case 13:
                            InterfaceC0007h interfaceC0007h15 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            P0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            P0.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            P0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h15.h(str14, longValue, (C0009j) obj31);
                                O15 = AbstractC0086a.x(null);
                            } catch (Throwable th14) {
                                O15 = E0.g.O(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            p2.n(O15);
                            break;
                        default:
                            InterfaceC0007h interfaceC0007h16 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            P0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            P0.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            P0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h16.l(str15, doubleValue, (C0009j) obj34);
                                O16 = AbstractC0086a.x(null);
                            } catch (Throwable th15) {
                                O16 = E0.g.O(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            p2.n(O16);
                            break;
                    }
                }
            });
        } else {
            c0032n5.j(null);
        }
        C0032n c0032n6 = new C0032n(interfaceC0241f, L.d.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", concat), a(), g2);
        if (interfaceC0007h != null) {
            final int i7 = 1;
            c0032n6.j(new InterfaceC0237b() { // from class: B0.f
                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    List O2;
                    List O3;
                    List O4;
                    List O5;
                    List O6;
                    List O7;
                    List O8;
                    List O9;
                    List O10;
                    List O11;
                    List O12;
                    List O13;
                    List O14;
                    List O15;
                    List O16;
                    switch (i7) {
                        case 0:
                            InterfaceC0007h interfaceC0007h2 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            P0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            P0.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            P0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h2.g(str2, str3, (C0009j) obj4);
                                O2 = AbstractC0086a.x(null);
                            } catch (Throwable th) {
                                O2 = E0.g.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            p2.n(O2);
                            break;
                        case 1:
                            InterfaceC0007h interfaceC0007h3 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            P0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            P0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            P0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h3.k(str4, list3, (C0009j) obj7);
                                O3 = AbstractC0086a.x(null);
                            } catch (Throwable th2) {
                                O3 = E0.g.O(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            p2.n(O3);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0007h interfaceC0007h4 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            P0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            P0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O4 = AbstractC0086a.x(interfaceC0007h4.p(str5, (C0009j) obj9));
                            } catch (Throwable th3) {
                                O4 = E0.g.O(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            p2.n(O4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0007h interfaceC0007h5 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            P0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            P0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O5 = AbstractC0086a.x(interfaceC0007h5.q(str6, (C0009j) obj11));
                            } catch (Throwable th4) {
                                O5 = E0.g.O(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            p2.n(O5);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0007h interfaceC0007h6 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            P0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            P0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O6 = AbstractC0086a.x(interfaceC0007h6.a(str7, (C0009j) obj13));
                            } catch (Throwable th5) {
                                O6 = E0.g.O(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            p2.n(O6);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0007h interfaceC0007h7 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            P0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            P0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O7 = AbstractC0086a.x(interfaceC0007h7.o(str8, (C0009j) obj15));
                            } catch (Throwable th6) {
                                O7 = E0.g.O(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            p2.n(O7);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0007h interfaceC0007h8 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            P0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            P0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            P0.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h8.b(str9, booleanValue, (C0009j) obj18);
                                O8 = AbstractC0086a.x(null);
                            } catch (Throwable th7) {
                                O8 = E0.g.O(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            p2.n(O8);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0007h interfaceC0007h9 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            P0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            P0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O9 = AbstractC0086a.x(interfaceC0007h9.r(str10, (C0009j) obj20));
                            } catch (Throwable th8) {
                                O9 = E0.g.O(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            p2.n(O9);
                            break;
                        case H.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0007h interfaceC0007h10 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            P0.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            P0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O10 = AbstractC0086a.x(interfaceC0007h10.e(str11, (C0009j) obj22));
                            } catch (Throwable th9) {
                                O10 = E0.g.O(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            p2.n(O10);
                            break;
                        case 9:
                            InterfaceC0007h interfaceC0007h11 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            P0.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h11.f(list12, (C0009j) obj23);
                                O11 = AbstractC0086a.x(null);
                            } catch (Throwable th10) {
                                O11 = E0.g.O(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            p2.n(O11);
                            break;
                        case 10:
                            InterfaceC0007h interfaceC0007h12 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            P0.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O12 = AbstractC0086a.x(interfaceC0007h12.j(list14, (C0009j) obj24));
                            } catch (Throwable th11) {
                                O12 = E0.g.O(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            p2.n(O12);
                            break;
                        case 11:
                            InterfaceC0007h interfaceC0007h13 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            P0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O13 = AbstractC0086a.x(interfaceC0007h13.d(list16, (C0009j) obj25));
                            } catch (Throwable th12) {
                                O13 = E0.g.O(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            p2.n(O13);
                            break;
                        case 12:
                            InterfaceC0007h interfaceC0007h14 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            P0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            P0.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            P0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h14.n(str12, str13, (C0009j) obj28);
                                O14 = AbstractC0086a.x(null);
                            } catch (Throwable th13) {
                                O14 = E0.g.O(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            p2.n(O14);
                            break;
                        case 13:
                            InterfaceC0007h interfaceC0007h15 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            P0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            P0.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            P0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h15.h(str14, longValue, (C0009j) obj31);
                                O15 = AbstractC0086a.x(null);
                            } catch (Throwable th14) {
                                O15 = E0.g.O(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            p2.n(O15);
                            break;
                        default:
                            InterfaceC0007h interfaceC0007h16 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            P0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            P0.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            P0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h16.l(str15, doubleValue, (C0009j) obj34);
                                O16 = AbstractC0086a.x(null);
                            } catch (Throwable th15) {
                                O16 = E0.g.O(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            p2.n(O16);
                            break;
                    }
                }
            });
        } else {
            c0032n6.j(null);
        }
        C0032n c0032n7 = new C0032n(interfaceC0241f, L.d.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", concat), a(), g2);
        if (interfaceC0007h != null) {
            final int i8 = 2;
            c0032n7.j(new InterfaceC0237b() { // from class: B0.f
                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    List O2;
                    List O3;
                    List O4;
                    List O5;
                    List O6;
                    List O7;
                    List O8;
                    List O9;
                    List O10;
                    List O11;
                    List O12;
                    List O13;
                    List O14;
                    List O15;
                    List O16;
                    switch (i8) {
                        case 0:
                            InterfaceC0007h interfaceC0007h2 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            P0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            P0.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            P0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h2.g(str2, str3, (C0009j) obj4);
                                O2 = AbstractC0086a.x(null);
                            } catch (Throwable th) {
                                O2 = E0.g.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            p2.n(O2);
                            break;
                        case 1:
                            InterfaceC0007h interfaceC0007h3 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            P0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            P0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            P0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h3.k(str4, list3, (C0009j) obj7);
                                O3 = AbstractC0086a.x(null);
                            } catch (Throwable th2) {
                                O3 = E0.g.O(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            p2.n(O3);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0007h interfaceC0007h4 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            P0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            P0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O4 = AbstractC0086a.x(interfaceC0007h4.p(str5, (C0009j) obj9));
                            } catch (Throwable th3) {
                                O4 = E0.g.O(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            p2.n(O4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0007h interfaceC0007h5 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            P0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            P0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O5 = AbstractC0086a.x(interfaceC0007h5.q(str6, (C0009j) obj11));
                            } catch (Throwable th4) {
                                O5 = E0.g.O(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            p2.n(O5);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0007h interfaceC0007h6 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            P0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            P0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O6 = AbstractC0086a.x(interfaceC0007h6.a(str7, (C0009j) obj13));
                            } catch (Throwable th5) {
                                O6 = E0.g.O(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            p2.n(O6);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0007h interfaceC0007h7 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            P0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            P0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O7 = AbstractC0086a.x(interfaceC0007h7.o(str8, (C0009j) obj15));
                            } catch (Throwable th6) {
                                O7 = E0.g.O(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            p2.n(O7);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0007h interfaceC0007h8 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            P0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            P0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            P0.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h8.b(str9, booleanValue, (C0009j) obj18);
                                O8 = AbstractC0086a.x(null);
                            } catch (Throwable th7) {
                                O8 = E0.g.O(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            p2.n(O8);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0007h interfaceC0007h9 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            P0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            P0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O9 = AbstractC0086a.x(interfaceC0007h9.r(str10, (C0009j) obj20));
                            } catch (Throwable th8) {
                                O9 = E0.g.O(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            p2.n(O9);
                            break;
                        case H.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0007h interfaceC0007h10 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            P0.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            P0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O10 = AbstractC0086a.x(interfaceC0007h10.e(str11, (C0009j) obj22));
                            } catch (Throwable th9) {
                                O10 = E0.g.O(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            p2.n(O10);
                            break;
                        case 9:
                            InterfaceC0007h interfaceC0007h11 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            P0.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h11.f(list12, (C0009j) obj23);
                                O11 = AbstractC0086a.x(null);
                            } catch (Throwable th10) {
                                O11 = E0.g.O(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            p2.n(O11);
                            break;
                        case 10:
                            InterfaceC0007h interfaceC0007h12 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            P0.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O12 = AbstractC0086a.x(interfaceC0007h12.j(list14, (C0009j) obj24));
                            } catch (Throwable th11) {
                                O12 = E0.g.O(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            p2.n(O12);
                            break;
                        case 11:
                            InterfaceC0007h interfaceC0007h13 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            P0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O13 = AbstractC0086a.x(interfaceC0007h13.d(list16, (C0009j) obj25));
                            } catch (Throwable th12) {
                                O13 = E0.g.O(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            p2.n(O13);
                            break;
                        case 12:
                            InterfaceC0007h interfaceC0007h14 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            P0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            P0.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            P0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h14.n(str12, str13, (C0009j) obj28);
                                O14 = AbstractC0086a.x(null);
                            } catch (Throwable th13) {
                                O14 = E0.g.O(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            p2.n(O14);
                            break;
                        case 13:
                            InterfaceC0007h interfaceC0007h15 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            P0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            P0.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            P0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h15.h(str14, longValue, (C0009j) obj31);
                                O15 = AbstractC0086a.x(null);
                            } catch (Throwable th14) {
                                O15 = E0.g.O(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            p2.n(O15);
                            break;
                        default:
                            InterfaceC0007h interfaceC0007h16 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            P0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            P0.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            P0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h16.l(str15, doubleValue, (C0009j) obj34);
                                O16 = AbstractC0086a.x(null);
                            } catch (Throwable th15) {
                                O16 = E0.g.O(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            p2.n(O16);
                            break;
                    }
                }
            });
        } else {
            c0032n7.j(null);
        }
        C0032n c0032n8 = new C0032n(interfaceC0241f, L.d.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", concat), a(), g2);
        if (interfaceC0007h != null) {
            final int i9 = 3;
            c0032n8.j(new InterfaceC0237b() { // from class: B0.f
                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    List O2;
                    List O3;
                    List O4;
                    List O5;
                    List O6;
                    List O7;
                    List O8;
                    List O9;
                    List O10;
                    List O11;
                    List O12;
                    List O13;
                    List O14;
                    List O15;
                    List O16;
                    switch (i9) {
                        case 0:
                            InterfaceC0007h interfaceC0007h2 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            P0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            P0.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            P0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h2.g(str2, str3, (C0009j) obj4);
                                O2 = AbstractC0086a.x(null);
                            } catch (Throwable th) {
                                O2 = E0.g.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            p2.n(O2);
                            break;
                        case 1:
                            InterfaceC0007h interfaceC0007h3 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            P0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            P0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            P0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h3.k(str4, list3, (C0009j) obj7);
                                O3 = AbstractC0086a.x(null);
                            } catch (Throwable th2) {
                                O3 = E0.g.O(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            p2.n(O3);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0007h interfaceC0007h4 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            P0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            P0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O4 = AbstractC0086a.x(interfaceC0007h4.p(str5, (C0009j) obj9));
                            } catch (Throwable th3) {
                                O4 = E0.g.O(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            p2.n(O4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0007h interfaceC0007h5 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            P0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            P0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O5 = AbstractC0086a.x(interfaceC0007h5.q(str6, (C0009j) obj11));
                            } catch (Throwable th4) {
                                O5 = E0.g.O(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            p2.n(O5);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0007h interfaceC0007h6 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            P0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            P0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O6 = AbstractC0086a.x(interfaceC0007h6.a(str7, (C0009j) obj13));
                            } catch (Throwable th5) {
                                O6 = E0.g.O(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            p2.n(O6);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0007h interfaceC0007h7 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            P0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            P0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O7 = AbstractC0086a.x(interfaceC0007h7.o(str8, (C0009j) obj15));
                            } catch (Throwable th6) {
                                O7 = E0.g.O(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            p2.n(O7);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0007h interfaceC0007h8 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            P0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            P0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            P0.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h8.b(str9, booleanValue, (C0009j) obj18);
                                O8 = AbstractC0086a.x(null);
                            } catch (Throwable th7) {
                                O8 = E0.g.O(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            p2.n(O8);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0007h interfaceC0007h9 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            P0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            P0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O9 = AbstractC0086a.x(interfaceC0007h9.r(str10, (C0009j) obj20));
                            } catch (Throwable th8) {
                                O9 = E0.g.O(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            p2.n(O9);
                            break;
                        case H.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0007h interfaceC0007h10 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            P0.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            P0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O10 = AbstractC0086a.x(interfaceC0007h10.e(str11, (C0009j) obj22));
                            } catch (Throwable th9) {
                                O10 = E0.g.O(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            p2.n(O10);
                            break;
                        case 9:
                            InterfaceC0007h interfaceC0007h11 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            P0.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h11.f(list12, (C0009j) obj23);
                                O11 = AbstractC0086a.x(null);
                            } catch (Throwable th10) {
                                O11 = E0.g.O(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            p2.n(O11);
                            break;
                        case 10:
                            InterfaceC0007h interfaceC0007h12 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            P0.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O12 = AbstractC0086a.x(interfaceC0007h12.j(list14, (C0009j) obj24));
                            } catch (Throwable th11) {
                                O12 = E0.g.O(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            p2.n(O12);
                            break;
                        case 11:
                            InterfaceC0007h interfaceC0007h13 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            P0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O13 = AbstractC0086a.x(interfaceC0007h13.d(list16, (C0009j) obj25));
                            } catch (Throwable th12) {
                                O13 = E0.g.O(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            p2.n(O13);
                            break;
                        case 12:
                            InterfaceC0007h interfaceC0007h14 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            P0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            P0.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            P0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h14.n(str12, str13, (C0009j) obj28);
                                O14 = AbstractC0086a.x(null);
                            } catch (Throwable th13) {
                                O14 = E0.g.O(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            p2.n(O14);
                            break;
                        case 13:
                            InterfaceC0007h interfaceC0007h15 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            P0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            P0.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            P0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h15.h(str14, longValue, (C0009j) obj31);
                                O15 = AbstractC0086a.x(null);
                            } catch (Throwable th14) {
                                O15 = E0.g.O(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            p2.n(O15);
                            break;
                        default:
                            InterfaceC0007h interfaceC0007h16 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            P0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            P0.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            P0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h16.l(str15, doubleValue, (C0009j) obj34);
                                O16 = AbstractC0086a.x(null);
                            } catch (Throwable th15) {
                                O16 = E0.g.O(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            p2.n(O16);
                            break;
                    }
                }
            });
        } else {
            c0032n8.j(null);
        }
        C0032n c0032n9 = new C0032n(interfaceC0241f, L.d.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", concat), a(), g2);
        if (interfaceC0007h != null) {
            final int i10 = 4;
            c0032n9.j(new InterfaceC0237b() { // from class: B0.f
                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    List O2;
                    List O3;
                    List O4;
                    List O5;
                    List O6;
                    List O7;
                    List O8;
                    List O9;
                    List O10;
                    List O11;
                    List O12;
                    List O13;
                    List O14;
                    List O15;
                    List O16;
                    switch (i10) {
                        case 0:
                            InterfaceC0007h interfaceC0007h2 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            P0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            P0.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            P0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h2.g(str2, str3, (C0009j) obj4);
                                O2 = AbstractC0086a.x(null);
                            } catch (Throwable th) {
                                O2 = E0.g.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            p2.n(O2);
                            break;
                        case 1:
                            InterfaceC0007h interfaceC0007h3 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            P0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            P0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            P0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h3.k(str4, list3, (C0009j) obj7);
                                O3 = AbstractC0086a.x(null);
                            } catch (Throwable th2) {
                                O3 = E0.g.O(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            p2.n(O3);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0007h interfaceC0007h4 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            P0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            P0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O4 = AbstractC0086a.x(interfaceC0007h4.p(str5, (C0009j) obj9));
                            } catch (Throwable th3) {
                                O4 = E0.g.O(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            p2.n(O4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0007h interfaceC0007h5 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            P0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            P0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O5 = AbstractC0086a.x(interfaceC0007h5.q(str6, (C0009j) obj11));
                            } catch (Throwable th4) {
                                O5 = E0.g.O(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            p2.n(O5);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0007h interfaceC0007h6 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            P0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            P0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O6 = AbstractC0086a.x(interfaceC0007h6.a(str7, (C0009j) obj13));
                            } catch (Throwable th5) {
                                O6 = E0.g.O(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            p2.n(O6);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0007h interfaceC0007h7 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            P0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            P0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O7 = AbstractC0086a.x(interfaceC0007h7.o(str8, (C0009j) obj15));
                            } catch (Throwable th6) {
                                O7 = E0.g.O(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            p2.n(O7);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0007h interfaceC0007h8 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            P0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            P0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            P0.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h8.b(str9, booleanValue, (C0009j) obj18);
                                O8 = AbstractC0086a.x(null);
                            } catch (Throwable th7) {
                                O8 = E0.g.O(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            p2.n(O8);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0007h interfaceC0007h9 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            P0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            P0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O9 = AbstractC0086a.x(interfaceC0007h9.r(str10, (C0009j) obj20));
                            } catch (Throwable th8) {
                                O9 = E0.g.O(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            p2.n(O9);
                            break;
                        case H.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0007h interfaceC0007h10 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            P0.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            P0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O10 = AbstractC0086a.x(interfaceC0007h10.e(str11, (C0009j) obj22));
                            } catch (Throwable th9) {
                                O10 = E0.g.O(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            p2.n(O10);
                            break;
                        case 9:
                            InterfaceC0007h interfaceC0007h11 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            P0.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h11.f(list12, (C0009j) obj23);
                                O11 = AbstractC0086a.x(null);
                            } catch (Throwable th10) {
                                O11 = E0.g.O(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            p2.n(O11);
                            break;
                        case 10:
                            InterfaceC0007h interfaceC0007h12 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            P0.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O12 = AbstractC0086a.x(interfaceC0007h12.j(list14, (C0009j) obj24));
                            } catch (Throwable th11) {
                                O12 = E0.g.O(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            p2.n(O12);
                            break;
                        case 11:
                            InterfaceC0007h interfaceC0007h13 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            P0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O13 = AbstractC0086a.x(interfaceC0007h13.d(list16, (C0009j) obj25));
                            } catch (Throwable th12) {
                                O13 = E0.g.O(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            p2.n(O13);
                            break;
                        case 12:
                            InterfaceC0007h interfaceC0007h14 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            P0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            P0.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            P0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h14.n(str12, str13, (C0009j) obj28);
                                O14 = AbstractC0086a.x(null);
                            } catch (Throwable th13) {
                                O14 = E0.g.O(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            p2.n(O14);
                            break;
                        case 13:
                            InterfaceC0007h interfaceC0007h15 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            P0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            P0.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            P0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h15.h(str14, longValue, (C0009j) obj31);
                                O15 = AbstractC0086a.x(null);
                            } catch (Throwable th14) {
                                O15 = E0.g.O(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            p2.n(O15);
                            break;
                        default:
                            InterfaceC0007h interfaceC0007h16 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            P0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            P0.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            P0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h16.l(str15, doubleValue, (C0009j) obj34);
                                O16 = AbstractC0086a.x(null);
                            } catch (Throwable th15) {
                                O16 = E0.g.O(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            p2.n(O16);
                            break;
                    }
                }
            });
        } else {
            c0032n9.j(null);
        }
        C0032n c0032n10 = new C0032n(interfaceC0241f, L.d.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", concat), a(), g2);
        if (interfaceC0007h != null) {
            final int i11 = 5;
            c0032n10.j(new InterfaceC0237b() { // from class: B0.f
                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    List O2;
                    List O3;
                    List O4;
                    List O5;
                    List O6;
                    List O7;
                    List O8;
                    List O9;
                    List O10;
                    List O11;
                    List O12;
                    List O13;
                    List O14;
                    List O15;
                    List O16;
                    switch (i11) {
                        case 0:
                            InterfaceC0007h interfaceC0007h2 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            P0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            P0.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            P0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h2.g(str2, str3, (C0009j) obj4);
                                O2 = AbstractC0086a.x(null);
                            } catch (Throwable th) {
                                O2 = E0.g.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            p2.n(O2);
                            break;
                        case 1:
                            InterfaceC0007h interfaceC0007h3 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            P0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            P0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            P0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h3.k(str4, list3, (C0009j) obj7);
                                O3 = AbstractC0086a.x(null);
                            } catch (Throwable th2) {
                                O3 = E0.g.O(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            p2.n(O3);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0007h interfaceC0007h4 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            P0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            P0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O4 = AbstractC0086a.x(interfaceC0007h4.p(str5, (C0009j) obj9));
                            } catch (Throwable th3) {
                                O4 = E0.g.O(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            p2.n(O4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0007h interfaceC0007h5 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            P0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            P0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O5 = AbstractC0086a.x(interfaceC0007h5.q(str6, (C0009j) obj11));
                            } catch (Throwable th4) {
                                O5 = E0.g.O(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            p2.n(O5);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0007h interfaceC0007h6 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            P0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            P0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O6 = AbstractC0086a.x(interfaceC0007h6.a(str7, (C0009j) obj13));
                            } catch (Throwable th5) {
                                O6 = E0.g.O(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            p2.n(O6);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0007h interfaceC0007h7 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            P0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            P0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O7 = AbstractC0086a.x(interfaceC0007h7.o(str8, (C0009j) obj15));
                            } catch (Throwable th6) {
                                O7 = E0.g.O(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            p2.n(O7);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0007h interfaceC0007h8 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            P0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            P0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            P0.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h8.b(str9, booleanValue, (C0009j) obj18);
                                O8 = AbstractC0086a.x(null);
                            } catch (Throwable th7) {
                                O8 = E0.g.O(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            p2.n(O8);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0007h interfaceC0007h9 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            P0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            P0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O9 = AbstractC0086a.x(interfaceC0007h9.r(str10, (C0009j) obj20));
                            } catch (Throwable th8) {
                                O9 = E0.g.O(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            p2.n(O9);
                            break;
                        case H.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0007h interfaceC0007h10 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            P0.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            P0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O10 = AbstractC0086a.x(interfaceC0007h10.e(str11, (C0009j) obj22));
                            } catch (Throwable th9) {
                                O10 = E0.g.O(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            p2.n(O10);
                            break;
                        case 9:
                            InterfaceC0007h interfaceC0007h11 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            P0.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h11.f(list12, (C0009j) obj23);
                                O11 = AbstractC0086a.x(null);
                            } catch (Throwable th10) {
                                O11 = E0.g.O(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            p2.n(O11);
                            break;
                        case 10:
                            InterfaceC0007h interfaceC0007h12 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            P0.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O12 = AbstractC0086a.x(interfaceC0007h12.j(list14, (C0009j) obj24));
                            } catch (Throwable th11) {
                                O12 = E0.g.O(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            p2.n(O12);
                            break;
                        case 11:
                            InterfaceC0007h interfaceC0007h13 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            P0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O13 = AbstractC0086a.x(interfaceC0007h13.d(list16, (C0009j) obj25));
                            } catch (Throwable th12) {
                                O13 = E0.g.O(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            p2.n(O13);
                            break;
                        case 12:
                            InterfaceC0007h interfaceC0007h14 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            P0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            P0.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            P0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h14.n(str12, str13, (C0009j) obj28);
                                O14 = AbstractC0086a.x(null);
                            } catch (Throwable th13) {
                                O14 = E0.g.O(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            p2.n(O14);
                            break;
                        case 13:
                            InterfaceC0007h interfaceC0007h15 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            P0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            P0.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            P0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h15.h(str14, longValue, (C0009j) obj31);
                                O15 = AbstractC0086a.x(null);
                            } catch (Throwable th14) {
                                O15 = E0.g.O(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            p2.n(O15);
                            break;
                        default:
                            InterfaceC0007h interfaceC0007h16 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            P0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            P0.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            P0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h16.l(str15, doubleValue, (C0009j) obj34);
                                O16 = AbstractC0086a.x(null);
                            } catch (Throwable th15) {
                                O16 = E0.g.O(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            p2.n(O16);
                            break;
                    }
                }
            });
        } else {
            c0032n10.j(null);
        }
        C0032n c0032n11 = new C0032n(interfaceC0241f, L.d.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", concat), a(), g2);
        if (interfaceC0007h != null) {
            final int i12 = 7;
            c0032n11.j(new InterfaceC0237b() { // from class: B0.f
                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    List O2;
                    List O3;
                    List O4;
                    List O5;
                    List O6;
                    List O7;
                    List O8;
                    List O9;
                    List O10;
                    List O11;
                    List O12;
                    List O13;
                    List O14;
                    List O15;
                    List O16;
                    switch (i12) {
                        case 0:
                            InterfaceC0007h interfaceC0007h2 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            P0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            P0.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            P0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h2.g(str2, str3, (C0009j) obj4);
                                O2 = AbstractC0086a.x(null);
                            } catch (Throwable th) {
                                O2 = E0.g.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            p2.n(O2);
                            break;
                        case 1:
                            InterfaceC0007h interfaceC0007h3 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            P0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            P0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            P0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h3.k(str4, list3, (C0009j) obj7);
                                O3 = AbstractC0086a.x(null);
                            } catch (Throwable th2) {
                                O3 = E0.g.O(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            p2.n(O3);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0007h interfaceC0007h4 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            P0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            P0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O4 = AbstractC0086a.x(interfaceC0007h4.p(str5, (C0009j) obj9));
                            } catch (Throwable th3) {
                                O4 = E0.g.O(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            p2.n(O4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0007h interfaceC0007h5 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            P0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            P0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O5 = AbstractC0086a.x(interfaceC0007h5.q(str6, (C0009j) obj11));
                            } catch (Throwable th4) {
                                O5 = E0.g.O(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            p2.n(O5);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0007h interfaceC0007h6 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            P0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            P0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O6 = AbstractC0086a.x(interfaceC0007h6.a(str7, (C0009j) obj13));
                            } catch (Throwable th5) {
                                O6 = E0.g.O(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            p2.n(O6);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0007h interfaceC0007h7 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            P0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            P0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O7 = AbstractC0086a.x(interfaceC0007h7.o(str8, (C0009j) obj15));
                            } catch (Throwable th6) {
                                O7 = E0.g.O(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            p2.n(O7);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0007h interfaceC0007h8 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            P0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            P0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            P0.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h8.b(str9, booleanValue, (C0009j) obj18);
                                O8 = AbstractC0086a.x(null);
                            } catch (Throwable th7) {
                                O8 = E0.g.O(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            p2.n(O8);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0007h interfaceC0007h9 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            P0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            P0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O9 = AbstractC0086a.x(interfaceC0007h9.r(str10, (C0009j) obj20));
                            } catch (Throwable th8) {
                                O9 = E0.g.O(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            p2.n(O9);
                            break;
                        case H.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0007h interfaceC0007h10 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            P0.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            P0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O10 = AbstractC0086a.x(interfaceC0007h10.e(str11, (C0009j) obj22));
                            } catch (Throwable th9) {
                                O10 = E0.g.O(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            p2.n(O10);
                            break;
                        case 9:
                            InterfaceC0007h interfaceC0007h11 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            P0.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h11.f(list12, (C0009j) obj23);
                                O11 = AbstractC0086a.x(null);
                            } catch (Throwable th10) {
                                O11 = E0.g.O(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            p2.n(O11);
                            break;
                        case 10:
                            InterfaceC0007h interfaceC0007h12 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            P0.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O12 = AbstractC0086a.x(interfaceC0007h12.j(list14, (C0009j) obj24));
                            } catch (Throwable th11) {
                                O12 = E0.g.O(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            p2.n(O12);
                            break;
                        case 11:
                            InterfaceC0007h interfaceC0007h13 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            P0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O13 = AbstractC0086a.x(interfaceC0007h13.d(list16, (C0009j) obj25));
                            } catch (Throwable th12) {
                                O13 = E0.g.O(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            p2.n(O13);
                            break;
                        case 12:
                            InterfaceC0007h interfaceC0007h14 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            P0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            P0.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            P0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h14.n(str12, str13, (C0009j) obj28);
                                O14 = AbstractC0086a.x(null);
                            } catch (Throwable th13) {
                                O14 = E0.g.O(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            p2.n(O14);
                            break;
                        case 13:
                            InterfaceC0007h interfaceC0007h15 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            P0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            P0.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            P0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h15.h(str14, longValue, (C0009j) obj31);
                                O15 = AbstractC0086a.x(null);
                            } catch (Throwable th14) {
                                O15 = E0.g.O(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            p2.n(O15);
                            break;
                        default:
                            InterfaceC0007h interfaceC0007h16 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            P0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            P0.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            P0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h16.l(str15, doubleValue, (C0009j) obj34);
                                O16 = AbstractC0086a.x(null);
                            } catch (Throwable th15) {
                                O16 = E0.g.O(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            p2.n(O16);
                            break;
                    }
                }
            });
        } else {
            c0032n11.j(null);
        }
        C0032n c0032n12 = new C0032n(interfaceC0241f, L.d.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", concat), a(), g2);
        if (interfaceC0007h != null) {
            final int i13 = 8;
            c0032n12.j(new InterfaceC0237b() { // from class: B0.f
                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    List O2;
                    List O3;
                    List O4;
                    List O5;
                    List O6;
                    List O7;
                    List O8;
                    List O9;
                    List O10;
                    List O11;
                    List O12;
                    List O13;
                    List O14;
                    List O15;
                    List O16;
                    switch (i13) {
                        case 0:
                            InterfaceC0007h interfaceC0007h2 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            P0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            P0.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            P0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h2.g(str2, str3, (C0009j) obj4);
                                O2 = AbstractC0086a.x(null);
                            } catch (Throwable th) {
                                O2 = E0.g.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            p2.n(O2);
                            break;
                        case 1:
                            InterfaceC0007h interfaceC0007h3 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            P0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            P0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            P0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h3.k(str4, list3, (C0009j) obj7);
                                O3 = AbstractC0086a.x(null);
                            } catch (Throwable th2) {
                                O3 = E0.g.O(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            p2.n(O3);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0007h interfaceC0007h4 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            P0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            P0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O4 = AbstractC0086a.x(interfaceC0007h4.p(str5, (C0009j) obj9));
                            } catch (Throwable th3) {
                                O4 = E0.g.O(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            p2.n(O4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0007h interfaceC0007h5 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            P0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            P0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O5 = AbstractC0086a.x(interfaceC0007h5.q(str6, (C0009j) obj11));
                            } catch (Throwable th4) {
                                O5 = E0.g.O(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            p2.n(O5);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0007h interfaceC0007h6 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            P0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            P0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O6 = AbstractC0086a.x(interfaceC0007h6.a(str7, (C0009j) obj13));
                            } catch (Throwable th5) {
                                O6 = E0.g.O(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            p2.n(O6);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0007h interfaceC0007h7 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            P0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            P0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O7 = AbstractC0086a.x(interfaceC0007h7.o(str8, (C0009j) obj15));
                            } catch (Throwable th6) {
                                O7 = E0.g.O(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            p2.n(O7);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0007h interfaceC0007h8 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            P0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            P0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            P0.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h8.b(str9, booleanValue, (C0009j) obj18);
                                O8 = AbstractC0086a.x(null);
                            } catch (Throwable th7) {
                                O8 = E0.g.O(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            p2.n(O8);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0007h interfaceC0007h9 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            P0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            P0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O9 = AbstractC0086a.x(interfaceC0007h9.r(str10, (C0009j) obj20));
                            } catch (Throwable th8) {
                                O9 = E0.g.O(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            p2.n(O9);
                            break;
                        case H.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0007h interfaceC0007h10 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            P0.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            P0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O10 = AbstractC0086a.x(interfaceC0007h10.e(str11, (C0009j) obj22));
                            } catch (Throwable th9) {
                                O10 = E0.g.O(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            p2.n(O10);
                            break;
                        case 9:
                            InterfaceC0007h interfaceC0007h11 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            P0.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h11.f(list12, (C0009j) obj23);
                                O11 = AbstractC0086a.x(null);
                            } catch (Throwable th10) {
                                O11 = E0.g.O(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            p2.n(O11);
                            break;
                        case 10:
                            InterfaceC0007h interfaceC0007h12 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            P0.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O12 = AbstractC0086a.x(interfaceC0007h12.j(list14, (C0009j) obj24));
                            } catch (Throwable th11) {
                                O12 = E0.g.O(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            p2.n(O12);
                            break;
                        case 11:
                            InterfaceC0007h interfaceC0007h13 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            P0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O13 = AbstractC0086a.x(interfaceC0007h13.d(list16, (C0009j) obj25));
                            } catch (Throwable th12) {
                                O13 = E0.g.O(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            p2.n(O13);
                            break;
                        case 12:
                            InterfaceC0007h interfaceC0007h14 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            P0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            P0.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            P0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h14.n(str12, str13, (C0009j) obj28);
                                O14 = AbstractC0086a.x(null);
                            } catch (Throwable th13) {
                                O14 = E0.g.O(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            p2.n(O14);
                            break;
                        case 13:
                            InterfaceC0007h interfaceC0007h15 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            P0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            P0.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            P0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h15.h(str14, longValue, (C0009j) obj31);
                                O15 = AbstractC0086a.x(null);
                            } catch (Throwable th14) {
                                O15 = E0.g.O(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            p2.n(O15);
                            break;
                        default:
                            InterfaceC0007h interfaceC0007h16 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            P0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            P0.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            P0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h16.l(str15, doubleValue, (C0009j) obj34);
                                O16 = AbstractC0086a.x(null);
                            } catch (Throwable th15) {
                                O16 = E0.g.O(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            p2.n(O16);
                            break;
                    }
                }
            });
        } else {
            c0032n12.j(null);
        }
        C0032n c0032n13 = new C0032n(interfaceC0241f, L.d.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", concat), a(), g2);
        if (interfaceC0007h != null) {
            final int i14 = 9;
            c0032n13.j(new InterfaceC0237b() { // from class: B0.f
                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    List O2;
                    List O3;
                    List O4;
                    List O5;
                    List O6;
                    List O7;
                    List O8;
                    List O9;
                    List O10;
                    List O11;
                    List O12;
                    List O13;
                    List O14;
                    List O15;
                    List O16;
                    switch (i14) {
                        case 0:
                            InterfaceC0007h interfaceC0007h2 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            P0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            P0.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            P0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h2.g(str2, str3, (C0009j) obj4);
                                O2 = AbstractC0086a.x(null);
                            } catch (Throwable th) {
                                O2 = E0.g.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            p2.n(O2);
                            break;
                        case 1:
                            InterfaceC0007h interfaceC0007h3 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            P0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            P0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            P0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h3.k(str4, list3, (C0009j) obj7);
                                O3 = AbstractC0086a.x(null);
                            } catch (Throwable th2) {
                                O3 = E0.g.O(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            p2.n(O3);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0007h interfaceC0007h4 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            P0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            P0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O4 = AbstractC0086a.x(interfaceC0007h4.p(str5, (C0009j) obj9));
                            } catch (Throwable th3) {
                                O4 = E0.g.O(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            p2.n(O4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0007h interfaceC0007h5 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            P0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            P0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O5 = AbstractC0086a.x(interfaceC0007h5.q(str6, (C0009j) obj11));
                            } catch (Throwable th4) {
                                O5 = E0.g.O(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            p2.n(O5);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0007h interfaceC0007h6 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            P0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            P0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O6 = AbstractC0086a.x(interfaceC0007h6.a(str7, (C0009j) obj13));
                            } catch (Throwable th5) {
                                O6 = E0.g.O(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            p2.n(O6);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0007h interfaceC0007h7 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            P0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            P0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O7 = AbstractC0086a.x(interfaceC0007h7.o(str8, (C0009j) obj15));
                            } catch (Throwable th6) {
                                O7 = E0.g.O(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            p2.n(O7);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0007h interfaceC0007h8 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            P0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            P0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            P0.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h8.b(str9, booleanValue, (C0009j) obj18);
                                O8 = AbstractC0086a.x(null);
                            } catch (Throwable th7) {
                                O8 = E0.g.O(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            p2.n(O8);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0007h interfaceC0007h9 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            P0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            P0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O9 = AbstractC0086a.x(interfaceC0007h9.r(str10, (C0009j) obj20));
                            } catch (Throwable th8) {
                                O9 = E0.g.O(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            p2.n(O9);
                            break;
                        case H.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0007h interfaceC0007h10 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            P0.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            P0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O10 = AbstractC0086a.x(interfaceC0007h10.e(str11, (C0009j) obj22));
                            } catch (Throwable th9) {
                                O10 = E0.g.O(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            p2.n(O10);
                            break;
                        case 9:
                            InterfaceC0007h interfaceC0007h11 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            P0.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h11.f(list12, (C0009j) obj23);
                                O11 = AbstractC0086a.x(null);
                            } catch (Throwable th10) {
                                O11 = E0.g.O(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            p2.n(O11);
                            break;
                        case 10:
                            InterfaceC0007h interfaceC0007h12 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            P0.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O12 = AbstractC0086a.x(interfaceC0007h12.j(list14, (C0009j) obj24));
                            } catch (Throwable th11) {
                                O12 = E0.g.O(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            p2.n(O12);
                            break;
                        case 11:
                            InterfaceC0007h interfaceC0007h13 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            P0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O13 = AbstractC0086a.x(interfaceC0007h13.d(list16, (C0009j) obj25));
                            } catch (Throwable th12) {
                                O13 = E0.g.O(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            p2.n(O13);
                            break;
                        case 12:
                            InterfaceC0007h interfaceC0007h14 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            P0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            P0.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            P0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h14.n(str12, str13, (C0009j) obj28);
                                O14 = AbstractC0086a.x(null);
                            } catch (Throwable th13) {
                                O14 = E0.g.O(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            p2.n(O14);
                            break;
                        case 13:
                            InterfaceC0007h interfaceC0007h15 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            P0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            P0.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            P0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h15.h(str14, longValue, (C0009j) obj31);
                                O15 = AbstractC0086a.x(null);
                            } catch (Throwable th14) {
                                O15 = E0.g.O(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            p2.n(O15);
                            break;
                        default:
                            InterfaceC0007h interfaceC0007h16 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            P0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            P0.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            P0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h16.l(str15, doubleValue, (C0009j) obj34);
                                O16 = AbstractC0086a.x(null);
                            } catch (Throwable th15) {
                                O16 = E0.g.O(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            p2.n(O16);
                            break;
                    }
                }
            });
        } else {
            c0032n13.j(null);
        }
        C0032n c0032n14 = new C0032n(interfaceC0241f, L.d.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", concat), a(), g2);
        if (interfaceC0007h != null) {
            final int i15 = 10;
            c0032n14.j(new InterfaceC0237b() { // from class: B0.f
                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    List O2;
                    List O3;
                    List O4;
                    List O5;
                    List O6;
                    List O7;
                    List O8;
                    List O9;
                    List O10;
                    List O11;
                    List O12;
                    List O13;
                    List O14;
                    List O15;
                    List O16;
                    switch (i15) {
                        case 0:
                            InterfaceC0007h interfaceC0007h2 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            P0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            P0.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            P0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h2.g(str2, str3, (C0009j) obj4);
                                O2 = AbstractC0086a.x(null);
                            } catch (Throwable th) {
                                O2 = E0.g.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            p2.n(O2);
                            break;
                        case 1:
                            InterfaceC0007h interfaceC0007h3 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            P0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            P0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            P0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h3.k(str4, list3, (C0009j) obj7);
                                O3 = AbstractC0086a.x(null);
                            } catch (Throwable th2) {
                                O3 = E0.g.O(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            p2.n(O3);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0007h interfaceC0007h4 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            P0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            P0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O4 = AbstractC0086a.x(interfaceC0007h4.p(str5, (C0009j) obj9));
                            } catch (Throwable th3) {
                                O4 = E0.g.O(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            p2.n(O4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0007h interfaceC0007h5 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            P0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            P0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O5 = AbstractC0086a.x(interfaceC0007h5.q(str6, (C0009j) obj11));
                            } catch (Throwable th4) {
                                O5 = E0.g.O(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            p2.n(O5);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0007h interfaceC0007h6 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            P0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            P0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O6 = AbstractC0086a.x(interfaceC0007h6.a(str7, (C0009j) obj13));
                            } catch (Throwable th5) {
                                O6 = E0.g.O(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            p2.n(O6);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0007h interfaceC0007h7 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            P0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            P0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O7 = AbstractC0086a.x(interfaceC0007h7.o(str8, (C0009j) obj15));
                            } catch (Throwable th6) {
                                O7 = E0.g.O(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            p2.n(O7);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0007h interfaceC0007h8 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            P0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            P0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            P0.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h8.b(str9, booleanValue, (C0009j) obj18);
                                O8 = AbstractC0086a.x(null);
                            } catch (Throwable th7) {
                                O8 = E0.g.O(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            p2.n(O8);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0007h interfaceC0007h9 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            P0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            P0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O9 = AbstractC0086a.x(interfaceC0007h9.r(str10, (C0009j) obj20));
                            } catch (Throwable th8) {
                                O9 = E0.g.O(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            p2.n(O9);
                            break;
                        case H.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0007h interfaceC0007h10 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            P0.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            P0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O10 = AbstractC0086a.x(interfaceC0007h10.e(str11, (C0009j) obj22));
                            } catch (Throwable th9) {
                                O10 = E0.g.O(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            p2.n(O10);
                            break;
                        case 9:
                            InterfaceC0007h interfaceC0007h11 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            P0.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h11.f(list12, (C0009j) obj23);
                                O11 = AbstractC0086a.x(null);
                            } catch (Throwable th10) {
                                O11 = E0.g.O(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            p2.n(O11);
                            break;
                        case 10:
                            InterfaceC0007h interfaceC0007h12 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            P0.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O12 = AbstractC0086a.x(interfaceC0007h12.j(list14, (C0009j) obj24));
                            } catch (Throwable th11) {
                                O12 = E0.g.O(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            p2.n(O12);
                            break;
                        case 11:
                            InterfaceC0007h interfaceC0007h13 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            P0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O13 = AbstractC0086a.x(interfaceC0007h13.d(list16, (C0009j) obj25));
                            } catch (Throwable th12) {
                                O13 = E0.g.O(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            p2.n(O13);
                            break;
                        case 12:
                            InterfaceC0007h interfaceC0007h14 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            P0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            P0.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            P0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h14.n(str12, str13, (C0009j) obj28);
                                O14 = AbstractC0086a.x(null);
                            } catch (Throwable th13) {
                                O14 = E0.g.O(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            p2.n(O14);
                            break;
                        case 13:
                            InterfaceC0007h interfaceC0007h15 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            P0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            P0.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            P0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h15.h(str14, longValue, (C0009j) obj31);
                                O15 = AbstractC0086a.x(null);
                            } catch (Throwable th14) {
                                O15 = E0.g.O(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            p2.n(O15);
                            break;
                        default:
                            InterfaceC0007h interfaceC0007h16 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            P0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            P0.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            P0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h16.l(str15, doubleValue, (C0009j) obj34);
                                O16 = AbstractC0086a.x(null);
                            } catch (Throwable th15) {
                                O16 = E0.g.O(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            p2.n(O16);
                            break;
                    }
                }
            });
        } else {
            c0032n14.j(null);
        }
        C0032n c0032n15 = new C0032n(interfaceC0241f, L.d.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", concat), a(), g2);
        if (interfaceC0007h == null) {
            c0032n15.j(null);
        } else {
            final int i16 = 11;
            c0032n15.j(new InterfaceC0237b() { // from class: B0.f
                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    List O2;
                    List O3;
                    List O4;
                    List O5;
                    List O6;
                    List O7;
                    List O8;
                    List O9;
                    List O10;
                    List O11;
                    List O12;
                    List O13;
                    List O14;
                    List O15;
                    List O16;
                    switch (i16) {
                        case 0:
                            InterfaceC0007h interfaceC0007h2 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            P0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            P0.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            P0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h2.g(str2, str3, (C0009j) obj4);
                                O2 = AbstractC0086a.x(null);
                            } catch (Throwable th) {
                                O2 = E0.g.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            p2.n(O2);
                            break;
                        case 1:
                            InterfaceC0007h interfaceC0007h3 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            P0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            P0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            P0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h3.k(str4, list3, (C0009j) obj7);
                                O3 = AbstractC0086a.x(null);
                            } catch (Throwable th2) {
                                O3 = E0.g.O(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            p2.n(O3);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0007h interfaceC0007h4 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            P0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            P0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O4 = AbstractC0086a.x(interfaceC0007h4.p(str5, (C0009j) obj9));
                            } catch (Throwable th3) {
                                O4 = E0.g.O(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            p2.n(O4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0007h interfaceC0007h5 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            P0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            P0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O5 = AbstractC0086a.x(interfaceC0007h5.q(str6, (C0009j) obj11));
                            } catch (Throwable th4) {
                                O5 = E0.g.O(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            p2.n(O5);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0007h interfaceC0007h6 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            P0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            P0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O6 = AbstractC0086a.x(interfaceC0007h6.a(str7, (C0009j) obj13));
                            } catch (Throwable th5) {
                                O6 = E0.g.O(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            p2.n(O6);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0007h interfaceC0007h7 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            P0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            P0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O7 = AbstractC0086a.x(interfaceC0007h7.o(str8, (C0009j) obj15));
                            } catch (Throwable th6) {
                                O7 = E0.g.O(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            p2.n(O7);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0007h interfaceC0007h8 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            P0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            P0.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            P0.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h8.b(str9, booleanValue, (C0009j) obj18);
                                O8 = AbstractC0086a.x(null);
                            } catch (Throwable th7) {
                                O8 = E0.g.O(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            p2.n(O8);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0007h interfaceC0007h9 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            P0.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            P0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O9 = AbstractC0086a.x(interfaceC0007h9.r(str10, (C0009j) obj20));
                            } catch (Throwable th8) {
                                O9 = E0.g.O(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            p2.n(O9);
                            break;
                        case H.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0007h interfaceC0007h10 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            P0.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            P0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O10 = AbstractC0086a.x(interfaceC0007h10.e(str11, (C0009j) obj22));
                            } catch (Throwable th9) {
                                O10 = E0.g.O(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            p2.n(O10);
                            break;
                        case 9:
                            InterfaceC0007h interfaceC0007h11 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            P0.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h11.f(list12, (C0009j) obj23);
                                O11 = AbstractC0086a.x(null);
                            } catch (Throwable th10) {
                                O11 = E0.g.O(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            p2.n(O11);
                            break;
                        case 10:
                            InterfaceC0007h interfaceC0007h12 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            P0.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O12 = AbstractC0086a.x(interfaceC0007h12.j(list14, (C0009j) obj24));
                            } catch (Throwable th11) {
                                O12 = E0.g.O(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            p2.n(O12);
                            break;
                        case 11:
                            InterfaceC0007h interfaceC0007h13 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            P0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                O13 = AbstractC0086a.x(interfaceC0007h13.d(list16, (C0009j) obj25));
                            } catch (Throwable th12) {
                                O13 = E0.g.O(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            p2.n(O13);
                            break;
                        case 12:
                            InterfaceC0007h interfaceC0007h14 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            P0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            P0.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            P0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h14.n(str12, str13, (C0009j) obj28);
                                O14 = AbstractC0086a.x(null);
                            } catch (Throwable th13) {
                                O14 = E0.g.O(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            p2.n(O14);
                            break;
                        case 13:
                            InterfaceC0007h interfaceC0007h15 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            P0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            P0.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            P0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h15.h(str14, longValue, (C0009j) obj31);
                                O15 = AbstractC0086a.x(null);
                            } catch (Throwable th14) {
                                O15 = E0.g.O(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            p2.n(O15);
                            break;
                        default:
                            InterfaceC0007h interfaceC0007h16 = interfaceC0007h;
                            P0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            P0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            P0.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            P0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0007h16.l(str15, doubleValue, (C0009j) obj34);
                                O16 = AbstractC0086a.x(null);
                            } catch (Throwable th15) {
                                O16 = E0.g.O(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            p2.n(O16);
                            break;
                    }
                }
            });
        }
    }
}
