package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.lending.sync_values.BorrowAppletLinksTile;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowAppletLinksTile$Data$LinkCell$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BorrowAppletLinksTile.Data.LinkCell((Icon) obj, (LocalizedString) obj2, (LocalizedString) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowAppletLinksTile.Data.LinkCell linkCell = (BorrowAppletLinksTile.Data.LinkCell) obj;
        reverseProtoWriter.getClass();
        linkCell.getClass();
        reverseProtoWriter.writeBytes(linkCell.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, linkCell.action_url);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, linkCell.body_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, linkCell.label_text);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, linkCell.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowAppletLinksTile.Data.LinkCell linkCell = (BorrowAppletLinksTile.Data.LinkCell) obj;
        linkCell.getClass();
        int encodedSizeWithTag = Icon.ADAPTER.encodedSizeWithTag(1, linkCell.icon) + linkCell.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(4, linkCell.action_url) + protoAdapter.encodedSizeWithTag(3, linkCell.body_text) + protoAdapter.encodedSizeWithTag(2, linkCell.label_text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowAppletLinksTile.Data.LinkCell linkCell = (BorrowAppletLinksTile.Data.LinkCell) obj;
        linkCell.getClass();
        Icon icon = linkCell.icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        LocalizedString localizedString = linkCell.label_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = linkCell.body_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = linkCell.action_url;
        byteString.getClass();
        return new BorrowAppletLinksTile.Data.LinkCell(icon2, localizedString2, localizedString4, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowAppletLinksTile.Data.LinkCell linkCell = (BorrowAppletLinksTile.Data.LinkCell) obj;
        linkCell.getClass();
        Icon.ADAPTER.encodeWithTag(protoWriter, 1, linkCell.icon);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, linkCell.label_text);
        protoAdapter.encodeWithTag(protoWriter, 3, linkCell.body_text);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, linkCell.action_url);
        protoWriter.writeBytes(linkCell.unknownFields());
    }
}
