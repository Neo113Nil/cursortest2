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

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/ActivityItemCorrelations$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemCorrelations;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityItemCorrelations$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivityItemCorrelations((String) obj, (String) obj2, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivityItemCorrelations activityItemCorrelations = (ActivityItemCorrelations) obj;
        reverseProtoWriter.getClass();
        activityItemCorrelations.getClass();
        reverseProtoWriter.writeBytes(activityItemCorrelations.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 4, activityItemCorrelations.external_system_ids);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, activityItemCorrelations.transaction_tokens);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, activityItemCorrelations.external_system_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, activityItemCorrelations.transaction_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivityItemCorrelations activityItemCorrelations = (ActivityItemCorrelations) obj;
        activityItemCorrelations.getClass();
        int size$okio = activityItemCorrelations.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.asRepeated().encodedSizeWithTag(4, activityItemCorrelations.external_system_ids) + protoAdapter.asRepeated().encodedSizeWithTag(3, activityItemCorrelations.transaction_tokens) + protoAdapter.encodedSizeWithTag(2, activityItemCorrelations.external_system_id) + protoAdapter.encodedSizeWithTag(1, activityItemCorrelations.transaction_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivityItemCorrelations activityItemCorrelations = (ActivityItemCorrelations) obj;
        activityItemCorrelations.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = activityItemCorrelations.transaction_token;
        String str2 = activityItemCorrelations.external_system_id;
        List<String> list = activityItemCorrelations.transaction_tokens;
        List<String> list2 = activityItemCorrelations.external_system_ids;
        list.getClass();
        list2.getClass();
        byteString.getClass();
        return new ActivityItemCorrelations(str, str2, list, list2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivityItemCorrelations activityItemCorrelations = (ActivityItemCorrelations) obj;
        activityItemCorrelations.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, activityItemCorrelations.transaction_token);
        protoAdapter.encodeWithTag(protoWriter, 2, activityItemCorrelations.external_system_id);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, activityItemCorrelations.transaction_tokens);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, activityItemCorrelations.external_system_ids);
        protoWriter.writeBytes(activityItemCorrelations.unknownFields());
    }
}
