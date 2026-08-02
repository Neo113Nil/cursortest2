package com.squareup.protos.cash.loyalizer.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjj;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionDetailsPlaceholder;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        zzjj zzjjVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.Section((String) obj, zzjjVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                zzjjVar = new LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text((String) ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 3) {
                zzjjVar = new LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime((LoyaltyPromotionAvailability) LoyaltyPromotionAvailability.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzjjVar = new LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations((LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData) LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.Section section = (LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.Section) obj;
        reverseProtoWriter.getClass();
        section.getClass();
        reverseProtoWriter.writeBytes(section.unknownFields());
        zzjj zzjjVar = section.content;
        if (zzjjVar instanceof LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, ((LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text) zzjjVar).value);
        } else if (zzjjVar instanceof LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime) {
            LoyaltyPromotionAvailability.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime) zzjjVar).value);
        } else if (zzjjVar instanceof LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations) {
            LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations) zzjjVar).value);
        } else if (zzjjVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, section.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.Section section = (LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.Section) obj;
        section.getClass();
        int size$okio = section.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, section.title) + size$okio;
        zzjj zzjjVar = section.content;
        if (zzjjVar instanceof LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text) {
            return protoAdapter.encodedSizeWithTag(2, ((LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text) zzjjVar).value) + encodedSizeWithTag;
        }
        if (zzjjVar instanceof LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime) {
            return LoyaltyPromotionAvailability.ADAPTER.encodedSizeWithTag(3, ((LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime) zzjjVar).value) + encodedSizeWithTag;
        }
        if (zzjjVar instanceof LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations) {
            return LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData.ADAPTER.encodedSizeWithTag(4, ((LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations) zzjjVar).value) + encodedSizeWithTag;
        }
        if (zzjjVar == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.Section section = (LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.Section) obj;
        section.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = section.title;
        zzjj zzjjVar = section.content;
        byteString.getClass();
        return new LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.Section(str, zzjjVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.Section section = (LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.Section) obj;
        section.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, section.title);
        zzjj zzjjVar = section.content;
        if (zzjjVar instanceof LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text) {
            protoAdapter.encodeWithTag(protoWriter, 2, ((LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text) zzjjVar).value);
        } else if (zzjjVar instanceof LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime) {
            LoyaltyPromotionAvailability.ADAPTER.encodeWithTag(protoWriter, 3, ((LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime) zzjjVar).value);
        } else if (zzjjVar instanceof LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations) {
            LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData.ADAPTER.encodeWithTag(protoWriter, 4, ((LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations) zzjjVar).value);
        } else if (zzjjVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(section.unknownFields());
    }
}
