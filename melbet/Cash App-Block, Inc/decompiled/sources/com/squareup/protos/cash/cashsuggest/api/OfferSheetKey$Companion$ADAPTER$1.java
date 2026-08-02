package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.widget.ComposeHelpersKt;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes.dex */
public final class OfferSheetKey$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ComposeHelpersKt offerSheetKey$IdentifierToken$OfferToken;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        ComposeHelpersKt composeHelpersKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OfferSheetKey((SheetType) obj, (OfferType) obj2, composeHelpersKt, (OfferSheetKey.PresentingContext) obj3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = SheetType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                if (nextTag == 3) {
                    offerSheetKey$IdentifierToken$OfferToken = new OfferSheetKey$IdentifierToken$OfferToken((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 5) {
                    try {
                        obj3 = OfferSheetKey.PresentingContext.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                    }
                } else if (nextTag == 6) {
                    offerSheetKey$IdentifierToken$OfferToken = new OfferSheetKey$IdentifierToken$MerchantToken((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 7) {
                    protoReader.readUnknownField(nextTag);
                } else {
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                }
                composeHelpersKt = offerSheetKey$IdentifierToken$OfferToken;
            } else {
                try {
                    obj2 = OfferType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OfferSheetKey offerSheetKey = (OfferSheetKey) obj;
        reverseProtoWriter.getClass();
        offerSheetKey.getClass();
        reverseProtoWriter.writeBytes(offerSheetKey.unknownFields());
        ComposeHelpersKt composeHelpersKt = offerSheetKey.identifier_token;
        if (composeHelpersKt instanceof OfferSheetKey$IdentifierToken$OfferToken) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, ((OfferSheetKey$IdentifierToken$OfferToken) composeHelpersKt).getValue());
        } else if (composeHelpersKt instanceof OfferSheetKey$IdentifierToken$MerchantToken) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 6, ((OfferSheetKey$IdentifierToken$MerchantToken) composeHelpersKt).getValue());
        } else if (composeHelpersKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 7, offerSheetKey.from_iab);
        OfferSheetKey.PresentingContext.ADAPTER.encodeWithTag(reverseProtoWriter, 5, offerSheetKey.presenting_context);
        OfferType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, offerSheetKey.offer_type);
        SheetType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, offerSheetKey.sheet_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        OfferSheetKey offerSheetKey = (OfferSheetKey) obj;
        offerSheetKey.getClass();
        int encodedSizeWithTag2 = OfferType.ADAPTER.encodedSizeWithTag(2, offerSheetKey.offer_type) + SheetType.ADAPTER.encodedSizeWithTag(1, offerSheetKey.sheet_type) + offerSheetKey.unknownFields().getSize$okio();
        ComposeHelpersKt composeHelpersKt = offerSheetKey.identifier_token;
        if (composeHelpersKt instanceof OfferSheetKey$IdentifierToken$OfferToken) {
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(3, ((OfferSheetKey$IdentifierToken$OfferToken) composeHelpersKt).getValue());
        } else {
            if (!(composeHelpersKt instanceof OfferSheetKey$IdentifierToken$MerchantToken)) {
                if (composeHelpersKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.BOOL.encodedSizeWithTag(7, offerSheetKey.from_iab) + OfferSheetKey.PresentingContext.ADAPTER.encodedSizeWithTag(5, offerSheetKey.presenting_context) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(6, ((OfferSheetKey$IdentifierToken$MerchantToken) composeHelpersKt).getValue());
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return ProtoAdapter.BOOL.encodedSizeWithTag(7, offerSheetKey.from_iab) + OfferSheetKey.PresentingContext.ADAPTER.encodedSizeWithTag(5, offerSheetKey.presenting_context) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OfferSheetKey offerSheetKey = (OfferSheetKey) obj;
        offerSheetKey.getClass();
        return OfferSheetKey.copy$default(offerSheetKey, null, ByteString.EMPTY, 31);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OfferSheetKey offerSheetKey = (OfferSheetKey) obj;
        offerSheetKey.getClass();
        SheetType.ADAPTER.encodeWithTag(protoWriter, 1, offerSheetKey.sheet_type);
        OfferType.ADAPTER.encodeWithTag(protoWriter, 2, offerSheetKey.offer_type);
        OfferSheetKey.PresentingContext.ADAPTER.encodeWithTag(protoWriter, 5, offerSheetKey.presenting_context);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, offerSheetKey.from_iab);
        ComposeHelpersKt composeHelpersKt = offerSheetKey.identifier_token;
        if (composeHelpersKt instanceof OfferSheetKey$IdentifierToken$OfferToken) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, ((OfferSheetKey$IdentifierToken$OfferToken) composeHelpersKt).getValue());
        } else if (composeHelpersKt instanceof OfferSheetKey$IdentifierToken$MerchantToken) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, ((OfferSheetKey$IdentifierToken$MerchantToken) composeHelpersKt).getValue());
        } else if (composeHelpersKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(offerSheetKey.unknownFields());
    }
}
