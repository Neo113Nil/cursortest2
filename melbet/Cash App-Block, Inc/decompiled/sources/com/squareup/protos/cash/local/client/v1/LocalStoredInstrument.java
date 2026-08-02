package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
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
public final class LocalStoredInstrument extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalStoredInstrument> CREATOR;
    public final String display_brand;
    public final String display_name;
    public final String finplat_instrument_token;
    public final String token;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1314type;

    public enum Type implements WireEnum {
        TYPE_UNSPECIFIED(0),
        TYPE_VISA(1),
        TYPE_MASTERCARD(2),
        TYPE_AMERICAN_EXPRESS(3),
        TYPE_DISCOVER(4),
        TYPE_DISCOVER_DINERS(5);

        public static final LocalStoredInstrument$Type$Companion$ADAPTER$1 ADAPTER;
        public static final SliceStatus.Companion Companion;
        public final int value;

        static {
            Type type2 = TYPE_UNSPECIFIED;
            Companion = new SliceStatus.Companion();
            ADAPTER = new LocalStoredInstrument$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, type2);
        }

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            return SliceStatus.Companion.m3876fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        LocalStoredInstrument$Companion$ADAPTER$1 localStoredInstrument$Companion$ADAPTER$1 = new LocalStoredInstrument$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalStoredInstrument.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalStoredInstrument", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_payment_method.proto");
        ADAPTER = localStoredInstrument$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localStoredInstrument$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalStoredInstrument(String str, Type type2, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.f1314type = type2;
        this.display_name = str2;
        this.display_brand = str3;
        this.finplat_instrument_token = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalStoredInstrument)) {
            return false;
        }
        LocalStoredInstrument localStoredInstrument = (LocalStoredInstrument) obj;
        return Intrinsics.areEqual(unknownFields(), localStoredInstrument.unknownFields()) && Intrinsics.areEqual(this.token, localStoredInstrument.token) && this.f1314type == localStoredInstrument.f1314type && Intrinsics.areEqual(this.display_name, localStoredInstrument.display_name) && Intrinsics.areEqual(this.display_brand, localStoredInstrument.display_brand) && Intrinsics.areEqual(this.finplat_instrument_token, localStoredInstrument.finplat_instrument_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Type type2 = this.f1314type;
        int hashCode3 = (hashCode2 + (type2 != null ? type2.hashCode() : 0)) * 37;
        String str2 = this.display_name;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.display_brand;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.finplat_instrument_token;
        int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(10);
        builder.icon = this.token;
        builder.title = this.f1314type;
        builder.subtitle = this.display_name;
        builder.action = this.display_brand;
        builder.icon_background_color = this.finplat_instrument_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        Type type2 = this.f1314type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        String str2 = this.display_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "display_name=", arrayList);
        }
        String str3 = this.display_brand;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "display_brand=", arrayList);
        }
        String str4 = this.finplat_instrument_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "finplat_instrument_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalStoredInstrument{", "}", 0, null, null, 56);
    }
}
