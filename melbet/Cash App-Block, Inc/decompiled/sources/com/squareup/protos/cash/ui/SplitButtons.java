package com.squareup.protos.cash.ui;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.security.mri.api.v1.Identifiers;
import com.squareup.protos.cash.security.mri.api.v1.MRIContext;
import com.squareup.protos.cash.security.mri.api.v1.Signals;
import com.squareup.protos.cash.security.mri.api.v1.ThreeDsSignals;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.protos.cash.shop.rendering.api.OfferBadge;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.spendinginsights.CardSpendingInsightType;
import com.squareup.protos.cash.spendinginsights.appapi.GetCardSpendingInsightRequest;
import com.squareup.protos.cash.staff.syncvalues.CashForWorkAppletV1;
import com.squareup.protos.cash.sup.api.v1.CancelCheckoutByPaymentTokenResponse;
import com.squareup.protos.cash.sup.api.v1.CancelCheckoutResponse;
import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.protos.cash.supportal.app.CreateCFPBSettlementCaseResponse;
import com.squareup.protos.cash.taply.app.v1.LockPaymentTokenDeviceRequest;
import com.squareup.protos.cash.taply.app.v1.OnFidesmoProvisioningStartResponse;
import com.squareup.protos.cash.taply.app.v1.ProvisioningEligibility;
import com.squareup.protos.cash.taply.model.v1.LockActor;
import com.squareup.protos.cash.tax.OpenTaxHubRequest;
import com.squareup.protos.cash.tax.OpenTaxRequest;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.cash.taxfrontdoor.sync_values.UiTaxUpgrade;
import com.squareup.protos.cash.taxfrontdoor.sync_values.UpgradeStatus;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.cash.ui.graphs.AxisLabel;
import com.squareup.protos.cash.ui.graphs.LineGraph;
import com.squareup.protos.cash.ui.graphs.VerticalStackedBarGraph;
import com.squareup.protos.cash.whimsicard.syncentity.Action;
import com.squareup.protos.cash.whimsicard.syncentity.Action$Type$ClientRoute;
import com.squareup.protos.cash.whimsicard.syncentity.PaymentDevicePresentation;
import com.squareup.protos.cash.woodrow.model.v1.AssetAcquisition$AcquisitionType;
import com.squareup.protos.cash.woodrow.model.v1.AssetDisposition$DispositionType;
import com.squareup.protos.cash.woodrow.syncvalues.AcquisitionSummary;
import com.squareup.protos.cash.woodrow.syncvalues.DispositionSummary;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetailsUi;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetailsUiFooter;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetailsUiSections;
import com.squareup.protos.checkmate.profile.CheckDepositProfile;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.time.DateTime;
import com.squareup.protos.common.time.DateTimeInterval;
import com.squareup.protos.document.VersionData;
import com.squareup.protos.franklin.api.SetNotificationPreferenceResponse;
import com.squareup.protos.franklin.app.ClaimData;
import com.squareup.protos.franklin.common.AppVersion;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes8.dex */
public final class SplitButtons extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SplitButtons> CREATOR;
    public final Button primary_button;
    public final Button secondary_button;

    public final class Button extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Button> CREATOR;
        public final Action action;
        public final CdfEvent cdfEvent;
        public final LocalizableString localizable_text;
        public final String text;

        public final class Action extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Action> CREATOR;
            public final SplitButtons$Button$Action$Action$ClientRoute action;

            static {
                SplitButtons$Button$Action$Companion$ADAPTER$1 splitButtons$Button$Action$Companion$ADAPTER$1 = new SplitButtons$Button$Action$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Action.class), "type.googleapis.com/squareup.cash.ui.SplitButtons.Button.Action", Syntax.PROTO_2, null, "squareup/cash/ui/SplitButtons.proto");
                ADAPTER = splitButtons$Button$Action$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(splitButtons$Button$Action$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Action(SplitButtons$Button$Action$Action$ClientRoute splitButtons$Button$Action$Action$ClientRoute, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.action = splitButtons$Button$Action$Action$ClientRoute;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Action)) {
                    return false;
                }
                Action action = (Action) obj;
                return Intrinsics.areEqual(unknownFields(), action.unknownFields()) && Intrinsics.areEqual(this.action, action.action);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                SplitButtons$Button$Action$Action$ClientRoute splitButtons$Button$Action$Action$ClientRoute = this.action;
                int hashCode2 = hashCode + (splitButtons$Button$Action$Action$ClientRoute != null ? splitButtons$Button$Action$Action$ClientRoute.value.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ClaimData.Builder builder = new ClaimData.Builder(5);
                builder.claimable_payment = this.action;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                SplitButtons$Button$Action$Action$ClientRoute splitButtons$Button$Action$Action$ClientRoute = this.action;
                if (splitButtons$Button$Action$Action$ClientRoute != null) {
                    arrayList.add("action=" + splitButtons$Button$Action$Action$ClientRoute);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56);
            }
        }

        static {
            SplitButtons$Button$Companion$ADAPTER$1 splitButtons$Button$Companion$ADAPTER$1 = new SplitButtons$Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.cash.ui.SplitButtons.Button", Syntax.PROTO_2, null, "squareup/cash/ui/SplitButtons.proto");
            ADAPTER = splitButtons$Button$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(splitButtons$Button$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Button(String str, LocalizableString localizableString, Action action, CdfEvent cdfEvent, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
            this.localizable_text = localizableString;
            this.action = action;
            this.cdfEvent = cdfEvent;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.text, button.text) && Intrinsics.areEqual(this.localizable_text, button.localizable_text) && Intrinsics.areEqual(this.action, button.action) && Intrinsics.areEqual(this.cdfEvent, button.cdfEvent);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_text;
            int hashCode3 = (hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            Action action = this.action;
            int hashCode4 = (hashCode3 + (action != null ? action.hashCode() : 0)) * 37;
            CdfEvent cdfEvent = this.cdfEvent;
            int hashCode5 = hashCode4 + (cdfEvent != null ? cdfEvent.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ColoredButton.Builder builder = new ColoredButton.Builder(1);
            builder.button_color = this.text;
            builder.text_color = this.localizable_text;
            builder.text = this.action;
            builder.action = this.cdfEvent;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            LocalizableString localizableString = this.localizable_text;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_text=", localizableString, arrayList);
            }
            Action action = this.action;
            if (action != null) {
                arrayList.add("action=" + action);
            }
            CdfEvent cdfEvent = this.cdfEvent;
            if (cdfEvent != null) {
                arrayList.add("cdfEvent=" + cdfEvent);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
        }
    }

    static {
        SplitButtons$Companion$ADAPTER$1 splitButtons$Companion$ADAPTER$1 = new SplitButtons$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SplitButtons.class), "type.googleapis.com/squareup.cash.ui.SplitButtons", Syntax.PROTO_2, null, "squareup/cash/ui/SplitButtons.proto");
        ADAPTER = splitButtons$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(splitButtons$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitButtons(Button button, Button button2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.primary_button = button;
        this.secondary_button = button2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SplitButtons)) {
            return false;
        }
        SplitButtons splitButtons = (SplitButtons) obj;
        return Intrinsics.areEqual(unknownFields(), splitButtons.unknownFields()) && Intrinsics.areEqual(this.primary_button, splitButtons.primary_button) && Intrinsics.areEqual(this.secondary_button, splitButtons.secondary_button);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Button button = this.primary_button;
        int hashCode2 = (hashCode + (button != null ? button.hashCode() : 0)) * 37;
        Button button2 = this.secondary_button;
        int hashCode3 = hashCode2 + (button2 != null ? button2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.primary_button = this.primary_button;
        builder.secondary_button = this.secondary_button;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Button button = this.primary_button;
        if (button != null) {
            arrayList.add("primary_button=" + button);
        }
        Button button2 = this.secondary_button;
        if (button2 != null) {
            arrayList.add("secondary_button=" + button2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SplitButtons{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object primary_button;
        public Object secondary_button;

        public Builder() {
            this.$r8$classId = 2;
            this.secondary_button = EmptyList.INSTANCE;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new SplitButtons((Button) this.primary_button, (Button) this.secondary_button, buildUnknownFields());
                case 1:
                    return new MRIContext((Identifiers) this.primary_button, (Signals) this.secondary_button, buildUnknownFields());
                case 2:
                    return new ThreeDsSignals((ThreeDsSignals.Status) this.primary_button, (List) this.secondary_button, buildUnknownFields());
                case 3:
                    return new AnalyticsEvent.ClientGeneratedParam((String) this.primary_button, (AnalyticsEvent.ParamType) this.secondary_button, buildUnknownFields());
                case 4:
                    return new FilterGroupSection.FilterGroupItem.Toggle((String) this.primary_button, (TapAction) this.secondary_button, buildUnknownFields());
                case 5:
                    return new OfferBadge((StyledText) this.primary_button, (Color) this.secondary_button, buildUnknownFields());
                case 6:
                    return new TapAction((zzle) this.primary_button, (List) this.secondary_button, buildUnknownFields());
                case 7:
                    return new GetCardSpendingInsightRequest((CardSpendingInsightType) this.primary_button, (String) this.secondary_button, buildUnknownFields());
                case 8:
                    return new CashForWorkAppletV1((CashForWorkAppletV1.Visibility) this.primary_button, (Boolean) this.secondary_button, buildUnknownFields());
                case 9:
                    return new CancelCheckoutByPaymentTokenResponse((ResponseMetadata) this.primary_button, (Long) this.secondary_button, buildUnknownFields());
                case 10:
                    return new CancelCheckoutResponse((Boolean) this.primary_button, (ResponseMetadata) this.secondary_button, buildUnknownFields());
                case 11:
                    return new ChatMessage.SystemMessageBody((String) this.primary_button, (ChatMessage.SystemMessageBody.Styling) this.secondary_button, buildUnknownFields());
                case 12:
                    return new CreateCFPBSettlementCaseResponse((CreateCFPBSettlementCaseResponse.Status) this.primary_button, (String) this.secondary_button, buildUnknownFields());
                case 13:
                    return new LockPaymentTokenDeviceRequest((String) this.primary_button, (LockActor) this.secondary_button, buildUnknownFields());
                case 14:
                    return new OnFidesmoProvisioningStartResponse((ProvisioningEligibility) this.primary_button, (ResponseContext) this.secondary_button, buildUnknownFields());
                case 15:
                    return new OpenTaxHubRequest((RequestContext) this.primary_button, (TaxEnvironment) this.secondary_button, buildUnknownFields());
                case 16:
                    return new OpenTaxRequest((String) this.primary_button, (TaxEnvironment) this.secondary_button, buildUnknownFields());
                case 17:
                    return new UiTaxUpgrade((String) this.primary_button, (UpgradeStatus) this.secondary_button, buildUnknownFields());
                case 18:
                    return new AxisLabel((LocalizedString) this.primary_button, (Long) this.secondary_button, buildUnknownFields());
                case 19:
                    return new LineGraph.Line((List) this.primary_button, (Color) this.secondary_button, buildUnknownFields());
                case 20:
                    return new VerticalStackedBarGraph.Bar.BarItem((Color) this.primary_button, (Long) this.secondary_button, buildUnknownFields());
                case 21:
                    return new Action((LocalizedString) this.primary_button, (Action$Type$ClientRoute) this.secondary_button, buildUnknownFields());
                case 22:
                    return new PaymentDevicePresentation((List) this.primary_button, (PaymentDevicePresentation.DeviceType) this.secondary_button, buildUnknownFields());
                case 23:
                    return new AcquisitionSummary((AssetAcquisition$AcquisitionType) this.primary_button, (Money) this.secondary_button, buildUnknownFields());
                case 24:
                    return new DispositionSummary((AssetDisposition$DispositionType) this.primary_button, (Money) this.secondary_button, buildUnknownFields());
                case 25:
                    return new PerformanceDetailsUi((PerformanceDetailsUiSections) this.primary_button, (PerformanceDetailsUiFooter) this.secondary_button, buildUnknownFields());
                case 26:
                    return new CheckDepositProfile((Boolean) this.primary_button, (BalanceData.Button) this.secondary_button, buildUnknownFields());
                case 27:
                    return new DateTimeInterval((DateTime) this.primary_button, (DateTime) this.secondary_button, buildUnknownFields());
                case 28:
                    return new VersionData((AppVersion) this.primary_button, (AppVersion) this.secondary_button, buildUnknownFields());
                default:
                    return new SetNotificationPreferenceResponse((SetNotificationPreferenceResponse.Status) this.primary_button, (ResponseContext) this.secondary_button, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }
}
