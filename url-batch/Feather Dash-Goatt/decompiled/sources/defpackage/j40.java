package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class j40 implements gl0 {
    public static final j40 b = new j40(0);
    public final /* synthetic */ int a;

    public /* synthetic */ j40(int i) {
        this.a = i;
    }

    @Override // defpackage.gl0
    public final c11 a(Class cls) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!m40.class.isAssignableFrom(cls)) {
                    dd0.e("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (c11) m40.d(cls.asSubclass(m40.class)).c(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.gl0
    public final boolean b(Class cls) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return m40.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
