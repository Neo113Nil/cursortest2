package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.time.zzfh;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* loaded from: classes9.dex */
public abstract class GeneratedMessageLite extends AbstractMessageLite implements Serializable {

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$1, reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class Builder<MessageType extends GeneratedMessageLite, BuilderType extends Builder> extends AbstractMessageLite.Builder<BuilderType> {
        public ByteString unknownFields = ByteString.EMPTY;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone */
        public BuilderType mo4151clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public abstract MessageType getDefaultInstanceForType();

        public final ByteString getUnknownFields() {
            return this.unknownFields;
        }

        public abstract BuilderType mergeFrom(MessageType messagetype);

        public final BuilderType setUnknownFields(ByteString byteString) {
            this.unknownFields = byteString;
            return this;
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType> {
        public FieldSet extensions = FieldSet.DEFAULT_INSTANCE;
        public boolean extensionsIsMutable;

        public final <Type> BuilderType addExtension(GeneratedExtension<MessageType, List<Type>> generatedExtension, Type type2) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                a$$ExternalSyntheticBUOutline0.m$3("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                return null;
            }
            if (!this.extensionsIsMutable) {
                this.extensions = this.extensions.clone();
                this.extensionsIsMutable = true;
            }
            this.extensions.addRepeatedField(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(type2));
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone */
        public BuilderType mo4151clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public final void mergeExtensionFields(ExtendableMessage extendableMessage) {
            SmallSortedMap$1 smallSortedMap$1;
            if (!this.extensionsIsMutable) {
                this.extensions = this.extensions.clone();
                this.extensionsIsMutable = true;
            }
            FieldSet fieldSet = this.extensions;
            FieldSet fieldSet2 = extendableMessage.extensions;
            fieldSet.getClass();
            int i = 0;
            while (true) {
                int size = fieldSet2.fields.entryList.size();
                smallSortedMap$1 = fieldSet2.fields;
                if (i >= size) {
                    break;
                }
                fieldSet.mergeFromField((Map.Entry) smallSortedMap$1.entryList.get(i));
                i++;
            }
            Iterator it = smallSortedMap$1.getOverflowEntries().iterator();
            while (it.hasNext()) {
                fieldSet.mergeFromField((Map.Entry) it.next());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> BuilderType setExtension(GeneratedExtension<MessageType, Type> generatedExtension, Type type2) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                a$$ExternalSyntheticBUOutline0.m$3("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                return null;
            }
            if (!this.extensionsIsMutable) {
                this.extensions = this.extensions.clone();
                this.extensionsIsMutable = true;
            }
            FieldSet fieldSet = this.extensions;
            ExtensionDescriptor extensionDescriptor = generatedExtension.descriptor;
            if (!extensionDescriptor.isRepeated) {
                type2 = (Type) generatedExtension.singularToFieldSetType(type2);
            } else if (extensionDescriptor.f1533type.getJavaType() == WireFormat.JavaType.ENUM) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) type2).iterator();
                while (it.hasNext()) {
                    arrayList.add(generatedExtension.singularToFieldSetType(it.next()));
                }
                type2 = arrayList;
            }
            fieldSet.setField(extensionDescriptor, type2);
            return this;
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage> extends MessageLiteOrBuilder {
    }

    public final class ExtensionDescriptor implements FieldSet.FieldDescriptorLite {
        public final Internal.EnumLiteMap enumTypeMap;
        public final boolean isPacked;
        public final boolean isRepeated;
        public final int number;

        /* renamed from: type, reason: collision with root package name */
        public final WireFormat.FieldType f1533type;

        public ExtensionDescriptor(Internal.EnumLiteMap enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.enumTypeMap = enumLiteMap;
            this.number = i;
            this.f1533type = fieldType;
            this.isRepeated = z;
            this.isPacked = z2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.number - ((ExtensionDescriptor) obj).number;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.JavaType getLiteJavaType() {
            return this.f1533type.getJavaType();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.FieldType getLiteType() {
            return this.f1533type;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final int getNumber() {
            return this.number;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mergeFrom((GeneratedMessageLite) messageLite);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final boolean isPacked() {
            return this.isPacked;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final boolean isRepeated() {
            return this.isRepeated;
        }
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> {
        public final MessageLite containingTypeDefaultInstance;
        public final Object defaultValue;
        public final ExtensionDescriptor descriptor;
        public final Method enumValueOf;
        public final MessageLite messageDefaultInstance;

        public GeneratedExtension(MessageLite messageLite, Object obj, MessageLite messageLite2, ExtensionDescriptor extensionDescriptor, Class cls) {
            if (messageLite == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Null containingTypeDefaultInstance");
                throw null;
            }
            if (extensionDescriptor.f1533type == WireFormat.FieldType.MESSAGE && messageLite2 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Null messageDefaultInstance");
                throw null;
            }
            this.containingTypeDefaultInstance = messageLite;
            this.defaultValue = obj;
            this.messageDefaultInstance = messageLite2;
            this.descriptor = extensionDescriptor;
            if (!Internal.EnumLite.class.isAssignableFrom(cls)) {
                this.enumValueOf = null;
                return;
            }
            try {
                this.enumValueOf = cls.getMethod("valueOf", Integer.TYPE);
            } catch (NoSuchMethodException e) {
                String name = cls.getName();
                OptionalProvider$$ExternalSyntheticLambda0.m(Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), (Throwable) e);
                throw null;
            }
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return (ContainingType) this.containingTypeDefaultInstance;
        }

        public MessageLite getMessageDefaultInstance() {
            return this.messageDefaultInstance;
        }

        public int getNumber() {
            return this.descriptor.number;
        }

        public final Object singularFromFieldSetType(Object obj) {
            if (this.descriptor.f1533type.getJavaType() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            try {
                return this.enumValueOf.invoke(null, (Integer) obj);
            } catch (IllegalAccessException e) {
                OptionalProvider$$ExternalSyntheticLambda0.m("Couldn't use Java reflection to implement protocol message reflection.", (Throwable) e);
                return null;
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m("Unexpected exception thrown by generated accessor method.", cause);
                return null;
            }
        }

        public final Object singularToFieldSetType(Object obj) {
            return this.descriptor.f1533type.getJavaType() == WireFormat.JavaType.ENUM ? Integer.valueOf(((Internal.EnumLite) obj).getNumber()) : obj;
        }
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, Class cls) {
        return new GeneratedExtension<>(containingtype, Collections.EMPTY_LIST, messageLite, new ExtensionDescriptor(enumLiteMap, i, fieldType, true, z), cls);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type2, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension<>(containingtype, type2, messageLite, new ExtensionDescriptor(enumLiteMap, i, fieldType, false, false), cls);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
    public Parser<? extends MessageLite> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements ExtendableMessageOrBuilder<MessageType> {
        public final FieldSet extensions;

        public class ExtensionWriter {
            public final Iterator iter;
            public Map.Entry next;

            public ExtensionWriter(ExtendableMessage extendableMessage) {
                Iterator it;
                FieldSet fieldSet = extendableMessage.extensions;
                boolean z = fieldSet.hasLazyField;
                SmallSortedMap$1 smallSortedMap$1 = fieldSet.fields;
                if (z) {
                    Iterator it2 = ((zzfh) smallSortedMap$1.entrySet()).iterator();
                    zzbe zzbeVar = new zzbe(4);
                    zzbeVar.zza = it2;
                    it = zzbeVar;
                } else {
                    it = ((zzfh) smallSortedMap$1.entrySet()).iterator();
                }
                this.iter = it;
                if (it.hasNext()) {
                    this.next = (Map.Entry) it.next();
                }
            }

            public void writeUntil(int i, CodedOutputStream codedOutputStream) {
                while (true) {
                    Map.Entry entry = this.next;
                    if (entry == null || ((ExtensionDescriptor) entry.getKey()).number >= i) {
                        return;
                    }
                    ExtensionDescriptor extensionDescriptor = (ExtensionDescriptor) this.next.getKey();
                    Object value = this.next.getValue();
                    FieldSet fieldSet = FieldSet.DEFAULT_INSTANCE;
                    WireFormat.FieldType fieldType = extensionDescriptor.f1533type;
                    int i2 = extensionDescriptor.number;
                    if (extensionDescriptor.isRepeated) {
                        List list = (List) value;
                        if (extensionDescriptor.isPacked) {
                            codedOutputStream.writeTag(i2, 2);
                            Iterator it = list.iterator();
                            int i3 = 0;
                            while (it.hasNext()) {
                                i3 += FieldSet.computeElementSizeNoTag(fieldType, it.next());
                            }
                            codedOutputStream.writeRawVarint32(i3);
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                FieldSet.writeElementNoTag(codedOutputStream, fieldType, it2.next());
                            }
                        } else {
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                FieldSet.writeElement(codedOutputStream, fieldType, i2, it3.next());
                            }
                        }
                    } else if (value instanceof LazyField) {
                        FieldSet.writeElement(codedOutputStream, fieldType, i2, ((LazyField) value).getValue());
                    } else {
                        FieldSet.writeElement(codedOutputStream, fieldType, i2, value);
                    }
                    Iterator it4 = this.iter;
                    if (it4.hasNext()) {
                        this.next = (Map.Entry) it4.next();
                    } else {
                        this.next = null;
                    }
                }
            }
        }

        public ExtendableMessage(ExtendableBuilder extendableBuilder) {
            extendableBuilder.extensions.makeImmutable();
            extendableBuilder.extensionsIsMutable = false;
            this.extensions = extendableBuilder.extensions;
        }

        public final int extensionsSerializedSize() {
            SmallSortedMap$1 smallSortedMap$1 = this.extensions.fields;
            int i = 0;
            for (int i2 = 0; i2 < smallSortedMap$1.entryList.size(); i2++) {
                Map.Entry entry = (Map.Entry) smallSortedMap$1.entryList.get(i2);
                i += FieldSet.computeFieldSize((FieldSet.FieldDescriptorLite) entry.getKey(), entry.getValue());
            }
            for (Map.Entry entry2 : smallSortedMap$1.getOverflowEntries()) {
                i += FieldSet.computeFieldSize((FieldSet.FieldDescriptorLite) entry2.getKey(), entry2.getValue());
            }
            return i;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [Type, java.util.ArrayList] */
        public final <Type> Type getExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            verifyExtensionContainingType$1(generatedExtension);
            ExtensionDescriptor extensionDescriptor = generatedExtension.descriptor;
            Type type2 = (Type) this.extensions.getField(extensionDescriptor);
            if (type2 == null) {
                return (Type) generatedExtension.defaultValue;
            }
            if (!extensionDescriptor.isRepeated) {
                return (Type) generatedExtension.singularFromFieldSetType(type2);
            }
            if (extensionDescriptor.f1533type.getJavaType() != WireFormat.JavaType.ENUM) {
                return type2;
            }
            ?? r0 = (Type) new ArrayList();
            Iterator it = ((List) type2).iterator();
            while (it.hasNext()) {
                r0.add(generatedExtension.singularFromFieldSetType(it.next()));
            }
            return r0;
        }

        public final <Type> int getExtensionCount(GeneratedExtension<MessageType, List<Type>> generatedExtension) {
            verifyExtensionContainingType$1(generatedExtension);
            ExtensionDescriptor extensionDescriptor = generatedExtension.descriptor;
            FieldSet fieldSet = this.extensions;
            fieldSet.getClass();
            if (!extensionDescriptor.isRepeated) {
                a$$ExternalSyntheticBUOutline0.m$3("getRepeatedField() can only be called on repeated fields.");
                return 0;
            }
            Object field = fieldSet.getField(extensionDescriptor);
            if (field == null) {
                return 0;
            }
            return ((List) field).size();
        }

        public final <Type> boolean hasExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            verifyExtensionContainingType$1(generatedExtension);
            ExtensionDescriptor extensionDescriptor = generatedExtension.descriptor;
            FieldSet fieldSet = this.extensions;
            fieldSet.getClass();
            if (!extensionDescriptor.isRepeated) {
                return fieldSet.fields.get(extensionDescriptor) != null;
            }
            a$$ExternalSyntheticBUOutline0.m$3("hasField() can only be called on non-repeated fields.");
            return false;
        }

        public final void makeExtensionsImmutable() {
            this.extensions.makeImmutable();
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean parseUnknownField(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            boolean z;
            Object build;
            MessageLite messageLite;
            int i2 = i & 7;
            GeneratedExtension findLiteExtensionByNumber = extensionRegistryLite.findLiteExtensionByNumber(getDefaultInstanceForType(), WireFormat.getTagFieldNumber(i));
            boolean z2 = false;
            if (findLiteExtensionByNumber != null) {
                ExtensionDescriptor extensionDescriptor = findLiteExtensionByNumber.descriptor;
                WireFormat.FieldType fieldType = extensionDescriptor.f1533type;
                FieldSet fieldSet = FieldSet.DEFAULT_INSTANCE;
                if (i2 == fieldType.getWireType()) {
                    z = false;
                } else if (extensionDescriptor.isRepeated && extensionDescriptor.f1533type.isPackable() && i2 == 2) {
                    z = true;
                }
                if (!z2) {
                    return codedInputStream.skipField(i, codedOutputStream);
                }
                FieldSet fieldSet2 = this.extensions;
                if (z) {
                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                    ExtensionDescriptor extensionDescriptor2 = findLiteExtensionByNumber.descriptor;
                    if (extensionDescriptor2.f1533type == WireFormat.FieldType.ENUM) {
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            Internal.EnumLite findValueByNumber = extensionDescriptor2.enumTypeMap.findValueByNumber(codedInputStream.readEnum());
                            if (findValueByNumber == null) {
                                return true;
                            }
                            fieldSet2.addRepeatedField(extensionDescriptor2, findLiteExtensionByNumber.singularToFieldSetType(findValueByNumber));
                        }
                    } else {
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            fieldSet2.addRepeatedField(extensionDescriptor2, FieldSet.readPrimitiveField(codedInputStream, extensionDescriptor2.f1533type));
                        }
                    }
                    codedInputStream.popLimit(pushLimit);
                    return true;
                }
                int[] iArr = AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType;
                ExtensionDescriptor extensionDescriptor3 = findLiteExtensionByNumber.descriptor;
                WireFormat.FieldType fieldType2 = extensionDescriptor3.f1533type;
                boolean z3 = extensionDescriptor3.isRepeated;
                int i3 = iArr[fieldType2.getJavaType().ordinal()];
                if (i3 == 1) {
                    MessageLite.Builder builder = (z3 || (messageLite = (MessageLite) fieldSet2.getField(extensionDescriptor3)) == null) ? null : messageLite.toBuilder();
                    if (builder == null) {
                        builder = findLiteExtensionByNumber.getMessageDefaultInstance().newBuilderForType();
                    }
                    if (fieldType2 == WireFormat.FieldType.GROUP) {
                        codedInputStream.readGroup(findLiteExtensionByNumber.getNumber(), builder, extensionRegistryLite);
                    } else {
                        codedInputStream.readMessage(builder, extensionRegistryLite);
                    }
                    build = builder.build();
                } else if (i3 != 2) {
                    build = FieldSet.readPrimitiveField(codedInputStream, fieldType2);
                } else {
                    int readEnum = codedInputStream.readEnum();
                    Internal.EnumLite findValueByNumber2 = extensionDescriptor3.enumTypeMap.findValueByNumber(readEnum);
                    if (findValueByNumber2 == null) {
                        codedOutputStream.writeRawVarint32(i);
                        codedOutputStream.writeUInt32NoTag(readEnum);
                        return true;
                    }
                    build = findValueByNumber2;
                }
                if (z3) {
                    fieldSet2.addRepeatedField(extensionDescriptor3, findLiteExtensionByNumber.singularToFieldSetType(build));
                    return true;
                }
                fieldSet2.setField(extensionDescriptor3, findLiteExtensionByNumber.singularToFieldSetType(build));
                return true;
            }
            z = false;
            z2 = true;
            if (!z2) {
            }
        }

        public final void verifyExtensionContainingType$1(GeneratedExtension generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public ExtendableMessage() {
            this.extensions = new FieldSet();
        }

        public final <Type> Type getExtension(GeneratedExtension<MessageType, List<Type>> generatedExtension, int i) {
            verifyExtensionContainingType$1(generatedExtension);
            ExtensionDescriptor extensionDescriptor = generatedExtension.descriptor;
            FieldSet fieldSet = this.extensions;
            fieldSet.getClass();
            if (extensionDescriptor.isRepeated) {
                Object field = fieldSet.getField(extensionDescriptor);
                if (field != null) {
                    return (Type) generatedExtension.singularFromFieldSetType(((List) field).get(i));
                }
                JWK$$ExternalSyntheticBUOutline0.m2173m();
                return null;
            }
            a$$ExternalSyntheticBUOutline0.m$3("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
    }
}
