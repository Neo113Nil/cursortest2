package kotlinx.serialization.json.internal;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind$INT;
import kotlinx.serialization.descriptors.SerialKind$CONTEXTUAL;
import kotlinx.serialization.descriptors.SerialKind$ENUM;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.modules.SerializersModuleCollector;
import okio.Utf8;

/* loaded from: classes3.dex */
public final class JsonSerializersModuleValidator implements SerializersModuleCollector {
    public final boolean isDiscriminatorRequired;
    public final boolean useArrayPolymorphism;

    public JsonSerializersModuleValidator(JsonConfiguration jsonConfiguration) {
        this.useArrayPolymorphism = jsonConfiguration.useArrayPolymorphism;
        this.isDiscriminatorRequired = jsonConfiguration.classDiscriminatorMode != ClassDiscriminatorMode.NONE;
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void contextual(KClass kClass, Function1 function1) {
        kClass.getClass();
        function1.getClass();
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void polymorphic(KClass kClass, KClass kClass2, KSerializer kSerializer) {
        Utf8 kind = kSerializer.getDescriptor().getKind();
        if ((kind instanceof PolymorphicKind) || Intrinsics.areEqual(kind, SerialKind$CONTEXTUAL.INSTANCE)) {
            Drop$$ExternalSyntheticBUOutline0.m(kClass2.getSimpleName(), " can't be registered as a subclass for polymorphic serialization because its kind ", kind, " is not concrete. To work with multiple hierarchies, register it as a base class.", "Serializer for ");
            return;
        }
        if (!this.useArrayPolymorphism && this.isDiscriminatorRequired) {
            if (Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE$1) || Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE) || (kind instanceof PrimitiveKind$INT) || (kind instanceof SerialKind$ENUM)) {
                Drop$$ExternalSyntheticBUOutline0.m(kClass2.getSimpleName(), " of kind ", kind, " cannot be serialized polymorphically with class discriminator.", "Serializer for ");
            }
        }
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void polymorphicDefaultDeserializer(KClass kClass, Function1 function1) {
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void polymorphicDefaultSerializer(KClass kClass, Function1 function1) {
    }
}
