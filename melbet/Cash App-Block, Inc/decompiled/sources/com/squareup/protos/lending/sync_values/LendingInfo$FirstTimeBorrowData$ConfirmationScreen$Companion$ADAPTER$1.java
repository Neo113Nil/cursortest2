package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Animation;
import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingInfo$FirstTimeBorrowData$ConfirmationScreen$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LendingInfo.FirstTimeBorrowData.ConfirmationScreen((String) obj, (Animation) obj2, (String) obj3, (String) obj4, (String) obj5, (Long) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Animation.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingInfo.FirstTimeBorrowData.ConfirmationScreen confirmationScreen = (LendingInfo.FirstTimeBorrowData.ConfirmationScreen) obj;
        reverseProtoWriter.getClass();
        confirmationScreen.getClass();
        reverseProtoWriter.writeBytes(confirmationScreen.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 6, confirmationScreen.credit_limit_cents);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, confirmationScreen.secondary_button_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, confirmationScreen.primary_button_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, confirmationScreen.body);
        Animation.ADAPTER.encodeWithTag(reverseProtoWriter, 2, confirmationScreen.animation);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, confirmationScreen.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingInfo.FirstTimeBorrowData.ConfirmationScreen confirmationScreen = (LendingInfo.FirstTimeBorrowData.ConfirmationScreen) obj;
        confirmationScreen.getClass();
        int size$okio = confirmationScreen.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT64.encodedSizeWithTag(6, confirmationScreen.credit_limit_cents) + protoAdapter.encodedSizeWithTag(5, confirmationScreen.secondary_button_title) + protoAdapter.encodedSizeWithTag(4, confirmationScreen.primary_button_title) + protoAdapter.encodedSizeWithTag(3, confirmationScreen.body) + Animation.ADAPTER.encodedSizeWithTag(2, confirmationScreen.animation) + protoAdapter.encodedSizeWithTag(1, confirmationScreen.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingInfo.FirstTimeBorrowData.ConfirmationScreen confirmationScreen = (LendingInfo.FirstTimeBorrowData.ConfirmationScreen) obj;
        confirmationScreen.getClass();
        Animation animation = confirmationScreen.animation;
        Animation animation2 = animation != null ? (Animation) Animation.ADAPTER.redact(animation) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = confirmationScreen.title;
        String str2 = confirmationScreen.body;
        String str3 = confirmationScreen.primary_button_title;
        String str4 = confirmationScreen.secondary_button_title;
        Long l = confirmationScreen.credit_limit_cents;
        byteString.getClass();
        return new LendingInfo.FirstTimeBorrowData.ConfirmationScreen(str, animation2, str2, str3, str4, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingInfo.FirstTimeBorrowData.ConfirmationScreen confirmationScreen = (LendingInfo.FirstTimeBorrowData.ConfirmationScreen) obj;
        confirmationScreen.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, confirmationScreen.title);
        Animation.ADAPTER.encodeWithTag(protoWriter, 2, confirmationScreen.animation);
        protoAdapter.encodeWithTag(protoWriter, 3, confirmationScreen.body);
        protoAdapter.encodeWithTag(protoWriter, 4, confirmationScreen.primary_button_title);
        protoAdapter.encodeWithTag(protoWriter, 5, confirmationScreen.secondary_button_title);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, confirmationScreen.credit_limit_cents);
        protoWriter.writeBytes(confirmationScreen.unknownFields());
    }
}
