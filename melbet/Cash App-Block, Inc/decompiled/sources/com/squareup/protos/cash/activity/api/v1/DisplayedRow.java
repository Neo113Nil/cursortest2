package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\b\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row;", "row", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row;", "Companion", "Builder", "Row", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DisplayedRow extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DisplayedRow> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final Row row;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow;", "<init>", "()V", "row", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Row row;

        @Override // com.squareup.wire.Message.Builder
        public DisplayedRow build() {
            return new DisplayedRow(this.row, buildUnknownFields());
        }

        public final Builder row(Row row) {
            this.row = row;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row;", "", "ContactListRow", "PendingHeader", "CompletedHeader", "UpcomingHeader", "SyncEntityRow", "RollupRow", "EmptyRow", "EmptyHeaderRow", "InlineActivityAppMessageRow", "PendingPaymentRow", "InviteRow", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$CompletedHeader;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$ContactListRow;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$EmptyHeaderRow;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$EmptyRow;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$InlineActivityAppMessageRow;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$InviteRow;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$PendingHeader;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$PendingPaymentRow;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$RollupRow;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$SyncEntityRow;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$UpcomingHeader;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Row {

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.CompletedHeader#ADAPTER", declaredName = "completed_header", tag = 3)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$CompletedHeader;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row;", "Lcom/squareup/protos/cash/activity/api/v1/CompletedHeader;", "value", "Lcom/squareup/protos/cash/activity/api/v1/CompletedHeader;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/CompletedHeader;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CompletedHeader extends Row {
            private final com.squareup.protos.cash.activity.api.v1.CompletedHeader value;

            public CompletedHeader(com.squareup.protos.cash.activity.api.v1.CompletedHeader completedHeader) {
                completedHeader.getClass();
                this.value = completedHeader;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CompletedHeader) && Intrinsics.areEqual(this.value, ((CompletedHeader) obj).value);
            }

            public final com.squareup.protos.cash.activity.api.v1.CompletedHeader getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CompletedHeader(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.ContactListRow#ADAPTER", declaredName = "contact_list_row", tag = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$ContactListRow;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row;", "Lcom/squareup/protos/cash/activity/api/v1/ContactListRow;", "value", "Lcom/squareup/protos/cash/activity/api/v1/ContactListRow;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/ContactListRow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ContactListRow extends Row {
            private final com.squareup.protos.cash.activity.api.v1.ContactListRow value;

            public ContactListRow(com.squareup.protos.cash.activity.api.v1.ContactListRow contactListRow) {
                contactListRow.getClass();
                this.value = contactListRow;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ContactListRow) && Intrinsics.areEqual(this.value, ((ContactListRow) obj).value);
            }

            public final com.squareup.protos.cash.activity.api.v1.ContactListRow getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ContactListRow(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.EmptyHeaderRow#ADAPTER", declaredName = "empty_header_row", tag = 8)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$EmptyHeaderRow;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row;", "Lcom/squareup/protos/cash/activity/api/v1/EmptyHeaderRow;", "value", "Lcom/squareup/protos/cash/activity/api/v1/EmptyHeaderRow;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/EmptyHeaderRow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class EmptyHeaderRow extends Row {
            private final com.squareup.protos.cash.activity.api.v1.EmptyHeaderRow value;

            public EmptyHeaderRow(com.squareup.protos.cash.activity.api.v1.EmptyHeaderRow emptyHeaderRow) {
                emptyHeaderRow.getClass();
                this.value = emptyHeaderRow;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EmptyHeaderRow) && Intrinsics.areEqual(this.value, ((EmptyHeaderRow) obj).value);
            }

            public final com.squareup.protos.cash.activity.api.v1.EmptyHeaderRow getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "EmptyHeaderRow(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.EmptyRow#ADAPTER", declaredName = "empty_row", tag = 7)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$EmptyRow;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row;", "Lcom/squareup/protos/cash/activity/api/v1/EmptyRow;", "value", "Lcom/squareup/protos/cash/activity/api/v1/EmptyRow;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/EmptyRow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class EmptyRow extends Row {
            private final com.squareup.protos.cash.activity.api.v1.EmptyRow value;

            public EmptyRow(com.squareup.protos.cash.activity.api.v1.EmptyRow emptyRow) {
                emptyRow.getClass();
                this.value = emptyRow;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EmptyRow) && Intrinsics.areEqual(this.value, ((EmptyRow) obj).value);
            }

            public final com.squareup.protos.cash.activity.api.v1.EmptyRow getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "EmptyRow(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.InlineActivityAppMessageRow#ADAPTER", declaredName = "inline_activity_app_message_row", tag = 9)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$InlineActivityAppMessageRow;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row;", "Lcom/squareup/protos/cash/activity/api/v1/InlineActivityAppMessageRow;", "value", "Lcom/squareup/protos/cash/activity/api/v1/InlineActivityAppMessageRow;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/InlineActivityAppMessageRow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InlineActivityAppMessageRow extends Row {
            private final com.squareup.protos.cash.activity.api.v1.InlineActivityAppMessageRow value;

            public InlineActivityAppMessageRow(com.squareup.protos.cash.activity.api.v1.InlineActivityAppMessageRow inlineActivityAppMessageRow) {
                inlineActivityAppMessageRow.getClass();
                this.value = inlineActivityAppMessageRow;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InlineActivityAppMessageRow) && Intrinsics.areEqual(this.value, ((InlineActivityAppMessageRow) obj).value);
            }

            public final com.squareup.protos.cash.activity.api.v1.InlineActivityAppMessageRow getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "InlineActivityAppMessageRow(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.InviteRow#ADAPTER", declaredName = "invite_row", tag = 11)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$InviteRow;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row;", "Lcom/squareup/protos/cash/activity/api/v1/InviteRow;", "value", "Lcom/squareup/protos/cash/activity/api/v1/InviteRow;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/InviteRow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InviteRow extends Row {
            private final com.squareup.protos.cash.activity.api.v1.InviteRow value;

            public InviteRow(com.squareup.protos.cash.activity.api.v1.InviteRow inviteRow) {
                inviteRow.getClass();
                this.value = inviteRow;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InviteRow) && Intrinsics.areEqual(this.value, ((InviteRow) obj).value);
            }

            public final com.squareup.protos.cash.activity.api.v1.InviteRow getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "InviteRow(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.PendingHeader#ADAPTER", declaredName = "pending_header", tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$PendingHeader;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row;", "Lcom/squareup/protos/cash/activity/api/v1/PendingHeader;", "value", "Lcom/squareup/protos/cash/activity/api/v1/PendingHeader;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/PendingHeader;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PendingHeader extends Row {
            private final com.squareup.protos.cash.activity.api.v1.PendingHeader value;

            public PendingHeader(com.squareup.protos.cash.activity.api.v1.PendingHeader pendingHeader) {
                pendingHeader.getClass();
                this.value = pendingHeader;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PendingHeader) && Intrinsics.areEqual(this.value, ((PendingHeader) obj).value);
            }

            public final com.squareup.protos.cash.activity.api.v1.PendingHeader getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PendingHeader(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.PendingPaymentRow#ADAPTER", declaredName = "pending_payment_row", tag = 10)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$PendingPaymentRow;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row;", "Lcom/squareup/protos/cash/activity/api/v1/PendingPaymentRow;", "value", "Lcom/squareup/protos/cash/activity/api/v1/PendingPaymentRow;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/PendingPaymentRow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PendingPaymentRow extends Row {
            private final com.squareup.protos.cash.activity.api.v1.PendingPaymentRow value;

            public PendingPaymentRow(com.squareup.protos.cash.activity.api.v1.PendingPaymentRow pendingPaymentRow) {
                pendingPaymentRow.getClass();
                this.value = pendingPaymentRow;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PendingPaymentRow) && Intrinsics.areEqual(this.value, ((PendingPaymentRow) obj).value);
            }

            public final com.squareup.protos.cash.activity.api.v1.PendingPaymentRow getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PendingPaymentRow(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.RollupRow#ADAPTER", declaredName = "rollup_row", tag = 6)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$RollupRow;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row;", "Lcom/squareup/protos/cash/activity/api/v1/RollupRow;", "value", "Lcom/squareup/protos/cash/activity/api/v1/RollupRow;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/RollupRow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RollupRow extends Row {
            private final com.squareup.protos.cash.activity.api.v1.RollupRow value;

            public RollupRow(com.squareup.protos.cash.activity.api.v1.RollupRow rollupRow) {
                rollupRow.getClass();
                this.value = rollupRow;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RollupRow) && Intrinsics.areEqual(this.value, ((RollupRow) obj).value);
            }

            public final com.squareup.protos.cash.activity.api.v1.RollupRow getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "RollupRow(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.SyncEntityRow#ADAPTER", declaredName = "sync_entity_row", tag = 5)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$SyncEntityRow;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row;", "Lcom/squareup/protos/cash/activity/api/v1/SyncEntityRow;", "value", "Lcom/squareup/protos/cash/activity/api/v1/SyncEntityRow;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/SyncEntityRow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SyncEntityRow extends Row {
            private final com.squareup.protos.cash.activity.api.v1.SyncEntityRow value;

            public SyncEntityRow(com.squareup.protos.cash.activity.api.v1.SyncEntityRow syncEntityRow) {
                syncEntityRow.getClass();
                this.value = syncEntityRow;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SyncEntityRow) && Intrinsics.areEqual(this.value, ((SyncEntityRow) obj).value);
            }

            public final com.squareup.protos.cash.activity.api.v1.SyncEntityRow getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SyncEntityRow(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.UpcomingHeader#ADAPTER", declaredName = "upcoming_header", tag = 4)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row$UpcomingHeader;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow$Row;", "Lcom/squareup/protos/cash/activity/api/v1/UpcomingHeader;", "value", "Lcom/squareup/protos/cash/activity/api/v1/UpcomingHeader;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/UpcomingHeader;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UpcomingHeader extends Row {
            private final com.squareup.protos.cash.activity.api.v1.UpcomingHeader value;

            public UpcomingHeader(com.squareup.protos.cash.activity.api.v1.UpcomingHeader upcomingHeader) {
                upcomingHeader.getClass();
                this.value = upcomingHeader;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpcomingHeader) && Intrinsics.areEqual(this.value, ((UpcomingHeader) obj).value);
            }

            public final com.squareup.protos.cash.activity.api.v1.UpcomingHeader getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "UpcomingHeader(value=" + this.value + ")";
            }
        }
    }

    static {
        DisplayedRow$Companion$ADAPTER$1 displayedRow$Companion$ADAPTER$1 = new DisplayedRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DisplayedRow.class), "type.googleapis.com/squareup.cash.activity.api.v1.DisplayedRow", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/verification.proto");
        ADAPTER = displayedRow$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(displayedRow$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayedRow(Row row, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.row = row;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DisplayedRow)) {
            return false;
        }
        DisplayedRow displayedRow = (DisplayedRow) obj;
        return Intrinsics.areEqual(unknownFields(), displayedRow.unknownFields()) && Intrinsics.areEqual(this.row, displayedRow.row);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Row row = this.row;
        int hashCode2 = hashCode + (row != null ? row.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.row = this.row;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Row row = this.row;
        if (row != null) {
            arrayList.add("row=" + row);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisplayedRow{", "}", 0, null, null, 56);
    }
}
