package G;

import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements N.f {

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f275b;

    /* renamed from: c, reason: collision with root package name */
    public final AssetManager f276c;

    /* renamed from: d, reason: collision with root package name */
    public final long f277d;

    /* renamed from: e, reason: collision with root package name */
    public final j f278e;

    /* renamed from: f, reason: collision with root package name */
    public final B.k f279f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f280g;

    public b(FlutterJNI flutterJNI, AssetManager assetManager, long j2) {
        this.f280g = false;
        B.k kVar = new B.k(4, this);
        this.f275b = flutterJNI;
        this.f276c = assetManager;
        this.f277d = j2;
        j jVar = new j(flutterJNI);
        this.f278e = jVar;
        jVar.h("flutter/isolate", kVar, null);
        this.f279f = new B.k(5, jVar);
        if (flutterJNI.isAttached()) {
            this.f280g = true;
        }
    }

    public final void a(a aVar, List list) {
        if (this.f280g) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        T.a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(aVar);
            this.f275b.runBundleAndSnapshotFromLibrary(aVar.f272a, aVar.f274c, aVar.f273b, this.f276c, list, this.f277d);
            this.f280g = true;
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // N.f
    public final void d(String str, N.d dVar) {
        this.f279f.d(str, dVar);
    }

    @Override // N.f
    public final A.b e(N.h hVar) {
        return ((j) this.f279f.f44c).e(hVar);
    }

    @Override // N.f
    public final void h(String str, N.d dVar, A.b bVar) {
        this.f279f.h(str, dVar, bVar);
    }

    @Override // N.f
    public final void i(String str, ByteBuffer byteBuffer, N.e eVar) {
        this.f279f.i(str, byteBuffer, eVar);
    }
}
