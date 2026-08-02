package kotlinx.serialization.modules;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.ContextualProvider;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import papa.PapaEvent;

/* loaded from: classes3.dex */
public final class SerializersModuleBuilder implements SerializersModuleCollector {
    public boolean hasInterfaceContextualSerializers;
    public final HashMap class2ContextualProvider = new HashMap();
    public final HashMap polyBase2Serializers = new HashMap();
    public final HashMap polyBase2DefaultSerializerProvider = new HashMap();
    public final HashMap polyBase2NamedSerializers = new HashMap();
    public final HashMap polyBase2DefaultDeserializerProvider = new HashMap();

    public static void registerPolymorphicSerializer$default(SerializersModuleBuilder serializersModuleBuilder, KClass kClass, KClass kClass2, KSerializer kSerializer) {
        Object obj;
        KClass kClass3;
        kClass.getClass();
        kClass2.getClass();
        kSerializer.getClass();
        String serialName = kSerializer.getDescriptor().getSerialName();
        HashMap hashMap = serializersModuleBuilder.polyBase2Serializers;
        Object obj2 = hashMap.get(kClass);
        if (obj2 == null) {
            obj2 = new HashMap();
            hashMap.put(kClass, obj2);
        }
        Map map = (Map) obj2;
        HashMap hashMap2 = serializersModuleBuilder.polyBase2NamedSerializers;
        Object obj3 = hashMap2.get(kClass);
        if (obj3 == null) {
            obj3 = new HashMap();
            hashMap2.put(kClass, obj3);
        }
        Map map2 = (Map) obj3;
        KSerializer kSerializer2 = (KSerializer) map.get(kClass2);
        if (kSerializer2 != null && !kSerializer2.equals(kSerializer)) {
            throw new SerializerAlreadyRegisteredException(kClass, kClass2);
        }
        KSerializer kSerializer3 = (KSerializer) map2.get(serialName);
        if (kSerializer3 == null || kSerializer3.equals(kSerializer)) {
            map.put(kClass2, kSerializer);
            map2.put(serialName, kSerializer);
            return;
        }
        Iterator it = ((Iterable) CollectionsKt.asSequence(map.entrySet()).$this_lineSequence$inlined).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Map.Entry) obj).getValue() == kSerializer3) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (kClass3 = (KClass) entry.getKey()) == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Name ", serialName, " is registered in the module but no Kotlin class is associated with it.");
            return;
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + kClass + "' have the same serial name '" + serialName + "': " + kSerializer + " for '" + kClass2 + "' and " + kSerializer3 + " for '" + kClass3 + '\'');
    }

    public static void registerSerializer$default(SerializersModuleBuilder serializersModuleBuilder, KClass kClass, ContextualProvider contextualProvider) {
        HashMap hashMap = serializersModuleBuilder.class2ContextualProvider;
        kClass.getClass();
        ContextualProvider contextualProvider2 = (ContextualProvider) hashMap.get(kClass);
        if (contextualProvider2 != null && !contextualProvider2.equals(contextualProvider)) {
            throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + kClass + " already registered in this module");
        }
        hashMap.put(kClass, contextualProvider);
        if (PapaEvent.getJavaClass(kClass).isInterface()) {
            serializersModuleBuilder.hasInterfaceContextualSerializers = true;
        }
    }

    public final SerialModuleImpl build() {
        return new SerialModuleImpl(this.class2ContextualProvider, this.polyBase2Serializers, this.polyBase2DefaultSerializerProvider, this.polyBase2NamedSerializers, this.polyBase2DefaultDeserializerProvider, this.hasInterfaceContextualSerializers);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void contextual(KClass kClass, KSerializer kSerializer) {
        kClass.getClass();
        kSerializer.getClass();
        registerSerializer$default(this, kClass, new ContextualProvider.Argless(kSerializer));
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void polymorphic(KClass kClass, KClass kClass2, KSerializer kSerializer) {
        registerPolymorphicSerializer$default(this, kClass, kClass2, kSerializer);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void polymorphicDefaultDeserializer(KClass kClass, Function1 function1) {
        kClass.getClass();
        HashMap hashMap = this.polyBase2DefaultDeserializerProvider;
        Function1 function12 = (Function1) hashMap.get(kClass);
        if (function12 == null || function12.equals(function1)) {
            hashMap.put(kClass, function1);
        } else {
            Handlers$$ExternalSyntheticBUOutline0.m$1("Default deserializers provider for ", kClass, " is already registered: ", function12);
        }
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void polymorphicDefaultSerializer(KClass kClass, Function1 function1) {
        kClass.getClass();
        HashMap hashMap = this.polyBase2DefaultSerializerProvider;
        Function1 function12 = (Function1) hashMap.get(kClass);
        if (function12 == null || function12.equals(function1)) {
            hashMap.put(kClass, function1);
        } else {
            Handlers$$ExternalSyntheticBUOutline0.m$1("Default serializers provider for ", kClass, " is already registered: ", function12);
        }
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void contextual(KClass kClass, Function1 function1) {
        kClass.getClass();
        function1.getClass();
        registerSerializer$default(this, kClass, new ContextualProvider.WithTypeArguments(function1));
    }
}
