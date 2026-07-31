package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.z;
import m6.f0;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: m, reason: collision with root package name */
    public static final b f18411m;

    /* renamed from: n, reason: collision with root package name */
    private static final f0 f18412n;

    static {
        int a7;
        int d7;
        b bVar = new b();
        f18411m = bVar;
        a7 = i6.f.a(64, z.a());
        d7 = b0.d("kotlinx.coroutines.io.parallelism", a7, 0, 0, 12, null);
        f18412n = new e(bVar, d7, "Dispatchers.IO", 1);
    }

    private b() {
        super(0, 0, null, 7, null);
    }

    public final f0 T() {
        return f18412n;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // m6.f0
    public String toString() {
        return "Dispatchers.Default";
    }
}
