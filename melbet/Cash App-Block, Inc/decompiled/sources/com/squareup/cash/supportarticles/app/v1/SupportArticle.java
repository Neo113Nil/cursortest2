package com.squareup.cash.supportarticles.app.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.franklin.lending.Loan;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SupportArticle extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SupportArticle> CREATOR;
    public final List analytics_tags;
    public final Appearance appearance;
    public final String article_token;
    public final String body_html;
    public final String body_language;
    public final SupportLink call_to_action;
    public final List contact_options;
    public final Icon icon;
    public final Boolean include_in_recently_viewed;
    public final Boolean include_issue_description;
    public final List links;
    public final String preview_text;
    public final Boolean select_payment_for_case_creation;
    public final String title_text;

    public enum Appearance implements WireEnum {
        APPEARANCE_UNSPECIFIED(0),
        APPEARANCE_ARTICLE(1),
        APPEARANCE_CATEGORY(2),
        APPEARANCE_SUBCATEGORY(3),
        APPEARANCE_ISSUE(4);

        public static final SupportArticle$Appearance$Companion$ADAPTER$1 ADAPTER;
        public static final Error.Code.Companion Companion;
        public final int value;

        static {
            Appearance appearance = APPEARANCE_UNSPECIFIED;
            Companion = new Error.Code.Companion(11);
            ADAPTER = new SupportArticle$Appearance$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Appearance.class), Syntax.PROTO_3, appearance);
        }

        Appearance(int i) {
            this.value = i;
        }

        public static final Appearance fromValue(int i) {
            Companion.getClass();
            return Error.Code.Companion.m3836fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum Channel implements WireEnum {
        CHANNEL_UNSPECIFIED(0),
        CHANNEL_CHAT(1),
        CHANNEL_EMAIL(2),
        CHANNEL_PHONE(3),
        CHANNEL_IN_APP_PHONE(4);

        public static final SupportArticle$Channel$Companion$ADAPTER$1 ADAPTER;
        public static final WorkCookieJar Companion;
        public final int value;

        static {
            Channel channel = CHANNEL_UNSPECIFIED;
            Companion = new WorkCookieJar(11);
            ADAPTER = new SupportArticle$Channel$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Channel.class), Syntax.PROTO_3, channel);
        }

        Channel(int i) {
            this.value = i;
        }

        public static final Channel fromValue(int i) {
            Companion.getClass();
            return WorkCookieJar.m3796fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class ContactOption extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ContactOption> CREATOR;
        public final Channel channel;

        static {
            SupportArticle$ContactOption$Companion$ADAPTER$1 supportArticle$ContactOption$Companion$ADAPTER$1 = new SupportArticle$ContactOption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ContactOption.class), "type.googleapis.com/squareup.cash.supportarticles.app.v1beta1.SupportArticle.ContactOption", Syntax.PROTO_3, null, "squareup/cash/supportarticles/app/v1beta1/support_article.proto");
            ADAPTER = supportArticle$ContactOption$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(supportArticle$ContactOption$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContactOption(Channel channel, ByteString byteString) {
            super(ADAPTER, byteString);
            channel.getClass();
            byteString.getClass();
            this.channel = channel;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ContactOption)) {
                return false;
            }
            ContactOption contactOption = (ContactOption) obj;
            return Intrinsics.areEqual(unknownFields(), contactOption.unknownFields()) && this.channel == contactOption.channel;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.channel.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SubsectionBlock.Builder builder = new SubsectionBlock.Builder(13);
            WorkCookieJar workCookieJar = Channel.Companion;
            builder.f1245type = this.channel;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("channel=" + this.channel);
            return CollectionsKt.joinToString$default(arrayList, ", ", "ContactOption{", "}", 0, null, null, 56);
        }
    }

    static {
        SupportArticle$Companion$ADAPTER$1 supportArticle$Companion$ADAPTER$1 = new SupportArticle$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SupportArticle.class), "type.googleapis.com/squareup.cash.supportarticles.app.v1beta1.SupportArticle", Syntax.PROTO_3, null, "squareup/cash/supportarticles/app/v1beta1/support_article.proto");
        ADAPTER = supportArticle$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(supportArticle$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportArticle(String str, String str2, String str3, String str4, List list, List list2, Boolean bool, Boolean bool2, Icon icon, List list3, String str5, Appearance appearance, Boolean bool3, SupportLink supportLink, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.article_token = str;
        this.title_text = str2;
        this.preview_text = str3;
        this.body_html = str4;
        this.select_payment_for_case_creation = bool;
        this.include_in_recently_viewed = bool2;
        this.icon = icon;
        this.body_language = str5;
        this.appearance = appearance;
        this.include_issue_description = bool3;
        this.call_to_action = supportLink;
        this.links = TransactorKt.immutableCopyOf("links", list);
        this.contact_options = TransactorKt.immutableCopyOf("contact_options", list2);
        this.analytics_tags = TransactorKt.immutableCopyOf("analytics_tags", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SupportArticle)) {
            return false;
        }
        SupportArticle supportArticle = (SupportArticle) obj;
        return Intrinsics.areEqual(unknownFields(), supportArticle.unknownFields()) && Intrinsics.areEqual(this.article_token, supportArticle.article_token) && Intrinsics.areEqual(this.title_text, supportArticle.title_text) && Intrinsics.areEqual(this.preview_text, supportArticle.preview_text) && Intrinsics.areEqual(this.body_html, supportArticle.body_html) && Intrinsics.areEqual(this.links, supportArticle.links) && Intrinsics.areEqual(this.contact_options, supportArticle.contact_options) && Intrinsics.areEqual(this.select_payment_for_case_creation, supportArticle.select_payment_for_case_creation) && Intrinsics.areEqual(this.include_in_recently_viewed, supportArticle.include_in_recently_viewed) && Intrinsics.areEqual(this.icon, supportArticle.icon) && Intrinsics.areEqual(this.analytics_tags, supportArticle.analytics_tags) && Intrinsics.areEqual(this.body_language, supportArticle.body_language) && this.appearance == supportArticle.appearance && Intrinsics.areEqual(this.include_issue_description, supportArticle.include_issue_description) && Intrinsics.areEqual(this.call_to_action, supportArticle.call_to_action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.article_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.title_text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.preview_text;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.body_html;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37, 37, this.links), 37, this.contact_options);
        Boolean bool = this.select_payment_for_case_creation;
        int hashCode5 = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.include_in_recently_viewed;
        int hashCode6 = (hashCode5 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Icon icon = this.icon;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (icon != null ? icon.hashCode() : 0)) * 37, 37, this.analytics_tags);
        String str5 = this.body_language;
        int hashCode7 = (m2 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Appearance appearance = this.appearance;
        int hashCode8 = (hashCode7 + (appearance != null ? appearance.hashCode() : 0)) * 37;
        Boolean bool3 = this.include_issue_description;
        int hashCode9 = (hashCode8 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        SupportLink supportLink = this.call_to_action;
        int hashCode10 = hashCode9 + (supportLink != null ? supportLink.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Loan.Builder builder = new Loan.Builder(1);
        builder.token = this.article_token;
        builder.credit_line_token = this.title_text;
        builder.borrowed_at = this.preview_text;
        builder.due_at = this.body_html;
        builder.detail_rows = this.links;
        builder.principal_amount = this.contact_options;
        builder.setup_fee_amount = this.select_payment_for_case_creation;
        builder.outstanding_amount = this.include_in_recently_viewed;
        builder.late_fee_amount = this.icon;
        builder.interest_amount = this.analytics_tags;
        builder.setup_fee_bps = this.body_language;
        builder.state = this.appearance;
        builder.lending_product = this.include_issue_description;
        builder.bnpl_data = this.call_to_action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.article_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "article_token=", arrayList);
        }
        String str2 = this.title_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title_text=", arrayList);
        }
        String str3 = this.preview_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "preview_text=", arrayList);
        }
        String str4 = this.body_html;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "body_html=", arrayList);
        }
        List list = this.links;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("links=", arrayList, list);
        }
        List list2 = this.contact_options;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("contact_options=", arrayList, list2);
        }
        Boolean bool = this.select_payment_for_case_creation;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("select_payment_for_case_creation=", bool, arrayList);
        }
        Boolean bool2 = this.include_in_recently_viewed;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("include_in_recently_viewed=", bool2, arrayList);
        }
        Icon icon = this.icon;
        if (icon != null) {
            arrayList.add("icon=" + icon);
        }
        List list3 = this.analytics_tags;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("analytics_tags=", arrayList, list3);
        }
        String str5 = this.body_language;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "body_language=", arrayList);
        }
        Appearance appearance = this.appearance;
        if (appearance != null) {
            arrayList.add("appearance=" + appearance);
        }
        Boolean bool3 = this.include_issue_description;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("include_issue_description=", bool3, arrayList);
        }
        SupportLink supportLink = this.call_to_action;
        if (supportLink != null) {
            arrayList.add("call_to_action=" + supportLink);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SupportArticle{", "}", 0, null, null, 56);
    }
}
