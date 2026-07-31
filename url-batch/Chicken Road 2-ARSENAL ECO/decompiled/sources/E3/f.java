package E3;

import D3.F;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f635a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f636b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f637c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f638d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f639e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f640f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f641g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f642h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f643i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f644j;

    /* renamed from: k, reason: collision with root package name */
    public static final List f645k;

    /* renamed from: l, reason: collision with root package name */
    public static final List f646l;

    /* renamed from: m, reason: collision with root package name */
    public static final F f647m;

    /* renamed from: n, reason: collision with root package name */
    public static final Map f648n;

    static {
        e eVar = new e("--aot-shared-library-name=", "AOTSharedLibraryName");
        f635a = eVar;
        e eVar2 = new e("--aot-shared-library-name=", "aot-shared-library-name", "io.flutter.embedding.engine.loader.FlutterLoader.", true);
        f636b = eVar2;
        e eVar3 = new e("--flutter-assets-dir=", "FlutterAssetsDir");
        f637c = eVar3;
        e eVar4 = new e("--flutter-assets-dir=", "flutter-assets-dir", "io.flutter.embedding.engine.loader.FlutterLoader.", true);
        f638d = eVar4;
        e eVar5 = new e("--old-gen-heap-size=", "OldGenHeapSize");
        f639e = eVar5;
        e eVar6 = new e("--enable-impeller=", "EnableImpeller");
        e eVar7 = new e("--impeller-backend=", "ImpellerBackend");
        e eVar8 = new e("--enable-dart-profiling", "EnableDartProfiling");
        e eVar9 = new e("--profile-startup", "ProfileStartup");
        e eVar10 = new e("--trace-startup", "TraceStartup");
        e eVar11 = new e("--merged-platform-ui-thread", "MergedPlatformUIThread");
        e eVar12 = new e("--vm-snapshot-data=", "VmSnapshotData");
        f640f = eVar12;
        e eVar13 = new e("--isolate-snapshot-data=", "IsolateSnapshotData");
        f641g = eVar13;
        e eVar14 = new e("--enable-hcpp-and-surface-control", "EnableHcpp");
        e eVar15 = new e("--enable-flutter-gpu", "EnableFlutterGPU");
        e eVar16 = new e("--impeller-lazy-shader-mode", "ImpellerLazyShaderInitialization");
        e eVar17 = new e("--impeller-antialias-lines", "ImpellerAntialiasLines");
        e eVar18 = new e("--enable-opengl-gpu-tracing", 0, "EnableOpenGLGPUTracing");
        e eVar19 = new e("--enable-vulkan-gpu-tracing", 0, "EnableVulkanGPUTracing");
        e eVar20 = new e("--skia-deterministic-rendering", 0, "SkiaDeterministicRendering");
        e eVar21 = new e("--enable-software-rendering", 0, "EnableSoftwareRendering");
        f642h = eVar21;
        e eVar22 = new e("--use-test-fonts", 0, "UseTestFonts");
        e eVar23 = new e("--vm-service-port=", 0, "VMServicePort");
        e eVar24 = new e("--enable-vulkan-validation", 0, "EnableVulkanValidation");
        e eVar25 = new e("--test-flag", 0, "TestFlag");
        f643i = eVar25;
        e eVar26 = new e("--leak-vm=", 0, "LeakVM");
        f644j = eVar26;
        e eVar27 = new e("--start-paused", 0, "StartPaused");
        e eVar28 = new e("--disable-service-auth-codes", 0, "DisableServiceAuthCodes");
        e eVar29 = new e("--endless-trace-buffer", 0, "EndlessTraceBuffer");
        e eVar30 = new e("--trace-skia", 0, "TraceSkia");
        e eVar31 = new e("--trace-skia-allowlist=", 0, "TraceSkiaAllowList");
        e eVar32 = new e("--trace-systrace", 0, "TraceSystrace");
        e eVar33 = new e("--trace-to-file=", 0, "TraceToFile");
        e eVar34 = new e("--profile-microtasks", 0, "ProfileMicrotasks");
        e eVar35 = new e("--dump-skp-on-shader-compilation", 0, "DumpSkpOnShaderCompilation");
        e eVar36 = new e("--purge-persistent-cache", 0, "PurgePersistentCache");
        e eVar37 = new e("--verbose-logging", 0, "VerboseLogging");
        e eVar38 = new e("--dart-flags=", 0, "DartFlags");
        e eVar39 = new e("--no-enable-merged-platform-ui-thread", 0, "DisableMergedPlatformUIThread");
        List<e> unmodifiableList = Collections.unmodifiableList(Arrays.asList(eVar23, eVar22, eVar21, eVar20, eVar, eVar3, eVar6, eVar7, eVar24, eVar27, eVar28, eVar29, eVar8, eVar9, eVar30, eVar31, eVar32, eVar33, eVar34, eVar35, eVar37, eVar38, eVar11, eVar39, eVar2, eVar4, eVar5, eVar12, eVar13, eVar36, eVar10, eVar26, eVar25, eVar15, eVar16, eVar17, eVar18, eVar19, eVar14));
        f645k = unmodifiableList;
        f646l = Collections.unmodifiableList(Arrays.asList(eVar39));
        F f7 = new F();
        f7.put(eVar2, eVar);
        f7.put(eVar4, eVar3);
        f647m = f7;
        HashMap hashMap = new HashMap(unmodifiableList.size());
        HashMap hashMap2 = new HashMap(unmodifiableList.size());
        for (e eVar40 : unmodifiableList) {
            hashMap.put(eVar40.f632a, eVar40);
            hashMap2.put(eVar40.f633b, eVar40);
        }
        f648n = Collections.unmodifiableMap(hashMap);
        Collections.unmodifiableMap(hashMap2);
    }

    public static e a(String str) {
        int indexOf = str.indexOf(61);
        if (indexOf != -1) {
            str = str.substring(0, indexOf + 1);
        }
        e eVar = (e) f648n.get(str);
        e eVar2 = (e) f647m.get(eVar);
        return eVar2 != null ? eVar2 : eVar;
    }
}
