package q;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e implements f, h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7272a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7273b;

    public e(int i7) {
        this.f7272a = i7;
        switch (i7) {
            case 1:
                this.f7273b = 0;
                break;
            case 2:
                this.f7273b = 0;
                break;
            case 3:
                this.f7273b = 0;
                break;
            default:
                this.f7273b = 0;
                break;
        }
    }

    @Override // q.f, q.h
    public final float a() {
        switch (this.f7272a) {
        }
        return this.f7273b;
    }

    @Override // q.f
    public final void b(m2.b bVar, int i7, int[] iArr, m2.k kVar, int[] iArr2) {
        switch (this.f7272a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (kVar != m2.k.f6322f) {
                    j.a(i7, iArr, iArr2, true);
                    break;
                } else {
                    j.a(i7, iArr, iArr2, false);
                    break;
                }
            case 1:
                if (kVar != m2.k.f6322f) {
                    j.d(i7, iArr, iArr2, true);
                    break;
                } else {
                    j.d(i7, iArr, iArr2, false);
                    break;
                }
            case 2:
                if (kVar != m2.k.f6322f) {
                    j.e(i7, iArr, iArr2, true);
                    break;
                } else {
                    j.e(i7, iArr, iArr2, false);
                    break;
                }
            default:
                if (kVar != m2.k.f6322f) {
                    j.f(i7, iArr, iArr2, true);
                    break;
                } else {
                    j.f(i7, iArr, iArr2, false);
                    break;
                }
        }
    }

    @Override // q.h
    public final void c(int i7, p1.h0 h0Var, int[] iArr, int[] iArr2) {
        switch (this.f7272a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j.a(i7, iArr, iArr2, false);
                break;
            case 1:
                j.d(i7, iArr, iArr2, false);
                break;
            case 2:
                j.e(i7, iArr, iArr2, false);
                break;
            default:
                j.f(i7, iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f7272a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
