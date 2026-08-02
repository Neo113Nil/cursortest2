package com.squareup.protos.cash.taply.app.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.money.elements.BookletTile;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.protos.document.Document;
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
public final class SuccessScreen extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SuccessScreen> CREATOR;
    public final String button_text;
    public final List cards;
    public final String disclosure_text;
    public final String highlighted_title;
    public final String standard_title;
    public final BookletTile tiles;

    public final class Card extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Card> CREATOR;
        public final String button_text;
        public final String button_url;
        public final String header;
        public final String image_url;

        static {
            SuccessScreen$Card$Companion$ADAPTER$1 successScreen$Card$Companion$ADAPTER$1 = new SuccessScreen$Card$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Card.class), "type.googleapis.com/squareup.cash.taply.app.v1beta1.SuccessScreen.Card", Syntax.PROTO_2, null, "squareup/cash/taply/app/v1beta1/on_fidesmo_provisioning_start.proto");
            ADAPTER = successScreen$Card$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(successScreen$Card$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image_url = str;
            this.header = str2;
            this.button_text = str3;
            this.button_url = str4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Card)) {
                return false;
            }
            Card card = (Card) obj;
            return Intrinsics.areEqual(unknownFields(), card.unknownFields()) && Intrinsics.areEqual(this.image_url, card.image_url) && Intrinsics.areEqual(this.header, card.header) && Intrinsics.areEqual(this.button_text, card.button_text) && Intrinsics.areEqual(this.button_url, card.button_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.image_url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.header;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.button_text;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.button_url;
            int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PoolOwner.Builder builder = new PoolOwner.Builder(14);
            builder.customer_token = this.image_url;
            builder.full_name = this.header;
            builder.profile_photo_url = this.button_text;
            builder.cashtag = this.button_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.image_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "image_url=", arrayList);
            }
            String str2 = this.header;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "header=", arrayList);
            }
            String str3 = this.button_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "button_text=", arrayList);
            }
            String str4 = this.button_url;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "button_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Card{", "}", 0, null, null, 56);
        }
    }

    static {
        SuccessScreen$Companion$ADAPTER$1 successScreen$Companion$ADAPTER$1 = new SuccessScreen$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SuccessScreen.class), "type.googleapis.com/squareup.cash.taply.app.v1beta1.SuccessScreen", Syntax.PROTO_2, null, "squareup/cash/taply/app/v1beta1/on_fidesmo_provisioning_start.proto");
        ADAPTER = successScreen$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(successScreen$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuccessScreen(String str, String str2, String str3, BookletTile bookletTile, List list, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.highlighted_title = str;
        this.standard_title = str2;
        this.button_text = str3;
        this.tiles = bookletTile;
        this.disclosure_text = str4;
        this.cards = TransactorKt.immutableCopyOf("cards", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SuccessScreen)) {
            return false;
        }
        SuccessScreen successScreen = (SuccessScreen) obj;
        return Intrinsics.areEqual(unknownFields(), successScreen.unknownFields()) && Intrinsics.areEqual(this.highlighted_title, successScreen.highlighted_title) && Intrinsics.areEqual(this.standard_title, successScreen.standard_title) && Intrinsics.areEqual(this.button_text, successScreen.button_text) && Intrinsics.areEqual(this.tiles, successScreen.tiles) && Intrinsics.areEqual(this.cards, successScreen.cards) && Intrinsics.areEqual(this.disclosure_text, successScreen.disclosure_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.highlighted_title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.standard_title;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.button_text;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        BookletTile bookletTile = this.tiles;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (bookletTile != null ? bookletTile.hashCode() : 0)) * 37, 37, this.cards);
        String str4 = this.disclosure_text;
        int hashCode5 = m + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Document.Builder builder = new Document.Builder(7, false);
        builder.category = this.highlighted_title;
        builder.token = this.standard_title;
        builder.title = this.button_text;
        builder.owner_token = this.tiles;
        builder.document_date = this.cards;
        builder.url = this.disclosure_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.highlighted_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "highlighted_title=", arrayList);
        }
        String str2 = this.standard_title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "standard_title=", arrayList);
        }
        String str3 = this.button_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "button_text=", arrayList);
        }
        BookletTile bookletTile = this.tiles;
        if (bookletTile != null) {
            arrayList.add("tiles=" + bookletTile);
        }
        List list = this.cards;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("cards=", arrayList, list);
        }
        String str4 = this.disclosure_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "disclosure_text=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SuccessScreen{", "}", 0, null, null, 56);
    }
}
