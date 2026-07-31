package e0;

import B0.C0004e;
import B0.E;
import F.C0032n;
import H.k;
import N.P;
import P0.h;
import a.AbstractC0086a;
import android.content.Context;
import android.util.Log;
import h0.ServiceConnectionC0145a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import v0.InterfaceC0237b;
import v0.InterfaceC0241f;
import v0.j;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0123b f1855a = new C0123b();

    /* renamed from: b, reason: collision with root package name */
    public static final D0.f f1856b = new D0.f(new C0004e(1));

    public static void a(C0123b c0123b, InterfaceC0241f interfaceC0241f, final InterfaceC0124c interfaceC0124c) {
        c0123b.getClass();
        h.e(interfaceC0241f, "binaryMessenger");
        String concat = "".length() > 0 ? ".".concat("") : "";
        String g2 = L.d.g("dev.flutter.pigeon.flutter_custom_tabs_android.CustomTabsApi.launch", concat);
        D0.f fVar = f1856b;
        Object obj = null;
        C0032n c0032n = new C0032n(interfaceC0241f, g2, (j) fVar.a(), obj);
        if (interfaceC0124c != null) {
            final int i2 = 0;
            c0032n.j(new InterfaceC0237b() { // from class: e0.a
                @Override // v0.InterfaceC0237b
                public final void a(Object obj2, P p2) {
                    List O2;
                    List O3;
                    List O4;
                    List O5;
                    List O6;
                    switch (i2) {
                        case 0:
                            InterfaceC0124c interfaceC0124c2 = interfaceC0124c;
                            h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((C0125d) interfaceC0124c2).e(str, ((Boolean) obj4).booleanValue(), (Map) list.get(2));
                                O2 = AbstractC0086a.x(null);
                            } catch (Throwable th) {
                                if (th instanceof C0127f) {
                                    C0127f c0127f = th;
                                    O2 = E0.g.O(c0127f.f1865e, c0127f.f1866f, null);
                                } else {
                                    O2 = E0.g.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                                }
                            }
                            p2.n(O2);
                            break;
                        case 1:
                            try {
                                ((C0125d) interfaceC0124c).b();
                                O3 = AbstractC0086a.x(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0127f) {
                                    C0127f c0127f2 = th2;
                                    O3 = E0.g.O(c0127f2.f1865e, c0127f2.f1866f, null);
                                } else {
                                    O3 = E0.g.O(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                                }
                            }
                            p2.n(O3);
                            break;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0124c interfaceC0124c3 = interfaceC0124c;
                            h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            try {
                                O4 = AbstractC0086a.x(((C0125d) interfaceC0124c3).j((Map) ((List) obj2).get(0)));
                            } catch (Throwable th3) {
                                if (th3 instanceof C0127f) {
                                    C0127f c0127f3 = th3;
                                    O4 = E0.g.O(c0127f3.f1865e, c0127f3.f1866f, null);
                                } else {
                                    O4 = E0.g.O(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                                }
                            }
                            p2.n(O4);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0124c interfaceC0124c4 = interfaceC0124c;
                            h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            h.c(obj5, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj5;
                            Object obj6 = list2.get(1);
                            h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            try {
                                ((C0125d) interfaceC0124c4).f((String) obj6, list3);
                                O5 = AbstractC0086a.x(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0127f) {
                                    C0127f c0127f4 = th4;
                                    O5 = E0.g.O(c0127f4.f1865e, c0127f4.f1866f, null);
                                } else {
                                    O5 = E0.g.O(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                                }
                            }
                            p2.n(O5);
                            break;
                        default:
                            InterfaceC0124c interfaceC0124c5 = interfaceC0124c;
                            h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                C0125d c0125d = (C0125d) interfaceC0124c5;
                                c0125d.getClass();
                                E e2 = (E) c0125d.f1859c;
                                e2.getClass();
                                LinkedHashMap linkedHashMap = (LinkedHashMap) e2.f20f;
                                ServiceConnectionC0145a serviceConnectionC0145a = (ServiceConnectionC0145a) linkedHashMap.get(str2);
                                if (serviceConnectionC0145a != null) {
                                    Context context = serviceConnectionC0145a.f2090c;
                                    if (context != null) {
                                        context.unbindService(serviceConnectionC0145a);
                                    }
                                    serviceConnectionC0145a.f2091d = null;
                                    serviceConnectionC0145a.f2092e = false;
                                    linkedHashMap.remove(str2);
                                }
                                O6 = AbstractC0086a.x(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0127f) {
                                    C0127f c0127f5 = th5;
                                    O6 = E0.g.O(c0127f5.f1865e, c0127f5.f1866f, null);
                                } else {
                                    O6 = E0.g.O(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                                }
                            }
                            p2.n(O6);
                            break;
                    }
                }
            });
        } else {
            c0032n.j(null);
        }
        C0032n c0032n2 = new C0032n(interfaceC0241f, L.d.g("dev.flutter.pigeon.flutter_custom_tabs_android.CustomTabsApi.closeAllIfPossible", concat), (j) fVar.a(), obj);
        if (interfaceC0124c != null) {
            final int i3 = 1;
            c0032n2.j(new InterfaceC0237b() { // from class: e0.a
                @Override // v0.InterfaceC0237b
                public final void a(Object obj2, P p2) {
                    List O2;
                    List O3;
                    List O4;
                    List O5;
                    List O6;
                    switch (i3) {
                        case 0:
                            InterfaceC0124c interfaceC0124c2 = interfaceC0124c;
                            h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((C0125d) interfaceC0124c2).e(str, ((Boolean) obj4).booleanValue(), (Map) list.get(2));
                                O2 = AbstractC0086a.x(null);
                            } catch (Throwable th) {
                                if (th instanceof C0127f) {
                                    C0127f c0127f = th;
                                    O2 = E0.g.O(c0127f.f1865e, c0127f.f1866f, null);
                                } else {
                                    O2 = E0.g.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                                }
                            }
                            p2.n(O2);
                            break;
                        case 1:
                            try {
                                ((C0125d) interfaceC0124c).b();
                                O3 = AbstractC0086a.x(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0127f) {
                                    C0127f c0127f2 = th2;
                                    O3 = E0.g.O(c0127f2.f1865e, c0127f2.f1866f, null);
                                } else {
                                    O3 = E0.g.O(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                                }
                            }
                            p2.n(O3);
                            break;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0124c interfaceC0124c3 = interfaceC0124c;
                            h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            try {
                                O4 = AbstractC0086a.x(((C0125d) interfaceC0124c3).j((Map) ((List) obj2).get(0)));
                            } catch (Throwable th3) {
                                if (th3 instanceof C0127f) {
                                    C0127f c0127f3 = th3;
                                    O4 = E0.g.O(c0127f3.f1865e, c0127f3.f1866f, null);
                                } else {
                                    O4 = E0.g.O(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                                }
                            }
                            p2.n(O4);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0124c interfaceC0124c4 = interfaceC0124c;
                            h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            h.c(obj5, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj5;
                            Object obj6 = list2.get(1);
                            h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            try {
                                ((C0125d) interfaceC0124c4).f((String) obj6, list3);
                                O5 = AbstractC0086a.x(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0127f) {
                                    C0127f c0127f4 = th4;
                                    O5 = E0.g.O(c0127f4.f1865e, c0127f4.f1866f, null);
                                } else {
                                    O5 = E0.g.O(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                                }
                            }
                            p2.n(O5);
                            break;
                        default:
                            InterfaceC0124c interfaceC0124c5 = interfaceC0124c;
                            h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                C0125d c0125d = (C0125d) interfaceC0124c5;
                                c0125d.getClass();
                                E e2 = (E) c0125d.f1859c;
                                e2.getClass();
                                LinkedHashMap linkedHashMap = (LinkedHashMap) e2.f20f;
                                ServiceConnectionC0145a serviceConnectionC0145a = (ServiceConnectionC0145a) linkedHashMap.get(str2);
                                if (serviceConnectionC0145a != null) {
                                    Context context = serviceConnectionC0145a.f2090c;
                                    if (context != null) {
                                        context.unbindService(serviceConnectionC0145a);
                                    }
                                    serviceConnectionC0145a.f2091d = null;
                                    serviceConnectionC0145a.f2092e = false;
                                    linkedHashMap.remove(str2);
                                }
                                O6 = AbstractC0086a.x(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0127f) {
                                    C0127f c0127f5 = th5;
                                    O6 = E0.g.O(c0127f5.f1865e, c0127f5.f1866f, null);
                                } else {
                                    O6 = E0.g.O(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                                }
                            }
                            p2.n(O6);
                            break;
                    }
                }
            });
        } else {
            c0032n2.j(null);
        }
        C0032n c0032n3 = new C0032n(interfaceC0241f, L.d.g("dev.flutter.pigeon.flutter_custom_tabs_android.CustomTabsApi.warmup", concat), (j) fVar.a(), obj);
        if (interfaceC0124c != null) {
            final int i4 = 2;
            c0032n3.j(new InterfaceC0237b() { // from class: e0.a
                @Override // v0.InterfaceC0237b
                public final void a(Object obj2, P p2) {
                    List O2;
                    List O3;
                    List O4;
                    List O5;
                    List O6;
                    switch (i4) {
                        case 0:
                            InterfaceC0124c interfaceC0124c2 = interfaceC0124c;
                            h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((C0125d) interfaceC0124c2).e(str, ((Boolean) obj4).booleanValue(), (Map) list.get(2));
                                O2 = AbstractC0086a.x(null);
                            } catch (Throwable th) {
                                if (th instanceof C0127f) {
                                    C0127f c0127f = th;
                                    O2 = E0.g.O(c0127f.f1865e, c0127f.f1866f, null);
                                } else {
                                    O2 = E0.g.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                                }
                            }
                            p2.n(O2);
                            break;
                        case 1:
                            try {
                                ((C0125d) interfaceC0124c).b();
                                O3 = AbstractC0086a.x(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0127f) {
                                    C0127f c0127f2 = th2;
                                    O3 = E0.g.O(c0127f2.f1865e, c0127f2.f1866f, null);
                                } else {
                                    O3 = E0.g.O(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                                }
                            }
                            p2.n(O3);
                            break;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0124c interfaceC0124c3 = interfaceC0124c;
                            h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            try {
                                O4 = AbstractC0086a.x(((C0125d) interfaceC0124c3).j((Map) ((List) obj2).get(0)));
                            } catch (Throwable th3) {
                                if (th3 instanceof C0127f) {
                                    C0127f c0127f3 = th3;
                                    O4 = E0.g.O(c0127f3.f1865e, c0127f3.f1866f, null);
                                } else {
                                    O4 = E0.g.O(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                                }
                            }
                            p2.n(O4);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0124c interfaceC0124c4 = interfaceC0124c;
                            h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            h.c(obj5, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj5;
                            Object obj6 = list2.get(1);
                            h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            try {
                                ((C0125d) interfaceC0124c4).f((String) obj6, list3);
                                O5 = AbstractC0086a.x(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0127f) {
                                    C0127f c0127f4 = th4;
                                    O5 = E0.g.O(c0127f4.f1865e, c0127f4.f1866f, null);
                                } else {
                                    O5 = E0.g.O(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                                }
                            }
                            p2.n(O5);
                            break;
                        default:
                            InterfaceC0124c interfaceC0124c5 = interfaceC0124c;
                            h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                C0125d c0125d = (C0125d) interfaceC0124c5;
                                c0125d.getClass();
                                E e2 = (E) c0125d.f1859c;
                                e2.getClass();
                                LinkedHashMap linkedHashMap = (LinkedHashMap) e2.f20f;
                                ServiceConnectionC0145a serviceConnectionC0145a = (ServiceConnectionC0145a) linkedHashMap.get(str2);
                                if (serviceConnectionC0145a != null) {
                                    Context context = serviceConnectionC0145a.f2090c;
                                    if (context != null) {
                                        context.unbindService(serviceConnectionC0145a);
                                    }
                                    serviceConnectionC0145a.f2091d = null;
                                    serviceConnectionC0145a.f2092e = false;
                                    linkedHashMap.remove(str2);
                                }
                                O6 = AbstractC0086a.x(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0127f) {
                                    C0127f c0127f5 = th5;
                                    O6 = E0.g.O(c0127f5.f1865e, c0127f5.f1866f, null);
                                } else {
                                    O6 = E0.g.O(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                                }
                            }
                            p2.n(O6);
                            break;
                    }
                }
            });
        } else {
            c0032n3.j(null);
        }
        C0032n c0032n4 = new C0032n(interfaceC0241f, L.d.g("dev.flutter.pigeon.flutter_custom_tabs_android.CustomTabsApi.mayLaunch", concat), (j) fVar.a(), obj);
        if (interfaceC0124c != null) {
            final int i5 = 3;
            c0032n4.j(new InterfaceC0237b() { // from class: e0.a
                @Override // v0.InterfaceC0237b
                public final void a(Object obj2, P p2) {
                    List O2;
                    List O3;
                    List O4;
                    List O5;
                    List O6;
                    switch (i5) {
                        case 0:
                            InterfaceC0124c interfaceC0124c2 = interfaceC0124c;
                            h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((C0125d) interfaceC0124c2).e(str, ((Boolean) obj4).booleanValue(), (Map) list.get(2));
                                O2 = AbstractC0086a.x(null);
                            } catch (Throwable th) {
                                if (th instanceof C0127f) {
                                    C0127f c0127f = th;
                                    O2 = E0.g.O(c0127f.f1865e, c0127f.f1866f, null);
                                } else {
                                    O2 = E0.g.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                                }
                            }
                            p2.n(O2);
                            break;
                        case 1:
                            try {
                                ((C0125d) interfaceC0124c).b();
                                O3 = AbstractC0086a.x(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0127f) {
                                    C0127f c0127f2 = th2;
                                    O3 = E0.g.O(c0127f2.f1865e, c0127f2.f1866f, null);
                                } else {
                                    O3 = E0.g.O(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                                }
                            }
                            p2.n(O3);
                            break;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0124c interfaceC0124c3 = interfaceC0124c;
                            h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            try {
                                O4 = AbstractC0086a.x(((C0125d) interfaceC0124c3).j((Map) ((List) obj2).get(0)));
                            } catch (Throwable th3) {
                                if (th3 instanceof C0127f) {
                                    C0127f c0127f3 = th3;
                                    O4 = E0.g.O(c0127f3.f1865e, c0127f3.f1866f, null);
                                } else {
                                    O4 = E0.g.O(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                                }
                            }
                            p2.n(O4);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0124c interfaceC0124c4 = interfaceC0124c;
                            h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            h.c(obj5, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj5;
                            Object obj6 = list2.get(1);
                            h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            try {
                                ((C0125d) interfaceC0124c4).f((String) obj6, list3);
                                O5 = AbstractC0086a.x(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0127f) {
                                    C0127f c0127f4 = th4;
                                    O5 = E0.g.O(c0127f4.f1865e, c0127f4.f1866f, null);
                                } else {
                                    O5 = E0.g.O(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                                }
                            }
                            p2.n(O5);
                            break;
                        default:
                            InterfaceC0124c interfaceC0124c5 = interfaceC0124c;
                            h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                C0125d c0125d = (C0125d) interfaceC0124c5;
                                c0125d.getClass();
                                E e2 = (E) c0125d.f1859c;
                                e2.getClass();
                                LinkedHashMap linkedHashMap = (LinkedHashMap) e2.f20f;
                                ServiceConnectionC0145a serviceConnectionC0145a = (ServiceConnectionC0145a) linkedHashMap.get(str2);
                                if (serviceConnectionC0145a != null) {
                                    Context context = serviceConnectionC0145a.f2090c;
                                    if (context != null) {
                                        context.unbindService(serviceConnectionC0145a);
                                    }
                                    serviceConnectionC0145a.f2091d = null;
                                    serviceConnectionC0145a.f2092e = false;
                                    linkedHashMap.remove(str2);
                                }
                                O6 = AbstractC0086a.x(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0127f) {
                                    C0127f c0127f5 = th5;
                                    O6 = E0.g.O(c0127f5.f1865e, c0127f5.f1866f, null);
                                } else {
                                    O6 = E0.g.O(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                                }
                            }
                            p2.n(O6);
                            break;
                    }
                }
            });
        } else {
            c0032n4.j(null);
        }
        C0032n c0032n5 = new C0032n(interfaceC0241f, L.d.g("dev.flutter.pigeon.flutter_custom_tabs_android.CustomTabsApi.invalidate", concat), (j) fVar.a(), obj);
        if (interfaceC0124c == null) {
            c0032n5.j(null);
        } else {
            final int i6 = 4;
            c0032n5.j(new InterfaceC0237b() { // from class: e0.a
                @Override // v0.InterfaceC0237b
                public final void a(Object obj2, P p2) {
                    List O2;
                    List O3;
                    List O4;
                    List O5;
                    List O6;
                    switch (i6) {
                        case 0:
                            InterfaceC0124c interfaceC0124c2 = interfaceC0124c;
                            h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((C0125d) interfaceC0124c2).e(str, ((Boolean) obj4).booleanValue(), (Map) list.get(2));
                                O2 = AbstractC0086a.x(null);
                            } catch (Throwable th) {
                                if (th instanceof C0127f) {
                                    C0127f c0127f = th;
                                    O2 = E0.g.O(c0127f.f1865e, c0127f.f1866f, null);
                                } else {
                                    O2 = E0.g.O(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                                }
                            }
                            p2.n(O2);
                            break;
                        case 1:
                            try {
                                ((C0125d) interfaceC0124c).b();
                                O3 = AbstractC0086a.x(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0127f) {
                                    C0127f c0127f2 = th2;
                                    O3 = E0.g.O(c0127f2.f1865e, c0127f2.f1866f, null);
                                } else {
                                    O3 = E0.g.O(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                                }
                            }
                            p2.n(O3);
                            break;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0124c interfaceC0124c3 = interfaceC0124c;
                            h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            try {
                                O4 = AbstractC0086a.x(((C0125d) interfaceC0124c3).j((Map) ((List) obj2).get(0)));
                            } catch (Throwable th3) {
                                if (th3 instanceof C0127f) {
                                    C0127f c0127f3 = th3;
                                    O4 = E0.g.O(c0127f3.f1865e, c0127f3.f1866f, null);
                                } else {
                                    O4 = E0.g.O(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                                }
                            }
                            p2.n(O4);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0124c interfaceC0124c4 = interfaceC0124c;
                            h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            h.c(obj5, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj5;
                            Object obj6 = list2.get(1);
                            h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            try {
                                ((C0125d) interfaceC0124c4).f((String) obj6, list3);
                                O5 = AbstractC0086a.x(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0127f) {
                                    C0127f c0127f4 = th4;
                                    O5 = E0.g.O(c0127f4.f1865e, c0127f4.f1866f, null);
                                } else {
                                    O5 = E0.g.O(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                                }
                            }
                            p2.n(O5);
                            break;
                        default:
                            InterfaceC0124c interfaceC0124c5 = interfaceC0124c;
                            h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                C0125d c0125d = (C0125d) interfaceC0124c5;
                                c0125d.getClass();
                                E e2 = (E) c0125d.f1859c;
                                e2.getClass();
                                LinkedHashMap linkedHashMap = (LinkedHashMap) e2.f20f;
                                ServiceConnectionC0145a serviceConnectionC0145a = (ServiceConnectionC0145a) linkedHashMap.get(str2);
                                if (serviceConnectionC0145a != null) {
                                    Context context = serviceConnectionC0145a.f2090c;
                                    if (context != null) {
                                        context.unbindService(serviceConnectionC0145a);
                                    }
                                    serviceConnectionC0145a.f2091d = null;
                                    serviceConnectionC0145a.f2092e = false;
                                    linkedHashMap.remove(str2);
                                }
                                O6 = AbstractC0086a.x(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0127f) {
                                    C0127f c0127f5 = th5;
                                    O6 = E0.g.O(c0127f5.f1865e, c0127f5.f1866f, null);
                                } else {
                                    O6 = E0.g.O(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                                }
                            }
                            p2.n(O6);
                            break;
                    }
                }
            });
        }
    }
}
