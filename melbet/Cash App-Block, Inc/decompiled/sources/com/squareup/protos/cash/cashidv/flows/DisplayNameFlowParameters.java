package com.squareup.protos.cash.cashidv.flows;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.app.KnotSwitchCardResponse;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DisplayNameFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DisplayNameFlowParameters> CREATOR;
    public final Boolean isBusiness;
    public final Integer numChangesRemaining;

    static {
        DisplayNameFlowParameters$Companion$ADAPTER$1 displayNameFlowParameters$Companion$ADAPTER$1 = new DisplayNameFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DisplayNameFlowParameters.class), "type.googleapis.com/squareup.cash.cashidv.flows.DisplayNameFlowParameters", Syntax.PROTO_2, null, "squareup/cash/cashidv/flows/FlowParameters.proto");
        ADAPTER = displayNameFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(displayNameFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayNameFlowParameters(Boolean bool, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.isBusiness = bool;
        this.numChangesRemaining = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DisplayNameFlowParameters)) {
            return false;
        }
        DisplayNameFlowParameters displayNameFlowParameters = (DisplayNameFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), displayNameFlowParameters.unknownFields()) && Intrinsics.areEqual(this.isBusiness, displayNameFlowParameters.isBusiness) && Intrinsics.areEqual(this.numChangesRemaining, displayNameFlowParameters.numChangesRemaining);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.isBusiness;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Integer num = this.numChangesRemaining;
        int hashCode3 = hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        KnotSwitchCardResponse.Builder builder = new KnotSwitchCardResponse.Builder(1);
        builder.success = this.isBusiness;
        builder.merchant_id = this.numChangesRemaining;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.isBusiness;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("isBusiness=", bool, arrayList);
        }
        Integer num = this.numChangesRemaining;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("numChangesRemaining=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisplayNameFlowParameters{", "}", 0, null, null, 56);
    }
}
