package com.squareup.protos.cash.cashapproxy.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SingleUsePaymentSummary$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SingleUsePaymentSummary((Text) obj, (Money) obj2, (Money) obj3, (Text) obj4, (Text) obj5, (Image) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SingleUsePaymentSummary singleUsePaymentSummary = (SingleUsePaymentSummary) obj;
        reverseProtoWriter.getClass();
        singleUsePaymentSummary.getClass();
        reverseProtoWriter.writeBytes(singleUsePaymentSummary.unknownFields());
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 6, singleUsePaymentSummary.image);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, singleUsePaymentSummary.footer_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, singleUsePaymentSummary.subtitle);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, singleUsePaymentSummary.limit);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, singleUsePaymentSummary.usage);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, singleUsePaymentSummary.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SingleUsePaymentSummary singleUsePaymentSummary = (SingleUsePaymentSummary) obj;
        singleUsePaymentSummary.getClass();
        int size$okio = singleUsePaymentSummary.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, singleUsePaymentSummary.title) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return Image.ADAPTER.encodedSizeWithTag(6, singleUsePaymentSummary.image) + protoAdapter.encodedSizeWithTag(5, singleUsePaymentSummary.footer_text) + protoAdapter.encodedSizeWithTag(4, singleUsePaymentSummary.subtitle) + protoAdapter2.encodedSizeWithTag(3, singleUsePaymentSummary.limit) + protoAdapter2.encodedSizeWithTag(2, singleUsePaymentSummary.usage) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SingleUsePaymentSummary singleUsePaymentSummary = (SingleUsePaymentSummary) obj;
        singleUsePaymentSummary.getClass();
        Text text = singleUsePaymentSummary.title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = singleUsePaymentSummary.subtitle;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        Text text5 = singleUsePaymentSummary.footer_text;
        Text text6 = text5 != null ? (Text) Text.ADAPTER.redact(text5) : null;
        Image image = singleUsePaymentSummary.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SingleUsePaymentSummary(text2, null, null, text4, text6, image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SingleUsePaymentSummary singleUsePaymentSummary = (SingleUsePaymentSummary) obj;
        singleUsePaymentSummary.getClass();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, singleUsePaymentSummary.title);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 2, singleUsePaymentSummary.usage);
        protoAdapter2.encodeWithTag(protoWriter, 3, singleUsePaymentSummary.limit);
        protoAdapter.encodeWithTag(protoWriter, 4, singleUsePaymentSummary.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 5, singleUsePaymentSummary.footer_text);
        Image.ADAPTER.encodeWithTag(protoWriter, 6, singleUsePaymentSummary.image);
        protoWriter.writeBytes(singleUsePaymentSummary.unknownFields());
    }
}
