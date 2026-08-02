package com.squareup.protos.cash.cashliteflow.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PrepareRecoveryActivitiesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepareRecoveryActivitiesResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(PreparedRecoveryActivity.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepareRecoveryActivitiesResponse prepareRecoveryActivitiesResponse = (PrepareRecoveryActivitiesResponse) obj;
        reverseProtoWriter.getClass();
        prepareRecoveryActivitiesResponse.getClass();
        reverseProtoWriter.writeBytes(prepareRecoveryActivitiesResponse.unknownFields());
        PreparedRecoveryActivity.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, prepareRecoveryActivitiesResponse.activities);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PrepareRecoveryActivitiesResponse prepareRecoveryActivitiesResponse = (PrepareRecoveryActivitiesResponse) obj;
        prepareRecoveryActivitiesResponse.getClass();
        return PreparedRecoveryActivity.ADAPTER.asRepeated().encodedSizeWithTag(1, prepareRecoveryActivitiesResponse.activities) + prepareRecoveryActivitiesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepareRecoveryActivitiesResponse prepareRecoveryActivitiesResponse = (PrepareRecoveryActivitiesResponse) obj;
        prepareRecoveryActivitiesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(prepareRecoveryActivitiesResponse.activities, PreparedRecoveryActivity.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PrepareRecoveryActivitiesResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepareRecoveryActivitiesResponse prepareRecoveryActivitiesResponse = (PrepareRecoveryActivitiesResponse) obj;
        prepareRecoveryActivitiesResponse.getClass();
        PreparedRecoveryActivity.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, prepareRecoveryActivitiesResponse.activities);
        protoWriter.writeBytes(prepareRecoveryActivitiesResponse.unknownFields());
    }
}
