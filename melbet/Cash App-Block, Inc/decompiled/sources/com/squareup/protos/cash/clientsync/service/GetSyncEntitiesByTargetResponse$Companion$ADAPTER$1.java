package com.squareup.protos.cash.clientsync.service;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSyncEntitiesByTargetResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSyncEntitiesByTargetResponse((Boolean) obj, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(TargetEntities.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                arrayList.add(ProtoAdapter.BYTES.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSyncEntitiesByTargetResponse getSyncEntitiesByTargetResponse = (GetSyncEntitiesByTargetResponse) obj;
        reverseProtoWriter.getClass();
        getSyncEntitiesByTargetResponse.getClass();
        reverseProtoWriter.writeBytes(getSyncEntitiesByTargetResponse.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, getSyncEntitiesByTargetResponse.has_more);
        ProtoAdapter.BYTES.asRepeated().encodeWithTag(reverseProtoWriter, 2, getSyncEntitiesByTargetResponse.offsets);
        TargetEntities.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getSyncEntitiesByTargetResponse.target_entities);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSyncEntitiesByTargetResponse getSyncEntitiesByTargetResponse = (GetSyncEntitiesByTargetResponse) obj;
        getSyncEntitiesByTargetResponse.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, getSyncEntitiesByTargetResponse.has_more) + ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(2, getSyncEntitiesByTargetResponse.offsets) + TargetEntities.ADAPTER.asRepeated().encodedSizeWithTag(1, getSyncEntitiesByTargetResponse.target_entities) + getSyncEntitiesByTargetResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSyncEntitiesByTargetResponse getSyncEntitiesByTargetResponse = (GetSyncEntitiesByTargetResponse) obj;
        getSyncEntitiesByTargetResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getSyncEntitiesByTargetResponse.target_entities, TargetEntities.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        List list = getSyncEntitiesByTargetResponse.offsets;
        Boolean bool = getSyncEntitiesByTargetResponse.has_more;
        list.getClass();
        byteString.getClass();
        return new GetSyncEntitiesByTargetResponse(bool, m1169redactElements, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSyncEntitiesByTargetResponse getSyncEntitiesByTargetResponse = (GetSyncEntitiesByTargetResponse) obj;
        getSyncEntitiesByTargetResponse.getClass();
        TargetEntities.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getSyncEntitiesByTargetResponse.target_entities);
        ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 2, getSyncEntitiesByTargetResponse.offsets);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getSyncEntitiesByTargetResponse.has_more);
        protoWriter.writeBytes(getSyncEntitiesByTargetResponse.unknownFields());
    }
}
