package com.squareup.protos.cash.postcard;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes.dex */
public final class CardRenderingInfo extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardRenderingInfo> CREATOR;
    public final CardTheme card_theme;
    public final String customization_image_path;
    public final ExpirationState expiration_state;

    /* loaded from: classes7.dex */
    public enum ExpirationState implements WireEnum {
        EXPIRATION_STATE_UNSPECIFIED(0),
        NOT_EXPIRED(1),
        EXPIRED(2);

        public static final CardRenderingInfo$ExpirationState$Companion$ADAPTER$1 ADAPTER;
        public static final TransactionType.Companion Companion;
        public final int value;

        static {
            ExpirationState expirationState = EXPIRATION_STATE_UNSPECIFIED;
            Companion = new TransactionType.Companion();
            ADAPTER = new CardRenderingInfo$ExpirationState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ExpirationState.class), Syntax.PROTO_2, expirationState);
        }

        ExpirationState(int i) {
            this.value = i;
        }

        public static final ExpirationState fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return EXPIRATION_STATE_UNSPECIFIED;
            }
            if (i == 1) {
                return NOT_EXPIRED;
            }
            if (i != 2) {
                return null;
            }
            return EXPIRED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CardRenderingInfo$Companion$ADAPTER$1 cardRenderingInfo$Companion$ADAPTER$1 = new CardRenderingInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardRenderingInfo.class), "type.googleapis.com/squareup.cash.postcard.CardRenderingInfo", Syntax.PROTO_2, null, "squareup/cash/postcard/CardRenderingInfo.proto");
        ADAPTER = cardRenderingInfo$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardRenderingInfo$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRenderingInfo(String str, CardTheme cardTheme, ExpirationState expirationState, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customization_image_path = str;
        this.card_theme = cardTheme;
        this.expiration_state = expirationState;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardRenderingInfo)) {
            return false;
        }
        CardRenderingInfo cardRenderingInfo = (CardRenderingInfo) obj;
        return Intrinsics.areEqual(unknownFields(), cardRenderingInfo.unknownFields()) && Intrinsics.areEqual(this.customization_image_path, cardRenderingInfo.customization_image_path) && Intrinsics.areEqual(this.card_theme, cardRenderingInfo.card_theme) && this.expiration_state == cardRenderingInfo.expiration_state;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customization_image_path;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        CardTheme cardTheme = this.card_theme;
        int hashCode3 = (hashCode2 + (cardTheme != null ? cardTheme.hashCode() : 0)) * 37;
        ExpirationState expirationState = this.expiration_state;
        int hashCode4 = hashCode3 + (expirationState != null ? expirationState.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardScheme.Builder builder = new CardScheme.Builder(11);
        builder.modules = this.customization_image_path;
        builder.overflow_modules = this.card_theme;
        builder.card_home_actions = this.expiration_state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customization_image_path;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customization_image_path=", arrayList);
        }
        CardTheme cardTheme = this.card_theme;
        if (cardTheme != null) {
            arrayList.add("card_theme=" + cardTheme);
        }
        ExpirationState expirationState = this.expiration_state;
        if (expirationState != null) {
            arrayList.add("expiration_state=" + expirationState);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardRenderingInfo{", "}", 0, null, null, 56);
    }
}
