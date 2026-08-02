package W1;

import E1.AbstractC0033i;
import a.AbstractC0129a;
import android.util.Log;
import b2.C0193g;
import java.util.List;

/* renamed from: W1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0094f f1670a = new C0094f();

    /* renamed from: b, reason: collision with root package name */
    public static final C0193g f1671b = new C0193g(new C0093e(0));

    public static P1.k a() {
        return (P1.k) f1671b.a();
    }

    public static void b(P1.f binaryMessenger, final InterfaceC0095g interfaceC0095g, String str) {
        kotlin.jvm.internal.j.e(binaryMessenger, "binaryMessenger");
        String concat = str.length() > 0 ? ".".concat(str) : "";
        K0.j e3 = binaryMessenger.e(new P1.j());
        B0.p pVar = new B0.p(binaryMessenger, AbstractC0033i.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", concat), a(), e3);
        if (interfaceC0095g != null) {
            final int i3 = 7;
            pVar.i(new P1.b() { // from class: W1.d
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    switch (i3) {
                        case 0:
                            InterfaceC0095g interfaceC0095g2 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g2.h(str2, doubleValue, (C0096h) obj4);
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            InterfaceC0095g interfaceC0095g3 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g3.j(str3, str4, (C0096h) obj7);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            InterfaceC0095g interfaceC0095g4 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g4.e(str5, list4, (C0096h) obj10);
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            InterfaceC0095g interfaceC0095g5 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L4 = AbstractC0129a.r(interfaceC0095g5.k(str6, (C0096h) obj12));
                            } catch (Throwable th4) {
                                L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            InterfaceC0095g interfaceC0095g6 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            Object obj14 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L5 = AbstractC0129a.r(interfaceC0095g6.l(str7, (C0096h) obj14));
                            } catch (Throwable th5) {
                                L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            InterfaceC0095g interfaceC0095g7 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L6 = AbstractC0129a.r(interfaceC0095g7.o(str8, (C0096h) obj16));
                            } catch (Throwable th6) {
                                L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            InterfaceC0095g interfaceC0095g8 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L7 = AbstractC0129a.r(interfaceC0095g8.q(str9, (C0096h) obj18));
                            } catch (Throwable th7) {
                                L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            InterfaceC0095g interfaceC0095g9 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g9.m(str10, booleanValue, (C0096h) obj21);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            InterfaceC0095g interfaceC0095g10 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj22;
                            Object obj23 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L9 = AbstractC0129a.r(interfaceC0095g10.g(str11, (C0096h) obj23));
                            } catch (Throwable th9) {
                                L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            InterfaceC0095g interfaceC0095g11 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L10 = AbstractC0129a.r(interfaceC0095g11.c(str12, (C0096h) obj25));
                            } catch (Throwable th10) {
                                L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            InterfaceC0095g interfaceC0095g12 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g12.b(list13, (C0096h) obj26);
                                L11 = AbstractC0129a.r(null);
                            } catch (Throwable th11) {
                                L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            InterfaceC0095g interfaceC0095g13 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L12 = AbstractC0129a.r(interfaceC0095g13.f(list15, (C0096h) obj27));
                            } catch (Throwable th12) {
                                L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            InterfaceC0095g interfaceC0095g14 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L13 = AbstractC0129a.r(interfaceC0095g14.r(list17, (C0096h) obj28));
                            } catch (Throwable th13) {
                                L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            InterfaceC0095g interfaceC0095g15 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj30;
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g15.p(str13, str14, (C0096h) obj31);
                                L14 = AbstractC0129a.r(null);
                            } catch (Throwable th14) {
                                L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.n(L14);
                            break;
                        default:
                            InterfaceC0095g interfaceC0095g16 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g16.a(str15, longValue, (C0096h) obj34);
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.n(L15);
                            break;
                    }
                }
            });
        } else {
            pVar.i(null);
        }
        B0.p pVar2 = new B0.p(binaryMessenger, AbstractC0033i.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", concat), a(), e3);
        if (interfaceC0095g != null) {
            final int i4 = 13;
            pVar2.i(new P1.b() { // from class: W1.d
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    switch (i4) {
                        case 0:
                            InterfaceC0095g interfaceC0095g2 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g2.h(str2, doubleValue, (C0096h) obj4);
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            InterfaceC0095g interfaceC0095g3 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g3.j(str3, str4, (C0096h) obj7);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            InterfaceC0095g interfaceC0095g4 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g4.e(str5, list4, (C0096h) obj10);
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            InterfaceC0095g interfaceC0095g5 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L4 = AbstractC0129a.r(interfaceC0095g5.k(str6, (C0096h) obj12));
                            } catch (Throwable th4) {
                                L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            InterfaceC0095g interfaceC0095g6 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            Object obj14 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L5 = AbstractC0129a.r(interfaceC0095g6.l(str7, (C0096h) obj14));
                            } catch (Throwable th5) {
                                L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            InterfaceC0095g interfaceC0095g7 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L6 = AbstractC0129a.r(interfaceC0095g7.o(str8, (C0096h) obj16));
                            } catch (Throwable th6) {
                                L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            InterfaceC0095g interfaceC0095g8 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L7 = AbstractC0129a.r(interfaceC0095g8.q(str9, (C0096h) obj18));
                            } catch (Throwable th7) {
                                L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            InterfaceC0095g interfaceC0095g9 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g9.m(str10, booleanValue, (C0096h) obj21);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            InterfaceC0095g interfaceC0095g10 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj22;
                            Object obj23 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L9 = AbstractC0129a.r(interfaceC0095g10.g(str11, (C0096h) obj23));
                            } catch (Throwable th9) {
                                L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            InterfaceC0095g interfaceC0095g11 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L10 = AbstractC0129a.r(interfaceC0095g11.c(str12, (C0096h) obj25));
                            } catch (Throwable th10) {
                                L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            InterfaceC0095g interfaceC0095g12 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g12.b(list13, (C0096h) obj26);
                                L11 = AbstractC0129a.r(null);
                            } catch (Throwable th11) {
                                L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            InterfaceC0095g interfaceC0095g13 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L12 = AbstractC0129a.r(interfaceC0095g13.f(list15, (C0096h) obj27));
                            } catch (Throwable th12) {
                                L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            InterfaceC0095g interfaceC0095g14 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L13 = AbstractC0129a.r(interfaceC0095g14.r(list17, (C0096h) obj28));
                            } catch (Throwable th13) {
                                L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            InterfaceC0095g interfaceC0095g15 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj30;
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g15.p(str13, str14, (C0096h) obj31);
                                L14 = AbstractC0129a.r(null);
                            } catch (Throwable th14) {
                                L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.n(L14);
                            break;
                        default:
                            InterfaceC0095g interfaceC0095g16 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g16.a(str15, longValue, (C0096h) obj34);
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.n(L15);
                            break;
                    }
                }
            });
        } else {
            pVar2.i(null);
        }
        B0.p pVar3 = new B0.p(binaryMessenger, AbstractC0033i.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", concat), a(), e3);
        if (interfaceC0095g != null) {
            final int i5 = 14;
            pVar3.i(new P1.b() { // from class: W1.d
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    switch (i5) {
                        case 0:
                            InterfaceC0095g interfaceC0095g2 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g2.h(str2, doubleValue, (C0096h) obj4);
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            InterfaceC0095g interfaceC0095g3 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g3.j(str3, str4, (C0096h) obj7);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            InterfaceC0095g interfaceC0095g4 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g4.e(str5, list4, (C0096h) obj10);
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            InterfaceC0095g interfaceC0095g5 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L4 = AbstractC0129a.r(interfaceC0095g5.k(str6, (C0096h) obj12));
                            } catch (Throwable th4) {
                                L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            InterfaceC0095g interfaceC0095g6 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            Object obj14 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L5 = AbstractC0129a.r(interfaceC0095g6.l(str7, (C0096h) obj14));
                            } catch (Throwable th5) {
                                L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            InterfaceC0095g interfaceC0095g7 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L6 = AbstractC0129a.r(interfaceC0095g7.o(str8, (C0096h) obj16));
                            } catch (Throwable th6) {
                                L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            InterfaceC0095g interfaceC0095g8 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L7 = AbstractC0129a.r(interfaceC0095g8.q(str9, (C0096h) obj18));
                            } catch (Throwable th7) {
                                L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            InterfaceC0095g interfaceC0095g9 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g9.m(str10, booleanValue, (C0096h) obj21);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            InterfaceC0095g interfaceC0095g10 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj22;
                            Object obj23 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L9 = AbstractC0129a.r(interfaceC0095g10.g(str11, (C0096h) obj23));
                            } catch (Throwable th9) {
                                L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            InterfaceC0095g interfaceC0095g11 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L10 = AbstractC0129a.r(interfaceC0095g11.c(str12, (C0096h) obj25));
                            } catch (Throwable th10) {
                                L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            InterfaceC0095g interfaceC0095g12 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g12.b(list13, (C0096h) obj26);
                                L11 = AbstractC0129a.r(null);
                            } catch (Throwable th11) {
                                L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            InterfaceC0095g interfaceC0095g13 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L12 = AbstractC0129a.r(interfaceC0095g13.f(list15, (C0096h) obj27));
                            } catch (Throwable th12) {
                                L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            InterfaceC0095g interfaceC0095g14 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L13 = AbstractC0129a.r(interfaceC0095g14.r(list17, (C0096h) obj28));
                            } catch (Throwable th13) {
                                L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            InterfaceC0095g interfaceC0095g15 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj30;
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g15.p(str13, str14, (C0096h) obj31);
                                L14 = AbstractC0129a.r(null);
                            } catch (Throwable th14) {
                                L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.n(L14);
                            break;
                        default:
                            InterfaceC0095g interfaceC0095g16 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g16.a(str15, longValue, (C0096h) obj34);
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.n(L15);
                            break;
                    }
                }
            });
        } else {
            pVar3.i(null);
        }
        B0.p pVar4 = new B0.p(binaryMessenger, AbstractC0033i.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", concat), a(), e3);
        if (interfaceC0095g != null) {
            final int i6 = 0;
            pVar4.i(new P1.b() { // from class: W1.d
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    switch (i6) {
                        case 0:
                            InterfaceC0095g interfaceC0095g2 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g2.h(str2, doubleValue, (C0096h) obj4);
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            InterfaceC0095g interfaceC0095g3 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g3.j(str3, str4, (C0096h) obj7);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            InterfaceC0095g interfaceC0095g4 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g4.e(str5, list4, (C0096h) obj10);
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            InterfaceC0095g interfaceC0095g5 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L4 = AbstractC0129a.r(interfaceC0095g5.k(str6, (C0096h) obj12));
                            } catch (Throwable th4) {
                                L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            InterfaceC0095g interfaceC0095g6 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            Object obj14 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L5 = AbstractC0129a.r(interfaceC0095g6.l(str7, (C0096h) obj14));
                            } catch (Throwable th5) {
                                L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            InterfaceC0095g interfaceC0095g7 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L6 = AbstractC0129a.r(interfaceC0095g7.o(str8, (C0096h) obj16));
                            } catch (Throwable th6) {
                                L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            InterfaceC0095g interfaceC0095g8 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L7 = AbstractC0129a.r(interfaceC0095g8.q(str9, (C0096h) obj18));
                            } catch (Throwable th7) {
                                L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            InterfaceC0095g interfaceC0095g9 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g9.m(str10, booleanValue, (C0096h) obj21);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            InterfaceC0095g interfaceC0095g10 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj22;
                            Object obj23 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L9 = AbstractC0129a.r(interfaceC0095g10.g(str11, (C0096h) obj23));
                            } catch (Throwable th9) {
                                L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            InterfaceC0095g interfaceC0095g11 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L10 = AbstractC0129a.r(interfaceC0095g11.c(str12, (C0096h) obj25));
                            } catch (Throwable th10) {
                                L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            InterfaceC0095g interfaceC0095g12 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g12.b(list13, (C0096h) obj26);
                                L11 = AbstractC0129a.r(null);
                            } catch (Throwable th11) {
                                L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            InterfaceC0095g interfaceC0095g13 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L12 = AbstractC0129a.r(interfaceC0095g13.f(list15, (C0096h) obj27));
                            } catch (Throwable th12) {
                                L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            InterfaceC0095g interfaceC0095g14 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L13 = AbstractC0129a.r(interfaceC0095g14.r(list17, (C0096h) obj28));
                            } catch (Throwable th13) {
                                L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            InterfaceC0095g interfaceC0095g15 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj30;
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g15.p(str13, str14, (C0096h) obj31);
                                L14 = AbstractC0129a.r(null);
                            } catch (Throwable th14) {
                                L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.n(L14);
                            break;
                        default:
                            InterfaceC0095g interfaceC0095g16 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g16.a(str15, longValue, (C0096h) obj34);
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.n(L15);
                            break;
                    }
                }
            });
        } else {
            pVar4.i(null);
        }
        B0.p pVar5 = new B0.p(binaryMessenger, AbstractC0033i.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", concat), a(), e3);
        if (interfaceC0095g != null) {
            final int i7 = 1;
            pVar5.i(new P1.b() { // from class: W1.d
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    switch (i7) {
                        case 0:
                            InterfaceC0095g interfaceC0095g2 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g2.h(str2, doubleValue, (C0096h) obj4);
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            InterfaceC0095g interfaceC0095g3 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g3.j(str3, str4, (C0096h) obj7);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            InterfaceC0095g interfaceC0095g4 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g4.e(str5, list4, (C0096h) obj10);
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            InterfaceC0095g interfaceC0095g5 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L4 = AbstractC0129a.r(interfaceC0095g5.k(str6, (C0096h) obj12));
                            } catch (Throwable th4) {
                                L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            InterfaceC0095g interfaceC0095g6 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            Object obj14 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L5 = AbstractC0129a.r(interfaceC0095g6.l(str7, (C0096h) obj14));
                            } catch (Throwable th5) {
                                L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            InterfaceC0095g interfaceC0095g7 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L6 = AbstractC0129a.r(interfaceC0095g7.o(str8, (C0096h) obj16));
                            } catch (Throwable th6) {
                                L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            InterfaceC0095g interfaceC0095g8 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L7 = AbstractC0129a.r(interfaceC0095g8.q(str9, (C0096h) obj18));
                            } catch (Throwable th7) {
                                L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            InterfaceC0095g interfaceC0095g9 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g9.m(str10, booleanValue, (C0096h) obj21);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            InterfaceC0095g interfaceC0095g10 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj22;
                            Object obj23 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L9 = AbstractC0129a.r(interfaceC0095g10.g(str11, (C0096h) obj23));
                            } catch (Throwable th9) {
                                L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            InterfaceC0095g interfaceC0095g11 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L10 = AbstractC0129a.r(interfaceC0095g11.c(str12, (C0096h) obj25));
                            } catch (Throwable th10) {
                                L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            InterfaceC0095g interfaceC0095g12 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g12.b(list13, (C0096h) obj26);
                                L11 = AbstractC0129a.r(null);
                            } catch (Throwable th11) {
                                L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            InterfaceC0095g interfaceC0095g13 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L12 = AbstractC0129a.r(interfaceC0095g13.f(list15, (C0096h) obj27));
                            } catch (Throwable th12) {
                                L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            InterfaceC0095g interfaceC0095g14 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L13 = AbstractC0129a.r(interfaceC0095g14.r(list17, (C0096h) obj28));
                            } catch (Throwable th13) {
                                L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            InterfaceC0095g interfaceC0095g15 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj30;
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g15.p(str13, str14, (C0096h) obj31);
                                L14 = AbstractC0129a.r(null);
                            } catch (Throwable th14) {
                                L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.n(L14);
                            break;
                        default:
                            InterfaceC0095g interfaceC0095g16 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g16.a(str15, longValue, (C0096h) obj34);
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.n(L15);
                            break;
                    }
                }
            });
        } else {
            pVar5.i(null);
        }
        B0.p pVar6 = new B0.p(binaryMessenger, AbstractC0033i.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", concat), a(), e3);
        if (interfaceC0095g != null) {
            final int i8 = 2;
            pVar6.i(new P1.b() { // from class: W1.d
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    switch (i8) {
                        case 0:
                            InterfaceC0095g interfaceC0095g2 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g2.h(str2, doubleValue, (C0096h) obj4);
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            InterfaceC0095g interfaceC0095g3 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g3.j(str3, str4, (C0096h) obj7);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            InterfaceC0095g interfaceC0095g4 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g4.e(str5, list4, (C0096h) obj10);
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            InterfaceC0095g interfaceC0095g5 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L4 = AbstractC0129a.r(interfaceC0095g5.k(str6, (C0096h) obj12));
                            } catch (Throwable th4) {
                                L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            InterfaceC0095g interfaceC0095g6 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            Object obj14 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L5 = AbstractC0129a.r(interfaceC0095g6.l(str7, (C0096h) obj14));
                            } catch (Throwable th5) {
                                L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            InterfaceC0095g interfaceC0095g7 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L6 = AbstractC0129a.r(interfaceC0095g7.o(str8, (C0096h) obj16));
                            } catch (Throwable th6) {
                                L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            InterfaceC0095g interfaceC0095g8 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L7 = AbstractC0129a.r(interfaceC0095g8.q(str9, (C0096h) obj18));
                            } catch (Throwable th7) {
                                L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            InterfaceC0095g interfaceC0095g9 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g9.m(str10, booleanValue, (C0096h) obj21);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            InterfaceC0095g interfaceC0095g10 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj22;
                            Object obj23 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L9 = AbstractC0129a.r(interfaceC0095g10.g(str11, (C0096h) obj23));
                            } catch (Throwable th9) {
                                L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            InterfaceC0095g interfaceC0095g11 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L10 = AbstractC0129a.r(interfaceC0095g11.c(str12, (C0096h) obj25));
                            } catch (Throwable th10) {
                                L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            InterfaceC0095g interfaceC0095g12 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g12.b(list13, (C0096h) obj26);
                                L11 = AbstractC0129a.r(null);
                            } catch (Throwable th11) {
                                L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            InterfaceC0095g interfaceC0095g13 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L12 = AbstractC0129a.r(interfaceC0095g13.f(list15, (C0096h) obj27));
                            } catch (Throwable th12) {
                                L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            InterfaceC0095g interfaceC0095g14 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L13 = AbstractC0129a.r(interfaceC0095g14.r(list17, (C0096h) obj28));
                            } catch (Throwable th13) {
                                L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            InterfaceC0095g interfaceC0095g15 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj30;
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g15.p(str13, str14, (C0096h) obj31);
                                L14 = AbstractC0129a.r(null);
                            } catch (Throwable th14) {
                                L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.n(L14);
                            break;
                        default:
                            InterfaceC0095g interfaceC0095g16 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g16.a(str15, longValue, (C0096h) obj34);
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.n(L15);
                            break;
                    }
                }
            });
        } else {
            pVar6.i(null);
        }
        B0.p pVar7 = new B0.p(binaryMessenger, AbstractC0033i.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", concat), a(), e3);
        if (interfaceC0095g != null) {
            final int i9 = 3;
            pVar7.i(new P1.b() { // from class: W1.d
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    switch (i9) {
                        case 0:
                            InterfaceC0095g interfaceC0095g2 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g2.h(str2, doubleValue, (C0096h) obj4);
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            InterfaceC0095g interfaceC0095g3 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g3.j(str3, str4, (C0096h) obj7);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            InterfaceC0095g interfaceC0095g4 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g4.e(str5, list4, (C0096h) obj10);
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            InterfaceC0095g interfaceC0095g5 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L4 = AbstractC0129a.r(interfaceC0095g5.k(str6, (C0096h) obj12));
                            } catch (Throwable th4) {
                                L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            InterfaceC0095g interfaceC0095g6 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            Object obj14 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L5 = AbstractC0129a.r(interfaceC0095g6.l(str7, (C0096h) obj14));
                            } catch (Throwable th5) {
                                L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            InterfaceC0095g interfaceC0095g7 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L6 = AbstractC0129a.r(interfaceC0095g7.o(str8, (C0096h) obj16));
                            } catch (Throwable th6) {
                                L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            InterfaceC0095g interfaceC0095g8 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L7 = AbstractC0129a.r(interfaceC0095g8.q(str9, (C0096h) obj18));
                            } catch (Throwable th7) {
                                L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            InterfaceC0095g interfaceC0095g9 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g9.m(str10, booleanValue, (C0096h) obj21);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            InterfaceC0095g interfaceC0095g10 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj22;
                            Object obj23 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L9 = AbstractC0129a.r(interfaceC0095g10.g(str11, (C0096h) obj23));
                            } catch (Throwable th9) {
                                L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            InterfaceC0095g interfaceC0095g11 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L10 = AbstractC0129a.r(interfaceC0095g11.c(str12, (C0096h) obj25));
                            } catch (Throwable th10) {
                                L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            InterfaceC0095g interfaceC0095g12 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g12.b(list13, (C0096h) obj26);
                                L11 = AbstractC0129a.r(null);
                            } catch (Throwable th11) {
                                L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            InterfaceC0095g interfaceC0095g13 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L12 = AbstractC0129a.r(interfaceC0095g13.f(list15, (C0096h) obj27));
                            } catch (Throwable th12) {
                                L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            InterfaceC0095g interfaceC0095g14 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L13 = AbstractC0129a.r(interfaceC0095g14.r(list17, (C0096h) obj28));
                            } catch (Throwable th13) {
                                L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            InterfaceC0095g interfaceC0095g15 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj30;
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g15.p(str13, str14, (C0096h) obj31);
                                L14 = AbstractC0129a.r(null);
                            } catch (Throwable th14) {
                                L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.n(L14);
                            break;
                        default:
                            InterfaceC0095g interfaceC0095g16 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g16.a(str15, longValue, (C0096h) obj34);
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.n(L15);
                            break;
                    }
                }
            });
        } else {
            pVar7.i(null);
        }
        B0.p pVar8 = new B0.p(binaryMessenger, AbstractC0033i.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", concat), a(), e3);
        if (interfaceC0095g != null) {
            final int i10 = 4;
            pVar8.i(new P1.b() { // from class: W1.d
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    switch (i10) {
                        case 0:
                            InterfaceC0095g interfaceC0095g2 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g2.h(str2, doubleValue, (C0096h) obj4);
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            InterfaceC0095g interfaceC0095g3 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g3.j(str3, str4, (C0096h) obj7);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            InterfaceC0095g interfaceC0095g4 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g4.e(str5, list4, (C0096h) obj10);
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            InterfaceC0095g interfaceC0095g5 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L4 = AbstractC0129a.r(interfaceC0095g5.k(str6, (C0096h) obj12));
                            } catch (Throwable th4) {
                                L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            InterfaceC0095g interfaceC0095g6 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            Object obj14 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L5 = AbstractC0129a.r(interfaceC0095g6.l(str7, (C0096h) obj14));
                            } catch (Throwable th5) {
                                L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            InterfaceC0095g interfaceC0095g7 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L6 = AbstractC0129a.r(interfaceC0095g7.o(str8, (C0096h) obj16));
                            } catch (Throwable th6) {
                                L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            InterfaceC0095g interfaceC0095g8 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L7 = AbstractC0129a.r(interfaceC0095g8.q(str9, (C0096h) obj18));
                            } catch (Throwable th7) {
                                L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            InterfaceC0095g interfaceC0095g9 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g9.m(str10, booleanValue, (C0096h) obj21);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            InterfaceC0095g interfaceC0095g10 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj22;
                            Object obj23 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L9 = AbstractC0129a.r(interfaceC0095g10.g(str11, (C0096h) obj23));
                            } catch (Throwable th9) {
                                L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            InterfaceC0095g interfaceC0095g11 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L10 = AbstractC0129a.r(interfaceC0095g11.c(str12, (C0096h) obj25));
                            } catch (Throwable th10) {
                                L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            InterfaceC0095g interfaceC0095g12 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g12.b(list13, (C0096h) obj26);
                                L11 = AbstractC0129a.r(null);
                            } catch (Throwable th11) {
                                L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            InterfaceC0095g interfaceC0095g13 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L12 = AbstractC0129a.r(interfaceC0095g13.f(list15, (C0096h) obj27));
                            } catch (Throwable th12) {
                                L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            InterfaceC0095g interfaceC0095g14 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L13 = AbstractC0129a.r(interfaceC0095g14.r(list17, (C0096h) obj28));
                            } catch (Throwable th13) {
                                L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            InterfaceC0095g interfaceC0095g15 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj30;
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g15.p(str13, str14, (C0096h) obj31);
                                L14 = AbstractC0129a.r(null);
                            } catch (Throwable th14) {
                                L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.n(L14);
                            break;
                        default:
                            InterfaceC0095g interfaceC0095g16 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g16.a(str15, longValue, (C0096h) obj34);
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.n(L15);
                            break;
                    }
                }
            });
        } else {
            pVar8.i(null);
        }
        B0.p pVar9 = new B0.p(binaryMessenger, AbstractC0033i.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", concat), a(), e3);
        if (interfaceC0095g != null) {
            final int i11 = 5;
            pVar9.i(new P1.b() { // from class: W1.d
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    switch (i11) {
                        case 0:
                            InterfaceC0095g interfaceC0095g2 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g2.h(str2, doubleValue, (C0096h) obj4);
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            InterfaceC0095g interfaceC0095g3 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g3.j(str3, str4, (C0096h) obj7);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            InterfaceC0095g interfaceC0095g4 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g4.e(str5, list4, (C0096h) obj10);
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            InterfaceC0095g interfaceC0095g5 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L4 = AbstractC0129a.r(interfaceC0095g5.k(str6, (C0096h) obj12));
                            } catch (Throwable th4) {
                                L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            InterfaceC0095g interfaceC0095g6 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            Object obj14 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L5 = AbstractC0129a.r(interfaceC0095g6.l(str7, (C0096h) obj14));
                            } catch (Throwable th5) {
                                L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            InterfaceC0095g interfaceC0095g7 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L6 = AbstractC0129a.r(interfaceC0095g7.o(str8, (C0096h) obj16));
                            } catch (Throwable th6) {
                                L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            InterfaceC0095g interfaceC0095g8 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L7 = AbstractC0129a.r(interfaceC0095g8.q(str9, (C0096h) obj18));
                            } catch (Throwable th7) {
                                L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            InterfaceC0095g interfaceC0095g9 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g9.m(str10, booleanValue, (C0096h) obj21);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            InterfaceC0095g interfaceC0095g10 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj22;
                            Object obj23 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L9 = AbstractC0129a.r(interfaceC0095g10.g(str11, (C0096h) obj23));
                            } catch (Throwable th9) {
                                L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            InterfaceC0095g interfaceC0095g11 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L10 = AbstractC0129a.r(interfaceC0095g11.c(str12, (C0096h) obj25));
                            } catch (Throwable th10) {
                                L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            InterfaceC0095g interfaceC0095g12 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g12.b(list13, (C0096h) obj26);
                                L11 = AbstractC0129a.r(null);
                            } catch (Throwable th11) {
                                L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            InterfaceC0095g interfaceC0095g13 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L12 = AbstractC0129a.r(interfaceC0095g13.f(list15, (C0096h) obj27));
                            } catch (Throwable th12) {
                                L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            InterfaceC0095g interfaceC0095g14 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L13 = AbstractC0129a.r(interfaceC0095g14.r(list17, (C0096h) obj28));
                            } catch (Throwable th13) {
                                L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            InterfaceC0095g interfaceC0095g15 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj30;
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g15.p(str13, str14, (C0096h) obj31);
                                L14 = AbstractC0129a.r(null);
                            } catch (Throwable th14) {
                                L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.n(L14);
                            break;
                        default:
                            InterfaceC0095g interfaceC0095g16 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g16.a(str15, longValue, (C0096h) obj34);
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.n(L15);
                            break;
                    }
                }
            });
        } else {
            pVar9.i(null);
        }
        B0.p pVar10 = new B0.p(binaryMessenger, AbstractC0033i.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", concat), a(), e3);
        if (interfaceC0095g != null) {
            final int i12 = 6;
            pVar10.i(new P1.b() { // from class: W1.d
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    switch (i12) {
                        case 0:
                            InterfaceC0095g interfaceC0095g2 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g2.h(str2, doubleValue, (C0096h) obj4);
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            InterfaceC0095g interfaceC0095g3 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g3.j(str3, str4, (C0096h) obj7);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            InterfaceC0095g interfaceC0095g4 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g4.e(str5, list4, (C0096h) obj10);
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            InterfaceC0095g interfaceC0095g5 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L4 = AbstractC0129a.r(interfaceC0095g5.k(str6, (C0096h) obj12));
                            } catch (Throwable th4) {
                                L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            InterfaceC0095g interfaceC0095g6 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            Object obj14 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L5 = AbstractC0129a.r(interfaceC0095g6.l(str7, (C0096h) obj14));
                            } catch (Throwable th5) {
                                L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            InterfaceC0095g interfaceC0095g7 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L6 = AbstractC0129a.r(interfaceC0095g7.o(str8, (C0096h) obj16));
                            } catch (Throwable th6) {
                                L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            InterfaceC0095g interfaceC0095g8 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L7 = AbstractC0129a.r(interfaceC0095g8.q(str9, (C0096h) obj18));
                            } catch (Throwable th7) {
                                L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            InterfaceC0095g interfaceC0095g9 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g9.m(str10, booleanValue, (C0096h) obj21);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            InterfaceC0095g interfaceC0095g10 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj22;
                            Object obj23 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L9 = AbstractC0129a.r(interfaceC0095g10.g(str11, (C0096h) obj23));
                            } catch (Throwable th9) {
                                L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            InterfaceC0095g interfaceC0095g11 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L10 = AbstractC0129a.r(interfaceC0095g11.c(str12, (C0096h) obj25));
                            } catch (Throwable th10) {
                                L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            InterfaceC0095g interfaceC0095g12 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g12.b(list13, (C0096h) obj26);
                                L11 = AbstractC0129a.r(null);
                            } catch (Throwable th11) {
                                L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            InterfaceC0095g interfaceC0095g13 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L12 = AbstractC0129a.r(interfaceC0095g13.f(list15, (C0096h) obj27));
                            } catch (Throwable th12) {
                                L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            InterfaceC0095g interfaceC0095g14 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L13 = AbstractC0129a.r(interfaceC0095g14.r(list17, (C0096h) obj28));
                            } catch (Throwable th13) {
                                L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            InterfaceC0095g interfaceC0095g15 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj30;
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g15.p(str13, str14, (C0096h) obj31);
                                L14 = AbstractC0129a.r(null);
                            } catch (Throwable th14) {
                                L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.n(L14);
                            break;
                        default:
                            InterfaceC0095g interfaceC0095g16 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g16.a(str15, longValue, (C0096h) obj34);
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.n(L15);
                            break;
                    }
                }
            });
        } else {
            pVar10.i(null);
        }
        B0.p pVar11 = new B0.p(binaryMessenger, AbstractC0033i.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", concat), a(), e3);
        if (interfaceC0095g != null) {
            final int i13 = 8;
            pVar11.i(new P1.b() { // from class: W1.d
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    switch (i13) {
                        case 0:
                            InterfaceC0095g interfaceC0095g2 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g2.h(str2, doubleValue, (C0096h) obj4);
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            InterfaceC0095g interfaceC0095g3 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g3.j(str3, str4, (C0096h) obj7);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            InterfaceC0095g interfaceC0095g4 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g4.e(str5, list4, (C0096h) obj10);
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            InterfaceC0095g interfaceC0095g5 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L4 = AbstractC0129a.r(interfaceC0095g5.k(str6, (C0096h) obj12));
                            } catch (Throwable th4) {
                                L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            InterfaceC0095g interfaceC0095g6 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            Object obj14 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L5 = AbstractC0129a.r(interfaceC0095g6.l(str7, (C0096h) obj14));
                            } catch (Throwable th5) {
                                L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            InterfaceC0095g interfaceC0095g7 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L6 = AbstractC0129a.r(interfaceC0095g7.o(str8, (C0096h) obj16));
                            } catch (Throwable th6) {
                                L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            InterfaceC0095g interfaceC0095g8 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L7 = AbstractC0129a.r(interfaceC0095g8.q(str9, (C0096h) obj18));
                            } catch (Throwable th7) {
                                L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            InterfaceC0095g interfaceC0095g9 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g9.m(str10, booleanValue, (C0096h) obj21);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            InterfaceC0095g interfaceC0095g10 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj22;
                            Object obj23 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L9 = AbstractC0129a.r(interfaceC0095g10.g(str11, (C0096h) obj23));
                            } catch (Throwable th9) {
                                L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            InterfaceC0095g interfaceC0095g11 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L10 = AbstractC0129a.r(interfaceC0095g11.c(str12, (C0096h) obj25));
                            } catch (Throwable th10) {
                                L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            InterfaceC0095g interfaceC0095g12 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g12.b(list13, (C0096h) obj26);
                                L11 = AbstractC0129a.r(null);
                            } catch (Throwable th11) {
                                L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            InterfaceC0095g interfaceC0095g13 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L12 = AbstractC0129a.r(interfaceC0095g13.f(list15, (C0096h) obj27));
                            } catch (Throwable th12) {
                                L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            InterfaceC0095g interfaceC0095g14 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L13 = AbstractC0129a.r(interfaceC0095g14.r(list17, (C0096h) obj28));
                            } catch (Throwable th13) {
                                L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            InterfaceC0095g interfaceC0095g15 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj30;
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g15.p(str13, str14, (C0096h) obj31);
                                L14 = AbstractC0129a.r(null);
                            } catch (Throwable th14) {
                                L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.n(L14);
                            break;
                        default:
                            InterfaceC0095g interfaceC0095g16 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g16.a(str15, longValue, (C0096h) obj34);
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.n(L15);
                            break;
                    }
                }
            });
        } else {
            pVar11.i(null);
        }
        B0.p pVar12 = new B0.p(binaryMessenger, AbstractC0033i.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", concat), a(), e3);
        if (interfaceC0095g != null) {
            final int i14 = 9;
            pVar12.i(new P1.b() { // from class: W1.d
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    switch (i14) {
                        case 0:
                            InterfaceC0095g interfaceC0095g2 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g2.h(str2, doubleValue, (C0096h) obj4);
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            InterfaceC0095g interfaceC0095g3 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g3.j(str3, str4, (C0096h) obj7);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            InterfaceC0095g interfaceC0095g4 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g4.e(str5, list4, (C0096h) obj10);
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            InterfaceC0095g interfaceC0095g5 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L4 = AbstractC0129a.r(interfaceC0095g5.k(str6, (C0096h) obj12));
                            } catch (Throwable th4) {
                                L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            InterfaceC0095g interfaceC0095g6 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            Object obj14 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L5 = AbstractC0129a.r(interfaceC0095g6.l(str7, (C0096h) obj14));
                            } catch (Throwable th5) {
                                L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            InterfaceC0095g interfaceC0095g7 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L6 = AbstractC0129a.r(interfaceC0095g7.o(str8, (C0096h) obj16));
                            } catch (Throwable th6) {
                                L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            InterfaceC0095g interfaceC0095g8 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L7 = AbstractC0129a.r(interfaceC0095g8.q(str9, (C0096h) obj18));
                            } catch (Throwable th7) {
                                L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            InterfaceC0095g interfaceC0095g9 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g9.m(str10, booleanValue, (C0096h) obj21);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            InterfaceC0095g interfaceC0095g10 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj22;
                            Object obj23 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L9 = AbstractC0129a.r(interfaceC0095g10.g(str11, (C0096h) obj23));
                            } catch (Throwable th9) {
                                L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            InterfaceC0095g interfaceC0095g11 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L10 = AbstractC0129a.r(interfaceC0095g11.c(str12, (C0096h) obj25));
                            } catch (Throwable th10) {
                                L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            InterfaceC0095g interfaceC0095g12 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g12.b(list13, (C0096h) obj26);
                                L11 = AbstractC0129a.r(null);
                            } catch (Throwable th11) {
                                L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            InterfaceC0095g interfaceC0095g13 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L12 = AbstractC0129a.r(interfaceC0095g13.f(list15, (C0096h) obj27));
                            } catch (Throwable th12) {
                                L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            InterfaceC0095g interfaceC0095g14 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L13 = AbstractC0129a.r(interfaceC0095g14.r(list17, (C0096h) obj28));
                            } catch (Throwable th13) {
                                L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            InterfaceC0095g interfaceC0095g15 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj30;
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g15.p(str13, str14, (C0096h) obj31);
                                L14 = AbstractC0129a.r(null);
                            } catch (Throwable th14) {
                                L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.n(L14);
                            break;
                        default:
                            InterfaceC0095g interfaceC0095g16 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g16.a(str15, longValue, (C0096h) obj34);
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.n(L15);
                            break;
                    }
                }
            });
        } else {
            pVar12.i(null);
        }
        B0.p pVar13 = new B0.p(binaryMessenger, AbstractC0033i.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", concat), a(), e3);
        if (interfaceC0095g != null) {
            final int i15 = 10;
            pVar13.i(new P1.b() { // from class: W1.d
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    switch (i15) {
                        case 0:
                            InterfaceC0095g interfaceC0095g2 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g2.h(str2, doubleValue, (C0096h) obj4);
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            InterfaceC0095g interfaceC0095g3 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g3.j(str3, str4, (C0096h) obj7);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            InterfaceC0095g interfaceC0095g4 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g4.e(str5, list4, (C0096h) obj10);
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            InterfaceC0095g interfaceC0095g5 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L4 = AbstractC0129a.r(interfaceC0095g5.k(str6, (C0096h) obj12));
                            } catch (Throwable th4) {
                                L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            InterfaceC0095g interfaceC0095g6 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            Object obj14 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L5 = AbstractC0129a.r(interfaceC0095g6.l(str7, (C0096h) obj14));
                            } catch (Throwable th5) {
                                L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            InterfaceC0095g interfaceC0095g7 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L6 = AbstractC0129a.r(interfaceC0095g7.o(str8, (C0096h) obj16));
                            } catch (Throwable th6) {
                                L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            InterfaceC0095g interfaceC0095g8 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L7 = AbstractC0129a.r(interfaceC0095g8.q(str9, (C0096h) obj18));
                            } catch (Throwable th7) {
                                L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            InterfaceC0095g interfaceC0095g9 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g9.m(str10, booleanValue, (C0096h) obj21);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            InterfaceC0095g interfaceC0095g10 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj22;
                            Object obj23 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L9 = AbstractC0129a.r(interfaceC0095g10.g(str11, (C0096h) obj23));
                            } catch (Throwable th9) {
                                L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            InterfaceC0095g interfaceC0095g11 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L10 = AbstractC0129a.r(interfaceC0095g11.c(str12, (C0096h) obj25));
                            } catch (Throwable th10) {
                                L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            InterfaceC0095g interfaceC0095g12 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g12.b(list13, (C0096h) obj26);
                                L11 = AbstractC0129a.r(null);
                            } catch (Throwable th11) {
                                L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            InterfaceC0095g interfaceC0095g13 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L12 = AbstractC0129a.r(interfaceC0095g13.f(list15, (C0096h) obj27));
                            } catch (Throwable th12) {
                                L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            InterfaceC0095g interfaceC0095g14 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L13 = AbstractC0129a.r(interfaceC0095g14.r(list17, (C0096h) obj28));
                            } catch (Throwable th13) {
                                L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            InterfaceC0095g interfaceC0095g15 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj30;
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g15.p(str13, str14, (C0096h) obj31);
                                L14 = AbstractC0129a.r(null);
                            } catch (Throwable th14) {
                                L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.n(L14);
                            break;
                        default:
                            InterfaceC0095g interfaceC0095g16 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g16.a(str15, longValue, (C0096h) obj34);
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.n(L15);
                            break;
                    }
                }
            });
        } else {
            pVar13.i(null);
        }
        B0.p pVar14 = new B0.p(binaryMessenger, AbstractC0033i.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", concat), a(), e3);
        if (interfaceC0095g != null) {
            final int i16 = 11;
            pVar14.i(new P1.b() { // from class: W1.d
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    switch (i16) {
                        case 0:
                            InterfaceC0095g interfaceC0095g2 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g2.h(str2, doubleValue, (C0096h) obj4);
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            InterfaceC0095g interfaceC0095g3 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g3.j(str3, str4, (C0096h) obj7);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            InterfaceC0095g interfaceC0095g4 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g4.e(str5, list4, (C0096h) obj10);
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            InterfaceC0095g interfaceC0095g5 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L4 = AbstractC0129a.r(interfaceC0095g5.k(str6, (C0096h) obj12));
                            } catch (Throwable th4) {
                                L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            InterfaceC0095g interfaceC0095g6 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            Object obj14 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L5 = AbstractC0129a.r(interfaceC0095g6.l(str7, (C0096h) obj14));
                            } catch (Throwable th5) {
                                L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            InterfaceC0095g interfaceC0095g7 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L6 = AbstractC0129a.r(interfaceC0095g7.o(str8, (C0096h) obj16));
                            } catch (Throwable th6) {
                                L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            InterfaceC0095g interfaceC0095g8 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L7 = AbstractC0129a.r(interfaceC0095g8.q(str9, (C0096h) obj18));
                            } catch (Throwable th7) {
                                L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            InterfaceC0095g interfaceC0095g9 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g9.m(str10, booleanValue, (C0096h) obj21);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            InterfaceC0095g interfaceC0095g10 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj22;
                            Object obj23 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L9 = AbstractC0129a.r(interfaceC0095g10.g(str11, (C0096h) obj23));
                            } catch (Throwable th9) {
                                L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            InterfaceC0095g interfaceC0095g11 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L10 = AbstractC0129a.r(interfaceC0095g11.c(str12, (C0096h) obj25));
                            } catch (Throwable th10) {
                                L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            InterfaceC0095g interfaceC0095g12 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g12.b(list13, (C0096h) obj26);
                                L11 = AbstractC0129a.r(null);
                            } catch (Throwable th11) {
                                L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            InterfaceC0095g interfaceC0095g13 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L12 = AbstractC0129a.r(interfaceC0095g13.f(list15, (C0096h) obj27));
                            } catch (Throwable th12) {
                                L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            InterfaceC0095g interfaceC0095g14 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L13 = AbstractC0129a.r(interfaceC0095g14.r(list17, (C0096h) obj28));
                            } catch (Throwable th13) {
                                L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            InterfaceC0095g interfaceC0095g15 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj30;
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g15.p(str13, str14, (C0096h) obj31);
                                L14 = AbstractC0129a.r(null);
                            } catch (Throwable th14) {
                                L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.n(L14);
                            break;
                        default:
                            InterfaceC0095g interfaceC0095g16 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g16.a(str15, longValue, (C0096h) obj34);
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.n(L15);
                            break;
                    }
                }
            });
        } else {
            pVar14.i(null);
        }
        B0.p pVar15 = new B0.p(binaryMessenger, AbstractC0033i.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", concat), a(), e3);
        if (interfaceC0095g == null) {
            pVar15.i(null);
        } else {
            final int i17 = 12;
            pVar15.i(new P1.b() { // from class: W1.d
                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    List L;
                    List L2;
                    List L3;
                    List L4;
                    List L5;
                    List L6;
                    List L7;
                    List L8;
                    List L9;
                    List L10;
                    List L11;
                    List L12;
                    List L13;
                    List L14;
                    List L15;
                    switch (i17) {
                        case 0:
                            InterfaceC0095g interfaceC0095g2 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g2.h(str2, doubleValue, (C0096h) obj4);
                                L = AbstractC0129a.r(null);
                            } catch (Throwable th) {
                                L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.n(L);
                            break;
                        case 1:
                            InterfaceC0095g interfaceC0095g3 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g3.j(str3, str4, (C0096h) obj7);
                                L2 = AbstractC0129a.r(null);
                            } catch (Throwable th2) {
                                L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.n(L2);
                            break;
                        case 2:
                            InterfaceC0095g interfaceC0095g4 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g4.e(str5, list4, (C0096h) obj10);
                                L3 = AbstractC0129a.r(null);
                            } catch (Throwable th3) {
                                L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.n(L3);
                            break;
                        case 3:
                            InterfaceC0095g interfaceC0095g5 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L4 = AbstractC0129a.r(interfaceC0095g5.k(str6, (C0096h) obj12));
                            } catch (Throwable th4) {
                                L4 = c2.f.L(th4.getClass().getSimpleName(), th4.toString(), AbstractC0033i.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.n(L4);
                            break;
                        case 4:
                            InterfaceC0095g interfaceC0095g6 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            Object obj14 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L5 = AbstractC0129a.r(interfaceC0095g6.l(str7, (C0096h) obj14));
                            } catch (Throwable th5) {
                                L5 = c2.f.L(th5.getClass().getSimpleName(), th5.toString(), AbstractC0033i.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.n(L5);
                            break;
                        case 5:
                            InterfaceC0095g interfaceC0095g7 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L6 = AbstractC0129a.r(interfaceC0095g7.o(str8, (C0096h) obj16));
                            } catch (Throwable th6) {
                                L6 = c2.f.L(th6.getClass().getSimpleName(), th6.toString(), AbstractC0033i.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.n(L6);
                            break;
                        case 6:
                            InterfaceC0095g interfaceC0095g8 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj17;
                            Object obj18 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L7 = AbstractC0129a.r(interfaceC0095g8.q(str9, (C0096h) obj18));
                            } catch (Throwable th7) {
                                L7 = c2.f.L(th7.getClass().getSimpleName(), th7.toString(), AbstractC0033i.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.n(L7);
                            break;
                        case 7:
                            InterfaceC0095g interfaceC0095g9 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g9.m(str10, booleanValue, (C0096h) obj21);
                                L8 = AbstractC0129a.r(null);
                            } catch (Throwable th8) {
                                L8 = c2.f.L(th8.getClass().getSimpleName(), th8.toString(), AbstractC0033i.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.n(L8);
                            break;
                        case 8:
                            InterfaceC0095g interfaceC0095g10 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj22;
                            Object obj23 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L9 = AbstractC0129a.r(interfaceC0095g10.g(str11, (C0096h) obj23));
                            } catch (Throwable th9) {
                                L9 = c2.f.L(th9.getClass().getSimpleName(), th9.toString(), AbstractC0033i.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.n(L9);
                            break;
                        case 9:
                            InterfaceC0095g interfaceC0095g11 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L10 = AbstractC0129a.r(interfaceC0095g11.c(str12, (C0096h) obj25));
                            } catch (Throwable th10) {
                                L10 = c2.f.L(th10.getClass().getSimpleName(), th10.toString(), AbstractC0033i.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.n(L10);
                            break;
                        case 10:
                            InterfaceC0095g interfaceC0095g12 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g12.b(list13, (C0096h) obj26);
                                L11 = AbstractC0129a.r(null);
                            } catch (Throwable th11) {
                                L11 = c2.f.L(th11.getClass().getSimpleName(), th11.toString(), AbstractC0033i.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.n(L11);
                            break;
                        case 11:
                            InterfaceC0095g interfaceC0095g13 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L12 = AbstractC0129a.r(interfaceC0095g13.f(list15, (C0096h) obj27));
                            } catch (Throwable th12) {
                                L12 = c2.f.L(th12.getClass().getSimpleName(), th12.toString(), AbstractC0033i.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.n(L12);
                            break;
                        case 12:
                            InterfaceC0095g interfaceC0095g14 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                L13 = AbstractC0129a.r(interfaceC0095g14.r(list17, (C0096h) obj28));
                            } catch (Throwable th13) {
                                L13 = c2.f.L(th13.getClass().getSimpleName(), th13.toString(), AbstractC0033i.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.n(L13);
                            break;
                        case 13:
                            InterfaceC0095g interfaceC0095g15 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj30;
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g15.p(str13, str14, (C0096h) obj31);
                                L14 = AbstractC0129a.r(null);
                            } catch (Throwable th14) {
                                L14 = c2.f.L(th14.getClass().getSimpleName(), th14.toString(), AbstractC0033i.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.n(L14);
                            break;
                        default:
                            InterfaceC0095g interfaceC0095g16 = interfaceC0095g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0095g16.a(str15, longValue, (C0096h) obj34);
                                L15 = AbstractC0129a.r(null);
                            } catch (Throwable th15) {
                                L15 = c2.f.L(th15.getClass().getSimpleName(), th15.toString(), AbstractC0033i.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.n(L15);
                            break;
                    }
                }
            });
        }
    }
}
