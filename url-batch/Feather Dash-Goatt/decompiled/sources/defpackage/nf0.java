package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class nf0 extends xz0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nf0(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.l = i2;
    }

    @Override // defpackage.xz0
    public final Object k() {
        switch (this.l) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((yd1) this.e).getValue();
            default:
                return this.e.getClass().getSimpleName();
        }
    }
}
