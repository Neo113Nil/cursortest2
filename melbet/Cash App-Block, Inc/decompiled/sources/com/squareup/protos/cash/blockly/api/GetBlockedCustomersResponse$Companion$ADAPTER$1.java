package com.squareup.protos.cash.blockly.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetBlockedCustomersResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBlockedCustomersResponse(m, (BlocklistDetails) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(BlocklyCustomer.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(BlocklistDetails.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBlockedCustomersResponse getBlockedCustomersResponse = (GetBlockedCustomersResponse) obj;
        reverseProtoWriter.getClass();
        getBlockedCustomersResponse.getClass();
        reverseProtoWriter.writeBytes(getBlockedCustomersResponse.unknownFields());
        BlocklistDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getBlockedCustomersResponse.blocklist_details);
        BlocklyCustomer.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getBlockedCustomersResponse.blocked_customers);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBlockedCustomersResponse getBlockedCustomersResponse = (GetBlockedCustomersResponse) obj;
        getBlockedCustomersResponse.getClass();
        return BlocklistDetails.ADAPTER.encodedSizeWithTag(2, getBlockedCustomersResponse.blocklist_details) + BlocklyCustomer.ADAPTER.asRepeated().encodedSizeWithTag(1, getBlockedCustomersResponse.blocked_customers) + getBlockedCustomersResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBlockedCustomersResponse getBlockedCustomersResponse = (GetBlockedCustomersResponse) obj;
        getBlockedCustomersResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getBlockedCustomersResponse.blocked_customers, BlocklyCustomer.ADAPTER);
        BlocklistDetails blocklistDetails = getBlockedCustomersResponse.blocklist_details;
        BlocklistDetails blocklistDetails2 = blocklistDetails != null ? (BlocklistDetails) BlocklistDetails.ADAPTER.redact(blocklistDetails) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetBlockedCustomersResponse(m1169redactElements, blocklistDetails2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBlockedCustomersResponse getBlockedCustomersResponse = (GetBlockedCustomersResponse) obj;
        getBlockedCustomersResponse.getClass();
        BlocklyCustomer.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getBlockedCustomersResponse.blocked_customers);
        BlocklistDetails.ADAPTER.encodeWithTag(protoWriter, 2, getBlockedCustomersResponse.blocklist_details);
        protoWriter.writeBytes(getBlockedCustomersResponse.unknownFields());
    }
}
