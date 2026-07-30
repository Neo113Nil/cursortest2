package i4;

import h4.z;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: i4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0549e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0548d f5527a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0548d f5528b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0548d f5529c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0548d f5530d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0548d f5531e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0548d f5532f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0548d f5533g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0548d f5534h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0548d f5535i;
    public static final C0548d j;

    /* renamed from: k, reason: collision with root package name */
    public static final List f5536k;

    /* renamed from: l, reason: collision with root package name */
    public static final List f5537l;

    /* renamed from: m, reason: collision with root package name */
    public static final z f5538m;

    /* renamed from: n, reason: collision with root package name */
    public static final Map f5539n;

    static {
        C0548d c0548d = new C0548d("--aot-shared-library-name=", "AOTSharedLibraryName");
        f5527a = c0548d;
        C0548d c0548d2 = new C0548d("--aot-shared-library-name=", "aot-shared-library-name", "io.flutter.embedding.engine.loader.FlutterLoader.", true);
        f5528b = c0548d2;
        C0548d c0548d3 = new C0548d("--flutter-assets-dir=", "FlutterAssetsDir");
        f5529c = c0548d3;
        C0548d c0548d4 = new C0548d("--flutter-assets-dir=", "flutter-assets-dir", "io.flutter.embedding.engine.loader.FlutterLoader.", true);
        f5530d = c0548d4;
        C0548d c0548d5 = new C0548d("--old-gen-heap-size=", "OldGenHeapSize");
        f5531e = c0548d5;
        C0548d c0548d6 = new C0548d("--enable-impeller=", "EnableImpeller");
        C0548d c0548d7 = new C0548d("--impeller-backend=", "ImpellerBackend");
        C0548d c0548d8 = new C0548d("--enable-dart-profiling", "EnableDartProfiling");
        C0548d c0548d9 = new C0548d("--profile-startup", "ProfileStartup");
        C0548d c0548d10 = new C0548d("--trace-startup", "TraceStartup");
        C0548d c0548d11 = new C0548d("--merged-platform-ui-thread", "MergedPlatformUIThread");
        C0548d c0548d12 = new C0548d("--vm-snapshot-data=", "VmSnapshotData");
        f5532f = c0548d12;
        C0548d c0548d13 = new C0548d("--isolate-snapshot-data=", "IsolateSnapshotData");
        f5533g = c0548d13;
        C0548d c0548d14 = new C0548d("--enable-hcpp-and-surface-control", "EnableHcpp");
        C0548d c0548d15 = new C0548d("--enable-flutter-gpu", "EnableFlutterGPU");
        C0548d c0548d16 = new C0548d("--impeller-lazy-shader-mode", "ImpellerLazyShaderInitialization");
        C0548d c0548d17 = new C0548d("--impeller-antialias-lines", "ImpellerAntialiasLines");
        C0548d c0548d18 = new C0548d(0, "--enable-opengl-gpu-tracing", "EnableOpenGLGPUTracing");
        C0548d c0548d19 = new C0548d(0, "--enable-vulkan-gpu-tracing", "EnableVulkanGPUTracing");
        C0548d c0548d20 = new C0548d(0, "--skia-deterministic-rendering", "SkiaDeterministicRendering");
        C0548d c0548d21 = new C0548d(0, "--enable-software-rendering", "EnableSoftwareRendering");
        f5534h = c0548d21;
        C0548d c0548d22 = new C0548d(0, "--use-test-fonts", "UseTestFonts");
        C0548d c0548d23 = new C0548d(0, "--vm-service-port=", "VMServicePort");
        C0548d c0548d24 = new C0548d(0, "--enable-vulkan-validation", "EnableVulkanValidation");
        C0548d c0548d25 = new C0548d(0, "--test-flag", "TestFlag");
        f5535i = c0548d25;
        C0548d c0548d26 = new C0548d(0, "--leak-vm=", "LeakVM");
        j = c0548d26;
        C0548d c0548d27 = new C0548d(0, "--start-paused", "StartPaused");
        C0548d c0548d28 = new C0548d(0, "--disable-service-auth-codes", "DisableServiceAuthCodes");
        C0548d c0548d29 = new C0548d(0, "--endless-trace-buffer", "EndlessTraceBuffer");
        C0548d c0548d30 = new C0548d(0, "--trace-skia", "TraceSkia");
        C0548d c0548d31 = new C0548d(0, "--trace-skia-allowlist=", "TraceSkiaAllowList");
        C0548d c0548d32 = new C0548d(0, "--trace-systrace", "TraceSystrace");
        C0548d c0548d33 = new C0548d(0, "--trace-to-file=", "TraceToFile");
        C0548d c0548d34 = new C0548d(0, "--profile-microtasks", "ProfileMicrotasks");
        C0548d c0548d35 = new C0548d(0, "--dump-skp-on-shader-compilation", "DumpSkpOnShaderCompilation");
        C0548d c0548d36 = new C0548d(0, "--purge-persistent-cache", "PurgePersistentCache");
        C0548d c0548d37 = new C0548d(0, "--verbose-logging", "VerboseLogging");
        C0548d c0548d38 = new C0548d(0, "--dart-flags=", "DartFlags");
        C0548d c0548d39 = new C0548d(0, "--no-enable-merged-platform-ui-thread", "DisableMergedPlatformUIThread");
        List<C0548d> unmodifiableList = Collections.unmodifiableList(Arrays.asList(c0548d23, c0548d22, c0548d21, c0548d20, c0548d, c0548d3, c0548d6, c0548d7, c0548d24, c0548d27, c0548d28, c0548d29, c0548d8, c0548d9, c0548d30, c0548d31, c0548d32, c0548d33, c0548d34, c0548d35, c0548d37, c0548d38, c0548d11, c0548d39, c0548d2, c0548d4, c0548d5, c0548d12, c0548d13, c0548d36, c0548d10, c0548d26, c0548d25, c0548d15, c0548d16, c0548d17, c0548d18, c0548d19, c0548d14));
        f5536k = unmodifiableList;
        f5537l = Collections.unmodifiableList(Arrays.asList(c0548d39));
        z zVar = new z();
        zVar.put(c0548d2, c0548d);
        zVar.put(c0548d4, c0548d3);
        f5538m = zVar;
        HashMap hashMap = new HashMap(unmodifiableList.size());
        HashMap hashMap2 = new HashMap(unmodifiableList.size());
        for (C0548d c0548d40 : unmodifiableList) {
            hashMap.put(c0548d40.f5524a, c0548d40);
            hashMap2.put(c0548d40.f5525b, c0548d40);
        }
        f5539n = Collections.unmodifiableMap(hashMap);
        Collections.unmodifiableMap(hashMap2);
    }

    public static C0548d a(String str) {
        int indexOf = str.indexOf(61);
        if (indexOf != -1) {
            str = str.substring(0, indexOf + 1);
        }
        C0548d c0548d = (C0548d) f5539n.get(str);
        C0548d c0548d2 = (C0548d) f5538m.get(c0548d);
        return c0548d2 != null ? c0548d2 : c0548d;
    }
}
