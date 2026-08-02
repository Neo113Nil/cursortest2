package com.squareup.protos.cash.postcard;

import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$StatusElement$Accessory$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzkm zzkmVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.StatusElement.Accessory(zzkmVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzkmVar = new CardModule$StatusElement$Accessory$Type$PillButton((CardModule.Button) CardModule.Button.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                zzkmVar = new CardModule$StatusElement$Accessory$Type$Push((CardModule.Push) CardModule.Push.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzkmVar = new CardModule$StatusElement$Accessory$Type$Toggle((CardModule.Toggle) CardModule.Toggle.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.StatusElement.Accessory accessory = (CardModule.StatusElement.Accessory) obj;
        reverseProtoWriter.getClass();
        accessory.getClass();
        reverseProtoWriter.writeBytes(accessory.unknownFields());
        zzkm zzkmVar = accessory.f1333type;
        if (zzkmVar instanceof CardModule$StatusElement$Accessory$Type$PillButton) {
            CardModule.Button.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((CardModule$StatusElement$Accessory$Type$PillButton) zzkmVar).value);
            return;
        }
        if (zzkmVar instanceof CardModule$StatusElement$Accessory$Type$Push) {
            CardModule.Push.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((CardModule$StatusElement$Accessory$Type$Push) zzkmVar).value);
        } else if (zzkmVar instanceof CardModule$StatusElement$Accessory$Type$Toggle) {
            CardModule.Toggle.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((CardModule$StatusElement$Accessory$Type$Toggle) zzkmVar).value);
        } else {
            if (zzkmVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        CardModule.StatusElement.Accessory accessory = (CardModule.StatusElement.Accessory) obj;
        accessory.getClass();
        int size$okio = accessory.unknownFields().getSize$okio();
        zzkm zzkmVar = accessory.f1333type;
        if (zzkmVar instanceof CardModule$StatusElement$Accessory$Type$PillButton) {
            encodedSizeWithTag = CardModule.Button.ADAPTER.encodedSizeWithTag(1, ((CardModule$StatusElement$Accessory$Type$PillButton) zzkmVar).value);
        } else if (zzkmVar instanceof CardModule$StatusElement$Accessory$Type$Push) {
            encodedSizeWithTag = CardModule.Push.ADAPTER.encodedSizeWithTag(2, ((CardModule$StatusElement$Accessory$Type$Push) zzkmVar).value);
        } else {
            if (!(zzkmVar instanceof CardModule$StatusElement$Accessory$Type$Toggle)) {
                if (zzkmVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = CardModule.Toggle.ADAPTER.encodedSizeWithTag(3, ((CardModule$StatusElement$Accessory$Type$Toggle) zzkmVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.StatusElement.Accessory accessory = (CardModule.StatusElement.Accessory) obj;
        accessory.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzkm zzkmVar = accessory.f1333type;
        byteString.getClass();
        return new CardModule.StatusElement.Accessory(zzkmVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.StatusElement.Accessory accessory = (CardModule.StatusElement.Accessory) obj;
        accessory.getClass();
        zzkm zzkmVar = accessory.f1333type;
        if (zzkmVar instanceof CardModule$StatusElement$Accessory$Type$PillButton) {
            CardModule.Button.ADAPTER.encodeWithTag(protoWriter, 1, ((CardModule$StatusElement$Accessory$Type$PillButton) zzkmVar).value);
        } else if (zzkmVar instanceof CardModule$StatusElement$Accessory$Type$Push) {
            CardModule.Push.ADAPTER.encodeWithTag(protoWriter, 2, ((CardModule$StatusElement$Accessory$Type$Push) zzkmVar).value);
        } else if (zzkmVar instanceof CardModule$StatusElement$Accessory$Type$Toggle) {
            CardModule.Toggle.ADAPTER.encodeWithTag(protoWriter, 3, ((CardModule$StatusElement$Accessory$Type$Toggle) zzkmVar).value);
        } else if (zzkmVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(accessory.unknownFields());
    }
}
