package com.squareup.protos.franklin.cards;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.ColoredButton;
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

/* loaded from: classes8.dex */
public final class CardThemeDefinition extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardThemeDefinition> CREATOR;
    public final CardTheme card_theme;
    public final String card_theme_token;
    public final LocalizedString localized_name;
    public final String name;

    static {
        CardThemeDefinition$Companion$ADAPTER$1 cardThemeDefinition$Companion$ADAPTER$1 = new CardThemeDefinition$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardThemeDefinition.class), "type.googleapis.com/squareup.franklin.cards.CardThemeDefinition", Syntax.PROTO_2, null, "squareup/franklin/cards.proto");
        ADAPTER = cardThemeDefinition$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardThemeDefinition$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardThemeDefinition(String str, String str2, CardTheme cardTheme, LocalizedString localizedString, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.card_theme_token = str;
        this.name = str2;
        this.card_theme = cardTheme;
        this.localized_name = localizedString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardThemeDefinition)) {
            return false;
        }
        CardThemeDefinition cardThemeDefinition = (CardThemeDefinition) obj;
        return Intrinsics.areEqual(unknownFields(), cardThemeDefinition.unknownFields()) && Intrinsics.areEqual(this.card_theme_token, cardThemeDefinition.card_theme_token) && Intrinsics.areEqual(this.name, cardThemeDefinition.name) && Intrinsics.areEqual(this.card_theme, cardThemeDefinition.card_theme) && Intrinsics.areEqual(this.localized_name, cardThemeDefinition.localized_name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.card_theme_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        CardTheme cardTheme = this.card_theme;
        int hashCode4 = (hashCode3 + (cardTheme != null ? cardTheme.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.localized_name;
        int hashCode5 = hashCode4 + (localizedString != null ? localizedString.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredButton.Builder builder = new ColoredButton.Builder(19);
        builder.button_color = this.card_theme_token;
        builder.text_color = this.name;
        builder.action = this.card_theme;
        builder.text = this.localized_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.card_theme_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "card_theme_token=", arrayList);
        }
        String str2 = this.name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
        }
        CardTheme cardTheme = this.card_theme;
        if (cardTheme != null) {
            arrayList.add("card_theme=" + cardTheme);
        }
        LocalizedString localizedString = this.localized_name;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localized_name=", localizedString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardThemeDefinition{", "}", 0, null, null, 56);
    }
}
