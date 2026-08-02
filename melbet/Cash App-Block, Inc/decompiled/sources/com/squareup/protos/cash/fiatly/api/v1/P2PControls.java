package com.squareup.protos.cash.fiatly.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.protos.cash.grantly.api.LoanOption;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class P2PControls extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<P2PControls> CREATOR;
    public final ControlSource control_source;
    public final List custom_limits;
    public final Boolean is_p2p_enabled;

    public enum ControlSource implements WireEnum {
        CONTROL_SOURCE_UNSPECIFIED(0),
        CONTROL_SOURCE_EXPLICIT(1),
        CONTROL_SOURCE_DEFAULT(2);

        public static final P2PControls$ControlSource$Companion$ADAPTER$1 ADAPTER;
        public static final RadioType.Companion Companion;
        public final int value;

        static {
            ControlSource controlSource = CONTROL_SOURCE_UNSPECIFIED;
            Companion = new RadioType.Companion();
            ADAPTER = new P2PControls$ControlSource$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ControlSource.class), Syntax.PROTO_2, controlSource);
        }

        ControlSource(int i) {
            this.value = i;
        }

        public static final ControlSource fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return CONTROL_SOURCE_UNSPECIFIED;
            }
            if (i == 1) {
                return CONTROL_SOURCE_EXPLICIT;
            }
            if (i != 2) {
                return null;
            }
            return CONTROL_SOURCE_DEFAULT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        P2PControls$Companion$ADAPTER$1 p2PControls$Companion$ADAPTER$1 = new P2PControls$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(P2PControls.class), "type.googleapis.com/squareup.cash.fiatly.api.v1.P2PControls", Syntax.PROTO_2, null, "squareup/cash/fiatly/api/v1/p2p_controls.proto");
        ADAPTER = p2PControls$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(p2PControls$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PControls(Boolean bool, ControlSource controlSource, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.is_p2p_enabled = bool;
        this.control_source = controlSource;
        this.custom_limits = TransactorKt.immutableCopyOf("custom_limits", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P2PControls)) {
            return false;
        }
        P2PControls p2PControls = (P2PControls) obj;
        return Intrinsics.areEqual(unknownFields(), p2PControls.unknownFields()) && Intrinsics.areEqual(this.is_p2p_enabled, p2PControls.is_p2p_enabled) && this.control_source == p2PControls.control_source && Intrinsics.areEqual(this.custom_limits, p2PControls.custom_limits);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.is_p2p_enabled;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        ControlSource controlSource = this.control_source;
        int hashCode3 = this.custom_limits.hashCode() + ((hashCode2 + (controlSource != null ? controlSource.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LoanOption.Builder builder = new LoanOption.Builder(19);
        builder.loan_type = this.is_p2p_enabled;
        builder.tila_data = this.control_source;
        builder.payment_schedule = this.custom_limits;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.is_p2p_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_p2p_enabled=", bool, arrayList);
        }
        ControlSource controlSource = this.control_source;
        if (controlSource != null) {
            arrayList.add("control_source=" + controlSource);
        }
        List list = this.custom_limits;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("custom_limits=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "P2PControls{", "}", 0, null, null, 56);
    }

    public P2PControls(int i, Boolean bool, List list) {
        this((i & 1) != 0 ? null : bool, null, (i & 4) != 0 ? EmptyList.INSTANCE : list, ByteString.EMPTY);
    }
}
