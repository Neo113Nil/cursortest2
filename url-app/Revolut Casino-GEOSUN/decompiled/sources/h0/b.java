package h0;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.lifecycle.k;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import t0.AbstractC0236a;

/* loaded from: classes.dex */
public final class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f2332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f2333b;

    public b(d dVar, Context context) {
        this.f2333b = dVar;
        this.f2332a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        d dVar = this.f2333b;
        Context context = this.f2332a;
        AbstractC0236a.b("FlutterLoader initTask");
        try {
            dVar.getClass();
            FlutterJNI flutterJNI = dVar.f2341f;
            int i2 = 0;
            try {
                flutterJNI.loadLibrary(context);
                flutterJNI.updateRefreshRate();
                dVar.f2342g.execute(new k(2, this));
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
                File dir = context.getDir("flutter", 0);
                if (dir == null) {
                    dir = new File(context.getDataDir().getPath(), "app_flutter");
                }
                dir.getPath();
                c cVar = new c(path, path2);
                Trace.endSection();
                return cVar;
            } catch (UnsatisfiedLinkError e2) {
                if (!e2.toString().contains("couldn't find \"libflutter.so\"") && !e2.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                    throw e2;
                }
                String property = System.getProperty("os.arch");
                File file = new File(dVar.f2340e.f2330d);
                String[] list = file.list();
                ArrayList arrayList = new ArrayList();
                String[] strArr = Build.SUPPORTED_ABIS;
                int length = strArr.length;
                int i3 = 0;
                while (i3 < length) {
                    String str = strArr[i3];
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
                        for (int i4 = i2; i4 < length2; i4++) {
                            arrayList2.add(strArr2[i4] + sb2);
                        }
                        arrayList.addAll(arrayList2);
                    }
                    String str3 = context.getApplicationInfo().sourceDir;
                    if (str3 != null && !str3.isEmpty()) {
                        arrayList.add(str3 + sb2);
                    }
                    i3++;
                    i2 = 0;
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
                throw new UnsupportedOperationException(sb3.toString(), e2);
            }
        } finally {
        }
    }
}
