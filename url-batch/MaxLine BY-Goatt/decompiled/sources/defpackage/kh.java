package defpackage;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.cloudbridge.AppEventsCAPIManager;
import com.facebook.appevents.codeless.ViewIndexer;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class kh implements GraphRequest.Callback {
    public final /* synthetic */ int a;

    public /* synthetic */ kh(int i) {
        this.a = i;
    }

    @Override // com.facebook.GraphRequest.Callback
    public final void onCompleted(GraphResponse graphResponse) {
        switch (this.a) {
            case 0:
                AppEventsCAPIManager.enable$lambda$0(graphResponse);
                break;
            default:
                ViewIndexer.Companion.buildAppIndexingRequest$lambda$0(graphResponse);
                break;
        }
    }
}
