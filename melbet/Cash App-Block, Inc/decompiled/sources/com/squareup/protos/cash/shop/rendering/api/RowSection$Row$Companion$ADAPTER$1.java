package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzlc;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RowSection$Row$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzlc zzlcVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RowSection.Row(zzlcVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                zzlcVar = new RowSection$Row$Type$OfferRow((RowSection.OfferRow) RowSection.OfferRow.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                zzlcVar = new RowSection$Row$Type$FilterRow((RowSection.FilterRow) RowSection.FilterRow.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzlcVar = new RowSection$Row$Type$AvatarRow((RowSection.AvatarRow) RowSection.AvatarRow.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RowSection.Row row = (RowSection.Row) obj;
        reverseProtoWriter.getClass();
        row.getClass();
        reverseProtoWriter.writeBytes(row.unknownFields());
        zzlc zzlcVar = row.f1337type;
        if (zzlcVar instanceof RowSection$Row$Type$OfferRow) {
            RowSection.OfferRow.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((RowSection$Row$Type$OfferRow) zzlcVar).value);
            return;
        }
        if (zzlcVar instanceof RowSection$Row$Type$FilterRow) {
            RowSection.FilterRow.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((RowSection$Row$Type$FilterRow) zzlcVar).value);
        } else if (zzlcVar instanceof RowSection$Row$Type$AvatarRow) {
            RowSection.AvatarRow.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((RowSection$Row$Type$AvatarRow) zzlcVar).value);
        } else {
            if (zzlcVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        RowSection.Row row = (RowSection.Row) obj;
        row.getClass();
        int size$okio = row.unknownFields().getSize$okio();
        zzlc zzlcVar = row.f1337type;
        if (zzlcVar instanceof RowSection$Row$Type$OfferRow) {
            encodedSizeWithTag = RowSection.OfferRow.ADAPTER.encodedSizeWithTag(2, ((RowSection$Row$Type$OfferRow) zzlcVar).value);
        } else if (zzlcVar instanceof RowSection$Row$Type$FilterRow) {
            encodedSizeWithTag = RowSection.FilterRow.ADAPTER.encodedSizeWithTag(3, ((RowSection$Row$Type$FilterRow) zzlcVar).value);
        } else {
            if (!(zzlcVar instanceof RowSection$Row$Type$AvatarRow)) {
                if (zzlcVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = RowSection.AvatarRow.ADAPTER.encodedSizeWithTag(4, ((RowSection$Row$Type$AvatarRow) zzlcVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RowSection.Row row = (RowSection.Row) obj;
        row.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzlc zzlcVar = row.f1337type;
        byteString.getClass();
        return new RowSection.Row(zzlcVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RowSection.Row row = (RowSection.Row) obj;
        row.getClass();
        zzlc zzlcVar = row.f1337type;
        if (zzlcVar instanceof RowSection$Row$Type$OfferRow) {
            RowSection.OfferRow.ADAPTER.encodeWithTag(protoWriter, 2, ((RowSection$Row$Type$OfferRow) zzlcVar).value);
        } else if (zzlcVar instanceof RowSection$Row$Type$FilterRow) {
            RowSection.FilterRow.ADAPTER.encodeWithTag(protoWriter, 3, ((RowSection$Row$Type$FilterRow) zzlcVar).value);
        } else if (zzlcVar instanceof RowSection$Row$Type$AvatarRow) {
            RowSection.AvatarRow.ADAPTER.encodeWithTag(protoWriter, 4, ((RowSection$Row$Type$AvatarRow) zzlcVar).value);
        } else if (zzlcVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(row.unknownFields());
    }
}
