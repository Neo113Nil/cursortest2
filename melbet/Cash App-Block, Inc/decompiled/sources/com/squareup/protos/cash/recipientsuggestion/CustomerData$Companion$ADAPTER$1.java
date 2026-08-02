package com.squareup.protos.cash.recipientsuggestion;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CustomerData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CustomerData((String) obj, (String) obj2, (String) obj3, (Image) obj4, (Boolean) obj5, (Boolean) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CustomerData customerData = (CustomerData) obj;
        reverseProtoWriter.getClass();
        customerData.getClass();
        reverseProtoWriter.writeBytes(customerData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, customerData.is_verified_account);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, customerData.is_business);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 4, customerData.photo);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, customerData.full_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, customerData.cashtag);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, customerData.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomerData customerData = (CustomerData) obj;
        customerData.getClass();
        int size$okio = customerData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(4, customerData.photo) + protoAdapter.encodedSizeWithTag(3, customerData.full_name) + protoAdapter.encodedSizeWithTag(2, customerData.cashtag) + protoAdapter.encodedSizeWithTag(1, customerData.customer_token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter2.encodedSizeWithTag(6, customerData.is_verified_account) + protoAdapter2.encodedSizeWithTag(5, customerData.is_business) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomerData customerData = (CustomerData) obj;
        customerData.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = customerData.customer_token;
        Boolean bool = customerData.is_business;
        Boolean bool2 = customerData.is_verified_account;
        byteString.getClass();
        return new CustomerData(str, null, null, null, bool, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomerData customerData = (CustomerData) obj;
        customerData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, customerData.customer_token);
        protoAdapter.encodeWithTag(protoWriter, 2, customerData.cashtag);
        protoAdapter.encodeWithTag(protoWriter, 3, customerData.full_name);
        Image.ADAPTER.encodeWithTag(protoWriter, 4, customerData.photo);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 5, customerData.is_business);
        protoAdapter2.encodeWithTag(protoWriter, 6, customerData.is_verified_account);
        protoWriter.writeBytes(customerData.unknownFields());
    }
}
