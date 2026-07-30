package c7;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j extends b1 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1706j;

    /* renamed from: k, reason: collision with root package name */
    public final h f1707k;

    public /* synthetic */ j(h hVar, int i7) {
        this.f1706j = i7;
        this.f1707k = hVar;
    }

    @Override // c7.b1
    public final boolean k() {
        switch (this.f1706j) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return true;
            default:
                return false;
        }
    }

    @Override // c7.b1
    public final void l(Throwable th) {
        switch (this.f1706j) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                f1 j8 = j();
                h hVar = this.f1707k;
                Throwable p6 = hVar.p(j8);
                if (hVar.w()) {
                    h7.f fVar = (h7.f) hVar.f1701i;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h7.f.f4676m;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        h7.s sVar = h7.a.f4666c;
                        if (r6.k.a(obj, sVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, sVar, p6)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != sVar) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                hVar.g(p6);
                if (!hVar.w()) {
                    hVar.m();
                    break;
                }
                break;
            default:
                this.f1707k.resumeWith(d6.z.f2639a);
                break;
        }
    }
}
