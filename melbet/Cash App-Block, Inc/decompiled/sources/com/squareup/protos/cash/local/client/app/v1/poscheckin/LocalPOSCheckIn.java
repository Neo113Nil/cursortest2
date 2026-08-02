package com.squareup.protos.cash.local.client.app.v1.poscheckin;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
import com.squareup.protos.cash.moneymap.app.RetailerType;
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

/* loaded from: classes7.dex */
public final class LocalPOSCheckIn extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalPOSCheckIn> CREATOR;
    public final String check_in_token;
    public final Long local_cash_adjusted_amount;
    public final Location location;
    public final String sort_key;
    public final State state;

    public final class Color extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Color> CREATOR;
        public final String dark_color;
        public final String light_color;

        static {
            LocalPOSCheckIn$Color$Companion$ADAPTER$1 localPOSCheckIn$Color$Companion$ADAPTER$1 = new LocalPOSCheckIn$Color$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Color.class), "type.googleapis.com/squareup.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn.Color", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/poscheckin/poscheckin.proto");
            ADAPTER = localPOSCheckIn$Color$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localPOSCheckIn$Color$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Color(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.light_color = str;
            this.dark_color = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Color)) {
                return false;
            }
            Color color = (Color) obj;
            return Intrinsics.areEqual(unknownFields(), color.unknownFields()) && Intrinsics.areEqual(this.light_color, color.light_color) && Intrinsics.areEqual(this.dark_color, color.dark_color);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.light_color;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.dark_color;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            FullName.Builder builder = new FullName.Builder(13);
            builder.given_name = this.light_color;
            builder.family_name = this.dark_color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.light_color;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "light_color=", arrayList);
            }
            String str2 = this.dark_color;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "dark_color=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Color{", "}", 0, null, null, 56);
        }
    }

    public final class Image extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Image> CREATOR;
        public final String dark_url;
        public final String light_url;

        static {
            LocalPOSCheckIn$Image$Companion$ADAPTER$1 localPOSCheckIn$Image$Companion$ADAPTER$1 = new LocalPOSCheckIn$Image$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Image.class), "type.googleapis.com/squareup.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn.Image", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/poscheckin/poscheckin.proto");
            ADAPTER = localPOSCheckIn$Image$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localPOSCheckIn$Image$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Image(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.light_url = str;
            this.dark_url = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Image)) {
                return false;
            }
            Image image = (Image) obj;
            return Intrinsics.areEqual(unknownFields(), image.unknownFields()) && Intrinsics.areEqual(this.light_url, image.light_url) && Intrinsics.areEqual(this.dark_url, image.dark_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.light_url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.dark_url;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            FullName.Builder builder = new FullName.Builder(14);
            builder.given_name = this.light_url;
            builder.family_name = this.dark_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.light_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "light_url=", arrayList);
            }
            String str2 = this.dark_url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "dark_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Image{", "}", 0, null, null, 56);
        }
    }

    public final class Location extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Location> CREATOR;
        public final String brand_name;
        public final String cashtag;
        public final Color foreground_color;
        public final String location_token;
        public final MiniCard mini_card;

        static {
            LocalPOSCheckIn$Location$Companion$ADAPTER$1 localPOSCheckIn$Location$Companion$ADAPTER$1 = new LocalPOSCheckIn$Location$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Location.class), "type.googleapis.com/squareup.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn.Location", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/poscheckin/poscheckin.proto");
            ADAPTER = localPOSCheckIn$Location$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localPOSCheckIn$Location$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Location(String str, String str2, MiniCard miniCard, Color color, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.location_token = str;
            this.brand_name = str2;
            this.mini_card = miniCard;
            this.foreground_color = color;
            this.cashtag = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Location)) {
                return false;
            }
            Location location = (Location) obj;
            return Intrinsics.areEqual(unknownFields(), location.unknownFields()) && Intrinsics.areEqual(this.location_token, location.location_token) && Intrinsics.areEqual(this.brand_name, location.brand_name) && Intrinsics.areEqual(this.mini_card, location.mini_card) && Intrinsics.areEqual(this.foreground_color, location.foreground_color) && Intrinsics.areEqual(this.cashtag, location.cashtag);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.location_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.brand_name;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            MiniCard miniCard = this.mini_card;
            int hashCode4 = (hashCode3 + (miniCard != null ? miniCard.hashCode() : 0)) * 37;
            Color color = this.foreground_color;
            int hashCode5 = (hashCode4 + (color != null ? color.hashCode() : 0)) * 37;
            String str3 = this.cashtag;
            int hashCode6 = hashCode5 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BrandBanner.Builder builder = new BrandBanner.Builder(1);
            builder.icon = this.location_token;
            builder.title = this.brand_name;
            builder.subtitle = this.mini_card;
            builder.action = this.foreground_color;
            builder.icon_background_color = this.cashtag;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.location_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "location_token=", arrayList);
            }
            String str2 = this.brand_name;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "brand_name=", arrayList);
            }
            MiniCard miniCard = this.mini_card;
            if (miniCard != null) {
                arrayList.add("mini_card=" + miniCard);
            }
            Color color = this.foreground_color;
            if (color != null) {
                arrayList.add("foreground_color=" + color);
            }
            if (this.cashtag != null) {
                arrayList.add("cashtag=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Location{", "}", 0, null, null, 56);
        }
    }

    public final class MiniCard extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<MiniCard> CREATOR;
        public final Color background_color;
        public final Image icon;

        static {
            LocalPOSCheckIn$MiniCard$Companion$ADAPTER$1 localPOSCheckIn$MiniCard$Companion$ADAPTER$1 = new LocalPOSCheckIn$MiniCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MiniCard.class), "type.googleapis.com/squareup.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn.MiniCard", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/poscheckin/poscheckin.proto");
            ADAPTER = localPOSCheckIn$MiniCard$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localPOSCheckIn$MiniCard$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniCard(Color color, Image image, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.background_color = color;
            this.icon = image;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MiniCard)) {
                return false;
            }
            MiniCard miniCard = (MiniCard) obj;
            return Intrinsics.areEqual(unknownFields(), miniCard.unknownFields()) && Intrinsics.areEqual(this.background_color, miniCard.background_color) && Intrinsics.areEqual(this.icon, miniCard.icon);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Color color = this.background_color;
            int hashCode2 = (hashCode + (color != null ? color.hashCode() : 0)) * 37;
            Image image = this.icon;
            int hashCode3 = hashCode2 + (image != null ? image.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Card.Builder builder = new Card.Builder(28);
            builder.card_type = this.background_color;
            builder.card_pii = this.icon;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Color color = this.background_color;
            if (color != null) {
                arrayList.add("background_color=" + color);
            }
            Image image = this.icon;
            if (image != null) {
                arrayList.add("icon=" + image);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "MiniCard{", "}", 0, null, null, 56);
        }
    }

    public enum State implements WireEnum {
        STATE_UNSPECIFIED(0),
        STATE_OPEN(1),
        STATE_IN_CHECKOUT(2),
        STATE_COMPLETE(3),
        STATE_ABANDONED(4);

        public static final LocalPOSCheckIn$State$Companion$ADAPTER$1 ADAPTER;
        public static final RetailerType.Companion Companion;
        public final int value;

        static {
            State state = STATE_UNSPECIFIED;
            Companion = new RetailerType.Companion();
            ADAPTER = new LocalPOSCheckIn$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, state);
        }

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            return RetailerType.Companion.m3902fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        LocalPOSCheckIn$Companion$ADAPTER$1 localPOSCheckIn$Companion$ADAPTER$1 = new LocalPOSCheckIn$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalPOSCheckIn.class), "type.googleapis.com/squareup.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/poscheckin/poscheckin.proto");
        ADAPTER = localPOSCheckIn$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localPOSCheckIn$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalPOSCheckIn(State state, Long l, String str, String str2, Location location, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.state = state;
        this.local_cash_adjusted_amount = l;
        this.sort_key = str;
        this.check_in_token = str2;
        this.location = location;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalPOSCheckIn)) {
            return false;
        }
        LocalPOSCheckIn localPOSCheckIn = (LocalPOSCheckIn) obj;
        return Intrinsics.areEqual(unknownFields(), localPOSCheckIn.unknownFields()) && this.state == localPOSCheckIn.state && Intrinsics.areEqual(this.local_cash_adjusted_amount, localPOSCheckIn.local_cash_adjusted_amount) && Intrinsics.areEqual(this.sort_key, localPOSCheckIn.sort_key) && Intrinsics.areEqual(this.check_in_token, localPOSCheckIn.check_in_token) && Intrinsics.areEqual(this.location, localPOSCheckIn.location);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        State state = this.state;
        int hashCode2 = (hashCode + (state != null ? state.hashCode() : 0)) * 37;
        Long l = this.local_cash_adjusted_amount;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str = this.sort_key;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.check_in_token;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Location location = this.location;
        int hashCode6 = hashCode5 + (location != null ? location.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Text.Builder builder = new Text.Builder(29);
        builder.text_style = this.state;
        builder.text_decoration = this.local_cash_adjusted_amount;
        builder.text = this.sort_key;
        builder.text_color = this.check_in_token;
        builder.icon = this.location;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        Long l = this.local_cash_adjusted_amount;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("local_cash_adjusted_amount=", l, arrayList);
        }
        String str = this.sort_key;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "sort_key=", arrayList);
        }
        String str2 = this.check_in_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "check_in_token=", arrayList);
        }
        Location location = this.location;
        if (location != null) {
            arrayList.add("location=" + location);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalPOSCheckIn{", "}", 0, null, null, 56);
    }
}
