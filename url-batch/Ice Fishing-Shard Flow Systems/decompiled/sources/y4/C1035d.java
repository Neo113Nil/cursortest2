package y4;

import android.util.Log;
import c4.C0305k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import s4.InterfaceC0893b;

/* renamed from: y4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1035d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C1035d f8584a = new C1035d();

    /* renamed from: b, reason: collision with root package name */
    public static final R5.q f8585b = R5.i.b(new C0305k(1));

    public static s4.m a() {
        return (s4.m) f8585b.getValue();
    }

    public static void b(s4.f binaryMessenger, final C1032a c1032a) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        Intrinsics.checkNotNullParameter("", "messageChannelSuffix");
        q1.h b7 = binaryMessenger.b(new s4.l());
        P0.i iVar = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", ""), a(), b7);
        if (c1032a != null) {
            final int i2 = 2;
            iVar.m(new InterfaceC0893b() { // from class: y4.c
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
                    switch (i2) {
                        case 0:
                            InterfaceC1036e interfaceC1036e = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d7 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e).a((String) obj2, (List) list.get(1))));
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1036e interfaceC1036e2 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj3 = list2.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d8 = kotlin.collections.q.b(((C1032a) interfaceC1036e2).b((String) obj3, (List) list2.get(1)));
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1036e interfaceC1036e3 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d9 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e3).f8579d.edit().remove((String) obj4).commit()));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1036e interfaceC1036e4 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj5 = list3.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list3.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                d10 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e4).f8579d.edit().putBoolean(str, ((Boolean) obj6).booleanValue()).commit()));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1036e interfaceC1036e5 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d11 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e5).c(str2, (String) obj8)));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1036e interfaceC1036e6 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                d12 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e6).f8579d.edit().putLong(str3, ((Long) obj10).longValue()).commit()));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1036e interfaceC1036e7 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj12).doubleValue();
                            try {
                                C1032a c1032a2 = (C1032a) interfaceC1036e7;
                                c1032a2.getClass();
                                String d16 = Double.toString(doubleValue);
                                d13 = kotlin.collections.q.b(Boolean.valueOf(c1032a2.f8579d.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d16).commit()));
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1036e interfaceC1036e8 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d14 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e8).f8579d.edit().putString(str5, (String) obj14).commit()));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        default:
                            InterfaceC1036e interfaceC1036e9 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list9 = (List) obj16;
                            try {
                                C1032a c1032a3 = (C1032a) interfaceC1036e9;
                                d15 = kotlin.collections.q.b(Boolean.valueOf(c1032a3.f8579d.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c1032a3.f8580e.a(list9)).commit()));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                    }
                }
            });
        } else {
            iVar.m(null);
        }
        P0.i iVar2 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", ""), a(), b7);
        if (c1032a != null) {
            final int i5 = 3;
            iVar2.m(new InterfaceC0893b() { // from class: y4.c
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
                    switch (i5) {
                        case 0:
                            InterfaceC1036e interfaceC1036e = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d7 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e).a((String) obj2, (List) list.get(1))));
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1036e interfaceC1036e2 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj3 = list2.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d8 = kotlin.collections.q.b(((C1032a) interfaceC1036e2).b((String) obj3, (List) list2.get(1)));
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1036e interfaceC1036e3 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d9 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e3).f8579d.edit().remove((String) obj4).commit()));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1036e interfaceC1036e4 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj5 = list3.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list3.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                d10 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e4).f8579d.edit().putBoolean(str, ((Boolean) obj6).booleanValue()).commit()));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1036e interfaceC1036e5 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d11 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e5).c(str2, (String) obj8)));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1036e interfaceC1036e6 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                d12 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e6).f8579d.edit().putLong(str3, ((Long) obj10).longValue()).commit()));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1036e interfaceC1036e7 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj12).doubleValue();
                            try {
                                C1032a c1032a2 = (C1032a) interfaceC1036e7;
                                c1032a2.getClass();
                                String d16 = Double.toString(doubleValue);
                                d13 = kotlin.collections.q.b(Boolean.valueOf(c1032a2.f8579d.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d16).commit()));
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1036e interfaceC1036e8 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d14 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e8).f8579d.edit().putString(str5, (String) obj14).commit()));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        default:
                            InterfaceC1036e interfaceC1036e9 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list9 = (List) obj16;
                            try {
                                C1032a c1032a3 = (C1032a) interfaceC1036e9;
                                d15 = kotlin.collections.q.b(Boolean.valueOf(c1032a3.f8579d.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c1032a3.f8580e.a(list9)).commit()));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                    }
                }
            });
        } else {
            iVar2.m(null);
        }
        P0.i iVar3 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", ""), a(), b7);
        if (c1032a != null) {
            final int i7 = 4;
            iVar3.m(new InterfaceC0893b() { // from class: y4.c
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
                    switch (i7) {
                        case 0:
                            InterfaceC1036e interfaceC1036e = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d7 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e).a((String) obj2, (List) list.get(1))));
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1036e interfaceC1036e2 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj3 = list2.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d8 = kotlin.collections.q.b(((C1032a) interfaceC1036e2).b((String) obj3, (List) list2.get(1)));
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1036e interfaceC1036e3 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d9 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e3).f8579d.edit().remove((String) obj4).commit()));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1036e interfaceC1036e4 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj5 = list3.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list3.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                d10 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e4).f8579d.edit().putBoolean(str, ((Boolean) obj6).booleanValue()).commit()));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1036e interfaceC1036e5 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d11 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e5).c(str2, (String) obj8)));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1036e interfaceC1036e6 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                d12 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e6).f8579d.edit().putLong(str3, ((Long) obj10).longValue()).commit()));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1036e interfaceC1036e7 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj12).doubleValue();
                            try {
                                C1032a c1032a2 = (C1032a) interfaceC1036e7;
                                c1032a2.getClass();
                                String d16 = Double.toString(doubleValue);
                                d13 = kotlin.collections.q.b(Boolean.valueOf(c1032a2.f8579d.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d16).commit()));
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1036e interfaceC1036e8 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d14 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e8).f8579d.edit().putString(str5, (String) obj14).commit()));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        default:
                            InterfaceC1036e interfaceC1036e9 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list9 = (List) obj16;
                            try {
                                C1032a c1032a3 = (C1032a) interfaceC1036e9;
                                d15 = kotlin.collections.q.b(Boolean.valueOf(c1032a3.f8579d.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c1032a3.f8580e.a(list9)).commit()));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                    }
                }
            });
        } else {
            iVar3.m(null);
        }
        P0.i iVar4 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", ""), a(), b7);
        if (c1032a != null) {
            final int i8 = 5;
            iVar4.m(new InterfaceC0893b() { // from class: y4.c
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
                    switch (i8) {
                        case 0:
                            InterfaceC1036e interfaceC1036e = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d7 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e).a((String) obj2, (List) list.get(1))));
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1036e interfaceC1036e2 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj3 = list2.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d8 = kotlin.collections.q.b(((C1032a) interfaceC1036e2).b((String) obj3, (List) list2.get(1)));
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1036e interfaceC1036e3 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d9 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e3).f8579d.edit().remove((String) obj4).commit()));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1036e interfaceC1036e4 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj5 = list3.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list3.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                d10 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e4).f8579d.edit().putBoolean(str, ((Boolean) obj6).booleanValue()).commit()));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1036e interfaceC1036e5 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d11 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e5).c(str2, (String) obj8)));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1036e interfaceC1036e6 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                d12 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e6).f8579d.edit().putLong(str3, ((Long) obj10).longValue()).commit()));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1036e interfaceC1036e7 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj12).doubleValue();
                            try {
                                C1032a c1032a2 = (C1032a) interfaceC1036e7;
                                c1032a2.getClass();
                                String d16 = Double.toString(doubleValue);
                                d13 = kotlin.collections.q.b(Boolean.valueOf(c1032a2.f8579d.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d16).commit()));
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1036e interfaceC1036e8 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d14 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e8).f8579d.edit().putString(str5, (String) obj14).commit()));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        default:
                            InterfaceC1036e interfaceC1036e9 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list9 = (List) obj16;
                            try {
                                C1032a c1032a3 = (C1032a) interfaceC1036e9;
                                d15 = kotlin.collections.q.b(Boolean.valueOf(c1032a3.f8579d.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c1032a3.f8580e.a(list9)).commit()));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                    }
                }
            });
        } else {
            iVar4.m(null);
        }
        P0.i iVar5 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", ""), a(), b7);
        if (c1032a != null) {
            final int i9 = 6;
            iVar5.m(new InterfaceC0893b() { // from class: y4.c
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
                    switch (i9) {
                        case 0:
                            InterfaceC1036e interfaceC1036e = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d7 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e).a((String) obj2, (List) list.get(1))));
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1036e interfaceC1036e2 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj3 = list2.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d8 = kotlin.collections.q.b(((C1032a) interfaceC1036e2).b((String) obj3, (List) list2.get(1)));
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1036e interfaceC1036e3 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d9 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e3).f8579d.edit().remove((String) obj4).commit()));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1036e interfaceC1036e4 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj5 = list3.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list3.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                d10 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e4).f8579d.edit().putBoolean(str, ((Boolean) obj6).booleanValue()).commit()));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1036e interfaceC1036e5 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d11 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e5).c(str2, (String) obj8)));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1036e interfaceC1036e6 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                d12 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e6).f8579d.edit().putLong(str3, ((Long) obj10).longValue()).commit()));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1036e interfaceC1036e7 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj12).doubleValue();
                            try {
                                C1032a c1032a2 = (C1032a) interfaceC1036e7;
                                c1032a2.getClass();
                                String d16 = Double.toString(doubleValue);
                                d13 = kotlin.collections.q.b(Boolean.valueOf(c1032a2.f8579d.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d16).commit()));
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1036e interfaceC1036e8 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d14 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e8).f8579d.edit().putString(str5, (String) obj14).commit()));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        default:
                            InterfaceC1036e interfaceC1036e9 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list9 = (List) obj16;
                            try {
                                C1032a c1032a3 = (C1032a) interfaceC1036e9;
                                d15 = kotlin.collections.q.b(Boolean.valueOf(c1032a3.f8579d.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c1032a3.f8580e.a(list9)).commit()));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                    }
                }
            });
        } else {
            iVar5.m(null);
        }
        P0.i iVar6 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", ""), a(), b7);
        if (c1032a != null) {
            final int i10 = 7;
            iVar6.m(new InterfaceC0893b() { // from class: y4.c
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
                    switch (i10) {
                        case 0:
                            InterfaceC1036e interfaceC1036e = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d7 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e).a((String) obj2, (List) list.get(1))));
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1036e interfaceC1036e2 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj3 = list2.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d8 = kotlin.collections.q.b(((C1032a) interfaceC1036e2).b((String) obj3, (List) list2.get(1)));
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1036e interfaceC1036e3 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d9 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e3).f8579d.edit().remove((String) obj4).commit()));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1036e interfaceC1036e4 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj5 = list3.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list3.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                d10 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e4).f8579d.edit().putBoolean(str, ((Boolean) obj6).booleanValue()).commit()));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1036e interfaceC1036e5 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d11 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e5).c(str2, (String) obj8)));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1036e interfaceC1036e6 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                d12 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e6).f8579d.edit().putLong(str3, ((Long) obj10).longValue()).commit()));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1036e interfaceC1036e7 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj12).doubleValue();
                            try {
                                C1032a c1032a2 = (C1032a) interfaceC1036e7;
                                c1032a2.getClass();
                                String d16 = Double.toString(doubleValue);
                                d13 = kotlin.collections.q.b(Boolean.valueOf(c1032a2.f8579d.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d16).commit()));
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1036e interfaceC1036e8 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d14 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e8).f8579d.edit().putString(str5, (String) obj14).commit()));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        default:
                            InterfaceC1036e interfaceC1036e9 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list9 = (List) obj16;
                            try {
                                C1032a c1032a3 = (C1032a) interfaceC1036e9;
                                d15 = kotlin.collections.q.b(Boolean.valueOf(c1032a3.f8579d.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c1032a3.f8580e.a(list9)).commit()));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                    }
                }
            });
        } else {
            iVar6.m(null);
        }
        P0.i iVar7 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", ""), a(), b7);
        if (c1032a != null) {
            final int i11 = 8;
            iVar7.m(new InterfaceC0893b() { // from class: y4.c
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
                    switch (i11) {
                        case 0:
                            InterfaceC1036e interfaceC1036e = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d7 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e).a((String) obj2, (List) list.get(1))));
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1036e interfaceC1036e2 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj3 = list2.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d8 = kotlin.collections.q.b(((C1032a) interfaceC1036e2).b((String) obj3, (List) list2.get(1)));
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1036e interfaceC1036e3 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d9 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e3).f8579d.edit().remove((String) obj4).commit()));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1036e interfaceC1036e4 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj5 = list3.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list3.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                d10 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e4).f8579d.edit().putBoolean(str, ((Boolean) obj6).booleanValue()).commit()));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1036e interfaceC1036e5 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d11 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e5).c(str2, (String) obj8)));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1036e interfaceC1036e6 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                d12 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e6).f8579d.edit().putLong(str3, ((Long) obj10).longValue()).commit()));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1036e interfaceC1036e7 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj12).doubleValue();
                            try {
                                C1032a c1032a2 = (C1032a) interfaceC1036e7;
                                c1032a2.getClass();
                                String d16 = Double.toString(doubleValue);
                                d13 = kotlin.collections.q.b(Boolean.valueOf(c1032a2.f8579d.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d16).commit()));
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1036e interfaceC1036e8 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d14 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e8).f8579d.edit().putString(str5, (String) obj14).commit()));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        default:
                            InterfaceC1036e interfaceC1036e9 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list9 = (List) obj16;
                            try {
                                C1032a c1032a3 = (C1032a) interfaceC1036e9;
                                d15 = kotlin.collections.q.b(Boolean.valueOf(c1032a3.f8579d.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c1032a3.f8580e.a(list9)).commit()));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                    }
                }
            });
        } else {
            iVar7.m(null);
        }
        P0.i iVar8 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", ""), a(), b7);
        if (c1032a != null) {
            final int i12 = 0;
            iVar8.m(new InterfaceC0893b() { // from class: y4.c
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
                    switch (i12) {
                        case 0:
                            InterfaceC1036e interfaceC1036e = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d7 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e).a((String) obj2, (List) list.get(1))));
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1036e interfaceC1036e2 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj3 = list2.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d8 = kotlin.collections.q.b(((C1032a) interfaceC1036e2).b((String) obj3, (List) list2.get(1)));
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1036e interfaceC1036e3 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d9 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e3).f8579d.edit().remove((String) obj4).commit()));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1036e interfaceC1036e4 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj5 = list3.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list3.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                d10 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e4).f8579d.edit().putBoolean(str, ((Boolean) obj6).booleanValue()).commit()));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1036e interfaceC1036e5 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d11 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e5).c(str2, (String) obj8)));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1036e interfaceC1036e6 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                d12 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e6).f8579d.edit().putLong(str3, ((Long) obj10).longValue()).commit()));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1036e interfaceC1036e7 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj12).doubleValue();
                            try {
                                C1032a c1032a2 = (C1032a) interfaceC1036e7;
                                c1032a2.getClass();
                                String d16 = Double.toString(doubleValue);
                                d13 = kotlin.collections.q.b(Boolean.valueOf(c1032a2.f8579d.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d16).commit()));
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1036e interfaceC1036e8 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d14 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e8).f8579d.edit().putString(str5, (String) obj14).commit()));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        default:
                            InterfaceC1036e interfaceC1036e9 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list9 = (List) obj16;
                            try {
                                C1032a c1032a3 = (C1032a) interfaceC1036e9;
                                d15 = kotlin.collections.q.b(Boolean.valueOf(c1032a3.f8579d.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c1032a3.f8580e.a(list9)).commit()));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                    }
                }
            });
        } else {
            iVar8.m(null);
        }
        P0.i iVar9 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", ""), a(), b7);
        if (c1032a == null) {
            iVar9.m(null);
        } else {
            final int i13 = 1;
            iVar9.m(new InterfaceC0893b() { // from class: y4.c
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
                    switch (i13) {
                        case 0:
                            InterfaceC1036e interfaceC1036e = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d7 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e).a((String) obj2, (List) list.get(1))));
                            } catch (Throwable th) {
                                d7 = kotlin.collections.r.d(r4.f.g(th, "exception"), th.toString(), r4.f.e("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            reply.g(d7);
                            break;
                        case 1:
                            InterfaceC1036e interfaceC1036e2 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj3 = list2.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d8 = kotlin.collections.q.b(((C1032a) interfaceC1036e2).b((String) obj3, (List) list2.get(1)));
                            } catch (Throwable th2) {
                                d8 = kotlin.collections.r.d(r4.f.g(th2, "exception"), th2.toString(), r4.f.e("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.g(d8);
                            break;
                        case 2:
                            InterfaceC1036e interfaceC1036e3 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d9 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e3).f8579d.edit().remove((String) obj4).commit()));
                            } catch (Throwable th3) {
                                d9 = kotlin.collections.r.d(r4.f.g(th3, "exception"), th3.toString(), r4.f.e("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.g(d9);
                            break;
                        case 3:
                            InterfaceC1036e interfaceC1036e4 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj5 = list3.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list3.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                d10 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e4).f8579d.edit().putBoolean(str, ((Boolean) obj6).booleanValue()).commit()));
                            } catch (Throwable th4) {
                                d10 = kotlin.collections.r.d(r4.f.g(th4, "exception"), th4.toString(), r4.f.e("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.g(d10);
                            break;
                        case 4:
                            InterfaceC1036e interfaceC1036e5 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d11 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e5).c(str2, (String) obj8)));
                            } catch (Throwable th5) {
                                d11 = kotlin.collections.r.d(r4.f.g(th5, "exception"), th5.toString(), r4.f.e("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.g(d11);
                            break;
                        case 5:
                            InterfaceC1036e interfaceC1036e6 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                d12 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e6).f8579d.edit().putLong(str3, ((Long) obj10).longValue()).commit()));
                            } catch (Throwable th6) {
                                d12 = kotlin.collections.r.d(r4.f.g(th6, "exception"), th6.toString(), r4.f.e("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.g(d12);
                            break;
                        case 6:
                            InterfaceC1036e interfaceC1036e7 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj12).doubleValue();
                            try {
                                C1032a c1032a2 = (C1032a) interfaceC1036e7;
                                c1032a2.getClass();
                                String d16 = Double.toString(doubleValue);
                                d13 = kotlin.collections.q.b(Boolean.valueOf(c1032a2.f8579d.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d16).commit()));
                            } catch (Throwable th7) {
                                d13 = kotlin.collections.r.d(r4.f.g(th7, "exception"), th7.toString(), r4.f.e("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.g(d13);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC1036e interfaceC1036e8 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            try {
                                d14 = kotlin.collections.q.b(Boolean.valueOf(((C1032a) interfaceC1036e8).f8579d.edit().putString(str5, (String) obj14).commit()));
                            } catch (Throwable th8) {
                                d14 = kotlin.collections.r.d(r4.f.g(th8, "exception"), th8.toString(), r4.f.e("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.g(d14);
                            break;
                        default:
                            InterfaceC1036e interfaceC1036e9 = c1032a;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list9 = (List) obj16;
                            try {
                                C1032a c1032a3 = (C1032a) interfaceC1036e9;
                                d15 = kotlin.collections.q.b(Boolean.valueOf(c1032a3.f8579d.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c1032a3.f8580e.a(list9)).commit()));
                            } catch (Throwable th9) {
                                d15 = kotlin.collections.r.d(r4.f.g(th9, "exception"), th9.toString(), r4.f.e("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.g(d15);
                            break;
                    }
                }
            });
        }
    }
}
