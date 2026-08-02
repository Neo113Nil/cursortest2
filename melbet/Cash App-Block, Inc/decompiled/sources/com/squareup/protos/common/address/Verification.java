package com.squareup.protos.common.address;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.cash.ui.ColoredButton;
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
public final class Verification extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Verification> CREATOR;
    public final String debug_info;
    public final VerificationLevel verification_level;
    public final VerificationStatus verification_status;
    public final Long verified_at;

    public enum VerificationLevel implements WireEnum {
        UNKNOWN_VERIFICATION_LEVEL(0),
        ADMINISTRATIVE_AREA(1),
        LOCALITY(2),
        THOROUGHFARE(3),
        PREMISES(4),
        SUBPREMISES(5);

        public static final Verification$VerificationLevel$Companion$ADAPTER$1 ADAPTER;
        public static final TaxEnvironment.Companion Companion;
        public final int value;

        static {
            VerificationLevel verificationLevel = UNKNOWN_VERIFICATION_LEVEL;
            Companion = new TaxEnvironment.Companion();
            ADAPTER = new Verification$VerificationLevel$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(VerificationLevel.class), Syntax.PROTO_2, verificationLevel);
        }

        VerificationLevel(int i) {
            this.value = i;
        }

        public static final VerificationLevel fromValue(int i) {
            Companion.getClass();
            return TaxEnvironment.Companion.m3929fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum VerificationStatus implements WireEnum {
        UNVERIFIED(0),
        VERIFY_FAILED(1),
        PARTIALLY_VERIFIED(2),
        VERIFIED(3);

        public static final Verification$VerificationStatus$Companion$ADAPTER$1 ADAPTER;
        public static final TextSize.Companion Companion;
        public final int value;

        static {
            VerificationStatus verificationStatus = UNVERIFIED;
            Companion = new TextSize.Companion();
            ADAPTER = new Verification$VerificationStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(VerificationStatus.class), Syntax.PROTO_2, verificationStatus);
        }

        VerificationStatus(int i) {
            this.value = i;
        }

        public static final VerificationStatus fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return UNVERIFIED;
            }
            if (i == 1) {
                return VERIFY_FAILED;
            }
            if (i == 2) {
                return PARTIALLY_VERIFIED;
            }
            if (i != 3) {
                return null;
            }
            return VERIFIED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Verification$Companion$ADAPTER$1 verification$Companion$ADAPTER$1 = new Verification$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Verification.class), "type.googleapis.com/squareup.common.address.Verification", Syntax.PROTO_2, null, "squareup/common/address.proto");
        ADAPTER = verification$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(verification$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Verification(VerificationStatus verificationStatus, VerificationLevel verificationLevel, Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.verification_status = verificationStatus;
        this.verification_level = verificationLevel;
        this.verified_at = l;
        this.debug_info = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Verification)) {
            return false;
        }
        Verification verification = (Verification) obj;
        return Intrinsics.areEqual(unknownFields(), verification.unknownFields()) && this.verification_status == verification.verification_status && this.verification_level == verification.verification_level && Intrinsics.areEqual(this.verified_at, verification.verified_at) && Intrinsics.areEqual(this.debug_info, verification.debug_info);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        VerificationStatus verificationStatus = this.verification_status;
        int hashCode2 = (hashCode + (verificationStatus != null ? verificationStatus.hashCode() : 0)) * 37;
        VerificationLevel verificationLevel = this.verification_level;
        int hashCode3 = (hashCode2 + (verificationLevel != null ? verificationLevel.hashCode() : 0)) * 37;
        Long l = this.verified_at;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str = this.debug_info;
        int hashCode5 = hashCode4 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredButton.Builder builder = new ColoredButton.Builder(8);
        builder.button_color = this.verification_status;
        builder.text_color = this.verification_level;
        builder.text = this.verified_at;
        builder.action = this.debug_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        VerificationStatus verificationStatus = this.verification_status;
        if (verificationStatus != null) {
            arrayList.add("verification_status=" + verificationStatus);
        }
        VerificationLevel verificationLevel = this.verification_level;
        if (verificationLevel != null) {
            arrayList.add("verification_level=" + verificationLevel);
        }
        Long l = this.verified_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("verified_at=", l, arrayList);
        }
        String str = this.debug_info;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "debug_info=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Verification{", "}", 0, null, null, 56);
    }
}
