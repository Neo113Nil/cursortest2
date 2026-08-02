package M0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final a f942a;

    /* renamed from: b, reason: collision with root package name */
    public final K0.d f943b;

    public /* synthetic */ n(a aVar, K0.d dVar) {
        this.f942a = aVar;
        this.f943b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof n)) {
            n nVar = (n) obj;
            if (N0.r.e(this.f942a, nVar.f942a) && N0.r.e(this.f943b, nVar.f943b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f942a, this.f943b});
    }

    public final String toString() {
        V0.e eVar = new V0.e(this);
        eVar.u(this.f942a, "key");
        eVar.u(this.f943b, "feature");
        return eVar.toString();
    }
}
