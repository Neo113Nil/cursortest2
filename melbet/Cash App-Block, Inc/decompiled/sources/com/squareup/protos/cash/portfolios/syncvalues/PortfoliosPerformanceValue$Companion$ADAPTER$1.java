package com.squareup.protos.cash.portfolios.syncvalues;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.invest.ui.Section;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PortfoliosPerformanceValue$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PortfoliosPerformanceValue((String) obj, (String) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(Section.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PortfoliosPerformanceValue portfoliosPerformanceValue = (PortfoliosPerformanceValue) obj;
        reverseProtoWriter.getClass();
        portfoliosPerformanceValue.getClass();
        reverseProtoWriter.writeBytes(portfoliosPerformanceValue.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, portfoliosPerformanceValue.title);
        Section.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, portfoliosPerformanceValue.sections);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, portfoliosPerformanceValue.investment_entity_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PortfoliosPerformanceValue portfoliosPerformanceValue = (PortfoliosPerformanceValue) obj;
        portfoliosPerformanceValue.getClass();
        int size$okio = portfoliosPerformanceValue.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, portfoliosPerformanceValue.title) + Section.ADAPTER.asRepeated().encodedSizeWithTag(2, portfoliosPerformanceValue.sections) + protoAdapter.encodedSizeWithTag(1, portfoliosPerformanceValue.investment_entity_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PortfoliosPerformanceValue portfoliosPerformanceValue = (PortfoliosPerformanceValue) obj;
        portfoliosPerformanceValue.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(portfoliosPerformanceValue.sections, Section.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = portfoliosPerformanceValue.investment_entity_token;
        String str2 = portfoliosPerformanceValue.title;
        byteString.getClass();
        return new PortfoliosPerformanceValue(str, str2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PortfoliosPerformanceValue portfoliosPerformanceValue = (PortfoliosPerformanceValue) obj;
        portfoliosPerformanceValue.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, portfoliosPerformanceValue.investment_entity_token);
        Section.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, portfoliosPerformanceValue.sections);
        protoAdapter.encodeWithTag(protoWriter, 3, portfoliosPerformanceValue.title);
        protoWriter.writeBytes(portfoliosPerformanceValue.unknownFields());
    }
}
