package com.squareup.protos.cash.activity.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/ActivityPageResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityPageResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityPageResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivityPageResponse(m, (ActivityOffset) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ActivityRow.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(ActivityOffset.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivityPageResponse activityPageResponse = (ActivityPageResponse) obj;
        reverseProtoWriter.getClass();
        activityPageResponse.getClass();
        reverseProtoWriter.writeBytes(activityPageResponse.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, activityPageResponse.has_more);
        ActivityOffset.ADAPTER.encodeWithTag(reverseProtoWriter, 2, activityPageResponse.activity_offset);
        ActivityRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, activityPageResponse.activity_rows);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivityPageResponse activityPageResponse = (ActivityPageResponse) obj;
        activityPageResponse.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, activityPageResponse.has_more) + ActivityOffset.ADAPTER.encodedSizeWithTag(2, activityPageResponse.activity_offset) + ActivityRow.ADAPTER.asRepeated().encodedSizeWithTag(1, activityPageResponse.activity_rows) + activityPageResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivityPageResponse activityPageResponse = (ActivityPageResponse) obj;
        activityPageResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(activityPageResponse.activity_rows, ActivityRow.ADAPTER);
        ActivityOffset activityOffset = activityPageResponse.activity_offset;
        ActivityOffset activityOffset2 = activityOffset != null ? (ActivityOffset) ActivityOffset.ADAPTER.redact(activityOffset) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = activityPageResponse.has_more;
        byteString.getClass();
        return new ActivityPageResponse(m1169redactElements, activityOffset2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivityPageResponse activityPageResponse = (ActivityPageResponse) obj;
        activityPageResponse.getClass();
        ActivityRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, activityPageResponse.activity_rows);
        ActivityOffset.ADAPTER.encodeWithTag(protoWriter, 2, activityPageResponse.activity_offset);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, activityPageResponse.has_more);
        protoWriter.writeBytes(activityPageResponse.unknownFields());
    }
}
