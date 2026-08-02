package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Animation;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.bankingbenefits.ui.SpendPathProgress;
import squareup.cash.earnings.EarnerModeSheetData;
import squareup.cash.earnings.EarnerModeTool;
import squareup.cash.earnings.EarningStream;
import squareup.cash.earnings.EarningStreamIdentifier;
import squareup.cash.earnings.EarningsTimeFrame;
import squareup.cash.overdraft.OverdraftStatus;
import squareup.cash.paychecks.AlertUi;
import squareup.cash.paychecks.AllocationDistribution;
import squareup.cash.paychecks.DistributionSummaryUi;
import squareup.cash.paychecks.Employer;
import squareup.cash.paychecks.Paycheck;
import squareup.cash.paychecks.PaychecksHomeUi;
import squareup.cash.paychecks.TimeBoundedPaychecksAggregation;
import squareup.cash.savings.SavingsConfig;
import squareup.cash.savings.SavingsScreen;
import squareup.cash.savings.SavingsScreens;
import squareup.cash.savings.action.Button;
import squareup.cash.savings.action.Card;
import squareup.cash.savings.action.Icon;
import squareup.cash.savings.action.Placement;
import squareup.cash.savings.action.SavingsAction;
import squareup.cash.savings.bespoke_elements.CardImage;
import squareup.cash.ui.arcade.elements.ButtonCtaGroup;
import squareup.cash.ui.arcade.elements.ButtonDefault;
import squareup.cash.ui.arcade.elements.InlineMessage;

