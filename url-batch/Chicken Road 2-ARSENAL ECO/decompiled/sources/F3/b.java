package F3;

import D3.M;
import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements O3.e {

    /* renamed from: f, reason: collision with root package name */
    public final FlutterJNI f712f;

    /* renamed from: g, reason: collision with root package name */
    public final AssetManager f713g;

    /* renamed from: h, reason: collision with root package name */
    public final long f714h;

    /* renamed from: i, reason: collision with root package name */
    public final g f715i;

    /* renamed from: j, reason: collision with root package name */
    public final M f716j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f717k;

    public b(FlutterJNI flutterJNI, AssetManager assetManager, long j4) {
        this.f717k = false;
        U0.h hVar = new U0.h(this);
        this.f712f = flutterJNI;
        this.f713g = assetManager;
        this.f714h = j4;
        g gVar = new g(flutterJNI);
        this.f715i = gVar;
        gVar.r("flutter/isolate", hVar);
        this.f716j = new M(4, gVar);
        if (flutterJNI.isAttached()) {
            this.f717k = true;
        }
    }

    public final void a(a aVar, List list) {
        if (this.f717k) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        T3.a.d("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(aVar);
            this.f712f.runBundleAndSnapshotFromLibrary(aVar.f709a, aVar.f711c, aVar.f710b, this.f713g, list, this.f714h);
            this.f717k = true;
            Trace.endSection();
        } finally {
        }
    }

    @Override // O3.e
    public final void d(String str, O3.c cVar) {
        this.f716j.d(str, cVar);
    }

    @Override // O3.e
    public final void k(String str, ByteBuffer byteBuffer, O3.d dVar) {
        this.f716j.k(str, byteBuffer, dVar);
    }
}
