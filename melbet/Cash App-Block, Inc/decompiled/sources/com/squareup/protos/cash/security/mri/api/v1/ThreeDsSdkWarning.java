package com.squareup.protos.cash.security.mri.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.cash.postcard.CardScheme;
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
public final class ThreeDsSdkWarning extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ThreeDsSdkWarning> CREATOR;
    public final String id;
    public final String message;
    public final Severity severity;

    public enum Severity implements WireEnum {
        SEVERITY_UNSPECIFIED(0),
        SEVERITY_LOW(1),
        SEVERITY_MEDIUM(2),
        SEVERITY_HIGH(3);

        public static final ThreeDsSdkWarning$Severity$Companion$ADAPTER$1 ADAPTER;
        public static final TransactionType.Companion Companion;
        public final int value;

        static {
            Severity severity = SEVERITY_UNSPECIFIED;
            Companion = new TransactionType.Companion();
            ADAPTER = new ThreeDsSdkWarning$Severity$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Severity.class), Syntax.PROTO_2, severity);
        }

        Severity(int i) {
            this.value = i;
        }

        public static final Severity fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return SEVERITY_UNSPECIFIED;
            }
            if (i == 1) {
                return SEVERITY_LOW;
            }
            if (i == 2) {
                return SEVERITY_MEDIUM;
            }
            if (i != 3) {
                return null;
            }
            return SEVERITY_HIGH;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ThreeDsSdkWarning$Companion$ADAPTER$1 threeDsSdkWarning$Companion$ADAPTER$1 = new ThreeDsSdkWarning$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ThreeDsSdkWarning.class), "type.googleapis.com/squareup.cash.security.mri.api.v1.ThreeDsSdkWarning", Syntax.PROTO_2, null, "squareup/cash/security/mri/api/v1/mobile_runtime_integrity_messages.proto");
        ADAPTER = threeDsSdkWarning$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(threeDsSdkWarning$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDsSdkWarning(String str, String str2, Severity severity, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.message = str2;
        this.severity = severity;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThreeDsSdkWarning)) {
            return false;
        }
        ThreeDsSdkWarning threeDsSdkWarning = (ThreeDsSdkWarning) obj;
        return Intrinsics.areEqual(unknownFields(), threeDsSdkWarning.unknownFields()) && Intrinsics.areEqual(this.id, threeDsSdkWarning.id) && Intrinsics.areEqual(this.message, threeDsSdkWarning.message) && this.severity == threeDsSdkWarning.severity;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.message;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Severity severity = this.severity;
        int hashCode4 = hashCode3 + (severity != null ? severity.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardScheme.Builder builder = new CardScheme.Builder(15);
        builder.modules = this.id;
        builder.overflow_modules = this.message;
        builder.card_home_actions = this.severity;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        String str2 = this.message;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "message=", arrayList);
        }
        Severity severity = this.severity;
        if (severity != null) {
            arrayList.add("severity=" + severity);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ThreeDsSdkWarning{", "}", 0, null, null, 56);
    }
}
