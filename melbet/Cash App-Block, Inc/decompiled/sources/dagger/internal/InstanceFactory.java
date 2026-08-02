package dagger.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import dagger.Lazy;

/* loaded from: classes8.dex */
public final class InstanceFactory implements Factory, Lazy {
    public static final InstanceFactory NULL_INSTANCE_FACTORY = new InstanceFactory(null);
    public final Object instance;

    public InstanceFactory(Object obj) {
        this.instance = obj;
    }

    public static InstanceFactory create(Object obj) {
        if (obj != null) {
            return new InstanceFactory(obj);
        }
        a$$ExternalSyntheticBUOutline0.m$2("instance cannot be null");
        return null;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return this.instance;
    }
}
