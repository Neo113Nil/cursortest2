package com.squareup.protos.cash.piggybank.appapi;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class FamiliesSavingsScreensResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FamiliesSavingsScreensResponse((ResponseContext) obj, (SyncEntity) obj2, (SyncEntity) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(SyncEntity.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(SyncEntity.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FamiliesSavingsScreensResponse familiesSavingsScreensResponse = (FamiliesSavingsScreensResponse) obj;
        reverseProtoWriter.getClass();
        familiesSavingsScreensResponse.getClass();
        reverseProtoWriter.writeBytes(familiesSavingsScreensResponse.unknownFields());
        ProtoAdapter protoAdapter = SyncEntity.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, familiesSavingsScreensResponse.savings_folders);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, familiesSavingsScreensResponse.savings_screens);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, familiesSavingsScreensResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FamiliesSavingsScreensResponse familiesSavingsScreensResponse = (FamiliesSavingsScreensResponse) obj;
        familiesSavingsScreensResponse.getClass();
        int encodedSizeWithTag = ResponseContext.ADAPTER.encodedSizeWithTag(1, familiesSavingsScreensResponse.response_context) + familiesSavingsScreensResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = SyncEntity.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, familiesSavingsScreensResponse.savings_folders) + protoAdapter.encodedSizeWithTag(2, familiesSavingsScreensResponse.savings_screens) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FamiliesSavingsScreensResponse familiesSavingsScreensResponse = (FamiliesSavingsScreensResponse) obj;
        familiesSavingsScreensResponse.getClass();
        ResponseContext responseContext = familiesSavingsScreensResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        SyncEntity syncEntity = familiesSavingsScreensResponse.savings_screens;
        SyncEntity syncEntity2 = syncEntity != null ? (SyncEntity) SyncEntity.ADAPTER.redact(syncEntity) : null;
        SyncEntity syncEntity3 = familiesSavingsScreensResponse.savings_folders;
        SyncEntity syncEntity4 = syncEntity3 != null ? (SyncEntity) SyncEntity.ADAPTER.redact(syncEntity3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new FamiliesSavingsScreensResponse(responseContext2, syncEntity2, syncEntity4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FamiliesSavingsScreensResponse familiesSavingsScreensResponse = (FamiliesSavingsScreensResponse) obj;
        familiesSavingsScreensResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, familiesSavingsScreensResponse.response_context);
        ProtoAdapter protoAdapter = SyncEntity.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, familiesSavingsScreensResponse.savings_screens);
        protoAdapter.encodeWithTag(protoWriter, 3, familiesSavingsScreensResponse.savings_folders);
        protoWriter.writeBytes(familiesSavingsScreensResponse.unknownFields());
    }
}
