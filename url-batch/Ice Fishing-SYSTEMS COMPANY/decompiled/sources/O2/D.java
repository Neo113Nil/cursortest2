package O2;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class D extends u {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0369f f2353g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(AbstractC0369f abstractC0369f, int i, Bundle bundle) {
        super(abstractC0369f, i, bundle);
        Objects.requireNonNull(abstractC0369f);
        this.f2353g = abstractC0369f;
    }

    @Override // O2.u
    public final boolean a() {
        this.f2353g.f2389H.a(L2.b.f1710y);
        return true;
    }

    @Override // O2.u
    public final void b(L2.b bVar) {
        AbstractC0369f abstractC0369f = this.f2353g;
        abstractC0369f.getClass();
        abstractC0369f.f2389H.a(bVar);
        abstractC0369f.f2405w = bVar.f1712u;
        abstractC0369f.f2406x = System.currentTimeMillis();
    }
}
