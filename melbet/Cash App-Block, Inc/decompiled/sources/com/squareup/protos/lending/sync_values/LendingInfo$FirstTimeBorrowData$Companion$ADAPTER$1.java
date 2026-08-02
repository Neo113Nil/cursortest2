package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingInfo$FirstTimeBorrowData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LendingInfo.FirstTimeBorrowData((LendingInfo.FirstTimeBorrowData.HomeScreen) obj, (LendingInfo.FirstTimeBorrowData.LimitCheckerScreen) obj2, (LendingInfo.FirstTimeBorrowData.ConfirmationScreen) obj3, (LendingInfo.FirstTimeBorrowData.LimitInfoScreen) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LendingInfo.FirstTimeBorrowData.HomeScreen.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LendingInfo.FirstTimeBorrowData.LimitCheckerScreen.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LendingInfo.FirstTimeBorrowData.ConfirmationScreen.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LendingInfo.FirstTimeBorrowData.LimitInfoScreen.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingInfo.FirstTimeBorrowData firstTimeBorrowData = (LendingInfo.FirstTimeBorrowData) obj;
        reverseProtoWriter.getClass();
        firstTimeBorrowData.getClass();
        reverseProtoWriter.writeBytes(firstTimeBorrowData.unknownFields());
        LendingInfo.FirstTimeBorrowData.LimitInfoScreen.ADAPTER.encodeWithTag(reverseProtoWriter, 4, firstTimeBorrowData.limit_info_screen);
        LendingInfo.FirstTimeBorrowData.ConfirmationScreen.ADAPTER.encodeWithTag(reverseProtoWriter, 3, firstTimeBorrowData.confirmation_screen);
        LendingInfo.FirstTimeBorrowData.LimitCheckerScreen.ADAPTER.encodeWithTag(reverseProtoWriter, 2, firstTimeBorrowData.limit_checker_screen);
        LendingInfo.FirstTimeBorrowData.HomeScreen.ADAPTER.encodeWithTag(reverseProtoWriter, 1, firstTimeBorrowData.home_screen);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingInfo.FirstTimeBorrowData firstTimeBorrowData = (LendingInfo.FirstTimeBorrowData) obj;
        firstTimeBorrowData.getClass();
        return LendingInfo.FirstTimeBorrowData.LimitInfoScreen.ADAPTER.encodedSizeWithTag(4, firstTimeBorrowData.limit_info_screen) + LendingInfo.FirstTimeBorrowData.ConfirmationScreen.ADAPTER.encodedSizeWithTag(3, firstTimeBorrowData.confirmation_screen) + LendingInfo.FirstTimeBorrowData.LimitCheckerScreen.ADAPTER.encodedSizeWithTag(2, firstTimeBorrowData.limit_checker_screen) + LendingInfo.FirstTimeBorrowData.HomeScreen.ADAPTER.encodedSizeWithTag(1, firstTimeBorrowData.home_screen) + firstTimeBorrowData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingInfo.FirstTimeBorrowData firstTimeBorrowData = (LendingInfo.FirstTimeBorrowData) obj;
        firstTimeBorrowData.getClass();
        LendingInfo.FirstTimeBorrowData.HomeScreen homeScreen = firstTimeBorrowData.home_screen;
        LendingInfo.FirstTimeBorrowData.HomeScreen homeScreen2 = homeScreen != null ? (LendingInfo.FirstTimeBorrowData.HomeScreen) LendingInfo.FirstTimeBorrowData.HomeScreen.ADAPTER.redact(homeScreen) : null;
        LendingInfo.FirstTimeBorrowData.LimitCheckerScreen limitCheckerScreen = firstTimeBorrowData.limit_checker_screen;
        LendingInfo.FirstTimeBorrowData.LimitCheckerScreen limitCheckerScreen2 = limitCheckerScreen != null ? (LendingInfo.FirstTimeBorrowData.LimitCheckerScreen) LendingInfo.FirstTimeBorrowData.LimitCheckerScreen.ADAPTER.redact(limitCheckerScreen) : null;
        LendingInfo.FirstTimeBorrowData.ConfirmationScreen confirmationScreen = firstTimeBorrowData.confirmation_screen;
        LendingInfo.FirstTimeBorrowData.ConfirmationScreen confirmationScreen2 = confirmationScreen != null ? (LendingInfo.FirstTimeBorrowData.ConfirmationScreen) LendingInfo.FirstTimeBorrowData.ConfirmationScreen.ADAPTER.redact(confirmationScreen) : null;
        LendingInfo.FirstTimeBorrowData.LimitInfoScreen limitInfoScreen = firstTimeBorrowData.limit_info_screen;
        LendingInfo.FirstTimeBorrowData.LimitInfoScreen limitInfoScreen2 = limitInfoScreen != null ? (LendingInfo.FirstTimeBorrowData.LimitInfoScreen) LendingInfo.FirstTimeBorrowData.LimitInfoScreen.ADAPTER.redact(limitInfoScreen) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LendingInfo.FirstTimeBorrowData(homeScreen2, limitCheckerScreen2, confirmationScreen2, limitInfoScreen2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingInfo.FirstTimeBorrowData firstTimeBorrowData = (LendingInfo.FirstTimeBorrowData) obj;
        firstTimeBorrowData.getClass();
        LendingInfo.FirstTimeBorrowData.HomeScreen.ADAPTER.encodeWithTag(protoWriter, 1, firstTimeBorrowData.home_screen);
        LendingInfo.FirstTimeBorrowData.LimitCheckerScreen.ADAPTER.encodeWithTag(protoWriter, 2, firstTimeBorrowData.limit_checker_screen);
        LendingInfo.FirstTimeBorrowData.ConfirmationScreen.ADAPTER.encodeWithTag(protoWriter, 3, firstTimeBorrowData.confirmation_screen);
        LendingInfo.FirstTimeBorrowData.LimitInfoScreen.ADAPTER.encodeWithTag(protoWriter, 4, firstTimeBorrowData.limit_info_screen);
        protoWriter.writeBytes(firstTimeBorrowData.unknownFields());
    }
}
