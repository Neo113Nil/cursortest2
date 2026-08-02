package sqip.internal;

import android.app.Application;
import android.content.res.Resources;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes10.dex */
public final class AndroidModule_ResourcesFactory implements Factory {
    private final Provider applicationProvider;

    private AndroidModule_ResourcesFactory(Provider provider) {
        this.applicationProvider = provider;
    }

    public static AndroidModule_ResourcesFactory create(Provider provider) {
        return new AndroidModule_ResourcesFactory(provider);
    }

    public static Resources resources(Application application) {
        Resources resources = AndroidModule.INSTANCE.resources(application);
        Preconditions.checkNotNullFromProvides(resources);
        return resources;
    }

    @Override // javax.inject.Provider
    public Resources get() {
        return resources((Application) this.applicationProvider.get());
    }
}
