package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.franklin.ui.UiDda;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.protos.person.Alias;
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

/* loaded from: classes8.dex */
public final class CustomerData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CustomerData> CREATOR;
    public final String cashtag;
    public final Boolean has_passcode;
    public final IDVStatus idv_status;
    public final Long joined_at;
    public final Region region;
    public final Boolean security_lock_enabled;
    public final State state;

    public final class IDVStatus extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<IDVStatus> CREATOR;
        public final Long can_attempt_electronic_idv_at;
        public final VerificationStatus didv_status;
        public final VerificationStatus eidv_status;
        public final VerificationStatus status;

        public enum VerificationStatus implements WireEnum {
            VERIFICATION_UNKNOWN(1),
            NOT_VERIFIED(2),
            IN_REVIEW(3),
            VERIFIED(4),
            SPONSORSHIP_ACTIVE(5),
            SPONSORSHIP_PENDING(6),
            SPONSORSHIP_SUSPENDED(7),
            SPONSORSHIP_CANCELED(8);

            public final int value;
            public static final Trigger.Companion Companion = new Trigger.Companion();
            public static final CustomerData$IDVStatus$VerificationStatus$Companion$ADAPTER$1 ADAPTER = new CustomerData$IDVStatus$VerificationStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(VerificationStatus.class), Syntax.PROTO_2, null);

            VerificationStatus(int i) {
                this.value = i;
            }

            public static final VerificationStatus fromValue(int i) {
                Companion.getClass();
                switch (i) {
                    case 1:
                        return VERIFICATION_UNKNOWN;
                    case 2:
                        return NOT_VERIFIED;
                    case 3:
                        return IN_REVIEW;
                    case 4:
                        return VERIFIED;
                    case 5:
                        return SPONSORSHIP_ACTIVE;
                    case 6:
                        return SPONSORSHIP_PENDING;
                    case 7:
                        return SPONSORSHIP_SUSPENDED;
                    case 8:
                        return SPONSORSHIP_CANCELED;
                    default:
                        return null;
                }
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            CustomerData$IDVStatus$Companion$ADAPTER$1 customerData$IDVStatus$Companion$ADAPTER$1 = new CustomerData$IDVStatus$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IDVStatus.class), "type.googleapis.com/squareup.franklin.ui.CustomerData.IDVStatus", Syntax.PROTO_2, null, "squareup/franklin/ui/issued_card.proto");
            ADAPTER = customerData$IDVStatus$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(customerData$IDVStatus$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IDVStatus(VerificationStatus verificationStatus, Long l, VerificationStatus verificationStatus2, VerificationStatus verificationStatus3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.status = verificationStatus;
            this.can_attempt_electronic_idv_at = l;
            this.eidv_status = verificationStatus2;
            this.didv_status = verificationStatus3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IDVStatus)) {
                return false;
            }
            IDVStatus iDVStatus = (IDVStatus) obj;
            return Intrinsics.areEqual(unknownFields(), iDVStatus.unknownFields()) && this.status == iDVStatus.status && Intrinsics.areEqual(this.can_attempt_electronic_idv_at, iDVStatus.can_attempt_electronic_idv_at) && this.eidv_status == iDVStatus.eidv_status && this.didv_status == iDVStatus.didv_status;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            VerificationStatus verificationStatus = this.status;
            int hashCode2 = (hashCode + (verificationStatus != null ? verificationStatus.hashCode() : 0)) * 37;
            Long l = this.can_attempt_electronic_idv_at;
            int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            VerificationStatus verificationStatus2 = this.eidv_status;
            int hashCode4 = (hashCode3 + (verificationStatus2 != null ? verificationStatus2.hashCode() : 0)) * 37;
            VerificationStatus verificationStatus3 = this.didv_status;
            int hashCode5 = hashCode4 + (verificationStatus3 != null ? verificationStatus3.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiDda.Builder builder = new UiDda.Builder(8);
            builder.account = this.status;
            builder.enabled = this.can_attempt_electronic_idv_at;
            builder.button = this.eidv_status;
            builder.dda_form = this.didv_status;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            VerificationStatus verificationStatus = this.status;
            if (verificationStatus != null) {
                arrayList.add("status=" + verificationStatus);
            }
            Long l = this.can_attempt_electronic_idv_at;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("can_attempt_electronic_idv_at=", l, arrayList);
            }
            VerificationStatus verificationStatus2 = this.eidv_status;
            if (verificationStatus2 != null) {
                arrayList.add("eidv_status=" + verificationStatus2);
            }
            VerificationStatus verificationStatus3 = this.didv_status;
            if (verificationStatus3 != null) {
                arrayList.add("didv_status=" + verificationStatus3);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "IDVStatus{", "}", 0, null, null, 56);
        }
    }

    public enum State implements WireEnum {
        OPEN(1),
        CLOSED(2),
        DENYLISTED(3),
        SUSPENDED(4);

        public final int value;
        public static final KeyScope.Companion Companion = new KeyScope.Companion();
        public static final CustomerData$State$Companion$ADAPTER$1 ADAPTER = new CustomerData$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, null);

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return OPEN;
            }
            if (i == 2) {
                return CLOSED;
            }
            if (i == 3) {
                return DENYLISTED;
            }
            if (i != 4) {
                return null;
            }
            return SUSPENDED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CustomerData$Companion$ADAPTER$1 customerData$Companion$ADAPTER$1 = new CustomerData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CustomerData.class), "type.googleapis.com/squareup.franklin.ui.CustomerData", Syntax.PROTO_2, null, "squareup/franklin/ui/issued_card.proto");
        ADAPTER = customerData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(customerData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerData(State state, Region region, IDVStatus iDVStatus, Boolean bool, Boolean bool2, String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.state = state;
        this.region = region;
        this.idv_status = iDVStatus;
        this.has_passcode = bool;
        this.security_lock_enabled = bool2;
        this.cashtag = str;
        this.joined_at = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomerData)) {
            return false;
        }
        CustomerData customerData = (CustomerData) obj;
        return Intrinsics.areEqual(unknownFields(), customerData.unknownFields()) && this.state == customerData.state && this.region == customerData.region && Intrinsics.areEqual(this.idv_status, customerData.idv_status) && Intrinsics.areEqual(this.has_passcode, customerData.has_passcode) && Intrinsics.areEqual(this.security_lock_enabled, customerData.security_lock_enabled) && Intrinsics.areEqual(this.cashtag, customerData.cashtag) && Intrinsics.areEqual(this.joined_at, customerData.joined_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        State state = this.state;
        int hashCode2 = (hashCode + (state != null ? state.hashCode() : 0)) * 37;
        Region region = this.region;
        int hashCode3 = (hashCode2 + (region != null ? region.hashCode() : 0)) * 37;
        IDVStatus iDVStatus = this.idv_status;
        int hashCode4 = (hashCode3 + (iDVStatus != null ? iDVStatus.hashCode() : 0)) * 37;
        Boolean bool = this.has_passcode;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.security_lock_enabled;
        int hashCode6 = (hashCode5 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str = this.cashtag;
        int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.joined_at;
        int hashCode8 = hashCode7 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(19, false);
        builder.f1407type = this.state;
        builder.value = this.region;
        builder.last_verified_at_ms = this.idv_status;
        builder.created_at = this.has_passcode;
        builder.updated_at = this.security_lock_enabled;
        builder.scope = this.cashtag;
        builder.first_verified_at_ms = this.joined_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        Region region = this.region;
        if (region != null) {
            arrayList.add("region=" + region);
        }
        IDVStatus iDVStatus = this.idv_status;
        if (iDVStatus != null) {
            arrayList.add("idv_status=" + iDVStatus);
        }
        Boolean bool = this.has_passcode;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_passcode=", bool, arrayList);
        }
        Boolean bool2 = this.security_lock_enabled;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("security_lock_enabled=", bool2, arrayList);
        }
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        Long l = this.joined_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("joined_at=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CustomerData{", "}", 0, null, null, 56);
    }
}
