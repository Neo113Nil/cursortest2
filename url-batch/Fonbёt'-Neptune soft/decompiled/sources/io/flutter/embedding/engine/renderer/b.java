package io.flutter.embedding.engine.renderer;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements androidx.lifecycle.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f2498a;

    public b(l lVar) {
        this.f2498a = lVar;
    }

    public final void a() {
        Iterator it = this.f2498a.f2543g.iterator();
        while (it.hasNext()) {
            FlutterRenderer$ImageReaderSurfaceProducer.access$200((FlutterRenderer$ImageReaderSurfaceProducer) it.next());
        }
    }
}
