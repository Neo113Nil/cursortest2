package u1;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5101a extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final p f41059a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f41060b;

    /* renamed from: c, reason: collision with root package name */
    public x f41061c;

    public C5101a(p pVar, q qVar, ReferenceQueue referenceQueue) {
        super(qVar, referenceQueue);
        N1.g.c(pVar, "Argument must not be null");
        this.f41059a = pVar;
        boolean z8 = qVar.f41175n;
        this.f41061c = null;
        this.f41060b = z8;
    }
}
