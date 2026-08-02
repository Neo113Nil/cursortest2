package o0;

import B0.C0023a;
import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import w0.InterfaceC0318d;
import w0.InterfaceC0319e;
import w0.InterfaceC0320f;

/* loaded from: classes.dex */
public final class b implements InterfaceC0320f {

    /* renamed from: e, reason: collision with root package name */
    public boolean f3328e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3329f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3330g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f3331h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f3332i;

    public b(String str, String str2, String str3, String str4, boolean z2) {
        this.f3329f = str == null ? "libapp.so" : str;
        this.f3330g = str2 == null ? "flutter_assets" : str2;
        this.f3332i = str4;
        this.f3331h = str3 == null ? "" : str3;
        this.f3328e = z2;
    }

    @Override // w0.InterfaceC0320f
    public void a(String str, InterfaceC0318d interfaceC0318d, C0023a c0023a) {
        ((n0.d) this.f3332i).a(str, interfaceC0318d, c0023a);
    }

    @Override // w0.InterfaceC0320f
    public C0023a b() {
        return ((j) ((n0.d) this.f3332i).f3284f).e(new w0.i());
    }

    @Override // w0.InterfaceC0320f
    public void c(String str, ByteBuffer byteBuffer, InterfaceC0319e interfaceC0319e) {
        ((n0.d) this.f3332i).c(str, byteBuffer, interfaceC0319e);
    }

    public void d(C0279a c0279a, List list) {
        if (this.f3328e) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        E0.a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(c0279a);
            ((FlutterJNI) this.f3329f).runBundleAndSnapshotFromLibrary(c0279a.f3325a, c0279a.f3327c, c0279a.f3326b, (AssetManager) this.f3330g, list);
            this.f3328e = true;
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

    @Override // w0.InterfaceC0320f
    public void f(String str, InterfaceC0318d interfaceC0318d) {
        ((n0.d) this.f3332i).f(str, interfaceC0318d);
    }

    public b(FlutterJNI flutterJNI, AssetManager assetManager) {
        this.f3328e = false;
        n0.d dVar = new n0.d(1, this);
        this.f3329f = flutterJNI;
        this.f3330g = assetManager;
        j jVar = new j(flutterJNI);
        this.f3331h = jVar;
        jVar.a("flutter/isolate", dVar, null);
        this.f3332i = new n0.d(2, jVar);
        if (flutterJNI.isAttached()) {
            this.f3328e = true;
        }
    }
}
