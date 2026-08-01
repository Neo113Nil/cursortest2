package io.flutter.embedding.engine.renderer;

import E.C0005f;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f623a;

    /* renamed from: b, reason: collision with root package name */
    public Surface f624b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f625c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f626d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f627e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f628f;

    /* renamed from: g, reason: collision with root package name */
    public final C0005f f629g;

    public h(FlutterJNI flutterJNI) {
        new AtomicLong(0L);
        this.f625c = false;
        this.f626d = new Handler();
        this.f627e = new HashSet();
        this.f628f = new ArrayList();
        C0005f c0005f = new C0005f(3, this);
        this.f629g = c0005f;
        this.f623a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c0005f);
    }

    public final void a(i iVar) {
        this.f623a.addIsDisplayingFlutterUiListener(iVar);
        if (this.f625c) {
            iVar.a();
        }
    }

    public final void b(int i2) {
        Iterator it = this.f627e.iterator();
        while (it.hasNext()) {
            n nVar = (n) ((WeakReference) it.next()).get();
            if (nVar != null) {
                nVar.onTrimMemory(i2);
            } else {
                it.remove();
            }
        }
    }

    public final void c(i iVar) {
        this.f623a.removeIsDisplayingFlutterUiListener(iVar);
    }

    public final void d() {
        Iterator it = this.f628f.iterator();
        while (it.hasNext()) {
            ((FlutterRenderer$ImageReaderSurfaceProducer) it.next()).getClass();
        }
    }

    public final void e() {
        if (this.f624b != null) {
            this.f623a.onSurfaceDestroyed();
            if (this.f625c) {
                this.f629g.b();
            }
            this.f625c = false;
            this.f624b = null;
        }
    }
}
