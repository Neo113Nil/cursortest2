package com.squareup.protos.cash.cashabilities.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.Section;
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

/* loaded from: classes.dex */
public final class MarketCapability extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MarketCapability> CREATOR;
    public final CapabilityName name;
    public final String reason;
    public final CapabilityStatus status;

    static {
        MarketCapability$Companion$ADAPTER$1 marketCapability$Companion$ADAPTER$1 = new MarketCapability$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MarketCapability.class), "type.googleapis.com/squareup.cash.cashabilities.api.MarketCapability", Syntax.PROTO_2, null, "squareup/cash/cashabilities/api/model.proto");
        ADAPTER = marketCapability$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(marketCapability$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketCapability(CapabilityName capabilityName, CapabilityStatus capabilityStatus, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.name = capabilityName;
        this.status = capabilityStatus;
        this.reason = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarketCapability)) {
            return false;
        }
        MarketCapability marketCapability = (MarketCapability) obj;
        return Intrinsics.areEqual(unknownFields(), marketCapability.unknownFields()) && this.name == marketCapability.name && this.status == marketCapability.status && Intrinsics.areEqual(this.reason, marketCapability.reason);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CapabilityName capabilityName = this.name;
        int hashCode2 = (hashCode + (capabilityName != null ? capabilityName.hashCode() : 0)) * 37;
        CapabilityStatus capabilityStatus = this.status;
        int hashCode3 = (hashCode2 + (capabilityStatus != null ? capabilityStatus.hashCode() : 0)) * 37;
        String str = this.reason;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(17);
        builder.header_button = this.name;
        builder.groups = this.status;
        builder.header_text = this.reason;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CapabilityName capabilityName = this.name;
        if (capabilityName != null) {
            arrayList.add("name=" + capabilityName);
        }
        CapabilityStatus capabilityStatus = this.status;
        if (capabilityStatus != null) {
            arrayList.add("status=" + capabilityStatus);
        }
        String str = this.reason;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "reason=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarketCapability{", "}", 0, null, null, 56);
    }
}
