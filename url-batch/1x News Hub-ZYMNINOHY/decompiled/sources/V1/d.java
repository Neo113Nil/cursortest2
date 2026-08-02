package V1;

import B0.p;
import K0.j;
import P1.f;
import P1.k;
import V0.e;
import a.AbstractC0129a;
import android.content.Context;
import android.util.Log;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d implements L1.b {

    /* renamed from: a, reason: collision with root package name */
    public Context f1610a;

    public static void b(f fVar, final d dVar) {
        j e3 = fVar.e(new P1.j());
        b bVar = b.f1607a;
        p pVar = new p(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", (k) bVar, e3);
        if (dVar != null) {
            final int i3 = 0;
            pVar.i(new P1.b(dVar) { // from class: V1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f1606b;

                {
                    this.f1606b = dVar;
                }

                @Override // P1.b
                public final void a(Object obj, e eVar) {
                    switch (i3) {
                        case 0:
                            d dVar2 = this.f1606b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f1610a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0129a.I(th);
                            }
                            eVar.n(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f1606b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f1610a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0129a.I(th2);
                            }
                            eVar.n(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f1606b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f1610a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0129a.I(th3);
                            }
                            eVar.n(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f1606b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f1610a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0129a.I(th4);
                            }
                            eVar.n(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f1606b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f1610a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0129a.I(th5);
                            }
                            eVar.n(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f1606b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f1610a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0129a.I(th6);
                            }
                            eVar.n(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f1606b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0129a.I(th7);
                            }
                            eVar.n(arrayList8);
                            break;
                    }
                }
            });
        } else {
            pVar.i(null);
        }
        p pVar2 = new p(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", (k) bVar, e3);
        if (dVar != null) {
            final int i4 = 1;
            pVar2.i(new P1.b(dVar) { // from class: V1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f1606b;

                {
                    this.f1606b = dVar;
                }

                @Override // P1.b
                public final void a(Object obj, e eVar) {
                    switch (i4) {
                        case 0:
                            d dVar2 = this.f1606b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f1610a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0129a.I(th);
                            }
                            eVar.n(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f1606b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f1610a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0129a.I(th2);
                            }
                            eVar.n(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f1606b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f1610a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0129a.I(th3);
                            }
                            eVar.n(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f1606b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f1610a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0129a.I(th4);
                            }
                            eVar.n(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f1606b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f1610a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0129a.I(th5);
                            }
                            eVar.n(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f1606b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f1610a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0129a.I(th6);
                            }
                            eVar.n(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f1606b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0129a.I(th7);
                            }
                            eVar.n(arrayList8);
                            break;
                    }
                }
            });
        } else {
            pVar2.i(null);
        }
        p pVar3 = new p(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", (k) bVar, e3);
        if (dVar != null) {
            final int i5 = 2;
            pVar3.i(new P1.b(dVar) { // from class: V1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f1606b;

                {
                    this.f1606b = dVar;
                }

                @Override // P1.b
                public final void a(Object obj, e eVar) {
                    switch (i5) {
                        case 0:
                            d dVar2 = this.f1606b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f1610a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0129a.I(th);
                            }
                            eVar.n(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f1606b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f1610a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0129a.I(th2);
                            }
                            eVar.n(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f1606b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f1610a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0129a.I(th3);
                            }
                            eVar.n(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f1606b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f1610a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0129a.I(th4);
                            }
                            eVar.n(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f1606b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f1610a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0129a.I(th5);
                            }
                            eVar.n(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f1606b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f1610a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0129a.I(th6);
                            }
                            eVar.n(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f1606b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0129a.I(th7);
                            }
                            eVar.n(arrayList8);
                            break;
                    }
                }
            });
        } else {
            pVar3.i(null);
        }
        p pVar4 = new p(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", (k) bVar, e3);
        if (dVar != null) {
            final int i6 = 3;
            pVar4.i(new P1.b(dVar) { // from class: V1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f1606b;

                {
                    this.f1606b = dVar;
                }

                @Override // P1.b
                public final void a(Object obj, e eVar) {
                    switch (i6) {
                        case 0:
                            d dVar2 = this.f1606b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f1610a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0129a.I(th);
                            }
                            eVar.n(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f1606b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f1610a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0129a.I(th2);
                            }
                            eVar.n(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f1606b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f1610a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0129a.I(th3);
                            }
                            eVar.n(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f1606b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f1610a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0129a.I(th4);
                            }
                            eVar.n(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f1606b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f1610a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0129a.I(th5);
                            }
                            eVar.n(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f1606b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f1610a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0129a.I(th6);
                            }
                            eVar.n(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f1606b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0129a.I(th7);
                            }
                            eVar.n(arrayList8);
                            break;
                    }
                }
            });
        } else {
            pVar4.i(null);
        }
        p pVar5 = new p(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", (k) bVar, e3);
        if (dVar != null) {
            final int i7 = 4;
            pVar5.i(new P1.b(dVar) { // from class: V1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f1606b;

                {
                    this.f1606b = dVar;
                }

                @Override // P1.b
                public final void a(Object obj, e eVar) {
                    switch (i7) {
                        case 0:
                            d dVar2 = this.f1606b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f1610a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0129a.I(th);
                            }
                            eVar.n(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f1606b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f1610a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0129a.I(th2);
                            }
                            eVar.n(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f1606b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f1610a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0129a.I(th3);
                            }
                            eVar.n(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f1606b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f1610a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0129a.I(th4);
                            }
                            eVar.n(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f1606b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f1610a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0129a.I(th5);
                            }
                            eVar.n(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f1606b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f1610a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0129a.I(th6);
                            }
                            eVar.n(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f1606b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0129a.I(th7);
                            }
                            eVar.n(arrayList8);
                            break;
                    }
                }
            });
        } else {
            pVar5.i(null);
        }
        p pVar6 = new p(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", (k) bVar, e3);
        if (dVar != null) {
            final int i8 = 5;
            pVar6.i(new P1.b(dVar) { // from class: V1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f1606b;

                {
                    this.f1606b = dVar;
                }

                @Override // P1.b
                public final void a(Object obj, e eVar) {
                    switch (i8) {
                        case 0:
                            d dVar2 = this.f1606b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f1610a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0129a.I(th);
                            }
                            eVar.n(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f1606b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f1610a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0129a.I(th2);
                            }
                            eVar.n(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f1606b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f1610a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0129a.I(th3);
                            }
                            eVar.n(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f1606b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f1610a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0129a.I(th4);
                            }
                            eVar.n(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f1606b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f1610a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0129a.I(th5);
                            }
                            eVar.n(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f1606b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f1610a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0129a.I(th6);
                            }
                            eVar.n(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f1606b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0129a.I(th7);
                            }
                            eVar.n(arrayList8);
                            break;
                    }
                }
            });
        } else {
            pVar6.i(null);
        }
        p pVar7 = new p(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", (k) bVar, e3);
        if (dVar == null) {
            pVar7.i(null);
        } else {
            final int i9 = 6;
            pVar7.i(new P1.b(dVar) { // from class: V1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f1606b;

                {
                    this.f1606b = dVar;
                }

                @Override // P1.b
                public final void a(Object obj, e eVar) {
                    switch (i9) {
                        case 0:
                            d dVar2 = this.f1606b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f1610a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0129a.I(th);
                            }
                            eVar.n(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f1606b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f1610a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0129a.I(th2);
                            }
                            eVar.n(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f1606b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f1610a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0129a.I(th3);
                            }
                            eVar.n(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f1606b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f1610a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0129a.I(th4);
                            }
                            eVar.n(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f1606b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f1610a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0129a.I(th5);
                            }
                            eVar.n(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f1606b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f1610a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0129a.I(th6);
                            }
                            eVar.n(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f1606b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0129a.I(th7);
                            }
                            eVar.n(arrayList8);
                            break;
                    }
                }
            });
        }
    }

    public final ArrayList a(c cVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        Context context = this.f1610a;
        switch (cVar) {
            case ROOT:
                str = null;
                break;
            case MUSIC:
                str = "music";
                break;
            case PODCASTS:
                str = "podcasts";
                break;
            case RINGTONES:
                str = "ringtones";
                break;
            case ALARMS:
                str = "alarms";
                break;
            case NOTIFICATIONS:
                str = "notifications";
                break;
            case PICTURES:
                str = "pictures";
                break;
            case MOVIES:
                str = "movies";
                break;
            case DOWNLOADS:
                str = "downloads";
                break;
            case DCIM:
                str = "dcim";
                break;
            case DOCUMENTS:
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

    @Override // L1.b
    public final void onAttachedToEngine(L1.a aVar) {
        try {
            b(aVar.f888b, this);
        } catch (Exception e3) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e3);
        }
        this.f1610a = aVar.f887a;
    }

    @Override // L1.b
    public final void onDetachedFromEngine(L1.a aVar) {
        b(aVar.f888b, null);
    }
}
