package com.squareup.protos.cash.badging.api;

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

/* loaded from: classes7.dex */
public final class ClearBadgeClientRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClearBadgeClientRequest> CREATOR;
    public final String external_token;
    public final Long external_version;
    public final ItemType item_type;

    static {
        ClearBadgeClientRequest$Companion$ADAPTER$1 clearBadgeClientRequest$Companion$ADAPTER$1 = new ClearBadgeClientRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClearBadgeClientRequest.class), "type.googleapis.com/squareup.cash.badging.api.ClearBadgeClientRequest", Syntax.PROTO_2, null, "squareup/cash/badging/api/service.proto");
        ADAPTER = clearBadgeClientRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(clearBadgeClientRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearBadgeClientRequest(String str, ItemType itemType, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.external_token = str;
        this.item_type = itemType;
        this.external_version = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClearBadgeClientRequest)) {
            return false;
        }
        ClearBadgeClientRequest clearBadgeClientRequest = (ClearBadgeClientRequest) obj;
        return Intrinsics.areEqual(unknownFields(), clearBadgeClientRequest.unknownFields()) && Intrinsics.areEqual(this.external_token, clearBadgeClientRequest.external_token) && this.item_type == clearBadgeClientRequest.item_type && Intrinsics.areEqual(this.external_version, clearBadgeClientRequest.external_version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.external_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ItemType itemType = this.item_type;
        int hashCode3 = (hashCode2 + (itemType != null ? itemType.hashCode() : 0)) * 37;
        Long l = this.external_version;
        int hashCode4 = hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(11);
        builder.header_text = this.external_token;
        builder.header_button = this.item_type;
        builder.groups = this.external_version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.external_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "external_token=", arrayList);
        }
        ItemType itemType = this.item_type;
        if (itemType != null) {
            arrayList.add("item_type=" + itemType);
        }
        Long l = this.external_version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("external_version=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClearBadgeClientRequest{", "}", 0, null, null, 56);
    }
}
