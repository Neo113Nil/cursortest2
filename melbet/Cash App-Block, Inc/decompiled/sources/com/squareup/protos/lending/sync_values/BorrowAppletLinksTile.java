package com.squareup.protos.lending.sync_values;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.ui.UiDda;
import com.squareup.protos.giftly.GiftCard;
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
import squareup.cash.earnings.ActionButton;
import xyz.block.protos.genie.Collection;

/* loaded from: classes8.dex */
public final class BorrowAppletLinksTile extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BorrowAppletLinksTile> CREATOR;
    public final List tiles;

    public final class Data extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Data> CREATOR;
        public final Button button;
        public final List links;
        public final LocalizedString title;

        public final class Button extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Button> CREATOR;
            public final String action_url;
            public final LocalizedString text;

            static {
                BorrowAppletLinksTile$Data$Button$Companion$ADAPTER$1 borrowAppletLinksTile$Data$Button$Companion$ADAPTER$1 = new BorrowAppletLinksTile$Data$Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletLinksTile.Data.Button", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                ADAPTER = borrowAppletLinksTile$Data$Button$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletLinksTile$Data$Button$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Button(LocalizedString localizedString, String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.action_url = str;
                this.text = localizedString;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.action_url, button.action_url) && Intrinsics.areEqual(this.text, button.text);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.action_url;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                LocalizedString localizedString = this.text;
                int hashCode3 = hashCode2 + (localizedString != null ? localizedString.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ActionButton.Builder builder = new ActionButton.Builder(4);
                builder.client_route = this.action_url;
                builder.title = this.text;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.action_url;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "action_url=", arrayList);
                }
                LocalizedString localizedString = this.text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
            }
        }

        public final class LinkCell extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<LinkCell> CREATOR;
            public final String action_url;
            public final LocalizedString body_text;
            public final Icon icon;
            public final LocalizedString label_text;

            static {
                BorrowAppletLinksTile$Data$LinkCell$Companion$ADAPTER$1 borrowAppletLinksTile$Data$LinkCell$Companion$ADAPTER$1 = new BorrowAppletLinksTile$Data$LinkCell$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LinkCell.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletLinksTile.Data.LinkCell", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                ADAPTER = borrowAppletLinksTile$Data$LinkCell$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletLinksTile$Data$LinkCell$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LinkCell(Icon icon, LocalizedString localizedString, LocalizedString localizedString2, String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.icon = icon;
                this.label_text = localizedString;
                this.body_text = localizedString2;
                this.action_url = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof LinkCell)) {
                    return false;
                }
                LinkCell linkCell = (LinkCell) obj;
                return Intrinsics.areEqual(unknownFields(), linkCell.unknownFields()) && Intrinsics.areEqual(this.icon, linkCell.icon) && Intrinsics.areEqual(this.label_text, linkCell.label_text) && Intrinsics.areEqual(this.body_text, linkCell.body_text) && Intrinsics.areEqual(this.action_url, linkCell.action_url);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Icon icon = this.icon;
                int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
                LocalizedString localizedString = this.label_text;
                int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.body_text;
                int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                String str = this.action_url;
                int hashCode5 = hashCode4 + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                UiDda.Builder builder = new UiDda.Builder(15);
                builder.account = this.icon;
                builder.enabled = this.label_text;
                builder.button = this.body_text;
                builder.dda_form = this.action_url;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Icon icon = this.icon;
                if (icon != null) {
                    Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
                }
                LocalizedString localizedString = this.label_text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("label_text=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.body_text;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("body_text=", localizedString2, arrayList);
                }
                String str = this.action_url;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "action_url=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "LinkCell{", "}", 0, null, null, 56);
            }
        }

        static {
            BorrowAppletLinksTile$Data$Companion$ADAPTER$1 borrowAppletLinksTile$Data$Companion$ADAPTER$1 = new BorrowAppletLinksTile$Data$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Data.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletLinksTile.Data", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
            ADAPTER = borrowAppletLinksTile$Data$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletLinksTile$Data$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Data(LocalizedString localizedString, List list, Button button, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = localizedString;
            this.button = button;
            this.links = TransactorKt.immutableCopyOf("links", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return Intrinsics.areEqual(unknownFields(), data.unknownFields()) && Intrinsics.areEqual(this.title, data.title) && Intrinsics.areEqual(this.links, data.links) && Intrinsics.areEqual(this.button, data.button);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37, 37, this.links);
            Button button = this.button;
            int hashCode2 = m + (button != null ? button.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GiftCard.Options.Builder builder = new GiftCard.Options.Builder(15);
            builder.label = this.title;
            builder.localizable_label = this.links;
            builder.client_scenario = this.button;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            List list = this.links;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("links=", arrayList, list);
            }
            Button button = this.button;
            if (button != null) {
                arrayList.add("button=" + button);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Data{", "}", 0, null, null, 56);
        }
    }

    static {
        BorrowAppletLinksTile$Companion$ADAPTER$1 borrowAppletLinksTile$Companion$ADAPTER$1 = new BorrowAppletLinksTile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BorrowAppletLinksTile.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletLinksTile", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
        ADAPTER = borrowAppletLinksTile$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletLinksTile$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorrowAppletLinksTile(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.tiles = TransactorKt.immutableCopyOf("tiles", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BorrowAppletLinksTile)) {
            return false;
        }
        BorrowAppletLinksTile borrowAppletLinksTile = (BorrowAppletLinksTile) obj;
        return Intrinsics.areEqual(unknownFields(), borrowAppletLinksTile.unknownFields()) && Intrinsics.areEqual(this.tiles, borrowAppletLinksTile.tiles);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.tiles.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Collection.Builder builder = new Collection.Builder(12, false);
        builder.items = this.tiles;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.tiles;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("tiles=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BorrowAppletLinksTile{", "}", 0, null, null, 56);
    }
}
