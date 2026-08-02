package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingInfo$FirstTimeBorrowData$LimitInfoScreen$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LendingInfo.FirstTimeBorrowData.LimitInfoScreen((String) obj, (String) obj2, (String) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                m.add(LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingInfo.FirstTimeBorrowData.LimitInfoScreen limitInfoScreen = (LendingInfo.FirstTimeBorrowData.LimitInfoScreen) obj;
        reverseProtoWriter.getClass();
        limitInfoScreen.getClass();
        reverseProtoWriter.writeBytes(limitInfoScreen.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, limitInfoScreen.dismiss_button_title);
        LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, limitInfoScreen.detail_rows);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, limitInfoScreen.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, limitInfoScreen.header);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingInfo.FirstTimeBorrowData.LimitInfoScreen limitInfoScreen = (LendingInfo.FirstTimeBorrowData.LimitInfoScreen) obj;
        limitInfoScreen.getClass();
        int size$okio = limitInfoScreen.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, limitInfoScreen.dismiss_button_title) + LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow.ADAPTER.asRepeated().encodedSizeWithTag(3, limitInfoScreen.detail_rows) + protoAdapter.encodedSizeWithTag(2, limitInfoScreen.subtitle) + protoAdapter.encodedSizeWithTag(1, limitInfoScreen.header) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingInfo.FirstTimeBorrowData.LimitInfoScreen limitInfoScreen = (LendingInfo.FirstTimeBorrowData.LimitInfoScreen) obj;
        limitInfoScreen.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(limitInfoScreen.detail_rows, LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = limitInfoScreen.header;
        String str2 = limitInfoScreen.subtitle;
        String str3 = limitInfoScreen.dismiss_button_title;
        byteString.getClass();
        return new LendingInfo.FirstTimeBorrowData.LimitInfoScreen(str, str2, str3, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingInfo.FirstTimeBorrowData.LimitInfoScreen limitInfoScreen = (LendingInfo.FirstTimeBorrowData.LimitInfoScreen) obj;
        limitInfoScreen.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, limitInfoScreen.header);
        protoAdapter.encodeWithTag(protoWriter, 2, limitInfoScreen.subtitle);
        LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, limitInfoScreen.detail_rows);
        protoAdapter.encodeWithTag(protoWriter, 4, limitInfoScreen.dismiss_button_title);
        protoWriter.writeBytes(limitInfoScreen.unknownFields());
    }
}
