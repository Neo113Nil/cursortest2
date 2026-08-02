package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Trust;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashsuggest/api/AfterpayAppletResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashface/api/Trust$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AfterpayAppletResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AfterpayAppletResponse> CREATOR;
    public final CreditLineSnapshot credit_line_snapshot;
    public final AfterpayAppletEntrypoint entrypoint;
    public final Long expired_at_ms;
    public final AfterpayAppletHome home;

    static {
        AfterpayAppletResponse$Companion$ADAPTER$1 afterpayAppletResponse$Companion$ADAPTER$1 = new AfterpayAppletResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AfterpayAppletResponse.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayAppletResponse", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayApplet.proto");
        ADAPTER = afterpayAppletResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayAppletResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayAppletResponse(Long l, CreditLineSnapshot creditLineSnapshot, AfterpayAppletEntrypoint afterpayAppletEntrypoint, AfterpayAppletHome afterpayAppletHome, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.expired_at_ms = l;
        this.credit_line_snapshot = creditLineSnapshot;
        this.entrypoint = afterpayAppletEntrypoint;
        this.home = afterpayAppletHome;
    }

    public static AfterpayAppletResponse copy$default(AfterpayAppletResponse afterpayAppletResponse, CreditLineSnapshot creditLineSnapshot, AfterpayAppletEntrypoint afterpayAppletEntrypoint, AfterpayAppletHome afterpayAppletHome, ByteString byteString, int i) {
        CreditLineSnapshot creditLineSnapshot2 = creditLineSnapshot;
        Long l = afterpayAppletResponse.expired_at_ms;
        if ((i & 2) != 0) {
            creditLineSnapshot2 = afterpayAppletResponse.credit_line_snapshot;
        }
        if ((i & 4) != 0) {
            afterpayAppletEntrypoint = afterpayAppletResponse.entrypoint;
        }
        if ((i & 16) != 0) {
            byteString = afterpayAppletResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        afterpayAppletResponse.getClass();
        byteString2.getClass();
        return new AfterpayAppletResponse(l, creditLineSnapshot2, afterpayAppletEntrypoint, afterpayAppletHome, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletResponse)) {
            return false;
        }
        AfterpayAppletResponse afterpayAppletResponse = (AfterpayAppletResponse) obj;
        return Intrinsics.areEqual(unknownFields(), afterpayAppletResponse.unknownFields()) && Intrinsics.areEqual(this.expired_at_ms, afterpayAppletResponse.expired_at_ms) && Intrinsics.areEqual(this.credit_line_snapshot, afterpayAppletResponse.credit_line_snapshot) && Intrinsics.areEqual(this.entrypoint, afterpayAppletResponse.entrypoint) && Intrinsics.areEqual(this.home, afterpayAppletResponse.home);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.expired_at_ms;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        CreditLineSnapshot creditLineSnapshot = this.credit_line_snapshot;
        int hashCode3 = (hashCode2 + (creditLineSnapshot != null ? creditLineSnapshot.hashCode() : 0)) * 37;
        AfterpayAppletEntrypoint afterpayAppletEntrypoint = this.entrypoint;
        int hashCode4 = (hashCode3 + (afterpayAppletEntrypoint != null ? afterpayAppletEntrypoint.hashCode() : 0)) * 37;
        AfterpayAppletHome afterpayAppletHome = this.home;
        int hashCode5 = hashCode4 + (afterpayAppletHome != null ? afterpayAppletHome.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Trust.Builder builder = new Trust.Builder(14, false);
        builder.icon = this.expired_at_ms;
        builder.title = this.credit_line_snapshot;
        builder.enabled = this.entrypoint;
        builder.id = this.home;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.expired_at_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expired_at_ms=", l, arrayList);
        }
        CreditLineSnapshot creditLineSnapshot = this.credit_line_snapshot;
        if (creditLineSnapshot != null) {
            arrayList.add("credit_line_snapshot=" + creditLineSnapshot);
        }
        AfterpayAppletEntrypoint afterpayAppletEntrypoint = this.entrypoint;
        if (afterpayAppletEntrypoint != null) {
            arrayList.add("entrypoint=" + afterpayAppletEntrypoint);
        }
        AfterpayAppletHome afterpayAppletHome = this.home;
        if (afterpayAppletHome != null) {
            arrayList.add("home=" + afterpayAppletHome);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AfterpayAppletResponse{", "}", 0, null, null, 56);
    }

    public /* synthetic */ AfterpayAppletResponse(CreditLineSnapshot creditLineSnapshot, AfterpayAppletHome afterpayAppletHome) {
        this(10000L, creditLineSnapshot, null, afterpayAppletHome, ByteString.EMPTY);
    }
}
