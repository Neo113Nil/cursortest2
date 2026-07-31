package T1;

import android.app.Activity;
import android.content.Context;
import o5.InterfaceC0564d;

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

    Object waitUntilActivityReady(InterfaceC0564d interfaceC0564d);

    Object waitUntilSystemConditionsAvailable(InterfaceC0564d interfaceC0564d);
}