/* loaded from: classes10.dex */
public final class Action extends Message {
    public static final ProtoAdapter ADAPTER = new Action$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Action.class), "type.googleapis.com/xyz.block.genie.v1.Action", Syntax.PROTO_2, null, "xyz/block/genie/v1/action.proto");
    public final CollectionMutation collection_mutation;
    public final CompoundAction compound_action;
    public final Navigate navigate;
    public final OpenURL open_url;
    public final SetViewStateValue set_view_state_value;
    public final Submit submit;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object collection_mutation;
        public Object compound_action;
        public Object navigate;
        public Object open_url;
        public Serializable set_view_state_value;
        public Object submit;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Action((Navigate) this.navigate, (SetViewStateValue) this.set_view_state_value, (OpenURL) this.open_url, (CompoundAction) this.compound_action, (Submit) this.submit, (CollectionMutation) this.collection_mutation, buildUnknownFields());
                case 1:
                    return new SpendPathProgress((Long) this.navigate, (Long) this.set_view_state_value, (Money) this.open_url, (Money) this.compound_action, (Money) this.submit, (Double) this.collection_mutation, buildUnknownFields());
                case 2:
                    return new EarnerModeTool((LocalizedString) this.navigate, (LocalizedString) this.set_view_state_value, (Boolean) this.open_url, (String) this.compound_action, (EarnerModeSheetData) this.submit, (Instant) this.collection_mutation, buildUnknownFields());
                case 3:
                    return new EarningStream((EarningStreamIdentifier) this.navigate, (String) this.set_view_state_value, (UiAvatar) this.open_url, (Money) this.compound_action, (String) this.submit, (EarningsTimeFrame) this.collection_mutation, buildUnknownFields());
                case 4:
                    return new OverdraftStatus.Activated((Money) this.navigate, (LocalizedString) this.set_view_state_value, (OverdraftStatus.Button) this.open_url, (OverdraftStatus.ToggleButton) this.compound_action, (LocalizedString) this.submit, (LocalizedString) this.collection_mutation, buildUnknownFields());
                case 5:
                    return new DistributionSummaryUi((List) this.navigate, (DistributionSummaryUi.HelpSheetUi) this.set_view_state_value, (AlertUi) this.open_url, (LocalizedString) this.compound_action, (LocalizedString) this.submit, (AlertUi) this.collection_mutation, buildUnknownFields());
                case 6:
                    return new DistributionSummaryUi.HelpSheetUi((String) this.navigate, (LocalizedString) this.set_view_state_value, (List) this.open_url, (LocalizedString) this.compound_action, (LocalizedString) this.submit, (List) this.collection_mutation, buildUnknownFields());
                case 7:
                    return new Paycheck((String) this.navigate, (Paycheck.SettlementDate) this.set_view_state_value, (Employer) this.open_url, (AllocationDistribution) this.compound_action, (List) this.submit, (List) this.collection_mutation, buildUnknownFields());
                case 8:
                    return new PaychecksHomeUi.DistributionNUXSection((Image) this.navigate, (String) this.set_view_state_value, (LocalizedString) this.open_url, (LocalizedString) this.compound_action, (LocalizedString) this.submit, (String) this.collection_mutation, buildUnknownFields());
                case 9:
                    return new TimeBoundedPaychecksAggregation((String) this.navigate, (Long) this.set_view_state_value, (Long) this.open_url, (List) this.compound_action, (List) this.submit, (List) this.collection_mutation, buildUnknownFields());
                case 10:
                    return new SavingsConfig((Animation) this.navigate, (Card) this.set_view_state_value, (SavingsConfig.SavingsAppletUi) this.open_url, (SavingsConfig.DirectDepositSavingsBenefit) this.compound_action, (SavingsConfig.Yield) this.submit, (squareup.cash.savings.bespoke_elements.Card) this.collection_mutation, buildUnknownFields());
                case 11:
                    return new SavingsScreens((SavingsScreen) this.navigate, (LocalizedString) this.set_view_state_value, (SavingsScreen) this.open_url, (SavingsScreen) this.compound_action, (LocalizedString) this.submit, (Boolean) this.collection_mutation, buildUnknownFields());
                case 12:
                    return new Button((LocalizedString) this.navigate, (Icon) this.set_view_state_value, (SavingsAction) this.open_url, (Placement) this.compound_action, (Button.Style) this.submit, (LocalizedString) this.collection_mutation, buildUnknownFields());
                case 13:
                    return new Card((Card.Image) this.navigate, (LocalizedString) this.set_view_state_value, (LocalizedString) this.open_url, (Card.TextAlignment) this.compound_action, (Button) this.submit, (Button) this.collection_mutation, buildUnknownFields());
                case 14:
                    return new squareup.cash.savings.bespoke_elements.Card((InlineMessage) this.navigate, (CardImage) this.set_view_state_value, (String) this.open_url, (CdfEvent) this.compound_action, (String) this.submit, (CdfEvent) this.collection_mutation, buildUnknownFields());
                default:
                    return new ButtonCtaGroup((ButtonDefault) this.navigate, (ButtonDefault) this.set_view_state_value, (ButtonDefault) this.open_url, (ButtonCtaGroup.Direction) this.compound_action, (LocalizedString) this.submit, (Boolean) this.collection_mutation, buildUnknownFields());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Action(Navigate navigate, SetViewStateValue setViewStateValue, OpenURL openURL, CompoundAction compoundAction, Submit submit, CollectionMutation collectionMutation, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.navigate = navigate;
        this.set_view_state_value = setViewStateValue;
        this.open_url = openURL;
        this.compound_action = compoundAction;
        this.submit = submit;
        this.collection_mutation = collectionMutation;
        if (TransactorKt.countNonNull(navigate, setViewStateValue, openURL, compoundAction, submit, collectionMutation) <= 1) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("At most one of navigate, set_view_state_value, open_url, compound_action, submit, collection_mutation may be non-null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return Intrinsics.areEqual(unknownFields(), action.unknownFields()) && Intrinsics.areEqual(this.navigate, action.navigate) && Intrinsics.areEqual(this.set_view_state_value, action.set_view_state_value) && Intrinsics.areEqual(this.open_url, action.open_url) && Intrinsics.areEqual(this.compound_action, action.compound_action) && Intrinsics.areEqual(this.submit, action.submit) && Intrinsics.areEqual(this.collection_mutation, action.collection_mutation);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Navigate navigate = this.navigate;
        int hashCode2 = (hashCode + (navigate != null ? navigate.hashCode() : 0)) * 37;
        SetViewStateValue setViewStateValue = this.set_view_state_value;
        int hashCode3 = (hashCode2 + (setViewStateValue != null ? setViewStateValue.hashCode() : 0)) * 37;
        OpenURL openURL = this.open_url;
        int hashCode4 = (hashCode3 + (openURL != null ? openURL.hashCode() : 0)) * 37;
        CompoundAction compoundAction = this.compound_action;
        int hashCode5 = (hashCode4 + (compoundAction != null ? compoundAction.hashCode() : 0)) * 37;
        Submit submit = this.submit;
        int hashCode6 = (hashCode5 + (submit != null ? submit.hashCode() : 0)) * 37;
        CollectionMutation collectionMutation = this.collection_mutation;
        int hashCode7 = hashCode6 + (collectionMutation != null ? collectionMutation.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.navigate = this.navigate;
        builder.set_view_state_value = this.set_view_state_value;
        builder.open_url = this.open_url;
        builder.compound_action = this.compound_action;
        builder.submit = this.submit;
        builder.collection_mutation = this.collection_mutation;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Navigate navigate = this.navigate;
        if (navigate != null) {
            arrayList.add("navigate=" + navigate);
        }
        SetViewStateValue setViewStateValue = this.set_view_state_value;
        if (setViewStateValue != null) {
            arrayList.add("set_view_state_value=" + setViewStateValue);
        }
        OpenURL openURL = this.open_url;
        if (openURL != null) {
            arrayList.add("open_url=" + openURL);
        }
        CompoundAction compoundAction = this.compound_action;
        if (compoundAction != null) {
            arrayList.add("compound_action=" + compoundAction);
        }
        Submit submit = this.submit;
        if (submit != null) {
            arrayList.add("submit=" + submit);
        }
        CollectionMutation collectionMutation = this.collection_mutation;
        if (collectionMutation != null) {
            arrayList.add("collection_mutation=" + collectionMutation);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56);
    }
}
