package androidx.datastore.preferences.protobuf;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s implements n0 {

    /* renamed from: b, reason: collision with root package name */
    public static final s f908b = new s(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f909a;

    public /* synthetic */ s(int i7) {
        this.f909a = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final x0 a(Class cls) {
        switch (this.f909a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!v.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (x0) v.d(cls.asSubclass(v.class)).c(3);
                } catch (Exception e9) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e9);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final boolean b(Class cls) {
        switch (this.f909a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
