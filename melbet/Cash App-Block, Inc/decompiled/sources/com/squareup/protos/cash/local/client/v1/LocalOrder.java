package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalOrder;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 =2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\b>=?@ABCDR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u0012\u0004\b\u0010\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0005R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0005\u0012\u0004\b\u001b\u0010\rR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0005R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u0016\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0005R\u0016\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0005R\u0016\u0010/\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0005R\u0016\u00103\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000206058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000209058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u00108¨\u0006E"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$Builder;", "", "token", "Ljava/lang/String;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment;", "fulfillment", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart;", "cart", "Lcom/squareup/protos/cash/local/client/v1/LocalCart;", "getCart$annotations", "()V", "buyer_name", "local_brand_name", "getLocal_brand_name$annotations", "Lcom/squareup/protos/cash/local/client/v1/LocalLocationSummary;", "location_summary", "Lcom/squareup/protos/cash/local/client/v1/LocalLocationSummary;", "instructions", "receipt_url", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "total_amount", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "redeemed_local_bux_amount", "brand_token", "getBrand_token$annotations", "local_cash_earnings_label", "subtotal_amount", "tax_amount", "tip_amount", "", "paid_at", "Ljava/lang/Long;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderStatus;", "order_status", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderStatus;", "receipt_client_route", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LoyaltySummary;", "loyalty_summary", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LoyaltySummary;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LocalOrderBrand;", "local_order_brand", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LocalOrderBrand;", "notes", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown;", "charges_breakdown", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown;", "order_ticket_number", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo;", "open_tab_info", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo;", "", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine;", "order_summary", "Ljava/util/List;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$PaymentSummary;", "payment_summary", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$AdjustmentLine;", "adjustment_lines", "Companion", "Builder", "OrderSummaryLine", "PaymentSummary", "OrderStatus", "AdjustmentLine", "LoyaltySummary", "LocalOrderBrand", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LocalOrder extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalOrder> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalOrder$AdjustmentLine#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 20, tag = 22)
    public final List<AdjustmentLine> adjustment_lines;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 11, tag = 12)
    public final String brand_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 3, tag = 4)
    public final String buyer_name;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalCart#ADAPTER", schemaIndex = 2, tag = 3)
    public final LocalCart cart;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.DynamicChargesBreakdown#ADAPTER", schemaIndex = 24, tag = 26)
    public final DynamicChargesBreakdown charges_breakdown;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalFulfillment#ADAPTER", schemaIndex = 1, tag = 2)
    public final LocalFulfillment fulfillment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    public final String instructions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String local_brand_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 12, tag = 13)
    public final String local_cash_earnings_label;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalOrder$LocalOrderBrand#ADAPTER", schemaIndex = 22, tag = 24)
    public final LocalOrderBrand local_order_brand;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalLocationSummary#ADAPTER", schemaIndex = 5, tag = 6)
    public final LocalLocationSummary location_summary;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalOrder$LoyaltySummary#ADAPTER", schemaIndex = 21, tag = 23)
    public final LoyaltySummary loyalty_summary;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 23, tag = 25)
    public final String notes;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalCart$OpenTabInfo#ADAPTER", schemaIndex = 26, tag = 28)
    public final LocalCart.OpenTabInfo open_tab_info;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalOrder$OrderStatus#ADAPTER", schemaIndex = 18, tag = 20)
    public final OrderStatus order_status;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalOrder$OrderSummaryLine#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    public final List<OrderSummaryLine> order_summary;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 25, tag = 27)
    public final String order_ticket_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 17, tag = 19)
    public final Long paid_at;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalOrder$PaymentSummary#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 16, tag = 18)
    public final List<PaymentSummary> payment_summary;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 19, tag = 21)
    public final String receipt_client_route;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
    public final String receipt_url;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalMoney#ADAPTER", schemaIndex = 10, tag = 11)
    public final LocalMoney redeemed_local_bux_amount;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalMoney#ADAPTER", schemaIndex = 13, tag = 14)
    public final LocalMoney subtotal_amount;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalMoney#ADAPTER", schemaIndex = 14, tag = 15)
    public final LocalMoney tax_amount;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalMoney#ADAPTER", schemaIndex = 15, tag = 16)
    public final LocalMoney tip_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String token;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalMoney#ADAPTER", schemaIndex = 9, tag = 10)
    public final LocalMoney total_amount;

    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0012\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u0012\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015J\u0014\u0010\u001c\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0010J\u0015\u0010\u001e\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0002\u00100J\u0010\u0010!\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\"J\u0010\u0010#\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0006J\u0014\u0010$\u001a\u00020\u00002\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0010J\u0010\u0010&\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010'J\u0010\u0010(\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010)J\u0010\u0010*\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010\u0006J\u0010\u0010+\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010,J\u0010\u0010-\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010\u0006J\u0010\u0010.\u001a\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010/J\b\u00101\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010 R\u0014\u0010!\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder;", "<init>", "()V", "token", "", "fulfillment", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment;", "cart", "Lcom/squareup/protos/cash/local/client/v1/LocalCart;", "buyer_name", "local_brand_name", "location_summary", "Lcom/squareup/protos/cash/local/client/v1/LocalLocationSummary;", "order_summary", "", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine;", "instructions", "receipt_url", "total_amount", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "redeemed_local_bux_amount", "brand_token", "local_cash_earnings_label", "subtotal_amount", "tax_amount", "tip_amount", "payment_summary", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$PaymentSummary;", "paid_at", "", "Ljava/lang/Long;", "order_status", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderStatus;", "receipt_client_route", "adjustment_lines", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$AdjustmentLine;", "loyalty_summary", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LoyaltySummary;", "local_order_brand", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LocalOrderBrand;", "notes", "charges_breakdown", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown;", "order_ticket_number", "open_tab_info", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/local/client/v1/LocalOrder$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<AdjustmentLine> adjustment_lines;
        public String brand_token;
        public String buyer_name;
        public LocalCart cart;
        public DynamicChargesBreakdown charges_breakdown;
        public LocalFulfillment fulfillment;
        public String instructions;
        public String local_brand_name;
        public String local_cash_earnings_label;
        public LocalOrderBrand local_order_brand;
        public LocalLocationSummary location_summary;
        public LoyaltySummary loyalty_summary;
        public String notes;
        public LocalCart.OpenTabInfo open_tab_info;
        public OrderStatus order_status;
        public List<OrderSummaryLine> order_summary;
        public String order_ticket_number;
        public Long paid_at;
        public List<PaymentSummary> payment_summary;
        public String receipt_client_route;
        public String receipt_url;
        public LocalMoney redeemed_local_bux_amount;
        public LocalMoney subtotal_amount;
        public LocalMoney tax_amount;
        public LocalMoney tip_amount;
        public String token;
        public LocalMoney total_amount;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.order_summary = emptyList;
            this.payment_summary = emptyList;
            this.adjustment_lines = emptyList;
        }

        public final Builder adjustment_lines(List<AdjustmentLine> adjustment_lines) {
            adjustment_lines.getClass();
            TransactorKt.checkElementsNotNull(adjustment_lines);
            this.adjustment_lines = adjustment_lines;
            return this;
        }

        @Deprecated
        public final Builder brand_token(String brand_token) {
            this.brand_token = brand_token;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public LocalOrder build() {
            return new LocalOrder(this.token, this.fulfillment, this.cart, this.buyer_name, this.local_brand_name, this.location_summary, this.order_summary, this.instructions, this.receipt_url, this.total_amount, this.redeemed_local_bux_amount, this.brand_token, this.local_cash_earnings_label, this.subtotal_amount, this.tax_amount, this.tip_amount, this.payment_summary, this.paid_at, this.order_status, this.receipt_client_route, this.adjustment_lines, this.loyalty_summary, this.local_order_brand, this.notes, this.charges_breakdown, this.order_ticket_number, this.open_tab_info, buildUnknownFields());
        }

        public final Builder buyer_name(String buyer_name) {
            this.buyer_name = buyer_name;
            return this;
        }

        @Deprecated
        public final Builder cart(LocalCart cart) {
            this.cart = cart;
            return this;
        }

        public final Builder charges_breakdown(DynamicChargesBreakdown charges_breakdown) {
            this.charges_breakdown = charges_breakdown;
            return this;
        }

        public final Builder fulfillment(LocalFulfillment fulfillment) {
            this.fulfillment = fulfillment;
            return this;
        }

        public final Builder instructions(String instructions) {
            this.instructions = instructions;
            return this;
        }

        @Deprecated
        public final Builder local_brand_name(String local_brand_name) {
            this.local_brand_name = local_brand_name;
            return this;
        }

        public final Builder local_cash_earnings_label(String local_cash_earnings_label) {
            this.local_cash_earnings_label = local_cash_earnings_label;
            return this;
        }

        public final Builder local_order_brand(LocalOrderBrand local_order_brand) {
            this.local_order_brand = local_order_brand;
            return this;
        }

        public final Builder location_summary(LocalLocationSummary location_summary) {
            this.location_summary = location_summary;
            return this;
        }

        public final Builder loyalty_summary(LoyaltySummary loyalty_summary) {
            this.loyalty_summary = loyalty_summary;
            return this;
        }

        public final Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        public final Builder open_tab_info(LocalCart.OpenTabInfo open_tab_info) {
            this.open_tab_info = open_tab_info;
            return this;
        }

        public final Builder order_status(OrderStatus order_status) {
            this.order_status = order_status;
            return this;
        }

        public final Builder order_summary(List<OrderSummaryLine> order_summary) {
            order_summary.getClass();
            TransactorKt.checkElementsNotNull(order_summary);
            this.order_summary = order_summary;
            return this;
        }

        public final Builder order_ticket_number(String order_ticket_number) {
            this.order_ticket_number = order_ticket_number;
            return this;
        }

        public final Builder paid_at(Long paid_at) {
            this.paid_at = paid_at;
            return this;
        }

        public final Builder payment_summary(List<PaymentSummary> payment_summary) {
            payment_summary.getClass();
            TransactorKt.checkElementsNotNull(payment_summary);
            this.payment_summary = payment_summary;
            return this;
        }

        public final Builder receipt_client_route(String receipt_client_route) {
            this.receipt_client_route = receipt_client_route;
            return this;
        }

        public final Builder receipt_url(String receipt_url) {
            this.receipt_url = receipt_url;
            return this;
        }

        public final Builder redeemed_local_bux_amount(LocalMoney redeemed_local_bux_amount) {
            this.redeemed_local_bux_amount = redeemed_local_bux_amount;
            return this;
        }

        public final Builder subtotal_amount(LocalMoney subtotal_amount) {
            this.subtotal_amount = subtotal_amount;
            return this;
        }

        public final Builder tax_amount(LocalMoney tax_amount) {
            this.tax_amount = tax_amount;
            return this;
        }

        public final Builder tip_amount(LocalMoney tip_amount) {
            this.tip_amount = tip_amount;
            return this;
        }

        public final Builder token(String token) {
            this.token = token;
            return this;
        }

        public final Builder total_amount(LocalMoney total_amount) {
            this.total_amount = total_amount;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005#$%&'B\u0099\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0082\u0004J\n\u0010\u001f\u001a\u00020\u0006H\u0096\u0080\u0004J\b\u0010 \u001a\u00020\u0004H\u0016J\u009d\u0001\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\"R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0019R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$Builder;", "item_name", "", "quantity", "", "price", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "modifiers", "", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineModifier;", "variation_name", "text_modifiers", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineTextModifier;", "item_image", "Lcom/squareup/protos/cash/local/client/v1/LocalImage;", "combo_slots", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineComboSlot;", "discount_amount", "discount_texts", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/squareup/protos/cash/local/client/v1/LocalMoney;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/squareup/protos/cash/local/client/v1/LocalImage;Ljava/util/List;Lcom/squareup/protos/cash/local/client/v1/LocalMoney;Ljava/util/List;Lokio/ByteString;)V", "Ljava/lang/Integer;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/squareup/protos/cash/local/client/v1/LocalMoney;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/squareup/protos/cash/local/client/v1/LocalImage;Ljava/util/List;Lcom/squareup/protos/cash/local/client/v1/LocalMoney;Ljava/util/List;Lokio/ByteString;)Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine;", "Builder", "Companion", "OrderSummaryLineComboSlot", "OrderSummaryLineModifier", "OrderSummaryLineTextModifier", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OrderSummaryLine extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OrderSummaryLine> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalOrder$OrderSummaryLine$OrderSummaryLineComboSlot#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
        public final List<OrderSummaryLineComboSlot> combo_slots;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalMoney#ADAPTER", schemaIndex = 8, tag = 9)
        public final LocalMoney discount_amount;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 9, tag = 10)
        public final List<String> discount_texts;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalImage#ADAPTER", schemaIndex = 6, tag = 7)
        public final LocalImage item_image;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String item_name;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalOrder$OrderSummaryLine$OrderSummaryLineModifier#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
        public final List<OrderSummaryLineModifier> modifiers;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalMoney#ADAPTER", schemaIndex = 2, tag = 3)
        public final LocalMoney price;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
        public final Integer quantity;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalOrder$OrderSummaryLine$OrderSummaryLineTextModifier#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
        public final List<OrderSummaryLineTextModifier> text_modifiers;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
        public final String variation_name;

        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0018J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0014\u0010\f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0010\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\rJ\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0014\u0010\u0014\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\rJ\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bJ\u0014\u0010\u0017\u001a\u00020\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\rJ\b\u0010\u0019\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine;", "<init>", "()V", "item_name", "", "quantity", "", "Ljava/lang/Integer;", "price", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "modifiers", "", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineModifier;", "variation_name", "text_modifiers", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineTextModifier;", "item_image", "Lcom/squareup/protos/cash/local/client/v1/LocalImage;", "combo_slots", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineComboSlot;", "discount_amount", "discount_texts", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<OrderSummaryLineComboSlot> combo_slots;
            public LocalMoney discount_amount;
            public List<String> discount_texts;
            public LocalImage item_image;
            public String item_name;
            public List<OrderSummaryLineModifier> modifiers;
            public LocalMoney price;
            public Integer quantity;
            public List<OrderSummaryLineTextModifier> text_modifiers;
            public String variation_name;

            public Builder() {
                EmptyList emptyList = EmptyList.INSTANCE;
                this.modifiers = emptyList;
                this.text_modifiers = emptyList;
                this.combo_slots = emptyList;
                this.discount_texts = emptyList;
            }

            @Override // com.squareup.wire.Message.Builder
            public OrderSummaryLine build() {
                return new OrderSummaryLine(this.item_name, this.quantity, this.price, this.modifiers, this.variation_name, this.text_modifiers, this.item_image, this.combo_slots, this.discount_amount, this.discount_texts, buildUnknownFields());
            }

            public final Builder combo_slots(List<OrderSummaryLineComboSlot> combo_slots) {
                combo_slots.getClass();
                TransactorKt.checkElementsNotNull(combo_slots);
                this.combo_slots = combo_slots;
                return this;
            }

            public final Builder discount_amount(LocalMoney discount_amount) {
                this.discount_amount = discount_amount;
                return this;
            }

            public final Builder discount_texts(List<String> discount_texts) {
                discount_texts.getClass();
                TransactorKt.checkElementsNotNull(discount_texts);
                this.discount_texts = discount_texts;
                return this;
            }

            public final Builder item_image(LocalImage item_image) {
                this.item_image = item_image;
                return this;
            }

            public final Builder item_name(String item_name) {
                this.item_name = item_name;
                return this;
            }

            public final Builder modifiers(List<OrderSummaryLineModifier> modifiers) {
                modifiers.getClass();
                TransactorKt.checkElementsNotNull(modifiers);
                this.modifiers = modifiers;
                return this;
            }

            public final Builder price(LocalMoney price) {
                this.price = price;
                return this;
            }

            public final Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            public final Builder text_modifiers(List<OrderSummaryLineTextModifier> text_modifiers) {
                text_modifiers.getClass();
                TransactorKt.checkElementsNotNull(text_modifiers);
                this.text_modifiers = text_modifiers;
                return this;
            }

            public final Builder variation_name(String variation_name) {
                this.variation_name = variation_name;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OrderSummaryLine.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalOrder$OrderSummaryLine$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public LocalOrder.OrderSummaryLine decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
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
                            return new LocalOrder.OrderSummaryLine((String) obj, (Integer) obj2, (LocalMoney) obj3, m, (String) obj4, arrayList, (LocalImage) obj5, arrayList2, (LocalMoney) obj6, arrayList3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                obj2 = ProtoAdapter.INT32.decode(reader);
                                break;
                            case 3:
                                obj3 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, reader, obj3);
                                break;
                            case 4:
                                m.add(LocalOrder.OrderSummaryLine.OrderSummaryLineModifier.ADAPTER.decode(reader));
                                break;
                            case 5:
                                obj4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                arrayList.add(LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier.ADAPTER.decode(reader));
                                break;
                            case 7:
                                obj5 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, reader, obj5);
                                break;
                            case 8:
                                arrayList2.add(LocalOrder.OrderSummaryLine.OrderSummaryLineComboSlot.ADAPTER.decode(reader));
                                break;
                            case 9:
                                obj6 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, reader, obj6);
                                break;
                            case 10:
                                arrayList3.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LocalOrder.OrderSummaryLine value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.item_name);
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, value.quantity);
                    ProtoAdapter protoAdapter3 = LocalMoney.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 3, value.price);
                    LocalOrder.OrderSummaryLine.OrderSummaryLineModifier.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.modifiers);
                    protoAdapter2.encodeWithTag(writer, 5, value.variation_name);
                    LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.text_modifiers);
                    LocalImage.ADAPTER.encodeWithTag(writer, 7, value.item_image);
                    LocalOrder.OrderSummaryLine.OrderSummaryLineComboSlot.ADAPTER.asRepeated().encodeWithTag(writer, 8, value.combo_slots);
                    protoAdapter3.encodeWithTag(writer, 9, value.discount_amount);
                    protoAdapter2.asRepeated().encodeWithTag(writer, 10, value.discount_texts);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LocalOrder.OrderSummaryLine value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, value.quantity) + protoAdapter2.encodedSizeWithTag(1, value.item_name) + size$okio;
                    ProtoAdapter protoAdapter3 = LocalMoney.ADAPTER;
                    return protoAdapter2.asRepeated().encodedSizeWithTag(10, value.discount_texts) + protoAdapter3.encodedSizeWithTag(9, value.discount_amount) + LocalOrder.OrderSummaryLine.OrderSummaryLineComboSlot.ADAPTER.asRepeated().encodedSizeWithTag(8, value.combo_slots) + LocalImage.ADAPTER.encodedSizeWithTag(7, value.item_image) + LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier.ADAPTER.asRepeated().encodedSizeWithTag(6, value.text_modifiers) + protoAdapter2.encodedSizeWithTag(5, value.variation_name) + LocalOrder.OrderSummaryLine.OrderSummaryLineModifier.ADAPTER.asRepeated().encodedSizeWithTag(4, value.modifiers) + protoAdapter3.encodedSizeWithTag(3, value.price) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LocalOrder.OrderSummaryLine redact(LocalOrder.OrderSummaryLine value) {
                    value.getClass();
                    LocalMoney localMoney = value.price;
                    LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
                    ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.modifiers, LocalOrder.OrderSummaryLine.OrderSummaryLineModifier.ADAPTER);
                    ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(value.text_modifiers, LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier.ADAPTER);
                    LocalImage localImage = value.item_image;
                    LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
                    ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(value.combo_slots, LocalOrder.OrderSummaryLine.OrderSummaryLineComboSlot.ADAPTER);
                    LocalMoney localMoney3 = value.discount_amount;
                    return LocalOrder.OrderSummaryLine.copy$default(value, null, null, localMoney2, m1169redactElements, null, m1169redactElements2, localImage2, m1169redactElements3, localMoney3 != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney3) : null, null, ByteString.EMPTY, 531, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LocalOrder.OrderSummaryLine value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.asRepeated().encodeWithTag(writer, 10, value.discount_texts);
                    ProtoAdapter protoAdapter3 = LocalMoney.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 9, value.discount_amount);
                    LocalOrder.OrderSummaryLine.OrderSummaryLineComboSlot.ADAPTER.asRepeated().encodeWithTag(writer, 8, value.combo_slots);
                    LocalImage.ADAPTER.encodeWithTag(writer, 7, value.item_image);
                    LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.text_modifiers);
                    protoAdapter2.encodeWithTag(writer, 5, value.variation_name);
                    LocalOrder.OrderSummaryLine.OrderSummaryLineModifier.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.modifiers);
                    protoAdapter3.encodeWithTag(writer, 3, value.price);
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, value.quantity);
                    protoAdapter2.encodeWithTag(writer, 1, value.item_name);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public OrderSummaryLine(String str, Integer num, LocalMoney localMoney, List list, String str2, List list2, LocalImage localImage, List list3, LocalMoney localMoney2, List list4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : localMoney, (i & 8) != 0 ? EmptyList.INSTANCE : list, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? EmptyList.INSTANCE : list2, (i & 64) != 0 ? null : localImage, (i & 128) != 0 ? EmptyList.INSTANCE : list3, (i & 256) != 0 ? null : localMoney2, (i & 512) != 0 ? EmptyList.INSTANCE : list4, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ OrderSummaryLine copy$default(OrderSummaryLine orderSummaryLine, String str, Integer num, LocalMoney localMoney, List list, String str2, List list2, LocalImage localImage, List list3, LocalMoney localMoney2, List list4, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = orderSummaryLine.item_name;
            }
            if ((i & 2) != 0) {
                num = orderSummaryLine.quantity;
            }
            if ((i & 4) != 0) {
                localMoney = orderSummaryLine.price;
            }
            if ((i & 8) != 0) {
                list = orderSummaryLine.modifiers;
            }
            if ((i & 16) != 0) {
                str2 = orderSummaryLine.variation_name;
            }
            if ((i & 32) != 0) {
                list2 = orderSummaryLine.text_modifiers;
            }
            if ((i & 64) != 0) {
                localImage = orderSummaryLine.item_image;
            }
            if ((i & 128) != 0) {
                list3 = orderSummaryLine.combo_slots;
            }
            if ((i & 256) != 0) {
                localMoney2 = orderSummaryLine.discount_amount;
            }
            if ((i & 512) != 0) {
                list4 = orderSummaryLine.discount_texts;
            }
            if ((i & 1024) != 0) {
                byteString = orderSummaryLine.unknownFields();
            }
            List list5 = list4;
            ByteString byteString2 = byteString;
            List list6 = list3;
            LocalMoney localMoney3 = localMoney2;
            List list7 = list2;
            LocalImage localImage2 = localImage;
            String str3 = str2;
            LocalMoney localMoney4 = localMoney;
            return orderSummaryLine.copy(str, num, localMoney4, list, str3, list7, localImage2, list6, localMoney3, list5, byteString2);
        }

        public final OrderSummaryLine copy(String item_name, Integer quantity, LocalMoney price, List<OrderSummaryLineModifier> modifiers, String variation_name, List<OrderSummaryLineTextModifier> text_modifiers, LocalImage item_image, List<OrderSummaryLineComboSlot> combo_slots, LocalMoney discount_amount, List<String> discount_texts, ByteString unknownFields) {
            modifiers.getClass();
            text_modifiers.getClass();
            combo_slots.getClass();
            discount_texts.getClass();
            unknownFields.getClass();
            return new OrderSummaryLine(item_name, quantity, price, modifiers, variation_name, text_modifiers, item_image, combo_slots, discount_amount, discount_texts, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof OrderSummaryLine)) {
                return false;
            }
            OrderSummaryLine orderSummaryLine = (OrderSummaryLine) other;
            return Intrinsics.areEqual(unknownFields(), orderSummaryLine.unknownFields()) && Intrinsics.areEqual(this.item_name, orderSummaryLine.item_name) && Intrinsics.areEqual(this.quantity, orderSummaryLine.quantity) && Intrinsics.areEqual(this.price, orderSummaryLine.price) && Intrinsics.areEqual(this.modifiers, orderSummaryLine.modifiers) && Intrinsics.areEqual(this.variation_name, orderSummaryLine.variation_name) && Intrinsics.areEqual(this.text_modifiers, orderSummaryLine.text_modifiers) && Intrinsics.areEqual(this.item_image, orderSummaryLine.item_image) && Intrinsics.areEqual(this.combo_slots, orderSummaryLine.combo_slots) && Intrinsics.areEqual(this.discount_amount, orderSummaryLine.discount_amount) && Intrinsics.areEqual(this.discount_texts, orderSummaryLine.discount_texts);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.item_name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Integer num = this.quantity;
            int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            LocalMoney localMoney = this.price;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (localMoney != null ? localMoney.hashCode() : 0)) * 37, 37, this.modifiers);
            String str2 = this.variation_name;
            int m2 = Recorder$$ExternalSyntheticOutline2.m((m + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.text_modifiers);
            LocalImage localImage = this.item_image;
            int m3 = Recorder$$ExternalSyntheticOutline2.m((m2 + (localImage != null ? localImage.hashCode() : 0)) * 37, 37, this.combo_slots);
            LocalMoney localMoney2 = this.discount_amount;
            int hashCode4 = this.discount_texts.hashCode() + ((m3 + (localMoney2 != null ? localMoney2.hashCode() : 0)) * 37);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.item_name = this.item_name;
            builder.quantity = this.quantity;
            builder.price = this.price;
            builder.modifiers = this.modifiers;
            builder.variation_name = this.variation_name;
            builder.text_modifiers = this.text_modifiers;
            builder.item_image = this.item_image;
            builder.combo_slots = this.combo_slots;
            builder.discount_amount = this.discount_amount;
            builder.discount_texts = this.discount_texts;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.item_name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "item_name=", arrayList);
            }
            Integer num = this.quantity;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("quantity=", num, arrayList);
            }
            LocalMoney localMoney = this.price;
            if (localMoney != null) {
                SizeMode$EnumUnboxingLocalUtility.m("price=", localMoney, arrayList);
            }
            if (!this.modifiers.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("modifiers=", arrayList, this.modifiers);
            }
            String str2 = this.variation_name;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "variation_name=", arrayList);
            }
            if (!this.text_modifiers.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("text_modifiers=", arrayList, this.text_modifiers);
            }
            LocalImage localImage = this.item_image;
            if (localImage != null) {
                SizeMode$EnumUnboxingLocalUtility.m("item_image=", localImage, arrayList);
            }
            if (!this.combo_slots.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("combo_slots=", arrayList, this.combo_slots);
            }
            LocalMoney localMoney2 = this.discount_amount;
            if (localMoney2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("discount_amount=", localMoney2, arrayList);
            }
            if (!this.discount_texts.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("discount_texts=", arrayList, this.discount_texts);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OrderSummaryLine{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aBU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\b\u0010\u0017\u001a\u00020\u0004H\u0016JT\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineComboSlot;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineComboSlot$Builder;", "slot_name", "", "item_name", "variation_name", "modifiers", "", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineModifier;", "text_modifiers", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineTextModifier;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class OrderSummaryLineComboSlot extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<OrderSummaryLineComboSlot> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String item_name;

            @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalOrder$OrderSummaryLine$OrderSummaryLineModifier#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
            public final List<OrderSummaryLineModifier> modifiers;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String slot_name;

            @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalOrder$OrderSummaryLine$OrderSummaryLineTextModifier#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
            public final List<OrderSummaryLineTextModifier> text_modifiers;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
            public final String variation_name;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineComboSlot$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineComboSlot;", "<init>", "()V", "slot_name", "", "item_name", "variation_name", "modifiers", "", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineModifier;", "text_modifiers", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineTextModifier;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String item_name;
                public List<OrderSummaryLineModifier> modifiers;
                public String slot_name;
                public List<OrderSummaryLineTextModifier> text_modifiers;
                public String variation_name;

                public Builder() {
                    EmptyList emptyList = EmptyList.INSTANCE;
                    this.modifiers = emptyList;
                    this.text_modifiers = emptyList;
                }

                @Override // com.squareup.wire.Message.Builder
                public OrderSummaryLineComboSlot build() {
                    return new OrderSummaryLineComboSlot(this.slot_name, this.item_name, this.variation_name, this.modifiers, this.text_modifiers, buildUnknownFields());
                }

                public final Builder item_name(String item_name) {
                    this.item_name = item_name;
                    return this;
                }

                public final Builder modifiers(List<OrderSummaryLineModifier> modifiers) {
                    modifiers.getClass();
                    TransactorKt.checkElementsNotNull(modifiers);
                    this.modifiers = modifiers;
                    return this;
                }

                public final Builder slot_name(String slot_name) {
                    this.slot_name = slot_name;
                    return this;
                }

                public final Builder text_modifiers(List<OrderSummaryLineTextModifier> text_modifiers) {
                    text_modifiers.getClass();
                    TransactorKt.checkElementsNotNull(text_modifiers);
                    this.text_modifiers = text_modifiers;
                    return this;
                }

                public final Builder variation_name(String variation_name) {
                    this.variation_name = variation_name;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OrderSummaryLineComboSlot.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalOrder$OrderSummaryLine$OrderSummaryLineComboSlot$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public LocalOrder.OrderSummaryLine.OrderSummaryLineComboSlot decode(ProtoReader reader) {
                        ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                        ArrayList arrayList = new ArrayList();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new LocalOrder.OrderSummaryLine.OrderSummaryLineComboSlot((String) obj, (String) obj2, (String) obj3, m, arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 2) {
                                obj2 = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 3) {
                                obj3 = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 4) {
                                m.add(LocalOrder.OrderSummaryLine.OrderSummaryLineModifier.ADAPTER.decode(reader));
                            } else if (nextTag != 5) {
                                reader.readUnknownField(nextTag);
                            } else {
                                arrayList.add(LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier.ADAPTER.decode(reader));
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, LocalOrder.OrderSummaryLine.OrderSummaryLineComboSlot value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.slot_name);
                        protoAdapter2.encodeWithTag(writer, 2, value.item_name);
                        protoAdapter2.encodeWithTag(writer, 3, value.variation_name);
                        LocalOrder.OrderSummaryLine.OrderSummaryLineModifier.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.modifiers);
                        LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.text_modifiers);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(LocalOrder.OrderSummaryLine.OrderSummaryLineComboSlot value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier.ADAPTER.asRepeated().encodedSizeWithTag(5, value.text_modifiers) + LocalOrder.OrderSummaryLine.OrderSummaryLineModifier.ADAPTER.asRepeated().encodedSizeWithTag(4, value.modifiers) + protoAdapter2.encodedSizeWithTag(3, value.variation_name) + protoAdapter2.encodedSizeWithTag(2, value.item_name) + protoAdapter2.encodedSizeWithTag(1, value.slot_name) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public LocalOrder.OrderSummaryLine.OrderSummaryLineComboSlot redact(LocalOrder.OrderSummaryLine.OrderSummaryLineComboSlot value) {
                        value.getClass();
                        return LocalOrder.OrderSummaryLine.OrderSummaryLineComboSlot.copy$default(value, null, null, null, TransactorKt.m1169redactElements(value.modifiers, LocalOrder.OrderSummaryLine.OrderSummaryLineModifier.ADAPTER), TransactorKt.m1169redactElements(value.text_modifiers, LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier.ADAPTER), ByteString.EMPTY, 7, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, LocalOrder.OrderSummaryLine.OrderSummaryLineComboSlot value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.text_modifiers);
                        LocalOrder.OrderSummaryLine.OrderSummaryLineModifier.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.modifiers);
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 3, value.variation_name);
                        protoAdapter2.encodeWithTag(writer, 2, value.item_name);
                        protoAdapter2.encodeWithTag(writer, 1, value.slot_name);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public OrderSummaryLineComboSlot(String str, String str2, String str3, List list, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? EmptyList.INSTANCE : list, (i & 16) != 0 ? EmptyList.INSTANCE : list2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ OrderSummaryLineComboSlot copy$default(OrderSummaryLineComboSlot orderSummaryLineComboSlot, String str, String str2, String str3, List list, List list2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = orderSummaryLineComboSlot.slot_name;
                }
                if ((i & 2) != 0) {
                    str2 = orderSummaryLineComboSlot.item_name;
                }
                if ((i & 4) != 0) {
                    str3 = orderSummaryLineComboSlot.variation_name;
                }
                if ((i & 8) != 0) {
                    list = orderSummaryLineComboSlot.modifiers;
                }
                if ((i & 16) != 0) {
                    list2 = orderSummaryLineComboSlot.text_modifiers;
                }
                if ((i & 32) != 0) {
                    byteString = orderSummaryLineComboSlot.unknownFields();
                }
                List list3 = list2;
                ByteString byteString2 = byteString;
                return orderSummaryLineComboSlot.copy(str, str2, str3, list, list3, byteString2);
            }

            public final OrderSummaryLineComboSlot copy(String slot_name, String item_name, String variation_name, List<OrderSummaryLineModifier> modifiers, List<OrderSummaryLineTextModifier> text_modifiers, ByteString unknownFields) {
                modifiers.getClass();
                text_modifiers.getClass();
                unknownFields.getClass();
                return new OrderSummaryLineComboSlot(slot_name, item_name, variation_name, modifiers, text_modifiers, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof OrderSummaryLineComboSlot)) {
                    return false;
                }
                OrderSummaryLineComboSlot orderSummaryLineComboSlot = (OrderSummaryLineComboSlot) other;
                return Intrinsics.areEqual(unknownFields(), orderSummaryLineComboSlot.unknownFields()) && Intrinsics.areEqual(this.slot_name, orderSummaryLineComboSlot.slot_name) && Intrinsics.areEqual(this.item_name, orderSummaryLineComboSlot.item_name) && Intrinsics.areEqual(this.variation_name, orderSummaryLineComboSlot.variation_name) && Intrinsics.areEqual(this.modifiers, orderSummaryLineComboSlot.modifiers) && Intrinsics.areEqual(this.text_modifiers, orderSummaryLineComboSlot.text_modifiers);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.slot_name;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.item_name;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.variation_name;
                int hashCode4 = this.text_modifiers.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.modifiers);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.slot_name = this.slot_name;
                builder.item_name = this.item_name;
                builder.variation_name = this.variation_name;
                builder.modifiers = this.modifiers;
                builder.text_modifiers = this.text_modifiers;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.slot_name;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "slot_name=", arrayList);
                }
                String str2 = this.item_name;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "item_name=", arrayList);
                }
                String str3 = this.variation_name;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "variation_name=", arrayList);
                }
                if (!this.modifiers.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("modifiers=", arrayList, this.modifiers);
                }
                if (!this.text_modifiers.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("text_modifiers=", arrayList, this.text_modifiers);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "OrderSummaryLineComboSlot{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineComboSlot$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineComboSlot$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineComboSlot;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineComboSlot;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ OrderSummaryLineComboSlot build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OrderSummaryLineComboSlot(String str, String str2, String str3, List<OrderSummaryLineModifier> list, List<OrderSummaryLineTextModifier> list2, ByteString byteString) {
                super(ADAPTER, byteString);
                BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
                this.slot_name = str;
                this.item_name = str2;
                this.variation_name = str3;
                this.modifiers = TransactorKt.immutableCopyOf("modifiers", list);
                this.text_modifiers = TransactorKt.immutableCopyOf("text_modifiers", list2);
            }

            public OrderSummaryLineComboSlot() {
                this(null, null, null, null, null, null, 63, null);
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0006H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\u0004H\u0016JE\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u0017R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineModifier;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineModifier$Builder;", "modifier_name", "", "quantity", "", "total_price", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "parent_modifier_name", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/squareup/protos/cash/local/client/v1/LocalMoney;Ljava/lang/String;Lokio/ByteString;)V", "Ljava/lang/Integer;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/squareup/protos/cash/local/client/v1/LocalMoney;Ljava/lang/String;Lokio/ByteString;)Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineModifier;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class OrderSummaryLineModifier extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<OrderSummaryLineModifier> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String modifier_name;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
            public final String parent_modifier_name;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
            public final Integer quantity;

            @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalMoney#ADAPTER", schemaIndex = 2, tag = 3)
            public final LocalMoney total_price;

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\rJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineModifier$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineModifier;", "<init>", "()V", "modifier_name", "", "quantity", "", "Ljava/lang/Integer;", "total_price", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "parent_modifier_name", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineModifier$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String modifier_name;
                public String parent_modifier_name;
                public Integer quantity;
                public LocalMoney total_price;

                @Override // com.squareup.wire.Message.Builder
                public OrderSummaryLineModifier build() {
                    return new OrderSummaryLineModifier(this.modifier_name, this.quantity, this.total_price, this.parent_modifier_name, buildUnknownFields());
                }

                public final Builder modifier_name(String modifier_name) {
                    this.modifier_name = modifier_name;
                    return this;
                }

                public final Builder parent_modifier_name(String parent_modifier_name) {
                    this.parent_modifier_name = parent_modifier_name;
                    return this;
                }

                public final Builder quantity(Integer quantity) {
                    this.quantity = quantity;
                    return this;
                }

                public final Builder total_price(LocalMoney total_price) {
                    this.total_price = total_price;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OrderSummaryLineModifier.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalOrder$OrderSummaryLine$OrderSummaryLineModifier$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public LocalOrder.OrderSummaryLine.OrderSummaryLineModifier decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        Object obj4 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new LocalOrder.OrderSummaryLine.OrderSummaryLineModifier((String) obj, (Integer) obj2, (LocalMoney) obj3, (String) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 2) {
                                obj2 = ProtoAdapter.INT32.decode(reader);
                            } else if (nextTag == 3) {
                                obj3 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, reader, obj3);
                            } else if (nextTag != 4) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj4 = ProtoAdapter.STRING.decode(reader);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, LocalOrder.OrderSummaryLine.OrderSummaryLineModifier value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.modifier_name);
                        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.quantity);
                        LocalMoney.ADAPTER.encodeWithTag(writer, 3, value.total_price);
                        protoAdapter2.encodeWithTag(writer, 4, value.parent_modifier_name);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(LocalOrder.OrderSummaryLine.OrderSummaryLineModifier value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return protoAdapter2.encodedSizeWithTag(4, value.parent_modifier_name) + LocalMoney.ADAPTER.encodedSizeWithTag(3, value.total_price) + ProtoAdapter.INT32.encodedSizeWithTag(2, value.quantity) + protoAdapter2.encodedSizeWithTag(1, value.modifier_name) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public LocalOrder.OrderSummaryLine.OrderSummaryLineModifier redact(LocalOrder.OrderSummaryLine.OrderSummaryLineModifier value) {
                        value.getClass();
                        LocalMoney localMoney = value.total_price;
                        return LocalOrder.OrderSummaryLine.OrderSummaryLineModifier.copy$default(value, null, null, localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null, null, ByteString.EMPTY, 11, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, LocalOrder.OrderSummaryLine.OrderSummaryLineModifier value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 4, value.parent_modifier_name);
                        LocalMoney.ADAPTER.encodeWithTag(writer, 3, value.total_price);
                        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.quantity);
                        protoAdapter2.encodeWithTag(writer, 1, value.modifier_name);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ OrderSummaryLineModifier(String str, Integer num, LocalMoney localMoney, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : localMoney, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ OrderSummaryLineModifier copy$default(OrderSummaryLineModifier orderSummaryLineModifier, String str, Integer num, LocalMoney localMoney, String str2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = orderSummaryLineModifier.modifier_name;
                }
                if ((i & 2) != 0) {
                    num = orderSummaryLineModifier.quantity;
                }
                if ((i & 4) != 0) {
                    localMoney = orderSummaryLineModifier.total_price;
                }
                if ((i & 8) != 0) {
                    str2 = orderSummaryLineModifier.parent_modifier_name;
                }
                if ((i & 16) != 0) {
                    byteString = orderSummaryLineModifier.unknownFields();
                }
                ByteString byteString2 = byteString;
                LocalMoney localMoney2 = localMoney;
                return orderSummaryLineModifier.copy(str, num, localMoney2, str2, byteString2);
            }

            public final OrderSummaryLineModifier copy(String modifier_name, Integer quantity, LocalMoney total_price, String parent_modifier_name, ByteString unknownFields) {
                unknownFields.getClass();
                return new OrderSummaryLineModifier(modifier_name, quantity, total_price, parent_modifier_name, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof OrderSummaryLineModifier)) {
                    return false;
                }
                OrderSummaryLineModifier orderSummaryLineModifier = (OrderSummaryLineModifier) other;
                return Intrinsics.areEqual(unknownFields(), orderSummaryLineModifier.unknownFields()) && Intrinsics.areEqual(this.modifier_name, orderSummaryLineModifier.modifier_name) && Intrinsics.areEqual(this.quantity, orderSummaryLineModifier.quantity) && Intrinsics.areEqual(this.total_price, orderSummaryLineModifier.total_price) && Intrinsics.areEqual(this.parent_modifier_name, orderSummaryLineModifier.parent_modifier_name);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.modifier_name;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                Integer num = this.quantity;
                int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
                LocalMoney localMoney = this.total_price;
                int hashCode4 = (hashCode3 + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
                String str2 = this.parent_modifier_name;
                int hashCode5 = hashCode4 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.modifier_name = this.modifier_name;
                builder.quantity = this.quantity;
                builder.total_price = this.total_price;
                builder.parent_modifier_name = this.parent_modifier_name;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.modifier_name;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "modifier_name=", arrayList);
                }
                Integer num = this.quantity;
                if (num != null) {
                    re$$ExternalSyntheticOutline0.m("quantity=", num, arrayList);
                }
                LocalMoney localMoney = this.total_price;
                if (localMoney != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("total_price=", localMoney, arrayList);
                }
                String str2 = this.parent_modifier_name;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "parent_modifier_name=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "OrderSummaryLineModifier{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineModifier$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineModifier$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineModifier;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineModifier;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ OrderSummaryLineModifier build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public OrderSummaryLineModifier() {
                this(null, null, null, null, null, 31, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OrderSummaryLineModifier(String str, Integer num, LocalMoney localMoney, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.modifier_name = str;
                this.quantity = num;
                this.total_price = localMoney;
                this.parent_modifier_name = str2;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineTextModifier;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineTextModifier$Builder;", "modifier_name", "", "inputted_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class OrderSummaryLineTextModifier extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<OrderSummaryLineTextModifier> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String inputted_text;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String modifier_name;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineTextModifier$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineTextModifier;", "<init>", "()V", "modifier_name", "", "inputted_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String inputted_text;
                public String modifier_name;

                @Override // com.squareup.wire.Message.Builder
                public OrderSummaryLineTextModifier build() {
                    return new OrderSummaryLineTextModifier(this.modifier_name, this.inputted_text, buildUnknownFields());
                }

                public final Builder inputted_text(String inputted_text) {
                    this.inputted_text = inputted_text;
                    return this;
                }

                public final Builder modifier_name(String modifier_name) {
                    this.modifier_name = modifier_name;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OrderSummaryLineTextModifier.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalOrder$OrderSummaryLine$OrderSummaryLineTextModifier$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier((String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 2) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj2 = ProtoAdapter.STRING.decode(reader);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.modifier_name);
                        protoAdapter2.encodeWithTag(writer, 2, value.inputted_text);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return protoAdapter2.encodedSizeWithTag(2, value.inputted_text) + protoAdapter2.encodedSizeWithTag(1, value.modifier_name) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier redact(LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier value) {
                        value.getClass();
                        return LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 2, value.inputted_text);
                        protoAdapter2.encodeWithTag(writer, 1, value.modifier_name);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ OrderSummaryLineTextModifier(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ OrderSummaryLineTextModifier copy$default(OrderSummaryLineTextModifier orderSummaryLineTextModifier, String str, String str2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = orderSummaryLineTextModifier.modifier_name;
                }
                if ((i & 2) != 0) {
                    str2 = orderSummaryLineTextModifier.inputted_text;
                }
                if ((i & 4) != 0) {
                    byteString = orderSummaryLineTextModifier.unknownFields();
                }
                return orderSummaryLineTextModifier.copy(str, str2, byteString);
            }

            public final OrderSummaryLineTextModifier copy(String modifier_name, String inputted_text, ByteString unknownFields) {
                unknownFields.getClass();
                return new OrderSummaryLineTextModifier(modifier_name, inputted_text, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof OrderSummaryLineTextModifier)) {
                    return false;
                }
                OrderSummaryLineTextModifier orderSummaryLineTextModifier = (OrderSummaryLineTextModifier) other;
                return Intrinsics.areEqual(unknownFields(), orderSummaryLineTextModifier.unknownFields()) && Intrinsics.areEqual(this.modifier_name, orderSummaryLineTextModifier.modifier_name) && Intrinsics.areEqual(this.inputted_text, orderSummaryLineTextModifier.inputted_text);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.modifier_name;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.inputted_text;
                int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.modifier_name = this.modifier_name;
                builder.inputted_text = this.inputted_text;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.modifier_name;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "modifier_name=", arrayList);
                }
                String str2 = this.inputted_text;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "inputted_text=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "OrderSummaryLineTextModifier{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineTextModifier$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineTextModifier$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineTextModifier;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$OrderSummaryLineTextModifier;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ OrderSummaryLineTextModifier build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public OrderSummaryLineTextModifier() {
                this(null, null, null, 7, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OrderSummaryLineTextModifier(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.modifier_name = str;
                this.inputted_text = str2;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderSummaryLine;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ OrderSummaryLine build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public OrderSummaryLine() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderSummaryLine(String str, Integer num, LocalMoney localMoney, List<OrderSummaryLineModifier> list, String str2, List<OrderSummaryLineTextModifier> list2, LocalImage localImage, List<OrderSummaryLineComboSlot> list3, LocalMoney localMoney2, List<String> list4, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            list2.getClass();
            list3.getClass();
            list4.getClass();
            byteString.getClass();
            this.item_name = str;
            this.quantity = num;
            this.price = localMoney;
            this.variation_name = str2;
            this.item_image = localImage;
            this.discount_amount = localMoney2;
            this.modifiers = TransactorKt.immutableCopyOf("modifiers", list);
            this.text_modifiers = TransactorKt.immutableCopyOf("text_modifiers", list2);
            this.combo_slots = TransactorKt.immutableCopyOf("combo_slots", list3);
            this.discount_texts = TransactorKt.immutableCopyOf("discount_texts", list4);
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LocalOrder.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalOrder$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v13 */
            /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v27, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v29, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v38, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v49, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v51 */
            /* JADX WARN: Type inference failed for: r8v53, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v55 */
            /* JADX WARN: Type inference failed for: r8v56 */
            /* JADX WARN: Type inference failed for: r8v57 */
            /* JADX WARN: Type inference failed for: r8v6 */
            /* JADX WARN: Type inference failed for: r8v8 */
            @Override // com.squareup.wire.ProtoAdapter
            public LocalOrder decode(ProtoReader reader) {
                ArrayList arrayList;
                ?? decode;
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                String str = null;
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
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                Long l = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                LocalFulfillment localFulfillment = null;
                LocalCart localCart = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    Object obj12 = obj7;
                    if (nextTag == -1) {
                        return new LocalOrder(str, localFulfillment, localCart, str4, str5, (LocalLocationSummary) obj12, m, str6, str8, (LocalMoney) obj10, (LocalMoney) obj11, str2, str3, (LocalMoney) obj, (LocalMoney) obj5, (LocalMoney) obj6, arrayList2, l, (LocalOrder.OrderStatus) obj8, str7, arrayList3, (LocalOrder.LoyaltySummary) obj9, (LocalOrder.LocalOrderBrand) obj2, str9, (DynamicChargesBreakdown) obj3, str10, (LocalCart.OpenTabInfo) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj7 = obj12;
                            arrayList = arrayList2;
                            decode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj7 = obj12;
                            arrayList = arrayList2;
                            decode = str;
                            localFulfillment = TransactorKt.decodeMessageOrMerge(LocalFulfillment.ADAPTER, reader, localFulfillment);
                            break;
                        case 3:
                            obj7 = obj12;
                            arrayList = arrayList2;
                            decode = str;
                            localCart = TransactorKt.decodeMessageOrMerge(LocalCart.ADAPTER, reader, localCart);
                            break;
                        case 4:
                            obj7 = obj12;
                            arrayList = arrayList2;
                            str4 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 5:
                            obj7 = obj12;
                            arrayList = arrayList2;
                            str5 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 6:
                            Object decodeMessageOrMerge = TransactorKt.decodeMessageOrMerge(LocalLocationSummary.ADAPTER, reader, obj12);
                            arrayList = arrayList2;
                            obj7 = decodeMessageOrMerge;
                            decode = str;
                            break;
                        case 7:
                            m.add(LocalOrder.OrderSummaryLine.ADAPTER.decode(reader));
                            decode = str;
                            obj7 = obj12;
                            arrayList = arrayList2;
                            break;
                        case 8:
                            str6 = ProtoAdapter.STRING.decode(reader);
                            obj7 = obj12;
                            decode = str;
                            arrayList = arrayList2;
                            break;
                        case 9:
                            str8 = ProtoAdapter.STRING.decode(reader);
                            obj7 = obj12;
                            decode = str;
                            arrayList = arrayList2;
                            break;
                        case 10:
                            obj10 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, reader, obj10);
                            obj7 = obj12;
                            decode = str;
                            arrayList = arrayList2;
                            break;
                        case 11:
                            obj11 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, reader, obj11);
                            obj7 = obj12;
                            decode = str;
                            arrayList = arrayList2;
                            break;
                        case 12:
                            str2 = ProtoAdapter.STRING.decode(reader);
                            obj7 = obj12;
                            decode = str;
                            arrayList = arrayList2;
                            break;
                        case 13:
                            str3 = ProtoAdapter.STRING.decode(reader);
                            obj7 = obj12;
                            decode = str;
                            arrayList = arrayList2;
                            break;
                        case 14:
                            obj = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, reader, obj);
                            decode = str;
                            obj7 = obj12;
                            arrayList = arrayList2;
                            break;
                        case 15:
                            obj5 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, reader, obj5);
                            obj7 = obj12;
                            decode = str;
                            arrayList = arrayList2;
                            break;
                        case 16:
                            obj6 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, reader, obj6);
                            obj7 = obj12;
                            decode = str;
                            arrayList = arrayList2;
                            break;
                        case 17:
                        default:
                            reader.readUnknownField(nextTag);
                            decode = str;
                            obj7 = obj12;
                            arrayList = arrayList2;
                            break;
                        case 18:
                            arrayList2.add(LocalOrder.PaymentSummary.ADAPTER.decode(reader));
                            decode = str;
                            obj7 = obj12;
                            arrayList = arrayList2;
                            break;
                        case 19:
                            l = ProtoAdapter.INT64.decode(reader);
                            obj7 = obj12;
                            decode = str;
                            arrayList = arrayList2;
                            break;
                        case 20:
                            obj8 = TransactorKt.decodeMessageOrMerge(LocalOrder.OrderStatus.ADAPTER, reader, obj8);
                            obj7 = obj12;
                            decode = str;
                            arrayList = arrayList2;
                            break;
                        case 21:
                            str7 = ProtoAdapter.STRING.decode(reader);
                            obj7 = obj12;
                            decode = str;
                            arrayList = arrayList2;
                            break;
                        case 22:
                            arrayList3.add(LocalOrder.AdjustmentLine.ADAPTER.decode(reader));
                            decode = str;
                            obj7 = obj12;
                            arrayList = arrayList2;
                            break;
                        case 23:
                            obj9 = TransactorKt.decodeMessageOrMerge(LocalOrder.LoyaltySummary.ADAPTER, reader, obj9);
                            obj7 = obj12;
                            decode = str;
                            arrayList = arrayList2;
                            break;
                        case 24:
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalOrder.LocalOrderBrand.ADAPTER, reader, obj2);
                            decode = str;
                            obj7 = obj12;
                            arrayList = arrayList2;
                            break;
                        case 25:
                            str9 = ProtoAdapter.STRING.decode(reader);
                            obj7 = obj12;
                            decode = str;
                            arrayList = arrayList2;
                            break;
                        case 26:
                            obj3 = TransactorKt.decodeMessageOrMerge(DynamicChargesBreakdown.ADAPTER, reader, obj3);
                            decode = str;
                            obj7 = obj12;
                            arrayList = arrayList2;
                            break;
                        case 27:
                            str10 = ProtoAdapter.STRING.decode(reader);
                            obj7 = obj12;
                            decode = str;
                            arrayList = arrayList2;
                            break;
                        case 28:
                            obj4 = TransactorKt.decodeMessageOrMerge(LocalCart.OpenTabInfo.ADAPTER, reader, obj4);
                            decode = str;
                            obj7 = obj12;
                            arrayList = arrayList2;
                            break;
                    }
                    str = decode;
                    arrayList2 = arrayList;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LocalOrder value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.token);
                LocalFulfillment.ADAPTER.encodeWithTag(writer, 2, value.fulfillment);
                LocalCart.ADAPTER.encodeWithTag(writer, 3, value.cart);
                protoAdapter2.encodeWithTag(writer, 4, value.buyer_name);
                protoAdapter2.encodeWithTag(writer, 5, value.local_brand_name);
                LocalLocationSummary.ADAPTER.encodeWithTag(writer, 6, value.location_summary);
                LocalOrder.OrderSummaryLine.ADAPTER.asRepeated().encodeWithTag(writer, 7, value.order_summary);
                protoAdapter2.encodeWithTag(writer, 8, value.instructions);
                protoAdapter2.encodeWithTag(writer, 9, value.receipt_url);
                ProtoAdapter protoAdapter3 = LocalMoney.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 10, value.total_amount);
                protoAdapter3.encodeWithTag(writer, 11, value.redeemed_local_bux_amount);
                protoAdapter2.encodeWithTag(writer, 12, value.brand_token);
                protoAdapter2.encodeWithTag(writer, 13, value.local_cash_earnings_label);
                protoAdapter3.encodeWithTag(writer, 14, value.subtotal_amount);
                protoAdapter3.encodeWithTag(writer, 15, value.tax_amount);
                protoAdapter3.encodeWithTag(writer, 16, value.tip_amount);
                LocalOrder.PaymentSummary.ADAPTER.asRepeated().encodeWithTag(writer, 18, value.payment_summary);
                ProtoAdapter.INT64.encodeWithTag(writer, 19, value.paid_at);
                LocalOrder.OrderStatus.ADAPTER.encodeWithTag(writer, 20, value.order_status);
                protoAdapter2.encodeWithTag(writer, 21, value.receipt_client_route);
                LocalOrder.AdjustmentLine.ADAPTER.asRepeated().encodeWithTag(writer, 22, value.adjustment_lines);
                LocalOrder.LoyaltySummary.ADAPTER.encodeWithTag(writer, 23, value.loyalty_summary);
                LocalOrder.LocalOrderBrand.ADAPTER.encodeWithTag(writer, 24, value.local_order_brand);
                protoAdapter2.encodeWithTag(writer, 25, value.notes);
                DynamicChargesBreakdown.ADAPTER.encodeWithTag(writer, 26, value.charges_breakdown);
                protoAdapter2.encodeWithTag(writer, 27, value.order_ticket_number);
                LocalCart.OpenTabInfo.ADAPTER.encodeWithTag(writer, 28, value.open_tab_info);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LocalOrder value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(9, value.receipt_url) + protoAdapter2.encodedSizeWithTag(8, value.instructions) + LocalOrder.OrderSummaryLine.ADAPTER.asRepeated().encodedSizeWithTag(7, value.order_summary) + LocalLocationSummary.ADAPTER.encodedSizeWithTag(6, value.location_summary) + protoAdapter2.encodedSizeWithTag(5, value.local_brand_name) + protoAdapter2.encodedSizeWithTag(4, value.buyer_name) + LocalCart.ADAPTER.encodedSizeWithTag(3, value.cart) + LocalFulfillment.ADAPTER.encodedSizeWithTag(2, value.fulfillment) + protoAdapter2.encodedSizeWithTag(1, value.token) + size$okio;
                ProtoAdapter protoAdapter3 = LocalMoney.ADAPTER;
                return LocalCart.OpenTabInfo.ADAPTER.encodedSizeWithTag(28, value.open_tab_info) + protoAdapter2.encodedSizeWithTag(27, value.order_ticket_number) + DynamicChargesBreakdown.ADAPTER.encodedSizeWithTag(26, value.charges_breakdown) + protoAdapter2.encodedSizeWithTag(25, value.notes) + LocalOrder.LocalOrderBrand.ADAPTER.encodedSizeWithTag(24, value.local_order_brand) + LocalOrder.LoyaltySummary.ADAPTER.encodedSizeWithTag(23, value.loyalty_summary) + LocalOrder.AdjustmentLine.ADAPTER.asRepeated().encodedSizeWithTag(22, value.adjustment_lines) + protoAdapter2.encodedSizeWithTag(21, value.receipt_client_route) + LocalOrder.OrderStatus.ADAPTER.encodedSizeWithTag(20, value.order_status) + ProtoAdapter.INT64.encodedSizeWithTag(19, value.paid_at) + LocalOrder.PaymentSummary.ADAPTER.asRepeated().encodedSizeWithTag(18, value.payment_summary) + protoAdapter3.encodedSizeWithTag(16, value.tip_amount) + protoAdapter3.encodedSizeWithTag(15, value.tax_amount) + protoAdapter3.encodedSizeWithTag(14, value.subtotal_amount) + protoAdapter2.encodedSizeWithTag(13, value.local_cash_earnings_label) + protoAdapter2.encodedSizeWithTag(12, value.brand_token) + protoAdapter3.encodedSizeWithTag(11, value.redeemed_local_bux_amount) + protoAdapter3.encodedSizeWithTag(10, value.total_amount) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LocalOrder redact(LocalOrder value) {
                value.getClass();
                LocalFulfillment localFulfillment = value.fulfillment;
                LocalFulfillment localFulfillment2 = localFulfillment != null ? (LocalFulfillment) LocalFulfillment.ADAPTER.redact(localFulfillment) : null;
                LocalCart localCart = value.cart;
                LocalCart localCart2 = localCart != null ? (LocalCart) LocalCart.ADAPTER.redact(localCart) : null;
                LocalLocationSummary localLocationSummary = value.location_summary;
                LocalLocationSummary localLocationSummary2 = localLocationSummary != null ? (LocalLocationSummary) LocalLocationSummary.ADAPTER.redact(localLocationSummary) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.order_summary, LocalOrder.OrderSummaryLine.ADAPTER);
                LocalMoney localMoney = value.total_amount;
                LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
                LocalMoney localMoney3 = value.redeemed_local_bux_amount;
                LocalMoney localMoney4 = localMoney3 != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney3) : null;
                LocalMoney localMoney5 = value.subtotal_amount;
                LocalMoney localMoney6 = localMoney5 != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney5) : null;
                LocalMoney localMoney7 = value.tax_amount;
                LocalMoney localMoney8 = localMoney7 != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney7) : null;
                LocalMoney localMoney9 = value.tip_amount;
                LocalMoney localMoney10 = localMoney9 != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney9) : null;
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(value.payment_summary, LocalOrder.PaymentSummary.ADAPTER);
                LocalOrder.OrderStatus orderStatus = value.order_status;
                LocalOrder.OrderStatus orderStatus2 = orderStatus != null ? (LocalOrder.OrderStatus) LocalOrder.OrderStatus.ADAPTER.redact(orderStatus) : null;
                ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(value.adjustment_lines, LocalOrder.AdjustmentLine.ADAPTER);
                LocalOrder.LoyaltySummary loyaltySummary = value.loyalty_summary;
                LocalOrder.LoyaltySummary loyaltySummary2 = loyaltySummary != null ? (LocalOrder.LoyaltySummary) LocalOrder.LoyaltySummary.ADAPTER.redact(loyaltySummary) : null;
                LocalOrder.LocalOrderBrand localOrderBrand = value.local_order_brand;
                LocalOrder.LocalOrderBrand localOrderBrand2 = localOrderBrand != null ? (LocalOrder.LocalOrderBrand) LocalOrder.LocalOrderBrand.ADAPTER.redact(localOrderBrand) : null;
                DynamicChargesBreakdown dynamicChargesBreakdown = value.charges_breakdown;
                DynamicChargesBreakdown dynamicChargesBreakdown2 = dynamicChargesBreakdown != null ? (DynamicChargesBreakdown) DynamicChargesBreakdown.ADAPTER.redact(dynamicChargesBreakdown) : null;
                LocalCart.OpenTabInfo openTabInfo = value.open_tab_info;
                LocalCart.OpenTabInfo openTabInfo2 = openTabInfo != null ? (LocalCart.OpenTabInfo) LocalCart.OpenTabInfo.ADAPTER.redact(openTabInfo) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.token;
                String str2 = value.local_brand_name;
                String str3 = value.instructions;
                String str4 = value.receipt_url;
                String str5 = value.brand_token;
                String str6 = value.local_cash_earnings_label;
                Long l = value.paid_at;
                String str7 = value.receipt_client_route;
                String str8 = value.notes;
                String str9 = value.order_ticket_number;
                byteString.getClass();
                return new LocalOrder(str, localFulfillment2, localCart2, null, str2, localLocationSummary2, m1169redactElements, str3, str4, localMoney2, localMoney4, str5, str6, localMoney6, localMoney8, localMoney10, m1169redactElements2, l, orderStatus2, str7, m1169redactElements3, loyaltySummary2, localOrderBrand2, str8, dynamicChargesBreakdown2, str9, openTabInfo2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LocalOrder value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                LocalCart.OpenTabInfo.ADAPTER.encodeWithTag(writer, 28, value.open_tab_info);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 27, value.order_ticket_number);
                DynamicChargesBreakdown.ADAPTER.encodeWithTag(writer, 26, value.charges_breakdown);
                protoAdapter2.encodeWithTag(writer, 25, value.notes);
                LocalOrder.LocalOrderBrand.ADAPTER.encodeWithTag(writer, 24, value.local_order_brand);
                LocalOrder.LoyaltySummary.ADAPTER.encodeWithTag(writer, 23, value.loyalty_summary);
                LocalOrder.AdjustmentLine.ADAPTER.asRepeated().encodeWithTag(writer, 22, value.adjustment_lines);
                protoAdapter2.encodeWithTag(writer, 21, value.receipt_client_route);
                LocalOrder.OrderStatus.ADAPTER.encodeWithTag(writer, 20, value.order_status);
                ProtoAdapter.INT64.encodeWithTag(writer, 19, value.paid_at);
                LocalOrder.PaymentSummary.ADAPTER.asRepeated().encodeWithTag(writer, 18, value.payment_summary);
                ProtoAdapter protoAdapter3 = LocalMoney.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 16, value.tip_amount);
                protoAdapter3.encodeWithTag(writer, 15, value.tax_amount);
                protoAdapter3.encodeWithTag(writer, 14, value.subtotal_amount);
                protoAdapter2.encodeWithTag(writer, 13, value.local_cash_earnings_label);
                protoAdapter2.encodeWithTag(writer, 12, value.brand_token);
                protoAdapter3.encodeWithTag(writer, 11, value.redeemed_local_bux_amount);
                protoAdapter3.encodeWithTag(writer, 10, value.total_amount);
                protoAdapter2.encodeWithTag(writer, 9, value.receipt_url);
                protoAdapter2.encodeWithTag(writer, 8, value.instructions);
                LocalOrder.OrderSummaryLine.ADAPTER.asRepeated().encodeWithTag(writer, 7, value.order_summary);
                LocalLocationSummary.ADAPTER.encodeWithTag(writer, 6, value.location_summary);
                protoAdapter2.encodeWithTag(writer, 5, value.local_brand_name);
                protoAdapter2.encodeWithTag(writer, 4, value.buyer_name);
                LocalCart.ADAPTER.encodeWithTag(writer, 3, value.cart);
                LocalFulfillment.ADAPTER.encodeWithTag(writer, 2, value.fulfillment);
                protoAdapter2.encodeWithTag(writer, 1, value.token);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalOrder(String str, LocalFulfillment localFulfillment, LocalCart localCart, String str2, String str3, LocalLocationSummary localLocationSummary, List list, String str4, String str5, LocalMoney localMoney, LocalMoney localMoney2, String str6, String str7, LocalMoney localMoney3, LocalMoney localMoney4, LocalMoney localMoney5, List list2, Long l, OrderStatus orderStatus, String str8, List list3, LoyaltySummary loyaltySummary, LocalOrderBrand localOrderBrand, String str9, DynamicChargesBreakdown dynamicChargesBreakdown, String str10, LocalCart.OpenTabInfo openTabInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.token = str;
        this.fulfillment = localFulfillment;
        this.cart = localCart;
        this.buyer_name = str2;
        this.local_brand_name = str3;
        this.location_summary = localLocationSummary;
        this.instructions = str4;
        this.receipt_url = str5;
        this.total_amount = localMoney;
        this.redeemed_local_bux_amount = localMoney2;
        this.brand_token = str6;
        this.local_cash_earnings_label = str7;
        this.subtotal_amount = localMoney3;
        this.tax_amount = localMoney4;
        this.tip_amount = localMoney5;
        this.paid_at = l;
        this.order_status = orderStatus;
        this.receipt_client_route = str8;
        this.loyalty_summary = loyaltySummary;
        this.local_order_brand = localOrderBrand;
        this.notes = str9;
        this.charges_breakdown = dynamicChargesBreakdown;
        this.order_ticket_number = str10;
        this.open_tab_info = openTabInfo;
        this.order_summary = TransactorKt.immutableCopyOf("order_summary", list);
        this.payment_summary = TransactorKt.immutableCopyOf("payment_summary", list2);
        this.adjustment_lines = TransactorKt.immutableCopyOf("adjustment_lines", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalOrder)) {
            return false;
        }
        LocalOrder localOrder = (LocalOrder) obj;
        return Intrinsics.areEqual(unknownFields(), localOrder.unknownFields()) && Intrinsics.areEqual(this.token, localOrder.token) && Intrinsics.areEqual(this.fulfillment, localOrder.fulfillment) && Intrinsics.areEqual(this.cart, localOrder.cart) && Intrinsics.areEqual(this.buyer_name, localOrder.buyer_name) && Intrinsics.areEqual(this.local_brand_name, localOrder.local_brand_name) && Intrinsics.areEqual(this.location_summary, localOrder.location_summary) && Intrinsics.areEqual(this.order_summary, localOrder.order_summary) && Intrinsics.areEqual(this.instructions, localOrder.instructions) && Intrinsics.areEqual(this.receipt_url, localOrder.receipt_url) && Intrinsics.areEqual(this.total_amount, localOrder.total_amount) && Intrinsics.areEqual(this.redeemed_local_bux_amount, localOrder.redeemed_local_bux_amount) && Intrinsics.areEqual(this.brand_token, localOrder.brand_token) && Intrinsics.areEqual(this.local_cash_earnings_label, localOrder.local_cash_earnings_label) && Intrinsics.areEqual(this.subtotal_amount, localOrder.subtotal_amount) && Intrinsics.areEqual(this.tax_amount, localOrder.tax_amount) && Intrinsics.areEqual(this.tip_amount, localOrder.tip_amount) && Intrinsics.areEqual(this.payment_summary, localOrder.payment_summary) && Intrinsics.areEqual(this.paid_at, localOrder.paid_at) && Intrinsics.areEqual(this.order_status, localOrder.order_status) && Intrinsics.areEqual(this.receipt_client_route, localOrder.receipt_client_route) && Intrinsics.areEqual(this.adjustment_lines, localOrder.adjustment_lines) && Intrinsics.areEqual(this.loyalty_summary, localOrder.loyalty_summary) && Intrinsics.areEqual(this.local_order_brand, localOrder.local_order_brand) && Intrinsics.areEqual(this.notes, localOrder.notes) && Intrinsics.areEqual(this.charges_breakdown, localOrder.charges_breakdown) && Intrinsics.areEqual(this.order_ticket_number, localOrder.order_ticket_number) && Intrinsics.areEqual(this.open_tab_info, localOrder.open_tab_info);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalFulfillment localFulfillment = this.fulfillment;
        int hashCode3 = (hashCode2 + (localFulfillment != null ? localFulfillment.hashCode() : 0)) * 37;
        LocalCart localCart = this.cart;
        int hashCode4 = (hashCode3 + (localCart != null ? localCart.hashCode() : 0)) * 37;
        String str2 = this.buyer_name;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.local_brand_name;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        LocalLocationSummary localLocationSummary = this.location_summary;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (localLocationSummary != null ? localLocationSummary.hashCode() : 0)) * 37, 37, this.order_summary);
        String str4 = this.instructions;
        int hashCode7 = (m + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.receipt_url;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        LocalMoney localMoney = this.total_amount;
        int hashCode9 = (hashCode8 + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
        LocalMoney localMoney2 = this.redeemed_local_bux_amount;
        int hashCode10 = (hashCode9 + (localMoney2 != null ? localMoney2.hashCode() : 0)) * 37;
        String str6 = this.brand_token;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.local_cash_earnings_label;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 37;
        LocalMoney localMoney3 = this.subtotal_amount;
        int hashCode13 = (hashCode12 + (localMoney3 != null ? localMoney3.hashCode() : 0)) * 37;
        LocalMoney localMoney4 = this.tax_amount;
        int hashCode14 = (hashCode13 + (localMoney4 != null ? localMoney4.hashCode() : 0)) * 37;
        LocalMoney localMoney5 = this.tip_amount;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode14 + (localMoney5 != null ? localMoney5.hashCode() : 0)) * 37, 37, this.payment_summary);
        Long l = this.paid_at;
        int hashCode15 = (m2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        OrderStatus orderStatus = this.order_status;
        int hashCode16 = (hashCode15 + (orderStatus != null ? orderStatus.hashCode() : 0)) * 37;
        String str8 = this.receipt_client_route;
        int m3 = Recorder$$ExternalSyntheticOutline2.m((hashCode16 + (str8 != null ? str8.hashCode() : 0)) * 37, 37, this.adjustment_lines);
        LoyaltySummary loyaltySummary = this.loyalty_summary;
        int hashCode17 = (m3 + (loyaltySummary != null ? loyaltySummary.hashCode() : 0)) * 37;
        LocalOrderBrand localOrderBrand = this.local_order_brand;
        int hashCode18 = (hashCode17 + (localOrderBrand != null ? localOrderBrand.hashCode() : 0)) * 37;
        String str9 = this.notes;
        int hashCode19 = (hashCode18 + (str9 != null ? str9.hashCode() : 0)) * 37;
        DynamicChargesBreakdown dynamicChargesBreakdown = this.charges_breakdown;
        int hashCode20 = (hashCode19 + (dynamicChargesBreakdown != null ? dynamicChargesBreakdown.hashCode() : 0)) * 37;
        String str10 = this.order_ticket_number;
        int hashCode21 = (hashCode20 + (str10 != null ? str10.hashCode() : 0)) * 37;
        LocalCart.OpenTabInfo openTabInfo = this.open_tab_info;
        int hashCode22 = hashCode21 + (openTabInfo != null ? openTabInfo.hashCode() : 0);
        this.hashCode = hashCode22;
        return hashCode22;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.token = this.token;
        builder.fulfillment = this.fulfillment;
        builder.cart = this.cart;
        builder.buyer_name = this.buyer_name;
        builder.local_brand_name = this.local_brand_name;
        builder.location_summary = this.location_summary;
        builder.order_summary = this.order_summary;
        builder.instructions = this.instructions;
        builder.receipt_url = this.receipt_url;
        builder.total_amount = this.total_amount;
        builder.redeemed_local_bux_amount = this.redeemed_local_bux_amount;
        builder.brand_token = this.brand_token;
        builder.local_cash_earnings_label = this.local_cash_earnings_label;
        builder.subtotal_amount = this.subtotal_amount;
        builder.tax_amount = this.tax_amount;
        builder.tip_amount = this.tip_amount;
        builder.payment_summary = this.payment_summary;
        builder.paid_at = this.paid_at;
        builder.order_status = this.order_status;
        builder.receipt_client_route = this.receipt_client_route;
        builder.adjustment_lines = this.adjustment_lines;
        builder.loyalty_summary = this.loyalty_summary;
        builder.local_order_brand = this.local_order_brand;
        builder.notes = this.notes;
        builder.charges_breakdown = this.charges_breakdown;
        builder.order_ticket_number = this.order_ticket_number;
        builder.open_tab_info = this.open_tab_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        LocalFulfillment localFulfillment = this.fulfillment;
        if (localFulfillment != null) {
            arrayList.add("fulfillment=" + localFulfillment);
        }
        LocalCart localCart = this.cart;
        if (localCart != null) {
            arrayList.add("cart=" + localCart);
        }
        if (this.buyer_name != null) {
            arrayList.add("buyer_name=██");
        }
        String str2 = this.local_brand_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "local_brand_name=", arrayList);
        }
        LocalLocationSummary localLocationSummary = this.location_summary;
        if (localLocationSummary != null) {
            arrayList.add("location_summary=" + localLocationSummary);
        }
        if (!this.order_summary.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("order_summary=", arrayList, this.order_summary);
        }
        String str3 = this.instructions;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "instructions=", arrayList);
        }
        String str4 = this.receipt_url;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "receipt_url=", arrayList);
        }
        LocalMoney localMoney = this.total_amount;
        if (localMoney != null) {
            SizeMode$EnumUnboxingLocalUtility.m("total_amount=", localMoney, arrayList);
        }
        LocalMoney localMoney2 = this.redeemed_local_bux_amount;
        if (localMoney2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("redeemed_local_bux_amount=", localMoney2, arrayList);
        }
        String str5 = this.brand_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "brand_token=", arrayList);
        }
        String str6 = this.local_cash_earnings_label;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "local_cash_earnings_label=", arrayList);
        }
        LocalMoney localMoney3 = this.subtotal_amount;
        if (localMoney3 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("subtotal_amount=", localMoney3, arrayList);
        }
        LocalMoney localMoney4 = this.tax_amount;
        if (localMoney4 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("tax_amount=", localMoney4, arrayList);
        }
        LocalMoney localMoney5 = this.tip_amount;
        if (localMoney5 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("tip_amount=", localMoney5, arrayList);
        }
        if (!this.payment_summary.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("payment_summary=", arrayList, this.payment_summary);
        }
        Long l = this.paid_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("paid_at=", l, arrayList);
        }
        OrderStatus orderStatus = this.order_status;
        if (orderStatus != null) {
            arrayList.add("order_status=" + orderStatus);
        }
        String str7 = this.receipt_client_route;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "receipt_client_route=", arrayList);
        }
        if (!this.adjustment_lines.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("adjustment_lines=", arrayList, this.adjustment_lines);
        }
        LoyaltySummary loyaltySummary = this.loyalty_summary;
        if (loyaltySummary != null) {
            arrayList.add("loyalty_summary=" + loyaltySummary);
        }
        LocalOrderBrand localOrderBrand = this.local_order_brand;
        if (localOrderBrand != null) {
            arrayList.add("local_order_brand=" + localOrderBrand);
        }
        String str8 = this.notes;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "notes=", arrayList);
        }
        DynamicChargesBreakdown dynamicChargesBreakdown = this.charges_breakdown;
        if (dynamicChargesBreakdown != null) {
            arrayList.add("charges_breakdown=" + dynamicChargesBreakdown);
        }
        String str9 = this.order_ticket_number;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "order_ticket_number=", arrayList);
        }
        LocalCart.OpenTabInfo openTabInfo = this.open_tab_info;
        if (openTabInfo != null) {
            arrayList.add("open_tab_info=" + openTabInfo);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalOrder{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$AdjustmentLine;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$AdjustmentLine$Builder;", "description", "", "amount", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/cash/local/client/v1/LocalMoney;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AdjustmentLine extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AdjustmentLine> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalMoney#ADAPTER", schemaIndex = 1, tag = 2)
        public final LocalMoney amount;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String description;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$AdjustmentLine$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$AdjustmentLine;", "<init>", "()V", "description", "", "amount", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public LocalMoney amount;
            public String description;

            public final Builder amount(LocalMoney amount) {
                this.amount = amount;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public AdjustmentLine build() {
                return new AdjustmentLine(this.description, this.amount, buildUnknownFields());
            }

            public final Builder description(String description) {
                this.description = description;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AdjustmentLine.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalOrder$AdjustmentLine$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public LocalOrder.AdjustmentLine decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new LocalOrder.AdjustmentLine((String) obj, (LocalMoney) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, reader, obj2);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LocalOrder.AdjustmentLine value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.description);
                    LocalMoney.ADAPTER.encodeWithTag(writer, 2, value.amount);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LocalOrder.AdjustmentLine value) {
                    value.getClass();
                    return LocalMoney.ADAPTER.encodedSizeWithTag(2, value.amount) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.description) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LocalOrder.AdjustmentLine redact(LocalOrder.AdjustmentLine value) {
                    value.getClass();
                    LocalMoney localMoney = value.amount;
                    return LocalOrder.AdjustmentLine.copy$default(value, null, localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LocalOrder.AdjustmentLine value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    LocalMoney.ADAPTER.encodeWithTag(writer, 2, value.amount);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.description);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ AdjustmentLine(String str, LocalMoney localMoney, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : localMoney, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ AdjustmentLine copy$default(AdjustmentLine adjustmentLine, String str, LocalMoney localMoney, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = adjustmentLine.description;
            }
            if ((i & 2) != 0) {
                localMoney = adjustmentLine.amount;
            }
            if ((i & 4) != 0) {
                byteString = adjustmentLine.unknownFields();
            }
            return adjustmentLine.copy(str, localMoney, byteString);
        }

        public final AdjustmentLine copy(String description, LocalMoney amount, ByteString unknownFields) {
            unknownFields.getClass();
            return new AdjustmentLine(description, amount, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof AdjustmentLine)) {
                return false;
            }
            AdjustmentLine adjustmentLine = (AdjustmentLine) other;
            return Intrinsics.areEqual(unknownFields(), adjustmentLine.unknownFields()) && Intrinsics.areEqual(this.description, adjustmentLine.description) && Intrinsics.areEqual(this.amount, adjustmentLine.amount);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.description;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalMoney localMoney = this.amount;
            int hashCode3 = hashCode2 + (localMoney != null ? localMoney.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.description = this.description;
            builder.amount = this.amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.description;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "description=", arrayList);
            }
            LocalMoney localMoney = this.amount;
            if (localMoney != null) {
                SizeMode$EnumUnboxingLocalUtility.m("amount=", localMoney, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AdjustmentLine{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$AdjustmentLine$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$AdjustmentLine$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$AdjustmentLine;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalOrder$AdjustmentLine;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ AdjustmentLine build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public AdjustmentLine() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdjustmentLine(String str, LocalMoney localMoney, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.description = str;
            this.amount = localMoney;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cBe\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0082\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u0096\u0080\u0004J\b\u0010\u0019\u001a\u00020\u0004H\u0016Jd\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LocalOrderBrand;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LocalOrderBrand$Builder;", "token", "", "name", "cashtag", "artwork_image", "Lcom/squareup/protos/cash/local/client/v1/LocalImage;", "brand_card_outline_color", "Lcom/squareup/protos/cash/local/client/v1/LocalColor;", "feature_set", "Lcom/squareup/protos/cash/local/client/v1/FeatureSet;", "background_color", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/local/client/v1/LocalImage;Lcom/squareup/protos/cash/local/client/v1/LocalColor;Lcom/squareup/protos/cash/local/client/v1/FeatureSet;Lcom/squareup/protos/cash/local/client/v1/LocalColor;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LocalOrderBrand extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LocalOrderBrand> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalImage#ADAPTER", schemaIndex = 3, tag = 4)
        public final LocalImage artwork_image;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalColor#ADAPTER", schemaIndex = 6, tag = 7)
        public final LocalColor background_color;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalColor#ADAPTER", schemaIndex = 4, tag = 5)
        public final LocalColor brand_card_outline_color;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 2, tag = 3)
        public final String cashtag;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.FeatureSet#ADAPTER", schemaIndex = 5, tag = 6)
        public final FeatureSet feature_set;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String token;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LocalOrderBrand$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LocalOrderBrand;", "<init>", "()V", "token", "", "name", "cashtag", "artwork_image", "Lcom/squareup/protos/cash/local/client/v1/LocalImage;", "brand_card_outline_color", "Lcom/squareup/protos/cash/local/client/v1/LocalColor;", "feature_set", "Lcom/squareup/protos/cash/local/client/v1/FeatureSet;", "background_color", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public LocalImage artwork_image;
            public LocalColor background_color;
            public LocalColor brand_card_outline_color;
            public String cashtag;
            public FeatureSet feature_set;
            public String name;
            public String token;

            public final Builder artwork_image(LocalImage artwork_image) {
                this.artwork_image = artwork_image;
                return this;
            }

            public final Builder background_color(LocalColor background_color) {
                this.background_color = background_color;
                return this;
            }

            public final Builder brand_card_outline_color(LocalColor brand_card_outline_color) {
                this.brand_card_outline_color = brand_card_outline_color;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public LocalOrderBrand build() {
                return new LocalOrderBrand(this.token, this.name, this.cashtag, this.artwork_image, this.brand_card_outline_color, this.feature_set, this.background_color, buildUnknownFields());
            }

            public final Builder cashtag(String cashtag) {
                this.cashtag = cashtag;
                return this;
            }

            public final Builder feature_set(FeatureSet feature_set) {
                this.feature_set = feature_set;
                return this;
            }

            public final Builder name(String name) {
                this.name = name;
                return this;
            }

            public final Builder token(String token) {
                this.token = token;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LocalOrderBrand.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalOrder$LocalOrderBrand$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public LocalOrder.LocalOrderBrand decode(ProtoReader reader) {
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
                            return new LocalOrder.LocalOrderBrand((String) obj, (String) obj2, (String) obj3, (LocalImage) obj4, (LocalColor) obj5, (FeatureSet) obj6, (LocalColor) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                obj2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                obj3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                obj4 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, reader, obj4);
                                break;
                            case 5:
                                obj5 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, reader, obj5);
                                break;
                            case 6:
                                obj6 = TransactorKt.decodeMessageOrMerge(FeatureSet.ADAPTER, reader, obj6);
                                break;
                            case 7:
                                obj7 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, reader, obj7);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LocalOrder.LocalOrderBrand value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.token);
                    protoAdapter2.encodeWithTag(writer, 2, value.name);
                    protoAdapter2.encodeWithTag(writer, 3, value.cashtag);
                    LocalImage.ADAPTER.encodeWithTag(writer, 4, value.artwork_image);
                    ProtoAdapter protoAdapter3 = LocalColor.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 5, value.brand_card_outline_color);
                    FeatureSet.ADAPTER.encodeWithTag(writer, 6, value.feature_set);
                    protoAdapter3.encodeWithTag(writer, 7, value.background_color);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LocalOrder.LocalOrderBrand value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag = LocalImage.ADAPTER.encodedSizeWithTag(4, value.artwork_image) + protoAdapter2.encodedSizeWithTag(3, value.cashtag) + protoAdapter2.encodedSizeWithTag(2, value.name) + protoAdapter2.encodedSizeWithTag(1, value.token) + size$okio;
                    ProtoAdapter protoAdapter3 = LocalColor.ADAPTER;
                    return protoAdapter3.encodedSizeWithTag(7, value.background_color) + FeatureSet.ADAPTER.encodedSizeWithTag(6, value.feature_set) + protoAdapter3.encodedSizeWithTag(5, value.brand_card_outline_color) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LocalOrder.LocalOrderBrand redact(LocalOrder.LocalOrderBrand value) {
                    value.getClass();
                    LocalImage localImage = value.artwork_image;
                    LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
                    LocalColor localColor = value.brand_card_outline_color;
                    LocalColor localColor2 = localColor != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor) : null;
                    FeatureSet featureSet = value.feature_set;
                    FeatureSet featureSet2 = featureSet != null ? (FeatureSet) FeatureSet.ADAPTER.redact(featureSet) : null;
                    LocalColor localColor3 = value.background_color;
                    return LocalOrder.LocalOrderBrand.copy$default(value, null, null, null, localImage2, localColor2, featureSet2, localColor3 != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor3) : null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LocalOrder.LocalOrderBrand value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = LocalColor.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 7, value.background_color);
                    FeatureSet.ADAPTER.encodeWithTag(writer, 6, value.feature_set);
                    protoAdapter2.encodeWithTag(writer, 5, value.brand_card_outline_color);
                    LocalImage.ADAPTER.encodeWithTag(writer, 4, value.artwork_image);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                    protoAdapter3.encodeWithTag(writer, 3, value.cashtag);
                    protoAdapter3.encodeWithTag(writer, 2, value.name);
                    protoAdapter3.encodeWithTag(writer, 1, value.token);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ LocalOrderBrand(String str, String str2, String str3, LocalImage localImage, LocalColor localColor, FeatureSet featureSet, LocalColor localColor2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : localImage, (i & 16) != 0 ? null : localColor, (i & 32) != 0 ? null : featureSet, (i & 64) != 0 ? null : localColor2, (i & 128) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ LocalOrderBrand copy$default(LocalOrderBrand localOrderBrand, String str, String str2, String str3, LocalImage localImage, LocalColor localColor, FeatureSet featureSet, LocalColor localColor2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = localOrderBrand.token;
            }
            if ((i & 2) != 0) {
                str2 = localOrderBrand.name;
            }
            if ((i & 4) != 0) {
                str3 = localOrderBrand.cashtag;
            }
            if ((i & 8) != 0) {
                localImage = localOrderBrand.artwork_image;
            }
            if ((i & 16) != 0) {
                localColor = localOrderBrand.brand_card_outline_color;
            }
            if ((i & 32) != 0) {
                featureSet = localOrderBrand.feature_set;
            }
            if ((i & 64) != 0) {
                localColor2 = localOrderBrand.background_color;
            }
            if ((i & 128) != 0) {
                byteString = localOrderBrand.unknownFields();
            }
            LocalColor localColor3 = localColor2;
            ByteString byteString2 = byteString;
            LocalColor localColor4 = localColor;
            FeatureSet featureSet2 = featureSet;
            return localOrderBrand.copy(str, str2, str3, localImage, localColor4, featureSet2, localColor3, byteString2);
        }

        public final LocalOrderBrand copy(String token, String name, String cashtag, LocalImage artwork_image, LocalColor brand_card_outline_color, FeatureSet feature_set, LocalColor background_color, ByteString unknownFields) {
            unknownFields.getClass();
            return new LocalOrderBrand(token, name, cashtag, artwork_image, brand_card_outline_color, feature_set, background_color, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof LocalOrderBrand)) {
                return false;
            }
            LocalOrderBrand localOrderBrand = (LocalOrderBrand) other;
            return Intrinsics.areEqual(unknownFields(), localOrderBrand.unknownFields()) && Intrinsics.areEqual(this.token, localOrderBrand.token) && Intrinsics.areEqual(this.name, localOrderBrand.name) && Intrinsics.areEqual(this.cashtag, localOrderBrand.cashtag) && Intrinsics.areEqual(this.artwork_image, localOrderBrand.artwork_image) && Intrinsics.areEqual(this.brand_card_outline_color, localOrderBrand.brand_card_outline_color) && Intrinsics.areEqual(this.feature_set, localOrderBrand.feature_set) && Intrinsics.areEqual(this.background_color, localOrderBrand.background_color);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.cashtag;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            LocalImage localImage = this.artwork_image;
            int hashCode5 = (hashCode4 + (localImage != null ? localImage.hashCode() : 0)) * 37;
            LocalColor localColor = this.brand_card_outline_color;
            int hashCode6 = (hashCode5 + (localColor != null ? localColor.hashCode() : 0)) * 37;
            FeatureSet featureSet = this.feature_set;
            int hashCode7 = (hashCode6 + (featureSet != null ? featureSet.hashCode() : 0)) * 37;
            LocalColor localColor2 = this.background_color;
            int hashCode8 = hashCode7 + (localColor2 != null ? localColor2.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.token = this.token;
            builder.name = this.name;
            builder.cashtag = this.cashtag;
            builder.artwork_image = this.artwork_image;
            builder.brand_card_outline_color = this.brand_card_outline_color;
            builder.feature_set = this.feature_set;
            builder.background_color = this.background_color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
            }
            String str2 = this.name;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
            }
            if (this.cashtag != null) {
                arrayList.add("cashtag=██");
            }
            LocalImage localImage = this.artwork_image;
            if (localImage != null) {
                SizeMode$EnumUnboxingLocalUtility.m("artwork_image=", localImage, arrayList);
            }
            LocalColor localColor = this.brand_card_outline_color;
            if (localColor != null) {
                SizeMode$EnumUnboxingLocalUtility.m("brand_card_outline_color=", localColor, arrayList);
            }
            FeatureSet featureSet = this.feature_set;
            if (featureSet != null) {
                arrayList.add("feature_set=" + featureSet);
            }
            LocalColor localColor2 = this.background_color;
            if (localColor2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("background_color=", localColor2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LocalOrderBrand{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LocalOrderBrand$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LocalOrderBrand$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LocalOrderBrand;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LocalOrderBrand;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ LocalOrderBrand build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public LocalOrderBrand() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalOrderBrand(String str, String str2, String str3, LocalImage localImage, LocalColor localColor, FeatureSet featureSet, LocalColor localColor2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.token = str;
            this.name = str2;
            this.cashtag = str3;
            this.artwork_image = localImage;
            this.brand_card_outline_color = localColor;
            this.feature_set = featureSet;
            this.background_color = localColor2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0004H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0016R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LoyaltySummary;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LoyaltySummary$Builder;", "accumulated_loyalty_points", "", "potential_loyalty_points", "loyalty_program", "Lcom/squareup/protos/cash/local/client/v1/LocalLoyaltyProgram;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/squareup/protos/cash/local/client/v1/LocalLoyaltyProgram;Lokio/ByteString;)V", "Ljava/lang/Integer;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/squareup/protos/cash/local/client/v1/LocalLoyaltyProgram;Lokio/ByteString;)Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LoyaltySummary;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LoyaltySummary extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LoyaltySummary> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 0, tag = 1)
        public final Integer accumulated_loyalty_points;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalLoyaltyProgram#ADAPTER", schemaIndex = 2, tag = 4)
        public final LocalLoyaltyProgram loyalty_program;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
        public final Integer potential_loyalty_points;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LoyaltySummary$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LoyaltySummary;", "<init>", "()V", "accumulated_loyalty_points", "", "Ljava/lang/Integer;", "potential_loyalty_points", "loyalty_program", "Lcom/squareup/protos/cash/local/client/v1/LocalLoyaltyProgram;", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LoyaltySummary$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Integer accumulated_loyalty_points;
            public LocalLoyaltyProgram loyalty_program;
            public Integer potential_loyalty_points;

            public final Builder accumulated_loyalty_points(Integer accumulated_loyalty_points) {
                this.accumulated_loyalty_points = accumulated_loyalty_points;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public LoyaltySummary build() {
                return new LoyaltySummary(this.accumulated_loyalty_points, this.potential_loyalty_points, this.loyalty_program, buildUnknownFields());
            }

            public final Builder loyalty_program(LocalLoyaltyProgram loyalty_program) {
                this.loyalty_program = loyalty_program;
                return this;
            }

            public final Builder potential_loyalty_points(Integer potential_loyalty_points) {
                this.potential_loyalty_points = potential_loyalty_points;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LoyaltySummary.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalOrder$LoyaltySummary$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public LocalOrder.LoyaltySummary decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new LocalOrder.LoyaltySummary((Integer) obj, (Integer) obj2, (LocalLoyaltyProgram) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.INT32.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.INT32.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj3 = TransactorKt.decodeMessageOrMerge(LocalLoyaltyProgram.ADAPTER, reader, obj3);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LocalOrder.LoyaltySummary value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                    protoAdapter2.encodeWithTag(writer, 1, value.accumulated_loyalty_points);
                    protoAdapter2.encodeWithTag(writer, 2, value.potential_loyalty_points);
                    LocalLoyaltyProgram.ADAPTER.encodeWithTag(writer, 4, value.loyalty_program);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LocalOrder.LoyaltySummary value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                    return LocalLoyaltyProgram.ADAPTER.encodedSizeWithTag(4, value.loyalty_program) + protoAdapter2.encodedSizeWithTag(2, value.potential_loyalty_points) + protoAdapter2.encodedSizeWithTag(1, value.accumulated_loyalty_points) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LocalOrder.LoyaltySummary redact(LocalOrder.LoyaltySummary value) {
                    value.getClass();
                    LocalLoyaltyProgram localLoyaltyProgram = value.loyalty_program;
                    return LocalOrder.LoyaltySummary.copy$default(value, null, null, localLoyaltyProgram != null ? (LocalLoyaltyProgram) LocalLoyaltyProgram.ADAPTER.redact(localLoyaltyProgram) : null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LocalOrder.LoyaltySummary value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    LocalLoyaltyProgram.ADAPTER.encodeWithTag(writer, 4, value.loyalty_program);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                    protoAdapter2.encodeWithTag(writer, 2, value.potential_loyalty_points);
                    protoAdapter2.encodeWithTag(writer, 1, value.accumulated_loyalty_points);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ LoyaltySummary(Integer num, Integer num2, LocalLoyaltyProgram localLoyaltyProgram, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : localLoyaltyProgram, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ LoyaltySummary copy$default(LoyaltySummary loyaltySummary, Integer num, Integer num2, LocalLoyaltyProgram localLoyaltyProgram, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                num = loyaltySummary.accumulated_loyalty_points;
            }
            if ((i & 2) != 0) {
                num2 = loyaltySummary.potential_loyalty_points;
            }
            if ((i & 4) != 0) {
                localLoyaltyProgram = loyaltySummary.loyalty_program;
            }
            if ((i & 8) != 0) {
                byteString = loyaltySummary.unknownFields();
            }
            return loyaltySummary.copy(num, num2, localLoyaltyProgram, byteString);
        }

        public final LoyaltySummary copy(Integer accumulated_loyalty_points, Integer potential_loyalty_points, LocalLoyaltyProgram loyalty_program, ByteString unknownFields) {
            unknownFields.getClass();
            return new LoyaltySummary(accumulated_loyalty_points, potential_loyalty_points, loyalty_program, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof LoyaltySummary)) {
                return false;
            }
            LoyaltySummary loyaltySummary = (LoyaltySummary) other;
            return Intrinsics.areEqual(unknownFields(), loyaltySummary.unknownFields()) && Intrinsics.areEqual(this.accumulated_loyalty_points, loyaltySummary.accumulated_loyalty_points) && Intrinsics.areEqual(this.potential_loyalty_points, loyaltySummary.potential_loyalty_points) && Intrinsics.areEqual(this.loyalty_program, loyaltySummary.loyalty_program);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.accumulated_loyalty_points;
            int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Integer num2 = this.potential_loyalty_points;
            int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
            LocalLoyaltyProgram localLoyaltyProgram = this.loyalty_program;
            int hashCode4 = hashCode3 + (localLoyaltyProgram != null ? localLoyaltyProgram.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.accumulated_loyalty_points = this.accumulated_loyalty_points;
            builder.potential_loyalty_points = this.potential_loyalty_points;
            builder.loyalty_program = this.loyalty_program;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Integer num = this.accumulated_loyalty_points;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("accumulated_loyalty_points=", num, arrayList);
            }
            Integer num2 = this.potential_loyalty_points;
            if (num2 != null) {
                re$$ExternalSyntheticOutline0.m("potential_loyalty_points=", num2, arrayList);
            }
            LocalLoyaltyProgram localLoyaltyProgram = this.loyalty_program;
            if (localLoyaltyProgram != null) {
                arrayList.add("loyalty_program=" + localLoyaltyProgram);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LoyaltySummary{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LoyaltySummary$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LoyaltySummary$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LoyaltySummary;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalOrder$LoyaltySummary;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ LoyaltySummary build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public LoyaltySummary() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoyaltySummary(Integer num, Integer num2, LocalLoyaltyProgram localLoyaltyProgram, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.accumulated_loyalty_points = num;
            this.potential_loyalty_points = num2;
            this.loyalty_program = localLoyaltyProgram;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !Bu\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\u0014\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0082\u0004J\n\u0010\u001c\u001a\u00020\u0004H\u0096\u0080\u0004J\b\u0010\u001d\u001a\u00020\u0007H\u0016Jy\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u001fR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0015R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderStatus;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderStatus$Builder;", "current_status_index", "", "possible_statuses", "", "", "current_status_label", "current_status_sublabel", "current_status_heading", "current_status_fulfillment_label", "is_cancelled", "", "is_in_progress", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/ByteString;)V", "Ljava/lang/Integer;", "getCurrent_status_label$annotations", "()V", "getCurrent_status_sublabel$annotations", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/ByteString;)Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderStatus;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OrderStatus extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OrderStatus> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
        public final String current_status_fulfillment_label;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
        public final String current_status_heading;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 0, tag = 1)
        public final Integer current_status_index;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String current_status_label;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String current_status_sublabel;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 6, tag = 7)
        public final Boolean is_cancelled;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 7, tag = 8)
        public final Boolean is_in_progress;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        public final List<String> possible_statuses;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0013J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0012\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007J\u0012\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0007J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\nJ\u0015\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderStatus$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderStatus;", "<init>", "()V", "current_status_index", "", "Ljava/lang/Integer;", "possible_statuses", "", "", "current_status_label", "current_status_sublabel", "current_status_heading", "current_status_fulfillment_label", "is_cancelled", "", "Ljava/lang/Boolean;", "is_in_progress", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderStatus$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderStatus$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String current_status_fulfillment_label;
            public String current_status_heading;
            public Integer current_status_index;
            public String current_status_label;
            public String current_status_sublabel;
            public Boolean is_cancelled;
            public Boolean is_in_progress;
            public List<String> possible_statuses = EmptyList.INSTANCE;

            @Override // com.squareup.wire.Message.Builder
            public OrderStatus build() {
                return new OrderStatus(this.current_status_index, this.possible_statuses, this.current_status_label, this.current_status_sublabel, this.current_status_heading, this.current_status_fulfillment_label, this.is_cancelled, this.is_in_progress, buildUnknownFields());
            }

            public final Builder current_status_fulfillment_label(String current_status_fulfillment_label) {
                this.current_status_fulfillment_label = current_status_fulfillment_label;
                return this;
            }

            public final Builder current_status_heading(String current_status_heading) {
                this.current_status_heading = current_status_heading;
                return this;
            }

            public final Builder current_status_index(Integer current_status_index) {
                this.current_status_index = current_status_index;
                return this;
            }

            @Deprecated
            public final Builder current_status_label(String current_status_label) {
                this.current_status_label = current_status_label;
                return this;
            }

            @Deprecated
            public final Builder current_status_sublabel(String current_status_sublabel) {
                this.current_status_sublabel = current_status_sublabel;
                return this;
            }

            public final Builder is_cancelled(Boolean is_cancelled) {
                this.is_cancelled = is_cancelled;
                return this;
            }

            public final Builder is_in_progress(Boolean is_in_progress) {
                this.is_in_progress = is_in_progress;
                return this;
            }

            public final Builder possible_statuses(List<String> possible_statuses) {
                possible_statuses.getClass();
                TransactorKt.checkElementsNotNull(possible_statuses);
                this.possible_statuses = possible_statuses;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OrderStatus.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalOrder$OrderStatus$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public LocalOrder.OrderStatus decode(ProtoReader reader) {
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
                            return new LocalOrder.OrderStatus((Integer) obj, m, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (Boolean) obj6, (Boolean) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.UINT32.decode(reader);
                                break;
                            case 2:
                                m.add(ProtoAdapter.STRING.decode(reader));
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
                                obj6 = ProtoAdapter.BOOL.decode(reader);
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
                public void encode(ProtoWriter writer, LocalOrder.OrderStatus value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.UINT32.encodeWithTag(writer, 1, value.current_status_index);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.asRepeated().encodeWithTag(writer, 2, value.possible_statuses);
                    protoAdapter2.encodeWithTag(writer, 3, value.current_status_label);
                    protoAdapter2.encodeWithTag(writer, 4, value.current_status_sublabel);
                    protoAdapter2.encodeWithTag(writer, 5, value.current_status_heading);
                    protoAdapter2.encodeWithTag(writer, 6, value.current_status_fulfillment_label);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                    protoAdapter3.encodeWithTag(writer, 7, value.is_cancelled);
                    protoAdapter3.encodeWithTag(writer, 8, value.is_in_progress);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LocalOrder.OrderStatus value) {
                    value.getClass();
                    int encodedSizeWithTag = ProtoAdapter.UINT32.encodedSizeWithTag(1, value.current_status_index) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(6, value.current_status_fulfillment_label) + protoAdapter2.encodedSizeWithTag(5, value.current_status_heading) + protoAdapter2.encodedSizeWithTag(4, value.current_status_sublabel) + protoAdapter2.encodedSizeWithTag(3, value.current_status_label) + protoAdapter2.asRepeated().encodedSizeWithTag(2, value.possible_statuses) + encodedSizeWithTag;
                    ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                    return protoAdapter3.encodedSizeWithTag(8, value.is_in_progress) + protoAdapter3.encodedSizeWithTag(7, value.is_cancelled) + encodedSizeWithTag2;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LocalOrder.OrderStatus redact(LocalOrder.OrderStatus value) {
                    value.getClass();
                    return LocalOrder.OrderStatus.copy$default(value, null, null, null, null, null, null, null, null, ByteString.EMPTY, 255, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LocalOrder.OrderStatus value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                    protoAdapter2.encodeWithTag(writer, 8, value.is_in_progress);
                    protoAdapter2.encodeWithTag(writer, 7, value.is_cancelled);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                    protoAdapter3.encodeWithTag(writer, 6, value.current_status_fulfillment_label);
                    protoAdapter3.encodeWithTag(writer, 5, value.current_status_heading);
                    protoAdapter3.encodeWithTag(writer, 4, value.current_status_sublabel);
                    protoAdapter3.encodeWithTag(writer, 3, value.current_status_label);
                    protoAdapter3.asRepeated().encodeWithTag(writer, 2, value.possible_statuses);
                    ProtoAdapter.UINT32.encodeWithTag(writer, 1, value.current_status_index);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public OrderStatus(Integer num, List list, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? EmptyList.INSTANCE : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ OrderStatus copy$default(OrderStatus orderStatus, Integer num, List list, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                num = orderStatus.current_status_index;
            }
            if ((i & 2) != 0) {
                list = orderStatus.possible_statuses;
            }
            if ((i & 4) != 0) {
                str = orderStatus.current_status_label;
            }
            if ((i & 8) != 0) {
                str2 = orderStatus.current_status_sublabel;
            }
            if ((i & 16) != 0) {
                str3 = orderStatus.current_status_heading;
            }
            if ((i & 32) != 0) {
                str4 = orderStatus.current_status_fulfillment_label;
            }
            if ((i & 64) != 0) {
                bool = orderStatus.is_cancelled;
            }
            if ((i & 128) != 0) {
                bool2 = orderStatus.is_in_progress;
            }
            if ((i & 256) != 0) {
                byteString = orderStatus.unknownFields();
            }
            Boolean bool3 = bool2;
            ByteString byteString2 = byteString;
            String str5 = str4;
            Boolean bool4 = bool;
            String str6 = str3;
            String str7 = str;
            return orderStatus.copy(num, list, str7, str2, str6, str5, bool4, bool3, byteString2);
        }

        @Deprecated
        public static /* synthetic */ void getCurrent_status_label$annotations() {
        }

        @Deprecated
        public static /* synthetic */ void getCurrent_status_sublabel$annotations() {
        }

        public final OrderStatus copy(Integer current_status_index, List<String> possible_statuses, String current_status_label, String current_status_sublabel, String current_status_heading, String current_status_fulfillment_label, Boolean is_cancelled, Boolean is_in_progress, ByteString unknownFields) {
            possible_statuses.getClass();
            unknownFields.getClass();
            return new OrderStatus(current_status_index, possible_statuses, current_status_label, current_status_sublabel, current_status_heading, current_status_fulfillment_label, is_cancelled, is_in_progress, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof OrderStatus)) {
                return false;
            }
            OrderStatus orderStatus = (OrderStatus) other;
            return Intrinsics.areEqual(unknownFields(), orderStatus.unknownFields()) && Intrinsics.areEqual(this.current_status_index, orderStatus.current_status_index) && Intrinsics.areEqual(this.possible_statuses, orderStatus.possible_statuses) && Intrinsics.areEqual(this.current_status_label, orderStatus.current_status_label) && Intrinsics.areEqual(this.current_status_sublabel, orderStatus.current_status_sublabel) && Intrinsics.areEqual(this.current_status_heading, orderStatus.current_status_heading) && Intrinsics.areEqual(this.current_status_fulfillment_label, orderStatus.current_status_fulfillment_label) && Intrinsics.areEqual(this.is_cancelled, orderStatus.is_cancelled) && Intrinsics.areEqual(this.is_in_progress, orderStatus.is_in_progress);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.current_status_index;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37, 37, this.possible_statuses);
            String str = this.current_status_label;
            int hashCode2 = (m + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.current_status_sublabel;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.current_status_heading;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.current_status_fulfillment_label;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            Boolean bool = this.is_cancelled;
            int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.is_in_progress;
            int hashCode7 = hashCode6 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.current_status_index = this.current_status_index;
            builder.possible_statuses = this.possible_statuses;
            builder.current_status_label = this.current_status_label;
            builder.current_status_sublabel = this.current_status_sublabel;
            builder.current_status_heading = this.current_status_heading;
            builder.current_status_fulfillment_label = this.current_status_fulfillment_label;
            builder.is_cancelled = this.is_cancelled;
            builder.is_in_progress = this.is_in_progress;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Integer num = this.current_status_index;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("current_status_index=", num, arrayList);
            }
            if (!this.possible_statuses.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("possible_statuses=", arrayList, this.possible_statuses);
            }
            String str = this.current_status_label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "current_status_label=", arrayList);
            }
            String str2 = this.current_status_sublabel;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "current_status_sublabel=", arrayList);
            }
            String str3 = this.current_status_heading;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "current_status_heading=", arrayList);
            }
            String str4 = this.current_status_fulfillment_label;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "current_status_fulfillment_label=", arrayList);
            }
            Boolean bool = this.is_cancelled;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_cancelled=", bool, arrayList);
            }
            Boolean bool2 = this.is_in_progress;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_in_progress=", bool2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OrderStatus{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderStatus$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderStatus$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderStatus;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalOrder$OrderStatus;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ OrderStatus build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public OrderStatus() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderStatus(Integer num, List<String> list, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.current_status_index = num;
            this.current_status_label = str;
            this.current_status_sublabel = str2;
            this.current_status_heading = str3;
            this.current_status_fulfillment_label = str4;
            this.is_cancelled = bool;
            this.is_in_progress = bool2;
            this.possible_statuses = TransactorKt.immutableCopyOf("possible_statuses", list);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$PaymentSummary;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$PaymentSummary$Builder;", "card_brand", "", "last_4", "payment_option", "Lcom/squareup/protos/cash/local/client/v1/LocalPaymentOption;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/local/client/v1/LocalPaymentOption;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaymentSummary extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PaymentSummary> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String card_brand;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String last_4;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalPaymentOption#ADAPTER", schemaIndex = 2, tag = 3)
        public final LocalPaymentOption payment_option;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$PaymentSummary$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$PaymentSummary;", "<init>", "()V", "card_brand", "", "last_4", "payment_option", "Lcom/squareup/protos/cash/local/client/v1/LocalPaymentOption;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String card_brand;
            public String last_4;
            public LocalPaymentOption payment_option;

            @Override // com.squareup.wire.Message.Builder
            public PaymentSummary build() {
                return new PaymentSummary(this.card_brand, this.last_4, this.payment_option, buildUnknownFields());
            }

            public final Builder card_brand(String card_brand) {
                this.card_brand = card_brand;
                return this;
            }

            public final Builder last_4(String last_4) {
                this.last_4 = last_4;
                return this;
            }

            public final Builder payment_option(LocalPaymentOption payment_option) {
                this.payment_option = payment_option;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PaymentSummary.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalOrder$PaymentSummary$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public LocalOrder.PaymentSummary decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new LocalOrder.PaymentSummary((String) obj, (String) obj2, (LocalPaymentOption) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                obj3 = LocalPaymentOption.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LocalOrder.PaymentSummary value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.card_brand);
                    protoAdapter2.encodeWithTag(writer, 2, value.last_4);
                    LocalPaymentOption.ADAPTER.encodeWithTag(writer, 3, value.payment_option);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LocalOrder.PaymentSummary value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return LocalPaymentOption.ADAPTER.encodedSizeWithTag(3, value.payment_option) + protoAdapter2.encodedSizeWithTag(2, value.last_4) + protoAdapter2.encodedSizeWithTag(1, value.card_brand) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LocalOrder.PaymentSummary redact(LocalOrder.PaymentSummary value) {
                    value.getClass();
                    return LocalOrder.PaymentSummary.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LocalOrder.PaymentSummary value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    LocalPaymentOption.ADAPTER.encodeWithTag(writer, 3, value.payment_option);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.last_4);
                    protoAdapter2.encodeWithTag(writer, 1, value.card_brand);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ PaymentSummary(String str, String str2, LocalPaymentOption localPaymentOption, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : localPaymentOption, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ PaymentSummary copy$default(PaymentSummary paymentSummary, String str, String str2, LocalPaymentOption localPaymentOption, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentSummary.card_brand;
            }
            if ((i & 2) != 0) {
                str2 = paymentSummary.last_4;
            }
            if ((i & 4) != 0) {
                localPaymentOption = paymentSummary.payment_option;
            }
            if ((i & 8) != 0) {
                byteString = paymentSummary.unknownFields();
            }
            return paymentSummary.copy(str, str2, localPaymentOption, byteString);
        }

        public final PaymentSummary copy(String card_brand, String last_4, LocalPaymentOption payment_option, ByteString unknownFields) {
            unknownFields.getClass();
            return new PaymentSummary(card_brand, last_4, payment_option, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PaymentSummary)) {
                return false;
            }
            PaymentSummary paymentSummary = (PaymentSummary) other;
            return Intrinsics.areEqual(unknownFields(), paymentSummary.unknownFields()) && Intrinsics.areEqual(this.card_brand, paymentSummary.card_brand) && Intrinsics.areEqual(this.last_4, paymentSummary.last_4) && this.payment_option == paymentSummary.payment_option;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.card_brand;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.last_4;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            LocalPaymentOption localPaymentOption = this.payment_option;
            int hashCode4 = hashCode3 + (localPaymentOption != null ? localPaymentOption.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.card_brand = this.card_brand;
            builder.last_4 = this.last_4;
            builder.payment_option = this.payment_option;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.card_brand;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "card_brand=", arrayList);
            }
            String str2 = this.last_4;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "last_4=", arrayList);
            }
            LocalPaymentOption localPaymentOption = this.payment_option;
            if (localPaymentOption != null) {
                arrayList.add("payment_option=" + localPaymentOption);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentSummary{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$PaymentSummary$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$PaymentSummary$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$PaymentSummary;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalOrder$PaymentSummary;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ PaymentSummary build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public PaymentSummary() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentSummary(String str, String str2, LocalPaymentOption localPaymentOption, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.card_brand = str;
            this.last_4 = str2;
            this.payment_option = localPaymentOption;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOrder$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalOrder;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalOrder;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ LocalOrder build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
