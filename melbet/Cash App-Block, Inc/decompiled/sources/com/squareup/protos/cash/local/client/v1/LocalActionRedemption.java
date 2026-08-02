package com.squareup.protos.cash.local.client.v1;

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
public final class LocalActionRedemption extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalActionRedemption> CREATOR;
    public final Boolean closed_loop_enabled;

    static {
        LocalActionRedemption$Companion$ADAPTER$1 localActionRedemption$Companion$ADAPTER$1 = new LocalActionRedemption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalActionRedemption.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalActionRedemption", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_actions.proto");
        ADAPTER = localActionRedemption$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localActionRedemption$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalActionRedemption(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.closed_loop_enabled = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalActionRedemption)) {
            return false;
        }
        LocalActionRedemption localActionRedemption = (LocalActionRedemption) obj;
        return Intrinsics.areEqual(unknownFields(), localActionRedemption.unknownFields()) && Intrinsics.areEqual(this.closed_loop_enabled, localActionRedemption.closed_loop_enabled);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.closed_loop_enabled;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppLock.Builder builder = new UiAppLock.Builder(14);
        builder.activated = this.closed_loop_enabled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.closed_loop_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("closed_loop_enabled=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalActionRedemption{", "}", 0, null, null, 56);
    }
}
