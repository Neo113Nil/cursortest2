package com.squareup.protos.cash.postcard;

import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$CardElementAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzkk zzkkVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.CardElementAction(zzkkVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzkkVar = new CardModule$CardElementAction$Type$DoClientRoute((CardModule.CardElementAction.DoClientRoute) CardModule.CardElementAction.DoClientRoute.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                zzkkVar = new CardModule$CardElementAction$Type$DoClientScenario((CardModule.CardElementAction.DoClientScenario) CardModule.CardElementAction.DoClientScenario.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                zzkkVar = new CardModule$CardElementAction$Type$OpenDialog((CardModule.CardElementAction.OpenDialog) CardModule.CardElementAction.OpenDialog.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzkkVar = new CardModule$CardElementAction$Type$CopyCardNumber((CardModule.CardElementAction.CopyCardNumber) CardModule.CardElementAction.CopyCardNumber.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.CardElementAction cardElementAction = (CardModule.CardElementAction) obj;
        reverseProtoWriter.getClass();
        cardElementAction.getClass();
        reverseProtoWriter.writeBytes(cardElementAction.unknownFields());
        zzkk zzkkVar = cardElementAction.f1331type;
        if (zzkkVar instanceof CardModule$CardElementAction$Type$DoClientRoute) {
            CardModule.CardElementAction.DoClientRoute.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((CardModule$CardElementAction$Type$DoClientRoute) zzkkVar).value);
            return;
        }
        if (zzkkVar instanceof CardModule$CardElementAction$Type$DoClientScenario) {
            CardModule.CardElementAction.DoClientScenario.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((CardModule$CardElementAction$Type$DoClientScenario) zzkkVar).value);
            return;
        }
        if (zzkkVar instanceof CardModule$CardElementAction$Type$OpenDialog) {
            CardModule.CardElementAction.OpenDialog.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((CardModule$CardElementAction$Type$OpenDialog) zzkkVar).value);
        } else if (zzkkVar instanceof CardModule$CardElementAction$Type$CopyCardNumber) {
            CardModule.CardElementAction.CopyCardNumber.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((CardModule$CardElementAction$Type$CopyCardNumber) zzkkVar).value);
        } else {
            if (zzkkVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        CardModule.CardElementAction cardElementAction = (CardModule.CardElementAction) obj;
        cardElementAction.getClass();
        int size$okio = cardElementAction.unknownFields().getSize$okio();
        zzkk zzkkVar = cardElementAction.f1331type;
        if (zzkkVar instanceof CardModule$CardElementAction$Type$DoClientRoute) {
            encodedSizeWithTag = CardModule.CardElementAction.DoClientRoute.ADAPTER.encodedSizeWithTag(1, ((CardModule$CardElementAction$Type$DoClientRoute) zzkkVar).value);
        } else if (zzkkVar instanceof CardModule$CardElementAction$Type$DoClientScenario) {
            encodedSizeWithTag = CardModule.CardElementAction.DoClientScenario.ADAPTER.encodedSizeWithTag(2, ((CardModule$CardElementAction$Type$DoClientScenario) zzkkVar).value);
        } else if (zzkkVar instanceof CardModule$CardElementAction$Type$OpenDialog) {
            encodedSizeWithTag = CardModule.CardElementAction.OpenDialog.ADAPTER.encodedSizeWithTag(3, ((CardModule$CardElementAction$Type$OpenDialog) zzkkVar).value);
        } else {
            if (!(zzkkVar instanceof CardModule$CardElementAction$Type$CopyCardNumber)) {
                if (zzkkVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = CardModule.CardElementAction.CopyCardNumber.ADAPTER.encodedSizeWithTag(4, ((CardModule$CardElementAction$Type$CopyCardNumber) zzkkVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.CardElementAction cardElementAction = (CardModule.CardElementAction) obj;
        cardElementAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzkk zzkkVar = cardElementAction.f1331type;
        byteString.getClass();
        return new CardModule.CardElementAction(zzkkVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.CardElementAction cardElementAction = (CardModule.CardElementAction) obj;
        cardElementAction.getClass();
        zzkk zzkkVar = cardElementAction.f1331type;
        if (zzkkVar instanceof CardModule$CardElementAction$Type$DoClientRoute) {
            CardModule.CardElementAction.DoClientRoute.ADAPTER.encodeWithTag(protoWriter, 1, ((CardModule$CardElementAction$Type$DoClientRoute) zzkkVar).value);
        } else if (zzkkVar instanceof CardModule$CardElementAction$Type$DoClientScenario) {
            CardModule.CardElementAction.DoClientScenario.ADAPTER.encodeWithTag(protoWriter, 2, ((CardModule$CardElementAction$Type$DoClientScenario) zzkkVar).value);
        } else if (zzkkVar instanceof CardModule$CardElementAction$Type$OpenDialog) {
            CardModule.CardElementAction.OpenDialog.ADAPTER.encodeWithTag(protoWriter, 3, ((CardModule$CardElementAction$Type$OpenDialog) zzkkVar).value);
        } else if (zzkkVar instanceof CardModule$CardElementAction$Type$CopyCardNumber) {
            CardModule.CardElementAction.CopyCardNumber.ADAPTER.encodeWithTag(protoWriter, 4, ((CardModule$CardElementAction$Type$CopyCardNumber) zzkkVar).value);
        } else if (zzkkVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(cardElementAction.unknownFields());
    }
}
