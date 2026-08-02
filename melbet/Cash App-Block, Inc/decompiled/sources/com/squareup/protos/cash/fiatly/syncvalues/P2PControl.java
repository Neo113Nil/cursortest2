package com.squareup.protos.cash.fiatly.syncvalues;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.LoanOption;
import com.squareup.protos.cash.localization.LocalizedString;
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
public final class P2PControl extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<P2PControl> CREATOR;
    public final Boolean enabled;
    public final Long limit_amount_cents;
    public final LocalizedString limit_helper_text;

    static {
        P2PControl$Companion$ADAPTER$1 p2PControl$Companion$ADAPTER$1 = new P2PControl$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(P2PControl.class), "type.googleapis.com/squareup.cash.fiatly.syncvalues.P2PControl", Syntax.PROTO_2, null, "squareup/cash/fiatly/syncvalues/P2PControl.proto");
        ADAPTER = p2PControl$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(p2PControl$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PControl(Boolean bool, LocalizedString localizedString, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.enabled = bool;
        this.limit_helper_text = localizedString;
        this.limit_amount_cents = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P2PControl)) {
            return false;
        }
        P2PControl p2PControl = (P2PControl) obj;
        return Intrinsics.areEqual(unknownFields(), p2PControl.unknownFields()) && Intrinsics.areEqual(this.enabled, p2PControl.enabled) && Intrinsics.areEqual(this.limit_helper_text, p2PControl.limit_helper_text) && Intrinsics.areEqual(this.limit_amount_cents, p2PControl.limit_amount_cents);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.enabled;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        LocalizedString localizedString = this.limit_helper_text;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Long l = this.limit_amount_cents;
        int hashCode4 = hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LoanOption.Builder builder = new LoanOption.Builder(21);
        builder.loan_type = this.enabled;
        builder.payment_schedule = this.limit_helper_text;
        builder.tila_data = this.limit_amount_cents;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        LocalizedString localizedString = this.limit_helper_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("limit_helper_text=", localizedString, arrayList);
        }
        Long l = this.limit_amount_cents;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("limit_amount_cents=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "P2PControl{", "}", 0, null, null, 56);
    }
}
