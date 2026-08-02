package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdb;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CardCustomizationInputs$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzdb zzdbVar = null;
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardCustomizationInputs(zzdbVar, (Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzdbVar = new CardCustomizationInputs$CustomizationSource$CustomDesign((CustomDesign) CustomDesign.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                zzdbVar = new CardCustomizationInputs$CustomizationSource$PresetDesign((PresetDesign) PresetDesign.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardCustomizationInputs cardCustomizationInputs = (CardCustomizationInputs) obj;
        reverseProtoWriter.getClass();
        cardCustomizationInputs.getClass();
        reverseProtoWriter.writeBytes(cardCustomizationInputs.unknownFields());
        zzdb zzdbVar = cardCustomizationInputs.customization_source;
        if (zzdbVar instanceof CardCustomizationInputs$CustomizationSource$CustomDesign) {
            CustomDesign.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((CardCustomizationInputs$CustomizationSource$CustomDesign) zzdbVar).value);
        } else if (zzdbVar instanceof CardCustomizationInputs$CustomizationSource$PresetDesign) {
            PresetDesign.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((CardCustomizationInputs$CustomizationSource$PresetDesign) zzdbVar).value);
        } else if (zzdbVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, cardCustomizationInputs.include_cashtag);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        CardCustomizationInputs cardCustomizationInputs = (CardCustomizationInputs) obj;
        cardCustomizationInputs.getClass();
        int size$okio = cardCustomizationInputs.unknownFields().getSize$okio();
        zzdb zzdbVar = cardCustomizationInputs.customization_source;
        if (zzdbVar instanceof CardCustomizationInputs$CustomizationSource$CustomDesign) {
            encodedSizeWithTag = CustomDesign.ADAPTER.encodedSizeWithTag(1, ((CardCustomizationInputs$CustomizationSource$CustomDesign) zzdbVar).value);
        } else {
            if (!(zzdbVar instanceof CardCustomizationInputs$CustomizationSource$PresetDesign)) {
                if (zzdbVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.BOOL.encodedSizeWithTag(3, cardCustomizationInputs.include_cashtag) + size$okio;
            }
            encodedSizeWithTag = PresetDesign.ADAPTER.encodedSizeWithTag(2, ((CardCustomizationInputs$CustomizationSource$PresetDesign) zzdbVar).value);
        }
        size$okio += encodedSizeWithTag;
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, cardCustomizationInputs.include_cashtag) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardCustomizationInputs cardCustomizationInputs = (CardCustomizationInputs) obj;
        cardCustomizationInputs.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzdb zzdbVar = cardCustomizationInputs.customization_source;
        Boolean bool = cardCustomizationInputs.include_cashtag;
        byteString.getClass();
        return new CardCustomizationInputs(zzdbVar, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardCustomizationInputs cardCustomizationInputs = (CardCustomizationInputs) obj;
        cardCustomizationInputs.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, cardCustomizationInputs.include_cashtag);
        zzdb zzdbVar = cardCustomizationInputs.customization_source;
        if (zzdbVar instanceof CardCustomizationInputs$CustomizationSource$CustomDesign) {
            CustomDesign.ADAPTER.encodeWithTag(protoWriter, 1, ((CardCustomizationInputs$CustomizationSource$CustomDesign) zzdbVar).value);
        } else if (zzdbVar instanceof CardCustomizationInputs$CustomizationSource$PresetDesign) {
            PresetDesign.ADAPTER.encodeWithTag(protoWriter, 2, ((CardCustomizationInputs$CustomizationSource$PresetDesign) zzdbVar).value);
        } else if (zzdbVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(cardCustomizationInputs.unknownFields());
    }
}
