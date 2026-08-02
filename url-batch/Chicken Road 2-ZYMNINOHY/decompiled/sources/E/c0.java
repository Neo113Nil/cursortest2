package E;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.app.Activity;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c0 {
    public static /* synthetic */ GetTopicsRequest.Builder g() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ GetTopicsResponse k(Object obj) {
        return (GetTopicsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Topic l(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ TopicsManager m(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* bridge */ /* synthetic */ Activity.ScreenCaptureCallback n(Object obj) {
        return (Activity.ScreenCaptureCallback) obj;
    }

    public static /* bridge */ /* synthetic */ Class p() {
        return TopicsManager.class;
    }

    public static /* synthetic */ void r() {
    }
}
