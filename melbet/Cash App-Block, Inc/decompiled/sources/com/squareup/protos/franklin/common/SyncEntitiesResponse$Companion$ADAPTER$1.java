package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.protos.franklin.common.SyncEntitiesResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SyncEntitiesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncEntitiesResponse(m, (Boolean) obj, (Long) obj2, arrayList, (Boolean) obj3, (SyncEntitiesResponse.RefreshAllEntitiesType) obj4, (Boolean) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 4:
                    m.add(SyncEntity.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    obj = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 7:
                    arrayList.add(ProtoAdapter.BYTES.decode(protoReader));
                    break;
                case 8:
                    obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 9:
                    try {
                        obj4 = SyncEntitiesResponse.RefreshAllEntitiesType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 10:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncEntitiesResponse syncEntitiesResponse = (SyncEntitiesResponse) obj;
        reverseProtoWriter.getClass();
        syncEntitiesResponse.getClass();
        reverseProtoWriter.writeBytes(syncEntitiesResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, syncEntitiesResponse.sync_finished);
        SyncEntitiesResponse.RefreshAllEntitiesType.ADAPTER.encodeWithTag(reverseProtoWriter, 9, syncEntitiesResponse.refresh_all_entities_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, syncEntitiesResponse.ignore_all_known_ranges);
        ProtoAdapter.BYTES.asRepeated().encodeWithTag(reverseProtoWriter, 7, syncEntitiesResponse.all_known_ranges);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 6, syncEntitiesResponse.delay_next_call_ms);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, syncEntitiesResponse.refresh_all_entities);
        SyncEntity.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, syncEntitiesResponse.entities);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncEntitiesResponse syncEntitiesResponse = (SyncEntitiesResponse) obj;
        syncEntitiesResponse.getClass();
        int encodedSizeWithTag = SyncEntity.ADAPTER.asRepeated().encodedSizeWithTag(4, syncEntitiesResponse.entities) + syncEntitiesResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(10, syncEntitiesResponse.sync_finished) + SyncEntitiesResponse.RefreshAllEntitiesType.ADAPTER.encodedSizeWithTag(9, syncEntitiesResponse.refresh_all_entities_type) + protoAdapter.encodedSizeWithTag(8, syncEntitiesResponse.ignore_all_known_ranges) + ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(7, syncEntitiesResponse.all_known_ranges) + ProtoAdapter.INT64.encodedSizeWithTag(6, syncEntitiesResponse.delay_next_call_ms) + protoAdapter.encodedSizeWithTag(5, syncEntitiesResponse.refresh_all_entities) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncEntitiesResponse syncEntitiesResponse = (SyncEntitiesResponse) obj;
        syncEntitiesResponse.getClass();
        return SyncEntitiesResponse.copy$default(syncEntitiesResponse, TransactorKt.m1169redactElements(syncEntitiesResponse.entities, SyncEntity.ADAPTER), ByteString.EMPTY, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncEntitiesResponse syncEntitiesResponse = (SyncEntitiesResponse) obj;
        syncEntitiesResponse.getClass();
        SyncEntity.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, syncEntitiesResponse.entities);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 5, syncEntitiesResponse.refresh_all_entities);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, syncEntitiesResponse.delay_next_call_ms);
        ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 7, syncEntitiesResponse.all_known_ranges);
        protoAdapter.encodeWithTag(protoWriter, 8, syncEntitiesResponse.ignore_all_known_ranges);
        SyncEntitiesResponse.RefreshAllEntitiesType.ADAPTER.encodeWithTag(protoWriter, 9, syncEntitiesResponse.refresh_all_entities_type);
        protoAdapter.encodeWithTag(protoWriter, 10, syncEntitiesResponse.sync_finished);
        protoWriter.writeBytes(syncEntitiesResponse.unknownFields());
    }
}
