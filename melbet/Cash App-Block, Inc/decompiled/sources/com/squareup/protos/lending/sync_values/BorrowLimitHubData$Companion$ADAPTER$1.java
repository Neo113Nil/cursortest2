package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowLimitHubData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowLimitHubData((LocalizedString) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(BorrowLimitHubData.Section.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowLimitHubData borrowLimitHubData = (BorrowLimitHubData) obj;
        reverseProtoWriter.getClass();
        borrowLimitHubData.getClass();
        reverseProtoWriter.writeBytes(borrowLimitHubData.unknownFields());
        BorrowLimitHubData.Section.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, borrowLimitHubData.sections);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, borrowLimitHubData.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowLimitHubData borrowLimitHubData = (BorrowLimitHubData) obj;
        borrowLimitHubData.getClass();
        return BorrowLimitHubData.Section.ADAPTER.asRepeated().encodedSizeWithTag(3, borrowLimitHubData.sections) + LocalizedString.ADAPTER.encodedSizeWithTag(2, borrowLimitHubData.title) + borrowLimitHubData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowLimitHubData borrowLimitHubData = (BorrowLimitHubData) obj;
        borrowLimitHubData.getClass();
        LocalizedString localizedString = borrowLimitHubData.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(borrowLimitHubData.sections, BorrowLimitHubData.Section.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BorrowLimitHubData(localizedString2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowLimitHubData borrowLimitHubData = (BorrowLimitHubData) obj;
        borrowLimitHubData.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, borrowLimitHubData.title);
        BorrowLimitHubData.Section.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, borrowLimitHubData.sections);
        protoWriter.writeBytes(borrowLimitHubData.unknownFields());
    }
}
