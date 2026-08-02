package com.squareup.protos.lending;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zziz;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LoanRepaymentSelectionData$Choice$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        zziz loanRepaymentSelectionData$Choice$Routing$ActionUrl;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        zziz zzizVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoanRepaymentSelectionData.Choice((LocalizedString) obj, (LocalizedString) obj2, (LoanRepaymentSelectionData.Choice.Icon) obj3, zzizVar, (LocalizedString) obj4, (Long) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    loanRepaymentSelectionData$Choice$Routing$ActionUrl = new LoanRepaymentSelectionData$Choice$Routing$ActionUrl((String) ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 2:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    continue;
                case 3:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    continue;
                case 4:
                    try {
                        obj3 = LoanRepaymentSelectionData.Choice.Icon.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    loanRepaymentSelectionData$Choice$Routing$ActionUrl = new LoanRepaymentSelectionData$Choice$Routing$AdditionalSelection((LoanRepaymentSelectionData) LoanRepaymentSelectionData.ADAPTER.decode(protoReader));
                    break;
                case 6:
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
                case 7:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    continue;
                case 8:
                    obj5 = ProtoAdapter.INT64.decode(protoReader);
                    continue;
            }
            zzizVar = loanRepaymentSelectionData$Choice$Routing$ActionUrl;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LoanRepaymentSelectionData.Choice choice = (LoanRepaymentSelectionData.Choice) obj;
        reverseProtoWriter.getClass();
        choice.getClass();
        reverseProtoWriter.writeBytes(choice.unknownFields());
        zziz zzizVar = choice.routing;
        if (zzizVar instanceof LoanRepaymentSelectionData$Choice$Routing$ActionUrl) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, ((LoanRepaymentSelectionData$Choice$Routing$ActionUrl) zzizVar).value);
        } else if (zzizVar instanceof LoanRepaymentSelectionData$Choice$Routing$AdditionalSelection) {
            LoanRepaymentSelectionData.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((LoanRepaymentSelectionData$Choice$Routing$AdditionalSelection) zzizVar).value);
        } else if (zzizVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 8, choice.timestamp);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, choice.accessory_text);
        LoanRepaymentSelectionData.Choice.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 4, choice.icon);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, choice.secondary_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, choice.primary_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        LoanRepaymentSelectionData.Choice choice = (LoanRepaymentSelectionData.Choice) obj;
        choice.getClass();
        int size$okio = choice.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag2 = LoanRepaymentSelectionData.Choice.Icon.ADAPTER.encodedSizeWithTag(4, choice.icon) + protoAdapter.encodedSizeWithTag(3, choice.secondary_text) + protoAdapter.encodedSizeWithTag(2, choice.primary_text) + size$okio;
        zziz zzizVar = choice.routing;
        if (zzizVar instanceof LoanRepaymentSelectionData$Choice$Routing$ActionUrl) {
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, ((LoanRepaymentSelectionData$Choice$Routing$ActionUrl) zzizVar).value);
        } else {
            if (!(zzizVar instanceof LoanRepaymentSelectionData$Choice$Routing$AdditionalSelection)) {
                if (zzizVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.INT64.encodedSizeWithTag(8, choice.timestamp) + protoAdapter.encodedSizeWithTag(7, choice.accessory_text) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = LoanRepaymentSelectionData.ADAPTER.encodedSizeWithTag(5, ((LoanRepaymentSelectionData$Choice$Routing$AdditionalSelection) zzizVar).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return ProtoAdapter.INT64.encodedSizeWithTag(8, choice.timestamp) + protoAdapter.encodedSizeWithTag(7, choice.accessory_text) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoanRepaymentSelectionData.Choice choice = (LoanRepaymentSelectionData.Choice) obj;
        choice.getClass();
        LocalizedString localizedString = choice.primary_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = choice.secondary_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = choice.accessory_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        LoanRepaymentSelectionData.Choice.Icon icon = choice.icon;
        zziz zzizVar = choice.routing;
        Long l = choice.timestamp;
        byteString.getClass();
        return new LoanRepaymentSelectionData.Choice(localizedString2, localizedString4, icon, zzizVar, localizedString6, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoanRepaymentSelectionData.Choice choice = (LoanRepaymentSelectionData.Choice) obj;
        choice.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, choice.primary_text);
        protoAdapter.encodeWithTag(protoWriter, 3, choice.secondary_text);
        LoanRepaymentSelectionData.Choice.Icon.ADAPTER.encodeWithTag(protoWriter, 4, choice.icon);
        protoAdapter.encodeWithTag(protoWriter, 7, choice.accessory_text);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, choice.timestamp);
        zziz zzizVar = choice.routing;
        if (zzizVar instanceof LoanRepaymentSelectionData$Choice$Routing$ActionUrl) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, ((LoanRepaymentSelectionData$Choice$Routing$ActionUrl) zzizVar).value);
        } else if (zzizVar instanceof LoanRepaymentSelectionData$Choice$Routing$AdditionalSelection) {
            LoanRepaymentSelectionData.ADAPTER.encodeWithTag(protoWriter, 5, ((LoanRepaymentSelectionData$Choice$Routing$AdditionalSelection) zzizVar).value);
        } else if (zzizVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(choice.unknownFields());
    }
}
