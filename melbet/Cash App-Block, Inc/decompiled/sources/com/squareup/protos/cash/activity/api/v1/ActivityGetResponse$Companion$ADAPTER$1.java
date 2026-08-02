package com.squareup.protos.cash.activity.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/ActivityGetResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityGetResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityGetResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivityGetResponse((ActivityRow) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ActivityRow.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivityGetResponse activityGetResponse = (ActivityGetResponse) obj;
        reverseProtoWriter.getClass();
        activityGetResponse.getClass();
        reverseProtoWriter.writeBytes(activityGetResponse.unknownFields());
        ActivityRow.ADAPTER.encodeWithTag(reverseProtoWriter, 1, activityGetResponse.activityRow);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivityGetResponse activityGetResponse = (ActivityGetResponse) obj;
        activityGetResponse.getClass();
        return ActivityRow.ADAPTER.encodedSizeWithTag(1, activityGetResponse.activityRow) + activityGetResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivityGetResponse activityGetResponse = (ActivityGetResponse) obj;
        activityGetResponse.getClass();
        ActivityRow activityRow = activityGetResponse.activityRow;
        ActivityRow activityRow2 = activityRow != null ? (ActivityRow) ActivityRow.ADAPTER.redact(activityRow) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ActivityGetResponse(activityRow2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivityGetResponse activityGetResponse = (ActivityGetResponse) obj;
        activityGetResponse.getClass();
        ActivityRow.ADAPTER.encodeWithTag(protoWriter, 1, activityGetResponse.activityRow);
        protoWriter.writeBytes(activityGetResponse.unknownFields());
    }
}
