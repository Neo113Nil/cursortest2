package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/OnBehalfOf$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OnBehalfOf$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OnBehalfOf((String) obj, (TokenType) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = TokenType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OnBehalfOf onBehalfOf = (OnBehalfOf) obj;
        reverseProtoWriter.getClass();
        onBehalfOf.getClass();
        reverseProtoWriter.writeBytes(onBehalfOf.unknownFields());
        TokenType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, onBehalfOf.type);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, onBehalfOf.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OnBehalfOf onBehalfOf = (OnBehalfOf) obj;
        onBehalfOf.getClass();
        return TokenType.ADAPTER.encodedSizeWithTag(2, onBehalfOf.type) + ProtoAdapter.STRING.encodedSizeWithTag(1, onBehalfOf.token) + onBehalfOf.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OnBehalfOf onBehalfOf = (OnBehalfOf) obj;
        onBehalfOf.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = onBehalfOf.token;
        TokenType tokenType = onBehalfOf.type;
        byteString.getClass();
        return new OnBehalfOf(str, tokenType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OnBehalfOf onBehalfOf = (OnBehalfOf) obj;
        onBehalfOf.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, onBehalfOf.token);
        TokenType.ADAPTER.encodeWithTag(protoWriter, 2, onBehalfOf.type);
        protoWriter.writeBytes(onBehalfOf.unknownFields());
    }
}
