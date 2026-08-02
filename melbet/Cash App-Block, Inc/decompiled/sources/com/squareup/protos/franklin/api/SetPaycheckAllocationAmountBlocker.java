package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.SetPaycheckAllocationAmountBlocker;
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
import kotlin.Deprecated;
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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import squareup.cash.paychecks.AlertUi;
import squareup.cash.paychecks.AllocationDestination;
import squareup.cash.paychecks.BottomSheet;
import squareup.cash.paychecks.LocalizedTemplatedString;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$Builder;", "", "initially_selected_destination_index", "Ljava/lang/Integer;", "Lsquareup/cash/paychecks/AlertUi;", "exceeded_max_distribution_alert_ui", "Lsquareup/cash/paychecks/AlertUi;", "Lcom/squareup/protos/common/Money;", "average_monthly_paycheck", "Lcom/squareup/protos/common/Money;", "", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration;", "initial_destination_states", "Ljava/util/List;", "Companion", "Builder", "DestinationUiConfiguration", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SetPaycheckAllocationAmountBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetPaycheckAllocationAmountBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 3, tag = 4)
    public final Money average_monthly_paycheck;

    @WireField(adapter = "squareup.cash.paychecks.AlertUi#ADAPTER", schemaIndex = 2, tag = 3)
    public final AlertUi exceeded_max_distribution_alert_ui;

    @WireField(adapter = "com.squareup.protos.franklin.api.SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<DestinationUiConfiguration> initial_destination_states;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
    public final Integer initially_selected_destination_index;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker;", "<init>", "()V", "initial_destination_states", "", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration;", "initially_selected_destination_index", "", "Ljava/lang/Integer;", "exceeded_max_distribution_alert_ui", "Lsquareup/cash/paychecks/AlertUi;", "average_monthly_paycheck", "Lcom/squareup/protos/common/Money;", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public Money average_monthly_paycheck;
        public AlertUi exceeded_max_distribution_alert_ui;
        public List<DestinationUiConfiguration> initial_destination_states = EmptyList.INSTANCE;
        public Integer initially_selected_destination_index;

        public final Builder average_monthly_paycheck(Money average_monthly_paycheck) {
            this.average_monthly_paycheck = average_monthly_paycheck;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public SetPaycheckAllocationAmountBlocker build() {
            return new SetPaycheckAllocationAmountBlocker(this.initial_destination_states, this.initially_selected_destination_index, this.exceeded_max_distribution_alert_ui, this.average_monthly_paycheck, buildUnknownFields());
        }

        public final Builder exceeded_max_distribution_alert_ui(AlertUi exceeded_max_distribution_alert_ui) {
            this.exceeded_max_distribution_alert_ui = exceeded_max_distribution_alert_ui;
            return this;
        }

        public final Builder initial_destination_states(List<DestinationUiConfiguration> initial_destination_states) {
            initial_destination_states.getClass();
            TransactorKt.checkElementsNotNull(initial_destination_states);
            this.initial_destination_states = initial_destination_states;
            return this;
        }

        public final Builder initially_selected_destination_index(Integer initially_selected_destination_index) {
            this.initially_selected_destination_index = initially_selected_destination_index;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001f !\"BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0082\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u0096\u0080\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0016J]\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u001eR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$Builder;", "destination", "Lsquareup/cash/paychecks/AllocationDestination;", "share_in_basis_points", "", "tint_color", "Lcom/squareup/protos/cash/ui/Color;", "selection_behavior", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$DestinationSelectionBehavior;", "selected_state_ui_elements", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements;", "sq_accessibility_label", "Lcom/squareup/protos/cash/localization/LocalizedString;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lsquareup/cash/paychecks/AllocationDestination;Ljava/lang/Long;Lcom/squareup/protos/cash/ui/Color;Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$DestinationSelectionBehavior;Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements;Lcom/squareup/protos/cash/localization/LocalizedString;Lokio/ByteString;)V", "Ljava/lang/Long;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Lsquareup/cash/paychecks/AllocationDestination;Ljava/lang/Long;Lcom/squareup/protos/cash/ui/Color;Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$DestinationSelectionBehavior;Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements;Lcom/squareup/protos/cash/localization/LocalizedString;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration;", "Builder", "Companion", "DestinationSelectionBehavior", "SelectedStateUIElements", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class DestinationUiConfiguration extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DestinationUiConfiguration> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "squareup.cash.paychecks.AllocationDestination#ADAPTER", schemaIndex = 0, tag = 1)
        public final AllocationDestination destination;

        @WireField(adapter = "com.squareup.protos.franklin.api.SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements#ADAPTER", schemaIndex = 4, tag = 5)
        public final SelectedStateUIElements selected_state_ui_elements;

        @WireField(adapter = "com.squareup.protos.franklin.api.SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$DestinationSelectionBehavior#ADAPTER", schemaIndex = 3, tag = 4)
        public final DestinationSelectionBehavior selection_behavior;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 1, tag = 2)
        public final Long share_in_basis_points;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 5, tag = 6)
        public final LocalizedString sq_accessibility_label;

        @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 2, tag = 3)
        public final Color tint_color;

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0012J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration;", "<init>", "()V", "destination", "Lsquareup/cash/paychecks/AllocationDestination;", "share_in_basis_points", "", "Ljava/lang/Long;", "tint_color", "Lcom/squareup/protos/cash/ui/Color;", "selection_behavior", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$DestinationSelectionBehavior;", "selected_state_ui_elements", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements;", "sq_accessibility_label", "Lcom/squareup/protos/cash/localization/LocalizedString;", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public AllocationDestination destination;
            public SelectedStateUIElements selected_state_ui_elements;
            public DestinationSelectionBehavior selection_behavior;
            public Long share_in_basis_points;
            public LocalizedString sq_accessibility_label;
            public Color tint_color;

            @Override // com.squareup.wire.Message.Builder
            public DestinationUiConfiguration build() {
                return new DestinationUiConfiguration(this.destination, this.share_in_basis_points, this.tint_color, this.selection_behavior, this.selected_state_ui_elements, this.sq_accessibility_label, buildUnknownFields());
            }

            public final Builder destination(AllocationDestination destination) {
                this.destination = destination;
                return this;
            }

            public final Builder selected_state_ui_elements(SelectedStateUIElements selected_state_ui_elements) {
                this.selected_state_ui_elements = selected_state_ui_elements;
                return this;
            }

            public final Builder selection_behavior(DestinationSelectionBehavior selection_behavior) {
                this.selection_behavior = selection_behavior;
                return this;
            }

            public final Builder share_in_basis_points(Long share_in_basis_points) {
                this.share_in_basis_points = share_in_basis_points;
                return this;
            }

            public final Builder sq_accessibility_label(LocalizedString sq_accessibility_label) {
                this.sq_accessibility_label = sq_accessibility_label;
                return this;
            }

            public final Builder tint_color(Color tint_color) {
                this.tint_color = tint_color;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005&'()*B\u0099\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0082\u0004J\n\u0010!\u001a\u00020\"H\u0096\u0080\u0004J\b\u0010#\u001a\u00020$H\u0016J\u0098\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u001bR\u0012\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Builder;", "header", "Lcom/squareup/protos/cash/localization/LocalizedString;", "estimated_currency_amount_template", "Lsquareup/cash/paychecks/LocalizedTemplatedString;", "atm_picker_options_in_basis_points", "", "", "atm_option_accessibility_hint_template", "custom_amount_subtitle", "custom_amount_accessibility_hint", "configuration_row", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$ConfigurationRow;", "primary_button", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button;", "secondary_button", "back_button_behavior", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$BackButtonBehavior;", "explanation", "Lsquareup/cash/paychecks/BottomSheet;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Lsquareup/cash/paychecks/LocalizedTemplatedString;Ljava/util/List;Lsquareup/cash/paychecks/LocalizedTemplatedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$ConfigurationRow;Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button;Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button;Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$BackButtonBehavior;Lsquareup/cash/paychecks/BottomSheet;Lokio/ByteString;)V", "getEstimated_currency_amount_template$annotations", "()V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "ConfigurationRow", "Button", "BackButtonBehavior", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class SelectedStateUIElements extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<SelectedStateUIElements> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "squareup.cash.paychecks.LocalizedTemplatedString#ADAPTER", schemaIndex = 3, tag = 8)
            public final LocalizedTemplatedString atm_option_accessibility_hint_template;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
            public final List<Long> atm_picker_options_in_basis_points;

            @WireField(adapter = "com.squareup.protos.franklin.api.SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$BackButtonBehavior#ADAPTER", schemaIndex = 9, tag = 10)
            public final BackButtonBehavior back_button_behavior;

            @WireField(adapter = "com.squareup.protos.franklin.api.SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$ConfigurationRow#ADAPTER", schemaIndex = 6, tag = 5)
            public final ConfigurationRow configuration_row;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 5, tag = 9)
            public final LocalizedString custom_amount_accessibility_hint;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 4, tag = 4)
            public final LocalizedString custom_amount_subtitle;

            @WireField(adapter = "squareup.cash.paychecks.LocalizedTemplatedString#ADAPTER", schemaIndex = 1, tag = 2)
            public final LocalizedTemplatedString estimated_currency_amount_template;

            @WireField(adapter = "squareup.cash.paychecks.BottomSheet#ADAPTER", schemaIndex = 10, tag = 11)
            public final BottomSheet explanation;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
            public final LocalizedString header;

            @WireField(adapter = "com.squareup.protos.franklin.api.SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button#ADAPTER", schemaIndex = 7, tag = 6)
            public final Button primary_button;

            @WireField(adapter = "com.squareup.protos.franklin.api.SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button#ADAPTER", schemaIndex = 8, tag = 7)
            public final Button secondary_button;

            @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0014\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements;", "<init>", "()V", "header", "Lcom/squareup/protos/cash/localization/LocalizedString;", "estimated_currency_amount_template", "Lsquareup/cash/paychecks/LocalizedTemplatedString;", "atm_picker_options_in_basis_points", "", "", "atm_option_accessibility_hint_template", "custom_amount_subtitle", "custom_amount_accessibility_hint", "configuration_row", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$ConfigurationRow;", "primary_button", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button;", "secondary_button", "back_button_behavior", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$BackButtonBehavior;", "explanation", "Lsquareup/cash/paychecks/BottomSheet;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public LocalizedTemplatedString atm_option_accessibility_hint_template;
                public List<Long> atm_picker_options_in_basis_points = EmptyList.INSTANCE;
                public BackButtonBehavior back_button_behavior;
                public ConfigurationRow configuration_row;
                public LocalizedString custom_amount_accessibility_hint;
                public LocalizedString custom_amount_subtitle;
                public LocalizedTemplatedString estimated_currency_amount_template;
                public BottomSheet explanation;
                public LocalizedString header;
                public Button primary_button;
                public Button secondary_button;

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

                public final Builder back_button_behavior(BackButtonBehavior back_button_behavior) {
                    this.back_button_behavior = back_button_behavior;
                    return this;
                }

                @Override // com.squareup.wire.Message.Builder
                public SelectedStateUIElements build() {
                    return new SelectedStateUIElements(this.header, this.estimated_currency_amount_template, this.atm_picker_options_in_basis_points, this.atm_option_accessibility_hint_template, this.custom_amount_subtitle, this.custom_amount_accessibility_hint, this.configuration_row, this.primary_button, this.secondary_button, this.back_button_behavior, this.explanation, buildUnknownFields());
                }

                public final Builder configuration_row(ConfigurationRow configuration_row) {
                    this.configuration_row = configuration_row;
                    return this;
                }

                public final Builder custom_amount_accessibility_hint(LocalizedString custom_amount_accessibility_hint) {
                    this.custom_amount_accessibility_hint = custom_amount_accessibility_hint;
                    return this;
                }

                public final Builder custom_amount_subtitle(LocalizedString custom_amount_subtitle) {
                    this.custom_amount_subtitle = custom_amount_subtitle;
                    return this;
                }

                @Deprecated
                public final Builder estimated_currency_amount_template(LocalizedTemplatedString estimated_currency_amount_template) {
                    this.estimated_currency_amount_template = estimated_currency_amount_template;
                    return this;
                }

                public final Builder explanation(BottomSheet explanation) {
                    this.explanation = explanation;
                    return this;
                }

                public final Builder header(LocalizedString header) {
                    this.header = header;
                    return this;
                }

                public final Builder primary_button(Button primary_button) {
                    this.primary_button = primary_button;
                    return this;
                }

                public final Builder secondary_button(Button secondary_button) {
                    this.secondary_button = secondary_button;
                    return this;
                }
            }

            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0015\u0016\u0017B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J(\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button$Builder;", "action", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button$ButtonAction;", AnnotatedPrivateKey.LABEL, "Lcom/squareup/protos/cash/localization/LocalizedString;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button$ButtonAction;Lcom/squareup/protos/cash/localization/LocalizedString;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "ButtonAction", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Button extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<Button> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final long serialVersionUID = 0;

                @WireField(adapter = "com.squareup.protos.franklin.api.SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button$ButtonAction#ADAPTER", schemaIndex = 0, tag = 1)
                public final ButtonAction action;

                @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
                public final LocalizedString label;

                @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button;", "<init>", "()V", "action", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button$ButtonAction;", AnnotatedPrivateKey.LABEL, "Lcom/squareup/protos/cash/localization/LocalizedString;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Builder extends Message.Builder {
                    public ButtonAction action;
                    public LocalizedString label;

                    public final Builder action(ButtonAction action) {
                        this.action = action;
                        return this;
                    }

                    @Override // com.squareup.wire.Message.Builder
                    public Button build() {
                        return new Button(this.action, this.label, buildUnknownFields());
                    }

                    public final Builder label(LocalizedString label) {
                        this.label = label;
                        return this;
                    }
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Button.class);
                    final Syntax syntax = Syntax.PROTO_2;
                    ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button decode(ProtoReader reader) {
                            reader.getClass();
                            long beginMessage = reader.beginMessage();
                            Object obj = null;
                            Object obj2 = null;
                            while (true) {
                                int nextTag = reader.nextTag();
                                if (nextTag == -1) {
                                    return new SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button((SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button.ButtonAction) obj, (LocalizedString) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                                }
                                if (nextTag == 1) {
                                    try {
                                        obj = SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button.ButtonAction.ADAPTER.decode(reader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                } else if (nextTag != 2) {
                                    reader.readUnknownField(nextTag);
                                } else {
                                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button value) {
                            writer.getClass();
                            value.getClass();
                            SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button.ButtonAction.ADAPTER.encodeWithTag(writer, 1, value.action);
                            LocalizedString.ADAPTER.encodeWithTag(writer, 2, value.label);
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button value) {
                            value.getClass();
                            return LocalizedString.ADAPTER.encodedSizeWithTag(2, value.label) + SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button.ButtonAction.ADAPTER.encodedSizeWithTag(1, value.action) + value.unknownFields().getSize$okio();
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button redact(SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button value) {
                            value.getClass();
                            LocalizedString localizedString = value.label;
                            return SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button.copy$default(value, null, localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null, ByteString.EMPTY, 1, null);
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button value) {
                            writer.getClass();
                            value.getClass();
                            writer.writeBytes(value.unknownFields());
                            LocalizedString.ADAPTER.encodeWithTag(writer, 2, value.label);
                            SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button.ButtonAction.ADAPTER.encodeWithTag(writer, 1, value.action);
                        }
                    };
                    ADAPTER = protoAdapter;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
                }

                public /* synthetic */ Button(ButtonAction buttonAction, LocalizedString localizedString, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : buttonAction, (i & 2) != 0 ? null : localizedString, (i & 4) != 0 ? ByteString.EMPTY : byteString);
                }

                public static /* synthetic */ Button copy$default(Button button, ButtonAction buttonAction, LocalizedString localizedString, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        buttonAction = button.action;
                    }
                    if ((i & 2) != 0) {
                        localizedString = button.label;
                    }
                    if ((i & 4) != 0) {
                        byteString = button.unknownFields();
                    }
                    return button.copy(buttonAction, localizedString, byteString);
                }

                public final Button copy(ButtonAction action, LocalizedString label, ByteString unknownFields) {
                    unknownFields.getClass();
                    return new Button(action, label, unknownFields);
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof Button)) {
                        return false;
                    }
                    Button button = (Button) other;
                    return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && this.action == button.action && Intrinsics.areEqual(this.label, button.label);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    ButtonAction buttonAction = this.action;
                    int hashCode2 = (hashCode + (buttonAction != null ? buttonAction.hashCode() : 0)) * 37;
                    LocalizedString localizedString = this.label;
                    int hashCode3 = hashCode2 + (localizedString != null ? localizedString.hashCode() : 0);
                    this.hashCode = hashCode3;
                    return hashCode3;
                }

                @Override // com.squareup.wire.Message
                public Builder newBuilder() {
                    Builder builder = new Builder();
                    builder.action = this.action;
                    builder.label = this.label;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    ButtonAction buttonAction = this.action;
                    if (buttonAction != null) {
                        arrayList.add("action=" + buttonAction);
                    }
                    LocalizedString localizedString = this.label;
                    if (localizedString != null) {
                        Matcher$$ExternalSyntheticOutline0.m("label=", localizedString, arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button$ButtonAction;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BUTTON_ACTION_DO_NOT_USE", "CONFIRM", "DISABLE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class ButtonAction implements WireEnum {
                    private static final /* synthetic */ EnumEntries $ENTRIES;
                    private static final /* synthetic */ ButtonAction[] $VALUES;
                    public static final ProtoAdapter ADAPTER;
                    public static final ButtonAction BUTTON_ACTION_DO_NOT_USE;
                    public static final ButtonAction CONFIRM;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE;
                    public static final ButtonAction DISABLE;
                    private final int value;

                    private static final /* synthetic */ ButtonAction[] $values() {
                        return new ButtonAction[]{BUTTON_ACTION_DO_NOT_USE, CONFIRM, DISABLE};
                    }

                    static {
                        final ButtonAction buttonAction = new ButtonAction("BUTTON_ACTION_DO_NOT_USE", 0, 0);
                        BUTTON_ACTION_DO_NOT_USE = buttonAction;
                        CONFIRM = new ButtonAction("CONFIRM", 1, 1);
                        DISABLE = new ButtonAction("DISABLE", 2, 2);
                        ButtonAction[] $values = $values();
                        $VALUES = $values;
                        $ENTRIES = Tags.enumEntries($values);
                        INSTANCE = new Companion(null);
                        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ButtonAction.class);
                        final Syntax syntax = Syntax.PROTO_2;
                        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, buttonAction) { // from class: com.squareup.protos.franklin.api.SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button$ButtonAction$Companion$ADAPTER$1
                            @Override // com.squareup.wire.EnumAdapter
                            public SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button.ButtonAction fromValue(int value) {
                                return SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button.ButtonAction.INSTANCE.fromValue(value);
                            }
                        };
                    }

                    private ButtonAction(String str, int i, int i2) {
                        this.value = i2;
                    }

                    public static final ButtonAction fromValue(int i) {
                        return INSTANCE.fromValue(i);
                    }

                    public static EnumEntries getEntries() {
                        return $ENTRIES;
                    }

                    public static ButtonAction valueOf(String str) {
                        return (ButtonAction) Enum.valueOf(ButtonAction.class, str);
                    }

                    public static ButtonAction[] values() {
                        return (ButtonAction[]) $VALUES.clone();
                    }

                    @Override // com.squareup.wire.WireEnum
                    public int getValue() {
                        return this.value;
                    }

                    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button$ButtonAction$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button$ButtonAction;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class Companion {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final ButtonAction fromValue(int value) {
                            if (value == 0) {
                                return ButtonAction.BUTTON_ACTION_DO_NOT_USE;
                            }
                            if (value == 1) {
                                return ButtonAction.CONFIRM;
                            }
                            if (value != 2) {
                                return null;
                            }
                            return ButtonAction.DISABLE;
                        }

                        private Companion() {
                        }
                    }
                }

                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Button;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final /* synthetic */ Button build(Function1<? super Builder, Unit> body) {
                        body.getClass();
                        Builder builder = new Builder();
                        body.invoke(builder);
                        return builder.build();
                    }

                    private Companion() {
                    }
                }

                public Button() {
                    this(null, null, null, 7, null);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Button(ButtonAction buttonAction, LocalizedString localizedString, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.action = buttonAction;
                    this.label = localizedString;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SelectedStateUIElements.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements decode(ProtoReader reader) {
                        Object obj;
                        long j;
                        ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                        long beginMessage = reader.beginMessage();
                        Object obj2 = null;
                        Object obj3 = null;
                        Object obj4 = null;
                        Object obj5 = null;
                        Object obj6 = null;
                        Object obj7 = null;
                        Object obj8 = null;
                        Object obj9 = null;
                        Object obj10 = null;
                        Object obj11 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements((LocalizedString) obj2, (LocalizedTemplatedString) obj3, m, (LocalizedTemplatedString) obj4, (LocalizedString) obj5, (LocalizedString) obj6, (SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ConfigurationRow) obj7, (SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button) obj8, (SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button) obj9, (SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.BackButtonBehavior) obj10, (BottomSheet) obj11, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            switch (nextTag) {
                                case 1:
                                    j = beginMessage;
                                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                                    break;
                                case 2:
                                    j = beginMessage;
                                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedTemplatedString.ADAPTER, reader, obj3);
                                    break;
                                case 3:
                                    j = beginMessage;
                                    obj = obj10;
                                    m.add(ProtoAdapter.INT64.decode(reader));
                                    obj10 = obj;
                                    break;
                                case 4:
                                    j = beginMessage;
                                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj5);
                                    break;
                                case 5:
                                    j = beginMessage;
                                    obj7 = TransactorKt.decodeMessageOrMerge(SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ConfigurationRow.ADAPTER, reader, obj7);
                                    break;
                                case 6:
                                    j = beginMessage;
                                    obj8 = TransactorKt.decodeMessageOrMerge(SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button.ADAPTER, reader, obj8);
                                    break;
                                case 7:
                                    j = beginMessage;
                                    obj9 = TransactorKt.decodeMessageOrMerge(SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button.ADAPTER, reader, obj9);
                                    break;
                                case 8:
                                    j = beginMessage;
                                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedTemplatedString.ADAPTER, reader, obj4);
                                    break;
                                case 9:
                                    j = beginMessage;
                                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj6);
                                    break;
                                case 10:
                                    try {
                                        obj10 = SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.BackButtonBehavior.ADAPTER.decode(reader);
                                        j = beginMessage;
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        obj = obj10;
                                        j = beginMessage;
                                        reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 11:
                                    obj11 = TransactorKt.decodeMessageOrMerge(BottomSheet.ADAPTER, reader, obj11);
                                    j = beginMessage;
                                    break;
                                default:
                                    reader.readUnknownField(nextTag);
                                    j = beginMessage;
                                    obj = obj10;
                                    obj10 = obj;
                                    break;
                            }
                            beginMessage = j;
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                        protoAdapter2.encodeWithTag(writer, 1, value.header);
                        ProtoAdapter protoAdapter3 = LocalizedTemplatedString.ADAPTER;
                        protoAdapter3.encodeWithTag(writer, 2, value.estimated_currency_amount_template);
                        ProtoAdapter.INT64.asRepeated().encodeWithTag(writer, 3, value.atm_picker_options_in_basis_points);
                        protoAdapter3.encodeWithTag(writer, 8, value.atm_option_accessibility_hint_template);
                        protoAdapter2.encodeWithTag(writer, 4, value.custom_amount_subtitle);
                        protoAdapter2.encodeWithTag(writer, 9, value.custom_amount_accessibility_hint);
                        SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ConfigurationRow.ADAPTER.encodeWithTag(writer, 5, value.configuration_row);
                        ProtoAdapter protoAdapter4 = SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button.ADAPTER;
                        protoAdapter4.encodeWithTag(writer, 6, value.primary_button);
                        protoAdapter4.encodeWithTag(writer, 7, value.secondary_button);
                        SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.BackButtonBehavior.ADAPTER.encodeWithTag(writer, 10, value.back_button_behavior);
                        BottomSheet.ADAPTER.encodeWithTag(writer, 11, value.explanation);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                        int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, value.header) + size$okio;
                        ProtoAdapter protoAdapter3 = LocalizedTemplatedString.ADAPTER;
                        int encodedSizeWithTag2 = SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ConfigurationRow.ADAPTER.encodedSizeWithTag(5, value.configuration_row) + protoAdapter2.encodedSizeWithTag(9, value.custom_amount_accessibility_hint) + protoAdapter2.encodedSizeWithTag(4, value.custom_amount_subtitle) + protoAdapter3.encodedSizeWithTag(8, value.atm_option_accessibility_hint_template) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(3, value.atm_picker_options_in_basis_points) + protoAdapter3.encodedSizeWithTag(2, value.estimated_currency_amount_template) + encodedSizeWithTag;
                        ProtoAdapter protoAdapter4 = SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button.ADAPTER;
                        return BottomSheet.ADAPTER.encodedSizeWithTag(11, value.explanation) + SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.BackButtonBehavior.ADAPTER.encodedSizeWithTag(10, value.back_button_behavior) + protoAdapter4.encodedSizeWithTag(7, value.secondary_button) + protoAdapter4.encodedSizeWithTag(6, value.primary_button) + encodedSizeWithTag2;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements redact(SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements value) {
                        value.getClass();
                        LocalizedString localizedString = value.header;
                        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                        LocalizedTemplatedString localizedTemplatedString = value.estimated_currency_amount_template;
                        LocalizedTemplatedString localizedTemplatedString2 = localizedTemplatedString != null ? (LocalizedTemplatedString) LocalizedTemplatedString.ADAPTER.redact(localizedTemplatedString) : null;
                        LocalizedTemplatedString localizedTemplatedString3 = value.atm_option_accessibility_hint_template;
                        LocalizedTemplatedString localizedTemplatedString4 = localizedTemplatedString3 != null ? (LocalizedTemplatedString) LocalizedTemplatedString.ADAPTER.redact(localizedTemplatedString3) : null;
                        LocalizedString localizedString3 = value.custom_amount_subtitle;
                        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
                        LocalizedString localizedString5 = value.custom_amount_accessibility_hint;
                        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
                        SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ConfigurationRow configurationRow = value.configuration_row;
                        SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ConfigurationRow configurationRow2 = configurationRow != null ? (SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ConfigurationRow) SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ConfigurationRow.ADAPTER.redact(configurationRow) : null;
                        SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button button = value.primary_button;
                        SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button button2 = button != null ? (SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button) SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button.ADAPTER.redact(button) : null;
                        SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button button3 = value.secondary_button;
                        SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button button4 = button3 != null ? (SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button) SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button.ADAPTER.redact(button3) : null;
                        BottomSheet bottomSheet = value.explanation;
                        return SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.copy$default(value, localizedString2, localizedTemplatedString2, null, localizedTemplatedString4, localizedString4, localizedString6, configurationRow2, button2, button4, null, bottomSheet != null ? (BottomSheet) BottomSheet.ADAPTER.redact(bottomSheet) : null, ByteString.EMPTY, 516, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        BottomSheet.ADAPTER.encodeWithTag(writer, 11, value.explanation);
                        SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.BackButtonBehavior.ADAPTER.encodeWithTag(writer, 10, value.back_button_behavior);
                        ProtoAdapter protoAdapter2 = SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button.ADAPTER;
                        protoAdapter2.encodeWithTag(writer, 7, value.secondary_button);
                        protoAdapter2.encodeWithTag(writer, 6, value.primary_button);
                        SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ConfigurationRow.ADAPTER.encodeWithTag(writer, 5, value.configuration_row);
                        ProtoAdapter protoAdapter3 = LocalizedString.ADAPTER;
                        protoAdapter3.encodeWithTag(writer, 9, value.custom_amount_accessibility_hint);
                        protoAdapter3.encodeWithTag(writer, 4, value.custom_amount_subtitle);
                        ProtoAdapter protoAdapter4 = LocalizedTemplatedString.ADAPTER;
                        protoAdapter4.encodeWithTag(writer, 8, value.atm_option_accessibility_hint_template);
                        ProtoAdapter.INT64.asRepeated().encodeWithTag(writer, 3, value.atm_picker_options_in_basis_points);
                        protoAdapter4.encodeWithTag(writer, 2, value.estimated_currency_amount_template);
                        protoAdapter3.encodeWithTag(writer, 1, value.header);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public SelectedStateUIElements(LocalizedString localizedString, LocalizedTemplatedString localizedTemplatedString, List list, LocalizedTemplatedString localizedTemplatedString2, LocalizedString localizedString2, LocalizedString localizedString3, ConfigurationRow configurationRow, Button button, Button button2, BackButtonBehavior backButtonBehavior, BottomSheet bottomSheet, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? null : localizedTemplatedString, (i & 4) != 0 ? EmptyList.INSTANCE : list, (i & 8) != 0 ? null : localizedTemplatedString2, (i & 16) != 0 ? null : localizedString2, (i & 32) != 0 ? null : localizedString3, (i & 64) != 0 ? null : configurationRow, (i & 128) != 0 ? null : button, (i & 256) != 0 ? null : button2, (i & 512) != 0 ? null : backButtonBehavior, (i & 1024) != 0 ? null : bottomSheet, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ SelectedStateUIElements copy$default(SelectedStateUIElements selectedStateUIElements, LocalizedString localizedString, LocalizedTemplatedString localizedTemplatedString, List list, LocalizedTemplatedString localizedTemplatedString2, LocalizedString localizedString2, LocalizedString localizedString3, ConfigurationRow configurationRow, Button button, Button button2, BackButtonBehavior backButtonBehavior, BottomSheet bottomSheet, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    localizedString = selectedStateUIElements.header;
                }
                if ((i & 2) != 0) {
                    localizedTemplatedString = selectedStateUIElements.estimated_currency_amount_template;
                }
                if ((i & 4) != 0) {
                    list = selectedStateUIElements.atm_picker_options_in_basis_points;
                }
                if ((i & 8) != 0) {
                    localizedTemplatedString2 = selectedStateUIElements.atm_option_accessibility_hint_template;
                }
                if ((i & 16) != 0) {
                    localizedString2 = selectedStateUIElements.custom_amount_subtitle;
                }
                if ((i & 32) != 0) {
                    localizedString3 = selectedStateUIElements.custom_amount_accessibility_hint;
                }
                if ((i & 64) != 0) {
                    configurationRow = selectedStateUIElements.configuration_row;
                }
                if ((i & 128) != 0) {
                    button = selectedStateUIElements.primary_button;
                }
                if ((i & 256) != 0) {
                    button2 = selectedStateUIElements.secondary_button;
                }
                if ((i & 512) != 0) {
                    backButtonBehavior = selectedStateUIElements.back_button_behavior;
                }
                if ((i & 1024) != 0) {
                    bottomSheet = selectedStateUIElements.explanation;
                }
                if ((i & 2048) != 0) {
                    byteString = selectedStateUIElements.unknownFields();
                }
                BottomSheet bottomSheet2 = bottomSheet;
                ByteString byteString2 = byteString;
                Button button3 = button2;
                BackButtonBehavior backButtonBehavior2 = backButtonBehavior;
                ConfigurationRow configurationRow2 = configurationRow;
                Button button4 = button;
                LocalizedString localizedString4 = localizedString2;
                LocalizedString localizedString5 = localizedString3;
                return selectedStateUIElements.copy(localizedString, localizedTemplatedString, list, localizedTemplatedString2, localizedString4, localizedString5, configurationRow2, button4, button3, backButtonBehavior2, bottomSheet2, byteString2);
            }

            @Deprecated
            public static /* synthetic */ void getEstimated_currency_amount_template$annotations() {
            }

            public final SelectedStateUIElements copy(LocalizedString header, LocalizedTemplatedString estimated_currency_amount_template, List<Long> atm_picker_options_in_basis_points, LocalizedTemplatedString atm_option_accessibility_hint_template, LocalizedString custom_amount_subtitle, LocalizedString custom_amount_accessibility_hint, ConfigurationRow configuration_row, Button primary_button, Button secondary_button, BackButtonBehavior back_button_behavior, BottomSheet explanation, ByteString unknownFields) {
                atm_picker_options_in_basis_points.getClass();
                unknownFields.getClass();
                return new SelectedStateUIElements(header, estimated_currency_amount_template, atm_picker_options_in_basis_points, atm_option_accessibility_hint_template, custom_amount_subtitle, custom_amount_accessibility_hint, configuration_row, primary_button, secondary_button, back_button_behavior, explanation, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof SelectedStateUIElements)) {
                    return false;
                }
                SelectedStateUIElements selectedStateUIElements = (SelectedStateUIElements) other;
                return Intrinsics.areEqual(unknownFields(), selectedStateUIElements.unknownFields()) && Intrinsics.areEqual(this.header, selectedStateUIElements.header) && Intrinsics.areEqual(this.estimated_currency_amount_template, selectedStateUIElements.estimated_currency_amount_template) && Intrinsics.areEqual(this.atm_picker_options_in_basis_points, selectedStateUIElements.atm_picker_options_in_basis_points) && Intrinsics.areEqual(this.atm_option_accessibility_hint_template, selectedStateUIElements.atm_option_accessibility_hint_template) && Intrinsics.areEqual(this.custom_amount_subtitle, selectedStateUIElements.custom_amount_subtitle) && Intrinsics.areEqual(this.custom_amount_accessibility_hint, selectedStateUIElements.custom_amount_accessibility_hint) && Intrinsics.areEqual(this.configuration_row, selectedStateUIElements.configuration_row) && Intrinsics.areEqual(this.primary_button, selectedStateUIElements.primary_button) && Intrinsics.areEqual(this.secondary_button, selectedStateUIElements.secondary_button) && this.back_button_behavior == selectedStateUIElements.back_button_behavior && Intrinsics.areEqual(this.explanation, selectedStateUIElements.explanation);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.header;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedTemplatedString localizedTemplatedString = this.estimated_currency_amount_template;
                int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (localizedTemplatedString != null ? localizedTemplatedString.hashCode() : 0)) * 37, 37, this.atm_picker_options_in_basis_points);
                LocalizedTemplatedString localizedTemplatedString2 = this.atm_option_accessibility_hint_template;
                int hashCode3 = (m + (localizedTemplatedString2 != null ? localizedTemplatedString2.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.custom_amount_subtitle;
                int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                LocalizedString localizedString3 = this.custom_amount_accessibility_hint;
                int hashCode5 = (hashCode4 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
                ConfigurationRow configurationRow = this.configuration_row;
                int hashCode6 = (hashCode5 + (configurationRow != null ? configurationRow.hashCode() : 0)) * 37;
                Button button = this.primary_button;
                int hashCode7 = (hashCode6 + (button != null ? button.hashCode() : 0)) * 37;
                Button button2 = this.secondary_button;
                int hashCode8 = (hashCode7 + (button2 != null ? button2.hashCode() : 0)) * 37;
                BackButtonBehavior backButtonBehavior = this.back_button_behavior;
                int hashCode9 = (hashCode8 + (backButtonBehavior != null ? backButtonBehavior.hashCode() : 0)) * 37;
                BottomSheet bottomSheet = this.explanation;
                int hashCode10 = hashCode9 + (bottomSheet != null ? bottomSheet.hashCode() : 0);
                this.hashCode = hashCode10;
                return hashCode10;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.header = this.header;
                builder.estimated_currency_amount_template = this.estimated_currency_amount_template;
                builder.atm_picker_options_in_basis_points = this.atm_picker_options_in_basis_points;
                builder.atm_option_accessibility_hint_template = this.atm_option_accessibility_hint_template;
                builder.custom_amount_subtitle = this.custom_amount_subtitle;
                builder.custom_amount_accessibility_hint = this.custom_amount_accessibility_hint;
                builder.configuration_row = this.configuration_row;
                builder.primary_button = this.primary_button;
                builder.secondary_button = this.secondary_button;
                builder.back_button_behavior = this.back_button_behavior;
                builder.explanation = this.explanation;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.header;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("header=", localizedString, arrayList);
                }
                LocalizedTemplatedString localizedTemplatedString = this.estimated_currency_amount_template;
                if (localizedTemplatedString != null) {
                    arrayList.add("estimated_currency_amount_template=" + localizedTemplatedString);
                }
                if (!this.atm_picker_options_in_basis_points.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("atm_picker_options_in_basis_points=", arrayList, this.atm_picker_options_in_basis_points);
                }
                LocalizedTemplatedString localizedTemplatedString2 = this.atm_option_accessibility_hint_template;
                if (localizedTemplatedString2 != null) {
                    arrayList.add("atm_option_accessibility_hint_template=" + localizedTemplatedString2);
                }
                LocalizedString localizedString2 = this.custom_amount_subtitle;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("custom_amount_subtitle=", localizedString2, arrayList);
                }
                LocalizedString localizedString3 = this.custom_amount_accessibility_hint;
                if (localizedString3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("custom_amount_accessibility_hint=", localizedString3, arrayList);
                }
                ConfigurationRow configurationRow = this.configuration_row;
                if (configurationRow != null) {
                    arrayList.add("configuration_row=" + configurationRow);
                }
                Button button = this.primary_button;
                if (button != null) {
                    arrayList.add("primary_button=" + button);
                }
                Button button2 = this.secondary_button;
                if (button2 != null) {
                    arrayList.add("secondary_button=" + button2);
                }
                BackButtonBehavior backButtonBehavior = this.back_button_behavior;
                if (backButtonBehavior != null) {
                    arrayList.add("back_button_behavior=" + backButtonBehavior);
                }
                BottomSheet bottomSheet = this.explanation;
                if (bottomSheet != null) {
                    arrayList.add("explanation=" + bottomSheet);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "SelectedStateUIElements{", "}", 0, null, null, 56);
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$BackButtonBehavior;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DO_NOT_USE", "SUBMIT", "DISMISS_ON_ERROR", "DISMISS", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class BackButtonBehavior implements WireEnum {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ BackButtonBehavior[] $VALUES;
                public static final ProtoAdapter ADAPTER;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                public static final BackButtonBehavior DISMISS;
                public static final BackButtonBehavior DISMISS_ON_ERROR;
                public static final BackButtonBehavior DO_NOT_USE;
                public static final BackButtonBehavior SUBMIT;
                private final int value;

                private static final /* synthetic */ BackButtonBehavior[] $values() {
                    return new BackButtonBehavior[]{DO_NOT_USE, SUBMIT, DISMISS_ON_ERROR, DISMISS};
                }

                static {
                    final BackButtonBehavior backButtonBehavior = new BackButtonBehavior("DO_NOT_USE", 0, 0);
                    DO_NOT_USE = backButtonBehavior;
                    SUBMIT = new BackButtonBehavior("SUBMIT", 1, 1);
                    DISMISS_ON_ERROR = new BackButtonBehavior("DISMISS_ON_ERROR", 2, 2);
                    DISMISS = new BackButtonBehavior("DISMISS", 3, 3);
                    BackButtonBehavior[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = Tags.enumEntries($values);
                    INSTANCE = new Companion(null);
                    final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BackButtonBehavior.class);
                    final Syntax syntax = Syntax.PROTO_2;
                    ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, backButtonBehavior) { // from class: com.squareup.protos.franklin.api.SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$BackButtonBehavior$Companion$ADAPTER$1
                        @Override // com.squareup.wire.EnumAdapter
                        public SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.BackButtonBehavior fromValue(int value) {
                            return SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.BackButtonBehavior.INSTANCE.fromValue(value);
                        }
                    };
                }

                private BackButtonBehavior(String str, int i, int i2) {
                    this.value = i2;
                }

                public static final BackButtonBehavior fromValue(int i) {
                    return INSTANCE.fromValue(i);
                }

                public static EnumEntries getEntries() {
                    return $ENTRIES;
                }

                public static BackButtonBehavior valueOf(String str) {
                    return (BackButtonBehavior) Enum.valueOf(BackButtonBehavior.class, str);
                }

                public static BackButtonBehavior[] values() {
                    return (BackButtonBehavior[]) $VALUES.clone();
                }

                @Override // com.squareup.wire.WireEnum
                public int getValue() {
                    return this.value;
                }

                @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$BackButtonBehavior$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$BackButtonBehavior;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final BackButtonBehavior fromValue(int value) {
                        if (value == 0) {
                            return BackButtonBehavior.DO_NOT_USE;
                        }
                        if (value == 1) {
                            return BackButtonBehavior.SUBMIT;
                        }
                        if (value == 2) {
                            return BackButtonBehavior.DISMISS_ON_ERROR;
                        }
                        if (value != 3) {
                            return null;
                        }
                        return BackButtonBehavior.DISMISS;
                    }

                    private Companion() {
                    }
                }
            }

            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bBe\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0016Jd\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\rR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$ConfigurationRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$ConfigurationRow$Builder;", "image", "Lcom/squareup/protos/cash/ui/Image;", "title_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "subtitle_text", "action_text", "sq_accessibility_label", "sq_accessibility_value", "sq_accessibility_hint", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Image;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class ConfigurationRow extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<ConfigurationRow> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final long serialVersionUID = 0;

                @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 3, tag = 4)
                public final LocalizedString action_text;

                @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 0, tag = 1)
                public final Image image;

                @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 6, tag = 7)
                public final LocalizedString sq_accessibility_hint;

                @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 4, tag = 5)
                public final LocalizedString sq_accessibility_label;

                @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 5, tag = 6)
                public final LocalizedString sq_accessibility_value;

                @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 2, tag = 3)
                public final LocalizedString subtitle_text;

                @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
                public final LocalizedString title_text;

                @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\bJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$ConfigurationRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$ConfigurationRow;", "<init>", "()V", "image", "Lcom/squareup/protos/cash/ui/Image;", "title_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "subtitle_text", "action_text", "sq_accessibility_label", "sq_accessibility_value", "sq_accessibility_hint", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Builder extends Message.Builder {
                    public LocalizedString action_text;
                    public Image image;
                    public LocalizedString sq_accessibility_hint;
                    public LocalizedString sq_accessibility_label;
                    public LocalizedString sq_accessibility_value;
                    public LocalizedString subtitle_text;
                    public LocalizedString title_text;

                    public final Builder action_text(LocalizedString action_text) {
                        this.action_text = action_text;
                        return this;
                    }

                    @Override // com.squareup.wire.Message.Builder
                    public ConfigurationRow build() {
                        return new ConfigurationRow(this.image, this.title_text, this.subtitle_text, this.action_text, this.sq_accessibility_label, this.sq_accessibility_value, this.sq_accessibility_hint, buildUnknownFields());
                    }

                    public final Builder image(Image image) {
                        this.image = image;
                        return this;
                    }

                    public final Builder sq_accessibility_hint(LocalizedString sq_accessibility_hint) {
                        this.sq_accessibility_hint = sq_accessibility_hint;
                        return this;
                    }

                    public final Builder sq_accessibility_label(LocalizedString sq_accessibility_label) {
                        this.sq_accessibility_label = sq_accessibility_label;
                        return this;
                    }

                    public final Builder sq_accessibility_value(LocalizedString sq_accessibility_value) {
                        this.sq_accessibility_value = sq_accessibility_value;
                        return this;
                    }

                    public final Builder subtitle_text(LocalizedString subtitle_text) {
                        this.subtitle_text = subtitle_text;
                        return this;
                    }

                    public final Builder title_text(LocalizedString title_text) {
                        this.title_text = title_text;
                        return this;
                    }
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ConfigurationRow.class);
                    final Syntax syntax = Syntax.PROTO_2;
                    ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$ConfigurationRow$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ConfigurationRow decode(ProtoReader reader) {
                            reader.getClass();
                            long beginMessage = reader.beginMessage();
                            Object obj = null;
                            Object obj2 = null;
                            Object obj3 = null;
                            Object obj4 = null;
                            Object obj5 = null;
                            Object obj6 = null;
                            Object obj7 = null;
                            while (true) {
                                int nextTag = reader.nextTag();
                                if (nextTag == -1) {
                                    return new SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ConfigurationRow((Image) obj, (LocalizedString) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (LocalizedString) obj5, (LocalizedString) obj6, (LocalizedString) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                                }
                                switch (nextTag) {
                                    case 1:
                                        obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj);
                                        break;
                                    case 2:
                                        obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                                        break;
                                    case 3:
                                        obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj3);
                                        break;
                                    case 4:
                                        obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj4);
                                        break;
                                    case 5:
                                        obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj5);
                                        break;
                                    case 6:
                                        obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj6);
                                        break;
                                    case 7:
                                        obj7 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj7);
                                        break;
                                    default:
                                        reader.readUnknownField(nextTag);
                                        break;
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ConfigurationRow value) {
                            writer.getClass();
                            value.getClass();
                            Image.ADAPTER.encodeWithTag(writer, 1, value.image);
                            ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                            protoAdapter2.encodeWithTag(writer, 2, value.title_text);
                            protoAdapter2.encodeWithTag(writer, 3, value.subtitle_text);
                            protoAdapter2.encodeWithTag(writer, 4, value.action_text);
                            protoAdapter2.encodeWithTag(writer, 5, value.sq_accessibility_label);
                            protoAdapter2.encodeWithTag(writer, 6, value.sq_accessibility_value);
                            protoAdapter2.encodeWithTag(writer, 7, value.sq_accessibility_hint);
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ConfigurationRow value) {
                            value.getClass();
                            int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, value.image) + value.unknownFields().getSize$okio();
                            ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                            return protoAdapter2.encodedSizeWithTag(7, value.sq_accessibility_hint) + protoAdapter2.encodedSizeWithTag(6, value.sq_accessibility_value) + protoAdapter2.encodedSizeWithTag(5, value.sq_accessibility_label) + protoAdapter2.encodedSizeWithTag(4, value.action_text) + protoAdapter2.encodedSizeWithTag(3, value.subtitle_text) + protoAdapter2.encodedSizeWithTag(2, value.title_text) + encodedSizeWithTag;
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ConfigurationRow redact(SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ConfigurationRow value) {
                            value.getClass();
                            Image image = value.image;
                            Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                            LocalizedString localizedString = value.title_text;
                            LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                            LocalizedString localizedString3 = value.subtitle_text;
                            LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
                            LocalizedString localizedString5 = value.action_text;
                            LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
                            LocalizedString localizedString7 = value.sq_accessibility_label;
                            LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
                            LocalizedString localizedString9 = value.sq_accessibility_value;
                            LocalizedString localizedString10 = localizedString9 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString9) : null;
                            LocalizedString localizedString11 = value.sq_accessibility_hint;
                            return value.copy(image2, localizedString2, localizedString4, localizedString6, localizedString8, localizedString10, localizedString11 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString11) : null, ByteString.EMPTY);
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ConfigurationRow value) {
                            writer.getClass();
                            value.getClass();
                            writer.writeBytes(value.unknownFields());
                            ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                            protoAdapter2.encodeWithTag(writer, 7, value.sq_accessibility_hint);
                            protoAdapter2.encodeWithTag(writer, 6, value.sq_accessibility_value);
                            protoAdapter2.encodeWithTag(writer, 5, value.sq_accessibility_label);
                            protoAdapter2.encodeWithTag(writer, 4, value.action_text);
                            protoAdapter2.encodeWithTag(writer, 3, value.subtitle_text);
                            protoAdapter2.encodeWithTag(writer, 2, value.title_text);
                            Image.ADAPTER.encodeWithTag(writer, 1, value.image);
                        }
                    };
                    ADAPTER = protoAdapter;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
                }

                public /* synthetic */ ConfigurationRow(Image image, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, LocalizedString localizedString4, LocalizedString localizedString5, LocalizedString localizedString6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : image, (i & 2) != 0 ? null : localizedString, (i & 4) != 0 ? null : localizedString2, (i & 8) != 0 ? null : localizedString3, (i & 16) != 0 ? null : localizedString4, (i & 32) != 0 ? null : localizedString5, (i & 64) != 0 ? null : localizedString6, (i & 128) != 0 ? ByteString.EMPTY : byteString);
                }

                public static /* synthetic */ ConfigurationRow copy$default(ConfigurationRow configurationRow, Image image, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, LocalizedString localizedString4, LocalizedString localizedString5, LocalizedString localizedString6, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        image = configurationRow.image;
                    }
                    if ((i & 2) != 0) {
                        localizedString = configurationRow.title_text;
                    }
                    if ((i & 4) != 0) {
                        localizedString2 = configurationRow.subtitle_text;
                    }
                    if ((i & 8) != 0) {
                        localizedString3 = configurationRow.action_text;
                    }
                    if ((i & 16) != 0) {
                        localizedString4 = configurationRow.sq_accessibility_label;
                    }
                    if ((i & 32) != 0) {
                        localizedString5 = configurationRow.sq_accessibility_value;
                    }
                    if ((i & 64) != 0) {
                        localizedString6 = configurationRow.sq_accessibility_hint;
                    }
                    if ((i & 128) != 0) {
                        byteString = configurationRow.unknownFields();
                    }
                    LocalizedString localizedString7 = localizedString6;
                    ByteString byteString2 = byteString;
                    LocalizedString localizedString8 = localizedString4;
                    LocalizedString localizedString9 = localizedString5;
                    return configurationRow.copy(image, localizedString, localizedString2, localizedString3, localizedString8, localizedString9, localizedString7, byteString2);
                }

                public final ConfigurationRow copy(Image image, LocalizedString title_text, LocalizedString subtitle_text, LocalizedString action_text, LocalizedString sq_accessibility_label, LocalizedString sq_accessibility_value, LocalizedString sq_accessibility_hint, ByteString unknownFields) {
                    unknownFields.getClass();
                    return new ConfigurationRow(image, title_text, subtitle_text, action_text, sq_accessibility_label, sq_accessibility_value, sq_accessibility_hint, unknownFields);
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof ConfigurationRow)) {
                        return false;
                    }
                    ConfigurationRow configurationRow = (ConfigurationRow) other;
                    return Intrinsics.areEqual(unknownFields(), configurationRow.unknownFields()) && Intrinsics.areEqual(this.image, configurationRow.image) && Intrinsics.areEqual(this.title_text, configurationRow.title_text) && Intrinsics.areEqual(this.subtitle_text, configurationRow.subtitle_text) && Intrinsics.areEqual(this.action_text, configurationRow.action_text) && Intrinsics.areEqual(this.sq_accessibility_label, configurationRow.sq_accessibility_label) && Intrinsics.areEqual(this.sq_accessibility_value, configurationRow.sq_accessibility_value) && Intrinsics.areEqual(this.sq_accessibility_hint, configurationRow.sq_accessibility_hint);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    Image image = this.image;
                    int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
                    LocalizedString localizedString = this.title_text;
                    int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                    LocalizedString localizedString2 = this.subtitle_text;
                    int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                    LocalizedString localizedString3 = this.action_text;
                    int hashCode5 = (hashCode4 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
                    LocalizedString localizedString4 = this.sq_accessibility_label;
                    int hashCode6 = (hashCode5 + (localizedString4 != null ? localizedString4.hashCode() : 0)) * 37;
                    LocalizedString localizedString5 = this.sq_accessibility_value;
                    int hashCode7 = (hashCode6 + (localizedString5 != null ? localizedString5.hashCode() : 0)) * 37;
                    LocalizedString localizedString6 = this.sq_accessibility_hint;
                    int hashCode8 = hashCode7 + (localizedString6 != null ? localizedString6.hashCode() : 0);
                    this.hashCode = hashCode8;
                    return hashCode8;
                }

                @Override // com.squareup.wire.Message
                public Builder newBuilder() {
                    Builder builder = new Builder();
                    builder.image = this.image;
                    builder.title_text = this.title_text;
                    builder.subtitle_text = this.subtitle_text;
                    builder.action_text = this.action_text;
                    builder.sq_accessibility_label = this.sq_accessibility_label;
                    builder.sq_accessibility_value = this.sq_accessibility_value;
                    builder.sq_accessibility_hint = this.sq_accessibility_hint;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    Image image = this.image;
                    if (image != null) {
                        SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
                    }
                    LocalizedString localizedString = this.title_text;
                    if (localizedString != null) {
                        Matcher$$ExternalSyntheticOutline0.m("title_text=", localizedString, arrayList);
                    }
                    LocalizedString localizedString2 = this.subtitle_text;
                    if (localizedString2 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("subtitle_text=", localizedString2, arrayList);
                    }
                    LocalizedString localizedString3 = this.action_text;
                    if (localizedString3 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("action_text=", localizedString3, arrayList);
                    }
                    LocalizedString localizedString4 = this.sq_accessibility_label;
                    if (localizedString4 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("sq_accessibility_label=", localizedString4, arrayList);
                    }
                    LocalizedString localizedString5 = this.sq_accessibility_value;
                    if (localizedString5 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("sq_accessibility_value=", localizedString5, arrayList);
                    }
                    LocalizedString localizedString6 = this.sq_accessibility_hint;
                    if (localizedString6 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("sq_accessibility_hint=", localizedString6, arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "ConfigurationRow{", "}", 0, null, null, 56);
                }

                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$ConfigurationRow$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$ConfigurationRow$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$ConfigurationRow;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$ConfigurationRow;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final /* synthetic */ ConfigurationRow build(Function1<? super Builder, Unit> body) {
                        body.getClass();
                        Builder builder = new Builder();
                        body.invoke(builder);
                        return builder.build();
                    }

                    private Companion() {
                    }
                }

                public ConfigurationRow() {
                    this(null, null, null, null, null, null, null, null, 255, null);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ConfigurationRow(Image image, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, LocalizedString localizedString4, LocalizedString localizedString5, LocalizedString localizedString6, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.image = image;
                    this.title_text = localizedString;
                    this.subtitle_text = localizedString2;
                    this.action_text = localizedString3;
                    this.sq_accessibility_label = localizedString4;
                    this.sq_accessibility_value = localizedString5;
                    this.sq_accessibility_hint = localizedString6;
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$SelectedStateUIElements;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ SelectedStateUIElements build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public SelectedStateUIElements() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectedStateUIElements(LocalizedString localizedString, LocalizedTemplatedString localizedTemplatedString, List<Long> list, LocalizedTemplatedString localizedTemplatedString2, LocalizedString localizedString2, LocalizedString localizedString3, ConfigurationRow configurationRow, Button button, Button button2, BackButtonBehavior backButtonBehavior, BottomSheet bottomSheet, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.header = localizedString;
                this.estimated_currency_amount_template = localizedTemplatedString;
                this.atm_option_accessibility_hint_template = localizedTemplatedString2;
                this.custom_amount_subtitle = localizedString2;
                this.custom_amount_accessibility_hint = localizedString3;
                this.configuration_row = configurationRow;
                this.primary_button = button;
                this.secondary_button = button2;
                this.back_button_behavior = backButtonBehavior;
                this.explanation = bottomSheet;
                this.atm_picker_options_in_basis_points = TransactorKt.immutableCopyOf("atm_picker_options_in_basis_points", list);
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DestinationUiConfiguration.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    Object obj6 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration((AllocationDestination) obj, (Long) obj2, (Color) obj3, (SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.DestinationSelectionBehavior) obj4, (SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements) obj5, (LocalizedString) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = TransactorKt.decodeMessageOrMerge(AllocationDestination.ADAPTER, reader, obj);
                                break;
                            case 2:
                                obj2 = ProtoAdapter.INT64.decode(reader);
                                break;
                            case 3:
                                obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj3);
                                break;
                            case 4:
                                try {
                                    obj4 = SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.DestinationSelectionBehavior.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 5:
                                obj5 = TransactorKt.decodeMessageOrMerge(SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ADAPTER, reader, obj5);
                                break;
                            case 6:
                                obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj6);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration value) {
                    writer.getClass();
                    value.getClass();
                    AllocationDestination.ADAPTER.encodeWithTag(writer, 1, value.destination);
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, value.share_in_basis_points);
                    Color.ADAPTER.encodeWithTag(writer, 3, value.tint_color);
                    SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.DestinationSelectionBehavior.ADAPTER.encodeWithTag(writer, 4, value.selection_behavior);
                    SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ADAPTER.encodeWithTag(writer, 5, value.selected_state_ui_elements);
                    LocalizedString.ADAPTER.encodeWithTag(writer, 6, value.sq_accessibility_label);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration value) {
                    value.getClass();
                    return LocalizedString.ADAPTER.encodedSizeWithTag(6, value.sq_accessibility_label) + SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ADAPTER.encodedSizeWithTag(5, value.selected_state_ui_elements) + SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.DestinationSelectionBehavior.ADAPTER.encodedSizeWithTag(4, value.selection_behavior) + Color.ADAPTER.encodedSizeWithTag(3, value.tint_color) + ProtoAdapter.INT64.encodedSizeWithTag(2, value.share_in_basis_points) + AllocationDestination.ADAPTER.encodedSizeWithTag(1, value.destination) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration redact(SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration value) {
                    value.getClass();
                    AllocationDestination allocationDestination = value.destination;
                    AllocationDestination allocationDestination2 = allocationDestination != null ? (AllocationDestination) AllocationDestination.ADAPTER.redact(allocationDestination) : null;
                    Color color = value.tint_color;
                    Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
                    SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements selectedStateUIElements = value.selected_state_ui_elements;
                    SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements selectedStateUIElements2 = selectedStateUIElements != null ? (SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements) SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ADAPTER.redact(selectedStateUIElements) : null;
                    LocalizedString localizedString = value.sq_accessibility_label;
                    return SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.copy$default(value, allocationDestination2, null, color2, null, selectedStateUIElements2, localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null, ByteString.EMPTY, 10, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    LocalizedString.ADAPTER.encodeWithTag(writer, 6, value.sq_accessibility_label);
                    SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ADAPTER.encodeWithTag(writer, 5, value.selected_state_ui_elements);
                    SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.DestinationSelectionBehavior.ADAPTER.encodeWithTag(writer, 4, value.selection_behavior);
                    Color.ADAPTER.encodeWithTag(writer, 3, value.tint_color);
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, value.share_in_basis_points);
                    AllocationDestination.ADAPTER.encodeWithTag(writer, 1, value.destination);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ DestinationUiConfiguration(AllocationDestination allocationDestination, Long l, Color color, DestinationSelectionBehavior destinationSelectionBehavior, SelectedStateUIElements selectedStateUIElements, LocalizedString localizedString, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : allocationDestination, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : color, (i & 8) != 0 ? null : destinationSelectionBehavior, (i & 16) != 0 ? null : selectedStateUIElements, (i & 32) != 0 ? null : localizedString, (i & 64) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ DestinationUiConfiguration copy$default(DestinationUiConfiguration destinationUiConfiguration, AllocationDestination allocationDestination, Long l, Color color, DestinationSelectionBehavior destinationSelectionBehavior, SelectedStateUIElements selectedStateUIElements, LocalizedString localizedString, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                allocationDestination = destinationUiConfiguration.destination;
            }
            if ((i & 2) != 0) {
                l = destinationUiConfiguration.share_in_basis_points;
            }
            if ((i & 4) != 0) {
                color = destinationUiConfiguration.tint_color;
            }
            if ((i & 8) != 0) {
                destinationSelectionBehavior = destinationUiConfiguration.selection_behavior;
            }
            if ((i & 16) != 0) {
                selectedStateUIElements = destinationUiConfiguration.selected_state_ui_elements;
            }
            if ((i & 32) != 0) {
                localizedString = destinationUiConfiguration.sq_accessibility_label;
            }
            if ((i & 64) != 0) {
                byteString = destinationUiConfiguration.unknownFields();
            }
            LocalizedString localizedString2 = localizedString;
            ByteString byteString2 = byteString;
            SelectedStateUIElements selectedStateUIElements2 = selectedStateUIElements;
            Color color2 = color;
            return destinationUiConfiguration.copy(allocationDestination, l, color2, destinationSelectionBehavior, selectedStateUIElements2, localizedString2, byteString2);
        }

        public final DestinationUiConfiguration copy(AllocationDestination destination, Long share_in_basis_points, Color tint_color, DestinationSelectionBehavior selection_behavior, SelectedStateUIElements selected_state_ui_elements, LocalizedString sq_accessibility_label, ByteString unknownFields) {
            unknownFields.getClass();
            return new DestinationUiConfiguration(destination, share_in_basis_points, tint_color, selection_behavior, selected_state_ui_elements, sq_accessibility_label, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof DestinationUiConfiguration)) {
                return false;
            }
            DestinationUiConfiguration destinationUiConfiguration = (DestinationUiConfiguration) other;
            return Intrinsics.areEqual(unknownFields(), destinationUiConfiguration.unknownFields()) && Intrinsics.areEqual(this.destination, destinationUiConfiguration.destination) && Intrinsics.areEqual(this.share_in_basis_points, destinationUiConfiguration.share_in_basis_points) && Intrinsics.areEqual(this.tint_color, destinationUiConfiguration.tint_color) && this.selection_behavior == destinationUiConfiguration.selection_behavior && Intrinsics.areEqual(this.selected_state_ui_elements, destinationUiConfiguration.selected_state_ui_elements) && Intrinsics.areEqual(this.sq_accessibility_label, destinationUiConfiguration.sq_accessibility_label);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AllocationDestination allocationDestination = this.destination;
            int hashCode2 = (hashCode + (allocationDestination != null ? allocationDestination.hashCode() : 0)) * 37;
            Long l = this.share_in_basis_points;
            int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Color color = this.tint_color;
            int hashCode4 = (hashCode3 + (color != null ? color.hashCode() : 0)) * 37;
            DestinationSelectionBehavior destinationSelectionBehavior = this.selection_behavior;
            int hashCode5 = (hashCode4 + (destinationSelectionBehavior != null ? destinationSelectionBehavior.hashCode() : 0)) * 37;
            SelectedStateUIElements selectedStateUIElements = this.selected_state_ui_elements;
            int hashCode6 = (hashCode5 + (selectedStateUIElements != null ? selectedStateUIElements.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.sq_accessibility_label;
            int hashCode7 = hashCode6 + (localizedString != null ? localizedString.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.destination = this.destination;
            builder.share_in_basis_points = this.share_in_basis_points;
            builder.tint_color = this.tint_color;
            builder.selection_behavior = this.selection_behavior;
            builder.selected_state_ui_elements = this.selected_state_ui_elements;
            builder.sq_accessibility_label = this.sq_accessibility_label;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            AllocationDestination allocationDestination = this.destination;
            if (allocationDestination != null) {
                arrayList.add("destination=" + allocationDestination);
            }
            Long l = this.share_in_basis_points;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("share_in_basis_points=", l, arrayList);
            }
            Color color = this.tint_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("tint_color=", color, arrayList);
            }
            DestinationSelectionBehavior destinationSelectionBehavior = this.selection_behavior;
            if (destinationSelectionBehavior != null) {
                arrayList.add("selection_behavior=" + destinationSelectionBehavior);
            }
            SelectedStateUIElements selectedStateUIElements = this.selected_state_ui_elements;
            if (selectedStateUIElements != null) {
                arrayList.add("selected_state_ui_elements=" + selectedStateUIElements);
            }
            LocalizedString localizedString = this.sq_accessibility_label;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("sq_accessibility_label=", localizedString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DestinationUiConfiguration{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$DestinationSelectionBehavior;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SELECTION_BEHAVIOR_DO_NOT_USE", "NOT_SELECTABLE", "SUBMIT_ON_SELECTION", "ALLOW_IMMEDIATE_SELECTION", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class DestinationSelectionBehavior implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ DestinationSelectionBehavior[] $VALUES;
            public static final ProtoAdapter ADAPTER;
            public static final DestinationSelectionBehavior ALLOW_IMMEDIATE_SELECTION;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final DestinationSelectionBehavior NOT_SELECTABLE;
            public static final DestinationSelectionBehavior SELECTION_BEHAVIOR_DO_NOT_USE;
            public static final DestinationSelectionBehavior SUBMIT_ON_SELECTION;
            private final int value;

            private static final /* synthetic */ DestinationSelectionBehavior[] $values() {
                return new DestinationSelectionBehavior[]{SELECTION_BEHAVIOR_DO_NOT_USE, NOT_SELECTABLE, SUBMIT_ON_SELECTION, ALLOW_IMMEDIATE_SELECTION};
            }

            static {
                final DestinationSelectionBehavior destinationSelectionBehavior = new DestinationSelectionBehavior("SELECTION_BEHAVIOR_DO_NOT_USE", 0, 0);
                SELECTION_BEHAVIOR_DO_NOT_USE = destinationSelectionBehavior;
                NOT_SELECTABLE = new DestinationSelectionBehavior("NOT_SELECTABLE", 1, 1);
                SUBMIT_ON_SELECTION = new DestinationSelectionBehavior("SUBMIT_ON_SELECTION", 2, 2);
                ALLOW_IMMEDIATE_SELECTION = new DestinationSelectionBehavior("ALLOW_IMMEDIATE_SELECTION", 3, 3);
                DestinationSelectionBehavior[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DestinationSelectionBehavior.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, destinationSelectionBehavior) { // from class: com.squareup.protos.franklin.api.SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$DestinationSelectionBehavior$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.DestinationSelectionBehavior fromValue(int value) {
                        return SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.DestinationSelectionBehavior.INSTANCE.fromValue(value);
                    }
                };
            }

            private DestinationSelectionBehavior(String str, int i, int i2) {
                this.value = i2;
            }

            public static final DestinationSelectionBehavior fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static DestinationSelectionBehavior valueOf(String str) {
                return (DestinationSelectionBehavior) Enum.valueOf(DestinationSelectionBehavior.class, str);
            }

            public static DestinationSelectionBehavior[] values() {
                return (DestinationSelectionBehavior[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$DestinationSelectionBehavior$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$DestinationSelectionBehavior;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final DestinationSelectionBehavior fromValue(int value) {
                    if (value == 0) {
                        return DestinationSelectionBehavior.SELECTION_BEHAVIOR_DO_NOT_USE;
                    }
                    if (value == 1) {
                        return DestinationSelectionBehavior.NOT_SELECTABLE;
                    }
                    if (value == 2) {
                        return DestinationSelectionBehavior.SUBMIT_ON_SELECTION;
                    }
                    if (value != 3) {
                        return null;
                    }
                    return DestinationSelectionBehavior.ALLOW_IMMEDIATE_SELECTION;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$DestinationUiConfiguration;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ DestinationUiConfiguration build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public DestinationUiConfiguration() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DestinationUiConfiguration(AllocationDestination allocationDestination, Long l, Color color, DestinationSelectionBehavior destinationSelectionBehavior, SelectedStateUIElements selectedStateUIElements, LocalizedString localizedString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.destination = allocationDestination;
            this.share_in_basis_points = l;
            this.tint_color = color;
            this.selection_behavior = destinationSelectionBehavior;
            this.selected_state_ui_elements = selectedStateUIElements;
            this.sq_accessibility_label = localizedString;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetPaycheckAllocationAmountBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SetPaycheckAllocationAmountBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public SetPaycheckAllocationAmountBlocker decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new SetPaycheckAllocationAmountBlocker(m, (Integer) obj, (AlertUi) obj2, (Money) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.ADAPTER.decode(reader));
                    } else if (nextTag == 2) {
                        obj = ProtoAdapter.INT32.decode(reader);
                    } else if (nextTag == 3) {
                        obj2 = TransactorKt.decodeMessageOrMerge(AlertUi.ADAPTER, reader, obj2);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SetPaycheckAllocationAmountBlocker value) {
                writer.getClass();
                value.getClass();
                SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.initial_destination_states);
                ProtoAdapter.INT32.encodeWithTag(writer, 2, value.initially_selected_destination_index);
                AlertUi.ADAPTER.encodeWithTag(writer, 3, value.exceeded_max_distribution_alert_ui);
                Money.ADAPTER.encodeWithTag(writer, 4, value.average_monthly_paycheck);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SetPaycheckAllocationAmountBlocker value) {
                value.getClass();
                return Money.ADAPTER.encodedSizeWithTag(4, value.average_monthly_paycheck) + AlertUi.ADAPTER.encodedSizeWithTag(3, value.exceeded_max_distribution_alert_ui) + ProtoAdapter.INT32.encodedSizeWithTag(2, value.initially_selected_destination_index) + SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.ADAPTER.asRepeated().encodedSizeWithTag(1, value.initial_destination_states) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SetPaycheckAllocationAmountBlocker redact(SetPaycheckAllocationAmountBlocker value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.initial_destination_states, SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.ADAPTER);
                AlertUi alertUi = value.exceeded_max_distribution_alert_ui;
                AlertUi alertUi2 = alertUi != null ? (AlertUi) AlertUi.ADAPTER.redact(alertUi) : null;
                Money money = value.average_monthly_paycheck;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                ByteString byteString = ByteString.EMPTY;
                Integer num = value.initially_selected_destination_index;
                byteString.getClass();
                return new SetPaycheckAllocationAmountBlocker(m1169redactElements, num, alertUi2, money2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SetPaycheckAllocationAmountBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                Money.ADAPTER.encodeWithTag(writer, 4, value.average_monthly_paycheck);
                AlertUi.ADAPTER.encodeWithTag(writer, 3, value.exceeded_max_distribution_alert_ui);
                ProtoAdapter.INT32.encodeWithTag(writer, 2, value.initially_selected_destination_index);
                SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.initial_destination_states);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetPaycheckAllocationAmountBlocker(List list, Integer num, AlertUi alertUi, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.initially_selected_destination_index = num;
        this.exceeded_max_distribution_alert_ui = alertUi;
        this.average_monthly_paycheck = money;
        this.initial_destination_states = TransactorKt.immutableCopyOf("initial_destination_states", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetPaycheckAllocationAmountBlocker)) {
            return false;
        }
        SetPaycheckAllocationAmountBlocker setPaycheckAllocationAmountBlocker = (SetPaycheckAllocationAmountBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), setPaycheckAllocationAmountBlocker.unknownFields()) && Intrinsics.areEqual(this.initial_destination_states, setPaycheckAllocationAmountBlocker.initial_destination_states) && Intrinsics.areEqual(this.initially_selected_destination_index, setPaycheckAllocationAmountBlocker.initially_selected_destination_index) && Intrinsics.areEqual(this.exceeded_max_distribution_alert_ui, setPaycheckAllocationAmountBlocker.exceeded_max_distribution_alert_ui) && Intrinsics.areEqual(this.average_monthly_paycheck, setPaycheckAllocationAmountBlocker.average_monthly_paycheck);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.initial_destination_states);
        Integer num = this.initially_selected_destination_index;
        int hashCode = (m + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        AlertUi alertUi = this.exceeded_max_distribution_alert_ui;
        int hashCode2 = (hashCode + (alertUi != null ? alertUi.hashCode() : 0)) * 37;
        Money money = this.average_monthly_paycheck;
        int hashCode3 = hashCode2 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.initial_destination_states = this.initial_destination_states;
        builder.initially_selected_destination_index = this.initially_selected_destination_index;
        builder.exceeded_max_distribution_alert_ui = this.exceeded_max_distribution_alert_ui;
        builder.average_monthly_paycheck = this.average_monthly_paycheck;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.initial_destination_states.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("initial_destination_states=", arrayList, this.initial_destination_states);
        }
        Integer num = this.initially_selected_destination_index;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("initially_selected_destination_index=", num, arrayList);
        }
        AlertUi alertUi = this.exceeded_max_distribution_alert_ui;
        if (alertUi != null) {
            arrayList.add("exceeded_max_distribution_alert_ui=" + alertUi);
        }
        Money money = this.average_monthly_paycheck;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("average_monthly_paycheck=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetPaycheckAllocationAmountBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SetPaycheckAllocationAmountBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ SetPaycheckAllocationAmountBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
