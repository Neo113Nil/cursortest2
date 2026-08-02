package com.squareup.protos.cash.activity.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/ActivityReceiptClientRouteParameters$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityReceiptClientRouteParameters;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityReceiptClientRouteParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivityReceiptClientRouteParameters((String) obj, (ActivityGetRequest) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ActivityGetRequest.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivityReceiptClientRouteParameters activityReceiptClientRouteParameters = (ActivityReceiptClientRouteParameters) obj;
        reverseProtoWriter.getClass();
        activityReceiptClientRouteParameters.getClass();
        reverseProtoWriter.writeBytes(activityReceiptClientRouteParameters.unknownFields());
        ActivityGetRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 2, activityReceiptClientRouteParameters.activity_get_request);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, activityReceiptClientRouteParameters.exit_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivityReceiptClientRouteParameters activityReceiptClientRouteParameters = (ActivityReceiptClientRouteParameters) obj;
        activityReceiptClientRouteParameters.getClass();
        return ActivityGetRequest.ADAPTER.encodedSizeWithTag(2, activityReceiptClientRouteParameters.activity_get_request) + ProtoAdapter.STRING.encodedSizeWithTag(1, activityReceiptClientRouteParameters.exit_url) + activityReceiptClientRouteParameters.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivityReceiptClientRouteParameters activityReceiptClientRouteParameters = (ActivityReceiptClientRouteParameters) obj;
        activityReceiptClientRouteParameters.getClass();
        ActivityGetRequest activityGetRequest = activityReceiptClientRouteParameters.activity_get_request;
        ActivityGetRequest activityGetRequest2 = activityGetRequest != null ? (ActivityGetRequest) ActivityGetRequest.ADAPTER.redact(activityGetRequest) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = activityReceiptClientRouteParameters.exit_url;
        byteString.getClass();
        return new ActivityReceiptClientRouteParameters(str, activityGetRequest2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivityReceiptClientRouteParameters activityReceiptClientRouteParameters = (ActivityReceiptClientRouteParameters) obj;
        activityReceiptClientRouteParameters.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, activityReceiptClientRouteParameters.exit_url);
        ActivityGetRequest.ADAPTER.encodeWithTag(protoWriter, 2, activityReceiptClientRouteParameters.activity_get_request);
        protoWriter.writeBytes(activityReceiptClientRouteParameters.unknownFields());
    }
}
