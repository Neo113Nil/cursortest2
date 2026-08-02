package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzdv;
import com.squareup.protos.franklin.common.GiftCardRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GiftCardRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        zzdv zzdvVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GiftCardRenderData((GiftCardRenderData.GiftCardType) obj, (String) obj2, zzdvVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(GiftCardRenderData.GiftCardType.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                zzdvVar = new GiftCardRenderData$Role$SenderData((GiftCardRenderData.SenderData) GiftCardRenderData.SenderData.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzdvVar = new GiftCardRenderData$Role$RecipientData((GiftCardRenderData.RecipientData) GiftCardRenderData.RecipientData.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GiftCardRenderData giftCardRenderData = (GiftCardRenderData) obj;
        reverseProtoWriter.getClass();
        giftCardRenderData.getClass();
        reverseProtoWriter.writeBytes(giftCardRenderData.unknownFields());
        zzdv zzdvVar = giftCardRenderData.role;
        if (zzdvVar instanceof GiftCardRenderData$Role$SenderData) {
            GiftCardRenderData.SenderData.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((GiftCardRenderData$Role$SenderData) zzdvVar).value);
        } else if (zzdvVar instanceof GiftCardRenderData$Role$RecipientData) {
            GiftCardRenderData.RecipientData.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((GiftCardRenderData$Role$RecipientData) zzdvVar).value);
        } else if (zzdvVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, giftCardRenderData.payment_identifier);
        GiftCardRenderData.GiftCardType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, giftCardRenderData.gift_card_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GiftCardRenderData giftCardRenderData = (GiftCardRenderData) obj;
        giftCardRenderData.getClass();
        int encodedSizeWithTag2 = ProtoAdapter.STRING.encodedSizeWithTag(2, giftCardRenderData.payment_identifier) + GiftCardRenderData.GiftCardType.ADAPTER.encodedSizeWithTag(1, giftCardRenderData.gift_card_type) + giftCardRenderData.unknownFields().getSize$okio();
        zzdv zzdvVar = giftCardRenderData.role;
        if (zzdvVar instanceof GiftCardRenderData$Role$SenderData) {
            encodedSizeWithTag = GiftCardRenderData.SenderData.ADAPTER.encodedSizeWithTag(3, ((GiftCardRenderData$Role$SenderData) zzdvVar).value);
        } else {
            if (!(zzdvVar instanceof GiftCardRenderData$Role$RecipientData)) {
                if (zzdvVar == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = GiftCardRenderData.RecipientData.ADAPTER.encodedSizeWithTag(4, ((GiftCardRenderData$Role$RecipientData) zzdvVar).value);
        }
        return encodedSizeWithTag + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GiftCardRenderData giftCardRenderData = (GiftCardRenderData) obj;
        giftCardRenderData.getClass();
        GiftCardRenderData.GiftCardType giftCardType = giftCardRenderData.gift_card_type;
        GiftCardRenderData.GiftCardType giftCardType2 = giftCardType != null ? (GiftCardRenderData.GiftCardType) GiftCardRenderData.GiftCardType.ADAPTER.redact(giftCardType) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = giftCardRenderData.payment_identifier;
        zzdv zzdvVar = giftCardRenderData.role;
        byteString.getClass();
        return new GiftCardRenderData(giftCardType2, str, zzdvVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GiftCardRenderData giftCardRenderData = (GiftCardRenderData) obj;
        giftCardRenderData.getClass();
        GiftCardRenderData.GiftCardType.ADAPTER.encodeWithTag(protoWriter, 1, giftCardRenderData.gift_card_type);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, giftCardRenderData.payment_identifier);
        zzdv zzdvVar = giftCardRenderData.role;
        if (zzdvVar instanceof GiftCardRenderData$Role$SenderData) {
            GiftCardRenderData.SenderData.ADAPTER.encodeWithTag(protoWriter, 3, ((GiftCardRenderData$Role$SenderData) zzdvVar).value);
        } else if (zzdvVar instanceof GiftCardRenderData$Role$RecipientData) {
            GiftCardRenderData.RecipientData.ADAPTER.encodeWithTag(protoWriter, 4, ((GiftCardRenderData$Role$RecipientData) zzdvVar).value);
        } else if (zzdvVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(giftCardRenderData.unknownFields());
    }
}
