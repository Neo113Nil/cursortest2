package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingInfo$FirstTimeBorrowData$HomeScreen$BulletContent$SupportData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData((String) obj, (String) obj2, (LocalizableString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData supportData = (LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData) obj;
        reverseProtoWriter.getClass();
        supportData.getClass();
        reverseProtoWriter.writeBytes(supportData.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, supportData.localizable_button_title);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, supportData.support_node);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, supportData.button_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData supportData = (LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData) obj;
        supportData.getClass();
        int size$okio = supportData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalizableString.ADAPTER.encodedSizeWithTag(3, supportData.localizable_button_title) + protoAdapter.encodedSizeWithTag(2, supportData.support_node) + protoAdapter.encodedSizeWithTag(1, supportData.button_title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData supportData = (LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData) obj;
        supportData.getClass();
        LocalizableString localizableString = supportData.localizable_button_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = supportData.button_title;
        String str2 = supportData.support_node;
        byteString.getClass();
        return new LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData(str, str2, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData supportData = (LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData) obj;
        supportData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, supportData.button_title);
        protoAdapter.encodeWithTag(protoWriter, 2, supportData.support_node);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 3, supportData.localizable_button_title);
        protoWriter.writeBytes(supportData.unknownFields());
    }
}
