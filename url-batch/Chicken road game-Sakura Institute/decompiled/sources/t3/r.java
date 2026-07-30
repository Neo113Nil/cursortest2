package t3;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8833g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f8834h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Bundle bundle, int i7) {
        super(1);
        this.f8833g = i7;
        this.f8834h = bundle;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f8833g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r6.k.f((String) obj, "argName");
                return Boolean.valueOf(!this.f8834h.containsKey(r2));
            default:
                r6.k.f((String) obj, "key");
                return Boolean.valueOf(!this.f8834h.containsKey(r2));
        }
    }
}
