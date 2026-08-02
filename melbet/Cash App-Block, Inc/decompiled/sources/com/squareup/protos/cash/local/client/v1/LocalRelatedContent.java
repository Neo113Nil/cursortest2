package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
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

/* loaded from: classes7.dex */
public final class LocalRelatedContent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalRelatedContent> CREATOR;
    public final List items;
    public final String title;

    public final class Item extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Item> CREATOR;
        public final String client_route;
        public final String description;
        public final LocalImage image;
        public final String title;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public String client_route;
            public String description;
            public LocalImage image;
            public String title;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new Item(this.image, this.title, this.description, this.client_route, buildUnknownFields());
                    default:
                        return new GetNeighborhoodsTabContentResponse.Incentive(this.image, this.title, this.description, this.client_route, buildUnknownFields());
                }
            }
        }

        static {
            LocalRelatedContent$Item$Companion$ADAPTER$1 localRelatedContent$Item$Companion$ADAPTER$1 = new LocalRelatedContent$Item$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Item.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalRelatedContent.Item", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_brand.proto");
            ADAPTER = localRelatedContent$Item$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localRelatedContent$Item$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Item(LocalImage localImage, String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image = localImage;
            this.title = str;
            this.description = str2;
            this.client_route = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.areEqual(unknownFields(), item.unknownFields()) && Intrinsics.areEqual(this.image, item.image) && Intrinsics.areEqual(this.title, item.title) && Intrinsics.areEqual(this.description, item.description) && Intrinsics.areEqual(this.client_route, item.client_route);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalImage localImage = this.image;
            int hashCode2 = (hashCode + (localImage != null ? localImage.hashCode() : 0)) * 37;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.description;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.client_route;
            int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.image = this.image;
            builder.title = this.title;
            builder.description = this.description;
            builder.client_route = this.client_route;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalImage localImage = this.image;
            if (localImage != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", localImage, arrayList);
            }
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.description;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
            }
            String str3 = this.client_route;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "client_route=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Item{", "}", 0, null, null, 56);
        }
    }

    static {
        LocalRelatedContent$Companion$ADAPTER$1 localRelatedContent$Companion$ADAPTER$1 = new LocalRelatedContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalRelatedContent.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalRelatedContent", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_brand.proto");
        ADAPTER = localRelatedContent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localRelatedContent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalRelatedContent(String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.items = TransactorKt.immutableCopyOf("items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalRelatedContent)) {
            return false;
        }
        LocalRelatedContent localRelatedContent = (LocalRelatedContent) obj;
        return Intrinsics.areEqual(unknownFields(), localRelatedContent.unknownFields()) && Intrinsics.areEqual(this.title, localRelatedContent.title) && Intrinsics.areEqual(this.items, localRelatedContent.items);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = this.items.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ToggleScreen.Builder builder = new ToggleScreen.Builder(23, false);
        builder.toggle_title = this.title;
        builder.sections = this.items;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        List list = this.items;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("items=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalRelatedContent{", "}", 0, null, null, 56);
    }
}
