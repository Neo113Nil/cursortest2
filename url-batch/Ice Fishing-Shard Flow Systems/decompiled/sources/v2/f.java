package v2;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes.dex */
public interface f {
    void addActivityLifecycleHandler(d dVar);

    void addApplicationLifecycleHandler(e eVar);

    Context getAppContext();

    Activity getCurrent();

    b getEntryState();

    boolean isInForeground();

    void removeActivityLifecycleHandler(d dVar);

    void removeApplicationLifecycleHandler(e eVar);

    void setEntryState(b bVar);

    Object waitUntilActivityReady(V5.b bVar);

    Object waitUntilSystemConditionsAvailable(V5.b bVar);
}
