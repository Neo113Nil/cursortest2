package defpackage;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.DeviceAuthDialog;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class la0 implements GraphRequest.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ DeviceAuthDialog b;

    public /* synthetic */ la0(DeviceAuthDialog deviceAuthDialog, int i) {
        this.a = i;
        this.b = deviceAuthDialog;
    }

    @Override // com.facebook.GraphRequest.Callback
    public final void onCompleted(GraphResponse graphResponse) {
        int i = this.a;
        DeviceAuthDialog deviceAuthDialog = this.b;
        switch (i) {
            case 0:
                DeviceAuthDialog._get_pollRequest_$lambda$5(deviceAuthDialog, graphResponse);
                break;
            default:
                DeviceAuthDialog.startLogin$lambda$1(deviceAuthDialog, graphResponse);
                break;
        }
    }
}
