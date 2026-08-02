package com.squareup.protos.access.sync_values;

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
public final class OTPInfo extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OTPInfo> CREATOR;
    public final Boolean otp_enabled;

    static {
        OTPInfo$Companion$ADAPTER$1 oTPInfo$Companion$ADAPTER$1 = new OTPInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OTPInfo.class), "type.googleapis.com/squareup.access.sync_values.OTPInfo", Syntax.PROTO_2, null, "squareup/access/sync_values.proto");
        ADAPTER = oTPInfo$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(oTPInfo$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPInfo(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.otp_enabled = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OTPInfo)) {
            return false;
        }
        OTPInfo oTPInfo = (OTPInfo) obj;
        return Intrinsics.areEqual(unknownFields(), oTPInfo.unknownFields()) && Intrinsics.areEqual(this.otp_enabled, oTPInfo.otp_enabled);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.otp_enabled;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppLock.Builder builder = new UiAppLock.Builder(1);
        builder.activated = this.otp_enabled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.otp_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("otp_enabled=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OTPInfo{", "}", 0, null, null, 56);
    }
}
