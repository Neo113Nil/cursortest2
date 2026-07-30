package y4;

import android.util.Log;
import c4.C0305k;
import com.appsflyer.attribution.RequestError;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import s4.InterfaceC0893b;

/* renamed from: y4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1038g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C1038g f8589a = new C1038g();

    /* renamed from: b, reason: collision with root package name */
    public static final R5.q f8590b = R5.i.b(new C0305k(2));

    public static s4.m a() {
        return (s4.m) f8590b.getValue();
    }

    public static void b(s4.f binaryMessenger, final InterfaceC1039h interfaceC1039h, String messageChannelSuffix) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        Intrinsics.checkNotNullParameter(messageChannelSuffix, "messageChannelSuffix");
        String concat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
        q1.h b7 = binaryMessenger.b(new s4.l());
        P0.i iVar = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", concat), a(), b7);
        if (interfaceC1039h != null) {
            final int i2 = 6;
            iVar.m(new InterfaceC0893b() { // from class: y4.f
                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e reply) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (i2) {
                        case 0:
                            InterfaceC1039h interfaceC1039h2 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h2.c(str, str2, (C1040i) obj4);
                                d7 = kotlin.collections.q.b(null);
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1039h interfaceC1039h3 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h3.v(str3, list3, (C1040i) obj7);
                                d8 = kotlin.collections.q.b(null);
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1039h interfaceC1039h4 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = kotlin.collections.q.b(interfaceC1039h4.d(str4, (C1040i) obj9));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1039h interfaceC1039h5 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = kotlin.collections.q.b(interfaceC1039h5.e(str5, (C1040i) obj11));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1039h interfaceC1039h6 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = kotlin.collections.q.b(interfaceC1039h6.q(str6, (C1040i) obj13));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1039h interfaceC1039h7 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = kotlin.collections.q.b(interfaceC1039h7.h(str7, (C1040i) obj15));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1039h interfaceC1039h8 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h8.o(str8, booleanValue, (C1040i) obj18);
                                d13 = kotlin.collections.q.b(null);
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1039h interfaceC1039h9 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = kotlin.collections.q.b(interfaceC1039h9.w(str9, (C1040i) obj20));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        case S.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC1039h interfaceC1039h10 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj21;
                            Object obj22 = list10.get(1);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d15 = kotlin.collections.q.b(interfaceC1039h10.f(str10, (C1040i) obj22));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                        case 9:
                            InterfaceC1039h interfaceC1039h11 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h11.k(list12, (C1040i) obj23);
                                d16 = kotlin.collections.q.b(null);
                            } catch (Throwable th10) {
                                d16 = kotlin.collections.r.d(r4.f.g(th10, "exception"), th10.toString(), r4.f.e("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.g(d16);
                            break;
                        case 10:
                            InterfaceC1039h interfaceC1039h12 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = kotlin.collections.q.b(interfaceC1039h12.i(list14, (C1040i) obj24));
                            } catch (Throwable th11) {
                                d17 = kotlin.collections.r.d(r4.f.g(th11, "exception"), th11.toString(), r4.f.e("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.g(d17);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            InterfaceC1039h interfaceC1039h13 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d18 = kotlin.collections.q.b(interfaceC1039h13.s(list16, (C1040i) obj25));
                            } catch (Throwable th12) {
                                d18 = kotlin.collections.r.d(r4.f.g(th12, "exception"), th12.toString(), r4.f.e("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.g(d18);
                            break;
                        case 12:
                            InterfaceC1039h interfaceC1039h14 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj27;
                            Object obj28 = list17.get(2);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h14.t(str11, str12, (C1040i) obj28);
                                d19 = kotlin.collections.q.b(null);
                            } catch (Throwable th13) {
                                d19 = kotlin.collections.r.d(r4.f.g(th13, "exception"), th13.toString(), r4.f.e("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.g(d19);
                            break;
                        case 13:
                            InterfaceC1039h interfaceC1039h15 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h15.j(str13, longValue, (C1040i) obj31);
                                d20 = kotlin.collections.q.b(null);
                            } catch (Throwable th14) {
                                d20 = kotlin.collections.r.d(r4.f.g(th14, "exception"), th14.toString(), r4.f.e("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.g(d20);
                            break;
                        default:
                            InterfaceC1039h interfaceC1039h16 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h16.b(str14, doubleValue, (C1040i) obj34);
                                d21 = kotlin.collections.q.b(null);
                            } catch (Throwable th15) {
                                d21 = kotlin.collections.r.d(r4.f.g(th15, "exception"), th15.toString(), r4.f.e("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.g(d21);
                            break;
                    }
                }
            });
        } else {
            iVar.m(null);
        }
        P0.i iVar2 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", concat), a(), b7);
        if (interfaceC1039h != null) {
            final int i5 = 12;
            iVar2.m(new InterfaceC0893b() { // from class: y4.f
                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e reply) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (i5) {
                        case 0:
                            InterfaceC1039h interfaceC1039h2 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h2.c(str, str2, (C1040i) obj4);
                                d7 = kotlin.collections.q.b(null);
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1039h interfaceC1039h3 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h3.v(str3, list3, (C1040i) obj7);
                                d8 = kotlin.collections.q.b(null);
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1039h interfaceC1039h4 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = kotlin.collections.q.b(interfaceC1039h4.d(str4, (C1040i) obj9));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1039h interfaceC1039h5 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = kotlin.collections.q.b(interfaceC1039h5.e(str5, (C1040i) obj11));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1039h interfaceC1039h6 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = kotlin.collections.q.b(interfaceC1039h6.q(str6, (C1040i) obj13));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1039h interfaceC1039h7 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = kotlin.collections.q.b(interfaceC1039h7.h(str7, (C1040i) obj15));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1039h interfaceC1039h8 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h8.o(str8, booleanValue, (C1040i) obj18);
                                d13 = kotlin.collections.q.b(null);
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1039h interfaceC1039h9 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = kotlin.collections.q.b(interfaceC1039h9.w(str9, (C1040i) obj20));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        case S.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC1039h interfaceC1039h10 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj21;
                            Object obj22 = list10.get(1);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d15 = kotlin.collections.q.b(interfaceC1039h10.f(str10, (C1040i) obj22));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                        case 9:
                            InterfaceC1039h interfaceC1039h11 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h11.k(list12, (C1040i) obj23);
                                d16 = kotlin.collections.q.b(null);
                            } catch (Throwable th10) {
                                d16 = kotlin.collections.r.d(r4.f.g(th10, "exception"), th10.toString(), r4.f.e("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.g(d16);
                            break;
                        case 10:
                            InterfaceC1039h interfaceC1039h12 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = kotlin.collections.q.b(interfaceC1039h12.i(list14, (C1040i) obj24));
                            } catch (Throwable th11) {
                                d17 = kotlin.collections.r.d(r4.f.g(th11, "exception"), th11.toString(), r4.f.e("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.g(d17);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            InterfaceC1039h interfaceC1039h13 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d18 = kotlin.collections.q.b(interfaceC1039h13.s(list16, (C1040i) obj25));
                            } catch (Throwable th12) {
                                d18 = kotlin.collections.r.d(r4.f.g(th12, "exception"), th12.toString(), r4.f.e("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.g(d18);
                            break;
                        case 12:
                            InterfaceC1039h interfaceC1039h14 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj27;
                            Object obj28 = list17.get(2);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h14.t(str11, str12, (C1040i) obj28);
                                d19 = kotlin.collections.q.b(null);
                            } catch (Throwable th13) {
                                d19 = kotlin.collections.r.d(r4.f.g(th13, "exception"), th13.toString(), r4.f.e("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.g(d19);
                            break;
                        case 13:
                            InterfaceC1039h interfaceC1039h15 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h15.j(str13, longValue, (C1040i) obj31);
                                d20 = kotlin.collections.q.b(null);
                            } catch (Throwable th14) {
                                d20 = kotlin.collections.r.d(r4.f.g(th14, "exception"), th14.toString(), r4.f.e("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.g(d20);
                            break;
                        default:
                            InterfaceC1039h interfaceC1039h16 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h16.b(str14, doubleValue, (C1040i) obj34);
                                d21 = kotlin.collections.q.b(null);
                            } catch (Throwable th15) {
                                d21 = kotlin.collections.r.d(r4.f.g(th15, "exception"), th15.toString(), r4.f.e("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.g(d21);
                            break;
                    }
                }
            });
        } else {
            iVar2.m(null);
        }
        P0.i iVar3 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", concat), a(), b7);
        if (interfaceC1039h != null) {
            final int i7 = 13;
            iVar3.m(new InterfaceC0893b() { // from class: y4.f
                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e reply) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (i7) {
                        case 0:
                            InterfaceC1039h interfaceC1039h2 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h2.c(str, str2, (C1040i) obj4);
                                d7 = kotlin.collections.q.b(null);
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1039h interfaceC1039h3 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h3.v(str3, list3, (C1040i) obj7);
                                d8 = kotlin.collections.q.b(null);
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1039h interfaceC1039h4 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = kotlin.collections.q.b(interfaceC1039h4.d(str4, (C1040i) obj9));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1039h interfaceC1039h5 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = kotlin.collections.q.b(interfaceC1039h5.e(str5, (C1040i) obj11));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1039h interfaceC1039h6 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = kotlin.collections.q.b(interfaceC1039h6.q(str6, (C1040i) obj13));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1039h interfaceC1039h7 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = kotlin.collections.q.b(interfaceC1039h7.h(str7, (C1040i) obj15));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1039h interfaceC1039h8 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h8.o(str8, booleanValue, (C1040i) obj18);
                                d13 = kotlin.collections.q.b(null);
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1039h interfaceC1039h9 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = kotlin.collections.q.b(interfaceC1039h9.w(str9, (C1040i) obj20));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        case S.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC1039h interfaceC1039h10 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj21;
                            Object obj22 = list10.get(1);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d15 = kotlin.collections.q.b(interfaceC1039h10.f(str10, (C1040i) obj22));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                        case 9:
                            InterfaceC1039h interfaceC1039h11 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h11.k(list12, (C1040i) obj23);
                                d16 = kotlin.collections.q.b(null);
                            } catch (Throwable th10) {
                                d16 = kotlin.collections.r.d(r4.f.g(th10, "exception"), th10.toString(), r4.f.e("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.g(d16);
                            break;
                        case 10:
                            InterfaceC1039h interfaceC1039h12 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = kotlin.collections.q.b(interfaceC1039h12.i(list14, (C1040i) obj24));
                            } catch (Throwable th11) {
                                d17 = kotlin.collections.r.d(r4.f.g(th11, "exception"), th11.toString(), r4.f.e("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.g(d17);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            InterfaceC1039h interfaceC1039h13 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d18 = kotlin.collections.q.b(interfaceC1039h13.s(list16, (C1040i) obj25));
                            } catch (Throwable th12) {
                                d18 = kotlin.collections.r.d(r4.f.g(th12, "exception"), th12.toString(), r4.f.e("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.g(d18);
                            break;
                        case 12:
                            InterfaceC1039h interfaceC1039h14 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj27;
                            Object obj28 = list17.get(2);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h14.t(str11, str12, (C1040i) obj28);
                                d19 = kotlin.collections.q.b(null);
                            } catch (Throwable th13) {
                                d19 = kotlin.collections.r.d(r4.f.g(th13, "exception"), th13.toString(), r4.f.e("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.g(d19);
                            break;
                        case 13:
                            InterfaceC1039h interfaceC1039h15 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h15.j(str13, longValue, (C1040i) obj31);
                                d20 = kotlin.collections.q.b(null);
                            } catch (Throwable th14) {
                                d20 = kotlin.collections.r.d(r4.f.g(th14, "exception"), th14.toString(), r4.f.e("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.g(d20);
                            break;
                        default:
                            InterfaceC1039h interfaceC1039h16 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h16.b(str14, doubleValue, (C1040i) obj34);
                                d21 = kotlin.collections.q.b(null);
                            } catch (Throwable th15) {
                                d21 = kotlin.collections.r.d(r4.f.g(th15, "exception"), th15.toString(), r4.f.e("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.g(d21);
                            break;
                    }
                }
            });
        } else {
            iVar3.m(null);
        }
        P0.i iVar4 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", concat), a(), b7);
        if (interfaceC1039h != null) {
            final int i8 = 14;
            iVar4.m(new InterfaceC0893b() { // from class: y4.f
                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e reply) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (i8) {
                        case 0:
                            InterfaceC1039h interfaceC1039h2 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h2.c(str, str2, (C1040i) obj4);
                                d7 = kotlin.collections.q.b(null);
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1039h interfaceC1039h3 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h3.v(str3, list3, (C1040i) obj7);
                                d8 = kotlin.collections.q.b(null);
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1039h interfaceC1039h4 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = kotlin.collections.q.b(interfaceC1039h4.d(str4, (C1040i) obj9));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1039h interfaceC1039h5 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = kotlin.collections.q.b(interfaceC1039h5.e(str5, (C1040i) obj11));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1039h interfaceC1039h6 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = kotlin.collections.q.b(interfaceC1039h6.q(str6, (C1040i) obj13));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1039h interfaceC1039h7 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = kotlin.collections.q.b(interfaceC1039h7.h(str7, (C1040i) obj15));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1039h interfaceC1039h8 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h8.o(str8, booleanValue, (C1040i) obj18);
                                d13 = kotlin.collections.q.b(null);
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1039h interfaceC1039h9 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = kotlin.collections.q.b(interfaceC1039h9.w(str9, (C1040i) obj20));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        case S.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC1039h interfaceC1039h10 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj21;
                            Object obj22 = list10.get(1);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d15 = kotlin.collections.q.b(interfaceC1039h10.f(str10, (C1040i) obj22));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                        case 9:
                            InterfaceC1039h interfaceC1039h11 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h11.k(list12, (C1040i) obj23);
                                d16 = kotlin.collections.q.b(null);
                            } catch (Throwable th10) {
                                d16 = kotlin.collections.r.d(r4.f.g(th10, "exception"), th10.toString(), r4.f.e("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.g(d16);
                            break;
                        case 10:
                            InterfaceC1039h interfaceC1039h12 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = kotlin.collections.q.b(interfaceC1039h12.i(list14, (C1040i) obj24));
                            } catch (Throwable th11) {
                                d17 = kotlin.collections.r.d(r4.f.g(th11, "exception"), th11.toString(), r4.f.e("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.g(d17);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            InterfaceC1039h interfaceC1039h13 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d18 = kotlin.collections.q.b(interfaceC1039h13.s(list16, (C1040i) obj25));
                            } catch (Throwable th12) {
                                d18 = kotlin.collections.r.d(r4.f.g(th12, "exception"), th12.toString(), r4.f.e("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.g(d18);
                            break;
                        case 12:
                            InterfaceC1039h interfaceC1039h14 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj27;
                            Object obj28 = list17.get(2);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h14.t(str11, str12, (C1040i) obj28);
                                d19 = kotlin.collections.q.b(null);
                            } catch (Throwable th13) {
                                d19 = kotlin.collections.r.d(r4.f.g(th13, "exception"), th13.toString(), r4.f.e("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.g(d19);
                            break;
                        case 13:
                            InterfaceC1039h interfaceC1039h15 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h15.j(str13, longValue, (C1040i) obj31);
                                d20 = kotlin.collections.q.b(null);
                            } catch (Throwable th14) {
                                d20 = kotlin.collections.r.d(r4.f.g(th14, "exception"), th14.toString(), r4.f.e("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.g(d20);
                            break;
                        default:
                            InterfaceC1039h interfaceC1039h16 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h16.b(str14, doubleValue, (C1040i) obj34);
                                d21 = kotlin.collections.q.b(null);
                            } catch (Throwable th15) {
                                d21 = kotlin.collections.r.d(r4.f.g(th15, "exception"), th15.toString(), r4.f.e("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.g(d21);
                            break;
                    }
                }
            });
        } else {
            iVar4.m(null);
        }
        P0.i iVar5 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", concat), a(), b7);
        if (interfaceC1039h != null) {
            final int i9 = 0;
            iVar5.m(new InterfaceC0893b() { // from class: y4.f
                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e reply) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (i9) {
                        case 0:
                            InterfaceC1039h interfaceC1039h2 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h2.c(str, str2, (C1040i) obj4);
                                d7 = kotlin.collections.q.b(null);
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1039h interfaceC1039h3 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h3.v(str3, list3, (C1040i) obj7);
                                d8 = kotlin.collections.q.b(null);
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1039h interfaceC1039h4 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = kotlin.collections.q.b(interfaceC1039h4.d(str4, (C1040i) obj9));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1039h interfaceC1039h5 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = kotlin.collections.q.b(interfaceC1039h5.e(str5, (C1040i) obj11));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1039h interfaceC1039h6 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = kotlin.collections.q.b(interfaceC1039h6.q(str6, (C1040i) obj13));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1039h interfaceC1039h7 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = kotlin.collections.q.b(interfaceC1039h7.h(str7, (C1040i) obj15));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1039h interfaceC1039h8 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h8.o(str8, booleanValue, (C1040i) obj18);
                                d13 = kotlin.collections.q.b(null);
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1039h interfaceC1039h9 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = kotlin.collections.q.b(interfaceC1039h9.w(str9, (C1040i) obj20));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        case S.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC1039h interfaceC1039h10 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj21;
                            Object obj22 = list10.get(1);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d15 = kotlin.collections.q.b(interfaceC1039h10.f(str10, (C1040i) obj22));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                        case 9:
                            InterfaceC1039h interfaceC1039h11 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h11.k(list12, (C1040i) obj23);
                                d16 = kotlin.collections.q.b(null);
                            } catch (Throwable th10) {
                                d16 = kotlin.collections.r.d(r4.f.g(th10, "exception"), th10.toString(), r4.f.e("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.g(d16);
                            break;
                        case 10:
                            InterfaceC1039h interfaceC1039h12 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = kotlin.collections.q.b(interfaceC1039h12.i(list14, (C1040i) obj24));
                            } catch (Throwable th11) {
                                d17 = kotlin.collections.r.d(r4.f.g(th11, "exception"), th11.toString(), r4.f.e("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.g(d17);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            InterfaceC1039h interfaceC1039h13 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d18 = kotlin.collections.q.b(interfaceC1039h13.s(list16, (C1040i) obj25));
                            } catch (Throwable th12) {
                                d18 = kotlin.collections.r.d(r4.f.g(th12, "exception"), th12.toString(), r4.f.e("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.g(d18);
                            break;
                        case 12:
                            InterfaceC1039h interfaceC1039h14 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj27;
                            Object obj28 = list17.get(2);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h14.t(str11, str12, (C1040i) obj28);
                                d19 = kotlin.collections.q.b(null);
                            } catch (Throwable th13) {
                                d19 = kotlin.collections.r.d(r4.f.g(th13, "exception"), th13.toString(), r4.f.e("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.g(d19);
                            break;
                        case 13:
                            InterfaceC1039h interfaceC1039h15 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h15.j(str13, longValue, (C1040i) obj31);
                                d20 = kotlin.collections.q.b(null);
                            } catch (Throwable th14) {
                                d20 = kotlin.collections.r.d(r4.f.g(th14, "exception"), th14.toString(), r4.f.e("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.g(d20);
                            break;
                        default:
                            InterfaceC1039h interfaceC1039h16 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h16.b(str14, doubleValue, (C1040i) obj34);
                                d21 = kotlin.collections.q.b(null);
                            } catch (Throwable th15) {
                                d21 = kotlin.collections.r.d(r4.f.g(th15, "exception"), th15.toString(), r4.f.e("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.g(d21);
                            break;
                    }
                }
            });
        } else {
            iVar5.m(null);
        }
        P0.i iVar6 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", concat), a(), b7);
        if (interfaceC1039h != null) {
            final int i10 = 1;
            iVar6.m(new InterfaceC0893b() { // from class: y4.f
                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e reply) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (i10) {
                        case 0:
                            InterfaceC1039h interfaceC1039h2 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h2.c(str, str2, (C1040i) obj4);
                                d7 = kotlin.collections.q.b(null);
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1039h interfaceC1039h3 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h3.v(str3, list3, (C1040i) obj7);
                                d8 = kotlin.collections.q.b(null);
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1039h interfaceC1039h4 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = kotlin.collections.q.b(interfaceC1039h4.d(str4, (C1040i) obj9));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1039h interfaceC1039h5 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = kotlin.collections.q.b(interfaceC1039h5.e(str5, (C1040i) obj11));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1039h interfaceC1039h6 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = kotlin.collections.q.b(interfaceC1039h6.q(str6, (C1040i) obj13));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1039h interfaceC1039h7 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = kotlin.collections.q.b(interfaceC1039h7.h(str7, (C1040i) obj15));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1039h interfaceC1039h8 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h8.o(str8, booleanValue, (C1040i) obj18);
                                d13 = kotlin.collections.q.b(null);
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1039h interfaceC1039h9 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = kotlin.collections.q.b(interfaceC1039h9.w(str9, (C1040i) obj20));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        case S.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC1039h interfaceC1039h10 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj21;
                            Object obj22 = list10.get(1);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d15 = kotlin.collections.q.b(interfaceC1039h10.f(str10, (C1040i) obj22));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                        case 9:
                            InterfaceC1039h interfaceC1039h11 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h11.k(list12, (C1040i) obj23);
                                d16 = kotlin.collections.q.b(null);
                            } catch (Throwable th10) {
                                d16 = kotlin.collections.r.d(r4.f.g(th10, "exception"), th10.toString(), r4.f.e("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.g(d16);
                            break;
                        case 10:
                            InterfaceC1039h interfaceC1039h12 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = kotlin.collections.q.b(interfaceC1039h12.i(list14, (C1040i) obj24));
                            } catch (Throwable th11) {
                                d17 = kotlin.collections.r.d(r4.f.g(th11, "exception"), th11.toString(), r4.f.e("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.g(d17);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            InterfaceC1039h interfaceC1039h13 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d18 = kotlin.collections.q.b(interfaceC1039h13.s(list16, (C1040i) obj25));
                            } catch (Throwable th12) {
                                d18 = kotlin.collections.r.d(r4.f.g(th12, "exception"), th12.toString(), r4.f.e("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.g(d18);
                            break;
                        case 12:
                            InterfaceC1039h interfaceC1039h14 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj27;
                            Object obj28 = list17.get(2);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h14.t(str11, str12, (C1040i) obj28);
                                d19 = kotlin.collections.q.b(null);
                            } catch (Throwable th13) {
                                d19 = kotlin.collections.r.d(r4.f.g(th13, "exception"), th13.toString(), r4.f.e("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.g(d19);
                            break;
                        case 13:
                            InterfaceC1039h interfaceC1039h15 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h15.j(str13, longValue, (C1040i) obj31);
                                d20 = kotlin.collections.q.b(null);
                            } catch (Throwable th14) {
                                d20 = kotlin.collections.r.d(r4.f.g(th14, "exception"), th14.toString(), r4.f.e("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.g(d20);
                            break;
                        default:
                            InterfaceC1039h interfaceC1039h16 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h16.b(str14, doubleValue, (C1040i) obj34);
                                d21 = kotlin.collections.q.b(null);
                            } catch (Throwable th15) {
                                d21 = kotlin.collections.r.d(r4.f.g(th15, "exception"), th15.toString(), r4.f.e("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.g(d21);
                            break;
                    }
                }
            });
        } else {
            iVar6.m(null);
        }
        P0.i iVar7 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", concat), a(), b7);
        if (interfaceC1039h != null) {
            final int i11 = 2;
            iVar7.m(new InterfaceC0893b() { // from class: y4.f
                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e reply) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (i11) {
                        case 0:
                            InterfaceC1039h interfaceC1039h2 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h2.c(str, str2, (C1040i) obj4);
                                d7 = kotlin.collections.q.b(null);
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1039h interfaceC1039h3 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h3.v(str3, list3, (C1040i) obj7);
                                d8 = kotlin.collections.q.b(null);
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1039h interfaceC1039h4 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = kotlin.collections.q.b(interfaceC1039h4.d(str4, (C1040i) obj9));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1039h interfaceC1039h5 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = kotlin.collections.q.b(interfaceC1039h5.e(str5, (C1040i) obj11));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1039h interfaceC1039h6 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = kotlin.collections.q.b(interfaceC1039h6.q(str6, (C1040i) obj13));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1039h interfaceC1039h7 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = kotlin.collections.q.b(interfaceC1039h7.h(str7, (C1040i) obj15));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1039h interfaceC1039h8 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h8.o(str8, booleanValue, (C1040i) obj18);
                                d13 = kotlin.collections.q.b(null);
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1039h interfaceC1039h9 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = kotlin.collections.q.b(interfaceC1039h9.w(str9, (C1040i) obj20));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        case S.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC1039h interfaceC1039h10 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj21;
                            Object obj22 = list10.get(1);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d15 = kotlin.collections.q.b(interfaceC1039h10.f(str10, (C1040i) obj22));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                        case 9:
                            InterfaceC1039h interfaceC1039h11 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h11.k(list12, (C1040i) obj23);
                                d16 = kotlin.collections.q.b(null);
                            } catch (Throwable th10) {
                                d16 = kotlin.collections.r.d(r4.f.g(th10, "exception"), th10.toString(), r4.f.e("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.g(d16);
                            break;
                        case 10:
                            InterfaceC1039h interfaceC1039h12 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = kotlin.collections.q.b(interfaceC1039h12.i(list14, (C1040i) obj24));
                            } catch (Throwable th11) {
                                d17 = kotlin.collections.r.d(r4.f.g(th11, "exception"), th11.toString(), r4.f.e("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.g(d17);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            InterfaceC1039h interfaceC1039h13 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d18 = kotlin.collections.q.b(interfaceC1039h13.s(list16, (C1040i) obj25));
                            } catch (Throwable th12) {
                                d18 = kotlin.collections.r.d(r4.f.g(th12, "exception"), th12.toString(), r4.f.e("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.g(d18);
                            break;
                        case 12:
                            InterfaceC1039h interfaceC1039h14 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj27;
                            Object obj28 = list17.get(2);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h14.t(str11, str12, (C1040i) obj28);
                                d19 = kotlin.collections.q.b(null);
                            } catch (Throwable th13) {
                                d19 = kotlin.collections.r.d(r4.f.g(th13, "exception"), th13.toString(), r4.f.e("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.g(d19);
                            break;
                        case 13:
                            InterfaceC1039h interfaceC1039h15 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h15.j(str13, longValue, (C1040i) obj31);
                                d20 = kotlin.collections.q.b(null);
                            } catch (Throwable th14) {
                                d20 = kotlin.collections.r.d(r4.f.g(th14, "exception"), th14.toString(), r4.f.e("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.g(d20);
                            break;
                        default:
                            InterfaceC1039h interfaceC1039h16 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h16.b(str14, doubleValue, (C1040i) obj34);
                                d21 = kotlin.collections.q.b(null);
                            } catch (Throwable th15) {
                                d21 = kotlin.collections.r.d(r4.f.g(th15, "exception"), th15.toString(), r4.f.e("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.g(d21);
                            break;
                    }
                }
            });
        } else {
            iVar7.m(null);
        }
        P0.i iVar8 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", concat), a(), b7);
        if (interfaceC1039h != null) {
            final int i12 = 3;
            iVar8.m(new InterfaceC0893b() { // from class: y4.f
                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e reply) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (i12) {
                        case 0:
                            InterfaceC1039h interfaceC1039h2 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h2.c(str, str2, (C1040i) obj4);
                                d7 = kotlin.collections.q.b(null);
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1039h interfaceC1039h3 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h3.v(str3, list3, (C1040i) obj7);
                                d8 = kotlin.collections.q.b(null);
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1039h interfaceC1039h4 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = kotlin.collections.q.b(interfaceC1039h4.d(str4, (C1040i) obj9));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1039h interfaceC1039h5 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = kotlin.collections.q.b(interfaceC1039h5.e(str5, (C1040i) obj11));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1039h interfaceC1039h6 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = kotlin.collections.q.b(interfaceC1039h6.q(str6, (C1040i) obj13));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1039h interfaceC1039h7 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = kotlin.collections.q.b(interfaceC1039h7.h(str7, (C1040i) obj15));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1039h interfaceC1039h8 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h8.o(str8, booleanValue, (C1040i) obj18);
                                d13 = kotlin.collections.q.b(null);
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1039h interfaceC1039h9 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = kotlin.collections.q.b(interfaceC1039h9.w(str9, (C1040i) obj20));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        case S.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC1039h interfaceC1039h10 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj21;
                            Object obj22 = list10.get(1);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d15 = kotlin.collections.q.b(interfaceC1039h10.f(str10, (C1040i) obj22));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                        case 9:
                            InterfaceC1039h interfaceC1039h11 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h11.k(list12, (C1040i) obj23);
                                d16 = kotlin.collections.q.b(null);
                            } catch (Throwable th10) {
                                d16 = kotlin.collections.r.d(r4.f.g(th10, "exception"), th10.toString(), r4.f.e("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.g(d16);
                            break;
                        case 10:
                            InterfaceC1039h interfaceC1039h12 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = kotlin.collections.q.b(interfaceC1039h12.i(list14, (C1040i) obj24));
                            } catch (Throwable th11) {
                                d17 = kotlin.collections.r.d(r4.f.g(th11, "exception"), th11.toString(), r4.f.e("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.g(d17);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            InterfaceC1039h interfaceC1039h13 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d18 = kotlin.collections.q.b(interfaceC1039h13.s(list16, (C1040i) obj25));
                            } catch (Throwable th12) {
                                d18 = kotlin.collections.r.d(r4.f.g(th12, "exception"), th12.toString(), r4.f.e("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.g(d18);
                            break;
                        case 12:
                            InterfaceC1039h interfaceC1039h14 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj27;
                            Object obj28 = list17.get(2);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h14.t(str11, str12, (C1040i) obj28);
                                d19 = kotlin.collections.q.b(null);
                            } catch (Throwable th13) {
                                d19 = kotlin.collections.r.d(r4.f.g(th13, "exception"), th13.toString(), r4.f.e("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.g(d19);
                            break;
                        case 13:
                            InterfaceC1039h interfaceC1039h15 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h15.j(str13, longValue, (C1040i) obj31);
                                d20 = kotlin.collections.q.b(null);
                            } catch (Throwable th14) {
                                d20 = kotlin.collections.r.d(r4.f.g(th14, "exception"), th14.toString(), r4.f.e("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.g(d20);
                            break;
                        default:
                            InterfaceC1039h interfaceC1039h16 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h16.b(str14, doubleValue, (C1040i) obj34);
                                d21 = kotlin.collections.q.b(null);
                            } catch (Throwable th15) {
                                d21 = kotlin.collections.r.d(r4.f.g(th15, "exception"), th15.toString(), r4.f.e("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.g(d21);
                            break;
                    }
                }
            });
        } else {
            iVar8.m(null);
        }
        P0.i iVar9 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", concat), a(), b7);
        if (interfaceC1039h != null) {
            final int i13 = 4;
            iVar9.m(new InterfaceC0893b() { // from class: y4.f
                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e reply) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (i13) {
                        case 0:
                            InterfaceC1039h interfaceC1039h2 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h2.c(str, str2, (C1040i) obj4);
                                d7 = kotlin.collections.q.b(null);
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1039h interfaceC1039h3 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h3.v(str3, list3, (C1040i) obj7);
                                d8 = kotlin.collections.q.b(null);
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1039h interfaceC1039h4 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = kotlin.collections.q.b(interfaceC1039h4.d(str4, (C1040i) obj9));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1039h interfaceC1039h5 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = kotlin.collections.q.b(interfaceC1039h5.e(str5, (C1040i) obj11));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1039h interfaceC1039h6 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = kotlin.collections.q.b(interfaceC1039h6.q(str6, (C1040i) obj13));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1039h interfaceC1039h7 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = kotlin.collections.q.b(interfaceC1039h7.h(str7, (C1040i) obj15));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1039h interfaceC1039h8 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h8.o(str8, booleanValue, (C1040i) obj18);
                                d13 = kotlin.collections.q.b(null);
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1039h interfaceC1039h9 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = kotlin.collections.q.b(interfaceC1039h9.w(str9, (C1040i) obj20));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        case S.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC1039h interfaceC1039h10 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj21;
                            Object obj22 = list10.get(1);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d15 = kotlin.collections.q.b(interfaceC1039h10.f(str10, (C1040i) obj22));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                        case 9:
                            InterfaceC1039h interfaceC1039h11 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h11.k(list12, (C1040i) obj23);
                                d16 = kotlin.collections.q.b(null);
                            } catch (Throwable th10) {
                                d16 = kotlin.collections.r.d(r4.f.g(th10, "exception"), th10.toString(), r4.f.e("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.g(d16);
                            break;
                        case 10:
                            InterfaceC1039h interfaceC1039h12 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = kotlin.collections.q.b(interfaceC1039h12.i(list14, (C1040i) obj24));
                            } catch (Throwable th11) {
                                d17 = kotlin.collections.r.d(r4.f.g(th11, "exception"), th11.toString(), r4.f.e("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.g(d17);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            InterfaceC1039h interfaceC1039h13 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d18 = kotlin.collections.q.b(interfaceC1039h13.s(list16, (C1040i) obj25));
                            } catch (Throwable th12) {
                                d18 = kotlin.collections.r.d(r4.f.g(th12, "exception"), th12.toString(), r4.f.e("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.g(d18);
                            break;
                        case 12:
                            InterfaceC1039h interfaceC1039h14 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj27;
                            Object obj28 = list17.get(2);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h14.t(str11, str12, (C1040i) obj28);
                                d19 = kotlin.collections.q.b(null);
                            } catch (Throwable th13) {
                                d19 = kotlin.collections.r.d(r4.f.g(th13, "exception"), th13.toString(), r4.f.e("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.g(d19);
                            break;
                        case 13:
                            InterfaceC1039h interfaceC1039h15 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h15.j(str13, longValue, (C1040i) obj31);
                                d20 = kotlin.collections.q.b(null);
                            } catch (Throwable th14) {
                                d20 = kotlin.collections.r.d(r4.f.g(th14, "exception"), th14.toString(), r4.f.e("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.g(d20);
                            break;
                        default:
                            InterfaceC1039h interfaceC1039h16 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h16.b(str14, doubleValue, (C1040i) obj34);
                                d21 = kotlin.collections.q.b(null);
                            } catch (Throwable th15) {
                                d21 = kotlin.collections.r.d(r4.f.g(th15, "exception"), th15.toString(), r4.f.e("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.g(d21);
                            break;
                    }
                }
            });
        } else {
            iVar9.m(null);
        }
        P0.i iVar10 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", concat), a(), b7);
        if (interfaceC1039h != null) {
            final int i14 = 5;
            iVar10.m(new InterfaceC0893b() { // from class: y4.f
                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e reply) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (i14) {
                        case 0:
                            InterfaceC1039h interfaceC1039h2 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h2.c(str, str2, (C1040i) obj4);
                                d7 = kotlin.collections.q.b(null);
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1039h interfaceC1039h3 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h3.v(str3, list3, (C1040i) obj7);
                                d8 = kotlin.collections.q.b(null);
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1039h interfaceC1039h4 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = kotlin.collections.q.b(interfaceC1039h4.d(str4, (C1040i) obj9));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1039h interfaceC1039h5 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = kotlin.collections.q.b(interfaceC1039h5.e(str5, (C1040i) obj11));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1039h interfaceC1039h6 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = kotlin.collections.q.b(interfaceC1039h6.q(str6, (C1040i) obj13));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1039h interfaceC1039h7 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = kotlin.collections.q.b(interfaceC1039h7.h(str7, (C1040i) obj15));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1039h interfaceC1039h8 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h8.o(str8, booleanValue, (C1040i) obj18);
                                d13 = kotlin.collections.q.b(null);
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1039h interfaceC1039h9 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = kotlin.collections.q.b(interfaceC1039h9.w(str9, (C1040i) obj20));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        case S.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC1039h interfaceC1039h10 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj21;
                            Object obj22 = list10.get(1);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d15 = kotlin.collections.q.b(interfaceC1039h10.f(str10, (C1040i) obj22));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                        case 9:
                            InterfaceC1039h interfaceC1039h11 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h11.k(list12, (C1040i) obj23);
                                d16 = kotlin.collections.q.b(null);
                            } catch (Throwable th10) {
                                d16 = kotlin.collections.r.d(r4.f.g(th10, "exception"), th10.toString(), r4.f.e("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.g(d16);
                            break;
                        case 10:
                            InterfaceC1039h interfaceC1039h12 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = kotlin.collections.q.b(interfaceC1039h12.i(list14, (C1040i) obj24));
                            } catch (Throwable th11) {
                                d17 = kotlin.collections.r.d(r4.f.g(th11, "exception"), th11.toString(), r4.f.e("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.g(d17);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            InterfaceC1039h interfaceC1039h13 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d18 = kotlin.collections.q.b(interfaceC1039h13.s(list16, (C1040i) obj25));
                            } catch (Throwable th12) {
                                d18 = kotlin.collections.r.d(r4.f.g(th12, "exception"), th12.toString(), r4.f.e("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.g(d18);
                            break;
                        case 12:
                            InterfaceC1039h interfaceC1039h14 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj27;
                            Object obj28 = list17.get(2);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h14.t(str11, str12, (C1040i) obj28);
                                d19 = kotlin.collections.q.b(null);
                            } catch (Throwable th13) {
                                d19 = kotlin.collections.r.d(r4.f.g(th13, "exception"), th13.toString(), r4.f.e("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.g(d19);
                            break;
                        case 13:
                            InterfaceC1039h interfaceC1039h15 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h15.j(str13, longValue, (C1040i) obj31);
                                d20 = kotlin.collections.q.b(null);
                            } catch (Throwable th14) {
                                d20 = kotlin.collections.r.d(r4.f.g(th14, "exception"), th14.toString(), r4.f.e("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.g(d20);
                            break;
                        default:
                            InterfaceC1039h interfaceC1039h16 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h16.b(str14, doubleValue, (C1040i) obj34);
                                d21 = kotlin.collections.q.b(null);
                            } catch (Throwable th15) {
                                d21 = kotlin.collections.r.d(r4.f.g(th15, "exception"), th15.toString(), r4.f.e("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.g(d21);
                            break;
                    }
                }
            });
        } else {
            iVar10.m(null);
        }
        P0.i iVar11 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", concat), a(), b7);
        if (interfaceC1039h != null) {
            final int i15 = 7;
            iVar11.m(new InterfaceC0893b() { // from class: y4.f
                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e reply) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (i15) {
                        case 0:
                            InterfaceC1039h interfaceC1039h2 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h2.c(str, str2, (C1040i) obj4);
                                d7 = kotlin.collections.q.b(null);
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1039h interfaceC1039h3 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h3.v(str3, list3, (C1040i) obj7);
                                d8 = kotlin.collections.q.b(null);
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1039h interfaceC1039h4 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = kotlin.collections.q.b(interfaceC1039h4.d(str4, (C1040i) obj9));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1039h interfaceC1039h5 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = kotlin.collections.q.b(interfaceC1039h5.e(str5, (C1040i) obj11));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1039h interfaceC1039h6 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = kotlin.collections.q.b(interfaceC1039h6.q(str6, (C1040i) obj13));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1039h interfaceC1039h7 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = kotlin.collections.q.b(interfaceC1039h7.h(str7, (C1040i) obj15));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1039h interfaceC1039h8 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h8.o(str8, booleanValue, (C1040i) obj18);
                                d13 = kotlin.collections.q.b(null);
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1039h interfaceC1039h9 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = kotlin.collections.q.b(interfaceC1039h9.w(str9, (C1040i) obj20));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        case S.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC1039h interfaceC1039h10 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj21;
                            Object obj22 = list10.get(1);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d15 = kotlin.collections.q.b(interfaceC1039h10.f(str10, (C1040i) obj22));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                        case 9:
                            InterfaceC1039h interfaceC1039h11 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h11.k(list12, (C1040i) obj23);
                                d16 = kotlin.collections.q.b(null);
                            } catch (Throwable th10) {
                                d16 = kotlin.collections.r.d(r4.f.g(th10, "exception"), th10.toString(), r4.f.e("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.g(d16);
                            break;
                        case 10:
                            InterfaceC1039h interfaceC1039h12 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = kotlin.collections.q.b(interfaceC1039h12.i(list14, (C1040i) obj24));
                            } catch (Throwable th11) {
                                d17 = kotlin.collections.r.d(r4.f.g(th11, "exception"), th11.toString(), r4.f.e("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.g(d17);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            InterfaceC1039h interfaceC1039h13 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d18 = kotlin.collections.q.b(interfaceC1039h13.s(list16, (C1040i) obj25));
                            } catch (Throwable th12) {
                                d18 = kotlin.collections.r.d(r4.f.g(th12, "exception"), th12.toString(), r4.f.e("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.g(d18);
                            break;
                        case 12:
                            InterfaceC1039h interfaceC1039h14 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj27;
                            Object obj28 = list17.get(2);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h14.t(str11, str12, (C1040i) obj28);
                                d19 = kotlin.collections.q.b(null);
                            } catch (Throwable th13) {
                                d19 = kotlin.collections.r.d(r4.f.g(th13, "exception"), th13.toString(), r4.f.e("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.g(d19);
                            break;
                        case 13:
                            InterfaceC1039h interfaceC1039h15 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h15.j(str13, longValue, (C1040i) obj31);
                                d20 = kotlin.collections.q.b(null);
                            } catch (Throwable th14) {
                                d20 = kotlin.collections.r.d(r4.f.g(th14, "exception"), th14.toString(), r4.f.e("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.g(d20);
                            break;
                        default:
                            InterfaceC1039h interfaceC1039h16 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h16.b(str14, doubleValue, (C1040i) obj34);
                                d21 = kotlin.collections.q.b(null);
                            } catch (Throwable th15) {
                                d21 = kotlin.collections.r.d(r4.f.g(th15, "exception"), th15.toString(), r4.f.e("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.g(d21);
                            break;
                    }
                }
            });
        } else {
            iVar11.m(null);
        }
        P0.i iVar12 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", concat), a(), b7);
        if (interfaceC1039h != null) {
            final int i16 = 8;
            iVar12.m(new InterfaceC0893b() { // from class: y4.f
                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e reply) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (i16) {
                        case 0:
                            InterfaceC1039h interfaceC1039h2 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h2.c(str, str2, (C1040i) obj4);
                                d7 = kotlin.collections.q.b(null);
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1039h interfaceC1039h3 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h3.v(str3, list3, (C1040i) obj7);
                                d8 = kotlin.collections.q.b(null);
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1039h interfaceC1039h4 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = kotlin.collections.q.b(interfaceC1039h4.d(str4, (C1040i) obj9));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1039h interfaceC1039h5 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = kotlin.collections.q.b(interfaceC1039h5.e(str5, (C1040i) obj11));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1039h interfaceC1039h6 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = kotlin.collections.q.b(interfaceC1039h6.q(str6, (C1040i) obj13));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1039h interfaceC1039h7 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = kotlin.collections.q.b(interfaceC1039h7.h(str7, (C1040i) obj15));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1039h interfaceC1039h8 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h8.o(str8, booleanValue, (C1040i) obj18);
                                d13 = kotlin.collections.q.b(null);
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1039h interfaceC1039h9 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = kotlin.collections.q.b(interfaceC1039h9.w(str9, (C1040i) obj20));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        case S.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC1039h interfaceC1039h10 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj21;
                            Object obj22 = list10.get(1);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d15 = kotlin.collections.q.b(interfaceC1039h10.f(str10, (C1040i) obj22));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                        case 9:
                            InterfaceC1039h interfaceC1039h11 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h11.k(list12, (C1040i) obj23);
                                d16 = kotlin.collections.q.b(null);
                            } catch (Throwable th10) {
                                d16 = kotlin.collections.r.d(r4.f.g(th10, "exception"), th10.toString(), r4.f.e("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.g(d16);
                            break;
                        case 10:
                            InterfaceC1039h interfaceC1039h12 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = kotlin.collections.q.b(interfaceC1039h12.i(list14, (C1040i) obj24));
                            } catch (Throwable th11) {
                                d17 = kotlin.collections.r.d(r4.f.g(th11, "exception"), th11.toString(), r4.f.e("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.g(d17);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            InterfaceC1039h interfaceC1039h13 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d18 = kotlin.collections.q.b(interfaceC1039h13.s(list16, (C1040i) obj25));
                            } catch (Throwable th12) {
                                d18 = kotlin.collections.r.d(r4.f.g(th12, "exception"), th12.toString(), r4.f.e("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.g(d18);
                            break;
                        case 12:
                            InterfaceC1039h interfaceC1039h14 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj27;
                            Object obj28 = list17.get(2);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h14.t(str11, str12, (C1040i) obj28);
                                d19 = kotlin.collections.q.b(null);
                            } catch (Throwable th13) {
                                d19 = kotlin.collections.r.d(r4.f.g(th13, "exception"), th13.toString(), r4.f.e("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.g(d19);
                            break;
                        case 13:
                            InterfaceC1039h interfaceC1039h15 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h15.j(str13, longValue, (C1040i) obj31);
                                d20 = kotlin.collections.q.b(null);
                            } catch (Throwable th14) {
                                d20 = kotlin.collections.r.d(r4.f.g(th14, "exception"), th14.toString(), r4.f.e("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.g(d20);
                            break;
                        default:
                            InterfaceC1039h interfaceC1039h16 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h16.b(str14, doubleValue, (C1040i) obj34);
                                d21 = kotlin.collections.q.b(null);
                            } catch (Throwable th15) {
                                d21 = kotlin.collections.r.d(r4.f.g(th15, "exception"), th15.toString(), r4.f.e("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.g(d21);
                            break;
                    }
                }
            });
        } else {
            iVar12.m(null);
        }
        P0.i iVar13 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", concat), a(), b7);
        if (interfaceC1039h != null) {
            final int i17 = 9;
            iVar13.m(new InterfaceC0893b() { // from class: y4.f
                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e reply) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (i17) {
                        case 0:
                            InterfaceC1039h interfaceC1039h2 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h2.c(str, str2, (C1040i) obj4);
                                d7 = kotlin.collections.q.b(null);
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1039h interfaceC1039h3 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h3.v(str3, list3, (C1040i) obj7);
                                d8 = kotlin.collections.q.b(null);
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1039h interfaceC1039h4 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = kotlin.collections.q.b(interfaceC1039h4.d(str4, (C1040i) obj9));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1039h interfaceC1039h5 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = kotlin.collections.q.b(interfaceC1039h5.e(str5, (C1040i) obj11));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1039h interfaceC1039h6 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = kotlin.collections.q.b(interfaceC1039h6.q(str6, (C1040i) obj13));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1039h interfaceC1039h7 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = kotlin.collections.q.b(interfaceC1039h7.h(str7, (C1040i) obj15));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1039h interfaceC1039h8 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h8.o(str8, booleanValue, (C1040i) obj18);
                                d13 = kotlin.collections.q.b(null);
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1039h interfaceC1039h9 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = kotlin.collections.q.b(interfaceC1039h9.w(str9, (C1040i) obj20));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        case S.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC1039h interfaceC1039h10 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj21;
                            Object obj22 = list10.get(1);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d15 = kotlin.collections.q.b(interfaceC1039h10.f(str10, (C1040i) obj22));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                        case 9:
                            InterfaceC1039h interfaceC1039h11 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h11.k(list12, (C1040i) obj23);
                                d16 = kotlin.collections.q.b(null);
                            } catch (Throwable th10) {
                                d16 = kotlin.collections.r.d(r4.f.g(th10, "exception"), th10.toString(), r4.f.e("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.g(d16);
                            break;
                        case 10:
                            InterfaceC1039h interfaceC1039h12 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = kotlin.collections.q.b(interfaceC1039h12.i(list14, (C1040i) obj24));
                            } catch (Throwable th11) {
                                d17 = kotlin.collections.r.d(r4.f.g(th11, "exception"), th11.toString(), r4.f.e("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.g(d17);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            InterfaceC1039h interfaceC1039h13 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d18 = kotlin.collections.q.b(interfaceC1039h13.s(list16, (C1040i) obj25));
                            } catch (Throwable th12) {
                                d18 = kotlin.collections.r.d(r4.f.g(th12, "exception"), th12.toString(), r4.f.e("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.g(d18);
                            break;
                        case 12:
                            InterfaceC1039h interfaceC1039h14 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj27;
                            Object obj28 = list17.get(2);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h14.t(str11, str12, (C1040i) obj28);
                                d19 = kotlin.collections.q.b(null);
                            } catch (Throwable th13) {
                                d19 = kotlin.collections.r.d(r4.f.g(th13, "exception"), th13.toString(), r4.f.e("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.g(d19);
                            break;
                        case 13:
                            InterfaceC1039h interfaceC1039h15 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h15.j(str13, longValue, (C1040i) obj31);
                                d20 = kotlin.collections.q.b(null);
                            } catch (Throwable th14) {
                                d20 = kotlin.collections.r.d(r4.f.g(th14, "exception"), th14.toString(), r4.f.e("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.g(d20);
                            break;
                        default:
                            InterfaceC1039h interfaceC1039h16 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h16.b(str14, doubleValue, (C1040i) obj34);
                                d21 = kotlin.collections.q.b(null);
                            } catch (Throwable th15) {
                                d21 = kotlin.collections.r.d(r4.f.g(th15, "exception"), th15.toString(), r4.f.e("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.g(d21);
                            break;
                    }
                }
            });
        } else {
            iVar13.m(null);
        }
        P0.i iVar14 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", concat), a(), b7);
        if (interfaceC1039h != null) {
            final int i18 = 10;
            iVar14.m(new InterfaceC0893b() { // from class: y4.f
                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e reply) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (i18) {
                        case 0:
                            InterfaceC1039h interfaceC1039h2 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h2.c(str, str2, (C1040i) obj4);
                                d7 = kotlin.collections.q.b(null);
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1039h interfaceC1039h3 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h3.v(str3, list3, (C1040i) obj7);
                                d8 = kotlin.collections.q.b(null);
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1039h interfaceC1039h4 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = kotlin.collections.q.b(interfaceC1039h4.d(str4, (C1040i) obj9));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1039h interfaceC1039h5 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = kotlin.collections.q.b(interfaceC1039h5.e(str5, (C1040i) obj11));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1039h interfaceC1039h6 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = kotlin.collections.q.b(interfaceC1039h6.q(str6, (C1040i) obj13));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1039h interfaceC1039h7 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = kotlin.collections.q.b(interfaceC1039h7.h(str7, (C1040i) obj15));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1039h interfaceC1039h8 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h8.o(str8, booleanValue, (C1040i) obj18);
                                d13 = kotlin.collections.q.b(null);
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1039h interfaceC1039h9 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = kotlin.collections.q.b(interfaceC1039h9.w(str9, (C1040i) obj20));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        case S.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC1039h interfaceC1039h10 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj21;
                            Object obj22 = list10.get(1);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d15 = kotlin.collections.q.b(interfaceC1039h10.f(str10, (C1040i) obj22));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                        case 9:
                            InterfaceC1039h interfaceC1039h11 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h11.k(list12, (C1040i) obj23);
                                d16 = kotlin.collections.q.b(null);
                            } catch (Throwable th10) {
                                d16 = kotlin.collections.r.d(r4.f.g(th10, "exception"), th10.toString(), r4.f.e("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.g(d16);
                            break;
                        case 10:
                            InterfaceC1039h interfaceC1039h12 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = kotlin.collections.q.b(interfaceC1039h12.i(list14, (C1040i) obj24));
                            } catch (Throwable th11) {
                                d17 = kotlin.collections.r.d(r4.f.g(th11, "exception"), th11.toString(), r4.f.e("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.g(d17);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            InterfaceC1039h interfaceC1039h13 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d18 = kotlin.collections.q.b(interfaceC1039h13.s(list16, (C1040i) obj25));
                            } catch (Throwable th12) {
                                d18 = kotlin.collections.r.d(r4.f.g(th12, "exception"), th12.toString(), r4.f.e("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.g(d18);
                            break;
                        case 12:
                            InterfaceC1039h interfaceC1039h14 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj27;
                            Object obj28 = list17.get(2);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h14.t(str11, str12, (C1040i) obj28);
                                d19 = kotlin.collections.q.b(null);
                            } catch (Throwable th13) {
                                d19 = kotlin.collections.r.d(r4.f.g(th13, "exception"), th13.toString(), r4.f.e("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.g(d19);
                            break;
                        case 13:
                            InterfaceC1039h interfaceC1039h15 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h15.j(str13, longValue, (C1040i) obj31);
                                d20 = kotlin.collections.q.b(null);
                            } catch (Throwable th14) {
                                d20 = kotlin.collections.r.d(r4.f.g(th14, "exception"), th14.toString(), r4.f.e("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.g(d20);
                            break;
                        default:
                            InterfaceC1039h interfaceC1039h16 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h16.b(str14, doubleValue, (C1040i) obj34);
                                d21 = kotlin.collections.q.b(null);
                            } catch (Throwable th15) {
                                d21 = kotlin.collections.r.d(r4.f.g(th15, "exception"), th15.toString(), r4.f.e("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.g(d21);
                            break;
                    }
                }
            });
        } else {
            iVar14.m(null);
        }
        P0.i iVar15 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", concat), a(), b7);
        if (interfaceC1039h == null) {
            iVar15.m(null);
        } else {
            final int i19 = 11;
            iVar15.m(new InterfaceC0893b() { // from class: y4.f
                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e reply) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (i19) {
                        case 0:
                            InterfaceC1039h interfaceC1039h2 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h2.c(str, str2, (C1040i) obj4);
                                d7 = kotlin.collections.q.b(null);
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1039h interfaceC1039h3 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h3.v(str3, list3, (C1040i) obj7);
                                d8 = kotlin.collections.q.b(null);
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1039h interfaceC1039h4 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = kotlin.collections.q.b(interfaceC1039h4.d(str4, (C1040i) obj9));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1039h interfaceC1039h5 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = kotlin.collections.q.b(interfaceC1039h5.e(str5, (C1040i) obj11));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1039h interfaceC1039h6 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = kotlin.collections.q.b(interfaceC1039h6.q(str6, (C1040i) obj13));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1039h interfaceC1039h7 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = kotlin.collections.q.b(interfaceC1039h7.h(str7, (C1040i) obj15));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1039h interfaceC1039h8 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h8.o(str8, booleanValue, (C1040i) obj18);
                                d13 = kotlin.collections.q.b(null);
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1039h interfaceC1039h9 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = kotlin.collections.q.b(interfaceC1039h9.w(str9, (C1040i) obj20));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        case S.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC1039h interfaceC1039h10 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj21;
                            Object obj22 = list10.get(1);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d15 = kotlin.collections.q.b(interfaceC1039h10.f(str10, (C1040i) obj22));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                        case 9:
                            InterfaceC1039h interfaceC1039h11 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h11.k(list12, (C1040i) obj23);
                                d16 = kotlin.collections.q.b(null);
                            } catch (Throwable th10) {
                                d16 = kotlin.collections.r.d(r4.f.g(th10, "exception"), th10.toString(), r4.f.e("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.g(d16);
                            break;
                        case 10:
                            InterfaceC1039h interfaceC1039h12 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = kotlin.collections.q.b(interfaceC1039h12.i(list14, (C1040i) obj24));
                            } catch (Throwable th11) {
                                d17 = kotlin.collections.r.d(r4.f.g(th11, "exception"), th11.toString(), r4.f.e("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.g(d17);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            InterfaceC1039h interfaceC1039h13 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d18 = kotlin.collections.q.b(interfaceC1039h13.s(list16, (C1040i) obj25));
                            } catch (Throwable th12) {
                                d18 = kotlin.collections.r.d(r4.f.g(th12, "exception"), th12.toString(), r4.f.e("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.g(d18);
                            break;
                        case 12:
                            InterfaceC1039h interfaceC1039h14 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj26;
                            Object obj27 = list17.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj27;
                            Object obj28 = list17.get(2);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h14.t(str11, str12, (C1040i) obj28);
                                d19 = kotlin.collections.q.b(null);
                            } catch (Throwable th13) {
                                d19 = kotlin.collections.r.d(r4.f.g(th13, "exception"), th13.toString(), r4.f.e("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.g(d19);
                            break;
                        case 13:
                            InterfaceC1039h interfaceC1039h15 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h15.j(str13, longValue, (C1040i) obj31);
                                d20 = kotlin.collections.q.b(null);
                            } catch (Throwable th14) {
                                d20 = kotlin.collections.r.d(r4.f.g(th14, "exception"), th14.toString(), r4.f.e("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.g(d20);
                            break;
                        default:
                            InterfaceC1039h interfaceC1039h16 = interfaceC1039h;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC1039h16.b(str14, doubleValue, (C1040i) obj34);
                                d21 = kotlin.collections.q.b(null);
                            } catch (Throwable th15) {
                                d21 = kotlin.collections.r.d(r4.f.g(th15, "exception"), th15.toString(), r4.f.e("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.g(d21);
                            break;
                    }
                }
            });
        }
    }
}
