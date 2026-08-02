package J1;

import B0.g;
import B0.n;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Trace;
import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import com.google.android.gms.internal.play_billing.C0208b;
import com.google.android.gms.internal.play_billing.InterfaceC0214d;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import n0.AbstractC1135O;
import n0.BinderC1121A;
import n0.C1143e;

/* loaded from: classes.dex */
public final class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f635b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f636c;

    public /* synthetic */ b(C1143e c1143e, Object obj, int i3) {
        this.f634a = i3;
        this.f635b = c1143e;
        this.f636c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        InterfaceC0214d interfaceC0214d;
        InterfaceC0214d interfaceC0214d2;
        InterfaceC0214d interfaceC0214d3;
        int i3 = 0;
        switch (this.f634a) {
            case 0:
                d dVar = (d) this.f636c;
                Context context = (Context) this.f635b;
                Z1.a.b("FlutterLoader initTask");
                try {
                    dVar.getClass();
                    FlutterJNI flutterJNI = dVar.f;
                    try {
                        flutterJNI.loadLibrary(context);
                        flutterJNI.updateRefreshRate();
                        dVar.f644g.execute(new n(2, this));
                        File filesDir = context.getFilesDir();
                        if (filesDir == null) {
                            filesDir = new File(context.getDataDir().getPath(), "files");
                        }
                        String path = filesDir.getPath();
                        File codeCacheDir = context.getCodeCacheDir();
                        if (codeCacheDir == null) {
                            codeCacheDir = context.getCacheDir();
                        }
                        if (codeCacheDir == null) {
                            codeCacheDir = new File(context.getDataDir().getPath(), "cache");
                        }
                        String path2 = codeCacheDir.getPath();
                        File dir = context.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                        if (dir == null) {
                            dir = new File(context.getDataDir().getPath(), "app_flutter");
                        }
                        dir.getPath();
                        c cVar = new c(path, path2);
                        Trace.endSection();
                        return cVar;
                    } catch (UnsatisfiedLinkError e3) {
                        if (!e3.toString().contains("couldn't find \"libflutter.so\"") && !e3.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                            throw e3;
                        }
                        String property = System.getProperty("os.arch");
                        File file = new File(dVar.f643e.f632d);
                        String[] list = file.list();
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = Build.SUPPORTED_ABIS;
                        int length = strArr.length;
                        int i4 = 0;
                        while (i4 < length) {
                            String str = strArr[i4];
                            StringBuilder sb = new StringBuilder();
                            sb.append("!");
                            String str2 = File.separator;
                            sb.append(str2);
                            sb.append("lib");
                            sb.append(str2);
                            sb.append(str);
                            String sb2 = sb.toString();
                            String[] strArr2 = context.getApplicationInfo().splitSourceDirs;
                            ArrayList arrayList2 = new ArrayList();
                            if (strArr2 != null) {
                                int length2 = strArr2.length;
                                for (int i5 = i3; i5 < length2; i5++) {
                                    arrayList2.add(strArr2[i5] + sb2);
                                }
                                arrayList.addAll(arrayList2);
                            }
                            String str3 = context.getApplicationInfo().sourceDir;
                            if (str3 != null && !str3.isEmpty()) {
                                arrayList.add(str3 + sb2);
                            }
                            i4++;
                            i3 = 0;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                        sb3.append(property);
                        sb3.append(", and the native libraries directory (with path ");
                        sb3.append(file.getAbsolutePath());
                        sb3.append(") ");
                        sb3.append(file.exists() ? "contains the following files: " + Arrays.toString(list) : "does not exist");
                        sb3.append(arrayList.isEmpty() ? "" : ", and the split and source libraries directory (with path(s) " + arrayList + ")");
                        sb3.append(".");
                        throw new UnsupportedOperationException(sb3.toString(), e3);
                    }
                } finally {
                }
            case 1:
                C1143e c1143e = (C1143e) this.f635b;
                g gVar = (g) this.f636c;
                c1143e.getClass();
                try {
                    synchronized (c1143e.f10065a) {
                        interfaceC0214d = c1143e.f10071h;
                    }
                    if (interfaceC0214d == null) {
                        c1143e.A(gVar, AbstractC1135O.f10026k, 119, null);
                    } else {
                        String packageName = c1143e.f.getPackageName();
                        String str4 = c1143e.f10067c;
                        long longValue = c1143e.f10064E.longValue();
                        int i6 = AbstractC0248o0.f2894a;
                        Bundle bundle = new Bundle();
                        AbstractC0248o0.b(bundle, str4, longValue);
                        ((C0208b) interfaceC0214d).p(packageName, bundle, new BinderC1121A(gVar, c1143e.f10070g, c1143e.f10075l, (char) 0));
                    }
                } catch (DeadObjectException e4) {
                    c1143e.A(gVar, AbstractC1135O.f10026k, 69, e4);
                } catch (Exception e5) {
                    c1143e.A(gVar, AbstractC1135O.f10024i, 69, e5);
                }
                return null;
            case 2:
                C1143e c1143e2 = (C1143e) this.f635b;
                g gVar2 = (g) this.f636c;
                c1143e2.getClass();
                try {
                    synchronized (c1143e2.f10065a) {
                        interfaceC0214d2 = c1143e2.f10071h;
                    }
                    if (interfaceC0214d2 == null) {
                        c1143e2.F(gVar2, AbstractC1135O.f10026k, 119, null);
                    } else {
                        String packageName2 = c1143e2.f.getPackageName();
                        String str5 = c1143e2.f10067c;
                        long longValue2 = c1143e2.f10064E.longValue();
                        Bundle bundle2 = new Bundle();
                        AbstractC0248o0.b(bundle2, str5, longValue2);
                        ((C0208b) interfaceC0214d2).o(packageName2, bundle2, new BinderC1121A(gVar2, c1143e2.f10070g, c1143e2.f10075l, (byte) 0));
                    }
                } catch (DeadObjectException e6) {
                    c1143e2.F(gVar2, AbstractC1135O.f10026k, 62, e6);
                } catch (Exception e7) {
                    c1143e2.F(gVar2, AbstractC1135O.f10024i, 62, e7);
                }
                return null;
            default:
                C1143e c1143e3 = (C1143e) this.f635b;
                g gVar3 = (g) this.f636c;
                c1143e3.getClass();
                try {
                    synchronized (c1143e3.f10065a) {
                        interfaceC0214d3 = c1143e3.f10071h;
                    }
                    if (interfaceC0214d3 == null) {
                        c1143e3.C(gVar3, AbstractC1135O.f10026k, 119, null);
                    } else {
                        String packageName3 = c1143e3.f.getPackageName();
                        String str6 = c1143e3.f10067c;
                        long longValue3 = c1143e3.f10064E.longValue();
                        int i7 = AbstractC0248o0.f2894a;
                        Bundle bundle3 = new Bundle();
                        AbstractC0248o0.b(bundle3, str6, longValue3);
                        ((C0208b) interfaceC0214d3).m(packageName3, bundle3, new BinderC1121A(gVar3, c1143e3.f10070g, c1143e3.f10075l));
                    }
                } catch (DeadObjectException e8) {
                    c1143e3.C(gVar3, AbstractC1135O.f10026k, 70, e8);
                } catch (Exception e9) {
                    c1143e3.C(gVar3, AbstractC1135O.f10024i, 70, e9);
                }
                return null;
        }
    }

    public b(d dVar, Context context) {
        this.f634a = 0;
        this.f636c = dVar;
        this.f635b = context;
    }
}
