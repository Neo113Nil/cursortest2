package com.squareup.cash.treehouse.errorreporter;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import java.util.Map;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/squareup/cash/treehouse/errorreporter/ErrorReport.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/squareup/cash/treehouse/errorreporter/ErrorReport;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/squareup/cash/treehouse/errorreporter/ErrorReport;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/squareup/cash/treehouse/errorreporter/ErrorReport;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* synthetic */ class ErrorReport$$serializer implements GeneratedSerializer {
    public static final ErrorReport$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ErrorReport$$serializer errorReport$$serializer = new ErrorReport$$serializer();
        INSTANCE = errorReport$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.squareup.cash.treehouse.errorreporter.ErrorReport", errorReport$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("fatal", false);
        pluginGeneratedSerialDescriptor.addElement("message", false);
        pluginGeneratedSerialDescriptor.addElement("owner", true);
        pluginGeneratedSerialDescriptor.addElement("groupingDescriptor", true);
        pluginGeneratedSerialDescriptor.addElement("customAttributes", true);
        pluginGeneratedSerialDescriptor.addElement("throwable", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ErrorReport.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BooleanSerializer.INSTANCE, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[4].getValue()), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[5].getValue())};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ErrorReport deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ErrorReport.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        Map map = null;
        Throwable th = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    z2 = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = beginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str3);
                    i |= 8;
                    break;
                case 4:
                    map = (Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (KSerializer) lazyArr[4].getValue(), map);
                    i |= 16;
                    break;
                case 5:
                    th = (Throwable) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (KSerializer) lazyArr[5].getValue(), th);
                    i |= 32;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new ErrorReport(i, z2, str, str2, str3, map, th);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ErrorReport value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ErrorReport.$childSerializers;
        boolean z = value.fatal;
        Throwable th = value.throwable;
        Map map = value.customAttributes;
        String str = value.groupingDescriptor;
        String str2 = value.owner;
        beginStructure.encodeBooleanElement(serialDescriptor, 0, z);
        beginStructure.encodeStringElement(serialDescriptor, 1, value.message);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || map != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (KSerializer) lazyArr[4].getValue(), map);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || th != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (KSerializer) lazyArr[5].getValue(), th);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
