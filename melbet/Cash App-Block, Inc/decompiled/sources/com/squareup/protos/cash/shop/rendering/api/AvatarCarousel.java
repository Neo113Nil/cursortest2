package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.ListPoolsResponse;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AvatarCarousel extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AvatarCarousel> CREATOR;
    public final List items;

    static {
        AvatarCarousel$Companion$ADAPTER$1 avatarCarousel$Companion$ADAPTER$1 = new AvatarCarousel$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvatarCarousel.class), "type.googleapis.com/squareup.cash.shop.rendering.api.AvatarCarousel", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/AvatarCarousel.proto");
        ADAPTER = avatarCarousel$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(avatarCarousel$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarCarousel(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.items = TransactorKt.immutableCopyOf("items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvatarCarousel)) {
            return false;
        }
        AvatarCarousel avatarCarousel = (AvatarCarousel) obj;
        return Intrinsics.areEqual(unknownFields(), avatarCarousel.unknownFields()) && Intrinsics.areEqual(this.items, avatarCarousel.items);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.items.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(20, false);
        builder.pools = this.items;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.items;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("items=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AvatarCarousel{", "}", 0, null, null, 56);
    }
}
