package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.GiftCard;
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
public final class LocalNumberedListItem extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalNumberedListItem> CREATOR;
    public final String body;
    public final String header_label;
    public final LocalImage image;
    public final Long index;

    static {
        LocalNumberedListItem$Companion$ADAPTER$1 localNumberedListItem$Companion$ADAPTER$1 = new LocalNumberedListItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalNumberedListItem.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalNumberedListItem", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_common.proto");
        ADAPTER = localNumberedListItem$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localNumberedListItem$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalNumberedListItem(Long l, String str, String str2, LocalImage localImage, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.index = l;
        this.header_label = str;
        this.body = str2;
        this.image = localImage;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalNumberedListItem)) {
            return false;
        }
        LocalNumberedListItem localNumberedListItem = (LocalNumberedListItem) obj;
        return Intrinsics.areEqual(unknownFields(), localNumberedListItem.unknownFields()) && Intrinsics.areEqual(this.index, localNumberedListItem.index) && Intrinsics.areEqual(this.header_label, localNumberedListItem.header_label) && Intrinsics.areEqual(this.body, localNumberedListItem.body) && Intrinsics.areEqual(this.image, localNumberedListItem.image);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.index;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str = this.header_label;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.body;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalImage localImage = this.image;
        int hashCode5 = hashCode4 + (localImage != null ? localImage.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(12, false);
        builder.gift_card_id = this.index;
        builder.id = this.header_label;
        builder.last_4 = this.body;
        builder.gift_card_amount = this.image;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.index;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("index=", l, arrayList);
        }
        String str = this.header_label;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header_label=", arrayList);
        }
        String str2 = this.body;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "body=", arrayList);
        }
        LocalImage localImage = this.image;
        if (localImage != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", localImage, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalNumberedListItem{", "}", 0, null, null, 56);
    }
}
