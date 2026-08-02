package com.squareup.protos.cash.activity.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/ActivityCursor$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityCursor;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityCursor$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivityCursor((ByteString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivityCursor activityCursor = (ActivityCursor) obj;
        reverseProtoWriter.getClass();
        activityCursor.getClass();
        reverseProtoWriter.writeBytes(activityCursor.unknownFields());
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, activityCursor.cursor);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivityCursor activityCursor = (ActivityCursor) obj;
        activityCursor.getClass();
        return ProtoAdapter.BYTES.encodedSizeWithTag(1, activityCursor.cursor) + activityCursor.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivityCursor activityCursor = (ActivityCursor) obj;
        activityCursor.getClass();
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = activityCursor.cursor;
        byteString.getClass();
        return new ActivityCursor(byteString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivityCursor activityCursor = (ActivityCursor) obj;
        activityCursor.getClass();
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, activityCursor.cursor);
        protoWriter.writeBytes(activityCursor.unknownFields());
    }
}
