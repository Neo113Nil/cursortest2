package kotlinx.serialization.modules;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import papa.internal.Perfs$$ExternalSyntheticLambda2;

/* loaded from: classes3.dex */
public interface SerializersModuleCollector {
    void contextual(KClass kClass, Function1 function1);

    default void contextual(KClass kClass, KSerializer kSerializer) {
        kSerializer.getClass();
        contextual(kClass, new Perfs$$ExternalSyntheticLambda2(kSerializer, 7));
    }

    void polymorphic(KClass kClass, KClass kClass2, KSerializer kSerializer);

    void polymorphicDefaultDeserializer(KClass kClass, Function1 function1);

    void polymorphicDefaultSerializer(KClass kClass, Function1 function1);
}
