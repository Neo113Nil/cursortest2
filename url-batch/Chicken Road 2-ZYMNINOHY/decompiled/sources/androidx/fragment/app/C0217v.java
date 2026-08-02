package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.fragment.app.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217v extends d.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4982a;

    public C0217v(AtomicReference atomicReference) {
        this.f4982a = atomicReference;
    }

    @Override // d.c
    public final void a(Object obj) {
        d.c cVar = (d.c) this.f4982a.get();
        if (cVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        cVar.a(obj);
    }
}
