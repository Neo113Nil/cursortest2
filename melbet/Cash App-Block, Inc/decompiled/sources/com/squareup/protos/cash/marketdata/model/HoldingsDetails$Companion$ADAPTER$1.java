package com.squareup.protos.cash.marketdata.model;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.marketdata.model.HoldingsDetails;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class HoldingsDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HoldingsDetails((Integer) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(HoldingsDetails.Holding.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HoldingsDetails holdingsDetails = (HoldingsDetails) obj;
        reverseProtoWriter.getClass();
        holdingsDetails.getClass();
        reverseProtoWriter.writeBytes(holdingsDetails.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, holdingsDetails.num_holdings_display_on_equity_page);
        HoldingsDetails.Holding.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, holdingsDetails.holdings);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HoldingsDetails holdingsDetails = (HoldingsDetails) obj;
        holdingsDetails.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(2, holdingsDetails.num_holdings_display_on_equity_page) + HoldingsDetails.Holding.ADAPTER.asRepeated().encodedSizeWithTag(1, holdingsDetails.holdings) + holdingsDetails.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HoldingsDetails holdingsDetails = (HoldingsDetails) obj;
        holdingsDetails.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(holdingsDetails.holdings, HoldingsDetails.Holding.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Integer num = holdingsDetails.num_holdings_display_on_equity_page;
        byteString.getClass();
        return new HoldingsDetails(num, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HoldingsDetails holdingsDetails = (HoldingsDetails) obj;
        holdingsDetails.getClass();
        HoldingsDetails.Holding.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, holdingsDetails.holdings);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, holdingsDetails.num_holdings_display_on_equity_page);
        protoWriter.writeBytes(holdingsDetails.unknownFields());
    }
}
