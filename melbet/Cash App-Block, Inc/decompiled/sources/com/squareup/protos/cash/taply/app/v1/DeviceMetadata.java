package com.squareup.protos.cash.taply.app.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.profiles.ProfileDetails;
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
public final class DeviceMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DeviceMetadata> CREATOR;
    public final String tag_theme_token;

    static {
        DeviceMetadata$Companion$ADAPTER$1 deviceMetadata$Companion$ADAPTER$1 = new DeviceMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DeviceMetadata.class), "type.googleapis.com/squareup.cash.taply.app.v1beta1.DeviceMetadata", Syntax.PROTO_2, null, "squareup/cash/taply/app/v1beta1/on_fidesmo_provisioning_start.proto");
        ADAPTER = deviceMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(deviceMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceMetadata(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.tag_theme_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceMetadata)) {
            return false;
        }
        DeviceMetadata deviceMetadata = (DeviceMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), deviceMetadata.unknownFields()) && Intrinsics.areEqual(this.tag_theme_token, deviceMetadata.tag_theme_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.tag_theme_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileDetails.Builder builder = new ProfileDetails.Builder(26);
        builder.bio = this.tag_theme_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.tag_theme_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "tag_theme_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DeviceMetadata{", "}", 0, null, null, 56);
    }
}
