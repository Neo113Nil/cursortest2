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

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f2389a;

    /* renamed from: b, reason: collision with root package name */
    public Surface f2390b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2391c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f2392d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f2393e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2394f;

    /* renamed from: g, reason: collision with root package name */
    public final a f2395g;

    public i(FlutterJNI flutterJNI) {
        new AtomicLong(0L);
        this.f2391c = false;
        this.f2392d = new Handler();
        this.f2393e = new HashSet();
        this.f2394f = new ArrayList();
        a aVar = new a(0, this);
        this.f2395g = aVar;
        this.f2389a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
    }

    public final void a(j jVar) {
        this.f2389a.addIsDisplayingFlutterUiListener(jVar);
        if (this.f2391c) {
            jVar.b();
        }
    }

    public final void b(int i2) {
        Iterator it = this.f2393e.iterator();
        while (it.hasNext()) {
            p pVar = (p) ((WeakReference) it.next()).get();
            if (pVar != null) {
                pVar.onTrimMemory(i2);
            } else {
                it.remove();
            }
        }
    }

    public final void c(j jVar) {
        this.f2389a.removeIsDisplayingFlutterUiListener(jVar);
    }

    public final void d() {
        ArrayList arrayList = this.f2394f;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((FlutterRenderer$ImageReaderSurfaceProducer) obj).getClass();
        }
    }

    public final void e() {
        if (this.f2390b != null) {
            this.f2389a.onSurfaceDestroyed();
            if (this.f2391c) {
                this.f2395g.a();
            }
            this.f2391c = false;
            this.f2390b = null;
        }
    }
}
