package dagger.internal;

import androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent$CameraPipeComponentImpl;

/* loaded from: classes9.dex */
public final class SingleCheck implements Provider {
    public static final Object UNINITIALIZED = new Object();
    public volatile Object instance;
    public volatile DaggerCameraPipeComponent$CameraPipeComponentImpl.SwitchingProvider provider;

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj = this.instance;
        if (obj != UNINITIALIZED) {
            return obj;
        }
        DaggerCameraPipeComponent$CameraPipeComponentImpl.SwitchingProvider switchingProvider = this.provider;
        if (switchingProvider == null) {
            return this.instance;
        }
        Object obj2 = switchingProvider.get();
        this.instance = obj2;
        this.provider = null;
        return obj2;
    }
}
