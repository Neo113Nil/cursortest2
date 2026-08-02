package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0010\u0011\u0012\u000f\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$Builder;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "cta", "Lcom/squareup/protos/cash/localization/LocalizedString;", "Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$Icon;", "icon", "Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$Icon;", "Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$TapAction;", "tap_action", "Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$TapAction;", "", "version", "Ljava/lang/Integer;", "Companion", "Builder", "Icon", "TapAction", "ClientRouteAction", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavigationCard extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NavigationCard> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
    public final LocalizedString cta;

    @WireSealedOneof(schemaIndex = 1)
    public final Icon icon;

    @WireSealedOneof(schemaIndex = 2)
    public final TapAction tap_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 3, tag = 5)
    public final Integer version;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard;", "<init>", "()V", "cta", "Lcom/squareup/protos/cash/localization/LocalizedString;", "icon", "Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$Icon;", "tap_action", "Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$TapAction;", "version", "", "Ljava/lang/Integer;", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public LocalizedString cta;
        public Icon icon;
        public TapAction tap_action;
        public Integer version;

        @Override // com.squareup.wire.Message.Builder
        public NavigationCard build() {
            return new NavigationCard(this.cta, this.icon, this.tap_action, this.version, buildUnknownFields());
        }

        public final Builder cta(LocalizedString cta) {
            this.cta = cta;
            return this;
        }

        public final Builder icon(Icon icon) {
            this.icon = icon;
            return this;
        }

        public final Builder tap_action(TapAction tap_action) {
            this.tap_action = tap_action;
            return this;
        }

        public final Builder version(Integer version) {
            this.version = version;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$ClientRouteAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$ClientRouteAction$Builder;", "", "client_route_url", "Ljava/lang/String;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ClientRouteAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ClientRouteAction> CREATOR;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String client_route_url;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$ClientRouteAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$ClientRouteAction;", "<init>", "()V", "client_route_url", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String client_route_url;

            @Override // com.squareup.wire.Message.Builder
            public ClientRouteAction build() {
                return new ClientRouteAction(this.client_route_url, buildUnknownFields());
            }

            public final Builder client_route_url(String client_route_url) {
                this.client_route_url = client_route_url;
                return this;
            }
        }

        static {
            NavigationCard$ClientRouteAction$Companion$ADAPTER$1 navigationCard$ClientRouteAction$Companion$ADAPTER$1 = new NavigationCard$ClientRouteAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientRouteAction.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.NavigationCard.ClientRouteAction", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
            ADAPTER = navigationCard$ClientRouteAction$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(navigationCard$ClientRouteAction$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientRouteAction(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.client_route_url = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ClientRouteAction)) {
                return false;
            }
            ClientRouteAction clientRouteAction = (ClientRouteAction) obj;
            return Intrinsics.areEqual(unknownFields(), clientRouteAction.unknownFields()) && Intrinsics.areEqual(this.client_route_url, clientRouteAction.client_route_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.client_route_url;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.client_route_url = this.client_route_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.client_route_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ClientRouteAction{", "}", 0, null, null, 56);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$Icon;", "", "Avatar", "Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$Icon$Avatar;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Icon {

        @WireOneofField(adapter = "com.squareup.protos.franklin.ui.UiAvatar#ADAPTER", declaredName = "avatar", tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$Icon$Avatar;", "Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$Icon;", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "value", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "getValue", "()Lcom/squareup/protos/franklin/ui/UiAvatar;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Avatar extends Icon {
            private final UiAvatar value;

            public Avatar(UiAvatar uiAvatar) {
                uiAvatar.getClass();
                this.value = uiAvatar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Avatar) && Intrinsics.areEqual(this.value, ((Avatar) obj).value);
            }

            public final UiAvatar getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Avatar(value=", ")");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$TapAction;", "", "ClientRoute", "Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$TapAction$ClientRoute;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class TapAction {

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.NavigationCard$ClientRouteAction#ADAPTER", declaredName = "client_route", tag = 4)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$TapAction$ClientRoute;", "Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$TapAction;", "Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$ClientRouteAction;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$ClientRouteAction;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard$ClientRouteAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ClientRoute extends TapAction {
            private final ClientRouteAction value;

            public ClientRoute(ClientRouteAction clientRouteAction) {
                clientRouteAction.getClass();
                this.value = clientRouteAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClientRoute) && Intrinsics.areEqual(this.value, ((ClientRoute) obj).value);
            }

            public final ClientRouteAction getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ClientRoute(value=" + this.value + ")";
            }
        }
    }

    static {
        NavigationCard$Companion$ADAPTER$1 navigationCard$Companion$ADAPTER$1 = new NavigationCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NavigationCard.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.NavigationCard", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
        ADAPTER = navigationCard$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(navigationCard$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationCard(LocalizedString localizedString, Icon icon, TapAction tapAction, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cta = localizedString;
        this.icon = icon;
        this.tap_action = tapAction;
        this.version = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NavigationCard)) {
            return false;
        }
        NavigationCard navigationCard = (NavigationCard) obj;
        return Intrinsics.areEqual(unknownFields(), navigationCard.unknownFields()) && Intrinsics.areEqual(this.cta, navigationCard.cta) && Intrinsics.areEqual(this.icon, navigationCard.icon) && Intrinsics.areEqual(this.tap_action, navigationCard.tap_action) && Intrinsics.areEqual(this.version, navigationCard.version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.cta;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Icon icon = this.icon;
        int hashCode3 = (hashCode2 + (icon != null ? icon.hashCode() : 0)) * 37;
        TapAction tapAction = this.tap_action;
        int hashCode4 = (hashCode3 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
        Integer num = this.version;
        int hashCode5 = hashCode4 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.cta = this.cta;
        builder.icon = this.icon;
        builder.tap_action = this.tap_action;
        builder.version = this.version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.cta;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("cta=", localizedString, arrayList);
        }
        Icon icon = this.icon;
        if (icon != null) {
            arrayList.add("icon=" + icon);
        }
        TapAction tapAction = this.tap_action;
        if (tapAction != null) {
            arrayList.add("tap_action=" + tapAction);
        }
        Integer num = this.version;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("version=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NavigationCard{", "}", 0, null, null, 56);
    }
}
