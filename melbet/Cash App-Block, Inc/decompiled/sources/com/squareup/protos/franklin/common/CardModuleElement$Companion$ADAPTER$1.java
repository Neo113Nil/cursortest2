package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzds;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CardModuleElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzds zzdsVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModuleElement(zzdsVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    zzdsVar = new CardModuleElement$Type$UiControl((UiControl) UiControl.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    zzdsVar = new CardModuleElement$Type$SelectedBoostElement((SelectBoostElement) SelectBoostElement.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    zzdsVar = new CardModuleElement$Type$RoundUpsElement((RoundUpsElement) RoundUpsElement.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    zzdsVar = new CardModuleElement$Type$OverdraftCoverageElement((OverdraftCoverageElement) OverdraftCoverageElement.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    zzdsVar = new CardModuleElement$Type$SpendingInsightsElement((SpendingInsightsElement) SpendingInsightsElement.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    zzdsVar = new CardModuleElement$Type$MerchantBlockingElement((MerchantBlockingElement) MerchantBlockingElement.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    zzdsVar = new CardModuleElement$Type$AfterpayPrepurchaseElement((AfterpayPrepurchaseElement) AfterpayPrepurchaseElement.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModuleElement cardModuleElement = (CardModuleElement) obj;
        reverseProtoWriter.getClass();
        cardModuleElement.getClass();
        reverseProtoWriter.writeBytes(cardModuleElement.unknownFields());
        zzds zzdsVar = cardModuleElement.f1374type;
        if (zzdsVar instanceof CardModuleElement$Type$UiControl) {
            UiControl.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((CardModuleElement$Type$UiControl) zzdsVar).value);
            return;
        }
        if (zzdsVar instanceof CardModuleElement$Type$SelectedBoostElement) {
            SelectBoostElement.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((CardModuleElement$Type$SelectedBoostElement) zzdsVar).value);
            return;
        }
        if (zzdsVar instanceof CardModuleElement$Type$RoundUpsElement) {
            RoundUpsElement.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((CardModuleElement$Type$RoundUpsElement) zzdsVar).value);
            return;
        }
        if (zzdsVar instanceof CardModuleElement$Type$OverdraftCoverageElement) {
            OverdraftCoverageElement.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((CardModuleElement$Type$OverdraftCoverageElement) zzdsVar).value);
            return;
        }
        if (zzdsVar instanceof CardModuleElement$Type$SpendingInsightsElement) {
            SpendingInsightsElement.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((CardModuleElement$Type$SpendingInsightsElement) zzdsVar).value);
            return;
        }
        if (zzdsVar instanceof CardModuleElement$Type$MerchantBlockingElement) {
            MerchantBlockingElement.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((CardModuleElement$Type$MerchantBlockingElement) zzdsVar).value);
        } else if (zzdsVar instanceof CardModuleElement$Type$AfterpayPrepurchaseElement) {
            AfterpayPrepurchaseElement.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((CardModuleElement$Type$AfterpayPrepurchaseElement) zzdsVar).value);
        } else {
            if (zzdsVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        CardModuleElement cardModuleElement = (CardModuleElement) obj;
        cardModuleElement.getClass();
        int size$okio = cardModuleElement.unknownFields().getSize$okio();
        zzds zzdsVar = cardModuleElement.f1374type;
        if (zzdsVar instanceof CardModuleElement$Type$UiControl) {
            encodedSizeWithTag = UiControl.ADAPTER.encodedSizeWithTag(1, ((CardModuleElement$Type$UiControl) zzdsVar).value);
        } else if (zzdsVar instanceof CardModuleElement$Type$SelectedBoostElement) {
            encodedSizeWithTag = SelectBoostElement.ADAPTER.encodedSizeWithTag(2, ((CardModuleElement$Type$SelectedBoostElement) zzdsVar).value);
        } else if (zzdsVar instanceof CardModuleElement$Type$RoundUpsElement) {
            encodedSizeWithTag = RoundUpsElement.ADAPTER.encodedSizeWithTag(3, ((CardModuleElement$Type$RoundUpsElement) zzdsVar).value);
        } else if (zzdsVar instanceof CardModuleElement$Type$OverdraftCoverageElement) {
            encodedSizeWithTag = OverdraftCoverageElement.ADAPTER.encodedSizeWithTag(4, ((CardModuleElement$Type$OverdraftCoverageElement) zzdsVar).value);
        } else if (zzdsVar instanceof CardModuleElement$Type$SpendingInsightsElement) {
            encodedSizeWithTag = SpendingInsightsElement.ADAPTER.encodedSizeWithTag(5, ((CardModuleElement$Type$SpendingInsightsElement) zzdsVar).value);
        } else if (zzdsVar instanceof CardModuleElement$Type$MerchantBlockingElement) {
            encodedSizeWithTag = MerchantBlockingElement.ADAPTER.encodedSizeWithTag(6, ((CardModuleElement$Type$MerchantBlockingElement) zzdsVar).value);
        } else {
            if (!(zzdsVar instanceof CardModuleElement$Type$AfterpayPrepurchaseElement)) {
                if (zzdsVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = AfterpayPrepurchaseElement.ADAPTER.encodedSizeWithTag(7, ((CardModuleElement$Type$AfterpayPrepurchaseElement) zzdsVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModuleElement cardModuleElement = (CardModuleElement) obj;
        cardModuleElement.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzds zzdsVar = cardModuleElement.f1374type;
        byteString.getClass();
        return new CardModuleElement(zzdsVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModuleElement cardModuleElement = (CardModuleElement) obj;
        cardModuleElement.getClass();
        zzds zzdsVar = cardModuleElement.f1374type;
        if (zzdsVar instanceof CardModuleElement$Type$UiControl) {
            UiControl.ADAPTER.encodeWithTag(protoWriter, 1, ((CardModuleElement$Type$UiControl) zzdsVar).value);
        } else if (zzdsVar instanceof CardModuleElement$Type$SelectedBoostElement) {
            SelectBoostElement.ADAPTER.encodeWithTag(protoWriter, 2, ((CardModuleElement$Type$SelectedBoostElement) zzdsVar).value);
        } else if (zzdsVar instanceof CardModuleElement$Type$RoundUpsElement) {
            RoundUpsElement.ADAPTER.encodeWithTag(protoWriter, 3, ((CardModuleElement$Type$RoundUpsElement) zzdsVar).value);
        } else if (zzdsVar instanceof CardModuleElement$Type$OverdraftCoverageElement) {
            OverdraftCoverageElement.ADAPTER.encodeWithTag(protoWriter, 4, ((CardModuleElement$Type$OverdraftCoverageElement) zzdsVar).value);
        } else if (zzdsVar instanceof CardModuleElement$Type$SpendingInsightsElement) {
            SpendingInsightsElement.ADAPTER.encodeWithTag(protoWriter, 5, ((CardModuleElement$Type$SpendingInsightsElement) zzdsVar).value);
        } else if (zzdsVar instanceof CardModuleElement$Type$MerchantBlockingElement) {
            MerchantBlockingElement.ADAPTER.encodeWithTag(protoWriter, 6, ((CardModuleElement$Type$MerchantBlockingElement) zzdsVar).value);
        } else if (zzdsVar instanceof CardModuleElement$Type$AfterpayPrepurchaseElement) {
            AfterpayPrepurchaseElement.ADAPTER.encodeWithTag(protoWriter, 7, ((CardModuleElement$Type$AfterpayPrepurchaseElement) zzdsVar).value);
        } else if (zzdsVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(cardModuleElement.unknownFields());
    }
}
