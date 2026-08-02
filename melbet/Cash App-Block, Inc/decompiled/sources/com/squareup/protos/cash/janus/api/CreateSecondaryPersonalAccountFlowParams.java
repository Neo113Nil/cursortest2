package com.squareup.protos.cash.janus.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Card;
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
public final class CreateSecondaryPersonalAccountFlowParams extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateSecondaryPersonalAccountFlowParams> CREATOR;
    public final CreateSecondaryPersonalAccountEntryPoint entry_point;
    public final String flow_token;

    static {
        CreateSecondaryPersonalAccountFlowParams$Companion$ADAPTER$1 createSecondaryPersonalAccountFlowParams$Companion$ADAPTER$1 = new CreateSecondaryPersonalAccountFlowParams$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreateSecondaryPersonalAccountFlowParams.class), "type.googleapis.com/squareup.cash.janus.api.CreateSecondaryPersonalAccountFlowParams", Syntax.PROTO_2, null, "squareup/cash/janus/api/CreateSecondaryPersonalAccountProto.proto");
        ADAPTER = createSecondaryPersonalAccountFlowParams$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(createSecondaryPersonalAccountFlowParams$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSecondaryPersonalAccountFlowParams(CreateSecondaryPersonalAccountEntryPoint createSecondaryPersonalAccountEntryPoint, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.entry_point = createSecondaryPersonalAccountEntryPoint;
        this.flow_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateSecondaryPersonalAccountFlowParams)) {
            return false;
        }
        CreateSecondaryPersonalAccountFlowParams createSecondaryPersonalAccountFlowParams = (CreateSecondaryPersonalAccountFlowParams) obj;
        return Intrinsics.areEqual(unknownFields(), createSecondaryPersonalAccountFlowParams.unknownFields()) && this.entry_point == createSecondaryPersonalAccountFlowParams.entry_point && Intrinsics.areEqual(this.flow_token, createSecondaryPersonalAccountFlowParams.flow_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CreateSecondaryPersonalAccountEntryPoint createSecondaryPersonalAccountEntryPoint = this.entry_point;
        int hashCode2 = (hashCode + (createSecondaryPersonalAccountEntryPoint != null ? createSecondaryPersonalAccountEntryPoint.hashCode() : 0)) * 37;
        String str = this.flow_token;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(13);
        builder.card_type = this.entry_point;
        builder.card_pii = this.flow_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CreateSecondaryPersonalAccountEntryPoint createSecondaryPersonalAccountEntryPoint = this.entry_point;
        if (createSecondaryPersonalAccountEntryPoint != null) {
            arrayList.add("entry_point=" + createSecondaryPersonalAccountEntryPoint);
        }
        String str = this.flow_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "flow_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateSecondaryPersonalAccountFlowParams{", "}", 0, null, null, 56);
    }

    public /* synthetic */ CreateSecondaryPersonalAccountFlowParams(CreateSecondaryPersonalAccountEntryPoint createSecondaryPersonalAccountEntryPoint, String str) {
        this(createSecondaryPersonalAccountEntryPoint, str, ByteString.EMPTY);
    }
}
