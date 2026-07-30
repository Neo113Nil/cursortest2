package g0;

import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.n;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class b implements n0.e {

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f334b;

    /* renamed from: c, reason: collision with root package name */
    public final AssetManager f335c;

    /* renamed from: d, reason: collision with root package name */
    public final long f336d;

    /* renamed from: e, reason: collision with root package name */
    public final g f337e;

    /* renamed from: f, reason: collision with root package name */
    public final n f338f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f339g;

    public b(FlutterJNI flutterJNI, AssetManager assetManager, long j2) {
        this.f339g = false;
        c0.b bVar = new c0.b(3, this);
        this.f334b = flutterJNI;
        this.f335c = assetManager;
        this.f336d = j2;
        g gVar = new g(flutterJNI);
        this.f337e = gVar;
        gVar.b("flutter/isolate", bVar);
        this.f338f = new n(3, gVar);
        if (flutterJNI.isAttached()) {
            this.f339g = true;
        }
    }

    public final void a(a aVar, List list) {
        if (this.f339g) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        s0.a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(aVar);
            this.f334b.runBundleAndSnapshotFromLibrary(aVar.f331a, aVar.f333c, aVar.f332b, this.f335c, list, this.f336d);
            this.f339g = true;
            Trace.endSection();
        } finally {
        }
    }

    @Override // n0.e
    public final void h(String str, n0.c cVar) {
        this.f338f.h(str, cVar);
    }

    @Override // n0.e
    public final void k(String str, ByteBuffer byteBuffer, n0.d dVar) {
        this.f338f.k(str, byteBuffer, dVar);
    }
}
