package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public abstract class AbstractAnnotationLoader<A> implements AnnotationLoader<A> {
    public final SerializerExtensionProtocol protocol;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AbstractAnnotationLoader(SerializerExtensionProtocol serializerExtensionProtocol) {
        serializerExtensionProtocol.getClass();
        this.protocol = serializerExtensionProtocol;
    }

    public final ArrayList loadAnnotations(List list, List list2, NameResolver nameResolver) {
        List list3 = list;
        if (list3.isEmpty()) {
            if (list2 == null) {
                list2 = EmptyList.INSTANCE;
            }
            list3 = list2;
        }
        List list4 = list3;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadCallableAnnotations(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        boolean z = messageLite instanceof ProtoBuf.Constructor;
        SerializerExtensionProtocol serializerExtensionProtocol = this.protocol;
        if (z) {
            ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) messageLite;
            List<ProtoBuf.Annotation> annotationList = constructor.getAnnotationList();
            annotationList.getClass();
            return loadAnnotations(annotationList, (List) constructor.getExtension(serializerExtensionProtocol.getConstructorAnnotation()), protoContainer.getNameResolver());
        }
        if (messageLite instanceof ProtoBuf.Function) {
            ProtoBuf.Function function = (ProtoBuf.Function) messageLite;
            List<ProtoBuf.Annotation> annotationList2 = function.getAnnotationList();
            annotationList2.getClass();
            return loadAnnotations(annotationList2, (List) function.getExtension(serializerExtensionProtocol.getFunctionAnnotation()), protoContainer.getNameResolver());
        }
        if (!(messageLite instanceof ProtoBuf.Property)) {
            Path$$ExternalSyntheticBUOutline0.m$1(messageLite, "Unknown message: ");
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[annotatedCallableKind.ordinal()];
        if (i == 1) {
            ProtoBuf.Property property = (ProtoBuf.Property) messageLite;
            List<ProtoBuf.Annotation> annotationList3 = property.getAnnotationList();
            annotationList3.getClass();
            return loadAnnotations(annotationList3, (List) property.getExtension(serializerExtensionProtocol.getPropertyAnnotation()), protoContainer.getNameResolver());
        }
        if (i == 2) {
            ProtoBuf.Property property2 = (ProtoBuf.Property) messageLite;
            List<ProtoBuf.Annotation> getterAnnotationList = property2.getGetterAnnotationList();
            getterAnnotationList.getClass();
            return loadAnnotations(getterAnnotationList, (List) property2.getExtension(serializerExtensionProtocol.getPropertyGetterAnnotation()), protoContainer.getNameResolver());
        }
        if (i != 3) {
            a$$ExternalSyntheticBUOutline0.m$1("Unsupported callable kind with property proto");
            return null;
        }
        ProtoBuf.Property property3 = (ProtoBuf.Property) messageLite;
        List<ProtoBuf.Annotation> setterAnnotationList = property3.getSetterAnnotationList();
        setterAnnotationList.getClass();
        return loadAnnotations(setterAnnotationList, (List) property3.getExtension(serializerExtensionProtocol.getPropertySetterAnnotation()), protoContainer.getNameResolver());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadClassAnnotations(ProtoContainer.Class r4) {
        r4.getClass();
        List<ProtoBuf.Annotation> annotationList = r4.getClassProto().getAnnotationList();
        annotationList.getClass();
        return loadAnnotations(annotationList, (List) r4.getClassProto().getExtension(this.protocol.getClassAnnotation()), r4.getNameResolver());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadContextParameterAnnotations(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf.ValueParameter valueParameter) {
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        List<A> loadValueParameterAnnotations = valueParameter != null ? loadValueParameterAnnotations(protoContainer, messageLite, annotatedCallableKind, i, valueParameter) : null;
        return loadValueParameterAnnotations == null ? EmptyList.INSTANCE : loadValueParameterAnnotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadEnumEntryAnnotations(ProtoContainer protoContainer, ProtoBuf.EnumEntry enumEntry) {
        protoContainer.getClass();
        enumEntry.getClass();
        List<ProtoBuf.Annotation> annotationList = enumEntry.getAnnotationList();
        annotationList.getClass();
        return loadAnnotations(annotationList, (List) enumEntry.getExtension(this.protocol.getEnumEntryAnnotation()), protoContainer.getNameResolver());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadExtensionReceiverParameterAnnotations(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        boolean z = messageLite instanceof ProtoBuf.Function;
        SerializerExtensionProtocol serializerExtensionProtocol = this.protocol;
        if (z) {
            ProtoBuf.Function function = (ProtoBuf.Function) messageLite;
            List<ProtoBuf.Annotation> extensionReceiverAnnotationList = function.getExtensionReceiverAnnotationList();
            extensionReceiverAnnotationList.getClass();
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> functionExtensionReceiverAnnotation = serializerExtensionProtocol.getFunctionExtensionReceiverAnnotation();
            return loadAnnotations(extensionReceiverAnnotationList, functionExtensionReceiverAnnotation != null ? (List) function.getExtension(functionExtensionReceiverAnnotation) : null, protoContainer.getNameResolver());
        }
        if (!(messageLite instanceof ProtoBuf.Property)) {
            Path$$ExternalSyntheticBUOutline0.m$1(messageLite, "Unknown message: ");
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[annotatedCallableKind.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            Path$$ExternalSyntheticBUOutline0.m$1(annotatedCallableKind, "Unsupported callable kind with property proto for receiver annotations: ");
            return null;
        }
        ProtoBuf.Property property = (ProtoBuf.Property) messageLite;
        List<ProtoBuf.Annotation> extensionReceiverAnnotationList2 = property.getExtensionReceiverAnnotationList();
        extensionReceiverAnnotationList2.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyExtensionReceiverAnnotation = serializerExtensionProtocol.getPropertyExtensionReceiverAnnotation();
        return loadAnnotations(extensionReceiverAnnotationList2, propertyExtensionReceiverAnnotation != null ? (List) property.getExtension(propertyExtensionReceiverAnnotation) : null, protoContainer.getNameResolver());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadPropertyBackingFieldAnnotations(ProtoContainer protoContainer, ProtoBuf.Property property) {
        protoContainer.getClass();
        property.getClass();
        List<ProtoBuf.Annotation> backingFieldAnnotationList = property.getBackingFieldAnnotationList();
        backingFieldAnnotationList.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyBackingFieldAnnotation = this.protocol.getPropertyBackingFieldAnnotation();
        return loadAnnotations(backingFieldAnnotationList, propertyBackingFieldAnnotation != null ? (List) property.getExtension(propertyBackingFieldAnnotation) : null, protoContainer.getNameResolver());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadPropertyDelegateFieldAnnotations(ProtoContainer protoContainer, ProtoBuf.Property property) {
        protoContainer.getClass();
        property.getClass();
        List<ProtoBuf.Annotation> delegateFieldAnnotationList = property.getDelegateFieldAnnotationList();
        delegateFieldAnnotationList.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyDelegatedFieldAnnotation = this.protocol.getPropertyDelegatedFieldAnnotation();
        return loadAnnotations(delegateFieldAnnotationList, propertyDelegatedFieldAnnotation != null ? (List) property.getExtension(propertyDelegatedFieldAnnotation) : null, protoContainer.getNameResolver());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadTypeAnnotations(ProtoBuf.Type type2, NameResolver nameResolver) {
        type2.getClass();
        nameResolver.getClass();
        List<ProtoBuf.Annotation> annotationList = type2.getAnnotationList();
        annotationList.getClass();
        return loadAnnotations(annotationList, (List) type2.getExtension(this.protocol.getTypeAnnotation()), nameResolver);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadTypeParameterAnnotations(ProtoBuf.TypeParameter typeParameter, NameResolver nameResolver) {
        typeParameter.getClass();
        nameResolver.getClass();
        List<ProtoBuf.Annotation> annotationList = typeParameter.getAnnotationList();
        annotationList.getClass();
        return loadAnnotations(annotationList, (List) typeParameter.getExtension(this.protocol.getTypeParameterAnnotation()), nameResolver);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadValueParameterAnnotations(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf.ValueParameter valueParameter) {
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        valueParameter.getClass();
        List<ProtoBuf.Annotation> annotationList = valueParameter.getAnnotationList();
        annotationList.getClass();
        return loadAnnotations(annotationList, (List) valueParameter.getExtension(this.protocol.getParameterAnnotation()), protoContainer.getNameResolver());
    }
}
