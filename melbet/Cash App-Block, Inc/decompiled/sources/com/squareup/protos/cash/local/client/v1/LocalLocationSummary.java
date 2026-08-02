package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalActionOrdering;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u000276R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0005R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u000f\u0012\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u000f\u0012\u0004\b$\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0005R\u0016\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000,8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020,8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010/R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040,8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010/¨\u00068"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalLocationSummary;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalLocationSummary$Builder;", "", "token", "Ljava/lang/String;", "Lcom/squareup/protos/cash/local/client/v1/LocalAddress;", "address", "Lcom/squareup/protos/cash/local/client/v1/LocalAddress;", "time_zone", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenStatus;", "open_status", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenStatus;", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours;", "open_hours", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours;", "name", "Lcom/squareup/protos/cash/local/client/v1/LocalPhone;", "phone", "Lcom/squareup/protos/cash/local/client/v1/LocalPhone;", "fulfillment_instructions", "Lcom/squareup/protos/cash/local/client/v1/LocalEstimatedCompletionDuration;", "estimated_pickup_wait_time", "Lcom/squareup/protos/cash/local/client/v1/LocalEstimatedCompletionDuration;", "distance_to_buyer", "", "pickup_fulfillment_scheduling_enabled", "Ljava/lang/Boolean;", "delivery_fulfillment_scheduling_enabled", "Lcom/squareup/protos/cash/local/client/v1/LocalActionOrdering$OrderingMode;", "ordering_mode", "Lcom/squareup/protos/cash/local/client/v1/LocalActionOrdering$OrderingMode;", "pickup_hours", "getPickup_hours$annotations", "()V", "delivery_hours", "getDelivery_hours$annotations", "Lcom/squareup/protos/cash/local/client/v1/InStoreOrderingFulfillmentConfiguration;", "in_store_ordering_configuration", "Lcom/squareup/protos/cash/local/client/v1/InStoreOrderingFulfillmentConfiguration;", "ordering_mode_message", "Lcom/squareup/protos/cash/local/client/v1/CurbsidePickupSettings;", "curbside_pickup_settings", "Lcom/squareup/protos/cash/local/client/v1/CurbsidePickupSettings;", "", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillmentType;", "available_fulfillment_types", "Ljava/util/List;", "Lcom/squareup/protos/cash/local/client/v1/FulfillmentHours;", "fulfillment_hours", "Lcom/squareup/protos/cash/local/client/v1/FulfillmentLargeOrderLimits;", "large_order_limits", "Lcom/squareup/protos/cash/local/client/v1/FreeFulfillmentConfiguration;", "free_fulfillment_configurations", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LocalLocationSummary extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalLocationSummary> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalAddress#ADAPTER", schemaIndex = 1, tag = 2)
    public final LocalAddress address;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalFulfillmentType#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 8, tag = 9)
    public final List<LocalFulfillmentType> available_fulfillment_types;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.CurbsidePickupSettings#ADAPTER", schemaIndex = 20, tag = 21)
    public final CurbsidePickupSettings curbside_pickup_settings;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 12, tag = 13)
    public final Boolean delivery_fulfillment_scheduling_enabled;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalOpenHours#ADAPTER", schemaIndex = 15, tag = 16)
    public final LocalOpenHours delivery_hours;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 11)
    public final String distance_to_buyer;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalEstimatedCompletionDuration#ADAPTER", schemaIndex = 9, tag = 10)
    public final LocalEstimatedCompletionDuration estimated_pickup_wait_time;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.FreeFulfillmentConfiguration#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 21, tag = 22)
    public final List<FreeFulfillmentConfiguration> free_fulfillment_configurations;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.FulfillmentHours#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 16, tag = 17)
    public final List<FulfillmentHours> fulfillment_hours;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    public final String fulfillment_instructions;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.InStoreOrderingFulfillmentConfiguration#ADAPTER", schemaIndex = 17, tag = 18)
    public final InStoreOrderingFulfillmentConfiguration in_store_ordering_configuration;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.FulfillmentLargeOrderLimits#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 19, tag = 20)
    public final List<FulfillmentLargeOrderLimits> large_order_limits;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String name;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalOpenHours#ADAPTER", schemaIndex = 4, tag = 5)
    public final LocalOpenHours open_hours;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalOpenStatus#ADAPTER", schemaIndex = 3, tag = 4)
    public final LocalOpenStatus open_status;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalActionOrdering$OrderingMode#ADAPTER", schemaIndex = 13, tag = 14)
    public final LocalActionOrdering.OrderingMode ordering_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 18, tag = 19)
    public final String ordering_mode_message;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalPhone#ADAPTER", schemaIndex = 6, tag = 7)
    public final LocalPhone phone;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 11, tag = 12)
    public final Boolean pickup_fulfillment_scheduling_enabled;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalOpenHours#ADAPTER", schemaIndex = 14, tag = 15)
    public final LocalOpenHours pickup_hours;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String time_zone;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, schemaIndex = 0, tag = 1)
    public final String token;

    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0012\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010+J\u0015\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010+J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0012\u0010\u001e\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0007J\u0012\u0010\u001f\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\rH\u0007J\u0014\u0010 \u001a\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0013J\u0010\u0010\"\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010#J\u0010\u0010$\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0006J\u0014\u0010%\u001a\u00020\u00002\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0013J\u0010\u0010'\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010(J\u0014\u0010)\u001a\u00020\u00002\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0013J\b\u0010,\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001aR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalLocationSummary$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalLocationSummary;", "<init>", "()V", "token", "", "address", "Lcom/squareup/protos/cash/local/client/v1/LocalAddress;", "time_zone", "open_status", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenStatus;", "open_hours", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours;", "name", "phone", "Lcom/squareup/protos/cash/local/client/v1/LocalPhone;", "fulfillment_instructions", "available_fulfillment_types", "", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillmentType;", "estimated_pickup_wait_time", "Lcom/squareup/protos/cash/local/client/v1/LocalEstimatedCompletionDuration;", "distance_to_buyer", "pickup_fulfillment_scheduling_enabled", "", "Ljava/lang/Boolean;", "delivery_fulfillment_scheduling_enabled", "ordering_mode", "Lcom/squareup/protos/cash/local/client/v1/LocalActionOrdering$OrderingMode;", "pickup_hours", "delivery_hours", "fulfillment_hours", "Lcom/squareup/protos/cash/local/client/v1/FulfillmentHours;", "in_store_ordering_configuration", "Lcom/squareup/protos/cash/local/client/v1/InStoreOrderingFulfillmentConfiguration;", "ordering_mode_message", "large_order_limits", "Lcom/squareup/protos/cash/local/client/v1/FulfillmentLargeOrderLimits;", "curbside_pickup_settings", "Lcom/squareup/protos/cash/local/client/v1/CurbsidePickupSettings;", "free_fulfillment_configurations", "Lcom/squareup/protos/cash/local/client/v1/FreeFulfillmentConfiguration;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/local/client/v1/LocalLocationSummary$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public LocalAddress address;
        public List<? extends LocalFulfillmentType> available_fulfillment_types;
        public CurbsidePickupSettings curbside_pickup_settings;
        public Boolean delivery_fulfillment_scheduling_enabled;
        public LocalOpenHours delivery_hours;
        public String distance_to_buyer;
        public LocalEstimatedCompletionDuration estimated_pickup_wait_time;
        public List<FreeFulfillmentConfiguration> free_fulfillment_configurations;
        public List<FulfillmentHours> fulfillment_hours;
        public String fulfillment_instructions;
        public InStoreOrderingFulfillmentConfiguration in_store_ordering_configuration;
        public List<FulfillmentLargeOrderLimits> large_order_limits;
        public String name;
        public LocalOpenHours open_hours;
        public LocalOpenStatus open_status;
        public LocalActionOrdering.OrderingMode ordering_mode;
        public String ordering_mode_message;
        public LocalPhone phone;
        public Boolean pickup_fulfillment_scheduling_enabled;
        public LocalOpenHours pickup_hours;
        public String time_zone;
        public String token;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.available_fulfillment_types = emptyList;
            this.fulfillment_hours = emptyList;
            this.large_order_limits = emptyList;
            this.free_fulfillment_configurations = emptyList;
        }

        public final Builder address(LocalAddress address) {
            this.address = address;
            return this;
        }

        public final Builder available_fulfillment_types(List<? extends LocalFulfillmentType> available_fulfillment_types) {
            available_fulfillment_types.getClass();
            TransactorKt.checkElementsNotNull(available_fulfillment_types);
            this.available_fulfillment_types = available_fulfillment_types;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public LocalLocationSummary build() {
            String str = this.token;
            if (str != null) {
                return new LocalLocationSummary(str, this.address, this.time_zone, this.open_status, this.open_hours, this.name, this.phone, this.fulfillment_instructions, this.available_fulfillment_types, this.estimated_pickup_wait_time, this.distance_to_buyer, this.pickup_fulfillment_scheduling_enabled, this.delivery_fulfillment_scheduling_enabled, this.ordering_mode, this.pickup_hours, this.delivery_hours, this.fulfillment_hours, this.in_store_ordering_configuration, this.ordering_mode_message, this.large_order_limits, this.curbside_pickup_settings, this.free_fulfillment_configurations, buildUnknownFields());
            }
            TransactorKt.missingRequiredFields(str, "token");
            throw null;
        }

        public final Builder curbside_pickup_settings(CurbsidePickupSettings curbside_pickup_settings) {
            this.curbside_pickup_settings = curbside_pickup_settings;
            return this;
        }

        public final Builder delivery_fulfillment_scheduling_enabled(Boolean delivery_fulfillment_scheduling_enabled) {
            this.delivery_fulfillment_scheduling_enabled = delivery_fulfillment_scheduling_enabled;
            return this;
        }

        @Deprecated
        public final Builder delivery_hours(LocalOpenHours delivery_hours) {
            this.delivery_hours = delivery_hours;
            return this;
        }

        public final Builder distance_to_buyer(String distance_to_buyer) {
            this.distance_to_buyer = distance_to_buyer;
            return this;
        }

        public final Builder estimated_pickup_wait_time(LocalEstimatedCompletionDuration estimated_pickup_wait_time) {
            this.estimated_pickup_wait_time = estimated_pickup_wait_time;
            return this;
        }

        public final Builder free_fulfillment_configurations(List<FreeFulfillmentConfiguration> free_fulfillment_configurations) {
            free_fulfillment_configurations.getClass();
            TransactorKt.checkElementsNotNull(free_fulfillment_configurations);
            this.free_fulfillment_configurations = free_fulfillment_configurations;
            return this;
        }

        public final Builder fulfillment_hours(List<FulfillmentHours> fulfillment_hours) {
            fulfillment_hours.getClass();
            TransactorKt.checkElementsNotNull(fulfillment_hours);
            this.fulfillment_hours = fulfillment_hours;
            return this;
        }

        public final Builder fulfillment_instructions(String fulfillment_instructions) {
            this.fulfillment_instructions = fulfillment_instructions;
            return this;
        }

        public final Builder in_store_ordering_configuration(InStoreOrderingFulfillmentConfiguration in_store_ordering_configuration) {
            this.in_store_ordering_configuration = in_store_ordering_configuration;
            return this;
        }

        public final Builder large_order_limits(List<FulfillmentLargeOrderLimits> large_order_limits) {
            large_order_limits.getClass();
            TransactorKt.checkElementsNotNull(large_order_limits);
            this.large_order_limits = large_order_limits;
            return this;
        }

        public final Builder name(String name) {
            this.name = name;
            return this;
        }

        public final Builder open_hours(LocalOpenHours open_hours) {
            this.open_hours = open_hours;
            return this;
        }

        public final Builder open_status(LocalOpenStatus open_status) {
            this.open_status = open_status;
            return this;
        }

        public final Builder ordering_mode(LocalActionOrdering.OrderingMode ordering_mode) {
            this.ordering_mode = ordering_mode;
            return this;
        }

        public final Builder ordering_mode_message(String ordering_mode_message) {
            this.ordering_mode_message = ordering_mode_message;
            return this;
        }

        public final Builder phone(LocalPhone phone) {
            this.phone = phone;
            return this;
        }

        public final Builder pickup_fulfillment_scheduling_enabled(Boolean pickup_fulfillment_scheduling_enabled) {
            this.pickup_fulfillment_scheduling_enabled = pickup_fulfillment_scheduling_enabled;
            return this;
        }

        @Deprecated
        public final Builder pickup_hours(LocalOpenHours pickup_hours) {
            this.pickup_hours = pickup_hours;
            return this;
        }

        public final Builder time_zone(String time_zone) {
            this.time_zone = time_zone;
            return this;
        }

        public final Builder token(String token) {
            token.getClass();
            this.token = token;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LocalLocationSummary.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalLocationSummary$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public LocalLocationSummary decode(ProtoReader reader) {
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                long beginMessage = reader.beginMessage();
                Object obj = null;
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
                Object obj12 = null;
                Object obj13 = null;
                Object obj14 = null;
                Object obj15 = null;
                Object obj16 = null;
                Object obj17 = null;
                Object obj18 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        ArrayList arrayList7 = arrayList4;
                        ArrayList arrayList8 = arrayList5;
                        ArrayList arrayList9 = arrayList6;
                        ByteString endMessageAndGetUnknownFields = reader.endMessageAndGetUnknownFields(beginMessage);
                        Object obj19 = obj16;
                        String str = (String) obj18;
                        if (str != null) {
                            return new LocalLocationSummary(str, (LocalAddress) obj3, (String) obj14, (LocalOpenStatus) obj15, (LocalOpenHours) obj6, (String) obj19, (LocalPhone) obj8, (String) obj9, m, (LocalEstimatedCompletionDuration) obj, (String) obj10, (Boolean) obj11, (Boolean) obj12, (LocalActionOrdering.OrderingMode) obj13, (LocalOpenHours) obj4, (LocalOpenHours) obj5, arrayList7, (InStoreOrderingFulfillmentConfiguration) obj7, (String) obj17, arrayList8, (CurbsidePickupSettings) obj2, arrayList9, endMessageAndGetUnknownFields);
                        }
                        TransactorKt.missingRequiredFields(obj18, "token");
                        throw null;
                    }
                    switch (nextTag) {
                        case 1:
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList6;
                            obj18 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList6;
                            obj3 = TransactorKt.decodeMessageOrMerge(LocalAddress.ADAPTER, reader, obj3);
                            break;
                        case 3:
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList6;
                            obj14 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList6;
                            try {
                                obj15 = LocalOpenStatus.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 5:
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList6;
                            obj6 = TransactorKt.decodeMessageOrMerge(LocalOpenHours.ADAPTER, reader, obj6);
                            break;
                        case 6:
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList6;
                            obj16 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 7:
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList6;
                            obj8 = TransactorKt.decodeMessageOrMerge(LocalPhone.ADAPTER, reader, obj8);
                            break;
                        case 8:
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList6;
                            obj9 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 9:
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            try {
                                LocalFulfillmentType.ADAPTER.tryDecode(reader, m);
                                arrayList3 = arrayList6;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                arrayList3 = arrayList6;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 10:
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            obj = TransactorKt.decodeMessageOrMerge(LocalEstimatedCompletionDuration.ADAPTER, reader, obj);
                            arrayList3 = arrayList6;
                            break;
                        case 11:
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            obj10 = ProtoAdapter.STRING.decode(reader);
                            arrayList3 = arrayList6;
                            break;
                        case 12:
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            obj11 = ProtoAdapter.BOOL.decode(reader);
                            arrayList3 = arrayList6;
                            break;
                        case 13:
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            obj12 = ProtoAdapter.BOOL.decode(reader);
                            arrayList3 = arrayList6;
                            break;
                        case 14:
                            try {
                                obj13 = LocalActionOrdering.OrderingMode.ADAPTER.decode(reader);
                                arrayList = arrayList4;
                                arrayList2 = arrayList5;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                arrayList = arrayList4;
                                arrayList2 = arrayList5;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            arrayList3 = arrayList6;
                            break;
                        case 15:
                            obj4 = TransactorKt.decodeMessageOrMerge(LocalOpenHours.ADAPTER, reader, obj4);
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList6;
                            break;
                        case 16:
                            obj5 = TransactorKt.decodeMessageOrMerge(LocalOpenHours.ADAPTER, reader, obj5);
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList6;
                            break;
                        case 17:
                            arrayList4.add(FulfillmentHours.ADAPTER.decode(reader));
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList6;
                            break;
                        case 18:
                            obj7 = TransactorKt.decodeMessageOrMerge(InStoreOrderingFulfillmentConfiguration.ADAPTER, reader, obj7);
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList6;
                            break;
                        case 19:
                            obj17 = ProtoAdapter.STRING.decode(reader);
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList6;
                            break;
                        case 20:
                            arrayList5.add(FulfillmentLargeOrderLimits.ADAPTER.decode(reader));
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList6;
                            break;
                        case 21:
                            obj2 = TransactorKt.decodeMessageOrMerge(CurbsidePickupSettings.ADAPTER, reader, obj2);
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList6;
                            break;
                        case 22:
                            arrayList6.add(FreeFulfillmentConfiguration.ADAPTER.decode(reader));
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList6;
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList6;
                            break;
                    }
                    arrayList6 = arrayList3;
                    arrayList4 = arrayList;
                    arrayList5 = arrayList2;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LocalLocationSummary value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.token);
                LocalAddress.ADAPTER.encodeWithTag(writer, 2, value.address);
                protoAdapter2.encodeWithTag(writer, 3, value.time_zone);
                LocalOpenStatus.ADAPTER.encodeWithTag(writer, 4, value.open_status);
                ProtoAdapter protoAdapter3 = LocalOpenHours.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 5, value.open_hours);
                protoAdapter2.encodeWithTag(writer, 6, value.name);
                LocalPhone.ADAPTER.encodeWithTag(writer, 7, value.phone);
                protoAdapter2.encodeWithTag(writer, 8, value.fulfillment_instructions);
                LocalFulfillmentType.ADAPTER.asRepeated().encodeWithTag(writer, 9, value.available_fulfillment_types);
                LocalEstimatedCompletionDuration.ADAPTER.encodeWithTag(writer, 10, value.estimated_pickup_wait_time);
                protoAdapter2.encodeWithTag(writer, 11, value.distance_to_buyer);
                ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                protoAdapter4.encodeWithTag(writer, 12, value.pickup_fulfillment_scheduling_enabled);
                protoAdapter4.encodeWithTag(writer, 13, value.delivery_fulfillment_scheduling_enabled);
                LocalActionOrdering.OrderingMode.ADAPTER.encodeWithTag(writer, 14, value.ordering_mode);
                protoAdapter3.encodeWithTag(writer, 15, value.pickup_hours);
                protoAdapter3.encodeWithTag(writer, 16, value.delivery_hours);
                FulfillmentHours.ADAPTER.asRepeated().encodeWithTag(writer, 17, value.fulfillment_hours);
                InStoreOrderingFulfillmentConfiguration.ADAPTER.encodeWithTag(writer, 18, value.in_store_ordering_configuration);
                protoAdapter2.encodeWithTag(writer, 19, value.ordering_mode_message);
                FulfillmentLargeOrderLimits.ADAPTER.asRepeated().encodeWithTag(writer, 20, value.large_order_limits);
                CurbsidePickupSettings.ADAPTER.encodeWithTag(writer, 21, value.curbside_pickup_settings);
                FreeFulfillmentConfiguration.ADAPTER.asRepeated().encodeWithTag(writer, 22, value.free_fulfillment_configurations);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LocalLocationSummary value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = LocalOpenStatus.ADAPTER.encodedSizeWithTag(4, value.open_status) + protoAdapter2.encodedSizeWithTag(3, value.time_zone) + LocalAddress.ADAPTER.encodedSizeWithTag(2, value.address) + protoAdapter2.encodedSizeWithTag(1, value.token) + size$okio;
                ProtoAdapter protoAdapter3 = LocalOpenHours.ADAPTER;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(11, value.distance_to_buyer) + LocalEstimatedCompletionDuration.ADAPTER.encodedSizeWithTag(10, value.estimated_pickup_wait_time) + LocalFulfillmentType.ADAPTER.asRepeated().encodedSizeWithTag(9, value.available_fulfillment_types) + protoAdapter2.encodedSizeWithTag(8, value.fulfillment_instructions) + LocalPhone.ADAPTER.encodedSizeWithTag(7, value.phone) + protoAdapter2.encodedSizeWithTag(6, value.name) + protoAdapter3.encodedSizeWithTag(5, value.open_hours) + encodedSizeWithTag;
                ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                return FreeFulfillmentConfiguration.ADAPTER.asRepeated().encodedSizeWithTag(22, value.free_fulfillment_configurations) + CurbsidePickupSettings.ADAPTER.encodedSizeWithTag(21, value.curbside_pickup_settings) + FulfillmentLargeOrderLimits.ADAPTER.asRepeated().encodedSizeWithTag(20, value.large_order_limits) + protoAdapter2.encodedSizeWithTag(19, value.ordering_mode_message) + InStoreOrderingFulfillmentConfiguration.ADAPTER.encodedSizeWithTag(18, value.in_store_ordering_configuration) + FulfillmentHours.ADAPTER.asRepeated().encodedSizeWithTag(17, value.fulfillment_hours) + protoAdapter3.encodedSizeWithTag(16, value.delivery_hours) + protoAdapter3.encodedSizeWithTag(15, value.pickup_hours) + LocalActionOrdering.OrderingMode.ADAPTER.encodedSizeWithTag(14, value.ordering_mode) + protoAdapter4.encodedSizeWithTag(13, value.delivery_fulfillment_scheduling_enabled) + protoAdapter4.encodedSizeWithTag(12, value.pickup_fulfillment_scheduling_enabled) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LocalLocationSummary redact(LocalLocationSummary value) {
                value.getClass();
                LocalAddress localAddress = value.address;
                LocalAddress localAddress2 = localAddress != null ? (LocalAddress) LocalAddress.ADAPTER.redact(localAddress) : null;
                LocalOpenHours localOpenHours = value.open_hours;
                LocalOpenHours localOpenHours2 = localOpenHours != null ? (LocalOpenHours) LocalOpenHours.ADAPTER.redact(localOpenHours) : null;
                LocalPhone localPhone = value.phone;
                LocalPhone localPhone2 = localPhone != null ? (LocalPhone) LocalPhone.ADAPTER.redact(localPhone) : null;
                LocalEstimatedCompletionDuration localEstimatedCompletionDuration = value.estimated_pickup_wait_time;
                LocalEstimatedCompletionDuration localEstimatedCompletionDuration2 = localEstimatedCompletionDuration != null ? (LocalEstimatedCompletionDuration) LocalEstimatedCompletionDuration.ADAPTER.redact(localEstimatedCompletionDuration) : null;
                LocalOpenHours localOpenHours3 = value.pickup_hours;
                LocalOpenHours localOpenHours4 = localOpenHours3 != null ? (LocalOpenHours) LocalOpenHours.ADAPTER.redact(localOpenHours3) : null;
                LocalOpenHours localOpenHours5 = value.delivery_hours;
                LocalOpenHours localOpenHours6 = localOpenHours5 != null ? (LocalOpenHours) LocalOpenHours.ADAPTER.redact(localOpenHours5) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.fulfillment_hours, FulfillmentHours.ADAPTER);
                InStoreOrderingFulfillmentConfiguration inStoreOrderingFulfillmentConfiguration = value.in_store_ordering_configuration;
                InStoreOrderingFulfillmentConfiguration inStoreOrderingFulfillmentConfiguration2 = inStoreOrderingFulfillmentConfiguration != null ? (InStoreOrderingFulfillmentConfiguration) InStoreOrderingFulfillmentConfiguration.ADAPTER.redact(inStoreOrderingFulfillmentConfiguration) : null;
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(value.large_order_limits, FulfillmentLargeOrderLimits.ADAPTER);
                CurbsidePickupSettings curbsidePickupSettings = value.curbside_pickup_settings;
                CurbsidePickupSettings curbsidePickupSettings2 = curbsidePickupSettings != null ? (CurbsidePickupSettings) CurbsidePickupSettings.ADAPTER.redact(curbsidePickupSettings) : null;
                ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(value.free_fulfillment_configurations, FreeFulfillmentConfiguration.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = value.token;
                String str2 = value.time_zone;
                LocalOpenStatus localOpenStatus = value.open_status;
                String str3 = value.name;
                String str4 = value.fulfillment_instructions;
                List<LocalFulfillmentType> list = value.available_fulfillment_types;
                String str5 = value.distance_to_buyer;
                Boolean bool = value.pickup_fulfillment_scheduling_enabled;
                Boolean bool2 = value.delivery_fulfillment_scheduling_enabled;
                LocalActionOrdering.OrderingMode orderingMode = value.ordering_mode;
                String str6 = value.ordering_mode_message;
                str.getClass();
                list.getClass();
                byteString.getClass();
                return new LocalLocationSummary(str, localAddress2, str2, localOpenStatus, localOpenHours2, str3, localPhone2, str4, list, localEstimatedCompletionDuration2, str5, bool, bool2, orderingMode, localOpenHours4, localOpenHours6, m1169redactElements, inStoreOrderingFulfillmentConfiguration2, str6, m1169redactElements2, curbsidePickupSettings2, m1169redactElements3, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LocalLocationSummary value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                FreeFulfillmentConfiguration.ADAPTER.asRepeated().encodeWithTag(writer, 22, value.free_fulfillment_configurations);
                CurbsidePickupSettings.ADAPTER.encodeWithTag(writer, 21, value.curbside_pickup_settings);
                FulfillmentLargeOrderLimits.ADAPTER.asRepeated().encodeWithTag(writer, 20, value.large_order_limits);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 19, value.ordering_mode_message);
                InStoreOrderingFulfillmentConfiguration.ADAPTER.encodeWithTag(writer, 18, value.in_store_ordering_configuration);
                FulfillmentHours.ADAPTER.asRepeated().encodeWithTag(writer, 17, value.fulfillment_hours);
                ProtoAdapter protoAdapter3 = LocalOpenHours.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 16, value.delivery_hours);
                protoAdapter3.encodeWithTag(writer, 15, value.pickup_hours);
                LocalActionOrdering.OrderingMode.ADAPTER.encodeWithTag(writer, 14, value.ordering_mode);
                ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                protoAdapter4.encodeWithTag(writer, 13, value.delivery_fulfillment_scheduling_enabled);
                protoAdapter4.encodeWithTag(writer, 12, value.pickup_fulfillment_scheduling_enabled);
                protoAdapter2.encodeWithTag(writer, 11, value.distance_to_buyer);
                LocalEstimatedCompletionDuration.ADAPTER.encodeWithTag(writer, 10, value.estimated_pickup_wait_time);
                LocalFulfillmentType.ADAPTER.asRepeated().encodeWithTag(writer, 9, value.available_fulfillment_types);
                protoAdapter2.encodeWithTag(writer, 8, value.fulfillment_instructions);
                LocalPhone.ADAPTER.encodeWithTag(writer, 7, value.phone);
                protoAdapter2.encodeWithTag(writer, 6, value.name);
                protoAdapter3.encodeWithTag(writer, 5, value.open_hours);
                LocalOpenStatus.ADAPTER.encodeWithTag(writer, 4, value.open_status);
                protoAdapter2.encodeWithTag(writer, 3, value.time_zone);
                LocalAddress.ADAPTER.encodeWithTag(writer, 2, value.address);
                protoAdapter2.encodeWithTag(writer, 1, value.token);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalLocationSummary(String str, LocalAddress localAddress, String str2, LocalOpenStatus localOpenStatus, LocalOpenHours localOpenHours, String str3, LocalPhone localPhone, String str4, List list, LocalEstimatedCompletionDuration localEstimatedCompletionDuration, String str5, Boolean bool, Boolean bool2, LocalActionOrdering.OrderingMode orderingMode, LocalOpenHours localOpenHours2, LocalOpenHours localOpenHours3, List list2, InStoreOrderingFulfillmentConfiguration inStoreOrderingFulfillmentConfiguration, String str6, List list3, CurbsidePickupSettings curbsidePickupSettings, List list4, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        byteString.getClass();
        this.token = str;
        this.address = localAddress;
        this.time_zone = str2;
        this.open_status = localOpenStatus;
        this.open_hours = localOpenHours;
        this.name = str3;
        this.phone = localPhone;
        this.fulfillment_instructions = str4;
        this.estimated_pickup_wait_time = localEstimatedCompletionDuration;
        this.distance_to_buyer = str5;
        this.pickup_fulfillment_scheduling_enabled = bool;
        this.delivery_fulfillment_scheduling_enabled = bool2;
        this.ordering_mode = orderingMode;
        this.pickup_hours = localOpenHours2;
        this.delivery_hours = localOpenHours3;
        this.in_store_ordering_configuration = inStoreOrderingFulfillmentConfiguration;
        this.ordering_mode_message = str6;
        this.curbside_pickup_settings = curbsidePickupSettings;
        this.available_fulfillment_types = TransactorKt.immutableCopyOf("available_fulfillment_types", list);
        this.fulfillment_hours = TransactorKt.immutableCopyOf("fulfillment_hours", list2);
        this.large_order_limits = TransactorKt.immutableCopyOf("large_order_limits", list3);
        this.free_fulfillment_configurations = TransactorKt.immutableCopyOf("free_fulfillment_configurations", list4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalLocationSummary)) {
            return false;
        }
        LocalLocationSummary localLocationSummary = (LocalLocationSummary) obj;
        return Intrinsics.areEqual(unknownFields(), localLocationSummary.unknownFields()) && Intrinsics.areEqual(this.token, localLocationSummary.token) && Intrinsics.areEqual(this.address, localLocationSummary.address) && Intrinsics.areEqual(this.time_zone, localLocationSummary.time_zone) && this.open_status == localLocationSummary.open_status && Intrinsics.areEqual(this.open_hours, localLocationSummary.open_hours) && Intrinsics.areEqual(this.name, localLocationSummary.name) && Intrinsics.areEqual(this.phone, localLocationSummary.phone) && Intrinsics.areEqual(this.fulfillment_instructions, localLocationSummary.fulfillment_instructions) && Intrinsics.areEqual(this.available_fulfillment_types, localLocationSummary.available_fulfillment_types) && Intrinsics.areEqual(this.estimated_pickup_wait_time, localLocationSummary.estimated_pickup_wait_time) && Intrinsics.areEqual(this.distance_to_buyer, localLocationSummary.distance_to_buyer) && Intrinsics.areEqual(this.pickup_fulfillment_scheduling_enabled, localLocationSummary.pickup_fulfillment_scheduling_enabled) && Intrinsics.areEqual(this.delivery_fulfillment_scheduling_enabled, localLocationSummary.delivery_fulfillment_scheduling_enabled) && this.ordering_mode == localLocationSummary.ordering_mode && Intrinsics.areEqual(this.pickup_hours, localLocationSummary.pickup_hours) && Intrinsics.areEqual(this.delivery_hours, localLocationSummary.delivery_hours) && Intrinsics.areEqual(this.fulfillment_hours, localLocationSummary.fulfillment_hours) && Intrinsics.areEqual(this.in_store_ordering_configuration, localLocationSummary.in_store_ordering_configuration) && Intrinsics.areEqual(this.ordering_mode_message, localLocationSummary.ordering_mode_message) && Intrinsics.areEqual(this.large_order_limits, localLocationSummary.large_order_limits) && Intrinsics.areEqual(this.curbside_pickup_settings, localLocationSummary.curbside_pickup_settings) && Intrinsics.areEqual(this.free_fulfillment_configurations, localLocationSummary.free_fulfillment_configurations);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.token);
        LocalAddress localAddress = this.address;
        int hashCode = (m + (localAddress != null ? localAddress.hashCode() : 0)) * 37;
        String str = this.time_zone;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalOpenStatus localOpenStatus = this.open_status;
        int hashCode3 = (hashCode2 + (localOpenStatus != null ? localOpenStatus.hashCode() : 0)) * 37;
        LocalOpenHours localOpenHours = this.open_hours;
        int hashCode4 = (hashCode3 + (localOpenHours != null ? localOpenHours.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalPhone localPhone = this.phone;
        int hashCode6 = (hashCode5 + (localPhone != null ? localPhone.hashCode() : 0)) * 37;
        String str3 = this.fulfillment_instructions;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.available_fulfillment_types);
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration = this.estimated_pickup_wait_time;
        int hashCode7 = (m2 + (localEstimatedCompletionDuration != null ? localEstimatedCompletionDuration.hashCode() : 0)) * 37;
        String str4 = this.distance_to_buyer;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool = this.pickup_fulfillment_scheduling_enabled;
        int hashCode9 = (hashCode8 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.delivery_fulfillment_scheduling_enabled;
        int hashCode10 = (hashCode9 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        LocalActionOrdering.OrderingMode orderingMode = this.ordering_mode;
        int hashCode11 = (hashCode10 + (orderingMode != null ? orderingMode.hashCode() : 0)) * 37;
        LocalOpenHours localOpenHours2 = this.pickup_hours;
        int hashCode12 = (hashCode11 + (localOpenHours2 != null ? localOpenHours2.hashCode() : 0)) * 37;
        LocalOpenHours localOpenHours3 = this.delivery_hours;
        int m3 = Recorder$$ExternalSyntheticOutline2.m((hashCode12 + (localOpenHours3 != null ? localOpenHours3.hashCode() : 0)) * 37, 37, this.fulfillment_hours);
        InStoreOrderingFulfillmentConfiguration inStoreOrderingFulfillmentConfiguration = this.in_store_ordering_configuration;
        int hashCode13 = (m3 + (inStoreOrderingFulfillmentConfiguration != null ? inStoreOrderingFulfillmentConfiguration.hashCode() : 0)) * 37;
        String str5 = this.ordering_mode_message;
        int m4 = Recorder$$ExternalSyntheticOutline2.m((hashCode13 + (str5 != null ? str5.hashCode() : 0)) * 37, 37, this.large_order_limits);
        CurbsidePickupSettings curbsidePickupSettings = this.curbside_pickup_settings;
        int hashCode14 = this.free_fulfillment_configurations.hashCode() + ((m4 + (curbsidePickupSettings != null ? curbsidePickupSettings.hashCode() : 0)) * 37);
        this.hashCode = hashCode14;
        return hashCode14;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.token = this.token;
        builder.address = this.address;
        builder.time_zone = this.time_zone;
        builder.open_status = this.open_status;
        builder.open_hours = this.open_hours;
        builder.name = this.name;
        builder.phone = this.phone;
        builder.fulfillment_instructions = this.fulfillment_instructions;
        builder.available_fulfillment_types = this.available_fulfillment_types;
        builder.estimated_pickup_wait_time = this.estimated_pickup_wait_time;
        builder.distance_to_buyer = this.distance_to_buyer;
        builder.pickup_fulfillment_scheduling_enabled = this.pickup_fulfillment_scheduling_enabled;
        builder.delivery_fulfillment_scheduling_enabled = this.delivery_fulfillment_scheduling_enabled;
        builder.ordering_mode = this.ordering_mode;
        builder.pickup_hours = this.pickup_hours;
        builder.delivery_hours = this.delivery_hours;
        builder.fulfillment_hours = this.fulfillment_hours;
        builder.in_store_ordering_configuration = this.in_store_ordering_configuration;
        builder.ordering_mode_message = this.ordering_mode_message;
        builder.large_order_limits = this.large_order_limits;
        builder.curbside_pickup_settings = this.curbside_pickup_settings;
        builder.free_fulfillment_configurations = this.free_fulfillment_configurations;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.token, "token=", arrayList);
        LocalAddress localAddress = this.address;
        if (localAddress != null) {
            arrayList.add("address=" + localAddress);
        }
        String str = this.time_zone;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "time_zone=", arrayList);
        }
        LocalOpenStatus localOpenStatus = this.open_status;
        if (localOpenStatus != null) {
            arrayList.add("open_status=" + localOpenStatus);
        }
        LocalOpenHours localOpenHours = this.open_hours;
        if (localOpenHours != null) {
            arrayList.add("open_hours=" + localOpenHours);
        }
        String str2 = this.name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
        }
        LocalPhone localPhone = this.phone;
        if (localPhone != null) {
            arrayList.add("phone=" + localPhone);
        }
        String str3 = this.fulfillment_instructions;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "fulfillment_instructions=", arrayList);
        }
        if (!this.available_fulfillment_types.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("available_fulfillment_types=", arrayList, this.available_fulfillment_types);
        }
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration = this.estimated_pickup_wait_time;
        if (localEstimatedCompletionDuration != null) {
            arrayList.add("estimated_pickup_wait_time=" + localEstimatedCompletionDuration);
        }
        String str4 = this.distance_to_buyer;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "distance_to_buyer=", arrayList);
        }
        Boolean bool = this.pickup_fulfillment_scheduling_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("pickup_fulfillment_scheduling_enabled=", bool, arrayList);
        }
        Boolean bool2 = this.delivery_fulfillment_scheduling_enabled;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("delivery_fulfillment_scheduling_enabled=", bool2, arrayList);
        }
        LocalActionOrdering.OrderingMode orderingMode = this.ordering_mode;
        if (orderingMode != null) {
            arrayList.add("ordering_mode=" + orderingMode);
        }
        LocalOpenHours localOpenHours2 = this.pickup_hours;
        if (localOpenHours2 != null) {
            arrayList.add("pickup_hours=" + localOpenHours2);
        }
        LocalOpenHours localOpenHours3 = this.delivery_hours;
        if (localOpenHours3 != null) {
            arrayList.add("delivery_hours=" + localOpenHours3);
        }
        if (!this.fulfillment_hours.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("fulfillment_hours=", arrayList, this.fulfillment_hours);
        }
        InStoreOrderingFulfillmentConfiguration inStoreOrderingFulfillmentConfiguration = this.in_store_ordering_configuration;
        if (inStoreOrderingFulfillmentConfiguration != null) {
            arrayList.add("in_store_ordering_configuration=" + inStoreOrderingFulfillmentConfiguration);
        }
        String str5 = this.ordering_mode_message;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "ordering_mode_message=", arrayList);
        }
        if (!this.large_order_limits.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("large_order_limits=", arrayList, this.large_order_limits);
        }
        CurbsidePickupSettings curbsidePickupSettings = this.curbside_pickup_settings;
        if (curbsidePickupSettings != null) {
            arrayList.add("curbside_pickup_settings=" + curbsidePickupSettings);
        }
        if (!this.free_fulfillment_configurations.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("free_fulfillment_configurations=", arrayList, this.free_fulfillment_configurations);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalLocationSummary{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalLocationSummary$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalLocationSummary$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalLocationSummary;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalLocationSummary;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ LocalLocationSummary build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
