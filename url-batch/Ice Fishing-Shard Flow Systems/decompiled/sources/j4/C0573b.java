package j4;

import I.Y;
import I.Z;
import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;
import i.C0511M;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import s4.l;

/* renamed from: j4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0573b implements s4.f {

    /* renamed from: d, reason: collision with root package name */
    public long f5955d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5956e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f5957i;

    /* renamed from: l, reason: collision with root package name */
    public Object f5958l;

    /* renamed from: m, reason: collision with root package name */
    public Object f5959m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f5960n;

    public C0573b() {
        this.f5955d = -1L;
        this.f5960n = new l.k(this);
        this.f5957i = new ArrayList();
    }

    public void a() {
        if (this.f5956e) {
            ArrayList arrayList = (ArrayList) this.f5957i;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((Y) obj).b();
            }
            this.f5956e = false;
        }
    }

    @Override // s4.f
    public q1.h b(l lVar) {
        return ((C0580i) ((C0511M) this.f5960n).f5381e).b(lVar);
    }

    public void c(C0572a c0572a, List list) {
        if (this.f5956e) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        A4.a.d("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(c0572a);
            ((FlutterJNI) this.f5957i).runBundleAndSnapshotFromLibrary(c0572a.f5952a, c0572a.f5954c, c0572a.f5953b, (AssetManager) this.f5958l, list, this.f5955d);
            this.f5956e = true;
            Trace.endSection();
        } finally {
        }
    }

    public void d() {
        View view;
        if (this.f5956e) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f5957i;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Y y7 = (Y) obj;
            long j = this.f5955d;
            if (j >= 0) {
                y7.c(j);
            }
            Interpolator interpolator = (Interpolator) this.f5958l;
            if (interpolator != null && (view = (View) y7.f1164a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((Z) this.f5959m) != null) {
                y7.d((l.k) this.f5960n);
            }
            View view2 = (View) y7.f1164a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f5956e = true;
    }

    @Override // s4.f
    public void f(String str, ByteBuffer byteBuffer, s4.e eVar) {
        ((C0511M) this.f5960n).f(str, byteBuffer, eVar);
    }

    @Override // s4.f
    public void h(String str, s4.d dVar, q1.h hVar) {
        ((C0511M) this.f5960n).h(str, dVar, hVar);
    }

    @Override // s4.f
    public void k(String str, ByteBuffer byteBuffer) {
        ((C0511M) this.f5960n).k(str, byteBuffer);
    }

    @Override // s4.f
    public void n(String str, s4.d dVar) {
        ((C0511M) this.f5960n).n(str, dVar);
    }

    public C0573b(FlutterJNI flutterJNI, AssetManager assetManager, long j) {
        this.f5956e = false;
        c2.e eVar = new c2.e(this);
        this.f5957i = flutterJNI;
        this.f5958l = assetManager;
        this.f5955d = j;
        C0580i c0580i = new C0580i(flutterJNI);
        this.f5959m = c0580i;
        c0580i.h("flutter/isolate", eVar, null);
        this.f5960n = new C0511M(3, c0580i);
        if (flutterJNI.isAttached()) {
            this.f5956e = true;
        }
    }
}
