package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\"#!R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRow$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId;", "activity_item_global_id", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId;", "", "row_id", "Ljava/lang/String;", "reference_activity_item_global_id", "", "version", "Ljava/lang/Long;", "display_date_epoch_ms", "created_at_epoch_ms", "", "is_badged", "Ljava/lang/Boolean;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRowSection;", "activity_row_section", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRowSection;", "item_version", "is_deleted", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRow$Body;", "body", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRow$Body;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemCorrelations;", "correlations", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemCorrelations;", "", "Lcom/squareup/protos/cash/activity/api/v1/ActivityProductClassifier;", "product_classifiers", "Ljava/util/List;", "Companion", "Builder", "Body", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityRow extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivityRow> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId#ADAPTER", schemaIndex = 0, tag = 5)
    public final ActivityItemGlobalId activity_item_global_id;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityRowSection#ADAPTER", schemaIndex = 7, tag = 6)
    public final ActivityRowSection activity_row_section;

    @WireSealedOneof(schemaIndex = 11)
    public final Body body;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityItemCorrelations#ADAPTER", schemaIndex = 12, tag = 13)
    public final ActivityItemCorrelations correlations;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 5, tag = 15)
    public final Long created_at_epoch_ms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 4, tag = 3)
    public final Long display_date_epoch_ms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 6, tag = 4)
    public final Boolean is_badged;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 9, tag = 8)
    public final Boolean is_deleted;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 8, tag = 7)
    public final Long item_version;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityProductClassifier#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 10, tag = 9)
    public final List<ActivityProductClassifier> product_classifiers;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId#ADAPTER", schemaIndex = 2, tag = 14)
    public final ActivityItemGlobalId reference_activity_item_global_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 1)
    public final String row_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 3, tag = 2)
    public final Long version;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityRow$Body;", "", "PaymentHistoryInputsRow", "PaycheckRow", "OrderRow", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRow$Body$OrderRow;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRow$Body$PaycheckRow;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRow$Body$PaymentHistoryInputsRow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Body {

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.OrderRow#ADAPTER", declaredName = "order_row", tag = 12)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityRow$Body$OrderRow;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRow$Body;", "Lcom/squareup/protos/cash/activity/api/v1/OrderRow;", "value", "Lcom/squareup/protos/cash/activity/api/v1/OrderRow;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/OrderRow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OrderRow extends Body {
            private final com.squareup.protos.cash.activity.api.v1.OrderRow value;

            public OrderRow(com.squareup.protos.cash.activity.api.v1.OrderRow orderRow) {
                orderRow.getClass();
                this.value = orderRow;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OrderRow) && Intrinsics.areEqual(this.value, ((OrderRow) obj).value);
            }

            public final com.squareup.protos.cash.activity.api.v1.OrderRow getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "OrderRow(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.PaycheckRow#ADAPTER", declaredName = "paycheck_row", tag = 11)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityRow$Body$PaycheckRow;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRow$Body;", "Lcom/squareup/protos/cash/activity/api/v1/PaycheckRow;", "value", "Lcom/squareup/protos/cash/activity/api/v1/PaycheckRow;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/PaycheckRow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PaycheckRow extends Body {
            private final com.squareup.protos.cash.activity.api.v1.PaycheckRow value;

            public PaycheckRow(com.squareup.protos.cash.activity.api.v1.PaycheckRow paycheckRow) {
                paycheckRow.getClass();
                this.value = paycheckRow;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaycheckRow) && Intrinsics.areEqual(this.value, ((PaycheckRow) obj).value);
            }

            public final com.squareup.protos.cash.activity.api.v1.PaycheckRow getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PaycheckRow(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.PaymentHistoryInputsRow#ADAPTER", declaredName = "payment_history_inputs_row", tag = 10)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityRow$Body$PaymentHistoryInputsRow;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRow$Body;", "Lcom/squareup/protos/cash/activity/api/v1/PaymentHistoryInputsRow;", "value", "Lcom/squareup/protos/cash/activity/api/v1/PaymentHistoryInputsRow;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/PaymentHistoryInputsRow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PaymentHistoryInputsRow extends Body {
            private final com.squareup.protos.cash.activity.api.v1.PaymentHistoryInputsRow value;

            public PaymentHistoryInputsRow(com.squareup.protos.cash.activity.api.v1.PaymentHistoryInputsRow paymentHistoryInputsRow) {
                paymentHistoryInputsRow.getClass();
                this.value = paymentHistoryInputsRow;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaymentHistoryInputsRow) && Intrinsics.areEqual(this.value, ((PaymentHistoryInputsRow) obj).value);
            }

            public final com.squareup.protos.cash.activity.api.v1.PaymentHistoryInputsRow getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PaymentHistoryInputsRow(value=" + this.value + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u001dJ\u0015\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u001dJ\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u001dJ\u0015\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0015\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u001dJ\u0015\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u0016\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\b\u0010\u001f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRow;", "<init>", "()V", "activity_item_global_id", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId;", "row_id", "", "reference_activity_item_global_id", "version", "", "Ljava/lang/Long;", "display_date_epoch_ms", "created_at_epoch_ms", "is_badged", "", "Ljava/lang/Boolean;", "activity_row_section", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRowSection;", "item_version", "is_deleted", "product_classifiers", "", "Lcom/squareup/protos/cash/activity/api/v1/ActivityProductClassifier;", "body", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRow$Body;", "correlations", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemCorrelations;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/activity/api/v1/ActivityRow$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/activity/api/v1/ActivityRow$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ActivityItemGlobalId activity_item_global_id;
        public ActivityRowSection activity_row_section;
        public Body body;
        public ActivityItemCorrelations correlations;
        public Long created_at_epoch_ms;
        public Long display_date_epoch_ms;
        public Boolean is_badged;
        public Boolean is_deleted;
        public Long item_version;
        public List<? extends ActivityProductClassifier> product_classifiers = EmptyList.INSTANCE;
        public ActivityItemGlobalId reference_activity_item_global_id;
        public String row_id;
        public Long version;

        public final Builder activity_item_global_id(ActivityItemGlobalId activity_item_global_id) {
            this.activity_item_global_id = activity_item_global_id;
            return this;
        }

        public final Builder activity_row_section(ActivityRowSection activity_row_section) {
            this.activity_row_section = activity_row_section;
            return this;
        }

        public final Builder body(Body body) {
            this.body = body;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ActivityRow build() {
            return new ActivityRow(this.activity_item_global_id, this.row_id, this.reference_activity_item_global_id, this.version, this.display_date_epoch_ms, this.created_at_epoch_ms, this.is_badged, this.activity_row_section, this.item_version, this.is_deleted, this.product_classifiers, this.body, this.correlations, buildUnknownFields());
        }

        public final Builder correlations(ActivityItemCorrelations correlations) {
            this.correlations = correlations;
            return this;
        }

        public final Builder created_at_epoch_ms(Long created_at_epoch_ms) {
            this.created_at_epoch_ms = created_at_epoch_ms;
            return this;
        }

        public final Builder display_date_epoch_ms(Long display_date_epoch_ms) {
            this.display_date_epoch_ms = display_date_epoch_ms;
            return this;
        }

        public final Builder is_badged(Boolean is_badged) {
            this.is_badged = is_badged;
            return this;
        }

        public final Builder is_deleted(Boolean is_deleted) {
            this.is_deleted = is_deleted;
            return this;
        }

        public final Builder item_version(Long item_version) {
            this.item_version = item_version;
            return this;
        }

        public final Builder product_classifiers(List<? extends ActivityProductClassifier> product_classifiers) {
            product_classifiers.getClass();
            TransactorKt.checkElementsNotNull(product_classifiers);
            this.product_classifiers = product_classifiers;
            return this;
        }

        public final Builder reference_activity_item_global_id(ActivityItemGlobalId reference_activity_item_global_id) {
            this.reference_activity_item_global_id = reference_activity_item_global_id;
            return this;
        }

        public final Builder row_id(String row_id) {
            this.row_id = row_id;
            return this;
        }

        public final Builder version(Long version) {
            this.version = version;
            return this;
        }
    }

    static {
        ActivityRow$Companion$ADAPTER$1 activityRow$Companion$ADAPTER$1 = new ActivityRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivityRow.class), "type.googleapis.com/squareup.cash.activity.api.v1.ActivityRow", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/models.proto");
        ADAPTER = activityRow$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activityRow$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityRow(ActivityItemGlobalId activityItemGlobalId, String str, ActivityItemGlobalId activityItemGlobalId2, Long l, Long l2, Long l3, Boolean bool, ActivityRowSection activityRowSection, Long l4, Boolean bool2, List list, Body body, ActivityItemCorrelations activityItemCorrelations, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.activity_item_global_id = activityItemGlobalId;
        this.row_id = str;
        this.reference_activity_item_global_id = activityItemGlobalId2;
        this.version = l;
        this.display_date_epoch_ms = l2;
        this.created_at_epoch_ms = l3;
        this.is_badged = bool;
        this.activity_row_section = activityRowSection;
        this.item_version = l4;
        this.is_deleted = bool2;
        this.body = body;
        this.correlations = activityItemCorrelations;
        this.product_classifiers = TransactorKt.immutableCopyOf("product_classifiers", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityRow)) {
            return false;
        }
        ActivityRow activityRow = (ActivityRow) obj;
        return Intrinsics.areEqual(unknownFields(), activityRow.unknownFields()) && Intrinsics.areEqual(this.activity_item_global_id, activityRow.activity_item_global_id) && Intrinsics.areEqual(this.row_id, activityRow.row_id) && Intrinsics.areEqual(this.reference_activity_item_global_id, activityRow.reference_activity_item_global_id) && Intrinsics.areEqual(this.version, activityRow.version) && Intrinsics.areEqual(this.display_date_epoch_ms, activityRow.display_date_epoch_ms) && Intrinsics.areEqual(this.created_at_epoch_ms, activityRow.created_at_epoch_ms) && Intrinsics.areEqual(this.is_badged, activityRow.is_badged) && this.activity_row_section == activityRow.activity_row_section && Intrinsics.areEqual(this.item_version, activityRow.item_version) && Intrinsics.areEqual(this.is_deleted, activityRow.is_deleted) && Intrinsics.areEqual(this.product_classifiers, activityRow.product_classifiers) && Intrinsics.areEqual(this.body, activityRow.body) && Intrinsics.areEqual(this.correlations, activityRow.correlations);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ActivityItemGlobalId activityItemGlobalId = this.activity_item_global_id;
        int hashCode2 = (hashCode + (activityItemGlobalId != null ? activityItemGlobalId.hashCode() : 0)) * 37;
        String str = this.row_id;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        ActivityItemGlobalId activityItemGlobalId2 = this.reference_activity_item_global_id;
        int hashCode4 = (hashCode3 + (activityItemGlobalId2 != null ? activityItemGlobalId2.hashCode() : 0)) * 37;
        Long l = this.version;
        int hashCode5 = (hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.display_date_epoch_ms;
        int hashCode6 = (hashCode5 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.created_at_epoch_ms;
        int hashCode7 = (hashCode6 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Boolean bool = this.is_badged;
        int hashCode8 = (hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        ActivityRowSection activityRowSection = this.activity_row_section;
        int hashCode9 = (hashCode8 + (activityRowSection != null ? activityRowSection.hashCode() : 0)) * 37;
        Long l4 = this.item_version;
        int hashCode10 = (hashCode9 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        Boolean bool2 = this.is_deleted;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode10 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37, 37, this.product_classifiers);
        Body body = this.body;
        int hashCode11 = (m + (body != null ? body.hashCode() : 0)) * 37;
        ActivityItemCorrelations activityItemCorrelations = this.correlations;
        int hashCode12 = hashCode11 + (activityItemCorrelations != null ? activityItemCorrelations.hashCode() : 0);
        this.hashCode = hashCode12;
        return hashCode12;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.activity_item_global_id = this.activity_item_global_id;
        builder.row_id = this.row_id;
        builder.reference_activity_item_global_id = this.reference_activity_item_global_id;
        builder.version = this.version;
        builder.display_date_epoch_ms = this.display_date_epoch_ms;
        builder.created_at_epoch_ms = this.created_at_epoch_ms;
        builder.is_badged = this.is_badged;
        builder.activity_row_section = this.activity_row_section;
        builder.item_version = this.item_version;
        builder.is_deleted = this.is_deleted;
        builder.product_classifiers = this.product_classifiers;
        builder.body = this.body;
        builder.correlations = this.correlations;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ActivityItemGlobalId activityItemGlobalId = this.activity_item_global_id;
        if (activityItemGlobalId != null) {
            arrayList.add("activity_item_global_id=" + activityItemGlobalId);
        }
        String str = this.row_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "row_id=", arrayList);
        }
        ActivityItemGlobalId activityItemGlobalId2 = this.reference_activity_item_global_id;
        if (activityItemGlobalId2 != null) {
            arrayList.add("reference_activity_item_global_id=" + activityItemGlobalId2);
        }
        Long l = this.version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l, arrayList);
        }
        Long l2 = this.display_date_epoch_ms;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("display_date_epoch_ms=", l2, arrayList);
        }
        Long l3 = this.created_at_epoch_ms;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at_epoch_ms=", l3, arrayList);
        }
        Boolean bool = this.is_badged;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_badged=", bool, arrayList);
        }
        ActivityRowSection activityRowSection = this.activity_row_section;
        if (activityRowSection != null) {
            arrayList.add("activity_row_section=" + activityRowSection);
        }
        Long l4 = this.item_version;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("item_version=", l4, arrayList);
        }
        Boolean bool2 = this.is_deleted;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_deleted=", bool2, arrayList);
        }
        if (!this.product_classifiers.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("product_classifiers=", arrayList, this.product_classifiers);
        }
        Body body = this.body;
        if (body != null) {
            arrayList.add("body=" + body);
        }
        ActivityItemCorrelations activityItemCorrelations = this.correlations;
        if (activityItemCorrelations != null) {
            arrayList.add("correlations=" + activityItemCorrelations);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivityRow{", "}", 0, null, null, 56);
    }

    public ActivityRow(ActivityItemGlobalId activityItemGlobalId, Long l, Body.PaymentHistoryInputsRow paymentHistoryInputsRow, int i) {
        this(activityItemGlobalId, null, null, null, l, null, null, null, null, null, EmptyList.INSTANCE, (i & 2048) != 0 ? null : paymentHistoryInputsRow, null, ByteString.EMPTY);
    }
}
