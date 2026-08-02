package com.squareup.protos.cash.customersearch.api;

import app.cash.zipline.internal.SignaturePayloadKt;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Filter$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        SignaturePayloadKt signaturePayloadKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Filter((String) obj, signaturePayloadKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                signaturePayloadKt = new Filter$Option$PriceRange((PriceRange) PriceRange.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                signaturePayloadKt = new Filter$Option$Toggle(((Boolean) ProtoAdapter.BOOL.decode(protoReader)).booleanValue());
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                signaturePayloadKt = new Filter$Option$SelectionList((SelectionList) SelectionList.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Filter filter = (Filter) obj;
        reverseProtoWriter.getClass();
        filter.getClass();
        reverseProtoWriter.writeBytes(filter.unknownFields());
        SignaturePayloadKt signaturePayloadKt = filter.option;
        if (signaturePayloadKt instanceof Filter$Option$PriceRange) {
            PriceRange.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((Filter$Option$PriceRange) signaturePayloadKt).value);
        } else if (signaturePayloadKt instanceof Filter$Option$Toggle) {
            ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, Boolean.valueOf(((Filter$Option$Toggle) signaturePayloadKt).value));
        } else if (signaturePayloadKt instanceof Filter$Option$SelectionList) {
            SelectionList.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((Filter$Option$SelectionList) signaturePayloadKt).value);
        } else if (signaturePayloadKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, filter.filter_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Filter filter = (Filter) obj;
        filter.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, filter.filter_name) + filter.unknownFields().getSize$okio();
        SignaturePayloadKt signaturePayloadKt = filter.option;
        if (signaturePayloadKt instanceof Filter$Option$PriceRange) {
            return PriceRange.ADAPTER.encodedSizeWithTag(2, ((Filter$Option$PriceRange) signaturePayloadKt).value) + encodedSizeWithTag;
        }
        if (signaturePayloadKt instanceof Filter$Option$Toggle) {
            return SizeMode$EnumUnboxingLocalUtility.m(((Filter$Option$Toggle) signaturePayloadKt).value, ProtoAdapter.BOOL, 3, encodedSizeWithTag);
        }
        if (signaturePayloadKt instanceof Filter$Option$SelectionList) {
            return SelectionList.ADAPTER.encodedSizeWithTag(4, ((Filter$Option$SelectionList) signaturePayloadKt).value) + encodedSizeWithTag;
        }
        if (signaturePayloadKt == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Filter filter = (Filter) obj;
        filter.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = filter.filter_name;
        SignaturePayloadKt signaturePayloadKt = filter.option;
        byteString.getClass();
        return new Filter(str, signaturePayloadKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Filter filter = (Filter) obj;
        filter.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, filter.filter_name);
        SignaturePayloadKt signaturePayloadKt = filter.option;
        if (signaturePayloadKt instanceof Filter$Option$PriceRange) {
            PriceRange.ADAPTER.encodeWithTag(protoWriter, 2, ((Filter$Option$PriceRange) signaturePayloadKt).value);
        } else if (signaturePayloadKt instanceof Filter$Option$Toggle) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, Boolean.valueOf(((Filter$Option$Toggle) signaturePayloadKt).value));
        } else if (signaturePayloadKt instanceof Filter$Option$SelectionList) {
            SelectionList.ADAPTER.encodeWithTag(protoWriter, 4, ((Filter$Option$SelectionList) signaturePayloadKt).value);
        } else if (signaturePayloadKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(filter.unknownFields());
    }
}
