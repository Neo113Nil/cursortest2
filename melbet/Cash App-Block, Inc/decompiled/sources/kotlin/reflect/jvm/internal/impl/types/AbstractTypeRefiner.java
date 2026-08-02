package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* loaded from: classes9.dex */
public abstract class AbstractTypeRefiner {

    public static final class Default extends AbstractTypeRefiner {
        public static final Default INSTANCE = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner
        public KotlinTypeMarker refineType(KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            return kotlinTypeMarker;
        }
    }

    public abstract KotlinTypeMarker refineType(KotlinTypeMarker kotlinTypeMarker);
}
