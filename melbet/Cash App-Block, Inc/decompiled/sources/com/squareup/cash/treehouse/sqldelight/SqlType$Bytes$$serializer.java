package com.squareup.cash.treehouse.sqldelight;

import com.squareup.cash.treehouse.sqldelight.SqlType;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/squareup/cash/treehouse/sqldelight/SqlType.Bytes.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/squareup/cash/treehouse/sqldelight/SqlType$Bytes;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize-zw-pglk", "(Lkotlinx/serialization/encoding/Encoder;[B)V", "serialize", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-o3PDz5c", "(Lkotlinx/serialization/encoding/Decoder;)[B", "deserialize", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* synthetic */ class SqlType$Bytes$$serializer implements GeneratedSerializer {
    public static final SqlType$Bytes$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SqlType$Bytes$$serializer sqlType$Bytes$$serializer = new SqlType$Bytes$$serializer();
        INSTANCE = sqlType$Bytes$$serializer;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("Bytes", sqlType$Bytes$$serializer);
        inlineClassDescriptor.addElement("value", false);
        descriptor = inlineClassDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ByteArraySerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return new SqlType.Bytes(m3775deserializeo3PDz5c(decoder));
    }

    /* renamed from: deserialize-o3PDz5c, reason: not valid java name */
    public final byte[] m3775deserializeo3PDz5c(Decoder decoder) {
        decoder.getClass();
        byte[] bArr = (byte[]) decoder.decodeInline(descriptor).decodeSerializableValue$1(ByteArraySerializer.INSTANCE);
        bArr.getClass();
        return bArr;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m3776serializezwpglk(encoder, ((SqlType.Bytes) obj).value);
    }

    /* renamed from: serialize-zw-pglk, reason: not valid java name */
    public final void m3776serializezwpglk(Encoder encoder, byte[] value) {
        encoder.getClass();
        value.getClass();
        Encoder encodeInline = encoder.encodeInline(descriptor);
        if (encodeInline == null) {
            return;
        }
        encodeInline.encodeSerializableValue(ByteArraySerializer.INSTANCE, value);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
