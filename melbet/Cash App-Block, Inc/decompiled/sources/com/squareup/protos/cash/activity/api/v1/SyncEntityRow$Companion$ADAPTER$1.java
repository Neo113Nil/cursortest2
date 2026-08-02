package com.squareup.protos.cash.activity.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/SyncEntityRow$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/SyncEntityRow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SyncEntityRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncEntityRow((String) obj, (String) obj2, (Long) obj3, (Boolean) obj4, (Long) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncEntityRow syncEntityRow = (SyncEntityRow) obj;
        reverseProtoWriter.getClass();
        syncEntityRow.getClass();
        reverseProtoWriter.writeBytes(syncEntityRow.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, syncEntityRow.sync_entity_version);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, syncEntityRow.badged);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, syncEntityRow.display_date);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, syncEntityRow.counterparty_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, syncEntityRow.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncEntityRow syncEntityRow = (SyncEntityRow) obj;
        syncEntityRow.getClass();
        int size$okio = syncEntityRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, syncEntityRow.counterparty_token) + protoAdapter.encodedSizeWithTag(1, syncEntityRow.token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return protoAdapter2.encodedSizeWithTag(5, syncEntityRow.sync_entity_version) + ProtoAdapter.BOOL.encodedSizeWithTag(4, syncEntityRow.badged) + protoAdapter2.encodedSizeWithTag(3, syncEntityRow.display_date) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncEntityRow syncEntityRow = (SyncEntityRow) obj;
        syncEntityRow.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = syncEntityRow.token;
        String str2 = syncEntityRow.counterparty_token;
        Long l = syncEntityRow.display_date;
        Boolean bool = syncEntityRow.badged;
        Long l2 = syncEntityRow.sync_entity_version;
        byteString.getClass();
        return new SyncEntityRow(str, str2, l, bool, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncEntityRow syncEntityRow = (SyncEntityRow) obj;
        syncEntityRow.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, syncEntityRow.token);
        protoAdapter.encodeWithTag(protoWriter, 2, syncEntityRow.counterparty_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 3, syncEntityRow.display_date);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, syncEntityRow.badged);
        protoAdapter2.encodeWithTag(protoWriter, 5, syncEntityRow.sync_entity_version);
        protoWriter.writeBytes(syncEntityRow.unknownFields());
    }
}
