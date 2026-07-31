package io.flutter.embedding.engine.renderer;

import D3.C0118f;
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
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f4486a;

    /* renamed from: b, reason: collision with root package name */
    public Surface f4487b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4488c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f4489d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f4490e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4491f;

    /* renamed from: g, reason: collision with root package name */
    public final C0118f f4492g;

    public h(FlutterJNI flutterJNI) {
        new AtomicLong(0L);
        this.f4488c = false;
        this.f4489d = new Handler();
        this.f4490e = new HashSet();
        this.f4491f = new ArrayList();
        C0118f c0118f = new C0118f(3, this);
        this.f4492g = c0118f;
        this.f4486a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c0118f);
    }

    public final void a(i iVar) {
        this.f4486a.addIsDisplayingFlutterUiListener(iVar);
        if (this.f4488c) {
            iVar.b();
        }
    }

    public final void b(int i7) {
        Iterator it = this.f4490e.iterator();
        while (it.hasNext()) {
            p pVar = (p) ((WeakReference) it.next()).get();
            if (pVar != null) {
                pVar.onTrimMemory(i7);
            } else {
                it.remove();
            }
        }
    }

    public final void c(i iVar) {
        this.f4486a.removeIsDisplayingFlutterUiListener(iVar);
    }

    public final void d() {
        ArrayList arrayList = this.f4491f;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((FlutterRenderer$ImageReaderSurfaceProducer) obj).getClass();
        }
    }

    public final void e() {
        if (this.f4487b != null) {
            this.f4486a.onSurfaceDestroyed();
            if (this.f4488c) {
                this.f4492g.a();
            }
            this.f4488c = false;
            this.f4487b = null;
        }
    }
}
