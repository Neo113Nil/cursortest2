package com.squareup.protos.cash.local.client.app.v1.account;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.app.v1.account.LocalEarningCard;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalEarningCard$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalEarningCard((String) obj, (String) obj2, (String) obj3, (LocalImage) obj4, (LocalEarningCard.EarningState) obj5, (LocalEarningCard.Source) obj6, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    try {
                        obj5 = LocalEarningCard.EarningState.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    try {
                        obj6 = LocalEarningCard.Source.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalEarningCard localEarningCard = (LocalEarningCard) obj;
        reverseProtoWriter.getClass();
        localEarningCard.getClass();
        reverseProtoWriter.writeBytes(localEarningCard.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, localEarningCard.id);
        LocalEarningCard.Source.ADAPTER.encodeWithTag(reverseProtoWriter, 6, localEarningCard.source);
        LocalEarningCard.EarningState.ADAPTER.encodeWithTag(reverseProtoWriter, 5, localEarningCard.state);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 4, localEarningCard.card_image);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, localEarningCard.byline_display_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localEarningCard.secondary_display_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localEarningCard.primary_display_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalEarningCard localEarningCard = (LocalEarningCard) obj;
        localEarningCard.getClass();
        int size$okio = localEarningCard.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(7, localEarningCard.id) + LocalEarningCard.Source.ADAPTER.encodedSizeWithTag(6, localEarningCard.source) + LocalEarningCard.EarningState.ADAPTER.encodedSizeWithTag(5, localEarningCard.state) + LocalImage.ADAPTER.encodedSizeWithTag(4, localEarningCard.card_image) + protoAdapter.encodedSizeWithTag(3, localEarningCard.byline_display_text) + protoAdapter.encodedSizeWithTag(2, localEarningCard.secondary_display_text) + protoAdapter.encodedSizeWithTag(1, localEarningCard.primary_display_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalEarningCard localEarningCard = (LocalEarningCard) obj;
        localEarningCard.getClass();
        LocalImage localImage = localEarningCard.card_image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = localEarningCard.primary_display_text;
        String str2 = localEarningCard.secondary_display_text;
        String str3 = localEarningCard.byline_display_text;
        LocalEarningCard.EarningState earningState = localEarningCard.state;
        LocalEarningCard.Source source = localEarningCard.source;
        String str4 = localEarningCard.id;
        byteString.getClass();
        return new LocalEarningCard(str, str2, str3, localImage2, earningState, source, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalEarningCard localEarningCard = (LocalEarningCard) obj;
        localEarningCard.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localEarningCard.primary_display_text);
        protoAdapter.encodeWithTag(protoWriter, 2, localEarningCard.secondary_display_text);
        protoAdapter.encodeWithTag(protoWriter, 3, localEarningCard.byline_display_text);
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 4, localEarningCard.card_image);
        LocalEarningCard.EarningState.ADAPTER.encodeWithTag(protoWriter, 5, localEarningCard.state);
        LocalEarningCard.Source.ADAPTER.encodeWithTag(protoWriter, 6, localEarningCard.source);
        protoAdapter.encodeWithTag(protoWriter, 7, localEarningCard.id);
        protoWriter.writeBytes(localEarningCard.unknownFields());
    }
}
