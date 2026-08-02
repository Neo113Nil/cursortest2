package com.squareup.protos.cash.investcustomer.api.v1;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.Group;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.common.Money;
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
public final class CustomerLimit extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CustomerLimit> CREATOR;
    public final Frequency frequency;
    public final Money max;
    public final Money remaining_usage;

    public enum Frequency implements WireEnum {
        FREQUENCY_UNSPECIFIED(0),
        FREQUENCY_WEEKLY(1),
        FREQUENCY_MONTHLY(2);

        public static final CustomerLimit$Frequency$Companion$ADAPTER$1 ADAPTER;
        public static final Origin.Companion Companion;
        public final int value;

        static {
            Frequency frequency = FREQUENCY_UNSPECIFIED;
            Companion = new Origin.Companion();
            ADAPTER = new CustomerLimit$Frequency$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Frequency.class), Syntax.PROTO_2, frequency);
        }

        Frequency(int i) {
            this.value = i;
        }

        public static final Frequency fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return FREQUENCY_UNSPECIFIED;
            }
            if (i == 1) {
                return FREQUENCY_WEEKLY;
            }
            if (i != 2) {
                return null;
            }
            return FREQUENCY_MONTHLY;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CustomerLimit$Companion$ADAPTER$1 customerLimit$Companion$ADAPTER$1 = new CustomerLimit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CustomerLimit.class), "type.googleapis.com/squareup.cash.investcustomer.api.v1.CustomerLimit", Syntax.PROTO_2, null, "squareup/cash/investcustomer/api/v1/service.proto");
        ADAPTER = customerLimit$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(customerLimit$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerLimit(Frequency frequency, Money money, Money money2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.frequency = frequency;
        this.max = money;
        this.remaining_usage = money2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomerLimit)) {
            return false;
        }
        CustomerLimit customerLimit = (CustomerLimit) obj;
        return Intrinsics.areEqual(unknownFields(), customerLimit.unknownFields()) && this.frequency == customerLimit.frequency && Intrinsics.areEqual(this.max, customerLimit.max) && Intrinsics.areEqual(this.remaining_usage, customerLimit.remaining_usage);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Frequency frequency = this.frequency;
        int hashCode2 = (hashCode + (frequency != null ? frequency.hashCode() : 0)) * 37;
        Money money = this.max;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.remaining_usage;
        int hashCode4 = hashCode3 + (money2 != null ? money2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(5);
        builder.name = this.frequency;
        builder.group_image = this.max;
        builder.participants = this.remaining_usage;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Frequency frequency = this.frequency;
        if (frequency != null) {
            arrayList.add("frequency=" + frequency);
        }
        Money money = this.max;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("max=", money, arrayList);
        }
        Money money2 = this.remaining_usage;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("remaining_usage=", money2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CustomerLimit{", "}", 0, null, null, 56);
    }
}
