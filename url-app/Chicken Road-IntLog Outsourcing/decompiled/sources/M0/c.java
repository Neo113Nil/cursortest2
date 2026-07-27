package M0;

import B0.o;
import H2.k;
import a.AbstractC0169a;
import android.app.Activity;
import f2.t;
import f4.C0434k;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c f1779a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final C0434k f1780b = AbstractC0169a.A(new a(0));

    public static void a(c cVar, H2.f binaryMessenger, final d dVar) {
        cVar.getClass();
        i.e(binaryMessenger, "binaryMessenger");
        String concat = "".length() > 0 ? ".".concat("") : "";
        String i2 = o.i("dev.flutter.pigeon.flutter_custom_tabs_android.CustomTabsApi.launch", concat);
        C0434k c0434k = f1780b;
        t tVar = new t(binaryMessenger, i2, (k) c0434k.getValue(), null);
        if (dVar != null) {
            final int i3 = 0;
            tVar.h(new H2.b() { // from class: M0.b
                @Override // H2.b
                public final void c(Object obj, B0.t tVar2) {
                    List K5;
                    List K6;
                    List K7;
                    List K8;
                    List K9;
                    switch (i3) {
                        case 0:
                            d dVar2 = dVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((e) dVar2).h(str, ((Boolean) obj3).booleanValue(), (Map) list.get(2));
                                K5 = K1.b.W(null);
                            } catch (Throwable th) {
                                K5 = AbstractC0169a.K(th);
                            }
                            tVar2.b(K5);
                            break;
                        case 1:
                            try {
                                ((e) dVar).d();
                                K6 = K1.b.W(null);
                            } catch (Throwable th2) {
                                K6 = AbstractC0169a.K(th2);
                            }
                            tVar2.b(K6);
                            break;
                        case 2:
                            d dVar3 = dVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            try {
                                K7 = K1.b.W(((e) dVar3).r((Map) ((List) obj).get(0)));
                            } catch (Throwable th3) {
                                K7 = AbstractC0169a.K(th3);
                            }
                            tVar2.b(K7);
                            break;
                        case 3:
                            d dVar4 = dVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj4;
                            Object obj5 = list2.get(1);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            try {
                                ((e) dVar4).j((String) obj5, list3);
                                K8 = K1.b.W(null);
                            } catch (Throwable th4) {
                                K8 = AbstractC0169a.K(th4);
                            }
                            tVar2.b(K8);
                            break;
                        default:
                            d dVar5 = dVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                e eVar = (e) dVar5;
                                eVar.getClass();
                                P0.b bVar = (P0.b) eVar.f1784d;
                                bVar.getClass();
                                LinkedHashMap linkedHashMap = bVar.f2283a;
                                P0.a aVar = (P0.a) linkedHashMap.get(str2);
                                if (aVar != null) {
                                    Activity activity = aVar.f2280b;
                                    if (activity != null) {
                                        activity.unbindService(aVar);
                                    }
                                    aVar.f2281c = null;
                                    aVar.f2282d = false;
                                    linkedHashMap.remove(str2);
                                }
                                K9 = K1.b.W(null);
                            } catch (Throwable th5) {
                                K9 = AbstractC0169a.K(th5);
                            }
                            tVar2.b(K9);
                            break;
                    }
                }
            });
        } else {
            tVar.h(null);
        }
        t tVar2 = new t(binaryMessenger, o.i("dev.flutter.pigeon.flutter_custom_tabs_android.CustomTabsApi.closeAllIfPossible", concat), (k) c0434k.getValue(), null);
        if (dVar != null) {
            final int i6 = 1;
            tVar2.h(new H2.b() { // from class: M0.b
                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    List K5;
                    List K6;
                    List K7;
                    List K8;
                    List K9;
                    switch (i6) {
                        case 0:
                            d dVar2 = dVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((e) dVar2).h(str, ((Boolean) obj3).booleanValue(), (Map) list.get(2));
                                K5 = K1.b.W(null);
                            } catch (Throwable th) {
                                K5 = AbstractC0169a.K(th);
                            }
                            tVar22.b(K5);
                            break;
                        case 1:
                            try {
                                ((e) dVar).d();
                                K6 = K1.b.W(null);
                            } catch (Throwable th2) {
                                K6 = AbstractC0169a.K(th2);
                            }
                            tVar22.b(K6);
                            break;
                        case 2:
                            d dVar3 = dVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            try {
                                K7 = K1.b.W(((e) dVar3).r((Map) ((List) obj).get(0)));
                            } catch (Throwable th3) {
                                K7 = AbstractC0169a.K(th3);
                            }
                            tVar22.b(K7);
                            break;
                        case 3:
                            d dVar4 = dVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj4;
                            Object obj5 = list2.get(1);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            try {
                                ((e) dVar4).j((String) obj5, list3);
                                K8 = K1.b.W(null);
                            } catch (Throwable th4) {
                                K8 = AbstractC0169a.K(th4);
                            }
                            tVar22.b(K8);
                            break;
                        default:
                            d dVar5 = dVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                e eVar = (e) dVar5;
                                eVar.getClass();
                                P0.b bVar = (P0.b) eVar.f1784d;
                                bVar.getClass();
                                LinkedHashMap linkedHashMap = bVar.f2283a;
                                P0.a aVar = (P0.a) linkedHashMap.get(str2);
                                if (aVar != null) {
                                    Activity activity = aVar.f2280b;
                                    if (activity != null) {
                                        activity.unbindService(aVar);
                                    }
                                    aVar.f2281c = null;
                                    aVar.f2282d = false;
                                    linkedHashMap.remove(str2);
                                }
                                K9 = K1.b.W(null);
                            } catch (Throwable th5) {
                                K9 = AbstractC0169a.K(th5);
                            }
                            tVar22.b(K9);
                            break;
                    }
                }
            });
        } else {
            tVar2.h(null);
        }
        t tVar3 = new t(binaryMessenger, o.i("dev.flutter.pigeon.flutter_custom_tabs_android.CustomTabsApi.warmup", concat), (k) c0434k.getValue(), null);
        if (dVar != null) {
            final int i7 = 2;
            tVar3.h(new H2.b() { // from class: M0.b
                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    List K5;
                    List K6;
                    List K7;
                    List K8;
                    List K9;
                    switch (i7) {
                        case 0:
                            d dVar2 = dVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((e) dVar2).h(str, ((Boolean) obj3).booleanValue(), (Map) list.get(2));
                                K5 = K1.b.W(null);
                            } catch (Throwable th) {
                                K5 = AbstractC0169a.K(th);
                            }
                            tVar22.b(K5);
                            break;
                        case 1:
                            try {
                                ((e) dVar).d();
                                K6 = K1.b.W(null);
                            } catch (Throwable th2) {
                                K6 = AbstractC0169a.K(th2);
                            }
                            tVar22.b(K6);
                            break;
                        case 2:
                            d dVar3 = dVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            try {
                                K7 = K1.b.W(((e) dVar3).r((Map) ((List) obj).get(0)));
                            } catch (Throwable th3) {
                                K7 = AbstractC0169a.K(th3);
                            }
                            tVar22.b(K7);
                            break;
                        case 3:
                            d dVar4 = dVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj4;
                            Object obj5 = list2.get(1);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            try {
                                ((e) dVar4).j((String) obj5, list3);
                                K8 = K1.b.W(null);
                            } catch (Throwable th4) {
                                K8 = AbstractC0169a.K(th4);
                            }
                            tVar22.b(K8);
                            break;
                        default:
                            d dVar5 = dVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                e eVar = (e) dVar5;
                                eVar.getClass();
                                P0.b bVar = (P0.b) eVar.f1784d;
                                bVar.getClass();
                                LinkedHashMap linkedHashMap = bVar.f2283a;
                                P0.a aVar = (P0.a) linkedHashMap.get(str2);
                                if (aVar != null) {
                                    Activity activity = aVar.f2280b;
                                    if (activity != null) {
                                        activity.unbindService(aVar);
                                    }
                                    aVar.f2281c = null;
                                    aVar.f2282d = false;
                                    linkedHashMap.remove(str2);
                                }
                                K9 = K1.b.W(null);
                            } catch (Throwable th5) {
                                K9 = AbstractC0169a.K(th5);
                            }
                            tVar22.b(K9);
                            break;
                    }
                }
            });
        } else {
            tVar3.h(null);
        }
        t tVar4 = new t(binaryMessenger, o.i("dev.flutter.pigeon.flutter_custom_tabs_android.CustomTabsApi.mayLaunch", concat), (k) c0434k.getValue(), null);
        if (dVar != null) {
            final int i8 = 3;
            tVar4.h(new H2.b() { // from class: M0.b
                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    List K5;
                    List K6;
                    List K7;
                    List K8;
                    List K9;
                    switch (i8) {
                        case 0:
                            d dVar2 = dVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((e) dVar2).h(str, ((Boolean) obj3).booleanValue(), (Map) list.get(2));
                                K5 = K1.b.W(null);
                            } catch (Throwable th) {
                                K5 = AbstractC0169a.K(th);
                            }
                            tVar22.b(K5);
                            break;
                        case 1:
                            try {
                                ((e) dVar).d();
                                K6 = K1.b.W(null);
                            } catch (Throwable th2) {
                                K6 = AbstractC0169a.K(th2);
                            }
                            tVar22.b(K6);
                            break;
                        case 2:
                            d dVar3 = dVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            try {
                                K7 = K1.b.W(((e) dVar3).r((Map) ((List) obj).get(0)));
                            } catch (Throwable th3) {
                                K7 = AbstractC0169a.K(th3);
                            }
                            tVar22.b(K7);
                            break;
                        case 3:
                            d dVar4 = dVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj4;
                            Object obj5 = list2.get(1);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            try {
                                ((e) dVar4).j((String) obj5, list3);
                                K8 = K1.b.W(null);
                            } catch (Throwable th4) {
                                K8 = AbstractC0169a.K(th4);
                            }
                            tVar22.b(K8);
                            break;
                        default:
                            d dVar5 = dVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                e eVar = (e) dVar5;
                                eVar.getClass();
                                P0.b bVar = (P0.b) eVar.f1784d;
                                bVar.getClass();
                                LinkedHashMap linkedHashMap = bVar.f2283a;
                                P0.a aVar = (P0.a) linkedHashMap.get(str2);
                                if (aVar != null) {
                                    Activity activity = aVar.f2280b;
                                    if (activity != null) {
                                        activity.unbindService(aVar);
                                    }
                                    aVar.f2281c = null;
                                    aVar.f2282d = false;
                                    linkedHashMap.remove(str2);
                                }
                                K9 = K1.b.W(null);
                            } catch (Throwable th5) {
                                K9 = AbstractC0169a.K(th5);
                            }
                            tVar22.b(K9);
                            break;
                    }
                }
            });
        } else {
            tVar4.h(null);
        }
        t tVar5 = new t(binaryMessenger, o.i("dev.flutter.pigeon.flutter_custom_tabs_android.CustomTabsApi.invalidate", concat), (k) c0434k.getValue(), null);
        if (dVar == null) {
            tVar5.h(null);
        } else {
            final int i9 = 4;
            tVar5.h(new H2.b() { // from class: M0.b
                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    List K5;
                    List K6;
                    List K7;
                    List K8;
                    List K9;
                    switch (i9) {
                        case 0:
                            d dVar2 = dVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((e) dVar2).h(str, ((Boolean) obj3).booleanValue(), (Map) list.get(2));
                                K5 = K1.b.W(null);
                            } catch (Throwable th) {
                                K5 = AbstractC0169a.K(th);
                            }
                            tVar22.b(K5);
                            break;
                        case 1:
                            try {
                                ((e) dVar).d();
                                K6 = K1.b.W(null);
                            } catch (Throwable th2) {
                                K6 = AbstractC0169a.K(th2);
                            }
                            tVar22.b(K6);
                            break;
                        case 2:
                            d dVar3 = dVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            try {
                                K7 = K1.b.W(((e) dVar3).r((Map) ((List) obj).get(0)));
                            } catch (Throwable th3) {
                                K7 = AbstractC0169a.K(th3);
                            }
                            tVar22.b(K7);
                            break;
                        case 3:
                            d dVar4 = dVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj4;
                            Object obj5 = list2.get(1);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            try {
                                ((e) dVar4).j((String) obj5, list3);
                                K8 = K1.b.W(null);
                            } catch (Throwable th4) {
                                K8 = AbstractC0169a.K(th4);
                            }
                            tVar22.b(K8);
                            break;
                        default:
                            d dVar5 = dVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                e eVar = (e) dVar5;
                                eVar.getClass();
                                P0.b bVar = (P0.b) eVar.f1784d;
                                bVar.getClass();
                                LinkedHashMap linkedHashMap = bVar.f2283a;
                                P0.a aVar = (P0.a) linkedHashMap.get(str2);
                                if (aVar != null) {
                                    Activity activity = aVar.f2280b;
                                    if (activity != null) {
                                        activity.unbindService(aVar);
                                    }
                                    aVar.f2281c = null;
                                    aVar.f2282d = false;
                                    linkedHashMap.remove(str2);
                                }
                                K9 = K1.b.W(null);
                            } catch (Throwable th5) {
                                K9 = AbstractC0169a.K(th5);
                            }
                            tVar22.b(K9);
                            break;
                    }
                }
            });
        }
    }
}
