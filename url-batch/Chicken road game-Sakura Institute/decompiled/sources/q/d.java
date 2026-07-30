package q;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7269a;

    @Override // q.h
    public final void c(int i7, p1.h0 h0Var, int[] iArr, int[] iArr2) {
        switch (this.f7269a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j.c(i7, iArr, iArr2, false);
                break;
            default:
                j.b(iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f7269a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
