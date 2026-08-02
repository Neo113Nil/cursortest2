package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.shop.rendering.api.MultiOffersSheet;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class MultiOffersSheet$OfferPreview$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new MultiOffersSheet.OfferPreview((OfferType) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (TapAction) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = OfferType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj6 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj6);
                    break;
                case 6:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MultiOffersSheet.OfferPreview offerPreview = (MultiOffersSheet.OfferPreview) obj;
        reverseProtoWriter.getClass();
        offerPreview.getClass();
        reverseProtoWriter.writeBytes(offerPreview.unknownFields());
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 5, offerPreview.tap_action);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, offerPreview.preview_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, offerPreview.preview_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, offerPreview.boost_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, offerPreview.offer_token);
        OfferType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, offerPreview.offer_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MultiOffersSheet.OfferPreview offerPreview = (MultiOffersSheet.OfferPreview) obj;
        offerPreview.getClass();
        int encodedSizeWithTag = OfferType.ADAPTER.encodedSizeWithTag(1, offerPreview.offer_type) + offerPreview.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return TapAction.ADAPTER.encodedSizeWithTag(5, offerPreview.tap_action) + protoAdapter.encodedSizeWithTag(4, offerPreview.preview_subtitle) + protoAdapter.encodedSizeWithTag(3, offerPreview.preview_title) + protoAdapter.encodedSizeWithTag(6, offerPreview.boost_token) + protoAdapter.encodedSizeWithTag(2, offerPreview.offer_token) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MultiOffersSheet.OfferPreview offerPreview = (MultiOffersSheet.OfferPreview) obj;
        offerPreview.getClass();
        TapAction tapAction = offerPreview.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        ByteString byteString = ByteString.EMPTY;
        OfferType offerType = offerPreview.offer_type;
        String str = offerPreview.offer_token;
        String str2 = offerPreview.boost_token;
        String str3 = offerPreview.preview_title;
        String str4 = offerPreview.preview_subtitle;
        byteString.getClass();
        return new MultiOffersSheet.OfferPreview(offerType, str, str2, str3, str4, tapAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MultiOffersSheet.OfferPreview offerPreview = (MultiOffersSheet.OfferPreview) obj;
        offerPreview.getClass();
        OfferType.ADAPTER.encodeWithTag(protoWriter, 1, offerPreview.offer_type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, offerPreview.offer_token);
        protoAdapter.encodeWithTag(protoWriter, 6, offerPreview.boost_token);
        protoAdapter.encodeWithTag(protoWriter, 3, offerPreview.preview_title);
        protoAdapter.encodeWithTag(protoWriter, 4, offerPreview.preview_subtitle);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 5, offerPreview.tap_action);
        protoWriter.writeBytes(offerPreview.unknownFields());
    }
}
