package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Headers;
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

/* loaded from: classes8.dex */
public final class MarketCapabilitiesConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MarketCapabilitiesConfig> CREATOR;
    public final List capabilities;

    static {
        MarketCapabilitiesConfig$Companion$ADAPTER$1 marketCapabilitiesConfig$Companion$ADAPTER$1 = new MarketCapabilitiesConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MarketCapabilitiesConfig.class), "type.googleapis.com/squareup.franklin.common.MarketCapabilitiesConfig", Syntax.PROTO_2, null, "squareup/franklin/common/market_capabilities_config.proto");
        ADAPTER = marketCapabilitiesConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(marketCapabilitiesConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketCapabilitiesConfig(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.capabilities = TransactorKt.immutableCopyOf("capabilities", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarketCapabilitiesConfig)) {
            return false;
        }
        MarketCapabilitiesConfig marketCapabilitiesConfig = (MarketCapabilitiesConfig) obj;
        return Intrinsics.areEqual(unknownFields(), marketCapabilitiesConfig.unknownFields()) && Intrinsics.areEqual(this.capabilities, marketCapabilitiesConfig.capabilities);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.capabilities.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Headers.Builder builder = new Headers.Builder(26, false);
        builder.header = this.capabilities;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.capabilities;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("capabilities=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarketCapabilitiesConfig{", "}", 0, null, null, 56);
    }
}
