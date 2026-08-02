package com.squareup.protos.cash.pools;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AdminGetCustomerInvolvedContributionHistoryResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AdminGetCustomerInvolvedContributionHistoryResponse(m, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(EnhancedContributionRecord.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AdminGetCustomerInvolvedContributionHistoryResponse adminGetCustomerInvolvedContributionHistoryResponse = (AdminGetCustomerInvolvedContributionHistoryResponse) obj;
        reverseProtoWriter.getClass();
        adminGetCustomerInvolvedContributionHistoryResponse.getClass();
        reverseProtoWriter.writeBytes(adminGetCustomerInvolvedContributionHistoryResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, adminGetCustomerInvolvedContributionHistoryResponse.next_page_token);
        EnhancedContributionRecord.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, adminGetCustomerInvolvedContributionHistoryResponse.contributions);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AdminGetCustomerInvolvedContributionHistoryResponse adminGetCustomerInvolvedContributionHistoryResponse = (AdminGetCustomerInvolvedContributionHistoryResponse) obj;
        adminGetCustomerInvolvedContributionHistoryResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, adminGetCustomerInvolvedContributionHistoryResponse.next_page_token) + EnhancedContributionRecord.ADAPTER.asRepeated().encodedSizeWithTag(1, adminGetCustomerInvolvedContributionHistoryResponse.contributions) + adminGetCustomerInvolvedContributionHistoryResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AdminGetCustomerInvolvedContributionHistoryResponse adminGetCustomerInvolvedContributionHistoryResponse = (AdminGetCustomerInvolvedContributionHistoryResponse) obj;
        adminGetCustomerInvolvedContributionHistoryResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(adminGetCustomerInvolvedContributionHistoryResponse.contributions, EnhancedContributionRecord.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = adminGetCustomerInvolvedContributionHistoryResponse.next_page_token;
        byteString.getClass();
        return new AdminGetCustomerInvolvedContributionHistoryResponse(m1169redactElements, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AdminGetCustomerInvolvedContributionHistoryResponse adminGetCustomerInvolvedContributionHistoryResponse = (AdminGetCustomerInvolvedContributionHistoryResponse) obj;
        adminGetCustomerInvolvedContributionHistoryResponse.getClass();
        EnhancedContributionRecord.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, adminGetCustomerInvolvedContributionHistoryResponse.contributions);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, adminGetCustomerInvolvedContributionHistoryResponse.next_page_token);
        protoWriter.writeBytes(adminGetCustomerInvolvedContributionHistoryResponse.unknownFields());
    }
}
