package kotlinx.serialization.internal;

import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* loaded from: classes9.dex */
public interface SerializerCache {
    KSerializer get(KClass kClass);
}
