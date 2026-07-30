package s0;

import D.C0013n;
import L.Q;
import android.util.Log;
import java.util.List;
import n0.InterfaceC0210b;
import u0.C0245e;

/* renamed from: s0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0227f f2893a = new C0227f();

    /* renamed from: b, reason: collision with root package name */
    public static final C0245e f2894b = new C0245e(new C0225d());

    public static n0.j a() {
        return (n0.j) f2894b.a();
    }

    public static void b(n0.f fVar, final InterfaceC0228g interfaceC0228g, String str) {
        F0.i.e(fVar, "binaryMessenger");
        String concat = str.length() > 0 ? ".".concat(str) : "";
        E.a o2 = fVar.o(new n0.i());
        C0013n c0013n = new C0013n(fVar, F0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", concat), a(), o2);
        if (interfaceC0228g != null) {
            final int i2 = 6;
            c0013n.j(new InterfaceC0210b() { // from class: s0.e
                @Override // n0.InterfaceC0210b
                public final void i(Object obj, Q q2) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i2) {
                        case 0:
                            InterfaceC0228g interfaceC0228g2 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            F0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            F0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            F0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g2.b(str2, str3, (C0229h) obj4);
                                B2 = o.g.s(null);
                            } catch (Throwable th) {
                                B2 = v0.e.B(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            q2.e(B2);
                            break;
                        case 1:
                            InterfaceC0228g interfaceC0228g3 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            F0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            F0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            F0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g3.m(str4, list3, (C0229h) obj7);
                                B3 = o.g.s(null);
                            } catch (Throwable th2) {
                                B3 = v0.e.B(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            q2.e(B3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0228g interfaceC0228g4 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            F0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            F0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = o.g.s(interfaceC0228g4.c(str5, (C0229h) obj9));
                            } catch (Throwable th3) {
                                B4 = v0.e.B(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            q2.e(B4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0228g interfaceC0228g5 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            F0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            F0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = o.g.s(interfaceC0228g5.g(str6, (C0229h) obj11));
                            } catch (Throwable th4) {
                                B5 = v0.e.B(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            q2.e(B5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0228g interfaceC0228g6 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            F0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            F0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = o.g.s(interfaceC0228g6.e(str7, (C0229h) obj13));
                            } catch (Throwable th5) {
                                B6 = v0.e.B(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            q2.e(B6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0228g interfaceC0228g7 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            F0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            F0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = o.g.s(interfaceC0228g7.q(str8, (C0229h) obj15));
                            } catch (Throwable th6) {
                                B7 = v0.e.B(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            q2.e(B7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0228g interfaceC0228g8 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            F0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            F0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            F0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g8.i(str9, booleanValue, (C0229h) obj18);
                                B8 = o.g.s(null);
                            } catch (Throwable th7) {
                                B8 = v0.e.B(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            q2.e(B8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0228g interfaceC0228g9 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            F0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            F0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = o.g.s(interfaceC0228g9.h(str10, (C0229h) obj20));
                            } catch (Throwable th8) {
                                B9 = v0.e.B(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            q2.e(B9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0228g interfaceC0228g10 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            F0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            F0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = o.g.s(interfaceC0228g10.f(str11, (C0229h) obj22));
                            } catch (Throwable th9) {
                                B10 = v0.e.B(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            q2.e(B10);
                            break;
                        case 9:
                            InterfaceC0228g interfaceC0228g11 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            F0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g11.j(list12, (C0229h) obj23);
                                B11 = o.g.s(null);
                            } catch (Throwable th10) {
                                B11 = v0.e.B(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            q2.e(B11);
                            break;
                        case 10:
                            InterfaceC0228g interfaceC0228g12 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            F0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = o.g.s(interfaceC0228g12.o(list14, (C0229h) obj24));
                            } catch (Throwable th11) {
                                B12 = v0.e.B(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            q2.e(B12);
                            break;
                        case 11:
                            InterfaceC0228g interfaceC0228g13 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            F0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = o.g.s(interfaceC0228g13.a(list16, (C0229h) obj25));
                            } catch (Throwable th12) {
                                B13 = v0.e.B(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            q2.e(B13);
                            break;
                        case 12:
                            InterfaceC0228g interfaceC0228g14 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            F0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            F0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            F0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g14.p(str12, str13, (C0229h) obj28);
                                B14 = o.g.s(null);
                            } catch (Throwable th13) {
                                B14 = v0.e.B(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            q2.e(B14);
                            break;
                        case 13:
                            InterfaceC0228g interfaceC0228g15 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            F0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            F0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            F0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g15.l(str14, longValue, (C0229h) obj31);
                                B15 = o.g.s(null);
                            } catch (Throwable th14) {
                                B15 = v0.e.B(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            q2.e(B15);
                            break;
                        default:
                            InterfaceC0228g interfaceC0228g16 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            F0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            F0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            F0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g16.n(str15, doubleValue, (C0229h) obj34);
                                B16 = o.g.s(null);
                            } catch (Throwable th15) {
                                B16 = v0.e.B(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            q2.e(B16);
                            break;
                    }
                }
            });
        } else {
            c0013n.j(null);
        }
        C0013n c0013n2 = new C0013n(fVar, F0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", concat), a(), o2);
        if (interfaceC0228g != null) {
            final int i3 = 12;
            c0013n2.j(new InterfaceC0210b() { // from class: s0.e
                @Override // n0.InterfaceC0210b
                public final void i(Object obj, Q q2) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i3) {
                        case 0:
                            InterfaceC0228g interfaceC0228g2 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            F0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            F0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            F0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g2.b(str2, str3, (C0229h) obj4);
                                B2 = o.g.s(null);
                            } catch (Throwable th) {
                                B2 = v0.e.B(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            q2.e(B2);
                            break;
                        case 1:
                            InterfaceC0228g interfaceC0228g3 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            F0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            F0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            F0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g3.m(str4, list3, (C0229h) obj7);
                                B3 = o.g.s(null);
                            } catch (Throwable th2) {
                                B3 = v0.e.B(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            q2.e(B3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0228g interfaceC0228g4 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            F0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            F0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = o.g.s(interfaceC0228g4.c(str5, (C0229h) obj9));
                            } catch (Throwable th3) {
                                B4 = v0.e.B(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            q2.e(B4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0228g interfaceC0228g5 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            F0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            F0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = o.g.s(interfaceC0228g5.g(str6, (C0229h) obj11));
                            } catch (Throwable th4) {
                                B5 = v0.e.B(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            q2.e(B5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0228g interfaceC0228g6 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            F0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            F0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = o.g.s(interfaceC0228g6.e(str7, (C0229h) obj13));
                            } catch (Throwable th5) {
                                B6 = v0.e.B(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            q2.e(B6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0228g interfaceC0228g7 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            F0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            F0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = o.g.s(interfaceC0228g7.q(str8, (C0229h) obj15));
                            } catch (Throwable th6) {
                                B7 = v0.e.B(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            q2.e(B7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0228g interfaceC0228g8 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            F0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            F0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            F0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g8.i(str9, booleanValue, (C0229h) obj18);
                                B8 = o.g.s(null);
                            } catch (Throwable th7) {
                                B8 = v0.e.B(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            q2.e(B8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0228g interfaceC0228g9 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            F0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            F0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = o.g.s(interfaceC0228g9.h(str10, (C0229h) obj20));
                            } catch (Throwable th8) {
                                B9 = v0.e.B(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            q2.e(B9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0228g interfaceC0228g10 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            F0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            F0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = o.g.s(interfaceC0228g10.f(str11, (C0229h) obj22));
                            } catch (Throwable th9) {
                                B10 = v0.e.B(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            q2.e(B10);
                            break;
                        case 9:
                            InterfaceC0228g interfaceC0228g11 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            F0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g11.j(list12, (C0229h) obj23);
                                B11 = o.g.s(null);
                            } catch (Throwable th10) {
                                B11 = v0.e.B(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            q2.e(B11);
                            break;
                        case 10:
                            InterfaceC0228g interfaceC0228g12 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            F0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = o.g.s(interfaceC0228g12.o(list14, (C0229h) obj24));
                            } catch (Throwable th11) {
                                B12 = v0.e.B(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            q2.e(B12);
                            break;
                        case 11:
                            InterfaceC0228g interfaceC0228g13 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            F0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = o.g.s(interfaceC0228g13.a(list16, (C0229h) obj25));
                            } catch (Throwable th12) {
                                B13 = v0.e.B(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            q2.e(B13);
                            break;
                        case 12:
                            InterfaceC0228g interfaceC0228g14 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            F0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            F0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            F0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g14.p(str12, str13, (C0229h) obj28);
                                B14 = o.g.s(null);
                            } catch (Throwable th13) {
                                B14 = v0.e.B(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            q2.e(B14);
                            break;
                        case 13:
                            InterfaceC0228g interfaceC0228g15 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            F0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            F0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            F0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g15.l(str14, longValue, (C0229h) obj31);
                                B15 = o.g.s(null);
                            } catch (Throwable th14) {
                                B15 = v0.e.B(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            q2.e(B15);
                            break;
                        default:
                            InterfaceC0228g interfaceC0228g16 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            F0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            F0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            F0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g16.n(str15, doubleValue, (C0229h) obj34);
                                B16 = o.g.s(null);
                            } catch (Throwable th15) {
                                B16 = v0.e.B(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            q2.e(B16);
                            break;
                    }
                }
            });
        } else {
            c0013n2.j(null);
        }
        C0013n c0013n3 = new C0013n(fVar, F0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", concat), a(), o2);
        if (interfaceC0228g != null) {
            final int i4 = 13;
            c0013n3.j(new InterfaceC0210b() { // from class: s0.e
                @Override // n0.InterfaceC0210b
                public final void i(Object obj, Q q2) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i4) {
                        case 0:
                            InterfaceC0228g interfaceC0228g2 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            F0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            F0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            F0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g2.b(str2, str3, (C0229h) obj4);
                                B2 = o.g.s(null);
                            } catch (Throwable th) {
                                B2 = v0.e.B(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            q2.e(B2);
                            break;
                        case 1:
                            InterfaceC0228g interfaceC0228g3 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            F0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            F0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            F0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g3.m(str4, list3, (C0229h) obj7);
                                B3 = o.g.s(null);
                            } catch (Throwable th2) {
                                B3 = v0.e.B(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            q2.e(B3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0228g interfaceC0228g4 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            F0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            F0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = o.g.s(interfaceC0228g4.c(str5, (C0229h) obj9));
                            } catch (Throwable th3) {
                                B4 = v0.e.B(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            q2.e(B4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0228g interfaceC0228g5 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            F0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            F0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = o.g.s(interfaceC0228g5.g(str6, (C0229h) obj11));
                            } catch (Throwable th4) {
                                B5 = v0.e.B(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            q2.e(B5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0228g interfaceC0228g6 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            F0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            F0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = o.g.s(interfaceC0228g6.e(str7, (C0229h) obj13));
                            } catch (Throwable th5) {
                                B6 = v0.e.B(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            q2.e(B6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0228g interfaceC0228g7 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            F0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            F0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = o.g.s(interfaceC0228g7.q(str8, (C0229h) obj15));
                            } catch (Throwable th6) {
                                B7 = v0.e.B(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            q2.e(B7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0228g interfaceC0228g8 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            F0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            F0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            F0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g8.i(str9, booleanValue, (C0229h) obj18);
                                B8 = o.g.s(null);
                            } catch (Throwable th7) {
                                B8 = v0.e.B(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            q2.e(B8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0228g interfaceC0228g9 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            F0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            F0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = o.g.s(interfaceC0228g9.h(str10, (C0229h) obj20));
                            } catch (Throwable th8) {
                                B9 = v0.e.B(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            q2.e(B9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0228g interfaceC0228g10 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            F0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            F0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = o.g.s(interfaceC0228g10.f(str11, (C0229h) obj22));
                            } catch (Throwable th9) {
                                B10 = v0.e.B(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            q2.e(B10);
                            break;
                        case 9:
                            InterfaceC0228g interfaceC0228g11 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            F0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g11.j(list12, (C0229h) obj23);
                                B11 = o.g.s(null);
                            } catch (Throwable th10) {
                                B11 = v0.e.B(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            q2.e(B11);
                            break;
                        case 10:
                            InterfaceC0228g interfaceC0228g12 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            F0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = o.g.s(interfaceC0228g12.o(list14, (C0229h) obj24));
                            } catch (Throwable th11) {
                                B12 = v0.e.B(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            q2.e(B12);
                            break;
                        case 11:
                            InterfaceC0228g interfaceC0228g13 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            F0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = o.g.s(interfaceC0228g13.a(list16, (C0229h) obj25));
                            } catch (Throwable th12) {
                                B13 = v0.e.B(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            q2.e(B13);
                            break;
                        case 12:
                            InterfaceC0228g interfaceC0228g14 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            F0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            F0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            F0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g14.p(str12, str13, (C0229h) obj28);
                                B14 = o.g.s(null);
                            } catch (Throwable th13) {
                                B14 = v0.e.B(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            q2.e(B14);
                            break;
                        case 13:
                            InterfaceC0228g interfaceC0228g15 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            F0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            F0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            F0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g15.l(str14, longValue, (C0229h) obj31);
                                B15 = o.g.s(null);
                            } catch (Throwable th14) {
                                B15 = v0.e.B(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            q2.e(B15);
                            break;
                        default:
                            InterfaceC0228g interfaceC0228g16 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            F0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            F0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            F0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g16.n(str15, doubleValue, (C0229h) obj34);
                                B16 = o.g.s(null);
                            } catch (Throwable th15) {
                                B16 = v0.e.B(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            q2.e(B16);
                            break;
                    }
                }
            });
        } else {
            c0013n3.j(null);
        }
        C0013n c0013n4 = new C0013n(fVar, F0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", concat), a(), o2);
        if (interfaceC0228g != null) {
            final int i5 = 14;
            c0013n4.j(new InterfaceC0210b() { // from class: s0.e
                @Override // n0.InterfaceC0210b
                public final void i(Object obj, Q q2) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i5) {
                        case 0:
                            InterfaceC0228g interfaceC0228g2 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            F0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            F0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            F0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g2.b(str2, str3, (C0229h) obj4);
                                B2 = o.g.s(null);
                            } catch (Throwable th) {
                                B2 = v0.e.B(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            q2.e(B2);
                            break;
                        case 1:
                            InterfaceC0228g interfaceC0228g3 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            F0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            F0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            F0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g3.m(str4, list3, (C0229h) obj7);
                                B3 = o.g.s(null);
                            } catch (Throwable th2) {
                                B3 = v0.e.B(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            q2.e(B3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0228g interfaceC0228g4 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            F0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            F0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = o.g.s(interfaceC0228g4.c(str5, (C0229h) obj9));
                            } catch (Throwable th3) {
                                B4 = v0.e.B(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            q2.e(B4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0228g interfaceC0228g5 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            F0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            F0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = o.g.s(interfaceC0228g5.g(str6, (C0229h) obj11));
                            } catch (Throwable th4) {
                                B5 = v0.e.B(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            q2.e(B5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0228g interfaceC0228g6 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            F0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            F0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = o.g.s(interfaceC0228g6.e(str7, (C0229h) obj13));
                            } catch (Throwable th5) {
                                B6 = v0.e.B(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            q2.e(B6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0228g interfaceC0228g7 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            F0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            F0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = o.g.s(interfaceC0228g7.q(str8, (C0229h) obj15));
                            } catch (Throwable th6) {
                                B7 = v0.e.B(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            q2.e(B7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0228g interfaceC0228g8 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            F0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            F0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            F0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g8.i(str9, booleanValue, (C0229h) obj18);
                                B8 = o.g.s(null);
                            } catch (Throwable th7) {
                                B8 = v0.e.B(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            q2.e(B8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0228g interfaceC0228g9 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            F0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            F0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = o.g.s(interfaceC0228g9.h(str10, (C0229h) obj20));
                            } catch (Throwable th8) {
                                B9 = v0.e.B(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            q2.e(B9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0228g interfaceC0228g10 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            F0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            F0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = o.g.s(interfaceC0228g10.f(str11, (C0229h) obj22));
                            } catch (Throwable th9) {
                                B10 = v0.e.B(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            q2.e(B10);
                            break;
                        case 9:
                            InterfaceC0228g interfaceC0228g11 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            F0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g11.j(list12, (C0229h) obj23);
                                B11 = o.g.s(null);
                            } catch (Throwable th10) {
                                B11 = v0.e.B(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            q2.e(B11);
                            break;
                        case 10:
                            InterfaceC0228g interfaceC0228g12 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            F0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = o.g.s(interfaceC0228g12.o(list14, (C0229h) obj24));
                            } catch (Throwable th11) {
                                B12 = v0.e.B(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            q2.e(B12);
                            break;
                        case 11:
                            InterfaceC0228g interfaceC0228g13 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            F0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = o.g.s(interfaceC0228g13.a(list16, (C0229h) obj25));
                            } catch (Throwable th12) {
                                B13 = v0.e.B(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            q2.e(B13);
                            break;
                        case 12:
                            InterfaceC0228g interfaceC0228g14 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            F0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            F0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            F0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g14.p(str12, str13, (C0229h) obj28);
                                B14 = o.g.s(null);
                            } catch (Throwable th13) {
                                B14 = v0.e.B(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            q2.e(B14);
                            break;
                        case 13:
                            InterfaceC0228g interfaceC0228g15 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            F0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            F0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            F0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g15.l(str14, longValue, (C0229h) obj31);
                                B15 = o.g.s(null);
                            } catch (Throwable th14) {
                                B15 = v0.e.B(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            q2.e(B15);
                            break;
                        default:
                            InterfaceC0228g interfaceC0228g16 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            F0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            F0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            F0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g16.n(str15, doubleValue, (C0229h) obj34);
                                B16 = o.g.s(null);
                            } catch (Throwable th15) {
                                B16 = v0.e.B(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            q2.e(B16);
                            break;
                    }
                }
            });
        } else {
            c0013n4.j(null);
        }
        C0013n c0013n5 = new C0013n(fVar, F0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", concat), a(), o2);
        if (interfaceC0228g != null) {
            final int i6 = 0;
            c0013n5.j(new InterfaceC0210b() { // from class: s0.e
                @Override // n0.InterfaceC0210b
                public final void i(Object obj, Q q2) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i6) {
                        case 0:
                            InterfaceC0228g interfaceC0228g2 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            F0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            F0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            F0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g2.b(str2, str3, (C0229h) obj4);
                                B2 = o.g.s(null);
                            } catch (Throwable th) {
                                B2 = v0.e.B(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            q2.e(B2);
                            break;
                        case 1:
                            InterfaceC0228g interfaceC0228g3 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            F0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            F0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            F0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g3.m(str4, list3, (C0229h) obj7);
                                B3 = o.g.s(null);
                            } catch (Throwable th2) {
                                B3 = v0.e.B(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            q2.e(B3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0228g interfaceC0228g4 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            F0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            F0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = o.g.s(interfaceC0228g4.c(str5, (C0229h) obj9));
                            } catch (Throwable th3) {
                                B4 = v0.e.B(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            q2.e(B4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0228g interfaceC0228g5 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            F0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            F0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = o.g.s(interfaceC0228g5.g(str6, (C0229h) obj11));
                            } catch (Throwable th4) {
                                B5 = v0.e.B(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            q2.e(B5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0228g interfaceC0228g6 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            F0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            F0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = o.g.s(interfaceC0228g6.e(str7, (C0229h) obj13));
                            } catch (Throwable th5) {
                                B6 = v0.e.B(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            q2.e(B6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0228g interfaceC0228g7 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            F0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            F0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = o.g.s(interfaceC0228g7.q(str8, (C0229h) obj15));
                            } catch (Throwable th6) {
                                B7 = v0.e.B(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            q2.e(B7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0228g interfaceC0228g8 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            F0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            F0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            F0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g8.i(str9, booleanValue, (C0229h) obj18);
                                B8 = o.g.s(null);
                            } catch (Throwable th7) {
                                B8 = v0.e.B(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            q2.e(B8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0228g interfaceC0228g9 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            F0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            F0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = o.g.s(interfaceC0228g9.h(str10, (C0229h) obj20));
                            } catch (Throwable th8) {
                                B9 = v0.e.B(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            q2.e(B9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0228g interfaceC0228g10 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            F0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            F0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = o.g.s(interfaceC0228g10.f(str11, (C0229h) obj22));
                            } catch (Throwable th9) {
                                B10 = v0.e.B(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            q2.e(B10);
                            break;
                        case 9:
                            InterfaceC0228g interfaceC0228g11 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            F0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g11.j(list12, (C0229h) obj23);
                                B11 = o.g.s(null);
                            } catch (Throwable th10) {
                                B11 = v0.e.B(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            q2.e(B11);
                            break;
                        case 10:
                            InterfaceC0228g interfaceC0228g12 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            F0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = o.g.s(interfaceC0228g12.o(list14, (C0229h) obj24));
                            } catch (Throwable th11) {
                                B12 = v0.e.B(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            q2.e(B12);
                            break;
                        case 11:
                            InterfaceC0228g interfaceC0228g13 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            F0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = o.g.s(interfaceC0228g13.a(list16, (C0229h) obj25));
                            } catch (Throwable th12) {
                                B13 = v0.e.B(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            q2.e(B13);
                            break;
                        case 12:
                            InterfaceC0228g interfaceC0228g14 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            F0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            F0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            F0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g14.p(str12, str13, (C0229h) obj28);
                                B14 = o.g.s(null);
                            } catch (Throwable th13) {
                                B14 = v0.e.B(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            q2.e(B14);
                            break;
                        case 13:
                            InterfaceC0228g interfaceC0228g15 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            F0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            F0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            F0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g15.l(str14, longValue, (C0229h) obj31);
                                B15 = o.g.s(null);
                            } catch (Throwable th14) {
                                B15 = v0.e.B(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            q2.e(B15);
                            break;
                        default:
                            InterfaceC0228g interfaceC0228g16 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            F0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            F0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            F0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g16.n(str15, doubleValue, (C0229h) obj34);
                                B16 = o.g.s(null);
                            } catch (Throwable th15) {
                                B16 = v0.e.B(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            q2.e(B16);
                            break;
                    }
                }
            });
        } else {
            c0013n5.j(null);
        }
        C0013n c0013n6 = new C0013n(fVar, F0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", concat), a(), o2);
        if (interfaceC0228g != null) {
            final int i7 = 1;
            c0013n6.j(new InterfaceC0210b() { // from class: s0.e
                @Override // n0.InterfaceC0210b
                public final void i(Object obj, Q q2) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i7) {
                        case 0:
                            InterfaceC0228g interfaceC0228g2 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            F0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            F0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            F0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g2.b(str2, str3, (C0229h) obj4);
                                B2 = o.g.s(null);
                            } catch (Throwable th) {
                                B2 = v0.e.B(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            q2.e(B2);
                            break;
                        case 1:
                            InterfaceC0228g interfaceC0228g3 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            F0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            F0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            F0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g3.m(str4, list3, (C0229h) obj7);
                                B3 = o.g.s(null);
                            } catch (Throwable th2) {
                                B3 = v0.e.B(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            q2.e(B3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0228g interfaceC0228g4 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            F0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            F0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = o.g.s(interfaceC0228g4.c(str5, (C0229h) obj9));
                            } catch (Throwable th3) {
                                B4 = v0.e.B(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            q2.e(B4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0228g interfaceC0228g5 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            F0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            F0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = o.g.s(interfaceC0228g5.g(str6, (C0229h) obj11));
                            } catch (Throwable th4) {
                                B5 = v0.e.B(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            q2.e(B5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0228g interfaceC0228g6 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            F0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            F0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = o.g.s(interfaceC0228g6.e(str7, (C0229h) obj13));
                            } catch (Throwable th5) {
                                B6 = v0.e.B(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            q2.e(B6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0228g interfaceC0228g7 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            F0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            F0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = o.g.s(interfaceC0228g7.q(str8, (C0229h) obj15));
                            } catch (Throwable th6) {
                                B7 = v0.e.B(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            q2.e(B7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0228g interfaceC0228g8 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            F0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            F0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            F0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g8.i(str9, booleanValue, (C0229h) obj18);
                                B8 = o.g.s(null);
                            } catch (Throwable th7) {
                                B8 = v0.e.B(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            q2.e(B8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0228g interfaceC0228g9 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            F0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            F0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = o.g.s(interfaceC0228g9.h(str10, (C0229h) obj20));
                            } catch (Throwable th8) {
                                B9 = v0.e.B(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            q2.e(B9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0228g interfaceC0228g10 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            F0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            F0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = o.g.s(interfaceC0228g10.f(str11, (C0229h) obj22));
                            } catch (Throwable th9) {
                                B10 = v0.e.B(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            q2.e(B10);
                            break;
                        case 9:
                            InterfaceC0228g interfaceC0228g11 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            F0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g11.j(list12, (C0229h) obj23);
                                B11 = o.g.s(null);
                            } catch (Throwable th10) {
                                B11 = v0.e.B(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            q2.e(B11);
                            break;
                        case 10:
                            InterfaceC0228g interfaceC0228g12 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            F0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = o.g.s(interfaceC0228g12.o(list14, (C0229h) obj24));
                            } catch (Throwable th11) {
                                B12 = v0.e.B(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            q2.e(B12);
                            break;
                        case 11:
                            InterfaceC0228g interfaceC0228g13 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            F0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = o.g.s(interfaceC0228g13.a(list16, (C0229h) obj25));
                            } catch (Throwable th12) {
                                B13 = v0.e.B(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            q2.e(B13);
                            break;
                        case 12:
                            InterfaceC0228g interfaceC0228g14 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            F0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            F0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            F0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g14.p(str12, str13, (C0229h) obj28);
                                B14 = o.g.s(null);
                            } catch (Throwable th13) {
                                B14 = v0.e.B(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            q2.e(B14);
                            break;
                        case 13:
                            InterfaceC0228g interfaceC0228g15 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            F0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            F0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            F0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g15.l(str14, longValue, (C0229h) obj31);
                                B15 = o.g.s(null);
                            } catch (Throwable th14) {
                                B15 = v0.e.B(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            q2.e(B15);
                            break;
                        default:
                            InterfaceC0228g interfaceC0228g16 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            F0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            F0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            F0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g16.n(str15, doubleValue, (C0229h) obj34);
                                B16 = o.g.s(null);
                            } catch (Throwable th15) {
                                B16 = v0.e.B(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            q2.e(B16);
                            break;
                    }
                }
            });
        } else {
            c0013n6.j(null);
        }
        C0013n c0013n7 = new C0013n(fVar, F0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", concat), a(), o2);
        if (interfaceC0228g != null) {
            final int i8 = 2;
            c0013n7.j(new InterfaceC0210b() { // from class: s0.e
                @Override // n0.InterfaceC0210b
                public final void i(Object obj, Q q2) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i8) {
                        case 0:
                            InterfaceC0228g interfaceC0228g2 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            F0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            F0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            F0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g2.b(str2, str3, (C0229h) obj4);
                                B2 = o.g.s(null);
                            } catch (Throwable th) {
                                B2 = v0.e.B(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            q2.e(B2);
                            break;
                        case 1:
                            InterfaceC0228g interfaceC0228g3 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            F0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            F0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            F0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g3.m(str4, list3, (C0229h) obj7);
                                B3 = o.g.s(null);
                            } catch (Throwable th2) {
                                B3 = v0.e.B(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            q2.e(B3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0228g interfaceC0228g4 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            F0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            F0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = o.g.s(interfaceC0228g4.c(str5, (C0229h) obj9));
                            } catch (Throwable th3) {
                                B4 = v0.e.B(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            q2.e(B4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0228g interfaceC0228g5 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            F0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            F0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = o.g.s(interfaceC0228g5.g(str6, (C0229h) obj11));
                            } catch (Throwable th4) {
                                B5 = v0.e.B(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            q2.e(B5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0228g interfaceC0228g6 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            F0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            F0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = o.g.s(interfaceC0228g6.e(str7, (C0229h) obj13));
                            } catch (Throwable th5) {
                                B6 = v0.e.B(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            q2.e(B6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0228g interfaceC0228g7 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            F0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            F0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = o.g.s(interfaceC0228g7.q(str8, (C0229h) obj15));
                            } catch (Throwable th6) {
                                B7 = v0.e.B(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            q2.e(B7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0228g interfaceC0228g8 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            F0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            F0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            F0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g8.i(str9, booleanValue, (C0229h) obj18);
                                B8 = o.g.s(null);
                            } catch (Throwable th7) {
                                B8 = v0.e.B(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            q2.e(B8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0228g interfaceC0228g9 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            F0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            F0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = o.g.s(interfaceC0228g9.h(str10, (C0229h) obj20));
                            } catch (Throwable th8) {
                                B9 = v0.e.B(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            q2.e(B9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0228g interfaceC0228g10 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            F0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            F0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = o.g.s(interfaceC0228g10.f(str11, (C0229h) obj22));
                            } catch (Throwable th9) {
                                B10 = v0.e.B(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            q2.e(B10);
                            break;
                        case 9:
                            InterfaceC0228g interfaceC0228g11 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            F0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g11.j(list12, (C0229h) obj23);
                                B11 = o.g.s(null);
                            } catch (Throwable th10) {
                                B11 = v0.e.B(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            q2.e(B11);
                            break;
                        case 10:
                            InterfaceC0228g interfaceC0228g12 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            F0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = o.g.s(interfaceC0228g12.o(list14, (C0229h) obj24));
                            } catch (Throwable th11) {
                                B12 = v0.e.B(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            q2.e(B12);
                            break;
                        case 11:
                            InterfaceC0228g interfaceC0228g13 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            F0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = o.g.s(interfaceC0228g13.a(list16, (C0229h) obj25));
                            } catch (Throwable th12) {
                                B13 = v0.e.B(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            q2.e(B13);
                            break;
                        case 12:
                            InterfaceC0228g interfaceC0228g14 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            F0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            F0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            F0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g14.p(str12, str13, (C0229h) obj28);
                                B14 = o.g.s(null);
                            } catch (Throwable th13) {
                                B14 = v0.e.B(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            q2.e(B14);
                            break;
                        case 13:
                            InterfaceC0228g interfaceC0228g15 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            F0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            F0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            F0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g15.l(str14, longValue, (C0229h) obj31);
                                B15 = o.g.s(null);
                            } catch (Throwable th14) {
                                B15 = v0.e.B(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            q2.e(B15);
                            break;
                        default:
                            InterfaceC0228g interfaceC0228g16 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            F0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            F0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            F0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g16.n(str15, doubleValue, (C0229h) obj34);
                                B16 = o.g.s(null);
                            } catch (Throwable th15) {
                                B16 = v0.e.B(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            q2.e(B16);
                            break;
                    }
                }
            });
        } else {
            c0013n7.j(null);
        }
        C0013n c0013n8 = new C0013n(fVar, F0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", concat), a(), o2);
        if (interfaceC0228g != null) {
            final int i9 = 3;
            c0013n8.j(new InterfaceC0210b() { // from class: s0.e
                @Override // n0.InterfaceC0210b
                public final void i(Object obj, Q q2) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i9) {
                        case 0:
                            InterfaceC0228g interfaceC0228g2 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            F0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            F0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            F0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g2.b(str2, str3, (C0229h) obj4);
                                B2 = o.g.s(null);
                            } catch (Throwable th) {
                                B2 = v0.e.B(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            q2.e(B2);
                            break;
                        case 1:
                            InterfaceC0228g interfaceC0228g3 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            F0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            F0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            F0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g3.m(str4, list3, (C0229h) obj7);
                                B3 = o.g.s(null);
                            } catch (Throwable th2) {
                                B3 = v0.e.B(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            q2.e(B3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0228g interfaceC0228g4 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            F0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            F0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = o.g.s(interfaceC0228g4.c(str5, (C0229h) obj9));
                            } catch (Throwable th3) {
                                B4 = v0.e.B(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            q2.e(B4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0228g interfaceC0228g5 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            F0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            F0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = o.g.s(interfaceC0228g5.g(str6, (C0229h) obj11));
                            } catch (Throwable th4) {
                                B5 = v0.e.B(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            q2.e(B5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0228g interfaceC0228g6 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            F0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            F0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = o.g.s(interfaceC0228g6.e(str7, (C0229h) obj13));
                            } catch (Throwable th5) {
                                B6 = v0.e.B(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            q2.e(B6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0228g interfaceC0228g7 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            F0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            F0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = o.g.s(interfaceC0228g7.q(str8, (C0229h) obj15));
                            } catch (Throwable th6) {
                                B7 = v0.e.B(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            q2.e(B7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0228g interfaceC0228g8 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            F0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            F0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            F0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g8.i(str9, booleanValue, (C0229h) obj18);
                                B8 = o.g.s(null);
                            } catch (Throwable th7) {
                                B8 = v0.e.B(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            q2.e(B8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0228g interfaceC0228g9 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            F0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            F0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = o.g.s(interfaceC0228g9.h(str10, (C0229h) obj20));
                            } catch (Throwable th8) {
                                B9 = v0.e.B(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            q2.e(B9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0228g interfaceC0228g10 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            F0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            F0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = o.g.s(interfaceC0228g10.f(str11, (C0229h) obj22));
                            } catch (Throwable th9) {
                                B10 = v0.e.B(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            q2.e(B10);
                            break;
                        case 9:
                            InterfaceC0228g interfaceC0228g11 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            F0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g11.j(list12, (C0229h) obj23);
                                B11 = o.g.s(null);
                            } catch (Throwable th10) {
                                B11 = v0.e.B(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            q2.e(B11);
                            break;
                        case 10:
                            InterfaceC0228g interfaceC0228g12 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            F0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = o.g.s(interfaceC0228g12.o(list14, (C0229h) obj24));
                            } catch (Throwable th11) {
                                B12 = v0.e.B(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            q2.e(B12);
                            break;
                        case 11:
                            InterfaceC0228g interfaceC0228g13 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            F0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = o.g.s(interfaceC0228g13.a(list16, (C0229h) obj25));
                            } catch (Throwable th12) {
                                B13 = v0.e.B(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            q2.e(B13);
                            break;
                        case 12:
                            InterfaceC0228g interfaceC0228g14 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            F0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            F0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            F0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g14.p(str12, str13, (C0229h) obj28);
                                B14 = o.g.s(null);
                            } catch (Throwable th13) {
                                B14 = v0.e.B(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            q2.e(B14);
                            break;
                        case 13:
                            InterfaceC0228g interfaceC0228g15 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            F0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            F0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            F0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g15.l(str14, longValue, (C0229h) obj31);
                                B15 = o.g.s(null);
                            } catch (Throwable th14) {
                                B15 = v0.e.B(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            q2.e(B15);
                            break;
                        default:
                            InterfaceC0228g interfaceC0228g16 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            F0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            F0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            F0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g16.n(str15, doubleValue, (C0229h) obj34);
                                B16 = o.g.s(null);
                            } catch (Throwable th15) {
                                B16 = v0.e.B(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            q2.e(B16);
                            break;
                    }
                }
            });
        } else {
            c0013n8.j(null);
        }
        C0013n c0013n9 = new C0013n(fVar, F0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", concat), a(), o2);
        if (interfaceC0228g != null) {
            final int i10 = 4;
            c0013n9.j(new InterfaceC0210b() { // from class: s0.e
                @Override // n0.InterfaceC0210b
                public final void i(Object obj, Q q2) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i10) {
                        case 0:
                            InterfaceC0228g interfaceC0228g2 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            F0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            F0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            F0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g2.b(str2, str3, (C0229h) obj4);
                                B2 = o.g.s(null);
                            } catch (Throwable th) {
                                B2 = v0.e.B(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            q2.e(B2);
                            break;
                        case 1:
                            InterfaceC0228g interfaceC0228g3 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            F0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            F0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            F0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g3.m(str4, list3, (C0229h) obj7);
                                B3 = o.g.s(null);
                            } catch (Throwable th2) {
                                B3 = v0.e.B(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            q2.e(B3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0228g interfaceC0228g4 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            F0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            F0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = o.g.s(interfaceC0228g4.c(str5, (C0229h) obj9));
                            } catch (Throwable th3) {
                                B4 = v0.e.B(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            q2.e(B4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0228g interfaceC0228g5 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            F0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            F0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = o.g.s(interfaceC0228g5.g(str6, (C0229h) obj11));
                            } catch (Throwable th4) {
                                B5 = v0.e.B(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            q2.e(B5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0228g interfaceC0228g6 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            F0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            F0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = o.g.s(interfaceC0228g6.e(str7, (C0229h) obj13));
                            } catch (Throwable th5) {
                                B6 = v0.e.B(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            q2.e(B6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0228g interfaceC0228g7 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            F0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            F0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = o.g.s(interfaceC0228g7.q(str8, (C0229h) obj15));
                            } catch (Throwable th6) {
                                B7 = v0.e.B(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            q2.e(B7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0228g interfaceC0228g8 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            F0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            F0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            F0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g8.i(str9, booleanValue, (C0229h) obj18);
                                B8 = o.g.s(null);
                            } catch (Throwable th7) {
                                B8 = v0.e.B(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            q2.e(B8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0228g interfaceC0228g9 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            F0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            F0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = o.g.s(interfaceC0228g9.h(str10, (C0229h) obj20));
                            } catch (Throwable th8) {
                                B9 = v0.e.B(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            q2.e(B9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0228g interfaceC0228g10 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            F0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            F0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = o.g.s(interfaceC0228g10.f(str11, (C0229h) obj22));
                            } catch (Throwable th9) {
                                B10 = v0.e.B(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            q2.e(B10);
                            break;
                        case 9:
                            InterfaceC0228g interfaceC0228g11 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            F0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g11.j(list12, (C0229h) obj23);
                                B11 = o.g.s(null);
                            } catch (Throwable th10) {
                                B11 = v0.e.B(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            q2.e(B11);
                            break;
                        case 10:
                            InterfaceC0228g interfaceC0228g12 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            F0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = o.g.s(interfaceC0228g12.o(list14, (C0229h) obj24));
                            } catch (Throwable th11) {
                                B12 = v0.e.B(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            q2.e(B12);
                            break;
                        case 11:
                            InterfaceC0228g interfaceC0228g13 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            F0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = o.g.s(interfaceC0228g13.a(list16, (C0229h) obj25));
                            } catch (Throwable th12) {
                                B13 = v0.e.B(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            q2.e(B13);
                            break;
                        case 12:
                            InterfaceC0228g interfaceC0228g14 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            F0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            F0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            F0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g14.p(str12, str13, (C0229h) obj28);
                                B14 = o.g.s(null);
                            } catch (Throwable th13) {
                                B14 = v0.e.B(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            q2.e(B14);
                            break;
                        case 13:
                            InterfaceC0228g interfaceC0228g15 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            F0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            F0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            F0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g15.l(str14, longValue, (C0229h) obj31);
                                B15 = o.g.s(null);
                            } catch (Throwable th14) {
                                B15 = v0.e.B(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            q2.e(B15);
                            break;
                        default:
                            InterfaceC0228g interfaceC0228g16 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            F0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            F0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            F0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g16.n(str15, doubleValue, (C0229h) obj34);
                                B16 = o.g.s(null);
                            } catch (Throwable th15) {
                                B16 = v0.e.B(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            q2.e(B16);
                            break;
                    }
                }
            });
        } else {
            c0013n9.j(null);
        }
        C0013n c0013n10 = new C0013n(fVar, F0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", concat), a(), o2);
        if (interfaceC0228g != null) {
            final int i11 = 5;
            c0013n10.j(new InterfaceC0210b() { // from class: s0.e
                @Override // n0.InterfaceC0210b
                public final void i(Object obj, Q q2) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i11) {
                        case 0:
                            InterfaceC0228g interfaceC0228g2 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            F0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            F0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            F0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g2.b(str2, str3, (C0229h) obj4);
                                B2 = o.g.s(null);
                            } catch (Throwable th) {
                                B2 = v0.e.B(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            q2.e(B2);
                            break;
                        case 1:
                            InterfaceC0228g interfaceC0228g3 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            F0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            F0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            F0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g3.m(str4, list3, (C0229h) obj7);
                                B3 = o.g.s(null);
                            } catch (Throwable th2) {
                                B3 = v0.e.B(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            q2.e(B3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0228g interfaceC0228g4 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            F0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            F0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = o.g.s(interfaceC0228g4.c(str5, (C0229h) obj9));
                            } catch (Throwable th3) {
                                B4 = v0.e.B(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            q2.e(B4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0228g interfaceC0228g5 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            F0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            F0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = o.g.s(interfaceC0228g5.g(str6, (C0229h) obj11));
                            } catch (Throwable th4) {
                                B5 = v0.e.B(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            q2.e(B5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0228g interfaceC0228g6 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            F0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            F0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = o.g.s(interfaceC0228g6.e(str7, (C0229h) obj13));
                            } catch (Throwable th5) {
                                B6 = v0.e.B(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            q2.e(B6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0228g interfaceC0228g7 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            F0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            F0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = o.g.s(interfaceC0228g7.q(str8, (C0229h) obj15));
                            } catch (Throwable th6) {
                                B7 = v0.e.B(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            q2.e(B7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0228g interfaceC0228g8 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            F0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            F0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            F0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g8.i(str9, booleanValue, (C0229h) obj18);
                                B8 = o.g.s(null);
                            } catch (Throwable th7) {
                                B8 = v0.e.B(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            q2.e(B8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0228g interfaceC0228g9 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            F0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            F0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = o.g.s(interfaceC0228g9.h(str10, (C0229h) obj20));
                            } catch (Throwable th8) {
                                B9 = v0.e.B(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            q2.e(B9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0228g interfaceC0228g10 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            F0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            F0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = o.g.s(interfaceC0228g10.f(str11, (C0229h) obj22));
                            } catch (Throwable th9) {
                                B10 = v0.e.B(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            q2.e(B10);
                            break;
                        case 9:
                            InterfaceC0228g interfaceC0228g11 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            F0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g11.j(list12, (C0229h) obj23);
                                B11 = o.g.s(null);
                            } catch (Throwable th10) {
                                B11 = v0.e.B(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            q2.e(B11);
                            break;
                        case 10:
                            InterfaceC0228g interfaceC0228g12 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            F0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = o.g.s(interfaceC0228g12.o(list14, (C0229h) obj24));
                            } catch (Throwable th11) {
                                B12 = v0.e.B(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            q2.e(B12);
                            break;
                        case 11:
                            InterfaceC0228g interfaceC0228g13 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            F0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = o.g.s(interfaceC0228g13.a(list16, (C0229h) obj25));
                            } catch (Throwable th12) {
                                B13 = v0.e.B(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            q2.e(B13);
                            break;
                        case 12:
                            InterfaceC0228g interfaceC0228g14 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            F0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            F0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            F0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g14.p(str12, str13, (C0229h) obj28);
                                B14 = o.g.s(null);
                            } catch (Throwable th13) {
                                B14 = v0.e.B(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            q2.e(B14);
                            break;
                        case 13:
                            InterfaceC0228g interfaceC0228g15 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            F0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            F0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            F0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g15.l(str14, longValue, (C0229h) obj31);
                                B15 = o.g.s(null);
                            } catch (Throwable th14) {
                                B15 = v0.e.B(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            q2.e(B15);
                            break;
                        default:
                            InterfaceC0228g interfaceC0228g16 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            F0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            F0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            F0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g16.n(str15, doubleValue, (C0229h) obj34);
                                B16 = o.g.s(null);
                            } catch (Throwable th15) {
                                B16 = v0.e.B(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            q2.e(B16);
                            break;
                    }
                }
            });
        } else {
            c0013n10.j(null);
        }
        C0013n c0013n11 = new C0013n(fVar, F0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", concat), a(), o2);
        if (interfaceC0228g != null) {
            final int i12 = 7;
            c0013n11.j(new InterfaceC0210b() { // from class: s0.e
                @Override // n0.InterfaceC0210b
                public final void i(Object obj, Q q2) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i12) {
                        case 0:
                            InterfaceC0228g interfaceC0228g2 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            F0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            F0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            F0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g2.b(str2, str3, (C0229h) obj4);
                                B2 = o.g.s(null);
                            } catch (Throwable th) {
                                B2 = v0.e.B(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            q2.e(B2);
                            break;
                        case 1:
                            InterfaceC0228g interfaceC0228g3 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            F0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            F0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            F0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g3.m(str4, list3, (C0229h) obj7);
                                B3 = o.g.s(null);
                            } catch (Throwable th2) {
                                B3 = v0.e.B(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            q2.e(B3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0228g interfaceC0228g4 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            F0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            F0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = o.g.s(interfaceC0228g4.c(str5, (C0229h) obj9));
                            } catch (Throwable th3) {
                                B4 = v0.e.B(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            q2.e(B4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0228g interfaceC0228g5 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            F0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            F0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = o.g.s(interfaceC0228g5.g(str6, (C0229h) obj11));
                            } catch (Throwable th4) {
                                B5 = v0.e.B(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            q2.e(B5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0228g interfaceC0228g6 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            F0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            F0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = o.g.s(interfaceC0228g6.e(str7, (C0229h) obj13));
                            } catch (Throwable th5) {
                                B6 = v0.e.B(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            q2.e(B6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0228g interfaceC0228g7 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            F0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            F0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = o.g.s(interfaceC0228g7.q(str8, (C0229h) obj15));
                            } catch (Throwable th6) {
                                B7 = v0.e.B(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            q2.e(B7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0228g interfaceC0228g8 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            F0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            F0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            F0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g8.i(str9, booleanValue, (C0229h) obj18);
                                B8 = o.g.s(null);
                            } catch (Throwable th7) {
                                B8 = v0.e.B(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            q2.e(B8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0228g interfaceC0228g9 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            F0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            F0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = o.g.s(interfaceC0228g9.h(str10, (C0229h) obj20));
                            } catch (Throwable th8) {
                                B9 = v0.e.B(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            q2.e(B9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0228g interfaceC0228g10 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            F0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            F0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = o.g.s(interfaceC0228g10.f(str11, (C0229h) obj22));
                            } catch (Throwable th9) {
                                B10 = v0.e.B(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            q2.e(B10);
                            break;
                        case 9:
                            InterfaceC0228g interfaceC0228g11 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            F0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g11.j(list12, (C0229h) obj23);
                                B11 = o.g.s(null);
                            } catch (Throwable th10) {
                                B11 = v0.e.B(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            q2.e(B11);
                            break;
                        case 10:
                            InterfaceC0228g interfaceC0228g12 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            F0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = o.g.s(interfaceC0228g12.o(list14, (C0229h) obj24));
                            } catch (Throwable th11) {
                                B12 = v0.e.B(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            q2.e(B12);
                            break;
                        case 11:
                            InterfaceC0228g interfaceC0228g13 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            F0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = o.g.s(interfaceC0228g13.a(list16, (C0229h) obj25));
                            } catch (Throwable th12) {
                                B13 = v0.e.B(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            q2.e(B13);
                            break;
                        case 12:
                            InterfaceC0228g interfaceC0228g14 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            F0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            F0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            F0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g14.p(str12, str13, (C0229h) obj28);
                                B14 = o.g.s(null);
                            } catch (Throwable th13) {
                                B14 = v0.e.B(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            q2.e(B14);
                            break;
                        case 13:
                            InterfaceC0228g interfaceC0228g15 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            F0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            F0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            F0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g15.l(str14, longValue, (C0229h) obj31);
                                B15 = o.g.s(null);
                            } catch (Throwable th14) {
                                B15 = v0.e.B(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            q2.e(B15);
                            break;
                        default:
                            InterfaceC0228g interfaceC0228g16 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            F0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            F0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            F0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g16.n(str15, doubleValue, (C0229h) obj34);
                                B16 = o.g.s(null);
                            } catch (Throwable th15) {
                                B16 = v0.e.B(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            q2.e(B16);
                            break;
                    }
                }
            });
        } else {
            c0013n11.j(null);
        }
        C0013n c0013n12 = new C0013n(fVar, F0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", concat), a(), o2);
        if (interfaceC0228g != null) {
            final int i13 = 8;
            c0013n12.j(new InterfaceC0210b() { // from class: s0.e
                @Override // n0.InterfaceC0210b
                public final void i(Object obj, Q q2) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i13) {
                        case 0:
                            InterfaceC0228g interfaceC0228g2 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            F0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            F0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            F0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g2.b(str2, str3, (C0229h) obj4);
                                B2 = o.g.s(null);
                            } catch (Throwable th) {
                                B2 = v0.e.B(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            q2.e(B2);
                            break;
                        case 1:
                            InterfaceC0228g interfaceC0228g3 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            F0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            F0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            F0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g3.m(str4, list3, (C0229h) obj7);
                                B3 = o.g.s(null);
                            } catch (Throwable th2) {
                                B3 = v0.e.B(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            q2.e(B3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0228g interfaceC0228g4 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            F0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            F0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = o.g.s(interfaceC0228g4.c(str5, (C0229h) obj9));
                            } catch (Throwable th3) {
                                B4 = v0.e.B(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            q2.e(B4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0228g interfaceC0228g5 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            F0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            F0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = o.g.s(interfaceC0228g5.g(str6, (C0229h) obj11));
                            } catch (Throwable th4) {
                                B5 = v0.e.B(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            q2.e(B5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0228g interfaceC0228g6 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            F0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            F0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = o.g.s(interfaceC0228g6.e(str7, (C0229h) obj13));
                            } catch (Throwable th5) {
                                B6 = v0.e.B(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            q2.e(B6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0228g interfaceC0228g7 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            F0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            F0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = o.g.s(interfaceC0228g7.q(str8, (C0229h) obj15));
                            } catch (Throwable th6) {
                                B7 = v0.e.B(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            q2.e(B7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0228g interfaceC0228g8 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            F0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            F0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            F0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g8.i(str9, booleanValue, (C0229h) obj18);
                                B8 = o.g.s(null);
                            } catch (Throwable th7) {
                                B8 = v0.e.B(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            q2.e(B8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0228g interfaceC0228g9 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            F0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            F0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = o.g.s(interfaceC0228g9.h(str10, (C0229h) obj20));
                            } catch (Throwable th8) {
                                B9 = v0.e.B(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            q2.e(B9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0228g interfaceC0228g10 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            F0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            F0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = o.g.s(interfaceC0228g10.f(str11, (C0229h) obj22));
                            } catch (Throwable th9) {
                                B10 = v0.e.B(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            q2.e(B10);
                            break;
                        case 9:
                            InterfaceC0228g interfaceC0228g11 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            F0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g11.j(list12, (C0229h) obj23);
                                B11 = o.g.s(null);
                            } catch (Throwable th10) {
                                B11 = v0.e.B(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            q2.e(B11);
                            break;
                        case 10:
                            InterfaceC0228g interfaceC0228g12 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            F0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = o.g.s(interfaceC0228g12.o(list14, (C0229h) obj24));
                            } catch (Throwable th11) {
                                B12 = v0.e.B(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            q2.e(B12);
                            break;
                        case 11:
                            InterfaceC0228g interfaceC0228g13 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            F0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = o.g.s(interfaceC0228g13.a(list16, (C0229h) obj25));
                            } catch (Throwable th12) {
                                B13 = v0.e.B(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            q2.e(B13);
                            break;
                        case 12:
                            InterfaceC0228g interfaceC0228g14 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            F0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            F0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            F0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g14.p(str12, str13, (C0229h) obj28);
                                B14 = o.g.s(null);
                            } catch (Throwable th13) {
                                B14 = v0.e.B(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            q2.e(B14);
                            break;
                        case 13:
                            InterfaceC0228g interfaceC0228g15 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            F0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            F0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            F0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g15.l(str14, longValue, (C0229h) obj31);
                                B15 = o.g.s(null);
                            } catch (Throwable th14) {
                                B15 = v0.e.B(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            q2.e(B15);
                            break;
                        default:
                            InterfaceC0228g interfaceC0228g16 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            F0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            F0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            F0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g16.n(str15, doubleValue, (C0229h) obj34);
                                B16 = o.g.s(null);
                            } catch (Throwable th15) {
                                B16 = v0.e.B(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            q2.e(B16);
                            break;
                    }
                }
            });
        } else {
            c0013n12.j(null);
        }
        C0013n c0013n13 = new C0013n(fVar, F0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", concat), a(), o2);
        if (interfaceC0228g != null) {
            final int i14 = 9;
            c0013n13.j(new InterfaceC0210b() { // from class: s0.e
                @Override // n0.InterfaceC0210b
                public final void i(Object obj, Q q2) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i14) {
                        case 0:
                            InterfaceC0228g interfaceC0228g2 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            F0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            F0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            F0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g2.b(str2, str3, (C0229h) obj4);
                                B2 = o.g.s(null);
                            } catch (Throwable th) {
                                B2 = v0.e.B(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            q2.e(B2);
                            break;
                        case 1:
                            InterfaceC0228g interfaceC0228g3 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            F0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            F0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            F0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g3.m(str4, list3, (C0229h) obj7);
                                B3 = o.g.s(null);
                            } catch (Throwable th2) {
                                B3 = v0.e.B(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            q2.e(B3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0228g interfaceC0228g4 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            F0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            F0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = o.g.s(interfaceC0228g4.c(str5, (C0229h) obj9));
                            } catch (Throwable th3) {
                                B4 = v0.e.B(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            q2.e(B4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0228g interfaceC0228g5 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            F0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            F0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = o.g.s(interfaceC0228g5.g(str6, (C0229h) obj11));
                            } catch (Throwable th4) {
                                B5 = v0.e.B(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            q2.e(B5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0228g interfaceC0228g6 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            F0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            F0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = o.g.s(interfaceC0228g6.e(str7, (C0229h) obj13));
                            } catch (Throwable th5) {
                                B6 = v0.e.B(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            q2.e(B6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0228g interfaceC0228g7 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            F0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            F0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = o.g.s(interfaceC0228g7.q(str8, (C0229h) obj15));
                            } catch (Throwable th6) {
                                B7 = v0.e.B(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            q2.e(B7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0228g interfaceC0228g8 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            F0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            F0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            F0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g8.i(str9, booleanValue, (C0229h) obj18);
                                B8 = o.g.s(null);
                            } catch (Throwable th7) {
                                B8 = v0.e.B(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            q2.e(B8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0228g interfaceC0228g9 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            F0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            F0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = o.g.s(interfaceC0228g9.h(str10, (C0229h) obj20));
                            } catch (Throwable th8) {
                                B9 = v0.e.B(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            q2.e(B9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0228g interfaceC0228g10 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            F0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            F0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = o.g.s(interfaceC0228g10.f(str11, (C0229h) obj22));
                            } catch (Throwable th9) {
                                B10 = v0.e.B(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            q2.e(B10);
                            break;
                        case 9:
                            InterfaceC0228g interfaceC0228g11 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            F0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g11.j(list12, (C0229h) obj23);
                                B11 = o.g.s(null);
                            } catch (Throwable th10) {
                                B11 = v0.e.B(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            q2.e(B11);
                            break;
                        case 10:
                            InterfaceC0228g interfaceC0228g12 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            F0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = o.g.s(interfaceC0228g12.o(list14, (C0229h) obj24));
                            } catch (Throwable th11) {
                                B12 = v0.e.B(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            q2.e(B12);
                            break;
                        case 11:
                            InterfaceC0228g interfaceC0228g13 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            F0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = o.g.s(interfaceC0228g13.a(list16, (C0229h) obj25));
                            } catch (Throwable th12) {
                                B13 = v0.e.B(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            q2.e(B13);
                            break;
                        case 12:
                            InterfaceC0228g interfaceC0228g14 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            F0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            F0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            F0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g14.p(str12, str13, (C0229h) obj28);
                                B14 = o.g.s(null);
                            } catch (Throwable th13) {
                                B14 = v0.e.B(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            q2.e(B14);
                            break;
                        case 13:
                            InterfaceC0228g interfaceC0228g15 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            F0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            F0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            F0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g15.l(str14, longValue, (C0229h) obj31);
                                B15 = o.g.s(null);
                            } catch (Throwable th14) {
                                B15 = v0.e.B(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            q2.e(B15);
                            break;
                        default:
                            InterfaceC0228g interfaceC0228g16 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            F0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            F0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            F0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g16.n(str15, doubleValue, (C0229h) obj34);
                                B16 = o.g.s(null);
                            } catch (Throwable th15) {
                                B16 = v0.e.B(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            q2.e(B16);
                            break;
                    }
                }
            });
        } else {
            c0013n13.j(null);
        }
        C0013n c0013n14 = new C0013n(fVar, F0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", concat), a(), o2);
        if (interfaceC0228g != null) {
            final int i15 = 10;
            c0013n14.j(new InterfaceC0210b() { // from class: s0.e
                @Override // n0.InterfaceC0210b
                public final void i(Object obj, Q q2) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i15) {
                        case 0:
                            InterfaceC0228g interfaceC0228g2 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            F0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            F0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            F0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g2.b(str2, str3, (C0229h) obj4);
                                B2 = o.g.s(null);
                            } catch (Throwable th) {
                                B2 = v0.e.B(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            q2.e(B2);
                            break;
                        case 1:
                            InterfaceC0228g interfaceC0228g3 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            F0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            F0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            F0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g3.m(str4, list3, (C0229h) obj7);
                                B3 = o.g.s(null);
                            } catch (Throwable th2) {
                                B3 = v0.e.B(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            q2.e(B3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0228g interfaceC0228g4 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            F0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            F0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = o.g.s(interfaceC0228g4.c(str5, (C0229h) obj9));
                            } catch (Throwable th3) {
                                B4 = v0.e.B(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            q2.e(B4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0228g interfaceC0228g5 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            F0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            F0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = o.g.s(interfaceC0228g5.g(str6, (C0229h) obj11));
                            } catch (Throwable th4) {
                                B5 = v0.e.B(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            q2.e(B5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0228g interfaceC0228g6 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            F0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            F0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = o.g.s(interfaceC0228g6.e(str7, (C0229h) obj13));
                            } catch (Throwable th5) {
                                B6 = v0.e.B(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            q2.e(B6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0228g interfaceC0228g7 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            F0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            F0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = o.g.s(interfaceC0228g7.q(str8, (C0229h) obj15));
                            } catch (Throwable th6) {
                                B7 = v0.e.B(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            q2.e(B7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0228g interfaceC0228g8 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            F0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            F0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            F0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g8.i(str9, booleanValue, (C0229h) obj18);
                                B8 = o.g.s(null);
                            } catch (Throwable th7) {
                                B8 = v0.e.B(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            q2.e(B8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0228g interfaceC0228g9 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            F0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            F0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = o.g.s(interfaceC0228g9.h(str10, (C0229h) obj20));
                            } catch (Throwable th8) {
                                B9 = v0.e.B(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            q2.e(B9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0228g interfaceC0228g10 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            F0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            F0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = o.g.s(interfaceC0228g10.f(str11, (C0229h) obj22));
                            } catch (Throwable th9) {
                                B10 = v0.e.B(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            q2.e(B10);
                            break;
                        case 9:
                            InterfaceC0228g interfaceC0228g11 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            F0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g11.j(list12, (C0229h) obj23);
                                B11 = o.g.s(null);
                            } catch (Throwable th10) {
                                B11 = v0.e.B(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            q2.e(B11);
                            break;
                        case 10:
                            InterfaceC0228g interfaceC0228g12 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            F0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = o.g.s(interfaceC0228g12.o(list14, (C0229h) obj24));
                            } catch (Throwable th11) {
                                B12 = v0.e.B(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            q2.e(B12);
                            break;
                        case 11:
                            InterfaceC0228g interfaceC0228g13 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            F0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = o.g.s(interfaceC0228g13.a(list16, (C0229h) obj25));
                            } catch (Throwable th12) {
                                B13 = v0.e.B(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            q2.e(B13);
                            break;
                        case 12:
                            InterfaceC0228g interfaceC0228g14 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            F0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            F0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            F0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g14.p(str12, str13, (C0229h) obj28);
                                B14 = o.g.s(null);
                            } catch (Throwable th13) {
                                B14 = v0.e.B(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            q2.e(B14);
                            break;
                        case 13:
                            InterfaceC0228g interfaceC0228g15 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            F0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            F0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            F0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g15.l(str14, longValue, (C0229h) obj31);
                                B15 = o.g.s(null);
                            } catch (Throwable th14) {
                                B15 = v0.e.B(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            q2.e(B15);
                            break;
                        default:
                            InterfaceC0228g interfaceC0228g16 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            F0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            F0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            F0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g16.n(str15, doubleValue, (C0229h) obj34);
                                B16 = o.g.s(null);
                            } catch (Throwable th15) {
                                B16 = v0.e.B(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            q2.e(B16);
                            break;
                    }
                }
            });
        } else {
            c0013n14.j(null);
        }
        C0013n c0013n15 = new C0013n(fVar, F0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", concat), a(), o2);
        if (interfaceC0228g == null) {
            c0013n15.j(null);
        } else {
            final int i16 = 11;
            c0013n15.j(new InterfaceC0210b() { // from class: s0.e
                @Override // n0.InterfaceC0210b
                public final void i(Object obj, Q q2) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i16) {
                        case 0:
                            InterfaceC0228g interfaceC0228g2 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            F0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            F0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            F0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g2.b(str2, str3, (C0229h) obj4);
                                B2 = o.g.s(null);
                            } catch (Throwable th) {
                                B2 = v0.e.B(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            q2.e(B2);
                            break;
                        case 1:
                            InterfaceC0228g interfaceC0228g3 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            F0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            F0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            F0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g3.m(str4, list3, (C0229h) obj7);
                                B3 = o.g.s(null);
                            } catch (Throwable th2) {
                                B3 = v0.e.B(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            q2.e(B3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0228g interfaceC0228g4 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            F0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            F0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = o.g.s(interfaceC0228g4.c(str5, (C0229h) obj9));
                            } catch (Throwable th3) {
                                B4 = v0.e.B(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            q2.e(B4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0228g interfaceC0228g5 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            F0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            F0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = o.g.s(interfaceC0228g5.g(str6, (C0229h) obj11));
                            } catch (Throwable th4) {
                                B5 = v0.e.B(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            q2.e(B5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0228g interfaceC0228g6 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            F0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            F0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = o.g.s(interfaceC0228g6.e(str7, (C0229h) obj13));
                            } catch (Throwable th5) {
                                B6 = v0.e.B(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            q2.e(B6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0228g interfaceC0228g7 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            F0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            F0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = o.g.s(interfaceC0228g7.q(str8, (C0229h) obj15));
                            } catch (Throwable th6) {
                                B7 = v0.e.B(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            q2.e(B7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0228g interfaceC0228g8 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            F0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            F0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            F0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g8.i(str9, booleanValue, (C0229h) obj18);
                                B8 = o.g.s(null);
                            } catch (Throwable th7) {
                                B8 = v0.e.B(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            q2.e(B8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0228g interfaceC0228g9 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            F0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            F0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = o.g.s(interfaceC0228g9.h(str10, (C0229h) obj20));
                            } catch (Throwable th8) {
                                B9 = v0.e.B(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            q2.e(B9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0228g interfaceC0228g10 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            F0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            F0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = o.g.s(interfaceC0228g10.f(str11, (C0229h) obj22));
                            } catch (Throwable th9) {
                                B10 = v0.e.B(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            q2.e(B10);
                            break;
                        case 9:
                            InterfaceC0228g interfaceC0228g11 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            F0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g11.j(list12, (C0229h) obj23);
                                B11 = o.g.s(null);
                            } catch (Throwable th10) {
                                B11 = v0.e.B(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            q2.e(B11);
                            break;
                        case 10:
                            InterfaceC0228g interfaceC0228g12 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            F0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = o.g.s(interfaceC0228g12.o(list14, (C0229h) obj24));
                            } catch (Throwable th11) {
                                B12 = v0.e.B(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            q2.e(B12);
                            break;
                        case 11:
                            InterfaceC0228g interfaceC0228g13 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            F0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = o.g.s(interfaceC0228g13.a(list16, (C0229h) obj25));
                            } catch (Throwable th12) {
                                B13 = v0.e.B(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            q2.e(B13);
                            break;
                        case 12:
                            InterfaceC0228g interfaceC0228g14 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            F0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            F0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            F0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g14.p(str12, str13, (C0229h) obj28);
                                B14 = o.g.s(null);
                            } catch (Throwable th13) {
                                B14 = v0.e.B(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            q2.e(B14);
                            break;
                        case 13:
                            InterfaceC0228g interfaceC0228g15 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            F0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            F0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            F0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g15.l(str14, longValue, (C0229h) obj31);
                                B15 = o.g.s(null);
                            } catch (Throwable th14) {
                                B15 = v0.e.B(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            q2.e(B15);
                            break;
                        default:
                            InterfaceC0228g interfaceC0228g16 = interfaceC0228g;
                            F0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            F0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            F0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            F0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0228g16.n(str15, doubleValue, (C0229h) obj34);
                                B16 = o.g.s(null);
                            } catch (Throwable th15) {
                                B16 = v0.e.B(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            q2.e(B16);
                            break;
                    }
                }
            });
        }
    }
}
