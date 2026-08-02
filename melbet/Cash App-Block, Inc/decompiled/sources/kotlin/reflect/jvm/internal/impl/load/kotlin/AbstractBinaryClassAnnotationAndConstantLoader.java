package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2;

/* loaded from: classes9.dex */
public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C> extends AbstractBinaryClassAnnotationLoader<A, AnnotationsContainerWithConstants<? extends A, ? extends C>> implements AnnotationAndConstantLoader<A, C> {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final MemoizedFunctionToNotNull storage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractBinaryClassAnnotationAndConstantLoader(StorageManager storageManager, KotlinClassFinder kotlinClassFinder) {
        super(kotlinClassFinder);
        storageManager.getClass();
        kotlinClassFinder.getClass();
        this.storage = storageManager.createMemoizedFunction(new TasksKt$awaitImpl$2$2(this, 15));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public AbstractBinaryClassAnnotationLoader.AnnotationsContainer getAnnotationsContainer(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlinJvmBinaryClass.getClass();
        return (AnnotationsContainerWithConstants) this.storage.invoke(kotlinJvmBinaryClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public C loadAnnotationDefaultValue(ProtoContainer protoContainer, ProtoBuf.Property property, KotlinType kotlinType) {
        protoContainer.getClass();
        property.getClass();
        kotlinType.getClass();
        return (C) loadConstantFromProperty(protoContainer, property, AnnotatedCallableKind.PROPERTY_GETTER, kotlinType, AbstractBinaryClassAnnotationAndConstantLoader$$Lambda$1.INSTANCE);
    }

    public abstract Object loadConstant(String str, Object obj);

    public final Object loadConstantFromProperty(ProtoContainer protoContainer, ProtoBuf.Property property, AnnotatedCallableKind annotatedCallableKind, KotlinType kotlinType, Function2 function2) {
        Object invoke;
        KotlinJvmBinaryClass specialCaseContainerClass = AbstractBinaryClassAnnotationLoader.Companion.getSpecialCaseContainerClass(protoContainer, true, true, Flags.IS_CONST.get(property.getFlags()), JvmProtoBufUtil.isMovedFromInterfaceCompanion(property), this.kotlinClassFinder, getMetadataVersion());
        protoContainer.getClass();
        if (specialCaseContainerClass == null) {
            if (protoContainer instanceof ProtoContainer.Class) {
                SourceElement source = ((ProtoContainer.Class) protoContainer).getSource();
                KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = source instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) source : null;
                if (kotlinJvmBinarySourceElement != null) {
                    specialCaseContainerClass = kotlinJvmBinarySourceElement.getBinaryClass();
                }
            }
            specialCaseContainerClass = null;
        }
        if (specialCaseContainerClass != null) {
            MemberSignature callableSignature = AbstractBinaryClassAnnotationLoader.getCallableSignature(property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), annotatedCallableKind, specialCaseContainerClass.getClassHeader().getMetadataVersion().isAtLeast(DeserializedDescriptorResolver.Companion.getKOTLIN_1_3_RC_METADATA_VERSION$descriptors_jvm()));
            if (callableSignature != null && (invoke = function2.invoke(this.storage.invoke(specialCaseContainerClass), callableSignature)) != null) {
                return UnsignedTypes.isUnsignedType(kotlinType) ? transformToUnsignedConstant(invoke) : invoke;
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public C loadPropertyConstant(ProtoContainer protoContainer, ProtoBuf.Property property, KotlinType kotlinType) {
        protoContainer.getClass();
        property.getClass();
        kotlinType.getClass();
        return (C) loadConstantFromProperty(protoContainer, property, AnnotatedCallableKind.PROPERTY, kotlinType, AbstractBinaryClassAnnotationAndConstantLoader$$Lambda$1.INSTANCE$1);
    }

    public abstract Object transformToUnsignedConstant(Object obj);
}
