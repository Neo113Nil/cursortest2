package defpackage;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.instrument.ExceptionAnalyzer;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class mi0 implements GraphRequest.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mi0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.facebook.GraphRequest.Callback
    public final void onCompleted(GraphResponse graphResponse) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ErrorReportHandler.sendErrorReports$lambda$2((ArrayList) obj, graphResponse);
                break;
            case 1:
                ExceptionAnalyzer.sendExceptionAnalysisReports$lambda$1((InstrumentData) obj, graphResponse);
                break;
            case 2:
                GraphRequest._set_callback_$lambda$0((GraphRequest.Callback) obj, graphResponse);
                break;
            case 3:
                GraphRequest.Companion.newPlacesSearchRequest$lambda$1((GraphRequest.GraphJSONArrayCallback) obj, graphResponse);
                break;
            default:
                GraphRequest.Companion.newMeRequest$lambda$0((GraphRequest.GraphJSONObjectCallback) obj, graphResponse);
                break;
        }
    }
}
