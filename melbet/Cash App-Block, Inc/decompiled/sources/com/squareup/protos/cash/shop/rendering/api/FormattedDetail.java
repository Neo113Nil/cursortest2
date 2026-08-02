package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.disputron.Pagination;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.common.Money;
import com.squareup.protos.document.Document;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FormattedDetail extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FormattedDetail> CREATOR;
    public final Icon arcade_icon;
    public final CountdownInfoCheck countdown_check;
    public final CreditInfoCheck credit_check;
    public final IconId icon;
    public final LocalizedString l_text;
    public final LoanInfoCheck loan_check;
    public final StyledText styled_text;

    public final class CountdownInfoCheck extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CountdownInfoCheck> CREATOR;
        public final Long countdown_to_ms;
        public final String string_to_replace;

        static {
            FormattedDetail$CountdownInfoCheck$Companion$ADAPTER$1 formattedDetail$CountdownInfoCheck$Companion$ADAPTER$1 = new FormattedDetail$CountdownInfoCheck$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CountdownInfoCheck.class), "type.googleapis.com/squareup.cash.shop.rendering.api.FormattedDetail.CountdownInfoCheck", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Common.proto");
            ADAPTER = formattedDetail$CountdownInfoCheck$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(formattedDetail$CountdownInfoCheck$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountdownInfoCheck(String str, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.string_to_replace = str;
            this.countdown_to_ms = l;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CountdownInfoCheck)) {
                return false;
            }
            CountdownInfoCheck countdownInfoCheck = (CountdownInfoCheck) obj;
            return Intrinsics.areEqual(unknownFields(), countdownInfoCheck.unknownFields()) && Intrinsics.areEqual(this.string_to_replace, countdownInfoCheck.string_to_replace) && Intrinsics.areEqual(this.countdown_to_ms, countdownInfoCheck.countdown_to_ms);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.string_to_replace;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Long l = this.countdown_to_ms;
            int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Pagination.Builder builder = new Pagination.Builder(8);
            builder.offset = this.string_to_replace;
            builder.limit = this.countdown_to_ms;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.string_to_replace;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "string_to_replace=", arrayList);
            }
            Long l = this.countdown_to_ms;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("countdown_to_ms=", l, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CountdownInfoCheck{", "}", 0, null, null, 56);
        }
    }

    public final class CreditInfoCheck extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CreditInfoCheck> CREATOR;
        public final StyledText credit_limit_reached;
        public final LocalizedString l_credit_limit_reached;
        public final LocalizedString l_limit_unknown;
        public final StyledText limit_unknown;
        public final Money min_credit;
        public final String string_to_replace;

        static {
            FormattedDetail$CreditInfoCheck$Companion$ADAPTER$1 formattedDetail$CreditInfoCheck$Companion$ADAPTER$1 = new FormattedDetail$CreditInfoCheck$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreditInfoCheck.class), "type.googleapis.com/squareup.cash.shop.rendering.api.FormattedDetail.CreditInfoCheck", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Common.proto");
            ADAPTER = formattedDetail$CreditInfoCheck$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(formattedDetail$CreditInfoCheck$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreditInfoCheck(String str, LocalizedString localizedString, LocalizedString localizedString2, Money money, StyledText styledText, StyledText styledText2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.string_to_replace = str;
            this.l_credit_limit_reached = localizedString;
            this.l_limit_unknown = localizedString2;
            this.min_credit = money;
            this.credit_limit_reached = styledText;
            this.limit_unknown = styledText2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CreditInfoCheck)) {
                return false;
            }
            CreditInfoCheck creditInfoCheck = (CreditInfoCheck) obj;
            return Intrinsics.areEqual(unknownFields(), creditInfoCheck.unknownFields()) && Intrinsics.areEqual(this.string_to_replace, creditInfoCheck.string_to_replace) && Intrinsics.areEqual(this.l_credit_limit_reached, creditInfoCheck.l_credit_limit_reached) && Intrinsics.areEqual(this.l_limit_unknown, creditInfoCheck.l_limit_unknown) && Intrinsics.areEqual(this.min_credit, creditInfoCheck.min_credit) && Intrinsics.areEqual(this.credit_limit_reached, creditInfoCheck.credit_limit_reached) && Intrinsics.areEqual(this.limit_unknown, creditInfoCheck.limit_unknown);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.string_to_replace;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.l_credit_limit_reached;
            int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.l_limit_unknown;
            int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            Money money = this.min_credit;
            int hashCode5 = (hashCode4 + (money != null ? money.hashCode() : 0)) * 37;
            StyledText styledText = this.credit_limit_reached;
            int hashCode6 = (hashCode5 + (styledText != null ? styledText.hashCode() : 0)) * 37;
            StyledText styledText2 = this.limit_unknown;
            int hashCode7 = hashCode6 + (styledText2 != null ? styledText2.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Document.Builder builder = new Document.Builder(5, false);
            builder.category = this.string_to_replace;
            builder.token = this.l_credit_limit_reached;
            builder.title = this.l_limit_unknown;
            builder.url = this.min_credit;
            builder.owner_token = this.credit_limit_reached;
            builder.document_date = this.limit_unknown;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.string_to_replace;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "string_to_replace=", arrayList);
            }
            LocalizedString localizedString = this.l_credit_limit_reached;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("l_credit_limit_reached=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.l_limit_unknown;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("l_limit_unknown=", localizedString2, arrayList);
            }
            Money money = this.min_credit;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("min_credit=", money, arrayList);
            }
            StyledText styledText = this.credit_limit_reached;
            if (styledText != null) {
                SizeMode$EnumUnboxingLocalUtility.m("credit_limit_reached=", styledText, arrayList);
            }
            StyledText styledText2 = this.limit_unknown;
            if (styledText2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("limit_unknown=", styledText2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CreditInfoCheck{", "}", 0, null, null, 56);
        }
    }

    public final class LoanInfoCheck extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LoanInfoCheck> CREATOR;
        public final LocalizedString l_loan_limit_reached;
        public final StyledText loan_limit_reached;
        public final String string_to_replace;

        static {
            FormattedDetail$LoanInfoCheck$Companion$ADAPTER$1 formattedDetail$LoanInfoCheck$Companion$ADAPTER$1 = new FormattedDetail$LoanInfoCheck$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoanInfoCheck.class), "type.googleapis.com/squareup.cash.shop.rendering.api.FormattedDetail.LoanInfoCheck", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Common.proto");
            ADAPTER = formattedDetail$LoanInfoCheck$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(formattedDetail$LoanInfoCheck$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoanInfoCheck(String str, LocalizedString localizedString, StyledText styledText, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.string_to_replace = str;
            this.l_loan_limit_reached = localizedString;
            this.loan_limit_reached = styledText;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LoanInfoCheck)) {
                return false;
            }
            LoanInfoCheck loanInfoCheck = (LoanInfoCheck) obj;
            return Intrinsics.areEqual(unknownFields(), loanInfoCheck.unknownFields()) && Intrinsics.areEqual(this.string_to_replace, loanInfoCheck.string_to_replace) && Intrinsics.areEqual(this.l_loan_limit_reached, loanInfoCheck.l_loan_limit_reached) && Intrinsics.areEqual(this.loan_limit_reached, loanInfoCheck.loan_limit_reached);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.string_to_replace;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.l_loan_limit_reached;
            int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            StyledText styledText = this.loan_limit_reached;
            int hashCode4 = hashCode3 + (styledText != null ? styledText.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CardScheme.Builder builder = new CardScheme.Builder(20);
            builder.modules = this.string_to_replace;
            builder.overflow_modules = this.l_loan_limit_reached;
            builder.card_home_actions = this.loan_limit_reached;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.string_to_replace;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "string_to_replace=", arrayList);
            }
            LocalizedString localizedString = this.l_loan_limit_reached;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("l_loan_limit_reached=", localizedString, arrayList);
            }
            StyledText styledText = this.loan_limit_reached;
            if (styledText != null) {
                SizeMode$EnumUnboxingLocalUtility.m("loan_limit_reached=", styledText, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LoanInfoCheck{", "}", 0, null, null, 56);
        }
    }

    static {
        FormattedDetail$Companion$ADAPTER$1 formattedDetail$Companion$ADAPTER$1 = new FormattedDetail$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FormattedDetail.class), "type.googleapis.com/squareup.cash.shop.rendering.api.FormattedDetail", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Common.proto");
        ADAPTER = formattedDetail$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(formattedDetail$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormattedDetail(Icon icon, LocalizedString localizedString, CreditInfoCheck creditInfoCheck, LoanInfoCheck loanInfoCheck, CountdownInfoCheck countdownInfoCheck, IconId iconId, StyledText styledText, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.arcade_icon = icon;
        this.l_text = localizedString;
        this.credit_check = creditInfoCheck;
        this.loan_check = loanInfoCheck;
        this.countdown_check = countdownInfoCheck;
        this.icon = iconId;
        this.styled_text = styledText;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FormattedDetail)) {
            return false;
        }
        FormattedDetail formattedDetail = (FormattedDetail) obj;
        return Intrinsics.areEqual(unknownFields(), formattedDetail.unknownFields()) && Intrinsics.areEqual(this.arcade_icon, formattedDetail.arcade_icon) && Intrinsics.areEqual(this.l_text, formattedDetail.l_text) && Intrinsics.areEqual(this.credit_check, formattedDetail.credit_check) && Intrinsics.areEqual(this.loan_check, formattedDetail.loan_check) && Intrinsics.areEqual(this.countdown_check, formattedDetail.countdown_check) && this.icon == formattedDetail.icon && Intrinsics.areEqual(this.styled_text, formattedDetail.styled_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Icon icon = this.arcade_icon;
        int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.l_text;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        CreditInfoCheck creditInfoCheck = this.credit_check;
        int hashCode4 = (hashCode3 + (creditInfoCheck != null ? creditInfoCheck.hashCode() : 0)) * 37;
        LoanInfoCheck loanInfoCheck = this.loan_check;
        int hashCode5 = (hashCode4 + (loanInfoCheck != null ? loanInfoCheck.hashCode() : 0)) * 37;
        CountdownInfoCheck countdownInfoCheck = this.countdown_check;
        int hashCode6 = (hashCode5 + (countdownInfoCheck != null ? countdownInfoCheck.hashCode() : 0)) * 37;
        IconId iconId = this.icon;
        int hashCode7 = (hashCode6 + (iconId != null ? iconId.hashCode() : 0)) * 37;
        StyledText styledText = this.styled_text;
        int hashCode8 = hashCode7 + (styledText != null ? styledText.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolParticipant.Builder builder = new PoolParticipant.Builder(21);
        builder.customer_identifier = this.arcade_icon;
        builder.full_name = this.l_text;
        builder.profile_photo_url = this.credit_check;
        builder.cashtag = this.loan_check;
        builder.added_at = this.countdown_check;
        builder.participant_type = this.icon;
        builder.aggregated_contribution_amount = this.styled_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Icon icon = this.arcade_icon;
        if (icon != null) {
            Matcher$$ExternalSyntheticOutline0.m("arcade_icon=", icon, arrayList);
        }
        LocalizedString localizedString = this.l_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("l_text=", localizedString, arrayList);
        }
        CreditInfoCheck creditInfoCheck = this.credit_check;
        if (creditInfoCheck != null) {
            arrayList.add("credit_check=" + creditInfoCheck);
        }
        LoanInfoCheck loanInfoCheck = this.loan_check;
        if (loanInfoCheck != null) {
            arrayList.add("loan_check=" + loanInfoCheck);
        }
        CountdownInfoCheck countdownInfoCheck = this.countdown_check;
        if (countdownInfoCheck != null) {
            arrayList.add("countdown_check=" + countdownInfoCheck);
        }
        IconId iconId = this.icon;
        if (iconId != null) {
            arrayList.add("icon=" + iconId);
        }
        StyledText styledText = this.styled_text;
        if (styledText != null) {
            SizeMode$EnumUnboxingLocalUtility.m("styled_text=", styledText, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FormattedDetail{", "}", 0, null, null, 56);
    }
}
