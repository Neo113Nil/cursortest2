package com.squareup.protos.cash.referly.api.incentives.client;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AvailablePromotion$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AvailablePromotion((String) obj, (String) obj2, (String) obj3, (String) obj4, (Image) obj5, (String) obj6, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
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
        AvailablePromotion availablePromotion = (AvailablePromotion) obj;
        reverseProtoWriter.getClass();
        availablePromotion.getClass();
        reverseProtoWriter.writeBytes(availablePromotion.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, availablePromotion.campaign_variant_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, availablePromotion.campaign_token);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 5, availablePromotion.image);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, availablePromotion.action_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, availablePromotion.call_to_action_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, availablePromotion.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, availablePromotion.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AvailablePromotion availablePromotion = (AvailablePromotion) obj;
        availablePromotion.getClass();
        int size$okio = availablePromotion.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(7, availablePromotion.campaign_variant_token) + protoAdapter.encodedSizeWithTag(6, availablePromotion.campaign_token) + Image.ADAPTER.encodedSizeWithTag(5, availablePromotion.image) + protoAdapter.encodedSizeWithTag(4, availablePromotion.action_url) + protoAdapter.encodedSizeWithTag(3, availablePromotion.call_to_action_text) + protoAdapter.encodedSizeWithTag(2, availablePromotion.subtitle) + protoAdapter.encodedSizeWithTag(1, availablePromotion.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AvailablePromotion availablePromotion = (AvailablePromotion) obj;
        availablePromotion.getClass();
        Image image = availablePromotion.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = availablePromotion.title;
        String str2 = availablePromotion.subtitle;
        String str3 = availablePromotion.call_to_action_text;
        String str4 = availablePromotion.action_url;
        String str5 = availablePromotion.campaign_token;
        String str6 = availablePromotion.campaign_variant_token;
        byteString.getClass();
        return new AvailablePromotion(str, str2, str3, str4, image2, str5, str6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AvailablePromotion availablePromotion = (AvailablePromotion) obj;
        availablePromotion.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, availablePromotion.title);
        protoAdapter.encodeWithTag(protoWriter, 2, availablePromotion.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, availablePromotion.call_to_action_text);
        protoAdapter.encodeWithTag(protoWriter, 4, availablePromotion.action_url);
        Image.ADAPTER.encodeWithTag(protoWriter, 5, availablePromotion.image);
        protoAdapter.encodeWithTag(protoWriter, 6, availablePromotion.campaign_token);
        protoAdapter.encodeWithTag(protoWriter, 7, availablePromotion.campaign_variant_token);
        protoWriter.writeBytes(availablePromotion.unknownFields());
    }
}
