package h;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public c f4573f;

    /* renamed from: g, reason: collision with root package name */
    public c f4574g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4575h;

    public b(c cVar, c cVar2, int i7) {
        this.f4575h = i7;
        this.f4573f = cVar2;
        this.f4574g = cVar;
    }

    @Override // h.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f4573f == cVar && cVar == this.f4574g) {
            this.f4574g = null;
            this.f4573f = null;
        }
        c cVar4 = this.f4573f;
        if (cVar4 == cVar) {
            switch (this.f4575h) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    cVar2 = cVar4.f4579i;
                    break;
                default:
                    cVar2 = cVar4.f4578h;
                    break;
            }
            this.f4573f = cVar2;
        }
        c cVar5 = this.f4574g;
        if (cVar5 == cVar) {
            c cVar6 = this.f4573f;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f4574g = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f4575h) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return cVar.f4578h;
            default:
                return cVar.f4579i;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4574g != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f4574g;
        c cVar2 = this.f4573f;
        this.f4574g = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
