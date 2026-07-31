package I3;

import H1.RunnableC0139m;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f1187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f1188b;

    public a(c cVar, Context context) {
        this.f1188b = cVar;
        this.f1187a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        c cVar = this.f1188b;
        Context context = this.f1187a;
        T3.a.d("FlutterLoader initTask");
        int i7 = 0;
        try {
            try {
                FlutterJNI flutterJNI = cVar.f1196f;
                flutterJNI.loadLibrary(context);
                flutterJNI.updateRefreshRate();
                cVar.f1197g.execute(new RunnableC0139m(3, this));
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
                b bVar = new b(path, path2);
                Trace.endSection();
                return bVar;
            } catch (UnsatisfiedLinkError e4) {
                if (!e4.toString().contains("couldn't find \"libflutter.so\"") && !e4.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                    throw e4;
                }
                String property = System.getProperty("os.arch");
                File file = new File((String) cVar.f1195e.f1213e);
                String[] list = file.list();
                ArrayList arrayList = new ArrayList();
                String[] strArr = Build.SUPPORTED_ABIS;
                int length = strArr.length;
                int i8 = 0;
                while (i8 < length) {
                    String str = strArr[i8];
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
                        for (int i9 = i7; i9 < length2; i9++) {
                            arrayList2.add(strArr2[i9] + sb2);
                        }
                        arrayList.addAll(arrayList2);
                    }
                    String str3 = context.getApplicationInfo().sourceDir;
                    if (str3 != null && !str3.isEmpty()) {
                        arrayList.add(str3 + sb2);
                    }
                    i8++;
                    i7 = 0;
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
                throw new UnsupportedOperationException(sb3.toString(), e4);
            }
        } finally {
        }
    }
}
