package com.squareup.cash.treehouse.sqldelight;

import com.squareup.cash.treehouse.sqldelight.SqlType;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/squareup/cash/treehouse/sqldelight/SqlType.Boolean.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/squareup/cash/treehouse/sqldelight/SqlType$Boolean;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize-EGRlniw", "(Lkotlinx/serialization/encoding/Encoder;Z)V", "serialize", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize--iwBwMc", "(Lkotlinx/serialization/encoding/Decoder;)Z", "deserialize", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* synthetic */ class SqlType$Boolean$$serializer implements GeneratedSerializer {
    public static final SqlType$Boolean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SqlType$Boolean$$serializer sqlType$Boolean$$serializer = new SqlType$Boolean$$serializer();
        INSTANCE = sqlType$Boolean$$serializer;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("Boolean", sqlType$Boolean$$serializer);
        inlineClassDescriptor.addElement("value", false);
        descriptor = inlineClassDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return new SqlType.Boolean(m3773deserializeiwBwMc(decoder));
    }

    /* renamed from: deserialize--iwBwMc, reason: not valid java name */
    public final boolean m3773deserializeiwBwMc(Decoder decoder) {
        decoder.getClass();
        return decoder.decodeInline(descriptor).decodeBoolean();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m3774serializeEGRlniw(encoder, ((SqlType.Boolean) obj).value);
    }

    /* renamed from: serialize-EGRlniw, reason: not valid java name */
    public final void m3774serializeEGRlniw(Encoder encoder, boolean value) {
        encoder.getClass();
        Encoder encodeInline = encoder.encodeInline(descriptor);
        if (encodeInline == null) {
            return;
        }
        encodeInline.encodeBoolean(value);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
