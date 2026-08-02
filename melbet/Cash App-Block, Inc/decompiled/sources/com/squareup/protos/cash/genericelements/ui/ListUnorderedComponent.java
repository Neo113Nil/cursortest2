package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ListUnorderedComponent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ListUnorderedComponent> CREATOR;
    public final List items;
    public final Style style;

    public final class Item extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Item> CREATOR;
        public final String icon_id;
        public final String label;
        public final Action onClick;
        public final String value;

        static {
            ListUnorderedComponent$Item$Companion$ADAPTER$1 listUnorderedComponent$Item$Companion$ADAPTER$1 = new ListUnorderedComponent$Item$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Item.class), "type.googleapis.com/squareup.cash.genericelements.ui.ListUnorderedComponent.Item", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
            ADAPTER = listUnorderedComponent$Item$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(listUnorderedComponent$Item$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Item(String str, String str2, Action action, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.label = str;
            this.value = str2;
            this.onClick = action;
            this.icon_id = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.areEqual(unknownFields(), item.unknownFields()) && Intrinsics.areEqual(this.label, item.label) && Intrinsics.areEqual(this.value, item.value) && Intrinsics.areEqual(this.onClick, item.onClick) && Intrinsics.areEqual(this.icon_id, item.icon_id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.label;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.value;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Action action = this.onClick;
            int hashCode4 = (hashCode3 + (action != null ? action.hashCode() : 0)) * 37;
            String str3 = this.icon_id;
            int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Card.CardPii.Builder builder = new Card.CardPii.Builder(13, false);
            builder.postal_code = this.label;
            builder.last_four_digits = this.value;
            builder.expiration = this.onClick;
            builder.ciphertext_ = this.icon_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
            }
            String str2 = this.value;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "value=", arrayList);
            }
            Action action = this.onClick;
            if (action != null) {
                arrayList.add("onClick=" + action);
            }
            String str3 = this.icon_id;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "icon_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Item{", "}", 0, null, null, 56);
        }
    }

    public enum Style implements WireEnum {
        STANDARD(1),
        SUBTLE(2);

        public final int value;
        public static final RadioType.Companion Companion = new RadioType.Companion();
        public static final ListUnorderedComponent$Style$Companion$ADAPTER$1 ADAPTER = new ListUnorderedComponent$Style$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Style.class), Syntax.PROTO_2, null);

        Style(int i) {
            this.value = i;
        }

        public static final Style fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return STANDARD;
            }
            if (i != 2) {
                return null;
            }
            return SUBTLE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ListUnorderedComponent$Companion$ADAPTER$1 listUnorderedComponent$Companion$ADAPTER$1 = new ListUnorderedComponent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ListUnorderedComponent.class), "type.googleapis.com/squareup.cash.genericelements.ui.ListUnorderedComponent", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = listUnorderedComponent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(listUnorderedComponent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListUnorderedComponent(Style style, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.style = style;
        this.items = TransactorKt.immutableCopyOf("items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListUnorderedComponent)) {
            return false;
        }
        ListUnorderedComponent listUnorderedComponent = (ListUnorderedComponent) obj;
        return Intrinsics.areEqual(unknownFields(), listUnorderedComponent.unknownFields()) && this.style == listUnorderedComponent.style && Intrinsics.areEqual(this.items, listUnorderedComponent.items);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Style style = this.style;
        int hashCode2 = this.items.hashCode() + ((hashCode + (style != null ? style.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(24);
        builder.f1268type = this.style;
        builder.details = this.items;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Style style = this.style;
        if (style != null) {
            arrayList.add("style=" + style);
        }
        List list = this.items;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("items=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListUnorderedComponent{", "}", 0, null, null, 56);
    }
}
