package com.squareup.protos.cash.activity.api.v1;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/ActivityOffset$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityOffset;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityOffset$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivityOffset(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.BYTES.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivityOffset activityOffset = (ActivityOffset) obj;
        reverseProtoWriter.getClass();
        activityOffset.getClass();
        reverseProtoWriter.writeBytes(activityOffset.unknownFields());
        ProtoAdapter.BYTES.asRepeated().encodeWithTag(reverseProtoWriter, 1, activityOffset.known_cursors);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivityOffset activityOffset = (ActivityOffset) obj;
        activityOffset.getClass();
        return ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(1, activityOffset.known_cursors) + activityOffset.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivityOffset activityOffset = (ActivityOffset) obj;
        activityOffset.getClass();
        ByteString byteString = ByteString.EMPTY;
        List<ByteString> list = activityOffset.known_cursors;
        list.getClass();
        byteString.getClass();
        return new ActivityOffset(list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivityOffset activityOffset = (ActivityOffset) obj;
        activityOffset.getClass();
        ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 1, activityOffset.known_cursors);
        protoWriter.writeBytes(activityOffset.unknownFields());
    }
}
