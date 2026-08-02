package com.stripe.android.uicore.address;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/uicore/address/FieldSchema.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/uicore/address/FieldSchema;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/uicore/address/FieldSchema;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/uicore/address/FieldSchema;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "stripe-ui-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class FieldSchema$$serializer implements GeneratedSerializer {
    public static final int $stable;
    public static final FieldSchema$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FieldSchema$$serializer fieldSchema$$serializer = new FieldSchema$$serializer();
        INSTANCE = fieldSchema$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.uicore.address.FieldSchema", fieldSchema$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("isNumeric", true);
        pluginGeneratedSerialDescriptor.addElement("examples", true);
        pluginGeneratedSerialDescriptor.addElement("nameType", false);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = FieldSchema.$childSerializers;
        return new KSerializer[]{BooleanSerializer.INSTANCE, lazyArr[1].getValue(), lazyArr[2].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final FieldSchema deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = FieldSchema.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        ArrayList arrayList = null;
        NameType nameType = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                z2 = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                arrayList = (ArrayList) beginStructure.decodeSerializableElement(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), arrayList);
                i |= 2;
            } else {
                if (decodeElementIndex != 2) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                nameType = (NameType) beginStructure.decodeSerializableElement(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), nameType);
                i |= 4;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new FieldSchema(i, z2, arrayList, nameType);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FieldSchema value) {
        encoder.getClass();
        value.getClass();
        ArrayList arrayList = value.examples;
        boolean z = value.isNumeric;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = FieldSchema.$childSerializers;
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || z) {
            beginStructure.encodeBooleanElement(serialDescriptor, 0, z);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || !Intrinsics.areEqual(arrayList, new ArrayList())) {
            beginStructure.encodeSerializableElement(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), arrayList);
        }
        beginStructure.encodeSerializableElement(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), value.nameType);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
