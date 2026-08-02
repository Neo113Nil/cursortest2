package kotlinx.serialization.json.internal;

import androidx.recyclerview.widget.AdapterHelper;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.text.UStringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;

/* loaded from: classes9.dex */
public final class JsonDecoderForUnsignedTypes extends AbstractDecoder {
    public final AdapterHelper lexer;
    public final SerializersModule serializersModule;

    public JsonDecoderForUnsignedTypes(AdapterHelper adapterHelper, Json json) {
        json.getClass();
        this.lexer = adapterHelper;
        this.serializersModule = json.serializersModule;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final byte decodeByte() {
        AdapterHelper adapterHelper = this.lexer;
        String consumeStringLenient = adapterHelper.consumeStringLenient();
        try {
            return UStringsKt.toUByte(consumeStringLenient);
        } catch (IllegalArgumentException unused) {
            AdapterHelper.fail$default(adapterHelper, JsonLogicResult$Success$$ExternalSyntheticOutline0.m('\'', "Failed to parse type 'UByte' for input '", consumeStringLenient), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeElementIndex(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final int decodeInt() {
        AdapterHelper adapterHelper = this.lexer;
        String consumeStringLenient = adapterHelper.consumeStringLenient();
        try {
            return UStringsKt.toUInt(consumeStringLenient);
        } catch (IllegalArgumentException unused) {
            AdapterHelper.fail$default(adapterHelper, JsonLogicResult$Success$$ExternalSyntheticOutline0.m('\'', "Failed to parse type 'UInt' for input '", consumeStringLenient), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final long decodeLong() {
        AdapterHelper adapterHelper = this.lexer;
        String consumeStringLenient = adapterHelper.consumeStringLenient();
        try {
            return UStringsKt.toULong(consumeStringLenient);
        } catch (IllegalArgumentException unused) {
            AdapterHelper.fail$default(adapterHelper, JsonLogicResult$Success$$ExternalSyntheticOutline0.m('\'', "Failed to parse type 'ULong' for input '", consumeStringLenient), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final short decodeShort() {
        AdapterHelper adapterHelper = this.lexer;
        String consumeStringLenient = adapterHelper.consumeStringLenient();
        try {
            return UStringsKt.toUShort(consumeStringLenient);
        } catch (IllegalArgumentException unused) {
            AdapterHelper.fail$default(adapterHelper, JsonLogicResult$Success$$ExternalSyntheticOutline0.m('\'', "Failed to parse type 'UShort' for input '", consumeStringLenient), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public final SerializersModule getSerializersModule() {
        return this.serializersModule;
    }
}
