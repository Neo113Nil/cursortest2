package com.squareup.protos.cash.offerdex.sync;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OfferCustomerPreference$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OfferCustomerPreference((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OfferCustomerPreference offerCustomerPreference = (OfferCustomerPreference) obj;
        reverseProtoWriter.getClass();
        offerCustomerPreference.getClass();
        reverseProtoWriter.writeBytes(offerCustomerPreference.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, offerCustomerPreference.push_notifications_enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OfferCustomerPreference offerCustomerPreference = (OfferCustomerPreference) obj;
        offerCustomerPreference.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, offerCustomerPreference.push_notifications_enabled) + offerCustomerPreference.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OfferCustomerPreference offerCustomerPreference = (OfferCustomerPreference) obj;
        offerCustomerPreference.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = offerCustomerPreference.push_notifications_enabled;
        byteString.getClass();
        return new OfferCustomerPreference(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OfferCustomerPreference offerCustomerPreference = (OfferCustomerPreference) obj;
        offerCustomerPreference.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, offerCustomerPreference.push_notifications_enabled);
        protoWriter.writeBytes(offerCustomerPreference.unknownFields());
    }
}
