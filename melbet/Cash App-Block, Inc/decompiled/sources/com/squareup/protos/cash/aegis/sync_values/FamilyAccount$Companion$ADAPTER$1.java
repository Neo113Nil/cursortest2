package com.squareup.protos.cash.aegis.sync_values;

import app.cash.local.primitives.BrandCollectionDataKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class FamilyAccount$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        BrandCollectionDataKt brandCollectionDataKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FamilyAccount(brandCollectionDataKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                brandCollectionDataKt = new FamilyAccount$Type$Dependent((Dependent) Dependent.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                brandCollectionDataKt = new FamilyAccount$Type$Sponsor((Sponsor) Sponsor.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FamilyAccount familyAccount = (FamilyAccount) obj;
        reverseProtoWriter.getClass();
        familyAccount.getClass();
        reverseProtoWriter.writeBytes(familyAccount.unknownFields());
        BrandCollectionDataKt brandCollectionDataKt = familyAccount.f1246type;
        if (brandCollectionDataKt instanceof FamilyAccount$Type$Dependent) {
            Dependent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((FamilyAccount$Type$Dependent) brandCollectionDataKt).value);
        } else if (brandCollectionDataKt instanceof FamilyAccount$Type$Sponsor) {
            Sponsor.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((FamilyAccount$Type$Sponsor) brandCollectionDataKt).value);
        } else {
            if (brandCollectionDataKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        FamilyAccount familyAccount = (FamilyAccount) obj;
        familyAccount.getClass();
        int size$okio = familyAccount.unknownFields().getSize$okio();
        BrandCollectionDataKt brandCollectionDataKt = familyAccount.f1246type;
        if (brandCollectionDataKt instanceof FamilyAccount$Type$Dependent) {
            encodedSizeWithTag = Dependent.ADAPTER.encodedSizeWithTag(1, ((FamilyAccount$Type$Dependent) brandCollectionDataKt).value);
        } else {
            if (!(brandCollectionDataKt instanceof FamilyAccount$Type$Sponsor)) {
                if (brandCollectionDataKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = Sponsor.ADAPTER.encodedSizeWithTag(2, ((FamilyAccount$Type$Sponsor) brandCollectionDataKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FamilyAccount familyAccount = (FamilyAccount) obj;
        familyAccount.getClass();
        ByteString byteString = ByteString.EMPTY;
        BrandCollectionDataKt brandCollectionDataKt = familyAccount.f1246type;
        byteString.getClass();
        return new FamilyAccount(brandCollectionDataKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FamilyAccount familyAccount = (FamilyAccount) obj;
        familyAccount.getClass();
        BrandCollectionDataKt brandCollectionDataKt = familyAccount.f1246type;
        if (brandCollectionDataKt instanceof FamilyAccount$Type$Dependent) {
            Dependent.ADAPTER.encodeWithTag(protoWriter, 1, ((FamilyAccount$Type$Dependent) brandCollectionDataKt).value);
        } else if (brandCollectionDataKt instanceof FamilyAccount$Type$Sponsor) {
            Sponsor.ADAPTER.encodeWithTag(protoWriter, 2, ((FamilyAccount$Type$Sponsor) brandCollectionDataKt).value);
        } else if (brandCollectionDataKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(familyAccount.unknownFields());
    }
}
