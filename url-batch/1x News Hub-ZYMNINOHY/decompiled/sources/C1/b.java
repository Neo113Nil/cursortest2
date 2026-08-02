package C1;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.app.Activity;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ GetTopicsRequest.Builder f() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ GetTopicsResponse j(Object obj) {
        return (GetTopicsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Topic k(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ TopicsManager l(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* bridge */ /* synthetic */ Activity.ScreenCaptureCallback m(Object obj) {
        return (Activity.ScreenCaptureCallback) obj;
    }

    public static /* bridge */ /* synthetic */ Class n() {
        return TopicsManager.class;
    }

    public static /* synthetic */ void p() {
    }
}
