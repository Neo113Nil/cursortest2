package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import com.squareup.protos.cash.shop.rendering.api.HeroSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class HeroSection$HeroTile$FooterDetail$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzkt zzktVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HeroSection.HeroTile.FooterDetail(zzktVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzktVar = new HeroSection$HeroTile$FooterDetail$Detail$CountdownCaption((CountdownCaption) CountdownCaption.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzktVar = new HeroSection$HeroTile$FooterDetail$Detail$CreditDetail((CreditDetail) CreditDetail.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HeroSection.HeroTile.FooterDetail footerDetail = (HeroSection.HeroTile.FooterDetail) obj;
        reverseProtoWriter.getClass();
        footerDetail.getClass();
        reverseProtoWriter.writeBytes(footerDetail.unknownFields());
        zzkt zzktVar = footerDetail.detail;
        if (zzktVar instanceof HeroSection$HeroTile$FooterDetail$Detail$CountdownCaption) {
            CountdownCaption.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((HeroSection$HeroTile$FooterDetail$Detail$CountdownCaption) zzktVar).value);
        } else if (zzktVar instanceof HeroSection$HeroTile$FooterDetail$Detail$CreditDetail) {
            CreditDetail.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((HeroSection$HeroTile$FooterDetail$Detail$CreditDetail) zzktVar).value);
        } else {
            if (zzktVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        HeroSection.HeroTile.FooterDetail footerDetail = (HeroSection.HeroTile.FooterDetail) obj;
        footerDetail.getClass();
        int size$okio = footerDetail.unknownFields().getSize$okio();
        zzkt zzktVar = footerDetail.detail;
        if (zzktVar instanceof HeroSection$HeroTile$FooterDetail$Detail$CountdownCaption) {
            encodedSizeWithTag = CountdownCaption.ADAPTER.encodedSizeWithTag(1, ((HeroSection$HeroTile$FooterDetail$Detail$CountdownCaption) zzktVar).value);
        } else {
            if (!(zzktVar instanceof HeroSection$HeroTile$FooterDetail$Detail$CreditDetail)) {
                if (zzktVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = CreditDetail.ADAPTER.encodedSizeWithTag(2, ((HeroSection$HeroTile$FooterDetail$Detail$CreditDetail) zzktVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HeroSection.HeroTile.FooterDetail footerDetail = (HeroSection.HeroTile.FooterDetail) obj;
        footerDetail.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzkt zzktVar = footerDetail.detail;
        byteString.getClass();
        return new HeroSection.HeroTile.FooterDetail(zzktVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HeroSection.HeroTile.FooterDetail footerDetail = (HeroSection.HeroTile.FooterDetail) obj;
        footerDetail.getClass();
        zzkt zzktVar = footerDetail.detail;
        if (zzktVar instanceof HeroSection$HeroTile$FooterDetail$Detail$CountdownCaption) {
            CountdownCaption.ADAPTER.encodeWithTag(protoWriter, 1, ((HeroSection$HeroTile$FooterDetail$Detail$CountdownCaption) zzktVar).value);
        } else if (zzktVar instanceof HeroSection$HeroTile$FooterDetail$Detail$CreditDetail) {
            CreditDetail.ADAPTER.encodeWithTag(protoWriter, 2, ((HeroSection$HeroTile$FooterDetail$Detail$CreditDetail) zzktVar).value);
        } else if (zzktVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(footerDetail.unknownFields());
    }
}
