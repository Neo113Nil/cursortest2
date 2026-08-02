package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowLimitHubData$LimitDisclaimerSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowLimitHubData.LimitDisclaimerSection((LocalizedString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowLimitHubData.LimitDisclaimerSection limitDisclaimerSection = (BorrowLimitHubData.LimitDisclaimerSection) obj;
        reverseProtoWriter.getClass();
        limitDisclaimerSection.getClass();
        reverseProtoWriter.writeBytes(limitDisclaimerSection.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, limitDisclaimerSection.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowLimitHubData.LimitDisclaimerSection limitDisclaimerSection = (BorrowLimitHubData.LimitDisclaimerSection) obj;
        limitDisclaimerSection.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(1, limitDisclaimerSection.text) + limitDisclaimerSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowLimitHubData.LimitDisclaimerSection limitDisclaimerSection = (BorrowLimitHubData.LimitDisclaimerSection) obj;
        limitDisclaimerSection.getClass();
        LocalizedString localizedString = limitDisclaimerSection.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BorrowLimitHubData.LimitDisclaimerSection(localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowLimitHubData.LimitDisclaimerSection limitDisclaimerSection = (BorrowLimitHubData.LimitDisclaimerSection) obj;
        limitDisclaimerSection.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, limitDisclaimerSection.text);
        protoWriter.writeBytes(limitDisclaimerSection.unknownFields());
    }
}
