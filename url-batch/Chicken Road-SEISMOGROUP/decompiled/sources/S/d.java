package S;

import A.e;
import N.f;
import N.h;
import a.AbstractC0016a;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d implements K.a {

    /* renamed from: b, reason: collision with root package name */
    public Context f425b;

    public static void d(f fVar, final d dVar) {
        A.b e2 = fVar.e(new h());
        b bVar = b.f422d;
        e eVar = new e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", bVar, e2);
        if (dVar != null) {
            final int i2 = 0;
            eVar.k(new N.b(dVar) { // from class: S.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f421c;

                {
                    this.f421c = dVar;
                }

                @Override // N.b
                public final void f(Object obj, A.a aVar) {
                    switch (i2) {
                        case 0:
                            d dVar2 = this.f421c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f425b.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0016a.H(th);
                            }
                            aVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f421c;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f425b;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0016a.H(th2);
                            }
                            aVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f421c;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f425b;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0016a.H(th3);
                            }
                            aVar.e(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f421c;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f425b.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0016a.H(th4);
                            }
                            aVar.e(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f421c;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f425b.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0016a.H(th5);
                            }
                            aVar.e(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f421c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f425b.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0016a.H(th6);
                            }
                            aVar.e(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f421c;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.c((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0016a.H(th7);
                            }
                            aVar.e(arrayList8);
                            break;
                    }
                }
            });
        } else {
            eVar.k(null);
        }
        e eVar2 = new e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", bVar, e2);
        if (dVar != null) {
            final int i3 = 1;
            eVar2.k(new N.b(dVar) { // from class: S.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f421c;

                {
                    this.f421c = dVar;
                }

                @Override // N.b
                public final void f(Object obj, A.a aVar) {
                    switch (i3) {
                        case 0:
                            d dVar2 = this.f421c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f425b.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0016a.H(th);
                            }
                            aVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f421c;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f425b;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0016a.H(th2);
                            }
                            aVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f421c;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f425b;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0016a.H(th3);
                            }
                            aVar.e(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f421c;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f425b.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0016a.H(th4);
                            }
                            aVar.e(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f421c;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f425b.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0016a.H(th5);
                            }
                            aVar.e(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f421c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f425b.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0016a.H(th6);
                            }
                            aVar.e(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f421c;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.c((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0016a.H(th7);
                            }
                            aVar.e(arrayList8);
                            break;
                    }
                }
            });
        } else {
            eVar2.k(null);
        }
        e eVar3 = new e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", bVar, e2);
        if (dVar != null) {
            final int i4 = 2;
            eVar3.k(new N.b(dVar) { // from class: S.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f421c;

                {
                    this.f421c = dVar;
                }

                @Override // N.b
                public final void f(Object obj, A.a aVar) {
                    switch (i4) {
                        case 0:
                            d dVar2 = this.f421c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f425b.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0016a.H(th);
                            }
                            aVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f421c;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f425b;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0016a.H(th2);
                            }
                            aVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f421c;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f425b;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0016a.H(th3);
                            }
                            aVar.e(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f421c;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f425b.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0016a.H(th4);
                            }
                            aVar.e(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f421c;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f425b.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0016a.H(th5);
                            }
                            aVar.e(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f421c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f425b.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0016a.H(th6);
                            }
                            aVar.e(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f421c;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.c((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0016a.H(th7);
                            }
                            aVar.e(arrayList8);
                            break;
                    }
                }
            });
        } else {
            eVar3.k(null);
        }
        e eVar4 = new e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", bVar, e2);
        if (dVar != null) {
            final int i5 = 3;
            eVar4.k(new N.b(dVar) { // from class: S.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f421c;

                {
                    this.f421c = dVar;
                }

                @Override // N.b
                public final void f(Object obj, A.a aVar) {
                    switch (i5) {
                        case 0:
                            d dVar2 = this.f421c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f425b.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0016a.H(th);
                            }
                            aVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f421c;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f425b;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0016a.H(th2);
                            }
                            aVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f421c;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f425b;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0016a.H(th3);
                            }
                            aVar.e(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f421c;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f425b.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0016a.H(th4);
                            }
                            aVar.e(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f421c;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f425b.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0016a.H(th5);
                            }
                            aVar.e(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f421c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f425b.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0016a.H(th6);
                            }
                            aVar.e(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f421c;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.c((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0016a.H(th7);
                            }
                            aVar.e(arrayList8);
                            break;
                    }
                }
            });
        } else {
            eVar4.k(null);
        }
        e eVar5 = new e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", bVar, e2);
        if (dVar != null) {
            final int i6 = 4;
            eVar5.k(new N.b(dVar) { // from class: S.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f421c;

                {
                    this.f421c = dVar;
                }

                @Override // N.b
                public final void f(Object obj, A.a aVar) {
                    switch (i6) {
                        case 0:
                            d dVar2 = this.f421c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f425b.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0016a.H(th);
                            }
                            aVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f421c;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f425b;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0016a.H(th2);
                            }
                            aVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f421c;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f425b;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0016a.H(th3);
                            }
                            aVar.e(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f421c;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f425b.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0016a.H(th4);
                            }
                            aVar.e(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f421c;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f425b.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0016a.H(th5);
                            }
                            aVar.e(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f421c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f425b.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0016a.H(th6);
                            }
                            aVar.e(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f421c;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.c((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0016a.H(th7);
                            }
                            aVar.e(arrayList8);
                            break;
                    }
                }
            });
        } else {
            eVar5.k(null);
        }
        e eVar6 = new e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", bVar, e2);
        if (dVar != null) {
            final int i7 = 5;
            eVar6.k(new N.b(dVar) { // from class: S.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f421c;

                {
                    this.f421c = dVar;
                }

                @Override // N.b
                public final void f(Object obj, A.a aVar) {
                    switch (i7) {
                        case 0:
                            d dVar2 = this.f421c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f425b.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0016a.H(th);
                            }
                            aVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f421c;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f425b;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0016a.H(th2);
                            }
                            aVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f421c;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f425b;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0016a.H(th3);
                            }
                            aVar.e(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f421c;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f425b.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0016a.H(th4);
                            }
                            aVar.e(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f421c;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f425b.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0016a.H(th5);
                            }
                            aVar.e(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f421c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f425b.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0016a.H(th6);
                            }
                            aVar.e(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f421c;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.c((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0016a.H(th7);
                            }
                            aVar.e(arrayList8);
                            break;
                    }
                }
            });
        } else {
            eVar6.k(null);
        }
        e eVar7 = new e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", bVar, e2);
        if (dVar == null) {
            eVar7.k(null);
        } else {
            final int i8 = 6;
            eVar7.k(new N.b(dVar) { // from class: S.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f421c;

                {
                    this.f421c = dVar;
                }

                @Override // N.b
                public final void f(Object obj, A.a aVar) {
                    switch (i8) {
                        case 0:
                            d dVar2 = this.f421c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f425b.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0016a.H(th);
                            }
                            aVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f421c;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f425b;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0016a.H(th2);
                            }
                            aVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f421c;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f425b;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0016a.H(th3);
                            }
                            aVar.e(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f421c;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f425b.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0016a.H(th4);
                            }
                            aVar.e(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f421c;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f425b.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0016a.H(th5);
                            }
                            aVar.e(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f421c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f425b.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0016a.H(th6);
                            }
                            aVar.e(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f421c;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.c((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0016a.H(th7);
                            }
                            aVar.e(arrayList8);
                            break;
                    }
                }
            });
        }
    }

    @Override // K.a
    public final void a(A.a aVar) {
        try {
            d((f) aVar.f4d, this);
        } catch (Exception e2) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e2);
        }
        this.f425b = (Context) aVar.f3c;
    }

    @Override // K.a
    public final void b(A.a aVar) {
        d((f) aVar.f4d, null);
    }

    public final ArrayList c(c cVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        Context context = this.f425b;
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
}
