package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/GetMessagesResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetMessagesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetMessagesResponse(m, (String) obj, (ChatSessionStatus) obj2, (String) obj3, arrayList, (TokenUsageInfo) obj4, arrayList2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    m.add(Message.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    try {
                        obj2 = ChatSessionStatus.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    arrayList.add(Activity.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    obj4 = TransactorKt.decodeMessageOrMerge(TokenUsageInfo.ADAPTER, protoReader, obj4);
                    break;
                case 7:
                    arrayList2.add(Feedback.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetMessagesResponse getMessagesResponse = (GetMessagesResponse) obj;
        reverseProtoWriter.getClass();
        getMessagesResponse.getClass();
        reverseProtoWriter.writeBytes(getMessagesResponse.unknownFields());
        Feedback.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, getMessagesResponse.feedback);
        TokenUsageInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 6, getMessagesResponse.token_usage_info);
        Activity.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, getMessagesResponse.session_activities);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, getMessagesResponse.session_name);
        ChatSessionStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getMessagesResponse.status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getMessagesResponse.next_cursor);
        Message.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getMessagesResponse.messages);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetMessagesResponse getMessagesResponse = (GetMessagesResponse) obj;
        getMessagesResponse.getClass();
        int encodedSizeWithTag = Message.ADAPTER.asRepeated().encodedSizeWithTag(1, getMessagesResponse.messages) + getMessagesResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Feedback.ADAPTER.asRepeated().encodedSizeWithTag(7, getMessagesResponse.feedback) + TokenUsageInfo.ADAPTER.encodedSizeWithTag(6, getMessagesResponse.token_usage_info) + Activity.ADAPTER.asRepeated().encodedSizeWithTag(5, getMessagesResponse.session_activities) + protoAdapter.encodedSizeWithTag(4, getMessagesResponse.session_name) + ChatSessionStatus.ADAPTER.encodedSizeWithTag(3, getMessagesResponse.status) + protoAdapter.encodedSizeWithTag(2, getMessagesResponse.next_cursor) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetMessagesResponse getMessagesResponse = (GetMessagesResponse) obj;
        getMessagesResponse.getClass();
        EmptyList emptyList = EmptyList.INSTANCE;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getMessagesResponse.session_activities, Activity.ADAPTER);
        TokenUsageInfo tokenUsageInfo = getMessagesResponse.token_usage_info;
        TokenUsageInfo tokenUsageInfo2 = tokenUsageInfo != null ? (TokenUsageInfo) TokenUsageInfo.ADAPTER.redact(tokenUsageInfo) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(getMessagesResponse.feedback, Feedback.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = getMessagesResponse.next_cursor;
        ChatSessionStatus chatSessionStatus = getMessagesResponse.status;
        String str2 = getMessagesResponse.session_name;
        emptyList.getClass();
        byteString.getClass();
        return new GetMessagesResponse(emptyList, str, chatSessionStatus, str2, m1169redactElements, tokenUsageInfo2, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetMessagesResponse getMessagesResponse = (GetMessagesResponse) obj;
        getMessagesResponse.getClass();
        Message.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getMessagesResponse.messages);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, getMessagesResponse.next_cursor);
        ChatSessionStatus.ADAPTER.encodeWithTag(protoWriter, 3, getMessagesResponse.status);
        protoAdapter.encodeWithTag(protoWriter, 4, getMessagesResponse.session_name);
        Activity.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, getMessagesResponse.session_activities);
        TokenUsageInfo.ADAPTER.encodeWithTag(protoWriter, 6, getMessagesResponse.token_usage_info);
        Feedback.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, getMessagesResponse.feedback);
        protoWriter.writeBytes(getMessagesResponse.unknownFields());
    }
}
