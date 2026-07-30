package f1;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g0 implements Iterator, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3154f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Iterator f3155g;

    public g0(o0.c cVar) {
        l0.l[] lVarArr = new l0.l[8];
        for (int i7 = 0; i7 < 8; i7++) {
            lVarArr[i7] = new l0.n(this);
        }
        this.f3155g = new l0.e(cVar, lVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3154f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.f3155g.hasNext();
            default:
                return ((l0.e) this.f3155g).f5751h;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3154f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (j0) this.f3155g.next();
            default:
                return (Map.Entry) ((l0.e) this.f3155g).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3154f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((l0.e) this.f3155g).remove();
                return;
        }
    }

    public g0(h0 h0Var) {
        this.f3155g = h0Var.f3168o.iterator();
    }
}
