package kotlin.reflect.jvm.internal.types;

import java.util.ArrayList;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;

/* loaded from: classes9.dex */
public final class CapturedKTypeConstructor implements CapturedTypeConstructorMarker {
    public final KTypeProjection projection;
    public ArrayList supertypes;

    public CapturedKTypeConstructor(KTypeProjection kTypeProjection) {
        this.projection = kTypeProjection;
    }

    public final String toString() {
        return "CapturedType(" + this.projection + ')';
    }
}
