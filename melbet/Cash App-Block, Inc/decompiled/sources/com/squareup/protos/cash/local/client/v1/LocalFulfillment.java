package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
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

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\t\u001f\u001e !\"#$%&R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006'"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillmentType;", "type", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillmentType;", "", "token", "Ljava/lang/String;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionTime;", "estimated_completion_time", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionTime;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionDuration;", "estimated_completion_duration", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionDuration;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails;", "delivery_details", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$SchedulingDetails;", "scheduling_details", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$SchedulingDetails;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$InStoreDetails;", "in_store_details", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$InStoreDetails;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$PickupDetails;", "pickup_details", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$PickupDetails;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$ShippingDetails;", "shipping_details", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$ShippingDetails;", "Companion", "Builder", "EstimatedCompletionDuration", "EstimatedCompletionTime", "DeliveryDetails", "SchedulingDetails", "InStoreDetails", "PickupDetails", "ShippingDetails", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LocalFulfillment extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalFulfillment> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalFulfillment$DeliveryDetails#ADAPTER", schemaIndex = 4, tag = 3)
    public final DeliveryDetails delivery_details;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalFulfillment$EstimatedCompletionDuration#ADAPTER", schemaIndex = 3, tag = 4)
    public final EstimatedCompletionDuration estimated_completion_duration;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalFulfillment$EstimatedCompletionTime#ADAPTER", schemaIndex = 2, tag = 2)
    public final EstimatedCompletionTime estimated_completion_time;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalFulfillment$InStoreDetails#ADAPTER", schemaIndex = 6, tag = 6)
    public final InStoreDetails in_store_details;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalFulfillment$PickupDetails#ADAPTER", schemaIndex = 7, tag = 8)
    public final PickupDetails pickup_details;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalFulfillment$SchedulingDetails#ADAPTER", schemaIndex = 5, tag = 5)
    public final SchedulingDetails scheduling_details;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalFulfillment$ShippingDetails#ADAPTER", schemaIndex = 8, tag = 9)
    public final ShippingDetails shipping_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 7)
    public final String token;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalFulfillmentType#ADAPTER", schemaIndex = 0, tag = 1)
    public final LocalFulfillmentType type;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment;", "<init>", "()V", "type", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillmentType;", "token", "", "estimated_completion_time", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionTime;", "estimated_completion_duration", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionDuration;", "delivery_details", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails;", "scheduling_details", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$SchedulingDetails;", "in_store_details", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$InStoreDetails;", "pickup_details", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$PickupDetails;", "shipping_details", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$ShippingDetails;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public DeliveryDetails delivery_details;
        public EstimatedCompletionDuration estimated_completion_duration;
        public EstimatedCompletionTime estimated_completion_time;
        public InStoreDetails in_store_details;
        public PickupDetails pickup_details;
        public SchedulingDetails scheduling_details;
        public ShippingDetails shipping_details;
        public String token;
        public LocalFulfillmentType type;

        @Override // com.squareup.wire.Message.Builder
        public LocalFulfillment build() {
            return new LocalFulfillment(this.type, this.token, this.estimated_completion_time, this.estimated_completion_duration, this.delivery_details, this.scheduling_details, this.in_store_details, this.pickup_details, this.shipping_details, buildUnknownFields());
        }

        public final Builder delivery_details(DeliveryDetails delivery_details) {
            this.delivery_details = delivery_details;
            return this;
        }

        public final Builder estimated_completion_duration(EstimatedCompletionDuration estimated_completion_duration) {
            this.estimated_completion_duration = estimated_completion_duration;
            return this;
        }

        public final Builder estimated_completion_time(EstimatedCompletionTime estimated_completion_time) {
            this.estimated_completion_time = estimated_completion_time;
            return this;
        }

        public final Builder in_store_details(InStoreDetails in_store_details) {
            this.in_store_details = in_store_details;
            return this;
        }

        public final Builder pickup_details(PickupDetails pickup_details) {
            this.pickup_details = pickup_details;
            return this;
        }

        public final Builder scheduling_details(SchedulingDetails scheduling_details) {
            this.scheduling_details = scheduling_details;
            return this;
        }

        public final Builder shipping_details(ShippingDetails shipping_details) {
            this.shipping_details = shipping_details;
            return this;
        }

        public final Builder token(String token) {
            this.token = token;
            return this;
        }

        public final Builder type(LocalFulfillmentType type2) {
            this.type = type2;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004#$%&B\u0095\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\u0014\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0082\u0004J\n\u0010\u001e\u001a\u00020\u001fH\u0096\u0080\u0004J\b\u0010 \u001a\u00020\u0004H\u0016J\u0099\u0001\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\"R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0019R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0019R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$Builder;", "courier_quote_id", "", "courier_delivery_id", "courier_provider_name", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$DeliveryCourierProvider;", "delivery_address", "Lcom/squareup/protos/cash/local/client/v1/LocalAddress;", "dropoff_proof_image_url", "courier_driver", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$DeliveryCourierDriver;", "delivered_at", "", "is_no_contact_delivery", "", "dropoff_notes", "requires_id_verification", "token", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$DeliveryCourierProvider;Lcom/squareup/protos/cash/local/client/v1/LocalAddress;Ljava/lang/String;Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$DeliveryCourierDriver;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lokio/ByteString;)V", "Ljava/lang/Long;", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$DeliveryCourierProvider;Lcom/squareup/protos/cash/local/client/v1/LocalAddress;Ljava/lang/String;Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$DeliveryCourierDriver;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lokio/ByteString;)Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails;", "Builder", "Companion", "DeliveryCourierDriver", "DeliveryCourierProvider", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class DeliveryDetails extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DeliveryDetails> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String courier_delivery_id;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalFulfillment$DeliveryDetails$DeliveryCourierDriver#ADAPTER", schemaIndex = 5, tag = 6)
        public final DeliveryCourierDriver courier_driver;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalFulfillment$DeliveryDetails$DeliveryCourierProvider#ADAPTER", schemaIndex = 2, tag = 3)
        public final DeliveryCourierProvider courier_provider_name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String courier_quote_id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 6, tag = 7)
        public final Long delivered_at;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalAddress#ADAPTER", schemaIndex = 3, tag = 4)
        public final LocalAddress delivery_address;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
        public final String dropoff_notes;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
        public final String dropoff_proof_image_url;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 7, tag = 8)
        public final Boolean is_no_contact_delivery;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 9, tag = 10)
        public final Boolean requires_id_verification;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 11)
        public final String token;

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0019J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0019J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails;", "<init>", "()V", "courier_quote_id", "", "courier_delivery_id", "courier_provider_name", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$DeliveryCourierProvider;", "delivery_address", "Lcom/squareup/protos/cash/local/client/v1/LocalAddress;", "dropoff_proof_image_url", "courier_driver", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$DeliveryCourierDriver;", "delivered_at", "", "Ljava/lang/Long;", "is_no_contact_delivery", "", "Ljava/lang/Boolean;", "dropoff_notes", "requires_id_verification", "token", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String courier_delivery_id;
            public DeliveryCourierDriver courier_driver;
            public DeliveryCourierProvider courier_provider_name;
            public String courier_quote_id;
            public Long delivered_at;
            public LocalAddress delivery_address;
            public String dropoff_notes;
            public String dropoff_proof_image_url;
            public Boolean is_no_contact_delivery;
            public Boolean requires_id_verification;
            public String token;

            @Override // com.squareup.wire.Message.Builder
            public DeliveryDetails build() {
                return new DeliveryDetails(this.courier_quote_id, this.courier_delivery_id, this.courier_provider_name, this.delivery_address, this.dropoff_proof_image_url, this.courier_driver, this.delivered_at, this.is_no_contact_delivery, this.dropoff_notes, this.requires_id_verification, this.token, buildUnknownFields());
            }

            public final Builder courier_delivery_id(String courier_delivery_id) {
                this.courier_delivery_id = courier_delivery_id;
                return this;
            }

            public final Builder courier_driver(DeliveryCourierDriver courier_driver) {
                this.courier_driver = courier_driver;
                return this;
            }

            public final Builder courier_provider_name(DeliveryCourierProvider courier_provider_name) {
                this.courier_provider_name = courier_provider_name;
                return this;
            }

            public final Builder courier_quote_id(String courier_quote_id) {
                this.courier_quote_id = courier_quote_id;
                return this;
            }

            public final Builder delivered_at(Long delivered_at) {
                this.delivered_at = delivered_at;
                return this;
            }

            public final Builder delivery_address(LocalAddress delivery_address) {
                this.delivery_address = delivery_address;
                return this;
            }

            public final Builder dropoff_notes(String dropoff_notes) {
                this.dropoff_notes = dropoff_notes;
                return this;
            }

            public final Builder dropoff_proof_image_url(String dropoff_proof_image_url) {
                this.dropoff_proof_image_url = dropoff_proof_image_url;
                return this;
            }

            public final Builder is_no_contact_delivery(Boolean is_no_contact_delivery) {
                this.is_no_contact_delivery = is_no_contact_delivery;
                return this;
            }

            public final Builder requires_id_verification(Boolean requires_id_verification) {
                this.requires_id_verification = requires_id_verification;
                return this;
            }

            public final Builder token(String token) {
                this.token = token;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DeliveryDetails.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalFulfillment$DeliveryDetails$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public LocalFulfillment.DeliveryDetails decode(ProtoReader reader) {
                    Object obj;
                    Object obj2;
                    Object obj3;
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
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
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new LocalFulfillment.DeliveryDetails((String) obj4, (String) obj5, (LocalFulfillment.DeliveryDetails.DeliveryCourierProvider) obj6, (LocalAddress) obj7, (String) obj8, (LocalFulfillment.DeliveryDetails.DeliveryCourierDriver) obj9, (Long) obj10, (Boolean) obj11, (String) obj12, (Boolean) obj13, (String) obj14, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                obj5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                try {
                                    obj6 = LocalFulfillment.DeliveryDetails.DeliveryCourierProvider.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    obj = obj4;
                                    obj2 = obj5;
                                    obj3 = obj6;
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 4:
                                obj7 = TransactorKt.decodeMessageOrMerge(LocalAddress.ADAPTER, reader, obj7);
                                continue;
                            case 5:
                                obj8 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                obj9 = TransactorKt.decodeMessageOrMerge(LocalFulfillment.DeliveryDetails.DeliveryCourierDriver.ADAPTER, reader, obj9);
                                continue;
                            case 7:
                                obj10 = ProtoAdapter.INT64.decode(reader);
                                continue;
                            case 8:
                                obj11 = ProtoAdapter.BOOL.decode(reader);
                                continue;
                            case 9:
                                obj12 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                obj13 = ProtoAdapter.BOOL.decode(reader);
                                continue;
                            case 11:
                                obj14 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(nextTag);
                                obj = obj4;
                                obj2 = obj5;
                                obj3 = obj6;
                                break;
                        }
                        obj4 = obj;
                        obj5 = obj2;
                        obj6 = obj3;
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LocalFulfillment.DeliveryDetails value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.courier_quote_id);
                    protoAdapter2.encodeWithTag(writer, 2, value.courier_delivery_id);
                    LocalFulfillment.DeliveryDetails.DeliveryCourierProvider.ADAPTER.encodeWithTag(writer, 3, value.courier_provider_name);
                    LocalAddress.ADAPTER.encodeWithTag(writer, 4, value.delivery_address);
                    protoAdapter2.encodeWithTag(writer, 5, value.dropoff_proof_image_url);
                    LocalFulfillment.DeliveryDetails.DeliveryCourierDriver.ADAPTER.encodeWithTag(writer, 6, value.courier_driver);
                    ProtoAdapter.INT64.encodeWithTag(writer, 7, value.delivered_at);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                    protoAdapter3.encodeWithTag(writer, 8, value.is_no_contact_delivery);
                    protoAdapter2.encodeWithTag(writer, 9, value.dropoff_notes);
                    protoAdapter3.encodeWithTag(writer, 10, value.requires_id_verification);
                    protoAdapter2.encodeWithTag(writer, 11, value.token);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LocalFulfillment.DeliveryDetails value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(7, value.delivered_at) + LocalFulfillment.DeliveryDetails.DeliveryCourierDriver.ADAPTER.encodedSizeWithTag(6, value.courier_driver) + protoAdapter2.encodedSizeWithTag(5, value.dropoff_proof_image_url) + LocalAddress.ADAPTER.encodedSizeWithTag(4, value.delivery_address) + LocalFulfillment.DeliveryDetails.DeliveryCourierProvider.ADAPTER.encodedSizeWithTag(3, value.courier_provider_name) + protoAdapter2.encodedSizeWithTag(2, value.courier_delivery_id) + protoAdapter2.encodedSizeWithTag(1, value.courier_quote_id) + size$okio;
                    ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                    return protoAdapter2.encodedSizeWithTag(11, value.token) + protoAdapter3.encodedSizeWithTag(10, value.requires_id_verification) + protoAdapter2.encodedSizeWithTag(9, value.dropoff_notes) + protoAdapter3.encodedSizeWithTag(8, value.is_no_contact_delivery) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LocalFulfillment.DeliveryDetails redact(LocalFulfillment.DeliveryDetails value) {
                    value.getClass();
                    LocalAddress localAddress = value.delivery_address;
                    LocalAddress localAddress2 = localAddress != null ? (LocalAddress) LocalAddress.ADAPTER.redact(localAddress) : null;
                    LocalFulfillment.DeliveryDetails.DeliveryCourierDriver deliveryCourierDriver = value.courier_driver;
                    return LocalFulfillment.DeliveryDetails.copy$default(value, null, null, null, localAddress2, null, deliveryCourierDriver != null ? (LocalFulfillment.DeliveryDetails.DeliveryCourierDriver) LocalFulfillment.DeliveryDetails.DeliveryCourierDriver.ADAPTER.redact(deliveryCourierDriver) : null, null, null, null, null, null, ByteString.EMPTY, 2007, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LocalFulfillment.DeliveryDetails value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 11, value.token);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                    protoAdapter3.encodeWithTag(writer, 10, value.requires_id_verification);
                    protoAdapter2.encodeWithTag(writer, 9, value.dropoff_notes);
                    protoAdapter3.encodeWithTag(writer, 8, value.is_no_contact_delivery);
                    ProtoAdapter.INT64.encodeWithTag(writer, 7, value.delivered_at);
                    LocalFulfillment.DeliveryDetails.DeliveryCourierDriver.ADAPTER.encodeWithTag(writer, 6, value.courier_driver);
                    protoAdapter2.encodeWithTag(writer, 5, value.dropoff_proof_image_url);
                    LocalAddress.ADAPTER.encodeWithTag(writer, 4, value.delivery_address);
                    LocalFulfillment.DeliveryDetails.DeliveryCourierProvider.ADAPTER.encodeWithTag(writer, 3, value.courier_provider_name);
                    protoAdapter2.encodeWithTag(writer, 2, value.courier_delivery_id);
                    protoAdapter2.encodeWithTag(writer, 1, value.courier_quote_id);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ DeliveryDetails(String str, String str2, DeliveryCourierProvider deliveryCourierProvider, LocalAddress localAddress, String str3, DeliveryCourierDriver deliveryCourierDriver, Long l, Boolean bool, String str4, Boolean bool2, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : deliveryCourierProvider, (i & 8) != 0 ? null : localAddress, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : deliveryCourierDriver, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ DeliveryDetails copy$default(DeliveryDetails deliveryDetails, String str, String str2, DeliveryCourierProvider deliveryCourierProvider, LocalAddress localAddress, String str3, DeliveryCourierDriver deliveryCourierDriver, Long l, Boolean bool, String str4, Boolean bool2, String str5, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deliveryDetails.courier_quote_id;
            }
            if ((i & 2) != 0) {
                str2 = deliveryDetails.courier_delivery_id;
            }
            if ((i & 4) != 0) {
                deliveryCourierProvider = deliveryDetails.courier_provider_name;
            }
            if ((i & 8) != 0) {
                localAddress = deliveryDetails.delivery_address;
            }
            if ((i & 16) != 0) {
                str3 = deliveryDetails.dropoff_proof_image_url;
            }
            if ((i & 32) != 0) {
                deliveryCourierDriver = deliveryDetails.courier_driver;
            }
            if ((i & 64) != 0) {
                l = deliveryDetails.delivered_at;
            }
            if ((i & 128) != 0) {
                bool = deliveryDetails.is_no_contact_delivery;
            }
            if ((i & 256) != 0) {
                str4 = deliveryDetails.dropoff_notes;
            }
            if ((i & 512) != 0) {
                bool2 = deliveryDetails.requires_id_verification;
            }
            if ((i & 1024) != 0) {
                str5 = deliveryDetails.token;
            }
            if ((i & 2048) != 0) {
                byteString = deliveryDetails.unknownFields();
            }
            String str6 = str5;
            ByteString byteString2 = byteString;
            String str7 = str4;
            Boolean bool3 = bool2;
            Long l2 = l;
            Boolean bool4 = bool;
            String str8 = str3;
            DeliveryCourierDriver deliveryCourierDriver2 = deliveryCourierDriver;
            return deliveryDetails.copy(str, str2, deliveryCourierProvider, localAddress, str8, deliveryCourierDriver2, l2, bool4, str7, bool3, str6, byteString2);
        }

        public final DeliveryDetails copy(String courier_quote_id, String courier_delivery_id, DeliveryCourierProvider courier_provider_name, LocalAddress delivery_address, String dropoff_proof_image_url, DeliveryCourierDriver courier_driver, Long delivered_at, Boolean is_no_contact_delivery, String dropoff_notes, Boolean requires_id_verification, String token, ByteString unknownFields) {
            unknownFields.getClass();
            return new DeliveryDetails(courier_quote_id, courier_delivery_id, courier_provider_name, delivery_address, dropoff_proof_image_url, courier_driver, delivered_at, is_no_contact_delivery, dropoff_notes, requires_id_verification, token, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof DeliveryDetails)) {
                return false;
            }
            DeliveryDetails deliveryDetails = (DeliveryDetails) other;
            return Intrinsics.areEqual(unknownFields(), deliveryDetails.unknownFields()) && Intrinsics.areEqual(this.courier_quote_id, deliveryDetails.courier_quote_id) && Intrinsics.areEqual(this.courier_delivery_id, deliveryDetails.courier_delivery_id) && this.courier_provider_name == deliveryDetails.courier_provider_name && Intrinsics.areEqual(this.delivery_address, deliveryDetails.delivery_address) && Intrinsics.areEqual(this.dropoff_proof_image_url, deliveryDetails.dropoff_proof_image_url) && Intrinsics.areEqual(this.courier_driver, deliveryDetails.courier_driver) && Intrinsics.areEqual(this.delivered_at, deliveryDetails.delivered_at) && Intrinsics.areEqual(this.is_no_contact_delivery, deliveryDetails.is_no_contact_delivery) && Intrinsics.areEqual(this.dropoff_notes, deliveryDetails.dropoff_notes) && Intrinsics.areEqual(this.requires_id_verification, deliveryDetails.requires_id_verification) && Intrinsics.areEqual(this.token, deliveryDetails.token);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.courier_quote_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.courier_delivery_id;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            DeliveryCourierProvider deliveryCourierProvider = this.courier_provider_name;
            int hashCode4 = (hashCode3 + (deliveryCourierProvider != null ? deliveryCourierProvider.hashCode() : 0)) * 37;
            LocalAddress localAddress = this.delivery_address;
            int hashCode5 = (hashCode4 + (localAddress != null ? localAddress.hashCode() : 0)) * 37;
            String str3 = this.dropoff_proof_image_url;
            int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
            DeliveryCourierDriver deliveryCourierDriver = this.courier_driver;
            int hashCode7 = (hashCode6 + (deliveryCourierDriver != null ? deliveryCourierDriver.hashCode() : 0)) * 37;
            Long l = this.delivered_at;
            int hashCode8 = (hashCode7 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Boolean bool = this.is_no_contact_delivery;
            int hashCode9 = (hashCode8 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            String str4 = this.dropoff_notes;
            int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 37;
            Boolean bool2 = this.requires_id_verification;
            int hashCode11 = (hashCode10 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
            String str5 = this.token;
            int hashCode12 = hashCode11 + (str5 != null ? str5.hashCode() : 0);
            this.hashCode = hashCode12;
            return hashCode12;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.courier_quote_id = this.courier_quote_id;
            builder.courier_delivery_id = this.courier_delivery_id;
            builder.courier_provider_name = this.courier_provider_name;
            builder.delivery_address = this.delivery_address;
            builder.dropoff_proof_image_url = this.dropoff_proof_image_url;
            builder.courier_driver = this.courier_driver;
            builder.delivered_at = this.delivered_at;
            builder.is_no_contact_delivery = this.is_no_contact_delivery;
            builder.dropoff_notes = this.dropoff_notes;
            builder.requires_id_verification = this.requires_id_verification;
            builder.token = this.token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.courier_quote_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "courier_quote_id=", arrayList);
            }
            String str2 = this.courier_delivery_id;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "courier_delivery_id=", arrayList);
            }
            DeliveryCourierProvider deliveryCourierProvider = this.courier_provider_name;
            if (deliveryCourierProvider != null) {
                arrayList.add("courier_provider_name=" + deliveryCourierProvider);
            }
            LocalAddress localAddress = this.delivery_address;
            if (localAddress != null) {
                arrayList.add("delivery_address=" + localAddress);
            }
            String str3 = this.dropoff_proof_image_url;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "dropoff_proof_image_url=", arrayList);
            }
            DeliveryCourierDriver deliveryCourierDriver = this.courier_driver;
            if (deliveryCourierDriver != null) {
                arrayList.add("courier_driver=" + deliveryCourierDriver);
            }
            Long l = this.delivered_at;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("delivered_at=", l, arrayList);
            }
            Boolean bool = this.is_no_contact_delivery;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_no_contact_delivery=", bool, arrayList);
            }
            String str4 = this.dropoff_notes;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "dropoff_notes=", arrayList);
            }
            Boolean bool2 = this.requires_id_verification;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_id_verification=", bool2, arrayList);
            }
            String str5 = this.token;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DeliveryDetails{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bBY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\b\u0010\u0017\u001a\u00020\u0004H\u0016J]\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\u0019R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$DeliveryCourierDriver;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$DeliveryCourierDriver$Builder;", "name", "", "vehicle_description", "phone_number_e164", "geo_latitude", "", "geo_longitude", "profile_image_url", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lokio/ByteString;)V", "Ljava/lang/Double;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lokio/ByteString;)Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$DeliveryCourierDriver;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class DeliveryCourierDriver extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<DeliveryCourierDriver> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 3, tag = 4)
            public final Double geo_latitude;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 4, tag = 5)
            public final Double geo_longitude;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String name;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
            public final String phone_number_e164;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
            public final String profile_image_url;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String vehicle_description;

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$DeliveryCourierDriver$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$DeliveryCourierDriver;", "<init>", "()V", "name", "", "vehicle_description", "phone_number_e164", "geo_latitude", "", "Ljava/lang/Double;", "geo_longitude", "profile_image_url", "(Ljava/lang/Double;)Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$DeliveryCourierDriver$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public Double geo_latitude;
                public Double geo_longitude;
                public String name;
                public String phone_number_e164;
                public String profile_image_url;
                public String vehicle_description;

                @Override // com.squareup.wire.Message.Builder
                public DeliveryCourierDriver build() {
                    return new DeliveryCourierDriver(this.name, this.vehicle_description, this.phone_number_e164, this.geo_latitude, this.geo_longitude, this.profile_image_url, buildUnknownFields());
                }

                public final Builder geo_latitude(Double geo_latitude) {
                    this.geo_latitude = geo_latitude;
                    return this;
                }

                public final Builder geo_longitude(Double geo_longitude) {
                    this.geo_longitude = geo_longitude;
                    return this;
                }

                public final Builder name(String name) {
                    this.name = name;
                    return this;
                }

                public final Builder phone_number_e164(String phone_number_e164) {
                    this.phone_number_e164 = phone_number_e164;
                    return this;
                }

                public final Builder profile_image_url(String profile_image_url) {
                    this.profile_image_url = profile_image_url;
                    return this;
                }

                public final Builder vehicle_description(String vehicle_description) {
                    this.vehicle_description = vehicle_description;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DeliveryCourierDriver.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalFulfillment$DeliveryDetails$DeliveryCourierDriver$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public LocalFulfillment.DeliveryDetails.DeliveryCourierDriver decode(ProtoReader reader) {
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
                                return new LocalFulfillment.DeliveryDetails.DeliveryCourierDriver((String) obj, (String) obj2, (String) obj3, (Double) obj4, (Double) obj5, (String) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
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
                                    obj4 = ProtoAdapter.DOUBLE.decode(reader);
                                    break;
                                case 5:
                                    obj5 = ProtoAdapter.DOUBLE.decode(reader);
                                    break;
                                case 6:
                                    obj6 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(nextTag);
                                    break;
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, LocalFulfillment.DeliveryDetails.DeliveryCourierDriver value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.name);
                        protoAdapter2.encodeWithTag(writer, 2, value.vehicle_description);
                        protoAdapter2.encodeWithTag(writer, 3, value.phone_number_e164);
                        ProtoAdapter protoAdapter3 = ProtoAdapter.DOUBLE;
                        protoAdapter3.encodeWithTag(writer, 4, value.geo_latitude);
                        protoAdapter3.encodeWithTag(writer, 5, value.geo_longitude);
                        protoAdapter2.encodeWithTag(writer, 6, value.profile_image_url);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(LocalFulfillment.DeliveryDetails.DeliveryCourierDriver value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(3, value.phone_number_e164) + protoAdapter2.encodedSizeWithTag(2, value.vehicle_description) + protoAdapter2.encodedSizeWithTag(1, value.name) + size$okio;
                        ProtoAdapter protoAdapter3 = ProtoAdapter.DOUBLE;
                        return protoAdapter2.encodedSizeWithTag(6, value.profile_image_url) + protoAdapter3.encodedSizeWithTag(5, value.geo_longitude) + protoAdapter3.encodedSizeWithTag(4, value.geo_latitude) + encodedSizeWithTag;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public LocalFulfillment.DeliveryDetails.DeliveryCourierDriver redact(LocalFulfillment.DeliveryDetails.DeliveryCourierDriver value) {
                        value.getClass();
                        return LocalFulfillment.DeliveryDetails.DeliveryCourierDriver.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, LocalFulfillment.DeliveryDetails.DeliveryCourierDriver value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 6, value.profile_image_url);
                        ProtoAdapter protoAdapter3 = ProtoAdapter.DOUBLE;
                        protoAdapter3.encodeWithTag(writer, 5, value.geo_longitude);
                        protoAdapter3.encodeWithTag(writer, 4, value.geo_latitude);
                        protoAdapter2.encodeWithTag(writer, 3, value.phone_number_e164);
                        protoAdapter2.encodeWithTag(writer, 2, value.vehicle_description);
                        protoAdapter2.encodeWithTag(writer, 1, value.name);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ DeliveryCourierDriver(String str, String str2, String str3, Double d, Double d2, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : d, (i & 16) != 0 ? null : d2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ DeliveryCourierDriver copy$default(DeliveryCourierDriver deliveryCourierDriver, String str, String str2, String str3, Double d, Double d2, String str4, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = deliveryCourierDriver.name;
                }
                if ((i & 2) != 0) {
                    str2 = deliveryCourierDriver.vehicle_description;
                }
                if ((i & 4) != 0) {
                    str3 = deliveryCourierDriver.phone_number_e164;
                }
                if ((i & 8) != 0) {
                    d = deliveryCourierDriver.geo_latitude;
                }
                if ((i & 16) != 0) {
                    d2 = deliveryCourierDriver.geo_longitude;
                }
                if ((i & 32) != 0) {
                    str4 = deliveryCourierDriver.profile_image_url;
                }
                if ((i & 64) != 0) {
                    byteString = deliveryCourierDriver.unknownFields();
                }
                String str5 = str4;
                ByteString byteString2 = byteString;
                Double d3 = d2;
                String str6 = str3;
                return deliveryCourierDriver.copy(str, str2, str6, d, d3, str5, byteString2);
            }

            public final DeliveryCourierDriver copy(String name, String vehicle_description, String phone_number_e164, Double geo_latitude, Double geo_longitude, String profile_image_url, ByteString unknownFields) {
                unknownFields.getClass();
                return new DeliveryCourierDriver(name, vehicle_description, phone_number_e164, geo_latitude, geo_longitude, profile_image_url, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof DeliveryCourierDriver)) {
                    return false;
                }
                DeliveryCourierDriver deliveryCourierDriver = (DeliveryCourierDriver) other;
                return Intrinsics.areEqual(unknownFields(), deliveryCourierDriver.unknownFields()) && Intrinsics.areEqual(this.name, deliveryCourierDriver.name) && Intrinsics.areEqual(this.vehicle_description, deliveryCourierDriver.vehicle_description) && Intrinsics.areEqual(this.phone_number_e164, deliveryCourierDriver.phone_number_e164) && Intrinsics.areEqual(this.geo_latitude, deliveryCourierDriver.geo_latitude) && Intrinsics.areEqual(this.geo_longitude, deliveryCourierDriver.geo_longitude) && Intrinsics.areEqual(this.profile_image_url, deliveryCourierDriver.profile_image_url);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.name;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.vehicle_description;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.phone_number_e164;
                int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
                Double d = this.geo_latitude;
                int hashCode5 = (hashCode4 + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
                Double d2 = this.geo_longitude;
                int hashCode6 = (hashCode5 + (d2 != null ? Double.hashCode(d2.doubleValue()) : 0)) * 37;
                String str4 = this.profile_image_url;
                int hashCode7 = hashCode6 + (str4 != null ? str4.hashCode() : 0);
                this.hashCode = hashCode7;
                return hashCode7;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.name = this.name;
                builder.vehicle_description = this.vehicle_description;
                builder.phone_number_e164 = this.phone_number_e164;
                builder.geo_latitude = this.geo_latitude;
                builder.geo_longitude = this.geo_longitude;
                builder.profile_image_url = this.profile_image_url;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.name;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
                }
                String str2 = this.vehicle_description;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "vehicle_description=", arrayList);
                }
                String str3 = this.phone_number_e164;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "phone_number_e164=", arrayList);
                }
                Double d = this.geo_latitude;
                if (d != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("geo_latitude=", d, arrayList);
                }
                Double d2 = this.geo_longitude;
                if (d2 != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("geo_longitude=", d2, arrayList);
                }
                String str4 = this.profile_image_url;
                if (str4 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "profile_image_url=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "DeliveryCourierDriver{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$DeliveryCourierDriver$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$DeliveryCourierDriver$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$DeliveryCourierDriver;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$DeliveryCourierDriver;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ DeliveryCourierDriver build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public DeliveryCourierDriver() {
                this(null, null, null, null, null, null, null, 127, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeliveryCourierDriver(String str, String str2, String str3, Double d, Double d2, String str4, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.name = str;
                this.vehicle_description = str2;
                this.phone_number_e164 = str3;
                this.geo_latitude = d;
                this.geo_longitude = d2;
                this.profile_image_url = str4;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$DeliveryCourierProvider;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DELIVERY_COURIER_PROVIDER_UNSPECIFIED", "DELIVERY_COURIER_PROVIDER_NASH", "DELIVERY_COURIER_PROVIDER_SELLER", "DELIVERY_COURIER_PROVIDER_DOORDASH", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class DeliveryCourierProvider implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ DeliveryCourierProvider[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final DeliveryCourierProvider DELIVERY_COURIER_PROVIDER_DOORDASH;
            public static final DeliveryCourierProvider DELIVERY_COURIER_PROVIDER_NASH;
            public static final DeliveryCourierProvider DELIVERY_COURIER_PROVIDER_SELLER;
            public static final DeliveryCourierProvider DELIVERY_COURIER_PROVIDER_UNSPECIFIED;
            private final int value;

            private static final /* synthetic */ DeliveryCourierProvider[] $values() {
                return new DeliveryCourierProvider[]{DELIVERY_COURIER_PROVIDER_UNSPECIFIED, DELIVERY_COURIER_PROVIDER_NASH, DELIVERY_COURIER_PROVIDER_SELLER, DELIVERY_COURIER_PROVIDER_DOORDASH};
            }

            static {
                final DeliveryCourierProvider deliveryCourierProvider = new DeliveryCourierProvider("DELIVERY_COURIER_PROVIDER_UNSPECIFIED", 0, 0);
                DELIVERY_COURIER_PROVIDER_UNSPECIFIED = deliveryCourierProvider;
                DELIVERY_COURIER_PROVIDER_NASH = new DeliveryCourierProvider("DELIVERY_COURIER_PROVIDER_NASH", 1, 1);
                DELIVERY_COURIER_PROVIDER_SELLER = new DeliveryCourierProvider("DELIVERY_COURIER_PROVIDER_SELLER", 2, 2);
                DELIVERY_COURIER_PROVIDER_DOORDASH = new DeliveryCourierProvider("DELIVERY_COURIER_PROVIDER_DOORDASH", 3, 3);
                DeliveryCourierProvider[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DeliveryCourierProvider.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, deliveryCourierProvider) { // from class: com.squareup.protos.cash.local.client.v1.LocalFulfillment$DeliveryDetails$DeliveryCourierProvider$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public LocalFulfillment.DeliveryDetails.DeliveryCourierProvider fromValue(int value) {
                        return LocalFulfillment.DeliveryDetails.DeliveryCourierProvider.INSTANCE.fromValue(value);
                    }
                };
            }

            private DeliveryCourierProvider(String str, int i, int i2) {
                this.value = i2;
            }

            public static final DeliveryCourierProvider fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static DeliveryCourierProvider valueOf(String str) {
                return (DeliveryCourierProvider) Enum.valueOf(DeliveryCourierProvider.class, str);
            }

            public static DeliveryCourierProvider[] values() {
                return (DeliveryCourierProvider[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$DeliveryCourierProvider$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$DeliveryCourierProvider;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final DeliveryCourierProvider fromValue(int value) {
                    if (value == 0) {
                        return DeliveryCourierProvider.DELIVERY_COURIER_PROVIDER_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return DeliveryCourierProvider.DELIVERY_COURIER_PROVIDER_NASH;
                    }
                    if (value == 2) {
                        return DeliveryCourierProvider.DELIVERY_COURIER_PROVIDER_SELLER;
                    }
                    if (value != 3) {
                        return null;
                    }
                    return DeliveryCourierProvider.DELIVERY_COURIER_PROVIDER_DOORDASH;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$DeliveryDetails;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ DeliveryDetails build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public DeliveryDetails() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeliveryDetails(String str, String str2, DeliveryCourierProvider deliveryCourierProvider, LocalAddress localAddress, String str3, DeliveryCourierDriver deliveryCourierDriver, Long l, Boolean bool, String str4, Boolean bool2, String str5, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.courier_quote_id = str;
            this.courier_delivery_id = str2;
            this.courier_provider_name = deliveryCourierProvider;
            this.delivery_address = localAddress;
            this.dropoff_proof_image_url = str3;
            this.courier_driver = deliveryCourierDriver;
            this.delivered_at = l;
            this.is_no_contact_delivery = bool;
            this.dropoff_notes = str4;
            this.requires_id_verification = bool2;
            this.token = str5;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016J4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$SchedulingDetails;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$SchedulingDetails$Builder;", "scheduling_day_time_token", "", "scheduling_mode", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$SchedulingDetails$SchedulingMode;", "friendly_fulfillment_time", "Lcom/squareup/protos/cash/local/client/v1/LocalText;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$SchedulingDetails$SchedulingMode;Lcom/squareup/protos/cash/local/client/v1/LocalText;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "SchedulingMode", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class SchedulingDetails extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SchedulingDetails> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalText#ADAPTER", schemaIndex = 2, tag = 3)
        public final LocalText friendly_fulfillment_time;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String scheduling_day_time_token;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalFulfillment$SchedulingDetails$SchedulingMode#ADAPTER", schemaIndex = 1, tag = 2)
        public final SchedulingMode scheduling_mode;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$SchedulingDetails$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$SchedulingDetails;", "<init>", "()V", "scheduling_day_time_token", "", "scheduling_mode", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$SchedulingDetails$SchedulingMode;", "friendly_fulfillment_time", "Lcom/squareup/protos/cash/local/client/v1/LocalText;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public LocalText friendly_fulfillment_time;
            public String scheduling_day_time_token;
            public SchedulingMode scheduling_mode;

            @Override // com.squareup.wire.Message.Builder
            public SchedulingDetails build() {
                return new SchedulingDetails(this.scheduling_day_time_token, this.scheduling_mode, this.friendly_fulfillment_time, buildUnknownFields());
            }

            public final Builder friendly_fulfillment_time(LocalText friendly_fulfillment_time) {
                this.friendly_fulfillment_time = friendly_fulfillment_time;
                return this;
            }

            public final Builder scheduling_day_time_token(String scheduling_day_time_token) {
                this.scheduling_day_time_token = scheduling_day_time_token;
                return this;
            }

            public final Builder scheduling_mode(SchedulingMode scheduling_mode) {
                this.scheduling_mode = scheduling_mode;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SchedulingDetails.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalFulfillment$SchedulingDetails$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public LocalFulfillment.SchedulingDetails decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new LocalFulfillment.SchedulingDetails((String) obj, (LocalFulfillment.SchedulingDetails.SchedulingMode) obj2, (LocalText) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            try {
                                obj2 = LocalFulfillment.SchedulingDetails.SchedulingMode.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj3 = TransactorKt.decodeMessageOrMerge(LocalText.ADAPTER, reader, obj3);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LocalFulfillment.SchedulingDetails value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.scheduling_day_time_token);
                    LocalFulfillment.SchedulingDetails.SchedulingMode.ADAPTER.encodeWithTag(writer, 2, value.scheduling_mode);
                    LocalText.ADAPTER.encodeWithTag(writer, 3, value.friendly_fulfillment_time);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LocalFulfillment.SchedulingDetails value) {
                    value.getClass();
                    return LocalText.ADAPTER.encodedSizeWithTag(3, value.friendly_fulfillment_time) + LocalFulfillment.SchedulingDetails.SchedulingMode.ADAPTER.encodedSizeWithTag(2, value.scheduling_mode) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.scheduling_day_time_token) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LocalFulfillment.SchedulingDetails redact(LocalFulfillment.SchedulingDetails value) {
                    value.getClass();
                    LocalText localText = value.friendly_fulfillment_time;
                    return LocalFulfillment.SchedulingDetails.copy$default(value, null, null, localText != null ? (LocalText) LocalText.ADAPTER.redact(localText) : null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LocalFulfillment.SchedulingDetails value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    LocalText.ADAPTER.encodeWithTag(writer, 3, value.friendly_fulfillment_time);
                    LocalFulfillment.SchedulingDetails.SchedulingMode.ADAPTER.encodeWithTag(writer, 2, value.scheduling_mode);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.scheduling_day_time_token);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ SchedulingDetails(String str, SchedulingMode schedulingMode, LocalText localText, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : schedulingMode, (i & 4) != 0 ? null : localText, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ SchedulingDetails copy$default(SchedulingDetails schedulingDetails, String str, SchedulingMode schedulingMode, LocalText localText, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = schedulingDetails.scheduling_day_time_token;
            }
            if ((i & 2) != 0) {
                schedulingMode = schedulingDetails.scheduling_mode;
            }
            if ((i & 4) != 0) {
                localText = schedulingDetails.friendly_fulfillment_time;
            }
            if ((i & 8) != 0) {
                byteString = schedulingDetails.unknownFields();
            }
            return schedulingDetails.copy(str, schedulingMode, localText, byteString);
        }

        public final SchedulingDetails copy(String scheduling_day_time_token, SchedulingMode scheduling_mode, LocalText friendly_fulfillment_time, ByteString unknownFields) {
            unknownFields.getClass();
            return new SchedulingDetails(scheduling_day_time_token, scheduling_mode, friendly_fulfillment_time, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof SchedulingDetails)) {
                return false;
            }
            SchedulingDetails schedulingDetails = (SchedulingDetails) other;
            return Intrinsics.areEqual(unknownFields(), schedulingDetails.unknownFields()) && Intrinsics.areEqual(this.scheduling_day_time_token, schedulingDetails.scheduling_day_time_token) && this.scheduling_mode == schedulingDetails.scheduling_mode && Intrinsics.areEqual(this.friendly_fulfillment_time, schedulingDetails.friendly_fulfillment_time);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.scheduling_day_time_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            SchedulingMode schedulingMode = this.scheduling_mode;
            int hashCode3 = (hashCode2 + (schedulingMode != null ? schedulingMode.hashCode() : 0)) * 37;
            LocalText localText = this.friendly_fulfillment_time;
            int hashCode4 = hashCode3 + (localText != null ? localText.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.scheduling_day_time_token = this.scheduling_day_time_token;
            builder.scheduling_mode = this.scheduling_mode;
            builder.friendly_fulfillment_time = this.friendly_fulfillment_time;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.scheduling_day_time_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "scheduling_day_time_token=", arrayList);
            }
            SchedulingMode schedulingMode = this.scheduling_mode;
            if (schedulingMode != null) {
                arrayList.add("scheduling_mode=" + schedulingMode);
            }
            LocalText localText = this.friendly_fulfillment_time;
            if (localText != null) {
                arrayList.add("friendly_fulfillment_time=" + localText);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SchedulingDetails{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$SchedulingDetails$SchedulingMode;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SCHEDULING_MODE_UNSPECIFIED", "SCHEDULING_MODE_SCHEDULED", "SCHEDULING_MODE_ASAP", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class SchedulingMode implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ SchedulingMode[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final SchedulingMode SCHEDULING_MODE_ASAP;
            public static final SchedulingMode SCHEDULING_MODE_SCHEDULED;
            public static final SchedulingMode SCHEDULING_MODE_UNSPECIFIED;
            private final int value;

            private static final /* synthetic */ SchedulingMode[] $values() {
                return new SchedulingMode[]{SCHEDULING_MODE_UNSPECIFIED, SCHEDULING_MODE_SCHEDULED, SCHEDULING_MODE_ASAP};
            }

            static {
                final SchedulingMode schedulingMode = new SchedulingMode("SCHEDULING_MODE_UNSPECIFIED", 0, 0);
                SCHEDULING_MODE_UNSPECIFIED = schedulingMode;
                SCHEDULING_MODE_SCHEDULED = new SchedulingMode("SCHEDULING_MODE_SCHEDULED", 1, 1);
                SCHEDULING_MODE_ASAP = new SchedulingMode("SCHEDULING_MODE_ASAP", 2, 2);
                SchedulingMode[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SchedulingMode.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, schedulingMode) { // from class: com.squareup.protos.cash.local.client.v1.LocalFulfillment$SchedulingDetails$SchedulingMode$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public LocalFulfillment.SchedulingDetails.SchedulingMode fromValue(int value) {
                        return LocalFulfillment.SchedulingDetails.SchedulingMode.INSTANCE.fromValue(value);
                    }
                };
            }

            private SchedulingMode(String str, int i, int i2) {
                this.value = i2;
            }

            public static final SchedulingMode fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static SchedulingMode valueOf(String str) {
                return (SchedulingMode) Enum.valueOf(SchedulingMode.class, str);
            }

            public static SchedulingMode[] values() {
                return (SchedulingMode[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$SchedulingDetails$SchedulingMode$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$SchedulingDetails$SchedulingMode;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final SchedulingMode fromValue(int value) {
                    if (value == 0) {
                        return SchedulingMode.SCHEDULING_MODE_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return SchedulingMode.SCHEDULING_MODE_SCHEDULED;
                    }
                    if (value != 2) {
                        return null;
                    }
                    return SchedulingMode.SCHEDULING_MODE_ASAP;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$SchedulingDetails$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$SchedulingDetails$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$SchedulingDetails;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$SchedulingDetails;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ SchedulingDetails build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public SchedulingDetails() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SchedulingDetails(String str, SchedulingMode schedulingMode, LocalText localText, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.scheduling_day_time_token = str;
            this.scheduling_mode = schedulingMode;
            this.friendly_fulfillment_time = localText;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LocalFulfillment.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalFulfillment$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public LocalFulfillment decode(ProtoReader reader) {
                Object obj;
                Object obj2;
                reader.getClass();
                long beginMessage = reader.beginMessage();
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
                        return new LocalFulfillment((LocalFulfillmentType) obj3, (String) obj4, (LocalFulfillment.EstimatedCompletionTime) obj5, (LocalFulfillment.EstimatedCompletionDuration) obj6, (LocalFulfillment.DeliveryDetails) obj7, (LocalFulfillment.SchedulingDetails) obj8, (LocalFulfillment.InStoreDetails) obj9, (LocalFulfillment.PickupDetails) obj10, (LocalFulfillment.ShippingDetails) obj11, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            try {
                                obj3 = LocalFulfillmentType.ADAPTER.decode(reader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                obj = obj3;
                                obj2 = obj4;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 2:
                            obj5 = TransactorKt.decodeMessageOrMerge(LocalFulfillment.EstimatedCompletionTime.ADAPTER, reader, obj5);
                            continue;
                        case 3:
                            obj7 = TransactorKt.decodeMessageOrMerge(LocalFulfillment.DeliveryDetails.ADAPTER, reader, obj7);
                            continue;
                        case 4:
                            obj6 = TransactorKt.decodeMessageOrMerge(LocalFulfillment.EstimatedCompletionDuration.ADAPTER, reader, obj6);
                            continue;
                        case 5:
                            obj8 = TransactorKt.decodeMessageOrMerge(LocalFulfillment.SchedulingDetails.ADAPTER, reader, obj8);
                            continue;
                        case 6:
                            obj9 = TransactorKt.decodeMessageOrMerge(LocalFulfillment.InStoreDetails.ADAPTER, reader, obj9);
                            continue;
                        case 7:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 8:
                            obj10 = TransactorKt.decodeMessageOrMerge(LocalFulfillment.PickupDetails.ADAPTER, reader, obj10);
                            continue;
                        case 9:
                            obj11 = TransactorKt.decodeMessageOrMerge(LocalFulfillment.ShippingDetails.ADAPTER, reader, obj11);
                            continue;
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj3;
                            obj2 = obj4;
                            break;
                    }
                    obj4 = obj2;
                    obj3 = obj;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LocalFulfillment value) {
                writer.getClass();
                value.getClass();
                LocalFulfillmentType.ADAPTER.encodeWithTag(writer, 1, value.type);
                ProtoAdapter.STRING.encodeWithTag(writer, 7, value.token);
                LocalFulfillment.EstimatedCompletionTime.ADAPTER.encodeWithTag(writer, 2, value.estimated_completion_time);
                LocalFulfillment.EstimatedCompletionDuration.ADAPTER.encodeWithTag(writer, 4, value.estimated_completion_duration);
                LocalFulfillment.DeliveryDetails.ADAPTER.encodeWithTag(writer, 3, value.delivery_details);
                LocalFulfillment.SchedulingDetails.ADAPTER.encodeWithTag(writer, 5, value.scheduling_details);
                LocalFulfillment.InStoreDetails.ADAPTER.encodeWithTag(writer, 6, value.in_store_details);
                LocalFulfillment.PickupDetails.ADAPTER.encodeWithTag(writer, 8, value.pickup_details);
                LocalFulfillment.ShippingDetails.ADAPTER.encodeWithTag(writer, 9, value.shipping_details);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LocalFulfillment value) {
                value.getClass();
                return LocalFulfillment.ShippingDetails.ADAPTER.encodedSizeWithTag(9, value.shipping_details) + LocalFulfillment.PickupDetails.ADAPTER.encodedSizeWithTag(8, value.pickup_details) + LocalFulfillment.InStoreDetails.ADAPTER.encodedSizeWithTag(6, value.in_store_details) + LocalFulfillment.SchedulingDetails.ADAPTER.encodedSizeWithTag(5, value.scheduling_details) + LocalFulfillment.DeliveryDetails.ADAPTER.encodedSizeWithTag(3, value.delivery_details) + LocalFulfillment.EstimatedCompletionDuration.ADAPTER.encodedSizeWithTag(4, value.estimated_completion_duration) + LocalFulfillment.EstimatedCompletionTime.ADAPTER.encodedSizeWithTag(2, value.estimated_completion_time) + ProtoAdapter.STRING.encodedSizeWithTag(7, value.token) + LocalFulfillmentType.ADAPTER.encodedSizeWithTag(1, value.type) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LocalFulfillment redact(LocalFulfillment value) {
                value.getClass();
                LocalFulfillment.EstimatedCompletionTime estimatedCompletionTime = value.estimated_completion_time;
                LocalFulfillment.EstimatedCompletionTime estimatedCompletionTime2 = estimatedCompletionTime != null ? (LocalFulfillment.EstimatedCompletionTime) LocalFulfillment.EstimatedCompletionTime.ADAPTER.redact(estimatedCompletionTime) : null;
                LocalFulfillment.EstimatedCompletionDuration estimatedCompletionDuration = value.estimated_completion_duration;
                LocalFulfillment.EstimatedCompletionDuration estimatedCompletionDuration2 = estimatedCompletionDuration != null ? (LocalFulfillment.EstimatedCompletionDuration) LocalFulfillment.EstimatedCompletionDuration.ADAPTER.redact(estimatedCompletionDuration) : null;
                LocalFulfillment.DeliveryDetails deliveryDetails = value.delivery_details;
                LocalFulfillment.DeliveryDetails deliveryDetails2 = deliveryDetails != null ? (LocalFulfillment.DeliveryDetails) LocalFulfillment.DeliveryDetails.ADAPTER.redact(deliveryDetails) : null;
                LocalFulfillment.SchedulingDetails schedulingDetails = value.scheduling_details;
                LocalFulfillment.SchedulingDetails schedulingDetails2 = schedulingDetails != null ? (LocalFulfillment.SchedulingDetails) LocalFulfillment.SchedulingDetails.ADAPTER.redact(schedulingDetails) : null;
                LocalFulfillment.InStoreDetails inStoreDetails = value.in_store_details;
                LocalFulfillment.InStoreDetails inStoreDetails2 = inStoreDetails != null ? (LocalFulfillment.InStoreDetails) LocalFulfillment.InStoreDetails.ADAPTER.redact(inStoreDetails) : null;
                LocalFulfillment.PickupDetails pickupDetails = value.pickup_details;
                LocalFulfillment.PickupDetails pickupDetails2 = pickupDetails != null ? (LocalFulfillment.PickupDetails) LocalFulfillment.PickupDetails.ADAPTER.redact(pickupDetails) : null;
                LocalFulfillment.ShippingDetails shippingDetails = value.shipping_details;
                return LocalFulfillment.copy$default(value, estimatedCompletionTime2, estimatedCompletionDuration2, deliveryDetails2, schedulingDetails2, inStoreDetails2, pickupDetails2, shippingDetails != null ? (LocalFulfillment.ShippingDetails) LocalFulfillment.ShippingDetails.ADAPTER.redact(shippingDetails) : null, ByteString.EMPTY, 3);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LocalFulfillment value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                LocalFulfillment.ShippingDetails.ADAPTER.encodeWithTag(writer, 9, value.shipping_details);
                LocalFulfillment.PickupDetails.ADAPTER.encodeWithTag(writer, 8, value.pickup_details);
                LocalFulfillment.InStoreDetails.ADAPTER.encodeWithTag(writer, 6, value.in_store_details);
                LocalFulfillment.SchedulingDetails.ADAPTER.encodeWithTag(writer, 5, value.scheduling_details);
                LocalFulfillment.DeliveryDetails.ADAPTER.encodeWithTag(writer, 3, value.delivery_details);
                LocalFulfillment.EstimatedCompletionDuration.ADAPTER.encodeWithTag(writer, 4, value.estimated_completion_duration);
                LocalFulfillment.EstimatedCompletionTime.ADAPTER.encodeWithTag(writer, 2, value.estimated_completion_time);
                ProtoAdapter.STRING.encodeWithTag(writer, 7, value.token);
                LocalFulfillmentType.ADAPTER.encodeWithTag(writer, 1, value.type);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalFulfillment(LocalFulfillmentType localFulfillmentType, String str, EstimatedCompletionTime estimatedCompletionTime, EstimatedCompletionDuration estimatedCompletionDuration, DeliveryDetails deliveryDetails, SchedulingDetails schedulingDetails, InStoreDetails inStoreDetails, PickupDetails pickupDetails, ShippingDetails shippingDetails, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.type = localFulfillmentType;
        this.token = str;
        this.estimated_completion_time = estimatedCompletionTime;
        this.estimated_completion_duration = estimatedCompletionDuration;
        this.delivery_details = deliveryDetails;
        this.scheduling_details = schedulingDetails;
        this.in_store_details = inStoreDetails;
        this.pickup_details = pickupDetails;
        this.shipping_details = shippingDetails;
    }

    public static LocalFulfillment copy$default(LocalFulfillment localFulfillment, EstimatedCompletionTime estimatedCompletionTime, EstimatedCompletionDuration estimatedCompletionDuration, DeliveryDetails deliveryDetails, SchedulingDetails schedulingDetails, InStoreDetails inStoreDetails, PickupDetails pickupDetails, ShippingDetails shippingDetails, ByteString byteString, int i) {
        LocalFulfillmentType localFulfillmentType = localFulfillment.type;
        String str = localFulfillment.token;
        if ((i & 4) != 0) {
            estimatedCompletionTime = localFulfillment.estimated_completion_time;
        }
        EstimatedCompletionTime estimatedCompletionTime2 = estimatedCompletionTime;
        if ((i & 8) != 0) {
            estimatedCompletionDuration = localFulfillment.estimated_completion_duration;
        }
        EstimatedCompletionDuration estimatedCompletionDuration2 = estimatedCompletionDuration;
        if ((i & 16) != 0) {
            deliveryDetails = localFulfillment.delivery_details;
        }
        DeliveryDetails deliveryDetails2 = deliveryDetails;
        SchedulingDetails schedulingDetails2 = (i & 32) != 0 ? localFulfillment.scheduling_details : schedulingDetails;
        InStoreDetails inStoreDetails2 = (i & 64) != 0 ? localFulfillment.in_store_details : inStoreDetails;
        PickupDetails pickupDetails2 = (i & 128) != 0 ? localFulfillment.pickup_details : pickupDetails;
        ShippingDetails shippingDetails2 = (i & 256) != 0 ? localFulfillment.shipping_details : shippingDetails;
        ByteString unknownFields = (i & 512) != 0 ? localFulfillment.unknownFields() : byteString;
        localFulfillment.getClass();
        unknownFields.getClass();
        return new LocalFulfillment(localFulfillmentType, str, estimatedCompletionTime2, estimatedCompletionDuration2, deliveryDetails2, schedulingDetails2, inStoreDetails2, pickupDetails2, shippingDetails2, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalFulfillment)) {
            return false;
        }
        LocalFulfillment localFulfillment = (LocalFulfillment) obj;
        return Intrinsics.areEqual(unknownFields(), localFulfillment.unknownFields()) && this.type == localFulfillment.type && Intrinsics.areEqual(this.token, localFulfillment.token) && Intrinsics.areEqual(this.estimated_completion_time, localFulfillment.estimated_completion_time) && Intrinsics.areEqual(this.estimated_completion_duration, localFulfillment.estimated_completion_duration) && Intrinsics.areEqual(this.delivery_details, localFulfillment.delivery_details) && Intrinsics.areEqual(this.scheduling_details, localFulfillment.scheduling_details) && Intrinsics.areEqual(this.in_store_details, localFulfillment.in_store_details) && Intrinsics.areEqual(this.pickup_details, localFulfillment.pickup_details) && Intrinsics.areEqual(this.shipping_details, localFulfillment.shipping_details);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalFulfillmentType localFulfillmentType = this.type;
        int hashCode2 = (hashCode + (localFulfillmentType != null ? localFulfillmentType.hashCode() : 0)) * 37;
        String str = this.token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        EstimatedCompletionTime estimatedCompletionTime = this.estimated_completion_time;
        int hashCode4 = (hashCode3 + (estimatedCompletionTime != null ? estimatedCompletionTime.hashCode() : 0)) * 37;
        EstimatedCompletionDuration estimatedCompletionDuration = this.estimated_completion_duration;
        int hashCode5 = (hashCode4 + (estimatedCompletionDuration != null ? estimatedCompletionDuration.hashCode() : 0)) * 37;
        DeliveryDetails deliveryDetails = this.delivery_details;
        int hashCode6 = (hashCode5 + (deliveryDetails != null ? deliveryDetails.hashCode() : 0)) * 37;
        SchedulingDetails schedulingDetails = this.scheduling_details;
        int hashCode7 = (hashCode6 + (schedulingDetails != null ? schedulingDetails.hashCode() : 0)) * 37;
        InStoreDetails inStoreDetails = this.in_store_details;
        int hashCode8 = (hashCode7 + (inStoreDetails != null ? inStoreDetails.hashCode() : 0)) * 37;
        PickupDetails pickupDetails = this.pickup_details;
        int hashCode9 = (hashCode8 + (pickupDetails != null ? pickupDetails.hashCode() : 0)) * 37;
        ShippingDetails shippingDetails = this.shipping_details;
        int hashCode10 = hashCode9 + (shippingDetails != null ? shippingDetails.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.token = this.token;
        builder.estimated_completion_time = this.estimated_completion_time;
        builder.estimated_completion_duration = this.estimated_completion_duration;
        builder.delivery_details = this.delivery_details;
        builder.scheduling_details = this.scheduling_details;
        builder.in_store_details = this.in_store_details;
        builder.pickup_details = this.pickup_details;
        builder.shipping_details = this.shipping_details;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalFulfillmentType localFulfillmentType = this.type;
        if (localFulfillmentType != null) {
            arrayList.add("type=" + localFulfillmentType);
        }
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        EstimatedCompletionTime estimatedCompletionTime = this.estimated_completion_time;
        if (estimatedCompletionTime != null) {
            arrayList.add("estimated_completion_time=" + estimatedCompletionTime);
        }
        EstimatedCompletionDuration estimatedCompletionDuration = this.estimated_completion_duration;
        if (estimatedCompletionDuration != null) {
            arrayList.add("estimated_completion_duration=" + estimatedCompletionDuration);
        }
        DeliveryDetails deliveryDetails = this.delivery_details;
        if (deliveryDetails != null) {
            arrayList.add("delivery_details=" + deliveryDetails);
        }
        SchedulingDetails schedulingDetails = this.scheduling_details;
        if (schedulingDetails != null) {
            arrayList.add("scheduling_details=" + schedulingDetails);
        }
        InStoreDetails inStoreDetails = this.in_store_details;
        if (inStoreDetails != null) {
            arrayList.add("in_store_details=" + inStoreDetails);
        }
        PickupDetails pickupDetails = this.pickup_details;
        if (pickupDetails != null) {
            arrayList.add("pickup_details=" + pickupDetails);
        }
        ShippingDetails shippingDetails = this.shipping_details;
        if (shippingDetails != null) {
            arrayList.add("shipping_details=" + shippingDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalFulfillment{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J-\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionDuration;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionDuration$Builder;", "earliest", "", "latest", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lokio/ByteString;)V", "Ljava/lang/Long;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Lokio/ByteString;)Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionDuration;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class EstimatedCompletionDuration extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EstimatedCompletionDuration> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 0, tag = 1)
        public final Long earliest;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 1, tag = 2)
        public final Long latest;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionDuration$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionDuration;", "<init>", "()V", "earliest", "", "Ljava/lang/Long;", "latest", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionDuration$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Long earliest;
            public Long latest;

            @Override // com.squareup.wire.Message.Builder
            public EstimatedCompletionDuration build() {
                return new EstimatedCompletionDuration(this.earliest, this.latest, buildUnknownFields());
            }

            public final Builder earliest(Long earliest) {
                this.earliest = earliest;
                return this;
            }

            public final Builder latest(Long latest) {
                this.latest = latest;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EstimatedCompletionDuration.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalFulfillment$EstimatedCompletionDuration$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public LocalFulfillment.EstimatedCompletionDuration decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new LocalFulfillment.EstimatedCompletionDuration((Long) obj, (Long) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.INT64.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.INT64.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LocalFulfillment.EstimatedCompletionDuration value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                    protoAdapter2.encodeWithTag(writer, 1, value.earliest);
                    protoAdapter2.encodeWithTag(writer, 2, value.latest);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LocalFulfillment.EstimatedCompletionDuration value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                    return protoAdapter2.encodedSizeWithTag(2, value.latest) + protoAdapter2.encodedSizeWithTag(1, value.earliest) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LocalFulfillment.EstimatedCompletionDuration redact(LocalFulfillment.EstimatedCompletionDuration value) {
                    value.getClass();
                    return LocalFulfillment.EstimatedCompletionDuration.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LocalFulfillment.EstimatedCompletionDuration value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                    protoAdapter2.encodeWithTag(writer, 2, value.latest);
                    protoAdapter2.encodeWithTag(writer, 1, value.earliest);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ EstimatedCompletionDuration(Long l, Long l2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ EstimatedCompletionDuration copy$default(EstimatedCompletionDuration estimatedCompletionDuration, Long l, Long l2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                l = estimatedCompletionDuration.earliest;
            }
            if ((i & 2) != 0) {
                l2 = estimatedCompletionDuration.latest;
            }
            if ((i & 4) != 0) {
                byteString = estimatedCompletionDuration.unknownFields();
            }
            return estimatedCompletionDuration.copy(l, l2, byteString);
        }

        public final EstimatedCompletionDuration copy(Long earliest, Long latest, ByteString unknownFields) {
            unknownFields.getClass();
            return new EstimatedCompletionDuration(earliest, latest, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof EstimatedCompletionDuration)) {
                return false;
            }
            EstimatedCompletionDuration estimatedCompletionDuration = (EstimatedCompletionDuration) other;
            return Intrinsics.areEqual(unknownFields(), estimatedCompletionDuration.unknownFields()) && Intrinsics.areEqual(this.earliest, estimatedCompletionDuration.earliest) && Intrinsics.areEqual(this.latest, estimatedCompletionDuration.latest);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.earliest;
            int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Long l2 = this.latest;
            int hashCode3 = hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.earliest = this.earliest;
            builder.latest = this.latest;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Long l = this.earliest;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("earliest=", l, arrayList);
            }
            Long l2 = this.latest;
            if (l2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("latest=", l2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EstimatedCompletionDuration{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionDuration$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionDuration$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionDuration;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionDuration;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ EstimatedCompletionDuration build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public EstimatedCompletionDuration() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EstimatedCompletionDuration(Long l, Long l2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.earliest = l;
            this.latest = l2;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J-\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionTime;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionTime$Builder;", "earliest", "", "latest", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lokio/ByteString;)V", "Ljava/lang/Long;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Lokio/ByteString;)Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionTime;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class EstimatedCompletionTime extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EstimatedCompletionTime> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 0, tag = 1)
        public final Long earliest;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 1, tag = 2)
        public final Long latest;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionTime$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionTime;", "<init>", "()V", "earliest", "", "Ljava/lang/Long;", "latest", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionTime$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Long earliest;
            public Long latest;

            @Override // com.squareup.wire.Message.Builder
            public EstimatedCompletionTime build() {
                return new EstimatedCompletionTime(this.earliest, this.latest, buildUnknownFields());
            }

            public final Builder earliest(Long earliest) {
                this.earliest = earliest;
                return this;
            }

            public final Builder latest(Long latest) {
                this.latest = latest;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EstimatedCompletionTime.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalFulfillment$EstimatedCompletionTime$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public LocalFulfillment.EstimatedCompletionTime decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new LocalFulfillment.EstimatedCompletionTime((Long) obj, (Long) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.INT64.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.INT64.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LocalFulfillment.EstimatedCompletionTime value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                    protoAdapter2.encodeWithTag(writer, 1, value.earliest);
                    protoAdapter2.encodeWithTag(writer, 2, value.latest);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LocalFulfillment.EstimatedCompletionTime value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                    return protoAdapter2.encodedSizeWithTag(2, value.latest) + protoAdapter2.encodedSizeWithTag(1, value.earliest) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LocalFulfillment.EstimatedCompletionTime redact(LocalFulfillment.EstimatedCompletionTime value) {
                    value.getClass();
                    return LocalFulfillment.EstimatedCompletionTime.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LocalFulfillment.EstimatedCompletionTime value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                    protoAdapter2.encodeWithTag(writer, 2, value.latest);
                    protoAdapter2.encodeWithTag(writer, 1, value.earliest);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ EstimatedCompletionTime(Long l, Long l2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ EstimatedCompletionTime copy$default(EstimatedCompletionTime estimatedCompletionTime, Long l, Long l2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                l = estimatedCompletionTime.earliest;
            }
            if ((i & 2) != 0) {
                l2 = estimatedCompletionTime.latest;
            }
            if ((i & 4) != 0) {
                byteString = estimatedCompletionTime.unknownFields();
            }
            return estimatedCompletionTime.copy(l, l2, byteString);
        }

        public final EstimatedCompletionTime copy(Long earliest, Long latest, ByteString unknownFields) {
            unknownFields.getClass();
            return new EstimatedCompletionTime(earliest, latest, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof EstimatedCompletionTime)) {
                return false;
            }
            EstimatedCompletionTime estimatedCompletionTime = (EstimatedCompletionTime) other;
            return Intrinsics.areEqual(unknownFields(), estimatedCompletionTime.unknownFields()) && Intrinsics.areEqual(this.earliest, estimatedCompletionTime.earliest) && Intrinsics.areEqual(this.latest, estimatedCompletionTime.latest);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.earliest;
            int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Long l2 = this.latest;
            int hashCode3 = hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.earliest = this.earliest;
            builder.latest = this.latest;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Long l = this.earliest;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("earliest=", l, arrayList);
            }
            Long l2 = this.latest;
            if (l2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("latest=", l2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EstimatedCompletionTime{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionTime$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionTime$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionTime;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$EstimatedCompletionTime;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ EstimatedCompletionTime build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public EstimatedCompletionTime() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EstimatedCompletionTime(Long l, Long l2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.earliest = l;
            this.latest = l2;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$InStoreDetails;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$InStoreDetails$Builder;", "ordering_station_label", "", "ordering_token", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class InStoreDetails extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InStoreDetails> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String ordering_station_label;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String ordering_token;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$InStoreDetails$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$InStoreDetails;", "<init>", "()V", "ordering_station_label", "", "ordering_token", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String ordering_station_label;
            public String ordering_token;

            @Override // com.squareup.wire.Message.Builder
            public InStoreDetails build() {
                return new InStoreDetails(this.ordering_station_label, this.ordering_token, buildUnknownFields());
            }

            public final Builder ordering_station_label(String ordering_station_label) {
                this.ordering_station_label = ordering_station_label;
                return this;
            }

            public final Builder ordering_token(String ordering_token) {
                this.ordering_token = ordering_token;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InStoreDetails.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalFulfillment$InStoreDetails$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public LocalFulfillment.InStoreDetails decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new LocalFulfillment.InStoreDetails((String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
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
                public void encode(ProtoWriter writer, LocalFulfillment.InStoreDetails value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.ordering_station_label);
                    protoAdapter2.encodeWithTag(writer, 2, value.ordering_token);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LocalFulfillment.InStoreDetails value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(2, value.ordering_token) + protoAdapter2.encodedSizeWithTag(1, value.ordering_station_label) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LocalFulfillment.InStoreDetails redact(LocalFulfillment.InStoreDetails value) {
                    value.getClass();
                    return LocalFulfillment.InStoreDetails.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LocalFulfillment.InStoreDetails value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.ordering_token);
                    protoAdapter2.encodeWithTag(writer, 1, value.ordering_station_label);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ InStoreDetails(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ InStoreDetails copy$default(InStoreDetails inStoreDetails, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = inStoreDetails.ordering_station_label;
            }
            if ((i & 2) != 0) {
                str2 = inStoreDetails.ordering_token;
            }
            if ((i & 4) != 0) {
                byteString = inStoreDetails.unknownFields();
            }
            return inStoreDetails.copy(str, str2, byteString);
        }

        public final InStoreDetails copy(String ordering_station_label, String ordering_token, ByteString unknownFields) {
            unknownFields.getClass();
            return new InStoreDetails(ordering_station_label, ordering_token, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof InStoreDetails)) {
                return false;
            }
            InStoreDetails inStoreDetails = (InStoreDetails) other;
            return Intrinsics.areEqual(unknownFields(), inStoreDetails.unknownFields()) && Intrinsics.areEqual(this.ordering_station_label, inStoreDetails.ordering_station_label) && Intrinsics.areEqual(this.ordering_token, inStoreDetails.ordering_token);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.ordering_station_label;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.ordering_token;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.ordering_station_label = this.ordering_station_label;
            builder.ordering_token = this.ordering_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.ordering_station_label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "ordering_station_label=", arrayList);
            }
            String str2 = this.ordering_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "ordering_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InStoreDetails{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$InStoreDetails$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$InStoreDetails$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$InStoreDetails;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$InStoreDetails;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ InStoreDetails build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public InStoreDetails() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InStoreDetails(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.ordering_station_label = str;
            this.ordering_token = str2;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0016J=\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u0019R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$PickupDetails;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$PickupDetails$Builder;", "is_curbside_pickup", "", "recipient_identifiers", "", "Lcom/squareup/protos/cash/local/client/v1/RecipientIdentifier;", "buyer_arrived_at", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Long;Lokio/ByteString;)V", "Ljava/lang/Boolean;", "Ljava/lang/Long;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Long;Lokio/ByteString;)Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$PickupDetails;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class PickupDetails extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PickupDetails> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 2, tag = 3)
        public final Long buyer_arrived_at;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
        public final Boolean is_curbside_pickup;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.RecipientIdentifier#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        public final List<RecipientIdentifier> recipient_identifiers;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$PickupDetails$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$PickupDetails;", "<init>", "()V", "is_curbside_pickup", "", "Ljava/lang/Boolean;", "recipient_identifiers", "", "Lcom/squareup/protos/cash/local/client/v1/RecipientIdentifier;", "buyer_arrived_at", "", "Ljava/lang/Long;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$PickupDetails$Builder;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$PickupDetails$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Long buyer_arrived_at;
            public Boolean is_curbside_pickup;
            public List<RecipientIdentifier> recipient_identifiers = EmptyList.INSTANCE;

            @Override // com.squareup.wire.Message.Builder
            public PickupDetails build() {
                return new PickupDetails(this.is_curbside_pickup, this.recipient_identifiers, this.buyer_arrived_at, buildUnknownFields());
            }

            public final Builder buyer_arrived_at(Long buyer_arrived_at) {
                this.buyer_arrived_at = buyer_arrived_at;
                return this;
            }

            public final Builder is_curbside_pickup(Boolean is_curbside_pickup) {
                this.is_curbside_pickup = is_curbside_pickup;
                return this;
            }

            public final Builder recipient_identifiers(List<RecipientIdentifier> recipient_identifiers) {
                recipient_identifiers.getClass();
                TransactorKt.checkElementsNotNull(recipient_identifiers);
                this.recipient_identifiers = recipient_identifiers;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PickupDetails.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalFulfillment$PickupDetails$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public LocalFulfillment.PickupDetails decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new LocalFulfillment.PickupDetails((Boolean) obj, m, (Long) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.BOOL.decode(reader);
                        } else if (nextTag == 2) {
                            m.add(RecipientIdentifier.ADAPTER.decode(reader));
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.INT64.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LocalFulfillment.PickupDetails value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.is_curbside_pickup);
                    RecipientIdentifier.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.recipient_identifiers);
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, value.buyer_arrived_at);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LocalFulfillment.PickupDetails value) {
                    value.getClass();
                    return ProtoAdapter.INT64.encodedSizeWithTag(3, value.buyer_arrived_at) + RecipientIdentifier.ADAPTER.asRepeated().encodedSizeWithTag(2, value.recipient_identifiers) + ProtoAdapter.BOOL.encodedSizeWithTag(1, value.is_curbside_pickup) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LocalFulfillment.PickupDetails redact(LocalFulfillment.PickupDetails value) {
                    value.getClass();
                    return LocalFulfillment.PickupDetails.copy$default(value, null, TransactorKt.m1169redactElements(value.recipient_identifiers, RecipientIdentifier.ADAPTER), null, ByteString.EMPTY, 5, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LocalFulfillment.PickupDetails value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, value.buyer_arrived_at);
                    RecipientIdentifier.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.recipient_identifiers);
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.is_curbside_pickup);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public PickupDetails(Boolean bool, List list, Long l, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? EmptyList.INSTANCE : list, (i & 4) != 0 ? null : l, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PickupDetails copy$default(PickupDetails pickupDetails, Boolean bool, List list, Long l, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = pickupDetails.is_curbside_pickup;
            }
            if ((i & 2) != 0) {
                list = pickupDetails.recipient_identifiers;
            }
            if ((i & 4) != 0) {
                l = pickupDetails.buyer_arrived_at;
            }
            if ((i & 8) != 0) {
                byteString = pickupDetails.unknownFields();
            }
            return pickupDetails.copy(bool, list, l, byteString);
        }

        public final PickupDetails copy(Boolean is_curbside_pickup, List<RecipientIdentifier> recipient_identifiers, Long buyer_arrived_at, ByteString unknownFields) {
            recipient_identifiers.getClass();
            unknownFields.getClass();
            return new PickupDetails(is_curbside_pickup, recipient_identifiers, buyer_arrived_at, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PickupDetails)) {
                return false;
            }
            PickupDetails pickupDetails = (PickupDetails) other;
            return Intrinsics.areEqual(unknownFields(), pickupDetails.unknownFields()) && Intrinsics.areEqual(this.is_curbside_pickup, pickupDetails.is_curbside_pickup) && Intrinsics.areEqual(this.recipient_identifiers, pickupDetails.recipient_identifiers) && Intrinsics.areEqual(this.buyer_arrived_at, pickupDetails.buyer_arrived_at);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Boolean bool = this.is_curbside_pickup;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37, 37, this.recipient_identifiers);
            Long l = this.buyer_arrived_at;
            int hashCode2 = m + (l != null ? Long.hashCode(l.longValue()) : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.is_curbside_pickup = this.is_curbside_pickup;
            builder.recipient_identifiers = this.recipient_identifiers;
            builder.buyer_arrived_at = this.buyer_arrived_at;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Boolean bool = this.is_curbside_pickup;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_curbside_pickup=", bool, arrayList);
            }
            if (!this.recipient_identifiers.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("recipient_identifiers=", arrayList, this.recipient_identifiers);
            }
            Long l = this.buyer_arrived_at;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("buyer_arrived_at=", l, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PickupDetails{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$PickupDetails$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$PickupDetails$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$PickupDetails;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$PickupDetails;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ PickupDetails build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public PickupDetails() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PickupDetails(Boolean bool, List<RecipientIdentifier> list, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.is_curbside_pickup = bool;
            this.buyer_arrived_at = l;
            this.recipient_identifiers = TransactorKt.immutableCopyOf("recipient_identifiers", list);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016J@\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$ShippingDetails;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$ShippingDetails$Builder;", "token", "", "carrier", "shipping_option", "shipping_address", "Lcom/squareup/protos/cash/local/client/v1/LocalAddress;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/local/client/v1/LocalAddress;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class ShippingDetails extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ShippingDetails> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String carrier;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalAddress#ADAPTER", schemaIndex = 3, tag = 4)
        public final LocalAddress shipping_address;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String shipping_option;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String token;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$ShippingDetails$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$ShippingDetails;", "<init>", "()V", "token", "", "carrier", "shipping_option", "shipping_address", "Lcom/squareup/protos/cash/local/client/v1/LocalAddress;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String carrier;
            public LocalAddress shipping_address;
            public String shipping_option;
            public String token;

            @Override // com.squareup.wire.Message.Builder
            public ShippingDetails build() {
                return new ShippingDetails(this.token, this.carrier, this.shipping_option, this.shipping_address, buildUnknownFields());
            }

            public final Builder carrier(String carrier) {
                this.carrier = carrier;
                return this;
            }

            public final Builder shipping_address(LocalAddress shipping_address) {
                this.shipping_address = shipping_address;
                return this;
            }

            public final Builder shipping_option(String shipping_option) {
                this.shipping_option = shipping_option;
                return this;
            }

            public final Builder token(String token) {
                this.token = token;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ShippingDetails.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalFulfillment$ShippingDetails$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public LocalFulfillment.ShippingDetails decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new LocalFulfillment.ShippingDetails((String) obj, (String) obj2, (String) obj3, (LocalAddress) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = TransactorKt.decodeMessageOrMerge(LocalAddress.ADAPTER, reader, obj4);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LocalFulfillment.ShippingDetails value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.token);
                    protoAdapter2.encodeWithTag(writer, 2, value.carrier);
                    protoAdapter2.encodeWithTag(writer, 3, value.shipping_option);
                    LocalAddress.ADAPTER.encodeWithTag(writer, 4, value.shipping_address);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LocalFulfillment.ShippingDetails value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return LocalAddress.ADAPTER.encodedSizeWithTag(4, value.shipping_address) + protoAdapter2.encodedSizeWithTag(3, value.shipping_option) + protoAdapter2.encodedSizeWithTag(2, value.carrier) + protoAdapter2.encodedSizeWithTag(1, value.token) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LocalFulfillment.ShippingDetails redact(LocalFulfillment.ShippingDetails value) {
                    value.getClass();
                    LocalAddress localAddress = value.shipping_address;
                    return LocalFulfillment.ShippingDetails.copy$default(value, null, null, null, localAddress != null ? (LocalAddress) LocalAddress.ADAPTER.redact(localAddress) : null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LocalFulfillment.ShippingDetails value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    LocalAddress.ADAPTER.encodeWithTag(writer, 4, value.shipping_address);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.shipping_option);
                    protoAdapter2.encodeWithTag(writer, 2, value.carrier);
                    protoAdapter2.encodeWithTag(writer, 1, value.token);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ShippingDetails(String str, String str2, String str3, LocalAddress localAddress, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : localAddress, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ShippingDetails copy$default(ShippingDetails shippingDetails, String str, String str2, String str3, LocalAddress localAddress, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shippingDetails.token;
            }
            if ((i & 2) != 0) {
                str2 = shippingDetails.carrier;
            }
            if ((i & 4) != 0) {
                str3 = shippingDetails.shipping_option;
            }
            if ((i & 8) != 0) {
                localAddress = shippingDetails.shipping_address;
            }
            if ((i & 16) != 0) {
                byteString = shippingDetails.unknownFields();
            }
            ByteString byteString2 = byteString;
            String str4 = str3;
            return shippingDetails.copy(str, str2, str4, localAddress, byteString2);
        }

        public final ShippingDetails copy(String token, String carrier, String shipping_option, LocalAddress shipping_address, ByteString unknownFields) {
            unknownFields.getClass();
            return new ShippingDetails(token, carrier, shipping_option, shipping_address, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ShippingDetails)) {
                return false;
            }
            ShippingDetails shippingDetails = (ShippingDetails) other;
            return Intrinsics.areEqual(unknownFields(), shippingDetails.unknownFields()) && Intrinsics.areEqual(this.token, shippingDetails.token) && Intrinsics.areEqual(this.carrier, shippingDetails.carrier) && Intrinsics.areEqual(this.shipping_option, shippingDetails.shipping_option) && Intrinsics.areEqual(this.shipping_address, shippingDetails.shipping_address);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.carrier;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.shipping_option;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            LocalAddress localAddress = this.shipping_address;
            int hashCode5 = hashCode4 + (localAddress != null ? localAddress.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.token = this.token;
            builder.carrier = this.carrier;
            builder.shipping_option = this.shipping_option;
            builder.shipping_address = this.shipping_address;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
            }
            String str2 = this.carrier;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "carrier=", arrayList);
            }
            String str3 = this.shipping_option;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "shipping_option=", arrayList);
            }
            LocalAddress localAddress = this.shipping_address;
            if (localAddress != null) {
                arrayList.add("shipping_address=" + localAddress);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ShippingDetails{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$ShippingDetails$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$ShippingDetails$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$ShippingDetails;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$ShippingDetails;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ShippingDetails build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ShippingDetails() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShippingDetails(String str, String str2, String str3, LocalAddress localAddress, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.token = str;
            this.carrier = str2;
            this.shipping_option = str3;
            this.shipping_address = localAddress;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ LocalFulfillment build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
