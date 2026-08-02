package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/SlackContext$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlackContext;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SlackContext$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SlackContext((Boolean) obj3, (String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SlackContext slackContext = (SlackContext) obj;
        reverseProtoWriter.getClass();
        slackContext.getClass();
        reverseProtoWriter.writeBytes(slackContext.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, slackContext.is_private);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, slackContext.thread_timestamp);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, slackContext.channel_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SlackContext slackContext = (SlackContext) obj;
        slackContext.getClass();
        int size$okio = slackContext.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, slackContext.is_private) + protoAdapter.encodedSizeWithTag(2, slackContext.thread_timestamp) + protoAdapter.encodedSizeWithTag(1, slackContext.channel_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SlackContext slackContext = (SlackContext) obj;
        slackContext.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = slackContext.channel_id;
        String str2 = slackContext.thread_timestamp;
        Boolean bool = slackContext.is_private;
        byteString.getClass();
        return new SlackContext(bool, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SlackContext slackContext = (SlackContext) obj;
        slackContext.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, slackContext.channel_id);
        protoAdapter.encodeWithTag(protoWriter, 2, slackContext.thread_timestamp);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, slackContext.is_private);
        protoWriter.writeBytes(slackContext.unknownFields());
    }
}
