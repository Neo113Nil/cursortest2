package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/Feedback$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/Feedback;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Feedback$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Feedback((FeedbackType) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = FeedbackType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Feedback feedback = (Feedback) obj;
        reverseProtoWriter.getClass();
        feedback.getClass();
        reverseProtoWriter.writeBytes(feedback.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, feedback.message_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, feedback.comment);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, feedback.issue_type);
        FeedbackType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, feedback.feedback_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Feedback feedback = (Feedback) obj;
        feedback.getClass();
        int encodedSizeWithTag = FeedbackType.ADAPTER.encodedSizeWithTag(1, feedback.feedback_type) + feedback.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, feedback.message_id) + protoAdapter.encodedSizeWithTag(3, feedback.comment) + protoAdapter.encodedSizeWithTag(2, feedback.issue_type) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Feedback feedback = (Feedback) obj;
        feedback.getClass();
        ByteString byteString = ByteString.EMPTY;
        FeedbackType feedbackType = feedback.feedback_type;
        String str = feedback.issue_type;
        String str2 = feedback.comment;
        String str3 = feedback.message_id;
        byteString.getClass();
        return new Feedback(feedbackType, str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Feedback feedback = (Feedback) obj;
        feedback.getClass();
        FeedbackType.ADAPTER.encodeWithTag(protoWriter, 1, feedback.feedback_type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, feedback.issue_type);
        protoAdapter.encodeWithTag(protoWriter, 3, feedback.comment);
        protoAdapter.encodeWithTag(protoWriter, 4, feedback.message_id);
        protoWriter.writeBytes(feedback.unknownFields());
    }
}
