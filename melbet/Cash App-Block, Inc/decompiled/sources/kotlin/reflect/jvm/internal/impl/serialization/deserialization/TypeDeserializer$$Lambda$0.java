package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* loaded from: classes9.dex */
public final class TypeDeserializer$$Lambda$0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final TypeDeserializer arg$0;

    public /* synthetic */ TypeDeserializer$$Lambda$0(TypeDeserializer typeDeserializer, int i) {
        this.$r8$classId = i;
        this.arg$0 = typeDeserializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        TypeDeserializer typeDeserializer = this.arg$0;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                DeserializationContext deserializationContext = typeDeserializer.c;
                ClassId classId = NameResolverUtilKt.getClassId(deserializationContext.getNameResolver(), intValue);
                return classId.isLocal() ? deserializationContext.getComponents().deserializeClass(classId) : FindClassInModuleKt.findClassifierAcrossModuleDependencies(deserializationContext.getComponents().getModuleDescriptor(), classId);
            case 1:
                int intValue2 = ((Number) obj).intValue();
                DeserializationContext deserializationContext2 = typeDeserializer.c;
                ClassId classId2 = NameResolverUtilKt.getClassId(deserializationContext2.getNameResolver(), intValue2);
                if (classId2.isLocal()) {
                    return null;
                }
                return FindClassInModuleKt.findTypeAliasAcrossModuleDependencies(deserializationContext2.getComponents().getModuleDescriptor(), classId2);
            default:
                ProtoBuf.Type type2 = (ProtoBuf.Type) obj;
                type2.getClass();
                return ProtoTypeTableUtilKt.outerType(type2, typeDeserializer.c.getTypeTable());
        }
    }
}
