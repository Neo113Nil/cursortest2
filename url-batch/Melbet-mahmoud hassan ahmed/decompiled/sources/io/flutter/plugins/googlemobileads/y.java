package io.flutter.plugins.googlemobileads;

import f3.c;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class y implements c.InterfaceC0063c {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<w> f17599a;

    y(w wVar) {
        this.f17599a = new WeakReference<>(wVar);
    }

    @Override // f3.c.InterfaceC0063c
    public void a(f3.c cVar) {
        if (this.f17599a.get() != null) {
            this.f17599a.get().e(cVar);
        }
    }
}
