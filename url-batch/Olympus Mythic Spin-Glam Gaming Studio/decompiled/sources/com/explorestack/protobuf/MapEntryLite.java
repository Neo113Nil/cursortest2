package com.explorestack.protobuf;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.WireFormat;
import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class MapEntryLite {

    static class Metadata {
        public final Object defaultKey;
        public final Object defaultValue;
        public final WireFormat.FieldType keyType;
        public final WireFormat.FieldType valueType;

        public Metadata(WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
            this.keyType = fieldType;
            this.defaultKey = obj;
            this.valueType = fieldType2;
            this.defaultValue = obj2;
        }
    }

    static void writeTo(CodedOutputStream codedOutputStream, Metadata metadata, Object obj, Object obj2) {
        FieldSet.writeElement(codedOutputStream, metadata.keyType, 1, obj);
        FieldSet.writeElement(codedOutputStream, metadata.valueType, 2, obj2);
    }

    static int computeSerializedSize(Metadata metadata, Object obj, Object obj2) {
        return FieldSet.computeElementSize(metadata.keyType, 1, obj) + FieldSet.computeElementSize(metadata.valueType, 2, obj2);
    }

    /* renamed from: com.explorestack.protobuf.MapEntryLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static Object parseField(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, WireFormat.FieldType fieldType, Object obj) {
        int i = AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()];
        if (i == 1) {
            MessageLite.Builder builder = ((MessageLite) obj).toBuilder();
            codedInputStream.readMessage(builder, extensionRegistryLite);
            return builder.buildPartial();
        }
        if (i == 2) {
            return Integer.valueOf(codedInputStream.readEnum());
        }
        if (i == 3) {
            throw new RuntimeException("Groups are not allowed in maps.");
        }
        return FieldSet.readPrimitiveField(codedInputStream, fieldType, true);
    }

    static Map.Entry parseEntry(CodedInputStream codedInputStream, Metadata metadata, ExtensionRegistryLite extensionRegistryLite) {
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == WireFormat.makeTag(1, metadata.keyType.getWireType())) {
                obj = parseField(codedInputStream, extensionRegistryLite, metadata.keyType, obj);
            } else if (readTag == WireFormat.makeTag(2, metadata.valueType.getWireType())) {
                obj2 = parseField(codedInputStream, extensionRegistryLite, metadata.valueType, obj2);
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }
}
