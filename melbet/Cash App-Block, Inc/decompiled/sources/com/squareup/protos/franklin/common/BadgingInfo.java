package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiIdvState;
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
public final class BadgingInfo extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BadgingInfo> CREATOR;
    public final Long badging_version;
    public final Boolean is_badged;

    static {
        BadgingInfo$Companion$ADAPTER$1 badgingInfo$Companion$ADAPTER$1 = new BadgingInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BadgingInfo.class), "type.googleapis.com/squareup.franklin.BadgingInfo", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = badgingInfo$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(badgingInfo$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgingInfo(Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.is_badged = bool;
        this.badging_version = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BadgingInfo)) {
            return false;
        }
        BadgingInfo badgingInfo = (BadgingInfo) obj;
        return Intrinsics.areEqual(unknownFields(), badgingInfo.unknownFields()) && Intrinsics.areEqual(this.is_badged, badgingInfo.is_badged) && Intrinsics.areEqual(this.badging_version, badgingInfo.badging_version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.is_badged;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Long l = this.badging_version;
        int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiIdvState.Builder builder = new UiIdvState.Builder(3);
        builder.has_verified_identity = this.is_badged;
        builder.can_attempt_electronic_idv_at = this.badging_version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.is_badged;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_badged=", bool, arrayList);
        }
        Long l = this.badging_version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("badging_version=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BadgingInfo{", "}", 0, null, null, 56);
    }
}
