package io.flutter.embedding.engine.renderer;

import android.os.Handler;
import android.view.Surface;
import c0.C0105g;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f2385a;

    /* renamed from: b, reason: collision with root package name */
    public Surface f2386b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2387c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f2388d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f2389e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2390f;

    /* renamed from: g, reason: collision with root package name */
    public final C0105g f2391g;

    public h(FlutterJNI flutterJNI) {
        new AtomicLong(0L);
        this.f2387c = false;
        this.f2388d = new Handler();
        this.f2389e = new HashSet();
        this.f2390f = new ArrayList();
        C0105g c0105g = new C0105g(3, this);
        this.f2391g = c0105g;
        this.f2385a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c0105g);
    }

    public final void a(i iVar) {
        this.f2385a.addIsDisplayingFlutterUiListener(iVar);
        if (this.f2387c) {
            iVar.a();
        }
    }

    public final void b(int i2) {
        Iterator it = this.f2389e.iterator();
        while (it.hasNext()) {
            o oVar = (o) ((WeakReference) it.next()).get();
            if (oVar != null) {
                oVar.onTrimMemory(i2);
            } else {
                it.remove();
            }
        }
    }

    public final void c(i iVar) {
        this.f2385a.removeIsDisplayingFlutterUiListener(iVar);
    }

    public final void d() {
        Iterator it = this.f2390f.iterator();
        while (it.hasNext()) {
            ((FlutterRenderer$ImageReaderSurfaceProducer) it.next()).getClass();
        }
    }

    public final void e() {
        if (this.f2386b != null) {
            this.f2385a.onSurfaceDestroyed();
            if (this.f2387c) {
                this.f2391g.b();
            }
            this.f2387c = false;
            this.f2386b = null;
        }
    }
}
