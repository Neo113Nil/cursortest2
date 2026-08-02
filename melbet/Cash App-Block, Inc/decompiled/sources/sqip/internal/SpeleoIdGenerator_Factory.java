package sqip.internal;

import dagger.internal.Factory;

/* loaded from: classes10.dex */
public final class SpeleoIdGenerator_Factory implements Factory {

    public static final class InstanceHolder {
        static final SpeleoIdGenerator_Factory INSTANCE = new SpeleoIdGenerator_Factory();

        private InstanceHolder() {
        }
    }

    public static SpeleoIdGenerator_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SpeleoIdGenerator newInstance() {
        return new SpeleoIdGenerator();
    }

    @Override // javax.inject.Provider
    public SpeleoIdGenerator get() {
        return newInstance();
    }
}
