package b;

import android.window.OnBackInvokedCallback;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q6.a f1139b;

    public /* synthetic */ b0(q6.a aVar, int i7) {
        this.f1138a = i7;
        this.f1139b = aVar;
    }

    public final void onBackInvoked() {
        switch (this.f1138a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                q6.a aVar = this.f1139b;
                r6.k.f(aVar, "$onBackInvoked");
                aVar.a();
                break;
            default:
                q6.a aVar2 = this.f1139b;
                if (aVar2 != null) {
                    aVar2.a();
                    break;
                }
                break;
        }
    }
}
