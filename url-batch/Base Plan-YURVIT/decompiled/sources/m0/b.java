package m0;

import B0.C0000a;
import B0.E;
import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import v0.C0244i;
import v0.InterfaceC0239d;
import v0.InterfaceC0240e;
import v0.InterfaceC0241f;

/* loaded from: classes.dex */
public final class b implements InterfaceC0241f {

    /* renamed from: e, reason: collision with root package name */
    public final FlutterJNI f2857e;

    /* renamed from: f, reason: collision with root package name */
    public final AssetManager f2858f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2859g;

    /* renamed from: h, reason: collision with root package name */
    public final i f2860h;

    /* renamed from: i, reason: collision with root package name */
    public final E f2861i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2862j;

    public b(FlutterJNI flutterJNI, AssetManager assetManager, long j2) {
        this.f2862j = false;
        C0000a c0000a = new C0000a(25, this);
        this.f2857e = flutterJNI;
        this.f2858f = assetManager;
        this.f2859g = j2;
        i iVar = new i(flutterJNI);
        this.f2860h = iVar;
        iVar.v("flutter/isolate", c0000a, null);
        this.f2861i = new E(28, iVar);
        if (flutterJNI.isAttached()) {
            this.f2862j = true;
        }
    }

    public final void a(a aVar, List list) {
        if (this.f2862j) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        C0.a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(aVar);
            this.f2857e.runBundleAndSnapshotFromLibrary(aVar.f2854a, aVar.f2856c, aVar.f2855b, this.f2858f, list, this.f2859g);
            this.f2862j = true;
            Trace.endSection();
        } finally {
        }
    }

    @Override // v0.InterfaceC0241f
    public final void e(String str, ByteBuffer byteBuffer, InterfaceC0240e interfaceC0240e) {
        this.f2861i.e(str, byteBuffer, interfaceC0240e);
    }

    @Override // v0.InterfaceC0241f
    public final C0000a g(C0244i c0244i) {
        return ((i) this.f2861i.f20f).g(c0244i);
    }

    @Override // v0.InterfaceC0241f
    public final void h(String str, InterfaceC0239d interfaceC0239d) {
        this.f2861i.h(str, interfaceC0239d);
    }

    @Override // v0.InterfaceC0241f
    public final void v(String str, InterfaceC0239d interfaceC0239d, C0000a c0000a) {
        this.f2861i.v(str, interfaceC0239d, c0000a);
    }
}
