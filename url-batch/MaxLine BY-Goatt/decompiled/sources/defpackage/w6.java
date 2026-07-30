package defpackage;

import android.view.autofill.AutofillManager;
import android.window.OnBackInvokedDispatcher;
import com.facebook.appevents.AppEventsLoggerImpl;
import com.facebook.appevents.AppEventsManager$start$1;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.InstallReferrerUtil;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class w6 implements InstallReferrerUtil.Callback, FeatureManager.Callback {
    public final /* synthetic */ int m;

    public /* synthetic */ w6(int i) {
        this.m = i;
    }

    public static /* bridge */ /* synthetic */ AutofillManager c(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher d(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ Class e() {
        return AutofillManager.class;
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public void onCompleted(boolean z) {
        switch (this.m) {
            case 27:
                AppEventsManager$start$1.onSuccess$lambda$0(z);
                break;
            case 28:
                AppEventsManager$start$1.onSuccess$lambda$3(z);
                break;
            default:
                AppEventsManager$start$1.onSuccess$lambda$4(z);
                break;
        }
    }

    @Override // com.facebook.internal.InstallReferrerUtil.Callback
    public void onReceiveReferrerUrl(String str) {
        AppEventsLoggerImpl.installReferrerCallback$lambda$0(str);
    }
}
