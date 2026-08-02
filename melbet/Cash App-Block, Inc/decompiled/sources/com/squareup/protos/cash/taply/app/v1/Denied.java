package com.squareup.protos.cash.taply.app.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.franklin.api.FidesmoProvisioningBlocker;
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
public final class Denied extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Denied> CREATOR;
    public final FidesmoProvisioningBlocker.ErrorUiConfig error_ui_config;
    public final Reason reason;

    public final class Builder extends Message.Builder {
        public FidesmoProvisioningBlocker.ErrorUiConfig error_ui_config;
        public Reason reason;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new Denied(this.reason, this.error_ui_config, buildUnknownFields());
        }
    }

    public enum Reason implements WireEnum {
        REASON_UNSPECIFIED(0),
        REASON_DENYLISTED(1),
        REASON_NOT_ORDERED_BY_CUSTOMER(2),
        REASON_ALREADY_PROVISIONED(3);

        public static final Denied$Reason$Companion$ADAPTER$1 ADAPTER;
        public static final TextSize.Companion Companion;
        public final int value;

        static {
            Reason reason = REASON_UNSPECIFIED;
            Companion = new TextSize.Companion();
            ADAPTER = new Denied$Reason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Reason.class), Syntax.PROTO_2, reason);
        }

        Reason(int i) {
            this.value = i;
        }

        public static final Reason fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return REASON_UNSPECIFIED;
            }
            if (i == 1) {
                return REASON_DENYLISTED;
            }
            if (i == 2) {
                return REASON_NOT_ORDERED_BY_CUSTOMER;
            }
            if (i != 3) {
                return null;
            }
            return REASON_ALREADY_PROVISIONED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Denied$Companion$ADAPTER$1 denied$Companion$ADAPTER$1 = new Denied$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Denied.class), "type.googleapis.com/squareup.cash.taply.app.v1beta1.Denied", Syntax.PROTO_2, null, "squareup/cash/taply/app/v1beta1/on_fidesmo_provisioning_start.proto");
        ADAPTER = denied$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(denied$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Denied(Reason reason, FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.reason = reason;
        this.error_ui_config = errorUiConfig;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Denied)) {
            return false;
        }
        Denied denied = (Denied) obj;
        return Intrinsics.areEqual(unknownFields(), denied.unknownFields()) && this.reason == denied.reason && Intrinsics.areEqual(this.error_ui_config, denied.error_ui_config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Reason reason = this.reason;
        int hashCode2 = (hashCode + (reason != null ? reason.hashCode() : 0)) * 37;
        FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig = this.error_ui_config;
        int hashCode3 = hashCode2 + (errorUiConfig != null ? errorUiConfig.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.reason = this.reason;
        builder.error_ui_config = this.error_ui_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Reason reason = this.reason;
        if (reason != null) {
            arrayList.add("reason=" + reason);
        }
        FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig = this.error_ui_config;
        if (errorUiConfig != null) {
            arrayList.add("error_ui_config=" + errorUiConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Denied{", "}", 0, null, null, 56);
    }
}
