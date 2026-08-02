package com.squareup.protos.cash.supportal.app;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import com.google.android.gms.internal.mlkit_vision_common.zzlq;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.ListPoolsRequest;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.cash.profiles.ProfileDetails;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.franklin.app.ClaimData;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/supportal/app/SupportPhoneStatusResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/pools/ListPoolsRequest$Builder;", "Builder", "com/google/android/gms/internal/mlkit_vision_common/zzlp", "ActiveStatus", "ServiceAvailability", "Idle", "Active", "Granted", "Denied", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SupportPhoneStatusResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SupportPhoneStatusResponse> CREATOR;
    public final zzlp access;

    public final class Active extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Active> CREATOR;
        public final Boolean allow_cancellation;
        public final String message;
        public final String notification_message;
        public final String notification_title;
        public final ServiceAvailability service_availability;
        public final ActiveStatus status;
        public final String title;

        static {
            SupportPhoneStatusResponse$Active$Companion$ADAPTER$1 supportPhoneStatusResponse$Active$Companion$ADAPTER$1 = new SupportPhoneStatusResponse$Active$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Active.class), "type.googleapis.com/squareup.cash.supportal.app.SupportPhoneStatusResponse.Active", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = supportPhoneStatusResponse$Active$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(supportPhoneStatusResponse$Active$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Active(ActiveStatus activeStatus, ServiceAvailability serviceAvailability, String str, String str2, Boolean bool, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.status = activeStatus;
            this.service_availability = serviceAvailability;
            this.title = str;
            this.message = str2;
            this.allow_cancellation = bool;
            this.notification_title = str3;
            this.notification_message = str4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Active)) {
                return false;
            }
            Active active = (Active) obj;
            return Intrinsics.areEqual(unknownFields(), active.unknownFields()) && this.status == active.status && Intrinsics.areEqual(this.service_availability, active.service_availability) && Intrinsics.areEqual(this.title, active.title) && Intrinsics.areEqual(this.message, active.message) && Intrinsics.areEqual(this.allow_cancellation, active.allow_cancellation) && Intrinsics.areEqual(this.notification_title, active.notification_title) && Intrinsics.areEqual(this.notification_message, active.notification_message);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ActiveStatus activeStatus = this.status;
            int hashCode2 = (hashCode + (activeStatus != null ? activeStatus.hashCode() : 0)) * 37;
            ServiceAvailability serviceAvailability = this.service_availability;
            int hashCode3 = (hashCode2 + (serviceAvailability != null ? serviceAvailability.hashCode() : 0)) * 37;
            String str = this.title;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.message;
            int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Boolean bool = this.allow_cancellation;
            int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            String str3 = this.notification_title;
            int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.notification_message;
            int hashCode8 = hashCode7 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PoolParticipant.Builder builder = new PoolParticipant.Builder(27);
            builder.added_at = this.status;
            builder.participant_type = this.service_availability;
            builder.customer_identifier = this.title;
            builder.full_name = this.message;
            builder.aggregated_contribution_amount = this.allow_cancellation;
            builder.profile_photo_url = this.notification_title;
            builder.cashtag = this.notification_message;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            ActiveStatus activeStatus = this.status;
            if (activeStatus != null) {
                arrayList.add("status=" + activeStatus);
            }
            ServiceAvailability serviceAvailability = this.service_availability;
            if (serviceAvailability != null) {
                arrayList.add("service_availability=" + serviceAvailability);
            }
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.message;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "message=", arrayList);
            }
            Boolean bool = this.allow_cancellation;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("allow_cancellation=", bool, arrayList);
            }
            String str3 = this.notification_title;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "notification_title=", arrayList);
            }
            String str4 = this.notification_message;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "notification_message=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Active{", "}", 0, null, null, 56);
        }
    }

    public enum ActiveStatus implements WireEnum {
        IN_QUEUE(1),
        MISSED(2),
        COMPLETED(3),
        CANCELLED(4),
        FAILED_TO_QUEUE(5);

        public final int value;
        public static final TaxEnvironment.Companion Companion = new TaxEnvironment.Companion();
        public static final SupportPhoneStatusResponse$ActiveStatus$Companion$ADAPTER$1 ADAPTER = new SupportPhoneStatusResponse$ActiveStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ActiveStatus.class), Syntax.PROTO_2, null);

        ActiveStatus(int i) {
            this.value = i;
        }

        public static final ActiveStatus fromValue(int i) {
            Companion.getClass();
            return TaxEnvironment.Companion.m3928fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class Denied extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Denied> CREATOR;
        public final String reason;

        static {
            SupportPhoneStatusResponse$Denied$Companion$ADAPTER$1 supportPhoneStatusResponse$Denied$Companion$ADAPTER$1 = new SupportPhoneStatusResponse$Denied$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Denied.class), "type.googleapis.com/squareup.cash.supportal.app.SupportPhoneStatusResponse.Denied", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = supportPhoneStatusResponse$Denied$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(supportPhoneStatusResponse$Denied$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Denied(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.reason = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Denied)) {
                return false;
            }
            Denied denied = (Denied) obj;
            return Intrinsics.areEqual(unknownFields(), denied.unknownFields()) && Intrinsics.areEqual(this.reason, denied.reason);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.reason;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ProfileDetails.Builder builder = new ProfileDetails.Builder(24);
            builder.bio = this.reason;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.reason;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "reason=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Denied{", "}", 0, null, null, 56);
        }
    }

    public final class Granted extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Granted> CREATOR;
        public final zzlq state;

        static {
            SupportPhoneStatusResponse$Granted$Companion$ADAPTER$1 supportPhoneStatusResponse$Granted$Companion$ADAPTER$1 = new SupportPhoneStatusResponse$Granted$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Granted.class), "type.googleapis.com/squareup.cash.supportal.app.SupportPhoneStatusResponse.Granted", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = supportPhoneStatusResponse$Granted$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(supportPhoneStatusResponse$Granted$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Granted(zzlq zzlqVar, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.state = zzlqVar;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Granted)) {
                return false;
            }
            Granted granted = (Granted) obj;
            return Intrinsics.areEqual(unknownFields(), granted.unknownFields()) && Intrinsics.areEqual(this.state, granted.state);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            zzlq zzlqVar = this.state;
            int hashCode2 = hashCode + (zzlqVar != null ? zzlqVar.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ClaimData.Builder builder = new ClaimData.Builder(1);
            builder.claimable_payment = this.state;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            zzlq zzlqVar = this.state;
            if (zzlqVar != null) {
                arrayList.add("state=" + zzlqVar);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Granted{", "}", 0, null, null, 56);
        }
    }

    public final class Idle extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Idle> CREATOR;
        public final ServiceAvailability service_availability;

        static {
            SupportPhoneStatusResponse$Idle$Companion$ADAPTER$1 supportPhoneStatusResponse$Idle$Companion$ADAPTER$1 = new SupportPhoneStatusResponse$Idle$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Idle.class), "type.googleapis.com/squareup.cash.supportal.app.SupportPhoneStatusResponse.Idle", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = supportPhoneStatusResponse$Idle$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(supportPhoneStatusResponse$Idle$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Idle(ServiceAvailability serviceAvailability, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.service_availability = serviceAvailability;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Idle)) {
                return false;
            }
            Idle idle = (Idle) obj;
            return Intrinsics.areEqual(unknownFields(), idle.unknownFields()) && Intrinsics.areEqual(this.service_availability, idle.service_availability);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ServiceAvailability serviceAvailability = this.service_availability;
            int hashCode2 = hashCode + (serviceAvailability != null ? serviceAvailability.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ClaimData.Builder builder = new ClaimData.Builder(2);
            builder.claimable_payment = this.service_availability;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            ServiceAvailability serviceAvailability = this.service_availability;
            if (serviceAvailability != null) {
                arrayList.add("service_availability=" + serviceAvailability);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Idle{", "}", 0, null, null, 56);
        }
    }

    public final class ServiceAvailability extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ServiceAvailability> CREATOR;
        public final String availability_subtitle;
        public final Boolean available;
        public final Long service_available_timestamp;

        static {
            SupportPhoneStatusResponse$ServiceAvailability$Companion$ADAPTER$1 supportPhoneStatusResponse$ServiceAvailability$Companion$ADAPTER$1 = new SupportPhoneStatusResponse$ServiceAvailability$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ServiceAvailability.class), "type.googleapis.com/squareup.cash.supportal.app.SupportPhoneStatusResponse.ServiceAvailability", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = supportPhoneStatusResponse$ServiceAvailability$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(supportPhoneStatusResponse$ServiceAvailability$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ServiceAvailability(Boolean bool, Long l, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.available = bool;
            this.service_available_timestamp = l;
            this.availability_subtitle = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ServiceAvailability)) {
                return false;
            }
            ServiceAvailability serviceAvailability = (ServiceAvailability) obj;
            return Intrinsics.areEqual(unknownFields(), serviceAvailability.unknownFields()) && Intrinsics.areEqual(this.available, serviceAvailability.available) && Intrinsics.areEqual(this.service_available_timestamp, serviceAvailability.service_available_timestamp) && Intrinsics.areEqual(this.availability_subtitle, serviceAvailability.availability_subtitle);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Boolean bool = this.available;
            int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Long l = this.service_available_timestamp;
            int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            String str = this.availability_subtitle;
            int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CardScheme.Builder builder = new CardScheme.Builder(27);
            builder.modules = this.available;
            builder.overflow_modules = this.service_available_timestamp;
            builder.card_home_actions = this.availability_subtitle;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Boolean bool = this.available;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("available=", bool, arrayList);
            }
            Long l = this.service_available_timestamp;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("service_available_timestamp=", l, arrayList);
            }
            String str = this.availability_subtitle;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "availability_subtitle=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ServiceAvailability{", "}", 0, null, null, 56);
        }
    }

    static {
        SupportPhoneStatusResponse$Companion$ADAPTER$1 supportPhoneStatusResponse$Companion$ADAPTER$1 = new SupportPhoneStatusResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SupportPhoneStatusResponse.class), "type.googleapis.com/squareup.cash.supportal.app.SupportPhoneStatusResponse", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
        ADAPTER = supportPhoneStatusResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(supportPhoneStatusResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportPhoneStatusResponse(zzlp zzlpVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.access = zzlpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SupportPhoneStatusResponse)) {
            return false;
        }
        SupportPhoneStatusResponse supportPhoneStatusResponse = (SupportPhoneStatusResponse) obj;
        return Intrinsics.areEqual(unknownFields(), supportPhoneStatusResponse.unknownFields()) && Intrinsics.areEqual(this.access, supportPhoneStatusResponse.access);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzlp zzlpVar = this.access;
        int hashCode2 = hashCode + (zzlpVar != null ? zzlpVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(29);
        builder.pool_lifecycle_filter = this.access;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzlp zzlpVar = this.access;
        if (zzlpVar != null) {
            arrayList.add("access=" + zzlpVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SupportPhoneStatusResponse{", "}", 0, null, null, 56);
    }
}
