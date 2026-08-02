package com.squareup.protos.franklin.lending;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncPrepurchaseCashCardResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncPrepurchaseCashCardResponse((ResponseContext) obj, (PrepurchaseCashCardAppletData) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(PrepurchaseCashCardAppletData.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(PrepurchaseCashCardAppletData.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncPrepurchaseCashCardResponse syncPrepurchaseCashCardResponse = (SyncPrepurchaseCashCardResponse) obj;
        reverseProtoWriter.getClass();
        syncPrepurchaseCashCardResponse.getClass();
        reverseProtoWriter.writeBytes(syncPrepurchaseCashCardResponse.unknownFields());
        ProtoAdapter protoAdapter = PrepurchaseCashCardAppletData.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, syncPrepurchaseCashCardResponse.alternative_locale_applet_data_list);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, syncPrepurchaseCashCardResponse.applet_data);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncPrepurchaseCashCardResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncPrepurchaseCashCardResponse syncPrepurchaseCashCardResponse = (SyncPrepurchaseCashCardResponse) obj;
        syncPrepurchaseCashCardResponse.getClass();
        int encodedSizeWithTag = ResponseContext.ADAPTER.encodedSizeWithTag(1, syncPrepurchaseCashCardResponse.response_context) + syncPrepurchaseCashCardResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = PrepurchaseCashCardAppletData.ADAPTER;
        return protoAdapter.asRepeated().encodedSizeWithTag(3, syncPrepurchaseCashCardResponse.alternative_locale_applet_data_list) + protoAdapter.encodedSizeWithTag(2, syncPrepurchaseCashCardResponse.applet_data) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncPrepurchaseCashCardResponse syncPrepurchaseCashCardResponse = (SyncPrepurchaseCashCardResponse) obj;
        syncPrepurchaseCashCardResponse.getClass();
        ResponseContext responseContext = syncPrepurchaseCashCardResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        PrepurchaseCashCardAppletData prepurchaseCashCardAppletData = syncPrepurchaseCashCardResponse.applet_data;
        PrepurchaseCashCardAppletData prepurchaseCashCardAppletData2 = prepurchaseCashCardAppletData != null ? (PrepurchaseCashCardAppletData) PrepurchaseCashCardAppletData.ADAPTER.redact(prepurchaseCashCardAppletData) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(syncPrepurchaseCashCardResponse.alternative_locale_applet_data_list, PrepurchaseCashCardAppletData.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SyncPrepurchaseCashCardResponse(responseContext2, prepurchaseCashCardAppletData2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncPrepurchaseCashCardResponse syncPrepurchaseCashCardResponse = (SyncPrepurchaseCashCardResponse) obj;
        syncPrepurchaseCashCardResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, syncPrepurchaseCashCardResponse.response_context);
        ProtoAdapter protoAdapter = PrepurchaseCashCardAppletData.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, syncPrepurchaseCashCardResponse.applet_data);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, syncPrepurchaseCashCardResponse.alternative_locale_applet_data_list);
        protoWriter.writeBytes(syncPrepurchaseCashCardResponse.unknownFields());
    }
}
