package io.flutter.embedding.engine.renderer;

import D.C0006g;
import android.os.Handler;
import android.view.Surface;
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
    public final FlutterJNI f570a;

    /* renamed from: b, reason: collision with root package name */
    public Surface f571b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f572c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f573d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f574e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f575f;

    /* renamed from: g, reason: collision with root package name */
    public final C0006g f576g;

    public h(FlutterJNI flutterJNI) {
        new AtomicLong(0L);
        this.f572c = false;
        this.f573d = new Handler();
        this.f574e = new HashSet();
        this.f575f = new ArrayList();
        C0006g c0006g = new C0006g(3, this);
        this.f576g = c0006g;
        this.f570a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c0006g);
    }

    public final void a(i iVar) {
        this.f570a.addIsDisplayingFlutterUiListener(iVar);
        if (this.f572c) {
            iVar.a();
        }
    }

    public final void b(int i2) {
        Iterator it = this.f574e.iterator();
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
        this.f570a.removeIsDisplayingFlutterUiListener(iVar);
    }

    public final void d() {
        Iterator it = this.f575f.iterator();
        while (it.hasNext()) {
            ((FlutterRenderer$ImageReaderSurfaceProducer) it.next()).getClass();
        }
    }

    public final void e() {
        if (this.f571b != null) {
            this.f570a.onSurfaceDestroyed();
            if (this.f572c) {
                this.f576g.b();
            }
            this.f572c = false;
            this.f571b = null;
        }
    }
}
