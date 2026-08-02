package com.squareup.protos.cash.taply.app.v1;

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

/* loaded from: classes8.dex */
public final class DeviceProvisioningStatus extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DeviceProvisioningStatus> CREATOR;
    public final Boolean is_provisioned;

    static {
        DeviceProvisioningStatus$Companion$ADAPTER$1 deviceProvisioningStatus$Companion$ADAPTER$1 = new DeviceProvisioningStatus$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DeviceProvisioningStatus.class), "type.googleapis.com/squareup.cash.taply.app.v1beta1.DeviceProvisioningStatus", Syntax.PROTO_2, null, "squareup/cash/taply/app/v1beta1/on_fidesmo_provisioning_start.proto");
        ADAPTER = deviceProvisioningStatus$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(deviceProvisioningStatus$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceProvisioningStatus(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.is_provisioned = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceProvisioningStatus)) {
            return false;
        }
        DeviceProvisioningStatus deviceProvisioningStatus = (DeviceProvisioningStatus) obj;
        return Intrinsics.areEqual(unknownFields(), deviceProvisioningStatus.unknownFields()) && Intrinsics.areEqual(this.is_provisioned, deviceProvisioningStatus.is_provisioned);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.is_provisioned;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppLock.Builder builder = new UiAppLock.Builder(21);
        builder.activated = this.is_provisioned;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.is_provisioned;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_provisioned=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DeviceProvisioningStatus{", "}", 0, null, null, 56);
    }
}
