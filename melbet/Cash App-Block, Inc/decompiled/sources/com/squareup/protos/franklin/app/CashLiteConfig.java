package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes.dex */
public final class CashLiteConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashLiteConfig> CREATOR;
    public final BitcoinAppletConfig bitcoin_applet;
    public final List client_routes_allowlist;

    static {
        CashLiteConfig$Companion$ADAPTER$1 cashLiteConfig$Companion$ADAPTER$1 = new CashLiteConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashLiteConfig.class), "type.googleapis.com/squareup.franklin.app.CashLiteConfig", Syntax.PROTO_2, null, "squareup/franklin/app/cash_lite_config.proto");
        ADAPTER = cashLiteConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashLiteConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashLiteConfig(BitcoinAppletConfig bitcoinAppletConfig, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.bitcoin_applet = bitcoinAppletConfig;
        this.client_routes_allowlist = TransactorKt.immutableCopyOf("client_routes_allowlist", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashLiteConfig)) {
            return false;
        }
        CashLiteConfig cashLiteConfig = (CashLiteConfig) obj;
        return Intrinsics.areEqual(unknownFields(), cashLiteConfig.unknownFields()) && Intrinsics.areEqual(this.bitcoin_applet, cashLiteConfig.bitcoin_applet) && Intrinsics.areEqual(this.client_routes_allowlist, cashLiteConfig.client_routes_allowlist);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BitcoinAppletConfig bitcoinAppletConfig = this.bitcoin_applet;
        int hashCode2 = this.client_routes_allowlist.hashCode() + ((hashCode + (bitcoinAppletConfig != null ? bitcoinAppletConfig.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BankingConfig.Builder builder = new BankingConfig.Builder();
        builder.strings = this.bitcoin_applet;
        builder.recurring_deposits_dda_upsell = this.client_routes_allowlist;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BitcoinAppletConfig bitcoinAppletConfig = this.bitcoin_applet;
        if (bitcoinAppletConfig != null) {
            arrayList.add("bitcoin_applet=" + bitcoinAppletConfig);
        }
        List list = this.client_routes_allowlist;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("client_routes_allowlist=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashLiteConfig{", "}", 0, null, null, 56);
    }
}
