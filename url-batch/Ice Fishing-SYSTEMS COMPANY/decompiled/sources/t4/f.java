package t4;

import android.app.Activity;
import android.content.Context;
import v7.InterfaceC5133d;

/* loaded from: classes2.dex */
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

    Object waitUntilActivityReady(InterfaceC5133d interfaceC5133d);

    Object waitUntilSystemConditionsAvailable(InterfaceC5133d interfaceC5133d);
}
