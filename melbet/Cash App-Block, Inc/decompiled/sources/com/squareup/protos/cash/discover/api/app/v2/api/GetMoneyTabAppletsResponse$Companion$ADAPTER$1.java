package com.squareup.protos.cash.discover.api.app.v2.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.money.content.MoneyTab;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetMoneyTabAppletsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetMoneyTabAppletsResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(MoneyTab.Applet.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetMoneyTabAppletsResponse getMoneyTabAppletsResponse = (GetMoneyTabAppletsResponse) obj;
        reverseProtoWriter.getClass();
        getMoneyTabAppletsResponse.getClass();
        reverseProtoWriter.writeBytes(getMoneyTabAppletsResponse.unknownFields());
        MoneyTab.Applet.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getMoneyTabAppletsResponse.applets);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetMoneyTabAppletsResponse getMoneyTabAppletsResponse = (GetMoneyTabAppletsResponse) obj;
        getMoneyTabAppletsResponse.getClass();
        return MoneyTab.Applet.ADAPTER.asRepeated().encodedSizeWithTag(1, getMoneyTabAppletsResponse.applets) + getMoneyTabAppletsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetMoneyTabAppletsResponse getMoneyTabAppletsResponse = (GetMoneyTabAppletsResponse) obj;
        getMoneyTabAppletsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getMoneyTabAppletsResponse.applets, MoneyTab.Applet.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetMoneyTabAppletsResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetMoneyTabAppletsResponse getMoneyTabAppletsResponse = (GetMoneyTabAppletsResponse) obj;
        getMoneyTabAppletsResponse.getClass();
        MoneyTab.Applet.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getMoneyTabAppletsResponse.applets);
        protoWriter.writeBytes(getMoneyTabAppletsResponse.unknownFields());
    }
}
