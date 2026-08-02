package q0;

import D0.RunnableC0043c;
import android.content.Context;
import android.os.Trace;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* renamed from: q0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0285b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0287d f3376b;

    public CallableC0285b(C0287d c0287d, Context context) {
        this.f3376b = c0287d;
        this.f3375a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        Context context = this.f3375a;
        C0287d c0287d = this.f3376b;
        E0.a.b("FlutterLoader initTask");
        try {
            c0287d.getClass();
            FlutterJNI flutterJNI = c0287d.f3383e;
            try {
                flutterJNI.loadLibrary(context);
                flutterJNI.updateRefreshRate();
                c0287d.f3384f.execute(new RunnableC0043c(4, this));
                File filesDir = context.getFilesDir();
                if (filesDir == null) {
                    filesDir = new File(i1.a.o(context), "files");
                }
                String path = filesDir.getPath();
                File codeCacheDir = context.getCodeCacheDir();
                if (codeCacheDir == null) {
                    codeCacheDir = context.getCacheDir();
                }
                if (codeCacheDir == null) {
                    codeCacheDir = new File(i1.a.o(context), "cache");
                }
                String path2 = codeCacheDir.getPath();
                File dir = context.getDir("flutter", 0);
                if (dir == null) {
                    dir = new File(i1.a.o(context), "app_flutter");
                }
                dir.getPath();
                C0286c c0286c = new C0286c(path, path2);
                Trace.endSection();
                return c0286c;
            } catch (UnsatisfiedLinkError e2) {
                if (!e2.toString().contains("couldn't find \"libflutter.so\"") && !e2.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                    throw e2;
                }
                String property = System.getProperty("os.arch");
                File file = new File((String) c0287d.f3382d.f3332i);
                String[] list = file.list();
                StringBuilder sb = new StringBuilder("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                sb.append(property);
                sb.append(", and the native libraries directory (with path ");
                sb.append(file.getAbsolutePath());
                sb.append(") ");
                if (file.exists()) {
                    str = "contains the following files: " + Arrays.toString(list);
                } else {
                    str = "does not exist.";
                }
                sb.append(str);
                throw new UnsupportedOperationException(sb.toString(), e2);
            }
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
