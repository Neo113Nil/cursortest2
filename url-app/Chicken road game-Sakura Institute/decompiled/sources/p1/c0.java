package p1;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c0 extends m0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7036b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7037c;

    public /* synthetic */ c0(int i7, Object obj) {
        this.f7036b = i7;
        this.f7037c = obj;
    }

    @Override // p1.m0
    public final m2.k b() {
        switch (this.f7036b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((r1.o0) this.f7037c).getLayoutDirection();
            default:
                return ((s1.r) this.f7037c).getLayoutDirection();
        }
    }

    @Override // p1.m0
    public final int c() {
        switch (this.f7036b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((r1.o0) this.f7037c).h0();
            default:
                return ((s1.r) this.f7037c).getRoot().B.f7848r.f7063f;
        }
    }
}
