package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.lifecycle.r;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import l.C0254a;
import l.C0256c;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f2537a;

    /* renamed from: c, reason: collision with root package name */
    public Surface f2539c;

    /* renamed from: h, reason: collision with root package name */
    public final a f2544h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f2538b = new AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    public boolean f2540d = false;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f2541e = new Handler();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f2542f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2543g = new ArrayList();

    public l(FlutterJNI flutterJNI) {
        androidx.lifecycle.l lVar;
        a aVar = new a(this);
        this.f2544h = aVar;
        this.f2537a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
        androidx.lifecycle.n nVar = r.f1786m.f1792j;
        b bVar = new b(this);
        nVar.getClass();
        nVar.b("addObserver");
        androidx.lifecycle.g gVar = nVar.f1778c;
        androidx.lifecycle.g gVar2 = androidx.lifecycle.g.f1767e;
        gVar2 = gVar != gVar2 ? androidx.lifecycle.g.f1768f : gVar2;
        androidx.lifecycle.m mVar = new androidx.lifecycle.m();
        int i2 = androidx.lifecycle.o.f1785a;
        androidx.lifecycle.m mVar2 = null;
        mVar.f1775b = new androidx.lifecycle.b(bVar, null);
        mVar.f1774a = gVar2;
        C0254a c0254a = nVar.f1777b;
        HashMap hashMap = c0254a.f3112i;
        C0256c c0256c = (C0256c) hashMap.get(bVar);
        if (c0256c != null) {
            mVar2 = c0256c.f3117f;
        } else {
            C0256c c0256c2 = new C0256c(bVar, mVar);
            c0254a.f3111h++;
            C0256c c0256c3 = c0254a.f3109f;
            if (c0256c3 == null) {
                c0254a.f3108e = c0256c2;
                c0254a.f3109f = c0256c2;
            } else {
                c0256c3.f3118g = c0256c2;
                c0256c2.f3119h = c0256c3;
                c0254a.f3109f = c0256c2;
            }
            hashMap.put(bVar, c0256c2);
        }
        if (mVar2 == null && (lVar = (androidx.lifecycle.l) nVar.f1779d.get()) != null) {
            boolean z2 = nVar.f1780e != 0 || nVar.f1781f;
            nVar.f1780e++;
            for (androidx.lifecycle.g a2 = nVar.a(bVar); mVar.f1774a.compareTo(a2) < 0 && nVar.f1777b.f3112i.containsKey(bVar); a2 = nVar.a(bVar)) {
                nVar.f1783h.add(mVar.f1774a);
                androidx.lifecycle.d dVar = androidx.lifecycle.f.Companion;
                androidx.lifecycle.g gVar3 = mVar.f1774a;
                dVar.getClass();
                androidx.lifecycle.f a3 = androidx.lifecycle.d.a(gVar3);
                if (a3 == null) {
                    throw new IllegalStateException("no event up from " + mVar.f1774a);
                }
                mVar.a(lVar, a3);
                ArrayList arrayList = nVar.f1783h;
                arrayList.remove(arrayList.size() - 1);
            }
            if (!z2) {
                nVar.d();
            }
            nVar.f1780e--;
        }
    }

    public final void a(io.flutter.view.o oVar) {
        HashSet hashSet = this.f2542f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((io.flutter.view.o) ((WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
        hashSet.add(new WeakReference(oVar));
    }

    public final TextureRegistry$ImageTextureEntry b() {
        FlutterRenderer$ImageTextureRegistryEntry flutterRenderer$ImageTextureRegistryEntry = new FlutterRenderer$ImageTextureRegistryEntry(this, this.f2538b.getAndIncrement());
        flutterRenderer$ImageTextureRegistryEntry.id();
        this.f2537a.registerImageTexture(flutterRenderer$ImageTextureRegistryEntry.id(), flutterRenderer$ImageTextureRegistryEntry);
        return flutterRenderer$ImageTextureRegistryEntry;
    }

    public final TextureRegistry$SurfaceProducer c() {
        if (Build.VERSION.SDK_INT >= 29) {
            FlutterJNI flutterJNI = this.f2537a;
            if (!flutterJNI.ShouldDisableAHB()) {
                long andIncrement = this.f2538b.getAndIncrement();
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = new FlutterRenderer$ImageReaderSurfaceProducer(this, andIncrement);
                flutterJNI.registerImageTexture(andIncrement, flutterRenderer$ImageReaderSurfaceProducer);
                a(flutterRenderer$ImageReaderSurfaceProducer);
                this.f2543g.add(flutterRenderer$ImageReaderSurfaceProducer);
                return flutterRenderer$ImageReaderSurfaceProducer;
            }
        }
        i d2 = d();
        return new o(d2.f2512a, this.f2541e, this.f2537a, d2);
    }

    public final i d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        long andIncrement = this.f2538b.getAndIncrement();
        surfaceTexture.detachFromGLContext();
        i iVar = new i(this, andIncrement, surfaceTexture);
        this.f2537a.registerTexture(iVar.f2512a, iVar.f2513b);
        a(iVar);
        return iVar;
    }

    public final void e(int i2) {
        Iterator it = this.f2542f.iterator();
        while (it.hasNext()) {
            io.flutter.view.o oVar = (io.flutter.view.o) ((WeakReference) it.next()).get();
            if (oVar != null) {
                oVar.onTrimMemory(i2);
            } else {
                it.remove();
            }
        }
    }

    public final void f(io.flutter.view.o oVar) {
        HashSet hashSet = this.f2542f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == oVar) {
                hashSet.remove(weakReference);
                return;
            }
        }
    }

    public final void g() {
        if (this.f2539c != null) {
            this.f2537a.onSurfaceDestroyed();
            if (this.f2540d) {
                this.f2544h.a();
            }
            this.f2540d = false;
            this.f2539c = null;
        }
    }
}
