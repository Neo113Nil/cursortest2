package com.squareup.protos.cash.guardrails.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.localization.LocalizableString;
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
public final class AdversityBanner extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AdversityBanner> CREATOR;
    public final String client_route_url;
    public final LocalizableString localizable_message;
    public final String message;
    public final Style style;

    /* renamed from: type, reason: collision with root package name */
    public final String f1277type;

    public enum Style implements WireEnum {
        CRITICAL(0),
        SEVERE(1),
        SUCCESS(2);

        public static final AdversityBanner$Style$Companion$ADAPTER$1 ADAPTER;
        public static final ContactAliasType.Companion Companion;
        public final int value;

        static {
            Style style = CRITICAL;
            Companion = new ContactAliasType.Companion();
            ADAPTER = new AdversityBanner$Style$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Style.class), Syntax.PROTO_2, style);
        }

        Style(int i) {
            this.value = i;
        }

        public static final Style fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return CRITICAL;
            }
            if (i == 1) {
                return SEVERE;
            }
            if (i != 2) {
                return null;
            }
            return SUCCESS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        AdversityBanner$Companion$ADAPTER$1 adversityBanner$Companion$ADAPTER$1 = new AdversityBanner$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AdversityBanner.class), "type.googleapis.com/squareup.cash.guardrails.api.v1beta1.AdversityBanner", Syntax.PROTO_2, null, "squareup/cash/guardrails/api/v1beta1/adversity_banner.proto");
        ADAPTER = adversityBanner$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(adversityBanner$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdversityBanner(String str, Style style, String str2, String str3, LocalizableString localizableString, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.message = str;
        this.style = style;
        this.client_route_url = str2;
        this.f1277type = str3;
        this.localizable_message = localizableString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdversityBanner)) {
            return false;
        }
        AdversityBanner adversityBanner = (AdversityBanner) obj;
        return Intrinsics.areEqual(unknownFields(), adversityBanner.unknownFields()) && Intrinsics.areEqual(this.message, adversityBanner.message) && this.style == adversityBanner.style && Intrinsics.areEqual(this.client_route_url, adversityBanner.client_route_url) && Intrinsics.areEqual(this.f1277type, adversityBanner.f1277type) && Intrinsics.areEqual(this.localizable_message, adversityBanner.localizable_message);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.message;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Style style = this.style;
        int hashCode3 = (hashCode2 + (style != null ? style.hashCode() : 0)) * 37;
        String str2 = this.client_route_url;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.f1277type;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_message;
        int hashCode6 = hashCode5 + (localizableString != null ? localizableString.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Text.Builder builder = new Text.Builder(16);
        builder.text = this.message;
        builder.text_style = this.style;
        builder.text_decoration = this.client_route_url;
        builder.text_color = this.f1277type;
        builder.icon = this.localizable_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.message != null) {
            arrayList.add("message=██");
        }
        Style style = this.style;
        if (style != null) {
            arrayList.add("style=" + style);
        }
        String str = this.client_route_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route_url=", arrayList);
        }
        String str2 = this.f1277type;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "type=", arrayList);
        }
        if (this.localizable_message != null) {
            arrayList.add("localizable_message=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdversityBanner{", "}", 0, null, null, 56);
    }
}
