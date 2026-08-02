package com.squareup.protos.cash.cashface.delegates;

import com.squareup.protos.cash.cashface.delegates.ContextWrapper;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ContextWrapper$Origin$AccountLink$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ContextWrapper.Origin.AccountLink((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ContextWrapper.Origin.AccountLink accountLink = (ContextWrapper.Origin.AccountLink) obj;
        reverseProtoWriter.getClass();
        accountLink.getClass();
        reverseProtoWriter.writeBytes(accountLink.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, accountLink.account_link_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ContextWrapper.Origin.AccountLink accountLink = (ContextWrapper.Origin.AccountLink) obj;
        accountLink.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, accountLink.account_link_type) + accountLink.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ContextWrapper.Origin.AccountLink accountLink = (ContextWrapper.Origin.AccountLink) obj;
        accountLink.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = accountLink.account_link_type;
        byteString.getClass();
        return new ContextWrapper.Origin.AccountLink(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ContextWrapper.Origin.AccountLink accountLink = (ContextWrapper.Origin.AccountLink) obj;
        accountLink.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, accountLink.account_link_type);
        protoWriter.writeBytes(accountLink.unknownFields());
    }
}
