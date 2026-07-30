package x4;

import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.ArrayList;
import java.util.HashMap;
import s1.ComponentCallbacks2C0872c;
import s4.InterfaceC0893b;

/* loaded from: classes.dex */
public interface j {
    static void b(s4.f fVar, final C1009d c1009d) {
        m mVar = m.f8371d;
        P0.i iVar = new P0.i(fVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", mVar, null);
        if (c1009d != null) {
            final int i2 = 0;
            iVar.m(new InterfaceC0893b(c1009d) { // from class: x4.g

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ j f8362e;

                {
                    this.f8362e = c1009d;
                }

                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e eVar) {
                    switch (i2) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            final String str = (String) arrayList2.get(0);
                            final Boolean bool = (Boolean) arrayList2.get(1);
                            h hVar = new h(arrayList, eVar, 0);
                            ((C1009d) this.f8362e).getClass();
                            final K1.h hVar2 = new K1.h();
                            final int i5 = 1;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: x4.a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i7 = i5;
                                    K1.h hVar3 = hVar2;
                                    Boolean bool2 = bool;
                                    String str2 = str;
                                    switch (i7) {
                                        case 0:
                                            HashMap hashMap = C1009d.f8340i;
                                            try {
                                                P1.g f7 = P1.g.f(str2);
                                                boolean booleanValue = bool2.booleanValue();
                                                f7.a();
                                                if (f7.f2274e.compareAndSet(!booleanValue, booleanValue)) {
                                                    boolean z7 = ComponentCallbacks2C0872c.f7638m.f7639d.get();
                                                    if (booleanValue && z7) {
                                                        f7.k(true);
                                                    } else if (!booleanValue && z7) {
                                                        f7.k(false);
                                                    }
                                                }
                                                hVar3.b(null);
                                                break;
                                            } catch (Exception e7) {
                                                hVar3.a(e7);
                                                return;
                                            }
                                        default:
                                            HashMap hashMap2 = C1009d.f8340i;
                                            try {
                                                P1.g.f(str2).l(bool2);
                                                hVar3.b(null);
                                                break;
                                            } catch (Exception e8) {
                                                hVar3.a(e8);
                                            }
                                    }
                                }
                            });
                            hVar2.f1428a.addOnCompleteListener(new A4.b(16, hVar));
                            break;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            final String str2 = (String) arrayList4.get(0);
                            final Boolean bool2 = (Boolean) arrayList4.get(1);
                            i iVar2 = new i(arrayList3, eVar, 0);
                            ((C1009d) this.f8362e).getClass();
                            final K1.h hVar3 = new K1.h();
                            final int i7 = 0;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: x4.a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i72 = i7;
                                    K1.h hVar32 = hVar3;
                                    Boolean bool22 = bool2;
                                    String str22 = str2;
                                    switch (i72) {
                                        case 0:
                                            HashMap hashMap = C1009d.f8340i;
                                            try {
                                                P1.g f7 = P1.g.f(str22);
                                                boolean booleanValue = bool22.booleanValue();
                                                f7.a();
                                                if (f7.f2274e.compareAndSet(!booleanValue, booleanValue)) {
                                                    boolean z7 = ComponentCallbacks2C0872c.f7638m.f7639d.get();
                                                    if (booleanValue && z7) {
                                                        f7.k(true);
                                                    } else if (!booleanValue && z7) {
                                                        f7.k(false);
                                                    }
                                                }
                                                hVar32.b(null);
                                                break;
                                            } catch (Exception e7) {
                                                hVar32.a(e7);
                                                return;
                                            }
                                        default:
                                            HashMap hashMap2 = C1009d.f8340i;
                                            try {
                                                P1.g.f(str22).l(bool22);
                                                hVar32.b(null);
                                                break;
                                            } catch (Exception e8) {
                                                hVar32.a(e8);
                                            }
                                    }
                                }
                            });
                            hVar3.f1428a.addOnCompleteListener(new A4.b(16, iVar2));
                            break;
                        default:
                            ArrayList arrayList5 = new ArrayList();
                            String str3 = (String) ((ArrayList) obj).get(0);
                            P0.c cVar = new P0.c(arrayList5, 15, eVar);
                            ((C1009d) this.f8362e).getClass();
                            K1.h hVar4 = new K1.h();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new A.j(str3, 25, hVar4));
                            hVar4.f1428a.addOnCompleteListener(new A4.b(16, cVar));
                            break;
                    }
                }
            });
        } else {
            iVar.m(null);
        }
        P0.i iVar2 = new P0.i(fVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", mVar, null);
        if (c1009d != null) {
            final int i5 = 1;
            iVar2.m(new InterfaceC0893b(c1009d) { // from class: x4.g

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ j f8362e;

                {
                    this.f8362e = c1009d;
                }

                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e eVar) {
                    switch (i5) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            final String str = (String) arrayList2.get(0);
                            final Boolean bool = (Boolean) arrayList2.get(1);
                            h hVar = new h(arrayList, eVar, 0);
                            ((C1009d) this.f8362e).getClass();
                            final K1.h hVar2 = new K1.h();
                            final int i52 = 1;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: x4.a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i72 = i52;
                                    K1.h hVar32 = hVar2;
                                    Boolean bool22 = bool;
                                    String str22 = str;
                                    switch (i72) {
                                        case 0:
                                            HashMap hashMap = C1009d.f8340i;
                                            try {
                                                P1.g f7 = P1.g.f(str22);
                                                boolean booleanValue = bool22.booleanValue();
                                                f7.a();
                                                if (f7.f2274e.compareAndSet(!booleanValue, booleanValue)) {
                                                    boolean z7 = ComponentCallbacks2C0872c.f7638m.f7639d.get();
                                                    if (booleanValue && z7) {
                                                        f7.k(true);
                                                    } else if (!booleanValue && z7) {
                                                        f7.k(false);
                                                    }
                                                }
                                                hVar32.b(null);
                                                break;
                                            } catch (Exception e7) {
                                                hVar32.a(e7);
                                                return;
                                            }
                                        default:
                                            HashMap hashMap2 = C1009d.f8340i;
                                            try {
                                                P1.g.f(str22).l(bool22);
                                                hVar32.b(null);
                                                break;
                                            } catch (Exception e8) {
                                                hVar32.a(e8);
                                            }
                                    }
                                }
                            });
                            hVar2.f1428a.addOnCompleteListener(new A4.b(16, hVar));
                            break;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            final String str2 = (String) arrayList4.get(0);
                            final Boolean bool2 = (Boolean) arrayList4.get(1);
                            i iVar22 = new i(arrayList3, eVar, 0);
                            ((C1009d) this.f8362e).getClass();
                            final K1.h hVar3 = new K1.h();
                            final int i7 = 0;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: x4.a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i72 = i7;
                                    K1.h hVar32 = hVar3;
                                    Boolean bool22 = bool2;
                                    String str22 = str2;
                                    switch (i72) {
                                        case 0:
                                            HashMap hashMap = C1009d.f8340i;
                                            try {
                                                P1.g f7 = P1.g.f(str22);
                                                boolean booleanValue = bool22.booleanValue();
                                                f7.a();
                                                if (f7.f2274e.compareAndSet(!booleanValue, booleanValue)) {
                                                    boolean z7 = ComponentCallbacks2C0872c.f7638m.f7639d.get();
                                                    if (booleanValue && z7) {
                                                        f7.k(true);
                                                    } else if (!booleanValue && z7) {
                                                        f7.k(false);
                                                    }
                                                }
                                                hVar32.b(null);
                                                break;
                                            } catch (Exception e7) {
                                                hVar32.a(e7);
                                                return;
                                            }
                                        default:
                                            HashMap hashMap2 = C1009d.f8340i;
                                            try {
                                                P1.g.f(str22).l(bool22);
                                                hVar32.b(null);
                                                break;
                                            } catch (Exception e8) {
                                                hVar32.a(e8);
                                            }
                                    }
                                }
                            });
                            hVar3.f1428a.addOnCompleteListener(new A4.b(16, iVar22));
                            break;
                        default:
                            ArrayList arrayList5 = new ArrayList();
                            String str3 = (String) ((ArrayList) obj).get(0);
                            P0.c cVar = new P0.c(arrayList5, 15, eVar);
                            ((C1009d) this.f8362e).getClass();
                            K1.h hVar4 = new K1.h();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new A.j(str3, 25, hVar4));
                            hVar4.f1428a.addOnCompleteListener(new A4.b(16, cVar));
                            break;
                    }
                }
            });
        } else {
            iVar2.m(null);
        }
        P0.i iVar3 = new P0.i(fVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.delete", mVar, null);
        if (c1009d == null) {
            iVar3.m(null);
        } else {
            final int i7 = 2;
            iVar3.m(new InterfaceC0893b(c1009d) { // from class: x4.g

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ j f8362e;

                {
                    this.f8362e = c1009d;
                }

                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e eVar) {
                    switch (i7) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            final String str = (String) arrayList2.get(0);
                            final Boolean bool = (Boolean) arrayList2.get(1);
                            h hVar = new h(arrayList, eVar, 0);
                            ((C1009d) this.f8362e).getClass();
                            final K1.h hVar2 = new K1.h();
                            final int i52 = 1;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: x4.a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i72 = i52;
                                    K1.h hVar32 = hVar2;
                                    Boolean bool22 = bool;
                                    String str22 = str;
                                    switch (i72) {
                                        case 0:
                                            HashMap hashMap = C1009d.f8340i;
                                            try {
                                                P1.g f7 = P1.g.f(str22);
                                                boolean booleanValue = bool22.booleanValue();
                                                f7.a();
                                                if (f7.f2274e.compareAndSet(!booleanValue, booleanValue)) {
                                                    boolean z7 = ComponentCallbacks2C0872c.f7638m.f7639d.get();
                                                    if (booleanValue && z7) {
                                                        f7.k(true);
                                                    } else if (!booleanValue && z7) {
                                                        f7.k(false);
                                                    }
                                                }
                                                hVar32.b(null);
                                                break;
                                            } catch (Exception e7) {
                                                hVar32.a(e7);
                                                return;
                                            }
                                        default:
                                            HashMap hashMap2 = C1009d.f8340i;
                                            try {
                                                P1.g.f(str22).l(bool22);
                                                hVar32.b(null);
                                                break;
                                            } catch (Exception e8) {
                                                hVar32.a(e8);
                                            }
                                    }
                                }
                            });
                            hVar2.f1428a.addOnCompleteListener(new A4.b(16, hVar));
                            break;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            final String str2 = (String) arrayList4.get(0);
                            final Boolean bool2 = (Boolean) arrayList4.get(1);
                            i iVar22 = new i(arrayList3, eVar, 0);
                            ((C1009d) this.f8362e).getClass();
                            final K1.h hVar3 = new K1.h();
                            final int i72 = 0;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: x4.a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i722 = i72;
                                    K1.h hVar32 = hVar3;
                                    Boolean bool22 = bool2;
                                    String str22 = str2;
                                    switch (i722) {
                                        case 0:
                                            HashMap hashMap = C1009d.f8340i;
                                            try {
                                                P1.g f7 = P1.g.f(str22);
                                                boolean booleanValue = bool22.booleanValue();
                                                f7.a();
                                                if (f7.f2274e.compareAndSet(!booleanValue, booleanValue)) {
                                                    boolean z7 = ComponentCallbacks2C0872c.f7638m.f7639d.get();
                                                    if (booleanValue && z7) {
                                                        f7.k(true);
                                                    } else if (!booleanValue && z7) {
                                                        f7.k(false);
                                                    }
                                                }
                                                hVar32.b(null);
                                                break;
                                            } catch (Exception e7) {
                                                hVar32.a(e7);
                                                return;
                                            }
                                        default:
                                            HashMap hashMap2 = C1009d.f8340i;
                                            try {
                                                P1.g.f(str22).l(bool22);
                                                hVar32.b(null);
                                                break;
                                            } catch (Exception e8) {
                                                hVar32.a(e8);
                                            }
                                    }
                                }
                            });
                            hVar3.f1428a.addOnCompleteListener(new A4.b(16, iVar22));
                            break;
                        default:
                            ArrayList arrayList5 = new ArrayList();
                            String str3 = (String) ((ArrayList) obj).get(0);
                            P0.c cVar = new P0.c(arrayList5, 15, eVar);
                            ((C1009d) this.f8362e).getClass();
                            K1.h hVar4 = new K1.h();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new A.j(str3, 25, hVar4));
                            hVar4.f1428a.addOnCompleteListener(new A4.b(16, cVar));
                            break;
                    }
                }
            });
        }
    }
}
