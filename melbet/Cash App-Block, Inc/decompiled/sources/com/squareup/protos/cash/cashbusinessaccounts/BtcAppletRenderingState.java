package com.squareup.protos.cash.cashbusinessaccounts;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiAppLock;
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
public final class BtcAppletRenderingState extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BtcAppletRenderingState> CREATOR;
    public final Boolean hide_moneytab_btc_applet;

    static {
        BtcAppletRenderingState$Companion$ADAPTER$1 btcAppletRenderingState$Companion$ADAPTER$1 = new BtcAppletRenderingState$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BtcAppletRenderingState.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.BtcAppletRenderingState", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/sync_values.proto");
        ADAPTER = btcAppletRenderingState$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(btcAppletRenderingState$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtcAppletRenderingState(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.hide_moneytab_btc_applet = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BtcAppletRenderingState)) {
            return false;
        }
        BtcAppletRenderingState btcAppletRenderingState = (BtcAppletRenderingState) obj;
        return Intrinsics.areEqual(unknownFields(), btcAppletRenderingState.unknownFields()) && Intrinsics.areEqual(this.hide_moneytab_btc_applet, btcAppletRenderingState.hide_moneytab_btc_applet);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.hide_moneytab_btc_applet;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppLock.Builder builder = new UiAppLock.Builder(2);
        builder.activated = this.hide_moneytab_btc_applet;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.hide_moneytab_btc_applet;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("hide_moneytab_btc_applet=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BtcAppletRenderingState{", "}", 0, null, null, 56);
    }
}
