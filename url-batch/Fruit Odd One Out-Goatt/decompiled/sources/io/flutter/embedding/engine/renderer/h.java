package io.flutter.embedding.engine.renderer;

import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f422a;

    /* renamed from: b, reason: collision with root package name */
    public Surface f423b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f424c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f425d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f426e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f427f;

    /* renamed from: g, reason: collision with root package name */
    public final e0.g f428g;

    public h(FlutterJNI flutterJNI) {
        new AtomicLong(0L);
        this.f424c = false;
        this.f425d = new Handler();
        this.f426e = new HashSet();
        this.f427f = new ArrayList();
        e0.g gVar = new e0.g(3, this);
        this.f428g = gVar;
        this.f422a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(gVar);
    }

    public final void a(i iVar) {
        this.f422a.addIsDisplayingFlutterUiListener(iVar);
        if (this.f424c) {
            iVar.b();
        }
    }

    public final void b(int i2) {
        Iterator it = this.f426e.iterator();
        while (it.hasNext()) {
            p pVar = (p) ((WeakReference) it.next()).get();
            if (pVar != null) {
                pVar.onTrimMemory(i2);
            } else {
                it.remove();
            }
        }
    }

    public final void c(i iVar) {
        this.f422a.removeIsDisplayingFlutterUiListener(iVar);
    }

    public final void d() {
        ArrayList arrayList = this.f427f;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((FlutterRenderer$ImageReaderSurfaceProducer) obj).getClass();
        }
    }

    public final void e() {
        if (this.f423b != null) {
            this.f422a.onSurfaceDestroyed();
            if (this.f424c) {
                this.f428g.a();
            }
            this.f424c = false;
            this.f423b = null;
        }
    }
}
