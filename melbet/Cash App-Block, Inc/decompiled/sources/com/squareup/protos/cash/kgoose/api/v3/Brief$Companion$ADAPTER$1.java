package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/Brief$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/Brief;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Brief$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Brief((String) obj, (String) obj2, (String) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                m.add(CashFlow.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Brief brief = (Brief) obj;
        reverseProtoWriter.getClass();
        brief.getClass();
        reverseProtoWriter.writeBytes(brief.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, brief.bottom_title);
        CashFlow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, brief.cash_flows);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, brief.markdown_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, brief.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Brief brief = (Brief) obj;
        brief.getClass();
        int size$okio = brief.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, brief.bottom_title) + CashFlow.ADAPTER.asRepeated().encodedSizeWithTag(3, brief.cash_flows) + protoAdapter.encodedSizeWithTag(2, brief.markdown_text) + protoAdapter.encodedSizeWithTag(1, brief.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Brief brief = (Brief) obj;
        brief.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(brief.cash_flows, CashFlow.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = brief.title;
        String str2 = brief.markdown_text;
        String str3 = brief.bottom_title;
        byteString.getClass();
        return new Brief(str, str2, str3, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Brief brief = (Brief) obj;
        brief.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, brief.title);
        protoAdapter.encodeWithTag(protoWriter, 2, brief.markdown_text);
        CashFlow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, brief.cash_flows);
        protoAdapter.encodeWithTag(protoWriter, 4, brief.bottom_title);
        protoWriter.writeBytes(brief.unknownFields());
    }
}
