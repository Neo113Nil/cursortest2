package sqip.internal;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes10.dex */
public final class AndroidModule_ApplicationFactory implements Factory {

    public static final class InstanceHolder {
        static final AndroidModule_ApplicationFactory INSTANCE = new AndroidModule_ApplicationFactory();

        private InstanceHolder() {
        }
    }

    public static Application application() {
        Application application = AndroidModule.INSTANCE.application();
        Preconditions.checkNotNullFromProvides(application);
        return application;
    }

    public static AndroidModule_ApplicationFactory create() {
        return InstanceHolder.INSTANCE;
    }

    @Override // javax.inject.Provider
    public Application get() {
        return application();
    }
}
