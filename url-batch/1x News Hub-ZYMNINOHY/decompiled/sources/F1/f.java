package F1;

import E1.E;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f501a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f502b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f503c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f504d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f505e;
    public static final e f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f506g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f507h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f508i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f509j;

    /* renamed from: k, reason: collision with root package name */
    public static final List f510k;

    /* renamed from: l, reason: collision with root package name */
    public static final List f511l;

    /* renamed from: m, reason: collision with root package name */
    public static final E f512m;

    /* renamed from: n, reason: collision with root package name */
    public static final Map f513n;

    static {
        e eVar = new e("--aot-shared-library-name=", "AOTSharedLibraryName");
        f501a = eVar;
        e eVar2 = new e("--aot-shared-library-name=", true, "aot-shared-library-name", "io.flutter.embedding.engine.loader.FlutterLoader.");
        f502b = eVar2;
        e eVar3 = new e("--flutter-assets-dir=", "FlutterAssetsDir");
        f503c = eVar3;
        e eVar4 = new e("--flutter-assets-dir=", true, "flutter-assets-dir", "io.flutter.embedding.engine.loader.FlutterLoader.");
        f504d = eVar4;
        e eVar5 = new e("--old-gen-heap-size=", "OldGenHeapSize");
        f505e = eVar5;
        e eVar6 = new e("--enable-impeller=", "EnableImpeller");
        e eVar7 = new e("--impeller-backend=", "ImpellerBackend");
        e eVar8 = new e("--enable-dart-profiling", "EnableDartProfiling");
        e eVar9 = new e("--profile-startup", "ProfileStartup");
        e eVar10 = new e("--trace-startup", "TraceStartup");
        e eVar11 = new e("--merged-platform-ui-thread", "MergedPlatformUIThread");
        e eVar12 = new e("--vm-snapshot-data=", "VmSnapshotData");
        f = eVar12;
        e eVar13 = new e("--isolate-snapshot-data=", "IsolateSnapshotData");
        f506g = eVar13;
        e eVar14 = new e("--enable-hcpp-and-surface-control", "EnableHcpp");
        e eVar15 = new e("--enable-flutter-gpu", "EnableFlutterGPU");
        e eVar16 = new e("--impeller-lazy-shader-mode", "ImpellerLazyShaderInitialization");
        e eVar17 = new e("--impeller-antialias-lines", "ImpellerAntialiasLines");
        e eVar18 = new e("--enable-opengl-gpu-tracing", "EnableOpenGLGPUTracing", 0);
        e eVar19 = new e("--enable-vulkan-gpu-tracing", "EnableVulkanGPUTracing", 0);
        e eVar20 = new e("--skia-deterministic-rendering", "SkiaDeterministicRendering", 0);
        e eVar21 = new e("--enable-software-rendering", "EnableSoftwareRendering", 0);
        f507h = eVar21;
        e eVar22 = new e("--use-test-fonts", "UseTestFonts", 0);
        e eVar23 = new e("--vm-service-port=", "VMServicePort", 0);
        e eVar24 = new e("--enable-vulkan-validation", "EnableVulkanValidation", 0);
        e eVar25 = new e("--test-flag", "TestFlag", 0);
        f508i = eVar25;
        e eVar26 = new e("--leak-vm=", "LeakVM", 0);
        f509j = eVar26;
        e eVar27 = new e("--start-paused", "StartPaused", 0);
        e eVar28 = new e("--disable-service-auth-codes", "DisableServiceAuthCodes", 0);
        e eVar29 = new e("--endless-trace-buffer", "EndlessTraceBuffer", 0);
        e eVar30 = new e("--trace-skia", "TraceSkia", 0);
        e eVar31 = new e("--trace-skia-allowlist=", "TraceSkiaAllowList", 0);
        e eVar32 = new e("--trace-systrace", "TraceSystrace", 0);
        e eVar33 = new e("--trace-to-file=", "TraceToFile", 0);
        e eVar34 = new e("--profile-microtasks", "ProfileMicrotasks", 0);
        e eVar35 = new e("--dump-skp-on-shader-compilation", "DumpSkpOnShaderCompilation", 0);
        e eVar36 = new e("--purge-persistent-cache", "PurgePersistentCache", 0);
        e eVar37 = new e("--verbose-logging", "VerboseLogging", 0);
        e eVar38 = new e("--dart-flags=", "DartFlags", 0);
        e eVar39 = new e("--no-enable-merged-platform-ui-thread", "DisableMergedPlatformUIThread", 0);
        List<e> unmodifiableList = Collections.unmodifiableList(Arrays.asList(eVar23, eVar22, eVar21, eVar20, eVar, eVar3, eVar6, eVar7, eVar24, eVar27, eVar28, eVar29, eVar8, eVar9, eVar30, eVar31, eVar32, eVar33, eVar34, eVar35, eVar37, eVar38, eVar11, eVar39, eVar2, eVar4, eVar5, eVar12, eVar13, eVar36, eVar10, eVar26, eVar25, eVar15, eVar16, eVar17, eVar18, eVar19, eVar14));
        f510k = unmodifiableList;
        f511l = Collections.unmodifiableList(Arrays.asList(eVar39));
        E e3 = new E();
        e3.put(eVar2, eVar);
        e3.put(eVar4, eVar3);
        f512m = e3;
        HashMap hashMap = new HashMap(unmodifiableList.size());
        HashMap hashMap2 = new HashMap(unmodifiableList.size());
        for (e eVar40 : unmodifiableList) {
            hashMap.put(eVar40.f498a, eVar40);
            hashMap2.put(eVar40.f499b, eVar40);
        }
        f513n = Collections.unmodifiableMap(hashMap);
        Collections.unmodifiableMap(hashMap2);
    }

    public static e a(String str) {
        int indexOf = str.indexOf(61);
        if (indexOf != -1) {
            str = str.substring(0, indexOf + 1);
        }
        e eVar = (e) f513n.get(str);
        e eVar2 = (e) f512m.get(eVar);
        return eVar2 != null ? eVar2 : eVar;
    }
}
