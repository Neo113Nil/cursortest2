package com.squareup.protos.franklin.lending;

import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.taply.app.v1.EncryptedCardData;
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

/* loaded from: classes8.dex */
public final class PlasmaPrepurchaseCashCardToggleFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PlasmaPrepurchaseCashCardToggleFlowParameters> CREATOR;
    public final ByteString opaque_request_data;
    public final String selected_option;

    static {
        PlasmaPrepurchaseCashCardToggleFlowParameters$Companion$ADAPTER$1 plasmaPrepurchaseCashCardToggleFlowParameters$Companion$ADAPTER$1 = new PlasmaPrepurchaseCashCardToggleFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PlasmaPrepurchaseCashCardToggleFlowParameters.class), "type.googleapis.com/squareup.franklin.lending.PlasmaPrepurchaseCashCardToggleFlowParameters", Syntax.PROTO_2, null, "squareup/franklin/lending_api.proto");
        ADAPTER = plasmaPrepurchaseCashCardToggleFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(plasmaPrepurchaseCashCardToggleFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlasmaPrepurchaseCashCardToggleFlowParameters(String str, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.opaque_request_data = byteString;
        this.selected_option = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlasmaPrepurchaseCashCardToggleFlowParameters)) {
            return false;
        }
        PlasmaPrepurchaseCashCardToggleFlowParameters plasmaPrepurchaseCashCardToggleFlowParameters = (PlasmaPrepurchaseCashCardToggleFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), plasmaPrepurchaseCashCardToggleFlowParameters.unknownFields()) && Intrinsics.areEqual(this.opaque_request_data, plasmaPrepurchaseCashCardToggleFlowParameters.opaque_request_data) && Intrinsics.areEqual(this.selected_option, plasmaPrepurchaseCashCardToggleFlowParameters.selected_option);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.opaque_request_data;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str = this.selected_option;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EncryptedCardData.Builder builder = new EncryptedCardData.Builder(5);
        builder.encrypted_card_info = this.opaque_request_data;
        builder.encrypted_ephemeral_key = this.selected_option;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ByteString byteString = this.opaque_request_data;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("opaque_request_data=", byteString, arrayList);
        }
        String str = this.selected_option;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "selected_option=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PlasmaPrepurchaseCashCardToggleFlowParameters{", "}", 0, null, null, 56);
    }

    public /* synthetic */ PlasmaPrepurchaseCashCardToggleFlowParameters(int i, String str, ByteString byteString) {
        this((i & 2) != 0 ? null : str, byteString, ByteString.EMPTY);
    }
}
