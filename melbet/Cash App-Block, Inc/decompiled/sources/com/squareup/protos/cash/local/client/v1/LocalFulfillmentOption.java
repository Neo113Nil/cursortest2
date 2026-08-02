package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.groups.Group;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalFulfillmentOption extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalFulfillmentOption> CREATOR;
    public final LocalEstimatedCompletionDuration estimated_completion_duration;
    public final LocalFulfillmentType fulfillment_type;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1311type;

    public enum Type implements WireEnum {
        TYPE_UNSPECIFIED(0),
        TYPE_PICKUP(1),
        TYPE_DINE_IN(2);

        public static final LocalFulfillmentOption$Type$Companion$ADAPTER$1 ADAPTER;
        public static final ContactAliasType.Companion Companion;
        public final int value;

        static {
            Type type2 = TYPE_UNSPECIFIED;
            Companion = new ContactAliasType.Companion();
            ADAPTER = new LocalFulfillmentOption$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, type2);
        }

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return TYPE_PICKUP;
            }
            if (i != 2) {
                return null;
            }
            return TYPE_DINE_IN;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        LocalFulfillmentOption$Companion$ADAPTER$1 localFulfillmentOption$Companion$ADAPTER$1 = new LocalFulfillmentOption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalFulfillmentOption.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalFulfillmentOption", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_fulfillment.proto");
        ADAPTER = localFulfillmentOption$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localFulfillmentOption$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalFulfillmentOption(Type type2, LocalEstimatedCompletionDuration localEstimatedCompletionDuration, LocalFulfillmentType localFulfillmentType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1311type = type2;
        this.estimated_completion_duration = localEstimatedCompletionDuration;
        this.fulfillment_type = localFulfillmentType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalFulfillmentOption)) {
            return false;
        }
        LocalFulfillmentOption localFulfillmentOption = (LocalFulfillmentOption) obj;
        return Intrinsics.areEqual(unknownFields(), localFulfillmentOption.unknownFields()) && this.f1311type == localFulfillmentOption.f1311type && Intrinsics.areEqual(this.estimated_completion_duration, localFulfillmentOption.estimated_completion_duration) && this.fulfillment_type == localFulfillmentOption.fulfillment_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Type type2 = this.f1311type;
        int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration = this.estimated_completion_duration;
        int hashCode3 = (hashCode2 + (localEstimatedCompletionDuration != null ? localEstimatedCompletionDuration.hashCode() : 0)) * 37;
        LocalFulfillmentType localFulfillmentType = this.fulfillment_type;
        int hashCode4 = hashCode3 + (localFulfillmentType != null ? localFulfillmentType.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(27);
        builder.name = this.f1311type;
        builder.group_image = this.estimated_completion_duration;
        builder.participants = this.fulfillment_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Type type2 = this.f1311type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration = this.estimated_completion_duration;
        if (localEstimatedCompletionDuration != null) {
            arrayList.add("estimated_completion_duration=" + localEstimatedCompletionDuration);
        }
        LocalFulfillmentType localFulfillmentType = this.fulfillment_type;
        if (localFulfillmentType != null) {
            arrayList.add("fulfillment_type=" + localFulfillmentType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalFulfillmentOption{", "}", 0, null, null, 56);
    }
}
