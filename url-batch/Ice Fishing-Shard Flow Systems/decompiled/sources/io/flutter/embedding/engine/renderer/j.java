package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import h4.C0489d;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f5598a;

    /* renamed from: c, reason: collision with root package name */
    public Surface f5600c;

    /* renamed from: h, reason: collision with root package name */
    public final C0489d f5605h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f5599b = new AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    public boolean f5601d = false;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f5602e = new Handler();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f5603f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f5604g = new ArrayList();

    public j(FlutterJNI flutterJNI) {
        C0489d c0489d = new C0489d(3, this);
        this.f5605h = c0489d;
        this.f5598a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c0489d);
    }

    public final void a(k kVar) {
        this.f5598a.addIsDisplayingFlutterUiListener(kVar);
        if (this.f5601d) {
            kVar.b();
        }
    }

    public final void b(o oVar) {
        HashSet hashSet = this.f5603f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((o) ((WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
        hashSet.add(new WeakReference(oVar));
    }

    public final TextureRegistry$ImageTextureEntry c() {
        FlutterRenderer$ImageTextureRegistryEntry flutterRenderer$ImageTextureRegistryEntry = new FlutterRenderer$ImageTextureRegistryEntry(this, this.f5599b.getAndIncrement());
        flutterRenderer$ImageTextureRegistryEntry.id();
        this.f5598a.registerImageTexture(flutterRenderer$ImageTextureRegistryEntry.id(), flutterRenderer$ImageTextureRegistryEntry, false);
        return flutterRenderer$ImageTextureRegistryEntry;
    }

    public final TextureRegistry$SurfaceProducer d(int i2) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 29 || (i5 <= 29 && "HUAWEI".equalsIgnoreCase(Build.MANUFACTURER))) {
            g e7 = e();
            return new n(e7.f5566a, this.f5602e, this.f5598a, e7);
        }
        long andIncrement = this.f5599b.getAndIncrement();
        FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = new FlutterRenderer$ImageReaderSurfaceProducer(this, andIncrement);
        boolean z7 = i2 == 2;
        this.f5598a.registerImageTexture(andIncrement, flutterRenderer$ImageReaderSurfaceProducer, z7);
        if (z7) {
            b(flutterRenderer$ImageReaderSurfaceProducer);
        }
        this.f5604g.add(flutterRenderer$ImageReaderSurfaceProducer);
        return flutterRenderer$ImageReaderSurfaceProducer;
    }

    public final g e() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        long andIncrement = this.f5599b.getAndIncrement();
        surfaceTexture.detachFromGLContext();
        g gVar = new g(this, andIncrement, surfaceTexture);
        this.f5598a.registerTexture(gVar.f5566a, gVar.f5567b);
        b(gVar);
        return gVar;
    }

    public final void f(int i2) {
        Iterator it = this.f5603f.iterator();
        while (it.hasNext()) {
            o oVar = (o) ((WeakReference) it.next()).get();
            if (oVar != null) {
                oVar.onTrimMemory(i2);
            } else {
                it.remove();
            }
        }
    }

    public final void g(k kVar) {
        this.f5598a.removeIsDisplayingFlutterUiListener(kVar);
    }

    public final void h(o oVar) {
        HashSet hashSet = this.f5603f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == oVar) {
                hashSet.remove(weakReference);
                return;
            }
        }
    }

    public final void i() {
        ArrayList arrayList = this.f5604g;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((FlutterRenderer$ImageReaderSurfaceProducer) obj).getClass();
        }
    }

    public final void j() {
        if (this.f5600c != null) {
            this.f5598a.onSurfaceDestroyed();
            if (this.f5601d) {
                this.f5605h.a();
            }
            this.f5601d = false;
            this.f5600c = null;
        }
    }
}
