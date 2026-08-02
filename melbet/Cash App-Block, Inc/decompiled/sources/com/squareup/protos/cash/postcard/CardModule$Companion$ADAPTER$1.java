package com.squareup.protos.cash.postcard;

import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        CardModule.Type type2 = null;
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule(type2, (CardModule.UseCase) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    type2 = new CardModule.Type.HeroIssuedCard((CardModule.HeroIssuedCardModule) CardModule.HeroIssuedCardModule.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    type2 = new CardModule.Type.HeroNullState((CardModule.HeroNullStateModule) CardModule.HeroNullStateModule.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    type2 = new CardModule.Type.Status((CardModule.StatusModule) CardModule.StatusModule.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    type2 = new CardModule.Type.Divider((CardModule.DividerModule) CardModule.DividerModule.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    type2 = new CardModule.Type.Header((CardModule.HeaderModule) CardModule.HeaderModule.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    type2 = new CardModule.Type.LineItem((CardModule.LineItemModule) CardModule.LineItemModule.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    type2 = new CardModule.Type.DeliveryStatus((CardModule.DeliveryStatusModule) CardModule.DeliveryStatusModule.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    try {
                        obj = CardModule.UseCase.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 9:
                    type2 = new CardModule.Type.CallToAction((CardModule.CallToActionModule) CardModule.CallToActionModule.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    type2 = new CardModule.Type.Upsell((CardModule.UpsellModule) CardModule.UpsellModule.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule cardModule = (CardModule) obj;
        reverseProtoWriter.getClass();
        cardModule.getClass();
        reverseProtoWriter.writeBytes(cardModule.unknownFields());
        CardModule.Type type2 = cardModule.f1328type;
        if (type2 instanceof CardModule.Type.HeroIssuedCard) {
            CardModule.HeroIssuedCardModule.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((CardModule.Type.HeroIssuedCard) type2).value);
        } else if (type2 instanceof CardModule.Type.HeroNullState) {
            CardModule.HeroNullStateModule.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((CardModule.Type.HeroNullState) type2).value);
        } else if (type2 instanceof CardModule.Type.Status) {
            CardModule.StatusModule.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((CardModule.Type.Status) type2).value);
        } else if (type2 instanceof CardModule.Type.Divider) {
            CardModule.DividerModule.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((CardModule.Type.Divider) type2).value);
        } else if (type2 instanceof CardModule.Type.Header) {
            CardModule.HeaderModule.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((CardModule.Type.Header) type2).value);
        } else if (type2 instanceof CardModule.Type.LineItem) {
            CardModule.LineItemModule.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((CardModule.Type.LineItem) type2).value);
        } else if (type2 instanceof CardModule.Type.DeliveryStatus) {
            CardModule.DeliveryStatusModule.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((CardModule.Type.DeliveryStatus) type2).value);
        } else if (type2 instanceof CardModule.Type.CallToAction) {
            CardModule.CallToActionModule.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((CardModule.Type.CallToAction) type2).value);
        } else if (type2 instanceof CardModule.Type.Upsell) {
            CardModule.UpsellModule.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((CardModule.Type.Upsell) type2).value);
        } else if (type2 != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        CardModule.UseCase.ADAPTER.encodeWithTag(reverseProtoWriter, 8, cardModule.use_case);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        CardModule cardModule = (CardModule) obj;
        cardModule.getClass();
        int size$okio = cardModule.unknownFields().getSize$okio();
        CardModule.Type type2 = cardModule.f1328type;
        if (type2 instanceof CardModule.Type.HeroIssuedCard) {
            encodedSizeWithTag = CardModule.HeroIssuedCardModule.ADAPTER.encodedSizeWithTag(1, ((CardModule.Type.HeroIssuedCard) type2).value);
        } else if (type2 instanceof CardModule.Type.HeroNullState) {
            encodedSizeWithTag = CardModule.HeroNullStateModule.ADAPTER.encodedSizeWithTag(2, ((CardModule.Type.HeroNullState) type2).value);
        } else if (type2 instanceof CardModule.Type.Status) {
            encodedSizeWithTag = CardModule.StatusModule.ADAPTER.encodedSizeWithTag(3, ((CardModule.Type.Status) type2).value);
        } else if (type2 instanceof CardModule.Type.Divider) {
            encodedSizeWithTag = CardModule.DividerModule.ADAPTER.encodedSizeWithTag(4, ((CardModule.Type.Divider) type2).value);
        } else if (type2 instanceof CardModule.Type.Header) {
            encodedSizeWithTag = CardModule.HeaderModule.ADAPTER.encodedSizeWithTag(5, ((CardModule.Type.Header) type2).value);
        } else if (type2 instanceof CardModule.Type.LineItem) {
            encodedSizeWithTag = CardModule.LineItemModule.ADAPTER.encodedSizeWithTag(6, ((CardModule.Type.LineItem) type2).value);
        } else if (type2 instanceof CardModule.Type.DeliveryStatus) {
            encodedSizeWithTag = CardModule.DeliveryStatusModule.ADAPTER.encodedSizeWithTag(7, ((CardModule.Type.DeliveryStatus) type2).value);
        } else if (type2 instanceof CardModule.Type.CallToAction) {
            encodedSizeWithTag = CardModule.CallToActionModule.ADAPTER.encodedSizeWithTag(9, ((CardModule.Type.CallToAction) type2).value);
        } else {
            if (!(type2 instanceof CardModule.Type.Upsell)) {
                if (type2 != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return CardModule.UseCase.ADAPTER.encodedSizeWithTag(8, cardModule.use_case) + size$okio;
            }
            encodedSizeWithTag = CardModule.UpsellModule.ADAPTER.encodedSizeWithTag(10, ((CardModule.Type.Upsell) type2).value);
        }
        size$okio += encodedSizeWithTag;
        return CardModule.UseCase.ADAPTER.encodedSizeWithTag(8, cardModule.use_case) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule cardModule = (CardModule) obj;
        cardModule.getClass();
        ByteString byteString = ByteString.EMPTY;
        CardModule.Type type2 = cardModule.f1328type;
        CardModule.UseCase useCase = cardModule.use_case;
        byteString.getClass();
        return new CardModule(type2, useCase, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule cardModule = (CardModule) obj;
        cardModule.getClass();
        CardModule.UseCase.ADAPTER.encodeWithTag(protoWriter, 8, cardModule.use_case);
        CardModule.Type type2 = cardModule.f1328type;
        if (type2 instanceof CardModule.Type.HeroIssuedCard) {
            CardModule.HeroIssuedCardModule.ADAPTER.encodeWithTag(protoWriter, 1, ((CardModule.Type.HeroIssuedCard) type2).value);
        } else if (type2 instanceof CardModule.Type.HeroNullState) {
            CardModule.HeroNullStateModule.ADAPTER.encodeWithTag(protoWriter, 2, ((CardModule.Type.HeroNullState) type2).value);
        } else if (type2 instanceof CardModule.Type.Status) {
            CardModule.StatusModule.ADAPTER.encodeWithTag(protoWriter, 3, ((CardModule.Type.Status) type2).value);
        } else if (type2 instanceof CardModule.Type.Divider) {
            CardModule.DividerModule.ADAPTER.encodeWithTag(protoWriter, 4, ((CardModule.Type.Divider) type2).value);
        } else if (type2 instanceof CardModule.Type.Header) {
            CardModule.HeaderModule.ADAPTER.encodeWithTag(protoWriter, 5, ((CardModule.Type.Header) type2).value);
        } else if (type2 instanceof CardModule.Type.LineItem) {
            CardModule.LineItemModule.ADAPTER.encodeWithTag(protoWriter, 6, ((CardModule.Type.LineItem) type2).value);
        } else if (type2 instanceof CardModule.Type.DeliveryStatus) {
            CardModule.DeliveryStatusModule.ADAPTER.encodeWithTag(protoWriter, 7, ((CardModule.Type.DeliveryStatus) type2).value);
        } else if (type2 instanceof CardModule.Type.CallToAction) {
            CardModule.CallToActionModule.ADAPTER.encodeWithTag(protoWriter, 9, ((CardModule.Type.CallToAction) type2).value);
        } else if (type2 instanceof CardModule.Type.Upsell) {
            CardModule.UpsellModule.ADAPTER.encodeWithTag(protoWriter, 10, ((CardModule.Type.Upsell) type2).value);
        } else if (type2 != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(cardModule.unknownFields());
    }
}
