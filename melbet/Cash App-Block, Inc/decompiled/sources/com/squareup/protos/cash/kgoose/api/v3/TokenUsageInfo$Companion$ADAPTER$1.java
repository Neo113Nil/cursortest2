package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/TokenUsageInfo$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/TokenUsageInfo;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TokenUsageInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TokenUsageInfo((String) obj, (Integer) obj2, (Integer) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TokenUsageInfo tokenUsageInfo = (TokenUsageInfo) obj;
        reverseProtoWriter.getClass();
        tokenUsageInfo.getClass();
        reverseProtoWriter.writeBytes(tokenUsageInfo.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, tokenUsageInfo.token_usage);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, tokenUsageInfo.token_limit);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, tokenUsageInfo.model_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TokenUsageInfo tokenUsageInfo = (TokenUsageInfo) obj;
        tokenUsageInfo.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, tokenUsageInfo.model_name) + tokenUsageInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(3, tokenUsageInfo.token_usage) + protoAdapter.encodedSizeWithTag(2, tokenUsageInfo.token_limit) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TokenUsageInfo tokenUsageInfo = (TokenUsageInfo) obj;
        tokenUsageInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = tokenUsageInfo.model_name;
        Integer num = tokenUsageInfo.token_limit;
        Integer num2 = tokenUsageInfo.token_usage;
        byteString.getClass();
        return new TokenUsageInfo(str, num, num2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TokenUsageInfo tokenUsageInfo = (TokenUsageInfo) obj;
        tokenUsageInfo.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, tokenUsageInfo.model_name);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 2, tokenUsageInfo.token_limit);
        protoAdapter.encodeWithTag(protoWriter, 3, tokenUsageInfo.token_usage);
        protoWriter.writeBytes(tokenUsageInfo.unknownFields());
    }
}
