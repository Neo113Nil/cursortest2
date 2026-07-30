package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qj1 extends pj1 {
    public final /* synthetic */ int h;

    public /* synthetic */ qj1(int i) {
        this.h = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i = this.g;
                this.g = i + 2;
                Object[] objArr = this.d;
                return new ak0(objArr[i], 0, objArr[i + 1]);
            case 1:
                int i2 = this.g;
                this.g = i2 + 2;
                return this.d[i2];
            default:
                int i3 = this.g;
                this.g = i3 + 2;
                return this.d[i3 + 1];
        }
    }
}
