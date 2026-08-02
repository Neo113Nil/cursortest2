package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ActionType;
import com.squareup.protos.common.Headers;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BitcoinAppletConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BitcoinAppletConfig> CREATOR;
    public final List home_widget_allowlist;

    public enum BitcoinWidgetId implements WireEnum {
        WELCOME(1),
        GRAPH(2),
        BOOST(3),
        ON_RAMP(4),
        DISCLOSURE(5),
        BUTTONS(6),
        NEWS(7),
        PENDING_IDV(8),
        STATS_AND_SETTINGS(9),
        AUTO_INVEST(10),
        ACTIVITY(11),
        BITCOIN_STORIES(12),
        KYB_RESTRICTION(13),
        STACKING_TOOLS(14),
        BALANCE(15),
        PERFORMANCE(16),
        DISABLED(17),
        BITCOIN_MAP_CARD(18);

        public final int value;
        public static final ActionType.Companion Companion = new ActionType.Companion();
        public static final BitcoinAppletConfig$BitcoinWidgetId$Companion$ADAPTER$1 ADAPTER = new BitcoinAppletConfig$BitcoinWidgetId$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(BitcoinWidgetId.class), Syntax.PROTO_2, null);

        BitcoinWidgetId(int i) {
            this.value = i;
        }

        public static final BitcoinWidgetId fromValue(int i) {
            Companion.getClass();
            return ActionType.Companion.m3937fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        BitcoinAppletConfig$Companion$ADAPTER$1 bitcoinAppletConfig$Companion$ADAPTER$1 = new BitcoinAppletConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BitcoinAppletConfig.class), "type.googleapis.com/squareup.franklin.app.BitcoinAppletConfig", Syntax.PROTO_2, null, "squareup/franklin/app/bitcoin_applet_config.proto");
        ADAPTER = bitcoinAppletConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(bitcoinAppletConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinAppletConfig(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.home_widget_allowlist = TransactorKt.immutableCopyOf("home_widget_allowlist", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitcoinAppletConfig)) {
            return false;
        }
        BitcoinAppletConfig bitcoinAppletConfig = (BitcoinAppletConfig) obj;
        return Intrinsics.areEqual(unknownFields(), bitcoinAppletConfig.unknownFields()) && Intrinsics.areEqual(this.home_widget_allowlist, bitcoinAppletConfig.home_widget_allowlist);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.home_widget_allowlist.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Headers.Builder builder = new Headers.Builder(12, false);
        builder.header = this.home_widget_allowlist;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.home_widget_allowlist;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("home_widget_allowlist=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BitcoinAppletConfig{", "}", 0, null, null, 56);
    }
}
