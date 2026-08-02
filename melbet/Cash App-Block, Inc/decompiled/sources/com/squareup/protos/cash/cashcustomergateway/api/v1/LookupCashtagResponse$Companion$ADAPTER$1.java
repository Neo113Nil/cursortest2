package com.squareup.protos.cash.cashcustomergateway.api.v1;

import app.cash.local.primitives.ModifierKt;
import com.squareup.protos.cash.cashcustomergateway.api.v1.LookupCashtagResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LookupCashtagResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        ModifierKt modifierKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LookupCashtagResponse((String) obj, (LookupCashtagResponse.MatchType) obj2, modifierKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = LookupCashtagResponse.MatchType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                modifierKt = new LookupCashtagResponse$Identity$Customer((Customer) Customer.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                modifierKt = new LookupCashtagResponse$Identity$LocalBrand((LocalBrand) LocalBrand.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LookupCashtagResponse lookupCashtagResponse = (LookupCashtagResponse) obj;
        reverseProtoWriter.getClass();
        lookupCashtagResponse.getClass();
        reverseProtoWriter.writeBytes(lookupCashtagResponse.unknownFields());
        ModifierKt modifierKt = lookupCashtagResponse.identity;
        if (modifierKt instanceof LookupCashtagResponse$Identity$Customer) {
            Customer.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((LookupCashtagResponse$Identity$Customer) modifierKt).value);
        } else if (modifierKt instanceof LookupCashtagResponse$Identity$LocalBrand) {
            LocalBrand.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((LookupCashtagResponse$Identity$LocalBrand) modifierKt).value);
        } else if (modifierKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LookupCashtagResponse.MatchType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, lookupCashtagResponse.match_type);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, lookupCashtagResponse.cashtag);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        LookupCashtagResponse lookupCashtagResponse = (LookupCashtagResponse) obj;
        lookupCashtagResponse.getClass();
        int encodedSizeWithTag2 = LookupCashtagResponse.MatchType.ADAPTER.encodedSizeWithTag(2, lookupCashtagResponse.match_type) + ProtoAdapter.STRING.encodedSizeWithTag(1, lookupCashtagResponse.cashtag) + lookupCashtagResponse.unknownFields().getSize$okio();
        ModifierKt modifierKt = lookupCashtagResponse.identity;
        if (modifierKt instanceof LookupCashtagResponse$Identity$Customer) {
            encodedSizeWithTag = Customer.ADAPTER.encodedSizeWithTag(3, ((LookupCashtagResponse$Identity$Customer) modifierKt).value);
        } else {
            if (!(modifierKt instanceof LookupCashtagResponse$Identity$LocalBrand)) {
                if (modifierKt == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalBrand.ADAPTER.encodedSizeWithTag(4, ((LookupCashtagResponse$Identity$LocalBrand) modifierKt).value);
        }
        return encodedSizeWithTag + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LookupCashtagResponse lookupCashtagResponse = (LookupCashtagResponse) obj;
        lookupCashtagResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        LookupCashtagResponse.MatchType matchType = lookupCashtagResponse.match_type;
        ModifierKt modifierKt = lookupCashtagResponse.identity;
        byteString.getClass();
        return new LookupCashtagResponse(null, matchType, modifierKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LookupCashtagResponse lookupCashtagResponse = (LookupCashtagResponse) obj;
        lookupCashtagResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, lookupCashtagResponse.cashtag);
        LookupCashtagResponse.MatchType.ADAPTER.encodeWithTag(protoWriter, 2, lookupCashtagResponse.match_type);
        ModifierKt modifierKt = lookupCashtagResponse.identity;
        if (modifierKt instanceof LookupCashtagResponse$Identity$Customer) {
            Customer.ADAPTER.encodeWithTag(protoWriter, 3, ((LookupCashtagResponse$Identity$Customer) modifierKt).value);
        } else if (modifierKt instanceof LookupCashtagResponse$Identity$LocalBrand) {
            LocalBrand.ADAPTER.encodeWithTag(protoWriter, 4, ((LookupCashtagResponse$Identity$LocalBrand) modifierKt).value);
        } else if (modifierKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(lookupCashtagResponse.unknownFields());
    }
}
