package x4;

import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import s4.InterfaceC0893b;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public interface l {
    static void a(s4.f fVar, final C1009d c1009d) {
        m mVar = m.f8371d;
        P0.i iVar = new P0.i(fVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseCoreHostApi.initializeApp", mVar, null);
        if (c1009d != null) {
            final int i2 = 0;
            iVar.m(new InterfaceC0893b(c1009d) { // from class: x4.k

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ l f8370e;

                {
                    this.f8370e = c1009d;
                }

                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e eVar) {
                    switch (i2) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            String str = (String) arrayList2.get(0);
                            C1010e c1010e = (C1010e) arrayList2.get(1);
                            P0.e eVar2 = new P0.e(14, arrayList, eVar, false);
                            C1009d c1009d2 = (C1009d) this.f8370e;
                            c1009d2.getClass();
                            K1.h hVar = new K1.h();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.appsflyer.internal.o(c1009d2, c1010e, str, hVar, 2));
                            hVar.f1428a.addOnCompleteListener(new A4.b(17, eVar2));
                            break;
                        case 1:
                            h hVar2 = new h(new ArrayList(), eVar, 1);
                            final C1009d c1009d3 = (C1009d) this.f8370e;
                            c1009d3.getClass();
                            final K1.h hVar3 = new K1.h();
                            final int i5 = 1;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: x4.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ArrayList arrayList3;
                                    switch (i5) {
                                        case 0:
                                            C1009d c1009d4 = c1009d3;
                                            K1.h hVar4 = hVar3;
                                            HashMap hashMap = C1009d.f8340i;
                                            c1009d4.getClass();
                                            try {
                                                P1.h a7 = P1.h.a(c1009d4.f8341d);
                                                if (a7 == null) {
                                                    hVar4.a(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
                                                } else {
                                                    hVar4.b(C1009d.c(a7));
                                                }
                                                return;
                                            } catch (Exception e7) {
                                                hVar4.a(e7);
                                                return;
                                            }
                                        default:
                                            C1009d c1009d5 = c1009d3;
                                            K1.h hVar5 = hVar3;
                                            HashMap hashMap2 = C1009d.f8340i;
                                            c1009d5.getClass();
                                            try {
                                                if (c1009d5.f8342e) {
                                                    AbstractC1053a.e(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                                                } else {
                                                    c1009d5.f8342e = true;
                                                }
                                                synchronized (P1.g.f2268k) {
                                                    arrayList3 = new ArrayList(P1.g.f2269l.values());
                                                }
                                                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                                                int size = arrayList3.size();
                                                int i7 = 0;
                                                while (i7 < size) {
                                                    Object obj2 = arrayList3.get(i7);
                                                    i7++;
                                                    K1.h hVar6 = new K1.h();
                                                    FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC1008c(c1009d5, (P1.g) obj2, hVar6));
                                                    arrayList4.add((f) AbstractC1053a.e(hVar6.f1428a));
                                                }
                                                hVar5.b(arrayList4);
                                                return;
                                            } catch (Exception e8) {
                                                hVar5.a(e8);
                                                return;
                                            }
                                    }
                                }
                            });
                            hVar3.f1428a.addOnCompleteListener(new A4.b(17, hVar2));
                            break;
                        default:
                            i iVar2 = new i(new ArrayList(), eVar, 1);
                            final C1009d c1009d4 = (C1009d) this.f8370e;
                            c1009d4.getClass();
                            final K1.h hVar4 = new K1.h();
                            final int i7 = 0;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: x4.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ArrayList arrayList3;
                                    switch (i7) {
                                        case 0:
                                            C1009d c1009d42 = c1009d4;
                                            K1.h hVar42 = hVar4;
                                            HashMap hashMap = C1009d.f8340i;
                                            c1009d42.getClass();
                                            try {
                                                P1.h a7 = P1.h.a(c1009d42.f8341d);
                                                if (a7 == null) {
                                                    hVar42.a(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
                                                } else {
                                                    hVar42.b(C1009d.c(a7));
                                                }
                                                return;
                                            } catch (Exception e7) {
                                                hVar42.a(e7);
                                                return;
                                            }
                                        default:
                                            C1009d c1009d5 = c1009d4;
                                            K1.h hVar5 = hVar4;
                                            HashMap hashMap2 = C1009d.f8340i;
                                            c1009d5.getClass();
                                            try {
                                                if (c1009d5.f8342e) {
                                                    AbstractC1053a.e(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                                                } else {
                                                    c1009d5.f8342e = true;
                                                }
                                                synchronized (P1.g.f2268k) {
                                                    arrayList3 = new ArrayList(P1.g.f2269l.values());
                                                }
                                                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                                                int size = arrayList3.size();
                                                int i72 = 0;
                                                while (i72 < size) {
                                                    Object obj2 = arrayList3.get(i72);
                                                    i72++;
                                                    K1.h hVar6 = new K1.h();
                                                    FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC1008c(c1009d5, (P1.g) obj2, hVar6));
                                                    arrayList4.add((f) AbstractC1053a.e(hVar6.f1428a));
                                                }
                                                hVar5.b(arrayList4);
                                                return;
                                            } catch (Exception e8) {
                                                hVar5.a(e8);
                                                return;
                                            }
                                    }
                                }
                            });
                            hVar4.f1428a.addOnCompleteListener(new A4.b(17, iVar2));
                            break;
                    }
                }
            });
        } else {
            iVar.m(null);
        }
        P0.i iVar2 = new P0.i(fVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseCoreHostApi.initializeCore", mVar, null);
        if (c1009d != null) {
            final int i5 = 1;
            iVar2.m(new InterfaceC0893b(c1009d) { // from class: x4.k

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ l f8370e;

                {
                    this.f8370e = c1009d;
                }

                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e eVar) {
                    switch (i5) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            String str = (String) arrayList2.get(0);
                            C1010e c1010e = (C1010e) arrayList2.get(1);
                            P0.e eVar2 = new P0.e(14, arrayList, eVar, false);
                            C1009d c1009d2 = (C1009d) this.f8370e;
                            c1009d2.getClass();
                            K1.h hVar = new K1.h();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.appsflyer.internal.o(c1009d2, c1010e, str, hVar, 2));
                            hVar.f1428a.addOnCompleteListener(new A4.b(17, eVar2));
                            break;
                        case 1:
                            h hVar2 = new h(new ArrayList(), eVar, 1);
                            final C1009d c1009d3 = (C1009d) this.f8370e;
                            c1009d3.getClass();
                            final K1.h hVar3 = new K1.h();
                            final int i52 = 1;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: x4.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ArrayList arrayList3;
                                    switch (i52) {
                                        case 0:
                                            C1009d c1009d42 = c1009d3;
                                            K1.h hVar42 = hVar3;
                                            HashMap hashMap = C1009d.f8340i;
                                            c1009d42.getClass();
                                            try {
                                                P1.h a7 = P1.h.a(c1009d42.f8341d);
                                                if (a7 == null) {
                                                    hVar42.a(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
                                                } else {
                                                    hVar42.b(C1009d.c(a7));
                                                }
                                                return;
                                            } catch (Exception e7) {
                                                hVar42.a(e7);
                                                return;
                                            }
                                        default:
                                            C1009d c1009d5 = c1009d3;
                                            K1.h hVar5 = hVar3;
                                            HashMap hashMap2 = C1009d.f8340i;
                                            c1009d5.getClass();
                                            try {
                                                if (c1009d5.f8342e) {
                                                    AbstractC1053a.e(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                                                } else {
                                                    c1009d5.f8342e = true;
                                                }
                                                synchronized (P1.g.f2268k) {
                                                    arrayList3 = new ArrayList(P1.g.f2269l.values());
                                                }
                                                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                                                int size = arrayList3.size();
                                                int i72 = 0;
                                                while (i72 < size) {
                                                    Object obj2 = arrayList3.get(i72);
                                                    i72++;
                                                    K1.h hVar6 = new K1.h();
                                                    FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC1008c(c1009d5, (P1.g) obj2, hVar6));
                                                    arrayList4.add((f) AbstractC1053a.e(hVar6.f1428a));
                                                }
                                                hVar5.b(arrayList4);
                                                return;
                                            } catch (Exception e8) {
                                                hVar5.a(e8);
                                                return;
                                            }
                                    }
                                }
                            });
                            hVar3.f1428a.addOnCompleteListener(new A4.b(17, hVar2));
                            break;
                        default:
                            i iVar22 = new i(new ArrayList(), eVar, 1);
                            final C1009d c1009d4 = (C1009d) this.f8370e;
                            c1009d4.getClass();
                            final K1.h hVar4 = new K1.h();
                            final int i7 = 0;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: x4.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ArrayList arrayList3;
                                    switch (i7) {
                                        case 0:
                                            C1009d c1009d42 = c1009d4;
                                            K1.h hVar42 = hVar4;
                                            HashMap hashMap = C1009d.f8340i;
                                            c1009d42.getClass();
                                            try {
                                                P1.h a7 = P1.h.a(c1009d42.f8341d);
                                                if (a7 == null) {
                                                    hVar42.a(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
                                                } else {
                                                    hVar42.b(C1009d.c(a7));
                                                }
                                                return;
                                            } catch (Exception e7) {
                                                hVar42.a(e7);
                                                return;
                                            }
                                        default:
                                            C1009d c1009d5 = c1009d4;
                                            K1.h hVar5 = hVar4;
                                            HashMap hashMap2 = C1009d.f8340i;
                                            c1009d5.getClass();
                                            try {
                                                if (c1009d5.f8342e) {
                                                    AbstractC1053a.e(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                                                } else {
                                                    c1009d5.f8342e = true;
                                                }
                                                synchronized (P1.g.f2268k) {
                                                    arrayList3 = new ArrayList(P1.g.f2269l.values());
                                                }
                                                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                                                int size = arrayList3.size();
                                                int i72 = 0;
                                                while (i72 < size) {
                                                    Object obj2 = arrayList3.get(i72);
                                                    i72++;
                                                    K1.h hVar6 = new K1.h();
                                                    FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC1008c(c1009d5, (P1.g) obj2, hVar6));
                                                    arrayList4.add((f) AbstractC1053a.e(hVar6.f1428a));
                                                }
                                                hVar5.b(arrayList4);
                                                return;
                                            } catch (Exception e8) {
                                                hVar5.a(e8);
                                                return;
                                            }
                                    }
                                }
                            });
                            hVar4.f1428a.addOnCompleteListener(new A4.b(17, iVar22));
                            break;
                    }
                }
            });
        } else {
            iVar2.m(null);
        }
        P0.i iVar3 = new P0.i(fVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseCoreHostApi.optionsFromResource", mVar, null);
        if (c1009d == null) {
            iVar3.m(null);
        } else {
            final int i7 = 2;
            iVar3.m(new InterfaceC0893b(c1009d) { // from class: x4.k

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ l f8370e;

                {
                    this.f8370e = c1009d;
                }

                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e eVar) {
                    switch (i7) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            String str = (String) arrayList2.get(0);
                            C1010e c1010e = (C1010e) arrayList2.get(1);
                            P0.e eVar2 = new P0.e(14, arrayList, eVar, false);
                            C1009d c1009d2 = (C1009d) this.f8370e;
                            c1009d2.getClass();
                            K1.h hVar = new K1.h();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.appsflyer.internal.o(c1009d2, c1010e, str, hVar, 2));
                            hVar.f1428a.addOnCompleteListener(new A4.b(17, eVar2));
                            break;
                        case 1:
                            h hVar2 = new h(new ArrayList(), eVar, 1);
                            final C1009d c1009d3 = (C1009d) this.f8370e;
                            c1009d3.getClass();
                            final K1.h hVar3 = new K1.h();
                            final int i52 = 1;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: x4.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ArrayList arrayList3;
                                    switch (i52) {
                                        case 0:
                                            C1009d c1009d42 = c1009d3;
                                            K1.h hVar42 = hVar3;
                                            HashMap hashMap = C1009d.f8340i;
                                            c1009d42.getClass();
                                            try {
                                                P1.h a7 = P1.h.a(c1009d42.f8341d);
                                                if (a7 == null) {
                                                    hVar42.a(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
                                                } else {
                                                    hVar42.b(C1009d.c(a7));
                                                }
                                                return;
                                            } catch (Exception e7) {
                                                hVar42.a(e7);
                                                return;
                                            }
                                        default:
                                            C1009d c1009d5 = c1009d3;
                                            K1.h hVar5 = hVar3;
                                            HashMap hashMap2 = C1009d.f8340i;
                                            c1009d5.getClass();
                                            try {
                                                if (c1009d5.f8342e) {
                                                    AbstractC1053a.e(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                                                } else {
                                                    c1009d5.f8342e = true;
                                                }
                                                synchronized (P1.g.f2268k) {
                                                    arrayList3 = new ArrayList(P1.g.f2269l.values());
                                                }
                                                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                                                int size = arrayList3.size();
                                                int i72 = 0;
                                                while (i72 < size) {
                                                    Object obj2 = arrayList3.get(i72);
                                                    i72++;
                                                    K1.h hVar6 = new K1.h();
                                                    FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC1008c(c1009d5, (P1.g) obj2, hVar6));
                                                    arrayList4.add((f) AbstractC1053a.e(hVar6.f1428a));
                                                }
                                                hVar5.b(arrayList4);
                                                return;
                                            } catch (Exception e8) {
                                                hVar5.a(e8);
                                                return;
                                            }
                                    }
                                }
                            });
                            hVar3.f1428a.addOnCompleteListener(new A4.b(17, hVar2));
                            break;
                        default:
                            i iVar22 = new i(new ArrayList(), eVar, 1);
                            final C1009d c1009d4 = (C1009d) this.f8370e;
                            c1009d4.getClass();
                            final K1.h hVar4 = new K1.h();
                            final int i72 = 0;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: x4.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ArrayList arrayList3;
                                    switch (i72) {
                                        case 0:
                                            C1009d c1009d42 = c1009d4;
                                            K1.h hVar42 = hVar4;
                                            HashMap hashMap = C1009d.f8340i;
                                            c1009d42.getClass();
                                            try {
                                                P1.h a7 = P1.h.a(c1009d42.f8341d);
                                                if (a7 == null) {
                                                    hVar42.a(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
                                                } else {
                                                    hVar42.b(C1009d.c(a7));
                                                }
                                                return;
                                            } catch (Exception e7) {
                                                hVar42.a(e7);
                                                return;
                                            }
                                        default:
                                            C1009d c1009d5 = c1009d4;
                                            K1.h hVar5 = hVar4;
                                            HashMap hashMap2 = C1009d.f8340i;
                                            c1009d5.getClass();
                                            try {
                                                if (c1009d5.f8342e) {
                                                    AbstractC1053a.e(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                                                } else {
                                                    c1009d5.f8342e = true;
                                                }
                                                synchronized (P1.g.f2268k) {
                                                    arrayList3 = new ArrayList(P1.g.f2269l.values());
                                                }
                                                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                                                int size = arrayList3.size();
                                                int i722 = 0;
                                                while (i722 < size) {
                                                    Object obj2 = arrayList3.get(i722);
                                                    i722++;
                                                    K1.h hVar6 = new K1.h();
                                                    FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC1008c(c1009d5, (P1.g) obj2, hVar6));
                                                    arrayList4.add((f) AbstractC1053a.e(hVar6.f1428a));
                                                }
                                                hVar5.b(arrayList4);
                                                return;
                                            } catch (Exception e8) {
                                                hVar5.a(e8);
                                                return;
                                            }
                                    }
                                }
                            });
                            hVar4.f1428a.addOnCompleteListener(new A4.b(17, iVar22));
                            break;
                    }
                }
            });
        }
    }
}
