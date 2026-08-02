package A0;

import B0.C0023a;
import B0.C0024b;
import B0.C0025c;
import B0.C0031i;
import D0.C0041a;
import I.C0079n;
import K.j;
import K.k;
import P.O;
import P0.l;
import Q0.h;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m0.AbstractActivityC0264d;
import w0.InterfaceC0316b;
import w0.InterfaceC0320f;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static int a(String str) {
        String str2;
        for (int i2 : j.c(2)) {
            if (i2 == 1) {
                str2 = "Brightness.light";
            } else {
                if (i2 != 2) {
                    throw null;
                }
                str2 = "Brightness.dark";
            }
            if (str2.equals(str)) {
                return i2;
            }
        }
        throw new NoSuchFieldException(f("No such Brightness: ", str));
    }

    public static int b(String str) {
        for (int i2 : j.c(5)) {
            String str2 = null;
            if (i2 != 1) {
                if (i2 == 2) {
                    str2 = "HapticFeedbackType.lightImpact";
                } else if (i2 == 3) {
                    str2 = "HapticFeedbackType.mediumImpact";
                } else if (i2 == 4) {
                    str2 = "HapticFeedbackType.heavyImpact";
                } else {
                    if (i2 != 5) {
                        throw null;
                    }
                    str2 = "HapticFeedbackType.selectionClick";
                }
            }
            if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                return i2;
            }
        }
        throw new NoSuchFieldException(f("No such HapticFeedbackType: ", str));
    }

    public static int c(String str) {
        String str2;
        for (int i2 : j.c(2)) {
            if (i2 == 1) {
                str2 = "SystemSoundType.click";
            } else {
                if (i2 != 2) {
                    throw null;
                }
                str2 = "SystemSoundType.alert";
            }
            if (str2.equals(str)) {
                return i2;
            }
        }
        throw new NoSuchFieldException(f("No such SoundType: ", str));
    }

    public static /* synthetic */ int d(int i2) {
        switch (i2) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case k.LONG_FIELD_NUMBER /* 4 */:
                return 8;
            case k.STRING_FIELD_NUMBER /* 5 */:
                return 16;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 32;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                return 64;
            case k.BYTES_FIELD_NUMBER /* 8 */:
                return 128;
            case 9:
                return 256;
            case 10:
                return 512;
            case 11:
                return 1024;
            case 12:
                return 2048;
            case 13:
                return 4096;
            case 14:
                return 8192;
            case 15:
                return 16384;
            case 16:
                return 32768;
            case 17:
                return 65536;
            case 18:
                return 131072;
            case 19:
                return 262144;
            case 20:
                return 524288;
            case 21:
                return 1048576;
            case 22:
                return 2097152;
            case 23:
                return 4194304;
            case 24:
                return 8388608;
            case 25:
                return 16777216;
            case 26:
                return 33554432;
            case 27:
                return 67108864;
            case 28:
                return 134217728;
            case 29:
                return 268435456;
            default:
                throw null;
        }
    }

    public static F0.d e(String str, String str2, String str3) {
        return i1.a.b(new C0041a(str, str2, str3));
    }

    public static String f(String str, String str2) {
        return str + str2;
    }

    public static void g(F0.d dVar, l lVar) {
        lVar.i(new F0.e(dVar));
    }

    public static /* synthetic */ void h(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void i(String str, int i2) {
        if (i2 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = h.class.getName();
            int i3 = 0;
            while (!stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            while (stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            StackTraceElement stackTraceElement = stackTrace[i3];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            h.f(nullPointerException, h.class.getName());
            throw nullPointerException;
        }
    }

    public static void j(String str, String str2, String str3) {
        i1.a.b(new C0041a(str, str2, str3));
    }

    public static void k(InterfaceC0320f interfaceC0320f, final e eVar) {
        C0023a b2 = interfaceC0320f.b();
        c cVar = c.f62d;
        C0079n c0079n = new C0079n(interfaceC0320f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", cVar, b2);
        if (eVar != null) {
            final int i2 = 0;
            c0079n.i(new InterfaceC0316b() { // from class: A0.a
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, O o2) {
                    switch (i2) {
                        case 0:
                            e eVar2 = eVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar2.f65e.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = i1.a.K(th);
                            }
                            o2.b(arrayList);
                            break;
                        case 1:
                            e eVar3 = eVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = eVar3.f65e;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(i1.a.o(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = i1.a.K(th2);
                            }
                            o2.b(arrayList2);
                            break;
                        case 2:
                            e eVar4 = eVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = eVar4.f65e;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(i1.a.o(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = i1.a.K(th3);
                            }
                            o2.b(arrayList3);
                            break;
                        case 3:
                            e eVar5 = eVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, eVar5.f65e.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = i1.a.K(th4);
                            }
                            o2.b(arrayList4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            e eVar6 = eVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = eVar6.f65e.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = i1.a.K(th5);
                            }
                            o2.b(arrayList5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            e eVar7 = eVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                eVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : eVar7.f65e.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = i1.a.K(th6);
                            }
                            o2.b(arrayList6);
                            break;
                        default:
                            e eVar8 = eVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, eVar8.a((d) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = i1.a.K(th7);
                            }
                            o2.b(arrayList8);
                            break;
                    }
                }
            });
        } else {
            c0079n.i(null);
        }
        C0079n c0079n2 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", cVar, interfaceC0320f.b());
        if (eVar != null) {
            final int i3 = 1;
            c0079n2.i(new InterfaceC0316b() { // from class: A0.a
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, O o2) {
                    switch (i3) {
                        case 0:
                            e eVar2 = eVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar2.f65e.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = i1.a.K(th);
                            }
                            o2.b(arrayList);
                            break;
                        case 1:
                            e eVar3 = eVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = eVar3.f65e;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(i1.a.o(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = i1.a.K(th2);
                            }
                            o2.b(arrayList2);
                            break;
                        case 2:
                            e eVar4 = eVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = eVar4.f65e;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(i1.a.o(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = i1.a.K(th3);
                            }
                            o2.b(arrayList3);
                            break;
                        case 3:
                            e eVar5 = eVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, eVar5.f65e.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = i1.a.K(th4);
                            }
                            o2.b(arrayList4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            e eVar6 = eVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = eVar6.f65e.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = i1.a.K(th5);
                            }
                            o2.b(arrayList5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            e eVar7 = eVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                eVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : eVar7.f65e.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = i1.a.K(th6);
                            }
                            o2.b(arrayList6);
                            break;
                        default:
                            e eVar8 = eVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, eVar8.a((d) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = i1.a.K(th7);
                            }
                            o2.b(arrayList8);
                            break;
                    }
                }
            });
        } else {
            c0079n2.i(null);
        }
        C0079n c0079n3 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", cVar, interfaceC0320f.b());
        if (eVar != null) {
            final int i4 = 2;
            c0079n3.i(new InterfaceC0316b() { // from class: A0.a
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, O o2) {
                    switch (i4) {
                        case 0:
                            e eVar2 = eVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar2.f65e.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = i1.a.K(th);
                            }
                            o2.b(arrayList);
                            break;
                        case 1:
                            e eVar3 = eVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = eVar3.f65e;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(i1.a.o(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = i1.a.K(th2);
                            }
                            o2.b(arrayList2);
                            break;
                        case 2:
                            e eVar4 = eVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = eVar4.f65e;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(i1.a.o(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = i1.a.K(th3);
                            }
                            o2.b(arrayList3);
                            break;
                        case 3:
                            e eVar5 = eVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, eVar5.f65e.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = i1.a.K(th4);
                            }
                            o2.b(arrayList4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            e eVar6 = eVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = eVar6.f65e.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = i1.a.K(th5);
                            }
                            o2.b(arrayList5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            e eVar7 = eVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                eVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : eVar7.f65e.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = i1.a.K(th6);
                            }
                            o2.b(arrayList6);
                            break;
                        default:
                            e eVar8 = eVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, eVar8.a((d) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = i1.a.K(th7);
                            }
                            o2.b(arrayList8);
                            break;
                    }
                }
            });
        } else {
            c0079n3.i(null);
        }
        C0079n c0079n4 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", cVar, interfaceC0320f.b());
        if (eVar != null) {
            final int i5 = 3;
            c0079n4.i(new InterfaceC0316b() { // from class: A0.a
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, O o2) {
                    switch (i5) {
                        case 0:
                            e eVar2 = eVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar2.f65e.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = i1.a.K(th);
                            }
                            o2.b(arrayList);
                            break;
                        case 1:
                            e eVar3 = eVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = eVar3.f65e;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(i1.a.o(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = i1.a.K(th2);
                            }
                            o2.b(arrayList2);
                            break;
                        case 2:
                            e eVar4 = eVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = eVar4.f65e;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(i1.a.o(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = i1.a.K(th3);
                            }
                            o2.b(arrayList3);
                            break;
                        case 3:
                            e eVar5 = eVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, eVar5.f65e.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = i1.a.K(th4);
                            }
                            o2.b(arrayList4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            e eVar6 = eVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = eVar6.f65e.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = i1.a.K(th5);
                            }
                            o2.b(arrayList5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            e eVar7 = eVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                eVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : eVar7.f65e.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = i1.a.K(th6);
                            }
                            o2.b(arrayList6);
                            break;
                        default:
                            e eVar8 = eVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, eVar8.a((d) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = i1.a.K(th7);
                            }
                            o2.b(arrayList8);
                            break;
                    }
                }
            });
        } else {
            c0079n4.i(null);
        }
        C0079n c0079n5 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", cVar, interfaceC0320f.b());
        if (eVar != null) {
            final int i6 = 4;
            c0079n5.i(new InterfaceC0316b() { // from class: A0.a
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, O o2) {
                    switch (i6) {
                        case 0:
                            e eVar2 = eVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar2.f65e.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = i1.a.K(th);
                            }
                            o2.b(arrayList);
                            break;
                        case 1:
                            e eVar3 = eVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = eVar3.f65e;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(i1.a.o(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = i1.a.K(th2);
                            }
                            o2.b(arrayList2);
                            break;
                        case 2:
                            e eVar4 = eVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = eVar4.f65e;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(i1.a.o(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = i1.a.K(th3);
                            }
                            o2.b(arrayList3);
                            break;
                        case 3:
                            e eVar5 = eVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, eVar5.f65e.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = i1.a.K(th4);
                            }
                            o2.b(arrayList4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            e eVar6 = eVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = eVar6.f65e.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = i1.a.K(th5);
                            }
                            o2.b(arrayList5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            e eVar7 = eVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                eVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : eVar7.f65e.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = i1.a.K(th6);
                            }
                            o2.b(arrayList6);
                            break;
                        default:
                            e eVar8 = eVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, eVar8.a((d) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = i1.a.K(th7);
                            }
                            o2.b(arrayList8);
                            break;
                    }
                }
            });
        } else {
            c0079n5.i(null);
        }
        C0079n c0079n6 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", cVar, interfaceC0320f.b());
        if (eVar != null) {
            final int i7 = 5;
            c0079n6.i(new InterfaceC0316b() { // from class: A0.a
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, O o2) {
                    switch (i7) {
                        case 0:
                            e eVar2 = eVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar2.f65e.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = i1.a.K(th);
                            }
                            o2.b(arrayList);
                            break;
                        case 1:
                            e eVar3 = eVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = eVar3.f65e;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(i1.a.o(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = i1.a.K(th2);
                            }
                            o2.b(arrayList2);
                            break;
                        case 2:
                            e eVar4 = eVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = eVar4.f65e;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(i1.a.o(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = i1.a.K(th3);
                            }
                            o2.b(arrayList3);
                            break;
                        case 3:
                            e eVar5 = eVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, eVar5.f65e.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = i1.a.K(th4);
                            }
                            o2.b(arrayList4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            e eVar6 = eVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = eVar6.f65e.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = i1.a.K(th5);
                            }
                            o2.b(arrayList5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            e eVar7 = eVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                eVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : eVar7.f65e.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = i1.a.K(th6);
                            }
                            o2.b(arrayList6);
                            break;
                        default:
                            e eVar8 = eVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, eVar8.a((d) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = i1.a.K(th7);
                            }
                            o2.b(arrayList8);
                            break;
                    }
                }
            });
        } else {
            c0079n6.i(null);
        }
        C0079n c0079n7 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", cVar, interfaceC0320f.b());
        if (eVar == null) {
            c0079n7.i(null);
        } else {
            final int i8 = 6;
            c0079n7.i(new InterfaceC0316b() { // from class: A0.a
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, O o2) {
                    switch (i8) {
                        case 0:
                            e eVar2 = eVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar2.f65e.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = i1.a.K(th);
                            }
                            o2.b(arrayList);
                            break;
                        case 1:
                            e eVar3 = eVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = eVar3.f65e;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(i1.a.o(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = i1.a.K(th2);
                            }
                            o2.b(arrayList2);
                            break;
                        case 2:
                            e eVar4 = eVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = eVar4.f65e;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(i1.a.o(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = i1.a.K(th3);
                            }
                            o2.b(arrayList3);
                            break;
                        case 3:
                            e eVar5 = eVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, eVar5.f65e.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = i1.a.K(th4);
                            }
                            o2.b(arrayList4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            e eVar6 = eVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = eVar6.f65e.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = i1.a.K(th5);
                            }
                            o2.b(arrayList5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            e eVar7 = eVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                eVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : eVar7.f65e.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = i1.a.K(th6);
                            }
                            o2.b(arrayList6);
                            break;
                        default:
                            e eVar8 = eVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, eVar8.a((d) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = i1.a.K(th7);
                            }
                            o2.b(arrayList8);
                            break;
                    }
                }
            });
        }
    }

    public static void l(InterfaceC0320f interfaceC0320f, final C0024b c0024b) {
        C0023a b2 = interfaceC0320f.b();
        C0025c c0025c = C0025c.f142e;
        C0079n c0079n = new C0079n(interfaceC0320f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", c0025c, b2);
        if (c0024b != null) {
            final int i2 = 0;
            c0079n.i(new InterfaceC0316b() { // from class: B0.d
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    switch (i2) {
                        case 0:
                            C0024b c0024b2 = c0024b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0024b2.f140e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = i1.a.M(th);
                            }
                            o2.b(arrayList);
                            break;
                        case 1:
                            C0024b c0024b3 = c0024b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0024b3.f140e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = i1.a.M(th2);
                            }
                            o2.b(arrayList2);
                            break;
                        case 2:
                            C0024b c0024b4 = c0024b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0024b4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = i1.a.M(th3);
                            }
                            o2.b(arrayList4);
                            break;
                        case 3:
                            C0024b c0024b5 = c0024b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0024b5.f140e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = i1.a.M(th4);
                            }
                            o2.b(arrayList6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0024b c0024b6 = c0024b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0024b6.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0024b6.f140e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = i1.a.M(th5);
                            }
                            o2.b(arrayList8);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0024b c0024b7 = c0024b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0024b7.f140e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = i1.a.M(th6);
                            }
                            o2.b(arrayList10);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0024b c0024b8 = c0024b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0024b8.f140e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0024b8.f141f.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = i1.a.M(th7);
                            }
                            o2.b(arrayList12);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0024b c0024b9 = c0024b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0024b9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = i1.a.M(th8);
                            }
                            o2.b(arrayList14);
                            break;
                        default:
                            C0024b c0024b10 = c0024b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0024b10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = i1.a.M(th9);
                            }
                            o2.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0079n.i(null);
        }
        C0079n c0079n2 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", c0025c, b2);
        if (c0024b != null) {
            final int i3 = 1;
            c0079n2.i(new InterfaceC0316b() { // from class: B0.d
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    switch (i3) {
                        case 0:
                            C0024b c0024b2 = c0024b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0024b2.f140e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = i1.a.M(th);
                            }
                            o2.b(arrayList);
                            break;
                        case 1:
                            C0024b c0024b3 = c0024b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0024b3.f140e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = i1.a.M(th2);
                            }
                            o2.b(arrayList2);
                            break;
                        case 2:
                            C0024b c0024b4 = c0024b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0024b4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = i1.a.M(th3);
                            }
                            o2.b(arrayList4);
                            break;
                        case 3:
                            C0024b c0024b5 = c0024b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0024b5.f140e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = i1.a.M(th4);
                            }
                            o2.b(arrayList6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0024b c0024b6 = c0024b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0024b6.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0024b6.f140e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = i1.a.M(th5);
                            }
                            o2.b(arrayList8);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0024b c0024b7 = c0024b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0024b7.f140e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = i1.a.M(th6);
                            }
                            o2.b(arrayList10);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0024b c0024b8 = c0024b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0024b8.f140e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0024b8.f141f.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = i1.a.M(th7);
                            }
                            o2.b(arrayList12);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0024b c0024b9 = c0024b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0024b9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = i1.a.M(th8);
                            }
                            o2.b(arrayList14);
                            break;
                        default:
                            C0024b c0024b10 = c0024b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0024b10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = i1.a.M(th9);
                            }
                            o2.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0079n2.i(null);
        }
        C0079n c0079n3 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", c0025c, b2);
        if (c0024b != null) {
            final int i4 = 2;
            c0079n3.i(new InterfaceC0316b() { // from class: B0.d
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    switch (i4) {
                        case 0:
                            C0024b c0024b2 = c0024b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0024b2.f140e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = i1.a.M(th);
                            }
                            o2.b(arrayList);
                            break;
                        case 1:
                            C0024b c0024b3 = c0024b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0024b3.f140e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = i1.a.M(th2);
                            }
                            o2.b(arrayList2);
                            break;
                        case 2:
                            C0024b c0024b4 = c0024b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0024b4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = i1.a.M(th3);
                            }
                            o2.b(arrayList4);
                            break;
                        case 3:
                            C0024b c0024b5 = c0024b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0024b5.f140e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = i1.a.M(th4);
                            }
                            o2.b(arrayList6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0024b c0024b6 = c0024b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0024b6.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0024b6.f140e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = i1.a.M(th5);
                            }
                            o2.b(arrayList8);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0024b c0024b7 = c0024b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0024b7.f140e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = i1.a.M(th6);
                            }
                            o2.b(arrayList10);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0024b c0024b8 = c0024b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0024b8.f140e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0024b8.f141f.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = i1.a.M(th7);
                            }
                            o2.b(arrayList12);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0024b c0024b9 = c0024b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0024b9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = i1.a.M(th8);
                            }
                            o2.b(arrayList14);
                            break;
                        default:
                            C0024b c0024b10 = c0024b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0024b10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = i1.a.M(th9);
                            }
                            o2.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0079n3.i(null);
        }
        C0079n c0079n4 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", c0025c, b2);
        if (c0024b != null) {
            final int i5 = 3;
            c0079n4.i(new InterfaceC0316b() { // from class: B0.d
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    switch (i5) {
                        case 0:
                            C0024b c0024b2 = c0024b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0024b2.f140e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = i1.a.M(th);
                            }
                            o2.b(arrayList);
                            break;
                        case 1:
                            C0024b c0024b3 = c0024b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0024b3.f140e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = i1.a.M(th2);
                            }
                            o2.b(arrayList2);
                            break;
                        case 2:
                            C0024b c0024b4 = c0024b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0024b4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = i1.a.M(th3);
                            }
                            o2.b(arrayList4);
                            break;
                        case 3:
                            C0024b c0024b5 = c0024b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0024b5.f140e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = i1.a.M(th4);
                            }
                            o2.b(arrayList6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0024b c0024b6 = c0024b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0024b6.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0024b6.f140e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = i1.a.M(th5);
                            }
                            o2.b(arrayList8);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0024b c0024b7 = c0024b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0024b7.f140e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = i1.a.M(th6);
                            }
                            o2.b(arrayList10);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0024b c0024b8 = c0024b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0024b8.f140e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0024b8.f141f.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = i1.a.M(th7);
                            }
                            o2.b(arrayList12);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0024b c0024b9 = c0024b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0024b9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = i1.a.M(th8);
                            }
                            o2.b(arrayList14);
                            break;
                        default:
                            C0024b c0024b10 = c0024b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0024b10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = i1.a.M(th9);
                            }
                            o2.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0079n4.i(null);
        }
        C0079n c0079n5 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", c0025c, b2);
        if (c0024b != null) {
            final int i6 = 4;
            c0079n5.i(new InterfaceC0316b() { // from class: B0.d
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    switch (i6) {
                        case 0:
                            C0024b c0024b2 = c0024b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0024b2.f140e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = i1.a.M(th);
                            }
                            o2.b(arrayList);
                            break;
                        case 1:
                            C0024b c0024b3 = c0024b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0024b3.f140e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = i1.a.M(th2);
                            }
                            o2.b(arrayList2);
                            break;
                        case 2:
                            C0024b c0024b4 = c0024b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0024b4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = i1.a.M(th3);
                            }
                            o2.b(arrayList4);
                            break;
                        case 3:
                            C0024b c0024b5 = c0024b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0024b5.f140e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = i1.a.M(th4);
                            }
                            o2.b(arrayList6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0024b c0024b6 = c0024b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0024b6.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0024b6.f140e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = i1.a.M(th5);
                            }
                            o2.b(arrayList8);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0024b c0024b7 = c0024b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0024b7.f140e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = i1.a.M(th6);
                            }
                            o2.b(arrayList10);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0024b c0024b8 = c0024b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0024b8.f140e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0024b8.f141f.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = i1.a.M(th7);
                            }
                            o2.b(arrayList12);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0024b c0024b9 = c0024b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0024b9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = i1.a.M(th8);
                            }
                            o2.b(arrayList14);
                            break;
                        default:
                            C0024b c0024b10 = c0024b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0024b10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = i1.a.M(th9);
                            }
                            o2.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0079n5.i(null);
        }
        C0079n c0079n6 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", c0025c, b2);
        if (c0024b != null) {
            final int i7 = 5;
            c0079n6.i(new InterfaceC0316b() { // from class: B0.d
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    switch (i7) {
                        case 0:
                            C0024b c0024b2 = c0024b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0024b2.f140e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = i1.a.M(th);
                            }
                            o2.b(arrayList);
                            break;
                        case 1:
                            C0024b c0024b3 = c0024b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0024b3.f140e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = i1.a.M(th2);
                            }
                            o2.b(arrayList2);
                            break;
                        case 2:
                            C0024b c0024b4 = c0024b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0024b4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = i1.a.M(th3);
                            }
                            o2.b(arrayList4);
                            break;
                        case 3:
                            C0024b c0024b5 = c0024b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0024b5.f140e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = i1.a.M(th4);
                            }
                            o2.b(arrayList6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0024b c0024b6 = c0024b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0024b6.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0024b6.f140e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = i1.a.M(th5);
                            }
                            o2.b(arrayList8);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0024b c0024b7 = c0024b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0024b7.f140e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = i1.a.M(th6);
                            }
                            o2.b(arrayList10);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0024b c0024b8 = c0024b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0024b8.f140e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0024b8.f141f.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = i1.a.M(th7);
                            }
                            o2.b(arrayList12);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0024b c0024b9 = c0024b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0024b9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = i1.a.M(th8);
                            }
                            o2.b(arrayList14);
                            break;
                        default:
                            C0024b c0024b10 = c0024b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0024b10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = i1.a.M(th9);
                            }
                            o2.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0079n6.i(null);
        }
        C0079n c0079n7 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", c0025c, b2);
        if (c0024b != null) {
            final int i8 = 6;
            c0079n7.i(new InterfaceC0316b() { // from class: B0.d
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    switch (i8) {
                        case 0:
                            C0024b c0024b2 = c0024b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0024b2.f140e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = i1.a.M(th);
                            }
                            o2.b(arrayList);
                            break;
                        case 1:
                            C0024b c0024b3 = c0024b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0024b3.f140e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = i1.a.M(th2);
                            }
                            o2.b(arrayList2);
                            break;
                        case 2:
                            C0024b c0024b4 = c0024b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0024b4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = i1.a.M(th3);
                            }
                            o2.b(arrayList4);
                            break;
                        case 3:
                            C0024b c0024b5 = c0024b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0024b5.f140e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = i1.a.M(th4);
                            }
                            o2.b(arrayList6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0024b c0024b6 = c0024b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0024b6.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0024b6.f140e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = i1.a.M(th5);
                            }
                            o2.b(arrayList8);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0024b c0024b7 = c0024b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0024b7.f140e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = i1.a.M(th6);
                            }
                            o2.b(arrayList10);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0024b c0024b8 = c0024b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0024b8.f140e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0024b8.f141f.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = i1.a.M(th7);
                            }
                            o2.b(arrayList12);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0024b c0024b9 = c0024b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0024b9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = i1.a.M(th8);
                            }
                            o2.b(arrayList14);
                            break;
                        default:
                            C0024b c0024b10 = c0024b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0024b10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = i1.a.M(th9);
                            }
                            o2.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0079n7.i(null);
        }
        C0079n c0079n8 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", c0025c, b2);
        if (c0024b != null) {
            final int i9 = 7;
            c0079n8.i(new InterfaceC0316b() { // from class: B0.d
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    switch (i9) {
                        case 0:
                            C0024b c0024b2 = c0024b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0024b2.f140e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = i1.a.M(th);
                            }
                            o2.b(arrayList);
                            break;
                        case 1:
                            C0024b c0024b3 = c0024b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0024b3.f140e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = i1.a.M(th2);
                            }
                            o2.b(arrayList2);
                            break;
                        case 2:
                            C0024b c0024b4 = c0024b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0024b4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = i1.a.M(th3);
                            }
                            o2.b(arrayList4);
                            break;
                        case 3:
                            C0024b c0024b5 = c0024b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0024b5.f140e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = i1.a.M(th4);
                            }
                            o2.b(arrayList6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0024b c0024b6 = c0024b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0024b6.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0024b6.f140e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = i1.a.M(th5);
                            }
                            o2.b(arrayList8);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0024b c0024b7 = c0024b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0024b7.f140e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = i1.a.M(th6);
                            }
                            o2.b(arrayList10);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0024b c0024b8 = c0024b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0024b8.f140e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0024b8.f141f.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = i1.a.M(th7);
                            }
                            o2.b(arrayList12);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0024b c0024b9 = c0024b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0024b9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = i1.a.M(th8);
                            }
                            o2.b(arrayList14);
                            break;
                        default:
                            C0024b c0024b10 = c0024b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0024b10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = i1.a.M(th9);
                            }
                            o2.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0079n8.i(null);
        }
        C0079n c0079n9 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", c0025c, b2);
        if (c0024b == null) {
            c0079n9.i(null);
        } else {
            final int i10 = 8;
            c0079n9.i(new InterfaceC0316b() { // from class: B0.d
                @Override // w0.InterfaceC0316b
                public final void g(Object obj, P.O o2) {
                    switch (i10) {
                        case 0:
                            C0024b c0024b2 = c0024b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0024b2.f140e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = i1.a.M(th);
                            }
                            o2.b(arrayList);
                            break;
                        case 1:
                            C0024b c0024b3 = c0024b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0024b3.f140e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = i1.a.M(th2);
                            }
                            o2.b(arrayList2);
                            break;
                        case 2:
                            C0024b c0024b4 = c0024b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0024b4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = i1.a.M(th3);
                            }
                            o2.b(arrayList4);
                            break;
                        case 3:
                            C0024b c0024b5 = c0024b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0024b5.f140e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = i1.a.M(th4);
                            }
                            o2.b(arrayList6);
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            C0024b c0024b6 = c0024b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0024b6.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0024b6.f140e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = i1.a.M(th5);
                            }
                            o2.b(arrayList8);
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            C0024b c0024b7 = c0024b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0024b7.f140e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = i1.a.M(th6);
                            }
                            o2.b(arrayList10);
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0024b c0024b8 = c0024b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0024b8.f140e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0024b8.f141f.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = i1.a.M(th7);
                            }
                            o2.b(arrayList12);
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0024b c0024b9 = c0024b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0024b9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = i1.a.M(th8);
                            }
                            o2.b(arrayList14);
                            break;
                        default:
                            C0024b c0024b10 = c0024b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0024b10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = i1.a.M(th9);
                            }
                            o2.b(arrayList16);
                            break;
                    }
                }
            });
        }
    }

    public static void m(InterfaceC0320f interfaceC0320f, final C0031i c0031i) {
        C0.c cVar = C0.c.f220d;
        Object obj = null;
        C0079n c0079n = new C0079n(interfaceC0320f, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", cVar, obj);
        if (c0031i != null) {
            final int i2 = 0;
            c0079n.i(new InterfaceC0316b() { // from class: C0.d
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, O o2) {
                    Boolean bool;
                    switch (i2) {
                        case 0:
                            C0031i c0031i2 = c0031i;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c0031i2.s((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th) {
                                arrayList = i1.a.N(th);
                            }
                            o2.b(arrayList);
                            return;
                        case 1:
                            C0031i c0031i3 = c0031i;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = i1.a.N(th2);
                            }
                            if (((AbstractActivityC0264d) c0031i3.f156h) == null) {
                                throw new b();
                            }
                            try {
                                ((AbstractActivityC0264d) c0031i3.f156h).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", C0031i.x(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            o2.b(arrayList2);
                            return;
                        case 2:
                            C0031i c0031i4 = c0031i;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, c0031i4.M((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = i1.a.N(th3);
                            }
                            o2.b(arrayList4);
                            return;
                        case 3:
                            C0031i c0031i5 = c0031i;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, c0031i5.P());
                            } catch (Throwable th4) {
                                arrayList6 = i1.a.N(th4);
                            }
                            o2.b(arrayList6);
                            return;
                        default:
                            C0031i c0031i6 = c0031i;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                c0031i6.getClass();
                                ((Context) c0031i6.f155g).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = i1.a.N(th5);
                            }
                            o2.b(arrayList7);
                            return;
                    }
                }
            });
        } else {
            c0079n.i(null);
        }
        C0079n c0079n2 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", cVar, obj);
        if (c0031i != null) {
            final int i3 = 1;
            c0079n2.i(new InterfaceC0316b() { // from class: C0.d
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, O o2) {
                    Boolean bool;
                    switch (i3) {
                        case 0:
                            C0031i c0031i2 = c0031i;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c0031i2.s((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th) {
                                arrayList = i1.a.N(th);
                            }
                            o2.b(arrayList);
                            return;
                        case 1:
                            C0031i c0031i3 = c0031i;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = i1.a.N(th2);
                            }
                            if (((AbstractActivityC0264d) c0031i3.f156h) == null) {
                                throw new b();
                            }
                            try {
                                ((AbstractActivityC0264d) c0031i3.f156h).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", C0031i.x(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            o2.b(arrayList2);
                            return;
                        case 2:
                            C0031i c0031i4 = c0031i;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, c0031i4.M((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = i1.a.N(th3);
                            }
                            o2.b(arrayList4);
                            return;
                        case 3:
                            C0031i c0031i5 = c0031i;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, c0031i5.P());
                            } catch (Throwable th4) {
                                arrayList6 = i1.a.N(th4);
                            }
                            o2.b(arrayList6);
                            return;
                        default:
                            C0031i c0031i6 = c0031i;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                c0031i6.getClass();
                                ((Context) c0031i6.f155g).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = i1.a.N(th5);
                            }
                            o2.b(arrayList7);
                            return;
                    }
                }
            });
        } else {
            c0079n2.i(null);
        }
        C0079n c0079n3 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", cVar, obj);
        if (c0031i != null) {
            final int i4 = 2;
            c0079n3.i(new InterfaceC0316b() { // from class: C0.d
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, O o2) {
                    Boolean bool;
                    switch (i4) {
                        case 0:
                            C0031i c0031i2 = c0031i;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c0031i2.s((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th) {
                                arrayList = i1.a.N(th);
                            }
                            o2.b(arrayList);
                            return;
                        case 1:
                            C0031i c0031i3 = c0031i;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = i1.a.N(th2);
                            }
                            if (((AbstractActivityC0264d) c0031i3.f156h) == null) {
                                throw new b();
                            }
                            try {
                                ((AbstractActivityC0264d) c0031i3.f156h).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", C0031i.x(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            o2.b(arrayList2);
                            return;
                        case 2:
                            C0031i c0031i4 = c0031i;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, c0031i4.M((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = i1.a.N(th3);
                            }
                            o2.b(arrayList4);
                            return;
                        case 3:
                            C0031i c0031i5 = c0031i;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, c0031i5.P());
                            } catch (Throwable th4) {
                                arrayList6 = i1.a.N(th4);
                            }
                            o2.b(arrayList6);
                            return;
                        default:
                            C0031i c0031i6 = c0031i;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                c0031i6.getClass();
                                ((Context) c0031i6.f155g).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = i1.a.N(th5);
                            }
                            o2.b(arrayList7);
                            return;
                    }
                }
            });
        } else {
            c0079n3.i(null);
        }
        C0079n c0079n4 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", cVar, obj);
        if (c0031i != null) {
            final int i5 = 3;
            c0079n4.i(new InterfaceC0316b() { // from class: C0.d
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, O o2) {
                    Boolean bool;
                    switch (i5) {
                        case 0:
                            C0031i c0031i2 = c0031i;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c0031i2.s((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th) {
                                arrayList = i1.a.N(th);
                            }
                            o2.b(arrayList);
                            return;
                        case 1:
                            C0031i c0031i3 = c0031i;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = i1.a.N(th2);
                            }
                            if (((AbstractActivityC0264d) c0031i3.f156h) == null) {
                                throw new b();
                            }
                            try {
                                ((AbstractActivityC0264d) c0031i3.f156h).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", C0031i.x(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            o2.b(arrayList2);
                            return;
                        case 2:
                            C0031i c0031i4 = c0031i;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, c0031i4.M((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = i1.a.N(th3);
                            }
                            o2.b(arrayList4);
                            return;
                        case 3:
                            C0031i c0031i5 = c0031i;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, c0031i5.P());
                            } catch (Throwable th4) {
                                arrayList6 = i1.a.N(th4);
                            }
                            o2.b(arrayList6);
                            return;
                        default:
                            C0031i c0031i6 = c0031i;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                c0031i6.getClass();
                                ((Context) c0031i6.f155g).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = i1.a.N(th5);
                            }
                            o2.b(arrayList7);
                            return;
                    }
                }
            });
        } else {
            c0079n4.i(null);
        }
        C0079n c0079n5 = new C0079n(interfaceC0320f, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", cVar, obj);
        if (c0031i == null) {
            c0079n5.i(null);
        } else {
            final int i6 = 4;
            c0079n5.i(new InterfaceC0316b() { // from class: C0.d
                @Override // w0.InterfaceC0316b
                public final void g(Object obj2, O o2) {
                    Boolean bool;
                    switch (i6) {
                        case 0:
                            C0031i c0031i2 = c0031i;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c0031i2.s((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th) {
                                arrayList = i1.a.N(th);
                            }
                            o2.b(arrayList);
                            return;
                        case 1:
                            C0031i c0031i3 = c0031i;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = i1.a.N(th2);
                            }
                            if (((AbstractActivityC0264d) c0031i3.f156h) == null) {
                                throw new b();
                            }
                            try {
                                ((AbstractActivityC0264d) c0031i3.f156h).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", C0031i.x(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            o2.b(arrayList2);
                            return;
                        case 2:
                            C0031i c0031i4 = c0031i;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, c0031i4.M((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = i1.a.N(th3);
                            }
                            o2.b(arrayList4);
                            return;
                        case 3:
                            C0031i c0031i5 = c0031i;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, c0031i5.P());
                            } catch (Throwable th4) {
                                arrayList6 = i1.a.N(th4);
                            }
                            o2.b(arrayList6);
                            return;
                        default:
                            C0031i c0031i6 = c0031i;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                c0031i6.getClass();
                                ((Context) c0031i6.f155g).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = i1.a.N(th5);
                            }
                            o2.b(arrayList7);
                            return;
                    }
                }
            });
        }
    }
}
