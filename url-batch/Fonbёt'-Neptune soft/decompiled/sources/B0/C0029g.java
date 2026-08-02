package B0;

import I.C0079n;
import a.AbstractC0132a;
import java.util.List;
import w0.InterfaceC0316b;
import w0.InterfaceC0320f;

/* renamed from: B0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0029g f149a = new C0029g();

    /* renamed from: b, reason: collision with root package name */
    public static final F0.f f150b = new F0.f(C0028f.f148f);

    public static w0.k a() {
        return (w0.k) f150b.a();
    }

    public static void b(InterfaceC0320f interfaceC0320f, final InterfaceC0030h interfaceC0030h, String str) {
        Q0.h.e(interfaceC0320f, "binaryMessenger");
        String concat = str.length() > 0 ? ".".concat(str) : "";
        C0023a b2 = interfaceC0320f.b();
        C0079n c0079n = new C0079n(interfaceC0320f, A0.b.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", concat), a(), b2);
        if (interfaceC0030h != null) {
            final int i2 = 0;
            c0079n.i(new InterfaceC0316b() { // from class: B0.e
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    List b3;
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    switch (i2) {
                        case 0:
                            InterfaceC0030h interfaceC0030h2 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h2.b(str2, booleanValue, (C0032j) obj4);
                                b3 = i1.a.u(null);
                            } catch (Throwable th) {
                                b3 = AbstractC0132a.b(th);
                            }
                            o2.b(b3);
                            break;
                        case 1:
                            InterfaceC0030h interfaceC0030h3 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Q0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h3.d(str3, list3, (C0032j) obj7);
                                b4 = i1.a.u(null);
                            } catch (Throwable th2) {
                                b4 = AbstractC0132a.b(th2);
                            }
                            o2.b(b4);
                            break;
                        case 2:
                            InterfaceC0030h interfaceC0030h4 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b5 = i1.a.u(interfaceC0030h4.n(str4, (C0032j) obj9));
                            } catch (Throwable th3) {
                                b5 = AbstractC0132a.b(th3);
                            }
                            o2.b(b5);
                            break;
                        case 3:
                            InterfaceC0030h interfaceC0030h5 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = i1.a.u(interfaceC0030h5.p(str5, (C0032j) obj11));
                            } catch (Throwable th4) {
                                b6 = AbstractC0132a.b(th4);
                            }
                            o2.b(b6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0030h interfaceC0030h6 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = i1.a.u(interfaceC0030h6.a(str6, (C0032j) obj13));
                            } catch (Throwable th5) {
                                b7 = AbstractC0132a.b(th5);
                            }
                            o2.b(b7);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0030h interfaceC0030h7 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = i1.a.u(interfaceC0030h7.g(str7, (C0032j) obj15));
                            } catch (Throwable th6) {
                                b8 = AbstractC0132a.b(th6);
                            }
                            o2.b(b8);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0030h interfaceC0030h8 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = i1.a.u(interfaceC0030h8.q(str8, (C0032j) obj17));
                            } catch (Throwable th7) {
                                b9 = AbstractC0132a.b(th7);
                            }
                            o2.b(b9);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0030h interfaceC0030h9 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b10 = i1.a.u(interfaceC0030h9.i(str9, (C0032j) obj19));
                            } catch (Throwable th8) {
                                b10 = AbstractC0132a.b(th8);
                            }
                            o2.b(b10);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0030h interfaceC0030h10 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            Q0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h10.l(list11, (C0032j) obj20);
                                b11 = i1.a.u(null);
                            } catch (Throwable th9) {
                                b11 = AbstractC0132a.b(th9);
                            }
                            o2.b(b11);
                            break;
                        case 9:
                            InterfaceC0030h interfaceC0030h11 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = i1.a.u(interfaceC0030h11.c(list13, (C0032j) obj21));
                            } catch (Throwable th10) {
                                b12 = AbstractC0132a.b(th10);
                            }
                            o2.b(b12);
                            break;
                        case 10:
                            InterfaceC0030h interfaceC0030h12 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            Q0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b13 = i1.a.u(interfaceC0030h12.h(list15, (C0032j) obj22));
                            } catch (Throwable th11) {
                                b13 = AbstractC0132a.b(th11);
                            }
                            o2.b(b13);
                            break;
                        case 11:
                            InterfaceC0030h interfaceC0030h13 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            Q0.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            Q0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h13.f(str10, str11, (C0032j) obj25);
                                b14 = i1.a.u(null);
                            } catch (Throwable th12) {
                                b14 = AbstractC0132a.b(th12);
                            }
                            o2.b(b14);
                            break;
                        case 12:
                            InterfaceC0030h interfaceC0030h14 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            Q0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h14.o(str12, longValue, (C0032j) obj28);
                                b15 = i1.a.u(null);
                            } catch (Throwable th13) {
                                b15 = AbstractC0132a.b(th13);
                            }
                            o2.b(b15);
                            break;
                        case 13:
                            InterfaceC0030h interfaceC0030h15 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            Q0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h15.e(str13, doubleValue, (C0032j) obj31);
                                b16 = i1.a.u(null);
                            } catch (Throwable th14) {
                                b16 = AbstractC0132a.b(th14);
                            }
                            o2.b(b16);
                            break;
                        default:
                            InterfaceC0030h interfaceC0030h16 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Q0.h.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            Q0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h16.m(str14, str15, (C0032j) obj34);
                                b17 = i1.a.u(null);
                            } catch (Throwable th15) {
                                b17 = AbstractC0132a.b(th15);
                            }
                            o2.b(b17);
                            break;
                    }
                }
            });
        } else {
            c0079n.i(null);
        }
        C0079n c0079n2 = new C0079n(interfaceC0320f, A0.b.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", concat), a(), b2);
        if (interfaceC0030h != null) {
            final int i3 = 11;
            c0079n2.i(new InterfaceC0316b() { // from class: B0.e
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    List b3;
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    switch (i3) {
                        case 0:
                            InterfaceC0030h interfaceC0030h2 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h2.b(str2, booleanValue, (C0032j) obj4);
                                b3 = i1.a.u(null);
                            } catch (Throwable th) {
                                b3 = AbstractC0132a.b(th);
                            }
                            o2.b(b3);
                            break;
                        case 1:
                            InterfaceC0030h interfaceC0030h3 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Q0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h3.d(str3, list3, (C0032j) obj7);
                                b4 = i1.a.u(null);
                            } catch (Throwable th2) {
                                b4 = AbstractC0132a.b(th2);
                            }
                            o2.b(b4);
                            break;
                        case 2:
                            InterfaceC0030h interfaceC0030h4 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b5 = i1.a.u(interfaceC0030h4.n(str4, (C0032j) obj9));
                            } catch (Throwable th3) {
                                b5 = AbstractC0132a.b(th3);
                            }
                            o2.b(b5);
                            break;
                        case 3:
                            InterfaceC0030h interfaceC0030h5 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = i1.a.u(interfaceC0030h5.p(str5, (C0032j) obj11));
                            } catch (Throwable th4) {
                                b6 = AbstractC0132a.b(th4);
                            }
                            o2.b(b6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0030h interfaceC0030h6 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = i1.a.u(interfaceC0030h6.a(str6, (C0032j) obj13));
                            } catch (Throwable th5) {
                                b7 = AbstractC0132a.b(th5);
                            }
                            o2.b(b7);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0030h interfaceC0030h7 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = i1.a.u(interfaceC0030h7.g(str7, (C0032j) obj15));
                            } catch (Throwable th6) {
                                b8 = AbstractC0132a.b(th6);
                            }
                            o2.b(b8);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0030h interfaceC0030h8 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = i1.a.u(interfaceC0030h8.q(str8, (C0032j) obj17));
                            } catch (Throwable th7) {
                                b9 = AbstractC0132a.b(th7);
                            }
                            o2.b(b9);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0030h interfaceC0030h9 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b10 = i1.a.u(interfaceC0030h9.i(str9, (C0032j) obj19));
                            } catch (Throwable th8) {
                                b10 = AbstractC0132a.b(th8);
                            }
                            o2.b(b10);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0030h interfaceC0030h10 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            Q0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h10.l(list11, (C0032j) obj20);
                                b11 = i1.a.u(null);
                            } catch (Throwable th9) {
                                b11 = AbstractC0132a.b(th9);
                            }
                            o2.b(b11);
                            break;
                        case 9:
                            InterfaceC0030h interfaceC0030h11 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = i1.a.u(interfaceC0030h11.c(list13, (C0032j) obj21));
                            } catch (Throwable th10) {
                                b12 = AbstractC0132a.b(th10);
                            }
                            o2.b(b12);
                            break;
                        case 10:
                            InterfaceC0030h interfaceC0030h12 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            Q0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b13 = i1.a.u(interfaceC0030h12.h(list15, (C0032j) obj22));
                            } catch (Throwable th11) {
                                b13 = AbstractC0132a.b(th11);
                            }
                            o2.b(b13);
                            break;
                        case 11:
                            InterfaceC0030h interfaceC0030h13 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            Q0.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            Q0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h13.f(str10, str11, (C0032j) obj25);
                                b14 = i1.a.u(null);
                            } catch (Throwable th12) {
                                b14 = AbstractC0132a.b(th12);
                            }
                            o2.b(b14);
                            break;
                        case 12:
                            InterfaceC0030h interfaceC0030h14 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            Q0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h14.o(str12, longValue, (C0032j) obj28);
                                b15 = i1.a.u(null);
                            } catch (Throwable th13) {
                                b15 = AbstractC0132a.b(th13);
                            }
                            o2.b(b15);
                            break;
                        case 13:
                            InterfaceC0030h interfaceC0030h15 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            Q0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h15.e(str13, doubleValue, (C0032j) obj31);
                                b16 = i1.a.u(null);
                            } catch (Throwable th14) {
                                b16 = AbstractC0132a.b(th14);
                            }
                            o2.b(b16);
                            break;
                        default:
                            InterfaceC0030h interfaceC0030h16 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Q0.h.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            Q0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h16.m(str14, str15, (C0032j) obj34);
                                b17 = i1.a.u(null);
                            } catch (Throwable th15) {
                                b17 = AbstractC0132a.b(th15);
                            }
                            o2.b(b17);
                            break;
                    }
                }
            });
        } else {
            c0079n2.i(null);
        }
        C0079n c0079n3 = new C0079n(interfaceC0320f, A0.b.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", concat), a(), b2);
        if (interfaceC0030h != null) {
            final int i4 = 12;
            c0079n3.i(new InterfaceC0316b() { // from class: B0.e
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    List b3;
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    switch (i4) {
                        case 0:
                            InterfaceC0030h interfaceC0030h2 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h2.b(str2, booleanValue, (C0032j) obj4);
                                b3 = i1.a.u(null);
                            } catch (Throwable th) {
                                b3 = AbstractC0132a.b(th);
                            }
                            o2.b(b3);
                            break;
                        case 1:
                            InterfaceC0030h interfaceC0030h3 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Q0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h3.d(str3, list3, (C0032j) obj7);
                                b4 = i1.a.u(null);
                            } catch (Throwable th2) {
                                b4 = AbstractC0132a.b(th2);
                            }
                            o2.b(b4);
                            break;
                        case 2:
                            InterfaceC0030h interfaceC0030h4 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b5 = i1.a.u(interfaceC0030h4.n(str4, (C0032j) obj9));
                            } catch (Throwable th3) {
                                b5 = AbstractC0132a.b(th3);
                            }
                            o2.b(b5);
                            break;
                        case 3:
                            InterfaceC0030h interfaceC0030h5 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = i1.a.u(interfaceC0030h5.p(str5, (C0032j) obj11));
                            } catch (Throwable th4) {
                                b6 = AbstractC0132a.b(th4);
                            }
                            o2.b(b6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0030h interfaceC0030h6 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = i1.a.u(interfaceC0030h6.a(str6, (C0032j) obj13));
                            } catch (Throwable th5) {
                                b7 = AbstractC0132a.b(th5);
                            }
                            o2.b(b7);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0030h interfaceC0030h7 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = i1.a.u(interfaceC0030h7.g(str7, (C0032j) obj15));
                            } catch (Throwable th6) {
                                b8 = AbstractC0132a.b(th6);
                            }
                            o2.b(b8);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0030h interfaceC0030h8 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = i1.a.u(interfaceC0030h8.q(str8, (C0032j) obj17));
                            } catch (Throwable th7) {
                                b9 = AbstractC0132a.b(th7);
                            }
                            o2.b(b9);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0030h interfaceC0030h9 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b10 = i1.a.u(interfaceC0030h9.i(str9, (C0032j) obj19));
                            } catch (Throwable th8) {
                                b10 = AbstractC0132a.b(th8);
                            }
                            o2.b(b10);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0030h interfaceC0030h10 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            Q0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h10.l(list11, (C0032j) obj20);
                                b11 = i1.a.u(null);
                            } catch (Throwable th9) {
                                b11 = AbstractC0132a.b(th9);
                            }
                            o2.b(b11);
                            break;
                        case 9:
                            InterfaceC0030h interfaceC0030h11 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = i1.a.u(interfaceC0030h11.c(list13, (C0032j) obj21));
                            } catch (Throwable th10) {
                                b12 = AbstractC0132a.b(th10);
                            }
                            o2.b(b12);
                            break;
                        case 10:
                            InterfaceC0030h interfaceC0030h12 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            Q0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b13 = i1.a.u(interfaceC0030h12.h(list15, (C0032j) obj22));
                            } catch (Throwable th11) {
                                b13 = AbstractC0132a.b(th11);
                            }
                            o2.b(b13);
                            break;
                        case 11:
                            InterfaceC0030h interfaceC0030h13 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            Q0.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            Q0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h13.f(str10, str11, (C0032j) obj25);
                                b14 = i1.a.u(null);
                            } catch (Throwable th12) {
                                b14 = AbstractC0132a.b(th12);
                            }
                            o2.b(b14);
                            break;
                        case 12:
                            InterfaceC0030h interfaceC0030h14 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            Q0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h14.o(str12, longValue, (C0032j) obj28);
                                b15 = i1.a.u(null);
                            } catch (Throwable th13) {
                                b15 = AbstractC0132a.b(th13);
                            }
                            o2.b(b15);
                            break;
                        case 13:
                            InterfaceC0030h interfaceC0030h15 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            Q0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h15.e(str13, doubleValue, (C0032j) obj31);
                                b16 = i1.a.u(null);
                            } catch (Throwable th14) {
                                b16 = AbstractC0132a.b(th14);
                            }
                            o2.b(b16);
                            break;
                        default:
                            InterfaceC0030h interfaceC0030h16 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Q0.h.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            Q0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h16.m(str14, str15, (C0032j) obj34);
                                b17 = i1.a.u(null);
                            } catch (Throwable th15) {
                                b17 = AbstractC0132a.b(th15);
                            }
                            o2.b(b17);
                            break;
                    }
                }
            });
        } else {
            c0079n3.i(null);
        }
        C0079n c0079n4 = new C0079n(interfaceC0320f, A0.b.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", concat), a(), b2);
        if (interfaceC0030h != null) {
            final int i5 = 13;
            c0079n4.i(new InterfaceC0316b() { // from class: B0.e
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    List b3;
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    switch (i5) {
                        case 0:
                            InterfaceC0030h interfaceC0030h2 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h2.b(str2, booleanValue, (C0032j) obj4);
                                b3 = i1.a.u(null);
                            } catch (Throwable th) {
                                b3 = AbstractC0132a.b(th);
                            }
                            o2.b(b3);
                            break;
                        case 1:
                            InterfaceC0030h interfaceC0030h3 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Q0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h3.d(str3, list3, (C0032j) obj7);
                                b4 = i1.a.u(null);
                            } catch (Throwable th2) {
                                b4 = AbstractC0132a.b(th2);
                            }
                            o2.b(b4);
                            break;
                        case 2:
                            InterfaceC0030h interfaceC0030h4 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b5 = i1.a.u(interfaceC0030h4.n(str4, (C0032j) obj9));
                            } catch (Throwable th3) {
                                b5 = AbstractC0132a.b(th3);
                            }
                            o2.b(b5);
                            break;
                        case 3:
                            InterfaceC0030h interfaceC0030h5 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = i1.a.u(interfaceC0030h5.p(str5, (C0032j) obj11));
                            } catch (Throwable th4) {
                                b6 = AbstractC0132a.b(th4);
                            }
                            o2.b(b6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0030h interfaceC0030h6 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = i1.a.u(interfaceC0030h6.a(str6, (C0032j) obj13));
                            } catch (Throwable th5) {
                                b7 = AbstractC0132a.b(th5);
                            }
                            o2.b(b7);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0030h interfaceC0030h7 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = i1.a.u(interfaceC0030h7.g(str7, (C0032j) obj15));
                            } catch (Throwable th6) {
                                b8 = AbstractC0132a.b(th6);
                            }
                            o2.b(b8);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0030h interfaceC0030h8 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = i1.a.u(interfaceC0030h8.q(str8, (C0032j) obj17));
                            } catch (Throwable th7) {
                                b9 = AbstractC0132a.b(th7);
                            }
                            o2.b(b9);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0030h interfaceC0030h9 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b10 = i1.a.u(interfaceC0030h9.i(str9, (C0032j) obj19));
                            } catch (Throwable th8) {
                                b10 = AbstractC0132a.b(th8);
                            }
                            o2.b(b10);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0030h interfaceC0030h10 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            Q0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h10.l(list11, (C0032j) obj20);
                                b11 = i1.a.u(null);
                            } catch (Throwable th9) {
                                b11 = AbstractC0132a.b(th9);
                            }
                            o2.b(b11);
                            break;
                        case 9:
                            InterfaceC0030h interfaceC0030h11 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = i1.a.u(interfaceC0030h11.c(list13, (C0032j) obj21));
                            } catch (Throwable th10) {
                                b12 = AbstractC0132a.b(th10);
                            }
                            o2.b(b12);
                            break;
                        case 10:
                            InterfaceC0030h interfaceC0030h12 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            Q0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b13 = i1.a.u(interfaceC0030h12.h(list15, (C0032j) obj22));
                            } catch (Throwable th11) {
                                b13 = AbstractC0132a.b(th11);
                            }
                            o2.b(b13);
                            break;
                        case 11:
                            InterfaceC0030h interfaceC0030h13 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            Q0.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            Q0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h13.f(str10, str11, (C0032j) obj25);
                                b14 = i1.a.u(null);
                            } catch (Throwable th12) {
                                b14 = AbstractC0132a.b(th12);
                            }
                            o2.b(b14);
                            break;
                        case 12:
                            InterfaceC0030h interfaceC0030h14 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            Q0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h14.o(str12, longValue, (C0032j) obj28);
                                b15 = i1.a.u(null);
                            } catch (Throwable th13) {
                                b15 = AbstractC0132a.b(th13);
                            }
                            o2.b(b15);
                            break;
                        case 13:
                            InterfaceC0030h interfaceC0030h15 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            Q0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h15.e(str13, doubleValue, (C0032j) obj31);
                                b16 = i1.a.u(null);
                            } catch (Throwable th14) {
                                b16 = AbstractC0132a.b(th14);
                            }
                            o2.b(b16);
                            break;
                        default:
                            InterfaceC0030h interfaceC0030h16 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Q0.h.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            Q0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h16.m(str14, str15, (C0032j) obj34);
                                b17 = i1.a.u(null);
                            } catch (Throwable th15) {
                                b17 = AbstractC0132a.b(th15);
                            }
                            o2.b(b17);
                            break;
                    }
                }
            });
        } else {
            c0079n4.i(null);
        }
        C0079n c0079n5 = new C0079n(interfaceC0320f, A0.b.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", concat), a(), b2);
        if (interfaceC0030h != null) {
            final int i6 = 14;
            c0079n5.i(new InterfaceC0316b() { // from class: B0.e
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    List b3;
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    switch (i6) {
                        case 0:
                            InterfaceC0030h interfaceC0030h2 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h2.b(str2, booleanValue, (C0032j) obj4);
                                b3 = i1.a.u(null);
                            } catch (Throwable th) {
                                b3 = AbstractC0132a.b(th);
                            }
                            o2.b(b3);
                            break;
                        case 1:
                            InterfaceC0030h interfaceC0030h3 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Q0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h3.d(str3, list3, (C0032j) obj7);
                                b4 = i1.a.u(null);
                            } catch (Throwable th2) {
                                b4 = AbstractC0132a.b(th2);
                            }
                            o2.b(b4);
                            break;
                        case 2:
                            InterfaceC0030h interfaceC0030h4 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b5 = i1.a.u(interfaceC0030h4.n(str4, (C0032j) obj9));
                            } catch (Throwable th3) {
                                b5 = AbstractC0132a.b(th3);
                            }
                            o2.b(b5);
                            break;
                        case 3:
                            InterfaceC0030h interfaceC0030h5 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = i1.a.u(interfaceC0030h5.p(str5, (C0032j) obj11));
                            } catch (Throwable th4) {
                                b6 = AbstractC0132a.b(th4);
                            }
                            o2.b(b6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0030h interfaceC0030h6 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = i1.a.u(interfaceC0030h6.a(str6, (C0032j) obj13));
                            } catch (Throwable th5) {
                                b7 = AbstractC0132a.b(th5);
                            }
                            o2.b(b7);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0030h interfaceC0030h7 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = i1.a.u(interfaceC0030h7.g(str7, (C0032j) obj15));
                            } catch (Throwable th6) {
                                b8 = AbstractC0132a.b(th6);
                            }
                            o2.b(b8);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0030h interfaceC0030h8 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = i1.a.u(interfaceC0030h8.q(str8, (C0032j) obj17));
                            } catch (Throwable th7) {
                                b9 = AbstractC0132a.b(th7);
                            }
                            o2.b(b9);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0030h interfaceC0030h9 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b10 = i1.a.u(interfaceC0030h9.i(str9, (C0032j) obj19));
                            } catch (Throwable th8) {
                                b10 = AbstractC0132a.b(th8);
                            }
                            o2.b(b10);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0030h interfaceC0030h10 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            Q0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h10.l(list11, (C0032j) obj20);
                                b11 = i1.a.u(null);
                            } catch (Throwable th9) {
                                b11 = AbstractC0132a.b(th9);
                            }
                            o2.b(b11);
                            break;
                        case 9:
                            InterfaceC0030h interfaceC0030h11 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = i1.a.u(interfaceC0030h11.c(list13, (C0032j) obj21));
                            } catch (Throwable th10) {
                                b12 = AbstractC0132a.b(th10);
                            }
                            o2.b(b12);
                            break;
                        case 10:
                            InterfaceC0030h interfaceC0030h12 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            Q0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b13 = i1.a.u(interfaceC0030h12.h(list15, (C0032j) obj22));
                            } catch (Throwable th11) {
                                b13 = AbstractC0132a.b(th11);
                            }
                            o2.b(b13);
                            break;
                        case 11:
                            InterfaceC0030h interfaceC0030h13 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            Q0.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            Q0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h13.f(str10, str11, (C0032j) obj25);
                                b14 = i1.a.u(null);
                            } catch (Throwable th12) {
                                b14 = AbstractC0132a.b(th12);
                            }
                            o2.b(b14);
                            break;
                        case 12:
                            InterfaceC0030h interfaceC0030h14 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            Q0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h14.o(str12, longValue, (C0032j) obj28);
                                b15 = i1.a.u(null);
                            } catch (Throwable th13) {
                                b15 = AbstractC0132a.b(th13);
                            }
                            o2.b(b15);
                            break;
                        case 13:
                            InterfaceC0030h interfaceC0030h15 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            Q0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h15.e(str13, doubleValue, (C0032j) obj31);
                                b16 = i1.a.u(null);
                            } catch (Throwable th14) {
                                b16 = AbstractC0132a.b(th14);
                            }
                            o2.b(b16);
                            break;
                        default:
                            InterfaceC0030h interfaceC0030h16 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Q0.h.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            Q0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h16.m(str14, str15, (C0032j) obj34);
                                b17 = i1.a.u(null);
                            } catch (Throwable th15) {
                                b17 = AbstractC0132a.b(th15);
                            }
                            o2.b(b17);
                            break;
                    }
                }
            });
        } else {
            c0079n5.i(null);
        }
        C0079n c0079n6 = new C0079n(interfaceC0320f, A0.b.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", concat), a(), b2);
        if (interfaceC0030h != null) {
            final int i7 = 1;
            c0079n6.i(new InterfaceC0316b() { // from class: B0.e
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    List b3;
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    switch (i7) {
                        case 0:
                            InterfaceC0030h interfaceC0030h2 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h2.b(str2, booleanValue, (C0032j) obj4);
                                b3 = i1.a.u(null);
                            } catch (Throwable th) {
                                b3 = AbstractC0132a.b(th);
                            }
                            o2.b(b3);
                            break;
                        case 1:
                            InterfaceC0030h interfaceC0030h3 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Q0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h3.d(str3, list3, (C0032j) obj7);
                                b4 = i1.a.u(null);
                            } catch (Throwable th2) {
                                b4 = AbstractC0132a.b(th2);
                            }
                            o2.b(b4);
                            break;
                        case 2:
                            InterfaceC0030h interfaceC0030h4 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b5 = i1.a.u(interfaceC0030h4.n(str4, (C0032j) obj9));
                            } catch (Throwable th3) {
                                b5 = AbstractC0132a.b(th3);
                            }
                            o2.b(b5);
                            break;
                        case 3:
                            InterfaceC0030h interfaceC0030h5 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = i1.a.u(interfaceC0030h5.p(str5, (C0032j) obj11));
                            } catch (Throwable th4) {
                                b6 = AbstractC0132a.b(th4);
                            }
                            o2.b(b6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0030h interfaceC0030h6 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = i1.a.u(interfaceC0030h6.a(str6, (C0032j) obj13));
                            } catch (Throwable th5) {
                                b7 = AbstractC0132a.b(th5);
                            }
                            o2.b(b7);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0030h interfaceC0030h7 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = i1.a.u(interfaceC0030h7.g(str7, (C0032j) obj15));
                            } catch (Throwable th6) {
                                b8 = AbstractC0132a.b(th6);
                            }
                            o2.b(b8);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0030h interfaceC0030h8 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = i1.a.u(interfaceC0030h8.q(str8, (C0032j) obj17));
                            } catch (Throwable th7) {
                                b9 = AbstractC0132a.b(th7);
                            }
                            o2.b(b9);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0030h interfaceC0030h9 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b10 = i1.a.u(interfaceC0030h9.i(str9, (C0032j) obj19));
                            } catch (Throwable th8) {
                                b10 = AbstractC0132a.b(th8);
                            }
                            o2.b(b10);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0030h interfaceC0030h10 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            Q0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h10.l(list11, (C0032j) obj20);
                                b11 = i1.a.u(null);
                            } catch (Throwable th9) {
                                b11 = AbstractC0132a.b(th9);
                            }
                            o2.b(b11);
                            break;
                        case 9:
                            InterfaceC0030h interfaceC0030h11 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = i1.a.u(interfaceC0030h11.c(list13, (C0032j) obj21));
                            } catch (Throwable th10) {
                                b12 = AbstractC0132a.b(th10);
                            }
                            o2.b(b12);
                            break;
                        case 10:
                            InterfaceC0030h interfaceC0030h12 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            Q0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b13 = i1.a.u(interfaceC0030h12.h(list15, (C0032j) obj22));
                            } catch (Throwable th11) {
                                b13 = AbstractC0132a.b(th11);
                            }
                            o2.b(b13);
                            break;
                        case 11:
                            InterfaceC0030h interfaceC0030h13 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            Q0.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            Q0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h13.f(str10, str11, (C0032j) obj25);
                                b14 = i1.a.u(null);
                            } catch (Throwable th12) {
                                b14 = AbstractC0132a.b(th12);
                            }
                            o2.b(b14);
                            break;
                        case 12:
                            InterfaceC0030h interfaceC0030h14 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            Q0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h14.o(str12, longValue, (C0032j) obj28);
                                b15 = i1.a.u(null);
                            } catch (Throwable th13) {
                                b15 = AbstractC0132a.b(th13);
                            }
                            o2.b(b15);
                            break;
                        case 13:
                            InterfaceC0030h interfaceC0030h15 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            Q0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h15.e(str13, doubleValue, (C0032j) obj31);
                                b16 = i1.a.u(null);
                            } catch (Throwable th14) {
                                b16 = AbstractC0132a.b(th14);
                            }
                            o2.b(b16);
                            break;
                        default:
                            InterfaceC0030h interfaceC0030h16 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Q0.h.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            Q0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h16.m(str14, str15, (C0032j) obj34);
                                b17 = i1.a.u(null);
                            } catch (Throwable th15) {
                                b17 = AbstractC0132a.b(th15);
                            }
                            o2.b(b17);
                            break;
                    }
                }
            });
        } else {
            c0079n6.i(null);
        }
        C0079n c0079n7 = new C0079n(interfaceC0320f, A0.b.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", concat), a(), b2);
        if (interfaceC0030h != null) {
            final int i8 = 2;
            c0079n7.i(new InterfaceC0316b() { // from class: B0.e
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    List b3;
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    switch (i8) {
                        case 0:
                            InterfaceC0030h interfaceC0030h2 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h2.b(str2, booleanValue, (C0032j) obj4);
                                b3 = i1.a.u(null);
                            } catch (Throwable th) {
                                b3 = AbstractC0132a.b(th);
                            }
                            o2.b(b3);
                            break;
                        case 1:
                            InterfaceC0030h interfaceC0030h3 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Q0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h3.d(str3, list3, (C0032j) obj7);
                                b4 = i1.a.u(null);
                            } catch (Throwable th2) {
                                b4 = AbstractC0132a.b(th2);
                            }
                            o2.b(b4);
                            break;
                        case 2:
                            InterfaceC0030h interfaceC0030h4 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b5 = i1.a.u(interfaceC0030h4.n(str4, (C0032j) obj9));
                            } catch (Throwable th3) {
                                b5 = AbstractC0132a.b(th3);
                            }
                            o2.b(b5);
                            break;
                        case 3:
                            InterfaceC0030h interfaceC0030h5 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = i1.a.u(interfaceC0030h5.p(str5, (C0032j) obj11));
                            } catch (Throwable th4) {
                                b6 = AbstractC0132a.b(th4);
                            }
                            o2.b(b6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0030h interfaceC0030h6 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = i1.a.u(interfaceC0030h6.a(str6, (C0032j) obj13));
                            } catch (Throwable th5) {
                                b7 = AbstractC0132a.b(th5);
                            }
                            o2.b(b7);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0030h interfaceC0030h7 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = i1.a.u(interfaceC0030h7.g(str7, (C0032j) obj15));
                            } catch (Throwable th6) {
                                b8 = AbstractC0132a.b(th6);
                            }
                            o2.b(b8);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0030h interfaceC0030h8 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = i1.a.u(interfaceC0030h8.q(str8, (C0032j) obj17));
                            } catch (Throwable th7) {
                                b9 = AbstractC0132a.b(th7);
                            }
                            o2.b(b9);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0030h interfaceC0030h9 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b10 = i1.a.u(interfaceC0030h9.i(str9, (C0032j) obj19));
                            } catch (Throwable th8) {
                                b10 = AbstractC0132a.b(th8);
                            }
                            o2.b(b10);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0030h interfaceC0030h10 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            Q0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h10.l(list11, (C0032j) obj20);
                                b11 = i1.a.u(null);
                            } catch (Throwable th9) {
                                b11 = AbstractC0132a.b(th9);
                            }
                            o2.b(b11);
                            break;
                        case 9:
                            InterfaceC0030h interfaceC0030h11 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = i1.a.u(interfaceC0030h11.c(list13, (C0032j) obj21));
                            } catch (Throwable th10) {
                                b12 = AbstractC0132a.b(th10);
                            }
                            o2.b(b12);
                            break;
                        case 10:
                            InterfaceC0030h interfaceC0030h12 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            Q0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b13 = i1.a.u(interfaceC0030h12.h(list15, (C0032j) obj22));
                            } catch (Throwable th11) {
                                b13 = AbstractC0132a.b(th11);
                            }
                            o2.b(b13);
                            break;
                        case 11:
                            InterfaceC0030h interfaceC0030h13 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            Q0.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            Q0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h13.f(str10, str11, (C0032j) obj25);
                                b14 = i1.a.u(null);
                            } catch (Throwable th12) {
                                b14 = AbstractC0132a.b(th12);
                            }
                            o2.b(b14);
                            break;
                        case 12:
                            InterfaceC0030h interfaceC0030h14 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            Q0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h14.o(str12, longValue, (C0032j) obj28);
                                b15 = i1.a.u(null);
                            } catch (Throwable th13) {
                                b15 = AbstractC0132a.b(th13);
                            }
                            o2.b(b15);
                            break;
                        case 13:
                            InterfaceC0030h interfaceC0030h15 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            Q0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h15.e(str13, doubleValue, (C0032j) obj31);
                                b16 = i1.a.u(null);
                            } catch (Throwable th14) {
                                b16 = AbstractC0132a.b(th14);
                            }
                            o2.b(b16);
                            break;
                        default:
                            InterfaceC0030h interfaceC0030h16 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Q0.h.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            Q0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h16.m(str14, str15, (C0032j) obj34);
                                b17 = i1.a.u(null);
                            } catch (Throwable th15) {
                                b17 = AbstractC0132a.b(th15);
                            }
                            o2.b(b17);
                            break;
                    }
                }
            });
        } else {
            c0079n7.i(null);
        }
        C0079n c0079n8 = new C0079n(interfaceC0320f, A0.b.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", concat), a(), b2);
        if (interfaceC0030h != null) {
            final int i9 = 3;
            c0079n8.i(new InterfaceC0316b() { // from class: B0.e
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    List b3;
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    switch (i9) {
                        case 0:
                            InterfaceC0030h interfaceC0030h2 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h2.b(str2, booleanValue, (C0032j) obj4);
                                b3 = i1.a.u(null);
                            } catch (Throwable th) {
                                b3 = AbstractC0132a.b(th);
                            }
                            o2.b(b3);
                            break;
                        case 1:
                            InterfaceC0030h interfaceC0030h3 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Q0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h3.d(str3, list3, (C0032j) obj7);
                                b4 = i1.a.u(null);
                            } catch (Throwable th2) {
                                b4 = AbstractC0132a.b(th2);
                            }
                            o2.b(b4);
                            break;
                        case 2:
                            InterfaceC0030h interfaceC0030h4 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b5 = i1.a.u(interfaceC0030h4.n(str4, (C0032j) obj9));
                            } catch (Throwable th3) {
                                b5 = AbstractC0132a.b(th3);
                            }
                            o2.b(b5);
                            break;
                        case 3:
                            InterfaceC0030h interfaceC0030h5 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = i1.a.u(interfaceC0030h5.p(str5, (C0032j) obj11));
                            } catch (Throwable th4) {
                                b6 = AbstractC0132a.b(th4);
                            }
                            o2.b(b6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0030h interfaceC0030h6 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = i1.a.u(interfaceC0030h6.a(str6, (C0032j) obj13));
                            } catch (Throwable th5) {
                                b7 = AbstractC0132a.b(th5);
                            }
                            o2.b(b7);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0030h interfaceC0030h7 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = i1.a.u(interfaceC0030h7.g(str7, (C0032j) obj15));
                            } catch (Throwable th6) {
                                b8 = AbstractC0132a.b(th6);
                            }
                            o2.b(b8);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0030h interfaceC0030h8 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = i1.a.u(interfaceC0030h8.q(str8, (C0032j) obj17));
                            } catch (Throwable th7) {
                                b9 = AbstractC0132a.b(th7);
                            }
                            o2.b(b9);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0030h interfaceC0030h9 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b10 = i1.a.u(interfaceC0030h9.i(str9, (C0032j) obj19));
                            } catch (Throwable th8) {
                                b10 = AbstractC0132a.b(th8);
                            }
                            o2.b(b10);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0030h interfaceC0030h10 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            Q0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h10.l(list11, (C0032j) obj20);
                                b11 = i1.a.u(null);
                            } catch (Throwable th9) {
                                b11 = AbstractC0132a.b(th9);
                            }
                            o2.b(b11);
                            break;
                        case 9:
                            InterfaceC0030h interfaceC0030h11 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = i1.a.u(interfaceC0030h11.c(list13, (C0032j) obj21));
                            } catch (Throwable th10) {
                                b12 = AbstractC0132a.b(th10);
                            }
                            o2.b(b12);
                            break;
                        case 10:
                            InterfaceC0030h interfaceC0030h12 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            Q0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b13 = i1.a.u(interfaceC0030h12.h(list15, (C0032j) obj22));
                            } catch (Throwable th11) {
                                b13 = AbstractC0132a.b(th11);
                            }
                            o2.b(b13);
                            break;
                        case 11:
                            InterfaceC0030h interfaceC0030h13 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            Q0.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            Q0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h13.f(str10, str11, (C0032j) obj25);
                                b14 = i1.a.u(null);
                            } catch (Throwable th12) {
                                b14 = AbstractC0132a.b(th12);
                            }
                            o2.b(b14);
                            break;
                        case 12:
                            InterfaceC0030h interfaceC0030h14 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            Q0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h14.o(str12, longValue, (C0032j) obj28);
                                b15 = i1.a.u(null);
                            } catch (Throwable th13) {
                                b15 = AbstractC0132a.b(th13);
                            }
                            o2.b(b15);
                            break;
                        case 13:
                            InterfaceC0030h interfaceC0030h15 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            Q0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h15.e(str13, doubleValue, (C0032j) obj31);
                                b16 = i1.a.u(null);
                            } catch (Throwable th14) {
                                b16 = AbstractC0132a.b(th14);
                            }
                            o2.b(b16);
                            break;
                        default:
                            InterfaceC0030h interfaceC0030h16 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Q0.h.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            Q0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h16.m(str14, str15, (C0032j) obj34);
                                b17 = i1.a.u(null);
                            } catch (Throwable th15) {
                                b17 = AbstractC0132a.b(th15);
                            }
                            o2.b(b17);
                            break;
                    }
                }
            });
        } else {
            c0079n8.i(null);
        }
        C0079n c0079n9 = new C0079n(interfaceC0320f, A0.b.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", concat), a(), b2);
        if (interfaceC0030h != null) {
            final int i10 = 4;
            c0079n9.i(new InterfaceC0316b() { // from class: B0.e
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    List b3;
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    switch (i10) {
                        case 0:
                            InterfaceC0030h interfaceC0030h2 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h2.b(str2, booleanValue, (C0032j) obj4);
                                b3 = i1.a.u(null);
                            } catch (Throwable th) {
                                b3 = AbstractC0132a.b(th);
                            }
                            o2.b(b3);
                            break;
                        case 1:
                            InterfaceC0030h interfaceC0030h3 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Q0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h3.d(str3, list3, (C0032j) obj7);
                                b4 = i1.a.u(null);
                            } catch (Throwable th2) {
                                b4 = AbstractC0132a.b(th2);
                            }
                            o2.b(b4);
                            break;
                        case 2:
                            InterfaceC0030h interfaceC0030h4 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b5 = i1.a.u(interfaceC0030h4.n(str4, (C0032j) obj9));
                            } catch (Throwable th3) {
                                b5 = AbstractC0132a.b(th3);
                            }
                            o2.b(b5);
                            break;
                        case 3:
                            InterfaceC0030h interfaceC0030h5 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = i1.a.u(interfaceC0030h5.p(str5, (C0032j) obj11));
                            } catch (Throwable th4) {
                                b6 = AbstractC0132a.b(th4);
                            }
                            o2.b(b6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0030h interfaceC0030h6 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = i1.a.u(interfaceC0030h6.a(str6, (C0032j) obj13));
                            } catch (Throwable th5) {
                                b7 = AbstractC0132a.b(th5);
                            }
                            o2.b(b7);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0030h interfaceC0030h7 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = i1.a.u(interfaceC0030h7.g(str7, (C0032j) obj15));
                            } catch (Throwable th6) {
                                b8 = AbstractC0132a.b(th6);
                            }
                            o2.b(b8);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0030h interfaceC0030h8 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = i1.a.u(interfaceC0030h8.q(str8, (C0032j) obj17));
                            } catch (Throwable th7) {
                                b9 = AbstractC0132a.b(th7);
                            }
                            o2.b(b9);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0030h interfaceC0030h9 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b10 = i1.a.u(interfaceC0030h9.i(str9, (C0032j) obj19));
                            } catch (Throwable th8) {
                                b10 = AbstractC0132a.b(th8);
                            }
                            o2.b(b10);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0030h interfaceC0030h10 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            Q0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h10.l(list11, (C0032j) obj20);
                                b11 = i1.a.u(null);
                            } catch (Throwable th9) {
                                b11 = AbstractC0132a.b(th9);
                            }
                            o2.b(b11);
                            break;
                        case 9:
                            InterfaceC0030h interfaceC0030h11 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = i1.a.u(interfaceC0030h11.c(list13, (C0032j) obj21));
                            } catch (Throwable th10) {
                                b12 = AbstractC0132a.b(th10);
                            }
                            o2.b(b12);
                            break;
                        case 10:
                            InterfaceC0030h interfaceC0030h12 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            Q0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b13 = i1.a.u(interfaceC0030h12.h(list15, (C0032j) obj22));
                            } catch (Throwable th11) {
                                b13 = AbstractC0132a.b(th11);
                            }
                            o2.b(b13);
                            break;
                        case 11:
                            InterfaceC0030h interfaceC0030h13 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            Q0.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            Q0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h13.f(str10, str11, (C0032j) obj25);
                                b14 = i1.a.u(null);
                            } catch (Throwable th12) {
                                b14 = AbstractC0132a.b(th12);
                            }
                            o2.b(b14);
                            break;
                        case 12:
                            InterfaceC0030h interfaceC0030h14 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            Q0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h14.o(str12, longValue, (C0032j) obj28);
                                b15 = i1.a.u(null);
                            } catch (Throwable th13) {
                                b15 = AbstractC0132a.b(th13);
                            }
                            o2.b(b15);
                            break;
                        case 13:
                            InterfaceC0030h interfaceC0030h15 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            Q0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h15.e(str13, doubleValue, (C0032j) obj31);
                                b16 = i1.a.u(null);
                            } catch (Throwable th14) {
                                b16 = AbstractC0132a.b(th14);
                            }
                            o2.b(b16);
                            break;
                        default:
                            InterfaceC0030h interfaceC0030h16 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Q0.h.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            Q0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h16.m(str14, str15, (C0032j) obj34);
                                b17 = i1.a.u(null);
                            } catch (Throwable th15) {
                                b17 = AbstractC0132a.b(th15);
                            }
                            o2.b(b17);
                            break;
                    }
                }
            });
        } else {
            c0079n9.i(null);
        }
        C0079n c0079n10 = new C0079n(interfaceC0320f, A0.b.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", concat), a(), b2);
        if (interfaceC0030h != null) {
            final int i11 = 5;
            c0079n10.i(new InterfaceC0316b() { // from class: B0.e
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    List b3;
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    switch (i11) {
                        case 0:
                            InterfaceC0030h interfaceC0030h2 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h2.b(str2, booleanValue, (C0032j) obj4);
                                b3 = i1.a.u(null);
                            } catch (Throwable th) {
                                b3 = AbstractC0132a.b(th);
                            }
                            o2.b(b3);
                            break;
                        case 1:
                            InterfaceC0030h interfaceC0030h3 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Q0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h3.d(str3, list3, (C0032j) obj7);
                                b4 = i1.a.u(null);
                            } catch (Throwable th2) {
                                b4 = AbstractC0132a.b(th2);
                            }
                            o2.b(b4);
                            break;
                        case 2:
                            InterfaceC0030h interfaceC0030h4 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b5 = i1.a.u(interfaceC0030h4.n(str4, (C0032j) obj9));
                            } catch (Throwable th3) {
                                b5 = AbstractC0132a.b(th3);
                            }
                            o2.b(b5);
                            break;
                        case 3:
                            InterfaceC0030h interfaceC0030h5 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = i1.a.u(interfaceC0030h5.p(str5, (C0032j) obj11));
                            } catch (Throwable th4) {
                                b6 = AbstractC0132a.b(th4);
                            }
                            o2.b(b6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0030h interfaceC0030h6 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = i1.a.u(interfaceC0030h6.a(str6, (C0032j) obj13));
                            } catch (Throwable th5) {
                                b7 = AbstractC0132a.b(th5);
                            }
                            o2.b(b7);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0030h interfaceC0030h7 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = i1.a.u(interfaceC0030h7.g(str7, (C0032j) obj15));
                            } catch (Throwable th6) {
                                b8 = AbstractC0132a.b(th6);
                            }
                            o2.b(b8);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0030h interfaceC0030h8 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = i1.a.u(interfaceC0030h8.q(str8, (C0032j) obj17));
                            } catch (Throwable th7) {
                                b9 = AbstractC0132a.b(th7);
                            }
                            o2.b(b9);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0030h interfaceC0030h9 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b10 = i1.a.u(interfaceC0030h9.i(str9, (C0032j) obj19));
                            } catch (Throwable th8) {
                                b10 = AbstractC0132a.b(th8);
                            }
                            o2.b(b10);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0030h interfaceC0030h10 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            Q0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h10.l(list11, (C0032j) obj20);
                                b11 = i1.a.u(null);
                            } catch (Throwable th9) {
                                b11 = AbstractC0132a.b(th9);
                            }
                            o2.b(b11);
                            break;
                        case 9:
                            InterfaceC0030h interfaceC0030h11 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = i1.a.u(interfaceC0030h11.c(list13, (C0032j) obj21));
                            } catch (Throwable th10) {
                                b12 = AbstractC0132a.b(th10);
                            }
                            o2.b(b12);
                            break;
                        case 10:
                            InterfaceC0030h interfaceC0030h12 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            Q0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b13 = i1.a.u(interfaceC0030h12.h(list15, (C0032j) obj22));
                            } catch (Throwable th11) {
                                b13 = AbstractC0132a.b(th11);
                            }
                            o2.b(b13);
                            break;
                        case 11:
                            InterfaceC0030h interfaceC0030h13 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            Q0.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            Q0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h13.f(str10, str11, (C0032j) obj25);
                                b14 = i1.a.u(null);
                            } catch (Throwable th12) {
                                b14 = AbstractC0132a.b(th12);
                            }
                            o2.b(b14);
                            break;
                        case 12:
                            InterfaceC0030h interfaceC0030h14 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            Q0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h14.o(str12, longValue, (C0032j) obj28);
                                b15 = i1.a.u(null);
                            } catch (Throwable th13) {
                                b15 = AbstractC0132a.b(th13);
                            }
                            o2.b(b15);
                            break;
                        case 13:
                            InterfaceC0030h interfaceC0030h15 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            Q0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h15.e(str13, doubleValue, (C0032j) obj31);
                                b16 = i1.a.u(null);
                            } catch (Throwable th14) {
                                b16 = AbstractC0132a.b(th14);
                            }
                            o2.b(b16);
                            break;
                        default:
                            InterfaceC0030h interfaceC0030h16 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Q0.h.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            Q0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h16.m(str14, str15, (C0032j) obj34);
                                b17 = i1.a.u(null);
                            } catch (Throwable th15) {
                                b17 = AbstractC0132a.b(th15);
                            }
                            o2.b(b17);
                            break;
                    }
                }
            });
        } else {
            c0079n10.i(null);
        }
        C0079n c0079n11 = new C0079n(interfaceC0320f, A0.b.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", concat), a(), b2);
        if (interfaceC0030h != null) {
            final int i12 = 6;
            c0079n11.i(new InterfaceC0316b() { // from class: B0.e
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    List b3;
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    switch (i12) {
                        case 0:
                            InterfaceC0030h interfaceC0030h2 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h2.b(str2, booleanValue, (C0032j) obj4);
                                b3 = i1.a.u(null);
                            } catch (Throwable th) {
                                b3 = AbstractC0132a.b(th);
                            }
                            o2.b(b3);
                            break;
                        case 1:
                            InterfaceC0030h interfaceC0030h3 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Q0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h3.d(str3, list3, (C0032j) obj7);
                                b4 = i1.a.u(null);
                            } catch (Throwable th2) {
                                b4 = AbstractC0132a.b(th2);
                            }
                            o2.b(b4);
                            break;
                        case 2:
                            InterfaceC0030h interfaceC0030h4 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b5 = i1.a.u(interfaceC0030h4.n(str4, (C0032j) obj9));
                            } catch (Throwable th3) {
                                b5 = AbstractC0132a.b(th3);
                            }
                            o2.b(b5);
                            break;
                        case 3:
                            InterfaceC0030h interfaceC0030h5 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = i1.a.u(interfaceC0030h5.p(str5, (C0032j) obj11));
                            } catch (Throwable th4) {
                                b6 = AbstractC0132a.b(th4);
                            }
                            o2.b(b6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0030h interfaceC0030h6 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = i1.a.u(interfaceC0030h6.a(str6, (C0032j) obj13));
                            } catch (Throwable th5) {
                                b7 = AbstractC0132a.b(th5);
                            }
                            o2.b(b7);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0030h interfaceC0030h7 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = i1.a.u(interfaceC0030h7.g(str7, (C0032j) obj15));
                            } catch (Throwable th6) {
                                b8 = AbstractC0132a.b(th6);
                            }
                            o2.b(b8);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0030h interfaceC0030h8 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = i1.a.u(interfaceC0030h8.q(str8, (C0032j) obj17));
                            } catch (Throwable th7) {
                                b9 = AbstractC0132a.b(th7);
                            }
                            o2.b(b9);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0030h interfaceC0030h9 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b10 = i1.a.u(interfaceC0030h9.i(str9, (C0032j) obj19));
                            } catch (Throwable th8) {
                                b10 = AbstractC0132a.b(th8);
                            }
                            o2.b(b10);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0030h interfaceC0030h10 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            Q0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h10.l(list11, (C0032j) obj20);
                                b11 = i1.a.u(null);
                            } catch (Throwable th9) {
                                b11 = AbstractC0132a.b(th9);
                            }
                            o2.b(b11);
                            break;
                        case 9:
                            InterfaceC0030h interfaceC0030h11 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = i1.a.u(interfaceC0030h11.c(list13, (C0032j) obj21));
                            } catch (Throwable th10) {
                                b12 = AbstractC0132a.b(th10);
                            }
                            o2.b(b12);
                            break;
                        case 10:
                            InterfaceC0030h interfaceC0030h12 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            Q0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b13 = i1.a.u(interfaceC0030h12.h(list15, (C0032j) obj22));
                            } catch (Throwable th11) {
                                b13 = AbstractC0132a.b(th11);
                            }
                            o2.b(b13);
                            break;
                        case 11:
                            InterfaceC0030h interfaceC0030h13 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            Q0.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            Q0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h13.f(str10, str11, (C0032j) obj25);
                                b14 = i1.a.u(null);
                            } catch (Throwable th12) {
                                b14 = AbstractC0132a.b(th12);
                            }
                            o2.b(b14);
                            break;
                        case 12:
                            InterfaceC0030h interfaceC0030h14 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            Q0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h14.o(str12, longValue, (C0032j) obj28);
                                b15 = i1.a.u(null);
                            } catch (Throwable th13) {
                                b15 = AbstractC0132a.b(th13);
                            }
                            o2.b(b15);
                            break;
                        case 13:
                            InterfaceC0030h interfaceC0030h15 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            Q0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h15.e(str13, doubleValue, (C0032j) obj31);
                                b16 = i1.a.u(null);
                            } catch (Throwable th14) {
                                b16 = AbstractC0132a.b(th14);
                            }
                            o2.b(b16);
                            break;
                        default:
                            InterfaceC0030h interfaceC0030h16 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Q0.h.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            Q0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h16.m(str14, str15, (C0032j) obj34);
                                b17 = i1.a.u(null);
                            } catch (Throwable th15) {
                                b17 = AbstractC0132a.b(th15);
                            }
                            o2.b(b17);
                            break;
                    }
                }
            });
        } else {
            c0079n11.i(null);
        }
        C0079n c0079n12 = new C0079n(interfaceC0320f, A0.b.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", concat), a(), b2);
        if (interfaceC0030h != null) {
            final int i13 = 7;
            c0079n12.i(new InterfaceC0316b() { // from class: B0.e
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    List b3;
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    switch (i13) {
                        case 0:
                            InterfaceC0030h interfaceC0030h2 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h2.b(str2, booleanValue, (C0032j) obj4);
                                b3 = i1.a.u(null);
                            } catch (Throwable th) {
                                b3 = AbstractC0132a.b(th);
                            }
                            o2.b(b3);
                            break;
                        case 1:
                            InterfaceC0030h interfaceC0030h3 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Q0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h3.d(str3, list3, (C0032j) obj7);
                                b4 = i1.a.u(null);
                            } catch (Throwable th2) {
                                b4 = AbstractC0132a.b(th2);
                            }
                            o2.b(b4);
                            break;
                        case 2:
                            InterfaceC0030h interfaceC0030h4 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b5 = i1.a.u(interfaceC0030h4.n(str4, (C0032j) obj9));
                            } catch (Throwable th3) {
                                b5 = AbstractC0132a.b(th3);
                            }
                            o2.b(b5);
                            break;
                        case 3:
                            InterfaceC0030h interfaceC0030h5 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = i1.a.u(interfaceC0030h5.p(str5, (C0032j) obj11));
                            } catch (Throwable th4) {
                                b6 = AbstractC0132a.b(th4);
                            }
                            o2.b(b6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0030h interfaceC0030h6 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = i1.a.u(interfaceC0030h6.a(str6, (C0032j) obj13));
                            } catch (Throwable th5) {
                                b7 = AbstractC0132a.b(th5);
                            }
                            o2.b(b7);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0030h interfaceC0030h7 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = i1.a.u(interfaceC0030h7.g(str7, (C0032j) obj15));
                            } catch (Throwable th6) {
                                b8 = AbstractC0132a.b(th6);
                            }
                            o2.b(b8);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0030h interfaceC0030h8 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = i1.a.u(interfaceC0030h8.q(str8, (C0032j) obj17));
                            } catch (Throwable th7) {
                                b9 = AbstractC0132a.b(th7);
                            }
                            o2.b(b9);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0030h interfaceC0030h9 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b10 = i1.a.u(interfaceC0030h9.i(str9, (C0032j) obj19));
                            } catch (Throwable th8) {
                                b10 = AbstractC0132a.b(th8);
                            }
                            o2.b(b10);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0030h interfaceC0030h10 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            Q0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h10.l(list11, (C0032j) obj20);
                                b11 = i1.a.u(null);
                            } catch (Throwable th9) {
                                b11 = AbstractC0132a.b(th9);
                            }
                            o2.b(b11);
                            break;
                        case 9:
                            InterfaceC0030h interfaceC0030h11 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = i1.a.u(interfaceC0030h11.c(list13, (C0032j) obj21));
                            } catch (Throwable th10) {
                                b12 = AbstractC0132a.b(th10);
                            }
                            o2.b(b12);
                            break;
                        case 10:
                            InterfaceC0030h interfaceC0030h12 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            Q0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b13 = i1.a.u(interfaceC0030h12.h(list15, (C0032j) obj22));
                            } catch (Throwable th11) {
                                b13 = AbstractC0132a.b(th11);
                            }
                            o2.b(b13);
                            break;
                        case 11:
                            InterfaceC0030h interfaceC0030h13 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            Q0.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            Q0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h13.f(str10, str11, (C0032j) obj25);
                                b14 = i1.a.u(null);
                            } catch (Throwable th12) {
                                b14 = AbstractC0132a.b(th12);
                            }
                            o2.b(b14);
                            break;
                        case 12:
                            InterfaceC0030h interfaceC0030h14 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            Q0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h14.o(str12, longValue, (C0032j) obj28);
                                b15 = i1.a.u(null);
                            } catch (Throwable th13) {
                                b15 = AbstractC0132a.b(th13);
                            }
                            o2.b(b15);
                            break;
                        case 13:
                            InterfaceC0030h interfaceC0030h15 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            Q0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h15.e(str13, doubleValue, (C0032j) obj31);
                                b16 = i1.a.u(null);
                            } catch (Throwable th14) {
                                b16 = AbstractC0132a.b(th14);
                            }
                            o2.b(b16);
                            break;
                        default:
                            InterfaceC0030h interfaceC0030h16 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Q0.h.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            Q0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h16.m(str14, str15, (C0032j) obj34);
                                b17 = i1.a.u(null);
                            } catch (Throwable th15) {
                                b17 = AbstractC0132a.b(th15);
                            }
                            o2.b(b17);
                            break;
                    }
                }
            });
        } else {
            c0079n12.i(null);
        }
        C0079n c0079n13 = new C0079n(interfaceC0320f, A0.b.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", concat), a(), b2);
        if (interfaceC0030h != null) {
            final int i14 = 8;
            c0079n13.i(new InterfaceC0316b() { // from class: B0.e
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    List b3;
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    switch (i14) {
                        case 0:
                            InterfaceC0030h interfaceC0030h2 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h2.b(str2, booleanValue, (C0032j) obj4);
                                b3 = i1.a.u(null);
                            } catch (Throwable th) {
                                b3 = AbstractC0132a.b(th);
                            }
                            o2.b(b3);
                            break;
                        case 1:
                            InterfaceC0030h interfaceC0030h3 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Q0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h3.d(str3, list3, (C0032j) obj7);
                                b4 = i1.a.u(null);
                            } catch (Throwable th2) {
                                b4 = AbstractC0132a.b(th2);
                            }
                            o2.b(b4);
                            break;
                        case 2:
                            InterfaceC0030h interfaceC0030h4 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b5 = i1.a.u(interfaceC0030h4.n(str4, (C0032j) obj9));
                            } catch (Throwable th3) {
                                b5 = AbstractC0132a.b(th3);
                            }
                            o2.b(b5);
                            break;
                        case 3:
                            InterfaceC0030h interfaceC0030h5 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = i1.a.u(interfaceC0030h5.p(str5, (C0032j) obj11));
                            } catch (Throwable th4) {
                                b6 = AbstractC0132a.b(th4);
                            }
                            o2.b(b6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0030h interfaceC0030h6 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = i1.a.u(interfaceC0030h6.a(str6, (C0032j) obj13));
                            } catch (Throwable th5) {
                                b7 = AbstractC0132a.b(th5);
                            }
                            o2.b(b7);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0030h interfaceC0030h7 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = i1.a.u(interfaceC0030h7.g(str7, (C0032j) obj15));
                            } catch (Throwable th6) {
                                b8 = AbstractC0132a.b(th6);
                            }
                            o2.b(b8);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0030h interfaceC0030h8 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = i1.a.u(interfaceC0030h8.q(str8, (C0032j) obj17));
                            } catch (Throwable th7) {
                                b9 = AbstractC0132a.b(th7);
                            }
                            o2.b(b9);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0030h interfaceC0030h9 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b10 = i1.a.u(interfaceC0030h9.i(str9, (C0032j) obj19));
                            } catch (Throwable th8) {
                                b10 = AbstractC0132a.b(th8);
                            }
                            o2.b(b10);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0030h interfaceC0030h10 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            Q0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h10.l(list11, (C0032j) obj20);
                                b11 = i1.a.u(null);
                            } catch (Throwable th9) {
                                b11 = AbstractC0132a.b(th9);
                            }
                            o2.b(b11);
                            break;
                        case 9:
                            InterfaceC0030h interfaceC0030h11 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = i1.a.u(interfaceC0030h11.c(list13, (C0032j) obj21));
                            } catch (Throwable th10) {
                                b12 = AbstractC0132a.b(th10);
                            }
                            o2.b(b12);
                            break;
                        case 10:
                            InterfaceC0030h interfaceC0030h12 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            Q0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b13 = i1.a.u(interfaceC0030h12.h(list15, (C0032j) obj22));
                            } catch (Throwable th11) {
                                b13 = AbstractC0132a.b(th11);
                            }
                            o2.b(b13);
                            break;
                        case 11:
                            InterfaceC0030h interfaceC0030h13 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            Q0.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            Q0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h13.f(str10, str11, (C0032j) obj25);
                                b14 = i1.a.u(null);
                            } catch (Throwable th12) {
                                b14 = AbstractC0132a.b(th12);
                            }
                            o2.b(b14);
                            break;
                        case 12:
                            InterfaceC0030h interfaceC0030h14 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            Q0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h14.o(str12, longValue, (C0032j) obj28);
                                b15 = i1.a.u(null);
                            } catch (Throwable th13) {
                                b15 = AbstractC0132a.b(th13);
                            }
                            o2.b(b15);
                            break;
                        case 13:
                            InterfaceC0030h interfaceC0030h15 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            Q0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h15.e(str13, doubleValue, (C0032j) obj31);
                                b16 = i1.a.u(null);
                            } catch (Throwable th14) {
                                b16 = AbstractC0132a.b(th14);
                            }
                            o2.b(b16);
                            break;
                        default:
                            InterfaceC0030h interfaceC0030h16 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Q0.h.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            Q0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h16.m(str14, str15, (C0032j) obj34);
                                b17 = i1.a.u(null);
                            } catch (Throwable th15) {
                                b17 = AbstractC0132a.b(th15);
                            }
                            o2.b(b17);
                            break;
                    }
                }
            });
        } else {
            c0079n13.i(null);
        }
        C0079n c0079n14 = new C0079n(interfaceC0320f, A0.b.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", concat), a(), b2);
        if (interfaceC0030h != null) {
            final int i15 = 9;
            c0079n14.i(new InterfaceC0316b() { // from class: B0.e
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    List b3;
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    switch (i15) {
                        case 0:
                            InterfaceC0030h interfaceC0030h2 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h2.b(str2, booleanValue, (C0032j) obj4);
                                b3 = i1.a.u(null);
                            } catch (Throwable th) {
                                b3 = AbstractC0132a.b(th);
                            }
                            o2.b(b3);
                            break;
                        case 1:
                            InterfaceC0030h interfaceC0030h3 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Q0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h3.d(str3, list3, (C0032j) obj7);
                                b4 = i1.a.u(null);
                            } catch (Throwable th2) {
                                b4 = AbstractC0132a.b(th2);
                            }
                            o2.b(b4);
                            break;
                        case 2:
                            InterfaceC0030h interfaceC0030h4 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b5 = i1.a.u(interfaceC0030h4.n(str4, (C0032j) obj9));
                            } catch (Throwable th3) {
                                b5 = AbstractC0132a.b(th3);
                            }
                            o2.b(b5);
                            break;
                        case 3:
                            InterfaceC0030h interfaceC0030h5 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = i1.a.u(interfaceC0030h5.p(str5, (C0032j) obj11));
                            } catch (Throwable th4) {
                                b6 = AbstractC0132a.b(th4);
                            }
                            o2.b(b6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0030h interfaceC0030h6 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = i1.a.u(interfaceC0030h6.a(str6, (C0032j) obj13));
                            } catch (Throwable th5) {
                                b7 = AbstractC0132a.b(th5);
                            }
                            o2.b(b7);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0030h interfaceC0030h7 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = i1.a.u(interfaceC0030h7.g(str7, (C0032j) obj15));
                            } catch (Throwable th6) {
                                b8 = AbstractC0132a.b(th6);
                            }
                            o2.b(b8);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0030h interfaceC0030h8 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = i1.a.u(interfaceC0030h8.q(str8, (C0032j) obj17));
                            } catch (Throwable th7) {
                                b9 = AbstractC0132a.b(th7);
                            }
                            o2.b(b9);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0030h interfaceC0030h9 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b10 = i1.a.u(interfaceC0030h9.i(str9, (C0032j) obj19));
                            } catch (Throwable th8) {
                                b10 = AbstractC0132a.b(th8);
                            }
                            o2.b(b10);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0030h interfaceC0030h10 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            Q0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h10.l(list11, (C0032j) obj20);
                                b11 = i1.a.u(null);
                            } catch (Throwable th9) {
                                b11 = AbstractC0132a.b(th9);
                            }
                            o2.b(b11);
                            break;
                        case 9:
                            InterfaceC0030h interfaceC0030h11 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = i1.a.u(interfaceC0030h11.c(list13, (C0032j) obj21));
                            } catch (Throwable th10) {
                                b12 = AbstractC0132a.b(th10);
                            }
                            o2.b(b12);
                            break;
                        case 10:
                            InterfaceC0030h interfaceC0030h12 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            Q0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b13 = i1.a.u(interfaceC0030h12.h(list15, (C0032j) obj22));
                            } catch (Throwable th11) {
                                b13 = AbstractC0132a.b(th11);
                            }
                            o2.b(b13);
                            break;
                        case 11:
                            InterfaceC0030h interfaceC0030h13 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            Q0.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            Q0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h13.f(str10, str11, (C0032j) obj25);
                                b14 = i1.a.u(null);
                            } catch (Throwable th12) {
                                b14 = AbstractC0132a.b(th12);
                            }
                            o2.b(b14);
                            break;
                        case 12:
                            InterfaceC0030h interfaceC0030h14 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            Q0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h14.o(str12, longValue, (C0032j) obj28);
                                b15 = i1.a.u(null);
                            } catch (Throwable th13) {
                                b15 = AbstractC0132a.b(th13);
                            }
                            o2.b(b15);
                            break;
                        case 13:
                            InterfaceC0030h interfaceC0030h15 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            Q0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h15.e(str13, doubleValue, (C0032j) obj31);
                                b16 = i1.a.u(null);
                            } catch (Throwable th14) {
                                b16 = AbstractC0132a.b(th14);
                            }
                            o2.b(b16);
                            break;
                        default:
                            InterfaceC0030h interfaceC0030h16 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Q0.h.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            Q0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h16.m(str14, str15, (C0032j) obj34);
                                b17 = i1.a.u(null);
                            } catch (Throwable th15) {
                                b17 = AbstractC0132a.b(th15);
                            }
                            o2.b(b17);
                            break;
                    }
                }
            });
        } else {
            c0079n14.i(null);
        }
        C0079n c0079n15 = new C0079n(interfaceC0320f, A0.b.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", concat), a(), b2);
        if (interfaceC0030h == null) {
            c0079n15.i(null);
        } else {
            final int i16 = 10;
            c0079n15.i(new InterfaceC0316b() { // from class: B0.e
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    List b3;
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    switch (i16) {
                        case 0:
                            InterfaceC0030h interfaceC0030h2 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            Q0.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h2.b(str2, booleanValue, (C0032j) obj4);
                                b3 = i1.a.u(null);
                            } catch (Throwable th) {
                                b3 = AbstractC0132a.b(th);
                            }
                            o2.b(b3);
                            break;
                        case 1:
                            InterfaceC0030h interfaceC0030h3 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Q0.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Q0.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h3.d(str3, list3, (C0032j) obj7);
                                b4 = i1.a.u(null);
                            } catch (Throwable th2) {
                                b4 = AbstractC0132a.b(th2);
                            }
                            o2.b(b4);
                            break;
                        case 2:
                            InterfaceC0030h interfaceC0030h4 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Q0.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Q0.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b5 = i1.a.u(interfaceC0030h4.n(str4, (C0032j) obj9));
                            } catch (Throwable th3) {
                                b5 = AbstractC0132a.b(th3);
                            }
                            o2.b(b5);
                            break;
                        case 3:
                            InterfaceC0030h interfaceC0030h5 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Q0.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Q0.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = i1.a.u(interfaceC0030h5.p(str5, (C0032j) obj11));
                            } catch (Throwable th4) {
                                b6 = AbstractC0132a.b(th4);
                            }
                            o2.b(b6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0030h interfaceC0030h6 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Q0.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Q0.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = i1.a.u(interfaceC0030h6.a(str6, (C0032j) obj13));
                            } catch (Throwable th5) {
                                b7 = AbstractC0132a.b(th5);
                            }
                            o2.b(b7);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0030h interfaceC0030h7 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Q0.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Q0.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = i1.a.u(interfaceC0030h7.g(str7, (C0032j) obj15));
                            } catch (Throwable th6) {
                                b8 = AbstractC0132a.b(th6);
                            }
                            o2.b(b8);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0030h interfaceC0030h8 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Q0.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Q0.h.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = i1.a.u(interfaceC0030h8.q(str8, (C0032j) obj17));
                            } catch (Throwable th7) {
                                b9 = AbstractC0132a.b(th7);
                            }
                            o2.b(b9);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0030h interfaceC0030h9 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            Q0.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj18;
                            Object obj19 = list9.get(1);
                            Q0.h.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b10 = i1.a.u(interfaceC0030h9.i(str9, (C0032j) obj19));
                            } catch (Throwable th8) {
                                b10 = AbstractC0132a.b(th8);
                            }
                            o2.b(b10);
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0030h interfaceC0030h10 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            Q0.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h10.l(list11, (C0032j) obj20);
                                b11 = i1.a.u(null);
                            } catch (Throwable th9) {
                                b11 = AbstractC0132a.b(th9);
                            }
                            o2.b(b11);
                            break;
                        case 9:
                            InterfaceC0030h interfaceC0030h11 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            Q0.h.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = i1.a.u(interfaceC0030h11.c(list13, (C0032j) obj21));
                            } catch (Throwable th10) {
                                b12 = AbstractC0132a.b(th10);
                            }
                            o2.b(b12);
                            break;
                        case 10:
                            InterfaceC0030h interfaceC0030h12 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            Q0.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b13 = i1.a.u(interfaceC0030h12.h(list15, (C0032j) obj22));
                            } catch (Throwable th11) {
                                b13 = AbstractC0132a.b(th11);
                            }
                            o2.b(b13);
                            break;
                        case 11:
                            InterfaceC0030h interfaceC0030h13 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            Q0.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj23;
                            Object obj24 = list16.get(1);
                            Q0.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list16.get(2);
                            Q0.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h13.f(str10, str11, (C0032j) obj25);
                                b14 = i1.a.u(null);
                            } catch (Throwable th12) {
                                b14 = AbstractC0132a.b(th12);
                            }
                            o2.b(b14);
                            break;
                        case 12:
                            InterfaceC0030h interfaceC0030h14 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Q0.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Q0.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            Q0.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h14.o(str12, longValue, (C0032j) obj28);
                                b15 = i1.a.u(null);
                            } catch (Throwable th13) {
                                b15 = AbstractC0132a.b(th13);
                            }
                            o2.b(b15);
                            break;
                        case 13:
                            InterfaceC0030h interfaceC0030h15 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Q0.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Q0.h.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            Q0.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h15.e(str13, doubleValue, (C0032j) obj31);
                                b16 = i1.a.u(null);
                            } catch (Throwable th14) {
                                b16 = AbstractC0132a.b(th14);
                            }
                            o2.b(b16);
                            break;
                        default:
                            InterfaceC0030h interfaceC0030h16 = interfaceC0030h;
                            Q0.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Q0.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Q0.h.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj33;
                            Object obj34 = list19.get(2);
                            Q0.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0030h16.m(str14, str15, (C0032j) obj34);
                                b17 = i1.a.u(null);
                            } catch (Throwable th15) {
                                b17 = AbstractC0132a.b(th15);
                            }
                            o2.b(b17);
                            break;
                    }
                }
            });
        }
    }
}
