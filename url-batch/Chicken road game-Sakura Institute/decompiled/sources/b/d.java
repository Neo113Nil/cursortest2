package b;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1141f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f1142g;

    public /* synthetic */ d(o oVar, int i7) {
        this.f1141f = i7;
        this.f1142g = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1141f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                o oVar = this.f1142g;
                r6.k.f(oVar, "this$0");
                oVar.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e9) {
                    if (!r6.k.a(e9.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e9;
                    }
                    return;
                } catch (NullPointerException e10) {
                    if (!r6.k.a(e10.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e10;
                    }
                    return;
                }
        }
    }
}
