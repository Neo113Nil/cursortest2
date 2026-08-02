package com.squareup.protos.cash.janus.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.janus.api.GetAccountSettingsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetAccountSettingsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAccountSettingsResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(GetAccountSettingsResponse.SettingCollection.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAccountSettingsResponse getAccountSettingsResponse = (GetAccountSettingsResponse) obj;
        reverseProtoWriter.getClass();
        getAccountSettingsResponse.getClass();
        reverseProtoWriter.writeBytes(getAccountSettingsResponse.unknownFields());
        GetAccountSettingsResponse.SettingCollection.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getAccountSettingsResponse.collection);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAccountSettingsResponse getAccountSettingsResponse = (GetAccountSettingsResponse) obj;
        getAccountSettingsResponse.getClass();
        return GetAccountSettingsResponse.SettingCollection.ADAPTER.asRepeated().encodedSizeWithTag(1, getAccountSettingsResponse.collection) + getAccountSettingsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAccountSettingsResponse getAccountSettingsResponse = (GetAccountSettingsResponse) obj;
        getAccountSettingsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getAccountSettingsResponse.collection, GetAccountSettingsResponse.SettingCollection.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetAccountSettingsResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAccountSettingsResponse getAccountSettingsResponse = (GetAccountSettingsResponse) obj;
        getAccountSettingsResponse.getClass();
        GetAccountSettingsResponse.SettingCollection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getAccountSettingsResponse.collection);
        protoWriter.writeBytes(getAccountSettingsResponse.unknownFields());
    }
}
