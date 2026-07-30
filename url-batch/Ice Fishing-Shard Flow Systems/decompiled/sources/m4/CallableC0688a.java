package m4;

import A.k;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* renamed from: m4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0688a implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f6530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0690c f6531e;

    public CallableC0688a(C0690c c0690c, Context context) {
        this.f6531e = c0690c;
        this.f6530d = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C0690c c0690c = this.f6531e;
        Context context = this.f6530d;
        A4.a.d("FlutterLoader initTask");
        int i2 = 0;
        try {
            try {
                FlutterJNI flutterJNI = c0690c.f6539f;
                flutterJNI.loadLibrary(context);
                flutterJNI.updateRefreshRate();
                c0690c.f6540g.execute(new k(20, this));
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
                C0689b c0689b = new C0689b(path, path2);
                Trace.endSection();
                return c0689b;
            } catch (UnsatisfiedLinkError e7) {
                if (!e7.toString().contains("couldn't find \"libflutter.so\"") && !e7.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                    throw e7;
                }
                String property = System.getProperty("os.arch");
                File file = new File((String) c0690c.f6538e.f7208e);
                String[] list = file.list();
                ArrayList arrayList = new ArrayList();
                String[] strArr = Build.SUPPORTED_ABIS;
                int length = strArr.length;
                int i5 = 0;
                while (i5 < length) {
                    String str = strArr[i5];
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
                        for (int i7 = i2; i7 < length2; i7++) {
                            arrayList2.add(strArr2[i7] + sb2);
                        }
                        arrayList.addAll(arrayList2);
                    }
                    String str3 = context.getApplicationInfo().sourceDir;
                    if (str3 != null && !str3.isEmpty()) {
                        arrayList.add(str3 + sb2);
                    }
                    i5++;
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
                throw new UnsupportedOperationException(sb3.toString(), e7);
            }
        } finally {
        }
    }
}
