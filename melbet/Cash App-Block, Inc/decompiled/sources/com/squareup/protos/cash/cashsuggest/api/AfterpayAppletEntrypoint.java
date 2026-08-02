package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import app.cash.local.views.instore.TableQrCodeScannerViewKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashface.api.Trust;
import com.squareup.protos.cash.cashface.api.TrustsData;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
import com.squareup.protos.cash.cashregistrar.Account;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiAvatar;
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
import squareup.cash.savings.SavingsConfig;

/* loaded from: classes7.dex */
public final class AfterpayAppletEntrypoint extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AfterpayAppletEntrypoint> CREATOR;
    public final AnalyticsEvent analytic_tap_event;
    public final AnalyticsEvent analytic_view_event;
    public final TableQrCodeScannerViewKt entrypoint;
    public final TileConfiguration tile_configuration;
    public final LocalizedString title;

    public final class Ineligible extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Ineligible> CREATOR;
        public final LocalizedString text_line;

        static {
            AfterpayAppletEntrypoint$Ineligible$Companion$ADAPTER$1 afterpayAppletEntrypoint$Ineligible$Companion$ADAPTER$1 = new AfterpayAppletEntrypoint$Ineligible$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Ineligible.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayAppletEntrypoint.Ineligible", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletEntrypoint.proto");
            ADAPTER = afterpayAppletEntrypoint$Ineligible$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayAppletEntrypoint$Ineligible$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ineligible(LocalizedString localizedString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text_line = localizedString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Ineligible)) {
                return false;
            }
            Ineligible ineligible = (Ineligible) obj;
            return Intrinsics.areEqual(unknownFields(), ineligible.unknownFields()) && Intrinsics.areEqual(this.text_line, ineligible.text_line);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.text_line;
            int hashCode2 = hashCode + (localizedString != null ? localizedString.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SavingsConfig.Yield.Builder builder = new SavingsConfig.Yield.Builder(2);
            builder.yield_current_rate_enhanced = this.text_line;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.text_line;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("text_line=", localizedString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Ineligible{", "}", 0, null, null, 56);
        }
    }

    public final class Overdue extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Overdue> CREATOR;
        public final LocalizedString overdue_suffix;

        static {
            AfterpayAppletEntrypoint$Overdue$Companion$ADAPTER$1 afterpayAppletEntrypoint$Overdue$Companion$ADAPTER$1 = new AfterpayAppletEntrypoint$Overdue$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Overdue.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayAppletEntrypoint.Overdue", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletEntrypoint.proto");
            ADAPTER = afterpayAppletEntrypoint$Overdue$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayAppletEntrypoint$Overdue$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Overdue(LocalizedString localizedString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.overdue_suffix = localizedString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Overdue)) {
                return false;
            }
            Overdue overdue = (Overdue) obj;
            return Intrinsics.areEqual(unknownFields(), overdue.unknownFields()) && Intrinsics.areEqual(this.overdue_suffix, overdue.overdue_suffix);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.overdue_suffix;
            int hashCode2 = hashCode + (localizedString != null ? localizedString.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SavingsConfig.Yield.Builder builder = new SavingsConfig.Yield.Builder(3);
            builder.yield_current_rate_enhanced = this.overdue_suffix;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.overdue_suffix;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("overdue_suffix=", localizedString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Overdue{", "}", 0, null, null, 56);
        }
    }

    public enum TileConfiguration implements WireEnum {
        INSTALLED(0),
        UNINSTALLED(1);

        public static final AfterpayAppletEntrypoint$TileConfiguration$Companion$ADAPTER$1 ADAPTER;
        public static final Alignment.Companion Companion;
        public final int value;

        static {
            TileConfiguration tileConfiguration = INSTALLED;
            Companion = new Alignment.Companion();
            ADAPTER = new AfterpayAppletEntrypoint$TileConfiguration$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TileConfiguration.class), Syntax.PROTO_2, tileConfiguration);
        }

        TileConfiguration(int i) {
            this.value = i;
        }

        public static final TileConfiguration fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return INSTALLED;
            }
            if (i != 1) {
                return null;
            }
            return UNINSTALLED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class V3TextBrief extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<V3TextBrief> CREATOR;
        public final UiAvatar avatar;
        public final LocalizedString text;

        static {
            AfterpayAppletEntrypoint$V3TextBrief$Companion$ADAPTER$1 afterpayAppletEntrypoint$V3TextBrief$Companion$ADAPTER$1 = new AfterpayAppletEntrypoint$V3TextBrief$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(V3TextBrief.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayAppletEntrypoint.V3TextBrief", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletEntrypoint.proto");
            ADAPTER = afterpayAppletEntrypoint$V3TextBrief$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayAppletEntrypoint$V3TextBrief$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public V3TextBrief(UiAvatar uiAvatar, LocalizedString localizedString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.avatar = uiAvatar;
            this.text = localizedString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof V3TextBrief)) {
                return false;
            }
            V3TextBrief v3TextBrief = (V3TextBrief) obj;
            return Intrinsics.areEqual(unknownFields(), v3TextBrief.unknownFields()) && Intrinsics.areEqual(this.avatar, v3TextBrief.avatar) && Intrinsics.areEqual(this.text, v3TextBrief.text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            UiAvatar uiAvatar = this.avatar;
            int hashCode2 = (hashCode + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.text;
            int hashCode3 = hashCode2 + (localizedString != null ? localizedString.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Uninstalled.Builder builder = new Uninstalled.Builder(1);
            builder.avatar = this.avatar;
            builder.body = this.text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            UiAvatar uiAvatar = this.avatar;
            if (uiAvatar != null) {
                Matcher$$ExternalSyntheticOutline0.m("avatar=", uiAvatar, arrayList);
            }
            LocalizedString localizedString = this.text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "V3TextBrief{", "}", 0, null, null, 56);
        }
    }

    public final class V3Uninstalled extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<V3Uninstalled> CREATOR;
        public final LocalizedString body;

        static {
            AfterpayAppletEntrypoint$V3Uninstalled$Companion$ADAPTER$1 afterpayAppletEntrypoint$V3Uninstalled$Companion$ADAPTER$1 = new AfterpayAppletEntrypoint$V3Uninstalled$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(V3Uninstalled.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayAppletEntrypoint.V3Uninstalled", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletEntrypoint.proto");
            ADAPTER = afterpayAppletEntrypoint$V3Uninstalled$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayAppletEntrypoint$V3Uninstalled$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public V3Uninstalled(LocalizedString localizedString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.body = localizedString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof V3Uninstalled)) {
                return false;
            }
            V3Uninstalled v3Uninstalled = (V3Uninstalled) obj;
            return Intrinsics.areEqual(unknownFields(), v3Uninstalled.unknownFields()) && Intrinsics.areEqual(this.body, v3Uninstalled.body);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.body;
            int hashCode2 = hashCode + (localizedString != null ? localizedString.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SavingsConfig.Yield.Builder builder = new SavingsConfig.Yield.Builder(4);
            builder.yield_current_rate_enhanced = this.body;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.body;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("body=", localizedString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "V3Uninstalled{", "}", 0, null, null, 56);
        }
    }

    static {
        AfterpayAppletEntrypoint$Companion$ADAPTER$1 afterpayAppletEntrypoint$Companion$ADAPTER$1 = new AfterpayAppletEntrypoint$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AfterpayAppletEntrypoint.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayAppletEntrypoint", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletEntrypoint.proto");
        ADAPTER = afterpayAppletEntrypoint$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayAppletEntrypoint$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayAppletEntrypoint(LocalizedString localizedString, TableQrCodeScannerViewKt tableQrCodeScannerViewKt, AnalyticsEvent analyticsEvent, AnalyticsEvent analyticsEvent2, TileConfiguration tileConfiguration, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = localizedString;
        this.entrypoint = tableQrCodeScannerViewKt;
        this.analytic_view_event = analyticsEvent;
        this.analytic_tap_event = analyticsEvent2;
        this.tile_configuration = tileConfiguration;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletEntrypoint)) {
            return false;
        }
        AfterpayAppletEntrypoint afterpayAppletEntrypoint = (AfterpayAppletEntrypoint) obj;
        return Intrinsics.areEqual(unknownFields(), afterpayAppletEntrypoint.unknownFields()) && Intrinsics.areEqual(this.title, afterpayAppletEntrypoint.title) && Intrinsics.areEqual(this.entrypoint, afterpayAppletEntrypoint.entrypoint) && Intrinsics.areEqual(this.analytic_view_event, afterpayAppletEntrypoint.analytic_view_event) && Intrinsics.areEqual(this.analytic_tap_event, afterpayAppletEntrypoint.analytic_tap_event) && this.tile_configuration == afterpayAppletEntrypoint.tile_configuration;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        TableQrCodeScannerViewKt tableQrCodeScannerViewKt = this.entrypoint;
        int hashCode3 = (hashCode2 + (tableQrCodeScannerViewKt != null ? tableQrCodeScannerViewKt.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent = this.analytic_view_event;
        int hashCode4 = (hashCode3 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent2 = this.analytic_tap_event;
        int hashCode5 = (hashCode4 + (analyticsEvent2 != null ? analyticsEvent2.hashCode() : 0)) * 37;
        TileConfiguration tileConfiguration = this.tile_configuration;
        int hashCode6 = hashCode5 + (tileConfiguration != null ? tileConfiguration.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Account.Builder builder = new Account.Builder(16, false);
        builder.customer_token = this.title;
        builder.account_token = this.entrypoint;
        builder.display_name = this.analytic_view_event;
        builder.account_type = this.analytic_tap_event;
        builder.is_sponsored_account = this.tile_configuration;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        TableQrCodeScannerViewKt tableQrCodeScannerViewKt = this.entrypoint;
        if (tableQrCodeScannerViewKt != null) {
            arrayList.add("entrypoint=" + tableQrCodeScannerViewKt);
        }
        AnalyticsEvent analyticsEvent = this.analytic_view_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytic_view_event=", analyticsEvent, arrayList);
        }
        AnalyticsEvent analyticsEvent2 = this.analytic_tap_event;
        if (analyticsEvent2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytic_tap_event=", analyticsEvent2, arrayList);
        }
        TileConfiguration tileConfiguration = this.tile_configuration;
        if (tileConfiguration != null) {
            arrayList.add("tile_configuration=" + tileConfiguration);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AfterpayAppletEntrypoint{", "}", 0, null, null, 56);
    }

    public final class Uninstalled extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Uninstalled> CREATOR;
        public final UiAvatar avatar;
        public final LocalizedString body;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public UiAvatar avatar;
            public LocalizedString body;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new Uninstalled(this.avatar, this.body, buildUnknownFields());
                    default:
                        return new V3TextBrief(this.avatar, this.body, buildUnknownFields());
                }
            }
        }

        static {
            AfterpayAppletEntrypoint$Uninstalled$Companion$ADAPTER$1 afterpayAppletEntrypoint$Uninstalled$Companion$ADAPTER$1 = new AfterpayAppletEntrypoint$Uninstalled$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Uninstalled.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayAppletEntrypoint.Uninstalled", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletEntrypoint.proto");
            ADAPTER = afterpayAppletEntrypoint$Uninstalled$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayAppletEntrypoint$Uninstalled$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Uninstalled(UiAvatar uiAvatar, LocalizedString localizedString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.avatar = uiAvatar;
            this.body = localizedString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Uninstalled)) {
                return false;
            }
            Uninstalled uninstalled = (Uninstalled) obj;
            return Intrinsics.areEqual(unknownFields(), uninstalled.unknownFields()) && Intrinsics.areEqual(this.avatar, uninstalled.avatar) && Intrinsics.areEqual(this.body, uninstalled.body);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            UiAvatar uiAvatar = this.avatar;
            int hashCode2 = (hashCode + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.body;
            int hashCode3 = hashCode2 + (localizedString != null ? localizedString.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.avatar = this.avatar;
            builder.body = this.body;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            UiAvatar uiAvatar = this.avatar;
            if (uiAvatar != null) {
                Matcher$$ExternalSyntheticOutline0.m("avatar=", uiAvatar, arrayList);
            }
            LocalizedString localizedString = this.body;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("body=", localizedString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Uninstalled{", "}", 0, null, null, 56);
        }

        public /* synthetic */ Uninstalled(UiAvatar uiAvatar, LocalizedString localizedString, int i) {
            this((i & 1) != 0 ? null : uiAvatar, localizedString, ByteString.EMPTY);
        }
    }

    public final class CreditDetails extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CreditDetails> CREATOR;
        public final List detail_lines;

        static {
            AfterpayAppletEntrypoint$CreditDetails$Companion$ADAPTER$1 afterpayAppletEntrypoint$CreditDetails$Companion$ADAPTER$1 = new AfterpayAppletEntrypoint$CreditDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreditDetails.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayAppletEntrypoint.CreditDetails", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletEntrypoint.proto");
            ADAPTER = afterpayAppletEntrypoint$CreditDetails$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayAppletEntrypoint$CreditDetails$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreditDetails(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.detail_lines = TransactorKt.immutableCopyOf("detail_lines", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CreditDetails)) {
                return false;
            }
            CreditDetails creditDetails = (CreditDetails) obj;
            return Intrinsics.areEqual(unknownFields(), creditDetails.unknownFields()) && Intrinsics.areEqual(this.detail_lines, creditDetails.detail_lines);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.detail_lines.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            TrustsData.Builder builder = new TrustsData.Builder(9);
            builder.trust = this.detail_lines;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.detail_lines;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("detail_lines=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CreditDetails{", "}", 0, null, null, 56);
        }

        public final class DetailLine extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<DetailLine> CREATOR;
            public final Money amount;
            public final UiAvatar avatar;
            public final LocalizedString text_suffix;

            static {
                AfterpayAppletEntrypoint$CreditDetails$DetailLine$Companion$ADAPTER$1 afterpayAppletEntrypoint$CreditDetails$DetailLine$Companion$ADAPTER$1 = new AfterpayAppletEntrypoint$CreditDetails$DetailLine$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailLine.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayAppletEntrypoint.CreditDetails.DetailLine", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletEntrypoint.proto");
                ADAPTER = afterpayAppletEntrypoint$CreditDetails$DetailLine$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayAppletEntrypoint$CreditDetails$DetailLine$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DetailLine(UiAvatar uiAvatar, Money money, LocalizedString localizedString, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.avatar = uiAvatar;
                this.amount = money;
                this.text_suffix = localizedString;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DetailLine)) {
                    return false;
                }
                DetailLine detailLine = (DetailLine) obj;
                return Intrinsics.areEqual(unknownFields(), detailLine.unknownFields()) && Intrinsics.areEqual(this.avatar, detailLine.avatar) && Intrinsics.areEqual(this.amount, detailLine.amount) && Intrinsics.areEqual(this.text_suffix, detailLine.text_suffix);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                UiAvatar uiAvatar = this.avatar;
                int hashCode2 = (hashCode + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
                Money money = this.amount;
                int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
                LocalizedString localizedString = this.text_suffix;
                int hashCode4 = hashCode3 + (localizedString != null ? localizedString.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Row.Builder builder = new Row.Builder(21);
                builder.title = this.avatar;
                builder.subtitle = this.amount;
                builder.action = this.text_suffix;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                UiAvatar uiAvatar = this.avatar;
                if (uiAvatar != null) {
                    Matcher$$ExternalSyntheticOutline0.m("avatar=", uiAvatar, arrayList);
                }
                Money money = this.amount;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
                }
                LocalizedString localizedString = this.text_suffix;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("text_suffix=", localizedString, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "DetailLine{", "}", 0, null, null, 56);
            }

            public /* synthetic */ DetailLine(UiAvatar uiAvatar, Money money, LocalizedString localizedString) {
                this(uiAvatar, money, localizedString, ByteString.EMPTY);
            }
        }
    }

    public final class V3LoanBrief extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<V3LoanBrief> CREATOR;
        public final Money amount;
        public final UiAvatar avatar;
        public final LocalizedString hint_text;
        public final LocalizedString text;

        static {
            AfterpayAppletEntrypoint$V3LoanBrief$Companion$ADAPTER$1 afterpayAppletEntrypoint$V3LoanBrief$Companion$ADAPTER$1 = new AfterpayAppletEntrypoint$V3LoanBrief$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(V3LoanBrief.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayAppletEntrypoint.V3LoanBrief", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletEntrypoint.proto");
            ADAPTER = afterpayAppletEntrypoint$V3LoanBrief$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayAppletEntrypoint$V3LoanBrief$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public V3LoanBrief(UiAvatar uiAvatar, Money money, LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.avatar = uiAvatar;
            this.amount = money;
            this.text = localizedString;
            this.hint_text = localizedString2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof V3LoanBrief)) {
                return false;
            }
            V3LoanBrief v3LoanBrief = (V3LoanBrief) obj;
            return Intrinsics.areEqual(unknownFields(), v3LoanBrief.unknownFields()) && Intrinsics.areEqual(this.avatar, v3LoanBrief.avatar) && Intrinsics.areEqual(this.amount, v3LoanBrief.amount) && Intrinsics.areEqual(this.text, v3LoanBrief.text) && Intrinsics.areEqual(this.hint_text, v3LoanBrief.hint_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            UiAvatar uiAvatar = this.avatar;
            int hashCode2 = (hashCode + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
            Money money = this.amount;
            int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.text;
            int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.hint_text;
            int hashCode5 = hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Trust.Builder builder = new Trust.Builder(12, false);
            builder.icon = this.avatar;
            builder.title = this.amount;
            builder.enabled = this.text;
            builder.id = this.hint_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            UiAvatar uiAvatar = this.avatar;
            if (uiAvatar != null) {
                Matcher$$ExternalSyntheticOutline0.m("avatar=", uiAvatar, arrayList);
            }
            Money money = this.amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
            }
            LocalizedString localizedString = this.text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.hint_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("hint_text=", localizedString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "V3LoanBrief{", "}", 0, null, null, 56);
        }

        public /* synthetic */ V3LoanBrief(UiAvatar uiAvatar, Money money, LocalizedString localizedString, LocalizedString localizedString2) {
            this(uiAvatar, money, localizedString, localizedString2, ByteString.EMPTY);
        }
    }

    public final class CreditBalance extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CreditBalance> CREATOR;
        public final RingStyle ring_style;
        public final LocalizedString total_balance_suffix;
        public final LocalizedString total_credit_suffix;

        public enum RingStyle implements WireEnum {
            SEGMENTED(0),
            COMBINED(1);

            public static final AfterpayAppletEntrypoint$CreditBalance$RingStyle$Companion$ADAPTER$1 ADAPTER;
            public static final Action.Type.Companion Companion;
            public final int value;

            static {
                RingStyle ringStyle = SEGMENTED;
                Companion = new Action.Type.Companion();
                ADAPTER = new AfterpayAppletEntrypoint$CreditBalance$RingStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RingStyle.class), Syntax.PROTO_2, ringStyle);
            }

            RingStyle(int i) {
                this.value = i;
            }

            public static final RingStyle fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return SEGMENTED;
                }
                if (i != 1) {
                    return null;
                }
                return COMBINED;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            AfterpayAppletEntrypoint$CreditBalance$Companion$ADAPTER$1 afterpayAppletEntrypoint$CreditBalance$Companion$ADAPTER$1 = new AfterpayAppletEntrypoint$CreditBalance$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreditBalance.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayAppletEntrypoint.CreditBalance", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletEntrypoint.proto");
            ADAPTER = afterpayAppletEntrypoint$CreditBalance$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayAppletEntrypoint$CreditBalance$Companion$ADAPTER$1);
        }

        public /* synthetic */ CreditBalance(LocalizedString localizedString, LocalizedString localizedString2, int i) {
            this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? null : localizedString2, (i & 4) != 0 ? null : RingStyle.COMBINED, ByteString.EMPTY);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CreditBalance)) {
                return false;
            }
            CreditBalance creditBalance = (CreditBalance) obj;
            return Intrinsics.areEqual(unknownFields(), creditBalance.unknownFields()) && Intrinsics.areEqual(this.total_credit_suffix, creditBalance.total_credit_suffix) && Intrinsics.areEqual(this.total_balance_suffix, creditBalance.total_balance_suffix) && this.ring_style == creditBalance.ring_style;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.total_credit_suffix;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.total_balance_suffix;
            int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            RingStyle ringStyle = this.ring_style;
            int hashCode4 = hashCode3 + (ringStyle != null ? ringStyle.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Row.Builder builder = new Row.Builder(20);
            builder.title = this.total_credit_suffix;
            builder.subtitle = this.total_balance_suffix;
            builder.action = this.ring_style;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.total_credit_suffix;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("total_credit_suffix=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.total_balance_suffix;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("total_balance_suffix=", localizedString2, arrayList);
            }
            RingStyle ringStyle = this.ring_style;
            if (ringStyle != null) {
                arrayList.add("ring_style=" + ringStyle);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CreditBalance{", "}", 0, null, null, 56);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreditBalance(LocalizedString localizedString, LocalizedString localizedString2, RingStyle ringStyle, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.total_credit_suffix = localizedString;
            this.total_balance_suffix = localizedString2;
            this.ring_style = ringStyle;
        }
    }
}
