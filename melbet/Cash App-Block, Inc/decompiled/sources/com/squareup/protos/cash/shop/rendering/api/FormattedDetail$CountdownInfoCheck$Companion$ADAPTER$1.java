package com.squareup.protos.cash.shop.rendering.api;

import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FormattedDetail$CountdownInfoCheck$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FormattedDetail.CountdownInfoCheck((String) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FormattedDetail.CountdownInfoCheck countdownInfoCheck = (FormattedDetail.CountdownInfoCheck) obj;
        reverseProtoWriter.getClass();
        countdownInfoCheck.getClass();
        reverseProtoWriter.writeBytes(countdownInfoCheck.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, countdownInfoCheck.countdown_to_ms);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, countdownInfoCheck.string_to_replace);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FormattedDetail.CountdownInfoCheck countdownInfoCheck = (FormattedDetail.CountdownInfoCheck) obj;
        countdownInfoCheck.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, countdownInfoCheck.countdown_to_ms) + ProtoAdapter.STRING.encodedSizeWithTag(1, countdownInfoCheck.string_to_replace) + countdownInfoCheck.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FormattedDetail.CountdownInfoCheck countdownInfoCheck = (FormattedDetail.CountdownInfoCheck) obj;
        countdownInfoCheck.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = countdownInfoCheck.string_to_replace;
        Long l = countdownInfoCheck.countdown_to_ms;
        byteString.getClass();
        return new FormattedDetail.CountdownInfoCheck(str, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FormattedDetail.CountdownInfoCheck countdownInfoCheck = (FormattedDetail.CountdownInfoCheck) obj;
        countdownInfoCheck.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, countdownInfoCheck.string_to_replace);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, countdownInfoCheck.countdown_to_ms);
        protoWriter.writeBytes(countdownInfoCheck.unknownFields());
    }
}
