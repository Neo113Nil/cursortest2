package defpackage;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.instrument.anrreport.ANRHandler;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements GraphRequest.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ o(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // com.facebook.GraphRequest.Callback
    public final void onCompleted(GraphResponse graphResponse) {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                ANRHandler.sendANRReports$lambda$5(list, graphResponse);
                break;
            default:
                CrashHandler.Companion.sendExceptionReports$lambda$5(list, graphResponse);
                break;
        }
    }
}
