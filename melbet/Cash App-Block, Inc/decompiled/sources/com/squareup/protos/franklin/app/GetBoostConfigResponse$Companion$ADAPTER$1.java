package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.GetBoostConfigResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetBoostConfigResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBoostConfigResponse((Long) obj, (GetBoostConfigResponse.BtcBoostUpsell) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(GetBoostConfigResponse.BtcBoostUpsell.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBoostConfigResponse getBoostConfigResponse = (GetBoostConfigResponse) obj;
        reverseProtoWriter.getClass();
        getBoostConfigResponse.getClass();
        reverseProtoWriter.writeBytes(getBoostConfigResponse.unknownFields());
        GetBoostConfigResponse.BtcBoostUpsell.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getBoostConfigResponse.btc_boost_upsell);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, getBoostConfigResponse.boost_expiration_hint_threshold_basis_points);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBoostConfigResponse getBoostConfigResponse = (GetBoostConfigResponse) obj;
        getBoostConfigResponse.getClass();
        return GetBoostConfigResponse.BtcBoostUpsell.ADAPTER.encodedSizeWithTag(2, getBoostConfigResponse.btc_boost_upsell) + ProtoAdapter.INT64.encodedSizeWithTag(1, getBoostConfigResponse.boost_expiration_hint_threshold_basis_points) + getBoostConfigResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBoostConfigResponse getBoostConfigResponse = (GetBoostConfigResponse) obj;
        getBoostConfigResponse.getClass();
        GetBoostConfigResponse.BtcBoostUpsell btcBoostUpsell = getBoostConfigResponse.btc_boost_upsell;
        GetBoostConfigResponse.BtcBoostUpsell btcBoostUpsell2 = btcBoostUpsell != null ? (GetBoostConfigResponse.BtcBoostUpsell) GetBoostConfigResponse.BtcBoostUpsell.ADAPTER.redact(btcBoostUpsell) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = getBoostConfigResponse.boost_expiration_hint_threshold_basis_points;
        byteString.getClass();
        return new GetBoostConfigResponse(l, btcBoostUpsell2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBoostConfigResponse getBoostConfigResponse = (GetBoostConfigResponse) obj;
        getBoostConfigResponse.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getBoostConfigResponse.boost_expiration_hint_threshold_basis_points);
        GetBoostConfigResponse.BtcBoostUpsell.ADAPTER.encodeWithTag(protoWriter, 2, getBoostConfigResponse.btc_boost_upsell);
        protoWriter.writeBytes(getBoostConfigResponse.unknownFields());
    }
}
