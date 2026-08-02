package com.squareup.protos.cash.security.mri.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ActionType;
import com.squareup.protos.cash.ui.SplitButtons;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ThreeDsSignals extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ThreeDsSignals> CREATOR;
    public final Status sdk_status;
    public final List sdk_warnings;

    /* loaded from: classes8.dex */
    public enum Status implements WireEnum {
        STATUS_UNSPECIFIED(0),
        STATUS_SUCCESS(1),
        STATUS_WARNING(2),
        STATUS_INITIALIZATION_TIMEOUT(3),
        STATUS_INITIALIZATION_FAILED(4);

        public static final ThreeDsSignals$Status$Companion$ADAPTER$1 ADAPTER;
        public static final ActionType.Companion Companion;
        public final int value;

        static {
            Status status = STATUS_UNSPECIFIED;
            Companion = new ActionType.Companion();
            ADAPTER = new ThreeDsSignals$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            return ActionType.Companion.m3932fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ThreeDsSignals$Companion$ADAPTER$1 threeDsSignals$Companion$ADAPTER$1 = new ThreeDsSignals$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ThreeDsSignals.class), "type.googleapis.com/squareup.cash.security.mri.api.v1.ThreeDsSignals", Syntax.PROTO_2, null, "squareup/cash/security/mri/api/v1/mobile_runtime_integrity_messages.proto");
        ADAPTER = threeDsSignals$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(threeDsSignals$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDsSignals(Status status, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.sdk_status = status;
        this.sdk_warnings = TransactorKt.immutableCopyOf("sdk_warnings", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThreeDsSignals)) {
            return false;
        }
        ThreeDsSignals threeDsSignals = (ThreeDsSignals) obj;
        return Intrinsics.areEqual(unknownFields(), threeDsSignals.unknownFields()) && this.sdk_status == threeDsSignals.sdk_status && Intrinsics.areEqual(this.sdk_warnings, threeDsSignals.sdk_warnings);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Status status = this.sdk_status;
        int hashCode2 = this.sdk_warnings.hashCode() + ((hashCode + (status != null ? status.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SplitButtons.Builder builder = new SplitButtons.Builder();
        builder.primary_button = this.sdk_status;
        builder.secondary_button = this.sdk_warnings;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Status status = this.sdk_status;
        if (status != null) {
            arrayList.add("sdk_status=" + status);
        }
        List list = this.sdk_warnings;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sdk_warnings=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ThreeDsSignals{", "}", 0, null, null, 56);
    }

    public ThreeDsSignals(Status status, List list) {
        this(status, list, ByteString.EMPTY);
    }
}
