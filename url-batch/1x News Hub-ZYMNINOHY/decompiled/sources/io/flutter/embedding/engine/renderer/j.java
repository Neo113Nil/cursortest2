package io.flutter.embedding.engine.renderer;

import E1.C0030f;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f9162a;

    /* renamed from: c, reason: collision with root package name */
    public Surface f9164c;

    /* renamed from: h, reason: collision with root package name */
    public final C0030f f9168h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f9163b = new AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    public boolean f9165d = false;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f9166e = new Handler();
    public final HashSet f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f9167g = new ArrayList();

    public j(FlutterJNI flutterJNI) {
        C0030f c0030f = new C0030f(3, this);
        this.f9168h = c0030f;
        this.f9162a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c0030f);
    }

    public final void a(k kVar) {
        this.f9162a.addIsDisplayingFlutterUiListener(kVar);
        if (this.f9165d) {
            kVar.b();
        }
    }

    public final void b(p pVar) {
        HashSet hashSet = this.f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((p) ((WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
        hashSet.add(new WeakReference(pVar));
    }

    public final TextureRegistry$ImageTextureEntry c() {
        FlutterRenderer$ImageTextureRegistryEntry flutterRenderer$ImageTextureRegistryEntry = new FlutterRenderer$ImageTextureRegistryEntry(this, this.f9163b.getAndIncrement());
        flutterRenderer$ImageTextureRegistryEntry.id();
        this.f9162a.registerImageTexture(flutterRenderer$ImageTextureRegistryEntry.id(), flutterRenderer$ImageTextureRegistryEntry, false);
        return flutterRenderer$ImageTextureRegistryEntry;
    }

    public final TextureRegistry$SurfaceProducer d(int i3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 29 || (i4 <= 29 && "HUAWEI".equalsIgnoreCase(Build.MANUFACTURER))) {
            g e3 = e();
            return new n(e3.f9133a, this.f9166e, this.f9162a, e3);
        }
        long andIncrement = this.f9163b.getAndIncrement();
        FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = new FlutterRenderer$ImageReaderSurfaceProducer(this, andIncrement);
        boolean z = i3 == 2;
        this.f9162a.registerImageTexture(andIncrement, flutterRenderer$ImageReaderSurfaceProducer, z);
        if (z) {
            b(flutterRenderer$ImageReaderSurfaceProducer);
        }
        this.f9167g.add(flutterRenderer$ImageReaderSurfaceProducer);
        return flutterRenderer$ImageReaderSurfaceProducer;
    }

    public final g e() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        long andIncrement = this.f9163b.getAndIncrement();
        surfaceTexture.detachFromGLContext();
        g gVar = new g(this, andIncrement, surfaceTexture);
        this.f9162a.registerTexture(gVar.f9133a, gVar.f9134b);
        b(gVar);
        return gVar;
    }

    public final void f(int i3) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            p pVar = (p) ((WeakReference) it.next()).get();
            if (pVar != null) {
                pVar.onTrimMemory(i3);
            } else {
                it.remove();
            }
        }
    }

    public final void g(k kVar) {
        this.f9162a.removeIsDisplayingFlutterUiListener(kVar);
    }

    public final void h(p pVar) {
        HashSet hashSet = this.f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == pVar) {
                hashSet.remove(weakReference);
                return;
            }
        }
    }

    public final void i() {
        Iterator it = this.f9167g.iterator();
        while (it.hasNext()) {
            ((FlutterRenderer$ImageReaderSurfaceProducer) it.next()).getClass();
        }
    }

    public final void j() {
        if (this.f9164c != null) {
            this.f9162a.onSurfaceDestroyed();
            if (this.f9165d) {
                this.f9168h.a();
            }
            this.f9165d = false;
            this.f9164c = null;
        }
    }
}
