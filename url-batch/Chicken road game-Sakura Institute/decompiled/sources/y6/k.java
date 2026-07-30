package y6;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9916a;

    /* renamed from: b, reason: collision with root package name */
    public final f f9917b;

    /* renamed from: c, reason: collision with root package name */
    public final r6.l f9918c;

    /* JADX WARN: Multi-variable type inference failed */
    public k(f fVar, q6.c cVar, int i7) {
        this.f9916a = i7;
        switch (i7) {
            case 1:
                this.f9917b = fVar;
                this.f9918c = (r6.l) cVar;
                break;
            default:
                this.f9917b = fVar;
                this.f9918c = (r6.l) cVar;
                break;
        }
    }

    @Override // y6.f
    public final Iterator iterator() {
        switch (this.f9916a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new j(this);
            default:
                return new l(this);
        }
    }
}
