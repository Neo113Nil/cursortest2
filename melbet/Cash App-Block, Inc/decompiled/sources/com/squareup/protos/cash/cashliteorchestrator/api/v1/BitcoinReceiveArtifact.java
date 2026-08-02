package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
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
public final class BitcoinReceiveArtifact extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BitcoinReceiveArtifact> CREATOR;
    public final String address;
    public final String deposit_address_id;
    public final BitcoinAddressState state;

    static {
        BitcoinReceiveArtifact$Companion$ADAPTER$1 bitcoinReceiveArtifact$Companion$ADAPTER$1 = new BitcoinReceiveArtifact$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BitcoinReceiveArtifact.class), "type.googleapis.com/squareup.cash.cashliteorchestrator.api.v1beta1.BitcoinReceiveArtifact", Syntax.PROTO_2, null, "squareup/cash/cashliteorchestrator/api/v1beta1/orchestrator.proto");
        ADAPTER = bitcoinReceiveArtifact$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(bitcoinReceiveArtifact$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinReceiveArtifact(String str, String str2, BitcoinAddressState bitcoinAddressState, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.deposit_address_id = str;
        this.address = str2;
        this.state = bitcoinAddressState;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitcoinReceiveArtifact)) {
            return false;
        }
        BitcoinReceiveArtifact bitcoinReceiveArtifact = (BitcoinReceiveArtifact) obj;
        return Intrinsics.areEqual(unknownFields(), bitcoinReceiveArtifact.unknownFields()) && Intrinsics.areEqual(this.deposit_address_id, bitcoinReceiveArtifact.deposit_address_id) && Intrinsics.areEqual(this.address, bitcoinReceiveArtifact.address) && this.state == bitcoinReceiveArtifact.state;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.deposit_address_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.address;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        BitcoinAddressState bitcoinAddressState = this.state;
        int hashCode4 = hashCode3 + (bitcoinAddressState != null ? bitcoinAddressState.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Row.Builder builder = new Row.Builder(14);
        builder.title = this.deposit_address_id;
        builder.subtitle = this.address;
        builder.action = this.state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.deposit_address_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "deposit_address_id=", arrayList);
        }
        String str2 = this.address;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "address=", arrayList);
        }
        BitcoinAddressState bitcoinAddressState = this.state;
        if (bitcoinAddressState != null) {
            arrayList.add("state=" + bitcoinAddressState);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BitcoinReceiveArtifact{", "}", 0, null, null, 56);
    }
}
