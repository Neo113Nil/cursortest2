package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashface.api.TrustsData;
import com.squareup.protos.cash.cashregistrar.Account;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
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
public final class AvatarSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AvatarSection> CREATOR;
    public final List items;

    public final class AvatarItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AvatarItem> CREATOR;
        public final Avatar avatar;
        public final String item_action_url;
        public final ItemMetadata metadata;
        public final Text subtitle;
        public final Text title;

        static {
            AvatarSection$AvatarItem$Companion$ADAPTER$1 avatarSection$AvatarItem$Companion$ADAPTER$1 = new AvatarSection$AvatarItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvatarItem.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AvatarSection.AvatarItem", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/Common.proto");
            ADAPTER = avatarSection$AvatarItem$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(avatarSection$AvatarItem$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvatarItem(ItemMetadata itemMetadata, Avatar avatar, Text text, String str, Text text2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.metadata = itemMetadata;
            this.avatar = avatar;
            this.title = text;
            this.item_action_url = str;
            this.subtitle = text2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarItem)) {
                return false;
            }
            AvatarItem avatarItem = (AvatarItem) obj;
            return Intrinsics.areEqual(unknownFields(), avatarItem.unknownFields()) && Intrinsics.areEqual(this.metadata, avatarItem.metadata) && Intrinsics.areEqual(this.avatar, avatarItem.avatar) && Intrinsics.areEqual(this.title, avatarItem.title) && Intrinsics.areEqual(this.item_action_url, avatarItem.item_action_url) && Intrinsics.areEqual(this.subtitle, avatarItem.subtitle);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ItemMetadata itemMetadata = this.metadata;
            int hashCode2 = (hashCode + (itemMetadata != null ? itemMetadata.hashCode() : 0)) * 37;
            Avatar avatar = this.avatar;
            int hashCode3 = (hashCode2 + (avatar != null ? avatar.hashCode() : 0)) * 37;
            Text text = this.title;
            int hashCode4 = (hashCode3 + (text != null ? text.hashCode() : 0)) * 37;
            String str = this.item_action_url;
            int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
            Text text2 = this.subtitle;
            int hashCode6 = hashCode5 + (text2 != null ? text2.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Account.Builder builder = new Account.Builder(18, false);
            builder.account_token = this.metadata;
            builder.display_name = this.avatar;
            builder.account_type = this.title;
            builder.customer_token = this.item_action_url;
            builder.is_sponsored_account = this.subtitle;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            ItemMetadata itemMetadata = this.metadata;
            if (itemMetadata != null) {
                arrayList.add("metadata=" + itemMetadata);
            }
            Avatar avatar = this.avatar;
            if (avatar != null) {
                arrayList.add("avatar=" + avatar);
            }
            Text text = this.title;
            if (text != null) {
                SizeMode$EnumUnboxingLocalUtility.m("title=", text, arrayList);
            }
            String str = this.item_action_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "item_action_url=", arrayList);
            }
            Text text2 = this.subtitle;
            if (text2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("subtitle=", text2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AvatarItem{", "}", 0, null, null, 56);
        }
    }

    static {
        AvatarSection$Companion$ADAPTER$1 avatarSection$Companion$ADAPTER$1 = new AvatarSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvatarSection.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AvatarSection", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/Common.proto");
        ADAPTER = avatarSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(avatarSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarSection(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.items = TransactorKt.immutableCopyOf("items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvatarSection)) {
            return false;
        }
        AvatarSection avatarSection = (AvatarSection) obj;
        return Intrinsics.areEqual(unknownFields(), avatarSection.unknownFields()) && Intrinsics.areEqual(this.items, avatarSection.items);
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
        TrustsData.Builder builder = new TrustsData.Builder(13);
        builder.trust = this.items;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.items;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("items=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AvatarSection{", "}", 0, null, null, 56);
    }
}
