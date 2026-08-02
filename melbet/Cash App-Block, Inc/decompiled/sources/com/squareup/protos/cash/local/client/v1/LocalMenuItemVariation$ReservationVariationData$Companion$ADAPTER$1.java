package com.squareup.protos.cash.local.client.v1;

import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zziu;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemVariation;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenuItemVariation$ReservationVariationData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        zziu zziuVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalMenuItemVariation.ReservationVariationData((Long) obj, m, zziuVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 3) {
                zziuVar = new LocalMenuItemVariation$ReservationVariationData$NoShowFee$Amount((LocalMoney) LocalMoney.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                zziuVar = new LocalMenuItemVariation$ReservationVariationData$NoShowFee$PercentageBps(((Number) ProtoAdapter.INT32.decode(protoReader)).intValue());
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMenuItemVariation.ReservationVariationData reservationVariationData = (LocalMenuItemVariation.ReservationVariationData) obj;
        reverseProtoWriter.getClass();
        reservationVariationData.getClass();
        reverseProtoWriter.writeBytes(reservationVariationData.unknownFields());
        zziu zziuVar = reservationVariationData.no_show_fee;
        if (zziuVar instanceof LocalMenuItemVariation$ReservationVariationData$NoShowFee$Amount) {
            LocalMoney.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((LocalMenuItemVariation$ReservationVariationData$NoShowFee$Amount) zziuVar).value);
        } else if (zziuVar instanceof LocalMenuItemVariation$ReservationVariationData$NoShowFee$PercentageBps) {
            ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 4, Integer.valueOf(((LocalMenuItemVariation$ReservationVariationData$NoShowFee$PercentageBps) zziuVar).value));
        } else if (zziuVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 2, reservationVariationData.team_member_tokens);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, reservationVariationData.duration);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        LocalMenuItemVariation.ReservationVariationData reservationVariationData = (LocalMenuItemVariation.ReservationVariationData) obj;
        reservationVariationData.getClass();
        int encodedSizeWithTag2 = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, reservationVariationData.team_member_tokens) + ProtoAdapter.INT64.encodedSizeWithTag(1, reservationVariationData.duration) + reservationVariationData.unknownFields().getSize$okio();
        zziu zziuVar = reservationVariationData.no_show_fee;
        if (zziuVar instanceof LocalMenuItemVariation$ReservationVariationData$NoShowFee$Amount) {
            encodedSizeWithTag = LocalMoney.ADAPTER.encodedSizeWithTag(3, ((LocalMenuItemVariation$ReservationVariationData$NoShowFee$Amount) zziuVar).value);
        } else {
            if (!(zziuVar instanceof LocalMenuItemVariation$ReservationVariationData$NoShowFee$PercentageBps)) {
                if (zziuVar == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(((LocalMenuItemVariation$ReservationVariationData$NoShowFee$PercentageBps) zziuVar).value));
        }
        return encodedSizeWithTag + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMenuItemVariation.ReservationVariationData reservationVariationData = (LocalMenuItemVariation.ReservationVariationData) obj;
        reservationVariationData.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = reservationVariationData.duration;
        List list = reservationVariationData.team_member_tokens;
        zziu zziuVar = reservationVariationData.no_show_fee;
        list.getClass();
        byteString.getClass();
        return new LocalMenuItemVariation.ReservationVariationData(l, list, zziuVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuItemVariation.ReservationVariationData reservationVariationData = (LocalMenuItemVariation.ReservationVariationData) obj;
        reservationVariationData.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, reservationVariationData.duration);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, reservationVariationData.team_member_tokens);
        zziu zziuVar = reservationVariationData.no_show_fee;
        if (zziuVar instanceof LocalMenuItemVariation$ReservationVariationData$NoShowFee$Amount) {
            LocalMoney.ADAPTER.encodeWithTag(protoWriter, 3, ((LocalMenuItemVariation$ReservationVariationData$NoShowFee$Amount) zziuVar).value);
        } else if (zziuVar instanceof LocalMenuItemVariation$ReservationVariationData$NoShowFee$PercentageBps) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, Integer.valueOf(((LocalMenuItemVariation$ReservationVariationData$NoShowFee$PercentageBps) zziuVar).value));
        } else if (zziuVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(reservationVariationData.unknownFields());
    }
}
