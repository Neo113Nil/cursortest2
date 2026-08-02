package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzhh;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.Group;
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
public final class MarketScreenContent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MarketScreenContent> CREATOR;
    public final zzhh content_type;
    public final String section_id;
    public final Long section_index;

    static {
        MarketScreenContent$Companion$ADAPTER$1 marketScreenContent$Companion$ADAPTER$1 = new MarketScreenContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MarketScreenContent.class), "type.googleapis.com/squareup.cash.local.client.app.v1.MarketScreenContent", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/model.proto");
        ADAPTER = marketScreenContent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(marketScreenContent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketScreenContent(zzhh zzhhVar, String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.content_type = zzhhVar;
        this.section_id = str;
        this.section_index = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarketScreenContent)) {
            return false;
        }
        MarketScreenContent marketScreenContent = (MarketScreenContent) obj;
        return Intrinsics.areEqual(unknownFields(), marketScreenContent.unknownFields()) && Intrinsics.areEqual(this.content_type, marketScreenContent.content_type) && Intrinsics.areEqual(this.section_id, marketScreenContent.section_id) && Intrinsics.areEqual(this.section_index, marketScreenContent.section_index);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzhh zzhhVar = this.content_type;
        int hashCode2 = (hashCode + (zzhhVar != null ? zzhhVar.hashCode() : 0)) * 37;
        String str = this.section_id;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.section_index;
        int hashCode4 = hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(14);
        builder.group_image = this.content_type;
        builder.name = this.section_id;
        builder.participants = this.section_index;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzhh zzhhVar = this.content_type;
        if (zzhhVar != null) {
            arrayList.add("content_type=" + zzhhVar);
        }
        String str = this.section_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "section_id=", arrayList);
        }
        Long l = this.section_index;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("section_index=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarketScreenContent{", "}", 0, null, null, 56);
    }
}
