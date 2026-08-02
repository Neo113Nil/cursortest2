package com.squareup.protos.cash.money.content;

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
public final class MoneyTab$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MoneyTab(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        MoneyTab moneyTab = (MoneyTab) obj;
        reverseProtoWriter.getClass();
        moneyTab.getClass();
        reverseProtoWriter.writeBytes(moneyTab.unknownFields());
        MoneyTab.Applet.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, moneyTab.applets);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneyTab moneyTab = (MoneyTab) obj;
        moneyTab.getClass();
        return MoneyTab.Applet.ADAPTER.asRepeated().encodedSizeWithTag(1, moneyTab.applets) + moneyTab.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneyTab moneyTab = (MoneyTab) obj;
        moneyTab.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(moneyTab.applets, MoneyTab.Applet.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new MoneyTab(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneyTab moneyTab = (MoneyTab) obj;
        moneyTab.getClass();
        MoneyTab.Applet.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, moneyTab.applets);
        protoWriter.writeBytes(moneyTab.unknownFields());
    }
}
