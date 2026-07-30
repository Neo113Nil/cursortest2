package d0;

import c0.C;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f1820a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f1821b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f1822c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f1823d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f1824e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f1825f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f1826g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f1827h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f1828i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f1829j;

    /* renamed from: k, reason: collision with root package name */
    public static final List f1830k;

    /* renamed from: l, reason: collision with root package name */
    public static final List f1831l;

    /* renamed from: m, reason: collision with root package name */
    public static final C f1832m;

    /* renamed from: n, reason: collision with root package name */
    public static final Map f1833n;

    static {
        e eVar = new e("--aot-shared-library-name=", "AOTSharedLibraryName");
        f1820a = eVar;
        e eVar2 = new e("--aot-shared-library-name=", "aot-shared-library-name", "io.flutter.embedding.engine.loader.FlutterLoader.", true);
        f1821b = eVar2;
        e eVar3 = new e("--flutter-assets-dir=", "FlutterAssetsDir");
        f1822c = eVar3;
        e eVar4 = new e("--flutter-assets-dir=", "flutter-assets-dir", "io.flutter.embedding.engine.loader.FlutterLoader.", true);
        f1823d = eVar4;
        e eVar5 = new e("--old-gen-heap-size=", "OldGenHeapSize");
        f1824e = eVar5;
        e eVar6 = new e("--enable-impeller=", "EnableImpeller");
        e eVar7 = new e("--impeller-backend=", "ImpellerBackend");
        e eVar8 = new e("--enable-dart-profiling", "EnableDartProfiling");
        e eVar9 = new e("--profile-startup", "ProfileStartup");
        e eVar10 = new e("--trace-startup", "TraceStartup");
        e eVar11 = new e("--merged-platform-ui-thread", "MergedPlatformUIThread");
        e eVar12 = new e("--vm-snapshot-data=", "VmSnapshotData");
        f1825f = eVar12;
        e eVar13 = new e("--isolate-snapshot-data=", "IsolateSnapshotData");
        f1826g = eVar13;
        e eVar14 = new e("--enable-hcpp-and-surface-control", "EnableHcpp");
        e eVar15 = new e("--enable-flutter-gpu", "EnableFlutterGPU");
        e eVar16 = new e("--impeller-lazy-shader-mode", "ImpellerLazyShaderInitialization");
        e eVar17 = new e("--impeller-antialias-lines", "ImpellerAntialiasLines");
        e eVar18 = new e(0, "--enable-opengl-gpu-tracing", "EnableOpenGLGPUTracing");
        e eVar19 = new e(0, "--enable-vulkan-gpu-tracing", "EnableVulkanGPUTracing");
        e eVar20 = new e(0, "--skia-deterministic-rendering", "SkiaDeterministicRendering");
        e eVar21 = new e(0, "--enable-software-rendering", "EnableSoftwareRendering");
        f1827h = eVar21;
        e eVar22 = new e(0, "--use-test-fonts", "UseTestFonts");
        e eVar23 = new e(0, "--vm-service-port=", "VMServicePort");
        e eVar24 = new e(0, "--enable-vulkan-validation", "EnableVulkanValidation");
        e eVar25 = new e(0, "--test-flag", "TestFlag");
        f1828i = eVar25;
        e eVar26 = new e(0, "--leak-vm=", "LeakVM");
        f1829j = eVar26;
        e eVar27 = new e(0, "--start-paused", "StartPaused");
        e eVar28 = new e(0, "--disable-service-auth-codes", "DisableServiceAuthCodes");
        e eVar29 = new e(0, "--endless-trace-buffer", "EndlessTraceBuffer");
        e eVar30 = new e(0, "--trace-skia", "TraceSkia");
        e eVar31 = new e(0, "--trace-skia-allowlist=", "TraceSkiaAllowList");
        e eVar32 = new e(0, "--trace-systrace", "TraceSystrace");
        e eVar33 = new e(0, "--trace-to-file=", "TraceToFile");
        e eVar34 = new e(0, "--profile-microtasks", "ProfileMicrotasks");
        e eVar35 = new e(0, "--dump-skp-on-shader-compilation", "DumpSkpOnShaderCompilation");
        e eVar36 = new e(0, "--purge-persistent-cache", "PurgePersistentCache");
        e eVar37 = new e(0, "--verbose-logging", "VerboseLogging");
        e eVar38 = new e(0, "--dart-flags=", "DartFlags");
        e eVar39 = new e(0, "--no-enable-merged-platform-ui-thread", "DisableMergedPlatformUIThread");
        List<e> unmodifiableList = Collections.unmodifiableList(Arrays.asList(eVar23, eVar22, eVar21, eVar20, eVar, eVar3, eVar6, eVar7, eVar24, eVar27, eVar28, eVar29, eVar8, eVar9, eVar30, eVar31, eVar32, eVar33, eVar34, eVar35, eVar37, eVar38, eVar11, eVar39, eVar2, eVar4, eVar5, eVar12, eVar13, eVar36, eVar10, eVar26, eVar25, eVar15, eVar16, eVar17, eVar18, eVar19, eVar14));
        f1830k = unmodifiableList;
        f1831l = Collections.unmodifiableList(Arrays.asList(eVar39));
        C c2 = new C();
        c2.put(eVar2, eVar);
        c2.put(eVar4, eVar3);
        f1832m = c2;
        HashMap hashMap = new HashMap(unmodifiableList.size());
        HashMap hashMap2 = new HashMap(unmodifiableList.size());
        for (e eVar40 : unmodifiableList) {
            hashMap.put(eVar40.f1817a, eVar40);
            hashMap2.put(eVar40.f1818b, eVar40);
        }
        f1833n = Collections.unmodifiableMap(hashMap);
        Collections.unmodifiableMap(hashMap2);
    }

    public static e a(String str) {
        int indexOf = str.indexOf(61);
        if (indexOf != -1) {
            str = str.substring(0, indexOf + 1);
        }
        e eVar = (e) f1833n.get(str);
        e eVar2 = (e) f1832m.get(eVar);
        return eVar2 != null ? eVar2 : eVar;
    }
}
