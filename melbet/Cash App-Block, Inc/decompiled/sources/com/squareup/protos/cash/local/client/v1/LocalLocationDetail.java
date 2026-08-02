package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalLocationDetail extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalLocationDetail> CREATOR;
    public final LocalActions actions;
    public final LocalLocationLinks links;
    public final LocalCashMarketingContent local_cash_marketing_content;
    public final LocalLoyaltyAccount loyalty_account;
    public final LocalLoyaltyProgram loyalty_program;
    public final LocalMenu menu;
    public final List profile_widgets;
    public final LocalRelatedContent related_content;
    public final LocalLocationSummary summary;

    static {
        LocalLocationDetail$Companion$ADAPTER$1 localLocationDetail$Companion$ADAPTER$1 = new LocalLocationDetail$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalLocationDetail.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalLocationDetail", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_brand.proto");
        ADAPTER = localLocationDetail$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localLocationDetail$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalLocationDetail(LocalLocationSummary localLocationSummary, LocalMenu localMenu, LocalActions localActions, LocalLocationLinks localLocationLinks, LocalRelatedContent localRelatedContent, LocalCashMarketingContent localCashMarketingContent, LocalLoyaltyProgram localLoyaltyProgram, LocalLoyaltyAccount localLoyaltyAccount, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        localLocationSummary.getClass();
        list.getClass();
        byteString.getClass();
        this.summary = localLocationSummary;
        this.menu = localMenu;
        this.actions = localActions;
        this.links = localLocationLinks;
        this.related_content = localRelatedContent;
        this.local_cash_marketing_content = localCashMarketingContent;
        this.loyalty_program = localLoyaltyProgram;
        this.loyalty_account = localLoyaltyAccount;
        this.profile_widgets = TransactorKt.immutableCopyOf("profile_widgets", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalLocationDetail)) {
            return false;
        }
        LocalLocationDetail localLocationDetail = (LocalLocationDetail) obj;
        return Intrinsics.areEqual(unknownFields(), localLocationDetail.unknownFields()) && Intrinsics.areEqual(this.summary, localLocationDetail.summary) && Intrinsics.areEqual(this.menu, localLocationDetail.menu) && Intrinsics.areEqual(this.actions, localLocationDetail.actions) && Intrinsics.areEqual(this.links, localLocationDetail.links) && Intrinsics.areEqual(this.related_content, localLocationDetail.related_content) && Intrinsics.areEqual(this.local_cash_marketing_content, localLocationDetail.local_cash_marketing_content) && Intrinsics.areEqual(this.loyalty_program, localLocationDetail.loyalty_program) && Intrinsics.areEqual(this.loyalty_account, localLocationDetail.loyalty_account) && Intrinsics.areEqual(this.profile_widgets, localLocationDetail.profile_widgets);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (this.summary.hashCode() + (unknownFields().hashCode() * 37)) * 37;
        LocalMenu localMenu = this.menu;
        int hashCode2 = (hashCode + (localMenu != null ? localMenu.hashCode() : 0)) * 37;
        LocalActions localActions = this.actions;
        int hashCode3 = (hashCode2 + (localActions != null ? localActions.hashCode() : 0)) * 37;
        LocalLocationLinks localLocationLinks = this.links;
        int hashCode4 = (hashCode3 + (localLocationLinks != null ? localLocationLinks.hashCode() : 0)) * 37;
        LocalRelatedContent localRelatedContent = this.related_content;
        int hashCode5 = (hashCode4 + (localRelatedContent != null ? localRelatedContent.hashCode() : 0)) * 37;
        LocalCashMarketingContent localCashMarketingContent = this.local_cash_marketing_content;
        int hashCode6 = (hashCode5 + (localCashMarketingContent != null ? localCashMarketingContent.hashCode() : 0)) * 37;
        LocalLoyaltyProgram localLoyaltyProgram = this.loyalty_program;
        int hashCode7 = (hashCode6 + (localLoyaltyProgram != null ? localLoyaltyProgram.hashCode() : 0)) * 37;
        LocalLoyaltyAccount localLoyaltyAccount = this.loyalty_account;
        int hashCode8 = this.profile_widgets.hashCode() + ((hashCode7 + (localLoyaltyAccount != null ? localLoyaltyAccount.hashCode() : 0)) * 37);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(26, false);
        builder.locale = this.summary;
        builder.title = this.menu;
        builder.info_rows_header = this.actions;
        builder.footer_text = this.links;
        builder.loadable_subtitle = this.related_content;
        builder.primary_footer_button_state = this.local_cash_marketing_content;
        builder.secondary_footer_button_state = this.loyalty_program;
        builder.payment_plans_data = this.loyalty_account;
        builder.info_rows = this.profile_widgets;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("summary=" + this.summary);
        LocalMenu localMenu = this.menu;
        if (localMenu != null) {
            arrayList.add("menu=" + localMenu);
        }
        LocalActions localActions = this.actions;
        if (localActions != null) {
            arrayList.add("actions=" + localActions);
        }
        LocalLocationLinks localLocationLinks = this.links;
        if (localLocationLinks != null) {
            arrayList.add("links=" + localLocationLinks);
        }
        LocalRelatedContent localRelatedContent = this.related_content;
        if (localRelatedContent != null) {
            arrayList.add("related_content=" + localRelatedContent);
        }
        LocalCashMarketingContent localCashMarketingContent = this.local_cash_marketing_content;
        if (localCashMarketingContent != null) {
            arrayList.add("local_cash_marketing_content=" + localCashMarketingContent);
        }
        LocalLoyaltyProgram localLoyaltyProgram = this.loyalty_program;
        if (localLoyaltyProgram != null) {
            arrayList.add("loyalty_program=" + localLoyaltyProgram);
        }
        LocalLoyaltyAccount localLoyaltyAccount = this.loyalty_account;
        if (localLoyaltyAccount != null) {
            arrayList.add("loyalty_account=" + localLoyaltyAccount);
        }
        List list = this.profile_widgets;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("profile_widgets=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalLocationDetail{", "}", 0, null, null, 56);
    }
}
