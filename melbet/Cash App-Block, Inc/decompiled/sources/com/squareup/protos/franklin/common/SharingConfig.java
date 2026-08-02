package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.SharingContent;
import com.squareup.protos.franklin.common.AppLinks;
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
public final class SharingConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SharingConfig> CREATOR;
    public final Boolean enabled;
    public final SharingContent sharing_content;

    static {
        SharingConfig$Companion$ADAPTER$1 sharingConfig$Companion$ADAPTER$1 = new SharingConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SharingConfig.class), "type.googleapis.com/squareup.franklin.common.SharingConfig", Syntax.PROTO_2, null, "squareup/franklin/common/sharing_config.proto");
        ADAPTER = sharingConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(sharingConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharingConfig(Boolean bool, SharingContent sharingContent, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.enabled = bool;
        this.sharing_content = sharingContent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SharingConfig)) {
            return false;
        }
        SharingConfig sharingConfig = (SharingConfig) obj;
        return Intrinsics.areEqual(unknownFields(), sharingConfig.unknownFields()) && Intrinsics.areEqual(this.enabled, sharingConfig.enabled) && Intrinsics.areEqual(this.sharing_content, sharingConfig.sharing_content);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.enabled;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        SharingContent sharingContent = this.sharing_content;
        int hashCode3 = hashCode2 + (sharingContent != null ? sharingContent.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(16);
        builder.f1372android = this.enabled;
        builder.ios = this.sharing_content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        SharingContent sharingContent = this.sharing_content;
        if (sharingContent != null) {
            arrayList.add("sharing_content=" + sharingContent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SharingConfig{", "}", 0, null, null, 56);
    }
}
