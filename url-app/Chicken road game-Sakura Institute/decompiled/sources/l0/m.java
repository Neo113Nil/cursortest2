package l0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m extends l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5769i;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5769i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f5768h;
                this.f5768h = i7 + 2;
                Object[] objArr = this.f5766f;
                return new a(objArr[i7], objArr[i7 + 1]);
            case 1:
                int i8 = this.f5768h;
                this.f5768h = i8 + 2;
                return this.f5766f[i8];
            default:
                int i9 = this.f5768h;
                this.f5768h = i9 + 2;
                return this.f5766f[i9 + 1];
        }
    }
}
