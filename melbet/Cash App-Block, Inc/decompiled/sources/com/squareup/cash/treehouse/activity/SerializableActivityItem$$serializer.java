package com.squareup.cash.treehouse.activity;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;
import okio.ByteString;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/squareup/cash/treehouse/activity/SerializableActivityItem.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/squareup/cash/treehouse/activity/SerializableActivityItem;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/squareup/cash/treehouse/activity/SerializableActivityItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/squareup/cash/treehouse/activity/SerializableActivityItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* synthetic */ class SerializableActivityItem$$serializer implements GeneratedSerializer {
    public static final SerializableActivityItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SerializableActivityItem$$serializer serializableActivityItem$$serializer = new SerializableActivityItem$$serializer();
        INSTANCE = serializableActivityItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.squareup.cash.treehouse.activity.SerializableActivityItem", serializableActivityItem$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("rowId", false);
        pluginGeneratedSerialDescriptor.addElement("itemId", false);
        pluginGeneratedSerialDescriptor.addElement("uiPaymentProto", false);
        pluginGeneratedSerialDescriptor.addElement("uiSenderProto", false);
        pluginGeneratedSerialDescriptor.addElement("uiRecipientProto", false);
        pluginGeneratedSerialDescriptor.addElement("itemTypeProto", false);
        pluginGeneratedSerialDescriptor.addElement("activityRowSectionProto", false);
        pluginGeneratedSerialDescriptor.addElement("isBadged", false);
        pluginGeneratedSerialDescriptor.addElement("isOffline", false);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("referenceItemId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = SerializableActivityItem.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, lazyArr[2].getValue(), lazyArr[3].getValue(), lazyArr[4].getValue(), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[5].getValue()), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[6].getValue()), booleanSerializer, booleanSerializer, LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable((KSerializer) lazyArr[10].getValue())};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerializableActivityItem deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SerializableActivityItem.$childSerializers;
        SerializableActivityItem serializableActivityItem = null;
        ByteString byteString = null;
        String str = null;
        String str2 = null;
        ByteString byteString2 = null;
        ByteString byteString3 = null;
        ByteString byteString4 = null;
        ByteString byteString5 = null;
        long j = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = true;
        ByteString byteString6 = null;
        while (z3) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    z3 = false;
                    continue;
                case 0:
                    str = beginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = beginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    byteString2 = (ByteString) beginStructure.decodeSerializableElement(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), byteString2);
                    i |= 4;
                    break;
                case 3:
                    byteString3 = (ByteString) beginStructure.decodeSerializableElement(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), byteString3);
                    i |= 8;
                    break;
                case 4:
                    byteString4 = (ByteString) beginStructure.decodeSerializableElement(serialDescriptor, 4, (KSerializer) lazyArr[4].getValue(), byteString4);
                    i |= 16;
                    break;
                case 5:
                    byteString5 = (ByteString) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (KSerializer) lazyArr[5].getValue(), byteString5);
                    i |= 32;
                    break;
                case 6:
                    byteString6 = (ByteString) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (KSerializer) lazyArr[6].getValue(), byteString6);
                    i |= 64;
                    break;
                case 7:
                    z = beginStructure.decodeBooleanElement(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    z2 = beginStructure.decodeBooleanElement(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    j = beginStructure.decodeLongElement(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    byteString = (ByteString) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, (KSerializer) lazyArr[10].getValue(), byteString);
                    i |= 1024;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return serializableActivityItem;
            }
            serializableActivityItem = null;
        }
        beginStructure.endStructure(serialDescriptor);
        return new SerializableActivityItem(i, str, str2, byteString2, byteString3, byteString4, byteString5, byteString6, z, z2, j, byteString);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SerializableActivityItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SerializableActivityItem.$childSerializers;
        String str = value.rowId;
        ByteString byteString = value.referenceItemId;
        beginStructure.encodeStringElement(serialDescriptor, 0, str);
        beginStructure.encodeStringElement(serialDescriptor, 1, value.itemId);
        beginStructure.encodeSerializableElement(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), value.uiPaymentProto);
        beginStructure.encodeSerializableElement(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), value.uiSenderProto);
        beginStructure.encodeSerializableElement(serialDescriptor, 4, (KSerializer) lazyArr[4].getValue(), value.uiRecipientProto);
        beginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (KSerializer) lazyArr[5].getValue(), value.itemTypeProto);
        beginStructure.encodeNullableSerializableElement(serialDescriptor, 6, (KSerializer) lazyArr[6].getValue(), value.activityRowSectionProto);
        beginStructure.encodeBooleanElement(serialDescriptor, 7, value.isBadged);
        beginStructure.encodeBooleanElement(serialDescriptor, 8, value.isOffline);
        beginStructure.encodeLongElement(serialDescriptor, 9, value.version);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || byteString != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 10, (KSerializer) lazyArr[10].getValue(), byteString);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
