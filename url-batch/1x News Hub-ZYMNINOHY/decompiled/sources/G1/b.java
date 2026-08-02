package G1;

import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import b0.C0178i;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements P1.f {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f534a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager f535b;

    /* renamed from: c, reason: collision with root package name */
    public final long f536c;

    /* renamed from: d, reason: collision with root package name */
    public final i f537d;

    /* renamed from: e, reason: collision with root package name */
    public final C0178i f538e;
    public boolean f;

    public b(FlutterJNI flutterJNI, AssetManager assetManager, long j3) {
        this.f = false;
        C0.e eVar = new C0.e(4, this);
        this.f534a = flutterJNI;
        this.f535b = assetManager;
        this.f536c = j3;
        i iVar = new i(flutterJNI);
        this.f537d = iVar;
        iVar.d("flutter/isolate", eVar, null);
        this.f538e = new C0178i(5, iVar);
        if (flutterJNI.isAttached()) {
            this.f = true;
        }
    }

    public final void a(a aVar, List list) {
        if (this.f) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        Z1.a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(aVar);
            this.f534a.runBundleAndSnapshotFromLibrary(aVar.f531a, aVar.f533c, aVar.f532b, this.f535b, list, this.f536c);
            this.f = true;
            Trace.endSection();
        } finally {
        }
    }

    @Override // P1.f
    public final void b(String str, P1.d dVar) {
        this.f538e.b(str, dVar);
    }

    @Override // P1.f
    public final void d(String str, P1.d dVar, K0.j jVar) {
        this.f538e.d(str, dVar, jVar);
    }

    @Override // P1.f
    public final K0.j e(P1.j jVar) {
        return ((i) this.f538e.f2532b).e(jVar);
    }

    @Override // P1.f
    public final void k(String str, ByteBuffer byteBuffer) {
        this.f538e.k(str, byteBuffer);
    }

    @Override // P1.f
    public final void q(String str, ByteBuffer byteBuffer, P1.e eVar) {
        this.f538e.q(str, byteBuffer, eVar);
    }
}
