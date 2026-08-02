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
public final class AdminGetPoolContributionHistoryResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AdminGetPoolContributionHistoryResponse(m, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ContributionRecord.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AdminGetPoolContributionHistoryResponse adminGetPoolContributionHistoryResponse = (AdminGetPoolContributionHistoryResponse) obj;
        reverseProtoWriter.getClass();
        adminGetPoolContributionHistoryResponse.getClass();
        reverseProtoWriter.writeBytes(adminGetPoolContributionHistoryResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, adminGetPoolContributionHistoryResponse.next_page_token);
        ContributionRecord.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, adminGetPoolContributionHistoryResponse.contributions);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AdminGetPoolContributionHistoryResponse adminGetPoolContributionHistoryResponse = (AdminGetPoolContributionHistoryResponse) obj;
        adminGetPoolContributionHistoryResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, adminGetPoolContributionHistoryResponse.next_page_token) + ContributionRecord.ADAPTER.asRepeated().encodedSizeWithTag(1, adminGetPoolContributionHistoryResponse.contributions) + adminGetPoolContributionHistoryResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AdminGetPoolContributionHistoryResponse adminGetPoolContributionHistoryResponse = (AdminGetPoolContributionHistoryResponse) obj;
        adminGetPoolContributionHistoryResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(adminGetPoolContributionHistoryResponse.contributions, ContributionRecord.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = adminGetPoolContributionHistoryResponse.next_page_token;
        byteString.getClass();
        return new AdminGetPoolContributionHistoryResponse(m1169redactElements, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AdminGetPoolContributionHistoryResponse adminGetPoolContributionHistoryResponse = (AdminGetPoolContributionHistoryResponse) obj;
        adminGetPoolContributionHistoryResponse.getClass();
        ContributionRecord.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, adminGetPoolContributionHistoryResponse.contributions);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, adminGetPoolContributionHistoryResponse.next_page_token);
        protoWriter.writeBytes(adminGetPoolContributionHistoryResponse.unknownFields());
    }
}
