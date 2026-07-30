package s4;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f7758a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D0.j f7759b;

    public g(D0.j jVar) {
        this.f7759b = jVar;
    }

    public final void a(ArrayList arrayList) {
        if (this.f7758a.get()) {
            return;
        }
        D0.j jVar = this.f7759b;
        if (((AtomicReference) jVar.f331i).get() != this) {
            return;
        }
        i iVar = (i) jVar.f332l;
        iVar.f7760a.k(iVar.f7761b, iVar.f7762c.a(arrayList));
    }
}
