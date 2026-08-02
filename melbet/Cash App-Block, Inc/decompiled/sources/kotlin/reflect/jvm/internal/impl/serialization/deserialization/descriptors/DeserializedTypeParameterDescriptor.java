package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.reflect.jvm.internal.KotlinKPropertyN$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes9.dex */
public final class DeserializedTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {
    public final DeserializedAnnotations annotations;
    public final DeserializationContext c;
    public final ProtoBuf.TypeParameter proto;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeserializedTypeParameterDescriptor(DeserializationContext deserializationContext, ProtoBuf.TypeParameter typeParameter, int i) {
        super(r1, r2, r3, r4, r0.variance(r5), typeParameter.getReified(), i, SourceElement.NO_SOURCE, SupertypeLoopChecker.EMPTY.INSTANCE);
        deserializationContext.getClass();
        typeParameter.getClass();
        StorageManager storageManager = deserializationContext.getStorageManager();
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        Annotations empty = Annotations.Companion.getEMPTY();
        Name name = NameResolverUtilKt.getName(deserializationContext.getNameResolver(), typeParameter.getName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        ProtoBuf.TypeParameter.Variance variance = typeParameter.getVariance();
        variance.getClass();
        this.c = deserializationContext;
        this.proto = typeParameter;
        this.annotations = new DeserializedAnnotations(deserializationContext.getStorageManager(), new KotlinKPropertyN$$Lambda$0(this, 26));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public void reportSupertypeLoopError(KotlinType kotlinType) {
        kotlinType.getClass();
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final List resolveUpperBounds() {
        DeserializationContext deserializationContext = this.c;
        List<ProtoBuf.Type> upperBounds = ProtoTypeTableUtilKt.upperBounds(this.proto, deserializationContext.getTypeTable());
        if (upperBounds.isEmpty()) {
            return CollectionsKt__CollectionsJVMKt.listOf(DescriptorUtilsKt.getBuiltIns(this).getDefaultBound());
        }
        List<ProtoBuf.Type> list = upperBounds;
        TypeDeserializer typeDeserializer = deserializationContext.getTypeDeserializer();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(typeDeserializer.type((ProtoBuf.Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public DeserializedAnnotations getAnnotations() {
        return this.annotations;
    }
}
