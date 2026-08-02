package com.squareup.protos.cash.offerdex.sync;

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
public final class OfferCustomerPreference extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OfferCustomerPreference> CREATOR;
    public final Boolean push_notifications_enabled;

    static {
        OfferCustomerPreference$Companion$ADAPTER$1 offerCustomerPreference$Companion$ADAPTER$1 = new OfferCustomerPreference$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OfferCustomerPreference.class), "type.googleapis.com/squareup.cash.offerdex.sync.OfferCustomerPreference", Syntax.PROTO_2, null, "squareup/cash/offerdex/sync/OfferCustomerPreference.proto");
        ADAPTER = offerCustomerPreference$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(offerCustomerPreference$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferCustomerPreference(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.push_notifications_enabled = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfferCustomerPreference)) {
            return false;
        }
        OfferCustomerPreference offerCustomerPreference = (OfferCustomerPreference) obj;
        return Intrinsics.areEqual(unknownFields(), offerCustomerPreference.unknownFields()) && Intrinsics.areEqual(this.push_notifications_enabled, offerCustomerPreference.push_notifications_enabled);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.push_notifications_enabled;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppLock.Builder builder = new UiAppLock.Builder(16);
        builder.activated = this.push_notifications_enabled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.push_notifications_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("push_notifications_enabled=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OfferCustomerPreference{", "}", 0, null, null, 56);
    }
}
