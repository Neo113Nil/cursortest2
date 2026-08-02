package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzdw;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.aegis.sync_values.Text;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.protos.franklin.ui.Avatar;
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
import xyz.block.protos.genie.ViewPlan;

/* loaded from: classes8.dex */
public final class InstantPayRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InstantPayRenderData> CREATOR;
    public final zzdw activity;
    public final Avatar avatar;
    public final Image avatar_overlay_icon;

    public final class InstantPayout extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InstantPayout> CREATOR;
        public final Money amount;
        public final LocalizableString localizable_amount;
        public final LocalizableString localizable_name;
        public final String name;

        static {
            InstantPayRenderData$InstantPayout$Companion$ADAPTER$1 instantPayRenderData$InstantPayout$Companion$ADAPTER$1 = new InstantPayRenderData$InstantPayout$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InstantPayout.class), "type.googleapis.com/squareup.franklin.InstantPayRenderData.InstantPayout", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = instantPayRenderData$InstantPayout$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(instantPayRenderData$InstantPayout$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InstantPayout(String str, Money money, LocalizableString localizableString, LocalizableString localizableString2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.name = str;
            this.amount = money;
            this.localizable_name = localizableString;
            this.localizable_amount = localizableString2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InstantPayout)) {
                return false;
            }
            InstantPayout instantPayout = (InstantPayout) obj;
            return Intrinsics.areEqual(unknownFields(), instantPayout.unknownFields()) && Intrinsics.areEqual(this.name, instantPayout.name) && Intrinsics.areEqual(this.amount, instantPayout.amount) && Intrinsics.areEqual(this.localizable_name, instantPayout.localizable_name) && Intrinsics.areEqual(this.localizable_amount, instantPayout.localizable_amount);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Money money = this.amount;
            int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_name;
            int hashCode4 = (hashCode3 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.localizable_amount;
            int hashCode5 = hashCode4 + (localizableString2 != null ? localizableString2.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ColoredButton.Builder builder = new ColoredButton.Builder(22);
            builder.button_color = this.name;
            builder.text_color = this.amount;
            builder.text = this.localizable_name;
            builder.action = this.localizable_amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
            }
            Money money = this.amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
            }
            LocalizableString localizableString = this.localizable_name;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_name=", localizableString, arrayList);
            }
            LocalizableString localizableString2 = this.localizable_amount;
            if (localizableString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_amount=", localizableString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InstantPayout{", "}", 0, null, null, 56);
        }
    }

    public final class PaybackActivity extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PaybackActivity> CREATOR;
        public final String employer_name;
        public final List past_instant_payouts;

        static {
            InstantPayRenderData$PaybackActivity$Companion$ADAPTER$1 instantPayRenderData$PaybackActivity$Companion$ADAPTER$1 = new InstantPayRenderData$PaybackActivity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaybackActivity.class), "type.googleapis.com/squareup.franklin.InstantPayRenderData.PaybackActivity", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = instantPayRenderData$PaybackActivity$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(instantPayRenderData$PaybackActivity$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaybackActivity(List list, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.employer_name = str;
            this.past_instant_payouts = TransactorKt.immutableCopyOf("past_instant_payouts", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PaybackActivity)) {
                return false;
            }
            PaybackActivity paybackActivity = (PaybackActivity) obj;
            return Intrinsics.areEqual(unknownFields(), paybackActivity.unknownFields()) && Intrinsics.areEqual(this.past_instant_payouts, paybackActivity.past_instant_payouts) && Intrinsics.areEqual(this.employer_name, paybackActivity.employer_name);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.past_instant_payouts);
            String str = this.employer_name;
            int hashCode = m + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ViewPlan.Builder builder = new ViewPlan.Builder(8, false);
            builder.view_entries = this.past_instant_payouts;
            builder.initial_view_slug = this.employer_name;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.past_instant_payouts;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("past_instant_payouts=", arrayList, list);
            }
            String str = this.employer_name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "employer_name=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PaybackActivity{", "}", 0, null, null, 56);
        }
    }

    public final class Paycheck extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Paycheck> CREATOR;
        public final LocalizableString localizable_name;
        public final String name;

        static {
            InstantPayRenderData$Paycheck$Companion$ADAPTER$1 instantPayRenderData$Paycheck$Companion$ADAPTER$1 = new InstantPayRenderData$Paycheck$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Paycheck.class), "type.googleapis.com/squareup.franklin.InstantPayRenderData.Paycheck", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = instantPayRenderData$Paycheck$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(instantPayRenderData$Paycheck$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Paycheck(String str, LocalizableString localizableString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.name = str;
            this.localizable_name = localizableString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Paycheck)) {
                return false;
            }
            Paycheck paycheck = (Paycheck) obj;
            return Intrinsics.areEqual(unknownFields(), paycheck.unknownFields()) && Intrinsics.areEqual(this.name, paycheck.name) && Intrinsics.areEqual(this.localizable_name, paycheck.localizable_name);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_name;
            int hashCode3 = hashCode2 + (localizableString != null ? localizableString.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Text.Builder builder = new Text.Builder(4);
            builder.text = this.name;
            builder.localizable_text = this.localizable_name;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
            }
            LocalizableString localizableString = this.localizable_name;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_name=", localizableString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Paycheck{", "}", 0, null, null, 56);
        }
    }

    public final class PayoutActivity extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PayoutActivity> CREATOR;
        public final String employer_name;
        public final List paychecks_to_deduct_from;

        static {
            InstantPayRenderData$PayoutActivity$Companion$ADAPTER$1 instantPayRenderData$PayoutActivity$Companion$ADAPTER$1 = new InstantPayRenderData$PayoutActivity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PayoutActivity.class), "type.googleapis.com/squareup.franklin.InstantPayRenderData.PayoutActivity", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = instantPayRenderData$PayoutActivity$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(instantPayRenderData$PayoutActivity$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PayoutActivity(List list, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.employer_name = str;
            this.paychecks_to_deduct_from = TransactorKt.immutableCopyOf("paychecks_to_deduct_from", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PayoutActivity)) {
                return false;
            }
            PayoutActivity payoutActivity = (PayoutActivity) obj;
            return Intrinsics.areEqual(unknownFields(), payoutActivity.unknownFields()) && Intrinsics.areEqual(this.paychecks_to_deduct_from, payoutActivity.paychecks_to_deduct_from) && Intrinsics.areEqual(this.employer_name, payoutActivity.employer_name);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.paychecks_to_deduct_from);
            String str = this.employer_name;
            int hashCode = m + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ViewPlan.Builder builder = new ViewPlan.Builder(9, false);
            builder.view_entries = this.paychecks_to_deduct_from;
            builder.initial_view_slug = this.employer_name;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.paychecks_to_deduct_from;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("paychecks_to_deduct_from=", arrayList, list);
            }
            String str = this.employer_name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "employer_name=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PayoutActivity{", "}", 0, null, null, 56);
        }
    }

    static {
        InstantPayRenderData$Companion$ADAPTER$1 instantPayRenderData$Companion$ADAPTER$1 = new InstantPayRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InstantPayRenderData.class), "type.googleapis.com/squareup.franklin.InstantPayRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = instantPayRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(instantPayRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantPayRenderData(zzdw zzdwVar, Avatar avatar, Image image, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.activity = zzdwVar;
        this.avatar = avatar;
        this.avatar_overlay_icon = image;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstantPayRenderData)) {
            return false;
        }
        InstantPayRenderData instantPayRenderData = (InstantPayRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), instantPayRenderData.unknownFields()) && Intrinsics.areEqual(this.activity, instantPayRenderData.activity) && Intrinsics.areEqual(this.avatar, instantPayRenderData.avatar) && Intrinsics.areEqual(this.avatar_overlay_icon, instantPayRenderData.avatar_overlay_icon);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzdw zzdwVar = this.activity;
        int hashCode2 = (hashCode + (zzdwVar != null ? zzdwVar.hashCode() : 0)) * 37;
        Avatar avatar = this.avatar;
        int hashCode3 = (hashCode2 + (avatar != null ? avatar.hashCode() : 0)) * 37;
        Image image = this.avatar_overlay_icon;
        int hashCode4 = hashCode3 + (image != null ? image.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Institution.Builder builder = new Institution.Builder(21, false);
        builder.institution_token = this.activity;
        builder.display_info = this.avatar;
        builder.help_menu_items = this.avatar_overlay_icon;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzdw zzdwVar = this.activity;
        if (zzdwVar != null) {
            arrayList.add("activity=" + zzdwVar);
        }
        Avatar avatar = this.avatar;
        if (avatar != null) {
            arrayList.add("avatar=" + avatar);
        }
        Image image = this.avatar_overlay_icon;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("avatar_overlay_icon=", image, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstantPayRenderData{", "}", 0, null, null, 56);
    }
}
