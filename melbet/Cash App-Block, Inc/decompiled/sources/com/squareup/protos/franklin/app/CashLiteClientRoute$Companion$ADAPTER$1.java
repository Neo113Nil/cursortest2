package com.squareup.protos.franklin.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CashLiteClientRoute$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashLiteClientRoute((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        CashLiteClientRoute cashLiteClientRoute = (CashLiteClientRoute) obj;
        reverseProtoWriter.getClass();
        cashLiteClientRoute.getClass();
        reverseProtoWriter.writeBytes(cashLiteClientRoute.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, cashLiteClientRoute.spec_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashLiteClientRoute cashLiteClientRoute = (CashLiteClientRoute) obj;
        cashLiteClientRoute.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, cashLiteClientRoute.spec_name) + cashLiteClientRoute.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashLiteClientRoute cashLiteClientRoute = (CashLiteClientRoute) obj;
        cashLiteClientRoute.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = cashLiteClientRoute.spec_name;
        byteString.getClass();
        return new CashLiteClientRoute(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashLiteClientRoute cashLiteClientRoute = (CashLiteClientRoute) obj;
        cashLiteClientRoute.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cashLiteClientRoute.spec_name);
        protoWriter.writeBytes(cashLiteClientRoute.unknownFields());
    }
}
