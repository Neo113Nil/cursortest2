package n2;

import java.util.concurrent.atomic.AtomicReference;
import o2.AbstractC0753b;
import o2.AbstractC0754c;
import o2.AbstractC0755d;

/* renamed from: n2.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0693S extends AbstractC0755d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f6322a = new AtomicReference(null);

    @Override // o2.AbstractC0755d
    public final boolean a(AbstractC0753b abstractC0753b) {
        AtomicReference atomicReference = this.f6322a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(AbstractC0682G.f6294b);
        return true;
    }

    @Override // o2.AbstractC0755d
    public final P1.d[] b(AbstractC0753b abstractC0753b) {
        this.f6322a.set(null);
        return AbstractC0754c.f6698a;
    }
}
