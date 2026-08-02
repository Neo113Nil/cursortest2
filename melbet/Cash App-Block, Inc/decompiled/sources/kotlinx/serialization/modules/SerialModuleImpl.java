package kotlinx.serialization.modules;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.ContextualProvider;

/* loaded from: classes3.dex */
public final class SerialModuleImpl extends SerializersModule {
    public final Map class2ContextualFactory;
    public final boolean hasInterfaceContextualSerializers;
    public final Map polyBase2DefaultDeserializerProvider;
    public final Map polyBase2DefaultSerializerProvider;
    public final Map polyBase2NamedSerializers;
    public final Map polyBase2Serializers;

    public SerialModuleImpl(Map map, Map map2, Map map3, Map map4, Map map5, boolean z) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        map5.getClass();
        this.class2ContextualFactory = map;
        this.polyBase2Serializers = map2;
        this.polyBase2DefaultSerializerProvider = map3;
        this.polyBase2NamedSerializers = map4;
        this.polyBase2DefaultDeserializerProvider = map5;
        this.hasInterfaceContextualSerializers = z;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public final void dumpTo(SerializersModuleCollector serializersModuleCollector) {
        for (Map.Entry entry : this.class2ContextualFactory.entrySet()) {
            KClass kClass = (KClass) entry.getKey();
            ContextualProvider contextualProvider = (ContextualProvider) entry.getValue();
            if (contextualProvider instanceof ContextualProvider.Argless) {
                kClass.getClass();
                KSerializer kSerializer = ((ContextualProvider.Argless) contextualProvider).serializer;
                kSerializer.getClass();
                serializersModuleCollector.contextual(kClass, kSerializer);
            } else {
                if (!(contextualProvider instanceof ContextualProvider.WithTypeArguments)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                serializersModuleCollector.contextual(kClass, ((ContextualProvider.WithTypeArguments) contextualProvider).getProvider());
            }
        }
        for (Map.Entry entry2 : this.polyBase2Serializers.entrySet()) {
            KClass kClass2 = (KClass) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                KClass kClass3 = (KClass) entry3.getKey();
                KSerializer kSerializer2 = (KSerializer) entry3.getValue();
                kClass2.getClass();
                kClass3.getClass();
                kSerializer2.getClass();
                serializersModuleCollector.polymorphic(kClass2, kClass3, kSerializer2);
            }
        }
        for (Map.Entry entry4 : this.polyBase2DefaultSerializerProvider.entrySet()) {
            KClass kClass4 = (KClass) entry4.getKey();
            Function1 function1 = (Function1) entry4.getValue();
            kClass4.getClass();
            function1.getClass();
            TypeIntrinsics.beforeCheckcastToFunctionOfArity(1, function1);
            serializersModuleCollector.polymorphicDefaultSerializer(kClass4, function1);
        }
        for (Map.Entry entry5 : this.polyBase2DefaultDeserializerProvider.entrySet()) {
            KClass kClass5 = (KClass) entry5.getKey();
            Function1 function12 = (Function1) entry5.getValue();
            kClass5.getClass();
            function12.getClass();
            TypeIntrinsics.beforeCheckcastToFunctionOfArity(1, function12);
            serializersModuleCollector.polymorphicDefaultDeserializer(kClass5, function12);
        }
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public final KSerializer getContextual(KClass kClass, List list) {
        kClass.getClass();
        list.getClass();
        ContextualProvider contextualProvider = (ContextualProvider) this.class2ContextualFactory.get(kClass);
        KSerializer invoke = contextualProvider != null ? contextualProvider.invoke(list) : null;
        if (invoke instanceof KSerializer) {
            return invoke;
        }
        return null;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public final KSerializer getPolymorphic(KClass kClass, Object obj) {
        kClass.getClass();
        obj.getClass();
        if (kClass.isInstance(obj)) {
            Map map = (Map) this.polyBase2Serializers.get(kClass);
            KSerializer kSerializer = map != null ? (KSerializer) map.get(Reflection.factory.getOrCreateKotlinClass(obj.getClass())) : null;
            KSerializer kSerializer2 = kSerializer instanceof KSerializer ? kSerializer : null;
            if (kSerializer2 != null) {
                return kSerializer2;
            }
            Object obj2 = this.polyBase2DefaultSerializerProvider.get(kClass);
            Function1 function1 = TypeIntrinsics.isFunctionOfArity(1, obj2) ? (Function1) obj2 : null;
            if (function1 != null) {
                return (KSerializer) function1.invoke(obj);
            }
        }
        return null;
    }
}
