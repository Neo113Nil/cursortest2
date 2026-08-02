package com.squareup.protos.cash.dataprivacy.settings;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DataPrivacySettings$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DataPrivacySettings(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(DataPrivacySetting.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DataPrivacySettings dataPrivacySettings = (DataPrivacySettings) obj;
        reverseProtoWriter.getClass();
        dataPrivacySettings.getClass();
        reverseProtoWriter.writeBytes(dataPrivacySettings.unknownFields());
        DataPrivacySetting.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, dataPrivacySettings.settings);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DataPrivacySettings dataPrivacySettings = (DataPrivacySettings) obj;
        dataPrivacySettings.getClass();
        return DataPrivacySetting.ADAPTER.asRepeated().encodedSizeWithTag(1, dataPrivacySettings.settings) + dataPrivacySettings.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DataPrivacySettings dataPrivacySettings = (DataPrivacySettings) obj;
        dataPrivacySettings.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(dataPrivacySettings.settings, DataPrivacySetting.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DataPrivacySettings(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DataPrivacySettings dataPrivacySettings = (DataPrivacySettings) obj;
        dataPrivacySettings.getClass();
        DataPrivacySetting.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, dataPrivacySettings.settings);
        protoWriter.writeBytes(dataPrivacySettings.unknownFields());
    }
}
