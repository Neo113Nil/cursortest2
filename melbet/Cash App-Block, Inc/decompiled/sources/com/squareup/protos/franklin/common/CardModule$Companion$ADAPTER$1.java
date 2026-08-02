package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CardModule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        CardModule.Type type2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule(type2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    type2 = new CardModule.Type.HeroIssuedCard((CardModule.HeroIssuedCardModule) CardModule.HeroIssuedCardModule.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    type2 = new CardModule.Type.HeroNullState((CardModule.HeroNullStateModule) CardModule.HeroNullStateModule.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    type2 = new CardModule.Type.Bubble((CardModule.BubbleModule) CardModule.BubbleModule.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    type2 = new CardModule.Type.List((CardModule.ListModule) CardModule.ListModule.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    type2 = new CardModule.Type.GiftCards((CardModule.GiftCardsModule) CardModule.GiftCardsModule.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    type2 = new CardModule.Type.SpendingInsights((CardModule.SpendingInsightsModule) CardModule.SpendingInsightsModule.ADAPTER.decode(protoReader));
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
        CardModule.Type type2 = cardModule.f1373type;
        if (type2 instanceof CardModule.Type.HeroIssuedCard) {
            CardModule.HeroIssuedCardModule.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((CardModule.Type.HeroIssuedCard) type2).value);
            return;
        }
        if (type2 instanceof CardModule.Type.HeroNullState) {
            CardModule.HeroNullStateModule.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((CardModule.Type.HeroNullState) type2).value);
            return;
        }
        if (type2 instanceof CardModule.Type.Bubble) {
            CardModule.BubbleModule.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((CardModule.Type.Bubble) type2).value);
            return;
        }
        if (type2 instanceof CardModule.Type.List) {
            CardModule.ListModule.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((CardModule.Type.List) type2).value);
            return;
        }
        if (type2 instanceof CardModule.Type.GiftCards) {
            CardModule.GiftCardsModule.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((CardModule.Type.GiftCards) type2).value);
        } else if (type2 instanceof CardModule.Type.SpendingInsights) {
            CardModule.SpendingInsightsModule.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((CardModule.Type.SpendingInsights) type2).value);
        } else {
            if (type2 == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        CardModule cardModule = (CardModule) obj;
        cardModule.getClass();
        int size$okio = cardModule.unknownFields().getSize$okio();
        CardModule.Type type2 = cardModule.f1373type;
        if (type2 instanceof CardModule.Type.HeroIssuedCard) {
            encodedSizeWithTag = CardModule.HeroIssuedCardModule.ADAPTER.encodedSizeWithTag(1, ((CardModule.Type.HeroIssuedCard) type2).value);
        } else if (type2 instanceof CardModule.Type.HeroNullState) {
            encodedSizeWithTag = CardModule.HeroNullStateModule.ADAPTER.encodedSizeWithTag(2, ((CardModule.Type.HeroNullState) type2).value);
        } else if (type2 instanceof CardModule.Type.Bubble) {
            encodedSizeWithTag = CardModule.BubbleModule.ADAPTER.encodedSizeWithTag(3, ((CardModule.Type.Bubble) type2).value);
        } else if (type2 instanceof CardModule.Type.List) {
            encodedSizeWithTag = CardModule.ListModule.ADAPTER.encodedSizeWithTag(4, ((CardModule.Type.List) type2).value);
        } else if (type2 instanceof CardModule.Type.GiftCards) {
            encodedSizeWithTag = CardModule.GiftCardsModule.ADAPTER.encodedSizeWithTag(5, ((CardModule.Type.GiftCards) type2).value);
        } else {
            if (!(type2 instanceof CardModule.Type.SpendingInsights)) {
                if (type2 == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = CardModule.SpendingInsightsModule.ADAPTER.encodedSizeWithTag(6, ((CardModule.Type.SpendingInsights) type2).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule cardModule = (CardModule) obj;
        cardModule.getClass();
        ByteString byteString = ByteString.EMPTY;
        CardModule.Type type2 = cardModule.f1373type;
        byteString.getClass();
        return new CardModule(type2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule cardModule = (CardModule) obj;
        cardModule.getClass();
        CardModule.Type type2 = cardModule.f1373type;
        if (type2 instanceof CardModule.Type.HeroIssuedCard) {
            CardModule.HeroIssuedCardModule.ADAPTER.encodeWithTag(protoWriter, 1, ((CardModule.Type.HeroIssuedCard) type2).value);
        } else if (type2 instanceof CardModule.Type.HeroNullState) {
            CardModule.HeroNullStateModule.ADAPTER.encodeWithTag(protoWriter, 2, ((CardModule.Type.HeroNullState) type2).value);
        } else if (type2 instanceof CardModule.Type.Bubble) {
            CardModule.BubbleModule.ADAPTER.encodeWithTag(protoWriter, 3, ((CardModule.Type.Bubble) type2).value);
        } else if (type2 instanceof CardModule.Type.List) {
            CardModule.ListModule.ADAPTER.encodeWithTag(protoWriter, 4, ((CardModule.Type.List) type2).value);
        } else if (type2 instanceof CardModule.Type.GiftCards) {
            CardModule.GiftCardsModule.ADAPTER.encodeWithTag(protoWriter, 5, ((CardModule.Type.GiftCards) type2).value);
        } else if (type2 instanceof CardModule.Type.SpendingInsights) {
            CardModule.SpendingInsightsModule.ADAPTER.encodeWithTag(protoWriter, 6, ((CardModule.Type.SpendingInsights) type2).value);
        } else if (type2 != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(cardModule.unknownFields());
    }
}
