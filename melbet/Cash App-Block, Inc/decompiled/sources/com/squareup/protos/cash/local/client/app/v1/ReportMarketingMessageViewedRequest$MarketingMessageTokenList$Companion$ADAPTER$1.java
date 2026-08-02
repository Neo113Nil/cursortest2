package com.squareup.protos.cash.local.client.app.v1;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.app.v1.ReportMarketingMessageViewedRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ReportMarketingMessageViewedRequest$MarketingMessageTokenList$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ReportMarketingMessageViewedRequest.MarketingMessageTokenList(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ReportMarketingMessageViewedRequest.MarketingMessageTokenList marketingMessageTokenList = (ReportMarketingMessageViewedRequest.MarketingMessageTokenList) obj;
        reverseProtoWriter.getClass();
        marketingMessageTokenList.getClass();
        reverseProtoWriter.writeBytes(marketingMessageTokenList.unknownFields());
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, marketingMessageTokenList.tokens);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ReportMarketingMessageViewedRequest.MarketingMessageTokenList marketingMessageTokenList = (ReportMarketingMessageViewedRequest.MarketingMessageTokenList) obj;
        marketingMessageTokenList.getClass();
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, marketingMessageTokenList.tokens) + marketingMessageTokenList.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ReportMarketingMessageViewedRequest.MarketingMessageTokenList marketingMessageTokenList = (ReportMarketingMessageViewedRequest.MarketingMessageTokenList) obj;
        marketingMessageTokenList.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = marketingMessageTokenList.tokens;
        list.getClass();
        byteString.getClass();
        return new ReportMarketingMessageViewedRequest.MarketingMessageTokenList(list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ReportMarketingMessageViewedRequest.MarketingMessageTokenList marketingMessageTokenList = (ReportMarketingMessageViewedRequest.MarketingMessageTokenList) obj;
        marketingMessageTokenList.getClass();
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, marketingMessageTokenList.tokens);
        protoWriter.writeBytes(marketingMessageTokenList.unknownFields());
    }
}
