package F;

import D.u;
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
    public final FlutterJNI f200b;

    /* renamed from: c, reason: collision with root package name */
    public final AssetManager f201c;

    /* renamed from: d, reason: collision with root package name */
    public final long f202d;

    /* renamed from: e, reason: collision with root package name */
    public final j f203e;

    /* renamed from: f, reason: collision with root package name */
    public final u f204f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f205g;

    public b(FlutterJNI flutterJNI, AssetManager assetManager, long j2) {
        this.f205g = false;
        u uVar = new u(2, this);
        this.f200b = flutterJNI;
        this.f201c = assetManager;
        this.f202d = j2;
        j jVar = new j(flutterJNI);
        this.f203e = jVar;
        jVar.a("flutter/isolate", uVar, null);
        this.f204f = new u(3, jVar);
        if (flutterJNI.isAttached()) {
            this.f205g = true;
        }
    }

    @Override // N.f
    public final void a(String str, N.d dVar, B.b bVar) {
        this.f204f.a(str, dVar, bVar);
    }

    @Override // N.f
    public final void b(String str, N.d dVar) {
        this.f204f.b(str, dVar);
    }

    public final void c(a aVar, List list) {
        if (this.f205g) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        T.a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(aVar);
            this.f200b.runBundleAndSnapshotFromLibrary(aVar.f197a, aVar.f199c, aVar.f198b, this.f201c, list, this.f202d);
            this.f205g = true;
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
    public final B.b e(N.h hVar) {
        return ((j) this.f204f.f111c).e(hVar);
    }

    @Override // N.f
    public final void f(String str, ByteBuffer byteBuffer, N.e eVar) {
        this.f204f.f(str, byteBuffer, eVar);
    }
}
