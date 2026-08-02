package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.SetPaycheckMultiAllocationBlocker;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;
import squareup.cash.paychecks.AlertUi;
import squareup.cash.paychecks.AllocationDistribution;
import squareup.cash.paychecks.BottomSheet;
import squareup.cash.paychecks.LocalizedTemplatedString;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004)(*+R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0005R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0005R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010#¨\u0006,"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$Builder;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "localized_title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "Lcom/squareup/protos/common/Money;", "average_monthly_paycheck_amount", "Lcom/squareup/protos/common/Money;", "Lsquareup/cash/paychecks/AllocationDistribution;", "distribution", "Lsquareup/cash/paychecks/AllocationDistribution;", "", "editable_distribution_allocation_start_index", "Ljava/lang/Integer;", "localized_cta_title", "localized_disable_cta_title", "Lsquareup/cash/paychecks/AlertUi;", "exceeded_max_distribution_alert_ui", "Lsquareup/cash/paychecks/AlertUi;", "Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$ZeroAllocationBehavior;", "zero_allocation_behavior", "Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$ZeroAllocationBehavior;", "Lsquareup/cash/paychecks/LocalizedTemplatedString;", "estimated_currency_amount_template", "Lsquareup/cash/paychecks/LocalizedTemplatedString;", "atm_option_accessibility_hint_template", "custom_amount_subtitle", "custom_amount_accessibility_hint", "Lsquareup/cash/paychecks/BottomSheet;", "explanation", "Lsquareup/cash/paychecks/BottomSheet;", "", "Lcom/squareup/protos/cash/ui/Color;", "allocation_tint_colors", "Ljava/util/List;", "Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$EditableAllocation;", "editable_allocations", "", "atm_picker_options_in_basis_points", "Companion", "Builder", "EditableAllocation", "ZeroAllocationBehavior", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SetPaycheckMultiAllocationBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetPaycheckMultiAllocationBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    public final List<Color> allocation_tint_colors;

    @WireField(adapter = "squareup.cash.paychecks.LocalizedTemplatedString#ADAPTER", schemaIndex = 12, tag = 13)
    public final LocalizedTemplatedString atm_option_accessibility_hint_template;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REPEATED, schemaIndex = 8, tag = 9)
    public final List<Long> atm_picker_options_in_basis_points;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 1, tag = 2)
    public final Money average_monthly_paycheck_amount;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 14, tag = 15)
    public final LocalizedString custom_amount_accessibility_hint;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 13, tag = 14)
    public final LocalizedString custom_amount_subtitle;

    @WireField(adapter = "squareup.cash.paychecks.AllocationDistribution#ADAPTER", schemaIndex = 2, tag = 3)
    public final AllocationDistribution distribution;

    @WireField(adapter = "com.squareup.protos.franklin.api.SetPaycheckMultiAllocationBlocker$EditableAllocation#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    public final List<EditableAllocation> editable_allocations;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 5, tag = 6)
    public final Integer editable_distribution_allocation_start_index;

    @WireField(adapter = "squareup.cash.paychecks.LocalizedTemplatedString#ADAPTER", schemaIndex = 11, tag = 12)
    public final LocalizedTemplatedString estimated_currency_amount_template;

    @WireField(adapter = "squareup.cash.paychecks.AlertUi#ADAPTER", schemaIndex = 9, tag = 10)
    public final AlertUi exceeded_max_distribution_alert_ui;

    @WireField(adapter = "squareup.cash.paychecks.BottomSheet#ADAPTER", schemaIndex = 15, tag = 16)
    public final BottomSheet explanation;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 6, tag = 7)
    public final LocalizedString localized_cta_title;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 7, tag = 8)
    public final LocalizedString localized_disable_cta_title;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
    public final LocalizedString localized_title;

    @WireField(adapter = "com.squareup.protos.franklin.api.SetPaycheckMultiAllocationBlocker$ZeroAllocationBehavior#ADAPTER", schemaIndex = 10, tag = 11)
    public final ZeroAllocationBehavior zero_allocation_behavior;

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0014\u0010\u000e\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fJ\u0015\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\"J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0015\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\fJ\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010 \u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010!J\b\u0010#\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker;", "<init>", "()V", "localized_title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "average_monthly_paycheck_amount", "Lcom/squareup/protos/common/Money;", "distribution", "Lsquareup/cash/paychecks/AllocationDistribution;", "allocation_tint_colors", "", "Lcom/squareup/protos/cash/ui/Color;", "editable_allocations", "Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$EditableAllocation;", "editable_distribution_allocation_start_index", "", "Ljava/lang/Integer;", "localized_cta_title", "localized_disable_cta_title", "atm_picker_options_in_basis_points", "", "exceeded_max_distribution_alert_ui", "Lsquareup/cash/paychecks/AlertUi;", "zero_allocation_behavior", "Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$ZeroAllocationBehavior;", "estimated_currency_amount_template", "Lsquareup/cash/paychecks/LocalizedTemplatedString;", "atm_option_accessibility_hint_template", "custom_amount_subtitle", "custom_amount_accessibility_hint", "explanation", "Lsquareup/cash/paychecks/BottomSheet;", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public List<Color> allocation_tint_colors;
        public LocalizedTemplatedString atm_option_accessibility_hint_template;
        public List<Long> atm_picker_options_in_basis_points;
        public Money average_monthly_paycheck_amount;
        public LocalizedString custom_amount_accessibility_hint;
        public LocalizedString custom_amount_subtitle;
        public AllocationDistribution distribution;
        public List<EditableAllocation> editable_allocations;
        public Integer editable_distribution_allocation_start_index;
        public LocalizedTemplatedString estimated_currency_amount_template;
        public AlertUi exceeded_max_distribution_alert_ui;
        public BottomSheet explanation;
        public LocalizedString localized_cta_title;
        public LocalizedString localized_disable_cta_title;
        public LocalizedString localized_title;
        public ZeroAllocationBehavior zero_allocation_behavior;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.allocation_tint_colors = emptyList;
            this.editable_allocations = emptyList;
            this.atm_picker_options_in_basis_points = emptyList;
        }

        public final Builder allocation_tint_colors(List<Color> allocation_tint_colors) {
            allocation_tint_colors.getClass();
            TransactorKt.checkElementsNotNull(allocation_tint_colors);
            this.allocation_tint_colors = allocation_tint_colors;
            return this;
        }

        public final Builder atm_option_accessibility_hint_template(LocalizedTemplatedString atm_option_accessibility_hint_template) {
            this.atm_option_accessibility_hint_template = atm_option_accessibility_hint_template;
            return this;
        }

        public final Builder atm_picker_options_in_basis_points(List<Long> atm_picker_options_in_basis_points) {
            atm_picker_options_in_basis_points.getClass();
            TransactorKt.checkElementsNotNull(atm_picker_options_in_basis_points);
            this.atm_picker_options_in_basis_points = atm_picker_options_in_basis_points;
            return this;
        }

        public final Builder average_monthly_paycheck_amount(Money average_monthly_paycheck_amount) {
            this.average_monthly_paycheck_amount = average_monthly_paycheck_amount;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public SetPaycheckMultiAllocationBlocker build() {
            return new SetPaycheckMultiAllocationBlocker(this.localized_title, this.average_monthly_paycheck_amount, this.distribution, this.allocation_tint_colors, this.editable_allocations, this.editable_distribution_allocation_start_index, this.localized_cta_title, this.localized_disable_cta_title, this.atm_picker_options_in_basis_points, this.exceeded_max_distribution_alert_ui, this.zero_allocation_behavior, this.estimated_currency_amount_template, this.atm_option_accessibility_hint_template, this.custom_amount_subtitle, this.custom_amount_accessibility_hint, this.explanation, buildUnknownFields());
        }

        public final Builder custom_amount_accessibility_hint(LocalizedString custom_amount_accessibility_hint) {
            this.custom_amount_accessibility_hint = custom_amount_accessibility_hint;
            return this;
        }

        public final Builder custom_amount_subtitle(LocalizedString custom_amount_subtitle) {
            this.custom_amount_subtitle = custom_amount_subtitle;
            return this;
        }

        public final Builder distribution(AllocationDistribution distribution) {
            this.distribution = distribution;
            return this;
        }

        public final Builder editable_allocations(List<EditableAllocation> editable_allocations) {
            editable_allocations.getClass();
            TransactorKt.checkElementsNotNull(editable_allocations);
            this.editable_allocations = editable_allocations;
            return this;
        }

        public final Builder editable_distribution_allocation_start_index(Integer editable_distribution_allocation_start_index) {
            this.editable_distribution_allocation_start_index = editable_distribution_allocation_start_index;
            return this;
        }

        public final Builder estimated_currency_amount_template(LocalizedTemplatedString estimated_currency_amount_template) {
            this.estimated_currency_amount_template = estimated_currency_amount_template;
            return this;
        }

        public final Builder exceeded_max_distribution_alert_ui(AlertUi exceeded_max_distribution_alert_ui) {
            this.exceeded_max_distribution_alert_ui = exceeded_max_distribution_alert_ui;
            return this;
        }

        public final Builder explanation(BottomSheet explanation) {
            this.explanation = explanation;
            return this;
        }

        public final Builder localized_cta_title(LocalizedString localized_cta_title) {
            this.localized_cta_title = localized_cta_title;
            return this;
        }

        public final Builder localized_disable_cta_title(LocalizedString localized_disable_cta_title) {
            this.localized_disable_cta_title = localized_disable_cta_title;
            return this;
        }

        public final Builder localized_title(LocalizedString localized_title) {
            this.localized_title = localized_title;
            return this;
        }

        public final Builder zero_allocation_behavior(ZeroAllocationBehavior zero_allocation_behavior) {
            this.zero_allocation_behavior = zero_allocation_behavior;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016J4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$EditableAllocation;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$EditableAllocation$Builder;", "display_name", "", "selection_behavior", "Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$EditableAllocation$SelectionBehavior;", "accessibility_hint_template", "Lsquareup/cash/paychecks/LocalizedTemplatedString;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$EditableAllocation$SelectionBehavior;Lsquareup/cash/paychecks/LocalizedTemplatedString;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "SelectionBehavior", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class EditableAllocation extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EditableAllocation> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "squareup.cash.paychecks.LocalizedTemplatedString#ADAPTER", schemaIndex = 2, tag = 3)
        public final LocalizedTemplatedString accessibility_hint_template;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String display_name;

        @WireField(adapter = "com.squareup.protos.franklin.api.SetPaycheckMultiAllocationBlocker$EditableAllocation$SelectionBehavior#ADAPTER", schemaIndex = 1, tag = 2)
        public final SelectionBehavior selection_behavior;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$EditableAllocation$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$EditableAllocation;", "<init>", "()V", "display_name", "", "selection_behavior", "Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$EditableAllocation$SelectionBehavior;", "accessibility_hint_template", "Lsquareup/cash/paychecks/LocalizedTemplatedString;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public LocalizedTemplatedString accessibility_hint_template;
            public String display_name;
            public SelectionBehavior selection_behavior;

            public final Builder accessibility_hint_template(LocalizedTemplatedString accessibility_hint_template) {
                this.accessibility_hint_template = accessibility_hint_template;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public EditableAllocation build() {
                return new EditableAllocation(this.display_name, this.selection_behavior, this.accessibility_hint_template, buildUnknownFields());
            }

            public final Builder display_name(String display_name) {
                this.display_name = display_name;
                return this;
            }

            public final Builder selection_behavior(SelectionBehavior selection_behavior) {
                this.selection_behavior = selection_behavior;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EditableAllocation.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SetPaycheckMultiAllocationBlocker$EditableAllocation$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public SetPaycheckMultiAllocationBlocker.EditableAllocation decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new SetPaycheckMultiAllocationBlocker.EditableAllocation((String) obj, (SetPaycheckMultiAllocationBlocker.EditableAllocation.SelectionBehavior) obj2, (LocalizedTemplatedString) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            try {
                                obj2 = SetPaycheckMultiAllocationBlocker.EditableAllocation.SelectionBehavior.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj3 = TransactorKt.decodeMessageOrMerge(LocalizedTemplatedString.ADAPTER, reader, obj3);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, SetPaycheckMultiAllocationBlocker.EditableAllocation value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.display_name);
                    SetPaycheckMultiAllocationBlocker.EditableAllocation.SelectionBehavior.ADAPTER.encodeWithTag(writer, 2, value.selection_behavior);
                    LocalizedTemplatedString.ADAPTER.encodeWithTag(writer, 3, value.accessibility_hint_template);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SetPaycheckMultiAllocationBlocker.EditableAllocation value) {
                    value.getClass();
                    return LocalizedTemplatedString.ADAPTER.encodedSizeWithTag(3, value.accessibility_hint_template) + SetPaycheckMultiAllocationBlocker.EditableAllocation.SelectionBehavior.ADAPTER.encodedSizeWithTag(2, value.selection_behavior) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.display_name) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SetPaycheckMultiAllocationBlocker.EditableAllocation redact(SetPaycheckMultiAllocationBlocker.EditableAllocation value) {
                    value.getClass();
                    LocalizedTemplatedString localizedTemplatedString = value.accessibility_hint_template;
                    return SetPaycheckMultiAllocationBlocker.EditableAllocation.copy$default(value, null, null, localizedTemplatedString != null ? (LocalizedTemplatedString) LocalizedTemplatedString.ADAPTER.redact(localizedTemplatedString) : null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SetPaycheckMultiAllocationBlocker.EditableAllocation value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    LocalizedTemplatedString.ADAPTER.encodeWithTag(writer, 3, value.accessibility_hint_template);
                    SetPaycheckMultiAllocationBlocker.EditableAllocation.SelectionBehavior.ADAPTER.encodeWithTag(writer, 2, value.selection_behavior);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.display_name);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ EditableAllocation(String str, SelectionBehavior selectionBehavior, LocalizedTemplatedString localizedTemplatedString, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : selectionBehavior, (i & 4) != 0 ? null : localizedTemplatedString, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ EditableAllocation copy$default(EditableAllocation editableAllocation, String str, SelectionBehavior selectionBehavior, LocalizedTemplatedString localizedTemplatedString, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = editableAllocation.display_name;
            }
            if ((i & 2) != 0) {
                selectionBehavior = editableAllocation.selection_behavior;
            }
            if ((i & 4) != 0) {
                localizedTemplatedString = editableAllocation.accessibility_hint_template;
            }
            if ((i & 8) != 0) {
                byteString = editableAllocation.unknownFields();
            }
            return editableAllocation.copy(str, selectionBehavior, localizedTemplatedString, byteString);
        }

        public final EditableAllocation copy(String display_name, SelectionBehavior selection_behavior, LocalizedTemplatedString accessibility_hint_template, ByteString unknownFields) {
            unknownFields.getClass();
            return new EditableAllocation(display_name, selection_behavior, accessibility_hint_template, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof EditableAllocation)) {
                return false;
            }
            EditableAllocation editableAllocation = (EditableAllocation) other;
            return Intrinsics.areEqual(unknownFields(), editableAllocation.unknownFields()) && Intrinsics.areEqual(this.display_name, editableAllocation.display_name) && this.selection_behavior == editableAllocation.selection_behavior && Intrinsics.areEqual(this.accessibility_hint_template, editableAllocation.accessibility_hint_template);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.display_name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            SelectionBehavior selectionBehavior = this.selection_behavior;
            int hashCode3 = (hashCode2 + (selectionBehavior != null ? selectionBehavior.hashCode() : 0)) * 37;
            LocalizedTemplatedString localizedTemplatedString = this.accessibility_hint_template;
            int hashCode4 = hashCode3 + (localizedTemplatedString != null ? localizedTemplatedString.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.display_name = this.display_name;
            builder.selection_behavior = this.selection_behavior;
            builder.accessibility_hint_template = this.accessibility_hint_template;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.display_name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "display_name=", arrayList);
            }
            SelectionBehavior selectionBehavior = this.selection_behavior;
            if (selectionBehavior != null) {
                arrayList.add("selection_behavior=" + selectionBehavior);
            }
            LocalizedTemplatedString localizedTemplatedString = this.accessibility_hint_template;
            if (localizedTemplatedString != null) {
                arrayList.add("accessibility_hint_template=" + localizedTemplatedString);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EditableAllocation{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$EditableAllocation$SelectionBehavior;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNSUPPORTED_DO_NOT_USE", "MODIFY_LOCALLY", "SUBMIT_SINGLE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class SelectionBehavior implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ SelectionBehavior[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final SelectionBehavior MODIFY_LOCALLY;
            public static final SelectionBehavior SUBMIT_SINGLE;
            public static final SelectionBehavior UNSUPPORTED_DO_NOT_USE;
            private final int value;

            private static final /* synthetic */ SelectionBehavior[] $values() {
                return new SelectionBehavior[]{UNSUPPORTED_DO_NOT_USE, MODIFY_LOCALLY, SUBMIT_SINGLE};
            }

            static {
                final SelectionBehavior selectionBehavior = new SelectionBehavior("UNSUPPORTED_DO_NOT_USE", 0, 0);
                UNSUPPORTED_DO_NOT_USE = selectionBehavior;
                MODIFY_LOCALLY = new SelectionBehavior("MODIFY_LOCALLY", 1, 1);
                SUBMIT_SINGLE = new SelectionBehavior("SUBMIT_SINGLE", 2, 2);
                SelectionBehavior[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SelectionBehavior.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, selectionBehavior) { // from class: com.squareup.protos.franklin.api.SetPaycheckMultiAllocationBlocker$EditableAllocation$SelectionBehavior$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public SetPaycheckMultiAllocationBlocker.EditableAllocation.SelectionBehavior fromValue(int value) {
                        return SetPaycheckMultiAllocationBlocker.EditableAllocation.SelectionBehavior.INSTANCE.fromValue(value);
                    }
                };
            }

            private SelectionBehavior(String str, int i, int i2) {
                this.value = i2;
            }

            public static final SelectionBehavior fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static SelectionBehavior valueOf(String str) {
                return (SelectionBehavior) Enum.valueOf(SelectionBehavior.class, str);
            }

            public static SelectionBehavior[] values() {
                return (SelectionBehavior[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$EditableAllocation$SelectionBehavior$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$EditableAllocation$SelectionBehavior;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final SelectionBehavior fromValue(int value) {
                    if (value == 0) {
                        return SelectionBehavior.UNSUPPORTED_DO_NOT_USE;
                    }
                    if (value == 1) {
                        return SelectionBehavior.MODIFY_LOCALLY;
                    }
                    if (value != 2) {
                        return null;
                    }
                    return SelectionBehavior.SUBMIT_SINGLE;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$EditableAllocation$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$EditableAllocation$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$EditableAllocation;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$EditableAllocation;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ EditableAllocation build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public EditableAllocation() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EditableAllocation(String str, SelectionBehavior selectionBehavior, LocalizedTemplatedString localizedTemplatedString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.display_name = str;
            this.selection_behavior = selectionBehavior;
            this.accessibility_hint_template = localizedTemplatedString;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetPaycheckMultiAllocationBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SetPaycheckMultiAllocationBlocker$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v36 */
            /* JADX WARN: Type inference failed for: r0v39 */
            /* JADX WARN: Type inference failed for: r0v40 */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public SetPaycheckMultiAllocationBlocker decode(ProtoReader reader) {
                Object obj;
                Object obj2;
                Object obj3;
                ?? decode;
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long beginMessage = reader.beginMessage();
                Integer num = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                Object obj11 = null;
                SetPaycheckMultiAllocationBlocker.ZeroAllocationBehavior zeroAllocationBehavior = null;
                LocalizedString localizedString = null;
                Object obj12 = null;
                Object obj13 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new SetPaycheckMultiAllocationBlocker(localizedString, (Money) obj4, (AllocationDistribution) obj5, m, arrayList, num, (LocalizedString) obj7, (LocalizedString) obj8, arrayList2, (AlertUi) obj9, zeroAllocationBehavior, (LocalizedTemplatedString) obj11, (LocalizedTemplatedString) obj6, (LocalizedString) obj10, (LocalizedString) obj12, (BottomSheet) obj13, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            localizedString = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, localizedString);
                            obj12 = obj12;
                            decode = num;
                            break;
                        case 2:
                            obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj4);
                            decode = num;
                            break;
                        case 3:
                            obj5 = TransactorKt.decodeMessageOrMerge(AllocationDistribution.ADAPTER, reader, obj5);
                            decode = num;
                            break;
                        case 4:
                            obj = obj12;
                            obj2 = obj10;
                            obj3 = obj11;
                            m.add(Color.ADAPTER.decode(reader));
                            decode = num;
                            obj12 = obj;
                            obj10 = obj2;
                            obj11 = obj3;
                            break;
                        case 5:
                            obj = obj12;
                            obj2 = obj10;
                            obj3 = obj11;
                            arrayList.add(SetPaycheckMultiAllocationBlocker.EditableAllocation.ADAPTER.decode(reader));
                            decode = num;
                            obj12 = obj;
                            obj10 = obj2;
                            obj11 = obj3;
                            break;
                        case 6:
                            decode = ProtoAdapter.UINT32.decode(reader);
                            break;
                        case 7:
                            obj7 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj7);
                            decode = num;
                            break;
                        case 8:
                            obj8 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj8);
                            decode = num;
                            break;
                        case 9:
                            obj = obj12;
                            obj2 = obj10;
                            obj3 = obj11;
                            arrayList2.add(ProtoAdapter.INT64.decode(reader));
                            decode = num;
                            obj12 = obj;
                            obj10 = obj2;
                            obj11 = obj3;
                            break;
                        case 10:
                            obj9 = TransactorKt.decodeMessageOrMerge(AlertUi.ADAPTER, reader, obj9);
                            decode = num;
                            break;
                        case 11:
                            try {
                                zeroAllocationBehavior = SetPaycheckMultiAllocationBlocker.ZeroAllocationBehavior.ADAPTER.decode(reader);
                                decode = num;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                obj = obj12;
                                obj2 = obj10;
                                obj3 = obj11;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 12:
                            obj11 = TransactorKt.decodeMessageOrMerge(LocalizedTemplatedString.ADAPTER, reader, obj11);
                            decode = num;
                            break;
                        case 13:
                            obj6 = TransactorKt.decodeMessageOrMerge(LocalizedTemplatedString.ADAPTER, reader, obj6);
                            decode = num;
                            break;
                        case 14:
                            obj10 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj10);
                            decode = num;
                            break;
                        case 15:
                            obj12 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj12);
                            decode = num;
                            break;
                        case 16:
                            obj13 = TransactorKt.decodeMessageOrMerge(BottomSheet.ADAPTER, reader, obj13);
                            decode = num;
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj12;
                            obj2 = obj10;
                            obj3 = obj11;
                            decode = num;
                            obj12 = obj;
                            obj10 = obj2;
                            obj11 = obj3;
                            break;
                    }
                    num = decode;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SetPaycheckMultiAllocationBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 1, value.localized_title);
                Money.ADAPTER.encodeWithTag(writer, 2, value.average_monthly_paycheck_amount);
                AllocationDistribution.ADAPTER.encodeWithTag(writer, 3, value.distribution);
                Color.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.allocation_tint_colors);
                SetPaycheckMultiAllocationBlocker.EditableAllocation.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.editable_allocations);
                ProtoAdapter.UINT32.encodeWithTag(writer, 6, value.editable_distribution_allocation_start_index);
                protoAdapter2.encodeWithTag(writer, 7, value.localized_cta_title);
                protoAdapter2.encodeWithTag(writer, 8, value.localized_disable_cta_title);
                ProtoAdapter.INT64.asRepeated().encodeWithTag(writer, 9, value.atm_picker_options_in_basis_points);
                AlertUi.ADAPTER.encodeWithTag(writer, 10, value.exceeded_max_distribution_alert_ui);
                SetPaycheckMultiAllocationBlocker.ZeroAllocationBehavior.ADAPTER.encodeWithTag(writer, 11, value.zero_allocation_behavior);
                ProtoAdapter protoAdapter3 = LocalizedTemplatedString.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 12, value.estimated_currency_amount_template);
                protoAdapter3.encodeWithTag(writer, 13, value.atm_option_accessibility_hint_template);
                protoAdapter2.encodeWithTag(writer, 14, value.custom_amount_subtitle);
                protoAdapter2.encodeWithTag(writer, 15, value.custom_amount_accessibility_hint);
                BottomSheet.ADAPTER.encodeWithTag(writer, 16, value.explanation);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SetPaycheckMultiAllocationBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                int encodedSizeWithTag = SetPaycheckMultiAllocationBlocker.ZeroAllocationBehavior.ADAPTER.encodedSizeWithTag(11, value.zero_allocation_behavior) + AlertUi.ADAPTER.encodedSizeWithTag(10, value.exceeded_max_distribution_alert_ui) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(9, value.atm_picker_options_in_basis_points) + protoAdapter2.encodedSizeWithTag(8, value.localized_disable_cta_title) + protoAdapter2.encodedSizeWithTag(7, value.localized_cta_title) + ProtoAdapter.UINT32.encodedSizeWithTag(6, value.editable_distribution_allocation_start_index) + SetPaycheckMultiAllocationBlocker.EditableAllocation.ADAPTER.asRepeated().encodedSizeWithTag(5, value.editable_allocations) + Color.ADAPTER.asRepeated().encodedSizeWithTag(4, value.allocation_tint_colors) + AllocationDistribution.ADAPTER.encodedSizeWithTag(3, value.distribution) + Money.ADAPTER.encodedSizeWithTag(2, value.average_monthly_paycheck_amount) + protoAdapter2.encodedSizeWithTag(1, value.localized_title) + size$okio;
                ProtoAdapter protoAdapter3 = LocalizedTemplatedString.ADAPTER;
                return BottomSheet.ADAPTER.encodedSizeWithTag(16, value.explanation) + protoAdapter2.encodedSizeWithTag(15, value.custom_amount_accessibility_hint) + protoAdapter2.encodedSizeWithTag(14, value.custom_amount_subtitle) + protoAdapter3.encodedSizeWithTag(13, value.atm_option_accessibility_hint_template) + protoAdapter3.encodedSizeWithTag(12, value.estimated_currency_amount_template) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SetPaycheckMultiAllocationBlocker redact(SetPaycheckMultiAllocationBlocker value) {
                value.getClass();
                LocalizedString localizedString = value.localized_title;
                LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                Money money = value.average_monthly_paycheck_amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                AllocationDistribution allocationDistribution = value.distribution;
                AllocationDistribution allocationDistribution2 = allocationDistribution != null ? (AllocationDistribution) AllocationDistribution.ADAPTER.redact(allocationDistribution) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.allocation_tint_colors, Color.ADAPTER);
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(value.editable_allocations, SetPaycheckMultiAllocationBlocker.EditableAllocation.ADAPTER);
                LocalizedString localizedString3 = value.localized_cta_title;
                LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
                LocalizedString localizedString5 = value.localized_disable_cta_title;
                LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
                AlertUi alertUi = value.exceeded_max_distribution_alert_ui;
                AlertUi alertUi2 = alertUi != null ? (AlertUi) AlertUi.ADAPTER.redact(alertUi) : null;
                LocalizedTemplatedString localizedTemplatedString = value.estimated_currency_amount_template;
                LocalizedTemplatedString localizedTemplatedString2 = localizedTemplatedString != null ? (LocalizedTemplatedString) LocalizedTemplatedString.ADAPTER.redact(localizedTemplatedString) : null;
                LocalizedTemplatedString localizedTemplatedString3 = value.atm_option_accessibility_hint_template;
                LocalizedTemplatedString localizedTemplatedString4 = localizedTemplatedString3 != null ? (LocalizedTemplatedString) LocalizedTemplatedString.ADAPTER.redact(localizedTemplatedString3) : null;
                LocalizedString localizedString7 = value.custom_amount_subtitle;
                LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
                LocalizedString localizedString9 = value.custom_amount_accessibility_hint;
                LocalizedString localizedString10 = localizedString9 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString9) : null;
                BottomSheet bottomSheet = value.explanation;
                BottomSheet bottomSheet2 = bottomSheet != null ? (BottomSheet) BottomSheet.ADAPTER.redact(bottomSheet) : null;
                ByteString byteString = ByteString.EMPTY;
                Integer num = value.editable_distribution_allocation_start_index;
                List<Long> list = value.atm_picker_options_in_basis_points;
                SetPaycheckMultiAllocationBlocker.ZeroAllocationBehavior zeroAllocationBehavior = value.zero_allocation_behavior;
                list.getClass();
                byteString.getClass();
                return new SetPaycheckMultiAllocationBlocker(localizedString2, money2, allocationDistribution2, m1169redactElements, m1169redactElements2, num, localizedString4, localizedString6, list, alertUi2, zeroAllocationBehavior, localizedTemplatedString2, localizedTemplatedString4, localizedString8, localizedString10, bottomSheet2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SetPaycheckMultiAllocationBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                BottomSheet.ADAPTER.encodeWithTag(writer, 16, value.explanation);
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 15, value.custom_amount_accessibility_hint);
                protoAdapter2.encodeWithTag(writer, 14, value.custom_amount_subtitle);
                ProtoAdapter protoAdapter3 = LocalizedTemplatedString.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 13, value.atm_option_accessibility_hint_template);
                protoAdapter3.encodeWithTag(writer, 12, value.estimated_currency_amount_template);
                SetPaycheckMultiAllocationBlocker.ZeroAllocationBehavior.ADAPTER.encodeWithTag(writer, 11, value.zero_allocation_behavior);
                AlertUi.ADAPTER.encodeWithTag(writer, 10, value.exceeded_max_distribution_alert_ui);
                ProtoAdapter.INT64.asRepeated().encodeWithTag(writer, 9, value.atm_picker_options_in_basis_points);
                protoAdapter2.encodeWithTag(writer, 8, value.localized_disable_cta_title);
                protoAdapter2.encodeWithTag(writer, 7, value.localized_cta_title);
                ProtoAdapter.UINT32.encodeWithTag(writer, 6, value.editable_distribution_allocation_start_index);
                SetPaycheckMultiAllocationBlocker.EditableAllocation.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.editable_allocations);
                Color.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.allocation_tint_colors);
                AllocationDistribution.ADAPTER.encodeWithTag(writer, 3, value.distribution);
                Money.ADAPTER.encodeWithTag(writer, 2, value.average_monthly_paycheck_amount);
                protoAdapter2.encodeWithTag(writer, 1, value.localized_title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetPaycheckMultiAllocationBlocker(LocalizedString localizedString, Money money, AllocationDistribution allocationDistribution, List list, List list2, Integer num, LocalizedString localizedString2, LocalizedString localizedString3, List list3, AlertUi alertUi, ZeroAllocationBehavior zeroAllocationBehavior, LocalizedTemplatedString localizedTemplatedString, LocalizedTemplatedString localizedTemplatedString2, LocalizedString localizedString4, LocalizedString localizedString5, BottomSheet bottomSheet, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.localized_title = localizedString;
        this.average_monthly_paycheck_amount = money;
        this.distribution = allocationDistribution;
        this.editable_distribution_allocation_start_index = num;
        this.localized_cta_title = localizedString2;
        this.localized_disable_cta_title = localizedString3;
        this.exceeded_max_distribution_alert_ui = alertUi;
        this.zero_allocation_behavior = zeroAllocationBehavior;
        this.estimated_currency_amount_template = localizedTemplatedString;
        this.atm_option_accessibility_hint_template = localizedTemplatedString2;
        this.custom_amount_subtitle = localizedString4;
        this.custom_amount_accessibility_hint = localizedString5;
        this.explanation = bottomSheet;
        this.allocation_tint_colors = TransactorKt.immutableCopyOf("allocation_tint_colors", list);
        this.editable_allocations = TransactorKt.immutableCopyOf("editable_allocations", list2);
        this.atm_picker_options_in_basis_points = TransactorKt.immutableCopyOf("atm_picker_options_in_basis_points", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetPaycheckMultiAllocationBlocker)) {
            return false;
        }
        SetPaycheckMultiAllocationBlocker setPaycheckMultiAllocationBlocker = (SetPaycheckMultiAllocationBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), setPaycheckMultiAllocationBlocker.unknownFields()) && Intrinsics.areEqual(this.localized_title, setPaycheckMultiAllocationBlocker.localized_title) && Intrinsics.areEqual(this.average_monthly_paycheck_amount, setPaycheckMultiAllocationBlocker.average_monthly_paycheck_amount) && Intrinsics.areEqual(this.distribution, setPaycheckMultiAllocationBlocker.distribution) && Intrinsics.areEqual(this.allocation_tint_colors, setPaycheckMultiAllocationBlocker.allocation_tint_colors) && Intrinsics.areEqual(this.editable_allocations, setPaycheckMultiAllocationBlocker.editable_allocations) && Intrinsics.areEqual(this.editable_distribution_allocation_start_index, setPaycheckMultiAllocationBlocker.editable_distribution_allocation_start_index) && Intrinsics.areEqual(this.localized_cta_title, setPaycheckMultiAllocationBlocker.localized_cta_title) && Intrinsics.areEqual(this.localized_disable_cta_title, setPaycheckMultiAllocationBlocker.localized_disable_cta_title) && Intrinsics.areEqual(this.atm_picker_options_in_basis_points, setPaycheckMultiAllocationBlocker.atm_picker_options_in_basis_points) && Intrinsics.areEqual(this.exceeded_max_distribution_alert_ui, setPaycheckMultiAllocationBlocker.exceeded_max_distribution_alert_ui) && this.zero_allocation_behavior == setPaycheckMultiAllocationBlocker.zero_allocation_behavior && Intrinsics.areEqual(this.estimated_currency_amount_template, setPaycheckMultiAllocationBlocker.estimated_currency_amount_template) && Intrinsics.areEqual(this.atm_option_accessibility_hint_template, setPaycheckMultiAllocationBlocker.atm_option_accessibility_hint_template) && Intrinsics.areEqual(this.custom_amount_subtitle, setPaycheckMultiAllocationBlocker.custom_amount_subtitle) && Intrinsics.areEqual(this.custom_amount_accessibility_hint, setPaycheckMultiAllocationBlocker.custom_amount_accessibility_hint) && Intrinsics.areEqual(this.explanation, setPaycheckMultiAllocationBlocker.explanation);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.localized_title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Money money = this.average_monthly_paycheck_amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        AllocationDistribution allocationDistribution = this.distribution;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (allocationDistribution != null ? allocationDistribution.hashCode() : 0)) * 37, 37, this.allocation_tint_colors), 37, this.editable_allocations);
        Integer num = this.editable_distribution_allocation_start_index;
        int hashCode4 = (m + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        LocalizedString localizedString2 = this.localized_cta_title;
        int hashCode5 = (hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        LocalizedString localizedString3 = this.localized_disable_cta_title;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37, 37, this.atm_picker_options_in_basis_points);
        AlertUi alertUi = this.exceeded_max_distribution_alert_ui;
        int hashCode6 = (m2 + (alertUi != null ? alertUi.hashCode() : 0)) * 37;
        ZeroAllocationBehavior zeroAllocationBehavior = this.zero_allocation_behavior;
        int hashCode7 = (hashCode6 + (zeroAllocationBehavior != null ? zeroAllocationBehavior.hashCode() : 0)) * 37;
        LocalizedTemplatedString localizedTemplatedString = this.estimated_currency_amount_template;
        int hashCode8 = (hashCode7 + (localizedTemplatedString != null ? localizedTemplatedString.hashCode() : 0)) * 37;
        LocalizedTemplatedString localizedTemplatedString2 = this.atm_option_accessibility_hint_template;
        int hashCode9 = (hashCode8 + (localizedTemplatedString2 != null ? localizedTemplatedString2.hashCode() : 0)) * 37;
        LocalizedString localizedString4 = this.custom_amount_subtitle;
        int hashCode10 = (hashCode9 + (localizedString4 != null ? localizedString4.hashCode() : 0)) * 37;
        LocalizedString localizedString5 = this.custom_amount_accessibility_hint;
        int hashCode11 = (hashCode10 + (localizedString5 != null ? localizedString5.hashCode() : 0)) * 37;
        BottomSheet bottomSheet = this.explanation;
        int hashCode12 = hashCode11 + (bottomSheet != null ? bottomSheet.hashCode() : 0);
        this.hashCode = hashCode12;
        return hashCode12;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.localized_title = this.localized_title;
        builder.average_monthly_paycheck_amount = this.average_monthly_paycheck_amount;
        builder.distribution = this.distribution;
        builder.allocation_tint_colors = this.allocation_tint_colors;
        builder.editable_allocations = this.editable_allocations;
        builder.editable_distribution_allocation_start_index = this.editable_distribution_allocation_start_index;
        builder.localized_cta_title = this.localized_cta_title;
        builder.localized_disable_cta_title = this.localized_disable_cta_title;
        builder.atm_picker_options_in_basis_points = this.atm_picker_options_in_basis_points;
        builder.exceeded_max_distribution_alert_ui = this.exceeded_max_distribution_alert_ui;
        builder.zero_allocation_behavior = this.zero_allocation_behavior;
        builder.estimated_currency_amount_template = this.estimated_currency_amount_template;
        builder.atm_option_accessibility_hint_template = this.atm_option_accessibility_hint_template;
        builder.custom_amount_subtitle = this.custom_amount_subtitle;
        builder.custom_amount_accessibility_hint = this.custom_amount_accessibility_hint;
        builder.explanation = this.explanation;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.localized_title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localized_title=", localizedString, arrayList);
        }
        Money money = this.average_monthly_paycheck_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("average_monthly_paycheck_amount=", money, arrayList);
        }
        AllocationDistribution allocationDistribution = this.distribution;
        if (allocationDistribution != null) {
            arrayList.add("distribution=" + allocationDistribution);
        }
        if (!this.allocation_tint_colors.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("allocation_tint_colors=", arrayList, this.allocation_tint_colors);
        }
        if (!this.editable_allocations.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("editable_allocations=", arrayList, this.editable_allocations);
        }
        Integer num = this.editable_distribution_allocation_start_index;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("editable_distribution_allocation_start_index=", num, arrayList);
        }
        LocalizedString localizedString2 = this.localized_cta_title;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localized_cta_title=", localizedString2, arrayList);
        }
        LocalizedString localizedString3 = this.localized_disable_cta_title;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localized_disable_cta_title=", localizedString3, arrayList);
        }
        if (!this.atm_picker_options_in_basis_points.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("atm_picker_options_in_basis_points=", arrayList, this.atm_picker_options_in_basis_points);
        }
        AlertUi alertUi = this.exceeded_max_distribution_alert_ui;
        if (alertUi != null) {
            arrayList.add("exceeded_max_distribution_alert_ui=" + alertUi);
        }
        ZeroAllocationBehavior zeroAllocationBehavior = this.zero_allocation_behavior;
        if (zeroAllocationBehavior != null) {
            arrayList.add("zero_allocation_behavior=" + zeroAllocationBehavior);
        }
        LocalizedTemplatedString localizedTemplatedString = this.estimated_currency_amount_template;
        if (localizedTemplatedString != null) {
            arrayList.add("estimated_currency_amount_template=" + localizedTemplatedString);
        }
        LocalizedTemplatedString localizedTemplatedString2 = this.atm_option_accessibility_hint_template;
        if (localizedTemplatedString2 != null) {
            arrayList.add("atm_option_accessibility_hint_template=" + localizedTemplatedString2);
        }
        LocalizedString localizedString4 = this.custom_amount_subtitle;
        if (localizedString4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("custom_amount_subtitle=", localizedString4, arrayList);
        }
        LocalizedString localizedString5 = this.custom_amount_accessibility_hint;
        if (localizedString5 != null) {
            Matcher$$ExternalSyntheticOutline0.m("custom_amount_accessibility_hint=", localizedString5, arrayList);
        }
        BottomSheet bottomSheet = this.explanation;
        if (bottomSheet != null) {
            arrayList.add("explanation=" + bottomSheet);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetPaycheckMultiAllocationBlocker{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$ZeroAllocationBehavior;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ZERO_ALLOCATION_BEHAVIOR_DO_NOT_USE", "REQUIRE_AT_LEAST_ONE_PERCENT_ALLOCATION", "SHOW_DISABLE_CTA", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ZeroAllocationBehavior implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ZeroAllocationBehavior[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ZeroAllocationBehavior REQUIRE_AT_LEAST_ONE_PERCENT_ALLOCATION;
        public static final ZeroAllocationBehavior SHOW_DISABLE_CTA;
        public static final ZeroAllocationBehavior ZERO_ALLOCATION_BEHAVIOR_DO_NOT_USE;
        private final int value;

        private static final /* synthetic */ ZeroAllocationBehavior[] $values() {
            return new ZeroAllocationBehavior[]{ZERO_ALLOCATION_BEHAVIOR_DO_NOT_USE, REQUIRE_AT_LEAST_ONE_PERCENT_ALLOCATION, SHOW_DISABLE_CTA};
        }

        static {
            final ZeroAllocationBehavior zeroAllocationBehavior = new ZeroAllocationBehavior("ZERO_ALLOCATION_BEHAVIOR_DO_NOT_USE", 0, 0);
            ZERO_ALLOCATION_BEHAVIOR_DO_NOT_USE = zeroAllocationBehavior;
            REQUIRE_AT_LEAST_ONE_PERCENT_ALLOCATION = new ZeroAllocationBehavior("REQUIRE_AT_LEAST_ONE_PERCENT_ALLOCATION", 1, 1);
            SHOW_DISABLE_CTA = new ZeroAllocationBehavior("SHOW_DISABLE_CTA", 2, 2);
            ZeroAllocationBehavior[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ZeroAllocationBehavior.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, zeroAllocationBehavior) { // from class: com.squareup.protos.franklin.api.SetPaycheckMultiAllocationBlocker$ZeroAllocationBehavior$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public SetPaycheckMultiAllocationBlocker.ZeroAllocationBehavior fromValue(int value) {
                    return SetPaycheckMultiAllocationBlocker.ZeroAllocationBehavior.INSTANCE.fromValue(value);
                }
            };
        }

        private ZeroAllocationBehavior(String str, int i, int i2) {
            this.value = i2;
        }

        public static final ZeroAllocationBehavior fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static ZeroAllocationBehavior valueOf(String str) {
            return (ZeroAllocationBehavior) Enum.valueOf(ZeroAllocationBehavior.class, str);
        }

        public static ZeroAllocationBehavior[] values() {
            return (ZeroAllocationBehavior[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$ZeroAllocationBehavior$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$ZeroAllocationBehavior;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ZeroAllocationBehavior fromValue(int value) {
                if (value == 0) {
                    return ZeroAllocationBehavior.ZERO_ALLOCATION_BEHAVIOR_DO_NOT_USE;
                }
                if (value == 1) {
                    return ZeroAllocationBehavior.REQUIRE_AT_LEAST_ONE_PERCENT_ALLOCATION;
                }
                if (value != 2) {
                    return null;
                }
                return ZeroAllocationBehavior.SHOW_DISABLE_CTA;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SetPaycheckMultiAllocationBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ SetPaycheckMultiAllocationBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
