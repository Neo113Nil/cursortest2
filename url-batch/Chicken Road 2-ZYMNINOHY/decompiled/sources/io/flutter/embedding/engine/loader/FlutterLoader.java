package io.flutter.embedding.engine.loader;

import E.AbstractC0005f;
import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngineFlags;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.util.HandlerCompat;
import io.flutter.util.PathUtils;
import io.flutter.util.TraceSection;
import io.flutter.view.VsyncWaiter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class FlutterLoader {
    private static final String AOT_VMSERVICE_SHARED_LIBRARY_NAME = "aot-vmservice-shared-library-name";
    private static final String DEFAULT_KERNEL_BLOB = "kernel_blob.bin";
    private static final String DEFAULT_LIBRARY = "libflutter.so";
    private static final String SNAPSHOT_ASSET_PATH_KEY = "snapshot-asset-path";
    private static final String TAG = "FlutterLoader";
    private static final String VMSERVICE_SNAPSHOT_LIBRARY = "libvmservice_snapshot.so";
    private static FlutterLoader instance;
    private boolean enableSoftwareRendering;
    private ExecutorService executorService;
    private FlutterApplicationInfo flutterApplicationInfo;
    private FlutterJNI flutterJNI;
    Future<InitResult> initResultFuture;
    private long initStartTimestampMillis;
    boolean initialized;
    private Settings settings;

    /* renamed from: io.flutter.embedding.engine.loader.FlutterLoader$1, reason: invalid class name */
    public class AnonymousClass1 implements Callable<InitResult> {
        final /* synthetic */ Context val$appContext;

        public AnonymousClass1(Context context) {
            this.val$appContext = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$call$0() {
            FlutterLoader.this.flutterJNI.prefetchDefaultFontManager();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public InitResult call() {
            TraceSection traceSection;
            String str;
            String str2;
            TraceSection traceSection2;
            TraceSection scoped = TraceSection.scoped("FlutterLoader initTask");
            try {
                ResourceExtractor initResources = FlutterLoader.this.initResources(this.val$appContext);
                try {
                    FlutterLoader.this.flutterJNI.loadLibrary(this.val$appContext);
                    FlutterLoader.this.flutterJNI.updateRefreshRate();
                    FlutterLoader.this.executorService.execute(new Runnable() { // from class: io.flutter.embedding.engine.loader.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            FlutterLoader.AnonymousClass1.this.lambda$call$0();
                        }
                    });
                    if (initResources != null) {
                        initResources.waitForCompletion();
                    }
                    InitResult initResult = new InitResult(PathUtils.getFilesDir(this.val$appContext), PathUtils.getCacheDirectory(this.val$appContext), PathUtils.getDataDirectory(this.val$appContext), null);
                    if (scoped != null) {
                        scoped.close();
                    }
                    return initResult;
                } catch (UnsatisfiedLinkError e4) {
                    if (!e4.toString().contains("couldn't find \"libflutter.so\"") && !e4.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                        throw e4;
                    }
                    String property = System.getProperty("os.arch");
                    FlutterLoader flutterLoader = FlutterLoader.this;
                    File fileFromPath = flutterLoader.getFileFromPath(flutterLoader.flutterApplicationInfo.nativeLibraryDir);
                    String[] list = fileFromPath.list();
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = Build.SUPPORTED_ABIS;
                    int length = strArr.length;
                    int i4 = 0;
                    while (i4 < length) {
                        String str3 = strArr[i4];
                        StringBuilder sb = new StringBuilder();
                        sb.append("!");
                        String str4 = File.separator;
                        sb.append(str4);
                        sb.append("lib");
                        sb.append(str4);
                        sb.append(str3);
                        String sb2 = sb.toString();
                        String[] strArr2 = this.val$appContext.getApplicationInfo().splitSourceDirs;
                        ArrayList arrayList2 = new ArrayList();
                        if (strArr2 != null) {
                            int length2 = strArr2.length;
                            int i5 = 0;
                            while (i5 < length2) {
                                traceSection = scoped;
                                try {
                                    arrayList2.add(strArr2[i5] + sb2);
                                    i5++;
                                    scoped = traceSection;
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    if (traceSection == null) {
                                        throw th2;
                                    }
                                    try {
                                        traceSection.close();
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                        throw th2;
                                    }
                                }
                            }
                            traceSection2 = scoped;
                            arrayList.addAll(arrayList2);
                        } else {
                            traceSection2 = scoped;
                        }
                        String str5 = this.val$appContext.getApplicationInfo().sourceDir;
                        if (str5 != null && !str5.isEmpty()) {
                            arrayList.add(str5 + sb2);
                        }
                        i4++;
                        scoped = traceSection2;
                    }
                    traceSection = scoped;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                    sb3.append(property);
                    sb3.append(", and the native libraries directory (with path ");
                    sb3.append(fileFromPath.getAbsolutePath());
                    sb3.append(") ");
                    if (fileFromPath.exists()) {
                        str = "contains the following files: " + Arrays.toString(list);
                    } else {
                        str = "does not exist";
                    }
                    sb3.append(str);
                    if (arrayList.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = ", and the split and source libraries directory (with path(s) " + arrayList + ")";
                    }
                    sb3.append(str2);
                    sb3.append(".");
                    throw new UnsupportedOperationException(sb3.toString(), e4);
                }
            } catch (Throwable th4) {
                th = th4;
                traceSection = scoped;
            }
        }
    }

    public static class InitResult {
        final String appStoragePath;
        final String dataDirPath;
        final String engineCachesPath;

        public /* synthetic */ InitResult(String str, String str2, String str3, AnonymousClass1 anonymousClass1) {
            this(str, str2, str3);
        }

        private InitResult(String str, String str2, String str3) {
            this.appStoragePath = str;
            this.engineCachesPath = str2;
            this.dataDirPath = str3;
        }
    }

    public static class Settings {
        private String logTag;

        public String getLogTag() {
            return this.logTag;
        }

        public void setLogTag(String str) {
            this.logTag = str;
        }
    }

    public FlutterLoader() {
        this(FlutterInjector.instance().getFlutterJNIFactory().provideFlutterJNI());
    }

    private String fullAssetPathFrom(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.flutterApplicationInfo.flutterAssetsDir);
        return AbstractC0005f.q(sb, File.separator, str);
    }

    private String getSafeAotSharedLibraryName(Context context, String str) throws IOException {
        File fileFromPath = getFileFromPath(str);
        try {
            String canonicalPath = fileFromPath.getCanonicalPath();
            boolean startsWith = canonicalPath.startsWith(context.getApplicationContext().getFilesDir().getCanonicalPath() + File.separator);
            boolean endsWith = canonicalPath.endsWith(".so");
            if (startsWith && endsWith) {
                return canonicalPath;
            }
            Log.e(TAG, "External path " + canonicalPath + " rejected; not overriding aot-shared-library-name.");
            return null;
        } catch (IOException unused) {
            Log.e(TAG, "External path " + fileFromPath.getPath() + " is not a valid path. Please ensure this shared AOT library exists.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResourceExtractor initResources(Context context) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$ensureInitializationCompleteAsync$0(Context context, String[] strArr, Handler handler, Runnable runnable) {
        ensureInitializationComplete(context.getApplicationContext(), strArr);
        handler.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$ensureInitializationCompleteAsync$1(Context context, String[] strArr, Handler handler, Runnable runnable) {
        try {
            this.initResultFuture.get();
            HandlerCompat.createAsyncHandler(Looper.getMainLooper()).post(new a(this, context, strArr, handler, runnable, 1));
        } catch (Exception e4) {
            Log.e(TAG, "Flutter initialization failed.", e4);
            throw new RuntimeException(e4);
        }
    }

    private void maybeAddAotSharedLibraryNameArg(Context context, String str, List<String> list) {
        String str2;
        try {
            str2 = getSafeAotSharedLibraryName(context, str);
        } catch (IOException e4) {
            Log.e(TAG, "Error while validating AOT shared library name flag: " + str, e4);
            str2 = null;
        }
        if (str2 != null) {
            list.add(0, FlutterEngineFlags.AOT_SHARED_LIBRARY_NAME.engineArgument + str2);
            return;
        }
        Log.e(TAG, "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
    }

    public boolean automaticallyRegisterPlugins() {
        return this.flutterApplicationInfo.automaticallyRegisterPlugins;
    }

    public void ensureInitializationComplete(Context context, String[] strArr) {
        ensureInitializationComplete(context, strArr, true);
    }

    public void ensureInitializationCompleteAsync(Context context, String[] strArr, Handler handler, Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.settings == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        if (this.initialized) {
            handler.post(runnable);
        } else {
            this.executorService.execute(new a(this, context, strArr, handler, runnable, 0));
        }
    }

    public String findAppBundlePath() {
        return this.flutterApplicationInfo.flutterAssetsDir;
    }

    public File getFileFromPath(String str) {
        return new File(str);
    }

    public String getLookupKeyForAsset(String str) {
        return fullAssetPathFrom(str);
    }

    public boolean getSofwareRenderingEnabledViaManifest() {
        return this.enableSoftwareRendering;
    }

    public boolean initialized() {
        return this.initialized;
    }

    public void startInitialization(Context context) {
        startInitialization(context, new Settings());
    }

    public FlutterLoader(FlutterJNI flutterJNI) {
        this(flutterJNI, FlutterInjector.instance().executorService());
    }

    public void ensureInitializationComplete(Context context, String[] strArr, boolean z) {
        boolean z4;
        boolean z5;
        Iterator<FlutterEngineFlags.Flag> it;
        if (this.initialized) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.settings == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            TraceSection scoped = TraceSection.scoped("FlutterLoader#ensureInitializationComplete");
            try {
                InitResult initResult = this.initResultFuture.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + this.flutterApplicationInfo.nativeLibraryDir + File.separator + DEFAULT_LIBRARY);
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle != null) {
                    z4 = false;
                    z5 = false;
                    for (Iterator<FlutterEngineFlags.Flag> it2 = FlutterEngineFlags.ALL_FLAGS.iterator(); it2.hasNext(); it2 = it) {
                        FlutterEngineFlags.Flag next = it2.next();
                        String str = next.metadataKey;
                        if (bundle.containsKey(str)) {
                            if (next == FlutterEngineFlags.TEST_FLAG) {
                                Log.w(TAG, "For testing purposes only: test flag specified in the manifest was loaded by the FlutterLoader.");
                            } else {
                                if (FlutterEngineFlags.isDisabled(next)) {
                                    throw new IllegalArgumentException(str + " is disabled and no longer allowed. Please remove this flag from your application manifest.");
                                }
                                if (FlutterEngineFlags.getReplacementFlagIfDeprecated(next) != null) {
                                    StringBuilder sb = new StringBuilder();
                                    it = it2;
                                    sb.append("If you are trying to specify ");
                                    sb.append(str);
                                    sb.append(" in your application manifest, please make sure to use the new metadata key name: ");
                                    sb.append(FlutterEngineFlags.getReplacementFlagIfDeprecated(next).metadataKey);
                                    Log.w(TAG, sb.toString());
                                } else {
                                    it = it2;
                                    if (!next.allowedInRelease && z) {
                                        Log.e(TAG, "Flag with metadata key " + str + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                    }
                                }
                                if (next == FlutterEngineFlags.OLD_GEN_HEAP_SIZE) {
                                    z4 = true;
                                } else if (next == FlutterEngineFlags.LEAK_VM) {
                                    z5 = true;
                                } else {
                                    FlutterEngineFlags.Flag flag = FlutterEngineFlags.ENABLE_SOFTWARE_RENDERING;
                                    if (next == flag) {
                                        this.enableSoftwareRendering = bundle.getBoolean(flag.metadataKey, false);
                                    } else {
                                        if (next != FlutterEngineFlags.AOT_SHARED_LIBRARY_NAME) {
                                            if (next == FlutterEngineFlags.DEPRECATED_AOT_SHARED_LIBRARY_NAME) {
                                            }
                                        }
                                        String string = bundle.getString(str);
                                        if (string == null) {
                                            Log.e(TAG, "Flag " + str + " was specified with an empty path. Please specify a path to the desired AOT shared library.");
                                        } else {
                                            maybeAddAotSharedLibraryNameArg(context, string, arrayList);
                                        }
                                    }
                                }
                                String str2 = next.engineArgument;
                                if (next.hasCommandLineValue()) {
                                    Object obj = bundle.get(str);
                                    String obj2 = obj != null ? obj.toString() : null;
                                    if (obj2 == null) {
                                        Log.e(TAG, "Flag with metadata key " + str + " requires a value, but no value was found. Please specify a value.");
                                    } else {
                                        arrayList.add(str2 + obj2);
                                    }
                                } else if (bundle.getBoolean(str, false)) {
                                    arrayList.add(str2);
                                }
                            }
                        }
                        it = it2;
                    }
                } else {
                    z4 = false;
                    z5 = false;
                }
                if (strArr != null) {
                    for (String str3 : strArr) {
                        FlutterEngineFlags.Flag flagByEngineArgument = FlutterEngineFlags.getFlagByEngineArgument(str3);
                        if (flagByEngineArgument == null) {
                            arrayList.add(str3);
                        } else if (flagByEngineArgument.equals(FlutterEngineFlags.TEST_FLAG)) {
                            Log.w(TAG, "For testing purposes only: test flag specified on the command line was loaded by the FlutterLoader.");
                        } else {
                            FlutterEngineFlags.Flag flag2 = FlutterEngineFlags.AOT_SHARED_LIBRARY_NAME;
                            if (!flagByEngineArgument.equals(flag2) && !flagByEngineArgument.equals(FlutterEngineFlags.DEPRECATED_AOT_SHARED_LIBRARY_NAME)) {
                                if (flagByEngineArgument.allowedInRelease || !z) {
                                    arrayList.add(str3);
                                } else {
                                    Log.e(TAG, "Command line argument " + str3 + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                }
                            }
                            maybeAddAotSharedLibraryNameArg(context, str3.substring(flag2.engineArgument.length()), arrayList);
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                FlutterEngineFlags.Flag flag3 = FlutterEngineFlags.AOT_SHARED_LIBRARY_NAME;
                sb2.append(flag3.engineArgument);
                sb2.append(this.flutterApplicationInfo.aotSharedLibraryName);
                arrayList.add(sb2.toString());
                arrayList.add(flag3.engineArgument + this.flutterApplicationInfo.nativeLibraryDir + File.separator + this.flutterApplicationInfo.aotSharedLibraryName);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("--cache-dir-path=");
                sb3.append(initResult.engineCachesPath);
                arrayList.add(sb3.toString());
                if (this.flutterApplicationInfo.domainNetworkPolicy != null) {
                    arrayList.add("--domain-network-policy=" + this.flutterApplicationInfo.domainNetworkPolicy);
                }
                if (this.settings.getLogTag() != null) {
                    arrayList.add("--log-tag=" + this.settings.getLogTag());
                }
                if (!z4) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    arrayList.add(FlutterEngineFlags.OLD_GEN_HEAP_SIZE.engineArgument + String.valueOf((int) ((r2.totalMem / 1000000.0d) / 2.0d)));
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (!z5) {
                    arrayList.add(FlutterEngineFlags.LEAK_VM.engineArgument + "true");
                }
                this.flutterJNI.init(context, (String[]) arrayList.toArray(new String[0]), null, initResult.appStoragePath, initResult.engineCachesPath, SystemClock.uptimeMillis() - this.initStartTimestampMillis, Build.VERSION.SDK_INT);
                this.initialized = true;
                if (scoped != null) {
                    scoped.close();
                }
            } finally {
            }
        } catch (Exception e4) {
            Log.e(TAG, "Flutter initialization failed.", e4);
            throw new RuntimeException(e4);
        }
    }

    public String getLookupKeyForAsset(String str, String str2) {
        StringBuilder sb = new StringBuilder("packages");
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str2);
        sb.append(str3);
        sb.append(str);
        return getLookupKeyForAsset(sb.toString());
    }

    public void startInitialization(Context context, Settings settings) {
        if (this.settings != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        TraceSection scoped = TraceSection.scoped("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.settings = settings;
            this.initStartTimestampMillis = SystemClock.uptimeMillis();
            this.flutterApplicationInfo = ApplicationInfoLoader.load(applicationContext);
            VsyncWaiter.getInstance((DisplayManager) applicationContext.getSystemService("display"), this.flutterJNI).init();
            this.initResultFuture = this.executorService.submit(new AnonymousClass1(applicationContext));
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public FlutterLoader(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.enableSoftwareRendering = false;
        this.initialized = false;
        this.flutterJNI = flutterJNI;
        this.executorService = executorService;
    }
}
