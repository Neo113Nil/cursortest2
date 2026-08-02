package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.EmptyMap;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes9.dex */
public interface NullabilityAnnotationStates<T> {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final NullabilityAnnotationStatesImpl EMPTY;

        static {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            EMPTY = new NullabilityAnnotationStatesImpl(emptyMap);
        }

        public final NullabilityAnnotationStates getEMPTY() {
            return EMPTY;
        }
    }

    T get(FqName fqName);
}
