package com.squareup.protos.lending;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zziz;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
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

/* loaded from: classes8.dex */
public final class LoanRepaymentSelectionData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LoanRepaymentSelectionData> CREATOR;
    public final LocalizedString dismiss_button_text;
    public final List repayment_choices;
    public final LocalizedString title;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public LocalizedString dismiss_button_text;
        public List repayment_choices;
        public LocalizedString title;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new LoanRepaymentSelectionData(this.title, this.dismiss_button_text, this.repayment_choices, buildUnknownFields());
                case 1:
                    return new PrepurchaseCashCardAppletData.InfoViewData(this.title, this.dismiss_button_text, this.repayment_choices, buildUnknownFields());
                case 2:
                    return new PrepurchaseCashCardAppletData.InfoViewData.TextBlock(this.title, this.dismiss_button_text, this.repayment_choices, buildUnknownFields());
                case 3:
                    return new BorrowLimitHubData.IncreaseLimitActionsSection(this.title, this.dismiss_button_text, this.repayment_choices, buildUnknownFields());
                default:
                    return new BorrowLimitHubData.LimitInfoBulletsSection(this.title, this.dismiss_button_text, this.repayment_choices, buildUnknownFields());
            }
        }
    }

    static {
        LoanRepaymentSelectionData$Companion$ADAPTER$1 loanRepaymentSelectionData$Companion$ADAPTER$1 = new LoanRepaymentSelectionData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoanRepaymentSelectionData.class), "type.googleapis.com/squareup.lending.LoanRepaymentSelectionData", Syntax.PROTO_2, null, "squareup/lending/loan_repayment_selection.proto");
        ADAPTER = loanRepaymentSelectionData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(loanRepaymentSelectionData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanRepaymentSelectionData(LocalizedString localizedString, LocalizedString localizedString2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = localizedString;
        this.dismiss_button_text = localizedString2;
        this.repayment_choices = TransactorKt.immutableCopyOf("repayment_choices", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoanRepaymentSelectionData)) {
            return false;
        }
        LoanRepaymentSelectionData loanRepaymentSelectionData = (LoanRepaymentSelectionData) obj;
        return Intrinsics.areEqual(unknownFields(), loanRepaymentSelectionData.unknownFields()) && Intrinsics.areEqual(this.title, loanRepaymentSelectionData.title) && Intrinsics.areEqual(this.repayment_choices, loanRepaymentSelectionData.repayment_choices) && Intrinsics.areEqual(this.dismiss_button_text, loanRepaymentSelectionData.dismiss_button_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37, 37, this.repayment_choices);
        LocalizedString localizedString2 = this.dismiss_button_text;
        int hashCode2 = m + (localizedString2 != null ? localizedString2.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.title = this.title;
        builder.repayment_choices = this.repayment_choices;
        builder.dismiss_button_text = this.dismiss_button_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        List list = this.repayment_choices;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("repayment_choices=", arrayList, list);
        }
        LocalizedString localizedString2 = this.dismiss_button_text;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("dismiss_button_text=", localizedString2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LoanRepaymentSelectionData{", "}", 0, null, null, 56);
    }

    public final class Choice extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Choice> CREATOR;
        public final LocalizedString accessory_text;
        public final Icon icon;
        public final LocalizedString primary_text;
        public final zziz routing;
        public final LocalizedString secondary_text;
        public final Long timestamp;

        public enum Icon implements WireEnum {
            BORROW(0),
            OTHER(1),
            DATE(2),
            REMAINING(3),
            SKIP(4);

            public static final LoanRepaymentSelectionData$Choice$Icon$Companion$ADAPTER$1 ADAPTER;
            public static final KeyScope.Companion Companion;
            public final int value;

            static {
                Icon icon = BORROW;
                Companion = new KeyScope.Companion();
                ADAPTER = new LoanRepaymentSelectionData$Choice$Icon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Icon.class), Syntax.PROTO_2, icon);
            }

            Icon(int i) {
                this.value = i;
            }

            public static final Icon fromValue(int i) {
                Companion.getClass();
                return KeyScope.Companion.m3975fromValue(i);
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            LoanRepaymentSelectionData$Choice$Companion$ADAPTER$1 loanRepaymentSelectionData$Choice$Companion$ADAPTER$1 = new LoanRepaymentSelectionData$Choice$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Choice.class), "type.googleapis.com/squareup.lending.LoanRepaymentSelectionData.Choice", Syntax.PROTO_2, null, "squareup/lending/loan_repayment_selection.proto");
            ADAPTER = loanRepaymentSelectionData$Choice$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(loanRepaymentSelectionData$Choice$Companion$ADAPTER$1);
        }

        public /* synthetic */ Choice(LocalizedString localizedString, Icon icon, LoanRepaymentSelectionData$Choice$Routing$ActionUrl loanRepaymentSelectionData$Choice$Routing$ActionUrl, LocalizedString localizedString2, Long l, int i) {
            this(localizedString, null, icon, loanRepaymentSelectionData$Choice$Routing$ActionUrl, (i & 16) != 0 ? null : localizedString2, (i & 32) != 0 ? null : l, ByteString.EMPTY);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Choice)) {
                return false;
            }
            Choice choice = (Choice) obj;
            return Intrinsics.areEqual(unknownFields(), choice.unknownFields()) && Intrinsics.areEqual(this.primary_text, choice.primary_text) && Intrinsics.areEqual(this.secondary_text, choice.secondary_text) && this.icon == choice.icon && Intrinsics.areEqual(this.routing, choice.routing) && Intrinsics.areEqual(this.accessory_text, choice.accessory_text) && Intrinsics.areEqual(this.timestamp, choice.timestamp);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.primary_text;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.secondary_text;
            int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            Icon icon = this.icon;
            int hashCode4 = (hashCode3 + (icon != null ? icon.hashCode() : 0)) * 37;
            zziz zzizVar = this.routing;
            int hashCode5 = (hashCode4 + (zzizVar != null ? zzizVar.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.accessory_text;
            int hashCode6 = (hashCode5 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
            Long l = this.timestamp;
            int hashCode7 = hashCode6 + (l != null ? Long.hashCode(l.longValue()) : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiPublicProfile.Builder builder = new UiPublicProfile.Builder(16, false);
            builder.full_name = this.primary_text;
            builder.photo_url = this.secondary_text;
            builder.synopsis = this.icon;
            builder.full_cashtag = this.routing;
            builder.cashtag_url_enabled = this.accessory_text;
            builder.is_verified_account = this.timestamp;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.primary_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("primary_text=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.secondary_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("secondary_text=", localizedString2, arrayList);
            }
            Icon icon = this.icon;
            if (icon != null) {
                arrayList.add("icon=" + icon);
            }
            zziz zzizVar = this.routing;
            if (zzizVar != null) {
                arrayList.add("routing=" + zzizVar);
            }
            LocalizedString localizedString3 = this.accessory_text;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("accessory_text=", localizedString3, arrayList);
            }
            Long l = this.timestamp;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("timestamp=", l, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Choice{", "}", 0, null, null, 56);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Choice(LocalizedString localizedString, LocalizedString localizedString2, Icon icon, zziz zzizVar, LocalizedString localizedString3, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.primary_text = localizedString;
            this.secondary_text = localizedString2;
            this.icon = icon;
            this.routing = zzizVar;
            this.accessory_text = localizedString3;
            this.timestamp = l;
        }
    }
}
