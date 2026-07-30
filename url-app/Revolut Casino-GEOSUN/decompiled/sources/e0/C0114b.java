package e0;

import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import n0.InterfaceC0212d;
import t0.AbstractC0236a;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0114b implements n0.f {

    /* renamed from: e, reason: collision with root package name */
    public final FlutterJNI f1851e;

    /* renamed from: f, reason: collision with root package name */
    public final AssetManager f1852f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1853g;

    /* renamed from: h, reason: collision with root package name */
    public final C0121i f1854h;

    /* renamed from: i, reason: collision with root package name */
    public final A.j f1855i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1856j;

    public C0114b(FlutterJNI flutterJNI, AssetManager assetManager, long j2) {
        this.f1856j = false;
        A.j jVar = new A.j(16, this);
        this.f1851e = flutterJNI;
        this.f1852f = assetManager;
        this.f1853g = j2;
        C0121i c0121i = new C0121i(flutterJNI);
        this.f1854h = c0121i;
        c0121i.b("flutter/isolate", jVar, null);
        this.f1855i = new A.j(17, c0121i);
        if (flutterJNI.isAttached()) {
            this.f1856j = true;
        }
    }

    public final void a(C0113a c0113a, List list) {
        if (this.f1856j) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        AbstractC0236a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(c0113a);
            this.f1851e.runBundleAndSnapshotFromLibrary(c0113a.f1848a, c0113a.f1850c, c0113a.f1849b, this.f1852f, list, this.f1853g);
            this.f1856j = true;
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

    @Override // n0.f
    public final void b(String str, InterfaceC0212d interfaceC0212d, E.a aVar) {
        this.f1855i.b(str, interfaceC0212d, aVar);
    }

    @Override // n0.f
    public final void c(String str, InterfaceC0212d interfaceC0212d) {
        this.f1855i.c(str, interfaceC0212d);
    }

    @Override // n0.f
    public final void l(String str, ByteBuffer byteBuffer, n0.e eVar) {
        this.f1855i.l(str, byteBuffer, eVar);
    }

    @Override // n0.f
    public final E.a o(n0.i iVar) {
        return ((C0121i) this.f1855i.f30f).o(iVar);
    }
}
