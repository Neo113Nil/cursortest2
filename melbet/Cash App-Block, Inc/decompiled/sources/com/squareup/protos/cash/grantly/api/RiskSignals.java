package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.cash.grantly.api.LoanOption;
import com.squareup.protos.franklin.data.BrowserInteraction;
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
public final class RiskSignals extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RiskSignals> CREATOR;
    public final String app_token;
    public final BrowserInteraction browser_interaction;
    public final ClientInfo client_info;

    static {
        RiskSignals$Companion$ADAPTER$1 riskSignals$Companion$ADAPTER$1 = new RiskSignals$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RiskSignals.class), "type.googleapis.com/squareup.cash.grantly.api.RiskSignals", Syntax.PROTO_2, null, "squareup/cash/grantly/api/risk_signals.proto");
        ADAPTER = riskSignals$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(riskSignals$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiskSignals(BrowserInteraction browserInteraction, ClientInfo clientInfo, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.browser_interaction = browserInteraction;
        this.client_info = clientInfo;
        this.app_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RiskSignals)) {
            return false;
        }
        RiskSignals riskSignals = (RiskSignals) obj;
        return Intrinsics.areEqual(unknownFields(), riskSignals.unknownFields()) && Intrinsics.areEqual(this.browser_interaction, riskSignals.browser_interaction) && Intrinsics.areEqual(this.client_info, riskSignals.client_info) && Intrinsics.areEqual(this.app_token, riskSignals.app_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BrowserInteraction browserInteraction = this.browser_interaction;
        int hashCode2 = (hashCode + (browserInteraction != null ? browserInteraction.hashCode() : 0)) * 37;
        ClientInfo clientInfo = this.client_info;
        int hashCode3 = (hashCode2 + (clientInfo != null ? clientInfo.hashCode() : 0)) * 37;
        String str = this.app_token;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LoanOption.Builder builder = new LoanOption.Builder(28);
        builder.loan_type = this.browser_interaction;
        builder.payment_schedule = this.client_info;
        builder.tila_data = this.app_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.browser_interaction != null) {
            arrayList.add("browser_interaction=██");
        }
        if (this.client_info != null) {
            arrayList.add("client_info=██");
        }
        String str = this.app_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "app_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RiskSignals{", "}", 0, null, null, 56);
    }
}
