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
public final class LendingInfo$FirstTimeBorrowData$HomeScreen$NoticeContent$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent((String) obj, (LocalizableString) obj3, (String) obj2, (LocalizableString) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent noticeContent = (LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent) obj;
        reverseProtoWriter.getClass();
        noticeContent.getClass();
        reverseProtoWriter.writeBytes(noticeContent.unknownFields());
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, noticeContent.localizable_notice_body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, noticeContent.localizable_notice_title);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, noticeContent.notice_body);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, noticeContent.notice_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent noticeContent = (LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent) obj;
        noticeContent.getClass();
        int size$okio = noticeContent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, noticeContent.notice_body) + protoAdapter.encodedSizeWithTag(1, noticeContent.notice_title) + size$okio;
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(4, noticeContent.localizable_notice_body) + protoAdapter2.encodedSizeWithTag(3, noticeContent.localizable_notice_title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent noticeContent = (LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent) obj;
        noticeContent.getClass();
        LocalizableString localizableString = noticeContent.localizable_notice_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = noticeContent.localizable_notice_body;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = noticeContent.notice_title;
        String str2 = noticeContent.notice_body;
        byteString.getClass();
        return new LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent(str, localizableString2, str2, localizableString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent noticeContent = (LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent) obj;
        noticeContent.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, noticeContent.notice_title);
        protoAdapter.encodeWithTag(protoWriter, 2, noticeContent.notice_body);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, noticeContent.localizable_notice_title);
        protoAdapter2.encodeWithTag(protoWriter, 4, noticeContent.localizable_notice_body);
        protoWriter.writeBytes(noticeContent.unknownFields());
    }
}
