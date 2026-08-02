package com.squareup.protos.cash.activity.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/SearchFilterDate$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterDate;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchFilterDate$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SearchFilterDate((Long) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SearchFilterDate searchFilterDate = (SearchFilterDate) obj;
        reverseProtoWriter.getClass();
        searchFilterDate.getClass();
        reverseProtoWriter.writeBytes(searchFilterDate.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, searchFilterDate.date_lte_in_epoch_millis);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, searchFilterDate.date_gte_in_epoch_millis);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SearchFilterDate searchFilterDate = (SearchFilterDate) obj;
        searchFilterDate.getClass();
        int size$okio = searchFilterDate.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(2, searchFilterDate.date_lte_in_epoch_millis) + protoAdapter.encodedSizeWithTag(1, searchFilterDate.date_gte_in_epoch_millis) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SearchFilterDate searchFilterDate = (SearchFilterDate) obj;
        searchFilterDate.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = searchFilterDate.date_gte_in_epoch_millis;
        Long l2 = searchFilterDate.date_lte_in_epoch_millis;
        byteString.getClass();
        return new SearchFilterDate(l, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SearchFilterDate searchFilterDate = (SearchFilterDate) obj;
        searchFilterDate.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, searchFilterDate.date_gte_in_epoch_millis);
        protoAdapter.encodeWithTag(protoWriter, 2, searchFilterDate.date_lte_in_epoch_millis);
        protoWriter.writeBytes(searchFilterDate.unknownFields());
    }
}
