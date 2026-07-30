package defpackage;

import com.facebook.AccessTokenManager;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEventQueue;
import com.facebook.appevents.FlushStatistics;
import com.facebook.appevents.SessionEventsState;
import com.facebook.login.DeviceAuthDialog;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class n1 implements GraphRequest.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // com.facebook.GraphRequest.Callback
    public final void onCompleted(GraphResponse graphResponse) {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                AccessTokenManager.refreshCurrentAccessTokenImpl$lambda$2((AtomicBoolean) obj4, (HashSet) obj3, (HashSet) obj2, (HashSet) obj, graphResponse);
                break;
            case 1:
                AppEventQueue.buildRequestForSession$lambda$4((AccessTokenAppIdPair) obj4, (GraphRequest) obj3, (SessionEventsState) obj2, (FlushStatistics) obj, graphResponse);
                break;
            default:
                DeviceAuthDialog.onSuccess$lambda$10((DeviceAuthDialog) obj4, (String) obj3, (Date) obj2, (Date) obj, graphResponse);
                break;
        }
    }
}
