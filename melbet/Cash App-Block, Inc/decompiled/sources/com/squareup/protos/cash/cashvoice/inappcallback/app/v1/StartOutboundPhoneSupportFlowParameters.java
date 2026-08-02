package com.squareup.protos.cash.cashvoice.inappcallback.app.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aliases.Cashtag;
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
public final class StartOutboundPhoneSupportFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StartOutboundPhoneSupportFlowParameters> CREATOR;
    public final String entity_id;
    public final String node_token;

    static {
        StartOutboundPhoneSupportFlowParameters$Companion$ADAPTER$1 startOutboundPhoneSupportFlowParameters$Companion$ADAPTER$1 = new StartOutboundPhoneSupportFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StartOutboundPhoneSupportFlowParameters.class), "type.googleapis.com/squareup.cash.cashvoice.inappcallback.app.v1.StartOutboundPhoneSupportFlowParameters", Syntax.PROTO_2, null, "squareup/cash/cashvoice/inappcallback/app/v1/flow.proto");
        ADAPTER = startOutboundPhoneSupportFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(startOutboundPhoneSupportFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartOutboundPhoneSupportFlowParameters(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.entity_id = str;
        this.node_token = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartOutboundPhoneSupportFlowParameters)) {
            return false;
        }
        StartOutboundPhoneSupportFlowParameters startOutboundPhoneSupportFlowParameters = (StartOutboundPhoneSupportFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), startOutboundPhoneSupportFlowParameters.unknownFields()) && Intrinsics.areEqual(this.entity_id, startOutboundPhoneSupportFlowParameters.entity_id) && Intrinsics.areEqual(this.node_token, startOutboundPhoneSupportFlowParameters.node_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.entity_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.node_token;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cashtag.Builder builder = new Cashtag.Builder(25);
        builder.prefix = this.entity_id;
        builder.name = this.node_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.entity_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "entity_id=", arrayList);
        }
        String str2 = this.node_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "node_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StartOutboundPhoneSupportFlowParameters{", "}", 0, null, null, 56);
    }
}
