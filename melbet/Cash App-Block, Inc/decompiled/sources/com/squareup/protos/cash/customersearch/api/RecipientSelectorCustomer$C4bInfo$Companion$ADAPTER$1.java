package com.squareup.protos.cash.customersearch.api;

import com.squareup.protos.cash.customersearch.api.RecipientSelectorCustomer;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RecipientSelectorCustomer$C4bInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecipientSelectorCustomer.C4bInfo((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RecipientSelectorCustomer.C4bInfo c4bInfo = (RecipientSelectorCustomer.C4bInfo) obj;
        reverseProtoWriter.getClass();
        c4bInfo.getClass();
        reverseProtoWriter.writeBytes(c4bInfo.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, c4bInfo.c4b_category);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecipientSelectorCustomer.C4bInfo c4bInfo = (RecipientSelectorCustomer.C4bInfo) obj;
        c4bInfo.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, c4bInfo.c4b_category) + c4bInfo.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecipientSelectorCustomer.C4bInfo c4bInfo = (RecipientSelectorCustomer.C4bInfo) obj;
        c4bInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = c4bInfo.c4b_category;
        byteString.getClass();
        return new RecipientSelectorCustomer.C4bInfo(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecipientSelectorCustomer.C4bInfo c4bInfo = (RecipientSelectorCustomer.C4bInfo) obj;
        c4bInfo.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c4bInfo.c4b_category);
        protoWriter.writeBytes(c4bInfo.unknownFields());
    }
}
