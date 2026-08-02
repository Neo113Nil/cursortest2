package com.squareup.protos.cash.fiatly.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetP2PControlsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetP2PControlsResponse((P2PControls) obj, m, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(P2PControls.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                m.add(Money.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetP2PControlsResponse getP2PControlsResponse = (GetP2PControlsResponse) obj;
        reverseProtoWriter.getClass();
        getP2PControlsResponse.getClass();
        reverseProtoWriter.writeBytes(getP2PControlsResponse.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, getP2PControlsResponse.custom_p2p_send_limit_30_day_max_amount);
        Money.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, getP2PControlsResponse.custom_p2p_send_limit_30_day_presets);
        P2PControls.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getP2PControlsResponse.p2p_controls);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetP2PControlsResponse getP2PControlsResponse = (GetP2PControlsResponse) obj;
        getP2PControlsResponse.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(3, getP2PControlsResponse.custom_p2p_send_limit_30_day_max_amount) + Money.ADAPTER.asRepeated().encodedSizeWithTag(2, getP2PControlsResponse.custom_p2p_send_limit_30_day_presets) + P2PControls.ADAPTER.encodedSizeWithTag(1, getP2PControlsResponse.p2p_controls) + getP2PControlsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetP2PControlsResponse getP2PControlsResponse = (GetP2PControlsResponse) obj;
        getP2PControlsResponse.getClass();
        P2PControls p2PControls = getP2PControlsResponse.p2p_controls;
        P2PControls p2PControls2 = p2PControls != null ? (P2PControls) P2PControls.ADAPTER.redact(p2PControls) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getP2PControlsResponse.custom_p2p_send_limit_30_day_presets, Money.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Long l = getP2PControlsResponse.custom_p2p_send_limit_30_day_max_amount;
        byteString.getClass();
        return new GetP2PControlsResponse(p2PControls2, m1169redactElements, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetP2PControlsResponse getP2PControlsResponse = (GetP2PControlsResponse) obj;
        getP2PControlsResponse.getClass();
        P2PControls.ADAPTER.encodeWithTag(protoWriter, 1, getP2PControlsResponse.p2p_controls);
        Money.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getP2PControlsResponse.custom_p2p_send_limit_30_day_presets);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getP2PControlsResponse.custom_p2p_send_limit_30_day_max_amount);
        protoWriter.writeBytes(getP2PControlsResponse.unknownFields());
    }
}
