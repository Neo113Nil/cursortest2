package sqip.internal;

import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes10.dex */
public final class HttpModule_MoshiFactory implements Factory {

    public static final class InstanceHolder {
        static final HttpModule_MoshiFactory INSTANCE = new HttpModule_MoshiFactory();

        private InstanceHolder() {
        }
    }

    public static HttpModule_MoshiFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Moshi moshi() {
        Moshi moshi = HttpModule.INSTANCE.moshi();
        Preconditions.checkNotNullFromProvides(moshi);
        return moshi;
    }

    @Override // javax.inject.Provider
    public Moshi get() {
        return moshi();
    }
}
