package kotlin.reflect.jvm.internal.types;

import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;

/* loaded from: classes9.dex */
public final class KTypeProjectionAsTypeArgumentMarker implements TypeArgumentMarker {
    public final KTypeProjection value;

    public KTypeProjectionAsTypeArgumentMarker(KTypeProjection kTypeProjection) {
        kTypeProjection.getClass();
        this.value = kTypeProjection;
    }
}
