package com.squareup.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.lending.app_support.AppSupport;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletSyncData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepurchaseCashCardAppletSyncData(m, (PrepurchaseCashCardAppletData) obj, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(AppSupport.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(PrepurchaseCashCardAppletData.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(PrepurchaseCashCardAppletData.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseCashCardAppletSyncData prepurchaseCashCardAppletSyncData = (PrepurchaseCashCardAppletSyncData) obj;
        reverseProtoWriter.getClass();
        prepurchaseCashCardAppletSyncData.getClass();
        reverseProtoWriter.writeBytes(prepurchaseCashCardAppletSyncData.unknownFields());
        ProtoAdapter protoAdapter = PrepurchaseCashCardAppletData.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, prepurchaseCashCardAppletSyncData.alternative_locale_applet_data_list);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, prepurchaseCashCardAppletSyncData.applet_data);
        AppSupport.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, prepurchaseCashCardAppletSyncData.app_supports);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PrepurchaseCashCardAppletSyncData prepurchaseCashCardAppletSyncData = (PrepurchaseCashCardAppletSyncData) obj;
        prepurchaseCashCardAppletSyncData.getClass();
        int encodedSizeWithTag = AppSupport.ADAPTER.asRepeated().encodedSizeWithTag(1, prepurchaseCashCardAppletSyncData.app_supports) + prepurchaseCashCardAppletSyncData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = PrepurchaseCashCardAppletData.ADAPTER;
        return protoAdapter.asRepeated().encodedSizeWithTag(3, prepurchaseCashCardAppletSyncData.alternative_locale_applet_data_list) + protoAdapter.encodedSizeWithTag(2, prepurchaseCashCardAppletSyncData.applet_data) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseCashCardAppletSyncData prepurchaseCashCardAppletSyncData = (PrepurchaseCashCardAppletSyncData) obj;
        prepurchaseCashCardAppletSyncData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(prepurchaseCashCardAppletSyncData.app_supports, AppSupport.ADAPTER);
        PrepurchaseCashCardAppletData prepurchaseCashCardAppletData = prepurchaseCashCardAppletSyncData.applet_data;
        PrepurchaseCashCardAppletData prepurchaseCashCardAppletData2 = prepurchaseCashCardAppletData != null ? (PrepurchaseCashCardAppletData) PrepurchaseCashCardAppletData.ADAPTER.redact(prepurchaseCashCardAppletData) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(prepurchaseCashCardAppletSyncData.alternative_locale_applet_data_list, PrepurchaseCashCardAppletData.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PrepurchaseCashCardAppletSyncData(m1169redactElements, prepurchaseCashCardAppletData2, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseCashCardAppletSyncData prepurchaseCashCardAppletSyncData = (PrepurchaseCashCardAppletSyncData) obj;
        prepurchaseCashCardAppletSyncData.getClass();
        AppSupport.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, prepurchaseCashCardAppletSyncData.app_supports);
        ProtoAdapter protoAdapter = PrepurchaseCashCardAppletData.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, prepurchaseCashCardAppletSyncData.applet_data);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, prepurchaseCashCardAppletSyncData.alternative_locale_applet_data_list);
        protoWriter.writeBytes(prepurchaseCashCardAppletSyncData.unknownFields());
    }
}
