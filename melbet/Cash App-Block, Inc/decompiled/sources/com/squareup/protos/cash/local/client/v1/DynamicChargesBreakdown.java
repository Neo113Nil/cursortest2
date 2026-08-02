package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.DynamicChargesBreakdown;
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

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0010\u000f\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$Builder;", "", "customer_tip_identifier", "Ljava/lang/String;", "local_cash_identifier", "total_without_discounts_identifier", "grand_total_identifier", "subtotal_identifier", "total_before_tip_identifier", "", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation;", "rows", "Ljava/util/List;", "Companion", "Builder", "RowCalculation", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DynamicChargesBreakdown extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DynamicChargesBreakdown> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String customer_tip_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String grand_total_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String local_cash_identifier;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.DynamicChargesBreakdown$RowCalculation#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<RowCalculation> rows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String subtotal_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    public final String total_before_tip_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String total_without_discounts_identifier;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\tJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\tJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown;", "<init>", "()V", "rows", "", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation;", "customer_tip_identifier", "", "local_cash_identifier", "total_without_discounts_identifier", "grand_total_identifier", "subtotal_identifier", "total_before_tip_identifier", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String customer_tip_identifier;
        public String grand_total_identifier;
        public String local_cash_identifier;
        public List<RowCalculation> rows = EmptyList.INSTANCE;
        public String subtotal_identifier;
        public String total_before_tip_identifier;
        public String total_without_discounts_identifier;

        @Override // com.squareup.wire.Message.Builder
        public DynamicChargesBreakdown build() {
            return new DynamicChargesBreakdown(this.rows, this.customer_tip_identifier, this.local_cash_identifier, this.total_without_discounts_identifier, this.grand_total_identifier, this.subtotal_identifier, this.total_before_tip_identifier, buildUnknownFields());
        }

        public final Builder customer_tip_identifier(String customer_tip_identifier) {
            this.customer_tip_identifier = customer_tip_identifier;
            return this;
        }

        public final Builder grand_total_identifier(String grand_total_identifier) {
            this.grand_total_identifier = grand_total_identifier;
            return this;
        }

        public final Builder local_cash_identifier(String local_cash_identifier) {
            this.local_cash_identifier = local_cash_identifier;
            return this;
        }

        public final Builder rows(List<RowCalculation> rows) {
            rows.getClass();
            TransactorKt.checkElementsNotNull(rows);
            this.rows = rows;
            return this;
        }

        public final Builder subtotal_identifier(String subtotal_identifier) {
            this.subtotal_identifier = subtotal_identifier;
            return this;
        }

        public final Builder total_before_tip_identifier(String total_before_tip_identifier) {
            this.total_before_tip_identifier = total_before_tip_identifier;
            return this;
        }

        public final Builder total_without_discounts_identifier(String total_without_discounts_identifier) {
            this.total_without_discounts_identifier = total_without_discounts_identifier;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001f !\"Bu\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0014\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0082\u0004J\n\u0010\u001a\u001a\u00020\u001bH\u0096\u0080\u0004J\b\u0010\u001c\u001a\u00020\u0004H\u0016Jy\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u001eR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation$Builder;", "identifier", "", "orientation", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation$Orientation;", "base_amount", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "dependencies", "", "visibility", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation$Visibility;", "display_label", "display_value_zero", "bold_treatment", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation$Orientation;Lcom/squareup/protos/cash/local/client/v1/LocalMoney;Ljava/util/List;Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation$Visibility;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lokio/ByteString;)V", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation$Orientation;Lcom/squareup/protos/cash/local/client/v1/LocalMoney;Ljava/util/List;Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation$Visibility;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lokio/ByteString;)Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation;", "Builder", "Companion", "Orientation", "Visibility", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RowCalculation extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RowCalculation> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalMoney#ADAPTER", schemaIndex = 2, tag = 3)
        public final LocalMoney base_amount;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 7, tag = 8)
        public final Boolean bold_treatment;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
        public final List<String> dependencies;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
        public final String display_label;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
        public final String display_value_zero;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String identifier;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.DynamicChargesBreakdown$RowCalculation$Orientation#ADAPTER", schemaIndex = 1, tag = 2)
        public final Orientation orientation;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.DynamicChargesBreakdown$RowCalculation$Visibility#ADAPTER", schemaIndex = 4, tag = 5)
        public final Visibility visibility;

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation;", "<init>", "()V", "identifier", "", "orientation", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation$Orientation;", "base_amount", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "dependencies", "", "visibility", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation$Visibility;", "display_label", "display_value_zero", "bold_treatment", "", "Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public LocalMoney base_amount;
            public Boolean bold_treatment;
            public List<String> dependencies = EmptyList.INSTANCE;
            public String display_label;
            public String display_value_zero;
            public String identifier;
            public Orientation orientation;
            public Visibility visibility;

            public final Builder base_amount(LocalMoney base_amount) {
                this.base_amount = base_amount;
                return this;
            }

            public final Builder bold_treatment(Boolean bold_treatment) {
                this.bold_treatment = bold_treatment;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public RowCalculation build() {
                return new RowCalculation(this.identifier, this.orientation, this.base_amount, this.dependencies, this.visibility, this.display_label, this.display_value_zero, this.bold_treatment, buildUnknownFields());
            }

            public final Builder dependencies(List<String> dependencies) {
                dependencies.getClass();
                TransactorKt.checkElementsNotNull(dependencies);
                this.dependencies = dependencies;
                return this;
            }

            public final Builder display_label(String display_label) {
                this.display_label = display_label;
                return this;
            }

            public final Builder display_value_zero(String display_value_zero) {
                this.display_value_zero = display_value_zero;
                return this;
            }

            public final Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            public final Builder orientation(Orientation orientation) {
                this.orientation = orientation;
                return this;
            }

            public final Builder visibility(Visibility visibility) {
                this.visibility = visibility;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RowCalculation.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.DynamicChargesBreakdown$RowCalculation$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public DynamicChargesBreakdown.RowCalculation decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
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
                            return new DynamicChargesBreakdown.RowCalculation((String) obj, (DynamicChargesBreakdown.RowCalculation.Orientation) obj2, (LocalMoney) obj3, m, (DynamicChargesBreakdown.RowCalculation.Visibility) obj4, (String) obj5, (String) obj6, (Boolean) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                try {
                                    obj2 = DynamicChargesBreakdown.RowCalculation.Orientation.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 3:
                                obj3 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, reader, obj3);
                                break;
                            case 4:
                                m.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            case 5:
                                try {
                                    obj4 = DynamicChargesBreakdown.RowCalculation.Visibility.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 6:
                                obj5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                obj6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                obj7 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, DynamicChargesBreakdown.RowCalculation value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.identifier);
                    DynamicChargesBreakdown.RowCalculation.Orientation.ADAPTER.encodeWithTag(writer, 2, value.orientation);
                    LocalMoney.ADAPTER.encodeWithTag(writer, 3, value.base_amount);
                    protoAdapter2.asRepeated().encodeWithTag(writer, 4, value.dependencies);
                    DynamicChargesBreakdown.RowCalculation.Visibility.ADAPTER.encodeWithTag(writer, 5, value.visibility);
                    protoAdapter2.encodeWithTag(writer, 6, value.display_label);
                    protoAdapter2.encodeWithTag(writer, 7, value.display_value_zero);
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, value.bold_treatment);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(DynamicChargesBreakdown.RowCalculation value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return ProtoAdapter.BOOL.encodedSizeWithTag(8, value.bold_treatment) + protoAdapter2.encodedSizeWithTag(7, value.display_value_zero) + protoAdapter2.encodedSizeWithTag(6, value.display_label) + DynamicChargesBreakdown.RowCalculation.Visibility.ADAPTER.encodedSizeWithTag(5, value.visibility) + protoAdapter2.asRepeated().encodedSizeWithTag(4, value.dependencies) + LocalMoney.ADAPTER.encodedSizeWithTag(3, value.base_amount) + DynamicChargesBreakdown.RowCalculation.Orientation.ADAPTER.encodedSizeWithTag(2, value.orientation) + protoAdapter2.encodedSizeWithTag(1, value.identifier) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public DynamicChargesBreakdown.RowCalculation redact(DynamicChargesBreakdown.RowCalculation value) {
                    value.getClass();
                    LocalMoney localMoney = value.base_amount;
                    return DynamicChargesBreakdown.RowCalculation.copy$default(value, null, null, localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null, null, null, null, null, null, ByteString.EMPTY, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, DynamicChargesBreakdown.RowCalculation value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, value.bold_treatment);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 7, value.display_value_zero);
                    protoAdapter2.encodeWithTag(writer, 6, value.display_label);
                    DynamicChargesBreakdown.RowCalculation.Visibility.ADAPTER.encodeWithTag(writer, 5, value.visibility);
                    protoAdapter2.asRepeated().encodeWithTag(writer, 4, value.dependencies);
                    LocalMoney.ADAPTER.encodeWithTag(writer, 3, value.base_amount);
                    DynamicChargesBreakdown.RowCalculation.Orientation.ADAPTER.encodeWithTag(writer, 2, value.orientation);
                    protoAdapter2.encodeWithTag(writer, 1, value.identifier);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public RowCalculation(String str, Orientation orientation, LocalMoney localMoney, List list, Visibility visibility, String str2, String str3, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : orientation, (i & 4) != 0 ? null : localMoney, (i & 8) != 0 ? EmptyList.INSTANCE : list, (i & 16) != 0 ? null : visibility, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ RowCalculation copy$default(RowCalculation rowCalculation, String str, Orientation orientation, LocalMoney localMoney, List list, Visibility visibility, String str2, String str3, Boolean bool, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = rowCalculation.identifier;
            }
            if ((i & 2) != 0) {
                orientation = rowCalculation.orientation;
            }
            if ((i & 4) != 0) {
                localMoney = rowCalculation.base_amount;
            }
            if ((i & 8) != 0) {
                list = rowCalculation.dependencies;
            }
            if ((i & 16) != 0) {
                visibility = rowCalculation.visibility;
            }
            if ((i & 32) != 0) {
                str2 = rowCalculation.display_label;
            }
            if ((i & 64) != 0) {
                str3 = rowCalculation.display_value_zero;
            }
            if ((i & 128) != 0) {
                bool = rowCalculation.bold_treatment;
            }
            if ((i & 256) != 0) {
                byteString = rowCalculation.unknownFields();
            }
            Boolean bool2 = bool;
            ByteString byteString2 = byteString;
            String str4 = str2;
            String str5 = str3;
            Visibility visibility2 = visibility;
            LocalMoney localMoney2 = localMoney;
            return rowCalculation.copy(str, orientation, localMoney2, list, visibility2, str4, str5, bool2, byteString2);
        }

        public final RowCalculation copy(String identifier, Orientation orientation, LocalMoney base_amount, List<String> dependencies, Visibility visibility, String display_label, String display_value_zero, Boolean bold_treatment, ByteString unknownFields) {
            dependencies.getClass();
            unknownFields.getClass();
            return new RowCalculation(identifier, orientation, base_amount, dependencies, visibility, display_label, display_value_zero, bold_treatment, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof RowCalculation)) {
                return false;
            }
            RowCalculation rowCalculation = (RowCalculation) other;
            return Intrinsics.areEqual(unknownFields(), rowCalculation.unknownFields()) && Intrinsics.areEqual(this.identifier, rowCalculation.identifier) && this.orientation == rowCalculation.orientation && Intrinsics.areEqual(this.base_amount, rowCalculation.base_amount) && Intrinsics.areEqual(this.dependencies, rowCalculation.dependencies) && this.visibility == rowCalculation.visibility && Intrinsics.areEqual(this.display_label, rowCalculation.display_label) && Intrinsics.areEqual(this.display_value_zero, rowCalculation.display_value_zero) && Intrinsics.areEqual(this.bold_treatment, rowCalculation.bold_treatment);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.identifier;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Orientation orientation = this.orientation;
            int hashCode3 = (hashCode2 + (orientation != null ? orientation.hashCode() : 0)) * 37;
            LocalMoney localMoney = this.base_amount;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (localMoney != null ? localMoney.hashCode() : 0)) * 37, 37, this.dependencies);
            Visibility visibility = this.visibility;
            int hashCode4 = (m + (visibility != null ? visibility.hashCode() : 0)) * 37;
            String str2 = this.display_label;
            int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.display_value_zero;
            int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
            Boolean bool = this.bold_treatment;
            int hashCode7 = hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.identifier = this.identifier;
            builder.orientation = this.orientation;
            builder.base_amount = this.base_amount;
            builder.dependencies = this.dependencies;
            builder.visibility = this.visibility;
            builder.display_label = this.display_label;
            builder.display_value_zero = this.display_value_zero;
            builder.bold_treatment = this.bold_treatment;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.identifier;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "identifier=", arrayList);
            }
            Orientation orientation = this.orientation;
            if (orientation != null) {
                arrayList.add("orientation=" + orientation);
            }
            LocalMoney localMoney = this.base_amount;
            if (localMoney != null) {
                SizeMode$EnumUnboxingLocalUtility.m("base_amount=", localMoney, arrayList);
            }
            if (!this.dependencies.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("dependencies=", arrayList, this.dependencies);
            }
            Visibility visibility = this.visibility;
            if (visibility != null) {
                arrayList.add("visibility=" + visibility);
            }
            String str2 = this.display_label;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "display_label=", arrayList);
            }
            String str3 = this.display_value_zero;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "display_value_zero=", arrayList);
            }
            Boolean bool = this.bold_treatment;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("bold_treatment=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RowCalculation{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation$Orientation;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORIENTATION_UNSPECIFIED", "ORIENTATION_CHARGE", "ORIENTATION_CREDIT", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Orientation implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Orientation[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Orientation ORIENTATION_CHARGE;
            public static final Orientation ORIENTATION_CREDIT;
            public static final Orientation ORIENTATION_UNSPECIFIED;
            private final int value;

            private static final /* synthetic */ Orientation[] $values() {
                return new Orientation[]{ORIENTATION_UNSPECIFIED, ORIENTATION_CHARGE, ORIENTATION_CREDIT};
            }

            static {
                final Orientation orientation = new Orientation("ORIENTATION_UNSPECIFIED", 0, 0);
                ORIENTATION_UNSPECIFIED = orientation;
                ORIENTATION_CHARGE = new Orientation("ORIENTATION_CHARGE", 1, 1);
                ORIENTATION_CREDIT = new Orientation("ORIENTATION_CREDIT", 2, 2);
                Orientation[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Orientation.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, orientation) { // from class: com.squareup.protos.cash.local.client.v1.DynamicChargesBreakdown$RowCalculation$Orientation$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public DynamicChargesBreakdown.RowCalculation.Orientation fromValue(int value) {
                        return DynamicChargesBreakdown.RowCalculation.Orientation.INSTANCE.fromValue(value);
                    }
                };
            }

            private Orientation(String str, int i, int i2) {
                this.value = i2;
            }

            public static final Orientation fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static Orientation valueOf(String str) {
                return (Orientation) Enum.valueOf(Orientation.class, str);
            }

            public static Orientation[] values() {
                return (Orientation[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation$Orientation$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation$Orientation;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Orientation fromValue(int value) {
                    if (value == 0) {
                        return Orientation.ORIENTATION_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return Orientation.ORIENTATION_CHARGE;
                    }
                    if (value != 2) {
                        return null;
                    }
                    return Orientation.ORIENTATION_CREDIT;
                }

                private Companion() {
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation$Visibility;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "VISIBILITY_UNSPECIFIED", "VISIBILITY_ALWAYS", "VISIBILITY_HIDE_IF_ZERO", "VISIBILITY_HIDDEN", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Visibility implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Visibility[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Visibility VISIBILITY_ALWAYS;
            public static final Visibility VISIBILITY_HIDDEN;
            public static final Visibility VISIBILITY_HIDE_IF_ZERO;
            public static final Visibility VISIBILITY_UNSPECIFIED;
            private final int value;

            private static final /* synthetic */ Visibility[] $values() {
                return new Visibility[]{VISIBILITY_UNSPECIFIED, VISIBILITY_ALWAYS, VISIBILITY_HIDE_IF_ZERO, VISIBILITY_HIDDEN};
            }

            static {
                final Visibility visibility = new Visibility("VISIBILITY_UNSPECIFIED", 0, 0);
                VISIBILITY_UNSPECIFIED = visibility;
                VISIBILITY_ALWAYS = new Visibility("VISIBILITY_ALWAYS", 1, 1);
                VISIBILITY_HIDE_IF_ZERO = new Visibility("VISIBILITY_HIDE_IF_ZERO", 2, 2);
                VISIBILITY_HIDDEN = new Visibility("VISIBILITY_HIDDEN", 3, 3);
                Visibility[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Visibility.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, visibility) { // from class: com.squareup.protos.cash.local.client.v1.DynamicChargesBreakdown$RowCalculation$Visibility$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public DynamicChargesBreakdown.RowCalculation.Visibility fromValue(int value) {
                        return DynamicChargesBreakdown.RowCalculation.Visibility.INSTANCE.fromValue(value);
                    }
                };
            }

            private Visibility(String str, int i, int i2) {
                this.value = i2;
            }

            public static final Visibility fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static Visibility valueOf(String str) {
                return (Visibility) Enum.valueOf(Visibility.class, str);
            }

            public static Visibility[] values() {
                return (Visibility[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation$Visibility$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation$Visibility;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Visibility fromValue(int value) {
                    if (value == 0) {
                        return Visibility.VISIBILITY_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return Visibility.VISIBILITY_ALWAYS;
                    }
                    if (value == 2) {
                        return Visibility.VISIBILITY_HIDE_IF_ZERO;
                    }
                    if (value != 3) {
                        return null;
                    }
                    return Visibility.VISIBILITY_HIDDEN;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$RowCalculation;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ RowCalculation build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public RowCalculation() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RowCalculation(String str, Orientation orientation, LocalMoney localMoney, List<String> list, Visibility visibility, String str2, String str3, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.identifier = str;
            this.orientation = orientation;
            this.base_amount = localMoney;
            this.visibility = visibility;
            this.display_label = str2;
            this.display_value_zero = str3;
            this.bold_treatment = bool;
            this.dependencies = TransactorKt.immutableCopyOf("dependencies", list);
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DynamicChargesBreakdown.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.DynamicChargesBreakdown$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public DynamicChargesBreakdown decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
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
                        return new DynamicChargesBreakdown(m, (String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            m.add(DynamicChargesBreakdown.RowCalculation.ADAPTER.decode(reader));
                            break;
                        case 2:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 7:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DynamicChargesBreakdown value) {
                writer.getClass();
                value.getClass();
                DynamicChargesBreakdown.RowCalculation.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.rows);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 2, value.customer_tip_identifier);
                protoAdapter2.encodeWithTag(writer, 3, value.local_cash_identifier);
                protoAdapter2.encodeWithTag(writer, 4, value.total_without_discounts_identifier);
                protoAdapter2.encodeWithTag(writer, 5, value.grand_total_identifier);
                protoAdapter2.encodeWithTag(writer, 6, value.subtotal_identifier);
                protoAdapter2.encodeWithTag(writer, 7, value.total_before_tip_identifier);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DynamicChargesBreakdown value) {
                value.getClass();
                int encodedSizeWithTag = DynamicChargesBreakdown.RowCalculation.ADAPTER.asRepeated().encodedSizeWithTag(1, value.rows) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(7, value.total_before_tip_identifier) + protoAdapter2.encodedSizeWithTag(6, value.subtotal_identifier) + protoAdapter2.encodedSizeWithTag(5, value.grand_total_identifier) + protoAdapter2.encodedSizeWithTag(4, value.total_without_discounts_identifier) + protoAdapter2.encodedSizeWithTag(3, value.local_cash_identifier) + protoAdapter2.encodedSizeWithTag(2, value.customer_tip_identifier) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DynamicChargesBreakdown redact(DynamicChargesBreakdown value) {
                value.getClass();
                return DynamicChargesBreakdown.copy$default(value, TransactorKt.m1169redactElements(value.rows, DynamicChargesBreakdown.RowCalculation.ADAPTER), ByteString.EMPTY, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DynamicChargesBreakdown value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 7, value.total_before_tip_identifier);
                protoAdapter2.encodeWithTag(writer, 6, value.subtotal_identifier);
                protoAdapter2.encodeWithTag(writer, 5, value.grand_total_identifier);
                protoAdapter2.encodeWithTag(writer, 4, value.total_without_discounts_identifier);
                protoAdapter2.encodeWithTag(writer, 3, value.local_cash_identifier);
                protoAdapter2.encodeWithTag(writer, 2, value.customer_tip_identifier);
                DynamicChargesBreakdown.RowCalculation.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.rows);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicChargesBreakdown(List list, String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.customer_tip_identifier = str;
        this.local_cash_identifier = str2;
        this.total_without_discounts_identifier = str3;
        this.grand_total_identifier = str4;
        this.subtotal_identifier = str5;
        this.total_before_tip_identifier = str6;
        this.rows = TransactorKt.immutableCopyOf("rows", list);
    }

    public static DynamicChargesBreakdown copy$default(DynamicChargesBreakdown dynamicChargesBreakdown, ArrayList arrayList, ByteString byteString, int i) {
        String str = dynamicChargesBreakdown.customer_tip_identifier;
        String str2 = dynamicChargesBreakdown.local_cash_identifier;
        String str3 = dynamicChargesBreakdown.total_without_discounts_identifier;
        String str4 = dynamicChargesBreakdown.grand_total_identifier;
        String str5 = dynamicChargesBreakdown.subtotal_identifier;
        String str6 = dynamicChargesBreakdown.total_before_tip_identifier;
        if ((i & 128) != 0) {
            byteString = dynamicChargesBreakdown.unknownFields();
        }
        ByteString byteString2 = byteString;
        byteString2.getClass();
        return new DynamicChargesBreakdown(arrayList, str, str2, str3, str4, str5, str6, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DynamicChargesBreakdown)) {
            return false;
        }
        DynamicChargesBreakdown dynamicChargesBreakdown = (DynamicChargesBreakdown) obj;
        return Intrinsics.areEqual(unknownFields(), dynamicChargesBreakdown.unknownFields()) && Intrinsics.areEqual(this.rows, dynamicChargesBreakdown.rows) && Intrinsics.areEqual(this.customer_tip_identifier, dynamicChargesBreakdown.customer_tip_identifier) && Intrinsics.areEqual(this.local_cash_identifier, dynamicChargesBreakdown.local_cash_identifier) && Intrinsics.areEqual(this.total_without_discounts_identifier, dynamicChargesBreakdown.total_without_discounts_identifier) && Intrinsics.areEqual(this.grand_total_identifier, dynamicChargesBreakdown.grand_total_identifier) && Intrinsics.areEqual(this.subtotal_identifier, dynamicChargesBreakdown.subtotal_identifier) && Intrinsics.areEqual(this.total_before_tip_identifier, dynamicChargesBreakdown.total_before_tip_identifier);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.rows);
        String str = this.customer_tip_identifier;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.local_cash_identifier;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.total_without_discounts_identifier;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.grand_total_identifier;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.subtotal_identifier;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.total_before_tip_identifier;
        int hashCode6 = hashCode5 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.rows = this.rows;
        builder.customer_tip_identifier = this.customer_tip_identifier;
        builder.local_cash_identifier = this.local_cash_identifier;
        builder.total_without_discounts_identifier = this.total_without_discounts_identifier;
        builder.grand_total_identifier = this.grand_total_identifier;
        builder.subtotal_identifier = this.subtotal_identifier;
        builder.total_before_tip_identifier = this.total_before_tip_identifier;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.rows.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("rows=", arrayList, this.rows);
        }
        String str = this.customer_tip_identifier;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_tip_identifier=", arrayList);
        }
        String str2 = this.local_cash_identifier;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "local_cash_identifier=", arrayList);
        }
        String str3 = this.total_without_discounts_identifier;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "total_without_discounts_identifier=", arrayList);
        }
        String str4 = this.grand_total_identifier;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "grand_total_identifier=", arrayList);
        }
        String str5 = this.subtotal_identifier;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "subtotal_identifier=", arrayList);
        }
        String str6 = this.total_before_tip_identifier;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "total_before_tip_identifier=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DynamicChargesBreakdown{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ DynamicChargesBreakdown build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
