package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.Error;
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
public final class LightningReceiveArtifact extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LightningReceiveArtifact> CREATOR;
    public final Long amount_milli_sats;
    public final Long amount_sats;
    public final String bolt11_invoice;
    public final String expires_at;
    public final String payment_hash;
    public final LightningInvoiceState state;

    static {
        LightningReceiveArtifact$Companion$ADAPTER$1 lightningReceiveArtifact$Companion$ADAPTER$1 = new LightningReceiveArtifact$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LightningReceiveArtifact.class), "type.googleapis.com/squareup.cash.cashliteorchestrator.api.v1beta1.LightningReceiveArtifact", Syntax.PROTO_2, null, "squareup/cash/cashliteorchestrator/api/v1beta1/orchestrator.proto");
        ADAPTER = lightningReceiveArtifact$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(lightningReceiveArtifact$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LightningReceiveArtifact(String str, String str2, Long l, String str3, LightningInvoiceState lightningInvoiceState, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payment_hash = str;
        this.bolt11_invoice = str2;
        this.amount_milli_sats = l;
        this.expires_at = str3;
        this.state = lightningInvoiceState;
        this.amount_sats = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LightningReceiveArtifact)) {
            return false;
        }
        LightningReceiveArtifact lightningReceiveArtifact = (LightningReceiveArtifact) obj;
        return Intrinsics.areEqual(unknownFields(), lightningReceiveArtifact.unknownFields()) && Intrinsics.areEqual(this.payment_hash, lightningReceiveArtifact.payment_hash) && Intrinsics.areEqual(this.bolt11_invoice, lightningReceiveArtifact.bolt11_invoice) && Intrinsics.areEqual(this.amount_milli_sats, lightningReceiveArtifact.amount_milli_sats) && Intrinsics.areEqual(this.expires_at, lightningReceiveArtifact.expires_at) && this.state == lightningReceiveArtifact.state && Intrinsics.areEqual(this.amount_sats, lightningReceiveArtifact.amount_sats);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.payment_hash;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.bolt11_invoice;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.amount_milli_sats;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str3 = this.expires_at;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        LightningInvoiceState lightningInvoiceState = this.state;
        int hashCode6 = (hashCode5 + (lightningInvoiceState != null ? lightningInvoiceState.hashCode() : 0)) * 37;
        Long l2 = this.amount_sats;
        int hashCode7 = hashCode6 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(19, false);
        builder.description = this.payment_hash;
        builder.field = this.bolt11_invoice;
        builder.category = this.amount_milli_sats;
        builder.code = this.expires_at;
        builder.retryable = this.state;
        builder.metadata = this.amount_sats;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.payment_hash;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "payment_hash=", arrayList);
        }
        String str2 = this.bolt11_invoice;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "bolt11_invoice=", arrayList);
        }
        Long l = this.amount_milli_sats;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("amount_milli_sats=", l, arrayList);
        }
        String str3 = this.expires_at;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "expires_at=", arrayList);
        }
        LightningInvoiceState lightningInvoiceState = this.state;
        if (lightningInvoiceState != null) {
            arrayList.add("state=" + lightningInvoiceState);
        }
        Long l2 = this.amount_sats;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("amount_sats=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LightningReceiveArtifact{", "}", 0, null, null, 56);
    }
}
