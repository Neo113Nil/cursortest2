package com.squareup.protos.cash.shopping;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CustomerShoppingPreference$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CustomerShoppingPreference((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        CustomerShoppingPreference customerShoppingPreference = (CustomerShoppingPreference) obj;
        reverseProtoWriter.getClass();
        customerShoppingPreference.getClass();
        reverseProtoWriter.writeBytes(customerShoppingPreference.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, customerShoppingPreference.opt_in_personalized_shopping);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomerShoppingPreference customerShoppingPreference = (CustomerShoppingPreference) obj;
        customerShoppingPreference.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, customerShoppingPreference.opt_in_personalized_shopping) + customerShoppingPreference.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomerShoppingPreference customerShoppingPreference = (CustomerShoppingPreference) obj;
        customerShoppingPreference.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = customerShoppingPreference.opt_in_personalized_shopping;
        byteString.getClass();
        return new CustomerShoppingPreference(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomerShoppingPreference customerShoppingPreference = (CustomerShoppingPreference) obj;
        customerShoppingPreference.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, customerShoppingPreference.opt_in_personalized_shopping);
        protoWriter.writeBytes(customerShoppingPreference.unknownFields());
    }
}
