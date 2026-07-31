package A0;

import B0.C0000a;
import F.C0032n;
import H.k;
import N.P;
import a.AbstractC0086a;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import r0.InterfaceC0225a;
import v0.C0244i;
import v0.InterfaceC0237b;
import v0.InterfaceC0241f;

/* loaded from: classes.dex */
public class d implements InterfaceC0225a {

    /* renamed from: e, reason: collision with root package name */
    public Context f5e;

    public static void b(InterfaceC0241f interfaceC0241f, final d dVar) {
        C0000a g2 = interfaceC0241f.g(new C0244i());
        b bVar = b.f2d;
        C0032n c0032n = new C0032n(interfaceC0241f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", bVar, g2);
        if (dVar != null) {
            final int i2 = 0;
            c0032n.j(new InterfaceC0237b(dVar) { // from class: A0.a

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ d f1f;

                {
                    this.f1f = dVar;
                }

                @Override // v0.InterfaceC0237b
                public final void a(Object obj, P p2) {
                    switch (i2) {
                        case 0:
                            d dVar2 = this.f1f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5e.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.L(th);
                            }
                            p2.n(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f1f;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f5e;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0086a.L(th2);
                            }
                            p2.n(arrayList2);
                            break;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            d dVar4 = this.f1f;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f5e;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0086a.L(th3);
                            }
                            p2.n(arrayList3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            d dVar5 = this.f1f;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5e.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0086a.L(th4);
                            }
                            p2.n(arrayList4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            d dVar6 = this.f1f;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f5e.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0086a.L(th5);
                            }
                            p2.n(arrayList5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            d dVar7 = this.f1f;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f5e.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0086a.L(th6);
                            }
                            p2.n(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f1f;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0086a.L(th7);
                            }
                            p2.n(arrayList8);
                            break;
                    }
                }
            });
        } else {
            c0032n.j(null);
        }
        C0032n c0032n2 = new C0032n(interfaceC0241f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", bVar, g2);
        if (dVar != null) {
            final int i3 = 1;
            c0032n2.j(new InterfaceC0237b(dVar) { // from class: A0.a

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ d f1f;

                {
                    this.f1f = dVar;
                }

                @Override // v0.InterfaceC0237b
                public final void a(Object obj, P p2) {
                    switch (i3) {
                        case 0:
                            d dVar2 = this.f1f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5e.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.L(th);
                            }
                            p2.n(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f1f;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f5e;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0086a.L(th2);
                            }
                            p2.n(arrayList2);
                            break;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            d dVar4 = this.f1f;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f5e;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0086a.L(th3);
                            }
                            p2.n(arrayList3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            d dVar5 = this.f1f;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5e.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0086a.L(th4);
                            }
                            p2.n(arrayList4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            d dVar6 = this.f1f;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f5e.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0086a.L(th5);
                            }
                            p2.n(arrayList5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            d dVar7 = this.f1f;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f5e.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0086a.L(th6);
                            }
                            p2.n(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f1f;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0086a.L(th7);
                            }
                            p2.n(arrayList8);
                            break;
                    }
                }
            });
        } else {
            c0032n2.j(null);
        }
        C0032n c0032n3 = new C0032n(interfaceC0241f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", bVar, g2);
        if (dVar != null) {
            final int i4 = 2;
            c0032n3.j(new InterfaceC0237b(dVar) { // from class: A0.a

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ d f1f;

                {
                    this.f1f = dVar;
                }

                @Override // v0.InterfaceC0237b
                public final void a(Object obj, P p2) {
                    switch (i4) {
                        case 0:
                            d dVar2 = this.f1f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5e.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.L(th);
                            }
                            p2.n(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f1f;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f5e;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0086a.L(th2);
                            }
                            p2.n(arrayList2);
                            break;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            d dVar4 = this.f1f;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f5e;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0086a.L(th3);
                            }
                            p2.n(arrayList3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            d dVar5 = this.f1f;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5e.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0086a.L(th4);
                            }
                            p2.n(arrayList4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            d dVar6 = this.f1f;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f5e.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0086a.L(th5);
                            }
                            p2.n(arrayList5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            d dVar7 = this.f1f;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f5e.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0086a.L(th6);
                            }
                            p2.n(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f1f;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0086a.L(th7);
                            }
                            p2.n(arrayList8);
                            break;
                    }
                }
            });
        } else {
            c0032n3.j(null);
        }
        C0032n c0032n4 = new C0032n(interfaceC0241f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", bVar, g2);
        if (dVar != null) {
            final int i5 = 3;
            c0032n4.j(new InterfaceC0237b(dVar) { // from class: A0.a

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ d f1f;

                {
                    this.f1f = dVar;
                }

                @Override // v0.InterfaceC0237b
                public final void a(Object obj, P p2) {
                    switch (i5) {
                        case 0:
                            d dVar2 = this.f1f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5e.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.L(th);
                            }
                            p2.n(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f1f;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f5e;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0086a.L(th2);
                            }
                            p2.n(arrayList2);
                            break;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            d dVar4 = this.f1f;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f5e;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0086a.L(th3);
                            }
                            p2.n(arrayList3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            d dVar5 = this.f1f;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5e.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0086a.L(th4);
                            }
                            p2.n(arrayList4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            d dVar6 = this.f1f;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f5e.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0086a.L(th5);
                            }
                            p2.n(arrayList5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            d dVar7 = this.f1f;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f5e.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0086a.L(th6);
                            }
                            p2.n(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f1f;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0086a.L(th7);
                            }
                            p2.n(arrayList8);
                            break;
                    }
                }
            });
        } else {
            c0032n4.j(null);
        }
        C0032n c0032n5 = new C0032n(interfaceC0241f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", bVar, g2);
        if (dVar != null) {
            final int i6 = 4;
            c0032n5.j(new InterfaceC0237b(dVar) { // from class: A0.a

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ d f1f;

                {
                    this.f1f = dVar;
                }

                @Override // v0.InterfaceC0237b
                public final void a(Object obj, P p2) {
                    switch (i6) {
                        case 0:
                            d dVar2 = this.f1f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5e.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.L(th);
                            }
                            p2.n(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f1f;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f5e;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0086a.L(th2);
                            }
                            p2.n(arrayList2);
                            break;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            d dVar4 = this.f1f;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f5e;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0086a.L(th3);
                            }
                            p2.n(arrayList3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            d dVar5 = this.f1f;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5e.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0086a.L(th4);
                            }
                            p2.n(arrayList4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            d dVar6 = this.f1f;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f5e.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0086a.L(th5);
                            }
                            p2.n(arrayList5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            d dVar7 = this.f1f;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f5e.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0086a.L(th6);
                            }
                            p2.n(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f1f;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0086a.L(th7);
                            }
                            p2.n(arrayList8);
                            break;
                    }
                }
            });
        } else {
            c0032n5.j(null);
        }
        C0032n c0032n6 = new C0032n(interfaceC0241f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", bVar, g2);
        if (dVar != null) {
            final int i7 = 5;
            c0032n6.j(new InterfaceC0237b(dVar) { // from class: A0.a

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ d f1f;

                {
                    this.f1f = dVar;
                }

                @Override // v0.InterfaceC0237b
                public final void a(Object obj, P p2) {
                    switch (i7) {
                        case 0:
                            d dVar2 = this.f1f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5e.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.L(th);
                            }
                            p2.n(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f1f;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f5e;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0086a.L(th2);
                            }
                            p2.n(arrayList2);
                            break;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            d dVar4 = this.f1f;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f5e;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0086a.L(th3);
                            }
                            p2.n(arrayList3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            d dVar5 = this.f1f;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5e.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0086a.L(th4);
                            }
                            p2.n(arrayList4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            d dVar6 = this.f1f;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f5e.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0086a.L(th5);
                            }
                            p2.n(arrayList5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            d dVar7 = this.f1f;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f5e.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0086a.L(th6);
                            }
                            p2.n(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f1f;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0086a.L(th7);
                            }
                            p2.n(arrayList8);
                            break;
                    }
                }
            });
        } else {
            c0032n6.j(null);
        }
        C0032n c0032n7 = new C0032n(interfaceC0241f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", bVar, g2);
        if (dVar == null) {
            c0032n7.j(null);
        } else {
            final int i8 = 6;
            c0032n7.j(new InterfaceC0237b(dVar) { // from class: A0.a

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ d f1f;

                {
                    this.f1f = dVar;
                }

                @Override // v0.InterfaceC0237b
                public final void a(Object obj, P p2) {
                    switch (i8) {
                        case 0:
                            d dVar2 = this.f1f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5e.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.L(th);
                            }
                            p2.n(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f1f;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f5e;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0086a.L(th2);
                            }
                            p2.n(arrayList2);
                            break;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            d dVar4 = this.f1f;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f5e;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0086a.L(th3);
                            }
                            p2.n(arrayList3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            d dVar5 = this.f1f;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5e.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0086a.L(th4);
                            }
                            p2.n(arrayList4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            d dVar6 = this.f1f;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f5e.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0086a.L(th5);
                            }
                            p2.n(arrayList5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            d dVar7 = this.f1f;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f5e.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0086a.L(th6);
                            }
                            p2.n(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f1f;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0086a.L(th7);
                            }
                            p2.n(arrayList8);
                            break;
                    }
                }
            });
        }
    }

    public final ArrayList a(c cVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        Context context = this.f5e;
        switch (cVar.ordinal()) {
            case 0:
                str = null;
                break;
            case 1:
                str = "music";
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                str = "podcasts";
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "ringtones";
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                str = "alarms";
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                str = "notifications";
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "pictures";
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "movies";
                break;
            case k.BYTES_FIELD_NUMBER /* 8 */:
                str = "downloads";
                break;
            case 9:
                str = "dcim";
                break;
            case 10:
                str = "documents";
                break;
            default:
                throw new RuntimeException("Unrecognized directory: " + cVar);
        }
        for (File file : context.getExternalFilesDirs(str)) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    @Override // r0.InterfaceC0225a
    public final void c(P p2) {
        InterfaceC0241f interfaceC0241f = (InterfaceC0241f) p2.f699g;
        Context context = (Context) p2.f698f;
        try {
            b(interfaceC0241f, this);
        } catch (Exception e2) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e2);
        }
        this.f5e = context;
    }

    @Override // r0.InterfaceC0225a
    public final void i(P p2) {
        b((InterfaceC0241f) p2.f699g, null);
    }
}
