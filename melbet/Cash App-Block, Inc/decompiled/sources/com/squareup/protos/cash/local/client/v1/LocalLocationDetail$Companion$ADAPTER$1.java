package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalLocationDetail$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                LocalLocationSummary localLocationSummary = (LocalLocationSummary) obj;
                if (localLocationSummary != null) {
                    return new LocalLocationDetail(localLocationSummary, (LocalMenu) obj2, (LocalActions) obj3, (LocalLocationLinks) obj4, (LocalRelatedContent) obj5, (LocalCashMarketingContent) obj6, (LocalLoyaltyProgram) obj7, (LocalLoyaltyAccount) obj8, m, endMessageAndGetUnknownFields);
                }
                TransactorKt.missingRequiredFields(obj, "summary");
                throw null;
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalLocationSummary.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalMenu.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalActions.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalLocationLinks.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalRelatedContent.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalCashMarketingContent.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalLoyaltyProgram.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(LocalLoyaltyAccount.ADAPTER, protoReader, obj8);
                    break;
                case 9:
                    m.add(LocalProfileWidget.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalLocationDetail localLocationDetail = (LocalLocationDetail) obj;
        reverseProtoWriter.getClass();
        localLocationDetail.getClass();
        reverseProtoWriter.writeBytes(localLocationDetail.unknownFields());
        LocalProfileWidget.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 9, localLocationDetail.profile_widgets);
        LocalLoyaltyAccount.ADAPTER.encodeWithTag(reverseProtoWriter, 8, localLocationDetail.loyalty_account);
        LocalLoyaltyProgram.ADAPTER.encodeWithTag(reverseProtoWriter, 7, localLocationDetail.loyalty_program);
        LocalCashMarketingContent.ADAPTER.encodeWithTag(reverseProtoWriter, 6, localLocationDetail.local_cash_marketing_content);
        LocalRelatedContent.ADAPTER.encodeWithTag(reverseProtoWriter, 5, localLocationDetail.related_content);
        LocalLocationLinks.ADAPTER.encodeWithTag(reverseProtoWriter, 4, localLocationDetail.links);
        LocalActions.ADAPTER.encodeWithTag(reverseProtoWriter, 3, localLocationDetail.actions);
        LocalMenu.ADAPTER.encodeWithTag(reverseProtoWriter, 2, localLocationDetail.menu);
        LocalLocationSummary.ADAPTER.encodeWithTag(reverseProtoWriter, 1, localLocationDetail.summary);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalLocationDetail localLocationDetail = (LocalLocationDetail) obj;
        localLocationDetail.getClass();
        return LocalProfileWidget.ADAPTER.asRepeated().encodedSizeWithTag(9, localLocationDetail.profile_widgets) + LocalLoyaltyAccount.ADAPTER.encodedSizeWithTag(8, localLocationDetail.loyalty_account) + LocalLoyaltyProgram.ADAPTER.encodedSizeWithTag(7, localLocationDetail.loyalty_program) + LocalCashMarketingContent.ADAPTER.encodedSizeWithTag(6, localLocationDetail.local_cash_marketing_content) + LocalRelatedContent.ADAPTER.encodedSizeWithTag(5, localLocationDetail.related_content) + LocalLocationLinks.ADAPTER.encodedSizeWithTag(4, localLocationDetail.links) + LocalActions.ADAPTER.encodedSizeWithTag(3, localLocationDetail.actions) + LocalMenu.ADAPTER.encodedSizeWithTag(2, localLocationDetail.menu) + LocalLocationSummary.ADAPTER.encodedSizeWithTag(1, localLocationDetail.summary) + localLocationDetail.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalLocationDetail localLocationDetail = (LocalLocationDetail) obj;
        localLocationDetail.getClass();
        LocalLocationSummary localLocationSummary = (LocalLocationSummary) LocalLocationSummary.ADAPTER.redact(localLocationDetail.summary);
        LocalMenu localMenu = localLocationDetail.menu;
        LocalMenu localMenu2 = localMenu != null ? (LocalMenu) LocalMenu.ADAPTER.redact(localMenu) : null;
        LocalActions localActions = localLocationDetail.actions;
        LocalActions localActions2 = localActions != null ? (LocalActions) LocalActions.ADAPTER.redact(localActions) : null;
        LocalLocationLinks localLocationLinks = localLocationDetail.links;
        LocalLocationLinks localLocationLinks2 = localLocationLinks != null ? (LocalLocationLinks) LocalLocationLinks.ADAPTER.redact(localLocationLinks) : null;
        LocalRelatedContent localRelatedContent = localLocationDetail.related_content;
        LocalRelatedContent localRelatedContent2 = localRelatedContent != null ? (LocalRelatedContent) LocalRelatedContent.ADAPTER.redact(localRelatedContent) : null;
        LocalCashMarketingContent localCashMarketingContent = localLocationDetail.local_cash_marketing_content;
        LocalCashMarketingContent localCashMarketingContent2 = localCashMarketingContent != null ? (LocalCashMarketingContent) LocalCashMarketingContent.ADAPTER.redact(localCashMarketingContent) : null;
        LocalLoyaltyProgram localLoyaltyProgram = localLocationDetail.loyalty_program;
        LocalLoyaltyProgram localLoyaltyProgram2 = localLoyaltyProgram != null ? (LocalLoyaltyProgram) LocalLoyaltyProgram.ADAPTER.redact(localLoyaltyProgram) : null;
        LocalLoyaltyAccount localLoyaltyAccount = localLocationDetail.loyalty_account;
        LocalLoyaltyAccount localLoyaltyAccount2 = localLoyaltyAccount != null ? (LocalLoyaltyAccount) LocalLoyaltyAccount.ADAPTER.redact(localLoyaltyAccount) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(localLocationDetail.profile_widgets, LocalProfileWidget.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        localLocationSummary.getClass();
        byteString.getClass();
        return new LocalLocationDetail(localLocationSummary, localMenu2, localActions2, localLocationLinks2, localRelatedContent2, localCashMarketingContent2, localLoyaltyProgram2, localLoyaltyAccount2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalLocationDetail localLocationDetail = (LocalLocationDetail) obj;
        localLocationDetail.getClass();
        LocalLocationSummary.ADAPTER.encodeWithTag(protoWriter, 1, localLocationDetail.summary);
        LocalMenu.ADAPTER.encodeWithTag(protoWriter, 2, localLocationDetail.menu);
        LocalActions.ADAPTER.encodeWithTag(protoWriter, 3, localLocationDetail.actions);
        LocalLocationLinks.ADAPTER.encodeWithTag(protoWriter, 4, localLocationDetail.links);
        LocalRelatedContent.ADAPTER.encodeWithTag(protoWriter, 5, localLocationDetail.related_content);
        LocalCashMarketingContent.ADAPTER.encodeWithTag(protoWriter, 6, localLocationDetail.local_cash_marketing_content);
        LocalLoyaltyProgram.ADAPTER.encodeWithTag(protoWriter, 7, localLocationDetail.loyalty_program);
        LocalLoyaltyAccount.ADAPTER.encodeWithTag(protoWriter, 8, localLocationDetail.loyalty_account);
        LocalProfileWidget.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, localLocationDetail.profile_widgets);
        protoWriter.writeBytes(localLocationDetail.unknownFields());
    }
}
