package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.treehouse.TreehouseAppContentKt;
import com.squareup.protos.cash.cashsuggest.api.HeroBalanceSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class HeroBalanceSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        TreehouseAppContentKt treehouseAppContentKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HeroBalanceSection(treehouseAppContentKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                treehouseAppContentKt = new HeroBalanceSection$Content$NoBalance((HeroBalanceSection.NoBalance) HeroBalanceSection.NoBalance.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                treehouseAppContentKt = new HeroBalanceSection$Content$PaymentCalendar((HeroBalanceSection.PaymentCalendar) HeroBalanceSection.PaymentCalendar.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HeroBalanceSection heroBalanceSection = (HeroBalanceSection) obj;
        reverseProtoWriter.getClass();
        heroBalanceSection.getClass();
        reverseProtoWriter.writeBytes(heroBalanceSection.unknownFields());
        TreehouseAppContentKt treehouseAppContentKt = heroBalanceSection.content;
        if (treehouseAppContentKt instanceof HeroBalanceSection$Content$NoBalance) {
            HeroBalanceSection.NoBalance.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((HeroBalanceSection$Content$NoBalance) treehouseAppContentKt).value);
        } else if (treehouseAppContentKt instanceof HeroBalanceSection$Content$PaymentCalendar) {
            HeroBalanceSection.PaymentCalendar.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((HeroBalanceSection$Content$PaymentCalendar) treehouseAppContentKt).value);
        } else {
            if (treehouseAppContentKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        HeroBalanceSection heroBalanceSection = (HeroBalanceSection) obj;
        heroBalanceSection.getClass();
        int size$okio = heroBalanceSection.unknownFields().getSize$okio();
        TreehouseAppContentKt treehouseAppContentKt = heroBalanceSection.content;
        if (treehouseAppContentKt instanceof HeroBalanceSection$Content$NoBalance) {
            encodedSizeWithTag = HeroBalanceSection.NoBalance.ADAPTER.encodedSizeWithTag(1, ((HeroBalanceSection$Content$NoBalance) treehouseAppContentKt).value);
        } else {
            if (!(treehouseAppContentKt instanceof HeroBalanceSection$Content$PaymentCalendar)) {
                if (treehouseAppContentKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = HeroBalanceSection.PaymentCalendar.ADAPTER.encodedSizeWithTag(2, ((HeroBalanceSection$Content$PaymentCalendar) treehouseAppContentKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HeroBalanceSection heroBalanceSection = (HeroBalanceSection) obj;
        heroBalanceSection.getClass();
        ByteString byteString = ByteString.EMPTY;
        TreehouseAppContentKt treehouseAppContentKt = heroBalanceSection.content;
        byteString.getClass();
        return new HeroBalanceSection(treehouseAppContentKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HeroBalanceSection heroBalanceSection = (HeroBalanceSection) obj;
        heroBalanceSection.getClass();
        TreehouseAppContentKt treehouseAppContentKt = heroBalanceSection.content;
        if (treehouseAppContentKt instanceof HeroBalanceSection$Content$NoBalance) {
            HeroBalanceSection.NoBalance.ADAPTER.encodeWithTag(protoWriter, 1, ((HeroBalanceSection$Content$NoBalance) treehouseAppContentKt).value);
        } else if (treehouseAppContentKt instanceof HeroBalanceSection$Content$PaymentCalendar) {
            HeroBalanceSection.PaymentCalendar.ADAPTER.encodeWithTag(protoWriter, 2, ((HeroBalanceSection$Content$PaymentCalendar) treehouseAppContentKt).value);
        } else if (treehouseAppContentKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(heroBalanceSection.unknownFields());
    }
}
