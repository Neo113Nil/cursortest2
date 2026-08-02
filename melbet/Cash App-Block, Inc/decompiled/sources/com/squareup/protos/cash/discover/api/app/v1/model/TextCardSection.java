package com.squareup.protos.cash.discover.api.app.v1.model;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.LoanOption;
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
public final class TextCardSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TextCardSection> CREATOR;
    public final List cards;
    public final Integer max_items;
    public final OverflowCard overflow;

    public final class OverflowCard extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OverflowCard> CREATOR;
        public final String prompt_text;
        public final String screen_header_text;

        static {
            TextCardSection$OverflowCard$Companion$ADAPTER$1 textCardSection$OverflowCard$Companion$ADAPTER$1 = new TextCardSection$OverflowCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OverflowCard.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.TextCardSection.OverflowCard", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/sections.proto");
            ADAPTER = textCardSection$OverflowCard$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(textCardSection$OverflowCard$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OverflowCard(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.prompt_text = str;
            this.screen_header_text = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OverflowCard)) {
                return false;
            }
            OverflowCard overflowCard = (OverflowCard) obj;
            return Intrinsics.areEqual(unknownFields(), overflowCard.unknownFields()) && Intrinsics.areEqual(this.prompt_text, overflowCard.prompt_text) && Intrinsics.areEqual(this.screen_header_text, overflowCard.screen_header_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.prompt_text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.screen_header_text;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            FullName.Builder builder = new FullName.Builder(1);
            builder.given_name = this.prompt_text;
            builder.family_name = this.screen_header_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.prompt_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "prompt_text=", arrayList);
            }
            String str2 = this.screen_header_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "screen_header_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OverflowCard{", "}", 0, null, null, 56);
        }
    }

    public final class TextCard extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TextCard> CREATOR;
        public final TapAction action;
        public final Avatar avatar;
        public final Text description;
        public final Text subtitle;
        public final Text title;

        static {
            TextCardSection$TextCard$Companion$ADAPTER$1 textCardSection$TextCard$Companion$ADAPTER$1 = new TextCardSection$TextCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextCard.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.TextCardSection.TextCard", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/sections.proto");
            ADAPTER = textCardSection$TextCard$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(textCardSection$TextCard$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextCard(Text text, Text text2, Text text3, Avatar avatar, TapAction tapAction, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = text;
            this.subtitle = text2;
            this.description = text3;
            this.avatar = avatar;
            this.action = tapAction;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TextCard)) {
                return false;
            }
            TextCard textCard = (TextCard) obj;
            return Intrinsics.areEqual(unknownFields(), textCard.unknownFields()) && Intrinsics.areEqual(this.title, textCard.title) && Intrinsics.areEqual(this.subtitle, textCard.subtitle) && Intrinsics.areEqual(this.description, textCard.description) && Intrinsics.areEqual(this.avatar, textCard.avatar) && Intrinsics.areEqual(this.action, textCard.action);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Text text = this.title;
            int hashCode2 = (hashCode + (text != null ? text.hashCode() : 0)) * 37;
            Text text2 = this.subtitle;
            int hashCode3 = (hashCode2 + (text2 != null ? text2.hashCode() : 0)) * 37;
            Text text3 = this.description;
            int hashCode4 = (hashCode3 + (text3 != null ? text3.hashCode() : 0)) * 37;
            Avatar avatar = this.avatar;
            int hashCode5 = (hashCode4 + (avatar != null ? avatar.hashCode() : 0)) * 37;
            TapAction tapAction = this.action;
            int hashCode6 = hashCode5 + (tapAction != null ? tapAction.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Text.Builder builder = new Text.Builder(4);
            builder.text = this.title;
            builder.text_style = this.subtitle;
            builder.text_decoration = this.description;
            builder.text_color = this.avatar;
            builder.icon = this.action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Text text = this.title;
            if (text != null) {
                SizeMode$EnumUnboxingLocalUtility.m("title=", text, arrayList);
            }
            Text text2 = this.subtitle;
            if (text2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("subtitle=", text2, arrayList);
            }
            Text text3 = this.description;
            if (text3 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("description=", text3, arrayList);
            }
            Avatar avatar = this.avatar;
            if (avatar != null) {
                arrayList.add("avatar=" + avatar);
            }
            TapAction tapAction = this.action;
            if (tapAction != null) {
                arrayList.add("action=" + tapAction);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TextCard{", "}", 0, null, null, 56);
        }
    }

    static {
        TextCardSection$Companion$ADAPTER$1 textCardSection$Companion$ADAPTER$1 = new TextCardSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextCardSection.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.TextCardSection", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/sections.proto");
        ADAPTER = textCardSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(textCardSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextCardSection(List list, Integer num, OverflowCard overflowCard, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.max_items = num;
        this.overflow = overflowCard;
        this.cards = TransactorKt.immutableCopyOf("cards", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextCardSection)) {
            return false;
        }
        TextCardSection textCardSection = (TextCardSection) obj;
        return Intrinsics.areEqual(unknownFields(), textCardSection.unknownFields()) && Intrinsics.areEqual(this.cards, textCardSection.cards) && Intrinsics.areEqual(this.max_items, textCardSection.max_items) && Intrinsics.areEqual(this.overflow, textCardSection.overflow);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.cards);
        Integer num = this.max_items;
        int hashCode = (m + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        OverflowCard overflowCard = this.overflow;
        int hashCode2 = hashCode + (overflowCard != null ? overflowCard.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LoanOption.Builder builder = new LoanOption.Builder(13);
        builder.payment_schedule = this.cards;
        builder.loan_type = this.max_items;
        builder.tila_data = this.overflow;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.cards;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("cards=", arrayList, list);
        }
        Integer num = this.max_items;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("max_items=", num, arrayList);
        }
        OverflowCard overflowCard = this.overflow;
        if (overflowCard != null) {
            arrayList.add("overflow=" + overflowCard);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TextCardSection{", "}", 0, null, null, 56);
    }
}
