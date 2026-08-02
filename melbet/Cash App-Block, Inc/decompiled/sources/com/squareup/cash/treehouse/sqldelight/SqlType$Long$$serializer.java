package com.squareup.cash.treehouse.sqldelight;

import com.squareup.cash.treehouse.sqldelight.SqlType;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/squareup/cash/treehouse/sqldelight/SqlType.Long.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/squareup/cash/treehouse/sqldelight/SqlType$Long;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize-PqdrWw8", "(Lkotlinx/serialization/encoding/Encoder;J)V", "serialize", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-T57sywU", "(Lkotlinx/serialization/encoding/Decoder;)J", "deserialize", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* synthetic */ class SqlType$Long$$serializer implements GeneratedSerializer {
    public static final SqlType$Long$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SqlType$Long$$serializer sqlType$Long$$serializer = new SqlType$Long$$serializer();
        INSTANCE = sqlType$Long$$serializer;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("Long", sqlType$Long$$serializer);
        inlineClassDescriptor.addElement("value", false);
        descriptor = inlineClassDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{LongSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return new SqlType.Long(m3779deserializeT57sywU(decoder));
    }

    /* renamed from: deserialize-T57sywU, reason: not valid java name */
    public final long m3779deserializeT57sywU(Decoder decoder) {
        decoder.getClass();
        return decoder.decodeInline(descriptor).decodeLong();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m3780serializePqdrWw8(encoder, ((SqlType.Long) obj).value);
    }

    /* renamed from: serialize-PqdrWw8, reason: not valid java name */
    public final void m3780serializePqdrWw8(Encoder encoder, long value) {
        encoder.getClass();
        Encoder encodeInline = encoder.encodeInline(descriptor);
        if (encodeInline == null) {
            return;
        }
        encodeInline.encodeLong(value);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
